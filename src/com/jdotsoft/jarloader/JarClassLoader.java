/*
 * Decompiled with CFR 0.152.
 */
package com.jdotsoft.jarloader;

import java.applet.AppletContext;
import java.applet.AppletStub;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.JarURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.security.CodeSource;
import java.security.ProtectionDomain;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.jar.Attributes;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import javax.swing.JApplet;

public class JarClassLoader
extends ClassLoader {
    public static final String KEY_LOGGER = "JarClassLoader.logger";
    public static final String KEY_LOGGER_LEVEL = "JarClassLoader.logger.level";
    public static final String KEY_LOGGER_AREA = "JarClassLoader.logger.area";
    public static final String TMP_SUB_DIRECTORY = "JarClassLoader";
    private File dirTemp;
    private PrintStream logger;
    private List<JarFileInfo> lstJarFile;
    private Set<File> hsDeleteOnExit;
    private Map<String, Class<?>> hmClass;
    private LogLevel logLevel;
    private Set<LogArea> hsLogArea;
    private boolean bLogConsole;
    private JApplet applet;
    static int ______INIT;
    static int ______SHUTDOWN;
    static int ______ACCESS;
    static int ______OVERRIDE;
    static int ______HELPERS;

    public JarClassLoader() {
        this(ClassLoader.getSystemClassLoader());
    }

    public JarClassLoader(ClassLoader parent) {
        super(parent);
        this.initLogger();
        this.hmClass = new HashMap();
        this.lstJarFile = new ArrayList<JarFileInfo>();
        this.hsDeleteOnExit = new HashSet<File>();
        String sUrlTopJar = null;
        ProtectionDomain pdTop = this.getClass().getProtectionDomain();
        CodeSource cs = pdTop.getCodeSource();
        URL urlTopJar = cs.getLocation();
        String protocol = urlTopJar.getProtocol();
        JarFileInfo jarFileInfo = null;
        if ("http".equals(protocol) || "https".equals(protocol)) {
            try {
                urlTopJar = new URL("jar:" + urlTopJar + "!/");
                JarURLConnection jarCon = (JarURLConnection)urlTopJar.openConnection();
                JarFile jarFile = jarCon.getJarFile();
                jarFileInfo = new JarFileInfo(jarFile, jarFile.getName(), null, pdTop, null);
                this.logInfo(LogArea.JAR, "Loading from top JAR: '%s' PROTOCOL: '%s'", urlTopJar, protocol);
            }
            catch (Exception e) {
                this.logError(LogArea.JAR, "Failure to load HTTP JAR: %s %s", urlTopJar, e.toString());
                return;
            }
        }
        if ("file".equals(protocol)) {
            try {
                sUrlTopJar = URLDecoder.decode(urlTopJar.getFile(), "UTF-8");
            }
            catch (UnsupportedEncodingException e) {
                this.logError(LogArea.JAR, "Failure to decode URL: %s %s", urlTopJar, e.toString());
                return;
            }
            File fileJar = new File(sUrlTopJar);
            if (fileJar.isDirectory()) {
                this.logInfo(LogArea.JAR, "Loading from exploded directory: %s", sUrlTopJar);
                return;
            }
            try {
                jarFileInfo = new JarFileInfo(new JarFile(fileJar), fileJar.getName(), null, pdTop, null);
                this.logInfo(LogArea.JAR, "Loading from top JAR: '%s' PROTOCOL: '%s'", sUrlTopJar, protocol);
            }
            catch (IOException e) {
                this.logError(LogArea.JAR, "Not a JAR: %s %s", sUrlTopJar, e.toString());
                return;
            }
        }
        try {
            if (jarFileInfo == null) {
                throw new IOException(String.format("Unknown protocol %s", protocol));
            }
            this.loadJar(jarFileInfo);
        }
        catch (IOException e) {
            this.logError(LogArea.JAR, "Not valid URL: %s %s", urlTopJar, e.toString());
            return;
        }
        this.checkShading();
        Runtime.getRuntime().addShutdownHook(new Thread(){

            @Override
            public void run() {
                JarClassLoader.this.shutdown();
            }
        });
    }

    private void initLogger() {
        int n;
        String sLogArea;
        String sLogLevel;
        this.bLogConsole = true;
        this.logger = System.out;
        this.logLevel = LogLevel.ERROR;
        this.hsLogArea = new HashSet<LogArea>();
        this.hsLogArea.add(LogArea.CONFIG);
        String sLogger = System.getProperty(KEY_LOGGER);
        if (sLogger != null) {
            try {
                this.logger = new PrintStream(sLogger);
                this.bLogConsole = false;
            }
            catch (FileNotFoundException e) {
                this.logError(LogArea.CONFIG, "Cannot create log file %s.", sLogger);
            }
        }
        if ((sLogLevel = System.getProperty(KEY_LOGGER_LEVEL)) != null) {
            try {
                this.logLevel = LogLevel.valueOf(sLogLevel);
            }
            catch (Exception e) {
                this.logError(LogArea.CONFIG, "Not valid parameter in %s=%s", KEY_LOGGER_LEVEL, sLogLevel);
            }
        }
        if ((sLogArea = System.getProperty(KEY_LOGGER_AREA)) != null) {
            String[] tokenAll = sLogArea.split(",");
            try {
                String[] stringArray = tokenAll;
                int n2 = tokenAll.length;
                n = 0;
                while (n < n2) {
                    String t = stringArray[n];
                    this.hsLogArea.add(LogArea.valueOf(t));
                    ++n;
                }
            }
            catch (Exception e) {
                this.logError(LogArea.CONFIG, "Not valid parameter in %s=%s", KEY_LOGGER_AREA, sLogArea);
            }
        }
        if (this.hsLogArea.size() == 1 && this.hsLogArea.contains((Object)LogArea.CONFIG)) {
            LogArea[] logAreaArray = LogArea.values();
            n = logAreaArray.length;
            int n3 = 0;
            while (n3 < n) {
                LogArea la = logAreaArray[n3];
                this.hsLogArea.add(la);
                ++n3;
            }
        }
    }

    private File createTempFile(JarEntryInfo inf) throws JarClassLoaderException {
        if (this.dirTemp == null) {
            File dir = new File(System.getProperty("java.io.tmpdir"), TMP_SUB_DIRECTORY);
            if (!dir.exists()) {
                dir.mkdir();
            }
            this.chmod777(dir);
            if (!dir.exists() || !dir.isDirectory()) {
                throw new JarClassLoaderException("Cannot create temp directory " + dir.getAbsolutePath());
            }
            this.dirTemp = dir;
        }
        File fileTmp = null;
        try {
            fileTmp = File.createTempFile(String.valueOf(inf.getName()) + ".", null, this.dirTemp);
            fileTmp.deleteOnExit();
            this.chmod777(fileTmp);
            byte[] a_by = inf.getJarBytes();
            BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream(fileTmp));
            os.write(a_by);
            os.close();
            return fileTmp;
        }
        catch (IOException e) {
            throw new JarClassLoaderException(String.format("Cannot create temp file '%s' for %s", fileTmp, inf.jarEntry), e);
        }
    }

    private void loadJar(JarFileInfo jarFileInfo) throws IOException {
        this.lstJarFile.add(jarFileInfo);
        try {
            Enumeration<JarEntry> en = jarFileInfo.jarFile.entries();
            String EXT_JAR = ".jar";
            while (en.hasMoreElements()) {
                String s;
                JarEntry je = en.nextElement();
                if (je.isDirectory() || (s = je.getName().toLowerCase()).lastIndexOf(".jar") != s.length() - ".jar".length()) continue;
                JarEntryInfo inf = new JarEntryInfo(jarFileInfo, je);
                File fileTemp = this.createTempFile(inf);
                this.logInfo(LogArea.JAR, "Loading inner JAR %s from temp file %s", inf.jarEntry, this.getFilename4Log(fileTemp));
                URL url = fileTemp.toURI().toURL();
                ProtectionDomain pdParent = jarFileInfo.pd;
                CodeSource csParent = pdParent.getCodeSource();
                Certificate[] certParent = csParent.getCertificates();
                CodeSource csChild = certParent == null ? new CodeSource(url, csParent.getCodeSigners()) : new CodeSource(url, certParent);
                ProtectionDomain pdChild = new ProtectionDomain(csChild, pdParent.getPermissions(), pdParent.getClassLoader(), pdParent.getPrincipals());
                this.loadJar(new JarFileInfo(new JarFile(fileTemp), inf.getName(), jarFileInfo, pdChild, fileTemp));
            }
        }
        catch (JarClassLoaderException e) {
            throw new RuntimeException("ERROR on loading inner JAR: " + e.getMessageAll());
        }
    }

    private JarEntryInfo findJarEntry(String sName) {
        for (JarFileInfo jarFileInfo : this.lstJarFile) {
            JarFile jarFile = jarFileInfo.jarFile;
            JarEntry jarEntry = jarFile.getJarEntry(sName);
            if (jarEntry == null) continue;
            return new JarEntryInfo(jarFileInfo, jarEntry);
        }
        return null;
    }

    private List<JarEntryInfo> findJarEntries(String sName) {
        ArrayList<JarEntryInfo> lst = new ArrayList<JarEntryInfo>();
        for (JarFileInfo jarFileInfo : this.lstJarFile) {
            JarFile jarFile = jarFileInfo.jarFile;
            JarEntry jarEntry = jarFile.getJarEntry(sName);
            if (jarEntry == null) continue;
            lst.add(new JarEntryInfo(jarFileInfo, jarEntry));
        }
        return lst;
    }

    private JarEntryInfo findJarNativeEntry(String sLib) {
        String sName = System.mapLibraryName(sLib);
        for (JarFileInfo jarFileInfo : this.lstJarFile) {
            JarFile jarFile = jarFileInfo.jarFile;
            Enumeration<JarEntry> en = jarFile.entries();
            while (en.hasMoreElements()) {
                String sEntry;
                String[] token;
                JarEntry je = en.nextElement();
                if (je.isDirectory() || (token = (sEntry = je.getName()).split("/")).length <= 0 || !token[token.length - 1].equals(sName)) continue;
                this.logInfo(LogArea.NATIVE, "Loading native library '%s' found as '%s' in JAR %s", sLib, sEntry, jarFileInfo.simpleName);
                return new JarEntryInfo(jarFileInfo, je);
            }
        }
        return null;
    }

    private Class<?> findJarClass(String sClassName) throws JarClassLoaderException {
        Class<?> c = this.hmClass.get(sClassName);
        if (c != null) {
            return c;
        }
        String sName = String.valueOf(sClassName.replace('.', '/')) + ".class";
        JarEntryInfo inf = this.findJarEntry(sName);
        String jarSimpleName = null;
        if (inf != null) {
            jarSimpleName = inf.jarFileInfo.simpleName;
            this.definePackage(sClassName, inf);
            byte[] a_by = inf.getJarBytes();
            try {
                c = this.defineClass(sClassName, a_by, 0, a_by.length, inf.jarFileInfo.pd);
            }
            catch (ClassFormatError e) {
                throw new JarClassLoaderException(null, e);
            }
        }
        if (c == null) {
            throw new JarClassLoaderException(sClassName);
        }
        this.hmClass.put(sClassName, c);
        this.logInfo(LogArea.CLASS, "Loaded %s by %s from JAR %s", sClassName, this.getClass().getName(), jarSimpleName);
        return c;
    }

    private void checkShading() {
        if (this.logLevel.ordinal() < LogLevel.WARN.ordinal()) {
            return;
        }
        HashMap<String, JarFileInfo> hm = new HashMap<String, JarFileInfo>();
        for (JarFileInfo jarFileInfo : this.lstJarFile) {
            JarFile jarFile = jarFileInfo.jarFile;
            Enumeration<JarEntry> en = jarFile.entries();
            while (en.hasMoreElements()) {
                String sEntry;
                JarEntry je = en.nextElement();
                if (je.isDirectory() || "META-INF/MANIFEST.MF".equals(sEntry = je.getName())) continue;
                JarFileInfo jar = (JarFileInfo)hm.get(sEntry);
                if (jar == null) {
                    hm.put(sEntry, jarFileInfo);
                    continue;
                }
                this.logWarn(LogArea.JAR, "ENTRY %s IN %s SHADES %s", sEntry, jar.simpleName, jarFileInfo.simpleName);
            }
        }
    }

    private void shutdown() {
        for (JarFileInfo jarFileInfo : this.lstJarFile) {
            try {
                jarFileInfo.jarFile.close();
            }
            catch (IOException iOException) {
                // empty catch block
            }
            File file = jarFileInfo.fileDeleteOnExit;
            if (file == null || file.delete()) continue;
            this.hsDeleteOnExit.add(file);
        }
        File fileCfg = new File(String.valueOf(System.getProperty("user.home")) + File.separator + ".JarClassLoader");
        this.deleteOldTemp(fileCfg);
        this.persistNewTemp(fileCfg);
    }

    private void deleteOldTemp(File fileCfg) {
        block14: {
            BufferedReader reader = null;
            try {
                try {
                    String sLine;
                    int count = 0;
                    reader = new BufferedReader(new FileReader(fileCfg));
                    while ((sLine = reader.readLine()) != null) {
                        File file = new File(sLine);
                        if (!file.exists()) continue;
                        if (file.delete()) {
                            ++count;
                            continue;
                        }
                        this.hsDeleteOnExit.add(file);
                    }
                    this.logDebug(LogArea.CONFIG, "Deleted %d old temp files listed in %s", count, fileCfg.getAbsolutePath());
                }
                catch (IOException iOException) {
                    if (reader == null) break block14;
                    try {
                        reader.close();
                    }
                    catch (IOException iOException2) {}
                }
            }
            finally {
                if (reader != null) {
                    try {
                        reader.close();
                    }
                    catch (IOException iOException) {}
                }
            }
        }
    }

    private void persistNewTemp(File fileCfg) {
        block14: {
            if (this.hsDeleteOnExit.size() == 0) {
                this.logDebug(LogArea.CONFIG, "No temp file names to persist on exit.", new Object[0]);
                fileCfg.delete();
                return;
            }
            this.logDebug(LogArea.CONFIG, "Persisting %d temp file names into %s", this.hsDeleteOnExit.size(), fileCfg.getAbsolutePath());
            BufferedWriter writer = null;
            try {
                try {
                    writer = new BufferedWriter(new FileWriter(fileCfg));
                    for (File file : this.hsDeleteOnExit) {
                        if (file.delete()) continue;
                        String f = file.getCanonicalPath();
                        writer.write(f);
                        writer.newLine();
                        this.logWarn(LogArea.JAR, "JVM failed to release %s", f);
                    }
                }
                catch (IOException iOException) {
                    if (writer == null) break block14;
                    try {
                        writer.close();
                    }
                    catch (IOException iOException2) {}
                }
            }
            finally {
                if (writer != null) {
                    try {
                        writer.close();
                    }
                    catch (IOException iOException) {}
                }
            }
        }
    }

    public boolean isLaunchedFromJar() {
        return this.lstJarFile.size() > 0;
    }

    public String getManifestMainClass() {
        Attributes attr = null;
        if (this.isLaunchedFromJar()) {
            try {
                Manifest m = this.lstJarFile.get((int)0).jarFile.getManifest();
                attr = m.getMainAttributes();
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
        return attr == null ? null : attr.getValue(Attributes.Name.MAIN_CLASS);
    }

    public void invokeMain(String sClass, String[] args) throws Throwable {
        Class<?> clazz = this.loadClass(sClass);
        this.logInfo(LogArea.CONFIG, "Launch: %s.main(); Loader: %s", sClass, clazz.getClassLoader());
        Method method = clazz.getMethod("main", String[].class);
        boolean bValidModifiers = false;
        boolean bValidVoid = false;
        if (method != null) {
            method.setAccessible(true);
            int nModifiers = method.getModifiers();
            bValidModifiers = Modifier.isPublic(nModifiers) && Modifier.isStatic(nModifiers);
            Class<?> clazzRet = method.getReturnType();
            boolean bl = bValidVoid = clazzRet == Void.TYPE;
        }
        if (method == null || !bValidModifiers || !bValidVoid) {
            throw new NoSuchMethodException("The main() method in class \"" + sClass + "\" not found.");
        }
        try {
            method.invoke(null, new Object[]{args});
        }
        catch (InvocationTargetException e) {
            throw e.getTargetException();
        }
    }

    public void initApplet(String sClass, final JApplet appletParent) throws Throwable {
        Class<?> clazz = this.loadClass(sClass);
        this.logInfo(LogArea.CONFIG, "initApplet() --> %s.init(); Loader: %s", sClass, clazz.getClassLoader());
        this.applet = (JApplet)clazz.newInstance();
        this.applet.setStub(new AppletStub(){

            @Override
            public boolean isActive() {
                return appletParent.isActive();
            }

            @Override
            public URL getDocumentBase() {
                return appletParent.getDocumentBase();
            }

            @Override
            public URL getCodeBase() {
                return appletParent.getCodeBase();
            }

            @Override
            public String getParameter(String name) {
                return appletParent.getParameter(name);
            }

            @Override
            public AppletContext getAppletContext() {
                return appletParent.getAppletContext();
            }

            @Override
            public void appletResize(int width, int height) {
                appletParent.resize(width, height);
            }
        });
        this.applet.init();
        appletParent.setContentPane(this.applet.getContentPane());
    }

    public void startApplet() {
        this.checkApplet();
        this.logInfo(LogArea.CONFIG, "startApplet() --> %s.start()", this.applet.getClass().getName());
        this.applet.start();
    }

    public void stopApplet() {
        this.checkApplet();
        this.logInfo(LogArea.CONFIG, "stopApplet() --> %s.stop()", this.applet.getClass().getName());
        this.applet.stop();
    }

    public void destroyApplet() {
        this.checkApplet();
        this.logInfo(LogArea.CONFIG, "destroyApplet() --> %s.destroy()", this.applet.getClass().getName());
        this.applet.destroy();
    }

    /*
     * Exception decompiling
     */
    @Override
    protected synchronized Class<?> loadClass(String sClassName, boolean bResolve) throws ClassNotFoundException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [6[CATCHBLOCK]], but top level block is 4[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    @Override
    protected URL findResource(String sName) {
        this.logDebug(LogArea.RESOURCE, "findResource: %s", sName);
        if (this.isLaunchedFromJar()) {
            JarEntryInfo inf = this.findJarEntry(this.normalizeResourceName(sName));
            if (inf != null) {
                URL url = inf.getURL();
                this.logInfo(LogArea.RESOURCE, "found resource: %s", url);
                return url;
            }
            this.logInfo(LogArea.RESOURCE, "not found resource: %s", sName);
            return null;
        }
        return super.findResource(sName);
    }

    @Override
    public Enumeration<URL> findResources(String sName) throws IOException {
        this.logDebug(LogArea.RESOURCE, "getResources: %s", sName);
        if (this.isLaunchedFromJar()) {
            List<JarEntryInfo> lstJarEntry = this.findJarEntries(this.normalizeResourceName(sName));
            ArrayList<URL> lstURL = new ArrayList<URL>();
            for (JarEntryInfo inf : lstJarEntry) {
                URL url = inf.getURL();
                if (url == null) continue;
                lstURL.add(url);
            }
            return Collections.enumeration(lstURL);
        }
        return super.findResources(sName);
    }

    @Override
    protected String findLibrary(String sLib) {
        this.logDebug(LogArea.NATIVE, "findLibrary: %s", sLib);
        if (this.isLaunchedFromJar()) {
            JarEntryInfo inf = this.findJarNativeEntry(sLib);
            if (inf != null) {
                try {
                    File file = this.createTempFile(inf);
                    this.logDebug(LogArea.NATIVE, "Loading native library %s from temp file %s", inf.jarEntry, this.getFilename4Log(file));
                    this.hsDeleteOnExit.add(file);
                    return file.getAbsolutePath();
                }
                catch (JarClassLoaderException e) {
                    this.logError(LogArea.NATIVE, "Failure to load native library %s: %s", sLib, e.toString());
                }
            }
            return null;
        }
        return super.findLibrary(sLib);
    }

    private void definePackage(String sClassName, JarEntryInfo inf) throws IllegalArgumentException {
        String sPackageName;
        int pos = sClassName.lastIndexOf(46);
        String string = sPackageName = pos > 0 ? sClassName.substring(0, pos) : "";
        if (this.getPackage(sPackageName) == null) {
            JarFileInfo jfi = inf.jarFileInfo;
            this.definePackage(sPackageName, jfi.getSpecificationTitle(), jfi.getSpecificationVersion(), jfi.getSpecificationVendor(), jfi.getImplementationTitle(), jfi.getImplementationVersion(), jfi.getImplementationVendor(), jfi.getSealURL());
        }
    }

    private String normalizeResourceName(String sName) {
        return sName.replace('\\', '/');
    }

    private void chmod777(File file) {
        file.setReadable(true, false);
        file.setWritable(true, false);
        file.setExecutable(true, false);
    }

    private String getFilename4Log(File file) {
        if (this.logger != null) {
            try {
                return file.getCanonicalPath();
            }
            catch (IOException e) {
                return file.getAbsolutePath();
            }
        }
        return null;
    }

    private void checkApplet() {
        if (this.applet == null) {
            throw new IllegalStateException("Applet is not inited. Please call JarClassLoader.initApplet() first.");
        }
    }

    private void logDebug(LogArea area, String sMsg, Object ... obj) {
        this.log(LogLevel.DEBUG, area, sMsg, obj);
    }

    private void logInfo(LogArea area, String sMsg, Object ... obj) {
        this.log(LogLevel.INFO, area, sMsg, obj);
    }

    private void logWarn(LogArea area, String sMsg, Object ... obj) {
        this.log(LogLevel.WARN, area, sMsg, obj);
    }

    private void logError(LogArea area, String sMsg, Object ... obj) {
        this.log(LogLevel.ERROR, area, sMsg, obj);
    }

    private void log(LogLevel level, LogArea area, String sMsg, Object ... obj) {
        if (level.ordinal() <= this.logLevel.ordinal() && (this.hsLogArea.contains((Object)LogArea.ALL) || this.hsLogArea.contains((Object)area))) {
            this.logger.printf("JarClassLoader-" + (Object)((Object)level) + ": " + sMsg + "\n", obj);
        }
        if (!this.bLogConsole && level == LogLevel.ERROR) {
            System.out.printf("JarClassLoader-" + (Object)((Object)level) + ": " + sMsg + "\n", obj);
        }
    }

    private static class JarClassLoaderException
    extends Exception {
        JarClassLoaderException(String sMsg) {
            super(sMsg);
        }

        JarClassLoaderException(String sMsg, Throwable eCause) {
            super(sMsg, eCause);
        }

        String getMessageAll() {
            StringBuilder sb = new StringBuilder();
            Throwable e = this;
            while (e != null) {
                String sMsg;
                if (sb.length() > 0) {
                    sb.append(" / ");
                }
                if ((sMsg = e.getMessage()) == null || sMsg.length() == 0) {
                    sMsg = e.getClass().getSimpleName();
                }
                sb.append(sMsg);
                e = e.getCause();
            }
            return sb.toString();
        }
    }

    private static class JarEntryInfo {
        JarFileInfo jarFileInfo;
        JarEntry jarEntry;

        JarEntryInfo(JarFileInfo jarFileInfo, JarEntry jarEntry) {
            this.jarFileInfo = jarFileInfo;
            this.jarEntry = jarEntry;
        }

        URL getURL() {
            try {
                return new URL("jar:file:" + this.jarFileInfo.jarFile.getName() + "!/" + this.jarEntry);
            }
            catch (MalformedURLException e) {
                return null;
            }
        }

        String getName() {
            return this.jarEntry.getName().replace('/', '_');
        }

        public String toString() {
            return "JAR: " + this.jarFileInfo.jarFile.getName() + " ENTRY: " + this.jarEntry;
        }

        byte[] getJarBytes() throws JarClassLoaderException {
            FilterInputStream dis = null;
            byte[] a_by = null;
            try {
                try {
                    long lSize = this.jarEntry.getSize();
                    if (lSize <= 0L || lSize >= Integer.MAX_VALUE) {
                        throw new JarClassLoaderException("Invalid size " + lSize + " for entry " + this.jarEntry);
                    }
                    a_by = new byte[(int)lSize];
                    InputStream is = this.jarFileInfo.jarFile.getInputStream(this.jarEntry);
                    dis = new DataInputStream(is);
                    ((DataInputStream)dis).readFully(a_by);
                }
                catch (IOException e) {
                    throw new JarClassLoaderException(null, e);
                }
            }
            finally {
                if (dis != null) {
                    try {
                        dis.close();
                    }
                    catch (IOException iOException) {}
                }
            }
            return a_by;
        }
    }

    private static class JarFileInfo {
        JarFile jarFile;
        String simpleName;
        File fileDeleteOnExit;
        Manifest mf;
        ProtectionDomain pd;

        JarFileInfo(JarFile jarFile, String simpleName, JarFileInfo jarFileParent, ProtectionDomain pd, File fileDeleteOnExit) {
            this.simpleName = String.valueOf(jarFileParent == null ? "" : String.valueOf(jarFileParent.simpleName) + "!") + simpleName;
            this.jarFile = jarFile;
            this.pd = pd;
            this.fileDeleteOnExit = fileDeleteOnExit;
            try {
                this.mf = jarFile.getManifest();
            }
            catch (IOException iOException) {
                // empty catch block
            }
            if (this.mf == null) {
                this.mf = new Manifest();
            }
        }

        String getSpecificationTitle() {
            return this.mf.getMainAttributes().getValue(Attributes.Name.SPECIFICATION_TITLE);
        }

        String getSpecificationVersion() {
            return this.mf.getMainAttributes().getValue(Attributes.Name.SPECIFICATION_VERSION);
        }

        String getSpecificationVendor() {
            return this.mf.getMainAttributes().getValue(Attributes.Name.SPECIFICATION_VENDOR);
        }

        String getImplementationTitle() {
            return this.mf.getMainAttributes().getValue(Attributes.Name.IMPLEMENTATION_TITLE);
        }

        String getImplementationVersion() {
            return this.mf.getMainAttributes().getValue(Attributes.Name.IMPLEMENTATION_VERSION);
        }

        String getImplementationVendor() {
            return this.mf.getMainAttributes().getValue(Attributes.Name.IMPLEMENTATION_VENDOR);
        }

        URL getSealURL() {
            String seal = this.mf.getMainAttributes().getValue(Attributes.Name.SEALED);
            if (seal != null) {
                try {
                    return new URL(seal);
                }
                catch (MalformedURLException malformedURLException) {
                    // empty catch block
                }
            }
            return null;
        }
    }

    public static enum LogArea {
        ALL,
        CONFIG,
        JAR,
        CLASS,
        RESOURCE,
        NATIVE;

    }

    public static enum LogLevel {
        ERROR,
        WARN,
        INFO,
        DEBUG;

    }
}

