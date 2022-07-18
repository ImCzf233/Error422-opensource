package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class yws
extends cMv {
    private Class field_ce3f4d68_Dne;
    private int field_2092ae_Dne;
    private FUH field_366ec33_Dne;
    private float field_2092ab_Dne;
    private float field_21260a_FWm;
    protected sMa field_37b45e5_Dne;

    @Override
    public void method_7a46289a_Dne() {
        this.field_2092ae_Dne = 40 + this.field_366ec33_Dne.method_b5ceee8_Dne().nextInt(40);
    }

    @Override
    public void method_7c6f6039_FWm() {
        this.field_37b45e5_Dne = null;
    }

    @Override
    public void method_ae128dc7_bzF() {
        this.field_366ec33_Dne.method_230db26a_Dne().method_c38d48a4_Dne(this.field_37b45e5_Dne.field_2f0dd3_div, this.field_37b45e5_Dne.field_22c5fd_IjH + (double)this.field_37b45e5_Dne.method_59ee189_c_(), this.field_37b45e5_Dne.field_334487_mrb, 10.0f, this.field_366ec33_Dne.method_cd4cb3c8_udO());
        --this.field_2092ae_Dne;
    }

    public yws(FUH fUH, Class clazz, float f, float f2) {
        this.field_366ec33_Dne = fUH;
        this.field_ce3f4d68_Dne = clazz;
        this.field_2092ab_Dne = f;
        this.field_21260a_FWm = f2;
        this.method_ce7f5da9_Dne(2);
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return !this.field_37b45e5_Dne.method_cd4cb3d9_udO() ? false : (this.field_366ec33_Dne.method_bb7dd80e_Dne(this.field_37b45e5_Dne) > (double)(this.field_2092ab_Dne * this.field_2092ab_Dne) ? false : this.field_2092ae_Dne > 0);
    }

    public yws(FUH fUH, Class clazz, float f) {
        this.field_366ec33_Dne = fUH;
        this.field_ce3f4d68_Dne = clazz;
        this.field_2092ab_Dne = f;
        this.field_21260a_FWm = 0.02f;
        this.method_ce7f5da9_Dne(2);
    }

    @Override
    public boolean method_7a46289e_Dne() {
        if (this.field_366ec33_Dne.method_b5ceee8_Dne().nextFloat() >= this.field_21260a_FWm) {
            return false;
        }
        this.field_37b45e5_Dne = this.field_ce3f4d68_Dne == FiG.class ? this.field_366ec33_Dne.field_36c4f18_Dne.method_3d2c70b_Dne(this.field_366ec33_Dne, this.field_2092ab_Dne) : this.field_366ec33_Dne.field_36c4f18_Dne.method_82785e85_Dne(this.field_ce3f4d68_Dne, this.field_366ec33_Dne.field_373a3ed_Dne.method_b78565d7_FWm(this.field_2092ab_Dne, 3.0, this.field_2092ab_Dne), this.field_366ec33_Dne);
        return this.field_37b45e5_Dne != null;
    }
}

