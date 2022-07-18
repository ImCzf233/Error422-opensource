/*
 * Decompiled with CFR 0.152.
 */
package paulscode.sound.libraries;

import java.util.LinkedList;
import java.util.List;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.Mixer;
import javax.sound.sampled.SourceDataLine;
import paulscode.sound.Channel;
import paulscode.sound.SoundBuffer;
import paulscode.sound.libraries.LibraryJavaSound;

public class ChannelJavaSound
extends Channel {
    private float initialSampleRate = 0.0f;
    private FloatControl gainControl = null;
    public SourceDataLine sourceDataLine = null;
    private int processed = 0;
    SoundBuffer soundBuffer;
    private boolean toLoop = false;
    private Mixer myMixer = null;
    private FloatControl sampleRateControl = null;
    public Clip clip = null;
    private List streamBuffers;
    private FloatControl panControl = null;
    private AudioFormat myFormat = null;
    private float initialGain = 0.0f;

    public void newMixer(Mixer mixer) {
        if (this.myMixer != mixer) {
            try {
                if (this.clip != null) {
                    this.clip.close();
                } else if (this.sourceDataLine != null) {
                    this.sourceDataLine.close();
                }
            }
            catch (SecurityException securityException) {
                // empty catch block
            }
            this.myMixer = mixer;
            if (this.attachedSource != null) {
                if (this.channelType == 0 && this.soundBuffer != null) {
                    this.attachBuffer(this.soundBuffer);
                } else if (this.myFormat != null) {
                    this.resetStream(this.myFormat);
                }
            }
        }
    }

    public boolean preLoadBuffers(LinkedList linkedList) {
        if (this.errorCheck(this.channelType != 1, "Buffers may only be queued for streaming sources.")) {
            return false;
        }
        if (this.errorCheck(this.sourceDataLine == null, "SourceDataLine null in method 'preLoadBuffers'.")) {
            return false;
        }
        this.sourceDataLine.start();
        if (linkedList.isEmpty()) {
            return true;
        }
        byte[] byArray = (byte[])linkedList.remove(0);
        if (this.errorCheck(byArray == null, "Missing sound-bytes in method 'preLoadBuffers'.")) {
            return false;
        }
        while (!linkedList.isEmpty()) {
            this.streamBuffers.add(new SoundBuffer((byte[])linkedList.remove(0), this.myFormat));
        }
        this.sourceDataLine.write(byArray, 0, byArray.length);
        this.processed = 0;
        return true;
    }

    public boolean playing() {
        switch (this.channelType) {
            case 0: {
                if (this.clip == null) {
                    return false;
                }
                return this.clip.isActive();
            }
            case 1: {
                if (this.sourceDataLine == null) {
                    return false;
                }
                return this.sourceDataLine.isActive();
            }
        }
        return false;
    }

    public float millisecondsPlayed() {
        switch (this.channelType) {
            case 0: {
                if (this.clip == null) {
                    return -1.0f;
                }
                return (float)this.clip.getMicrosecondPosition() / 1000.0f;
            }
            case 1: {
                if (this.sourceDataLine == null) {
                    return -1.0f;
                }
                return (float)this.sourceDataLine.getMicrosecondPosition() / 1000.0f;
            }
        }
        return -1.0f;
    }

    public boolean attachBuffer(SoundBuffer soundBuffer) {
        if (this.errorCheck(this.channelType != 0, "Buffers may only be attached to non-streaming sources")) {
            return false;
        }
        if (this.errorCheck(this.myMixer == null, "Mixer null in method 'attachBuffer'")) {
            return false;
        }
        if (this.errorCheck(soundBuffer == null, "Buffer null in method 'attachBuffer'")) {
            return false;
        }
        if (this.errorCheck(soundBuffer.audioData == null, "Buffer missing audio data in method 'attachBuffer'")) {
            return false;
        }
        if (this.errorCheck(soundBuffer.audioFormat == null, "Buffer missing format information in method 'attachBuffer'")) {
            return false;
        }
        DataLine.Info info = new DataLine.Info(Clip.class, soundBuffer.audioFormat);
        if (this.errorCheck(!AudioSystem.isLineSupported(info), "Line not supported in method 'attachBuffer'")) {
            return false;
        }
        Clip clip = null;
        try {
            clip = (Clip)this.myMixer.getLine(info);
        }
        catch (Exception exception) {
            this.errorMessage("Unable to create clip in method 'attachBuffer'");
            this.printStackTrace(exception);
            return false;
        }
        if (this.errorCheck(clip == null, "New clip null in method 'attachBuffer'")) {
            return false;
        }
        if (this.clip != null) {
            this.clip.stop();
            this.clip.flush();
            this.clip.close();
        }
        this.clip = clip;
        this.soundBuffer = soundBuffer;
        this.myFormat = soundBuffer.audioFormat;
        clip = null;
        try {
            this.clip.open(this.myFormat, soundBuffer.audioData, 0, soundBuffer.audioData.length);
        }
        catch (Exception exception) {
            this.errorMessage("Unable to attach buffer to clip in method 'attachBuffer'");
            this.printStackTrace(exception);
            return false;
        }
        this.resetControls();
        return true;
    }

    public void setPan(float f) {
        if (this.panControl == null) {
            return;
        }
        float f2 = f;
        if (f2 < -1.0f) {
            f2 = -1.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        this.panControl.setValue(f2);
    }

    public void setGain(float f) {
        if (this.gainControl == null) {
            return;
        }
        float f2 = f;
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        double d = this.gainControl.getMinimum();
        double d2 = this.initialGain;
        double d3 = 0.5 * d2 - d;
        double d4 = Math.log(10.0) / 20.0;
        float f3 = (float)(d + 1.0 / d4 * Math.log(1.0 + (Math.exp(d4 * d3) - 1.0) * (double)f2));
        this.gainControl.setValue(f3);
    }

    public boolean queueBuffer(byte[] byArray) {
        if (this.errorCheck(this.channelType != 1, "Buffers may only be queued for streaming sources.")) {
            return false;
        }
        if (this.errorCheck(this.sourceDataLine == null, "SourceDataLine null in method 'queueBuffer'.")) {
            return false;
        }
        if (this.errorCheck(this.myFormat == null, "AudioFormat null in method 'queueBuffer'")) {
            return false;
        }
        this.streamBuffers.add(new SoundBuffer(byArray, this.myFormat));
        this.processBuffer();
        this.processed = 0;
        return true;
    }

    public void cleanup() {
        if (this.streamBuffers != null) {
            SoundBuffer soundBuffer = null;
            while (!this.streamBuffers.isEmpty()) {
                soundBuffer = (SoundBuffer)this.streamBuffers.remove(0);
                soundBuffer.cleanup();
                soundBuffer = null;
            }
            this.streamBuffers.clear();
        }
        this.clip = null;
        this.soundBuffer = null;
        this.sourceDataLine = null;
        this.streamBuffers.clear();
        this.myMixer = null;
        this.myFormat = null;
        this.streamBuffers = null;
        super.cleanup();
    }

    private void resetControls() {
        switch (this.channelType) {
            case 0: {
                try {
                    this.panControl = !this.clip.isControlSupported(FloatControl.Type.PAN) ? null : (FloatControl)this.clip.getControl(FloatControl.Type.PAN);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    this.panControl = null;
                }
                try {
                    if (!this.clip.isControlSupported(FloatControl.Type.MASTER_GAIN)) {
                        this.gainControl = null;
                        this.initialGain = 0.0f;
                    } else {
                        this.gainControl = (FloatControl)this.clip.getControl(FloatControl.Type.MASTER_GAIN);
                        this.initialGain = this.gainControl.getValue();
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    this.gainControl = null;
                    this.initialGain = 0.0f;
                }
                try {
                    if (!this.clip.isControlSupported(FloatControl.Type.SAMPLE_RATE)) {
                        this.sampleRateControl = null;
                        this.initialSampleRate = 0.0f;
                        break;
                    }
                    this.sampleRateControl = (FloatControl)this.clip.getControl(FloatControl.Type.SAMPLE_RATE);
                    this.initialSampleRate = this.sampleRateControl.getValue();
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    this.sampleRateControl = null;
                    this.initialSampleRate = 0.0f;
                }
                break;
            }
            case 1: {
                try {
                    this.panControl = !this.sourceDataLine.isControlSupported(FloatControl.Type.PAN) ? null : (FloatControl)this.sourceDataLine.getControl(FloatControl.Type.PAN);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    this.panControl = null;
                }
                try {
                    if (!this.sourceDataLine.isControlSupported(FloatControl.Type.MASTER_GAIN)) {
                        this.gainControl = null;
                        this.initialGain = 0.0f;
                    } else {
                        this.gainControl = (FloatControl)this.sourceDataLine.getControl(FloatControl.Type.MASTER_GAIN);
                        this.initialGain = this.gainControl.getValue();
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    this.gainControl = null;
                    this.initialGain = 0.0f;
                }
                try {
                    if (!this.sourceDataLine.isControlSupported(FloatControl.Type.SAMPLE_RATE)) {
                        this.sampleRateControl = null;
                        this.initialSampleRate = 0.0f;
                        break;
                    }
                    this.sampleRateControl = (FloatControl)this.sourceDataLine.getControl(FloatControl.Type.SAMPLE_RATE);
                    this.initialSampleRate = this.sampleRateControl.getValue();
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    this.sampleRateControl = null;
                    this.initialSampleRate = 0.0f;
                }
                break;
            }
            default: {
                this.errorMessage("Unrecognized channel type in method 'resetControls'");
                this.panControl = null;
                this.gainControl = null;
                this.sampleRateControl = null;
            }
        }
    }

    public void setLooping(boolean bl) {
        this.toLoop = bl;
    }

    public int buffersProcessed() {
        this.processed = 0;
        if (this.errorCheck(this.channelType != 1, "Buffers may only be queued for streaming sources.")) {
            if (this.streamBuffers != null) {
                this.streamBuffers.clear();
            }
            return 0;
        }
        if (this.sourceDataLine == null) {
            if (this.streamBuffers != null) {
                this.streamBuffers.clear();
            }
            return 0;
        }
        if (this.sourceDataLine.available() > 0) {
            this.processed = 1;
        }
        return this.processed;
    }

    public boolean resetStream(AudioFormat audioFormat) {
        if (this.errorCheck(this.myMixer == null, "Mixer null in method 'resetStream'")) {
            return false;
        }
        if (this.errorCheck(audioFormat == null, "AudioFormat null in method 'resetStream'")) {
            return false;
        }
        DataLine.Info info = new DataLine.Info(SourceDataLine.class, audioFormat);
        if (this.errorCheck(!AudioSystem.isLineSupported(info), "Line not supported in method 'resetStream'")) {
            return false;
        }
        SourceDataLine sourceDataLine = null;
        try {
            sourceDataLine = (SourceDataLine)this.myMixer.getLine(info);
        }
        catch (Exception exception) {
            this.errorMessage("Unable to create a SourceDataLine in method 'resetStream'");
            this.printStackTrace(exception);
            return false;
        }
        if (this.errorCheck(sourceDataLine == null, "New SourceDataLine null in method 'resetStream'")) {
            return false;
        }
        this.streamBuffers.clear();
        this.processed = 0;
        if (this.sourceDataLine != null) {
            this.sourceDataLine.stop();
            this.sourceDataLine.flush();
            this.sourceDataLine.close();
        }
        this.sourceDataLine = sourceDataLine;
        this.myFormat = audioFormat;
        sourceDataLine = null;
        try {
            this.sourceDataLine.open(this.myFormat);
        }
        catch (Exception exception) {
            this.errorMessage("Unable to open the new SourceDataLine in method 'resetStream'");
            this.printStackTrace(exception);
            return false;
        }
        this.resetControls();
        return true;
    }

    public void rewind() {
        switch (this.channelType) {
            case 0: {
                if (this.clip == null) break;
                boolean bl = this.clip.isRunning();
                this.clip.stop();
                this.clip.setFramePosition(0);
                if (!bl) break;
                if (this.toLoop) {
                    this.clip.loop(-1);
                    break;
                }
                this.clip.start();
                break;
            }
            case 1: {
                break;
            }
        }
    }

    public void play() {
        switch (this.channelType) {
            case 0: {
                if (this.clip == null) break;
                if (this.toLoop) {
                    this.clip.stop();
                    this.clip.loop(-1);
                    break;
                }
                this.clip.stop();
                this.clip.start();
                break;
            }
            case 1: {
                if (this.sourceDataLine == null) break;
                this.sourceDataLine.start();
                break;
            }
        }
    }

    public void flush() {
        if (this.channelType != 1) {
            return;
        }
        if (this.errorCheck(this.sourceDataLine == null, "SourceDataLine null in method 'flush'.")) {
            return;
        }
        this.sourceDataLine.stop();
        this.sourceDataLine.flush();
        this.sourceDataLine.drain();
        this.streamBuffers.clear();
        this.processed = 0;
    }

    public void setPitch(float f) {
        if (this.sampleRateControl == null) {
            return;
        }
        float f2 = f;
        if (f2 < 0.5f) {
            f2 = 0.5f;
        }
        if (f2 > 2.0f) {
            f2 = 2.0f;
        }
        this.sampleRateControl.setValue(f2 *= this.initialSampleRate);
    }

    public void setAudioFormat(AudioFormat audioFormat) {
        this.resetStream(audioFormat);
        if (this.attachedSource != null && this.attachedSource.rawDataStream && this.attachedSource.active() && this.sourceDataLine != null) {
            this.sourceDataLine.start();
        }
    }

    public void stop() {
        switch (this.channelType) {
            case 0: {
                if (this.clip == null) break;
                this.clip.stop();
                this.clip.setFramePosition(0);
                break;
            }
            case 1: {
                if (this.sourceDataLine == null) break;
                this.sourceDataLine.stop();
                break;
            }
        }
    }

    public void pause() {
        switch (this.channelType) {
            case 0: {
                if (this.clip == null) break;
                this.clip.stop();
                break;
            }
            case 1: {
                if (this.sourceDataLine == null) break;
                this.sourceDataLine.stop();
                break;
            }
        }
    }

    public int feedRawAudioData(byte[] byArray) {
        if (this.errorCheck(this.channelType != 1, "Raw audio data can only be processed by streaming sources.")) {
            return -1;
        }
        if (this.errorCheck(this.streamBuffers == null, "StreamBuffers queue null in method 'feedRawAudioData'.")) {
            return -1;
        }
        this.streamBuffers.add(new SoundBuffer(byArray, this.myFormat));
        return this.buffersProcessed();
    }

    public void close() {
        switch (this.channelType) {
            case 0: {
                if (this.clip == null) break;
                this.clip.stop();
                this.clip.flush();
                this.clip.close();
                break;
            }
            case 1: {
                if (this.sourceDataLine == null) break;
                this.flush();
                this.sourceDataLine.close();
                break;
            }
        }
    }

    public ChannelJavaSound(int n, Mixer mixer) {
        super(n);
        this.libraryType = LibraryJavaSound.class;
        this.myMixer = mixer;
        this.clip = null;
        this.sourceDataLine = null;
        this.streamBuffers = new LinkedList();
    }

    public boolean processBuffer() {
        if (this.errorCheck(this.channelType != 1, "Buffers are only processed for streaming sources.")) {
            return false;
        }
        if (this.errorCheck(this.sourceDataLine == null, "SourceDataLine null in method 'processBuffer'.")) {
            return false;
        }
        if (this.streamBuffers == null || this.streamBuffers.isEmpty()) {
            return false;
        }
        SoundBuffer soundBuffer = (SoundBuffer)this.streamBuffers.remove(0);
        this.sourceDataLine.write(soundBuffer.audioData, 0, soundBuffer.audioData.length);
        if (!this.sourceDataLine.isActive()) {
            this.sourceDataLine.start();
        }
        soundBuffer.cleanup();
        soundBuffer = null;
        return true;
    }
}

