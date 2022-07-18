package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
class zGQ
extends Thread {
    final Qyp field_36c7844_Dne;

    @Override
    public void run() {
        try {
            Thread.sleep(2000L);
            if (Qyp.method_83ebeec3_Dne(this.field_36c7844_Dne)) {
                Qyp.method_ec4db347_FWm(this.field_36c7844_Dne).interrupt();
                this.field_36c7844_Dne.method_feb678cd_Dne("disconnect.closed", new Object[0]);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    zGQ(Qyp qyp) {
        this.field_36c7844_Dne = qyp;
    }
}

