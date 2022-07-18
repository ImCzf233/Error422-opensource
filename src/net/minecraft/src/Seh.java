package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class Seh {
    private boolean field_267d06_Qnq;
    private whE[] field_8373c6b3_Dne;
    private ZGT field_36fd085_Dne;
    private boolean field_2e5f2c_bzF;
    private boolean field_21261e_FWm;
    private boolean field_2092bf_Dne;
    private CIU field_365639d_Dne = new CIU();
    private Zpi field_3706cf9_Dne;

    private wdG method_e4c43b79_Dne(sMa sMa2, double d, double d2, double d3, float f) {
        this.field_365639d_Dne.method_7a46289a_Dne();
        this.field_36fd085_Dne.method_7a46289a_Dne();
        boolean bl = this.field_2e5f2c_bzF;
        int n = geR.method_117d0718_FWm(sMa2.field_373a3ed_Dne.field_212608_FWm + 0.5);
        if (this.field_267d06_Qnq && sMa2.method_9feec6c6_Zpi()) {
            n = (int)sMa2.field_373a3ed_Dne.field_212608_FWm;
            int n2 = this.field_3706cf9_Dne.method_2c2cf7bc_Dne(geR.method_117d0718_FWm(sMa2.field_2f0dd3_div), n, geR.method_117d0718_FWm(sMa2.field_334487_mrb));
            while (n2 == zKP.field_374330f_Dne.field_21260d_FWm || n2 == zKP.field_16319416_DyG.field_21260d_FWm) {
                n2 = this.field_3706cf9_Dne.method_2c2cf7bc_Dne(geR.method_117d0718_FWm(sMa2.field_2f0dd3_div), ++n, geR.method_117d0718_FWm(sMa2.field_334487_mrb));
            }
            bl = this.field_2e5f2c_bzF;
            this.field_2e5f2c_bzF = false;
        } else {
            n = geR.method_117d0718_FWm(sMa2.field_373a3ed_Dne.field_212608_FWm + 0.5);
        }
        whE whE2 = this.method_d994a766_Dne(geR.method_117d0718_FWm(sMa2.field_373a3ed_Dne.field_2092a9_Dne), n, geR.method_117d0718_FWm(sMa2.field_373a3ed_Dne.field_2e5f16_bzF));
        whE whE3 = this.method_d994a766_Dne(geR.method_117d0718_FWm(d - (double)(sMa2.field_342261_ooe / 2.0f)), geR.method_117d0718_FWm(d2), geR.method_117d0718_FWm(d3 - (double)(sMa2.field_342261_ooe / 2.0f)));
        whE whE4 = new whE(geR.method_ce7f5259_Dne(sMa2.field_342261_ooe + 1.0f), geR.method_ce7f5259_Dne(sMa2.field_367151_trS + 1.0f), geR.method_ce7f5259_Dne(sMa2.field_342261_ooe + 1.0f));
        wdG wdG2 = this.method_246f2a4a_Dne(sMa2, whE2, whE3, whE4, f);
        this.field_2e5f2c_bzF = bl;
        return wdG2;
    }

    private final whE method_d994a766_Dne(int n, int n2, int n3) {
        int n4 = whE.method_2c2cf7bc_Dne(n, n2, n3);
        whE whE2 = (whE)this.field_36fd085_Dne.method_394ba0a9_Dne(n4);
        if (whE2 == null) {
            whE2 = new whE(n, n2, n3);
            this.field_36fd085_Dne.method_ad009545_Dne(n4, whE2);
        }
        return whE2;
    }

    private int method_bf96ee66_Dne(sMa sMa2, whE whE2, whE whE3, whE whE4, float f) {
        int n = 0;
        int n2 = 0;
        if (this.method_5ae21a7d_Dne(sMa2, whE2.field_2092ae_Dne, whE2.field_21260d_FWm + 1, whE2.field_2e5f1b_bzF, whE3) == 1) {
            n2 = 1;
        }
        whE whE5 = this.method_c03ee156_Dne(sMa2, whE2.field_2092ae_Dne, whE2.field_21260d_FWm, whE2.field_2e5f1b_bzF + 1, whE3, n2);
        whE whE6 = this.method_c03ee156_Dne(sMa2, whE2.field_2092ae_Dne - 1, whE2.field_21260d_FWm, whE2.field_2e5f1b_bzF, whE3, n2);
        whE whE7 = this.method_c03ee156_Dne(sMa2, whE2.field_2092ae_Dne + 1, whE2.field_21260d_FWm, whE2.field_2e5f1b_bzF, whE3, n2);
        whE whE8 = this.method_c03ee156_Dne(sMa2, whE2.field_2092ae_Dne, whE2.field_21260d_FWm, whE2.field_2e5f1b_bzF - 1, whE3, n2);
        if (whE5 != null && !whE5.field_2092bf_Dne && whE5.method_c3c0fac3_Dne(whE4) < f) {
            this.field_8373c6b3_Dne[n++] = whE5;
        }
        if (whE6 != null && !whE6.field_2092bf_Dne && whE6.method_c3c0fac3_Dne(whE4) < f) {
            this.field_8373c6b3_Dne[n++] = whE6;
        }
        if (whE7 != null && !whE7.field_2092bf_Dne && whE7.method_c3c0fac3_Dne(whE4) < f) {
            this.field_8373c6b3_Dne[n++] = whE7;
        }
        if (whE8 != null && !whE8.field_2092bf_Dne && whE8.method_c3c0fac3_Dne(whE4) < f) {
            this.field_8373c6b3_Dne[n++] = whE8;
        }
        return n;
    }

    private whE method_c03ee156_Dne(sMa sMa2, int n, int n2, int n3, whE whE2, int n4) {
        whE whE3 = null;
        int n5 = this.method_5ae21a7d_Dne(sMa2, n, n2, n3, whE2);
        if (n5 == 2) {
            return this.method_d994a766_Dne(n, n2, n3);
        }
        if (n5 == 1) {
            whE3 = this.method_d994a766_Dne(n, n2, n3);
        }
        if (whE3 == null && n4 > 0 && n5 != -3 && n5 != -4 && this.method_5ae21a7d_Dne(sMa2, n, n2 + n4, n3, whE2) == 1) {
            whE3 = this.method_d994a766_Dne(n, n2 + n4, n3);
            n2 += n4;
        }
        if (whE3 != null) {
            int n6 = 0;
            int n7 = 0;
            while (n2 > 0) {
                n7 = this.method_5ae21a7d_Dne(sMa2, n, n2 - 1, n3, whE2);
                if (this.field_2e5f2c_bzF && n7 == -1) {
                    return null;
                }
                if (n7 != 1) break;
                if (n6++ >= sMa2.method_7c6f602c_FWm()) {
                    return null;
                }
                if (--n2 <= 0) continue;
                whE3 = this.method_d994a766_Dne(n, n2, n3);
            }
            if (n7 == -2) {
                return null;
            }
        }
        return whE3;
    }

    public Seh(Zpi zpi, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        this.field_36fd085_Dne = new ZGT();
        this.field_8373c6b3_Dne = new whE[32];
        this.field_3706cf9_Dne = zpi;
        this.field_2092bf_Dne = bl;
        this.field_21261e_FWm = bl2;
        this.field_2e5f2c_bzF = bl3;
        this.field_267d06_Qnq = bl4;
    }

    public wdG method_1c13f0fd_Dne(sMa sMa2, sMa sMa3, float f) {
        return this.method_e4c43b79_Dne(sMa2, sMa3.field_2f0dd3_div, sMa3.field_373a3ed_Dne.field_212608_FWm, sMa3.field_334487_mrb, f);
    }

    public int method_5ae21a7d_Dne(sMa sMa2, int n, int n2, int n3, whE whE2) {
        return Seh.method_30a4097d_Dne(sMa2, n, n2, n3, whE2, this.field_2e5f2c_bzF, this.field_21261e_FWm, this.field_2092bf_Dne);
    }

    public wdG method_96ef7c74_Dne(sMa sMa2, int n, int n2, int n3, float f) {
        return this.method_e4c43b79_Dne(sMa2, (float)n + 0.5f, (float)n2 + 0.5f, (float)n3 + 0.5f, f);
    }

    private wdG method_14e7a491_Dne(whE whE2, whE whE3) {
        int n = 1;
        whE whE4 = whE3;
        while (whE4.field_37d7958_Dne != null) {
            ++n;
            whE4 = whE4.field_37d7958_Dne;
        }
        whE[] whEArray = new whE[n];
        whE4 = whE3;
        whEArray[--n] = whE3;
        while (whE4.field_37d7958_Dne != null) {
            whE4 = whE4.field_37d7958_Dne;
            whEArray[--n] = whE4;
        }
        return new wdG(whEArray);
    }

    public static int method_30a4097d_Dne(sMa sMa2, int n, int n2, int n3, whE whE2, boolean bl, boolean bl2, boolean bl3) {
        boolean bl4 = false;
        for (int i = n; i < n + whE2.field_2092ae_Dne; ++i) {
            for (int j = n2; j < n2 + whE2.field_21260d_FWm; ++j) {
                for (int k = n3; k < n3 + whE2.field_2e5f1b_bzF; ++k) {
                    int n4 = sMa2.field_36c4f18_Dne.method_2c2cf7bc_Dne(i, j, k);
                    if (n4 <= 0) continue;
                    if (n4 == zKP.field_5d5a459e_edi.field_21260d_FWm) {
                        bl4 = true;
                    } else if (n4 != zKP.field_374330f_Dne.field_21260d_FWm && n4 != zKP.field_16319416_DyG.field_21260d_FWm) {
                        if (!bl3 && n4 == zKP.field_ceacd6d_ICU.field_21260d_FWm) {
                            return 0;
                        }
                    } else {
                        if (bl) {
                            return -1;
                        }
                        bl4 = true;
                    }
                    zKP zKP2 = zKP.field_8374b848_Dne[n4];
                    int n5 = zKP2.method_7a46288d_Dne();
                    if (sMa2.field_36c4f18_Dne.method_a6aca7bd_FWm(i, j, k) == 9) {
                        int n6;
                        int n7;
                        int n8 = geR.method_117d0718_FWm(sMa2.field_2f0dd3_div);
                        if (sMa2.field_36c4f18_Dne.method_a6aca7bd_FWm(n8, n7 = geR.method_117d0718_FWm(sMa2.field_22c5fd_IjH), n6 = geR.method_117d0718_FWm(sMa2.field_334487_mrb)) == 9 || sMa2.field_36c4f18_Dne.method_a6aca7bd_FWm(n8, n7 - 1, n6) == 9) continue;
                        return -3;
                    }
                    if (zKP2.method_fbabf7f3_Dne(sMa2.field_36c4f18_Dne, i, j, k) || bl2 && n4 == zKP.field_ceacd6d_ICU.field_21260d_FWm) continue;
                    if (n5 == 11 || n4 == zKP.field_b2a619d_mzX.field_21260d_FWm || n5 == 32) {
                        return -3;
                    }
                    if (n4 == zKP.field_5d5a459e_edi.field_21260d_FWm) {
                        return -4;
                    }
                    KFd kFd = zKP2.field_368fd23_Dne;
                    if (kFd != KFd.field_5b96677_IjH) {
                        return 0;
                    }
                    if (sMa2.method_7ad38807_DyG()) continue;
                    return -2;
                }
            }
        }
        return bl4 ? 2 : 1;
    }

    private wdG method_246f2a4a_Dne(sMa sMa2, whE whE2, whE whE3, whE whE4, float f) {
        whE2.field_2092ab_Dne = 0.0f;
        whE2.field_2e5f18_bzF = whE2.field_21260a_FWm = whE2.method_9d14ae84_FWm(whE3);
        this.field_365639d_Dne.method_7a46289a_Dne();
        this.field_365639d_Dne.method_b1fc1570_Dne(whE2);
        whE whE5 = whE2;
        while (!this.field_365639d_Dne.method_7a46289e_Dne()) {
            whE whE6 = this.field_365639d_Dne.method_231707b7_Dne();
            if (whE6.equals(whE3)) {
                return this.method_14e7a491_Dne(whE2, whE3);
            }
            if (whE6.method_9d14ae84_FWm(whE3) < whE5.method_9d14ae84_FWm(whE3)) {
                whE5 = whE6;
            }
            whE6.field_2092bf_Dne = true;
            int n = this.method_bf96ee66_Dne(sMa2, whE6, whE4, whE3, f);
            for (int i = 0; i < n; ++i) {
                whE whE7 = this.field_8373c6b3_Dne[i];
                float f2 = whE6.field_2092ab_Dne + whE6.method_9d14ae84_FWm(whE7);
                if (whE7.method_7a46289e_Dne() && !(f2 < whE7.field_2092ab_Dne)) continue;
                whE7.field_37d7958_Dne = whE6;
                whE7.field_2092ab_Dne = f2;
                whE7.field_21260a_FWm = whE7.method_9d14ae84_FWm(whE3);
                if (whE7.method_7a46289e_Dne()) {
                    this.field_365639d_Dne.method_b45ec74d_Dne(whE7, whE7.field_2092ab_Dne + whE7.field_21260a_FWm);
                    continue;
                }
                whE7.field_2e5f18_bzF = whE7.field_2092ab_Dne + whE7.field_21260a_FWm;
                this.field_365639d_Dne.method_b1fc1570_Dne(whE7);
            }
        }
        if (whE5 == whE2) {
            return null;
        }
        return this.method_14e7a491_Dne(whE2, whE5);
    }
}

