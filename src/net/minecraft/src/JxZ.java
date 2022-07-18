package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class JxZ
extends UgS {
    public JxZ() {
        super(3, 3, new NMq[]{new NMq(dEr.field_90cb7cdd_lMz), new NMq(dEr.field_90cb7cdd_lMz), new NMq(dEr.field_90cb7cdd_lMz), new NMq(dEr.field_90cb7cdd_lMz), new NMq(dEr.field_3792594_Dne, 0, Short.MAX_VALUE), new NMq(dEr.field_90cb7cdd_lMz), new NMq(dEr.field_90cb7cdd_lMz), new NMq(dEr.field_90cb7cdd_lMz), new NMq(dEr.field_90cb7cdd_lMz)}, new NMq(dEr.field_3651a1c_Dne, 0, 0));
    }

    @Override
    public NMq method_b1bef5f5_Dne(Uqm uqm) {
        NMq nMq = null;
        for (int i = 0; i < uqm.method_907a9d14_Qnq() && nMq == null; ++i) {
            NMq nMq2 = uqm.method_9e6e1a08_Dne(i);
            if (nMq2 == null || nMq2.field_2e5f1b_bzF != dEr.field_3792594_Dne.field_267cf5_Qnq) continue;
            nMq = nMq2;
        }
        nMq = nMq.method_23040479_Dne();
        nMq.field_2092ae_Dne = 1;
        if (nMq.method_230886fb_Dne() == null) {
            nMq.method_66a36cd8_FWm(new WkD());
        }
        nMq.method_230886fb_Dne().method_5ab48f70_Dne("map_is_scaling", true);
        return nMq;
    }

    @Override
    public boolean method_cbf49e9b_Dne(Uqm uqm, Qnq qnq) {
        if (!super.method_cbf49e9b_Dne(uqm, qnq)) {
            return false;
        }
        NMq nMq = null;
        for (int i = 0; i < uqm.method_907a9d14_Qnq() && nMq == null; ++i) {
            NMq nMq2 = uqm.method_9e6e1a08_Dne(i);
            if (nMq2 == null || nMq2.field_2e5f1b_bzF != dEr.field_3792594_Dne.field_267cf5_Qnq) continue;
            nMq = nMq2;
        }
        if (nMq == null) {
            return false;
        }
        Ilk ilk = dEr.field_3792594_Dne.method_ee3739a1_Dne(nMq, qnq);
        return ilk == null ? false : ilk.field_212606_FWm < 4;
    }
}

