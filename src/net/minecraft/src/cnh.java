package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class cnh
extends cMv {
    private int field_21260d_FWm;
    private FiG field_3673728_Dne;
    private boolean field_21261e_FWm;
    private boolean field_2e5f2c_bzF;
    private float field_2092ab_Dne;
    private double field_2092a9_Dne;
    private double field_267cf0_Qnq;
    private int field_2092ae_Dne = 0;
    private double field_212608_FWm;
    private double field_2d29ef_aFZ;
    private double field_2e5f16_bzF;
    private boolean field_2092bf_Dne;
    private kSJ field_377b6aa_Dne;

    @Override
    public void method_ae128dc7_bzF() {
        this.field_377b6aa_Dne.method_230db26a_Dne().method_d3754820_Dne(this.field_3673728_Dne, 30.0f, this.field_377b6aa_Dne.method_cd4cb3c8_udO());
        if (this.field_377b6aa_Dne.method_bb7dd80e_Dne(this.field_3673728_Dne) < 6.25) {
            this.field_377b6aa_Dne.method_23028a4c_Dne().method_7c6f6039_FWm();
        } else {
            this.field_377b6aa_Dne.method_23028a4c_Dne().method_740ba296_Dne(this.field_3673728_Dne, this.field_2092ab_Dne);
        }
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        if (this.field_21261e_FWm) {
            if (this.field_377b6aa_Dne.method_bb7dd80e_Dne(this.field_3673728_Dne) < 36.0) {
                if (this.field_3673728_Dne.method_2be42992_Dne(this.field_2092a9_Dne, this.field_212608_FWm, this.field_2e5f16_bzF) > 0.010000000000000002) {
                    return false;
                }
                if (Math.abs((double)this.field_3673728_Dne.field_29186a_XHL - this.field_267cf0_Qnq) > 5.0 || Math.abs((double)this.field_3673728_Dne.field_334489_mrb - this.field_2d29ef_aFZ) > 5.0) {
                    return false;
                }
            } else {
                this.field_2092a9_Dne = this.field_3673728_Dne.field_2f0dd3_div;
                this.field_212608_FWm = this.field_3673728_Dne.field_22c5fd_IjH;
                this.field_2e5f16_bzF = this.field_3673728_Dne.field_334487_mrb;
            }
            this.field_267cf0_Qnq = this.field_3673728_Dne.field_29186a_XHL;
            this.field_2d29ef_aFZ = this.field_3673728_Dne.field_334489_mrb;
        }
        return this.method_7a46289e_Dne();
    }

    public boolean method_ae128dcb_bzF() {
        return this.field_2092bf_Dne;
    }

    @Override
    public void method_7a46289a_Dne() {
        this.field_2092a9_Dne = this.field_3673728_Dne.field_2f0dd3_div;
        this.field_212608_FWm = this.field_3673728_Dne.field_22c5fd_IjH;
        this.field_2e5f16_bzF = this.field_3673728_Dne.field_334487_mrb;
        this.field_2092bf_Dne = true;
        this.field_2e5f2c_bzF = this.field_377b6aa_Dne.method_23028a4c_Dne().method_7a46289e_Dne();
        this.field_377b6aa_Dne.method_23028a4c_Dne().method_ce7f9d7a_Dne(false);
    }

    @Override
    public boolean method_7a46289e_Dne() {
        if (this.field_2092ae_Dne > 0) {
            --this.field_2092ae_Dne;
            return false;
        }
        this.field_3673728_Dne = this.field_377b6aa_Dne.field_36c4f18_Dne.method_3d2c70b_Dne(this.field_377b6aa_Dne, 10.0);
        if (this.field_3673728_Dne == null) {
            return false;
        }
        NMq nMq = this.field_3673728_Dne.method_22900b26_bzF();
        return nMq == null ? false : nMq.field_2e5f1b_bzF == this.field_21260d_FWm;
    }

    public cnh(kSJ kSJ2, float f, int n, boolean bl) {
        this.field_377b6aa_Dne = kSJ2;
        this.field_2092ab_Dne = f;
        this.field_21260d_FWm = n;
        this.field_21261e_FWm = bl;
        this.method_ce7f5da9_Dne(3);
    }

    @Override
    public void method_7c6f6039_FWm() {
        this.field_3673728_Dne = null;
        this.field_377b6aa_Dne.method_23028a4c_Dne().method_7c6f6039_FWm();
        this.field_2092ae_Dne = 100;
        this.field_2092bf_Dne = false;
        this.field_377b6aa_Dne.method_23028a4c_Dne().method_ce7f9d7a_Dne(this.field_2e5f2c_bzF);
    }
}

