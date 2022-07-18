package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class XRF
extends Gor {
    public rxL field_5e64df2d_Qnq;
    public rxL field_20353c45_FWm;
    public rxL field_37b7066_Dne;
    public rxL field_75c33e53_bzF;
    public rxL field_713ef4ac_aFZ;

    public XRF() {
        float f = 4.0f;
        float f2 = 0.0f;
        this.field_75c33e53_bzF = new rxL(this, 0, 0).method_e17a7504_FWm(64, 64);
        this.field_75c33e53_bzF.method_7ccc8363_Dne(-4.0f, -8.0f, -4.0f, 8, 8, 8, f2 - 0.5f);
        this.field_75c33e53_bzF.method_2c0148e6_Dne(0.0f, 0.0f + f, 0.0f);
        this.field_5e64df2d_Qnq = new rxL(this, 32, 0).method_e17a7504_FWm(64, 64);
        this.field_5e64df2d_Qnq.method_7ccc8363_Dne(-1.0f, 0.0f, -1.0f, 12, 2, 2, f2 - 0.5f);
        this.field_5e64df2d_Qnq.method_2c0148e6_Dne(0.0f, 0.0f + f + 9.0f - 7.0f, 0.0f);
        this.field_713ef4ac_aFZ = new rxL(this, 32, 0).method_e17a7504_FWm(64, 64);
        this.field_713ef4ac_aFZ.method_7ccc8363_Dne(-1.0f, 0.0f, -1.0f, 12, 2, 2, f2 - 0.5f);
        this.field_713ef4ac_aFZ.method_2c0148e6_Dne(0.0f, 0.0f + f + 9.0f - 7.0f, 0.0f);
        this.field_37b7066_Dne = new rxL(this, 0, 16).method_e17a7504_FWm(64, 64);
        this.field_37b7066_Dne.method_7ccc8363_Dne(-5.0f, -10.0f, -5.0f, 10, 10, 10, f2 - 0.5f);
        this.field_37b7066_Dne.method_2c0148e6_Dne(0.0f, 0.0f + f + 9.0f, 0.0f);
        this.field_20353c45_FWm = new rxL(this, 0, 36).method_e17a7504_FWm(64, 64);
        this.field_20353c45_FWm.method_7ccc8363_Dne(-6.0f, -12.0f, -6.0f, 12, 12, 12, f2 - 0.5f);
        this.field_20353c45_FWm.method_2c0148e6_Dne(0.0f, 0.0f + f + 20.0f, 0.0f);
    }

    @Override
    public void method_3a102820_Dne(sMa sMa2, float f, float f2, float f3, float f4, float f5, float f6) {
        this.method_5c531ba0_Dne(f, f2, f3, f4, f5, f6, sMa2);
        this.field_37b7066_Dne.method_ce7f5266_Dne(f6);
        this.field_20353c45_FWm.method_ce7f5266_Dne(f6);
        this.field_75c33e53_bzF.method_ce7f5266_Dne(f6);
        this.field_5e64df2d_Qnq.method_ce7f5266_Dne(f6);
        this.field_713ef4ac_aFZ.method_ce7f5266_Dne(f6);
    }

    @Override
    public void method_5c531ba0_Dne(float f, float f2, float f3, float f4, float f5, float f6, sMa sMa2) {
        super.method_5c531ba0_Dne(f, f2, f3, f4, f5, f6, sMa2);
        this.field_75c33e53_bzF.field_20b854_DyG = f4 / 57.295776f;
        this.field_75c33e53_bzF.field_388da3_zGp = f5 / 57.295776f;
        this.field_37b7066_Dne.field_20b854_DyG = f4 / 57.295776f * 0.25f;
        float f7 = geR.method_ce7f5256_Dne(this.field_37b7066_Dne.field_20b854_DyG);
        float f8 = geR.method_117d0e97_FWm(this.field_37b7066_Dne.field_20b854_DyG);
        this.field_5e64df2d_Qnq.field_2f0dd5_div = 1.0f;
        this.field_713ef4ac_aFZ.field_2f0dd5_div = -1.0f;
        this.field_5e64df2d_Qnq.field_20b854_DyG = 0.0f + this.field_37b7066_Dne.field_20b854_DyG;
        this.field_713ef4ac_aFZ.field_20b854_DyG = (float)Math.PI + this.field_37b7066_Dne.field_20b854_DyG;
        this.field_5e64df2d_Qnq.field_2e5f18_bzF = f8 * 5.0f;
        this.field_5e64df2d_Qnq.field_2d29f1_aFZ = -f7 * 5.0f;
        this.field_713ef4ac_aFZ.field_2e5f18_bzF = -f8 * 5.0f;
        this.field_713ef4ac_aFZ.field_2d29f1_aFZ = f7 * 5.0f;
    }
}

