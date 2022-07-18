/*
 * Decompiled with CFR 0.152.
 */
package paulscode.sound;

import java.net.URL;
import java.util.LinkedList;
import java.util.ListIterator;
import javax.sound.sampled.AudioFormat;
import paulscode.sound.Channel;
import paulscode.sound.FilenameURL;
import paulscode.sound.ICodec;
import paulscode.sound.Library;
import paulscode.sound.SoundBuffer;
import paulscode.sound.SoundSystemConfig;
import paulscode.sound.SoundSystemLogger;
import paulscode.sound.Vector3D;

public class Source {
    protected ICodec nextCodec = null;
    public int attModel = 0;
    public Channel channel = null;
    public boolean toPlay = false;
    protected LinkedList soundSequenceQueue = null;
    protected long lastFadeCheck = 0L;
    private boolean paused = false;
    protected float pitch = 1.0f;
    public AudioFormat rawDataFormat = null;
    public SoundBuffer soundBuffer = null;
    public float sourceVolume = 1.0f;
    private boolean active = true;
    protected ICodec codec = null;
    private boolean stopped = true;
    public boolean toLoop = false;
    public boolean toStream = false;
    protected float fadeInGain = 1.0f;
    protected float fadeOutGain = -1.0f;
    private static final boolean GET;
    protected Class libraryType = Library.class;
    protected long fadeInMilis = 0L;
    protected LinkedList nextBuffers = null;
    private static final boolean SET;
    private static final boolean XXX;
    protected final Object soundSequenceLock = new Object();
    public boolean rawDataStream = false;
    public boolean preLoad = false;
    public float distOrRoll = 0.0f;
    public Vector3D position;
    public float gain = 1.0f;
    public float distanceFromListener = 0.0f;
    public FilenameURL filenameURL = null;
    public String sourcename = "";
    public boolean temporary = false;
    protected long fadeOutMilis = 0L;
    public Vector3D velocity;
    public boolean priority = false;
    private SoundSystemLogger logger = SoundSystemConfig.getLogger();

    public boolean reverseByteOrder() {
        return SoundSystemConfig.reverseByteOrder(this.libraryType);
    }

    public int feedRawAudioData(Channel channel, byte[] byArray) {
        if (!this.active(false, false)) {
            this.toPlay = true;
            return -1;
        }
        if (this.channel != channel) {
            this.channel = channel;
            this.channel.close();
            this.channel.setAudioFormat(this.rawDataFormat);
            this.positionChanged();
        }
        this.stopped(true, false);
        this.paused(true, false);
        return this.channel.feedRawAudioData(byArray);
    }

    public Source(boolean bl, boolean bl2, boolean bl3, String string, FilenameURL filenameURL, SoundBuffer soundBuffer, float f, float f2, float f3, int n, float f4, boolean bl4) {
        this.priority = bl;
        this.toStream = bl2;
        this.toLoop = bl3;
        this.sourcename = string;
        this.filenameURL = filenameURL;
        this.soundBuffer = soundBuffer;
        this.position = new Vector3D(f, f2, f3);
        this.attModel = n;
        this.distOrRoll = f4;
        this.velocity = new Vector3D(0.0f, 0.0f, 0.0f);
        this.temporary = bl4;
        if (bl2 && filenameURL != null) {
            this.codec = SoundSystemConfig.getCodec(filenameURL.getFilename());
        }
    }

    public void setVelocity(float f, float f2, float f3) {
        this.velocity.x = f;
        this.velocity.y = f2;
        this.velocity.z = f3;
    }

    private synchronized boolean active(boolean bl, boolean bl2) {
        if (bl) {
            this.active = bl2;
        }
        return this.active;
    }

    public void setPitch(float f) {
        float f2 = f;
        if (f2 < 0.5f) {
            f2 = 0.5f;
        } else if (f2 > 2.0f) {
            f2 = 2.0f;
        }
        this.pitch = f2;
    }

    protected void importantMessage(String string) {
        this.logger.importantMessage(string, 0);
    }

    public boolean paused() {
        return this.paused(false, false);
    }

    protected void printStackTrace(Exception exception) {
        this.logger.printStackTrace(exception, 1);
    }

