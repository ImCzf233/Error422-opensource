package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class asS
extends CAZ {
    private float field_2092ab_Dne;

    public asS(Qnq qnq, double d, double d2, double d3) {
        super(qnq, d, d2, d3, 0.0, 0.0, 0.0);
        this.field_291868_XHL *= (double)0.8f;
        this.field_2a9ad1_Zpi *= (double)0.8f;
        this.field_31b811_kGO *= (double)0.8f;
        this.field_2a9ad1_Zpi = this.field_7331eae7_Dne.nextFloat() * 0.4f + 0.05f;
        this.field_2f0dd5_div = 1.0f;
        this.field_20b854_DyG = 1.0f;
        this.field_388da3_zGp = 1.0f;
        this.field_267cf2_Qnq *= this.field_7331eae7_Dne.nextFloat() * 2.0f + 0.2f;
        this.field_2092ab_Dne = this.field_267cf2_Qnq;
        this.field_267cf5_Qnq = (int)(16.0 / (Math.random() * 0.8 + 0.2));
        this.field_31b827_kGO = false;
        this.method_143f9e1c_bzF(49);
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
        int n2 = 240;
        int n3 = n >> 16 & 0xFF;
        return n2 | n3 << 16;
    }

    @Override
    public void method_179c0fdf_Dne(WAR wAR, float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = ((float)this.field_2e5f1b_bzF + f) / (float)this.field_267cf5_Qnq;
        this.field_267cf2_Qnq = this.field_2092ab_Dne * (1.0f - f7 * f7);
        super.method_179c0fdf_Dne(wAR, f, f2, f3, f4, f5, f6);
    }

    @Override
    public float method_ce7f5256_Dne(float f) {
        return 1.0f;
    }

    @Override
    public void method_7a46289a_Dne() {
        this.field_2d29ef_aFZ = this.field_2f0dd3_div;
        this.field_388da1_zGp = this.field_22c5fd_IjH;
        this.field_20b852_DyG = this.field_334487_mrb;
        if (this.field_2e5f1b_bzF++ >= this.field_267cf5_Qnq) {
            this.method_5d73f9d_g_();
        }
        float f = (float)this.field_2e5f1b_bzF / (float)this.field_267cf5_Qnq;
        if (this.field_7331eae7_Dne.nextFloat() > f) {
            this.field_36c4f18_Dne.method_8600ec24_Dne("smoke", this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb, this.field_291868_XHL, this.field_2a9ad1_Zpi, this.field_31b811_kGO);
        }
        this.field_2a9ad1_Zpi -= 0.03;
        this.method_2be429a4_Dne(this.field_291868_XHL, this.field_2a9ad1_Zpi, this.field_31b811_kGO);
        this.field_291868_XHL *= (double)0.999f;
        this.field_2a9ad1_Zpi *= (double)0.999f;
        this.field_31b811_kGO *= (double)0.999f;
        if (this.field_2d2a05_aFZ) {
            this.field_291868_XHL *= (double)0.7f;
            this.field_31b811_kGO *= (double)0.7f;
        }
    }
}

