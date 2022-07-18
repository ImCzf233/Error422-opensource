package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
class qsp
extends Thread {
    final iJs field_376b11a_Dne;

    qsp(iJs iJs2) {
        this.field_376b11a_Dne = iJs2;
        this.setDaemon(true);
        this.start();
    }

    @Override
    public void run() {
        while (true) {
            try {
                while (true) {
                    Thread.sleep(Integer.MAX_VALUE);
                }
            }
            catch (InterruptedException interruptedException) {
                continue;
            }
        }
    }
}