    public void setPriority(boolean bl) {
        this.priority = bl;
    }

    public Source(Source source, SoundBuffer soundBuffer) {
        this.priority = source.priority;
        this.toStream = source.toStream;
        this.toLoop = source.toLoop;
        this.sourcename = source.sourcename;
        this.filenameURL = source.filenameURL;
        this.position = source.position.clone();
        this.attModel = source.attModel;
        this.distOrRoll = source.distOrRoll;
        this.velocity = source.velocity.clone();
        this.temporary = source.temporary;
        this.sourceVolume = source.sourceVolume;
        this.rawDataStream = source.rawDataStream;
        this.rawDataFormat = source.rawDataFormat;
        this.soundBuffer = soundBuffer;
        if (this.toStream && this.filenameURL != null) {
            this.codec = SoundSystemConfig.getCodec(this.filenameURL.getFilename());
        }
    }

    public void listenerMoved() {
    }

    public float millisecondsPlayed() {
        if (this.channel == null) {
            return -1.0f;
        }
        return this.channel.millisecondsPlayed();
    }

    public void positionChanged() {
    }

    public void setTemporary(boolean bl) {
        this.temporary = bl;
    }

    public boolean stopped() {
        return this.stopped(false, false);
    }

    public boolean checkFadeOut() {
        if (!this.toStream) {
            return false;
        }
        if (this.fadeOutGain == -1.0f && this.fadeInGain == 1.0f) {
            return false;
        }
        long l = System.currentTimeMillis();
        long l2 = l - this.lastFadeCheck;
        this.lastFadeCheck = l;
        if (this.fadeOutGain >= 0.0f) {
            if (this.fadeOutMilis == 0L) {
                this.fadeOutGain = -1.0f;
                this.fadeInGain = 0.0f;
                if (!this.incrementSoundSequence()) {
                    this.stop();
                }
                this.positionChanged();
                this.preLoad = true;
                return false;
            }
            float f = (float)l2 / (float)this.fadeOutMilis;
            this.fadeOutGain -= f;
            if (this.fadeOutGain <= 0.0f) {
                this.fadeOutGain = -1.0f;
                this.fadeInGain = 0.0f;
                if (!this.incrementSoundSequence()) {
                    this.stop();
                }
                this.positionChanged();
                this.preLoad = true;
                return false;
            }
            this.positionChanged();
            return true;
        }
        if (this.fadeInGain < 1.0f) {
            this.fadeOutGain = -1.0f;
            if (this.fadeInMilis == 0L) {
                this.fadeOutGain = -1.0f;
                this.fadeInGain = 1.0f;
            } else {
                float f = (float)l2 / (float)this.fadeInMilis;
                this.fadeInGain += f;
                if (this.fadeInGain >= 1.0f) {
                    this.fadeOutGain = -1.0f;
                    this.fadeInGain = 1.0f;
                }
            }
            this.positionChanged();
            return true;
        }
        return false;
    }

    public String getClassName() {
        String string = SoundSystemConfig.getLibraryTitle(this.libraryType);
        if (string.equals("No Sound")) {
            return "Source";
        }
        return "Source" + string;
    }

