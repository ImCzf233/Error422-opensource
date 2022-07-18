package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class xLg
extends Gor {
    private rxL[] field_8371bdc1_Dne = new rxL[7];
    private rxL[] field_fdf16dc2_FWm;
    private static final int[][] field_7c7025ad_FWm;
    private static final int[][] field_7a46ee0e_Dne;
    private float[] field_3f1c586_Dne = new float[7];

    public xLg() {
        float f = -3.5f;
        for (int i = 0; i < this.field_8371bdc1_Dne.length; ++i) {
            this.field_8371bdc1_Dne[i] = new rxL(this, field_7c7025ad_FWm[i][0], field_7c7025ad_FWm[i][1]);
            this.field_8371bdc1_Dne[i].method_cbecd0a8_Dne((float)field_7a46ee0e_Dne[i][0] * -0.5f, 0.0f, (float)field_7a46ee0e_Dne[i][2] * -0.5f, field_7a46ee0e_Dne[i][0], field_7a46ee0e_Dne[i][1], field_7a46ee0e_Dne[i][2]);
            this.field_8371bdc1_Dne[i].method_2c0148e6_Dne(0.0f, 24 - field_7a46ee0e_Dne[i][1], f);
            this.field_3f1c586_Dne[i] = f;
            if (i >= this.field_8371bdc1_Dne.length - 1) continue;
            f += (float)(field_7a46ee0e_Dne[i][2] + field_7a46ee0e_Dne[i + 1][2]) * 0.5f;
        }
        this.field_fdf16dc2_FWm = new rxL[3];
        this.field_fdf16dc2_FWm[0] = new rxL(this, 20, 0);
        this.field_fdf16dc2_FWm[0].method_cbecd0a8_Dne(-5.0f, 0.0f, (float)field_7a46ee0e_Dne[2][2] * -0.5f, 10, 8, field_7a46ee0e_Dne[2][2]);
        this.field_fdf16dc2_FWm[0].method_2c0148e6_Dne(0.0f, 16.0f, this.field_3f1c586_Dne[2]);
        this.field_fdf16dc2_FWm[1] = new rxL(this, 20, 11);
        this.field_fdf16dc2_FWm[1].method_cbecd0a8_Dne(-3.0f, 0.0f, (float)field_7a46ee0e_Dne[4][2] * -0.5f, 6, 4, field_7a46ee0e_Dne[4][2]);
        this.field_fdf16dc2_FWm[1].method_2c0148e6_Dne(0.0f, 20.0f, this.field_3f1c586_Dne[4]);
        this.field_fdf16dc2_FWm[2] = new rxL(this, 20, 18);
        this.field_fdf16dc2_FWm[2].method_cbecd0a8_Dne(-3.0f, 0.0f, (float)field_7a46ee0e_Dne[4][2] * -0.5f, 6, 5, field_7a46ee0e_Dne[1][2]);
        this.field_fdf16dc2_FWm[2].method_2c0148e6_Dne(0.0f, 19.0f, this.field_3f1c586_Dne[1]);
    }

    @Override
    public void method_5c531ba0_Dne(float f, float f2, float f3, float f4, float f5, float f6, sMa sMa2) {
        for (int i = 0; i < this.field_8371bdc1_Dne.length; ++i) {
            this.field_8371bdc1_Dne[i].field_20b854_DyG = geR.method_117d0e97_FWm(f3 * 0.9f + (float)i * 0.15f * (float)Math.PI) * (float)Math.PI * 0.05f * (float)(1 + Math.abs(i - 2));
            this.field_8371bdc1_Dne[i].field_2e5f18_bzF = geR.method_ce7f5256_Dne(f3 * 0.9f + (float)i * 0.15f * (float)Math.PI) * (float)Math.PI * 0.2f * (float)Math.abs(i - 2);
        }
        this.field_fdf16dc2_FWm[0].field_20b854_DyG = this.field_8371bdc1_Dne[2].field_20b854_DyG;
        this.field_fdf16dc2_FWm[1].field_20b854_DyG = this.field_8371bdc1_Dne[4].field_20b854_DyG;
        this.field_fdf16dc2_FWm[1].field_2e5f18_bzF = this.field_8371bdc1_Dne[4].field_2e5f18_bzF;
        this.field_fdf16dc2_FWm[2].field_20b854_DyG = this.field_8371bdc1_Dne[1].field_20b854_DyG;
        this.field_fdf16dc2_FWm[2].field_2e5f18_bzF = this.field_8371bdc1_Dne[1].field_2e5f18_bzF;
    }

    static {
        field_7a46ee0e_Dne = new int[][]{{3, 2, 2}, {4, 3, 2}, {6, 4, 3}, {3, 3, 3}, {2, 2, 3}, {2, 1, 2}, {1, 1, 2}};
        field_7c7025ad_FWm = new int[][]{{0, 0}, {0, 4}, {0, 9}, {0, 16}, {0, 22}, {11, 0}, {13, 4}};
    }

    @Override
    public void method_3a102820_Dne(sMa sMa2, float f, float f2, float f3, float f4, float f5, float f6) {
        int n;
        this.method_5c531ba0_Dne(f, f2, f3, f4, f5, f6, sMa2);
        for (n = 0; n < this.field_8371bdc1_Dne.length; ++n) {
            this.field_8371bdc1_Dne[n].method_ce7f5266_Dne(f6);
        }
        for (n = 0; n < this.field_fdf16dc2_FWm.length; ++n) {
            this.field_fdf16dc2_FWm[n].method_ce7f5266_Dne(f6);
        }
    }
}

