package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class DOM
extends dEr {
    @Override
    public boolean method_4ddc487f_Dne(NMq nMq, FiG fiG, Qnq qnq, int n, int n2, int n3, int n4, float f, float f2, float f3) {
        int n5 = qnq.method_2c2cf7bc_Dne(n, n2, n3);
        int n6 = qnq.method_2dee76f_bzF(n, n2, n3);
        if (fiG.method_7bcedb59_Dne(n, n2, n3, n4, nMq) && n5 == zKP.field_e4a82663_dBc.field_21260d_FWm && !KPs.method_ce7f5dad_Dne(n6)) {
            int n7;
            int n8;
            int n9;
            int n10;
            if (qnq.field_2d2a05_aFZ) {
                return true;
            }
            qnq.method_d4dc89ed_Dne(n, n2, n3, n6 + 4, 2);
            --nMq.field_2092ae_Dne;
            for (n10 = 0; n10 < 16; ++n10) {
                double d = (float)n + (5.0f + field_7331eae7_Dne.nextFloat() * 6.0f) / 16.0f;
                double d2 = (float)n2 + 0.8125f;
                double d3 = (float)n3 + (5.0f + field_7331eae7_Dne.nextFloat() * 6.0f) / 16.0f;
                double d4 = 0.0;
                double d5 = 0.0;
                double d6 = 0.0;
                qnq.method_8600ec24_Dne("smoke", d, d2, d3, d4, d5, d6);
            }
            n10 = n6 & 3;
            int n11 = 0;
            int n12 = 0;
            boolean bl = false;
            boolean bl2 = true;
            int n13 = zxJ.field_6d92991_zGp[n10];
            for (n9 = -2; n9 <= 2; ++n9) {
                int n14 = n + zxJ.field_3f1c589_Dne[n13] * n9;
                int n15 = n3 + zxJ.field_4039e0a_FWm[n13] * n9;
                n8 = qnq.method_2c2cf7bc_Dne(n14, n2, n15);
                if (n8 != zKP.field_e4a82663_dBc.field_21260d_FWm) continue;
                n7 = qnq.method_2dee76f_bzF(n14, n2, n15);
                if (!KPs.method_ce7f5dad_Dne(n7)) {
                    bl2 = false;
                    break;
                }
                n12 = n9;
                if (bl) continue;
                n11 = n9;
                bl = true;
            }
            if (bl2 && n12 == n11 + 2) {
                for (n9 = n11; n9 <= n12; ++n9) {
                    int n16 = n + zxJ.field_3f1c589_Dne[n13] * n9;
                    int n17 = n3 + zxJ.field_4039e0a_FWm[n13] * n9;
                    n8 = qnq.method_2c2cf7bc_Dne(n16 += zxJ.field_3f1c589_Dne[n10] * 4, n2, n17 += zxJ.field_4039e0a_FWm[n10] * 4);
                    n7 = qnq.method_2dee76f_bzF(n16, n2, n17);
                    if (n8 == zKP.field_e4a82663_dBc.field_21260d_FWm && KPs.method_ce7f5dad_Dne(n7)) continue;
                    bl2 = false;
                    break;
                }
                block3: for (n9 = n11 - 1; n9 <= n12 + 1; n9 += 4) {
                    for (int i = 1; i <= 3; ++i) {
                        int n18 = n + zxJ.field_3f1c589_Dne[n13] * n9;
                        n8 = n3 + zxJ.field_4039e0a_FWm[n13] * n9;
                        n7 = qnq.method_2c2cf7bc_Dne(n18 += zxJ.field_3f1c589_Dne[n10] * i, n2, n8 += zxJ.field_4039e0a_FWm[n10] * i);
                        int n19 = qnq.method_2dee76f_bzF(n18, n2, n8);
                        if (n7 == zKP.field_e4a82663_dBc.field_21260d_FWm && KPs.method_ce7f5dad_Dne(n19)) continue;
                        bl2 = false;
                        continue block3;
                    }
                }
                if (bl2) {
                    for (n9 = n11; n9 <= n12; ++n9) {
                        for (int i = 1; i <= 3; ++i) {
                            int n20 = n + zxJ.field_3f1c589_Dne[n13] * n9;
                            n8 = n3 + zxJ.field_4039e0a_FWm[n13] * n9;
                            qnq.method_17d7ea9d_FWm(n20 += zxJ.field_3f1c589_Dne[n10] * i, n2, n8 += zxJ.field_4039e0a_FWm[n10] * i, zKP.field_fae40a26_EYV.field_21260d_FWm, 0, 2);
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public NMq method_d4201764_Dne(NMq nMq, Qnq qnq, FiG fiG) {
        EyB eyB;
        int n;
        wHH wHH2 = this.method_78b7ab24_Dne(qnq, fiG, false);
        if (wHH2 != null && wHH2.field_376443d_Dne == gks.field_376443d_Dne && (n = qnq.method_2c2cf7bc_Dne(wHH2.field_2092ae_Dne, wHH2.field_21260d_FWm, wHH2.field_2e5f1b_bzF)) == zKP.field_e4a82663_dBc.field_21260d_FWm) {
            return nMq;
        }
        if (!qnq.field_2d2a05_aFZ && (eyB = qnq.method_1b74dc2_Dne("Stronghold", (int)fiG.field_2f0dd3_div, (int)fiG.field_22c5fd_IjH, (int)fiG.field_334487_mrb)) != null) {
            UMP uMP = new UMP(qnq, fiG.field_2f0dd3_div, fiG.field_22c5fd_IjH + 1.62 - (double)fiG.field_36b0a6_udO, fiG.field_334487_mrb);
            uMP.method_2be66f7f_Dne(eyB.field_2092ae_Dne, eyB.field_21260d_FWm, eyB.field_2e5f1b_bzF);
            qnq.method_94d18be5_FWm(uMP);
            qnq.method_a36f5f6a_Dne(fiG, "random.bow", 0.5f, 0.4f / (field_7331eae7_Dne.nextFloat() * 0.4f + 0.8f));
            qnq.method_bfa54b80_Dne(null, 1002, (int)fiG.field_2f0dd3_div, (int)fiG.field_22c5fd_IjH, (int)fiG.field_334487_mrb, 0);
            if (!fiG.field_37cb681_Dne.field_267d06_Qnq) {
                --nMq.field_2092ae_Dne;
            }
        }
        return nMq;
    }

    public DOM(int n) {
        super(n);
        this.method_829e7ad2_Dne(JcN.field_712c773d_aFZ);
    }
}

