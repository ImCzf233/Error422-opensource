package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.client.Minecraft;

public class ZIm
extends CAZ {
    private final BMa field_364ffb6_Dne;
    boolean field_2092bf_Dne;
    private mbZ field_378d9a7_Dne;
    private int field_28e7fd_Vxn = 0;

    @Override
    public void method_7a46289a_Dne() {
        Object object;
        int n;
        boolean bl;
        if (this.field_28e7fd_Vxn == 0 && this.field_378d9a7_Dne != null) {
            bl = this.method_907a9d25_Qnq();
            n = 0;
            if (this.field_378d9a7_Dne.method_7a46288d_Dne() >= 3) {
                n = 1;
            } else {
                for (int i = 0; i < this.field_378d9a7_Dne.method_7a46288d_Dne(); ++i) {
                    WkD wkD = (WkD)this.field_378d9a7_Dne.method_77d0d055_FWm(i);
                    if (wkD.method_8f501fd0_Dne("Type") != 1) continue;
                    n = 1;
                    break;
                }
            }
            object = "fireworks." + (n != 0 ? "largeBlast" : "blast") + (bl ? "_far" : "");
            this.field_36c4f18_Dne.method_62d7c9a6_Dne(this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb, (String)object, 20.0f, 0.95f + this.field_7331eae7_Dne.nextFloat() * 0.1f, true);
        }
        if (this.field_28e7fd_Vxn % 2 == 0 && this.field_378d9a7_Dne != null && this.field_28e7fd_Vxn / 2 < this.field_378d9a7_Dne.method_7a46288d_Dne()) {
            n = this.field_28e7fd_Vxn / 2;
            object = (WkD)this.field_378d9a7_Dne.method_77d0d055_FWm(n);
            byte by = ((WkD)object).method_8f501fd0_Dne("Type");
            boolean bl2 = ((WkD)object).method_110c4dc7_FWm("Trail");
            boolean bl3 = ((WkD)object).method_110c4dc7_FWm("Flicker");
            int[] nArray = ((WkD)object).method_5ab3dd80_Dne("Colors");
            int[] nArray2 = ((WkD)object).method_5ab3dd80_Dne("FadeColors");
            if (by == 1) {
                this.method_9538077b_Dne(0.5, 4, nArray, nArray2, bl2, bl3);
            } else if (by == 2) {
                this.method_a2d66ebe_Dne(0.5, new double[][]{{0.0, 1.0}, {0.3455, 0.309}, {0.9511, 0.309}, {0.3795918367346939, -0.12653061224489795}, {0.6122448979591837, -0.8040816326530612}, {0.0, -0.35918367346938773}}, nArray, nArray2, bl2, bl3, false);
            } else if (by == 3) {
                this.method_a2d66ebe_Dne(0.5, new double[][]{{0.0, 0.2}, {0.2, 0.2}, {0.2, 0.6}, {0.6, 0.6}, {0.6, 0.2}, {0.2, 0.2}, {0.2, 0.0}, {0.4, 0.0}, {0.4, -0.6}, {0.2, -0.6}, {0.2, -0.4}, {0.0, -0.4}}, nArray, nArray2, bl2, bl3, true);
            } else if (by == 4) {
                this.method_33498336_Dne(nArray, nArray2, bl2, bl3);
            } else {
                this.method_9538077b_Dne(0.25, 2, nArray, nArray2, bl2, bl3);
            }
            int n2 = nArray[0];
            float f = (float)((n2 & 0xFF0000) >> 16) / 255.0f;
            float f2 = (float)((n2 & 0xFF00) >> 8) / 255.0f;
            float f3 = (float)((n2 & 0xFF) >> 0) / 255.0f;
            bSX bSX2 = new bSX(this.field_36c4f18_Dne, this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb);
            bSX2.method_2c0148e6_Dne(f, f2, f3);
            this.field_364ffb6_Dne.method_68e8f1ab_Dne(bSX2);
        }
        ++this.field_28e7fd_Vxn;
        if (this.field_28e7fd_Vxn > this.field_267cf5_Qnq) {
            if (this.field_2092bf_Dne) {
                bl = this.method_907a9d25_Qnq();
                String string = "fireworks." + (bl ? "twinkle_far" : "twinkle");
                this.field_36c4f18_Dne.method_62d7c9a6_Dne(this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb, string, 20.0f, 0.9f + this.field_7331eae7_Dne.nextFloat() * 0.15f, true);
            }
            this.method_5d73f9d_g_();
        }
    }

    private void method_9538077b_Dne(double d, int n, int[] nArray, int[] nArray2, boolean bl, boolean bl2) {
        double d2 = this.field_2f0dd3_div;
        double d3 = this.field_22c5fd_IjH;
        double d4 = this.field_334487_mrb;
        for (int i = -n; i <= n; ++i) {
            for (int j = -n; j <= n; ++j) {
                for (int k = -n; k <= n; ++k) {
                    double d5 = (double)j + (this.field_7331eae7_Dne.nextDouble() - this.field_7331eae7_Dne.nextDouble()) * 0.5;
                    double d6 = (double)i + (this.field_7331eae7_Dne.nextDouble() - this.field_7331eae7_Dne.nextDouble()) * 0.5;
                    double d7 = (double)k + (this.field_7331eae7_Dne.nextDouble() - this.field_7331eae7_Dne.nextDouble()) * 0.5;
                    double d8 = (double)geR.method_ce7f4ad4_Dne(d5 * d5 + d6 * d6 + d7 * d7) / d + this.field_7331eae7_Dne.nextGaussian() * 0.05;
                    this.method_c2129ef6_Dne(d2, d3, d4, d5 / d8, d6 / d8, d7 / d8, nArray, nArray2, bl, bl2);
                    if (i == -n || i == n || j == -n || j == n) continue;
                    k += n * 2 - 1;
                }
            }
        }
    }

    private void method_a2d66ebe_Dne(double d, double[][] dArray, int[] nArray, int[] nArray2, boolean bl, boolean bl2, boolean bl3) {
        double d2 = dArray[0][0];
        double d3 = dArray[0][1];
        this.method_c2129ef6_Dne(this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb, d2 * d, d3 * d, 0.0, nArray, nArray2, bl, bl2);
        float f = this.field_7331eae7_Dne.nextFloat() * (float)Math.PI;
        double d4 = bl3 ? 0.034 : 0.34;
        for (int i = 0; i < 3; ++i) {
            double d5 = (double)f + (double)((float)i * (float)Math.PI) * d4;
            double d6 = d2;
            double d7 = d3;
            for (int j = 1; j < dArray.length; ++j) {
                double d8 = dArray[j][0];
                double d9 = dArray[j][1];
                for (double d10 = 0.25; d10 <= 1.0; d10 += 0.25) {
                    double d11 = (d6 + (d8 - d6) * d10) * d;
                    double d12 = (d7 + (d9 - d7) * d10) * d;
                    double d13 = d11 * Math.sin(d5);
                    d11 *= Math.cos(d5);
                    for (double d14 = -1.0; d14 <= 1.0; d14 += 2.0) {
                        this.method_c2129ef6_Dne(this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb, d11 * d14, d12, d13 * d14, nArray, nArray2, bl, bl2);
                    }
                }
                d6 = d8;
                d7 = d9;
            }
        }
    }

    private boolean method_907a9d25_Qnq() {
        Minecraft minecraft = Minecraft.method_81a5f12e_Dne();
        return minecraft == null || minecraft.field_366ec33_Dne == null || minecraft.field_366ec33_Dne.method_2be42992_Dne(this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb) >= 256.0;
    }

    private void method_33498336_Dne(int[] nArray, int[] nArray2, boolean bl, boolean bl2) {
        double d = this.field_7331eae7_Dne.nextGaussian() * 0.05;
        double d2 = this.field_7331eae7_Dne.nextGaussian() * 0.05;
        for (int i = 0; i < 70; ++i) {
            double d3 = this.field_291868_XHL * 0.5 + this.field_7331eae7_Dne.nextGaussian() * 0.15 + d;
            double d4 = this.field_31b811_kGO * 0.5 + this.field_7331eae7_Dne.nextGaussian() * 0.15 + d2;
            double d5 = this.field_2a9ad1_Zpi * 0.5 + this.field_7331eae7_Dne.nextDouble() * 0.5;
            this.method_c2129ef6_Dne(this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb, d3, d5, d4, nArray, nArray2, bl, bl2);
        }
    }

    private void method_c2129ef6_Dne(double d, double d2, double d3, double d4, double d5, double d6, int[] nArray, int[] nArray2, boolean bl, boolean bl2) {
        HkG hkG = new HkG(this.field_36c4f18_Dne, d, d2, d3, d4, d5, d6, this.field_364ffb6_Dne);
        hkG.method_ce7f9d7a_Dne(bl);
        hkG.method_117d59bb_FWm(bl2);
        int n = this.field_7331eae7_Dne.nextInt(nArray.length);
        hkG.method_ce7f5da9_Dne(nArray[n]);
        if (nArray2 != null && nArray2.length > 0) {
            hkG.method_117d19ea_FWm(nArray2[this.field_7331eae7_Dne.nextInt(nArray2.length)]);
        }
        this.field_364ffb6_Dne.method_68e8f1ab_Dne(hkG);
    }

    @Override
    public void method_179c0fdf_Dne(WAR wAR, float f, float f2, float f3, float f4, float f5, float f6) {
    }

    public ZIm(Qnq qnq, double d, double d2, double d3, double d4, double d5, double d6, BMa bMa, WkD wkD) {
        super(qnq, d, d2, d3, 0.0, 0.0, 0.0);
        this.field_291868_XHL = d4;
        this.field_2a9ad1_Zpi = d5;
        this.field_31b811_kGO = d6;
        this.field_364ffb6_Dne = bMa;
        this.field_267cf5_Qnq = 8;
        if (wkD != null) {
            this.field_378d9a7_Dne = wkD.method_285baa50_Dne("Explosions");
            if (this.field_378d9a7_Dne.method_7a46288d_Dne() == 0) {
                this.field_378d9a7_Dne = null;
            } else {
                this.field_267cf5_Qnq = this.field_378d9a7_Dne.method_7a46288d_Dne() * 2 - 1;
                for (int i = 0; i < this.field_378d9a7_Dne.method_7a46288d_Dne(); ++i) {
                    WkD wkD2 = (WkD)this.field_378d9a7_Dne.method_77d0d055_FWm(i);
                    if (!wkD2.method_110c4dc7_FWm("Flicker")) continue;
                    this.field_2092bf_Dne = true;
                    this.field_267cf5_Qnq += 15;
                    break;
                }
            }
        }
    }

    @Override
    public int method_7a46288d_Dne() {
        return 0;
    }
}

