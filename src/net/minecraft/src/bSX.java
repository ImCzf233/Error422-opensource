package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class bSX
extends CAZ {
    @Override
    public void method_179c0fdf_Dne(WAR wAR, float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = 0.25f;
        float f8 = f7 + 0.25f;
        float f9 = 0.125f;
        float f10 = f9 + 0.25f;
        float f11 = 7.1f * geR.method_ce7f5256_Dne(((float)this.field_2e5f1b_bzF + f - 1.0f) * 0.25f * (float)Math.PI);
        this.field_22c5ff_IjH = 0.6f - ((float)this.field_2e5f1b_bzF + f - 1.0f) * 0.25f * 0.5f;
        float f12 = (float)(this.field_2d29ef_aFZ + (this.field_2f0dd3_div - this.field_2d29ef_aFZ) * (double)f - field_2092a9_Dne);
        float f13 = (float)(this.field_388da1_zGp + (this.field_22c5fd_IjH - this.field_388da1_zGp) * (double)f - field_212608_FWm);
        float f14 = (float)(this.field_20b852_DyG + (this.field_334487_mrb - this.field_20b852_DyG) * (double)f - field_2e5f16_bzF);
        wAR.method_54283b9a_Dne(this.field_388da3_zGp, this.field_20b854_DyG, this.field_2f0dd5_div, this.field_22c5ff_IjH);
        wAR.method_c38c5864_Dne(f12 - f2 * f11 - f5 * f11, f13 - f3 * f11, f14 - f4 * f11 - f6 * f11, f8, f10);
        wAR.method_c38c5864_Dne(f12 - f2 * f11 + f5 * f11, f13 + f3 * f11, f14 - f4 * f11 + f6 * f11, f8, f9);
        wAR.method_c38c5864_Dne(f12 + f2 * f11 + f5 * f11, f13 + f3 * f11, f14 + f4 * f11 + f6 * f11, f7, f9);
        wAR.method_c38c5864_Dne(f12 + f2 * f11 - f5 * f11, f13 - f3 * f11, f14 + f4 * f11 - f6 * f11, f7, f10);
    }

    protected bSX(Qnq qnq, double d, double d2, double d3) {
        super(qnq, d, d2, d3);
        this.field_267cf5_Qnq = 4;
    }
}

