/*
 * Decompiled with CFR 0.152.
 */
package paulscode.sound.libraries;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.LinkedList;
import javax.sound.sampled.AudioFormat;
import org.lwjgl.BufferUtils;
import org.lwjgl.openal.AL10;
import paulscode.sound.Channel;
import paulscode.sound.FilenameURL;
import paulscode.sound.SoundBuffer;
import paulscode.sound.SoundSystemConfig;
import paulscode.sound.Source;
import paulscode.sound.libraries.ChannelLWJGLOpenAL;
import paulscode.sound.libraries.LibraryLWJGLOpenAL;

public class SourceLWJGLOpenAL
extends Source {
    private FloatBuffer sourceVelocity;
    private IntBuffer myBuffer;
    private FloatBuffer sourcePosition;
    private ChannelLWJGLOpenAL channelOpenAL;
    private FloatBuffer listenerPosition;

    public SourceLWJGLOpenAL(FloatBuffer floatBuffer, AudioFormat audioFormat, boolean bl, String string, float f, float f2, float f3, int n, float f4) {
        super(audioFormat, bl, string, f, f2, f3, n, f4);
        this.channelOpenAL = (ChannelLWJGLOpenAL)this.channel;
        this.listenerPosition = floatBuffer;
        this.libraryType = LibraryLWJGLOpenAL.class;
        this.pitch = 1.0f;
        this.resetALInformation();
    }

    public SourceLWJGLOpenAL(FloatBuffer floatBuffer, IntBuffer intBuffer, Source source, SoundBuffer soundBuffer) {
        super(source, soundBuffer);
        this.channelOpenAL = (ChannelLWJGLOpenAL)this.channel;
        if (this.codec != null) {
            this.codec.reverseByteOrder(true);
        }
        this.listenerPosition = floatBuffer;
        this.myBuffer = intBuffer;
        this.libraryType = LibraryLWJGLOpenAL.class;
        this.pitch = 1.0f;
        this.resetALInformation();
    }

    public void setDistOrRoll(float f) {
        super.setDistOrRoll(f);
        if (this.channel != null && this.channel.attachedSource == this && this.channelOpenAL != null && this.channelOpenAL.ALSource != null) {
            if (this.attModel == 1) {
                AL10.alSourcef(this.channelOpenAL.ALSource.get(0), 4129, f);
            } else {
                AL10.alSourcef(this.channelOpenAL.ALSource.get(0), 4129, 0.0f);
            }
            this.checkALError();
        }
    }

    private void resetALInformation() {
        this.sourcePosition = BufferUtils.createFloatBuffer(3).put(new float[]{this.position.x, this.position.y, this.position.z});
        this.sourceVelocity = BufferUtils.createFloatBuffer(3).put(new float[]{this.velocity.x, this.velocity.y, this.velocity.z});
        this.sourcePosition.flip();
        this.sourceVelocity.flip();
        this.positionChanged();
    }

    public void setAttenuation(int n) {
        super.setAttenuation(n);
        if (this.channel != null && this.channel.attachedSource == this && this.channelOpenAL != null && this.channelOpenAL.ALSource != null) {
            if (n == 1) {
                AL10.alSourcef(this.channelOpenAL.ALSource.get(0), 4129, this.distOrRoll);
            } else {
                AL10.alSourcef(this.channelOpenAL.ALSource.get(0), 4129, 0.0f);
            }
            this.checkALError();
        }
    }

    public boolean preLoad() {
        if (this.codec == null) {
            return false;
        }
        this.codec.initialize(this.filenameURL.getURL());
        LinkedList<byte[]> linkedList = new LinkedList<byte[]>();
        for (int i = 0; i < SoundSystemConfig.getNumberStreamingBuffers(); ++i) {
            this.soundBuffer = this.codec.read();
            if (this.soundBuffer == null || this.soundBuffer.audioData == null) break;
            linkedList.add(this.soundBuffer.audioData);
        }
        this.positionChanged();
        this.channel.preLoadBuffers(linkedList);
        this.preLoad = false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
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
        super.play(channel);
        this.channelOpenAL = (ChannelLWJGLOpenAL)this.channel;
        if (bl) {
            this.setPosition(this.position.x, this.position.y, this.position.z);
            this.checkPitch();
            if (this.channelOpenAL != null && this.channelOpenAL.ALSource != null) {
                if (LibraryLWJGLOpenAL.alPitchSupported()) {
                    AL10.alSourcef(this.channelOpenAL.ALSource.get(0), 4099, this.pitch);
                    this.checkALError();
                }
                AL10.alSource(this.channelOpenAL.ALSource.get(0), 4100, this.sourcePosition);
                this.checkALError();
                AL10.alSource(this.channelOpenAL.ALSource.get(0), 4102, this.sourceVelocity);
                this.checkALError();
                if (this.attModel == 1) {
                    AL10.alSourcef(this.channelOpenAL.ALSource.get(0), 4129, this.distOrRoll);
                } else {
                    AL10.alSourcef(this.channelOpenAL.ALSource.get(0), 4129, 0.0f);
                }
                this.checkALError();
                if (this.toLoop && !this.toStream) {
                    AL10.alSourcei(this.channelOpenAL.ALSource.get(0), 4103, 1);
                } else {
                    AL10.alSourcei(this.channelOpenAL.ALSource.get(0), 4103, 0);
                }
                this.checkALError();
            }
            if (!this.toStream) {
                if (this.myBuffer == null) {
                    this.errorMessage("No sound buffer to play");
                    return;
                }
                this.channelOpenAL.attachBuffer(this.myBuffer);
            }
        }
        if (!this.playing()) {
            if (this.toStream && !bl3) {
                AudioFormat audioFormat;
                if (this.codec == null) {
                    this.errorMessage("Decoder null in method 'play'");
                    return;
                }
                if (this.codec.getAudioFormat() == null) {
                    this.codec.initialize(this.filenameURL.getURL());
                }
                if ((audioFormat = this.codec.getAudioFormat()) == null) {
                    this.errorMessage("Audio Format null in method 'play'");
                    return;
                }
                int n = 0;
                if (audioFormat.getChannels() == 1) {
                    if (audioFormat.getSampleSizeInBits() == 8) {
                        n = 4352;
                    } else {
                        if (audioFormat.getSampleSizeInBits() != 16) {
                            this.errorMessage("Illegal sample size in method 'play'");
                            return;
                        }
                        n = 4353;
                    }
                } else {
                    if (audioFormat.getChannels() != 2) {
                        this.errorMessage("Audio data neither mono nor stereo in method 'play'");
                        return;
                    }
                    if (audioFormat.getSampleSizeInBits() == 8) {
                        n = 4354;
                    } else {
                        if (audioFormat.getSampleSizeInBits() != 16) {
                            this.errorMessage("Illegal sample size in method 'play'");
                            return;
                        }
                        n = 4355;
                    }
                }
                this.channelOpenAL.setFormat(n, (int)audioFormat.getSampleRate());
                this.preLoad = true;
            }
            this.channel.play();
            if (this.pitch != 1.0f) {
                this.checkPitch();
            }
        }
    }

    public SourceLWJGLOpenAL(FloatBuffer floatBuffer, IntBuffer intBuffer, boolean bl, boolean bl2, boolean bl3, String string, FilenameURL filenameURL, SoundBuffer soundBuffer, float f, float f2, float f3, int n, float f4, boolean bl4) {
        super(bl, bl2, bl3, string, filenameURL, soundBuffer, f, f2, f3, n, f4, bl4);
        this.channelOpenAL = (ChannelLWJGLOpenAL)this.channel;
        if (this.codec != null) {
            this.codec.reverseByteOrder(true);
        }
        this.listenerPosition = floatBuffer;
        this.myBuffer = intBuffer;
        this.libraryType = LibraryLWJGLOpenAL.class;
        this.pitch = 1.0f;
        this.resetALInformation();
    }

    private void calculateDistance() {
        if (this.listenerPosition != null) {
            double d = this.position.x - this.listenerPosition.get(0);
            double d2 = this.position.y - this.listenerPosition.get(1);
            double d3 = this.position.z - this.listenerPosition.get(2);
            this.distanceFromListener = (float)Math.sqrt(d * d + d2 * d2 + d3 * d3);
        }
    }

    private void calculateGain() {
        if (this.attModel == 2) {
            this.gain = this.distanceFromListener <= 0.0f ? 1.0f : (this.distanceFromListener >= this.distOrRoll ? 0.0f : 1.0f - this.distanceFromListener / this.distOrRoll);
            if (this.gain > 1.0f) {
                this.gain = 1.0f;
            }
            if (this.gain < 0.0f) {
                this.gain = 0.0f;
            }
        } else {
            this.gain = 1.0f;
        }
    }

    public void cleanup() {
        super.cleanup();
    }

    public void changeSource(FloatBuffer floatBuffer, IntBuffer intBuffer, boolean bl, boolean bl2, boolean bl3, String string, FilenameURL filenameURL, SoundBuffer soundBuffer, float f, float f2, float f3, int n, float f4, boolean bl4) {
        super.changeSource(bl, bl2, bl3, string, filenameURL, soundBuffer, f, f2, f3, n, f4, bl4);
        this.listenerPosition = floatBuffer;
        this.myBuffer = intBuffer;
        this.pitch = 1.0f;
        this.resetALInformation();
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

    public void positionChanged() {
        this.calculateDistance();
        this.calculateGain();
        if (this.channel != null && this.channel.attachedSource == this && this.channelOpenAL != null && this.channelOpenAL.ALSource != null) {
            AL10.alSourcef(this.channelOpenAL.ALSource.get(0), 4106, this.gain * this.sourceVolume * Math.abs(this.fadeOutGain) * this.fadeInGain);
            this.checkALError();
        }
        this.checkPitch();
    }

    private void checkPitch() {
        if (this.channel != null && this.channel.attachedSource == this && LibraryLWJGLOpenAL.alPitchSupported() && this.channelOpenAL != null && this.channelOpenAL.ALSource != null) {
            AL10.alSourcef(this.channelOpenAL.ALSource.get(0), 4099, this.pitch);
            this.checkALError();
        }
    }

    public void listenerMoved() {
        this.positionChanged();
    }

    public void setPitch(float f) {
        super.setPitch(f);
        this.checkPitch();
    }

    public void setPosition(float f, float f2, float f3) {
        super.setPosition(f, f2, f3);
        if (this.sourcePosition == null) {
            this.resetALInformation();
        } else {
            this.positionChanged();
        }
        this.sourcePosition.put(0, f);
        this.sourcePosition.put(1, f2);
        this.sourcePosition.put(2, f3);
        if (this.channel != null && this.channel.attachedSource == this && this.channelOpenAL != null && this.channelOpenAL.ALSource != null) {
            AL10.alSource(this.channelOpenAL.ALSource.get(0), 4100, this.sourcePosition);
            this.checkALError();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean incrementSoundSequence() {
        if (!this.toStream) {
            this.errorMessage("Method 'incrementSoundSequence' may only be used for streaming sources.");
            return false;
        }
        Object object = this.soundSequenceLock;
        synchronized (object) {
            AudioFormat audioFormat;
            if (this.soundSequenceQueue == null) return false;
            if (this.soundSequenceQueue.size() <= 0) return false;
            this.filenameURL = (FilenameURL)this.soundSequenceQueue.remove(0);
            if (this.codec != null) {
                this.codec.cleanup();
            }
            this.codec = SoundSystemConfig.getCodec(this.filenameURL.getFilename());
            if (this.codec == null) return true;
            this.codec.reverseByteOrder(true);
            if (this.codec.getAudioFormat() == null) {
                this.codec.initialize(this.filenameURL.getURL());
            }
            if ((audioFormat = this.codec.getAudioFormat()) == null) {
                this.errorMessage("Audio Format null in method 'incrementSoundSequence'");
                return false;
            }
            int n = 0;
            if (audioFormat.getChannels() == 1) {
                if (audioFormat.getSampleSizeInBits() == 8) {
                    n = 4352;
                } else {
                    if (audioFormat.getSampleSizeInBits() != 16) {
                        this.errorMessage("Illegal sample size in method 'incrementSoundSequence'");
                        return false;
                    }
                    n = 4353;
                }
            } else {
                if (audioFormat.getChannels() != 2) {
                    this.errorMessage("Audio data neither mono nor stereo in method 'incrementSoundSequence'");
                    return false;
                }
                if (audioFormat.getSampleSizeInBits() == 8) {
                    n = 4354;
                } else {
                    if (audioFormat.getSampleSizeInBits() != 16) {
                        this.errorMessage("Illegal sample size in method 'incrementSoundSequence'");
                        return false;
                    }
                    n = 4355;
                }
            }
            this.channelOpenAL.setFormat(n, (int)audioFormat.getSampleRate());
            this.preLoad = true;
            return true;
        }
    }

    public void setLooping(boolean bl) {
        super.setLooping(bl);
        if (this.channel != null && this.channel.attachedSource == this && this.channelOpenAL != null && this.channelOpenAL.ALSource != null) {
            if (bl) {
                AL10.alSourcei(this.channelOpenAL.ALSource.get(0), 4103, 1);
            } else {
                AL10.alSourcei(this.channelOpenAL.ALSource.get(0), 4103, 0);
            }
            this.checkALError();
        }
    }

    public void setVelocity(float f, float f2, float f3) {
        super.setVelocity(f, f2, f3);
        this.sourceVelocity = BufferUtils.createFloatBuffer(3).put(new float[]{f, f2, f3});
        this.sourceVelocity.flip();
        if (this.channel != null && this.channel.attachedSource == this && this.channelOpenAL != null && this.channelOpenAL.ALSource != null) {
            AL10.alSource(this.channelOpenAL.ALSource.get(0), 4102, this.sourceVelocity);
            this.checkALError();
        }
    }
}

