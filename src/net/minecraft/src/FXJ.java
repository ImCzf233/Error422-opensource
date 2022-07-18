package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class FXJ
extends CAZ {
    private float field_2092ab_Dne;

    @Override
    public float method_ce7f5256_Dne(float f) {
        float f2 = ((float)this.field_2e5f1b_bzF + f) / (float)this.field_267cf5_Qnq;
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        float f3 = super.method_ce7f5256_Dne(f);
        return f3 * f2 + (1.0f - f2);
    }

    @Override
    public void method_7a46289a_Dne() {
        this.field_2d29ef_aFZ = this.field_2f0dd3_div;
        this.field_388da1_zGp = this.field_22c5fd_IjH;
        this.field_20b852_DyG = this.field_334487_mrb;
        if (this.field_2e5f1b_bzF++ >= this.field_267cf5_Qnq) {
            this.method_5d73f9d_g_();
        }
        this.method_2be429a4_Dne(this.field_291868_XHL, this.field_2a9ad1_Zpi, this.field_31b811_kGO);
        this.field_291868_XHL *= (double)0.96f;
        this.field_2a9ad1_Zpi *= (double)0.96f;
        this.field_31b811_kGO *= (double)0.96f;
        if (this.field_2d2a05_aFZ) {
            this.field_291868_XHL *= (double)0.7f;
            this.field_31b811_kGO *= (double)0.7f;
        }
    }

    @Override
    public int method_ce7f5259_Dne(float f) {
        float f2 = ((float)this.field_2e5f1b_bzF + f) / (float)this.field_267cf5_Qnq;
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        int n = super.method_ce7f5259_Dne(f);
        int n2 = n & 0xFF;
        int n3 = n >> 16 & 0xFF;
        if ((n2 += (int)(f2 * 15.0f * 16.0f)) > 240) {
            n2 = 240;
        }
        return n2 | n3 << 16;
    }

    public FXJ(Qnq qnq, double d, double d2, double d3, double d4, double d5, double d6) {
        super(qnq, d, d2, d3, d4, d5, d6);
        this.field_291868_XHL = this.field_291868_XHL * (double)0.01f + d4;
        this.field_2a9ad1_Zpi = this.field_2a9ad1_Zpi * (double)0.01f + d5;
        this.field_31b811_kGO = this.field_31b811_kGO * (double)0.01f + d6;
        double d7 = d + (double)((this.field_7331eae7_Dne.nextFloat() - this.field_7331eae7_Dne.nextFloat()) * 0.05f);
        d7 = d2 + (double)((this.field_7331eae7_Dne.nextFloat() - this.field_7331eae7_Dne.nextFloat()) * 0.05f);
        d7 = d3 + (double)((this.field_7331eae7_Dne.nextFloat() - this.field_7331eae7_Dne.nextFloat()) * 0.05f);
        this.field_2092ab_Dne = this.field_267cf2_Qnq;
        this.field_2f0dd5_div = 1.0f;
        this.field_20b854_DyG = 1.0f;
        this.field_388da3_zGp = 1.0f;
        this.field_267cf5_Qnq = (int)(8.0 / (Math.random() * 0.8 + 0.2)) + 4;
        this.field_31b827_kGO = true;
        this.method_143f9e1c_bzF(48);
    }

    @Override
    public void method_179c0fdf_Dne(WAR wAR, float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = ((float)this.field_2e5f1b_bzF + f) / (float)this.field_267cf5_Qnq;
        this.field_267cf2_Qnq = this.field_2092ab_Dne * (1.0f - f7 * f7 * 0.5f);
        super.method_179c0fdf_Dne(wAR, f, f2, f3, f4, f5, f6);
    }
}

