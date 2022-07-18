package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Ftb
 */
class ftb_0
extends Thread {
    final Qyp field_36c7844_Dne;

    ftb_0(Qyp qyp) {
        this.field_36c7844_Dne = qyp;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(5000L);
            if (Qyp.method_22298ce8_Dne(this.field_36c7844_Dne).isAlive()) {
                try {
                    Qyp.method_22298ce8_Dne(this.field_36c7844_Dne).stop();
                }
                catch (Throwable throwable) {
                    // empty catch block
                }
            }
            if (Qyp.method_ec4db347_FWm(this.field_36c7844_Dne).isAlive()) {
                try {
                    Qyp.method_ec4db347_FWm(this.field_36c7844_Dne).stop();
                }
                catch (Throwable throwable) {}
            }
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
    }
}

