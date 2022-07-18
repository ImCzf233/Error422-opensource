package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class lbo
extends itx {
    public lbo(int n) {
        super(n, false);
    }

    @Override
    public int method_fd88681_Dne(NMq nMq, int n) {
        return zKP.field_a9932c31_gvF.method_117d19dd_FWm(nMq.method_907a9d14_Qnq());
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
            if (qnq.method_d9802b31_Dne(n, n2, n3) == KFd.field_1411d34d_div && qnq.method_2dee76f_bzF(n, n2, n3) == 0 && qnq.method_2c2cf7cd_Dne(n, n2 + 1, n3)) {
                qnq.method_2ee8c47d_FWm(n, n2 + 1, n3, zKP.field_a9932c31_gvF.field_21260d_FWm);
                if (!fiG.field_37cb681_Dne.field_267d06_Qnq) {
                    --nMq.field_2092ae_Dne;
                }
            }
        }
        return nMq;
    }
}

