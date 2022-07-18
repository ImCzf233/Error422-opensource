package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from KXX
 */
public class kxx_0
extends VHz {
    public kxx_0(Qnq qnq) {
        super(qnq);
    }

    public kxx_0(Qnq qnq, double d, double d2, double d3) {
        super(qnq, d, d2, d3);
    }

    @Override
    protected void method_c1ff67d0_Dne(wHH wHH2) {
        int n;
        if (wHH2.field_37b45e5_Dne != null) {
            n = 0;
            if (wHH2.field_37b45e5_Dne instanceof hlo) {
                n = 3;
            }
            wHH2.field_37b45e5_Dne.method_147b2066_Dne(zBn.method_d9aebee5_Dne(this, this.method_23007a92_Dne()), n);
        }
        for (n = 0; n < 8; ++n) {
            this.field_36c4f18_Dne.method_8600ec24_Dne("snowballpoof", this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb, 0.0, 0.0, 0.0);
        }
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ) {
            this.method_5d73f9d_g_();
        }
    }

    public kxx_0(Qnq qnq, FUH fUH) {
        super(qnq, fUH);
    }
}

