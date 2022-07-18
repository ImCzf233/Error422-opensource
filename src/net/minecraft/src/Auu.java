package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class Auu
extends cMv {
    private int field_267cf5_Qnq;
    private float field_2092ab_Dne;
    private int field_2092ae_Dne = -1;
    private int field_2e5f1b_bzF;
    private float field_2e5f18_bzF;
    private float field_21260a_FWm;
    private FUH field_2020b812_FWm;
    private int field_21260d_FWm = 0;
    private final FUH field_366ec33_Dne;
    private final vjn field_37d1172_Dne;

    public Auu(vjn vjn2, float f, int n, int n2, float f2) {
        if (!(vjn2 instanceof FUH)) {
            throw new IllegalArgumentException("ArrowAttackGoal requires Mob implements RangedAttackMob");
        }
        this.field_37d1172_Dne = vjn2;
        this.field_366ec33_Dne = (FUH)((Object)vjn2);
        this.field_2092ab_Dne = f;
        this.field_2e5f1b_bzF = n;
        this.field_267cf5_Qnq = n2;
        this.field_21260a_FWm = f2;
        this.field_2e5f18_bzF = f2 * f2;
        this.method_ce7f5da9_Dne(3);
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return this.method_7a46289e_Dne() || !this.field_366ec33_Dne.method_23028a4c_Dne().method_ae128dcb_bzF();
    }

    public Auu(vjn vjn2, float f, int n, float f2) {
        this(vjn2, f, n, n, f2);
    }

    @Override
    public void method_7c6f6039_FWm() {
        this.field_2020b812_FWm = null;
        this.field_21260d_FWm = 0;
        this.field_2092ae_Dne = -1;
    }

    @Override
    public void method_ae128dc7_bzF() {
        double d = this.field_366ec33_Dne.method_2be42992_Dne(this.field_2020b812_FWm.field_2f0dd3_div, this.field_2020b812_FWm.field_373a3ed_Dne.field_212608_FWm, this.field_2020b812_FWm.field_334487_mrb);
        boolean bl = this.field_366ec33_Dne.method_22ffcd49_Dne().method_bb7dd824_Dne(this.field_2020b812_FWm);
        this.field_21260d_FWm = bl ? ++this.field_21260d_FWm : 0;
        if (d <= (double)this.field_2e5f18_bzF && this.field_21260d_FWm >= 20) {
            this.field_366ec33_Dne.method_23028a4c_Dne().method_7c6f6039_FWm();
        } else {
            this.field_366ec33_Dne.method_23028a4c_Dne().method_740ba296_Dne(this.field_2020b812_FWm, this.field_2092ab_Dne);
        }
        this.field_366ec33_Dne.method_230db26a_Dne().method_d3754820_Dne(this.field_2020b812_FWm, 30.0f, 30.0f);
        if (--this.field_2092ae_Dne == 0) {
            float f;
            if (d > (double)this.field_2e5f18_bzF || !bl) {
                return;
            }
            float f2 = f = geR.method_ce7f4ad4_Dne(d) / this.field_21260a_FWm;
            if (f < 0.1f) {
                f2 = 0.1f;
            }
            if (f2 > 1.0f) {
                f2 = 1.0f;
            }
            this.field_37d1172_Dne.method_740ba292_Dne(this.field_2020b812_FWm, f2);
            this.field_2092ae_Dne = geR.method_ce7f5259_Dne(f * (float)(this.field_267cf5_Qnq - this.field_2e5f1b_bzF) + (float)this.field_2e5f1b_bzF);
        } else if (this.field_2092ae_Dne < 0) {
            float f = geR.method_ce7f4ad4_Dne(d) / this.field_21260a_FWm;
            this.field_2092ae_Dne = geR.method_ce7f5259_Dne(f * (float)(this.field_267cf5_Qnq - this.field_2e5f1b_bzF) + (float)this.field_2e5f1b_bzF);
        }
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
}

