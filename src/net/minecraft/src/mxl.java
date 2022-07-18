package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

class mxl
extends Thread {
    final MKS field_369f697_Dne;
    final irb field_3774533_Dne;
    final int field_2092ae_Dne;
    final int field_21260d_FWm;

    mxl(MKS mKS, irb irb2, int n, int n2) {
        this.field_369f697_Dne = mKS;
        this.field_3774533_Dne = irb2;
        this.field_2092ae_Dne = n;
        this.field_21260d_FWm = n2;
    }

    @Override
    public void run() {
        mNp mNp2 = new mNp(MKS.method_ab377e76_Dne((MKS)this.field_369f697_Dne).field_37d3e5f_Dne);
        boolean bl = false;
        for (int i = 0; i < 3; ++i) {
            try {
                Boolean bl2 = mNp2.method_f7240797_Dne();
                if (bl2.booleanValue()) {
                    MKS.method_60c13e16_Dne(this.field_369f697_Dne, this.field_3774533_Dne, this.field_2092ae_Dne, this.field_21260d_FWm);
                }
                MKS.method_ce7f9d7e_Dne(bl2);
            }
            catch (Ybw ybw) {
                bl = true;
            }
            catch (lUu lUu2) {
            }
            catch (IOException iOException) {
                // empty catch block
            }
            if (!bl) break;
            try {
                Thread.sleep(10000L);
                continue;
            }
            catch (InterruptedException interruptedException) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

