package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class UgS
implements iQt {
    private NMq[] field_8360c375_Dne;
    private NMq field_36a761a_Dne;
    public final int field_2092ae_Dne;
    private int field_2e5f1b_bzF;
    private int field_21260d_FWm;
    private boolean field_2092bf_Dne = false;

    @Override
    public NMq method_b1bef5f5_Dne(Uqm uqm) {
        NMq nMq = this.method_23040479_Dne().method_23040479_Dne();
        if (this.field_2092bf_Dne) {
            for (int i = 0; i < uqm.method_907a9d14_Qnq(); ++i) {
                NMq nMq2 = uqm.method_9e6e1a08_Dne(i);
                if (nMq2 == null || !nMq2.method_a98a0664_aFZ()) continue;
                nMq.method_66a36cd8_FWm((WkD)nMq2.field_36ef89c_Dne.method_23130705_Dne());
            }
        }
        return nMq;
    }

    @Override
    public int method_7a46288d_Dne() {
        return this.field_21260d_FWm * this.field_2e5f1b_bzF;
    }

    @Override
    public NMq method_23040479_Dne() {
        return this.field_36a761a_Dne;
    }

    public UgS(int n, int n2, NMq[] nMqArray, NMq nMq) {
        this.field_2092ae_Dne = nMq.field_2e5f1b_bzF;
        this.field_21260d_FWm = n;
        this.field_2e5f1b_bzF = n2;
        this.field_8360c375_Dne = nMqArray;
        this.field_36a761a_Dne = nMq;
    }

    @Override
    public boolean method_cbf49e9b_Dne(Uqm uqm, Qnq qnq) {
        for (int i = 0; i <= 3 - this.field_21260d_FWm; ++i) {
            for (int j = 0; j <= 3 - this.field_2e5f1b_bzF; ++j) {
                if (this.method_51d026a2_Dne(uqm, i, j, true)) {
                    return true;
                }
                if (!this.method_51d026a2_Dne(uqm, i, j, false)) continue;
                return true;
            }
        }
        return false;
    }

    public UgS method_2307910a_Dne() {
        this.field_2092bf_Dne = true;
        return this;
    }

    private boolean method_51d026a2_Dne(Uqm uqm, int n, int n2, boolean bl) {
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                NMq nMq;
                int n3 = i - n;
                int n4 = j - n2;
                NMq nMq2 = null;
                if (n3 >= 0 && n4 >= 0 && n3 < this.field_21260d_FWm && n4 < this.field_2e5f1b_bzF) {
                    nMq2 = bl ? this.field_8360c375_Dne[this.field_21260d_FWm - n3 - 1 + n4 * this.field_21260d_FWm] : this.field_8360c375_Dne[n3 + n4 * this.field_21260d_FWm];
                }
                if ((nMq = uqm.method_e1697ab8_FWm(i, j)) == null && nMq2 == null) continue;
                if (nMq == null && nMq2 != null || nMq != null && nMq2 == null) {
                    return false;
                }
                if (nMq2.field_2e5f1b_bzF != nMq.field_2e5f1b_bzF) {
                    return false;
                }
                if (nMq2.method_907a9d14_Qnq() == Short.MAX_VALUE || nMq2.method_907a9d14_Qnq() == nMq.method_907a9d14_Qnq()) continue;
                return false;
            }
        }
        return true;
    }
}

