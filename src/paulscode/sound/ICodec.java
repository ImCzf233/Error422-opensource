/*
 * Decompiled with CFR 0.152.
 */
package paulscode.sound;

import java.net.URL;
import javax.sound.sampled.AudioFormat;
import paulscode.sound.SoundBuffer;

public interface ICodec {
    public boolean endOfStream();

    public SoundBuffer readAll();

    public boolean initialize(URL var1);

    public AudioFormat getAudioFormat();

    public void cleanup();

    public void reverseByteOrder(boolean var1);

    public SoundBuffer read();

    public boolean initialized();
}

