package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class bvU {
    private float field_2092ab_Dne;
    private double field_212608_FWm;
    private double field_2092a9_Dne;
    private boolean field_2092bf_Dne = false;
    private double field_2e5f16_bzF;
    private FUH field_366ec33_Dne;
    private float field_21260a_FWm;

    public bvU(FUH fUH) {
        this.field_366ec33_Dne = fUH;
    }

    public void method_7a46289a_Dne() {
        this.field_366ec33_Dne.field_29186a_XHL = 0.0f;
        if (this.field_2092bf_Dne) {
            this.field_2092bf_Dne = false;
            double d = this.field_2092a9_Dne - this.field_366ec33_Dne.field_2f0dd3_div;
            double d2 = this.field_212608_FWm - (this.field_366ec33_Dne.field_22c5fd_IjH + (double)this.field_366ec33_Dne.method_59ee189_c_());
            double d3 = this.field_2e5f16_bzF - this.field_366ec33_Dne.field_334487_mrb;
            double d4 = geR.method_ce7f4ad4_Dne(d * d + d3 * d3);
            float f = (float)(Math.atan2(d3, d) * 180.0 / Math.PI) - 90.0f;
            float f2 = (float)(-(Math.atan2(d2, d4) * 180.0 / Math.PI));
            this.field_366ec33_Dne.field_29186a_XHL = this.method_2c0148d6_Dne(this.field_366ec33_Dne.field_29186a_XHL, f2, this.field_21260a_FWm);
            this.field_366ec33_Dne.field_36e4d7_vSL = this.method_2c0148d6_Dne(this.field_366ec33_Dne.field_36e4d7_vSL, f, this.field_2092ab_Dne);
        } else {
            this.field_366ec33_Dne.field_36e4d7_vSL = this.method_2c0148d6_Dne(this.field_366ec33_Dne.field_36e4d7_vSL, this.field_366ec33_Dne.field_22c5ff_IjH, 10.0f);
        }
        float f = geR.method_87b72d50_aFZ(this.field_366ec33_Dne.field_36e4d7_vSL - this.field_366ec33_Dne.field_22c5ff_IjH);
        if (!this.field_366ec33_Dne.method_23028a4c_Dne().method_ae128dcb_bzF()) {
            if (f < -75.0f) {
                this.field_366ec33_Dne.field_36e4d7_vSL = this.field_366ec33_Dne.field_22c5ff_IjH - 75.0f;
            }
            if (f > 75.0f) {
                this.field_366ec33_Dne.field_36e4d7_vSL = this.field_366ec33_Dne.field_22c5ff_IjH + 75.0f;
            }
        }
    }

    public void method_c38d48a4_Dne(double d, double d2, double d3, float f, float f2) {
        this.field_2092a9_Dne = d;
        this.field_212608_FWm = d2;
        this.field_2e5f16_bzF = d3;
        this.field_2092ab_Dne = f;
        this.field_21260a_FWm = f2;
        this.field_2092bf_Dne = true;
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

    public void method_d3754820_Dne(sMa sMa2, float f, float f2) {
        this.field_2092a9_Dne = sMa2.field_2f0dd3_div;
        this.field_212608_FWm = sMa2 instanceof FUH ? sMa2.field_22c5fd_IjH + (double)sMa2.method_59ee189_c_() : (sMa2.field_373a3ed_Dne.field_212608_FWm + sMa2.field_373a3ed_Dne.field_2d29ef_aFZ) / 2.0;
        this.field_2e5f16_bzF = sMa2.field_334487_mrb;
        this.field_2092ab_Dne = f;
        this.field_21260a_FWm = f2;
        this.field_2092bf_Dne = true;
    }
}

