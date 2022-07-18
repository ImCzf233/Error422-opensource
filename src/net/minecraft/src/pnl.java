package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class pnl
implements iQt {
    @Override
    public boolean method_cbf49e9b_Dne(Uqm uqm, Qnq qnq) {
        int n = 0;
        NMq nMq = null;
        for (int i = 0; i < uqm.method_907a9d14_Qnq(); ++i) {
            NMq nMq2 = uqm.method_9e6e1a08_Dne(i);
            if (nMq2 == null) continue;
            if (nMq2.field_2e5f1b_bzF == dEr.field_3792594_Dne.field_267cf5_Qnq) {
                if (nMq != null) {
                    return false;
                }
                nMq = nMq2;
                continue;
            }
            if (nMq2.field_2e5f1b_bzF != dEr.field_3651a1c_Dne.field_267cf5_Qnq) {
                return false;
            }
            ++n;
        }
        return nMq != null && n > 0;
    }

    @Override
    public NMq method_b1bef5f5_Dne(Uqm uqm) {
        int n = 0;
        NMq nMq = null;
        for (int i = 0; i < uqm.method_907a9d14_Qnq(); ++i) {
            NMq nMq2 = uqm.method_9e6e1a08_Dne(i);
            if (nMq2 == null) continue;
            if (nMq2.field_2e5f1b_bzF == dEr.field_3792594_Dne.field_267cf5_Qnq) {
                if (nMq != null) {
                    return null;
                }
                nMq = nMq2;
                continue;
            }
            if (nMq2.field_2e5f1b_bzF != dEr.field_3651a1c_Dne.field_267cf5_Qnq) {
                return null;
            }
            ++n;
        }
        if (nMq != null && n >= 1) {
            NMq nMq3 = new NMq(dEr.field_3792594_Dne, n + 1, nMq.method_907a9d14_Qnq());
            if (nMq.method_d44b4596_zGp()) {
                nMq3.method_8f501fe4_Dne(nMq.method_d1f1ed87_FWm());
            }
            return nMq3;
        }
        return null;
    }

    @Override
    public int method_7a46288d_Dne() {
        return 9;
    }

    @Override
    public NMq method_23040479_Dne() {
        return null;
    }
}

