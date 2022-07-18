package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class eXl
extends qcK {
    private float field_267cf2_Qnq;

    @Override
    public void method_9fba3e12_Dne(FUH fUH, float f, float f2, float f3) {
        super.method_9fba3e12_Dne(fUH, f, f2, f3);
        this.field_37b7066_Dne.field_267cf2_Qnq = 6.0f + ((Pvd)fUH).method_143f92c9_bzF(f3) * 9.0f;
        this.field_267cf2_Qnq = ((Pvd)fUH).method_7ed96eaf_Qnq(f3);
    }

    @Override
    public void method_5c531ba0_Dne(float f, float f2, float f3, float f4, float f5, float f6, sMa sMa2) {
        super.method_5c531ba0_Dne(f, f2, f3, f4, f5, f6, sMa2);
        this.field_37b7066_Dne.field_388da3_zGp = this.field_267cf2_Qnq;
    }

    public eXl() {
        super(12, 0.0f);
        this.field_37b7066_Dne = new rxL(this, 0, 0);
        this.field_37b7066_Dne.method_7ccc8363_Dne(-3.0f, -4.0f, -4.0f, 6, 6, 6, 0.6f);
        this.field_37b7066_Dne.method_2c0148e6_Dne(0.0f, 6.0f, -8.0f);
        this.field_20353c45_FWm = new rxL(this, 28, 8);
        this.field_20353c45_FWm.method_7ccc8363_Dne(-4.0f, -10.0f, -7.0f, 8, 16, 6, 1.75f);
        this.field_20353c45_FWm.method_2c0148e6_Dne(0.0f, 5.0f, 2.0f);
        float f = 0.5f;
        this.field_75c33e53_bzF = new rxL(this, 0, 16);
        this.field_75c33e53_bzF.method_7ccc8363_Dne(-2.0f, 0.0f, -2.0f, 4, 6, 4, f);
        this.field_75c33e53_bzF.method_2c0148e6_Dne(-3.0f, 12.0f, 7.0f);
        this.field_5e64df2d_Qnq = new rxL(this, 0, 16);
        this.field_5e64df2d_Qnq.method_7ccc8363_Dne(-2.0f, 0.0f, -2.0f, 4, 6, 4, f);
        this.field_5e64df2d_Qnq.method_2c0148e6_Dne(3.0f, 12.0f, 7.0f);
        this.field_713ef4ac_aFZ = new rxL(this, 0, 16);
        this.field_713ef4ac_aFZ.method_7ccc8363_Dne(-2.0f, 0.0f, -2.0f, 4, 6, 4, f);
        this.field_713ef4ac_aFZ.method_2c0148e6_Dne(-3.0f, 12.0f, -5.0f);
        this.field_f0ad2f5e_zGp = new rxL(this, 0, 16);
        this.field_f0ad2f5e_zGp.method_7ccc8363_Dne(-2.0f, 0.0f, -2.0f, 4, 6, 4, f);
        this.field_f0ad2f5e_zGp.method_2c0148e6_Dne(3.0f, 12.0f, -5.0f);
    }
}

