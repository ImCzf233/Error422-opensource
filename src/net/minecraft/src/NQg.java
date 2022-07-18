package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class NQg
extends cMv {
    FUH field_366ec33_Dne;
    float field_2092ab_Dne;
    FUH field_2020b812_FWm;

    @Override
    public boolean method_7c6f603d_FWm() {
        return !this.field_366ec33_Dne.field_2d2a05_aFZ;
    }

    @Override
    public void method_7a46289a_Dne() {
        double d = this.field_2020b812_FWm.field_2f0dd3_div - this.field_366ec33_Dne.field_2f0dd3_div;
        double d2 = this.field_2020b812_FWm.field_334487_mrb - this.field_366ec33_Dne.field_334487_mrb;
        float f = geR.method_ce7f4ad4_Dne(d * d + d2 * d2);
        this.field_366ec33_Dne.field_291868_XHL += d / (double)f * 0.5 * (double)0.8f + this.field_366ec33_Dne.field_291868_XHL * (double)0.2f;
        this.field_366ec33_Dne.field_31b811_kGO += d2 / (double)f * 0.5 * (double)0.8f + this.field_366ec33_Dne.field_31b811_kGO * (double)0.2f;
        this.field_366ec33_Dne.field_2a9ad1_Zpi = this.field_2092ab_Dne;
    }

    public NQg(FUH fUH, float f) {
        this.field_366ec33_Dne = fUH;
        this.field_2092ab_Dne = f;
        this.method_ce7f5da9_Dne(5);
    }

    @Override
    public boolean method_7a46289e_Dne() {
        this.field_2020b812_FWm = this.field_366ec33_Dne.method_228c813f_bzF();
        if (this.field_2020b812_FWm == null) {
            return false;
        }
        double d = this.field_366ec33_Dne.method_bb7dd80e_Dne(this.field_2020b812_FWm);
        return d >= 4.0 && d <= 16.0 ? (!this.field_366ec33_Dne.field_2d2a05_aFZ ? false : this.field_366ec33_Dne.method_b5ceee8_Dne().nextInt(5) == 0) : false;
    }
}

