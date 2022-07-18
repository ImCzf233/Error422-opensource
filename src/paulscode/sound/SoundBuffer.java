/*
 * Decompiled with CFR 0.152.
 */
package paulscode.sound;

import javax.sound.sampled.AudioFormat;

public class SoundBuffer {
    public AudioFormat audioFormat;
    public byte[] audioData;

    public void trimData(int n) {
        if (this.audioData == null || n == 0) {
            this.audioData = null;
        } else if (this.audioData.length > n) {
            byte[] byArray = new byte[n];
            System.arraycopy(this.audioData, 0, byArray, 0, n);
            this.audioData = byArray;
        }
    }

    public SoundBuffer(byte[] byArray, AudioFormat audioFormat) {
        this.audioData = byArray;
        this.audioFormat = audioFormat;
    }

    public void cleanup() {
        this.audioData = null;
        this.audioFormat = null;
    }
}

