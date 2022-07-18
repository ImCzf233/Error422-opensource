package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class aJO
implements ZfC {
    public xvE field_2037ee24_FWm;
    public gpt field_3765721_Dne = new gpt();
    private xvE field_75c5f032_bzF;
    double[] field_4039e05_FWm;
    double[] field_3f1c584_Dne;
    private xvE field_16314b6e_DyG;
    private xvE field_5e67910c_Qnq;
    private Qnq field_36c4f18_Dne;
    public xvE field_37e2245_Dne;
    private double[] field_435fcb0_IjH;
    private double[] field_3f654fb_DyG = new double[256];
    private double[] field_6d9298c_zGp;
    private xvE field_7141a68b_aFZ;
    private Suj field_36d5144_Dne;
    private xvE field_f0afe13d_zGp;
    double[] field_59d86b7_bzF;
    private Random field_7331eae7_Dne;
    private double[] field_5b2af9a_div = new double[256];
    double[] field_57816fe_aFZ;
    double[] field_4a9241d_Qnq;

    @Override
    public boolean method_5f7a671f_Dne(boolean bl, TaY taY) {
        return true;
    }

    @Override
    public EyB method_2849cfe9_Dne(Qnq qnq, String string, int n, int n2, int n3) {
        return null;
    }

    @Override
    public int method_7a46288d_Dne() {
        return 0;
    }

    @Override
    public String method_eecad346_Dne() {
        return "HellRandomLevelSource";
    }

    @Override
    public qMV method_e1796070_FWm(int n, int n2) {
        return this.method_90569c11_Dne(n, n2);
    }

    @Override
    public qMV method_90569c11_Dne(int n, int n2) {
        this.field_7331eae7_Dne.setSeed((long)n * 341873128712L + (long)n2 * 132897987541L);
        byte[] byArray = new byte[32768];
        this.method_597a88c1_Dne(n, n2, byArray);
        this.method_2ef0d8e0_FWm(n, n2, byArray);
        this.field_36d5144_Dne.method_8e161084_Dne(this, this.field_36c4f18_Dne, n, n2, byArray);
        this.field_3765721_Dne.method_8e161084_Dne(this, this.field_36c4f18_Dne, n, n2, byArray);
        qMV qMV2 = new qMV(this.field_36c4f18_Dne, byArray, n, n2);
        OdI[] odIArray = this.field_36c4f18_Dne.method_2315aa7b_Dne().method_f1decbbd_FWm(null, n * 16, n2 * 16, 16, 16);
        byte[] byArray2 = qMV2.method_ce7eeb83_Dne();
        for (int i = 0; i < byArray2.length; ++i) {
            byArray2[i] = (byte)odIArray[i].field_267cf5_Qnq;
        }
        qMV2.method_7ad38803_DyG();
        return qMV2;
    }

    @Override
    public void method_a5c3b570_Dne(ZfC zfC, int n, int n2) {
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        ZgW.field_2092bf_Dne = true;
        int n9 = n * 16;
        int n10 = n2 * 16;
        this.field_3765721_Dne.method_37de1363_Dne(this.field_36c4f18_Dne, this.field_7331eae7_Dne, n, n2);
        for (n8 = 0; n8 < 8; ++n8) {
            n7 = n9 + this.field_7331eae7_Dne.nextInt(16) + 8;
            n6 = this.field_7331eae7_Dne.nextInt(120) + 4;
            n5 = n10 + this.field_7331eae7_Dne.nextInt(16) + 8;
            new qqL(zKP.field_202dfeee_FWm.field_21260d_FWm, false).method_c3e4cb88_Dne(this.field_36c4f18_Dne, this.field_7331eae7_Dne, n7, n6, n5);
        }
        n8 = this.field_7331eae7_Dne.nextInt(this.field_7331eae7_Dne.nextInt(10) + 1) + 1;
        for (n7 = 0; n7 < n8; ++n7) {
            n6 = n9 + this.field_7331eae7_Dne.nextInt(16) + 8;
            n5 = this.field_7331eae7_Dne.nextInt(120) + 4;
            n4 = n10 + this.field_7331eae7_Dne.nextInt(16) + 8;
            new ipf().method_c3e4cb88_Dne(this.field_36c4f18_Dne, this.field_7331eae7_Dne, n6, n5, n4);
        }
        n8 = this.field_7331eae7_Dne.nextInt(this.field_7331eae7_Dne.nextInt(10) + 1);
        for (n7 = 0; n7 < n8; ++n7) {
            n6 = n9 + this.field_7331eae7_Dne.nextInt(16) + 8;
            n5 = this.field_7331eae7_Dne.nextInt(120) + 4;
            n4 = n10 + this.field_7331eae7_Dne.nextInt(16) + 8;
            new iNH().method_c3e4cb88_Dne(this.field_36c4f18_Dne, this.field_7331eae7_Dne, n6, n5, n4);
        }
        for (n7 = 0; n7 < 10; ++n7) {
            n6 = n9 + this.field_7331eae7_Dne.nextInt(16) + 8;
            n5 = this.field_7331eae7_Dne.nextInt(128);
            n4 = n10 + this.field_7331eae7_Dne.nextInt(16) + 8;
            new mzX().method_c3e4cb88_Dne(this.field_36c4f18_Dne, this.field_7331eae7_Dne, n6, n5, n4);
        }
        if (this.field_7331eae7_Dne.nextInt(1) == 0) {
            n7 = n9 + this.field_7331eae7_Dne.nextInt(16) + 8;
            n6 = this.field_7331eae7_Dne.nextInt(128);
            n5 = n10 + this.field_7331eae7_Dne.nextInt(16) + 8;
            new LDH(zKP.field_75be630e_bzF.field_21260d_FWm).method_c3e4cb88_Dne(this.field_36c4f18_Dne, this.field_7331eae7_Dne, n7, n6, n5);
        }
        if (this.field_7331eae7_Dne.nextInt(1) == 0) {
            n7 = n9 + this.field_7331eae7_Dne.nextInt(16) + 8;
            n6 = this.field_7331eae7_Dne.nextInt(128);
            n5 = n10 + this.field_7331eae7_Dne.nextInt(16) + 8;
            new LDH(zKP.field_5e6003e8_Qnq.field_21260d_FWm).method_c3e4cb88_Dne(this.field_36c4f18_Dne, this.field_7331eae7_Dne, n7, n6, n5);
        }
        uzC uzC2 = new uzC(zKP.field_66394b98_NEG.field_21260d_FWm, 13, zKP.field_b3a6b297_KLR.field_21260d_FWm);
        for (n6 = 0; n6 < 16; ++n6) {
            n5 = n9 + this.field_7331eae7_Dne.nextInt(16);
            n4 = this.field_7331eae7_Dne.nextInt(108) + 10;
            n3 = n10 + this.field_7331eae7_Dne.nextInt(16);
            uzC2.method_c3e4cb88_Dne(this.field_36c4f18_Dne, this.field_7331eae7_Dne, n5, n4, n3);
        }
        for (n6 = 0; n6 < 16; ++n6) {
            n5 = n9 + this.field_7331eae7_Dne.nextInt(16);
            n4 = this.field_7331eae7_Dne.nextInt(108) + 10;
            n3 = n10 + this.field_7331eae7_Dne.nextInt(16);
            new qqL(zKP.field_202dfeee_FWm.field_21260d_FWm, true).method_c3e4cb88_Dne(this.field_36c4f18_Dne, this.field_7331eae7_Dne, n5, n4, n3);
        }
        ZgW.field_2092bf_Dne = false;
    }

    @Override
    public void method_7a46289a_Dne() {
    }

    @Override
    public boolean method_16cca7e_Dne(int n, int n2) {
        return true;
    }

    public void method_2ef0d8e0_FWm(int n, int n2, byte[] byArray) {
        int n3 = 64;
        double d = 0.03125;
        this.field_3f654fb_DyG = this.field_f0afe13d_zGp.method_514f0fe4_Dne(this.field_3f654fb_DyG, n * 16, n2 * 16, 0, 16, 16, 1, d, d, 1.0);
        this.field_5b2af9a_div = this.field_f0afe13d_zGp.method_514f0fe4_Dne(this.field_5b2af9a_div, n * 16, 109, n2 * 16, 16, 1, 16, d, 1.0, d);
        this.field_435fcb0_IjH = this.field_16314b6e_DyG.method_514f0fe4_Dne(this.field_435fcb0_IjH, n * 16, n2 * 16, 0, 16, 16, 1, d * 2.0, d * 2.0, d * 2.0);
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                boolean bl = this.field_3f654fb_DyG[i + j * 16] + this.field_7331eae7_Dne.nextDouble() * 0.2 > 0.0;
                boolean bl2 = this.field_5b2af9a_div[i + j * 16] + this.field_7331eae7_Dne.nextDouble() * 0.2 > 0.0;
                int n4 = (int)(this.field_435fcb0_IjH[i + j * 16] / 3.0 + 3.0 + this.field_7331eae7_Dne.nextDouble() * 0.25);
                int n5 = -1;
                byte by = (byte)zKP.field_b3a6b297_KLR.field_21260d_FWm;
                byte by2 = (byte)zKP.field_b3a6b297_KLR.field_21260d_FWm;
                for (int k = 127; k >= 0; --k) {
                    int n6 = (j * 16 + i) * 128 + k;
                    if (k < 127 - this.field_7331eae7_Dne.nextInt(5) && k > 0 + this.field_7331eae7_Dne.nextInt(5)) {
                        byte by3 = byArray[n6];
                        if (by3 == 0) {
                            n5 = -1;
                            continue;
                        }
                        if (by3 != zKP.field_b3a6b297_KLR.field_21260d_FWm) continue;
                        if (n5 == -1) {
                            if (n4 <= 0) {
                                by = 0;
                                by2 = (byte)zKP.field_b3a6b297_KLR.field_21260d_FWm;
                            } else if (k >= n3 - 4 && k <= n3 + 1) {
                                by = (byte)zKP.field_b3a6b297_KLR.field_21260d_FWm;
                                by2 = (byte)zKP.field_b3a6b297_KLR.field_21260d_FWm;
                                if (bl2) {
                                    by = (byte)zKP.field_7508fdcb_mrb.field_21260d_FWm;
                                }
                                if (bl2) {
                                    by2 = (byte)zKP.field_b3a6b297_KLR.field_21260d_FWm;
                                }
                                if (bl) {
                                    by = (byte)zKP.field_9483e5e0_Suj.field_21260d_FWm;
                                }
                                if (bl) {
                                    by2 = (byte)zKP.field_9483e5e0_Suj.field_21260d_FWm;
                                }
                            }
                            if (k < n3 && by == 0) {
                                by = (byte)zKP.field_14274117_div.field_21260d_FWm;
                            }
                            n5 = n4;
                            if (k >= n3 - 1) {
                                byArray[n6] = by;
                                continue;
                            }
                            byArray[n6] = by2;
                            continue;
                        }
                        if (n5 <= 0) continue;
                        --n5;
                        byArray[n6] = by2;
                        continue;
                    }
                    byArray[n6] = (byte)zKP.field_f0b029e5_zGp.field_21260d_FWm;
                }
            }
        }
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return false;
    }

    public void method_597a88c1_Dne(int n, int n2, byte[] byArray) {
        int n3 = 4;
        int n4 = 32;
        int n5 = n3 + 1;
        int n6 = 17;
        int n7 = n3 + 1;
        this.field_6d9298c_zGp = this.method_86ee7ffc_Dne(this.field_6d9298c_zGp, n * n3, 0, n2 * n3, n5, n6, n7);
        for (int i = 0; i < n3; ++i) {
            for (int j = 0; j < n3; ++j) {
                for (int k = 0; k < 16; ++k) {
                    double d = 0.125;
                    double d2 = this.field_6d9298c_zGp[((i + 0) * n7 + j + 0) * n6 + k + 0];
                    double d3 = this.field_6d9298c_zGp[((i + 0) * n7 + j + 1) * n6 + k + 0];
                    double d4 = this.field_6d9298c_zGp[((i + 1) * n7 + j + 0) * n6 + k + 0];
                    double d5 = this.field_6d9298c_zGp[((i + 1) * n7 + j + 1) * n6 + k + 0];
                    double d6 = (this.field_6d9298c_zGp[((i + 0) * n7 + j + 0) * n6 + k + 1] - d2) * d;
                    double d7 = (this.field_6d9298c_zGp[((i + 0) * n7 + j + 1) * n6 + k + 1] - d3) * d;
                    double d8 = (this.field_6d9298c_zGp[((i + 1) * n7 + j + 0) * n6 + k + 1] - d4) * d;
                    double d9 = (this.field_6d9298c_zGp[((i + 1) * n7 + j + 1) * n6 + k + 1] - d5) * d;
                    for (int i2 = 0; i2 < 8; ++i2) {
                        double d10 = 0.25;
                        double d11 = d2;
                        double d12 = d3;
                        double d13 = (d4 - d2) * d10;
                        double d14 = (d5 - d3) * d10;
                        for (int i3 = 0; i3 < 4; ++i3) {
                            int n8 = i3 + i * 4 << 11 | 0 + j * 4 << 7 | k * 8 + i2;
                            int n9 = 128;
                            double d15 = 0.25;
                            double d16 = d11;
                            double d17 = (d12 - d11) * d15;
                            for (int i4 = 0; i4 < 4; ++i4) {
                                int n10 = 0;
                                if (k * 8 + i2 < n4) {
                                    n10 = zKP.field_14274117_div.field_21260d_FWm;
                                }
                                if (d16 > 0.0) {
                                    n10 = zKP.field_b3a6b297_KLR.field_21260d_FWm;
                                }
                                byArray[n8] = (byte)n10;
                                n8 += n9;
                                d16 += d17;
                            }
                            d11 += d13;
                            d12 += d14;
                        }
                        d2 += d6;
                        d3 += d7;
                        d4 += d8;
                        d5 += d9;
                    }
                }
            }
        }
    }

    private double[] method_86ee7ffc_Dne(double[] dArray, int n, int n2, int n3, int n4, int n5, int n6) {
        int n7;
        if (dArray == null) {
            dArray = new double[n4 * n5 * n6];
        }
        double d = 684.412;
        double d2 = 2053.236;
        this.field_4a9241d_Qnq = this.field_37e2245_Dne.method_514f0fe4_Dne(this.field_4a9241d_Qnq, n, n2, n3, n4, 1, n6, 1.0, 0.0, 1.0);
        this.field_57816fe_aFZ = this.field_2037ee24_FWm.method_514f0fe4_Dne(this.field_57816fe_aFZ, n, n2, n3, n4, 1, n6, 100.0, 0.0, 100.0);
        this.field_3f1c584_Dne = this.field_7141a68b_aFZ.method_514f0fe4_Dne(this.field_3f1c584_Dne, n, n2, n3, n4, n5, n6, d / 80.0, d2 / 60.0, d / 80.0);
        this.field_4039e05_FWm = this.field_75c5f032_bzF.method_514f0fe4_Dne(this.field_4039e05_FWm, n, n2, n3, n4, n5, n6, d, d2, d);
        this.field_59d86b7_bzF = this.field_5e67910c_Qnq.method_514f0fe4_Dne(this.field_59d86b7_bzF, n, n2, n3, n4, n5, n6, d, d2, d);
        int n8 = 0;
        int n9 = 0;
        double[] dArray2 = new double[n5];
        for (n7 = 0; n7 < n5; ++n7) {
            dArray2[n7] = Math.cos((double)n7 * Math.PI * 6.0 / (double)n5) * 2.0;
            double d3 = n7;
            if (n7 > n5 / 2) {
                d3 = n5 - 1 - n7;
            }
            if (!(d3 < 4.0)) continue;
            d3 = 4.0 - d3;
            int n10 = n7;
            dArray2[n10] = dArray2[n10] - d3 * d3 * d3 * 10.0;
        }
        for (n7 = 0; n7 < n4; ++n7) {
            for (int i = 0; i < n6; ++i) {
                double d4 = (this.field_4a9241d_Qnq[n9] + 256.0) / 512.0;
                if (d4 > 1.0) {
                    d4 = 1.0;
                }
                double d5 = 0.0;
                double d6 = this.field_57816fe_aFZ[n9] / 8000.0;
                if (d6 < 0.0) {
                    d6 = -d6;
                }
                if ((d6 = d6 * 3.0 - 3.0) < 0.0) {
                    if ((d6 /= 2.0) < -1.0) {
                        d6 = -1.0;
                    }
                    d6 /= 1.4;
                    d6 /= 2.0;
                    d4 = 0.0;
                } else {
                    if (d6 > 1.0) {
                        d6 = 1.0;
                    }
                    d6 /= 6.0;
                }
                d4 += 0.5;
                d6 = d6 * (double)n5 / 16.0;
                ++n9;
                for (int j = 0; j < n5; ++j) {
                    double d7;
                    double d8 = 0.0;
                    double d9 = dArray2[j];
                    double d10 = this.field_4039e05_FWm[n8] / 512.0;
                    double d11 = this.field_59d86b7_bzF[n8] / 512.0;
                    double d12 = (this.field_3f1c584_Dne[n8] / 10.0 + 1.0) / 2.0;
                    d8 = d12 < 0.0 ? d10 : (d12 > 1.0 ? d11 : d10 + (d11 - d10) * d12);
                    d8 -= d9;
                    if (j > n5 - 4) {
                        d7 = (float)(j - (n5 - 4)) / 3.0f;
                        d8 = d8 * (1.0 - d7) + -10.0 * d7;
                    }
                    if ((double)j < d5) {
                        d7 = (d5 - (double)j) / 4.0;
                        if (d7 < 0.0) {
                            d7 = 0.0;
                        }
                        if (d7 > 1.0) {
                            d7 = 1.0;
                        }
                        d8 = d8 * (1.0 - d7) + -10.0 * d7;
                    }
                    dArray[n8] = d8;
                    ++n8;
                }
            }
        }
        return dArray;
    }

    public aJO(Qnq qnq, long l) {
        this.field_435fcb0_IjH = new double[256];
        this.field_36d5144_Dne = new fYA();
        this.field_36c4f18_Dne = qnq;
        this.field_7331eae7_Dne = new Random(l);
        this.field_75c5f032_bzF = new xvE(this.field_7331eae7_Dne, 16);
        this.field_5e67910c_Qnq = new xvE(this.field_7331eae7_Dne, 16);
        this.field_7141a68b_aFZ = new xvE(this.field_7331eae7_Dne, 8);
        this.field_f0afe13d_zGp = new xvE(this.field_7331eae7_Dne, 4);
        this.field_16314b6e_DyG = new xvE(this.field_7331eae7_Dne, 4);
        this.field_37e2245_Dne = new xvE(this.field_7331eae7_Dne, 10);
        this.field_2037ee24_FWm = new xvE(this.field_7331eae7_Dne, 16);
    }

    @Override
    public List method_c5f979a2_Dne(Icc icc, int n, int n2, int n3) {
        if (icc == Icc.field_3688123_Dne && this.field_3765721_Dne.method_2c2cf7cd_Dne(n, n2, n3)) {
            return this.field_3765721_Dne.method_adea226d_Dne();
        }
        OdI odI = this.field_36c4f18_Dne.method_90477c37_Dne(n, n3);
        return odI == null ? null : odI.method_32fd9ea9_Dne(icc);
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return true;
    }

    @Override
    public void method_16cca7a_Dne(int n, int n2) {
        this.field_3765721_Dne.method_8e161084_Dne(this, this.field_36c4f18_Dne, n, n2, null);
    }
}

