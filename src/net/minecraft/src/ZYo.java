package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class ZYo
extends Sgm {
    public boolean field_21261e_FWm = false;
    public boolean field_2092bf_Dne = false;

    @Override
    public void method_5c531ba0_Dne(float f, float f2, float f3, float f4, float f5, float f6, sMa sMa2) {
        super.method_5c531ba0_Dne(f, f2, f3, f4, f5, f6, sMa2);
        this.field_37b7066_Dne.field_21261e_FWm = true;
        float f7 = -14.0f;
        this.field_75c33e53_bzF.field_388da3_zGp = 0.0f;
        this.field_75c33e53_bzF.field_267cf2_Qnq = f7;
        this.field_75c33e53_bzF.field_2d29f1_aFZ = -0.0f;
        this.field_f0ad2f5e_zGp.field_388da3_zGp -= 0.0f;
        this.field_162e998f_DyG.field_388da3_zGp -= 0.0f;
        this.field_5e64df2d_Qnq.field_388da3_zGp = (float)((double)this.field_5e64df2d_Qnq.field_388da3_zGp * 0.5);
        this.field_713ef4ac_aFZ.field_388da3_zGp = (float)((double)this.field_713ef4ac_aFZ.field_388da3_zGp * 0.5);
        this.field_f0ad2f5e_zGp.field_388da3_zGp = (float)((double)this.field_f0ad2f5e_zGp.field_388da3_zGp * 0.5);
        this.field_162e998f_DyG.field_388da3_zGp = (float)((double)this.field_162e998f_DyG.field_388da3_zGp * 0.5);
        float f8 = 0.4f;
        if (this.field_5e64df2d_Qnq.field_388da3_zGp > f8) {
            this.field_5e64df2d_Qnq.field_388da3_zGp = f8;
        }
        if (this.field_713ef4ac_aFZ.field_388da3_zGp > f8) {
            this.field_713ef4ac_aFZ.field_388da3_zGp = f8;
        }
        if (this.field_5e64df2d_Qnq.field_388da3_zGp < -f8) {
            this.field_5e64df2d_Qnq.field_388da3_zGp = -f8;
        }
        if (this.field_713ef4ac_aFZ.field_388da3_zGp < -f8) {
            this.field_713ef4ac_aFZ.field_388da3_zGp = -f8;
        }
        if (this.field_f0ad2f5e_zGp.field_388da3_zGp > f8) {
            this.field_f0ad2f5e_zGp.field_388da3_zGp = f8;
        }
        if (this.field_162e998f_DyG.field_388da3_zGp > f8) {
            this.field_162e998f_DyG.field_388da3_zGp = f8;
        }
        if (this.field_f0ad2f5e_zGp.field_388da3_zGp < -f8) {
            this.field_f0ad2f5e_zGp.field_388da3_zGp = -f8;
        }
        if (this.field_162e998f_DyG.field_388da3_zGp < -f8) {
            this.field_162e998f_DyG.field_388da3_zGp = -f8;
        }
        if (this.field_2092bf_Dne) {
            this.field_5e64df2d_Qnq.field_388da3_zGp = -0.5f;
            this.field_713ef4ac_aFZ.field_388da3_zGp = -0.5f;
            this.field_5e64df2d_Qnq.field_2f0dd5_div = 0.05f;
            this.field_713ef4ac_aFZ.field_2f0dd5_div = -0.05f;
        }
        this.field_5e64df2d_Qnq.field_2d29f1_aFZ = 0.0f;
        this.field_713ef4ac_aFZ.field_2d29f1_aFZ = 0.0f;
        this.field_f0ad2f5e_zGp.field_2d29f1_aFZ = 0.0f;
        this.field_162e998f_DyG.field_2d29f1_aFZ = 0.0f;
        this.field_f0ad2f5e_zGp.field_267cf2_Qnq = 9.0f + f7;
        this.field_162e998f_DyG.field_267cf2_Qnq = 9.0f + f7;
        this.field_37b7066_Dne.field_2d29f1_aFZ = -0.0f;
        this.field_37b7066_Dne.field_267cf2_Qnq = f7 + 1.0f;
        this.field_20353c45_FWm.field_2e5f18_bzF = this.field_37b7066_Dne.field_2e5f18_bzF;
        this.field_20353c45_FWm.field_267cf2_Qnq = this.field_37b7066_Dne.field_267cf2_Qnq;
        this.field_20353c45_FWm.field_2d29f1_aFZ = this.field_37b7066_Dne.field_2d29f1_aFZ;
        this.field_20353c45_FWm.field_388da3_zGp = this.field_37b7066_Dne.field_388da3_zGp;
        this.field_20353c45_FWm.field_20b854_DyG = this.field_37b7066_Dne.field_20b854_DyG;
        this.field_20353c45_FWm.field_2f0dd5_div = this.field_37b7066_Dne.field_2f0dd5_div;
        if (this.field_21261e_FWm) {
            float f9 = 1.0f;
            this.field_37b7066_Dne.field_267cf2_Qnq -= f9 * 5.0f;
        }
    }

    public ZYo() {
        super(0.0f, -14.0f, 64, 32);
        float f = -14.0f;
        float f2 = 0.0f;
        this.field_20353c45_FWm = new rxL(this, 0, 16);
        this.field_20353c45_FWm.method_7ccc8363_Dne(-4.0f, -8.0f, -4.0f, 8, 8, 8, f2 - 0.5f);
        this.field_20353c45_FWm.method_2c0148e6_Dne(0.0f, 0.0f + f, 0.0f);
        this.field_75c33e53_bzF = new rxL(this, 32, 16);
        this.field_75c33e53_bzF.method_7ccc8363_Dne(-4.0f, 0.0f, -2.0f, 8, 12, 4, f2);
        this.field_75c33e53_bzF.method_2c0148e6_Dne(0.0f, 0.0f + f, 0.0f);
        this.field_5e64df2d_Qnq = new rxL(this, 56, 0);
        this.field_5e64df2d_Qnq.method_7ccc8363_Dne(-1.0f, -2.0f, -1.0f, 2, 30, 2, f2);
        this.field_5e64df2d_Qnq.method_2c0148e6_Dne(-3.0f, 2.0f + f, 0.0f);
        this.field_713ef4ac_aFZ = new rxL(this, 56, 0);
        this.field_713ef4ac_aFZ.field_2092bf_Dne = true;
        this.field_713ef4ac_aFZ.method_7ccc8363_Dne(-1.0f, -2.0f, -1.0f, 2, 30, 2, f2);
        this.field_713ef4ac_aFZ.method_2c0148e6_Dne(5.0f, 2.0f + f, 0.0f);
        this.field_f0ad2f5e_zGp = new rxL(this, 56, 0);
        this.field_f0ad2f5e_zGp.method_7ccc8363_Dne(-1.0f, 0.0f, -1.0f, 2, 30, 2, f2);
        this.field_f0ad2f5e_zGp.method_2c0148e6_Dne(-2.0f, 12.0f + f, 0.0f);
        this.field_162e998f_DyG = new rxL(this, 56, 0);
        this.field_162e998f_DyG.field_2092bf_Dne = true;
        this.field_162e998f_DyG.method_7ccc8363_Dne(-1.0f, 0.0f, -1.0f, 2, 30, 2, f2);
        this.field_162e998f_DyG.method_2c0148e6_Dne(2.0f, 12.0f + f, 0.0f);
    }
}

