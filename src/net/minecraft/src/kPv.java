package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class kPv
extends CAZ {
    private double field_34856d_qLR;
    private double field_28e7f8_Vxn;
    private float field_2092ab_Dne;
    private double field_1ed012_ATE;

    @Override
    public void method_179c0fdf_Dne(WAR wAR, float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = ((float)this.field_2e5f1b_bzF + f) / (float)this.field_267cf5_Qnq;
        f7 = 1.0f - f7;
        f7 *= f7;
        f7 = 1.0f - f7;
        this.field_267cf2_Qnq = this.field_2092ab_Dne * f7;
        super.method_179c0fdf_Dne(wAR, f, f2, f3, f4, f5, f6);
    }

    @Override
    public void method_7a46289a_Dne() {
        float f;
        this.field_2d29ef_aFZ = this.field_2f0dd3_div;
        this.field_388da1_zGp = this.field_22c5fd_IjH;
        this.field_20b852_DyG = this.field_334487_mrb;
        float f2 = f = (float)this.field_2e5f1b_bzF / (float)this.field_267cf5_Qnq;
        f = -f + f * f * 2.0f;
        f = 1.0f - f;
        this.field_2f0dd3_div = this.field_34856d_qLR + this.field_291868_XHL * (double)f;
        this.field_22c5fd_IjH = this.field_1ed012_ATE + this.field_2a9ad1_Zpi * (double)f + (double)(1.0f - f2);
        this.field_334487_mrb = this.field_28e7f8_Vxn + this.field_31b811_kGO * (double)f;
        if (this.field_2e5f1b_bzF++ >= this.field_267cf5_Qnq) {
            this.method_5d73f9d_g_();
        }
    }

    public kPv(Qnq qnq, double d, double d2, double d3, double d4, double d5, double d6) {
        super(qnq, d, d2, d3, d4, d5, d6);
        this.field_291868_XHL = d4;
        this.field_2a9ad1_Zpi = d5;
        this.field_31b811_kGO = d6;
        this.field_34856d_qLR = this.field_2f0dd3_div = d;
        this.field_1ed012_ATE = this.field_22c5fd_IjH = d2;
        this.field_28e7f8_Vxn = this.field_334487_mrb = d3;
        float f = this.field_7331eae7_Dne.nextFloat() * 0.6f + 0.4f;
        this.field_2092ab_Dne = this.field_267cf2_Qnq = this.field_7331eae7_Dne.nextFloat() * 0.2f + 0.5f;
        this.field_20b854_DyG = this.field_2f0dd5_div = 1.0f * f;
        this.field_388da3_zGp = this.field_2f0dd5_div;
        this.field_20b854_DyG *= 0.3f;
        this.field_388da3_zGp *= 0.9f;
        this.field_267cf5_Qnq = (int)(Math.random() * 10.0) + 40;
        this.field_31b827_kGO = true;
        this.method_143f9e1c_bzF((int)(Math.random() * 8.0));
    }

    @Override
    public float method_ce7f5256_Dne(float f) {
        float f2 = super.method_ce7f5256_Dne(f);
        float f3 = (float)this.field_2e5f1b_bzF / (float)this.field_267cf5_Qnq;
        f3 = f3 * f3 * f3 * f3;
        return f2 * (1.0f - f3) + f3;
    }

    @Override
    public int method_ce7f5259_Dne(float f) {
        int n = super.method_ce7f5259_Dne(f);
        float f2 = (float)this.field_2e5f1b_bzF / (float)this.field_267cf5_Qnq;
        f2 *= f2;
        f2 *= f2;
        int n2 = n & 0xFF;
        int n3 = n >> 16 & 0xFF;
        if ((n3 += (int)(f2 * 15.0f * 16.0f)) > 240) {
            n3 = 240;
        }
        return n2 | n3 << 16;
    }
}

