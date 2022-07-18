package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class BHA
extends Gor {
    public rxL field_75c33e53_bzF;
    public rxL field_162e998f_DyG;
    public rxL field_20353c45_FWm;
    public rxL field_713ef4ac_aFZ;
    public rxL field_37b7066_Dne;
    public rxL field_5e64df2d_Qnq;
    public rxL field_f0ad2f5e_zGp;

    public BHA(float f) {
        int n = 4;
        this.field_37b7066_Dne = new rxL(this, 0, 0);
        this.field_37b7066_Dne.method_7ccc8363_Dne(-4.0f, -8.0f, -4.0f, 8, 8, 8, f);
        this.field_37b7066_Dne.method_2c0148e6_Dne(0.0f, n, 0.0f);
        this.field_20353c45_FWm = new rxL(this, 32, 0);
        this.field_20353c45_FWm.method_7ccc8363_Dne(-4.0f, -8.0f, -4.0f, 8, 8, 8, f + 0.5f);
        this.field_20353c45_FWm.method_2c0148e6_Dne(0.0f, n, 0.0f);
        this.field_75c33e53_bzF = new rxL(this, 16, 16);
        this.field_75c33e53_bzF.method_7ccc8363_Dne(-4.0f, 0.0f, -2.0f, 8, 12, 4, f);
        this.field_75c33e53_bzF.method_2c0148e6_Dne(0.0f, n, 0.0f);
        this.field_5e64df2d_Qnq = new rxL(this, 0, 16);
        this.field_5e64df2d_Qnq.method_7ccc8363_Dne(-2.0f, 0.0f, -2.0f, 4, 6, 4, f);
        this.field_5e64df2d_Qnq.method_2c0148e6_Dne(-2.0f, 12 + n, 4.0f);
        this.field_713ef4ac_aFZ = new rxL(this, 0, 16);
        this.field_713ef4ac_aFZ.method_7ccc8363_Dne(-2.0f, 0.0f, -2.0f, 4, 6, 4, f);
        this.field_713ef4ac_aFZ.method_2c0148e6_Dne(2.0f, 12 + n, 4.0f);
        this.field_f0ad2f5e_zGp = new rxL(this, 0, 16);
        this.field_f0ad2f5e_zGp.method_7ccc8363_Dne(-2.0f, 0.0f, -2.0f, 4, 6, 4, f);
        this.field_f0ad2f5e_zGp.method_2c0148e6_Dne(-2.0f, 12 + n, -4.0f);
        this.field_162e998f_DyG = new rxL(this, 0, 16);
        this.field_162e998f_DyG.method_7ccc8363_Dne(-2.0f, 0.0f, -2.0f, 4, 6, 4, f);
        this.field_162e998f_DyG.method_2c0148e6_Dne(2.0f, 12 + n, -4.0f);
    }

    @Override
    public void method_3a102820_Dne(sMa sMa2, float f, float f2, float f3, float f4, float f5, float f6) {
        this.method_5c531ba0_Dne(f, f2, f3, f4, f5, f6, sMa2);
        this.field_37b7066_Dne.method_ce7f5266_Dne(f6);
        this.field_75c33e53_bzF.method_ce7f5266_Dne(f6);
        this.field_5e64df2d_Qnq.method_ce7f5266_Dne(f6);
        this.field_713ef4ac_aFZ.method_ce7f5266_Dne(f6);
        this.field_f0ad2f5e_zGp.method_ce7f5266_Dne(f6);
        this.field_162e998f_DyG.method_ce7f5266_Dne(f6);
    }

    @Override
    public void method_5c531ba0_Dne(float f, float f2, float f3, float f4, float f5, float f6, sMa sMa2) {
        this.field_37b7066_Dne.field_20b854_DyG = f4 / 57.295776f;
        this.field_37b7066_Dne.field_388da3_zGp = f5 / 57.295776f;
        this.field_5e64df2d_Qnq.field_388da3_zGp = geR.method_117d0e97_FWm(f * 0.6662f) * 1.4f * f2;
        this.field_713ef4ac_aFZ.field_388da3_zGp = geR.method_117d0e97_FWm(f * 0.6662f + (float)Math.PI) * 1.4f * f2;
        this.field_f0ad2f5e_zGp.field_388da3_zGp = geR.method_117d0e97_FWm(f * 0.6662f + (float)Math.PI) * 1.4f * f2;
        this.field_162e998f_DyG.field_388da3_zGp = geR.method_117d0e97_FWm(f * 0.6662f) * 1.4f * f2;
    }

    public BHA() {
        this(0.0f);
    }
}

