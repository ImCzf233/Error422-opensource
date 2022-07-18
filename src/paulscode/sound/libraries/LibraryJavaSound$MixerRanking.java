// Decompiled with: FernFlower
// Class Version: 5
package paulscode.sound.libraries;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.Mixer;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.FloatControl.Type;
import javax.sound.sampled.Mixer.Info;

public class LibraryJavaSound$MixerRanking {
    public boolean maxSampleRateOK = false;
    public static final int MEDIUM = 2;
    public static int MIN_SAMPLE_RATE_PRIORITY = 1;
    public boolean minSampleRateOK = false;
    public static int GAIN_CONTROL_PRIORITY = 2;
    public static int PAN_CONTROL_PRIORITY = 2;
    public static int SAMPLE_RATE_CONTROL_PRIORITY = 3;
    public boolean lineCountOK = false;
    public boolean mixerExists = false;
    public static int LINE_COUNT_PRIORITY = 1;
    public int maxLinesPossible = 0;
    public static int MAX_SAMPLE_RATE_PRIORITY = 1;
    public boolean gainControlOK = false;
    public Info mixerInfo = null;
    public static final int LOW = 3;
    public boolean sampleRateControlOK = false;
    public static final int NONE = 4;
    public static int MIXER_EXISTS_PRIORITY = 1;
    public int minSampleRatePossible = -1;
    public int rank = 0;
    public static final int HIGH = 1;
    public boolean panControlOK = false;
    public int maxSampleRatePossible = -1;

    public LibraryJavaSound$MixerRanking() {
    }

    public void rank(Info var1) throws LibraryJavaSound$Exception {
        if (var1 == null) {
            throw new LibraryJavaSound$Exception("No Mixer info specified in method 'MixerRanking.rank'", this);
        } else {
            this.mixerInfo = var1;

            Mixer var2;
            try {
                var2 = AudioSystem.getMixer(this.mixerInfo);
            } catch (Exception var17) {
                throw new LibraryJavaSound$Exception("Unable to acquire the specified Mixer in method 'MixerRanking.rank'", this);
            }

            if (var2 == null) {
                throw new LibraryJavaSound$Exception("Unable to acquire the specified Mixer in method 'MixerRanking.rank'", this);
            } else {
                this.mixerExists = true;

                AudioFormat var3;
                javax.sound.sampled.DataLine.Info var4;
                try {
                    var3 = new AudioFormat((float)LibraryJavaSound.access$000(false, 0), 16, 2, true, false);
                    var4 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, var3);
                } catch (Exception var16) {
                    throw new LibraryJavaSound$Exception("Invalid minimum sample-rate specified in method 'MixerRanking.rank'", this);
                }

                if (!AudioSystem.isLineSupported(var4)) {
                    if (MIN_SAMPLE_RATE_PRIORITY == 1) {
                        throw new LibraryJavaSound$Exception("Specified minimum sample-rate not possible for Mixer '" + this.mixerInfo.getName() + "'", this);
                    }
                } else {
                    this.minSampleRateOK = true;
                }

                try {
                    var3 = new AudioFormat((float)LibraryJavaSound.access$100(false, 0), 16, 2, true, false);
                    var4 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, var3);
                } catch (Exception var15) {
                    throw new LibraryJavaSound$Exception("Invalid maximum sample-rate specified in method 'MixerRanking.rank'", this);
                }

                if (!AudioSystem.isLineSupported(var4)) {
                    if (MAX_SAMPLE_RATE_PRIORITY == 1) {
                        throw new LibraryJavaSound$Exception("Specified maximum sample-rate not possible for Mixer '" + this.mixerInfo.getName() + "'", this);
                    }
                } else {
                    this.maxSampleRateOK = true;
                }

                int var5;
                int var6;
                int var7;
                if (this.minSampleRateOK) {
                    this.minSampleRatePossible = LibraryJavaSound.access$000(false, 0);
                } else {
                    var5 = LibraryJavaSound.access$000(false, 0);
                    var6 = LibraryJavaSound.access$100(false, 0);

                    while(var6 - var5 > 1) {
                        var7 = var5 + (var6 - var5) / 2;
                        var3 = new AudioFormat((float)var7, 16, 2, true, false);
                        var4 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, var3);
                        if (AudioSystem.isLineSupported(var4)) {
                            this.minSampleRatePossible = var7;
                            var6 = var7;
                        } else {
                            var5 = var7;
                        }
                    }
                }

