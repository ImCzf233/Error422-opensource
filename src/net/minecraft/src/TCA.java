package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class TCA
extends VHz {
    @Override
    protected void method_c1ff67d0_Dne(wHH wHH2) {
        int n;
        if (wHH2.field_37b45e5_Dne != null) {
            wHH2.field_37b45e5_Dne.method_147b2066_Dne(zBn.method_d9aebee5_Dne(this, this.method_23007a92_Dne()), 0);
        }
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ && this.field_7331eae7_Dne.nextInt(8) == 0) {
            n = 1;
            if (this.field_7331eae7_Dne.nextInt(32) == 0) {
                n = 4;
            }
            if (eCD.method_ce7f5d9c_Dne(10) == 0) {
                zTy zTy2 = new zTy(this.field_36c4f18_Dne);
                zTy2.method_9ce0fc65_FWm(this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb, this.field_334489_mrb, 0.0f);
                this.field_36c4f18_Dne.method_94d18be5_FWm(zTy2);
            } else {
                for (int i = 0; i < n; ++i) {
                    GRq gRq = new GRq(this.field_36c4f18_Dne);
                    gRq.method_117d19ea_FWm(-24000);
                    gRq.method_9ce0fc65_FWm(this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb, this.field_334489_mrb, 0.0f);
                    this.field_36c4f18_Dne.method_94d18be5_FWm(gRq);
                }
            }
        }
        for (n = 0; n < 8; ++n) {
            this.field_36c4f18_Dne.method_8600ec24_Dne("snowballpoof", this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb, 0.0, 0.0, 0.0);
        }
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ) {
            this.method_5d73f9d_g_();
        }
    }

    public TCA(Qnq qnq, FUH fUH) {
        super(qnq, fUH);
    }

    public TCA(Qnq qnq, double d, double d2, double d3) {
        super(qnq, d, d2, d3);
    }

    public TCA(Qnq qnq) {
        super(qnq);
    }
}

