package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class Hhj
extends VHz {
    public Hhj(Qnq qnq, double d, double d2, double d3) {
        super(qnq, d, d2, d3);
    }

    public Hhj(Qnq qnq, FUH fUH) {
        super(qnq, fUH);
    }

    public Hhj(Qnq qnq) {
        super(qnq);
    }

    @Override
    protected void method_c1ff67d0_Dne(wHH wHH2) {
        if (wHH2.field_37b45e5_Dne != null) {
            wHH2.field_37b45e5_Dne.method_147b2066_Dne(zBn.method_d9aebee5_Dne(this, this.method_23007a92_Dne()), 0);
        }
        for (int i = 0; i < 32; ++i) {
            this.field_36c4f18_Dne.method_8600ec24_Dne("portal", this.field_2f0dd3_div, this.field_22c5fd_IjH + this.field_7331eae7_Dne.nextDouble() * 2.0, this.field_334487_mrb, this.field_7331eae7_Dne.nextGaussian(), 0.0, this.field_7331eae7_Dne.nextGaussian());
        }
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ) {
            if (this.method_23007a92_Dne() != null && this.method_23007a92_Dne() instanceof PJQ) {
                PJQ pJQ = (PJQ)this.method_23007a92_Dne();
                if (!pJQ.field_36dacd0_Dne.field_2092bf_Dne && pJQ.field_36c4f18_Dne == this.field_36c4f18_Dne) {
                    this.method_23007a92_Dne().method_a663d9a5_FWm(this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb);
                    this.method_23007a92_Dne().field_2e8483_ceE = 0.0f;
                    this.method_23007a92_Dne().method_147b2066_Dne(zBn.field_142722f0_div, 5);
                }
            }
            this.method_5d73f9d_g_();
        }
    }
}

