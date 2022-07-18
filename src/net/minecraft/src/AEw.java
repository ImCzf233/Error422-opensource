package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class AEw
extends VHz {
    @Override
    protected float method_d44b4582_zGp() {
        return -20.0f;
    }

    @Override
    protected void method_c1ff67d0_Dne(wHH wHH2) {
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ) {
            int n;
            this.field_36c4f18_Dne.method_57aed1c2_Qnq(2002, (int)Math.round(this.field_2f0dd3_div), (int)Math.round(this.field_22c5fd_IjH), (int)Math.round(this.field_334487_mrb), 0);
            for (int i = 3 + this.field_36c4f18_Dne.field_7331eae7_Dne.nextInt(5) + this.field_36c4f18_Dne.field_7331eae7_Dne.nextInt(5); i > 0; i -= n) {
                n = alg.method_ce7f5d9c_Dne(i);
                this.field_36c4f18_Dne.method_94d18be5_FWm(new alg(this.field_36c4f18_Dne, this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb, n));
            }
            this.method_5d73f9d_g_();
        }
    }

    public AEw(Qnq qnq, FUH fUH) {
        super(qnq, fUH);
    }

    @Override
    protected float method_7ad387f3_DyG() {
        return 0.07f;
    }

    public AEw(Qnq qnq) {
        super(qnq);
    }

    public AEw(Qnq qnq, double d, double d2, double d3) {
        super(qnq, d, d2, d3);
    }

    @Override
    protected float method_ae128db7_bzF() {
        return 0.7f;
    }
}

