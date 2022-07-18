package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class ReV
extends cMv {
    float field_21260a_FWm;
    private FUH field_366ec33_Dne;
    float field_2092ab_Dne;
    private int field_2092ae_Dne;
    private BRM field_365100f_Dne;
    private boolean field_2092bf_Dne;
    private float field_2e5f18_bzF;
    Qnq field_36c4f18_Dne;
    private KFZ field_368fbed_Dne;

    @Override
    public void method_7c6f6039_FWm() {
        this.field_366ec33_Dne = null;
        this.field_368fbed_Dne.method_7c6f6039_FWm();
        this.field_365100f_Dne.method_23028a4c_Dne().method_ce7f9d7a_Dne(this.field_2092bf_Dne);
    }

    @Override
    public boolean method_7a46289e_Dne() {
        FUH fUH = this.field_365100f_Dne.method_2df40558_aFZ();
        if (fUH == null) {
            return false;
        }
        if (this.field_365100f_Dne.method_80692b1e_ICU()) {
            return false;
        }
        if (this.field_365100f_Dne.method_bb7dd80e_Dne(fUH) < (double)(this.field_21260a_FWm * this.field_21260a_FWm)) {
            return false;
        }
        this.field_366ec33_Dne = fUH;
        return true;
    }

    @Override
    public void method_ae128dc7_bzF() {
        this.field_365100f_Dne.method_230db26a_Dne().method_d3754820_Dne(this.field_366ec33_Dne, 10.0f, this.field_365100f_Dne.method_cd4cb3c8_udO());
        if (!this.field_365100f_Dne.method_80692b1e_ICU() && --this.field_2092ae_Dne <= 0) {
            this.field_2092ae_Dne = 10;
            if (!this.field_368fbed_Dne.method_740ba296_Dne(this.field_366ec33_Dne, this.field_2e5f18_bzF) && this.field_365100f_Dne.method_bb7dd80e_Dne(this.field_366ec33_Dne) >= 144.0) {
                int n = geR.method_117d0718_FWm(this.field_366ec33_Dne.field_2f0dd3_div) - 2;
                int n2 = geR.method_117d0718_FWm(this.field_366ec33_Dne.field_334487_mrb) - 2;
                int n3 = geR.method_117d0718_FWm(this.field_366ec33_Dne.field_373a3ed_Dne.field_212608_FWm);
                for (int i = 0; i <= 4; ++i) {
                    for (int j = 0; j <= 4; ++j) {
                        if (i >= 1 && j >= 1 && i <= 3 && j <= 3 || !this.field_36c4f18_Dne.method_73e9b8f9_IjH(n + i, n3 - 1, n2 + j) || this.field_36c4f18_Dne.method_6fdef3c4_DyG(n + i, n3, n2 + j) || this.field_36c4f18_Dne.method_6fdef3c4_DyG(n + i, n3 + 1, n2 + j)) continue;
                        this.field_365100f_Dne.method_9ce0fc65_FWm((float)(n + i) + 0.5f, n3, (float)(n2 + j) + 0.5f, this.field_365100f_Dne.field_334489_mrb, this.field_365100f_Dne.field_29186a_XHL);
                        this.field_368fbed_Dne.method_7c6f6039_FWm();
                        return;
                    }
                }
            }
        }
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return !this.field_368fbed_Dne.method_ae128dcb_bzF() && this.field_365100f_Dne.method_bb7dd80e_Dne(this.field_366ec33_Dne) > (double)(this.field_2092ab_Dne * this.field_2092ab_Dne) && !this.field_365100f_Dne.method_80692b1e_ICU();
    }

    public ReV(BRM bRM, float f, float f2, float f3) {
        this.field_365100f_Dne = bRM;
        this.field_36c4f18_Dne = bRM.field_36c4f18_Dne;
        this.field_2e5f18_bzF = f;
        this.field_368fbed_Dne = bRM.method_23028a4c_Dne();
        this.field_21260a_FWm = f2;
        this.field_2092ab_Dne = f3;
        this.method_ce7f5da9_Dne(3);
    }

    @Override
    public void method_7a46289a_Dne() {
        this.field_2092ae_Dne = 0;
        this.field_2092bf_Dne = this.field_365100f_Dne.method_23028a4c_Dne().method_7a46289e_Dne();
        this.field_365100f_Dne.method_23028a4c_Dne().method_ce7f9d7a_Dne(false);
    }
}

