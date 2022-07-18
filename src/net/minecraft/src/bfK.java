package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class bfK
extends fsj {
    public bfK(float f) {
        super(f, 0.0f, 64, 32);
        this.field_5e64df2d_Qnq = new rxL(this, 40, 16);
        this.field_5e64df2d_Qnq.method_7ccc8363_Dne(-1.0f, -2.0f, -1.0f, 2, 12, 2, f);
        this.field_5e64df2d_Qnq.method_2c0148e6_Dne(-5.0f, 2.0f, 0.0f);
        this.field_713ef4ac_aFZ = new rxL(this, 40, 16);
        this.field_713ef4ac_aFZ.field_2092bf_Dne = true;
        this.field_713ef4ac_aFZ.method_7ccc8363_Dne(-1.0f, -2.0f, -1.0f, 2, 12, 2, f);
        this.field_713ef4ac_aFZ.method_2c0148e6_Dne(5.0f, 2.0f, 0.0f);
        this.field_f0ad2f5e_zGp = new rxL(this, 0, 16);
        this.field_f0ad2f5e_zGp.method_7ccc8363_Dne(-1.0f, 0.0f, -1.0f, 2, 12, 2, f);
        this.field_f0ad2f5e_zGp.method_2c0148e6_Dne(-2.0f, 12.0f, 0.0f);
        this.field_162e998f_DyG = new rxL(this, 0, 16);
        this.field_162e998f_DyG.field_2092bf_Dne = true;
        this.field_162e998f_DyG.method_7ccc8363_Dne(-1.0f, 0.0f, -1.0f, 2, 12, 2, f);
        this.field_162e998f_DyG.method_2c0148e6_Dne(2.0f, 12.0f, 0.0f);
    }

    @Override
    public void method_9fba3e12_Dne(FUH fUH, float f, float f2, float f3) {
        this.field_267d06_Qnq = ((yxx_0)fUH).method_ae128dba_bzF() == 1;
        super.method_9fba3e12_Dne(fUH, f, f2, f3);
    }

    public bfK() {
        this(0.0f);
    }

    @Override
    public void method_5c531ba0_Dne(float f, float f2, float f3, float f4, float f5, float f6, sMa sMa2) {
        super.method_5c531ba0_Dne(f, f2, f3, f4, f5, f6, sMa2);
    }
}

