package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class kGJ
extends Sgm {
    @Override
    public void method_5c531ba0_Dne(float f, float f2, float f3, float f4, float f5, float f6, sMa sMa2) {
        super.method_5c531ba0_Dne(f, f2, f3, f4, f5, f6, sMa2);
        float f7 = geR.method_ce7f5256_Dne(this.field_2092ab_Dne * (float)Math.PI);
        float f8 = geR.method_ce7f5256_Dne((1.0f - (1.0f - this.field_2092ab_Dne) * (1.0f - this.field_2092ab_Dne)) * (float)Math.PI);
        this.field_5e64df2d_Qnq.field_2f0dd5_div = 0.0f;
        this.field_713ef4ac_aFZ.field_2f0dd5_div = 0.0f;
        this.field_5e64df2d_Qnq.field_20b854_DyG = -(0.1f - f7 * 0.6f);
        this.field_713ef4ac_aFZ.field_20b854_DyG = 0.1f - f7 * 0.6f;
        this.field_5e64df2d_Qnq.field_388da3_zGp = -1.5707964f;
        this.field_713ef4ac_aFZ.field_388da3_zGp = -1.5707964f;
        this.field_5e64df2d_Qnq.field_388da3_zGp -= f7 * 1.2f - f8 * 0.4f;
        this.field_713ef4ac_aFZ.field_388da3_zGp -= f7 * 1.2f - f8 * 0.4f;
        this.field_5e64df2d_Qnq.field_2f0dd5_div += geR.method_117d0e97_FWm(f3 * 0.09f) * 0.05f + 0.05f;
        this.field_713ef4ac_aFZ.field_2f0dd5_div -= geR.method_117d0e97_FWm(f3 * 0.09f) * 0.05f + 0.05f;
        this.field_5e64df2d_Qnq.field_388da3_zGp += geR.method_ce7f5256_Dne(f3 * 0.067f) * 0.05f;
        this.field_713ef4ac_aFZ.field_388da3_zGp -= geR.method_ce7f5256_Dne(f3 * 0.067f) * 0.05f;
    }

    public int method_7a46288d_Dne() {
        return 10;
    }

    public kGJ(float f, float f2, boolean bl) {
        super(f, 0.0f, 64, bl ? 32 : 64);
        if (bl) {
            this.field_37b7066_Dne = new rxL(this, 0, 0);
            this.field_37b7066_Dne.method_7ccc8363_Dne(-4.0f, -10.0f, -4.0f, 8, 6, 8, f);
            this.field_37b7066_Dne.method_2c0148e6_Dne(0.0f, 0.0f + f2, 0.0f);
        } else {
            this.field_37b7066_Dne = new rxL(this);
            this.field_37b7066_Dne.method_2c0148e6_Dne(0.0f, 0.0f + f2, 0.0f);
            this.field_37b7066_Dne.method_9057b0a5_Dne(0, 32).method_7ccc8363_Dne(-4.0f, -10.0f, -4.0f, 8, 10, 8, f);
            this.field_37b7066_Dne.method_9057b0a5_Dne(24, 32).method_7ccc8363_Dne(-1.0f, -3.0f, -6.0f, 2, 4, 2, f);
        }
    }

    public kGJ() {
        this(0.0f, 0.0f, false);
    }
}

