package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class TNI
implements qDW {
    private final FKB field_366c5ef_Dne;
    private double field_2092a9_Dne = 0.0;
    private float field_2092ab_Dne = 0.0f;
    private boolean field_267d06_Qnq = false;
    private float field_2e5f18_bzF = 0.0f;
    private boolean field_2e5f2c_bzF = false;
    private final mKT field_3788296_Dne;
    private float field_21260a_FWm = 0.0f;
    private final Ebp field_366ad79_Dne;
    private boolean field_2092bf_Dne = false;
    private boolean field_21261e_FWm = false;

    public TNI(mKT mKT2, Ebp ebp, FKB fKB) {
        this.field_3788296_Dne = mKT2;
        this.field_366ad79_Dne = ebp;
        this.field_366c5ef_Dne = fKB;
    }

    @Override
    public void method_7a46289a_Dne() {
        boolean bl = false;
        boolean bl2 = this.field_2092bf_Dne;
        boolean bl3 = this.field_21261e_FWm;
        boolean bl4 = this.field_2e5f2c_bzF;
        float f = this.field_21260a_FWm;
        float f2 = this.field_2092ab_Dne;
        float f3 = this.field_2e5f18_bzF;
        double d = this.field_2092a9_Dne;
        this.field_2092bf_Dne = this.field_366c5ef_Dne != null && this.field_366ad79_Dne.field_37b45e5_Dne == this.field_366c5ef_Dne;
        this.field_21261e_FWm = this.field_366ad79_Dne.field_2a9ae7_Zpi;
        this.field_2092a9_Dne = geR.method_ce7f4ad4_Dne(this.field_366ad79_Dne.field_291868_XHL * this.field_366ad79_Dne.field_291868_XHL + this.field_366ad79_Dne.field_31b811_kGO * this.field_366ad79_Dne.field_31b811_kGO);
        boolean bl5 = this.field_2e5f2c_bzF = this.field_2092a9_Dne >= 0.01;
        if (bl2 && !this.field_2092bf_Dne) {
            this.field_3788296_Dne.method_94d18be1_FWm(this.field_366c5ef_Dne);
        }
        if (this.field_21261e_FWm || !this.field_267d06_Qnq && this.field_21260a_FWm == 0.0f && this.field_2e5f18_bzF == 0.0f) {
            if (!bl3) {
                this.field_3788296_Dne.method_94d18be1_FWm(this.field_366ad79_Dne);
                if (bl2 || this.field_2092bf_Dne) {
                    this.field_3788296_Dne.method_94d18be1_FWm(this.field_366c5ef_Dne);
                }
            }
            this.field_267d06_Qnq = true;
            if (this.field_21261e_FWm) {
                return;
            }
        }
        if (!this.field_3788296_Dne.method_bb7dd824_Dne(this.field_366ad79_Dne) && this.field_21260a_FWm > 0.0f) {
            this.field_3788296_Dne.method_7a1f7bfe_Dne("minecart.base", this.field_366ad79_Dne, this.field_21260a_FWm, this.field_2092ab_Dne, false);
            this.field_267d06_Qnq = false;
            bl = true;
        }
        if (this.field_2092bf_Dne && !this.field_3788296_Dne.method_bb7dd824_Dne(this.field_366c5ef_Dne) && this.field_2e5f18_bzF > 0.0f) {
            this.field_3788296_Dne.method_7a1f7bfe_Dne("minecart.inside", this.field_366c5ef_Dne, this.field_2e5f18_bzF, 1.0f, true);
            this.field_267d06_Qnq = false;
            bl = true;
        }
        if (this.field_2e5f2c_bzF) {
            if (this.field_2092ab_Dne < 1.0f) {
                this.field_2092ab_Dne += 0.0025f;
            }
            if (this.field_2092ab_Dne > 1.0f) {
                this.field_2092ab_Dne = 1.0f;
            }
            float f4 = geR.method_2c0148d6_Dne((float)this.field_2092a9_Dne, 0.0f, 4.0f) / 4.0f;
            this.field_2e5f18_bzF = 0.0f + f4 * 0.75f;
            f4 = geR.method_2c0148d6_Dne(f4 * 2.0f, 0.0f, 1.0f);
            this.field_21260a_FWm = 0.0f + f4 * 0.7f;
        } else if (bl4) {
            this.field_21260a_FWm = 0.0f;
            this.field_2092ab_Dne = 0.0f;
            this.field_2e5f18_bzF = 0.0f;
        }
        if (!this.field_267d06_Qnq) {
            if (this.field_2092ab_Dne != f2) {
                this.field_3788296_Dne.method_56057ff_FWm(this.field_366ad79_Dne, this.field_2092ab_Dne);
            }
            if (this.field_21260a_FWm != f) {
                this.field_3788296_Dne.method_b43d93a0_Dne(this.field_366ad79_Dne, this.field_21260a_FWm);
            }
            if (this.field_2e5f18_bzF != f3) {
                this.field_3788296_Dne.method_b43d93a0_Dne(this.field_366c5ef_Dne, this.field_2e5f18_bzF);
            }
        }
        if (!bl && (this.field_21260a_FWm > 0.0f || this.field_2e5f18_bzF > 0.0f)) {
            this.field_3788296_Dne.method_bb7dd820_Dne(this.field_366ad79_Dne);
            if (this.field_2092bf_Dne) {
                this.field_3788296_Dne.method_2964ec5a_Dne(this.field_366c5ef_Dne, this.field_366ad79_Dne);
            }
        } else {
            if (this.field_3788296_Dne.method_bb7dd824_Dne(this.field_366ad79_Dne)) {
                this.field_3788296_Dne.method_94d18be1_FWm(this.field_366ad79_Dne);
            }
            if (this.field_2092bf_Dne && this.field_3788296_Dne.method_bb7dd824_Dne(this.field_366c5ef_Dne)) {
                this.field_3788296_Dne.method_94d18be1_FWm(this.field_366c5ef_Dne);
            }
        }
    }
}

