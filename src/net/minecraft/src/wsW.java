package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class wsW
extends xVn {
    public double field_2092a9_Dne;
    public double field_212608_FWm;
    public double field_2e5f16_bzF;
    private int[] field_3f1c589_Dne = new int[512];

    public final double method_2c2a9f17_Dne(int n, double d, double d2) {
        int n2 = n & 0xF;
        double d3 = (double)(1 - ((n2 & 8) >> 3)) * d;
        double d4 = n2 < 4 ? 0.0 : (n2 != 12 && n2 != 14 ? d2 : d);
        return ((n2 & 1) == 0 ? d3 : -d3) + ((n2 & 2) == 0 ? d4 : -d4);
    }

    public final double method_5929a623_Dne(int n, double d, double d2, double d3) {
        double d4;
        int n2 = n & 0xF;
        double d5 = d4 = n2 < 8 ? d : d2;
        double d6 = n2 < 4 ? d2 : (n2 != 12 && n2 != 14 ? d3 : d);
        return ((n2 & 1) == 0 ? d4 : -d4) + ((n2 & 2) == 0 ? d6 : -d6);
    }

    public wsW() {
        this(new Random());
    }

    public final double method_2be42992_Dne(double d, double d2, double d3) {
        return d2 + d * (d3 - d2);
    }

    public void method_7cf08108_Dne(double[] dArray, double d, double d2, double d3, int n, int n2, int n3, double d4, double d5, double d6, double d7) {
        if (n2 == 1) {
            boolean bl = false;
            boolean bl2 = false;
            boolean bl3 = false;
            boolean bl4 = false;
            double d8 = 0.0;
            double d9 = 0.0;
            int n4 = 0;
            double d10 = 1.0 / d7;
            for (int i = 0; i < n; ++i) {
                double d11 = d + (double)i * d4 + this.field_2092a9_Dne;
                int n5 = (int)d11;
                if (d11 < (double)n5) {
                    --n5;
                }
                int n6 = n5 & 0xFF;
                double d12 = (d11 -= (double)n5) * d11 * d11 * (d11 * (d11 * 6.0 - 15.0) + 10.0);
                for (int j = 0; j < n3; ++j) {
                    int n7;
                    double d13 = d3 + (double)j * d6 + this.field_2e5f16_bzF;
                    int n8 = (int)d13;
                    if (d13 < (double)n8) {
                        --n8;
                    }
                    int n9 = n8 & 0xFF;
                    double d14 = (d13 -= (double)n8) * d13 * d13 * (d13 * (d13 * 6.0 - 15.0) + 10.0);
                    int n10 = this.field_3f1c589_Dne[n6] + 0;
                    int n11 = this.field_3f1c589_Dne[n10] + n9;
                    int n12 = this.field_3f1c589_Dne[n6 + 1] + 0;
                    int n13 = this.field_3f1c589_Dne[n12] + n9;
                    d8 = this.method_2be42992_Dne(d12, this.method_2c2a9f17_Dne(this.field_3f1c589_Dne[n11], d11, d13), this.method_5929a623_Dne(this.field_3f1c589_Dne[n13], d11 - 1.0, 0.0, d13));
                    d9 = this.method_2be42992_Dne(d12, this.method_5929a623_Dne(this.field_3f1c589_Dne[n11 + 1], d11, 0.0, d13 - 1.0), this.method_5929a623_Dne(this.field_3f1c589_Dne[n13 + 1], d11 - 1.0, 0.0, d13 - 1.0));
                    double d15 = this.method_2be42992_Dne(d14, d8, d9);
                    int n14 = n7 = n4++;
                    dArray[n14] = dArray[n14] + d15 * d10;
                }
            }
        } else {
            int n15 = 0;
            double d16 = 1.0 / d7;
            int n16 = -1;
            boolean bl = false;
            boolean bl5 = false;
            boolean bl6 = false;
            boolean bl7 = false;
            boolean bl8 = false;
            boolean bl9 = false;
            double d17 = 0.0;
            double d18 = 0.0;
            double d19 = 0.0;
            double d20 = 0.0;
            for (int i = 0; i < n; ++i) {
                double d21 = d + (double)i * d4 + this.field_2092a9_Dne;
                int n17 = (int)d21;
                if (d21 < (double)n17) {
                    --n17;
                }
                int n18 = n17 & 0xFF;
                double d22 = (d21 -= (double)n17) * d21 * d21 * (d21 * (d21 * 6.0 - 15.0) + 10.0);
                for (int j = 0; j < n3; ++j) {
                    double d23 = d3 + (double)j * d6 + this.field_2e5f16_bzF;
                    int n19 = (int)d23;
                    if (d23 < (double)n19) {
                        --n19;
                    }
                    int n20 = n19 & 0xFF;
                    double d24 = (d23 -= (double)n19) * d23 * d23 * (d23 * (d23 * 6.0 - 15.0) + 10.0);
                    for (int k = 0; k < n2; ++k) {
                        int n21;
                        double d25 = d2 + (double)k * d5 + this.field_212608_FWm;
                        int n22 = (int)d25;
                        if (d25 < (double)n22) {
                            --n22;
                        }
                        int n23 = n22 & 0xFF;
                        double d26 = (d25 -= (double)n22) * d25 * d25 * (d25 * (d25 * 6.0 - 15.0) + 10.0);
                        if (k == 0 || n23 != n16) {
                            n16 = n23;
                            int n24 = this.field_3f1c589_Dne[n18] + n23;
                            int n25 = this.field_3f1c589_Dne[n24] + n20;
                            int n26 = this.field_3f1c589_Dne[n24 + 1] + n20;
                            int n27 = this.field_3f1c589_Dne[n18 + 1] + n23;
                            int n28 = this.field_3f1c589_Dne[n27] + n20;
                            int n29 = this.field_3f1c589_Dne[n27 + 1] + n20;
                            d17 = this.method_2be42992_Dne(d22, this.method_5929a623_Dne(this.field_3f1c589_Dne[n25], d21, d25, d23), this.method_5929a623_Dne(this.field_3f1c589_Dne[n28], d21 - 1.0, d25, d23));
                            d18 = this.method_2be42992_Dne(d22, this.method_5929a623_Dne(this.field_3f1c589_Dne[n26], d21, d25 - 1.0, d23), this.method_5929a623_Dne(this.field_3f1c589_Dne[n29], d21 - 1.0, d25 - 1.0, d23));
                            d19 = this.method_2be42992_Dne(d22, this.method_5929a623_Dne(this.field_3f1c589_Dne[n25 + 1], d21, d25, d23 - 1.0), this.method_5929a623_Dne(this.field_3f1c589_Dne[n28 + 1], d21 - 1.0, d25, d23 - 1.0));
                            d20 = this.method_2be42992_Dne(d22, this.method_5929a623_Dne(this.field_3f1c589_Dne[n26 + 1], d21, d25 - 1.0, d23 - 1.0), this.method_5929a623_Dne(this.field_3f1c589_Dne[n29 + 1], d21 - 1.0, d25 - 1.0, d23 - 1.0));
                        }
                        double d27 = this.method_2be42992_Dne(d26, d17, d18);
                        double d28 = this.method_2be42992_Dne(d26, d19, d20);
                        double d29 = this.method_2be42992_Dne(d24, d27, d28);
                        int n30 = n21 = n15++;
                        dArray[n30] = dArray[n30] + d29 * d16;
                    }
                }
            }
        }
    }

    public wsW(Random random) {
        this.field_2092a9_Dne = random.nextDouble() * 256.0;
        this.field_212608_FWm = random.nextDouble() * 256.0;
        this.field_2e5f16_bzF = random.nextDouble() * 256.0;
        int n = 0;
        while (n < 256) {
            this.field_3f1c589_Dne[n] = n++;
        }
        for (n = 0; n < 256; ++n) {
            int n2 = random.nextInt(256 - n) + n;
            int n3 = this.field_3f1c589_Dne[n];
            this.field_3f1c589_Dne[n] = this.field_3f1c589_Dne[n2];
            this.field_3f1c589_Dne[n2] = n3;
            this.field_3f1c589_Dne[n + 256] = this.field_3f1c589_Dne[n];
        }
    }
}

