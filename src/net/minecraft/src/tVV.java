package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class tVV
extends Ebp {
    public double field_2092a9_Dne;
    private int field_2092ae_Dne = 0;
    public double field_212608_FWm;

    @Override
    public zKP method_f88e496b_FWm() {
        return zKP.field_ddf29d67_qrB;
    }

    public tVV(Qnq qnq, double d, double d2, double d3) {
        super(qnq, d, d2, d3);
    }

    public tVV(Qnq qnq) {
        super(qnq);
    }

    protected boolean method_b0a28148_div() {
        return (this.field_378ab08_Dne.method_ce7f5d95_Dne(16) & 1) != 0;
    }

    @Override
    public int method_9a443a8c_XHL() {
        return 2;
    }

    @Override
    public void method_c6daaac1_Dne(zBn zBn2) {
        super.method_c6daaac1_Dne(zBn2);
        if (!zBn2.method_7c6f603d_FWm()) {
            this.method_2cda29ee_Dne(new NMq(zKP.field_cba1f2f1_haP, 1), 0.0f);
        }
    }

    @Override
    protected void method_7216369_Dne(int n, int n2, int n3, double d, double d2, int n4, int n5) {
        super.method_7216369_Dne(n, n2, n3, d, d2, n4, n5);
        double d3 = this.field_2092a9_Dne * this.field_2092a9_Dne + this.field_212608_FWm * this.field_212608_FWm;
        if (d3 > 1.0E-4 && this.field_291868_XHL * this.field_291868_XHL + this.field_31b811_kGO * this.field_31b811_kGO > 0.001) {
            d3 = geR.method_ce7f4ad4_Dne(d3);
            this.field_2092a9_Dne /= d3;
            this.field_212608_FWm /= d3;
            if (this.field_2092a9_Dne * this.field_291868_XHL + this.field_212608_FWm * this.field_31b811_kGO < 0.0) {
                this.field_2092a9_Dne = 0.0;
                this.field_212608_FWm = 0.0;
            } else {
                this.field_2092a9_Dne = this.field_291868_XHL;
                this.field_212608_FWm = this.field_31b811_kGO;
            }
        }
    }

    @Override
    public int method_baa393f5_kGO() {
        return 2;
    }

    @Override
    protected void method_7c6f6039_FWm() {
        super.method_7c6f6039_FWm();
        this.field_378ab08_Dne.method_ad009545_Dne(16, (byte) 0);
    }

    @Override
    public void method_7a46289a_Dne() {
        super.method_7a46289a_Dne();
        if (this.field_2092ae_Dne > 0) {
            --this.field_2092ae_Dne;
        }
        if (this.field_2092ae_Dne <= 0) {
            this.field_212608_FWm = 0.0;
            this.field_2092a9_Dne = 0.0;
        }
        this.method_b51e1f82_zGp(this.field_2092ae_Dne > 0);
        if (this.method_b0a28148_div() && this.field_7331eae7_Dne.nextInt(4) == 0) {
            this.field_36c4f18_Dne.method_8600ec24_Dne("largesmoke", this.field_2f0dd3_div, this.field_22c5fd_IjH + 0.8, this.field_334487_mrb, 0.0, 0.0, 0.0);
        }
    }

    @Override
    public boolean method_21db0ca_a_(FiG fiG) {
        NMq nMq = fiG.field_36a059b_Dne.method_23040479_Dne();
        if (nMq != null && nMq.field_2e5f1b_bzF == dEr.field_16278184_DyG.field_267cf5_Qnq) {
            if (--nMq.field_2092ae_Dne == 0) {
                fiG.field_36a059b_Dne.method_6e3a6b66_Dne(fiG.field_36a059b_Dne.field_2092ae_Dne, null);
            }
            this.field_2092ae_Dne += 3600;
        }
        this.field_2092a9_Dne = this.field_2f0dd3_div - fiG.field_2f0dd3_div;
        this.field_212608_FWm = this.field_334487_mrb - fiG.field_334487_mrb;
        return true;
    }

    protected void method_b51e1f82_zGp(boolean bl) {
        if (bl) {
            this.field_378ab08_Dne.method_62ca2346_FWm(16, (byte)(this.field_378ab08_Dne.method_ce7f5d95_Dne(16) | 1));
        } else {
            this.field_378ab08_Dne.method_62ca2346_FWm(16, (byte)(this.field_378ab08_Dne.method_ce7f5d95_Dne(16) & 0xFFFFFFFE));
        }
    }

    @Override
    protected void method_8d4fb917_Dne(WkD wkD) {
        super.method_8d4fb917_Dne(wkD);
        wkD.method_5ab43cda_Dne("PushX", this.field_2092a9_Dne);
        wkD.method_5ab43cda_Dne("PushZ", this.field_212608_FWm);
        wkD.method_5ab47529_Dne("Fuel", (short)this.field_2092ae_Dne);
    }

    @Override
    protected void method_66a36cd8_FWm(WkD wkD) {
        super.method_66a36cd8_FWm(wkD);
        this.field_2092a9_Dne = wkD.method_8f501fd2_Dne("PushX");
        this.field_212608_FWm = wkD.method_8f501fd2_Dne("PushZ");
        this.field_2092ae_Dne = wkD.method_8f501fe1_Dne("Fuel");
    }

    @Override
    protected void method_907a9d21_Qnq() {
        double d = this.field_2092a9_Dne * this.field_2092a9_Dne + this.field_212608_FWm * this.field_212608_FWm;
        if (d > 1.0E-4) {
            d = geR.method_ce7f4ad4_Dne(d);
            this.field_2092a9_Dne /= d;
            this.field_212608_FWm /= d;
            double d2 = 0.05;
            this.field_291868_XHL *= (double)0.8f;
            this.field_2a9ad1_Zpi *= 0.0;
            this.field_31b811_kGO *= (double)0.8f;
            this.field_291868_XHL += this.field_2092a9_Dne * d2;
            this.field_31b811_kGO += this.field_212608_FWm * d2;
        } else {
            this.field_291868_XHL *= (double)0.98f;
            this.field_2a9ad1_Zpi *= 0.0;
            this.field_31b811_kGO *= (double)0.98f;
        }
        super.method_907a9d21_Qnq();
    }
}

