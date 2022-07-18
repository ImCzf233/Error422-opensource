package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class vAj
extends cMv {
    int field_2092ae_Dne = 0;
    Qnq field_36c4f18_Dne;
    FUH field_2020b812_FWm;
    FUH field_366ec33_Dne;

    @Override
    public boolean method_7c6f603d_FWm() {
        return !this.field_2020b812_FWm.method_cd4cb3d9_udO() ? false : (this.field_366ec33_Dne.method_bb7dd80e_Dne(this.field_2020b812_FWm) > 225.0 ? false : !this.field_366ec33_Dne.method_23028a4c_Dne().method_ae128dcb_bzF() || this.method_7a46289e_Dne());
    }

    public vAj(FUH fUH) {
        this.field_366ec33_Dne = fUH;
        this.field_36c4f18_Dne = fUH.field_36c4f18_Dne;
        this.method_ce7f5da9_Dne(3);
    }

    @Override
    public boolean method_7a46289e_Dne() {
        FUH fUH = this.field_366ec33_Dne.method_228c813f_bzF();
        if (fUH == null) {
            return false;
        }
        this.field_2020b812_FWm = fUH;
        return true;
    }

    @Override
    public void method_7c6f6039_FWm() {
        this.field_2020b812_FWm = null;
        this.field_366ec33_Dne.method_23028a4c_Dne().method_7c6f6039_FWm();
    }

    @Override
    public void method_ae128dc7_bzF() {
        this.field_366ec33_Dne.method_230db26a_Dne().method_d3754820_Dne(this.field_2020b812_FWm, 30.0f, 30.0f);
        double d = this.field_366ec33_Dne.field_342261_ooe * 2.0f * this.field_366ec33_Dne.field_342261_ooe * 2.0f;
        double d2 = this.field_366ec33_Dne.method_2be42992_Dne(this.field_2020b812_FWm.field_2f0dd3_div, this.field_2020b812_FWm.field_373a3ed_Dne.field_212608_FWm, this.field_2020b812_FWm.field_334487_mrb);
        float f = 0.23f;
        if (d2 > d && d2 < 16.0) {
            f = 0.4f;
        } else if (d2 < 225.0) {
            f = 0.18f;
        }
        this.field_366ec33_Dne.method_23028a4c_Dne().method_740ba296_Dne(this.field_2020b812_FWm, f);
        this.field_2092ae_Dne = Math.max(this.field_2092ae_Dne - 1, 0);
        if (d2 <= d && this.field_2092ae_Dne <= 0) {
            this.field_2092ae_Dne = 20;
            this.field_366ec33_Dne.method_ad72a717_bzF(this.field_2020b812_FWm);
        }
    }
}

