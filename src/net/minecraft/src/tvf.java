package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class tvf
extends CAZ {
    @Override
    public void method_7a46289a_Dne() {
        this.field_2d29ef_aFZ = this.field_2f0dd3_div;
        this.field_388da1_zGp = this.field_22c5fd_IjH;
        this.field_20b852_DyG = this.field_334487_mrb;
        this.method_2be429a4_Dne(this.field_291868_XHL, this.field_2a9ad1_Zpi, this.field_31b811_kGO);
        if (this.field_36c4f18_Dne.method_d9802b31_Dne(geR.method_117d0718_FWm(this.field_2f0dd3_div), geR.method_117d0718_FWm(this.field_22c5fd_IjH), geR.method_117d0718_FWm(this.field_334487_mrb)) != KFd.field_1411d34d_div) {
            this.method_5d73f9d_g_();
        }
        if (this.field_267cf5_Qnq-- <= 0) {
            this.method_5d73f9d_g_();
        }
    }

    public tvf(Qnq qnq, double d, double d2, double d3, double d4, double d5, double d6) {
        super(qnq, d, d2 - 0.125, d3, d4, d5, d6);
        this.field_388da3_zGp = 0.4f;
        this.field_20b854_DyG = 0.4f;
        this.field_2f0dd5_div = 0.7f;
        this.method_143f9e1c_bzF(0);
        this.method_16b621a_Dne(0.01f, 0.01f);
        this.field_267cf2_Qnq *= this.field_7331eae7_Dne.nextFloat() * 0.6f + 0.2f;
        this.field_291868_XHL = d4 * 0.0;
        this.field_2a9ad1_Zpi = d5 * 0.0;
        this.field_31b811_kGO = d6 * 0.0;
        this.field_267cf5_Qnq = (int)(16.0 / (Math.random() * 0.8 + 0.2));
    }
}

