/*
 * Decompiled with CFR 0.152.
 */
package paulscode.sound;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import javax.sound.sampled.AudioFormat;
import paulscode.sound.Channel;
import paulscode.sound.FilenameURL;
import paulscode.sound.ListenerData;
import paulscode.sound.MidiChannel;
import paulscode.sound.SoundBuffer;
import paulscode.sound.SoundSystemConfig;
import paulscode.sound.SoundSystemLogger;
import paulscode.sound.Source;
import paulscode.sound.StreamThread;
import paulscode.sound.libraries.LibraryLWJGLOpenAL$Exception;

public class Library {
    protected ListenerData listener;
    protected boolean reverseByteOrder = false;
    protected List normalChannels;
    private SoundSystemLogger logger = SoundSystemConfig.getLogger();
    private String[] normalChannelSourceNames;
    private int nextNormalChannel = 0;
    private int nextStreamingChannel = 0;
    protected HashMap bufferMap = new HashMap();
    private MidiChannel midiChannel;
    protected List streamingChannels;
    protected HashMap sourceMap = new HashMap();
    private String[] streamingChannelSourceNames;
    protected StreamThread streamThread;

    public void cleanup() {
        this.streamThread.kill();
        this.streamThread.interrupt();
        for (int i = 0; i < 50 && this.streamThread.alive(); ++i) {
            try {
                Thread.sleep(100L);
                continue;
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        if (this.streamThread.alive()) {
            this.errorMessage("Stream thread did not die!");
            this.message("Ignoring errors... continuing clean-up.");
        }
        if (this.midiChannel != null) {
            this.midiChannel.cleanup();
            this.midiChannel = null;
        }
        Channel channel = null;
        if (this.streamingChannels != null) {
            while (!this.streamingChannels.isEmpty()) {
                channel = (Channel)this.streamingChannels.remove(0);
                channel.close();
                channel.cleanup();
                channel = null;
            }
            this.streamingChannels.clear();
            this.streamingChannels = null;
        }
        if (this.normalChannels != null) {
            while (!this.normalChannels.isEmpty()) {
                channel = (Channel)this.normalChannels.remove(0);
                channel.close();
                channel.cleanup();
                channel = null;
            }
            this.normalChannels.clear();
            this.normalChannels = null;
        }
        Set set = this.sourceMap.keySet();
        for (Object obj : set) {String string = (String) obj;
            Source source = (Source)this.sourceMap.get(string);
            if (source == null) continue;
            source.cleanup();
        }
        this.sourceMap.clear();
        this.sourceMap = null;
        this.listener = null;
        this.streamThread = null;
    }

    public void setDistOrRoll(String string, float f) {
        Source source = (Source)this.sourceMap.get(string);
        if (source != null) {
            source.setDistOrRoll(f);
        }
    }

    private Channel getNextChannel(Source source) {
        Source source2;
        String string;
        int n;
        String[] stringArray;
        List list;
        int n2;
        if (source == null) {
            return null;
        }
        String string2 = source.sourcename;
        if (string2 == null) {
            return null;
        }
        if (source.toStream) {
            n2 = this.nextStreamingChannel;
            list = this.streamingChannels;
            stringArray = this.streamingChannelSourceNames;
        } else {
            n2 = this.nextNormalChannel;
            list = this.normalChannels;
            stringArray = this.normalChannelSourceNames;
        }
        int n3 = list.size();
        for (n = 0; n < n3; ++n) {
            if (!string2.equals(stringArray[n])) continue;
            return (Channel)list.get(n);
        }
        int n4 = n2;
        for (n = 0; n < n3; ++n) {
            string = stringArray[n4];
            source2 = string == null ? null : (Source)this.sourceMap.get(string);
            if (source2 == null || !source2.playing()) {
                if (source.toStream) {
                    this.nextStreamingChannel = n4 + 1;
                    if (this.nextStreamingChannel >= n3) {
                        this.nextStreamingChannel = 0;
                    }
                } else {
                    this.nextNormalChannel = n4 + 1;
                    if (this.nextNormalChannel >= n3) {
                        this.nextNormalChannel = 0;
                    }
                }
                stringArray[n4] = string2;
                return (Channel)list.get(n4);
            }
            if (++n4 < n3) continue;
            n4 = 0;
        }
        n4 = n2;
        for (n = 0; n < n3; ++n) {
            string = stringArray[n4];
            source2 = string == null ? null : (Source)this.sourceMap.get(string);
            if (source2 == null || !source2.playing() || !source2.priority) {
                if (source.toStream) {
                    this.nextStreamingChannel = n4 + 1;
                    if (this.nextStreamingChannel >= n3) {
                        this.nextStreamingChannel = 0;
                    }
                } else {
                    this.nextNormalChannel = n4 + 1;
                    if (this.nextNormalChannel >= n3) {
                        this.nextNormalChannel = 0;
                    }
                }
                stringArray[n4] = string2;
                return (Channel)list.get(n4);
            }
            if (++n4 < n3) continue;
            n4 = 0;
        }
        return null;
    }

    public void activate(String string) {
        Source source = (Source)this.sourceMap.get(string);
        if (source != null) {
            source.activate();
            if (source.toPlay) {
                this.play(source);
            }
        }
    }

    public boolean loadSound(SoundBuffer soundBuffer, String string) {
        return true;
    }

    public void unloadMidi() {
        if (this.midiChannel != null) {
            this.midiChannel.cleanup();
        }
        this.midiChannel = null;
    }

    public void replaySources() {
        Set set = this.sourceMap.keySet();
        for (Object obj : set) {String string = (String) obj;
            Source source = (Source)this.sourceMap.get(string);
            if (source == null || !source.toPlay || source.playing()) continue;
            this.play(string);
            source.toPlay = false;
        }
    }

    public boolean midiSourcename(String string) {
        if (this.midiChannel == null || string == null) {
            return false;
        }
        if (this.midiChannel.getSourcename() == null || string.equals("")) {
            return false;
        }
        return string.equals(this.midiChannel.getSourcename());
    }

    public void removeSource(String string) {
        Source source = (Source)this.sourceMap.get(string);
        if (source != null) {
            source.cleanup();
        }
        this.sourceMap.remove(string);
    }

    public void stop(String string) {
        if (string == null || string.equals("")) {
            this.errorMessage("Sourcename not specified in method 'stop'");
            return;
        }
        if (this.midiSourcename(string)) {
            this.midiChannel.stop();
        } else {
            Source source = (Source)this.sourceMap.get(string);
            if (source != null) {
                source.stop();
            }
        }
    }

    public void dopplerChanged() {
    }

    public void setPosition(String string, float f, float f2, float f3) {
        Source source = (Source)this.sourceMap.get(string);
        if (source != null) {
            source.setPosition(f, f2, f3);
        }
    }

    public boolean loadSound(FilenameURL filenameURL) {
        return true;
    }

    public void loadMidi(boolean bl, String string, FilenameURL filenameURL) {
        if (filenameURL == null) {
            this.errorMessage("Filename/URL not specified in method 'loadMidi'.");
            return;
        }
        if (!filenameURL.getFilename().matches(SoundSystemConfig.EXTENSION_MIDI)) {
            this.errorMessage("Filename/identifier doesn't end in '.mid' or'.midi' in method loadMidi.");
            return;
        }
        if (this.midiChannel == null) {
            this.midiChannel = new MidiChannel(bl, string, filenameURL);
        } else {
            this.midiChannel.switchSource(bl, string, filenameURL);
        }
    }

    public Library() throws SoundSystemException {
        this.listener = new ListenerData(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 1.0f, 0.0f, 0.0f);
        this.streamingChannels = new LinkedList();
        this.normalChannels = new LinkedList();
        this.streamingChannelSourceNames = new String[SoundSystemConfig.getNumberStreamingChannels()];
        this.normalChannelSourceNames = new String[SoundSystemConfig.getNumberNormalChannels()];
        this.streamThread = new StreamThread();
        this.streamThread.start();
    }

    public LinkedList getAllSourcenames() {
        LinkedList<String> linkedList = new LinkedList<String>();
        Set set = this.sourceMap.keySet();
        Iterator iterator = set.iterator();
        if (this.midiChannel != null) {
            linkedList.add(this.midiChannel.getSourcename());
        }
        while (iterator.hasNext()) {
            linkedList.add((String)iterator.next());
        }
        return linkedList;
    }

    public MidiChannel getMidiChannel() {
        return this.midiChannel;
    }

    protected void message(String string) {
        this.logger.message(string, 0);
    }

    public void rawDataStream(AudioFormat audioFormat, boolean bl, String string, float f, float f2, float f3, int n, float f4) {
        this.sourceMap.put(string, new Source(audioFormat, bl, string, f, f2, f3, n, f4));
    }

    public void setListenerPosition(float f, float f2, float f3) {
        this.listener.setPosition(f, f2, f3);
        Set set = this.sourceMap.keySet();
        for (Object obj : set) {String string = (String) obj;
            Source source = (Source)this.sourceMap.get(string);
            if (source == null) continue;
            source.positionChanged();
        }
    }

    public float millisecondsPlayed(String string) {
        if (string == null || string.equals("")) {
            this.errorMessage("Sourcename not specified in method 'millisecondsPlayed'");
            return -1.0f;
        }
        if (this.midiSourcename(string)) {
            this.errorMessage("Unable to calculate milliseconds for MIDI source.");
            return -1.0f;
        }
        Source source = (Source)this.sourceMap.get(string);
        if (source == null) {
            this.errorMessage("Source '" + string + "' not found in " + "method 'millisecondsPlayed'");
        }
        return source.millisecondsPlayed();
    }

    public void setVolume(String string, float f) {
        if (this.midiSourcename(string)) {
            this.midiChannel.setVolume(f);
        } else {
            Source source = (Source)this.sourceMap.get(string);
            if (source != null) {
                float f2 = f;
                if (f2 < 0.0f) {
                    f2 = 0.0f;
                } else if (f2 > 1.0f) {
                    f2 = 1.0f;
                }
                source.sourceVolume = f2;
                source.positionChanged();
            }
        }
    }

    public void setAttenuation(String string, int n) {
        Source source = (Source)this.sourceMap.get(string);
        if (source != null) {
            source.setAttenuation(n);
        }
    }

    public void flush(String string) {
        if (this.midiSourcename(string)) {
            this.errorMessage("You can not flush the MIDI channel");
        } else {
            Source source = (Source)this.sourceMap.get(string);
            if (source != null) {
                source.flush();
            }
        }
    }

    public void setMidiChannel(MidiChannel midiChannel) {
        if (this.midiChannel != null && this.midiChannel != midiChannel) {
            this.midiChannel.cleanup();
        }
        this.midiChannel = midiChannel;
    }

    public LinkedList getAllLoadedFilenames() {
        LinkedList linkedList = new LinkedList();
        Set set = this.bufferMap.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            linkedList.add(iterator.next());
        }
        return linkedList;
    }

    public void newSource(boolean bl, boolean bl2, boolean bl3, String string, FilenameURL filenameURL, float f, float f2, float f3, int n, float f4) {
        this.sourceMap.put(string, new Source(bl, bl2, bl3, string, filenameURL, null, f, f2, f3, n, f4, false));
    }

    public static boolean libraryCompatible() {
        return true;
    }

    public void setLooping(String string, boolean bl) {
        Source source = (Source)this.sourceMap.get(string);
        if (source != null) {
            source.setLooping(bl);
        }
    }

    public static String getDescription() {
        return "Silent Mode";
    }

    public void setMasterVolume(float f) {
        SoundSystemConfig.setMasterGain(f);
        if (this.midiChannel != null) {
            this.midiChannel.resetGain();
        }
    }

    protected void errorMessage(String string) {
        this.logger.errorMessage(this.getClassName(), string, 0);
    }

    public void unloadSound(String string) {
        this.bufferMap.remove(string);
    }

    public void play(Source source) {
        if (source == null) {
            return;
        }
        if (source.rawDataStream) {
            return;
        }
        if (!source.active()) {
            return;
        }
        if (!source.playing()) {
            Channel channel = this.getNextChannel(source);
            if (source != null && channel != null) {
                if (source.channel != null && source.channel.attachedSource != source) {
                    source.channel = null;
                }
                channel.attachedSource = source;
                source.play(channel);
                if (source.toStream) {
                    this.streamThread.watch(source);
                    this.streamThread.interrupt();
                }
            }
        }
    }

    public String getClassName() {
        return "Library";
    }

    public void fadeOutIn(String string, FilenameURL filenameURL, long l, long l2) {
        if (this.midiSourcename(string)) {
            this.midiChannel.fadeOutIn(filenameURL, l, l2);
        } else {
            Source source = (Source)this.sourceMap.get(string);
            if (source != null) {
                source.fadeOutIn(filenameURL, l, l2);
            }
        }
    }

    public ListenerData getListenerData() {
        return this.listener;
    }

    public HashMap getSources() {
        return this.sourceMap;
    }

    public void setPriority(String string, boolean bl) {
        Source source = (Source)this.sourceMap.get(string);
        if (source != null) {
            source.setPriority(bl);
        }
    }

    public void pause(String string) {
        if (string == null || string.equals("")) {
            this.errorMessage("Sourcename not specified in method 'stop'");
            return;
        }
        if (this.midiSourcename(string)) {
            this.midiChannel.pause();
        } else {
            Source source = (Source)this.sourceMap.get(string);
            if (source != null) {
                source.pause();
            }
        }
    }

    public void setListenerData(ListenerData listenerData) {
        this.listener.setData(listenerData);
    }

    public void rewind(String string) {
        if (this.midiSourcename(string)) {
            this.midiChannel.rewind();
        } else {
            Source source = (Source)this.sourceMap.get(string);
            if (source != null) {
                source.rewind();
            }
        }
    }

    public void cull(String string) {
        Source source = (Source)this.sourceMap.get(string);
        if (source != null) {
            source.cull();
        }
    }

    public void listenerMoved() {
        Set set = this.sourceMap.keySet();
        for (Object obj : set) {String string = (String) obj;
            Source source = (Source)this.sourceMap.get(string);
            if (source == null) continue;
            source.listenerMoved();
        }
    }

    public void setPitch(String string, float f) {
        Source source;
        if (!this.midiSourcename(string) && (source = (Source)this.sourceMap.get(string)) != null) {
            float f2 = f;
            if (f2 < 0.5f) {
                f2 = 0.5f;
            } else if (f2 > 2.0f) {
                f2 = 2.0f;
            }
            source.setPitch(f2);
            source.positionChanged();
        }
    }

    public void queueSound(String string, FilenameURL filenameURL) {
        if (this.midiSourcename(string)) {
            this.midiChannel.queueSound(filenameURL);
        } else {
            Source source = (Source)this.sourceMap.get(string);
            if (source != null) {
                source.queueSound(filenameURL);
            }
        }
    }

    public void setVelocity(String string, float f, float f2, float f3) {
        Source source = (Source)this.sourceMap.get(string);
        if (source != null) {
            source.setVelocity(f, f2, f3);
        }
    }

    public void dequeueSound(String string, String string2) {
        if (this.midiSourcename(string)) {
            this.midiChannel.dequeueSound(string2);
        } else {
            Source source = (Source)this.sourceMap.get(string);
            if (source != null) {
                source.dequeueSound(string2);
            }
        }
    }

    public void moveListener(float f, float f2, float f3) {
        this.setListenerPosition(this.listener.position.x + f, this.listener.position.y + f2, this.listener.position.z + f3);
    }

    public static String getTitle() {
        return "No Sound";
    }

    public void setListenerVelocity(float f, float f2, float f3) {
        this.listener.setVelocity(f, f2, f3);
    }

    public float getVolume(String string) {
        if (this.midiSourcename(string)) {
            return this.midiChannel.getVolume();
        }
        Source source = (Source)this.sourceMap.get(string);
        if (source != null) {
            return source.sourceVolume;
        }
        return 0.0f;
    }

    public float getPitch(String string) {
        Source source;
        if (!this.midiSourcename(string) && (source = (Source)this.sourceMap.get(string)) != null) {
            return source.getPitch();
        }
        return 1.0f;
    }

    protected Channel createChannel(int n) {
        return new Channel(n);
    }

    protected void printStackTrace(Exception exception) {
        this.logger.printStackTrace(exception, 1);
    }

    public void turnListener(float f) {
        this.setListenerAngle(this.listener.angle + f);
        Set set = this.sourceMap.keySet();
        for (Object obj : set) {String string = (String) obj;
            Source source = (Source)this.sourceMap.get(string);
            if (source == null) continue;
            source.positionChanged();
        }
    }

    public int feedRawAudioData(Source source, byte[] byArray) {
        if (source == null) {
            this.errorMessage("Source parameter null in method 'feedRawAudioData'");
            return -1;
        }
        if (!source.toStream) {
            this.errorMessage("Only a streaming source may be specified in method 'feedRawAudioData'");
            return -1;
        }
        if (!source.rawDataStream) {
            this.errorMessage("Streaming source already associated with a file or URL in method'feedRawAudioData'");
            return -1;
        }
        if (!source.playing() || source.channel == null) {
            Channel channel = source.channel != null && source.channel.attachedSource == source ? source.channel : this.getNextChannel(source);
            int n = source.feedRawAudioData(channel, byArray);
            channel.attachedSource = source;
            this.streamThread.watch(source);
            this.streamThread.interrupt();
            return n;
        }
        return source.feedRawAudioData(source.channel, byArray);
    }

    protected void importantMessage(String string) {
        this.logger.importantMessage(string, 0);
    }

    public void play(String string) {
        if (string == null || string.equals("")) {
            this.errorMessage("Sourcename not specified in method 'play'");
            return;
        }
        if (this.midiSourcename(string)) {
            this.midiChannel.play();
        } else {
            Source source = (Source)this.sourceMap.get(string);
            if (source == null) {
                this.errorMessage("Source '" + string + "' not found in " + "method 'play'");
            }
            this.play(source);
        }
    }

    public void removeTemporarySources() {
        Set set = this.sourceMap.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            String string = (String)iterator.next();
            Source source = (Source)this.sourceMap.get(string);
            if (source == null || !source.temporary || source.playing()) continue;
            source.cleanup();
            iterator.remove();
        }
    }

