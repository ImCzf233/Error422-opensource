package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class KUG
extends CAZ {
    float field_2092ab_Dne;

    @Override
    public void method_179c0fdf_Dne(WAR wAR, float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = ((float)this.field_2e5f1b_bzF + f) / (float)this.field_267cf5_Qnq * 32.0f;
        if (f7 < 0.0f) {
            f7 = 0.0f;
        }
        if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        this.field_267cf2_Qnq = this.field_2092ab_Dne * f7;
        super.method_179c0fdf_Dne(wAR, f, f2, f3, f4, f5, f6);
    }

    public KUG(Qnq qnq, double d, double d2, double d3, double d4, double d5, double d6, float f) {
        super(qnq, d, d2, d3, 0.0, 0.0, 0.0);
        this.field_291868_XHL *= (double)0.1f;
        this.field_2a9ad1_Zpi *= (double)0.1f;
        this.field_31b811_kGO *= (double)0.1f;
        this.field_291868_XHL += d4 * 0.4;
        this.field_2a9ad1_Zpi += d5 * 0.4;
        this.field_31b811_kGO += d6 * 0.4;
        this.field_20b854_DyG = this.field_2f0dd5_div = (float)(Math.random() * (double)0.3f + (double)0.6f);
        this.field_388da3_zGp = this.field_2f0dd5_div;
        this.field_267cf2_Qnq *= 0.75f;
        this.field_267cf2_Qnq *= f;
        this.field_2092ab_Dne = this.field_267cf2_Qnq;
        this.field_267cf5_Qnq = (int)(6.0 / (Math.random() * 0.8 + 0.6));
        this.field_267cf5_Qnq = (int)((float)this.field_267cf5_Qnq * f);
        this.field_31b827_kGO = false;
        this.method_143f9e1c_bzF(65);
        this.method_7a46289a_Dne();
    }

    public KUG(Qnq qnq, double d, double d2, double d3, double d4, double d5, double d6) {
        this(qnq, d, d2, d3, d4, d5, d6, 1.0f);
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
        this.field_20b854_DyG = (float)((double)this.field_20b854_DyG * 0.96);
        this.field_2f0dd5_div = (float)((double)this.field_2f0dd5_div * 0.9);
        this.field_291868_XHL *= (double)0.7f;
        this.field_2a9ad1_Zpi *= (double)0.7f;
        this.field_31b811_kGO *= (double)0.7f;
        this.field_2a9ad1_Zpi -= (double)0.02f;
        if (this.field_2d2a05_aFZ) {
            this.field_291868_XHL *= (double)0.7f;
            this.field_31b811_kGO *= (double)0.7f;
        }
    }
}

