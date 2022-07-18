/*
 * Decompiled with CFR 0.152.
 */
package paulscode.sound.libraries;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.LinkedList;
import javax.sound.sampled.AudioFormat;
import org.lwjgl.BufferUtils;
import org.lwjgl.openal.AL10;
import paulscode.sound.Channel;
import paulscode.sound.libraries.LibraryLWJGLOpenAL;

public class ChannelLWJGLOpenAL
extends Channel {
    public float millisPreviouslyPlayed = 0.0f;
    public IntBuffer ALSource;
    public int sampleRate;
    public int ALformat;

    public boolean attachBuffer(IntBuffer intBuffer) {
        if (this.errorCheck(this.channelType != 0, "Sound buffers may only be attached to normal sources.")) {
            return false;
        }
        AL10.alSourcei(this.ALSource.get(0), 4105, intBuffer.get(0));
        if (this.attachedSource != null && this.attachedSource.soundBuffer != null && this.attachedSource.soundBuffer.audioFormat != null) {
            this.setAudioFormat(this.attachedSource.soundBuffer.audioFormat);
        }
        return this.checkALError();
    }

    public void stop() {
        AL10.alSourceStop(this.ALSource.get(0));
        if (!this.checkALError()) {
            this.millisPreviouslyPlayed = 0.0f;
        }
    }

    public void play() {
        AL10.alSourcePlay(this.ALSource.get(0));
        this.checkALError();
    }

    public void flush() {
        if (this.channelType != 1) {
            return;
        }
        if (this.checkALError()) {
            return;
        }
        IntBuffer intBuffer = BufferUtils.createIntBuffer(1);
        for (int i = AL10.alGetSourcei(this.ALSource.get(0), 4117); i > 0; --i) {
            try {
                AL10.alSourceUnqueueBuffers(this.ALSource.get(0), intBuffer);
            }
            catch (Exception exception) {
                return;
            }
            if (!this.checkALError()) continue;
            return;
        }
        this.millisPreviouslyPlayed = 0.0f;
    }

    public boolean queueBuffer(byte[] byArray) {
        if (this.errorCheck(this.channelType != 1, "Buffers may only be queued for streaming sources.")) {
            return false;
        }
        ByteBuffer byteBuffer = (ByteBuffer)BufferUtils.createByteBuffer(byArray.length).put(byArray).flip();
        IntBuffer intBuffer = BufferUtils.createIntBuffer(1);
        AL10.alSourceUnqueueBuffers(this.ALSource.get(0), intBuffer);
        if (this.checkALError()) {
            return false;
        }
        if (AL10.alIsBuffer(intBuffer.get(0))) {
            this.millisPreviouslyPlayed += this.millisInBuffer(intBuffer.get(0));
        }
        this.checkALError();
        AL10.alBufferData(intBuffer.get(0), this.ALformat, byteBuffer, this.sampleRate);
        if (this.checkALError()) {
            return false;
        }
        AL10.alSourceQueueBuffers(this.ALSource.get(0), intBuffer);
        return !this.checkALError();
    }

    private boolean checkALError() {
        switch (AL10.alGetError()) {
            case 0: {
                return false;
            }
            case 40961: {
                this.errorMessage("Invalid name parameter.");
                return true;
            }
            case 40962: {
                this.errorMessage("Invalid parameter.");
                return true;
            }
            case 40963: {
                this.errorMessage("Invalid enumerated parameter value.");
                return true;
            }
            case 40964: {
                this.errorMessage("Illegal call.");
                return true;
            }
            case 40965: {
                this.errorMessage("Unable to allocate memory.");
                return true;
            }
        }
        this.errorMessage("An unrecognized error occurred.");
        return true;
    }

    public float millisecondsPlayed() {
        float f = AL10.alGetSourcei(this.ALSource.get(0), 4134);
        float f2 = 1.0f;
        switch (this.ALformat) {
            case 4352: {
                f2 = 1.0f;
                break;
            }
            case 4353: {
                f2 = 2.0f;
                break;
            }
            case 4354: {
                f2 = 2.0f;
                break;
            }
            case 4355: {
                f2 = 4.0f;
                break;
            }
        }
        f = f / f2 / (float)this.sampleRate * 1000.0f;
        if (this.channelType == 1) {
            f += this.millisPreviouslyPlayed;
        }
        return f;
    }

    public float millisInBuffer(int n) {
        return (float)AL10.alGetBufferi(n, 8196) / (float)AL10.alGetBufferi(n, 8195) / ((float)AL10.alGetBufferi(n, 8194) / 8.0f) / (float)this.sampleRate * 1000.0f;
    }

    public boolean preLoadBuffers(LinkedList linkedList) {
        IntBuffer intBuffer;
        int n;
        if (this.errorCheck(this.channelType != 1, "Buffers may only be queued for streaming sources.")) {
            return false;
        }
        if (this.errorCheck(linkedList == null, "Buffer List null in method 'preLoadBuffers'")) {
            return false;
        }
        boolean bl = this.playing();
        if (bl) {
            AL10.alSourceStop(this.ALSource.get(0));
            this.checkALError();
        }
        if ((n = AL10.alGetSourcei(this.ALSource.get(0), 4118)) > 0) {
            intBuffer = BufferUtils.createIntBuffer(n);
            AL10.alGenBuffers(intBuffer);
            if (this.errorCheck(this.checkALError(), "Error clearing stream buffers in method 'preLoadBuffers'")) {
                return false;
            }
            AL10.alSourceUnqueueBuffers(this.ALSource.get(0), intBuffer);
            if (this.errorCheck(this.checkALError(), "Error unqueuing stream buffers in method 'preLoadBuffers'")) {
                return false;
            }
        }
        if (bl) {
            AL10.alSourcePlay(this.ALSource.get(0));
            this.checkALError();
        }
        intBuffer = BufferUtils.createIntBuffer(linkedList.size());
        AL10.alGenBuffers(intBuffer);
        if (this.errorCheck(this.checkALError(), "Error generating stream buffers in method 'preLoadBuffers'")) {
            return false;
        }
        ByteBuffer byteBuffer = null;
        for (int i = 0; i < linkedList.size(); ++i) {
            byteBuffer = (ByteBuffer)BufferUtils.createByteBuffer(((byte[])linkedList.get(i)).length).put((byte[])linkedList.get(i)).flip();
            try {
                AL10.alBufferData(intBuffer.get(i), this.ALformat, byteBuffer, this.sampleRate);
            }
            catch (Exception exception) {
                this.errorMessage("Error creating buffers in method 'preLoadBuffers'");
                this.printStackTrace(exception);
                return false;
            }
            if (!this.errorCheck(this.checkALError(), "Error creating buffers in method 'preLoadBuffers'")) continue;
            return false;
        }
        try {
            AL10.alSourceQueueBuffers(this.ALSource.get(0), intBuffer);
        }
        catch (Exception exception) {
            this.errorMessage("Error queuing buffers in method 'preLoadBuffers'");
            this.printStackTrace(exception);
            return false;
        }
        if (this.errorCheck(this.checkALError(), "Error queuing buffers in method 'preLoadBuffers'")) {
            return false;
        }
        AL10.alSourcePlay(this.ALSource.get(0));
        return !this.errorCheck(this.checkALError(), "Error playing source in method 'preLoadBuffers'");
    }

    public void cleanup() {
        if (this.ALSource != null) {
            try {
                AL10.alSourceStop(this.ALSource);
                AL10.alGetError();
            }
            catch (Exception exception) {
                // empty catch block
            }
            try {
                AL10.alDeleteSources(this.ALSource);
                AL10.alGetError();
            }
            catch (Exception exception) {
                // empty catch block
            }
            this.ALSource.clear();
        }
        this.ALSource = null;
        super.cleanup();
    }

    public void rewind() {
        if (this.channelType == 1) {
            return;
        }
        AL10.alSourceRewind(this.ALSource.get(0));
        if (!this.checkALError()) {
            this.millisPreviouslyPlayed = 0.0f;
        }
    }

    public int feedRawAudioData(byte[] byArray) {
        IntBuffer intBuffer;
        if (this.errorCheck(this.channelType != 1, "Raw audio data can only be fed to streaming sources.")) {
            return -1;
        }
        ByteBuffer byteBuffer = (ByteBuffer)BufferUtils.createByteBuffer(byArray.length).put(byArray).flip();
        int n = AL10.alGetSourcei(this.ALSource.get(0), 4118);
        if (n > 0) {
            intBuffer = BufferUtils.createIntBuffer(n);
            AL10.alGenBuffers(intBuffer);
            if (this.errorCheck(this.checkALError(), "Error clearing stream buffers in method 'feedRawAudioData'")) {
                return -1;
            }
            AL10.alSourceUnqueueBuffers(this.ALSource.get(0), intBuffer);
            if (this.errorCheck(this.checkALError(), "Error unqueuing stream buffers in method 'feedRawAudioData'")) {
                return -1;
            }
            if (AL10.alIsBuffer(intBuffer.get(0))) {
                this.millisPreviouslyPlayed += this.millisInBuffer(intBuffer.get(0));
            }
            this.checkALError();
        } else {
            intBuffer = BufferUtils.createIntBuffer(1);
            AL10.alGenBuffers(intBuffer);
            if (this.errorCheck(this.checkALError(), "Error generating stream buffers in method 'preLoadBuffers'")) {
                return -1;
            }
        }
        AL10.alBufferData(intBuffer.get(0), this.ALformat, byteBuffer, this.sampleRate);
        if (this.checkALError()) {
            return -1;
        }
        AL10.alSourceQueueBuffers(this.ALSource.get(0), intBuffer);
        if (this.checkALError()) {
            return -1;
        }
        if (this.attachedSource != null && this.attachedSource.channel == this && this.attachedSource.active() && !this.playing()) {
            AL10.alSourcePlay(this.ALSource.get(0));
            this.checkALError();
        }
        return n;
    }

    public ChannelLWJGLOpenAL(int n, IntBuffer intBuffer) {
        super(n);
        this.libraryType = LibraryLWJGLOpenAL.class;
        this.ALSource = intBuffer;
    }

    public boolean playing() {
        int n = AL10.alGetSourcei(this.ALSource.get(0), 4112);
        if (this.checkALError()) {
            return false;
        }
        return n == 4114;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void setAudioFormat(AudioFormat audioFormat) {
        int n = 0;
        if (audioFormat.getChannels() == 1) {
            if (audioFormat.getSampleSizeInBits() == 8) {
                n = 4352;
            } else {
                if (audioFormat.getSampleSizeInBits() != 16) {
                    this.errorMessage("Illegal sample size in method 'setAudioFormat'");
                    return;
                }
                n = 4353;
            }
        } else {
            if (audioFormat.getChannels() != 2) {
                this.errorMessage("Audio data neither mono nor stereo in method 'setAudioFormat'");
                return;
            }
            if (audioFormat.getSampleSizeInBits() == 8) {
                n = 4354;
            } else {
                if (audioFormat.getSampleSizeInBits() != 16) {
                    this.errorMessage("Illegal sample size in method 'setAudioFormat'");
                    return;
                }
                n = 4355;
            }
        }
        this.ALformat = n;
        this.sampleRate = (int)audioFormat.getSampleRate();
    }

    public void setFormat(int n, int n2) {
        this.ALformat = n;
        this.sampleRate = n2;
    }

    public int buffersProcessed() {
        if (this.channelType != 1) {
            return 0;
        }
        int n = AL10.alGetSourcei(this.ALSource.get(0), 4118);
        if (this.checkALError()) {
            return 0;
        }
        return n;
    }

    public void close() {
        try {
            AL10.alSourceStop(this.ALSource.get(0));
            AL10.alGetError();
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (this.channelType == 1) {
            this.flush();
        }
    }

    public void pause() {
        AL10.alSourcePause(this.ALSource.get(0));
        this.checkALError();
    }
}

