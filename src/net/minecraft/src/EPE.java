package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class EPE {
    private int field_2092ae_Dne = 0;
    private float field_2092ab_Dne = 0.0f;
    private FUH field_366ec33_Dne;

    public void method_7a46289a_Dne() {
        double d = this.field_366ec33_Dne.field_2f0dd3_div - this.field_366ec33_Dne.field_2d29ef_aFZ;
        double d2 = this.field_366ec33_Dne.field_334487_mrb - this.field_366ec33_Dne.field_20b852_DyG;
        if (d * d + d2 * d2 > 2.500000277905201E-7) {
            this.field_366ec33_Dne.field_22c5ff_IjH = this.field_366ec33_Dne.field_334489_mrb;
            this.field_2092ab_Dne = this.field_366ec33_Dne.field_36e4d7_vSL = this.method_2c0148d6_Dne(this.field_366ec33_Dne.field_22c5ff_IjH, this.field_366ec33_Dne.field_36e4d7_vSL, 75.0f);
            this.field_2092ae_Dne = 0;
        } else {
            float f = 75.0f;
            if (Math.abs(this.field_366ec33_Dne.field_36e4d7_vSL - this.field_2092ab_Dne) > 15.0f) {
                this.field_2092ae_Dne = 0;
                this.field_2092ab_Dne = this.field_366ec33_Dne.field_36e4d7_vSL;
            } else {
                ++this.field_2092ae_Dne;
                if (this.field_2092ae_Dne > 10) {
                    f = Math.max(1.0f - (float)(this.field_2092ae_Dne - 10) / 10.0f, 0.0f) * 75.0f;
                }
            }
            this.field_366ec33_Dne.field_22c5ff_IjH = this.method_2c0148d6_Dne(this.field_366ec33_Dne.field_36e4d7_vSL, this.field_366ec33_Dne.field_22c5ff_IjH, f);
        }
    }

    private float method_2c0148d6_Dne(float f, float f2, float f3) {
        float f4 = geR.method_87b72d50_aFZ(f - f2);
        if (f4 < -f3) {
            f4 = -f3;
        }
        if (f4 >= f3) {
            f4 = f3;
        }
        return f - f4;
    }

    public EPE(FUH fUH) {
        this.field_366ec33_Dne = fUH;
    }
}