                if (this.maxSampleRateOK) {
                    this.maxSampleRatePossible = LibraryJavaSound.access$100(false, 0);
                } else if (this.minSampleRatePossible != -1) {
                    var6 = LibraryJavaSound.access$100(false, 0);
                    var5 = this.minSampleRatePossible;

                    while(var6 - var5 > 1) {
                        var7 = var5 + (var6 - var5) / 2;
                        var3 = new AudioFormat((float)var7, 16, 2, true, false);
                        var4 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, var3);
                        if (AudioSystem.isLineSupported(var4)) {
                            this.maxSampleRatePossible = var7;
                            var5 = var7;
                        } else {
                            var6 = var7;
                        }
                    }
                }

                if (this.minSampleRatePossible != -1 && this.maxSampleRatePossible != -1) {
                    var3 = new AudioFormat((float)this.minSampleRatePossible, 16, 2, true, false);
                    Clip var8 = null;

                    javax.sound.sampled.DataLine.Info var9;
                    try {
                        var9 = new javax.sound.sampled.DataLine.Info(Clip.class, var3);
                        var8 = (Clip)var2.getLine(var9);
                        byte[] var10 = new byte[10];
                        var8.open(var3, var10, 0, var10.length);
                    } catch (Exception var14) {
                        throw new LibraryJavaSound$Exception("Unable to attach an actual audio buffer to an actual Clip... Mixer '" + this.mixerInfo.getName() + "' is unuseable.", this);
                    }

                    this.maxLinesPossible = 1;
                    var4 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, var3);
                    SourceDataLine[] var19 = new SourceDataLine[LibraryJavaSound.access$200(false, 0) - 1];
                    boolean var20 = false;

                    for(int var11 = 1; var11 < var19.length + 1; ++var11) {
                        try {
                            var19[var11 - 1] = (SourceDataLine)var2.getLine(var4);
                        } catch (Exception var18) {
                            if (var11 == 0) {
                                throw new LibraryJavaSound$Exception("No output lines possible for Mixer '" + this.mixerInfo.getName() + "'", this);
                            }

                            if (LINE_COUNT_PRIORITY == 1) {
                                throw new LibraryJavaSound$Exception("Specified maximum number of lines not possible for Mixer '" + this.mixerInfo.getName() + "'", this);
                            }
                            break;
                        }

                        this.maxLinesPossible = var11 + 1;
                    }

                    try {
                        var8.close();
                    } catch (Exception var13) {
                    }

                    var8 = null;
                    if (this.maxLinesPossible == LibraryJavaSound.access$200(false, 0)) {
                        this.lineCountOK = true;
                    }

                    if (!LibraryJavaSound.access$300(false, false)) {
                        GAIN_CONTROL_PRIORITY = 4;
                    } else if (!var19[0].isControlSupported(Type.MASTER_GAIN)) {
                        if (GAIN_CONTROL_PRIORITY == 1) {
                            throw new LibraryJavaSound$Exception("Gain control not available for Mixer '" + this.mixerInfo.getName() + "'", this);
                        }
                    } else {
                        this.gainControlOK = true;
                    }

                    if (!LibraryJavaSound.access$400(false, false)) {
                        PAN_CONTROL_PRIORITY = 4;
                    } else if (!var19[0].isControlSupported(Type.PAN)) {
                        if (PAN_CONTROL_PRIORITY == 1) {
                            throw new LibraryJavaSound$Exception("Pan control not available for Mixer '" + this.mixerInfo.getName() + "'", this);
                        }
                    } else {
                        this.panControlOK = true;
                    }

                    if (!LibraryJavaSound.access$500(false, false)) {
                        SAMPLE_RATE_CONTROL_PRIORITY = 4;
                    } else if (!var19[0].isControlSupported(Type.SAMPLE_RATE)) {
                        if (SAMPLE_RATE_CONTROL_PRIORITY == 1) {
                            throw new LibraryJavaSound$Exception("Sample-rate control not available for Mixer '" + this.mixerInfo.getName() + "'", this);
                        }
                    } else {
                        this.sampleRateControlOK = true;
                    }

                    this.rank += this.getRankValue(this.mixerExists, MIXER_EXISTS_PRIORITY);
                    this.rank += this.getRankValue(this.minSampleRateOK, MIN_SAMPLE_RATE_PRIORITY);
                    this.rank += this.getRankValue(this.maxSampleRateOK, MAX_SAMPLE_RATE_PRIORITY);
                    this.rank += this.getRankValue(this.lineCountOK, LINE_COUNT_PRIORITY);
                    this.rank += this.getRankValue(this.gainControlOK, GAIN_CONTROL_PRIORITY);
                    this.rank += this.getRankValue(this.panControlOK, PAN_CONTROL_PRIORITY);
                    this.rank += this.getRankValue(this.sampleRateControlOK, SAMPLE_RATE_CONTROL_PRIORITY);
                    var2 = null;
                    var3 = null;
                    var4 = null;
                    var9 = null;
                } else {
                    throw new LibraryJavaSound$Exception("No possible sample-rate found for Mixer '" + this.mixerInfo.getName() + "'", this);
                }
            }
        }
    }

    public LibraryJavaSound$MixerRanking(Info var1, int var2, boolean var3, boolean var4, boolean var5, boolean var6, boolean var7, boolean var8, boolean var9) {
        this.mixerInfo = var1;
        this.rank = var2;
        this.mixerExists = var3;
        this.minSampleRateOK = var4;
        this.maxSampleRateOK = var5;
        this.lineCountOK = var6;
        this.gainControlOK = var7;
        this.panControlOK = var8;
        this.sampleRateControlOK = var9;
    }

    private int getRankValue(boolean var1, int var2) {
        if (var1) {
            return 2;
        } else if (var2 == 4) {
            return 2;
        } else {
            return var2 == 3 ? 1 : 0;
        }
    }
}
 