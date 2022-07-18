package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class DOP {
    public float[] field_59d86b9_bzF;
    public float[] field_4039e07_FWm;
    public float[] field_3f1c586_Dne;
    public float[][] field_7a46ee0b_Dne = new float[16][16];

    public DOP() {
        this.field_3f1c586_Dne = new float[16];
        this.field_4039e07_FWm = new float[16];
        this.field_59d86b9_bzF = new float[16];
    }

    public boolean method_adff145e_Dne(double d, double d2, double d3, double d4, double d5, double d6) {
        for (int i = 0; i < 6; ++i) {
            if (!((double)this.field_7a46ee0b_Dne[i][0] * d + (double)this.field_7a46ee0b_Dne[i][1] * d2 + (double)this.field_7a46ee0b_Dne[i][2] * d3 + (double)this.field_7a46ee0b_Dne[i][3] <= 0.0) || !((double)this.field_7a46ee0b_Dne[i][0] * d4 + (double)this.field_7a46ee0b_Dne[i][1] * d2 + (double)this.field_7a46ee0b_Dne[i][2] * d3 + (double)this.field_7a46ee0b_Dne[i][3] <= 0.0) || !((double)this.field_7a46ee0b_Dne[i][0] * d + (double)this.field_7a46ee0b_Dne[i][1] * d5 + (double)this.field_7a46ee0b_Dne[i][2] * d3 + (double)this.field_7a46ee0b_Dne[i][3] <= 0.0) || !((double)this.field_7a46ee0b_Dne[i][0] * d4 + (double)this.field_7a46ee0b_Dne[i][1] * d5 + (double)this.field_7a46ee0b_Dne[i][2] * d3 + (double)this.field_7a46ee0b_Dne[i][3] <= 0.0) || !((double)this.field_7a46ee0b_Dne[i][0] * d + (double)this.field_7a46ee0b_Dne[i][1] * d2 + (double)this.field_7a46ee0b_Dne[i][2] * d6 + (double)this.field_7a46ee0b_Dne[i][3] <= 0.0) || !((double)this.field_7a46ee0b_Dne[i][0] * d4 + (double)this.field_7a46ee0b_Dne[i][1] * d2 + (double)this.field_7a46ee0b_Dne[i][2] * d6 + (double)this.field_7a46ee0b_Dne[i][3] <= 0.0) || !((double)this.field_7a46ee0b_Dne[i][0] * d + (double)this.field_7a46ee0b_Dne[i][1] * d5 + (double)this.field_7a46ee0b_Dne[i][2] * d6 + (double)this.field_7a46ee0b_Dne[i][3] <= 0.0) || !((double)this.field_7a46ee0b_Dne[i][0] * d4 + (double)this.field_7a46ee0b_Dne[i][1] * d5 + (double)this.field_7a46ee0b_Dne[i][2] * d6 + (double)this.field_7a46ee0b_Dne[i][3] <= 0.0)) continue;
            return false;
        }
        return true;
    }
}

