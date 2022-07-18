package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class Zlx
implements ZfC {
    public xvE field_37e2245_Dne;
    private xvE field_7141a68b_aFZ;
    double[] field_3f1c584_Dne;
    double[] field_57816fe_aFZ;
    private OdI[] field_83618953_Dne;
    double[] field_4a9241d_Qnq;
    public xvE field_2037ee24_FWm;
    private Qnq field_36c4f18_Dne;
    double[] field_59d86b7_bzF;
    private Random field_7331eae7_Dne;
    private xvE field_75c5f032_bzF;
    private double[] field_6d9298c_zGp;
    int[][] field_7a46ee0e_Dne = new int[32][32];
    double[] field_4039e05_FWm;
    private xvE field_5e67910c_Qnq;

    @Override
    public boolean method_5f7a671f_Dne(boolean bl, TaY taY) {
        return true;
    }

    @Override
    public int method_7a46288d_Dne() {
        return 0;
    }

    public void method_cc75c059_Dne(int n, int n2, byte[] byArray, OdI[] odIArray) {
        int n3 = 2;
        int n4 = n3 + 1;
        int n5 = 33;
        int n6 = n3 + 1;
        this.field_6d9298c_zGp = this.method_86ee7ffc_Dne(this.field_6d9298c_zGp, n * n3, 0, n2 * n3, n4, n5, n6);
        for (int i = 0; i < n3; ++i) {
            for (int j = 0; j < n3; ++j) {
                for (int k = 0; k < 32; ++k) {
                    double d = 0.25;
                    double d2 = this.field_6d9298c_zGp[((i + 0) * n6 + j + 0) * n5 + k + 0];
                    double d3 = this.field_6d9298c_zGp[((i + 0) * n6 + j + 1) * n5 + k + 0];
                    double d4 = this.field_6d9298c_zGp[((i + 1) * n6 + j + 0) * n5 + k + 0];
                    double d5 = this.field_6d9298c_zGp[((i + 1) * n6 + j + 1) * n5 + k + 0];
                    double d6 = (this.field_6d9298c_zGp[((i + 0) * n6 + j + 0) * n5 + k + 1] - d2) * d;
                    double d7 = (this.field_6d9298c_zGp[((i + 0) * n6 + j + 1) * n5 + k + 1] - d3) * d;
                    double d8 = (this.field_6d9298c_zGp[((i + 1) * n6 + j + 0) * n5 + k + 1] - d4) * d;
                    double d9 = (this.field_6d9298c_zGp[((i + 1) * n6 + j + 1) * n5 + k + 1] - d5) * d;
                    for (int i2 = 0; i2 < 4; ++i2) {
                        double d10 = 0.125;
                        double d11 = d2;
                        double d12 = d3;
                        double d13 = (d4 - d2) * d10;
                        double d14 = (d5 - d3) * d10;
                        for (int i3 = 0; i3 < 8; ++i3) {
                            int n7 = i3 + i * 8 << 11 | 0 + j * 8 << 7 | k * 4 + i2;
                            int n8 = 128;
                            double d15 = 0.125;
                            double d16 = d11;
                            double d17 = (d12 - d11) * d15;
                            for (int i4 = 0; i4 < 8; ++i4) {
                                int n9 = 0;
                                if (d16 > 0.0) {
                                    n9 = zKP.field_4e627739_dNY.field_21260d_FWm;
                                }
                                byArray[n7] = (byte)n9;
                                n7 += n8;
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

    @Override
    public qMV method_90569c11_Dne(int n, int n2) {
        this.field_7331eae7_Dne.setSeed((long)n * 341873128712L + (long)n2 * 132897987541L);
        byte[] byArray = new byte[32768];
        this.field_83618953_Dne = this.field_36c4f18_Dne.method_2315aa7b_Dne().method_f1decbbd_FWm(this.field_83618953_Dne, n * 16, n2 * 16, 16, 16);
        this.method_cc75c059_Dne(n, n2, byArray, this.field_83618953_Dne);
        this.method_8bd13d38_FWm(n, n2, byArray, this.field_83618953_Dne);
        qMV qMV2 = new qMV(this.field_36c4f18_Dne, byArray, n, n2);
        byte[] byArray2 = qMV2.method_ce7eeb83_Dne();
        for (int i = 0; i < byArray2.length; ++i) {
            byArray2[i] = (byte)this.field_83618953_Dne[i].field_267cf5_Qnq;
        }
        qMV2.method_7c6f6039_FWm();
        return qMV2;
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return true;
    }

    @Override
    public List method_c5f979a2_Dne(Icc icc, int n, int n2, int n3) {
        OdI odI = this.field_36c4f18_Dne.method_90477c37_Dne(n, n3);
        return odI == null ? null : odI.method_32fd9ea9_Dne(icc);
    }

    @Override
    public void method_a5c3b570_Dne(ZfC zfC, int n, int n2) {
        ZgW.field_2092bf_Dne = true;
        int n3 = n * 16;
        int n4 = n2 * 16;
        OdI odI = this.field_36c4f18_Dne.method_90477c37_Dne(n3 + 16, n4 + 16);
        odI.method_37de135f_Dne(this.field_36c4f18_Dne, this.field_36c4f18_Dne.field_7331eae7_Dne, n3, n4);
        ZgW.field_2092bf_Dne = false;
    }

    @Override
    public void method_7a46289a_Dne() {
    }

    @Override
    public boolean method_16cca7e_Dne(int n, int n2) {
        return true;
    }

    @Override
    public qMV method_e1796070_FWm(int n, int n2) {
        return this.method_90569c11_Dne(n, n2);
    }

    @Override
    public void method_16cca7a_Dne(int n, int n2) {
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return false;
    }

    public Zlx(Qnq qnq, long l) {
        this.field_36c4f18_Dne = qnq;
        this.field_7331eae7_Dne = new Random(l);
        this.field_75c5f032_bzF = new xvE(this.field_7331eae7_Dne, 16);
        this.field_5e67910c_Qnq = new xvE(this.field_7331eae7_Dne, 16);
        this.field_7141a68b_aFZ = new xvE(this.field_7331eae7_Dne, 8);
        this.field_37e2245_Dne = new xvE(this.field_7331eae7_Dne, 10);
        this.field_2037ee24_FWm = new xvE(this.field_7331eae7_Dne, 16);
    }

    @Override
    public String method_eecad346_Dne() {
        return "RandomLevelSource";
    }

    public void method_8bd13d38_FWm(int n, int n2, byte[] byArray, OdI[] odIArray) {
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                int n3 = 1;
                int n4 = -1;
                byte by = (byte)zKP.field_4e627739_dNY.field_21260d_FWm;
                byte by2 = (byte)zKP.field_4e627739_dNY.field_21260d_FWm;
                for (int k = 127; k >= 0; --k) {
                    int n5 = (j * 16 + i) * 128 + k;
                    byte by3 = byArray[n5];
                    if (by3 == 0) {
                        n4 = -1;
                        continue;
                    }
                    if (by3 != zKP.field_37e6aed_Dne.field_21260d_FWm) continue;
                    if (n4 == -1) {
                        if (n3 <= 0) {
                            by = 0;
                            by2 = (byte)zKP.field_4e627739_dNY.field_21260d_FWm;
                        }
                        n4 = n3;
                        if (k >= 0) {
                            byArray[n5] = by;
                            continue;
                        }
                        byArray[n5] = by2;
                        continue;
                    }
                    if (n4 <= 0) continue;
                    --n4;
                    byArray[n5] = by2;
                }
            }
        }
    }

    private double[] method_86ee7ffc_Dne(double[] dArray, int n, int n2, int n3, int n4, int n5, int n6) {
        if (dArray == null) {
            dArray = new double[n4 * n5 * n6];
        }
        double d = 684.412;
        double d2 = 684.412;
        this.field_4a9241d_Qnq = this.field_37e2245_Dne.method_4e1e5c44_Dne(this.field_4a9241d_Qnq, n, n3, n4, n6, 1.121, 1.121, 0.5);
        this.field_57816fe_aFZ = this.field_2037ee24_FWm.method_4e1e5c44_Dne(this.field_57816fe_aFZ, n, n3, n4, n6, 200.0, 200.0, 0.5);
        this.field_3f1c584_Dne = this.field_7141a68b_aFZ.method_514f0fe4_Dne(this.field_3f1c584_Dne, n, n2, n3, n4, n5, n6, (d *= 2.0) / 80.0, d2 / 160.0, d / 80.0);
        this.field_4039e05_FWm = this.field_75c5f032_bzF.method_514f0fe4_Dne(this.field_4039e05_FWm, n, n2, n3, n4, n5, n6, d, d2, d);
        this.field_59d86b7_bzF = this.field_5e67910c_Qnq.method_514f0fe4_Dne(this.field_59d86b7_bzF, n, n2, n3, n4, n5, n6, d, d2, d);
        int n7 = 0;
        int n8 = 0;
        for (int i = 0; i < n4; ++i) {
            for (int j = 0; j < n6; ++j) {
                double d3;
                double d4 = (this.field_4a9241d_Qnq[n8] + 256.0) / 512.0;
                if (d4 > 1.0) {
                    d4 = 1.0;
                }
                if ((d3 = this.field_57816fe_aFZ[n8] / 8000.0) < 0.0) {
                    d3 = -d3 * 0.3;
                }
                d3 = d3 * 3.0 - 2.0;
                float f = (float)(i + n - 0) / 1.0f;
                float f2 = (float)(j + n3 - 0) / 1.0f;
                float f3 = 100.0f - geR.method_143f92c9_bzF(f * f + f2 * f2) * 8.0f;
                if (f3 > 80.0f) {
                    f3 = 80.0f;
                }
                if (f3 < -100.0f) {
                    f3 = -100.0f;
                }
                if (d3 > 1.0) {
                    d3 = 1.0;
                }
                d3 /= 8.0;
                d3 = 0.0;
                if (d4 < 0.0) {
                    d4 = 0.0;
                }
                d4 += 0.5;
                d3 = d3 * (double)n5 / 16.0;
                ++n8;
                double d5 = (double)n5 / 2.0;
                for (int k = 0; k < n5; ++k) {
                    double d6;
                    double d7 = 0.0;
                    double d8 = ((double)k - d5) * 8.0 / d4;
                    if (d8 < 0.0) {
                        d8 *= -1.0;
                    }
                    double d9 = this.field_4039e05_FWm[n7] / 512.0;
                    double d10 = this.field_59d86b7_bzF[n7] / 512.0;
                    double d11 = (this.field_3f1c584_Dne[n7] / 10.0 + 1.0) / 2.0;
                    d7 = d11 < 0.0 ? d9 : (d11 > 1.0 ? d10 : d9 + (d10 - d9) * d11);
                    d7 -= 8.0;
                    d7 += (double)f3;
                    int n9 = 2;
                    if (k > n5 / 2 - n9) {
                        d6 = (float)(k - (n5 / 2 - n9)) / 64.0f;
                        if (d6 < 0.0) {
                            d6 = 0.0;
                        }
                        if (d6 > 1.0) {
                            d6 = 1.0;
                        }
                        d7 = d7 * (1.0 - d6) + -3000.0 * d6;
                    }
                    if (k < (n9 = 8)) {
                        d6 = (float)(n9 - k) / ((float)n9 - 1.0f);
                        d7 = d7 * (1.0 - d6) + -30.0 * d6;
                    }
                    dArray[n7] = d7;
                    ++n7;
                }
            }
        }
        return dArray;
    }

    @Override
    public EyB method_2849cfe9_Dne(Qnq qnq, String string, int n, int n2, int n3) {
        return null;
    }
}

