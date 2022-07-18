package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class EnT
extends oai_0 {
    private rxL field_162e998f_DyG = new rxL(this).method_e17a7504_FWm(64, 128);
    private rxL field_14244690_div;
    public boolean field_2092bf_Dne = false;

    public EnT(float f) {
        super(f, 0.0f, 64, 128);
        this.field_162e998f_DyG.method_2c0148e6_Dne(0.0f, -2.0f, 0.0f);
        this.field_162e998f_DyG.method_9057b0a5_Dne(0, 0).method_7ccc8363_Dne(0.0f, 3.0f, -6.75f, 1, 1, 1, -0.25f);
        this.field_f0ad2f5e_zGp.method_bc1d6661_Dne(this.field_162e998f_DyG);
        this.field_14244690_div = new rxL(this).method_e17a7504_FWm(64, 128);
        this.field_14244690_div.method_2c0148e6_Dne(-5.0f, -10.03125f, -5.0f);
        this.field_14244690_div.method_9057b0a5_Dne(0, 64).method_cbecd0a8_Dne(0.0f, 0.0f, 0.0f, 10, 2, 10);
        this.field_37b7066_Dne.method_bc1d6661_Dne(this.field_14244690_div);
        rxL rxL2 = new rxL(this).method_e17a7504_FWm(64, 128);
        rxL2.method_2c0148e6_Dne(1.75f, -4.0f, 2.0f);
        rxL2.method_9057b0a5_Dne(0, 76).method_cbecd0a8_Dne(0.0f, 0.0f, 0.0f, 7, 4, 7);
        rxL2.field_388da3_zGp = -0.05235988f;
        rxL2.field_2f0dd5_div = 0.02617994f;
        this.field_14244690_div.method_bc1d6661_Dne(rxL2);
        rxL rxL3 = new rxL(this).method_e17a7504_FWm(64, 128);
        rxL3.method_2c0148e6_Dne(1.75f, -4.0f, 2.0f);
        rxL3.method_9057b0a5_Dne(0, 87).method_cbecd0a8_Dne(0.0f, 0.0f, 0.0f, 4, 4, 4);
        rxL3.field_388da3_zGp = -0.10471976f;
        rxL3.field_2f0dd5_div = 0.05235988f;
        rxL2.method_bc1d6661_Dne(rxL3);
        rxL rxL4 = new rxL(this).method_e17a7504_FWm(64, 128);
        rxL4.method_2c0148e6_Dne(1.75f, -2.0f, 2.0f);
        rxL4.method_9057b0a5_Dne(0, 95).method_7ccc8363_Dne(0.0f, 0.0f, 0.0f, 1, 2, 1, 0.25f);
        rxL4.field_388da3_zGp = -0.20943952f;
        rxL4.field_2f0dd5_div = 0.10471976f;
        rxL3.method_bc1d6661_Dne(rxL4);
    }

    @Override
    public void method_5c531ba0_Dne(float f, float f2, float f3, float f4, float f5, float f6, sMa sMa2) {
        super.method_5c531ba0_Dne(f, f2, f3, f4, f5, f6, sMa2);
        this.field_f0ad2f5e_zGp.field_29186a_XHL = 0.0f;
        this.field_f0ad2f5e_zGp.field_334489_mrb = 0.0f;
        this.field_f0ad2f5e_zGp.field_22c5ff_IjH = 0.0f;
        float f7 = 0.01f * (float)(sMa2.field_2d29f4_aFZ % 10);
        this.field_f0ad2f5e_zGp.field_388da3_zGp = geR.method_ce7f5256_Dne((float)sMa2.field_388da6_zGp * f7) * 4.5f * (float)Math.PI / 180.0f;
        this.field_f0ad2f5e_zGp.field_20b854_DyG = 0.0f;
        this.field_f0ad2f5e_zGp.field_2f0dd5_div = geR.method_117d0e97_FWm((float)sMa2.field_388da6_zGp * f7) * 2.5f * (float)Math.PI / 180.0f;
        if (this.field_2092bf_Dne) {
            this.field_f0ad2f5e_zGp.field_388da3_zGp = -0.9f;
            this.field_f0ad2f5e_zGp.field_29186a_XHL = -0.09375f;
            this.field_f0ad2f5e_zGp.field_334489_mrb = 0.1875f;
        }
    }

    public int method_7a46288d_Dne() {
        return 0;
    }
}

