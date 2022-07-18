package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class quK
extends cMv {
    private double field_2e5f16_bzF;
    private FUH field_366ec33_Dne;
    private double field_212608_FWm;
    private kSJ field_377b6aa_Dne;
    private double field_2092a9_Dne;
    private float field_21260a_FWm;
    private float field_2092ab_Dne;

    @Override
    public void method_7c6f6039_FWm() {
        this.field_366ec33_Dne = null;
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return !this.field_377b6aa_Dne.method_23028a4c_Dne().method_ae128dcb_bzF() && this.field_366ec33_Dne.method_cd4cb3d9_udO() && this.field_366ec33_Dne.method_bb7dd80e_Dne(this.field_377b6aa_Dne) < (double)(this.field_21260a_FWm * this.field_21260a_FWm);
    }

    public quK(kSJ kSJ2, float f, float f2) {
        this.field_377b6aa_Dne = kSJ2;
        this.field_2092ab_Dne = f;
        this.field_21260a_FWm = f2;
        this.method_ce7f5da9_Dne(1);
    }

    @Override
    public boolean method_7a46289e_Dne() {
        this.field_366ec33_Dne = this.field_377b6aa_Dne.method_228c813f_bzF();
        if (this.field_366ec33_Dne == null) {
            return false;
        }
        if (this.field_366ec33_Dne.method_bb7dd80e_Dne(this.field_377b6aa_Dne) > (double)(this.field_21260a_FWm * this.field_21260a_FWm)) {
            return false;
        }
        chN chN2 = gWB.method_25f96ebb_Dne(this.field_377b6aa_Dne, 16, 7, this.field_377b6aa_Dne.field_36c4f18_Dne.method_23186a47_Dne().method_e4505d6c_Dne(this.field_366ec33_Dne.field_2f0dd3_div, this.field_366ec33_Dne.field_22c5fd_IjH, this.field_366ec33_Dne.field_334487_mrb));
        if (chN2 == null) {
            return false;
        }
        this.field_2092a9_Dne = chN2.field_2092a9_Dne;
        this.field_212608_FWm = chN2.field_212608_FWm;
        this.field_2e5f16_bzF = chN2.field_2e5f16_bzF;
        return true;
    }

    @Override
    public void method_7a46289a_Dne() {
        this.field_377b6aa_Dne.method_23028a4c_Dne().method_50a172a0_Dne(this.field_2092a9_Dne, this.field_212608_FWm, this.field_2e5f16_bzF, this.field_2092ab_Dne);
    }
}

