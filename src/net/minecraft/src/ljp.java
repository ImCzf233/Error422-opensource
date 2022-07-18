package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class ljp
extends Gor {
    private rxL field_37b7066_Dne;
    private rxL field_20353c45_FWm;
    private rxL field_713ef4ac_aFZ;
    private rxL field_f0ad2f5e_zGp;
    private rxL field_75c33e53_bzF;
    private rxL field_5e64df2d_Qnq;

    public ljp() {
        this.field_2e5f1b_bzF = 64;
        this.field_267cf5_Qnq = 64;
        this.field_37b7066_Dne = new rxL(this, 0, 0);
        this.field_37b7066_Dne.method_cbecd0a8_Dne(-3.0f, -3.0f, -3.0f, 6, 6, 6);
        rxL rxL2 = new rxL(this, 24, 0);
        rxL2.method_cbecd0a8_Dne(-4.0f, -6.0f, -2.0f, 3, 4, 1);
        this.field_37b7066_Dne.method_bc1d6661_Dne(rxL2);
        rxL rxL3 = new rxL(this, 24, 0);
        rxL3.field_2092bf_Dne = true;
        rxL3.method_cbecd0a8_Dne(1.0f, -6.0f, -2.0f, 3, 4, 1);
        this.field_37b7066_Dne.method_bc1d6661_Dne(rxL3);
        this.field_20353c45_FWm = new rxL(this, 0, 16);
        this.field_20353c45_FWm.method_cbecd0a8_Dne(-3.0f, 4.0f, -3.0f, 6, 12, 6);
        this.field_20353c45_FWm.method_9057b0a5_Dne(0, 34).method_cbecd0a8_Dne(-5.0f, 16.0f, 0.0f, 10, 6, 1);
        this.field_75c33e53_bzF = new rxL(this, 42, 0);
        this.field_75c33e53_bzF.method_cbecd0a8_Dne(-12.0f, 1.0f, 1.5f, 10, 16, 1);
        this.field_713ef4ac_aFZ = new rxL(this, 24, 16);
        this.field_713ef4ac_aFZ.method_2c0148e6_Dne(-12.0f, 1.0f, 1.5f);
        this.field_713ef4ac_aFZ.method_cbecd0a8_Dne(-8.0f, 1.0f, 0.0f, 8, 12, 1);
        this.field_5e64df2d_Qnq = new rxL(this, 42, 0);
        this.field_5e64df2d_Qnq.field_2092bf_Dne = true;
        this.field_5e64df2d_Qnq.method_cbecd0a8_Dne(2.0f, 1.0f, 1.5f, 10, 16, 1);
        this.field_f0ad2f5e_zGp = new rxL(this, 24, 16);
        this.field_f0ad2f5e_zGp.field_2092bf_Dne = true;
        this.field_f0ad2f5e_zGp.method_2c0148e6_Dne(12.0f, 1.0f, 1.5f);
        this.field_f0ad2f5e_zGp.method_cbecd0a8_Dne(0.0f, 1.0f, 0.0f, 8, 12, 1);
        this.field_20353c45_FWm.method_bc1d6661_Dne(this.field_75c33e53_bzF);
        this.field_20353c45_FWm.method_bc1d6661_Dne(this.field_5e64df2d_Qnq);
        this.field_75c33e53_bzF.method_bc1d6661_Dne(this.field_713ef4ac_aFZ);
        this.field_5e64df2d_Qnq.method_bc1d6661_Dne(this.field_f0ad2f5e_zGp);
    }

    @Override
    public void method_3a102820_Dne(sMa sMa2, float f, float f2, float f3, float f4, float f5, float f6) {
        oaw oaw2 = (oaw)sMa2;
        if (oaw2.method_b6f3e1a2_haP()) {
            this.field_37b7066_Dne.field_388da3_zGp = f5 / 57.295776f;
            this.field_37b7066_Dne.field_20b854_DyG = (float)Math.PI - f4 / 57.295776f;
            this.field_37b7066_Dne.field_2f0dd5_div = (float)Math.PI;
            this.field_37b7066_Dne.method_2c0148e6_Dne(0.0f, -2.0f, 0.0f);
            this.field_75c33e53_bzF.method_2c0148e6_Dne(-3.0f, 0.0f, 3.0f);
            this.field_5e64df2d_Qnq.method_2c0148e6_Dne(3.0f, 0.0f, 3.0f);
            this.field_20353c45_FWm.field_388da3_zGp = (float)Math.PI;
            this.field_75c33e53_bzF.field_388da3_zGp = -0.15707964f;
            this.field_75c33e53_bzF.field_20b854_DyG = -1.2566371f;
            this.field_713ef4ac_aFZ.field_20b854_DyG = -1.7278761f;
            this.field_5e64df2d_Qnq.field_388da3_zGp = this.field_75c33e53_bzF.field_388da3_zGp;
            this.field_5e64df2d_Qnq.field_20b854_DyG = -this.field_75c33e53_bzF.field_20b854_DyG;
            this.field_f0ad2f5e_zGp.field_20b854_DyG = -this.field_713ef4ac_aFZ.field_20b854_DyG;
        } else {
            this.field_37b7066_Dne.field_388da3_zGp = f5 / 57.295776f;
            this.field_37b7066_Dne.field_20b854_DyG = f4 / 57.295776f;
            this.field_37b7066_Dne.field_2f0dd5_div = 0.0f;
            this.field_37b7066_Dne.method_2c0148e6_Dne(0.0f, 0.0f, 0.0f);
            this.field_75c33e53_bzF.method_2c0148e6_Dne(0.0f, 0.0f, 0.0f);
            this.field_5e64df2d_Qnq.method_2c0148e6_Dne(0.0f, 0.0f, 0.0f);
            this.field_20353c45_FWm.field_388da3_zGp = 0.7853982f + geR.method_117d0e97_FWm(f3 * 0.1f) * 0.15f;
            this.field_20353c45_FWm.field_20b854_DyG = 0.0f;
            this.field_75c33e53_bzF.field_20b854_DyG = geR.method_117d0e97_FWm(f3 * 1.3f) * (float)Math.PI * 0.25f;
            this.field_5e64df2d_Qnq.field_20b854_DyG = -this.field_75c33e53_bzF.field_20b854_DyG;
            this.field_713ef4ac_aFZ.field_20b854_DyG = this.field_75c33e53_bzF.field_20b854_DyG * 0.5f;
            this.field_f0ad2f5e_zGp.field_20b854_DyG = -this.field_75c33e53_bzF.field_20b854_DyG * 0.5f;
        }
        this.field_37b7066_Dne.method_ce7f5266_Dne(f6);
        this.field_20353c45_FWm.method_ce7f5266_Dne(f6);
    }

    public int method_7a46288d_Dne() {
        return 36;
    }
}

