package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class trS {
    private final List field_f27c122c_Dne;
    private final Tfm field_36d8db1_Dne = new Tfm();
    private final Random field_7331eae7_Dne;
    private final RAN field_36c164d_Dne;

    public void method_c7c9ef22_Dne(sMa sMa2, double d, double d2, double d3, float f) {
        if (this.field_36c164d_Dne.field_3690d00_Dne.field_2092ae_Dne != 1) {
            if (!this.method_c7c9ef26_Dne(sMa2, d, d2, d3, f)) {
                this.method_bb7dd824_Dne(sMa2);
                this.method_c7c9ef26_Dne(sMa2, d, d2, d3, f);
            }
        } else {
            int n = geR.method_117d0718_FWm(sMa2.field_2f0dd3_div);
            int n2 = geR.method_117d0718_FWm(sMa2.field_22c5fd_IjH) - 1;
            int n3 = geR.method_117d0718_FWm(sMa2.field_334487_mrb);
            int n4 = 1;
            int n5 = 0;
            for (int i = -2; i <= 2; ++i) {
                for (int j = -2; j <= 2; ++j) {
                    for (int k = -1; k < 3; ++k) {
                        int n6 = n + j * n4 + i * n5;
                        int n7 = n2 + k;
                        int n8 = n3 + j * n5 - i * n4;
                        boolean bl = k < 0;
                        this.field_36c164d_Dne.method_2ee8c47d_FWm(n6, n7, n8, bl ? zKP.field_e641c680_cot.field_21260d_FWm : 0);
                    }
                }
            }
            sMa2.method_9ce0fc65_FWm(n, n2, n3, sMa2.field_334489_mrb, 0.0f);
            sMa2.field_31b811_kGO = 0.0;
            sMa2.field_2a9ad1_Zpi = 0.0;
            sMa2.field_291868_XHL = 0.0;
        }
    }

    public boolean method_bb7dd824_Dne(sMa sMa2) {
        boolean bl;
        double d;
        double d2;
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        double d3;
        int n11;
        double d4;
        int n12;
        int n13 = 16;
        double d5 = -1.0;
        int n14 = geR.method_117d0718_FWm(sMa2.field_2f0dd3_div);
        int n15 = geR.method_117d0718_FWm(sMa2.field_22c5fd_IjH);
        int n16 = geR.method_117d0718_FWm(sMa2.field_334487_mrb);
        int n17 = n14;
        int n18 = n15;
        int n19 = n16;
        int n20 = 0;
        int n21 = this.field_7331eae7_Dne.nextInt(4);
        for (n12 = n14 - n13; n12 <= n14 + n13; ++n12) {
            d4 = (double)n12 + 0.5 - sMa2.field_2f0dd3_div;
            for (n11 = n16 - n13; n11 <= n16 + n13; ++n11) {
                d3 = (double)n11 + 0.5 - sMa2.field_334487_mrb;
                block2: for (n10 = this.field_36c164d_Dne.method_ae128dba_bzF() - 1; n10 >= 0; --n10) {
                    if (!this.field_36c164d_Dne.method_2c2cf7cd_Dne(n12, n10, n11)) continue;
                    while (n10 > 0 && this.field_36c164d_Dne.method_2c2cf7cd_Dne(n12, n10 - 1, n11)) {
                        --n10;
                    }
                    for (n9 = n21; n9 < n21 + 4; ++n9) {
                        n8 = n9 % 2;
                        n7 = 1 - n8;
                        if (n9 % 4 >= 2) {
                            n8 = -n8;
                            n7 = -n7;
                        }
                        for (n6 = 0; n6 < 3; ++n6) {
                            for (n5 = 0; n5 < 4; ++n5) {
                                for (n4 = -1; n4 < 4; ++n4) {
                                    n3 = n12 + (n5 - 1) * n8 + n6 * n7;
                                    n2 = n10 + n4;
                                    n = n11 + (n5 - 1) * n7 - n6 * n8;
                                    if (n4 < 0 && !this.field_36c164d_Dne.method_d9802b31_Dne(n3, n2, n).method_7a46289e_Dne() || n4 >= 0 && !this.field_36c164d_Dne.method_2c2cf7cd_Dne(n3, n2, n)) continue block2;
                                }
                            }
                        }
                        d2 = (double)n10 + 0.5 - sMa2.field_22c5fd_IjH;
                        d = d4 * d4 + d2 * d2 + d3 * d3;
                        if (!(d5 < 0.0) && !(d < d5)) continue;
                        d5 = d;
                        n17 = n12;
                        n18 = n10;
                        n19 = n11;
                        n20 = n9 % 4;
                    }
                }
            }
        }
        if (d5 < 0.0) {
            for (n12 = n14 - n13; n12 <= n14 + n13; ++n12) {
                d4 = (double)n12 + 0.5 - sMa2.field_2f0dd3_div;
                for (n11 = n16 - n13; n11 <= n16 + n13; ++n11) {
                    d3 = (double)n11 + 0.5 - sMa2.field_334487_mrb;
                    block10: for (n10 = this.field_36c164d_Dne.method_ae128dba_bzF() - 1; n10 >= 0; --n10) {
                        if (!this.field_36c164d_Dne.method_2c2cf7cd_Dne(n12, n10, n11)) continue;
                        while (n10 > 0 && this.field_36c164d_Dne.method_2c2cf7cd_Dne(n12, n10 - 1, n11)) {
                            --n10;
                        }
                        for (n9 = n21; n9 < n21 + 2; ++n9) {
                            n8 = n9 % 2;
                            n7 = 1 - n8;
                            for (n6 = 0; n6 < 4; ++n6) {
                                for (n5 = -1; n5 < 4; ++n5) {
                                    n4 = n12 + (n6 - 1) * n8;
                                    n3 = n10 + n5;
                                    n2 = n11 + (n6 - 1) * n7;
                                    if (n5 < 0 && !this.field_36c164d_Dne.method_d9802b31_Dne(n4, n3, n2).method_7a46289e_Dne() || n5 >= 0 && !this.field_36c164d_Dne.method_2c2cf7cd_Dne(n4, n3, n2)) continue block10;
                                }
                            }
                            d2 = (double)n10 + 0.5 - sMa2.field_22c5fd_IjH;
                            d = d4 * d4 + d2 * d2 + d3 * d3;
                            if (!(d5 < 0.0) && !(d < d5)) continue;
                            d5 = d;
                            n17 = n12;
                            n18 = n10;
                            n19 = n11;
                            n20 = n9 % 2;
                        }
                    }
                }
            }
        }
        n = n17;
        int n22 = n18;
        n11 = n19;
        int n23 = n20 % 2;
        int n24 = 1 - n23;
        if (n20 % 4 >= 2) {
            n23 = -n23;
            n24 = -n24;
        }
        if (d5 < 0.0) {
            if (n18 < 70) {
                n18 = 70;
            }
            if (n18 > this.field_36c164d_Dne.method_ae128dba_bzF() - 10) {
                n18 = this.field_36c164d_Dne.method_ae128dba_bzF() - 10;
            }
            n22 = n18;
            for (n10 = -1; n10 <= 1; ++n10) {
                for (n9 = 1; n9 < 3; ++n9) {
                    for (n8 = -1; n8 < 3; ++n8) {
                        n7 = n + (n9 - 1) * n23 + n10 * n24;
                        n6 = n22 + n8;
                        n5 = n11 + (n9 - 1) * n24 - n10 * n23;
                        bl = n8 < 0;
                        this.field_36c164d_Dne.method_2ee8c47d_FWm(n7, n6, n5, bl ? zKP.field_e641c680_cot.field_21260d_FWm : 0);
                    }
                }
            }
        }
        for (n10 = 0; n10 < 4; ++n10) {
            for (n9 = 0; n9 < 4; ++n9) {
                for (n8 = -1; n8 < 4; ++n8) {
                    n7 = n + (n9 - 1) * n23;
                    n6 = n22 + n8;
                    n5 = n11 + (n9 - 1) * n24;
                    bl = n9 == 0 || n9 == 3 || n8 == -1 || n8 == 3;
                    this.field_36c164d_Dne.method_17d7ea9d_FWm(n7, n6, n5, bl ? zKP.field_e641c680_cot.field_21260d_FWm : zKP.field_36c4090_Dne.field_21260d_FWm, 0, 2);
                }
            }
            for (n9 = 0; n9 < 4; ++n9) {
                for (n8 = -1; n8 < 4; ++n8) {
                    n7 = n + (n9 - 1) * n23;
                    n6 = n22 + n8;
                    n5 = n11 + (n9 - 1) * n24;
                    this.field_36c164d_Dne.method_58fe7b07_bzF(n7, n6, n5, this.field_36c164d_Dne.method_2c2cf7bc_Dne(n7, n6, n5));
                }
            }
        }
        return true;
    }

    public void method_ce7f616a_Dne(long l) {
        if (l % 100L == 0L) {
            Iterator iterator = this.field_f27c122c_Dne.iterator();
            long l2 = l - 600L;
            while (iterator.hasNext()) {
                Long l3 = (Long)iterator.next();
                qLR qLR2 = (qLR)this.field_36d8db1_Dne.method_20ed7708_Dne(l3);
                if (qLR2 != null && qLR2.field_2092af_Dne >= l2) continue;
                iterator.remove();
                this.field_36d8db1_Dne.method_a2a9a4e7_FWm(l3);
            }
        }
    }

    public trS(RAN rAN) {
        this.field_f27c122c_Dne = new ArrayList();
        this.field_36c164d_Dne = rAN;
        this.field_7331eae7_Dne = new Random(rAN.method_7a46288e_Dne());
    }

    public boolean method_c7c9ef26_Dne(sMa sMa2, double d, double d2, double d3, float f) {
        double d4;
        int n;
        int n2;
        int n3 = 128;
        double d5 = -1.0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = geR.method_117d0718_FWm(sMa2.field_2f0dd3_div);
        int n8 = geR.method_117d0718_FWm(sMa2.field_334487_mrb);
        long l = Sxs.method_16cca6e_Dne(n7, n8);
        boolean bl = true;
        if (this.field_36d8db1_Dne.method_ce7f616e_Dne(l)) {
            qLR qLR2 = (qLR)this.field_36d8db1_Dne.method_20ed7708_Dne(l);
            d5 = 0.0;
            n4 = qLR2.field_2092ae_Dne;
            n5 = qLR2.field_21260d_FWm;
            n6 = qLR2.field_2e5f1b_bzF;
            qLR2.field_2092af_Dne = this.field_36c164d_Dne.method_7c6f602d_FWm();
            bl = false;
        } else {
            for (n2 = n7 - n3; n2 <= n7 + n3; ++n2) {
                double d6 = (double)n2 + 0.5 - sMa2.field_2f0dd3_div;
                for (int i = n8 - n3; i <= n8 + n3; ++i) {
                    double d7 = (double)i + 0.5 - sMa2.field_334487_mrb;
                    for (n = this.field_36c164d_Dne.method_ae128dba_bzF() - 1; n >= 0; --n) {
                        if (this.field_36c164d_Dne.method_2c2cf7bc_Dne(n2, n, i) != zKP.field_36c4090_Dne.field_21260d_FWm) continue;
                        while (this.field_36c164d_Dne.method_2c2cf7bc_Dne(n2, n - 1, i) == zKP.field_36c4090_Dne.field_21260d_FWm) {
                            --n;
                        }
                        d4 = (double)n + 0.5 - sMa2.field_22c5fd_IjH;
                        double d8 = d6 * d6 + d4 * d4 + d7 * d7;
                        if (!(d5 < 0.0) && !(d8 < d5)) continue;
                        d5 = d8;
                        n4 = n2;
                        n5 = n;
                        n6 = i;
                    }
                }
            }
        }
        if (d5 >= 0.0) {
            if (bl) {
                this.field_36d8db1_Dne.method_b9998ac6_Dne(l, new qLR(this, n4, n5, n6, this.field_36c164d_Dne.method_7c6f602d_FWm()));
                this.field_f27c122c_Dne.add(l);
            }
            double d9 = (double)n4 + 0.5;
            double d10 = (double)n5 + 0.5;
            d4 = (double)n6 + 0.5;
            int n9 = -1;
            if (this.field_36c164d_Dne.method_2c2cf7bc_Dne(n4 - 1, n5, n6) == zKP.field_36c4090_Dne.field_21260d_FWm) {
                n9 = 2;
            }
            if (this.field_36c164d_Dne.method_2c2cf7bc_Dne(n4 + 1, n5, n6) == zKP.field_36c4090_Dne.field_21260d_FWm) {
                n9 = 0;
            }
            if (this.field_36c164d_Dne.method_2c2cf7bc_Dne(n4, n5, n6 - 1) == zKP.field_36c4090_Dne.field_21260d_FWm) {
                n9 = 3;
            }
            if (this.field_36c164d_Dne.method_2c2cf7bc_Dne(n4, n5, n6 + 1) == zKP.field_36c4090_Dne.field_21260d_FWm) {
                n9 = 1;
            }
            n = sMa2.method_8288d6e1_IjH();
            if (n9 > -1) {
                boolean bl2;
                int n10 = zxJ.field_3f1c589_Dne[n9];
                int n11 = zxJ.field_3f65500_DyG[n9];
                int n12 = zxJ.field_3f1c589_Dne[n11];
                int n13 = zxJ.field_4039e0a_FWm[n9];
                int n14 = zxJ.field_4039e0a_FWm[n11];
                boolean bl3 = !this.field_36c164d_Dne.method_2c2cf7cd_Dne(n4 + n10 + n12, n5, n6 + n13 + n14) || !this.field_36c164d_Dne.method_2c2cf7cd_Dne(n4 + n10 + n12, n5 + 1, n6 + n13 + n14);
                boolean bl4 = bl2 = !this.field_36c164d_Dne.method_2c2cf7cd_Dne(n4 + n10, n5, n6 + n13) || !this.field_36c164d_Dne.method_2c2cf7cd_Dne(n4 + n10, n5 + 1, n6 + n13);
                if (bl3 && bl2) {
                    n9 = zxJ.field_5781703_aFZ[n9];
                    n11 = zxJ.field_5781703_aFZ[n11];
                    n10 = zxJ.field_3f1c589_Dne[n9];
                    n13 = zxJ.field_4039e0a_FWm[n9];
                    n12 = zxJ.field_3f1c589_Dne[n11];
                    n14 = zxJ.field_4039e0a_FWm[n11];
                    n2 = n4 - n12;
                    d9 -= (double)n12;
                    int n15 = n6 - n14;
                    d4 -= (double)n14;
                    bl3 = !this.field_36c164d_Dne.method_2c2cf7cd_Dne(n2 + n10 + n12, n5, n15 + n13 + n14) || !this.field_36c164d_Dne.method_2c2cf7cd_Dne(n2 + n10 + n12, n5 + 1, n15 + n13 + n14);
                    bl2 = !this.field_36c164d_Dne.method_2c2cf7cd_Dne(n2 + n10, n5, n15 + n13) || !this.field_36c164d_Dne.method_2c2cf7cd_Dne(n2 + n10, n5 + 1, n15 + n13);
                }
                float f2 = 0.5f;
                float f3 = 0.5f;
                if (!bl3 && bl2) {
                    f2 = 1.0f;
                } else if (bl3 && !bl2) {
                    f2 = 0.0f;
                } else if (bl3 && bl2) {
                    f3 = 0.0f;
                }
                d9 += (double)((float)n12 * f2 + f3 * (float)n10);
                d4 += (double)((float)n14 * f2 + f3 * (float)n13);
                float f4 = 0.0f;
                float f5 = 0.0f;
                float f6 = 0.0f;
                float f7 = 0.0f;
                if (n9 == n) {
                    f4 = 1.0f;
                    f5 = 1.0f;
                } else if (n9 == zxJ.field_5781703_aFZ[n]) {
                    f4 = -1.0f;
                    f5 = -1.0f;
                } else if (n9 == zxJ.field_6d92991_zGp[n]) {
                    f6 = 1.0f;
                    f7 = -1.0f;
                } else {
                    f6 = -1.0f;
                    f7 = 1.0f;
                }
                double d11 = sMa2.field_291868_XHL;
                double d12 = sMa2.field_31b811_kGO;
                sMa2.field_291868_XHL = d11 * (double)f4 + d12 * (double)f7;
                sMa2.field_31b811_kGO = d11 * (double)f6 + d12 * (double)f5;
                sMa2.field_334489_mrb = f - (float)(n * 90) + (float)(n9 * 90);
            } else {
                sMa2.field_31b811_kGO = 0.0;
                sMa2.field_2a9ad1_Zpi = 0.0;
                sMa2.field_291868_XHL = 0.0;
            }
            sMa2.method_9ce0fc65_FWm(d9, d10, d4, sMa2.field_334489_mrb, sMa2.field_29186a_XHL);
            return true;
        }
        return false;
    }
}

