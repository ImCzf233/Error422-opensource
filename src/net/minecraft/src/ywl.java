package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class ywl
extends CAZ {
    public ywl(Qnq qnq, double d, double d2, double d3, double d4, double d5, double d6) {
        super(qnq, d, d2, d3, d4, d5, d6);
        float f;
        this.field_388da3_zGp = f = this.field_7331eae7_Dne.nextFloat() * 0.1f + 0.2f;
        this.field_20b854_DyG = f;
        this.field_2f0dd5_div = f;
        this.method_143f9e1c_bzF(0);
        this.method_16b621a_Dne(0.02f, 0.02f);
        this.field_267cf2_Qnq *= this.field_7331eae7_Dne.nextFloat() * 0.6f + 0.5f;
        this.field_291868_XHL *= (double)0.02f;
        this.field_2a9ad1_Zpi *= (double)0.02f;
        this.field_31b811_kGO *= (double)0.02f;
        this.field_267cf5_Qnq = (int)(20.0 / (Math.random() * 0.8 + 0.2));
        this.field_31b827_kGO = true;
    }

    @Override
    public void method_7a46289a_Dne() {
        this.field_2d29ef_aFZ = this.field_2f0dd3_div;
        this.field_388da1_zGp = this.field_22c5fd_IjH;
        this.field_20b852_DyG = this.field_334487_mrb;
        this.method_2be429a4_Dne(this.field_291868_XHL, this.field_2a9ad1_Zpi, this.field_31b811_kGO);
        this.field_291868_XHL *= 0.99;
        this.field_2a9ad1_Zpi *= 0.99;
        this.field_31b811_kGO *= 0.99;
        if (this.field_267cf5_Qnq-- <= 0) {
            this.method_5d73f9d_g_();
        }
    }
}

