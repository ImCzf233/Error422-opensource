package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class ccS
extends tkL {
    @Override
    public int method_fd88681_Dne(NMq nMq, int n) {
        int n2 = nMq.method_907a9d14_Qnq();
        return (n2 & 1) == 1 ? QFY.method_7a46288d_Dne() : ((n2 & 2) == 2 ? QFY.method_7c6f602c_FWm() : QFY.method_ae128dba_bzF());
    }

    @Override
    public gDn method_9e795529_Dne(int n) {
        return zKP.field_36e218c_Dne.method_9051f17a_Dne(0, n);
    }

    @Override
    public int method_ce7f5d9c_Dne(int n) {
        return n | 4;
    }

    public ccS(int n) {
        super(n);
        this.method_77cbb00a_FWm(0);
        this.method_21c1eb9a_Dne(true);
    }

    @Override
    public String method_10c7922b_Dne(NMq nMq) {
        int n = nMq.method_907a9d14_Qnq();
        if (n < 0 || n >= VOy.field_f5e54dca_Dne.length) {
            n = 0;
        }
        return super.method_d1f1ed87_FWm() + "." + VOy.field_f5e54dca_Dne[n];
    }
}

