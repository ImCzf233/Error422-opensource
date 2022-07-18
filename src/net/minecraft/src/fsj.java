package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class fsj
extends Sgm {
    protected fsj(float f, float f2, int n, int n2) {
        super(f, f2, n, n2);
    }

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

    public fsj(float f, boolean bl) {
        super(f, 0.0f, 64, bl ? 32 : 64);
    }

    public fsj() {
        this(0.0f, false);
    }
}

