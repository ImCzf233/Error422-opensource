/*
 * Decompiled with CFR 0.152.
 */
package paulscode.sound;

import paulscode.sound.SimpleThread$1;

public class SimpleThread
extends Thread {
    private static final boolean XXX;
    private boolean alive = true;
    private static final boolean SET;
    private static final boolean GET;
    private boolean kill = false;

    private synchronized boolean kill(boolean bl, boolean bl2) {
        if (bl) {
            this.kill = bl2;
        }
        return this.kill;
    }

    static {
        SET = true;
        GET = false;
        XXX = false;
    }

    public void run() {
        this.cleanup();
    }

    private void rerun() {
        this.kill(true, true);
        while (this.alive(false, false)) {
            this.snooze(100L);
        }
        this.alive(true, true);
        this.kill(true, false);
        this.run();
    }

    protected void cleanup() {
        this.kill(true, true);
        this.alive(true, false);
    }

    public void kill() {
        this.kill(true, true);
    }

    public void restart() {
        new SimpleThread$1(this).start();
    }

    public boolean alive() {
        return this.alive(false, false);
    }

    private synchronized boolean alive(boolean bl, boolean bl2) {
        if (bl) {
            this.alive = bl2;
        }
        return this.alive;
    }

    protected void snooze(long l) {
        try {
            Thread.sleep(l);
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
    }

    static /* synthetic */ void access$000(SimpleThread simpleThread) {
        simpleThread.rerun();
    }

    protected boolean dying() {
        return this.kill(false, false);
    }
}

