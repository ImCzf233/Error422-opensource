/*
 * Decompiled with CFR 0.152.
 */
package paulscode.sound.codecs;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;
import paulscode.sound.ICodec;
import paulscode.sound.SoundBuffer;
import paulscode.sound.SoundSystemConfig;
import paulscode.sound.SoundSystemLogger;

public class CodecWav
implements ICodec {
    private static final boolean GET;
    private AudioInputStream myAudioInputStream = null;
    private boolean endOfStream = false;
    private static final boolean XXX;
    private boolean initialized = false;
    private static final boolean SET;
    private SoundSystemLogger logger = SoundSystemConfig.getLogger();

    private synchronized boolean endOfStream(boolean bl, boolean bl2) {
        if (bl) {
            this.endOfStream = bl2;
        }
        return this.endOfStream;
    }

    private static byte[] trimArray(byte[] byArray, int n) {
        byte[] byArray2 = null;
        if (byArray != null && byArray.length > n) {
            byArray2 = new byte[n];
            System.arraycopy(byArray, 0, byArray2, 0, n);
        }
        return byArray2;
    }

    public boolean initialized() {
        return this.initialized(false, false);
    }

    public SoundBuffer read() {
        int n;
        if (this.myAudioInputStream == null) {
            return null;
        }
        AudioFormat audioFormat = this.myAudioInputStream.getFormat();
        if (audioFormat == null) {
            this.errorMessage("Audio Format null in method 'read'");
            return null;
        }
        int n2 = 0;
        byte[] byArray = new byte[SoundSystemConfig.getStreamingBufferSize()];
        try {
            for (n = 0; !this.endOfStream(false, false) && n < byArray.length; n += n2) {
                n2 = this.myAudioInputStream.read(byArray, n, byArray.length - n);
                if (n2 > 0) continue;
                this.endOfStream(true, true);
                break;
            }
        }
        catch (IOException iOException) {
            this.endOfStream(true, true);
            return null;
        }
        if (n <= 0) {
            return null;
        }
        if (n < byArray.length) {
            byArray = CodecWav.trimArray(byArray, n);
        }
        byte[] byArray2 = CodecWav.convertAudioBytes(byArray, audioFormat.getSampleSizeInBits() == 16);
        SoundBuffer soundBuffer = new SoundBuffer(byArray2, audioFormat);
        return soundBuffer;
    }

    public boolean endOfStream() {
        return this.endOfStream(false, false);
    }

    public SoundBuffer readAll() {
        int n;
        int n2;
        if (this.myAudioInputStream == null) {
            this.errorMessage("Audio input stream null in method 'readAll'");
            return null;
        }
        AudioFormat audioFormat = this.myAudioInputStream.getFormat();
        if (audioFormat == null) {
            this.errorMessage("Audio Format null in method 'readAll'");
            return null;
        }
        byte[] byArray = null;
        int n3 = audioFormat.getChannels() * (int)this.myAudioInputStream.getFrameLength() * audioFormat.getSampleSizeInBits() / 8;
        if (n3 > 0) {
            byArray = new byte[audioFormat.getChannels() * (int)this.myAudioInputStream.getFrameLength() * audioFormat.getSampleSizeInBits() / 8];
            n2 = 0;
            try {
                for (n = 0; (n2 = this.myAudioInputStream.read(byArray, n, byArray.length - n)) != -1 && n < byArray.length; n += n2) {
                }
            }
            catch (IOException iOException) {
                this.errorMessage("Exception thrown while reading from the AudioInputStream (location #1).");
                this.printStackTrace(iOException);
                return null;
            }
        }
        n = 0;
        int n4 = 0;
        byte[] byArray2 = null;
        byArray2 = new byte[SoundSystemConfig.getFileChunkSize()];
        for (n2 = 0; !this.endOfStream(false, false) && n2 < SoundSystemConfig.getMaxFileSize(); n2 += n) {
            n4 = 0;
            try {
                for (n = 0; n < byArray2.length; n += n4) {
                    n4 = this.myAudioInputStream.read(byArray2, n, byArray2.length - n);
                    if (n4 > 0) continue;
                    this.endOfStream(true, true);
                    break;
                }
            }
            catch (IOException iOException) {
                this.errorMessage("Exception thrown while reading from the AudioInputStream (location #2).");
                this.printStackTrace(iOException);
                return null;
            }
            byArray = CodecWav.appendByteArrays(byArray, byArray2, n);
        }
        byte[] byArray3 = CodecWav.convertAudioBytes(byArray, audioFormat.getSampleSizeInBits() == 16);
        SoundBuffer soundBuffer = new SoundBuffer(byArray3, audioFormat);
        try {
            this.myAudioInputStream.close();
        }
        catch (IOException iOException) {
            // empty catch block
        }
        return soundBuffer;
    }

    private void printStackTrace(Exception exception) {
        this.logger.printStackTrace(exception, 1);
    }

    public void cleanup() {
        if (this.myAudioInputStream != null) {
            try {
                this.myAudioInputStream.close();
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        this.myAudioInputStream = null;
    }

    private static byte[] appendByteArrays(byte[] byArray, byte[] byArray2, int n) {
        byte[] byArray3;
        if (byArray == null && byArray2 == null) {
            return null;
        }
        if (byArray == null) {
            byArray3 = new byte[n];
            System.arraycopy(byArray2, 0, byArray3, 0, n);
            byArray2 = null;
        } else if (byArray2 == null) {
            byArray3 = new byte[byArray.length];
            System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
            byArray = null;
        } else {
            byArray3 = new byte[byArray.length + n];
            System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
            System.arraycopy(byArray2, 0, byArray3, byArray.length, n);
            byArray = null;
            byArray2 = null;
        }
        return byArray3;
    }

    public AudioFormat getAudioFormat() {
        if (this.myAudioInputStream == null) {
            return null;
        }
        return this.myAudioInputStream.getFormat();
    }

    private void errorMessage(String string) {
        this.logger.errorMessage("CodecWav", string, 0);
    }

    private synchronized boolean initialized(boolean bl, boolean bl2) {
        if (bl) {
            this.initialized = bl2;
        }
        return this.initialized;
    }

    private static byte[] convertAudioBytes(byte[] byArray, boolean bl) {
        Object object;
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(byArray.length);
        byteBuffer.order(ByteOrder.nativeOrder());
        ByteBuffer byteBuffer2 = ByteBuffer.wrap(byArray);
        byteBuffer2.order(ByteOrder.LITTLE_ENDIAN);
        if (bl) {
            object = byteBuffer.asShortBuffer();
            ShortBuffer shortBuffer = byteBuffer2.asShortBuffer();
            while (shortBuffer.hasRemaining()) {
                ((ShortBuffer)object).put(shortBuffer.get());
            }
        } else {
            while (byteBuffer2.hasRemaining()) {
                byteBuffer.put(byteBuffer2.get());
            }
        }
        byteBuffer.rewind();
        if (!byteBuffer.hasArray()) {
            byte[] data = new byte[byteBuffer.capacity()];
            byteBuffer.get(data);
            byteBuffer.clear();
            return data;
        }
        return byteBuffer.array();
    }

    static {
        SET = true;
        GET = false;
        XXX = false;
    }

    public void reverseByteOrder(boolean bl) {
    }

    public boolean initialize(URL uRL) {
        this.initialized(true, false);
        this.cleanup();
        if (uRL == null) {
            this.errorMessage("url null in method 'initialize'");
            this.cleanup();
            return false;
        }
        try {
            this.myAudioInputStream = AudioSystem.getAudioInputStream(new BufferedInputStream(uRL.openStream()));
        }
        catch (UnsupportedAudioFileException unsupportedAudioFileException) {
            this.errorMessage("Unsupported audio format in method 'initialize'");
            this.printStackTrace(unsupportedAudioFileException);
            return false;
        }
        catch (IOException iOException) {
            this.errorMessage("Error setting up audio input stream in method 'initialize'");
            this.printStackTrace(iOException);
            return false;
        }
        this.endOfStream(true, false);
        this.initialized(true, true);
        return true;
    }
}

