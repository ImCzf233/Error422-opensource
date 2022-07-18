package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class fNv
extends HzK {
    private final xvw field_37e2853_Dne;

    public fNv(Qnq qnq) {
        super(qnq);
        this.field_c480ca78_bzF = "/mob/pig.png";
        this.method_16b621a_Dne(0.9f, 0.9f);
        this.method_23028a4c_Dne().method_ce7f9d7a_Dne(true);
        float f = 0.25f;
        this.field_36ae2b9_Dne.method_9212764c_Dne(0, new Cyb(this));
        this.field_36ae2b9_Dne.method_9212764c_Dne(1, new xkg(this, 0.38f));
        this.field_37e2853_Dne = new xvw(this, 0.34f);
        this.field_36ae2b9_Dne.method_9212764c_Dne(2, this.field_37e2853_Dne);
        this.field_36ae2b9_Dne.method_9212764c_Dne(3, new znX(this, f));
        this.field_36ae2b9_Dne.method_9212764c_Dne(4, new cnh(this, 0.3f, dEr.field_921b35cb_etZ.field_267cf5_Qnq, false));
        this.field_36ae2b9_Dne.method_9212764c_Dne(4, new cnh(this, 0.3f, dEr.field_943cf072_dYY.field_267cf5_Qnq, false));
        this.field_36ae2b9_Dne.method_9212764c_Dne(5, new NSW(this, 0.28f));
        this.field_36ae2b9_Dne.method_9212764c_Dne(6, new IBw(this, f));
        this.field_36ae2b9_Dne.method_9212764c_Dne(7, new yws(this, FiG.class, 6.0f));
        this.field_36ae2b9_Dne.method_9212764c_Dne(8, new cHg(this));
    }

    @Override
    protected void method_b077c662_eHV() {
        super.method_b077c662_eHV();
    }

    @Override
    protected int method_baa393f5_kGO() {
        return this.method_cc5ef5c4_trS() ? dEr.field_2c7c1d6e_LVR.field_267cf5_Qnq : dEr.field_dde88ad5_qrB.field_267cf5_Qnq;
    }

    public void method_ce92b9a6_IjH(boolean bl) {
        if (bl) {
            this.field_378ab08_Dne.method_62ca2346_FWm(16, (byte)1);
        } else {
            this.field_378ab08_Dne.method_62ca2346_FWm(16, (byte)0);
        }
    }

    @Override
    protected String method_a174454e_zGp() {
        return "mob.pig.say";
    }

    @Override
    public Azh method_cafee53a_Dne(Azh azh) {
        return this.method_cb0f137b_Dne(azh);
    }

    @Override
    public boolean method_8d0b7773_One() {
        NMq nMq = ((FiG)this.field_37b45e5_Dne).method_23040479_Dne();
        return nMq != null && nMq.field_2e5f1b_bzF == dEr.field_921b35cb_etZ.field_267cf5_Qnq;
    }

    public xvw method_2317b6b2_Dne() {
        return this.field_37e2853_Dne;
    }

    @Override
    public boolean method_7c61cf19_Dne(NMq nMq) {
        return nMq != null && nMq.field_2e5f1b_bzF == dEr.field_943cf072_dYY.field_267cf5_Qnq;
    }

    @Override
    public void method_c3d0e3d0_Dne(xIh xIh2) {
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ) {
            eBi eBi2 = new eBi(this.field_36c4f18_Dne);
            eBi2.method_9ce0fc65_FWm(this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb, this.field_334489_mrb, this.field_29186a_XHL);
            this.field_36c4f18_Dne.method_94d18be5_FWm(eBi2);
            this.method_5d73f9d_g_();
        }
    }

    public fNv method_cb0f137b_Dne(Azh azh) {
        return new fNv(this.field_36c4f18_Dne);
    }

    @Override
    protected void method_17484c9_Dne(boolean bl, int n) {
        int n2 = this.field_7331eae7_Dne.nextInt(3) + 1 + this.field_7331eae7_Dne.nextInt(1 + n);
        for (int i = 0; i < n2; ++i) {
            if (this.method_cc5ef5c4_trS()) {
                this.method_9045499d_Dne(dEr.field_2c7c1d6e_LVR.field_267cf5_Qnq, 1);
                continue;
            }
            this.method_9045499d_Dne(dEr.field_dde88ad5_qrB.field_267cf5_Qnq, 1);
        }
        if (this.method_86921671_LVR()) {
            this.method_9045499d_Dne(dEr.field_9372b110_YHU.field_267cf5_Qnq, 1);
        }
    }

    @Override
    protected void method_7c6f6039_FWm() {
        super.method_7c6f6039_FWm();
        this.field_378ab08_Dne.method_ad009545_Dne(16, (byte)0);
    }

    @Override
    protected String method_6a89a3dc_div() {
        return "mob.pig.death";
    }

    @Override
    public int method_7a46288d_Dne() {
        return 10;
    }

    @Override
    protected String method_3c9d12fd_DyG() {
        return "mob.pig.say";
    }

    @Override
    protected void method_5972745a_Dne(int n, int n2, int n3, int n4) {
        this.method_fbd4aee4_Dne("mob.pig.step", 0.15f, 1.0f);
    }

    @Override
    public void method_8d4fb917_Dne(WkD wkD) {
        super.method_8d4fb917_Dne(wkD);
        wkD.method_5ab48f70_Dne("Saddle", this.method_86921671_LVR());
    }

    @Override
    public boolean method_21db0ca_a_(FiG fiG) {
        if (super.method_21db0ca_a_(fiG)) {
            return true;
        }
        if (this.method_86921671_LVR() && !this.field_36c4f18_Dne.field_2d2a05_aFZ && (this.field_37b45e5_Dne == null || this.field_37b45e5_Dne == fiG)) {
            fiG.method_ad72a713_bzF(this);
            return true;
        }
        return false;
    }

    @Override
    protected void method_ce7f5266_Dne(float f) {
        super.method_ce7f5266_Dne(f);
        if (f > 5.0f && this.field_37b45e5_Dne instanceof FiG) {
            ((FiG)this.field_37b45e5_Dne).method_831230fe_Dne(qlg.field_327f3e5b_trS);
        }
    }

    public boolean method_86921671_LVR() {
        return (this.field_378ab08_Dne.method_ce7f5d95_Dne(16) & 1) != 0;
    }

    @Override
    public boolean method_cbcb3929_tgc() {
        return true;
    }

    @Override
    public void method_66a36cd8_FWm(WkD wkD) {
        super.method_66a36cd8_FWm(wkD);
        this.method_ce92b9a6_IjH(wkD.method_110c4dc7_FWm("Saddle"));
    }
}