    public void quickPlay(boolean bl, boolean bl2, boolean bl3, String string, FilenameURL filenameURL, float f, float f2, float f3, int n, float f4, boolean bl4) {
        this.sourceMap.put(string, new Source(bl, bl2, bl3, string, filenameURL, null, f, f2, f3, n, f4, bl4));
    }

    public void setListenerAngle(float f) {
        this.listener.setAngle(f);
        Set set = this.sourceMap.keySet();
        for (Object obj : set) {String string = (String) obj;
            Source source = (Source)this.sourceMap.get(string);
            if (source == null) continue;
            source.positionChanged();
        }
    }

    public int feedRawAudioData(String string, byte[] byArray) {
        if (string == null || string.equals("")) {
            this.errorMessage("Sourcename not specified in method 'feedRawAudioData'");
            return -1;
        }
        if (this.midiSourcename(string)) {
            this.errorMessage("Raw audio data can not be fed to the MIDI channel.");
            return -1;
        }
        Source source = (Source)this.sourceMap.get(string);
        if (source == null) {
            this.errorMessage("Source '" + string + "' not found in " + "method 'feedRawAudioData'");
        }
        return this.feedRawAudioData(source, byArray);
    }

    public void fadeOut(String string, FilenameURL filenameURL, long l) {
        if (this.midiSourcename(string)) {
            this.midiChannel.fadeOut(filenameURL, l);
        } else {
            Source source = (Source)this.sourceMap.get(string);
            if (source != null) {
                source.fadeOut(filenameURL, l);
            }
        }
    }

