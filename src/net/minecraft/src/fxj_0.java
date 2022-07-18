package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fxJ
 */
public class fxj_0
extends LHi {
    private long field_2092af_Dne;
    private double field_2092a9_Dne;
    private boolean field_36e4eb_vSL;
    private double field_212608_FWm;
    private double field_212c16_EyB;
    private boolean field_21261e_FWm;
    private hdK field_376997d_Dne;

    @Override
    protected void method_b0a28144_div() {
        this.field_36c4f18_Dne.field_365731d_Dne.method_8f501fe4_Dne("ai");
        if (this.field_2092ae_Dne > 0) {
            --this.field_2092ae_Dne;
        }
        this.field_2092bf_Dne = this.method_b6f3e1a2_haP();
        float f = 100.0f;
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
    public String method_eecad346_Dne() {
        return "\u00a7c\u00a7kERROR422\u00a7r";
    }

    @Override
    public boolean method_7ad38807_DyG() {
        return false;
    }

    @Override
    public int method_7a46288d_Dne() {
        return 50;
    }

    @Override
    protected void method_ce7f5266_Dne(float f) {
    }

    @Override
    public boolean method_147b2066_Dne(zBn zBn2, int n) {
        if (qxi_0.field_376997d_Dne == hdK.field_376997d_Dne) {
            return false;
        }
        if (this.method_7c861acb_EyB()) {
            return false;
        }
        if (this.field_36c4f18_Dne.field_2d2a05_aFZ) {
            return false;
        }
        this.field_295784_Wwe = 0;
        if (this.field_28e7fd_Vxn <= 0) {
            return false;
        }
        if (zBn2.method_a98a0664_aFZ() && this.method_857f23ec_Dne(SXd.field_a21d1515_kGO)) {
            return false;
        }
        if ((zBn2 == zBn.field_a22e7e2e_kGO || zBn2 == zBn.field_af0ef541_udO) && this.method_9e6e1a08_Dne(4) != null) {
            this.method_9e6e1a08_Dne(4).method_60f1bf3f_Dne(n * 4 + this.field_7331eae7_Dne.nextInt(n * 2), this);
            n = (int)((float)n * 0.75f);
        }
        this.field_351225_qrB = 1.5f;
        boolean bl = true;
        if ((float)this.field_2f0dd8_div > (float)this.field_2e5f1b_bzF / 2.0f) {
            if (n <= this.field_2eafc1_cot) {
                return false;
            }
            this.method_147b2062_Dne(zBn2, n - this.field_2eafc1_cot);
            this.field_2eafc1_cot = n;
            bl = false;
        } else {
            this.field_2eafc1_cot = n;
            this.field_2e8486_ceE = this.field_28e7fd_Vxn;
            this.field_2f0dd8_div = this.field_2e5f1b_bzF;
            this.method_147b2062_Dne(zBn2, n);
            this.field_3393dd_oIf = 10;
            this.field_2569d5_OdI = 10;
        }
        this.field_2f0273_eHV = 0.0f;
        sMa sMa2 = zBn2.method_f88b2463_FWm();
        if (sMa2 != null) {
            oEB oEB2;
            if (sMa2 instanceof FUH) {
                this.method_610df1e1_bzF((FUH)sMa2);
            }
            if (sMa2 instanceof FiG) {
                this.field_3649f9_tgc = 100;
                this.field_3673728_Dne = (FiG)sMa2;
            } else if (sMa2 instanceof oEB && (oEB2 = (oEB)sMa2).method_86921671_LVR()) {
                this.field_3649f9_tgc = 100;
                this.field_3673728_Dne = null;
            }
        }
        if (bl) {
            this.field_36c4f18_Dne.method_b43d849c_Dne(this, (byte)2);
            if (zBn2 != zBn.field_7141d10c_aFZ) {
                this.method_c19d9a09_oIf();
            }
            if (sMa2 != null) {
                double d = sMa2.field_2f0dd3_div - this.field_2f0dd3_div;
                double d2 = sMa2.field_334487_mrb - this.field_334487_mrb;
                while (d * d + d2 * d2 < 1.0E-4) {
                    d = (Math.random() - Math.random()) * 0.01;
                    d2 = (Math.random() - Math.random()) * 0.01;
                }
                this.field_2f0273_eHV = (float)(Math.atan2(d2, d) * 180.0 / Math.PI) - this.field_334489_mrb;
            } else {
                this.field_2f0273_eHV = (int)(Math.random() * 2.0) * 180;
            }
        }
        if (this.field_28e7fd_Vxn <= 0) {
            if (bl) {
                this.method_fbd4aee4_Dne(this.method_6a89a3dc_div(), this.method_b0a28134_div(), this.method_7ad387f3_DyG());
            }
            this.method_c6daaac1_Dne(zBn2);
        } else if (bl) {
            this.method_fbd4aee4_Dne(this.method_3c9d12fd_DyG(), this.method_b0a28134_div(), this.method_7ad387f3_DyG());
        }
        return true;
    }

    @Override
    protected void method_b43d93a0_Dne(sMa sMa2, float f) {
        if (qxi_0.field_376997d_Dne == hdK.field_376997d_Dne) {
            return;
        }
        if (this.field_26818f_RPx <= 0 && f < 2.0f && sMa2.field_373a3ed_Dne.field_2d29ef_aFZ > this.field_373a3ed_Dne.field_212608_FWm && sMa2.field_373a3ed_Dne.field_212608_FWm < this.field_373a3ed_Dne.field_2d29ef_aFZ) {
            this.field_26818f_RPx = 0;
            this.method_ad72a717_bzF(sMa2);
        }
    }

    @Override
    public boolean method_b0a28148_div() {
        return false;
    }

    @Override
    public void method_7a46289a_Dne() {
        int n;
        int n2;
        int n3;
        super.method_7a46289a_Dne();
        if (qxi_0.field_36b4fb5_Dne.field_2a9ae7_Zpi) {
            this.method_907a9d21_Qnq();
        } else {
            qxi_0.field_376997d_Dne = this.field_376997d_Dne;
        }
        if (qxi_0.field_376997d_Dne == null) {
            return;
        }
        if (!this.field_21261e_FWm) {
            this.field_2092a9_Dne = this.field_2f0dd3_div;
            this.field_212608_FWm = this.field_22c5fd_IjH + 1.0;
            this.field_212c16_EyB = this.field_334487_mrb;
            this.field_21261e_FWm = true;
        }
        switch (qxi_0.field_376997d_Dne) {
            case field_376997d_Dne: {
                this.field_291868_XHL = 0.0;
                this.field_2a9ad1_Zpi = 0.0;
                this.field_31b811_kGO = 0.0;
                if ((long)FqX.method_2300e59e_Dne().field_2092ae_Dne >= this.field_2092af_Dne) {
                    qxi_0.method_7c6f6039_FWm();
                }
                this.method_2961957_bzF(this.field_2092a9_Dne, this.field_212608_FWm, this.field_212c16_EyB);
                break;
            }
            case field_2030655c_FWm: {
                mKT cfr_ignored_0 = qxi_0.field_493682ed_Dne.field_3788296_Dne;
                if (!mKT.field_a378b605_Dne.playing("glitch422.ogg")) {
                    mKT cfr_ignored_1 = qxi_0.field_493682ed_Dne.field_3788296_Dne;
                    mKT.field_a378b605_Dne.quickPlay(false, null, "glitch422.ogg", false, (float)qxi_0.field_36b4fb5_Dne.field_2f0dd3_div, (float)qxi_0.field_36b4fb5_Dne.field_22c5fd_IjH, (float)qxi_0.field_36b4fb5_Dne.field_334487_mrb, 100, 0.0f);
                }
                if ((long)FqX.method_2300e59e_Dne().field_2092ae_Dne < this.field_2092af_Dne) break;
                this.method_907a9d21_Qnq();
            }
        }
        this.field_295781_Wwe = 0.3f;
        this.field_2f0c42_eJi = 0.15f;
        this.method_143f92d9_bzF(Float.MAX_VALUE);
        if (this.field_22c5fd_IjH < qxi_0.field_36b4fb5_Dne.field_22c5fd_IjH && qxi_0.field_376997d_Dne != hdK.field_376997d_Dne) {
            this.method_2961957_bzF(this.field_2f0dd3_div, this.field_22c5fd_IjH + 2.0, this.field_334487_mrb);
        }
        if (qxi_0.field_36c164d_Dne.method_2c2cf7bc_Dne(n3 = geR.method_117d0718_FWm(this.field_2f0dd3_div), (n2 = geR.method_117d0718_FWm(this.field_22c5fd_IjH)) - 1, n = geR.method_117d0718_FWm(this.field_334487_mrb)) == zKP.field_202dfeee_FWm.field_21260d_FWm || qxi_0.field_36c164d_Dne.method_2c2cf7bc_Dne(n3, n2, n) == zKP.field_14274117_div.field_21260d_FWm) {
            qxi_0.field_36c164d_Dne.method_2ee8c47d_FWm(n3, n2, n, zKP.field_374330f_Dne.field_21260d_FWm);
        }
        qxi_0.field_36c164d_Dne.method_2ee8c47d_FWm(n3, n2 + 1, n, 0);
        qxi_0.field_36c164d_Dne.method_2ee8c47d_FWm(n3, n2, n, 0);
    }

    public fxj_0(Qnq qnq) {
        super(qnq);
        this.field_c480ca78_bzF = "422.png";
        this.field_376997d_Dne = qxi_0.field_376997d_Dne;
        this.field_75c313d2_bzF = qxi_0.field_36b4fb5_Dne;
        qxi_0.field_2092ab_Dne = qxi_0.field_36b4fb5_Dne.field_334489_mrb;
        qxi_0.field_21260a_FWm = qxi_0.field_36b4fb5_Dne.field_29186a_XHL;
        qxi_0.field_493682ed_Dne.field_3758af7_Dne.field_2e5f2c_bzF = true;
        if (qxi_0.field_376997d_Dne == hdK.field_2030655c_FWm) {
            this.field_2092af_Dne = FqX.method_2300e59e_Dne().field_2092ae_Dne + Jcz.method_ce7f5d9c_Dne(1);
        } else if (qxi_0.field_376997d_Dne == hdK.field_376997d_Dne) {
            mKT cfr_ignored_0 = qxi_0.field_493682ed_Dne.field_3788296_Dne;
            mKT.field_a378b605_Dne.quickPlay(false, null, "glitch422.ogg", true, (float)qxi_0.field_36b4fb5_Dne.field_2f0dd3_div, (float)qxi_0.field_36b4fb5_Dne.field_22c5fd_IjH, (float)qxi_0.field_36b4fb5_Dne.field_334487_mrb, 100, 0.0f);
            this.field_2092af_Dne = (long)FqX.method_2300e59e_Dne().field_2092ae_Dne + 80L;
        }
    }

    @Override
    public void method_5d73f9d_g_() {
        if (this.field_28e7fd_Vxn <= 0) {
            this.field_2a9ae7_Zpi = true;
            if (!this.field_36e4eb_vSL) {
                qxi_0.field_376997d_Dne = null;
                for (Object e : qxi_0.field_dc9cb15_Dne) {
                    NMq nMq = e instanceof zKP ? new NMq((zKP)e, 1) : new NMq((dEr)e, 1);
                    qxi_0.field_36c164d_Dne.method_94d18be5_FWm(new JiM(qxi_0.field_36c164d_Dne, this.field_2f0dd3_div, this.field_22c5fd_IjH + 10.0, this.field_334487_mrb, nMq));
                }
            }
        }
    }

    @Override
    public int method_7c6f602c_FWm() {
        return 10;
    }

    @Override
    public int method_bb7dd813_Dne(sMa sMa2) {
        return 10;
    }

    public void method_907a9d21_Qnq() {
        qxi_0.field_376997d_Dne = null;
        qxi_0.field_493682ed_Dne.field_3758af7_Dne.field_2e5f2c_bzF = false;
        this.field_36e4eb_vSL = true;
        this.field_28e7fd_Vxn = 0;
        qxi_0.field_36c164d_Dne.method_ad72a713_bzF(this);
        if (sRv.field_2092bf_Dne) {
            qxi_0.field_36b4fb5_Dne.method_47a073d1_bzF("ERR422 is disappeared.");
        }
    }

    @Override
    public boolean method_d44b4596_zGp() {
        return false;
    }

    @Override
    protected sMa method_2314d444_Dne() {
        FiG fiG = this.field_36c4f18_Dne.method_c32e43ea_FWm(this, 100.0);
        return fiG != null && this.method_3e501ffd_Qnq(fiG) ? fiG : null;
    }
}

