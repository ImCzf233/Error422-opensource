package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class FgN
extends Gor {
    public rxL field_5e64df2d_Qnq;
    public rxL field_75c33e53_bzF;
    public rxL field_14244690_div;
    public rxL field_1c3cfea5_XHL;
    public rxL field_37b7066_Dne;
    public rxL field_5cbd9ba_IjH;
    public rxL field_f0ad2f5e_zGp;
    public rxL field_162e998f_DyG;
    public rxL field_713ef4ac_aFZ;
    public rxL field_20353c45_FWm;
    public rxL field_75060344_mrb;

    @Override
    public void method_5c531ba0_Dne(float f, float f2, float f3, float f4, float f5, float f6, sMa sMa2) {
        this.field_37b7066_Dne.field_20b854_DyG = f4 / 57.295776f;
        this.field_37b7066_Dne.field_388da3_zGp = f5 / 57.295776f;
        float f7 = 0.7853982f;
        this.field_5e64df2d_Qnq.field_2f0dd5_div = -f7;
        this.field_713ef4ac_aFZ.field_2f0dd5_div = f7;
        this.field_f0ad2f5e_zGp.field_2f0dd5_div = -f7 * 0.74f;
        this.field_162e998f_DyG.field_2f0dd5_div = f7 * 0.74f;
        this.field_14244690_div.field_2f0dd5_div = -f7 * 0.74f;
        this.field_5cbd9ba_IjH.field_2f0dd5_div = f7 * 0.74f;
        this.field_75060344_mrb.field_2f0dd5_div = -f7;
        this.field_1c3cfea5_XHL.field_2f0dd5_div = f7;
        float f8 = -0.0f;
        float f9 = 0.3926991f;
        this.field_5e64df2d_Qnq.field_20b854_DyG = f9 * 2.0f + f8;
        this.field_713ef4ac_aFZ.field_20b854_DyG = -f9 * 2.0f - f8;
        this.field_f0ad2f5e_zGp.field_20b854_DyG = f9 * 1.0f + f8;
        this.field_162e998f_DyG.field_20b854_DyG = -f9 * 1.0f - f8;
        this.field_14244690_div.field_20b854_DyG = -f9 * 1.0f + f8;
        this.field_5cbd9ba_IjH.field_20b854_DyG = f9 * 1.0f - f8;
        this.field_75060344_mrb.field_20b854_DyG = -f9 * 2.0f + f8;
        this.field_1c3cfea5_XHL.field_20b854_DyG = f9 * 2.0f - f8;
        float f10 = -(geR.method_117d0e97_FWm(f * 0.6662f * 2.0f + 0.0f) * 0.4f) * f2;
        float f11 = -(geR.method_117d0e97_FWm(f * 0.6662f * 2.0f + (float)Math.PI) * 0.4f) * f2;
        float f12 = -(geR.method_117d0e97_FWm(f * 0.6662f * 2.0f + 1.5707964f) * 0.4f) * f2;
        float f13 = -(geR.method_117d0e97_FWm(f * 0.6662f * 2.0f + 4.712389f) * 0.4f) * f2;
        float f14 = Math.abs(geR.method_ce7f5256_Dne(f * 0.6662f + 0.0f) * 0.4f) * f2;
        float f15 = Math.abs(geR.method_ce7f5256_Dne(f * 0.6662f + (float)Math.PI) * 0.4f) * f2;
        float f16 = Math.abs(geR.method_ce7f5256_Dne(f * 0.6662f + 1.5707964f) * 0.4f) * f2;
        float f17 = Math.abs(geR.method_ce7f5256_Dne(f * 0.6662f + 4.712389f) * 0.4f) * f2;
        this.field_5e64df2d_Qnq.field_20b854_DyG += f10;
        this.field_713ef4ac_aFZ.field_20b854_DyG += -f10;
        this.field_f0ad2f5e_zGp.field_20b854_DyG += f11;
        this.field_162e998f_DyG.field_20b854_DyG += -f11;
        this.field_14244690_div.field_20b854_DyG += f12;
        this.field_5cbd9ba_IjH.field_20b854_DyG += -f12;
        this.field_75060344_mrb.field_20b854_DyG += f13;
        this.field_1c3cfea5_XHL.field_20b854_DyG += -f13;
        this.field_5e64df2d_Qnq.field_2f0dd5_div += f14;
        this.field_713ef4ac_aFZ.field_2f0dd5_div += -f14;
        this.field_f0ad2f5e_zGp.field_2f0dd5_div += f15;
        this.field_162e998f_DyG.field_2f0dd5_div += -f15;
        this.field_14244690_div.field_2f0dd5_div += f16;
        this.field_5cbd9ba_IjH.field_2f0dd5_div += -f16;
        this.field_75060344_mrb.field_2f0dd5_div += f17;
        this.field_1c3cfea5_XHL.field_2f0dd5_div += -f17;
    }

    public FgN() {
        float f = 0.0f;
        int n = 15;
        this.field_37b7066_Dne = new rxL(this, 32, 4);
        this.field_37b7066_Dne.method_7ccc8363_Dne(-4.0f, -4.0f, -8.0f, 8, 8, 8, f);
        this.field_37b7066_Dne.method_2c0148e6_Dne(0.0f, n, -3.0f);
        this.field_20353c45_FWm = new rxL(this, 0, 0);
        this.field_20353c45_FWm.method_7ccc8363_Dne(-3.0f, -3.0f, -3.0f, 6, 6, 6, f);
        this.field_20353c45_FWm.method_2c0148e6_Dne(0.0f, n, 0.0f);
        this.field_75c33e53_bzF = new rxL(this, 0, 12);
        this.field_75c33e53_bzF.method_7ccc8363_Dne(-5.0f, -4.0f, -6.0f, 10, 8, 12, f);
        this.field_75c33e53_bzF.method_2c0148e6_Dne(0.0f, n, 9.0f);
        this.field_5e64df2d_Qnq = new rxL(this, 18, 0);
        this.field_5e64df2d_Qnq.method_7ccc8363_Dne(-15.0f, -1.0f, -1.0f, 16, 2, 2, f);
        this.field_5e64df2d_Qnq.method_2c0148e6_Dne(-4.0f, n, 2.0f);
        this.field_713ef4ac_aFZ = new rxL(this, 18, 0);
        this.field_713ef4ac_aFZ.method_7ccc8363_Dne(-1.0f, -1.0f, -1.0f, 16, 2, 2, f);
        this.field_713ef4ac_aFZ.method_2c0148e6_Dne(4.0f, n, 2.0f);
        this.field_f0ad2f5e_zGp = new rxL(this, 18, 0);
        this.field_f0ad2f5e_zGp.method_7ccc8363_Dne(-15.0f, -1.0f, -1.0f, 16, 2, 2, f);
        this.field_f0ad2f5e_zGp.method_2c0148e6_Dne(-4.0f, n, 1.0f);
        this.field_162e998f_DyG = new rxL(this, 18, 0);
        this.field_162e998f_DyG.method_7ccc8363_Dne(-1.0f, -1.0f, -1.0f, 16, 2, 2, f);
        this.field_162e998f_DyG.method_2c0148e6_Dne(4.0f, n, 1.0f);
        this.field_14244690_div = new rxL(this, 18, 0);
        this.field_14244690_div.method_7ccc8363_Dne(-15.0f, -1.0f, -1.0f, 16, 2, 2, f);
        this.field_14244690_div.method_2c0148e6_Dne(-4.0f, n, 0.0f);
        this.field_5cbd9ba_IjH = new rxL(this, 18, 0);
        this.field_5cbd9ba_IjH.method_7ccc8363_Dne(-1.0f, -1.0f, -1.0f, 16, 2, 2, f);
        this.field_5cbd9ba_IjH.method_2c0148e6_Dne(4.0f, n, 0.0f);
        this.field_75060344_mrb = new rxL(this, 18, 0);
        this.field_75060344_mrb.method_7ccc8363_Dne(-15.0f, -1.0f, -1.0f, 16, 2, 2, f);
        this.field_75060344_mrb.method_2c0148e6_Dne(-4.0f, n, -1.0f);
        this.field_1c3cfea5_XHL = new rxL(this, 18, 0);
        this.field_1c3cfea5_XHL.method_7ccc8363_Dne(-1.0f, -1.0f, -1.0f, 16, 2, 2, f);
        this.field_1c3cfea5_XHL.method_2c0148e6_Dne(4.0f, n, -1.0f);
    }

    @Override
    public void method_3a102820_Dne(sMa sMa2, float f, float f2, float f3, float f4, float f5, float f6) {
        this.method_5c531ba0_Dne(f, f2, f3, f4, f5, f6, sMa2);
        this.field_37b7066_Dne.method_ce7f5266_Dne(f6);
        this.field_20353c45_FWm.method_ce7f5266_Dne(f6);
        this.field_75c33e53_bzF.method_ce7f5266_Dne(f6);
        this.field_5e64df2d_Qnq.method_ce7f5266_Dne(f6);
        this.field_713ef4ac_aFZ.method_ce7f5266_Dne(f6);
        this.field_f0ad2f5e_zGp.method_ce7f5266_Dne(f6);
        this.field_162e998f_DyG.method_ce7f5266_Dne(f6);
        this.field_14244690_div.method_ce7f5266_Dne(f6);
        this.field_5cbd9ba_IjH.method_ce7f5266_Dne(f6);
        this.field_75060344_mrb.method_ce7f5266_Dne(f6);
        this.field_1c3cfea5_XHL.method_ce7f5266_Dne(f6);
    }
}

