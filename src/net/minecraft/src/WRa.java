package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
class WRa
extends Thread {
    final Qyp field_36c7844_Dne;

    @Override
    public void run() {
        Qyp.field_58b5fbe5_Dne.getAndIncrement();
        try {
            if (Qyp.method_83ebeec3_Dne(this.field_36c7844_Dne) && !Qyp.method_5d3fa284_FWm(this.field_36c7844_Dne)) {
                while (true) {
                    if (Qyp.method_75e0bdb6_bzF(this.field_36c7844_Dne)) {
                        continue;
                    }
                    try {
                        WRa.sleep(2L);
                    }
                    catch (InterruptedException interruptedException) {}
                }
            }
        }
        finally {
            Qyp.field_58b5fbe5_Dne.getAndDecrement();
        }
    }

    WRa(Qyp qyp, String string) {
        super(string);
        this.field_36c7844_Dne = qyp;
    }
}

