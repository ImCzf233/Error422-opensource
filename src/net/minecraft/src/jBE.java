package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class jBE
extends Suj {
    private float[] field_3f1c586_Dne = new float[1024];

    @Override
    protected void method_8632d3da_Dne(Qnq qnq, int n, int n2, int n3, int n4, byte[] byArray) {
        if (this.field_7331eae7_Dne.nextInt(50) == 0) {
            double d = n * 16 + this.field_7331eae7_Dne.nextInt(16);
            double d2 = this.field_7331eae7_Dne.nextInt(this.field_7331eae7_Dne.nextInt(40) + 8) + 20;
            double d3 = n2 * 16 + this.field_7331eae7_Dne.nextInt(16);
            int n5 = 1;
            for (int i = 0; i < n5; ++i) {
                float f = this.field_7331eae7_Dne.nextFloat() * (float)Math.PI * 2.0f;
                float f2 = (this.field_7331eae7_Dne.nextFloat() - 0.5f) * 2.0f / 8.0f;
                float f3 = (this.field_7331eae7_Dne.nextFloat() * 2.0f + this.field_7331eae7_Dne.nextFloat()) * 2.0f;
                this.method_3b3557ab_Dne(this.field_7331eae7_Dne.nextLong(), n3, n4, byArray, d, d2, d3, f3, f, f2, 0, 0, 3.0);
            }
        }
    }

    protected void method_3b3557ab_Dne(long l, int n, int n2, byte[] byArray, double d, double d2, double d3, float f, float f2, float f3, int n3, int n4, double d4) {
        int n5;
        Random random = new Random(l);
        double d5 = n * 16 + 8;
        double d6 = n2 * 16 + 8;
        float f4 = 0.0f;
        float f5 = 0.0f;
        if (n4 <= 0) {
            n5 = this.field_2092ae_Dne * 16 - 16;
            n4 = n5 - random.nextInt(n5 / 4);
        }
        n5 = 0;
        if (n3 == -1) {
            n3 = n4 / 2;
            n5 = 1;
        }
        float f6 = 1.0f;
        for (int i = 0; i < 128; ++i) {
            if (i == 0 || random.nextInt(3) == 0) {
                f6 = 1.0f + random.nextFloat() * random.nextFloat() * 1.0f;
            }
            this.field_3f1c586_Dne[i] = f6 * f6;
        }
        while (n3 < n4) {
            double d7 = 1.5 + (double)(geR.method_ce7f5256_Dne((float)n3 * (float)Math.PI / (float)n4) * f * 1.0f);
            double d8 = d7 * d4;
            d7 *= (double)random.nextFloat() * 0.25 + 0.75;
            d8 *= (double)random.nextFloat() * 0.25 + 0.75;
            float f7 = geR.method_117d0e97_FWm(f3);
            float f8 = geR.method_ce7f5256_Dne(f3);
            d += (double)(geR.method_117d0e97_FWm(f2) * f7);
            d2 += (double)f8;
            d3 += (double)(geR.method_ce7f5256_Dne(f2) * f7);
            f3 *= 0.7f;
            f3 += f5 * 0.05f;
            f2 += f4 * 0.05f;
            f5 *= 0.8f;
            f4 *= 0.5f;
            f5 += (random.nextFloat() - random.nextFloat()) * random.nextFloat() * 2.0f;
            f4 += (random.nextFloat() - random.nextFloat()) * random.nextFloat() * 4.0f;
            if (n5 != 0 || random.nextInt(4) != 0) {
                double d9 = d - d5;
                double d10 = d3 - d6;
                double d11 = n4 - n3;
                double d12 = f + 2.0f + 16.0f;
                if (d9 * d9 + d10 * d10 - d11 * d11 > d12 * d12) {
                    return;
                }
                if (d >= d5 - 16.0 - d7 * 2.0 && d3 >= d6 - 16.0 - d7 * 2.0 && d <= d5 + 16.0 + d7 * 2.0 && d3 <= d6 + 16.0 + d7 * 2.0) {
                    int n6;
                    int n7;
                    int n8 = geR.method_117d0718_FWm(d - d7) - n * 16 - 1;
                    int n9 = geR.method_117d0718_FWm(d + d7) - n * 16 + 1;
                    int n10 = geR.method_117d0718_FWm(d2 - d8) - 1;
                    int n11 = geR.method_117d0718_FWm(d2 + d8) + 1;
                    int n12 = geR.method_117d0718_FWm(d3 - d7) - n2 * 16 - 1;
                    int n13 = geR.method_117d0718_FWm(d3 + d7) - n2 * 16 + 1;
                    if (n8 < 0) {
                        n8 = 0;
                    }
                    if (n9 > 16) {
                        n9 = 16;
                    }
                    if (n10 < 1) {
                        n10 = 1;
                    }
                    if (n11 > 120) {
                        n11 = 120;
                    }
                    if (n12 < 0) {
                        n12 = 0;
                    }
                    if (n13 > 16) {
                        n13 = 16;
                    }
                    boolean bl = false;
                    for (n7 = n8; !bl && n7 < n9; ++n7) {
                        for (int i = n12; !bl && i < n13; ++i) {
                            for (int j = n11 + 1; !bl && j >= n10 - 1; --j) {
                                n6 = (n7 * 16 + i) * 128 + j;
                                if (j < 0 || j >= 128) continue;
                                if (byArray[n6] == zKP.field_374330f_Dne.field_21260d_FWm || byArray[n6] == zKP.field_16319416_DyG.field_21260d_FWm) {
                                    bl = true;
                                }
                                if (j == n10 - 1 || n7 == n8 || n7 == n9 - 1 || i == n12 || i == n13 - 1) continue;
                                j = n10;
                            }
                        }
                    }
                    if (!bl) {
                        for (n7 = n8; n7 < n9; ++n7) {
                            double d13 = ((double)(n7 + n * 16) + 0.5 - d) / d7;
                            for (n6 = n12; n6 < n13; ++n6) {
                                double d14 = ((double)(n6 + n2 * 16) + 0.5 - d3) / d7;
                                int n14 = (n7 * 16 + n6) * 128 + n11;
                                boolean bl2 = false;
                                if (!(d13 * d13 + d14 * d14 < 1.0)) continue;
                                for (int i = n11 - 1; i >= n10; --i) {
                                    double d15 = ((double)i + 0.5 - d2) / d8;
                                    if ((d13 * d13 + d14 * d14) * (double)this.field_3f1c586_Dne[i] + d15 * d15 / 6.0 < 1.0) {
                                        byte by = byArray[n14];
                                        if (by == zKP.field_36ff555_Dne.field_21260d_FWm) {
                                            bl2 = true;
                                        }
                                        if (by == zKP.field_37e6aed_Dne.field_21260d_FWm || by == zKP.field_203836cc_FWm.field_21260d_FWm || by == zKP.field_36ff555_Dne.field_21260d_FWm) {
                                            if (i < 10) {
                                                byArray[n14] = (byte)zKP.field_202dfeee_FWm.field_21260d_FWm;
                                            } else {
                                                byArray[n14] = 0;
                                                if (bl2 && byArray[n14 - 1] == zKP.field_203836cc_FWm.field_21260d_FWm) {
                                                    byArray[n14 - 1] = this.field_36c4f18_Dne.method_90477c37_Dne((int)(n7 + n * 16), (int)(n6 + n2 * 16)).field_2092a7_Dne;
                                                }
                                            }
                                        }
                                    }
                                    --n14;
                                }
                            }
                        }
                        if (n5 != 0) break;
                    }
                }
            }
            ++n3;
        }
    }
}

