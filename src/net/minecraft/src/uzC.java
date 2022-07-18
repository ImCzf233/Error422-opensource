package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class uzC
extends gwq {
    private int field_21260d_FWm;
    private int field_2e5f1b_bzF;
    private int field_2092ae_Dne;

    public uzC(int n, int n2) {
        this(n, n2, zKP.field_37e6aed_Dne.field_21260d_FWm);
    }

    @Override
    public boolean method_c3e4cb88_Dne(Qnq qnq, Random random, int n, int n2, int n3) {
        float f = random.nextFloat() * (float)Math.PI;
        double d = (float)(n + 8) + geR.method_ce7f5256_Dne(f) * (float)this.field_21260d_FWm / 8.0f;
        double d2 = (float)(n + 8) - geR.method_ce7f5256_Dne(f) * (float)this.field_21260d_FWm / 8.0f;
        double d3 = (float)(n3 + 8) + geR.method_117d0e97_FWm(f) * (float)this.field_21260d_FWm / 8.0f;
        double d4 = (float)(n3 + 8) - geR.method_117d0e97_FWm(f) * (float)this.field_21260d_FWm / 8.0f;
        double d5 = n2 + random.nextInt(3) - 2;
        double d6 = n2 + random.nextInt(3) - 2;
        for (int i = 0; i <= this.field_21260d_FWm; ++i) {
            double d7 = d + (d2 - d) * (double)i / (double)this.field_21260d_FWm;
            double d8 = d5 + (d6 - d5) * (double)i / (double)this.field_21260d_FWm;
            double d9 = d3 + (d4 - d3) * (double)i / (double)this.field_21260d_FWm;
            double d10 = random.nextDouble() * (double)this.field_21260d_FWm / 16.0;
            double d11 = (double)(geR.method_ce7f5256_Dne((float)i * (float)Math.PI / (float)this.field_21260d_FWm) + 1.0f) * d10 + 1.0;
            double d12 = (double)(geR.method_ce7f5256_Dne((float)i * (float)Math.PI / (float)this.field_21260d_FWm) + 1.0f) * d10 + 1.0;
            int n4 = geR.method_117d0718_FWm(d7 - d11 / 2.0);
            int n5 = geR.method_117d0718_FWm(d8 - d12 / 2.0);
            int n6 = geR.method_117d0718_FWm(d9 - d11 / 2.0);
            int n7 = geR.method_117d0718_FWm(d7 + d11 / 2.0);
            int n8 = geR.method_117d0718_FWm(d8 + d12 / 2.0);
            int n9 = geR.method_117d0718_FWm(d9 + d11 / 2.0);
            for (int j = n4; j <= n7; ++j) {
                double d13 = ((double)j + 0.5 - d7) / (d11 / 2.0);
                if (!(d13 * d13 < 1.0)) continue;
                for (int k = n5; k <= n8; ++k) {
                    double d14 = ((double)k + 0.5 - d8) / (d12 / 2.0);
                    if (!(d13 * d13 + d14 * d14 < 1.0)) continue;
                    for (int i2 = n6; i2 <= n9; ++i2) {
                        double d15 = ((double)i2 + 0.5 - d9) / (d11 / 2.0);
                        if (!(d13 * d13 + d14 * d14 + d15 * d15 < 1.0) || qnq.method_2c2cf7bc_Dne(j, k, i2) != this.field_2e5f1b_bzF) continue;
                        qnq.method_17d7ea9d_FWm(j, k, i2, this.field_2092ae_Dne, 0, 2);
                    }
                }
            }
        }
        return true;
    }

    public uzC(int n, int n2, int n3) {
        this.field_2092ae_Dne = n;
        this.field_21260d_FWm = n2;
        this.field_2e5f1b_bzF = n3;
    }
}

