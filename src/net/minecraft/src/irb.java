package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Enumeration;
import java.util.IllegalFormatException;
import java.util.Properties;
import java.util.TreeMap;

public class irb {
    private TreeMap field_36ba99ee_Dne;
    private TreeMap field_5f16b38d_FWm;
    private boolean field_2092bf_Dne;
    private String field_569fcf45_Dne;
    private static irb field_3774533_Dne = new irb("en_US");
    private Properties field_ddac30f7_Dne = new Properties();

    public synchronized boolean method_8f501fe8_Dne(String string) {
        return this.field_ddac30f7_Dne.containsKey(string);
    }

    public synchronized String method_39193c_Dne(String string) {
        return this.field_ddac30f7_Dne.getProperty(string, string);
    }

    public String method_eecad346_Dne() {
        return this.field_569fcf45_Dne;
    }

    public static boolean method_110c4dc7_FWm(String string) {
        return "ar_SA".equals(string) || "he_IL".equals(string);
    }

    public static irb method_2310d392_Dne() {
        return field_3774533_Dne;
    }

    public boolean method_7a46289e_Dne() {
        return this.field_2092bf_Dne;
    }

    public synchronized void method_7ccd8a5b_Dne(String string, File file) {
        int n = string.indexOf(46);
        if (n > 0) {
            string = string.substring(0, n);
        }
        this.field_5f16b38d_FWm.put(string, file);
        if (string.contains(this.field_569fcf45_Dne)) {
            this.method_5ab48f70_Dne(this.field_569fcf45_Dne, true);
        }
    }

    public synchronized void method_5ab48f70_Dne(String string, boolean bl) {
        if (bl || !string.equals(this.field_569fcf45_Dne)) {
            Properties properties = new Properties();
            try {
                this.method_ff70d460_Dne(properties, "en_US");
            }
            catch (IOException iOException) {
                // empty catch block
            }
            this.field_2092bf_Dne = false;
            if (!"en_US".equals(string)) {
                try {
                    this.method_ff70d460_Dne(properties, string);
                    Enumeration<?> enumeration = properties.propertyNames();
                    block4: while (enumeration.hasMoreElements() && !this.field_2092bf_Dne) {
                        Object obj = enumeration.nextElement();
                        Object v = properties.get(obj);
                        if (v == null) continue;
                        String string2 = v.toString();
                        for (int i = 0; i < string2.length(); ++i) {
                            if (string2.charAt(i) < '\u0100') continue;
                            this.field_2092bf_Dne = true;
                            continue block4;
                        }
                    }
                }
                catch (IOException iOException) {
                    iOException.printStackTrace();
                    return;
                }
            }
            this.field_569fcf45_Dne = string;
            this.field_ddac30f7_Dne = properties;
        }
    }

    public irb(String string) {
        this.field_5f16b38d_FWm = new TreeMap();
        this.method_7a46289a_Dne();
        this.method_5ab48f70_Dne(string, false);
    }

    public TreeMap method_a3f0160d_Dne() {
        return this.field_36ba99ee_Dne;
    }

    public synchronized String method_98148f73_Dne(String string, Object ... objectArray) {
        String string2 = this.field_ddac30f7_Dne.getProperty(string, string);
        try {
            return String.format(string2, objectArray);
        }
        catch (IllegalFormatException illegalFormatException) {
            return "Format error: " + string2;
        }
    }

    private void method_7a46289a_Dne() {
        TreeMap<String, String> treeMap = new TreeMap<String, String>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(irb.class.getResourceAsStream("/lang/languages.txt"), "UTF-8"));
            String string = bufferedReader.readLine();
            while (string != null) {
                String[] stringArray = string.trim().split("=");
                if (stringArray != null && stringArray.length == 2) {
                    treeMap.put(stringArray[0], stringArray[1]);
                }
                string = bufferedReader.readLine();
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return;
        }
        this.field_36ba99ee_Dne = treeMap;
        this.field_36ba99ee_Dne.put("en_US", "English (US)");
    }

    private void method_ff70d460_Dne(Properties properties, String string) throws IOException {
        BufferedReader bufferedReader = null;
        bufferedReader = this.field_5f16b38d_FWm.containsKey(string) ? new BufferedReader(new FileReader((File)this.field_5f16b38d_FWm.get(string))) : new BufferedReader(new InputStreamReader(irb.class.getResourceAsStream("/lang/" + string + ".lang"), "UTF-8"));
        String string2 = bufferedReader.readLine();
        while (string2 != null) {
            String[] stringArray;
            if (!(string2 = string2.trim()).startsWith("#") && (stringArray = string2.split("=")) != null && stringArray.length == 2) {
                properties.setProperty(stringArray[0], stringArray[1]);
            }
            string2 = bufferedReader.readLine();
        }
    }

    public synchronized String method_8dd0853d_FWm(String string) {
        return this.field_ddac30f7_Dne.getProperty(string + ".name", "");
    }
}

