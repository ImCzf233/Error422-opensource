package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class csP {
    private double field_212608_FWm;
    private FUH field_366ec33_Dne;
    private boolean field_2092bf_Dne = false;
    private double field_2e5f16_bzF;
    private float field_2092ab_Dne;
    private double field_2092a9_Dne;

    public void method_7a46289a_Dne() {
        this.field_366ec33_Dne.method_7ed96ebf_Qnq(0.0f);
        if (this.field_2092bf_Dne) {
            double d;
            this.field_2092bf_Dne = false;
            double d2 = this.field_2092a9_Dne - this.field_366ec33_Dne.field_2f0dd3_div;
            int n = geR.method_117d0718_FWm(this.field_366ec33_Dne.field_373a3ed_Dne.field_212608_FWm + 0.5);
            double d3 = this.field_212608_FWm - (double)n;
            double d4 = d2 * d2 + d3 * d3 + (d = this.field_2e5f16_bzF - this.field_366ec33_Dne.field_334487_mrb) * d;
            if (d4 >= 2.500000277905201E-7) {
                float f = (float)(Math.atan2(d, d2) * 180.0 / Math.PI) - 90.0f;
                this.field_366ec33_Dne.field_334489_mrb = this.method_2c0148d6_Dne(this.field_366ec33_Dne.field_334489_mrb, f, 30.0f);
                this.field_366ec33_Dne.method_143f92d9_bzF(this.field_2092ab_Dne * this.field_366ec33_Dne.method_c073dae8_mrb());
                if (d3 > 0.0 && d2 * d2 + d * d < 1.0) {
                    this.field_366ec33_Dne.method_23144d3f_Dne().method_7a46289a_Dne();
                }
            }
        }
    }

    public csP(FUH fUH) {
        this.field_366ec33_Dne = fUH;
        this.field_2092a9_Dne = fUH.field_2f0dd3_div;
        this.field_212608_FWm = fUH.field_22c5fd_IjH;
        this.field_2e5f16_bzF = fUH.field_334487_mrb;
    }

    public void method_50a1729c_Dne(double d, double d2, double d3, float f) {
        this.field_2092a9_Dne = d;
        this.field_212608_FWm = d2;
        this.field_2e5f16_bzF = d3;
        this.field_2092ab_Dne = f;
        this.field_2092bf_Dne = true;
    }

    public float method_7a46288a_Dne() {
        return this.field_2092ab_Dne;
    }

    private float method_2c0148d6_Dne(float f, float f2, float f3) {
        float f4 = geR.method_87b72d50_aFZ(f2 - f);
        if (f4 > f3) {
            f4 = f3;
        }
        if (f4 < -f3) {
            f4 = -f3;
        }
        return f + f4;
    }

    public boolean method_7a46289e_Dne() {
        return this.field_2092bf_Dne;
    }
}

