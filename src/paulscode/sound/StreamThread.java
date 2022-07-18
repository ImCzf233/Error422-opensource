/*
 * Decompiled with CFR 0.152.
 */
package paulscode.sound;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import paulscode.sound.SimpleThread;
import paulscode.sound.SoundSystemConfig;
import paulscode.sound.SoundSystemLogger;
import paulscode.sound.Source;

public class StreamThread
extends SimpleThread {
    private SoundSystemLogger logger;
    private List streamingSources;
    private final Object listLock = new Object();

    private void message(String string) {
        this.logger.message(string, 0);
    }

    private boolean errorCheck(boolean bl, String string) {
        return this.logger.errorCheck(bl, "StreamThread", string, 0);
    }

    public StreamThread() {
        this.logger = SoundSystemConfig.getLogger();
        this.streamingSources = new LinkedList();
    }

    private void importantMessage(String string) {
        this.logger.importantMessage(string, 0);
    }

    protected void cleanup() {
        this.kill();
        super.cleanup();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void run() {
        this.snooze(3600000L);
        while (!this.dying()) {
            while (!this.dying() && !this.streamingSources.isEmpty()) {
                Object object = this.listLock;
                synchronized (object) {
                    ListIterator listIterator = this.streamingSources.listIterator();
                    while (!this.dying() && listIterator.hasNext()) {
                        Source source = (Source)listIterator.next();
                        if (source == null) {
                            listIterator.remove();
                            continue;
                        }
                        if (source.stopped()) {
                            if (source.rawDataStream) continue;
                            listIterator.remove();
                            continue;
                        }
                        if (!source.active()) {
                            if (source.toLoop || source.rawDataStream) {
                                source.toPlay = true;
                            }
                            listIterator.remove();
                            continue;
                        }
                        if (source.paused()) continue;
                        source.checkFadeOut();
                        if (source.stream() || source.rawDataStream || source.channel != null && source.channel.processBuffer()) continue;
                        if (source.nextCodec == null) {
                            source.readBuffersFromNextSoundInSequence();
                        }
                        if (source.toLoop) {
                            if (source.playing()) continue;
                            SoundSystemConfig.notifyEOS(source.sourcename, source.getSoundSequenceQueueSize());
                            if (source.checkFadeOut()) {
                                source.preLoad = true;
                                continue;
                            }
                            source.incrementSoundSequence();
                            source.preLoad = true;
                            continue;
                        }
                        if (source.playing()) continue;
                        SoundSystemConfig.notifyEOS(source.sourcename, source.getSoundSequenceQueueSize());
                        if (source.checkFadeOut()) continue;
                        if (source.incrementSoundSequence()) {
                            source.preLoad = true;
                            continue;
                        }
                        listIterator.remove();
                    }
                }
                if (this.dying() || this.streamingSources.isEmpty()) continue;
                this.snooze(20L);
            }
            if (this.dying() || !this.streamingSources.isEmpty()) continue;
            this.snooze(3600000L);
        }
        this.cleanup();
    }

    private void errorMessage(String string) {
        this.logger.errorMessage("StreamThread", string, 0);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void watch(Source source) {
        if (source == null) {
            return;
        }
        if (this.streamingSources.contains(source)) {
            return;
        }
        Object object = this.listLock;
        synchronized (object) {
            ListIterator listIterator = this.streamingSources.listIterator();
            while (listIterator.hasNext()) {
                Source source2 = (Source)listIterator.next();
                if (source2 == null) {
                    listIterator.remove();
                    continue;
                }
                if (source.channel != source2.channel) continue;
                source2.stop();
                listIterator.remove();
            }
            this.streamingSources.add(source);
        }
    }
}

