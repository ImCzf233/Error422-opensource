package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class Gfb
extends dEr {
    public Gfb(int n) {
        super(n);
        this.method_829e7ad2_Dne(JcN.field_74f385d5_mrb);
    }

    @Override
    public gDn method_9e795529_Dne(int n) {
        return dEr.field_3682442_Dne.method_9e795529_Dne(0);
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
    }

    @Override
    public NMq method_d4201764_Dne(NMq nMq, Qnq qnq, FiG fiG) {
        wHH wHH2 = this.method_78b7ab24_Dne(qnq, fiG, true);
        if (wHH2 == null) {
            return nMq;
        }
        if (wHH2.field_376443d_Dne == gks.field_376443d_Dne) {
            int n = wHH2.field_2092ae_Dne;
            int n2 = wHH2.field_21260d_FWm;
            int n3 = wHH2.field_2e5f1b_bzF;
            if (!qnq.method_88973324_Dne(fiG, n, n2, n3)) {
                return nMq;
            }
            if (!fiG.method_7bcedb59_Dne(n, n2, n3, wHH2.field_267cf5_Qnq, nMq)) {
                return nMq;
            }
            if (qnq.method_d9802b31_Dne(n, n2, n3) == KFd.field_1411d34d_div) {
                --nMq.field_2092ae_Dne;
                if (nMq.field_2092ae_Dne <= 0) {
                    return new NMq(dEr.field_3682442_Dne);
                }
                if (!fiG.field_36a059b_Dne.method_7c61cf19_Dne(new NMq(dEr.field_3682442_Dne))) {
                    fiG.method_c9a088b8_Dne(new NMq(dEr.field_3682442_Dne.field_267cf5_Qnq, 1, 0));
                }
            }
        }
        return nMq;
    }
}

