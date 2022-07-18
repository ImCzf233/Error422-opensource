package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class YCH
extends Tdr {
    public boolean method_907a9d25_Qnq() {
        return this.field_378ab08_Dne.method_ce7f5d95_Dne(10) == 1;
    }

    @Override
    public float method_981211cc_Dne(yTR yTR2, Qnq qnq, int n, int n2, int n3, zKP zKP2) {
        float f = super.method_981211cc_Dne(yTR2, qnq, n, n2, n3, zKP2);
        if (this.method_907a9d25_Qnq() && zKP2 != zKP.field_f0b029e5_zGp && zKP2 != zKP.field_fae40a26_EYV && zKP2 != zKP.field_e4a82663_dBc) {
            f = Math.min(0.8f, f);
        }
        return f;
    }

    @Override
    public boolean method_147b2066_Dne(zBn zBn2, int n) {
        return false;
    }

    @Override
    protected float method_ae128db7_bzF() {
        return this.method_907a9d25_Qnq() ? 0.73f : super.method_ae128db7_bzF();
    }

    @Override
    public boolean method_baa39406_kGO() {
        return false;
    }

    @Override
    protected void method_7c6f6039_FWm() {
        this.field_378ab08_Dne.method_ad009545_Dne(10, (byte)0);
    }

    @Override
    public boolean method_cc5ef5c4_trS() {
        return false;
    }

    public void method_117d59bb_FWm(boolean bl) {
        this.field_378ab08_Dne.method_62ca2346_FWm(10, (byte)(bl ? 1 : 0));
    }

    public YCH(Qnq qnq, FUH fUH, double d, double d2, double d3) {
        super(qnq, fUH, d, d2, d3);
        this.method_16b621a_Dne(0.3125f, 0.3125f);
    }

    public YCH(Qnq qnq) {
        super(qnq);
        this.method_16b621a_Dne(0.3125f, 0.3125f);
    }

    public YCH(Qnq qnq, double d, double d2, double d3, double d4, double d5, double d6) {
        super(qnq, d, d2, d3, d4, d5, d6);
        this.method_16b621a_Dne(0.3125f, 0.3125f);
    }

    @Override
    protected void method_c1ff67d0_Dne(wHH wHH2) {
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ) {
            if (wHH2.field_37b45e5_Dne != null) {
                if (this.field_366ec33_Dne != null) {
                    if (wHH2.field_37b45e5_Dne.method_147b2066_Dne(zBn.method_267d8b79_Dne(this.field_366ec33_Dne), 8) && !wHH2.field_37b45e5_Dne.method_cd4cb3d9_udO()) {
                        this.field_366ec33_Dne.method_ce7f5da9_Dne(5);
                    }
                } else {
                    wHH2.field_37b45e5_Dne.method_147b2066_Dne(zBn.field_1c3fdb05_XHL, 5);
                }
                if (wHH2.field_37b45e5_Dne instanceof FUH) {
                    int n = 0;
                    if (this.field_36c4f18_Dne.field_2d29f4_aFZ > 1) {
                        if (this.field_36c4f18_Dne.field_2d29f4_aFZ == 2) {
                            n = 10;
                        } else if (this.field_36c4f18_Dne.field_2d29f4_aFZ == 3) {
                            n = 40;
                        }
                    }
                    if (n > 0) {
                        ((FUH)wHH2.field_37b45e5_Dne).method_fe8e2b7b_Qnq(new NAx(SXd.field_7578fe9a_EyB.field_2092ae_Dne, 20 * n, 1));
                    }
                }
            }
            this.field_36c4f18_Dne.method_4ff037c_Dne(this, this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb, 1.0f, false, this.field_36c4f18_Dne.method_230cbc5a_Dne().method_8f501fe8_Dne("mobGriefing"));
            this.method_5d73f9d_g_();
        }
    }
}

