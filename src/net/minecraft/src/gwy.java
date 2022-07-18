package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class gwy
extends CAZ {
    @Override
    public void method_7a46289a_Dne() {
        this.field_2d29ef_aFZ = this.field_2f0dd3_div;
        this.field_388da1_zGp = this.field_22c5fd_IjH;
        this.field_20b852_DyG = this.field_334487_mrb;
        this.field_2a9ad1_Zpi += 0.002;
        this.method_2be429a4_Dne(this.field_291868_XHL, this.field_2a9ad1_Zpi, this.field_31b811_kGO);
        this.field_291868_XHL *= (double)0.85f;
        this.field_2a9ad1_Zpi *= (double)0.85f;
        this.field_31b811_kGO *= (double)0.85f;
        if (this.field_36c4f18_Dne.method_d9802b31_Dne(geR.method_117d0718_FWm(this.field_2f0dd3_div), geR.method_117d0718_FWm(this.field_22c5fd_IjH), geR.method_117d0718_FWm(this.field_334487_mrb)) != KFd.field_1411d34d_div) {
            this.method_5d73f9d_g_();
        }
        if (this.field_267cf5_Qnq-- <= 0) {
            this.method_5d73f9d_g_();
        }
    }

    public gwy(Qnq qnq, double d, double d2, double d3, double d4, double d5, double d6) {
        super(qnq, d, d2, d3, d4, d5, d6);
        this.field_388da3_zGp = 1.0f;
        this.field_20b854_DyG = 1.0f;
        this.field_2f0dd5_div = 1.0f;
        this.method_143f9e1c_bzF(32);
        this.method_16b621a_Dne(0.02f, 0.02f);
        this.field_267cf2_Qnq *= this.field_7331eae7_Dne.nextFloat() * 0.6f + 0.2f;
        this.field_291868_XHL = d4 * (double)0.2f + (double)((float)(Math.random() * 2.0 - 1.0) * 0.02f);
        this.field_2a9ad1_Zpi = d5 * (double)0.2f + (double)((float)(Math.random() * 2.0 - 1.0) * 0.02f);
        this.field_31b811_kGO = d6 * (double)0.2f + (double)((float)(Math.random() * 2.0 - 1.0) * 0.02f);
        this.field_267cf5_Qnq = (int)(8.0 / (Math.random() * 0.8 + 0.2));
    }
}

