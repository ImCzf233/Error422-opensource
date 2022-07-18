package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from dhs
 */
public class dhs_0
extends CAZ {
    float field_2092ab_Dne;

    public dhs_0(Qnq qnq, double d, double d2, double d3, float f, float f2, float f3, float f4) {
        super(qnq, d, d2, d3, 0.0, 0.0, 0.0);
        this.field_291868_XHL *= (double)0.1f;
        this.field_2a9ad1_Zpi *= (double)0.1f;
        this.field_31b811_kGO *= (double)0.1f;
        if (f2 == 0.0f) {
            f2 = 1.0f;
        }
        float f5 = (float)Math.random() * 0.4f + 0.6f;
        this.field_388da3_zGp = ((float)(Math.random() * (double)0.2f) + 0.8f) * f2 * f5;
        this.field_20b854_DyG = ((float)(Math.random() * (double)0.2f) + 0.8f) * f3 * f5;
        this.field_2f0dd5_div = ((float)(Math.random() * (double)0.2f) + 0.8f) * f4 * f5;
        this.field_267cf2_Qnq *= 0.75f;
        this.field_267cf2_Qnq *= f;
        this.field_2092ab_Dne = this.field_267cf2_Qnq;
        this.field_267cf5_Qnq = (int)(8.0 / (Math.random() * 0.8 + 0.2));
        this.field_267cf5_Qnq = (int)((float)this.field_267cf5_Qnq * f);
        this.field_31b827_kGO = false;
    }

    public dhs_0(Qnq qnq, double d, double d2, double d3, float f, float f2, float f3) {
        this(qnq, d, d2, d3, 1.0f, f, f2, f3);
    }

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

    @Override
    public void method_7a46289a_Dne() {
        this.field_2d29ef_aFZ = this.field_2f0dd3_div;
        this.field_388da1_zGp = this.field_22c5fd_IjH;
        this.field_20b852_DyG = this.field_334487_mrb;
        if (this.field_2e5f1b_bzF++ >= this.field_267cf5_Qnq) {
            this.method_5d73f9d_g_();
        }
        this.method_143f9e1c_bzF(7 - this.field_2e5f1b_bzF * 8 / this.field_267cf5_Qnq);
        this.method_2be429a4_Dne(this.field_291868_XHL, this.field_2a9ad1_Zpi, this.field_31b811_kGO);
        if (this.field_22c5fd_IjH == this.field_388da1_zGp) {
            this.field_291868_XHL *= 1.1;
            this.field_31b811_kGO *= 1.1;
        }
        this.field_291868_XHL *= (double)0.96f;
        this.field_2a9ad1_Zpi *= (double)0.96f;
        this.field_31b811_kGO *= (double)0.96f;
        if (this.field_2d2a05_aFZ) {
            this.field_291868_XHL *= (double)0.7f;
            this.field_31b811_kGO *= (double)0.7f;
        }
    }
}

