/*
 * Decompiled with CFR 0.152.
 */
package paulscode.sound.libraries;

import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Mixer;
import javax.sound.sampled.Mixer.Info;

import paulscode.sound.Channel;
import paulscode.sound.FilenameURL;
import paulscode.sound.ICodec;
import paulscode.sound.Library;
import paulscode.sound.SoundBuffer;
import paulscode.sound.SoundSystem;
import paulscode.sound.SoundSystemConfig;
import paulscode.sound.SoundSystemException;
import paulscode.sound.Source;
import paulscode.sound.libraries.ChannelJavaSound;
import paulscode.sound.libraries.LibraryJavaSound$Exception;
import paulscode.sound.libraries.LibraryJavaSound$MixerRanking;
import paulscode.sound.libraries.SourceJavaSound;

public class LibraryJavaSound
extends Library {
    private static int minSampleRate;
    private static final int XXX;
    private final int maxClipSize = 0x100000;
    private static Mixer myMixer;
    private static int maxSampleRate;
    private static boolean useSampleRateControl;
    private static final boolean SET;
    private static LibraryJavaSound$MixerRanking myMixerRanking;
    private static final boolean GET;
    private static boolean usePanControl;
    private static boolean useGainControl;
    private static int lineCount;
    private static LibraryJavaSound instance;

    private static synchronized LibraryJavaSound$MixerRanking mixerRanking(boolean bl, LibraryJavaSound$MixerRanking libraryJavaSound$MixerRanking) {
        if (bl) {
            myMixerRanking = libraryJavaSound$MixerRanking;
        }
        return myMixerRanking;
    }

    private static synchronized boolean useSampleRateControl(boolean bl, boolean bl2) {
        if (bl) {
            useSampleRateControl = bl2;
        }
        return useSampleRateControl;
    }

    public static boolean libraryCompatible() {
        for (Mixer.Info info : AudioSystem.getMixerInfo()) {
            if (!info.getName().equals("Java Sound Audio Engine")) continue;
            return true;
        }
        return false;
    }

    public static Mixer getMixer() {
        return LibraryJavaSound.mixer(false, null);
    }

    static /* synthetic */ boolean access$300(boolean bl, boolean bl2) {
        return LibraryJavaSound.useGainControl(bl, bl2);
    }

    public void cleanup() {
        super.cleanup();
        instance = null;
        myMixer = null;
        myMixerRanking = null;
    }

    public void quickPlay(boolean bl, boolean bl2, boolean bl3, String string, FilenameURL filenameURL, float f, float f2, float f3, int n, float f4, boolean bl4) {
        SoundBuffer soundBuffer = null;
        if (!bl2) {
            soundBuffer = (SoundBuffer)this.bufferMap.get(filenameURL.getFilename());
            if (soundBuffer == null && !this.loadSound(filenameURL)) {
                this.errorMessage("Source '" + string + "' was not created " + "because an error occurred while loading " + filenameURL.getFilename());
                return;
            }
            soundBuffer = (SoundBuffer)this.bufferMap.get(filenameURL.getFilename());
            if (soundBuffer == null) {
                this.errorMessage("Source '" + string + "' was not created " + "because audio data was not found for " + filenameURL.getFilename());
                return;
            }
        }
        if (!bl2 && soundBuffer != null) {
            soundBuffer.trimData(0x100000);
        }
        this.sourceMap.put(string, new SourceJavaSound(this.listener, bl, bl2, bl3, string, filenameURL, soundBuffer, f, f2, f3, n, f4, bl4));
    }

    static /* synthetic */ int access$000(boolean bl, int n) {
        return LibraryJavaSound.minSampleRate(bl, n);
    }

    public void newSource(boolean bl, boolean bl2, boolean bl3, String string, FilenameURL filenameURL, float f, float f2, float f3, int n, float f4) {
        SoundBuffer soundBuffer = null;
        if (!bl2) {
            soundBuffer = (SoundBuffer)this.bufferMap.get(filenameURL.getFilename());
            if (soundBuffer == null && !this.loadSound(filenameURL)) {
                this.errorMessage("Source '" + string + "' was not created " + "because an error occurred while loading " + filenameURL.getFilename());
                return;
            }
            soundBuffer = (SoundBuffer)this.bufferMap.get(filenameURL.getFilename());
            if (soundBuffer == null) {
                this.errorMessage("Source '" + string + "' was not created " + "because audio data was not found for " + filenameURL.getFilename());
                return;
            }
        }
        if (!bl2 && soundBuffer != null) {
            soundBuffer.trimData(0x100000);
        }
        this.sourceMap.put(string, new SourceJavaSound(this.listener, bl, bl2, bl3, string, filenameURL, soundBuffer, f, f2, f3, n, f4, false));
    }

    public boolean loadSound(FilenameURL filenameURL) {
        if (this.bufferMap == null) {
            this.bufferMap = new HashMap();
            this.importantMessage("Buffer Map was null in method 'loadSound'");
        }
        if (this.errorCheck(filenameURL == null, "Filename/URL not specified in method 'loadSound'")) {
            return false;
        }
        if (this.bufferMap.get(filenameURL.getFilename()) != null) {
            return true;
        }
        ICodec iCodec = SoundSystemConfig.getCodec(filenameURL.getFilename());
        if (this.errorCheck(iCodec == null, "No codec found for file '" + filenameURL.getFilename() + "' in method 'loadSound'")) {
            return false;
        }
        URL uRL = filenameURL.getURL();
        if (this.errorCheck(uRL == null, "Unable to open file '" + filenameURL.getFilename() + "' in method 'loadSound'")) {
            return false;
        }
        iCodec.initialize(uRL);
        SoundBuffer soundBuffer = iCodec.readAll();
        iCodec.cleanup();
        iCodec = null;
        if (soundBuffer != null) {
            this.bufferMap.put(filenameURL.getFilename(), soundBuffer);
        } else {
            this.errorMessage("Sound buffer null in method 'loadSound'");
        }
        return true;
    }

    private static synchronized int lineCount(boolean bl, int n) {
        if (bl) {
            lineCount = n;
        }
        return lineCount;
    }

    static /* synthetic */ int access$100(boolean bl, int n) {
        return LibraryJavaSound.maxSampleRate(bl, n);
    }

    public boolean loadSound(SoundBuffer soundBuffer, String string) {
        if (this.bufferMap == null) {
            this.bufferMap = new HashMap();
            this.importantMessage("Buffer Map was null in method 'loadSound'");
        }
        if (this.errorCheck(string == null, "Identifier not specified in method 'loadSound'")) {
            return false;
        }
        if (this.bufferMap.get(string) != null) {
            return true;
        }
        if (soundBuffer != null) {
            this.bufferMap.put(string, soundBuffer);
        } else {
            this.errorMessage("Sound buffer null in method 'loadSound'");
        }
        return true;
    }

    public static void useGainControl(boolean bl) {
        LibraryJavaSound.useGainControl(true, bl);
    }

    public void rawDataStream(AudioFormat audioFormat, boolean bl, String string, float f, float f2, float f3, int n, float f4) {
        this.sourceMap.put(string, new SourceJavaSound(this.listener, audioFormat, bl, string, f, f2, f3, n, f4));
    }

    public static void useSampleRateControl(boolean bl) {
        LibraryJavaSound.useSampleRateControl(true, bl);
    }

    static /* synthetic */ int access$200(boolean bl, int n) {
        return LibraryJavaSound.lineCount(bl, n);
    }

    public static LibraryJavaSound$MixerRanking getMixerRanking() {
        return LibraryJavaSound.mixerRanking(false, null);
    }

    private static synchronized boolean usePanControl(boolean bl, boolean bl2) {
        if (bl) {
            usePanControl = bl2;
        }
        return usePanControl;
    }

    public static void usePanControl(boolean bl) {
        LibraryJavaSound.usePanControl(true, bl);
    }

    public static void setMinSampleRate(int n) {
        LibraryJavaSound.minSampleRate(true, n);
    }

    public void init() throws SoundSystemException {
        LibraryJavaSound$MixerRanking var1 = null;
        if (myMixer == null) {
            Info[] var2 = AudioSystem.getMixerInfo();
            int var3 = var2.length;

            int var4;
            for(var4 = 0; var4 < var3; ++var4) {
                Info var5 = var2[var4];
                if (var5.getName().equals("Java Sound Audio Engine")) {
                    var1 = new LibraryJavaSound$MixerRanking();

                    try {
                        var1.rank(var5);
                    } catch (LibraryJavaSound$Exception var10) {
                        break;
                    }

                    if (var1.rank >= 14) {
                        myMixer = AudioSystem.getMixer(var5);
                        mixerRanking(true, var1);
                    }
                    break;
                }
            }

            if (myMixer == null) {
                LibraryJavaSound$MixerRanking var11 = var1;
                Info[] var12 = AudioSystem.getMixerInfo();
                var4 = var12.length;

                for(int var13 = 0; var13 < var4; ++var13) {
                    Info var6 = var12[var13];
                    var1 = new LibraryJavaSound$MixerRanking();

                    try {
                        var1.rank(var6);
                    } catch (LibraryJavaSound$Exception var9) {
                    }

                    if (var11 == null || var1.rank > var11.rank) {
                        var11 = var1;
                    }
                }

                if (var11 == null) {
                    throw new LibraryJavaSound$Exception("No useable mixers found!", new LibraryJavaSound$MixerRanking());
                }

                try {
                    myMixer = AudioSystem.getMixer(var11.mixerInfo);
                    mixerRanking(true, var11);
                } catch (Exception var8) {
                    throw new LibraryJavaSound$Exception("No useable mixers available!", new LibraryJavaSound$MixerRanking());
                }
            }
        }

        this.setMasterVolume(1.0F);
        this.message("JavaSound initialized.");
        super.init();
    }

    public static void setLineCount(int n) {
        LibraryJavaSound.lineCount(true, n);
    }

    public static String getDescription() {
        return "The Java Sound API.  For more information, see http://java.sun.com/products/java-media/sound/";
    }

    static {
        SET = true;
        XXX = 0;
        GET = false;
        myMixer = null;
        myMixerRanking = null;
        instance = null;
        minSampleRate = 4000;
        maxSampleRate = 48000;
        lineCount = 32;
        useGainControl = true;
        usePanControl = true;
        useSampleRateControl = true;
    }

    private static synchronized int minSampleRate(boolean bl, int n) {
        if (bl) {
            minSampleRate = n;
        }
        return minSampleRate;
    }

    public void setMasterVolume(float f) {
        super.setMasterVolume(f);
        Set set = this.sourceMap.keySet();
        for (Object obj : set) {String string = (String) obj;
            Source source = (Source)this.sourceMap.get(string);
            if (source == null) continue;
            source.positionChanged();
        }
    }

    public static String getTitle() {
        return "Java Sound";
    }

    protected Channel createChannel(int n) {
        return new ChannelJavaSound(n, myMixer);
    }

    private static synchronized Mixer mixer(boolean bl, Mixer mixer) {
        if (bl) {
            if (mixer == null) {
                return myMixer;
            }
            LibraryJavaSound$MixerRanking libraryJavaSound$MixerRanking = new LibraryJavaSound$MixerRanking();
            try {
                libraryJavaSound$MixerRanking.rank(mixer.getMixerInfo());
            }
            catch (LibraryJavaSound$Exception libraryJavaSound$Exception) {
                SoundSystemConfig.getLogger().printStackTrace(libraryJavaSound$Exception, 1);
                SoundSystem.setException(libraryJavaSound$Exception);
            }
            myMixer = mixer;
            LibraryJavaSound.mixerRanking(true, libraryJavaSound$MixerRanking);
            if (instance != null) {
                ChannelJavaSound channelJavaSound;
                ListIterator listIterator = LibraryJavaSound.instance.normalChannels.listIterator();
                SoundSystem.setException(null);
                while (listIterator.hasNext()) {
                    channelJavaSound = (ChannelJavaSound)listIterator.next();
                    channelJavaSound.newMixer(mixer);
                }
                listIterator = LibraryJavaSound.instance.streamingChannels.listIterator();
                while (listIterator.hasNext()) {
                    channelJavaSound = (ChannelJavaSound)listIterator.next();
                    channelJavaSound.newMixer(mixer);
                }
            }
        }
        return myMixer;
    }

    public void copySources(HashMap hashMap) {
        if (hashMap == null) {
            return;
        }
        Set set = hashMap.keySet();
        Iterator iterator = set.iterator();
        if (this.bufferMap == null) {
            this.bufferMap = new HashMap();
            this.importantMessage("Buffer Map was null in method 'copySources'");
        }
        this.sourceMap.clear();
        while (iterator.hasNext()) {
            String string = (String)iterator.next();
            Source source = (Source)hashMap.get(string);
            if (source == null) continue;
            SoundBuffer soundBuffer = null;
            if (!source.toStream) {
                this.loadSound(source.filenameURL);
                soundBuffer = (SoundBuffer)this.bufferMap.get(source.filenameURL.getFilename());
            }
            if (!source.toStream && soundBuffer != null) {
                soundBuffer.trimData(0x100000);
            }
            if (!source.toStream && soundBuffer == null) continue;
            this.sourceMap.put(string, new SourceJavaSound(this.listener, source, soundBuffer));
        }
    }

    public String getClassName() {
        return "LibraryJavaSound";
    }

    public static void setMixer(Mixer mixer) throws SoundSystemException {
        LibraryJavaSound.mixer(true, mixer);
        SoundSystemException soundSystemException = SoundSystem.getLastException();
        SoundSystem.setException(null);
        if (soundSystemException != null) {
            throw soundSystemException;
        }
    }

    public void setListenerVelocity(float f, float f2, float f3) {
        super.setListenerVelocity(f, f2, f3);
        this.listenerMoved();
    }

    private static synchronized boolean useGainControl(boolean bl, boolean bl2) {
        if (bl) {
            useGainControl = bl2;
        }
        return useGainControl;
    }

    static /* synthetic */ boolean access$400(boolean bl, boolean bl2) {
        return LibraryJavaSound.usePanControl(bl, bl2);
    }

    private static synchronized int maxSampleRate(boolean bl, int n) {
        if (bl) {
            maxSampleRate = n;
        }
        return maxSampleRate;
    }

    public void dopplerChanged() {
        super.dopplerChanged();
        this.listenerMoved();
    }

    public LibraryJavaSound() throws SoundSystemException {
        instance = this;
    }

    public static void setMaxSampleRate(int n) {
        LibraryJavaSound.maxSampleRate(true, n);
    }

    static /* synthetic */ boolean access$500(boolean bl, boolean bl2) {
        return LibraryJavaSound.useSampleRateControl(bl, bl2);
    }
}