    public void init() throws SoundSystemException {
        int n;
        Channel channel = null;
        for (n = 0; n < SoundSystemConfig.getNumberStreamingChannels() && (channel = this.createChannel(1)) != null; ++n) {
            this.streamingChannels.add(channel);
        }
        for (n = 0; n < SoundSystemConfig.getNumberNormalChannels() && (channel = this.createChannel(0)) != null; ++n) {
            this.normalChannels.add(channel);
        }
    }

    public void setListenerOrientation(float f, float f2, float f3, float f4, float f5, float f6) {
        this.listener.setOrientation(f, f2, f3, f4, f5, f6);
        Set set = this.sourceMap.keySet();
        for (Object obj : set) {String string = (String) obj;
            Source source = (Source)this.sourceMap.get(string);
            if (source == null) continue;
            source.positionChanged();
        }
    }

    public boolean reverseByteOrder() {
        return this.reverseByteOrder;
    }

    public Source getSource(String string) {
        return (Source)this.sourceMap.get(string);
    }

    protected boolean errorCheck(boolean bl, String string) {
        return this.logger.errorCheck(bl, this.getClassName(), string, 0);
    }

    public void checkFadeVolumes() {
        Source source;
        Channel channel;
        if (this.midiChannel != null) {
            this.midiChannel.resetGain();
        }
        for (int i = 0; i < this.streamingChannels.size(); ++i) {
            channel = (Channel)this.streamingChannels.get(i);
            if (channel == null || (source = channel.attachedSource) == null) continue;
            source.checkFadeOut();
        }
        channel = null;
        source = null;
    }

    public void copySources(HashMap hashMap) {
        if (hashMap == null) {
            return;
        }
        Set set = hashMap.keySet();
        Iterator iterator = set.iterator();
        this.sourceMap.clear();
        while (iterator.hasNext()) {
            String string = (String)iterator.next();
            Source source = (Source)hashMap.get(string);
            if (source == null) continue;
            this.loadSound(source.filenameURL);
            this.sourceMap.put(string, new Source(source, null));
        }
    }

    public void setTemporary(String string, boolean bl) {
        Source source = (Source)this.sourceMap.get(string);
        if (source != null) {
            source.setTemporary(bl);
        }
    }
}

