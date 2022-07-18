/*
 * Decompiled with CFR 0.152.
 */
package paulscode.sound;

import java.net.URL;
import paulscode.sound.SoundSystemConfig;
import paulscode.sound.SoundSystemLogger;

public class FilenameURL {
    private URL url = null;
    private String filename = null;
    private SoundSystemLogger logger = SoundSystemConfig.getLogger();

    public FilenameURL(String string) {
        this.filename = string;
        this.url = null;
    }

    public FilenameURL(URL uRL, String string) {
        this.filename = string;
        this.url = uRL;
    }

    private void printStackTrace(Exception exception) {
        this.logger.printStackTrace(exception, 1);
    }

    public String getFilename() {
        return this.filename;
    }

    private void errorMessage(String string) {
        this.logger.errorMessage("MidiChannel", string, 0);
    }

    public URL getURL() {
        if (this.url == null) {
            if (this.filename.matches(SoundSystemConfig.PREFIX_URL)) {
                try {
                    this.url = new URL(this.filename);
                }
                catch (Exception exception) {
                    this.errorMessage("Unable to access online URL in method 'getURL'");
                    this.printStackTrace(exception);
                    return null;
                }
            } else {
                this.url = this.getClass().getClassLoader().getResource(SoundSystemConfig.getSoundFilesPackage() + this.filename);
            }
        }
        return this.url;
    }
}

