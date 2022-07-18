package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public abstract class Tdr
extends sMa {
    private int field_28e7fd_Vxn;
    private int field_2092ae_Dne = -1;
    private int field_2e5f1b_bzF = -1;
    private int field_21260d_FWm = -1;
    public double field_2092a9_Dne;
    private int field_2e8486_ceE = 0;
    private int field_267cf5_Qnq = 0;
    public double field_212608_FWm;
    private boolean field_2092bf_Dne = false;
    public double field_2e5f16_bzF;
    public FUH field_366ec33_Dne;

    @Override
    public float method_ce7f5256_Dne(float f) {
        return 1.0f;
    }

    @Override
    public void method_7a46289a_Dne() {
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ && (this.field_366ec33_Dne != null && this.field_366ec33_Dne.field_2a9ae7_Zpi || !this.field_36c4f18_Dne.method_2dee780_bzF((int)this.field_2f0dd3_div, (int)this.field_22c5fd_IjH, (int)this.field_334487_mrb))) {
            this.method_5d73f9d_g_();
        } else {
            super.method_7a46289a_Dne();
            this.method_87b738a3_aFZ(1);
            if (this.field_2092bf_Dne) {
                int n = this.field_36c4f18_Dne.method_2c2cf7bc_Dne(this.field_2092ae_Dne, this.field_21260d_FWm, this.field_2e5f1b_bzF);
                if (n == this.field_267cf5_Qnq) {
                    ++this.field_28e7fd_Vxn;
                    if (this.field_28e7fd_Vxn == 600) {
                        this.method_5d73f9d_g_();
                    }
                    return;
                }
                this.field_2092bf_Dne = false;
                this.field_291868_XHL *= (double)(this.field_7331eae7_Dne.nextFloat() * 0.2f);
                this.field_2a9ad1_Zpi *= (double)(this.field_7331eae7_Dne.nextFloat() * 0.2f);
                this.field_31b811_kGO *= (double)(this.field_7331eae7_Dne.nextFloat() * 0.2f);
                this.field_28e7fd_Vxn = 0;
                this.field_2e8486_ceE = 0;
            } else {
                ++this.field_2e8486_ceE;
            }
            chN chN2 = this.field_36c4f18_Dne.method_23186a47_Dne().method_e4505d6c_Dne(this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb);
            chN chN3 = this.field_36c4f18_Dne.method_23186a47_Dne().method_e4505d6c_Dne(this.field_2f0dd3_div + this.field_291868_XHL, this.field_22c5fd_IjH + this.field_2a9ad1_Zpi, this.field_334487_mrb + this.field_31b811_kGO);
            wHH wHH2 = this.field_36c4f18_Dne.method_38be674_Dne(chN2, chN3);
            chN2 = this.field_36c4f18_Dne.method_23186a47_Dne().method_e4505d6c_Dne(this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb);
            chN3 = this.field_36c4f18_Dne.method_23186a47_Dne().method_e4505d6c_Dne(this.field_2f0dd3_div + this.field_291868_XHL, this.field_22c5fd_IjH + this.field_2a9ad1_Zpi, this.field_334487_mrb + this.field_31b811_kGO);
            if (wHH2 != null) {
                chN3 = this.field_36c4f18_Dne.method_23186a47_Dne().method_e4505d6c_Dne(wHH2.field_3746303_Dne.field_2092a9_Dne, wHH2.field_3746303_Dne.field_212608_FWm, wHH2.field_3746303_Dne.field_2e5f16_bzF);
            }
            sMa sMa2 = null;
            List list = this.field_36c4f18_Dne.method_71df22e6_FWm(this, this.field_373a3ed_Dne.method_e44f9e56_Dne(this.field_291868_XHL, this.field_2a9ad1_Zpi, this.field_31b811_kGO).method_b78565d7_FWm(1.0, 1.0, 1.0));
            double d = 0.0;
            for (int i = 0; i < list.size(); ++i) {
                double d2;
                float f;
                bSp bSp2;
                wHH wHH3;
                sMa sMa3 = (sMa)list.get(i);
                if (!sMa3.method_baa39406_kGO() || sMa3.method_bb7dd824_Dne(this.field_366ec33_Dne) && this.field_2e8486_ceE < 25 || (wHH3 = (bSp2 = sMa3.field_373a3ed_Dne.method_b78565d7_FWm(f = 0.3f, f, f)).method_38be674_Dne(chN2, chN3)) == null || !((d2 = chN2.method_7af7d96d_FWm(wHH3.field_3746303_Dne)) < d) && d != 0.0) continue;
                sMa2 = sMa3;
                d = d2;
            }
            if (sMa2 != null) {
                wHH2 = new wHH(sMa2);
            }
            if (wHH2 != null) {
                this.method_c1ff67d0_Dne(wHH2);
            }
            this.field_2f0dd3_div += this.field_291868_XHL;
            this.field_22c5fd_IjH += this.field_2a9ad1_Zpi;
            this.field_334487_mrb += this.field_31b811_kGO;
            float f = geR.method_ce7f4ad4_Dne(this.field_291868_XHL * this.field_291868_XHL + this.field_31b811_kGO * this.field_31b811_kGO);
            this.field_334489_mrb = (float)(Math.atan2(this.field_31b811_kGO, this.field_291868_XHL) * 180.0 / Math.PI) + 90.0f;
            this.field_29186a_XHL = (float)(Math.atan2(f, this.field_2a9ad1_Zpi) * 180.0 / Math.PI) - 90.0f;
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
            float f2 = this.method_ae128db7_bzF();
            if (this.method_9feec6c6_Zpi()) {
                for (int i = 0; i < 4; ++i) {
                    float f3 = 0.25f;
                    this.field_36c4f18_Dne.method_8600ec24_Dne("bubble", this.field_2f0dd3_div - this.field_291868_XHL * (double)f3, this.field_22c5fd_IjH - this.field_2a9ad1_Zpi * (double)f3, this.field_334487_mrb - this.field_31b811_kGO * (double)f3, this.field_291868_XHL, this.field_2a9ad1_Zpi, this.field_31b811_kGO);
                }
                f2 = 0.8f;
            }
            this.field_291868_XHL += this.field_2092a9_Dne;
            this.field_2a9ad1_Zpi += this.field_212608_FWm;
            this.field_31b811_kGO += this.field_2e5f16_bzF;
            this.field_291868_XHL *= (double)f2;
            this.field_2a9ad1_Zpi *= (double)f2;
            this.field_31b811_kGO *= (double)f2;
            this.field_36c4f18_Dne.method_8600ec24_Dne("smoke", this.field_2f0dd3_div, this.field_22c5fd_IjH + 0.5, this.field_334487_mrb, 0.0, 0.0, 0.0);
            this.method_2961957_bzF(this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb);
        }
    }

    public Tdr(Qnq qnq, double d, double d2, double d3, double d4, double d5, double d6) {
        super(qnq);
        this.method_16b621a_Dne(1.0f, 1.0f);
        this.method_9ce0fc65_FWm(d, d2, d3, this.field_334489_mrb, this.field_29186a_XHL);
        this.method_2961957_bzF(d, d2, d3);
        double d7 = geR.method_ce7f4ad4_Dne(d4 * d4 + d5 * d5 + d6 * d6);
        this.field_2092a9_Dne = d4 / d7 * 0.1;
        this.field_212608_FWm = d5 / d7 * 0.1;
        this.field_2e5f16_bzF = d6 / d7 * 0.1;
    }

    public Tdr(Qnq qnq) {
        super(qnq);
        this.method_16b621a_Dne(1.0f, 1.0f);
    }

    @Override
    public int method_ce7f5259_Dne(float f) {
        return 0xF000F0;
    }

    protected float method_ae128db7_bzF() {
        return 0.95f;
    }

    @Override
    public void method_8d4fb917_Dne(WkD wkD) {
        wkD.method_5ab47529_Dne("xTile", (short)this.field_2092ae_Dne);
        wkD.method_5ab47529_Dne("yTile", (short)this.field_21260d_FWm);
        wkD.method_5ab47529_Dne("zTile", (short)this.field_2e5f1b_bzF);
        wkD.method_5ab43558_Dne("inTile", (byte)this.field_267cf5_Qnq);
        wkD.method_5ab43558_Dne("inGround", (byte)(this.field_2092bf_Dne ? 1 : 0));
        wkD.method_58996597_Dne("direction", this.method_d5ab194f_Dne(this.field_291868_XHL, this.field_2a9ad1_Zpi, this.field_31b811_kGO));
    }

    @Override
    protected void method_7c6f6039_FWm() {
    }

    @Override
    public boolean method_147b2066_Dne(zBn zBn2, int n) {
        if (this.method_7c861acb_EyB()) {
            return false;
        }
        this.method_c19d9a09_oIf();
        if (zBn2.method_f88b2463_FWm() != null) {
            chN chN2 = zBn2.method_f88b2463_FWm().method_230df162_Dne();
            if (chN2 != null) {
                this.field_291868_XHL = chN2.field_2092a9_Dne;
                this.field_2a9ad1_Zpi = chN2.field_212608_FWm;
                this.field_31b811_kGO = chN2.field_2e5f16_bzF;
                this.field_2092a9_Dne = this.field_291868_XHL * 0.1;
                this.field_212608_FWm = this.field_2a9ad1_Zpi * 0.1;
                this.field_2e5f16_bzF = this.field_31b811_kGO * 0.1;
            }
            if (zBn2.method_f88b2463_FWm() instanceof FUH) {
                this.field_366ec33_Dne = (FUH)zBn2.method_f88b2463_FWm();
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean method_baa39406_kGO() {
        return true;
    }

    @Override
    public float method_7a46288a_Dne() {
        return 0.0f;
    }

    public Tdr(Qnq qnq, FUH fUH, double d, double d2, double d3) {
        super(qnq);
        this.field_366ec33_Dne = fUH;
        this.method_16b621a_Dne(1.0f, 1.0f);
        this.method_9ce0fc65_FWm(fUH.field_2f0dd3_div, fUH.field_22c5fd_IjH, fUH.field_334487_mrb, fUH.field_334489_mrb, fUH.field_29186a_XHL);
        this.method_2961957_bzF(this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb);
        this.field_36b0a6_udO = 0.0f;
        this.field_31b811_kGO = 0.0;
        this.field_2a9ad1_Zpi = 0.0;
        this.field_291868_XHL = 0.0;
        double d4 = geR.method_ce7f4ad4_Dne((d += this.field_7331eae7_Dne.nextGaussian() * 0.4) * d + (d2 += this.field_7331eae7_Dne.nextGaussian() * 0.4) * d2 + (d3 += this.field_7331eae7_Dne.nextGaussian() * 0.4) * d3);
        this.field_2092a9_Dne = d / d4 * 0.1;
        this.field_212608_FWm = d2 / d4 * 0.1;
        this.field_2e5f16_bzF = d3 / d4 * 0.1;
    }

    protected abstract void method_c1ff67d0_Dne(wHH var1);

    @Override
    public void method_66a36cd8_FWm(WkD wkD) {
        this.field_2092ae_Dne = wkD.method_8f501fe1_Dne("xTile");
        this.field_21260d_FWm = wkD.method_8f501fe1_Dne("yTile");
        this.field_2e5f1b_bzF = wkD.method_8f501fe1_Dne("zTile");
        this.field_267cf5_Qnq = wkD.method_8f501fd0_Dne("inTile") & 0xFF;
        boolean bl = this.field_2092bf_Dne = wkD.method_8f501fd0_Dne("inGround") == 1;
        if (wkD.method_8f501fe8_Dne("direction")) {
            mbZ mbZ2 = wkD.method_285baa50_Dne("direction");
            this.field_291868_XHL = ((kJU)mbZ2.method_77d0d055_FWm((int)0)).field_2092a9_Dne;
            this.field_2a9ad1_Zpi = ((kJU)mbZ2.method_77d0d055_FWm((int)1)).field_2092a9_Dne;
            this.field_31b811_kGO = ((kJU)mbZ2.method_77d0d055_FWm((int)2)).field_2092a9_Dne;
        } else {
            this.method_5d73f9d_g_();
        }
    }

    @Override
    public float method_907a9d11_Qnq() {
        return 1.0f;
    }

    @Override
    public boolean method_ce7f4ae8_Dne(double d) {
        double d2 = this.field_373a3ed_Dne.method_7a462888_Dne() * 4.0;
        return d < (d2 *= 64.0) * d2;
    }
}

