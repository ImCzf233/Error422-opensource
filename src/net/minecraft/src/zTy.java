package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class zTy
extends LHi {
    private int field_21260d_FWm;

    @Override
    protected void method_b0a28144_div() {
        super.method_b0a28144_div();
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ) {
            int n;
            int n2;
            int n3;
            int n4;
            int n5;
            if (this.field_21260d_FWm > 0) {
                --this.field_21260d_FWm;
                if (this.field_21260d_FWm == 0) {
                    n5 = geR.method_117d0718_FWm(this.field_2f0dd3_div);
                    n4 = geR.method_117d0718_FWm(this.field_22c5fd_IjH);
                    n3 = geR.method_117d0718_FWm(this.field_334487_mrb);
                    n2 = 0;
                    n = 0;
                    while (n2 == 0 && n <= 5 && n >= -5) {
                        int n6 = 0;
                        while (n2 == 0 && n6 <= 10 && n6 >= -10) {
                            int n7 = 0;
                            while (n2 == 0 && n7 <= 10 && n7 >= -10) {
                                int n8 = this.field_36c4f18_Dne.method_2c2cf7bc_Dne(n5 + n6, n4 + n, n3 + n7);
                                if (n8 == zKP.field_fc460963_tIz.field_21260d_FWm) {
                                    this.field_36c4f18_Dne.method_5972b42f_Dne(n5 + n6, n4 + n, n3 + n7, false);
                                    zKP.field_fc460963_tIz.method_35fd2546_bzF(this.field_36c4f18_Dne, n5 + n6, n4 + n, n3 + n7, 0);
                                    if (this.field_7331eae7_Dne.nextBoolean()) {
                                        n2 = 1;
                                        break;
                                    }
                                }
                                n7 = n7 <= 0 ? 1 - n7 : 0 - n7;
                            }
                            n6 = n6 <= 0 ? 1 - n6 : 0 - n6;
                        }
                        n = n <= 0 ? 1 - n : 0 - n;
                    }
                }
            }
            if (this.field_75c313d2_bzF == null && !this.method_c738b198_qrB()) {
                n5 = geR.method_117d0718_FWm(this.field_2f0dd3_div);
                n4 = geR.method_117d0718_FWm(this.field_22c5fd_IjH + 0.5);
                n3 = geR.method_117d0718_FWm(this.field_334487_mrb);
                n2 = this.field_7331eae7_Dne.nextInt(6);
                n = this.field_36c4f18_Dne.method_2c2cf7bc_Dne(n5 + rrP.field_4039e0a_FWm[n2], n4 + rrP.field_59d86bc_bzF[n2], n3 + rrP.field_4a92422_Qnq[n2]);
                if (Xmg.method_ce7f5dad_Dne(n)) {
                    this.field_36c4f18_Dne.method_17d7ea9d_FWm(n5 + rrP.field_4039e0a_FWm[n2], n4 + rrP.field_59d86bc_bzF[n2], n3 + rrP.field_4a92422_Qnq[n2], zKP.field_fc460963_tIz.field_21260d_FWm, Xmg.method_143f9e0f_bzF(n), 3);
                    this.method_9b310ff0_Wwe();
                    this.method_5d73f9d_g_();
                } else {
                    this.method_d44b4592_zGp();
                }
            } else if (this.field_75c313d2_bzF != null && !this.method_c738b198_qrB()) {
                this.field_75c313d2_bzF = null;
            }
        }
    }

    @Override
    public void method_7a46289a_Dne() {
        this.field_22c5ff_IjH = this.field_334489_mrb;
        super.method_7a46289a_Dne();
    }

    @Override
    protected boolean method_7c6f603d_FWm() {
        return false;
    }

    @Override
    public int method_bb7dd813_Dne(sMa sMa2) {
        return 1;
    }

    @Override
    public boolean method_147b2066_Dne(zBn zBn2, int n) {
        if (this.method_7c861acb_EyB()) {
            return false;
        }
        if (this.field_21260d_FWm <= 0 && (zBn2 instanceof Kgw || zBn2 == zBn.field_1c3fdb05_XHL)) {
            this.field_21260d_FWm = 20;
        }
        return super.method_147b2066_Dne(zBn2, n);
    }

    @Override
    protected String method_3c9d12fd_DyG() {
        return "mob.silverfish.hit";
    }

    @Override
    protected int method_baa393f5_kGO() {
        return 0;
    }

    public zTy(Qnq qnq) {
        super(qnq);
        this.field_c480ca78_bzF = "/mob/silverfish.png";
        this.method_16b621a_Dne(0.3f, 0.7f);
        this.field_2e1df2_cHy = 0.6f;
    }

    @Override
    protected String method_6a89a3dc_div() {
        return "mob.silverfish.kill";
    }

    @Override
    protected String method_a174454e_zGp() {
        return "mob.silverfish.say";
    }

    @Override
    public float method_2c2cf7b9_Dne(int n, int n2, int n3) {
        return this.field_36c4f18_Dne.method_2c2cf7bc_Dne(n, n2 - 1, n3) == zKP.field_37e6aed_Dne.field_21260d_FWm ? 10.0f : super.method_2c2cf7b9_Dne(n, n2, n3);
    }

    @Override
    protected void method_5972745a_Dne(int n, int n2, int n3, int n4) {
        this.method_fbd4aee4_Dne("mob.silverfish.step", 0.15f, 1.0f);
    }

    @Override
    protected sMa method_2314d444_Dne() {
        double d = 8.0;
        return this.field_36c4f18_Dne.method_c32e43ea_FWm(this, d);
    }

    @Override
    public aYc method_230cd2e0_Dne() {
        return aYc.field_75bb126e_bzF;
    }

    @Override
    protected boolean method_80692b1e_ICU() {
        return true;
    }

    @Override
    public int method_7a46288d_Dne() {
        return 8;
    }

    @Override
    protected void method_b43d93a0_Dne(sMa sMa2, float f) {
        if (this.field_26818f_RPx <= 0 && f < 1.2f && sMa2.field_373a3ed_Dne.field_2d29ef_aFZ > this.field_373a3ed_Dne.field_212608_FWm && sMa2.field_373a3ed_Dne.field_212608_FWm < this.field_373a3ed_Dne.field_2d29ef_aFZ) {
            this.field_26818f_RPx = 20;
            this.method_ad72a717_bzF(sMa2);
        }
    }

    @Override
    public boolean method_af414cf1_cot() {
        if (super.method_af414cf1_cot()) {
            FiG fiG = this.field_36c4f18_Dne.method_3d2c70b_Dne(this, 5.0);
            return fiG == null;
        }
        return false;
    }
}

