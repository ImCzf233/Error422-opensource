package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from etz
 */
public class etz_0
extends cMv {
    private int field_21260d_FWm;
    Class field_ce3f4d68_Dne;
    float field_2092ab_Dne;
    FUH field_366ec33_Dne;
    wdG field_37d6a92_Dne;
    Qnq field_36c4f18_Dne;
    int field_2092ae_Dne = 0;
    boolean field_2092bf_Dne;
    FUH field_2020b812_FWm;

    @Override
    public void method_7a46289a_Dne() {
        this.field_366ec33_Dne.method_23028a4c_Dne().method_ada793d7_Dne(this.field_37d6a92_Dne, this.field_2092ab_Dne);
        this.field_21260d_FWm = 0;
    }

    public etz_0(FUH fUH, Class clazz, float f, boolean bl) {
        this(fUH, f, bl);
        this.field_ce3f4d68_Dne = clazz;
    }

    @Override
    public void method_7c6f6039_FWm() {
        this.field_2020b812_FWm = null;
        this.field_366ec33_Dne.method_23028a4c_Dne().method_7c6f6039_FWm();
    }

    @Override
    public boolean method_7a46289e_Dne() {
        FUH fUH = this.field_366ec33_Dne.method_228c813f_bzF();
        if (fUH == null) {
            return false;
        }
        if (this.field_ce3f4d68_Dne != null && !this.field_ce3f4d68_Dne.isAssignableFrom(fUH.getClass())) {
            return false;
        }
        this.field_2020b812_FWm = fUH;
        this.field_37d6a92_Dne = this.field_366ec33_Dne.method_23028a4c_Dne().method_267ca945_Dne(this.field_2020b812_FWm);
        return this.field_37d6a92_Dne != null;
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        FUH fUH = this.field_366ec33_Dne.method_228c813f_bzF();
        return fUH == null ? false : (!this.field_2020b812_FWm.method_cd4cb3d9_udO() ? false : (!this.field_2092bf_Dne ? !this.field_366ec33_Dne.method_23028a4c_Dne().method_ae128dcb_bzF() : this.field_366ec33_Dne.method_2c2cf7cd_Dne(geR.method_117d0718_FWm(this.field_2020b812_FWm.field_2f0dd3_div), geR.method_117d0718_FWm(this.field_2020b812_FWm.field_22c5fd_IjH), geR.method_117d0718_FWm(this.field_2020b812_FWm.field_334487_mrb))));
    }

    public etz_0(FUH fUH, float f, boolean bl) {
        this.field_366ec33_Dne = fUH;
        this.field_36c4f18_Dne = fUH.field_36c4f18_Dne;
        this.field_2092ab_Dne = f;
        this.field_2092bf_Dne = bl;
        this.method_ce7f5da9_Dne(3);
    }

    @Override
    public void method_ae128dc7_bzF() {
        this.field_366ec33_Dne.method_230db26a_Dne().method_d3754820_Dne(this.field_2020b812_FWm, 30.0f, 30.0f);
        if ((this.field_2092bf_Dne || this.field_366ec33_Dne.method_22ffcd49_Dne().method_bb7dd824_Dne(this.field_2020b812_FWm)) && --this.field_21260d_FWm <= 0) {
            this.field_21260d_FWm = 4 + this.field_366ec33_Dne.method_b5ceee8_Dne().nextInt(7);
            this.field_366ec33_Dne.method_23028a4c_Dne().method_740ba296_Dne(this.field_2020b812_FWm, this.field_2092ab_Dne);
        }
        this.field_2092ae_Dne = Math.max(this.field_2092ae_Dne - 1, 0);
        double d = this.field_366ec33_Dne.field_342261_ooe * 2.0f * this.field_366ec33_Dne.field_342261_ooe * 2.0f;
        if (this.field_366ec33_Dne.method_2be42992_Dne(this.field_2020b812_FWm.field_2f0dd3_div, this.field_2020b812_FWm.field_373a3ed_Dne.field_212608_FWm, this.field_2020b812_FWm.field_334487_mrb) <= d && this.field_2092ae_Dne <= 0) {
            this.field_2092ae_Dne = 20;
            if (this.field_366ec33_Dne.method_23040479_Dne() != null) {
                this.field_366ec33_Dne.method_ae128dc7_bzF();
            }
            this.field_366ec33_Dne.method_ad72a717_bzF(this.field_2020b812_FWm);
        }
    }
}

