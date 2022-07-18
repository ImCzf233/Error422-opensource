package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class JiM
extends sMa {
    private int field_2e5f1b_bzF = 5;
    public int field_2092ae_Dne = 0;
    public int field_21260d_FWm;
    public float field_2092ab_Dne = (float)(Math.random() * Math.PI * 2.0);

    public JiM(Qnq qnq, double d, double d2, double d3) {
        super(qnq);
        this.method_16b621a_Dne(0.25f, 0.25f);
        this.field_36b0a6_udO = this.field_367151_trS / 2.0f;
        this.method_2961957_bzF(d, d2, d3);
        this.field_334489_mrb = (float)(Math.random() * 360.0);
        this.field_291868_XHL = (float)(Math.random() * (double)0.2f - (double)0.1f);
        this.field_2a9ad1_Zpi = 0.2f;
        this.field_31b811_kGO = (float)(Math.random() * (double)0.2f - (double)0.1f);
    }

    @Override
    public String method_eecad346_Dne() {
        return KGL.method_39193c_Dne("item." + this.method_23040479_Dne().method_eecad346_Dne());
    }

    private void method_907a9d21_Qnq() {
        for (JiM jiM : this.field_36c4f18_Dne.method_9314b7e8_Dne(JiM.class, this.field_373a3ed_Dne.method_b78565d7_FWm(0.5, 0.0, 0.5))) {
            this.method_7708a15d_Dne(jiM);
        }
    }

    public boolean method_7708a15d_Dne(JiM jiM) {
        if (jiM == this) {
            return false;
        }
        if (jiM.method_cd4cb3d9_udO() && this.method_cd4cb3d9_udO()) {
            NMq nMq = this.method_23040479_Dne();
            NMq nMq2 = jiM.method_23040479_Dne();
            if (nMq2.method_230de6ba_Dne() != nMq.method_230de6ba_Dne()) {
                return false;
            }
            if (nMq2.method_a98a0664_aFZ() ^ nMq.method_a98a0664_aFZ()) {
                return false;
            }
            if (nMq2.method_a98a0664_aFZ() && !nMq2.method_230886fb_Dne().equals(nMq.method_230886fb_Dne())) {
                return false;
            }
            if (nMq2.method_230de6ba_Dne().method_d44b4596_zGp() && nMq2.method_907a9d14_Qnq() != nMq.method_907a9d14_Qnq()) {
                return false;
            }
            if (nMq2.field_2092ae_Dne < nMq.field_2092ae_Dne) {
                return jiM.method_7708a15d_Dne(this);
            }
            if (nMq2.field_2092ae_Dne + nMq.field_2092ae_Dne > nMq2.method_7c6f602c_FWm()) {
                return false;
            }
            nMq2.field_2092ae_Dne += nMq.field_2092ae_Dne;
            jiM.field_21260d_FWm = Math.max(jiM.field_21260d_FWm, this.field_21260d_FWm);
            jiM.field_2092ae_Dne = Math.min(jiM.field_2092ae_Dne, this.field_2092ae_Dne);
            jiM.method_7c61cf15_Dne(nMq2);
            this.method_5d73f9d_g_();
            return true;
        }
        return false;
    }

    public JiM(Qnq qnq) {
        super(qnq);
        this.method_16b621a_Dne(0.25f, 0.25f);
        this.field_36b0a6_udO = this.field_367151_trS / 2.0f;
    }

    @Override
    public void method_7a46289a_Dne() {
        boolean bl;
        super.method_7a46289a_Dne();
        if (this.field_21260d_FWm > 0) {
            --this.field_21260d_FWm;
        }
        this.field_2d29ef_aFZ = this.field_2f0dd3_div;
        this.field_388da1_zGp = this.field_22c5fd_IjH;
        this.field_20b852_DyG = this.field_334487_mrb;
        this.field_2a9ad1_Zpi -= (double)0.04f;
        this.field_31b827_kGO = this.method_2be429a8_Dne(this.field_2f0dd3_div, (this.field_373a3ed_Dne.field_212608_FWm + this.field_373a3ed_Dne.field_2d29ef_aFZ) / 2.0, this.field_334487_mrb);
        this.method_2be429a4_Dne(this.field_291868_XHL, this.field_2a9ad1_Zpi, this.field_31b811_kGO);
        boolean bl2 = bl = (int)this.field_2d29ef_aFZ != (int)this.field_2f0dd3_div || (int)this.field_388da1_zGp != (int)this.field_22c5fd_IjH || (int)this.field_20b852_DyG != (int)this.field_334487_mrb;
        if (bl || this.field_388da6_zGp % 25 == 0) {
            if (this.field_36c4f18_Dne.method_d9802b31_Dne(geR.method_117d0718_FWm(this.field_2f0dd3_div), geR.method_117d0718_FWm(this.field_22c5fd_IjH), geR.method_117d0718_FWm(this.field_334487_mrb)) == KFd.field_5b96677_IjH) {
                this.field_2a9ad1_Zpi = 0.2f;
                this.field_291868_XHL = (this.field_7331eae7_Dne.nextFloat() - this.field_7331eae7_Dne.nextFloat()) * 0.2f;
                this.field_31b811_kGO = (this.field_7331eae7_Dne.nextFloat() - this.field_7331eae7_Dne.nextFloat()) * 0.2f;
                this.method_fbd4aee4_Dne("random.fizz", 0.4f, 2.0f + this.field_7331eae7_Dne.nextFloat() * 0.4f);
            }
            if (!this.field_36c4f18_Dne.field_2d2a05_aFZ) {
                this.method_907a9d21_Qnq();
            }
        }
        float f = 0.98f;
        if (this.field_2d2a05_aFZ) {
            f = 0.58800006f;
            int n = this.field_36c4f18_Dne.method_2c2cf7bc_Dne(geR.method_117d0718_FWm(this.field_2f0dd3_div), geR.method_117d0718_FWm(this.field_373a3ed_Dne.field_212608_FWm) - 1, geR.method_117d0718_FWm(this.field_334487_mrb));
            if (n > 0) {
                f = zKP.field_8374b848_Dne[n].field_267cf2_Qnq * 0.98f;
            }
        }
        this.field_291868_XHL *= (double)f;
        this.field_2a9ad1_Zpi *= (double)0.98f;
        this.field_31b811_kGO *= (double)f;
        if (this.field_2d2a05_aFZ) {
            this.field_2a9ad1_Zpi *= -0.5;
        }
        ++this.field_2092ae_Dne;
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ && this.field_2092ae_Dne >= 6000) {
            this.method_5d73f9d_g_();
        }
    }

    @Override
    protected void method_7c6f6039_FWm() {
        this.method_23123967_Dne().method_16cca7a_Dne(10, 5);
    }

    @Override
    protected boolean method_7c6f603d_FWm() {
        return false;
    }

    @Override
    public void method_21db0c6_a_(FiG fiG) {
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ) {
            NMq nMq = this.method_23040479_Dne();
            int n = nMq.field_2092ae_Dne;
            if (this.field_21260d_FWm == 0 && fiG.field_36a059b_Dne.method_7c61cf19_Dne(nMq)) {
                if (nMq.field_2e5f1b_bzF == zKP.field_af0f1368_udO.field_21260d_FWm) {
                    fiG.method_831230fe_Dne(qlg.field_201eee94_FWm);
                }
                if (nMq.field_2e5f1b_bzF == dEr.field_443297f2_LoG.field_267cf5_Qnq) {
                    fiG.method_831230fe_Dne(qlg.field_ab1de76b_ooe);
                }
                if (nMq.field_2e5f1b_bzF == dEr.field_141d2e85_div.field_267cf5_Qnq) {
                    fiG.method_831230fe_Dne(qlg.field_35c4839e_ATE);
                }
                if (nMq.field_2e5f1b_bzF == dEr.field_d1baeb7c_TpV.field_267cf5_Qnq) {
                    fiG.method_831230fe_Dne(qlg.field_75713da2_EyB);
                }
                this.method_fbd4aee4_Dne("random.pop", 0.2f, ((this.field_7331eae7_Dne.nextFloat() - this.field_7331eae7_Dne.nextFloat()) * 0.7f + 1.0f) * 2.0f);
                fiG.method_b43d9ee3_Dne(this, n);
                if (nMq.field_2092ae_Dne <= 0) {
                    this.method_5d73f9d_g_();
                }
            }
        }
    }

    public void method_7c61cf15_Dne(NMq nMq) {
        this.method_23123967_Dne().method_62ca2346_FWm(10, nMq);
        this.method_23123967_Dne().method_ce7f5da9_Dne(10);
    }

    public JiM(Qnq qnq, double d, double d2, double d3, NMq nMq) {
        this(qnq, d, d2, d3);
        this.method_7c61cf15_Dne(nMq);
    }

    @Override
    public void method_8d4fb917_Dne(WkD wkD) {
        wkD.method_5ab47529_Dne("Health", (byte)this.field_2e5f1b_bzF);
        wkD.method_5ab47529_Dne("Age", (short)this.field_2092ae_Dne);
        if (this.method_23040479_Dne() != null) {
            wkD.method_312ec00d_Dne("Item", this.method_23040479_Dne().method_7dab90f8_Dne(new WkD()));
        }
    }

    @Override
    protected void method_b51ddfb1_zGp(int n) {
        this.method_147b2066_Dne(zBn.field_37e4cc6_Dne, n);
    }

    public void method_ae128dc7_bzF() {
        this.field_2092ae_Dne = 4800;
    }

    public NMq method_23040479_Dne() {
        NMq nMq = this.method_23123967_Dne().method_9e6e1a08_Dne(10);
        if (nMq == null) {
            if (this.field_36c4f18_Dne != null) {
                this.field_36c4f18_Dne.method_230e0120_Dne().method_47a073d1_bzF("Item entity " + this.field_2d29f4_aFZ + " has no item?!");
            }
            return new NMq(zKP.field_37e6aed_Dne);
        }
        return nMq;
    }

    @Override
    public boolean method_147b2066_Dne(zBn zBn2, int n) {
        if (this.method_7c861acb_EyB()) {
            return false;
        }
        if (this.method_23040479_Dne() != null && this.method_23040479_Dne().field_2e5f1b_bzF == dEr.field_94628c49_jsv.field_267cf5_Qnq && zBn2.method_7c6f603d_FWm()) {
            return false;
        }
        this.method_c19d9a09_oIf();
        this.field_2e5f1b_bzF -= n;
        if (this.field_2e5f1b_bzF <= 0) {
            this.method_5d73f9d_g_();
        }
        return false;
    }

    @Override
    public boolean method_d44b4596_zGp() {
        return this.field_36c4f18_Dne.method_ff46456e_Dne(this.field_373a3ed_Dne, KFd.field_1411d34d_div, this);
    }

    @Override
    public boolean method_ae128dcb_bzF() {
        return false;
    }

    @Override
    public void method_7ed97a02_Qnq(int n) {
        super.method_7ed97a02_Qnq(n);
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ) {
            this.method_907a9d21_Qnq();
        }
    }

    @Override
    public void method_66a36cd8_FWm(WkD wkD) {
        this.field_2e5f1b_bzF = wkD.method_8f501fe1_Dne("Health") & 0xFF;
        this.field_2092ae_Dne = wkD.method_8f501fe1_Dne("Age");
        WkD wkD2 = wkD.method_2851c945_Dne("Item");
        this.method_7c61cf15_Dne(NMq.method_7da70e76_Dne(wkD2));
        if (this.method_23040479_Dne() == null) {
            this.method_5d73f9d_g_();
        }
    }
}

