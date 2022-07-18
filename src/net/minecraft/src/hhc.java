package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class hhc
extends sMa
implements vaR {
    private int field_267cf5_Qnq = -1;
    private int field_212c1b_EyB = 0;
    private int field_3393dd_oIf;
    private int field_2e8486_ceE = 0;
    private double field_2092a9_Dne = 2.0;
    private int field_28e7fd_Vxn = -1;
    private int field_2569d5_OdI = 0;
    public int field_21260d_FWm = 0;
    private int field_2e5f1b_bzF = -1;
    public sMa field_75c313d2_bzF;
    private int field_215b36_FfS;
    public int field_2092ae_Dne = 0;
    private boolean field_2092bf_Dne = false;

    public boolean method_907a9d25_Qnq() {
        byte by = this.field_378ab08_Dne.method_ce7f5d95_Dne(16);
        return (by & 1) != 0;
    }

    public hhc(Qnq qnq, double d, double d2, double d3) {
        super(qnq);
        this.field_267cf0_Qnq = 10.0;
        this.method_16b621a_Dne(0.5f, 0.5f);
        this.method_2961957_bzF(d, d2, d3);
        this.field_36b0a6_udO = 0.0f;
    }

    @Override
    protected void method_7c6f6039_FWm() {
        this.field_378ab08_Dne.method_ad009545_Dne(16, (byte)0);
    }

    public hhc(Qnq qnq) {
        super(qnq);
        this.field_267cf0_Qnq = 10.0;
        this.method_16b621a_Dne(0.5f, 0.5f);
    }

    @Override
    public void method_66a36cd8_FWm(WkD wkD) {
        this.field_2e5f1b_bzF = wkD.method_8f501fe1_Dne("xTile");
        this.field_267cf5_Qnq = wkD.method_8f501fe1_Dne("yTile");
        this.field_28e7fd_Vxn = wkD.method_8f501fe1_Dne("zTile");
        this.field_2e8486_ceE = wkD.method_8f501fd0_Dne("inTile") & 0xFF;
        this.field_212c1b_EyB = wkD.method_8f501fd0_Dne("inData") & 0xFF;
        this.field_21260d_FWm = wkD.method_8f501fd0_Dne("shake") & 0xFF;
        boolean bl = this.field_2092bf_Dne = wkD.method_8f501fd0_Dne("inGround") == 1;
        if (wkD.method_8f501fe8_Dne("damage")) {
            this.field_2092a9_Dne = wkD.method_8f501fd2_Dne("damage");
        }
        if (wkD.method_8f501fe8_Dne("pickup")) {
            this.field_2092ae_Dne = wkD.method_8f501fd0_Dne("pickup");
        } else if (wkD.method_8f501fe8_Dne("player")) {
            this.field_2092ae_Dne = wkD.method_110c4dc7_FWm("player") ? 1 : 0;
        }
    }

    public double method_7a462888_Dne() {
        return this.field_2092a9_Dne;
    }

    public void method_ce7f4ae4_Dne(double d) {
        this.field_2092a9_Dne = d;
    }

    @Override
    public float method_7a46288a_Dne() {
        return 0.0f;
    }

    public hhc(Qnq qnq, FUH fUH, FUH fUH2, float f, float f2) {
        super(qnq);
        this.field_267cf0_Qnq = 10.0;
        this.field_75c313d2_bzF = fUH;
        if (fUH instanceof FiG) {
            this.field_2092ae_Dne = 1;
        }
        this.field_22c5fd_IjH = fUH.field_22c5fd_IjH + (double)fUH.method_59ee189_c_() - (double)0.1f;
        double d = fUH2.field_2f0dd3_div - fUH.field_2f0dd3_div;
        double d2 = fUH2.field_373a3ed_Dne.field_212608_FWm + (double)(fUH2.field_367151_trS / 3.0f) - this.field_22c5fd_IjH;
        double d3 = fUH2.field_334487_mrb - fUH.field_334487_mrb;
        double d4 = geR.method_ce7f4ad4_Dne(d * d + d3 * d3);
        if (d4 >= 1.0E-7) {
            float f3 = (float)(Math.atan2(d3, d) * 180.0 / Math.PI) - 90.0f;
            float f4 = (float)(-(Math.atan2(d2, d4) * 180.0 / Math.PI));
            double d5 = d / d4;
            double d6 = d3 / d4;
            this.method_9ce0fc65_FWm(fUH.field_2f0dd3_div + d5, this.field_22c5fd_IjH, fUH.field_334487_mrb + d6, f3, f4);
            this.field_36b0a6_udO = 0.0f;
            float f5 = (float)d4 * 0.2f;
            this.method_b5821797_bzF(d, d2 + (double)f5, d3, f, f2);
        }
    }

    @Override
    public boolean method_ae128dcb_bzF() {
        return false;
    }

    @Override
    public void method_8d4fb917_Dne(WkD wkD) {
        wkD.method_5ab47529_Dne("xTile", (short)this.field_2e5f1b_bzF);
        wkD.method_5ab47529_Dne("yTile", (short)this.field_267cf5_Qnq);
        wkD.method_5ab47529_Dne("zTile", (short)this.field_28e7fd_Vxn);
        wkD.method_5ab43558_Dne("inTile", (byte)this.field_2e8486_ceE);
        wkD.method_5ab43558_Dne("inData", (byte)this.field_212c1b_EyB);
        wkD.method_5ab43558_Dne("shake", (byte)this.field_21260d_FWm);
        wkD.method_5ab43558_Dne("inGround", (byte)(this.field_2092bf_Dne ? 1 : 0));
        wkD.method_5ab43558_Dne("pickup", (byte)this.field_2092ae_Dne);
        wkD.method_5ab43cda_Dne("damage", this.field_2092a9_Dne);
    }

    @Override
    public void method_7a46289a_Dne() {
        Object object;
        int n;
        super.method_7a46289a_Dne();
        if (this.field_31b813_kGO == 0.0f && this.field_2a9ad3_Zpi == 0.0f) {
            float f = geR.method_ce7f4ad4_Dne(this.field_291868_XHL * this.field_291868_XHL + this.field_31b811_kGO * this.field_31b811_kGO);
            this.field_2a9ad3_Zpi = this.field_334489_mrb = (float)(Math.atan2(this.field_291868_XHL, this.field_31b811_kGO) * 180.0 / Math.PI);
            this.field_31b813_kGO = this.field_29186a_XHL = (float)(Math.atan2(this.field_2a9ad1_Zpi, f) * 180.0 / Math.PI);
        }
        if ((n = this.field_36c4f18_Dne.method_2c2cf7bc_Dne(this.field_2e5f1b_bzF, this.field_267cf5_Qnq, this.field_28e7fd_Vxn)) > 0) {
            zKP.field_8374b848_Dne[n].method_fbabf7ef_Dne(this.field_36c4f18_Dne, this.field_2e5f1b_bzF, this.field_267cf5_Qnq, this.field_28e7fd_Vxn);
            object = zKP.field_8374b848_Dne[n].method_8c85fe2_Dne(this.field_36c4f18_Dne, this.field_2e5f1b_bzF, this.field_267cf5_Qnq, this.field_28e7fd_Vxn);
            if (object != null && ((bSp)object).method_a1a425c2_Dne(this.field_36c4f18_Dne.method_23186a47_Dne().method_e4505d6c_Dne(this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb))) {
                this.field_2092bf_Dne = true;
            }
        }
        if (this.field_21260d_FWm > 0) {
            --this.field_21260d_FWm;
        }
        if (this.field_2092bf_Dne) {
            int n2 = this.field_36c4f18_Dne.method_2c2cf7bc_Dne(this.field_2e5f1b_bzF, this.field_267cf5_Qnq, this.field_28e7fd_Vxn);
            int n3 = this.field_36c4f18_Dne.method_2dee76f_bzF(this.field_2e5f1b_bzF, this.field_267cf5_Qnq, this.field_28e7fd_Vxn);
            if (n2 == this.field_2e8486_ceE && n3 == this.field_212c1b_EyB) {
                ++this.field_215b36_FfS;
                if (this.field_215b36_FfS == 1200) {
                    this.method_5d73f9d_g_();
                }
            } else {
                this.field_2092bf_Dne = false;
                this.field_291868_XHL *= (double)(this.field_7331eae7_Dne.nextFloat() * 0.2f);
                this.field_2a9ad1_Zpi *= (double)(this.field_7331eae7_Dne.nextFloat() * 0.2f);
                this.field_31b811_kGO *= (double)(this.field_7331eae7_Dne.nextFloat() * 0.2f);
                this.field_215b36_FfS = 0;
                this.field_2569d5_OdI = 0;
            }
        } else {
            float f;
            sMa sMa2;
            int n4;
            ++this.field_2569d5_OdI;
            object = this.field_36c4f18_Dne.method_23186a47_Dne().method_e4505d6c_Dne(this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb);
            chN chN2 = this.field_36c4f18_Dne.method_23186a47_Dne().method_e4505d6c_Dne(this.field_2f0dd3_div + this.field_291868_XHL, this.field_22c5fd_IjH + this.field_2a9ad1_Zpi, this.field_334487_mrb + this.field_31b811_kGO);
            wHH wHH2 = this.field_36c4f18_Dne.method_9210e274_Dne((chN)object, chN2, false, true);
            object = this.field_36c4f18_Dne.method_23186a47_Dne().method_e4505d6c_Dne(this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb);
            chN2 = this.field_36c4f18_Dne.method_23186a47_Dne().method_e4505d6c_Dne(this.field_2f0dd3_div + this.field_291868_XHL, this.field_22c5fd_IjH + this.field_2a9ad1_Zpi, this.field_334487_mrb + this.field_31b811_kGO);
            if (wHH2 != null) {
                chN2 = this.field_36c4f18_Dne.method_23186a47_Dne().method_e4505d6c_Dne(wHH2.field_3746303_Dne.field_2092a9_Dne, wHH2.field_3746303_Dne.field_212608_FWm, wHH2.field_3746303_Dne.field_2e5f16_bzF);
            }
            sMa sMa3 = null;
            List list = this.field_36c4f18_Dne.method_71df22e6_FWm(this, this.field_373a3ed_Dne.method_e44f9e56_Dne(this.field_291868_XHL, this.field_2a9ad1_Zpi, this.field_31b811_kGO).method_b78565d7_FWm(1.0, 1.0, 1.0));
            double d = 0.0;
            for (n4 = 0; n4 < list.size(); ++n4) {
                double d2;
                bSp bSp2;
                wHH wHH3;
                sMa2 = (sMa)list.get(n4);
                if (!sMa2.method_baa39406_kGO() || sMa2 == this.field_75c313d2_bzF && this.field_2569d5_OdI < 5 || (wHH3 = (bSp2 = sMa2.field_373a3ed_Dne.method_b78565d7_FWm(f = 0.3f, f, f)).method_38be674_Dne((chN)object, chN2)) == null || !((d2 = ((chN)object).method_7af7d96d_FWm(wHH3.field_3746303_Dne)) < d) && d != 0.0) continue;
                sMa3 = sMa2;
                d = d2;
            }
            if (sMa3 != null) {
                wHH2 = new wHH(sMa3);
            }
            if (wHH2 != null && wHH2.field_37b45e5_Dne != null && wHH2.field_37b45e5_Dne instanceof FiG) {
                sMa2 = (FiG)wHH2.field_37b45e5_Dne;
                if (((FiG)sMa2).field_37cb681_Dne.field_2092bf_Dne || this.field_75c313d2_bzF instanceof FiG && !((FiG)this.field_75c313d2_bzF).method_703284a7_Dne((FiG)sMa2)) {
                    wHH2 = null;
                }
            }
            if (wHH2 != null) {
                if (wHH2.field_37b45e5_Dne != null) {
                    float f2 = geR.method_ce7f4ad4_Dne(this.field_291868_XHL * this.field_291868_XHL + this.field_2a9ad1_Zpi * this.field_2a9ad1_Zpi + this.field_31b811_kGO * this.field_31b811_kGO);
                    int n5 = geR.method_143f8b4a_bzF((double)f2 * this.field_2092a9_Dne);
                    if (this.method_907a9d25_Qnq()) {
                        n5 += this.field_7331eae7_Dne.nextInt(n5 / 2 + 2);
                    }
                    zBn zBn2 = null;
                    zBn2 = this.field_75c313d2_bzF == null ? zBn.method_acab7ee1_Dne(this, this) : zBn.method_acab7ee1_Dne(this, this.field_75c313d2_bzF);
                    if (this.method_cc5ef5c4_trS() && !(wHH2.field_37b45e5_Dne instanceof iGp)) {
                        wHH2.field_37b45e5_Dne.method_87b738a3_aFZ(5);
                    }
                    if (wHH2.field_37b45e5_Dne.method_147b2066_Dne(zBn2, n5)) {
                        if (wHH2.field_37b45e5_Dne instanceof FUH) {
                            float f3;
                            FUH fUH = (FUH)wHH2.field_37b45e5_Dne;
                            if (!this.field_36c4f18_Dne.field_2d2a05_aFZ) {
                                fUH.method_5dea8481_Zpi(fUH.method_cc5ef5b3_trS() + 1);
                            }
                            if (this.field_3393dd_oIf > 0 && (f3 = geR.method_ce7f4ad4_Dne(this.field_291868_XHL * this.field_291868_XHL + this.field_31b811_kGO * this.field_31b811_kGO)) > 0.0f) {
                                wHH2.field_37b45e5_Dne.method_2e2893bd_Qnq(this.field_291868_XHL * (double)this.field_3393dd_oIf * (double)0.6f / (double)f3, 0.1, this.field_31b811_kGO * (double)this.field_3393dd_oIf * (double)0.6f / (double)f3);
                            }
                            if (this.field_75c313d2_bzF != null) {
                                kqp.method_1ddea214_Dne(this.field_75c313d2_bzF, fUH, this.field_7331eae7_Dne);
                            }
                            if (this.field_75c313d2_bzF != null && wHH2.field_37b45e5_Dne != this.field_75c313d2_bzF && wHH2.field_37b45e5_Dne instanceof FiG && this.field_75c313d2_bzF instanceof PJQ) {
                                ((PJQ)this.field_75c313d2_bzF).field_36dacd0_Dne.method_7be2fb8c_Dne(new Tnn(6, 0));
                            }
                        }
                        this.method_fbd4aee4_Dne("random.bowhit", 1.0f, 1.2f / (this.field_7331eae7_Dne.nextFloat() * 0.2f + 0.9f));
                        if (!(wHH2.field_37b45e5_Dne instanceof iGp)) {
                            this.method_5d73f9d_g_();
                        }
                    } else {
                        this.field_291868_XHL *= (double)-0.1f;
                        this.field_2a9ad1_Zpi *= (double)-0.1f;
                        this.field_31b811_kGO *= (double)-0.1f;
                        this.field_334489_mrb += 180.0f;
                        this.field_2a9ad3_Zpi += 180.0f;
                        this.field_2569d5_OdI = 0;
                    }
                } else {
                    this.field_2e5f1b_bzF = wHH2.field_2092ae_Dne;
                    this.field_267cf5_Qnq = wHH2.field_21260d_FWm;
                    this.field_28e7fd_Vxn = wHH2.field_2e5f1b_bzF;
                    this.field_2e8486_ceE = this.field_36c4f18_Dne.method_2c2cf7bc_Dne(this.field_2e5f1b_bzF, this.field_267cf5_Qnq, this.field_28e7fd_Vxn);
                    this.field_212c1b_EyB = this.field_36c4f18_Dne.method_2dee76f_bzF(this.field_2e5f1b_bzF, this.field_267cf5_Qnq, this.field_28e7fd_Vxn);
                    this.field_291868_XHL = (float)(wHH2.field_3746303_Dne.field_2092a9_Dne - this.field_2f0dd3_div);
                    this.field_2a9ad1_Zpi = (float)(wHH2.field_3746303_Dne.field_212608_FWm - this.field_22c5fd_IjH);
                    this.field_31b811_kGO = (float)(wHH2.field_3746303_Dne.field_2e5f16_bzF - this.field_334487_mrb);
                    float f4 = geR.method_ce7f4ad4_Dne(this.field_291868_XHL * this.field_291868_XHL + this.field_2a9ad1_Zpi * this.field_2a9ad1_Zpi + this.field_31b811_kGO * this.field_31b811_kGO);
                    this.field_2f0dd3_div -= this.field_291868_XHL / (double)f4 * (double)0.05f;
                    this.field_22c5fd_IjH -= this.field_2a9ad1_Zpi / (double)f4 * (double)0.05f;
                    this.field_334487_mrb -= this.field_31b811_kGO / (double)f4 * (double)0.05f;
                    this.method_fbd4aee4_Dne("random.bowhit", 1.0f, 1.2f / (this.field_7331eae7_Dne.nextFloat() * 0.2f + 0.9f));
                    this.field_2092bf_Dne = true;
                    this.field_21260d_FWm = 7;
                    this.method_117d59bb_FWm(false);
                    if (this.field_2e8486_ceE != 0) {
                        zKP.field_8374b848_Dne[this.field_2e8486_ceE].method_8d285d4a_Dne(this.field_36c4f18_Dne, this.field_2e5f1b_bzF, this.field_267cf5_Qnq, this.field_28e7fd_Vxn, this);
                    }
                }
            }
            if (this.method_907a9d25_Qnq()) {
                for (n4 = 0; n4 < 4; ++n4) {
                    this.field_36c4f18_Dne.method_8600ec24_Dne("crit", this.field_2f0dd3_div + this.field_291868_XHL * (double)n4 / 4.0, this.field_22c5fd_IjH + this.field_2a9ad1_Zpi * (double)n4 / 4.0, this.field_334487_mrb + this.field_31b811_kGO * (double)n4 / 4.0, -this.field_291868_XHL, -this.field_2a9ad1_Zpi + 0.2, -this.field_31b811_kGO);
                }
            }
            this.field_2f0dd3_div += this.field_291868_XHL;
            this.field_22c5fd_IjH += this.field_2a9ad1_Zpi;
            this.field_334487_mrb += this.field_31b811_kGO;
            float f5 = geR.method_ce7f4ad4_Dne(this.field_291868_XHL * this.field_291868_XHL + this.field_31b811_kGO * this.field_31b811_kGO);
            this.field_334489_mrb = (float)(Math.atan2(this.field_291868_XHL, this.field_31b811_kGO) * 180.0 / Math.PI);
            this.field_29186a_XHL = (float)(Math.atan2(this.field_2a9ad1_Zpi, f5) * 180.0 / Math.PI);
            while (this.field_29186a_XHL - this.field_31b813_kGO < -180.0f) {
                this.field_31b813_kGO -= 360.0f;
            }
            while (this.field_29186a_XHL - this.field_31b813_kGO >= 180.0f) {
                this.field_31b813_kGO += 360.0f;
            }
            while (this.field_334489_mrb - this.field_2a9ad3_Zpi < -180.0f) {
                this.field_2a9ad3_Zpi -= 360.0f;
            }
            while (this.field_334489_mrb - this.field_2a9ad3_Zpi >= 180.0f) {
                this.field_2a9ad3_Zpi += 360.0f;
            }
            this.field_29186a_XHL = this.field_31b813_kGO + (this.field_29186a_XHL - this.field_31b813_kGO) * 0.2f;
            this.field_334489_mrb = this.field_2a9ad3_Zpi + (this.field_334489_mrb - this.field_2a9ad3_Zpi) * 0.2f;
            float f6 = 0.99f;
            f = 0.05f;
            if (this.method_9feec6c6_Zpi()) {
                for (int i = 0; i < 4; ++i) {
                    float f7 = 0.25f;
                    this.field_36c4f18_Dne.method_8600ec24_Dne("bubble", this.field_2f0dd3_div - this.field_291868_XHL * (double)f7, this.field_22c5fd_IjH - this.field_2a9ad1_Zpi * (double)f7, this.field_334487_mrb - this.field_31b811_kGO * (double)f7, this.field_291868_XHL, this.field_2a9ad1_Zpi, this.field_31b811_kGO);
                }
                f6 = 0.8f;
            }
            this.field_291868_XHL *= (double)f6;
            this.field_2a9ad1_Zpi *= (double)f6;
            this.field_31b811_kGO *= (double)f6;
            this.field_2a9ad1_Zpi -= (double)f;
            this.method_2961957_bzF(this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb);
            this.method_8c71d201_OdI();
        }
    }

    public hhc(Qnq qnq, FUH fUH, float f) {
        super(qnq);
        this.field_267cf0_Qnq = 10.0;
        this.field_75c313d2_bzF = fUH;
        if (fUH instanceof FiG) {
            this.field_2092ae_Dne = 1;
        }
        this.method_16b621a_Dne(0.5f, 0.5f);
        this.method_9ce0fc65_FWm(fUH.field_2f0dd3_div, fUH.field_22c5fd_IjH + (double)fUH.method_59ee189_c_(), fUH.field_334487_mrb, fUH.field_334489_mrb, fUH.field_29186a_XHL);
        this.field_2f0dd3_div -= (double)(geR.method_117d0e97_FWm(this.field_334489_mrb / 180.0f * (float)Math.PI) * 0.16f);
        this.field_22c5fd_IjH -= (double)0.1f;
        this.field_334487_mrb -= (double)(geR.method_ce7f5256_Dne(this.field_334489_mrb / 180.0f * (float)Math.PI) * 0.16f);
        this.method_2961957_bzF(this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb);
        this.field_36b0a6_udO = 0.0f;
        this.field_291868_XHL = -geR.method_ce7f5256_Dne(this.field_334489_mrb / 180.0f * (float)Math.PI) * geR.method_117d0e97_FWm(this.field_29186a_XHL / 180.0f * (float)Math.PI);
        this.field_31b811_kGO = geR.method_117d0e97_FWm(this.field_334489_mrb / 180.0f * (float)Math.PI) * geR.method_117d0e97_FWm(this.field_29186a_XHL / 180.0f * (float)Math.PI);
        this.field_2a9ad1_Zpi = -geR.method_ce7f5256_Dne(this.field_29186a_XHL / 180.0f * (float)Math.PI);
        this.method_b5821797_bzF(this.field_291868_XHL, this.field_2a9ad1_Zpi, this.field_31b811_kGO, f * 1.5f, 1.0f);
    }

    public void method_ce7f5da9_Dne(int n) {
        this.field_3393dd_oIf = n;
    }

    @Override
    public void method_b5821797_bzF(double d, double d2, double d3, float f, float f2) {
        float f3 = geR.method_ce7f4ad4_Dne(d * d + d2 * d2 + d3 * d3);
        d /= (double)f3;
        d2 /= (double)f3;
        d3 /= (double)f3;
        d += this.field_7331eae7_Dne.nextGaussian() * (double)(this.field_7331eae7_Dne.nextBoolean() ? -1 : 1) * (double)0.0075f * (double)f2;
        d2 += this.field_7331eae7_Dne.nextGaussian() * (double)(this.field_7331eae7_Dne.nextBoolean() ? -1 : 1) * (double)0.0075f * (double)f2;
        d3 += this.field_7331eae7_Dne.nextGaussian() * (double)(this.field_7331eae7_Dne.nextBoolean() ? -1 : 1) * (double)0.0075f * (double)f2;
        this.field_291868_XHL = d *= (double)f;
        this.field_2a9ad1_Zpi = d2 *= (double)f;
        this.field_31b811_kGO = d3 *= (double)f;
        float f4 = geR.method_ce7f4ad4_Dne(d * d + d3 * d3);
        this.field_2a9ad3_Zpi = this.field_334489_mrb = (float)(Math.atan2(d, d3) * 180.0 / Math.PI);
        this.field_31b813_kGO = this.field_29186a_XHL = (float)(Math.atan2(d2, f4) * 180.0 / Math.PI);
        this.field_215b36_FfS = 0;
    }

    public void method_117d59bb_FWm(boolean bl) {
        byte by = this.field_378ab08_Dne.method_ce7f5d95_Dne(16);
        if (bl) {
            this.field_378ab08_Dne.method_62ca2346_FWm(16, (byte)(by | 1));
        } else {
            this.field_378ab08_Dne.method_62ca2346_FWm(16, (byte)(by & 0xFFFFFFFE));
        }
    }

    @Override
    public void method_ae1c3edf_Dne(double d, double d2, double d3, float f, float f2, int n) {
        this.method_2961957_bzF(d, d2, d3);
        this.method_1e252df9_FWm(f, f2);
    }

    @Override
    public void method_76912e1e_aFZ(double d, double d2, double d3) {
        this.field_291868_XHL = d;
        this.field_2a9ad1_Zpi = d2;
        this.field_31b811_kGO = d3;
        if (this.field_31b813_kGO == 0.0f && this.field_2a9ad3_Zpi == 0.0f) {
            float f = geR.method_ce7f4ad4_Dne(d * d + d3 * d3);
            this.field_2a9ad3_Zpi = this.field_334489_mrb = (float)(Math.atan2(d, d3) * 180.0 / Math.PI);
            this.field_31b813_kGO = this.field_29186a_XHL = (float)(Math.atan2(d2, f) * 180.0 / Math.PI);
            this.field_31b813_kGO = this.field_29186a_XHL;
            this.field_2a9ad3_Zpi = this.field_334489_mrb;
            this.method_9ce0fc65_FWm(this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb, this.field_334489_mrb, this.field_29186a_XHL);
            this.field_215b36_FfS = 0;
        }
    }

    @Override
    public void method_21db0c6_a_(FiG fiG) {
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ && this.field_2092bf_Dne && this.field_21260d_FWm <= 0) {
            boolean bl;
            boolean bl2 = bl = this.field_2092ae_Dne == 1 || this.field_2092ae_Dne == 2 && fiG.field_37cb681_Dne.field_267d06_Qnq;
            if (this.field_2092ae_Dne == 1 && !fiG.field_36a059b_Dne.method_7c61cf19_Dne(new NMq(dEr.field_f0a61753_zGp, 1))) {
                bl = false;
            }
            if (bl) {
                this.method_fbd4aee4_Dne("random.pop", 0.2f, ((this.field_7331eae7_Dne.nextFloat() - this.field_7331eae7_Dne.nextFloat()) * 0.7f + 1.0f) * 2.0f);
                fiG.method_b43d9ee3_Dne(this, 1);
                this.method_5d73f9d_g_();
            }
        }
    }

    @Override
    protected boolean method_7c6f603d_FWm() {
        return false;
    }
}