    public void flush() {
        if (this.channel != null) {
            this.channel.flush();
        } else {
            this.errorMessage("Channel null in method 'flush'");
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void queueSound(FilenameURL filenameURL) {
        if (!this.toStream) {
            this.errorMessage("Method 'queueSound' may only be used for streaming and MIDI sources.");
            return;
        }
        if (filenameURL == null) {
            this.errorMessage("File not specified in method 'queueSound'");
            return;
        }
        Object object = this.soundSequenceLock;
        synchronized (object) {
            if (this.soundSequenceQueue == null) {
                this.soundSequenceQueue = new LinkedList();
            }
            this.soundSequenceQueue.add(filenameURL);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void fadeOutIn(FilenameURL filenameURL, long l, long l2) {
        if (!this.toStream) {
            this.errorMessage("Method 'fadeOutIn' may only be used for streaming and MIDI sources.");
            return;
        }
        if (filenameURL == null) {
            this.errorMessage("Filename/URL not specified in method 'fadeOutIn'.");
            return;
        }
        if (l < 0L || l2 < 0L) {
            this.errorMessage("Miliseconds may not be negative in method 'fadeOutIn'.");
            return;
        }
        this.fadeOutMilis = l;
        this.fadeInMilis = l2;
        this.fadeOutGain = 1.0f;
        this.lastFadeCheck = System.currentTimeMillis();
        Object object = this.soundSequenceLock;
        synchronized (object) {
            if (this.soundSequenceQueue == null) {
                this.soundSequenceQueue = new LinkedList();
            }
            this.soundSequenceQueue.clear();
            this.soundSequenceQueue.add(filenameURL);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void dequeueSound(String string) {
        if (!this.toStream) {
            this.errorMessage("Method 'dequeueSound' may only be used for streaming and MIDI sources.");
            return;
        }
        if (string == null || string.equals("")) {
            this.errorMessage("Filename not specified in method 'dequeueSound'");
            return;
        }
        Object object = this.soundSequenceLock;
        synchronized (object) {
            if (this.soundSequenceQueue != null) {
                ListIterator listIterator = this.soundSequenceQueue.listIterator();
                while (listIterator.hasNext()) {
                    if (!((FilenameURL)listIterator.next()).getFilename().equals(string)) continue;
                    listIterator.remove();
                    break;
                }
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void cleanup() {
        if (this.codec != null) {
            this.codec.cleanup();
        }
        Object object = this.soundSequenceLock;
        synchronized (object) {
            if (this.soundSequenceQueue != null) {
                this.soundSequenceQueue.clear();
            }
            this.soundSequenceQueue = null;
        }
        this.sourcename = null;
        this.filenameURL = null;
        this.position = null;
        this.soundBuffer = null;
        this.codec = null;
    }

    public void stop() {
        this.toPlay = false;
        this.stopped(true, true);
        this.paused(true, false);
        if (this.channel != null) {
            this.channel.stop();
        } else {
            this.errorMessage("Channel null in method 'stop'");
        }
    }

    public void cull() {
        if (!this.active(false, false)) {
            return;
        }
        if (this.playing() && this.toLoop) {
            this.toPlay = true;
        }
        if (this.rawDataStream) {
            this.toPlay = true;
        }
        this.active(true, false);
        if (this.channel != null) {
            this.channel.close();
        }
        this.channel = null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean stream() {
        if (this.channel == null) {
            return false;
        }
        if (this.preLoad) {
            if (this.rawDataStream) {
                this.preLoad = false;
            } else {
                return this.preLoad();
            }
        }
        if (this.rawDataStream) {
            if (this.stopped() || this.paused()) {
                return true;
            }
            if (this.channel.buffersProcessed() > 0) {
                this.channel.processBuffer();
            }
            return true;
        }
        if (this.codec == null) {
            return false;
        }
        if (this.stopped()) {
            return false;
        }
        if (this.paused()) {
            return true;
        }
        int n = this.channel.buffersProcessed();
        SoundBuffer soundBuffer = null;
        for (int i = 0; i < n; ++i) {
            soundBuffer = this.codec.read();
            if (soundBuffer != null) {
                if (soundBuffer.audioData != null) {
                    this.channel.queueBuffer(soundBuffer.audioData);
                }
                soundBuffer.cleanup();
                soundBuffer = null;
                return true;
            }
            if (!this.codec.endOfStream()) continue;
            Object object = this.soundSequenceLock;
            synchronized (object) {
                if (SoundSystemConfig.getStreamQueueFormatsMatch()) {
                    if (this.soundSequenceQueue != null && this.soundSequenceQueue.size() > 0) {
                        if (this.codec != null) {
                            this.codec.cleanup();
                        }
                        this.filenameURL = (FilenameURL)this.soundSequenceQueue.remove(0);
                        this.codec = SoundSystemConfig.getCodec(this.filenameURL.getFilename());
                        this.codec.initialize(this.filenameURL.getURL());
                        soundBuffer = this.codec.read();
                        if (soundBuffer != null) {
                            if (soundBuffer.audioData != null) {
                                this.channel.queueBuffer(soundBuffer.audioData);
                            }
                            soundBuffer.cleanup();
                            soundBuffer = null;
                            return true;
                        }
                    } else if (this.toLoop) {
                        this.codec.initialize(this.filenameURL.getURL());
                        soundBuffer = this.codec.read();
                        if (soundBuffer != null) {
                            if (soundBuffer.audioData != null) {
                                this.channel.queueBuffer(soundBuffer.audioData);
                            }
                            soundBuffer.cleanup();
                            soundBuffer = null;
                            return true;
                        }
                    }
                }
                continue;
            }
        }
        return false;
    }

    private synchronized boolean paused(boolean bl, boolean bl2) {
        if (bl) {
            this.paused = bl2;
        }
        return this.paused;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean preLoad() {
        if (this.channel == null) {
            return false;
        }
        if (this.codec == null) {
            return false;
        }
        SoundBuffer soundBuffer = null;
        boolean bl = false;
        Object object = this.soundSequenceLock;
        synchronized (object) {
            if (this.nextBuffers == null || this.nextBuffers.isEmpty()) {
                bl = true;
            }
        }
        if (this.nextCodec != null && !bl) {
            this.codec = this.nextCodec;
            this.nextCodec = null;
            object = this.soundSequenceLock;
            synchronized (object) {
                while (!this.nextBuffers.isEmpty()) {
                    soundBuffer = (SoundBuffer)this.nextBuffers.remove(0);
                    if (soundBuffer == null) continue;
                    if (soundBuffer.audioData != null) {
                        this.channel.queueBuffer(soundBuffer.audioData);
                    }
                    soundBuffer.cleanup();
                    soundBuffer = null;
                }
            }
        } else {
            this.nextCodec = null;
            object = this.filenameURL.getURL();
            this.codec.initialize((URL)object);
            for (int i = 0; i < SoundSystemConfig.getNumberStreamingBuffers(); ++i) {
                soundBuffer = this.codec.read();
                if (soundBuffer == null) continue;
                if (soundBuffer.audioData != null) {
                    this.channel.queueBuffer(soundBuffer.audioData);
                }
                soundBuffer.cleanup();
                soundBuffer = null;
            }
        }
        return true;
    }

    public boolean playing() {
        if (this.channel == null || this.channel.attachedSource != this) {
            return false;
        }
        if (this.paused() || this.stopped()) {
            return false;
        }
        return this.channel.playing();
    }

    protected void message(String string) {
        this.logger.message(string, 0);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean readBuffersFromNextSoundInSequence() {
        if (!this.toStream) {
            this.errorMessage("Method 'readBuffersFromNextSoundInSequence' may only be used for streaming sources.");
            return false;
        }
        Object object = this.soundSequenceLock;
        synchronized (object) {
            if (this.soundSequenceQueue != null && this.soundSequenceQueue.size() > 0) {
                if (this.nextCodec != null) {
                    this.nextCodec.cleanup();
                }
                this.nextCodec = SoundSystemConfig.getCodec(((FilenameURL)this.soundSequenceQueue.get(0)).getFilename());
                this.nextCodec.initialize(((FilenameURL)this.soundSequenceQueue.get(0)).getURL());
                SoundBuffer soundBuffer = null;
                for (int i = 0; i < SoundSystemConfig.getNumberStreamingBuffers() && !this.nextCodec.endOfStream(); ++i) {
                    soundBuffer = this.nextCodec.read();
                    if (soundBuffer == null) continue;
                    if (this.nextBuffers == null) {
                        this.nextBuffers = new LinkedList();
                    }
                    this.nextBuffers.add(soundBuffer);
                }
                return true;
            }
        }
        return false;
    }

    private synchronized boolean stopped(boolean bl, boolean bl2) {
        if (bl) {
            this.stopped = bl2;
        }
        return this.stopped;
    }

    public void setDistOrRoll(float f) {
        this.distOrRoll = f;
    }

    public Source(AudioFormat audioFormat, boolean bl, String string, float f, float f2, float f3, int n, float f4) {
        this.priority = bl;
        this.toStream = true;
        this.toLoop = false;
        this.sourcename = string;
        this.filenameURL = null;
        this.soundBuffer = null;
        this.position = new Vector3D(f, f2, f3);
        this.attModel = n;
        this.distOrRoll = f4;
        this.velocity = new Vector3D(0.0f, 0.0f, 0.0f);
        this.temporary = false;
        this.rawDataStream = true;
        this.rawDataFormat = audioFormat;
    }

    public void setLooping(boolean bl) {
        this.toLoop = bl;
    }

    public int getSoundSequenceQueueSize() {
        if (this.soundSequenceQueue == null) {
            return 0;
        }
        return this.soundSequenceQueue.size();
    }

    protected boolean errorCheck(boolean bl, String string) {
        return this.logger.errorCheck(bl, this.getClassName(), string, 0);
    }

    public void changeSource(boolean bl, boolean bl2, boolean bl3, String string, FilenameURL filenameURL, SoundBuffer soundBuffer, float f, float f2, float f3, int n, float f4, boolean bl4) {
        this.priority = bl;
        this.toStream = bl2;
        this.toLoop = bl3;
        this.sourcename = string;
        this.filenameURL = filenameURL;
        this.soundBuffer = soundBuffer;
        this.position.x = f;
        this.position.y = f2;
        this.position.z = f3;
        this.attModel = n;
        this.distOrRoll = f4;
        this.temporary = bl4;
    }

    public void pause() {
        this.toPlay = false;
        this.paused(true, true);
        if (this.channel != null) {
            this.channel.pause();
        } else {
            this.errorMessage("Channel null in method 'pause'");
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean incrementSoundSequence() {
        if (!this.toStream) {
            this.errorMessage("Method 'incrementSoundSequence' may only be used for streaming and MIDI sources.");
            return false;
        }
        Object object = this.soundSequenceLock;
        synchronized (object) {
            if (this.soundSequenceQueue != null && this.soundSequenceQueue.size() > 0) {
                this.filenameURL = (FilenameURL)this.soundSequenceQueue.remove(0);
                if (this.codec != null) {
                    this.codec.cleanup();
                }
                this.codec = SoundSystemConfig.getCodec(this.filenameURL.getFilename());
                return true;
            }
        }
        return false;
    }

    public void setPosition(float f, float f2, float f3) {
        this.position.x = f;
        this.position.y = f2;
        this.position.z = f3;
    }

    public void play(Channel channel) {
        if (!this.active(false, false)) {
            if (this.toLoop) {
                this.toPlay = true;
            }
            return;
        }
        if (this.channel != channel) {
            this.channel = channel;
            this.channel.close();
        }
        this.stopped(true, false);
        this.paused(true, false);
    }

    public boolean active() {
        return this.active(false, false);
    }

    protected void errorMessage(String string) {
        this.logger.errorMessage(this.getClassName(), string, 0);
    }

    public float getPitch() {
        return this.pitch;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void fadeOut(FilenameURL filenameURL, long l) {
        if (!this.toStream) {
            this.errorMessage("Method 'fadeOut' may only be used for streaming and MIDI sources.");
            return;
        }
        if (l < 0L) {
            this.errorMessage("Miliseconds may not be negative in method 'fadeOut'.");
            return;
        }
        this.fadeOutMilis = l;
        this.fadeInMilis = 0L;
        this.fadeOutGain = 1.0f;
        this.lastFadeCheck = System.currentTimeMillis();
        Object object = this.soundSequenceLock;
        synchronized (object) {
            if (this.soundSequenceQueue != null) {
                this.soundSequenceQueue.clear();
            }
            if (filenameURL != null) {
                if (this.soundSequenceQueue == null) {
                    this.soundSequenceQueue = new LinkedList();
                }
                this.soundSequenceQueue.add(filenameURL);
            }
        }
    }

    static {
        XXX = false;
        GET = false;
        SET = true;
    }

    public float getDistanceFromListener() {
        return this.distanceFromListener;
    }

    public void rewind() {
        if (this.paused(false, false)) {
            this.stop();
        }
        if (this.channel != null) {
            boolean bl = this.playing();
            this.channel.rewind();
            if (this.toStream && bl) {
                this.stop();
                this.play(this.channel);
            }
        } else {
            this.errorMessage("Channel null in method 'rewind'");
        }
    }

    public void setAttenuation(int n) {
        this.attModel = n;
    }

    public void activate() {
        this.active(true, true);
    }
}

