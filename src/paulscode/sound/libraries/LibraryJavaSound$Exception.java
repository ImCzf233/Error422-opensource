// Decompiled with: FernFlower
// Class Version: 5
package paulscode.sound.libraries;

import paulscode.sound.SoundSystemException;

public class LibraryJavaSound$Exception extends SoundSystemException {
    public static LibraryJavaSound$MixerRanking mixerRanking = null;
    public static final int MIXER_PROBLEM = 101;

    public LibraryJavaSound$Exception(String var1, int var2) {
        super(var1, var2);
    }

    public LibraryJavaSound$Exception(String var1, LibraryJavaSound$MixerRanking var2) {
        super(var1, 101);
        mixerRanking = var2;
    }

    public LibraryJavaSound$Exception(String var1) {
        super(var1);
    }
}
 