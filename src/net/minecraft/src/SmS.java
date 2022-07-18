package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public abstract class SmS
extends cMv {
    float field_2092ab_Dne;
    protected FUH field_366ec33_Dne;
    float field_21260a_FWm;
    protected int field_2092ae_Dne;
    protected oqu_0 field_379fdf9_Dne;
    boolean field_2092bf_Dne;
    protected int field_21260d_FWm;
    protected int field_2e5f1b_bzF;

    @Override
    public boolean method_7c6f603d_FWm() {
        return !this.field_2092bf_Dne;
    }

    @Override
    public boolean method_7a46289e_Dne() {
        if (!this.field_366ec33_Dne.field_388db7_zGp) {
            return false;
        }
        KFZ kFZ = this.field_366ec33_Dne.method_23028a4c_Dne();
        wdG wdG2 = kFZ.method_2316f8f1_Dne();
        if (wdG2 != null && !wdG2.method_7a46289e_Dne() && kFZ.method_7c6f603d_FWm()) {
            for (int i = 0; i < Math.min(wdG2.method_7c6f602c_FWm() + 2, wdG2.method_7a46288d_Dne()); ++i) {
                whE whE2 = wdG2.method_9e811d46_Dne(i);
                this.field_2092ae_Dne = whE2.field_2092ae_Dne;
                this.field_21260d_FWm = whE2.field_21260d_FWm + 1;
                this.field_2e5f1b_bzF = whE2.field_2e5f1b_bzF;
                if (!(this.field_366ec33_Dne.method_2be42992_Dne(this.field_2092ae_Dne, this.field_366ec33_Dne.field_22c5fd_IjH, this.field_2e5f1b_bzF) <= 2.25)) continue;
                this.field_379fdf9_Dne = this.method_d9912c07_Dne(this.field_2092ae_Dne, this.field_21260d_FWm, this.field_2e5f1b_bzF);
                if (this.field_379fdf9_Dne == null) continue;
                return true;
            }
            this.field_2092ae_Dne = geR.method_117d0718_FWm(this.field_366ec33_Dne.field_2f0dd3_div);
            this.field_21260d_FWm = geR.method_117d0718_FWm(this.field_366ec33_Dne.field_22c5fd_IjH + 1.0);
            this.field_2e5f1b_bzF = geR.method_117d0718_FWm(this.field_366ec33_Dne.field_334487_mrb);
            this.field_379fdf9_Dne = this.method_d9912c07_Dne(this.field_2092ae_Dne, this.field_21260d_FWm, this.field_2e5f1b_bzF);
            return this.field_379fdf9_Dne != null;
        }
        return false;
    }

    @Override
    public void method_7a46289a_Dne() {
        this.field_2092bf_Dne = false;
        this.field_2092ab_Dne = (float)((double)((float)this.field_2092ae_Dne + 0.5f) - this.field_366ec33_Dne.field_2f0dd3_div);
        this.field_21260a_FWm = (float)((double)((float)this.field_2e5f1b_bzF + 0.5f) - this.field_366ec33_Dne.field_334487_mrb);
    }

    @Override
    public void method_ae128dc7_bzF() {
        float f = (float)((double)((float)this.field_2092ae_Dne + 0.5f) - this.field_366ec33_Dne.field_2f0dd3_div);
        float f2 = (float)((double)((float)this.field_2e5f1b_bzF + 0.5f) - this.field_366ec33_Dne.field_334487_mrb);
        float f3 = this.field_2092ab_Dne * f + this.field_21260a_FWm * f2;
        if (f3 < 0.0f) {
            this.field_2092bf_Dne = true;
        }
    }

    public SmS(FUH fUH) {
        this.field_366ec33_Dne = fUH;
    }

    private oqu_0 method_d9912c07_Dne(int n, int n2, int n3) {
        int n4 = this.field_366ec33_Dne.field_36c4f18_Dne.method_2c2cf7bc_Dne(n, n2, n3);
        return n4 != zKP.field_ceacd6d_ICU.field_21260d_FWm ? null : (oqu_0)zKP.field_8374b848_Dne[n4];
    }
}

