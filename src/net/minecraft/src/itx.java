package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class itx
extends tkL {
    private String[] field_f5e54dca_Dne;
    private final zKP field_37e6aed_Dne = zKP.field_8374b848_Dne[this.method_7c6f602c_FWm()];

    @Override
    public int method_ce7f5d9c_Dne(int n) {
        return n;
    }

    @Override
    public String method_10c7922b_Dne(NMq nMq) {
        if (this.field_f5e54dca_Dne == null) {
            return super.method_10c7922b_Dne(nMq);
        }
        int n = nMq.method_907a9d14_Qnq();
        return n >= 0 && n < this.field_f5e54dca_Dne.length ? super.method_10c7922b_Dne(nMq) + "." + this.field_f5e54dca_Dne[n] : super.method_10c7922b_Dne(nMq);
    }

    public itx method_84daf9e9_Dne(String[] stringArray) {
        this.field_f5e54dca_Dne = stringArray;
        return this;
    }

    public itx(int n, boolean bl) {
        super(n);
        if (bl) {
            this.method_77cbb00a_FWm(0);
            this.method_21c1eb9a_Dne(true);
        }
    }

    @Override
    public gDn method_9e795529_Dne(int n) {
        return this.field_37e6aed_Dne.method_9051f17a_Dne(0, n);
    }

    @Override
    public int method_fd88681_Dne(NMq nMq, int n) {
        return this.field_37e6aed_Dne.method_117d19dd_FWm(nMq.method_907a9d14_Qnq());
    }
}

