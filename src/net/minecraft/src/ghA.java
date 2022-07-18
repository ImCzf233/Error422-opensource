package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class ghA
extends dEr {
    private int field_2092ae_Dne;

    public boolean method_6dbd7bbc_Dne(Qnq qnq, double d, double d2, double d3, int n, int n2, int n3) {
        if (this.field_2092ae_Dne <= 0) {
            return false;
        }
        if (!qnq.method_2c2cf7cd_Dne(n, n2, n3) && qnq.method_d9802b31_Dne(n, n2, n3).method_7a46289e_Dne()) {
            return false;
        }
        if (qnq.field_3690d00_Dne.field_2092bf_Dne && this.field_2092ae_Dne == zKP.field_374330f_Dne.field_21260d_FWm) {
            qnq.method_c961c6ee_Dne(d + 0.5, d2 + 0.5, d3 + 0.5, "random.fizz", 0.5f, 2.6f + (qnq.field_7331eae7_Dne.nextFloat() - qnq.field_7331eae7_Dne.nextFloat()) * 0.8f);
            for (int i = 0; i < 8; ++i) {
                qnq.method_8600ec24_Dne("largesmoke", (double)n + Math.random(), (double)n2 + Math.random(), (double)n3 + Math.random(), 0.0, 0.0, 0.0);
            }
        } else {
            qnq.method_17d7ea9d_FWm(n, n2, n3, this.field_2092ae_Dne, 0, 3);
        }
        return true;
    }

    @Override
    public NMq method_d4201764_Dne(NMq nMq, Qnq qnq, FiG fiG) {
        float f = 1.0f;
        double d = fiG.field_2d29ef_aFZ + (fiG.field_2f0dd3_div - fiG.field_2d29ef_aFZ) * (double)f;
        double d2 = fiG.field_388da1_zGp + (fiG.field_22c5fd_IjH - fiG.field_388da1_zGp) * (double)f + 1.62 - (double)fiG.field_36b0a6_udO;
        double d3 = fiG.field_20b852_DyG + (fiG.field_334487_mrb - fiG.field_20b852_DyG) * (double)f;
        boolean bl = this.field_2092ae_Dne == 0;
        wHH wHH2 = this.method_78b7ab24_Dne(qnq, fiG, bl);
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
            if (this.field_2092ae_Dne == 0) {
                if (!fiG.method_7bcedb59_Dne(n, n2, n3, wHH2.field_267cf5_Qnq, nMq)) {
                    return nMq;
                }
                if (qnq.method_d9802b31_Dne(n, n2, n3) == KFd.field_1411d34d_div && qnq.method_2dee76f_bzF(n, n2, n3) == 0) {
                    qnq.method_2e7161e6_Qnq(n, n2, n3);
                    if (fiG.field_37cb681_Dne.field_267d06_Qnq) {
                        return nMq;
                    }
                    if (--nMq.field_2092ae_Dne <= 0) {
                        return new NMq(dEr.field_dface822_cHy);
                    }
                    if (!fiG.field_36a059b_Dne.method_7c61cf19_Dne(new NMq(dEr.field_dface822_cHy))) {
                        fiG.method_c9a088b8_Dne(new NMq(dEr.field_dface822_cHy.field_267cf5_Qnq, 1, 0));
                    }
                    return nMq;
                }
                if (qnq.method_d9802b31_Dne(n, n2, n3) == KFd.field_5b96677_IjH && qnq.method_2dee76f_bzF(n, n2, n3) == 0) {
                    qnq.method_2e7161e6_Qnq(n, n2, n3);
                    if (fiG.field_37cb681_Dne.field_267d06_Qnq) {
                        return nMq;
                    }
                    if (--nMq.field_2092ae_Dne <= 0) {
                        return new NMq(dEr.field_6a28e7c8_xXN);
                    }
                    if (!fiG.field_36a059b_Dne.method_7c61cf19_Dne(new NMq(dEr.field_6a28e7c8_xXN))) {
                        fiG.method_c9a088b8_Dne(new NMq(dEr.field_6a28e7c8_xXN.field_267cf5_Qnq, 1, 0));
                    }
                    return nMq;
                }
            } else {
                if (this.field_2092ae_Dne < 0) {
                    return new NMq(dEr.field_5ac2e6dc_qMV);
                }
                if (wHH2.field_267cf5_Qnq == 0) {
                    --n2;
                }
                if (wHH2.field_267cf5_Qnq == 1) {
                    ++n2;
                }
                if (wHH2.field_267cf5_Qnq == 2) {
                    --n3;
                }
                if (wHH2.field_267cf5_Qnq == 3) {
                    ++n3;
                }
                if (wHH2.field_267cf5_Qnq == 4) {
                    --n;
                }
                if (wHH2.field_267cf5_Qnq == 5) {
                    ++n;
                }
                if (!fiG.method_7bcedb59_Dne(n, n2, n3, wHH2.field_267cf5_Qnq, nMq)) {
                    return nMq;
                }
                if (this.method_6dbd7bbc_Dne(qnq, d, d2, d3, n, n2, n3) && !fiG.field_37cb681_Dne.field_267d06_Qnq) {
                    return new NMq(dEr.field_5ac2e6dc_qMV);
                }
            }
        } else if (this.field_2092ae_Dne == 0 && wHH2.field_37b45e5_Dne instanceof wBN) {
            return new NMq(dEr.field_2397d578_EwP);
        }
        return nMq;
    }

    public ghA(int n, int n2) {
        super(n);
        this.field_2d29f4_aFZ = 1;
        this.field_2092ae_Dne = n2;
        this.method_829e7ad2_Dne(JcN.field_712c773d_aFZ);
    }
}

