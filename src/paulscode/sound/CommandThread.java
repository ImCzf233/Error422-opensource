/*
 * Decompiled with CFR 0.152.
 */
package paulscode.sound;

import paulscode.sound.SimpleThread;
import paulscode.sound.SoundSystem;
import paulscode.sound.SoundSystemConfig;
import paulscode.sound.SoundSystemLogger;

public class CommandThread
extends SimpleThread {
    private SoundSystem soundSystem;
    protected String className = "CommandThread";
    protected SoundSystemLogger logger = SoundSystemConfig.getLogger();

    protected void errorMessage(String string, int n) {
        this.logger.errorMessage(this.className, string, n);
    }

    protected boolean errorCheck(boolean bl, String string) {
        return this.logger.errorCheck(bl, this.className, string, 0);
    }

    public void run() {
        long l;
        long l2 = l = System.currentTimeMillis();
        if (this.soundSystem == null) {
            this.errorMessage("SoundSystem was null in method run().", 0);
            this.cleanup();
            return;
        }
        this.snooze(3600000L);
        while (!this.dying()) {
            this.soundSystem.ManageSources();
            this.soundSystem.CommandQueue(null);
            l2 = System.currentTimeMillis();
            if (!this.dying() && l2 - l > 10000L) {
                l = l2;
                this.soundSystem.removeTemporarySources();
            }
            if (this.dying()) continue;
            this.snooze(3600000L);
        }
        this.cleanup();
    }

    public CommandThread(SoundSystem soundSystem) {
        this.soundSystem = soundSystem;
    }

    protected void message(String string, int n) {
        this.logger.message(string, n);
    }

    protected void importantMessage(String string, int n) {
        this.logger.importantMessage(string, n);
    }

    protected void cleanup() {
        this.kill();
        this.logger = null;
        this.soundSystem = null;
        super.cleanup();
    }
}

