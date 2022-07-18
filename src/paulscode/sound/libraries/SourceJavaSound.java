/*
 * Decompiled with CFR 0.152.
 */
package paulscode.sound.libraries;

import java.util.LinkedList;
import javax.sound.sampled.AudioFormat;
import paulscode.sound.Channel;
import paulscode.sound.FilenameURL;
import paulscode.sound.ListenerData;
import paulscode.sound.SoundBuffer;
import paulscode.sound.SoundSystemConfig;
import paulscode.sound.Source;
import paulscode.sound.Vector3D;
import paulscode.sound.libraries.ChannelJavaSound;
import paulscode.sound.libraries.LibraryJavaSound;

public class SourceJavaSound
extends Source {
    protected ChannelJavaSound channelJavaSound;
    private float pan;
    public ListenerData listener;

    public void calculateGain() {
        float f = this.position.x - this.listener.position.x;
        float f2 = this.position.y - this.listener.position.y;
        float f3 = this.position.z - this.listener.position.z;
        this.distanceFromListener = (float)Math.sqrt(f * f + f2 * f2 + f3 * f3);
        switch (this.attModel) {
            case 2: {
                if (this.distanceFromListener <= 0.0f) {
                    this.gain = 1.0f;
                    break;
                }
                if (this.distanceFromListener >= this.distOrRoll) {
                    this.gain = 0.0f;
                    break;
                }
                this.gain = 1.0f - this.distanceFromListener / this.distOrRoll;
                break;
            }
            case 1: {
                if (this.distanceFromListener <= 0.0f) {
                    this.gain = 1.0f;
                    break;
                }
                float f4 = 5.0E-4f;
                float f5 = this.distOrRoll * this.distanceFromListener * this.distanceFromListener * f4;
                if (f5 < 0.0f) {
                    f5 = 0.0f;
                }
                this.gain = 1.0f / (1.0f + f5);
                break;
            }
            default: {
                this.gain = 1.0f;
            }
        }
        if (this.gain > 1.0f) {
            this.gain = 1.0f;
        }
        if (this.gain < 0.0f) {
            this.gain = 0.0f;
        }
        this.gain *= this.sourceVolume * SoundSystemConfig.getMasterGain() * Math.abs(this.fadeOutGain) * this.fadeInGain;
        if (this.channel != null && this.channel.attachedSource == this && this.channelJavaSound != null) {
            this.channelJavaSound.setGain(this.gain);
        }
    }

    public void changeSource(boolean bl, boolean bl2, boolean bl3, String string, FilenameURL filenameURL, SoundBuffer soundBuffer, float f, float f2, float f3, int n, float f4, boolean bl4) {
        super.changeSource(bl, bl2, bl3, string, filenameURL, soundBuffer, f, f2, f3, n, f4, bl4);
        if (this.channelJavaSound != null) {
            this.channelJavaSound.setLooping(bl3);
        }
        this.positionChanged();
    }

    public void play(Channel channel) {
        boolean bl;
        if (!this.active()) {
            if (this.toLoop) {
                this.toPlay = true;
            }
            return;
        }
        if (channel == null) {
            this.errorMessage("Unable to play source, because channel was null");
            return;
        }
        boolean bl2 = bl = this.channel != channel;
        if (this.channel != null && this.channel.attachedSource != this) {
            bl = true;
        }
        boolean bl3 = this.paused();
        boolean bl4 = this.stopped();
        super.play(channel);
        this.channelJavaSound = (ChannelJavaSound)this.channel;
        if (bl) {
            if (this.channelJavaSound != null) {
                this.channelJavaSound.setLooping(this.toLoop);
            }
            if (!this.toStream) {
                if (this.soundBuffer == null) {
                    this.errorMessage("No sound buffer to play");
                    return;
                }
                this.channelJavaSound.attachBuffer(this.soundBuffer);
            }
        }
        this.positionChanged();
        if (bl4 || !this.playing()) {
            if (this.toStream && !bl3) {
                this.preLoad = true;
            }
            this.channel.play();
        }
    }

    public void setDistOrRoll(float f) {
        super.setDistOrRoll(f);
        this.calculateGain();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean preLoad() {
        if (this.codec == null) {
            return false;
        }
        boolean bl = false;
        synchronized (this.soundSequenceLock) {
            if (this.nextBuffers == null || this.nextBuffers.isEmpty()) {
                bl = true;
            }
        }
        LinkedList<byte[]> linkedList = new LinkedList<byte[]>();
        if (this.nextCodec != null && !bl) {
            this.codec = this.nextCodec;
            this.nextCodec = null;
            Object object = this.soundSequenceLock;
            synchronized (object) {
                while (!this.nextBuffers.isEmpty()) {
                    this.soundBuffer = (SoundBuffer)this.nextBuffers.remove(0);
                    if (this.soundBuffer == null || this.soundBuffer.audioData == null) continue;
                    linkedList.add(this.soundBuffer.audioData);
                }
            }
        } else {
            this.codec.initialize(this.filenameURL.getURL());
            for (int i = 0; i < SoundSystemConfig.getNumberStreamingBuffers(); ++i) {
                this.soundBuffer = this.codec.read();
                if (this.soundBuffer == null || this.soundBuffer.audioData == null) break;
                linkedList.add(this.soundBuffer.audioData);
            }
            this.channelJavaSound.resetStream(this.codec.getAudioFormat());
        }
        this.positionChanged();
        this.channel.preLoadBuffers(linkedList);
        this.preLoad = false;
        return true;
    }

    public void cleanup() {
        super.cleanup();
    }

    public void setAttenuation(int n) {
        super.setAttenuation(n);
        this.calculateGain();
    }

    public void calculatePan() {
        Vector3D vector3D = this.listener.up.cross(this.listener.lookAt);
        vector3D.normalize();
        float f = this.position.dot(this.position.subtract(this.listener.position), vector3D);
        float f2 = this.position.dot(this.position.subtract(this.listener.position), this.listener.lookAt);
        vector3D = null;
        float f3 = (float)Math.atan2(f, f2);
        this.pan = (float)(-Math.sin(f3));
        if (this.channel != null && this.channel.attachedSource == this && this.channelJavaSound != null) {
            if (this.attModel == 0) {
                this.channelJavaSound.setPan(0.0f);
            } else {
                this.channelJavaSound.setPan(this.pan);
            }
        }
    }

    public void setPitch(float f) {
        super.setPitch(f);
        this.calculatePitch();
    }

    public void positionChanged() {
        this.calculateGain();
        this.calculatePan();
        this.calculatePitch();
    }

    public SourceJavaSound(ListenerData listenerData, Source source, SoundBuffer soundBuffer) {
        super(source, soundBuffer);
        this.channelJavaSound = (ChannelJavaSound)this.channel;
        this.pan = 0.0f;
        this.libraryType = LibraryJavaSound.class;
        this.listener = listenerData;
        this.positionChanged();
    }

    public void setPosition(float f, float f2, float f3) {
        super.setPosition(f, f2, f3);
        this.positionChanged();
    }

    public void setVelocity(float f, float f2, float f3) {
        super.setVelocity(f, f2, f3);
        this.positionChanged();
    }

    public SourceJavaSound(ListenerData listenerData, boolean bl, boolean bl2, boolean bl3, String string, FilenameURL filenameURL, SoundBuffer soundBuffer, float f, float f2, float f3, int n, float f4, boolean bl4) {
        super(bl, bl2, bl3, string, filenameURL, soundBuffer, f, f2, f3, n, f4, bl4);
        this.channelJavaSound = (ChannelJavaSound)this.channel;
        this.pan = 0.0f;
        this.libraryType = LibraryJavaSound.class;
        this.listener = listenerData;
        this.positionChanged();
    }

    public SourceJavaSound(ListenerData listenerData, AudioFormat audioFormat, boolean bl, String string, float f, float f2, float f3, int n, float f4) {
        super(audioFormat, bl, string, f, f2, f3, n, f4);
        this.channelJavaSound = (ChannelJavaSound)this.channel;
        this.pan = 0.0f;
        this.libraryType = LibraryJavaSound.class;
        this.listener = listenerData;
        this.positionChanged();
    }

    public float min(float f, float f2) {
        if (f < f2) {
            return f;
        }
        return f2;
    }

    public void calculatePitch() {
        if (this.channel != null && this.channel.attachedSource == this && this.channelJavaSound != null) {
            if (SoundSystemConfig.getDopplerFactor() == 0.0f) {
                this.channelJavaSound.setPitch(this.pitch);
            } else {
                float f = 343.3f;
                Vector3D vector3D = this.velocity;
                Vector3D vector3D2 = this.listener.velocity;
                float f2 = SoundSystemConfig.getDopplerVelocity();
                float f3 = SoundSystemConfig.getDopplerFactor();
                Vector3D vector3D3 = this.listener.position.subtract(this.position);
                float f4 = vector3D3.dot(vector3D2) / vector3D3.length();
                float f5 = vector3D3.dot(vector3D) / vector3D3.length();
                f5 = this.min(f5, f / f3);
                float f6 = this.pitch * (f * f2 - f3 * (f4 = this.min(f4, f / f3))) / (f * f2 - f3 * f5);
                if (f6 < 0.5f) {
                    f6 = 0.5f;
                } else if (f6 > 2.0f) {
                    f6 = 2.0f;
                }
                this.channelJavaSound.setPitch(f6);
            }
        }
    }

    public void listenerMoved() {
        this.positionChanged();
    }
}

