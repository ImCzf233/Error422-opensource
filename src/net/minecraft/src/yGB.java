package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class yGB
extends Gor {
    public rxL field_713ef4ac_aFZ;
    public rxL field_f0ad2f5e_zGp;
    public rxL field_37b7066_Dne;
    public rxL field_5e64df2d_Qnq;
    public rxL field_20353c45_FWm;
    public rxL field_75c33e53_bzF;

    @Override
    public void method_3a102820_Dne(sMa sMa2, float f, float f2, float f3, float f4, float f5, float f6) {
        this.method_5c531ba0_Dne(f, f2, f3, f4, f5, f6, sMa2);
        this.field_37b7066_Dne.method_ce7f5266_Dne(f6);
        this.field_20353c45_FWm.method_ce7f5266_Dne(f6);
        this.field_713ef4ac_aFZ.method_ce7f5266_Dne(f6);
        this.field_f0ad2f5e_zGp.method_ce7f5266_Dne(f6);
        this.field_75c33e53_bzF.method_ce7f5266_Dne(f6);
        this.field_5e64df2d_Qnq.method_ce7f5266_Dne(f6);
    }

    private float method_16b620a_Dne(float f, float f2) {
        return (Math.abs(f % f2 - f2 * 0.5f) - f2 * 0.25f) / (f2 * 0.25f);
    }

    public yGB() {
        this(0.0f);
    }

    @Override
    public void method_5c531ba0_Dne(float f, float f2, float f3, float f4, float f5, float f6, sMa sMa2) {
        this.field_37b7066_Dne.field_20b854_DyG = f4 / 57.295776f;
        this.field_37b7066_Dne.field_388da3_zGp = f5 / 57.295776f;
        this.field_713ef4ac_aFZ.field_388da3_zGp = -1.5f * this.method_16b620a_Dne(f, 13.0f) * f2;
        this.field_f0ad2f5e_zGp.field_388da3_zGp = 1.5f * this.method_16b620a_Dne(f, 13.0f) * f2;
        this.field_713ef4ac_aFZ.field_20b854_DyG = 0.0f;
        this.field_f0ad2f5e_zGp.field_20b854_DyG = 0.0f;
    }

    public yGB(float f, float f2) {
        int n = 128;
        int n2 = 128;
        this.field_37b7066_Dne = new rxL(this).method_e17a7504_FWm(n, n2);
        this.field_37b7066_Dne.method_2c0148e6_Dne(0.0f, 0.0f + f2, -2.0f);
        this.field_37b7066_Dne.method_9057b0a5_Dne(0, 0).method_7ccc8363_Dne(-4.0f, -12.0f, -5.5f, 8, 10, 8, f);
        this.field_37b7066_Dne.method_9057b0a5_Dne(24, 0).method_7ccc8363_Dne(-1.0f, -5.0f, -7.5f, 2, 4, 2, f);
        this.field_20353c45_FWm = new rxL(this).method_e17a7504_FWm(n, n2);
        this.field_20353c45_FWm.method_2c0148e6_Dne(0.0f, 0.0f + f2, 0.0f);
        this.field_20353c45_FWm.method_9057b0a5_Dne(0, 40).method_7ccc8363_Dne(-9.0f, -2.0f, -6.0f, 18, 12, 11, f);
        this.field_20353c45_FWm.method_9057b0a5_Dne(0, 70).method_7ccc8363_Dne(-4.5f, 10.0f, -3.0f, 9, 5, 6, f + 0.5f);
        this.field_75c33e53_bzF = new rxL(this).method_e17a7504_FWm(n, n2);
        this.field_75c33e53_bzF.method_2c0148e6_Dne(0.0f, -7.0f, 0.0f);
        this.field_75c33e53_bzF.method_9057b0a5_Dne(60, 21).method_7ccc8363_Dne(-13.0f, -2.5f, -3.0f, 4, 30, 6, f);
        this.field_5e64df2d_Qnq = new rxL(this).method_e17a7504_FWm(n, n2);
        this.field_5e64df2d_Qnq.method_2c0148e6_Dne(0.0f, -7.0f, 0.0f);
        this.field_5e64df2d_Qnq.method_9057b0a5_Dne(60, 58).method_7ccc8363_Dne(9.0f, -2.5f, -3.0f, 4, 30, 6, f);
        this.field_713ef4ac_aFZ = new rxL(this, 0, 22).method_e17a7504_FWm(n, n2);
        this.field_713ef4ac_aFZ.method_2c0148e6_Dne(-4.0f, 18.0f + f2, 0.0f);
        this.field_713ef4ac_aFZ.method_9057b0a5_Dne(37, 0).method_7ccc8363_Dne(-3.5f, -3.0f, -3.0f, 6, 16, 5, f);
        this.field_f0ad2f5e_zGp = new rxL(this, 0, 22).method_e17a7504_FWm(n, n2);
        this.field_f0ad2f5e_zGp.field_2092bf_Dne = true;
        this.field_f0ad2f5e_zGp.method_9057b0a5_Dne(60, 0).method_2c0148e6_Dne(5.0f, 18.0f + f2, 0.0f);
        this.field_f0ad2f5e_zGp.method_7ccc8363_Dne(-3.5f, -3.0f, -3.0f, 6, 16, 5, f);
    }

    @Override
    public void method_9fba3e12_Dne(FUH fUH, float f, float f2, float f3) {
        CDE cDE = (CDE)fUH;
        int n = cDE.method_ae128dba_bzF();
        if (n > 0) {
            this.field_75c33e53_bzF.field_388da3_zGp = -2.0f + 1.5f * this.method_16b620a_Dne((float)n - f3, 10.0f);
            this.field_5e64df2d_Qnq.field_388da3_zGp = -2.0f + 1.5f * this.method_16b620a_Dne((float)n - f3, 10.0f);
        } else {
            int n2 = cDE.method_c5287a51_qLR();
            if (n2 > 0) {
                this.field_75c33e53_bzF.field_388da3_zGp = -0.8f + 0.025f * this.method_16b620a_Dne(n2, 70.0f);
                this.field_5e64df2d_Qnq.field_388da3_zGp = 0.0f;
            } else {
                this.field_75c33e53_bzF.field_388da3_zGp = (-0.2f + 1.5f * this.method_16b620a_Dne(f, 13.0f)) * f2;
                this.field_5e64df2d_Qnq.field_388da3_zGp = (-0.2f - 1.5f * this.method_16b620a_Dne(f, 13.0f)) * f2;
            }
        }
    }

    public yGB(float f) {
        this(f, -7.0f);
    }
}

