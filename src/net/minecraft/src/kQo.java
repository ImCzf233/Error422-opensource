package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class kQo
extends BRM {
    private cnh field_3747caf_Dne;

    @Override
    public void method_8d4fb917_Dne(WkD wkD) {
        super.method_8d4fb917_Dne(wkD);
        wkD.method_5ab44f9f_Dne("CatType", this.method_c5287a51_qLR());
    }

    @Override
    public boolean method_ad72a717_bzF(sMa sMa2) {
        return sMa2.method_147b2066_Dne(zBn.method_267d8b79_Dne(this), 3);
    }

    @Override
    public boolean method_21db0ca_a_(FiG fiG) {
        NMq nMq = fiG.field_36a059b_Dne.method_23040479_Dne();
        if (this.method_86921671_LVR()) {
            if (fiG.field_bc57ecbf_aFZ.equalsIgnoreCase(this.method_d1f1ed87_FWm()) && !this.field_36c4f18_Dne.field_2d2a05_aFZ && !this.method_7c61cf19_Dne(nMq)) {
                this.field_3678e96_Dne.method_ce7f9d7a_Dne(!this.method_80692b1e_ICU());
            }
        } else if (this.field_3747caf_Dne.method_ae128dcb_bzF() && nMq != null && nMq.field_2e5f1b_bzF == dEr.field_a76dd0d0_Zlx.field_267cf5_Qnq && fiG.method_bb7dd80e_Dne(this) < 9.0) {
            if (!fiG.field_37cb681_Dne.field_267d06_Qnq) {
                --nMq.field_2092ae_Dne;
            }
            if (nMq.field_2092ae_Dne <= 0) {
                fiG.field_36a059b_Dne.method_6e3a6b66_Dne(fiG.field_36a059b_Dne.field_2092ae_Dne, null);
            }
            if (!this.field_36c4f18_Dne.field_2d2a05_aFZ) {
                if (this.field_7331eae7_Dne.nextInt(3) == 0) {
                    this.method_4e0836dc_mrb(true);
                    this.method_99cf5f41_kGO(1 + this.field_36c4f18_Dne.field_7331eae7_Dne.nextInt(3));
                    this.method_8f501fe4_Dne(fiG.field_bc57ecbf_aFZ);
                    this.method_ce92b9a6_IjH(true);
                    this.field_3678e96_Dne.method_ce7f9d7a_Dne(true);
                    this.field_36c4f18_Dne.method_b43d849c_Dne(this, (byte)7);
                } else {
                    this.method_ce92b9a6_IjH(false);
                    this.field_36c4f18_Dne.method_b43d849c_Dne(this, (byte)6);
                }
            }
            return true;
        }
        return super.method_21db0ca_a_(fiG);
    }

    @Override
    public boolean method_cbcb3929_tgc() {
        return true;
    }

    @Override
    protected float method_b0a28134_div() {
        return 0.4f;
    }

    @Override
    protected int method_baa393f5_kGO() {
        return dEr.field_443297f2_LoG.field_267cf5_Qnq;
    }

    @Override
    public void method_80692b1a_ICU() {
        if (this.field_36c4f18_Dne.field_7331eae7_Dne.nextInt(7) == 0) {
            for (int i = 0; i < 2; ++i) {
                kQo kQo2 = new kQo(this.field_36c4f18_Dne);
                kQo2.method_9ce0fc65_FWm(this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb, this.field_334489_mrb, 0.0f);
                kQo2.method_117d19ea_FWm(-24000);
                this.field_36c4f18_Dne.method_94d18be5_FWm(kQo2);
            }
        }
    }

    public kQo method_cb1163c0_Dne(Azh azh) {
        kQo kQo2 = new kQo(this.field_36c4f18_Dne);
        if (this.method_86921671_LVR()) {
            kQo2.method_8f501fe4_Dne(this.method_d1f1ed87_FWm());
            kQo2.method_4e0836dc_mrb(true);
            kQo2.method_99cf5f41_kGO(this.method_c5287a51_qLR());
        }
        return kQo2;
    }

    @Override
    protected void method_ce7f5266_Dne(float f) {
    }

    @Override
    protected String method_3c9d12fd_DyG() {
        return "mob.cat.hitt";
    }

    public kQo(Qnq qnq) {
        super(qnq);
        this.field_c480ca78_bzF = "/mob/ozelot.png";
        this.method_16b621a_Dne(0.6f, 0.8f);
        this.method_23028a4c_Dne().method_ce7f9d7a_Dne(true);
        this.field_36ae2b9_Dne.method_9212764c_Dne(1, new Cyb(this));
        this.field_36ae2b9_Dne.method_9212764c_Dne(2, this.field_3678e96_Dne);
        this.field_3747caf_Dne = new cnh(this, 0.18f, dEr.field_a76dd0d0_Zlx.field_267cf5_Qnq, true);
        this.field_36ae2b9_Dne.method_9212764c_Dne(3, this.field_3747caf_Dne);
        this.field_36ae2b9_Dne.method_9212764c_Dne(4, new RlP(this, FiG.class, 16.0f, 0.23f, 0.4f));
        this.field_36ae2b9_Dne.method_9212764c_Dne(5, new ReV(this, 0.3f, 10.0f, 5.0f));
        this.field_36ae2b9_Dne.method_9212764c_Dne(6, new VQx(this, 0.4f));
        this.field_36ae2b9_Dne.method_9212764c_Dne(7, new NQg(this, 0.3f));
        this.field_36ae2b9_Dne.method_9212764c_Dne(8, new vAj(this));
        this.field_36ae2b9_Dne.method_9212764c_Dne(9, new znX(this, 0.23f));
        this.field_36ae2b9_Dne.method_9212764c_Dne(10, new IBw(this, 0.23f));
        this.field_36ae2b9_Dne.method_9212764c_Dne(11, new yws(this, FiG.class, 10.0f));
        this.field_2024ae98_FWm.method_9212764c_Dne(1, new zIt(this, GRq.class, 14.0f, 750, false));
    }

    @Override
    public boolean method_748d96f2_Dne(HzK hzK) {
        if (hzK == this) {
            return false;
        }
        if (!this.method_86921671_LVR()) {
            return false;
        }
        if (!(hzK instanceof kQo)) {
            return false;
        }
        kQo kQo2 = (kQo)hzK;
        return !kQo2.method_86921671_LVR() ? false : this.method_9f5095a2_ZfC() && kQo2.method_9f5095a2_ZfC();
    }

    @Override
    public void method_c011aad0_mlD() {
        if (this.method_230e1aeb_Dne().method_7a46289e_Dne()) {
            float f = this.method_230e1aeb_Dne().method_7a46288a_Dne();
            if (f == 0.18f) {
                this.method_143fdded_bzF(true);
                this.method_aad4531d_a_(false);
            } else if (f == 0.4f) {
                this.method_143fdded_bzF(false);
                this.method_aad4531d_a_(true);
            } else {
                this.method_143fdded_bzF(false);
                this.method_aad4531d_a_(false);
            }
        } else {
            this.method_143fdded_bzF(false);
            this.method_aad4531d_a_(false);
        }
    }

    @Override
    public int method_7a46288d_Dne() {
        return 10;
    }

    @Override
    protected String method_a174454e_zGp() {
        return this.method_86921671_LVR() ? (this.method_9f5095a2_ZfC() ? "mob.cat.purr" : (this.field_7331eae7_Dne.nextInt(4) == 0 ? "mob.cat.purreow" : "mob.cat.meow")) : "";
    }

    @Override
    public boolean method_147b2066_Dne(zBn zBn2, int n) {
        if (this.method_7c861acb_EyB()) {
            return false;
        }
        this.field_3678e96_Dne.method_ce7f9d7a_Dne(false);
        return super.method_147b2066_Dne(zBn2, n);
    }

    @Override
    public boolean method_7c61cf19_Dne(NMq nMq) {
        return nMq != null && nMq.field_2e5f1b_bzF == dEr.field_a76dd0d0_Zlx.field_267cf5_Qnq;
    }

    @Override
    public Azh method_cafee53a_Dne(Azh azh) {
        return this.method_cb1163c0_Dne(azh);
    }

    @Override
    public void method_66a36cd8_FWm(WkD wkD) {
        super.method_66a36cd8_FWm(wkD);
        this.method_99cf5f41_kGO(wkD.method_8f501fd7_Dne("CatType"));
    }

    @Override
    protected void method_7c6f6039_FWm() {
        super.method_7c6f6039_FWm();
        this.field_378ab08_Dne.method_ad009545_Dne(18, (byte)0);
    }

    @Override
    public String method_eecad346_Dne() {
        return this.method_9f65f313_ZgS() ? this.method_da581772_IjH() : (this.method_86921671_LVR() ? "entity.Cat.name" : super.method_eecad346_Dne());
    }

    @Override
    public String method_6859cdb9_bzF() {
        switch (this.method_c5287a51_qLR()) {
            case 0: {
                return "/mob/ozelot.png";
            }
            case 1: {
                return "/mob/cat_black.png";
            }
            case 2: {
                return "/mob/cat_red.png";
            }
            case 3: {
                return "/mob/cat_siamese.png";
            }
        }
        return super.method_6859cdb9_bzF();
    }

    @Override
    protected void method_17484c9_Dne(boolean bl, int n) {
    }

    @Override
    protected String method_6a89a3dc_div() {
        return "mob.cat.hitt";
    }

    @Override
    public boolean method_af414cf1_cot() {
        if (this.field_36c4f18_Dne.field_7331eae7_Dne.nextInt(3) == 0) {
            return false;
        }
        if (this.field_36c4f18_Dne.method_9ed6d42c_Dne(this.field_373a3ed_Dne) && this.field_36c4f18_Dne.method_d11d9a5_Dne(this, this.field_373a3ed_Dne).isEmpty() && !this.field_36c4f18_Dne.method_90cba31f_bzF(this.field_373a3ed_Dne)) {
            int n = geR.method_117d0718_FWm(this.field_2f0dd3_div);
            int n2 = geR.method_117d0718_FWm(this.field_373a3ed_Dne.field_212608_FWm);
            int n3 = geR.method_117d0718_FWm(this.field_334487_mrb);
            if (n2 < 63) {
                return false;
            }
            int n4 = this.field_36c4f18_Dne.method_2c2cf7bc_Dne(n, n2 - 1, n3);
            if (n4 == zKP.field_36ff555_Dne.field_21260d_FWm || n4 == zKP.field_36e218c_Dne.field_21260d_FWm) {
                return true;
            }
        }
        return false;
    }

    public int method_c5287a51_qLR() {
        return this.field_378ab08_Dne.method_ce7f5d95_Dne(18);
    }

    public void method_99cf5f41_kGO(int n) {
        this.field_378ab08_Dne.method_62ca2346_FWm(18, (byte)n);
    }

    @Override
    protected boolean method_d2ef85b3_yMz() {
        return !this.method_86921671_LVR();
    }
}

