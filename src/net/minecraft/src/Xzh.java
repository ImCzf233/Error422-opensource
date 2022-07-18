package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class Xzh
extends Tdr {
    @Override
    protected void method_c1ff67d0_Dne(wHH wHH2) {
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ) {
            if (wHH2.field_37b45e5_Dne != null) {
                if (!wHH2.field_37b45e5_Dne.method_c073dafc_mrb() && wHH2.field_37b45e5_Dne.method_147b2066_Dne(zBn.method_19bd6ce0_Dne(this, this.field_366ec33_Dne), 5)) {
                    wHH2.field_37b45e5_Dne.method_87b738a3_aFZ(5);
                }
            } else {
                int n = wHH2.field_2092ae_Dne;
                int n2 = wHH2.field_21260d_FWm;
                int n3 = wHH2.field_2e5f1b_bzF;
                switch (wHH2.field_267cf5_Qnq) {
                    case 0: {
                        --n2;
                        break;
                    }
                    case 1: {
                        ++n2;
                        break;
                    }
                    case 2: {
                        --n3;
                        break;
                    }
                    case 3: {
                        ++n3;
                        break;
                    }
                    case 4: {
                        --n;
                        break;
                    }
                    case 5: {
                        ++n;
                    }
                }
                if (this.field_36c4f18_Dne.method_2c2cf7cd_Dne(n, n2, n3)) {
                    this.field_36c4f18_Dne.method_2ee8c47d_FWm(n, n2, n3, zKP.field_3774324_Dne.field_21260d_FWm);
                }
            }
            this.method_5d73f9d_g_();
        }
    }

    @Override
    public boolean method_baa39406_kGO() {
        return false;
    }

    public Xzh(Qnq qnq) {
        super(qnq);
        this.method_16b621a_Dne(0.3125f, 0.3125f);
    }

    public Xzh(Qnq qnq, double d, double d2, double d3, double d4, double d5, double d6) {
        super(qnq, d, d2, d3, d4, d5, d6);
        this.method_16b621a_Dne(0.3125f, 0.3125f);
    }

    @Override
    public boolean method_147b2066_Dne(zBn zBn2, int n) {
        return false;
    }

    public Xzh(Qnq qnq, FUH fUH, double d, double d2, double d3) {
        super(qnq, fUH, d, d2, d3);
        this.method_16b621a_Dne(0.3125f, 0.3125f);
    }
}

