package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class XwR
implements ZfC {
    private double[] field_6d9298c_zGp;
    double[] field_4a9241d_Qnq;
    private double[] field_3f654fb_DyG = new double[256];
    private xvE field_16314b6e_DyG;
    float[] field_3f1c586_Dne;
    public xvE field_75c5f032_bzF;
    private OdI[] field_83618953_Dne;
    private tMg field_37bbafe_Dne;
    private Khi field_3697d60_Dne;
    public xvE field_2037ee24_FWm;
    double[] field_57816fe_aFZ;
    private xvE field_f0afe13d_zGp;
    double[] field_3f1c584_Dne;
    private xvE field_5e67910c_Qnq;
    private Kvh field_369b1cf_Dne;
    private Suj field_36d5144_Dne = new KLR();
    private Suj field_20271d23_FWm;
    private xvE field_7141a68b_aFZ;
    private Random field_7331eae7_Dne;
    double[] field_4039e05_FWm;
    private final boolean field_2092bf_Dne;
    private cXw field_3742bea_Dne;
    public xvE field_37e2245_Dne;
    private Qnq field_36c4f18_Dne;
    double[] field_59d86b7_bzF;
    int[][] field_7a46ee0e_Dne;

    @Override
    public qMV method_90569c11_Dne(int n, int n2) {
        this.field_7331eae7_Dne.setSeed((long)n * 341873128712L + (long)n2 * 132897987541L);
        byte[] byArray = new byte[32768];
        this.method_597a88c1_Dne(n, n2, byArray);
        this.field_83618953_Dne = this.field_36c4f18_Dne.method_2315aa7b_Dne().method_f1decbbd_FWm(this.field_83618953_Dne, n * 16, n2 * 16, 16, 16);
        this.method_cc75c059_Dne(n, n2, byArray, this.field_83618953_Dne);
        this.field_36d5144_Dne.method_8e161084_Dne(this, this.field_36c4f18_Dne, n, n2, byArray);
        this.field_20271d23_FWm.method_8e161084_Dne(this, this.field_36c4f18_Dne, n, n2, byArray);
        if (this.field_2092bf_Dne) {
            this.field_369b1cf_Dne.method_8e161084_Dne(this, this.field_36c4f18_Dne, n, n2, byArray);
            this.field_3742bea_Dne.method_8e161084_Dne(this, this.field_36c4f18_Dne, n, n2, byArray);
            this.field_3697d60_Dne.method_8e161084_Dne(this, this.field_36c4f18_Dne, n, n2, byArray);
            this.field_37bbafe_Dne.method_8e161084_Dne(this, this.field_36c4f18_Dne, n, n2, byArray);
        }
        qMV qMV2 = new qMV(this.field_36c4f18_Dne, byArray, n, n2);
        byte[] byArray2 = qMV2.method_ce7eeb83_Dne();
        for (int i = 0; i < byArray2.length; ++i) {
            byArray2[i] = (byte)this.field_83618953_Dne[i].field_267cf5_Qnq;
        }
        qMV2.method_7c6f6039_FWm();
        return qMV2;
    }

    @Override
    public qMV method_e1796070_FWm(int n, int n2) {
        return this.method_90569c11_Dne(n, n2);
    }

    public void method_cc75c059_Dne(int n, int n2, byte[] byArray, OdI[] odIArray) {
        int n3 = 63;
        double d = 0.03125;
        this.field_3f654fb_DyG = this.field_16314b6e_DyG.method_514f0fe4_Dne(this.field_3f654fb_DyG, n * 16, n2 * 16, 0, 16, 16, 1, d * 2.0, d * 2.0, d * 2.0);
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                OdI odI = odIArray[j + i * 16];
                float f = odI.method_ae128db7_bzF();
                int n4 = (int)(this.field_3f654fb_DyG[i + j * 16] / 3.0 + 3.0 + this.field_7331eae7_Dne.nextDouble() * 0.25);
                int n5 = -1;
                byte by = odI.field_2092a7_Dne;
                byte by2 = odI.field_212606_FWm;
                for (int k = 127; k >= 0; --k) {
                    int n6 = (j * 16 + i) * 128 + k;
                    if (k <= 0 + this.field_7331eae7_Dne.nextInt(5)) {
                        byArray[n6] = (byte)zKP.field_f0b029e5_zGp.field_21260d_FWm;
                        continue;
                    }
                    byte by3 = byArray[n6];
                    if (by3 == 0) {
                        n5 = -1;
                        continue;
                    }
                    if (by3 != zKP.field_37e6aed_Dne.field_21260d_FWm) continue;
                    if (n5 == -1) {
                        if (n4 <= 0) {
                            by = 0;
                            by2 = (byte)zKP.field_37e6aed_Dne.field_21260d_FWm;
                        } else if (k >= n3 - 4 && k <= n3 + 1) {
                            by = odI.field_2092a7_Dne;
                            by2 = odI.field_212606_FWm;
                        }
                        if (k < n3 && by == 0) {
                            by = f < 0.15f ? (byte)zKP.field_c4c81e9d_xEx.field_21260d_FWm : (byte)zKP.field_16319416_DyG.field_21260d_FWm;
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
                    byArray[n6] = by2;
                    if (--n5 != 0 || by2 != zKP.field_5ced441_IjH.field_21260d_FWm) continue;
                    n5 = this.field_7331eae7_Dne.nextInt(4);
                    by2 = (byte)zKP.field_850fb0c5_ceE.field_21260d_FWm;
                }
            }
        }
    }

    @Override
    public void method_7a46289a_Dne() {
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return true;
    }

    @Override
    public EyB method_2849cfe9_Dne(Qnq qnq, String string, int n, int n2, int n3) {
        return "Stronghold".equals(string) && this.field_3697d60_Dne != null ? this.field_3697d60_Dne.method_8bbba33_Dne(qnq, n, n2, n3) : null;
    }

    @Override
    public void method_16cca7a_Dne(int n, int n2) {
        if (this.field_2092bf_Dne) {
            this.field_369b1cf_Dne.method_8e161084_Dne(this, this.field_36c4f18_Dne, n, n2, null);
            this.field_3742bea_Dne.method_8e161084_Dne(this, this.field_36c4f18_Dne, n, n2, null);
            this.field_3697d60_Dne.method_8e161084_Dne(this, this.field_36c4f18_Dne, n, n2, null);
            this.field_37bbafe_Dne.method_8e161084_Dne(this, this.field_36c4f18_Dne, n, n2, null);
        }
    }

    public XwR(Qnq qnq, long l, boolean bl) {
        this.field_3697d60_Dne = new Khi();
        this.field_3742bea_Dne = new cXw();
        this.field_369b1cf_Dne = new Kvh();
        this.field_37bbafe_Dne = new tMg();
        this.field_20271d23_FWm = new jBE();
        this.field_7a46ee0e_Dne = new int[32][32];
        this.field_36c4f18_Dne = qnq;
        this.field_2092bf_Dne = bl;
        this.field_7331eae7_Dne = new Random(l);
        this.field_5e67910c_Qnq = new xvE(this.field_7331eae7_Dne, 16);
        this.field_7141a68b_aFZ = new xvE(this.field_7331eae7_Dne, 16);
        this.field_f0afe13d_zGp = new xvE(this.field_7331eae7_Dne, 8);
        this.field_16314b6e_DyG = new xvE(this.field_7331eae7_Dne, 4);
        this.field_37e2245_Dne = new xvE(this.field_7331eae7_Dne, 10);
        this.field_2037ee24_FWm = new xvE(this.field_7331eae7_Dne, 16);
        this.field_75c5f032_bzF = new xvE(this.field_7331eae7_Dne, 8);
    }

    public void method_597a88c1_Dne(int var1, int var2, byte[] var3) {
        byte var4 = 4;
        byte var5 = 16;
        byte var6 = 63;
        int var7 = var4 + 1;
        byte var8 = 17;
        int var9 = var4 + 1;
        this.field_83618953_Dne = this.field_36c4f18_Dne.method_2315aa7b_Dne().method_3ae4153c_Dne(this.field_83618953_Dne, var1 * 4 - 2, var2 * 4 - 2, var7 + 5, var9 + 5);
        this.field_6d9298c_zGp = this.method_86ee7ffc_Dne(this.field_6d9298c_zGp, var1 * var4, 0, var2 * var4, var7, var8, var9);

        for(int var10 = 0; var10 < var4; ++var10) {
            for(int var11 = 0; var11 < var4; ++var11) {
                for(int var12 = 0; var12 < var5; ++var12) {
                    double var13 = 0.125D;
                    double var15 = this.field_6d9298c_zGp[((var10 + 0) * var9 + var11 + 0) * var8 + var12 + 0];
                    double var17 = this.field_6d9298c_zGp[((var10 + 0) * var9 + var11 + 1) * var8 + var12 + 0];
                    double var19 = this.field_6d9298c_zGp[((var10 + 1) * var9 + var11 + 0) * var8 + var12 + 0];
                    double var21 = this.field_6d9298c_zGp[((var10 + 1) * var9 + var11 + 1) * var8 + var12 + 0];
                    double var23 = (this.field_6d9298c_zGp[((var10 + 0) * var9 + var11 + 0) * var8 + var12 + 1] - var15) * var13;
                    double var25 = (this.field_6d9298c_zGp[((var10 + 0) * var9 + var11 + 1) * var8 + var12 + 1] - var17) * var13;
                    double var27 = (this.field_6d9298c_zGp[((var10 + 1) * var9 + var11 + 0) * var8 + var12 + 1] - var19) * var13;
                    double var29 = (this.field_6d9298c_zGp[((var10 + 1) * var9 + var11 + 1) * var8 + var12 + 1] - var21) * var13;

                    for(int var31 = 0; var31 < 8; ++var31) {
                        double var32 = 0.25D;
                        double var34 = var15;
                        double var36 = var17;
                        double var38 = (var19 - var15) * var32;
                        double var40 = (var21 - var17) * var32;

                        for(int var42 = 0; var42 < 4; ++var42) {
                            int var43 = var42 + var10 * 4 << 11 | 0 + var11 * 4 << 7 | var12 * 8 + var31;
                            short var44 = 128;
                            var43 -= var44;
                            double var45 = 0.25D;
                            double var47 = (var36 - var34) * var45;
                            double var49 = var34 - var47;

                            for(int var51 = 0; var51 < 4; ++var51) {
                                if ((var49 += var47) > 0.0D) {
                                    var3[var43 += var44] = (byte)zKP.field_37e6aed_Dne.field_21260d_FWm;
                                } else if (var12 * 8 + var31 < var6) {
                                    var3[var43 += var44] = (byte)zKP.field_16319416_DyG.field_21260d_FWm;
                                } else {
                                    var3[var43 += var44] = 0;
                                }
                            }

                            var34 += var38;
                            var36 += var40;
                        }

                        var15 += var23;
                        var17 += var25;
                        var19 += var27;
                        var21 += var29;
                    }
                }
            }
        }

    }

    @Override
    public boolean method_5f7a671f_Dne(boolean bl, TaY taY) {
        return true;
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return false;
    }

    @Override
    public void method_a5c3b570_Dne(ZfC zfC, int n, int n2) {
        int n3;
        int n4;
        int n5;
        ZgW.field_2092bf_Dne = true;
        int n6 = n * 16;
        int n7 = n2 * 16;
        OdI odI = this.field_36c4f18_Dne.method_90477c37_Dne(n6 + 16, n7 + 16);
        this.field_7331eae7_Dne.setSeed(this.field_36c4f18_Dne.method_7a46288e_Dne());
        long l = this.field_7331eae7_Dne.nextLong() / 2L * 2L + 1L;
        long l2 = this.field_7331eae7_Dne.nextLong() / 2L * 2L + 1L;
        this.field_7331eae7_Dne.setSeed((long)n * l + (long)n2 * l2 ^ this.field_36c4f18_Dne.method_7a46288e_Dne());
        boolean bl = false;
        if (this.field_2092bf_Dne) {
            this.field_369b1cf_Dne.method_37de1363_Dne(this.field_36c4f18_Dne, this.field_7331eae7_Dne, n, n2);
            bl = this.field_3742bea_Dne.method_37de1363_Dne(this.field_36c4f18_Dne, this.field_7331eae7_Dne, n, n2);
            this.field_3697d60_Dne.method_37de1363_Dne(this.field_36c4f18_Dne, this.field_7331eae7_Dne, n, n2);
            this.field_37bbafe_Dne.method_37de1363_Dne(this.field_36c4f18_Dne, this.field_7331eae7_Dne, n, n2);
        }
        if (!bl && this.field_7331eae7_Dne.nextInt(4) == 0) {
            n5 = n6 + this.field_7331eae7_Dne.nextInt(16) + 8;
            n4 = this.field_7331eae7_Dne.nextInt(128);
            n3 = n7 + this.field_7331eae7_Dne.nextInt(16) + 8;
            new gvF(zKP.field_16319416_DyG.field_21260d_FWm).method_c3e4cb88_Dne(this.field_36c4f18_Dne, this.field_7331eae7_Dne, n5, n4, n3);
        }
        if (!bl && this.field_7331eae7_Dne.nextInt(8) == 0) {
            n5 = n6 + this.field_7331eae7_Dne.nextInt(16) + 8;
            n4 = this.field_7331eae7_Dne.nextInt(this.field_7331eae7_Dne.nextInt(120) + 8);
            n3 = n7 + this.field_7331eae7_Dne.nextInt(16) + 8;
            if (n4 < 63 || this.field_7331eae7_Dne.nextInt(10) == 0) {
                new gvF(zKP.field_14274117_div.field_21260d_FWm).method_c3e4cb88_Dne(this.field_36c4f18_Dne, this.field_7331eae7_Dne, n5, n4, n3);
            }
        }
        for (n5 = 0; n5 < 8; ++n5) {
            int n8;
            n4 = n6 + this.field_7331eae7_Dne.nextInt(16) + 8;
            if (!new ivB().method_c3e4cb88_Dne(this.field_36c4f18_Dne, this.field_7331eae7_Dne, n4, n3 = this.field_7331eae7_Dne.nextInt(128), n8 = n7 + this.field_7331eae7_Dne.nextInt(16) + 8)) continue;
        }
        odI.method_37de135f_Dne(this.field_36c4f18_Dne, this.field_7331eae7_Dne, n6, n7);
        ooe.method_fa919f46_Dne(this.field_36c4f18_Dne, odI, n6 + 8, n7 + 8, 16, 16, this.field_7331eae7_Dne);
        n6 += 8;
        n7 += 8;
        for (n5 = 0; n5 < 16; ++n5) {
            for (n4 = 0; n4 < 16; ++n4) {
                n3 = this.field_36c4f18_Dne.method_5c563934_Qnq(n6 + n5, n7 + n4);
                if (this.field_36c4f18_Dne.method_ebf4c0af_mrb(n5 + n6, n3 - 1, n4 + n7)) {
                    this.field_36c4f18_Dne.method_17d7ea9d_FWm(n5 + n6, n3 - 1, n4 + n7, zKP.field_c4c81e9d_xEx.field_21260d_FWm, 0, 2);
                }
                if (!this.field_36c4f18_Dne.method_8d69c8a5_Zpi(n5 + n6, n3, n4 + n7)) continue;
                this.field_36c4f18_Dne.method_17d7ea9d_FWm(n5 + n6, n3, n4 + n7, zKP.field_23a1e80a_EwP.field_21260d_FWm, 0, 2);
            }
        }
        ZgW.field_2092bf_Dne = false;
    }

    @Override
    public int method_7a46288d_Dne() {
        return 0;
    }

    @Override
    public String method_eecad346_Dne() {
        return "RandomLevelSource";
    }

    private double[] method_86ee7ffc_Dne(double[] dArray, int n, int n2, int n3, int n4, int n5, int n6) {
        if (dArray == null) {
            dArray = new double[n4 * n5 * n6];
        }
        if (this.field_3f1c586_Dne == null) {
            this.field_3f1c586_Dne = new float[25];
            for (int i = -2; i <= 2; ++i) {
                for (int j = -2; j <= 2; ++j) {
                    float f;
                    this.field_3f1c586_Dne[i + 2 + (j + 2) * 5] = f = 10.0f / geR.method_143f92c9_bzF((float)(i * i + j * j) + 0.2f);
                }
            }
        }
        double d = 684.412;
        double d2 = 684.412;
        this.field_4a9241d_Qnq = this.field_37e2245_Dne.method_4e1e5c44_Dne(this.field_4a9241d_Qnq, n, n3, n4, n6, 1.121, 1.121, 0.5);
        this.field_57816fe_aFZ = this.field_2037ee24_FWm.method_4e1e5c44_Dne(this.field_57816fe_aFZ, n, n3, n4, n6, 200.0, 200.0, 0.5);
        this.field_3f1c584_Dne = this.field_f0afe13d_zGp.method_514f0fe4_Dne(this.field_3f1c584_Dne, n, n2, n3, n4, n5, n6, d / 80.0, d2 / 160.0, d / 80.0);
        this.field_4039e05_FWm = this.field_5e67910c_Qnq.method_514f0fe4_Dne(this.field_4039e05_FWm, n, n2, n3, n4, n5, n6, d, d2, d);
        this.field_59d86b7_bzF = this.field_7141a68b_aFZ.method_514f0fe4_Dne(this.field_59d86b7_bzF, n, n2, n3, n4, n5, n6, d, d2, d);
        boolean bl = false;
        boolean bl2 = false;
        int n7 = 0;
        int n8 = 0;
        for (int i = 0; i < n4; ++i) {
            for (int j = 0; j < n6; ++j) {
                float f = 0.0f;
                float f2 = 0.0f;
                float f3 = 0.0f;
                int n9 = 2;
                OdI odI = this.field_83618953_Dne[i + 2 + (j + 2) * (n4 + 5)];
                for (int k = -n9; k <= n9; ++k) {
                    for (int i2 = -n9; i2 <= n9; ++i2) {
                        OdI odI2 = this.field_83618953_Dne[i + k + 2 + (j + i2 + 2) * (n4 + 5)];
                        float f4 = this.field_3f1c586_Dne[k + 2 + (i2 + 2) * 5] / (odI2.field_2092ab_Dne + 2.0f);
                        if (odI2.field_2092ab_Dne > odI.field_2092ab_Dne) {
                            f4 /= 2.0f;
                        }
                        f += odI2.field_21260a_FWm * f4;
                        f2 += odI2.field_2092ab_Dne * f4;
                        f3 += f4;
                    }
                }
                f /= f3;
                f2 /= f3;
                f = f * 0.9f + 0.1f;
                f2 = (f2 * 4.0f - 1.0f) / 8.0f;
                double d3 = this.field_57816fe_aFZ[n8] / 8000.0;
                if (d3 < 0.0) {
                    d3 = -d3 * 0.3;
                }
                if ((d3 = d3 * 3.0 - 2.0) < 0.0) {
                    if ((d3 /= 2.0) < -1.0) {
                        d3 = -1.0;
                    }
                    d3 /= 1.4;
                    d3 /= 2.0;
                } else {
                    if (d3 > 1.0) {
                        d3 = 1.0;
                    }
                    d3 /= 8.0;
                }
                ++n8;
                for (int k = 0; k < n5; ++k) {
                    double d4 = f2;
                    double d5 = f;
                    d4 += d3 * 0.2;
                    d4 = d4 * (double)n5 / 16.0;
                    double d6 = (double)n5 / 2.0 + d4 * 4.0;
                    double d7 = 0.0;
                    double d8 = ((double)k - d6) * 12.0 * 128.0 / 128.0 / d5;
                    if (d8 < 0.0) {
                        d8 *= 4.0;
                    }
                    double d9 = this.field_4039e05_FWm[n7] / 512.0;
                    double d10 = this.field_59d86b7_bzF[n7] / 512.0;
                    double d11 = (this.field_3f1c584_Dne[n7] / 10.0 + 1.0) / 2.0;
                    d7 = d11 < 0.0 ? d9 : (d11 > 1.0 ? d10 : d9 + (d10 - d9) * d11);
                    d7 -= d8;
                    if (k > n5 - 4) {
                        double d12 = (float)(k - (n5 - 4)) / 3.0f;
                        d7 = d7 * (1.0 - d12) + -10.0 * d12;
                    }
                    dArray[n7] = d7;
                    ++n7;
                }
            }
        }
        return dArray;
    }

    @Override
    public List method_c5f979a2_Dne(Icc icc, int n, int n2, int n3) {
        OdI odI = this.field_36c4f18_Dne.method_90477c37_Dne(n, n3);
        return odI == null ? null : (odI == OdI.field_161e6521_DyG && icc == Icc.field_3688123_Dne && this.field_37bbafe_Dne.method_2c2cf7cd_Dne(n, n2, n3) ? this.field_37bbafe_Dne.method_adea226d_Dne() : odI.method_32fd9ea9_Dne(icc));
    }

    @Override
    public boolean method_16cca7e_Dne(int n, int n2) {
        return true;
    }
}

