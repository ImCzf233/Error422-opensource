package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from OAi
 */
public class oai_0
extends Gor {
    public rxL field_20353c45_FWm;
    public rxL field_5e64df2d_Qnq;
    public rxL field_f0ad2f5e_zGp;
    public rxL field_37b7066_Dne;
    public rxL field_713ef4ac_aFZ;
    public rxL field_75c33e53_bzF;

    @Override
    public void method_3a102820_Dne(sMa sMa2, float f, float f2, float f3, float f4, float f5, float f6) {
        this.method_5c531ba0_Dne(f, f2, f3, f4, f5, f6, sMa2);
        this.field_37b7066_Dne.method_ce7f5266_Dne(f6);
        this.field_20353c45_FWm.method_ce7f5266_Dne(f6);
        this.field_5e64df2d_Qnq.method_ce7f5266_Dne(f6);
        this.field_713ef4ac_aFZ.method_ce7f5266_Dne(f6);
        this.field_75c33e53_bzF.method_ce7f5266_Dne(f6);
    }

    public oai_0(float f, float f2, int n, int n2) {
        this.field_37b7066_Dne = new rxL(this).method_e17a7504_FWm(n, n2);
        this.field_37b7066_Dne.method_2c0148e6_Dne(0.0f, 0.0f + f2, 0.0f);
        this.field_37b7066_Dne.method_9057b0a5_Dne(0, 0).method_7ccc8363_Dne(-4.0f, -10.0f, -4.0f, 8, 10, 8, f);
        this.field_f0ad2f5e_zGp = new rxL(this).method_e17a7504_FWm(n, n2);
        this.field_f0ad2f5e_zGp.method_2c0148e6_Dne(0.0f, f2 - 2.0f, 0.0f);
        this.field_f0ad2f5e_zGp.method_9057b0a5_Dne(24, 0).method_7ccc8363_Dne(-1.0f, -1.0f, -6.0f, 2, 4, 2, f);
        this.field_37b7066_Dne.method_bc1d6661_Dne(this.field_f0ad2f5e_zGp);
        this.field_20353c45_FWm = new rxL(this).method_e17a7504_FWm(n, n2);
        this.field_20353c45_FWm.method_2c0148e6_Dne(0.0f, 0.0f + f2, 0.0f);
        this.field_20353c45_FWm.method_9057b0a5_Dne(16, 20).method_7ccc8363_Dne(-4.0f, 0.0f, -3.0f, 8, 12, 6, f);
        this.field_20353c45_FWm.method_9057b0a5_Dne(0, 38).method_7ccc8363_Dne(-4.0f, 0.0f, -3.0f, 8, 18, 6, f + 0.5f);
        this.field_75c33e53_bzF = new rxL(this).method_e17a7504_FWm(n, n2);
        this.field_75c33e53_bzF.method_2c0148e6_Dne(0.0f, 0.0f + f2 + 2.0f, 0.0f);
        this.field_75c33e53_bzF.method_9057b0a5_Dne(44, 22).method_7ccc8363_Dne(-8.0f, -2.0f, -2.0f, 4, 8, 4, f);
        this.field_75c33e53_bzF.method_9057b0a5_Dne(44, 22).method_7ccc8363_Dne(4.0f, -2.0f, -2.0f, 4, 8, 4, f);
        this.field_75c33e53_bzF.method_9057b0a5_Dne(40, 38).method_7ccc8363_Dne(-4.0f, 2.0f, -2.0f, 8, 4, 4, f);
        this.field_5e64df2d_Qnq = new rxL(this, 0, 22).method_e17a7504_FWm(n, n2);
        this.field_5e64df2d_Qnq.method_2c0148e6_Dne(-2.0f, 12.0f + f2, 0.0f);
        this.field_5e64df2d_Qnq.method_7ccc8363_Dne(-2.0f, 0.0f, -2.0f, 4, 12, 4, f);
        this.field_713ef4ac_aFZ = new rxL(this, 0, 22).method_e17a7504_FWm(n, n2);
        this.field_713ef4ac_aFZ.field_2092bf_Dne = true;
        this.field_713ef4ac_aFZ.method_2c0148e6_Dne(2.0f, 12.0f + f2, 0.0f);
        this.field_713ef4ac_aFZ.method_7ccc8363_Dne(-2.0f, 0.0f, -2.0f, 4, 12, 4, f);
    }

    @Override
    public void method_5c531ba0_Dne(float f, float f2, float f3, float f4, float f5, float f6, sMa sMa2) {
        this.field_37b7066_Dne.field_20b854_DyG = f4 / 57.295776f;
        this.field_37b7066_Dne.field_388da3_zGp = f5 / 57.295776f;
        this.field_75c33e53_bzF.field_267cf2_Qnq = 3.0f;
        this.field_75c33e53_bzF.field_2d29f1_aFZ = -1.0f;
        this.field_75c33e53_bzF.field_388da3_zGp = -0.75f;
        this.field_5e64df2d_Qnq.field_388da3_zGp = geR.method_117d0e97_FWm(f * 0.6662f) * 1.4f * f2 * 0.5f;
        this.field_713ef4ac_aFZ.field_388da3_zGp = geR.method_117d0e97_FWm(f * 0.6662f + (float)Math.PI) * 1.4f * f2 * 0.5f;
        this.field_5e64df2d_Qnq.field_20b854_DyG = 0.0f;
        this.field_713ef4ac_aFZ.field_20b854_DyG = 0.0f;
    }

    public oai_0(float f) {
        this(f, 0.0f, 64, 64);
    }
}

