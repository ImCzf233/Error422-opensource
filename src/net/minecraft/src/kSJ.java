package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public abstract class kSJ
extends FUH {
    protected int field_2092ae_Dne = 0;
    protected sMa field_75c313d2_bzF;
    protected wdG field_37d6a92_Dne;
    protected boolean field_2092bf_Dne = false;

    @Override
    public boolean method_af414cf1_cot() {
        int n = geR.method_117d0718_FWm(this.field_2f0dd3_div);
        int n2 = geR.method_117d0718_FWm(this.field_373a3ed_Dne.field_212608_FWm);
        int n3 = geR.method_117d0718_FWm(this.field_334487_mrb);
        return super.method_af414cf1_cot() && this.method_2c2cf7b9_Dne(n, n2, n3) >= 0.0f;
    }

    public boolean method_c738b198_qrB() {
        return this.field_37d6a92_Dne != null;
    }

    public sMa method_f88b2463_FWm() {
        return this.field_75c313d2_bzF;
    }

    public void method_c389858d_Dne(wdG wdG2) {
        this.field_37d6a92_Dne = wdG2;
    }

    public kSJ(Qnq qnq) {
        super(qnq);
    }

    protected void method_b43d93a0_Dne(sMa sMa2, float f) {
    }

    public float method_2c2cf7b9_Dne(int n, int n2, int n3) {
        return 0.0f;
    }

    protected void method_d44b4592_zGp() {
        this.field_36c4f18_Dne.field_365731d_Dne.method_8f501fe4_Dne("stroll");
        boolean bl = false;
        int n = -1;
        int n2 = -1;
        int n3 = -1;
        float f = -99999.0f;
        for (int i = 0; i < 10; ++i) {
            int n4;
            int n5;
            int n6 = geR.method_117d0718_FWm(this.field_2f0dd3_div + (double)this.field_7331eae7_Dne.nextInt(13) - 6.0);
            float f2 = this.method_2c2cf7b9_Dne(n6, n5 = geR.method_117d0718_FWm(this.field_22c5fd_IjH + (double)this.field_7331eae7_Dne.nextInt(7) - 3.0), n4 = geR.method_117d0718_FWm(this.field_334487_mrb + (double)this.field_7331eae7_Dne.nextInt(13) - 6.0));
            if (!(f2 > f)) continue;
            f = f2;
            n = n6;
            n2 = n5;
            n3 = n4;
            bl = true;
        }
        if (bl) {
            this.field_37d6a92_Dne = this.field_36c4f18_Dne.method_37763af4_Dne(this, n, n2, n3, 10.0f, true, false, false, true);
        }
        this.field_36c4f18_Dne.field_365731d_Dne.method_7c6f6039_FWm();
    }

    protected sMa method_2314d444_Dne() {
        return null;
    }

    @Override
    protected void method_b0a28144_div() {
        this.field_36c4f18_Dne.field_365731d_Dne.method_8f501fe4_Dne("ai");
        if (this.field_2092ae_Dne > 0) {
            --this.field_2092ae_Dne;
        }
        this.field_2092bf_Dne = this.method_b6f3e1a2_haP();
        float f = 16.0f;
        if (this.field_75c313d2_bzF == null) {
            this.field_75c313d2_bzF = this.method_2314d444_Dne();
            if (this.field_75c313d2_bzF != null) {
                this.field_37d6a92_Dne = this.field_36c4f18_Dne.method_f4cb42fd_Dne(this, this.field_75c313d2_bzF, f, true, false, false, true);
            }
        } else if (this.field_75c313d2_bzF.method_cd4cb3d9_udO()) {
            float f2 = this.field_75c313d2_bzF.method_bb7dd810_Dne(this);
            if (this.method_3e501ffd_Qnq(this.field_75c313d2_bzF)) {
                this.method_b43d93a0_Dne(this.field_75c313d2_bzF, f2);
            }
        } else {
            this.field_75c313d2_bzF = null;
        }
        this.field_36c4f18_Dne.field_365731d_Dne.method_7c6f6039_FWm();
        if (!(this.field_2092bf_Dne || this.field_75c313d2_bzF == null || this.field_37d6a92_Dne != null && this.field_7331eae7_Dne.nextInt(20) != 0)) {
            this.field_37d6a92_Dne = this.field_36c4f18_Dne.method_f4cb42fd_Dne(this, this.field_75c313d2_bzF, f, true, false, false, true);
        } else if (!this.field_2092bf_Dne && (this.field_37d6a92_Dne == null && this.field_7331eae7_Dne.nextInt(180) == 0 || this.field_7331eae7_Dne.nextInt(120) == 0 || this.field_2092ae_Dne > 0) && this.field_295784_Wwe < 100) {
            this.method_d44b4592_zGp();
        }
        int n = geR.method_117d0718_FWm(this.field_373a3ed_Dne.field_212608_FWm + 0.5);
        boolean bl = this.method_9feec6c6_Zpi();
        boolean bl2 = this.method_7ad38807_DyG();
        this.field_29186a_XHL = 0.0f;
        if (this.field_37d6a92_Dne != null && this.field_7331eae7_Dne.nextInt(100) != 0) {
            this.field_36c4f18_Dne.field_365731d_Dne.method_8f501fe4_Dne("followpath");
            chN chN2 = this.field_37d6a92_Dne.method_9a366de8_Dne(this);
            double d = this.field_342261_ooe * 2.0f;
            while (chN2 != null && chN2.method_2be42992_Dne(this.field_2f0dd3_div, chN2.field_212608_FWm, this.field_334487_mrb) < d * d) {
                this.field_37d6a92_Dne.method_7a46289a_Dne();
                if (this.field_37d6a92_Dne.method_7a46289e_Dne()) {
                    chN2 = null;
                    this.field_37d6a92_Dne = null;
                    continue;
                }
                chN2 = this.field_37d6a92_Dne.method_9a366de8_Dne(this);
            }
            this.field_3393ee_oIf = false;
            if (chN2 != null) {
                double d2 = chN2.field_2092a9_Dne - this.field_2f0dd3_div;
                double d3 = chN2.field_2e5f16_bzF - this.field_334487_mrb;
                double d4 = chN2.field_212608_FWm - (double)n;
                float f3 = (float)(Math.atan2(d3, d2) * 180.0 / Math.PI) - 90.0f;
                float f4 = geR.method_87b72d50_aFZ(f3 - this.field_334489_mrb);
                this.field_212b3f_FYZ = this.field_2e1df2_cHy;
                if (f4 > 30.0f) {
                    f4 = 30.0f;
                }
                if (f4 < -30.0f) {
                    f4 = -30.0f;
                }
                this.field_334489_mrb += f4;
                if (this.field_2092bf_Dne && this.field_75c313d2_bzF != null) {
                    double d5 = this.field_75c313d2_bzF.field_2f0dd3_div - this.field_2f0dd3_div;
                    double d6 = this.field_75c313d2_bzF.field_334487_mrb - this.field_334487_mrb;
                    float f5 = this.field_334489_mrb;
                    this.field_334489_mrb = (float)(Math.atan2(d6, d5) * 180.0 / Math.PI) - 90.0f;
                    f4 = (f5 - this.field_334489_mrb + 90.0f) * (float)Math.PI / 180.0f;
                    this.field_2a70af_ZfC = -geR.method_ce7f5256_Dne(f4) * this.field_212b3f_FYZ * 1.0f;
                    this.field_212b3f_FYZ = geR.method_117d0e97_FWm(f4) * this.field_212b3f_FYZ * 1.0f;
                }
                if (d4 > 0.0) {
                    this.field_3393ee_oIf = true;
                }
            }
            if (this.field_75c313d2_bzF != null) {
                this.method_d3754820_Dne(this.field_75c313d2_bzF, 30.0f, 30.0f);
            }
            if (this.field_388db7_zGp && !this.method_c738b198_qrB()) {
                this.field_3393ee_oIf = true;
            }
            if (this.field_7331eae7_Dne.nextFloat() < 0.8f && (bl || bl2)) {
                this.field_3393ee_oIf = true;
            }
            this.field_36c4f18_Dne.field_365731d_Dne.method_7c6f6039_FWm();
        } else {
            super.method_b0a28144_div();
            this.field_37d6a92_Dne = null;
        }
    }

    @Override
    public float method_c073dae8_mrb() {
        float f = super.method_c073dae8_mrb();
        if (this.field_2092ae_Dne > 0 && !this.method_cbcb3929_tgc()) {
            f *= 2.0f;
        }
        return f;
    }

    public void method_bb7dd820_Dne(sMa sMa2) {
        this.field_75c313d2_bzF = sMa2;
    }

    protected boolean method_b6f3e1a2_haP() {
        return false;
    }
}

