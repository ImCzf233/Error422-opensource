package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class YsE
extends tkL {
    private final String[] field_f5e54dca_Dne;
    private final zKP field_37e6aed_Dne;

    public YsE(int n, zKP zKP2, String[] stringArray) {
        super(n);
        this.field_37e6aed_Dne = zKP2;
        this.field_f5e54dca_Dne = stringArray;
        this.method_77cbb00a_FWm(0);
        this.method_21c1eb9a_Dne(true);
    }

    @Override
    public String method_10c7922b_Dne(NMq nMq) {
        int n = nMq.method_907a9d14_Qnq();
        if (n < 0 || n >= this.field_f5e54dca_Dne.length) {
            n = 0;
        }
        return super.method_d1f1ed87_FWm() + "." + this.field_f5e54dca_Dne[n];
    }

    @Override
    public int method_ce7f5d9c_Dne(int n) {
        return n;
    }

    @Override
    public gDn method_9e795529_Dne(int n) {
        return this.field_37e6aed_Dne.method_9051f17a_Dne(2, n);
    }
}

