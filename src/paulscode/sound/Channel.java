/*
 * Decompiled with CFR 0.152.
 */
package paulscode.sound;

import java.util.LinkedList;
import javax.sound.sampled.AudioFormat;
import paulscode.sound.Library;
import paulscode.sound.SoundSystemConfig;
import paulscode.sound.SoundSystemLogger;
import paulscode.sound.Source;

public class Channel {
    public Source attachedSource = null;
    protected Class libraryType = Library.class;
    private SoundSystemLogger logger = SoundSystemConfig.getLogger();
    public int channelType;
    public int buffersUnqueued = 0;

    public void flush() {
    }

    public void rewind() {
    }

    public float millisecondsPlayed() {
        return -1.0f;
    }

    public void play() {
    }

    protected void errorMessage(String string) {
        this.logger.errorMessage(this.getClassName(), string, 0);
    }

    public void setAudioFormat(AudioFormat audioFormat) {
    }

    protected void printStackTrace(Exception exception) {
        this.logger.printStackTrace(exception, 1);
    }

    protected void message(String string) {
        this.logger.message(string, 0);
    }

    public String getClassName() {
        String string = SoundSystemConfig.getLibraryTitle(this.libraryType);
        if (string.equals("No Sound")) {
            return "Channel";
        }
        return "Channel" + string;
    }

    public boolean playing() {
        return false;
    }

    protected boolean errorCheck(boolean bl, String string) {
        return this.logger.errorCheck(bl, this.getClassName(), string, 0);
    }

    public boolean preLoadBuffers(LinkedList linkedList) {
        return true;
    }

    public void close() {
    }

    public void stop() {
    }

    public void pause() {
    }

    public int feedRawAudioData(byte[] byArray) {
        return 1;
    }

    public int buffersProcessed() {
        return 0;
    }

    protected void importantMessage(String string) {
        this.logger.importantMessage(string, 0);
    }

    public Channel(int n) {
        this.channelType = n;
    }

    public void cleanup() {
        this.logger = null;
    }

    public boolean queueBuffer(byte[] byArray) {
        return false;
    }

    public boolean processBuffer() {
        return false;
    }
}

