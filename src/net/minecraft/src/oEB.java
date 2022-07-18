package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class oEB
extends BRM {
    private float field_2e5f18_bzF;
    private boolean field_36e4eb_vSL;
    private float field_21260a_FWm;
    private boolean field_21261e_FWm;
    private float field_267cf2_Qnq;
    private float field_2092ab_Dne;

    public float method_9a443a89_XHL() {
        return this.method_74d3fa79_BJH() ? 1.5393804f : (this.method_86921671_LVR() ? (0.55f - (float)(20 - this.field_378ab08_Dne.method_ce7f5d9c_Dne(18)) * 0.02f) * (float)Math.PI : 0.62831855f);
    }

    @Override
    protected String method_6a89a3dc_div() {
        return "mob.wolf.death";
    }

    @Override
    protected void method_c011aad0_mlD() {
        this.field_378ab08_Dne.method_62ca2346_FWm(18, this.method_9a443a8c_XHL());
    }

    @Override
    protected String method_3c9d12fd_DyG() {
        return "mob.wolf.hurt";
    }

    public oEB method_cb1302bd_Dne(Azh azh) {
        oEB oEB2 = new oEB(this.field_36c4f18_Dne);
        String string = this.method_d1f1ed87_FWm();
        if (string != null && string.trim().length() > 0) {
            oEB2.method_8f501fe4_Dne(string);
            oEB2.method_4e0836dc_mrb(true);
        }
        return oEB2;
    }

    @Override
    public String method_6859cdb9_bzF() {
        return this.method_86921671_LVR() ? "/mob/wolf_tame.png" : (this.method_74d3fa79_BJH() ? "/mob/wolf_angry.png" : super.method_6859cdb9_bzF());
    }

    @Override
    public int method_cd4cb3c8_udO() {
        return this.method_80692b1e_ICU() ? 20 : super.method_cd4cb3c8_udO();
    }

    @Override
    public void method_ce7f4362_Dne(byte by) {
        if (by == 8) {
            this.field_36e4eb_vSL = true;
            this.field_2e5f18_bzF = 0.0f;
            this.field_267cf2_Qnq = 0.0f;
        } else {
            super.method_ce7f4362_Dne(by);
        }
    }

    @Override
    protected boolean method_d2ef85b3_yMz() {
        return this.method_74d3fa79_BJH() && !this.method_86921671_LVR();
    }

    @Override
    public void method_8288d6ee_IjH() {
        super.method_8288d6ee_IjH();
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ && this.field_21261e_FWm && !this.field_36e4eb_vSL && !this.method_c738b198_qrB() && this.field_2d2a05_aFZ) {
            this.field_36e4eb_vSL = true;
            this.field_2e5f18_bzF = 0.0f;
            this.field_267cf2_Qnq = 0.0f;
            this.field_36c4f18_Dne.method_b43d849c_Dne(this, (byte)8);
        }
    }

    @Override
    protected float method_b0a28134_div() {
        return 0.4f;
    }

    @Override
    public boolean method_ad72a717_bzF(sMa sMa2) {
        int n = this.method_86921671_LVR() ? 4 : 2;
        return sMa2.method_147b2066_Dne(zBn.method_267d8b79_Dne(this), n);
    }

    @Override
    protected void method_7c6f6039_FWm() {
        super.method_7c6f6039_FWm();
        this.field_378ab08_Dne.method_ad009545_Dne(18, new Integer(this.method_9a443a8c_XHL()));
        this.field_378ab08_Dne.method_ad009545_Dne(19, (byte) 0);
        this.field_378ab08_Dne.method_ad009545_Dne(20, new Byte((byte)Imc.method_ac88ebde_b_(1)));
    }

    @Override
    public void method_7a46289a_Dne() {
        super.method_7a46289a_Dne();
        this.field_21260a_FWm = this.field_2092ab_Dne;
        this.field_2092ab_Dne = this.method_c538635f_qMV() ? (this.field_2092ab_Dne += (1.0f - this.field_2092ab_Dne) * 0.4f) : (this.field_2092ab_Dne += (0.0f - this.field_2092ab_Dne) * 0.4f);
        if (this.method_c538635f_qMV()) {
            this.field_2f0c45_eJi = 10;
        }
        if (this.method_9a443a9d_XHL()) {
            this.field_21261e_FWm = true;
            this.field_36e4eb_vSL = false;
            this.field_2e5f18_bzF = 0.0f;
            this.field_267cf2_Qnq = 0.0f;
        } else if ((this.field_21261e_FWm || this.field_36e4eb_vSL) && this.field_36e4eb_vSL) {
            if (this.field_2e5f18_bzF == 0.0f) {
                this.method_fbd4aee4_Dne("mob.wolf.shake", this.method_b0a28134_div(), (this.field_7331eae7_Dne.nextFloat() - this.field_7331eae7_Dne.nextFloat()) * 0.2f + 1.0f);
            }
            this.field_267cf2_Qnq = this.field_2e5f18_bzF;
            this.field_2e5f18_bzF += 0.05f;
            if (this.field_267cf2_Qnq >= 2.0f) {
                this.field_21261e_FWm = false;
                this.field_36e4eb_vSL = false;
                this.field_267cf2_Qnq = 0.0f;
                this.field_2e5f18_bzF = 0.0f;
            }
            if (this.field_2e5f18_bzF > 0.4f) {
                float f = (float)this.field_373a3ed_Dne.field_212608_FWm;
                int n = (int)(geR.method_ce7f5256_Dne((this.field_2e5f18_bzF - 0.4f) * (float)Math.PI) * 7.0f);
                for (int i = 0; i < n; ++i) {
                    float f2 = (this.field_7331eae7_Dne.nextFloat() * 2.0f - 1.0f) * this.field_342261_ooe * 0.5f;
                    float f3 = (this.field_7331eae7_Dne.nextFloat() * 2.0f - 1.0f) * this.field_342261_ooe * 0.5f;
                    this.field_36c4f18_Dne.method_8600ec24_Dne("splash", this.field_2f0dd3_div + (double)f2, f + 0.8f, this.field_334487_mrb + (double)f3, this.field_291868_XHL, this.field_2a9ad1_Zpi, this.field_31b811_kGO);
                }
            }
        }
    }

    @Override
    public void method_8d4fb917_Dne(WkD wkD) {
        super.method_8d4fb917_Dne(wkD);
        wkD.method_5ab48f70_Dne("Angry", this.method_74d3fa79_BJH());
        wkD.method_5ab43558_Dne("CollarColor", (byte)this.method_c5287a51_qLR());
    }

    public float method_16b620a_Dne(float f, float f2) {
        float f3 = (this.field_267cf2_Qnq + (this.field_2e5f18_bzF - this.field_267cf2_Qnq) * f + f2) / 1.8f;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        } else if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        return geR.method_ce7f5256_Dne(f3 * (float)Math.PI) * geR.method_ce7f5256_Dne(f3 * (float)Math.PI * 11.0f) * 0.15f * (float)Math.PI;
    }

    public boolean method_74d3fa79_BJH() {
        return (this.field_378ab08_Dne.method_ce7f5d95_Dne(16) & 2) != 0;
    }

    @Override
    public Azh method_cafee53a_Dne(Azh azh) {
        return this.method_cb1302bd_Dne(azh);
    }

    @Override
    public void method_66a36cd8_FWm(WkD wkD) {
        super.method_66a36cd8_FWm(wkD);
        this.method_5deac452_Zpi(wkD.method_110c4dc7_FWm("Angry"));
        if (wkD.method_8f501fe8_Dne("CollarColor")) {
            this.method_99cf5f41_kGO(wkD.method_8f501fd0_Dne("CollarColor"));
        }
    }

    @Override
    protected void method_5972745a_Dne(int n, int n2, int n3, int n4) {
        this.method_fbd4aee4_Dne("mob.wolf.step", 0.15f, 1.0f);
    }

    public void method_99cf9f12_kGO(boolean bl) {
        byte by = this.field_378ab08_Dne.method_ce7f5d95_Dne(19);
        if (bl) {
            this.field_378ab08_Dne.method_62ca2346_FWm(19, (byte)1);
        } else {
            this.field_378ab08_Dne.method_62ca2346_FWm(19, (byte)0);
        }
    }

    @Override
    public boolean method_cbcb3929_tgc() {
        return true;
    }

    @Override
    public boolean method_21db0ca_a_(FiG fiG) {
        NMq nMq = fiG.field_36a059b_Dne.method_23040479_Dne();
        if (this.method_86921671_LVR()) {
            if (nMq != null) {
                int n;
                if (dEr.field_836aa5b6_Dne[nMq.field_2e5f1b_bzF] instanceof PBI) {
                    PBI pBI = (PBI)dEr.field_836aa5b6_Dne[nMq.field_2e5f1b_bzF];
                    if (pBI.method_a98a0664_aFZ() && this.field_378ab08_Dne.method_ce7f5d9c_Dne(18) < 20) {
                        if (!fiG.field_37cb681_Dne.field_267d06_Qnq) {
                            --nMq.field_2092ae_Dne;
                        }
                        this.method_ce7f5da9_Dne(pBI.method_7c6f602c_FWm());
                        if (nMq.field_2092ae_Dne <= 0) {
                            fiG.field_36a059b_Dne.method_6e3a6b66_Dne(fiG.field_36a059b_Dne.field_2092ae_Dne, null);
                        }
                        return true;
                    }
                } else if (nMq.field_2e5f1b_bzF == dEr.field_5d50330c_edi.field_267cf5_Qnq && (n = Imc.method_ac88ebde_b_(nMq.method_907a9d14_Qnq())) != this.method_c5287a51_qLR()) {
                    this.method_99cf5f41_kGO(n);
                    if (!fiG.field_37cb681_Dne.field_267d06_Qnq && --nMq.field_2092ae_Dne <= 0) {
                        fiG.field_36a059b_Dne.method_6e3a6b66_Dne(fiG.field_36a059b_Dne.field_2092ae_Dne, null);
                    }
                    return true;
                }
            }
            if (fiG.field_bc57ecbf_aFZ.equalsIgnoreCase(this.method_d1f1ed87_FWm()) && !this.field_36c4f18_Dne.field_2d2a05_aFZ && !this.method_7c61cf19_Dne(nMq)) {
                this.field_3678e96_Dne.method_ce7f9d7a_Dne(!this.method_80692b1e_ICU());
                this.field_3393ee_oIf = false;
                this.method_c389858d_Dne(null);
            }
        } else if (nMq != null && nMq.field_2e5f1b_bzF == dEr.field_fc3bf6d1_tIz.field_267cf5_Qnq && !this.method_74d3fa79_BJH()) {
            if (!fiG.field_37cb681_Dne.field_267d06_Qnq) {
                --nMq.field_2092ae_Dne;
            }
            if (nMq.field_2092ae_Dne <= 0) {
                fiG.field_36a059b_Dne.method_6e3a6b66_Dne(fiG.field_36a059b_Dne.field_2092ae_Dne, null);
            }
            if (!this.field_36c4f18_Dne.field_2d2a05_aFZ) {
                if (this.field_7331eae7_Dne.nextInt(3) == 0) {
                    this.method_4e0836dc_mrb(true);
                    this.method_c389858d_Dne(null);
                    this.method_486cd6af_FWm(null);
                    this.field_3678e96_Dne.method_ce7f9d7a_Dne(true);
                    this.method_143f9e1c_bzF(20);
                    this.method_8f501fe4_Dne(fiG.field_bc57ecbf_aFZ);
                    this.method_ce92b9a6_IjH(true);
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

    public oEB(Qnq qnq) {
        super(qnq);
        this.field_c480ca78_bzF = "/mob/wolf.png";
        this.method_16b621a_Dne(0.6f, 0.8f);
        this.field_2e1df2_cHy = 0.3f;
        this.method_23028a4c_Dne().method_ce7f9d7a_Dne(true);
        this.field_36ae2b9_Dne.method_9212764c_Dne(1, new Cyb(this));
        this.field_36ae2b9_Dne.method_9212764c_Dne(2, this.field_3678e96_Dne);
        this.field_36ae2b9_Dne.method_9212764c_Dne(3, new NQg(this, 0.4f));
        this.field_36ae2b9_Dne.method_9212764c_Dne(4, new etz_0(this, this.field_2e1df2_cHy, true));
        this.field_36ae2b9_Dne.method_9212764c_Dne(5, new ReV(this, this.field_2e1df2_cHy, 10.0f, 2.0f));
        this.field_36ae2b9_Dne.method_9212764c_Dne(6, new znX(this, this.field_2e1df2_cHy));
        this.field_36ae2b9_Dne.method_9212764c_Dne(7, new IBw(this, this.field_2e1df2_cHy));
        this.field_36ae2b9_Dne.method_9212764c_Dne(8, new hgI(this, 8.0f));
        this.field_36ae2b9_Dne.method_9212764c_Dne(9, new yws(this, FiG.class, 8.0f));
        this.field_36ae2b9_Dne.method_9212764c_Dne(9, new cHg(this));
        this.field_2024ae98_FWm.method_9212764c_Dne(1, new DAo(this));
        this.field_2024ae98_FWm.method_9212764c_Dne(2, new dsi_0(this));
        this.field_2024ae98_FWm.method_9212764c_Dne(3, new QRF(this, true));
        this.field_2024ae98_FWm.method_9212764c_Dne(4, new zIt(this, Pvd.class, 16.0f, 200, false));
    }

    @Override
    public boolean method_147b2066_Dne(zBn zBn2, int n) {
        if (this.method_7c861acb_EyB()) {
            return false;
        }
        sMa sMa2 = zBn2.method_f88b2463_FWm();
        this.field_3678e96_Dne.method_ce7f9d7a_Dne(false);
        if (sMa2 != null && !(sMa2 instanceof FiG) && !(sMa2 instanceof hhc)) {
            n = (n + 1) / 2;
        }
        return super.method_147b2066_Dne(zBn2, n);
    }

    public int method_c5287a51_qLR() {
        return this.field_378ab08_Dne.method_ce7f5d95_Dne(20) & 0xF;
    }

    @Override
    protected String method_a174454e_zGp() {
        return this.method_74d3fa79_BJH() ? "mob.wolf.growl" : (this.field_7331eae7_Dne.nextInt(3) == 0 ? (this.method_86921671_LVR() && this.field_378ab08_Dne.method_ce7f5d9c_Dne(18) < 10 ? "mob.wolf.whine" : "mob.wolf.panting") : "mob.wolf.bark");
    }

    public float method_7ed96eaf_Qnq(float f) {
        return (this.field_21260a_FWm + (this.field_2092ab_Dne - this.field_21260a_FWm) * f) * 0.15f * (float)Math.PI;
    }

    @Override
    public int method_7a46288d_Dne() {
        return this.method_86921671_LVR() ? 20 : 8;
    }

    public boolean method_7c82ec32_FYZ() {
        return this.field_21261e_FWm;
    }

    public float method_143f92c9_bzF(float f) {
        return 0.75f + (this.field_267cf2_Qnq + (this.field_2e5f18_bzF - this.field_267cf2_Qnq) * f) / 2.0f * 0.25f;
    }

    @Override
    public boolean method_748d96f2_Dne(HzK hzK) {
        if (hzK == this) {
            return false;
        }
        if (!this.method_86921671_LVR()) {
            return false;
        }
        if (!(hzK instanceof oEB)) {
            return false;
        }
        oEB oEB2 = (oEB)hzK;
        return !oEB2.method_86921671_LVR() ? false : (oEB2.method_80692b1e_ICU() ? false : this.method_9f5095a2_ZfC() && oEB2.method_9f5095a2_ZfC());
    }

    public boolean method_c538635f_qMV() {
        return this.field_378ab08_Dne.method_ce7f5d95_Dne(19) == 1;
    }

    @Override
    public float method_59ee189_c_() {
        return this.field_367151_trS * 0.8f;
    }

    @Override
    public boolean method_7c61cf19_Dne(NMq nMq) {
        return nMq == null ? false : (!(dEr.field_836aa5b6_Dne[nMq.field_2e5f1b_bzF] instanceof PBI) ? false : ((PBI)dEr.field_836aa5b6_Dne[nMq.field_2e5f1b_bzF]).method_a98a0664_aFZ());
    }

    public void method_99cf5f41_kGO(int n) {
        this.field_378ab08_Dne.method_62ca2346_FWm(20, (byte)(n & 0xF));
    }

    public void method_5deac452_Zpi(boolean bl) {
        byte by = this.field_378ab08_Dne.method_ce7f5d95_Dne(16);
        if (bl) {
            this.field_378ab08_Dne.method_62ca2346_FWm(16, (byte)(by | 2));
        } else {
            this.field_378ab08_Dne.method_62ca2346_FWm(16, (byte)(by & 0xFFFFFFFD));
        }
    }

    @Override
    public int method_c3b4a2c3_ooe() {
        return 8;
    }

    @Override
    protected int method_baa393f5_kGO() {
        return -1;
    }

    @Override
    public void method_486cd6af_FWm(FUH fUH) {
        super.method_486cd6af_FWm(fUH);
        if (fUH instanceof FiG) {
            this.method_5deac452_Zpi(true);
        }
    }
}

