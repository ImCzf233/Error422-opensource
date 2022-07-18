package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public abstract class VHz
extends sMa
implements vaR {
    private int field_267cf5_Qnq = -1;
    private int field_2e8486_ceE;
    public int field_2092ae_Dne = 0;
    private FUH field_366ec33_Dne;
    private int field_28e7fd_Vxn = 0;
    private int field_21260d_FWm = -1;
    private String field_c480ca78_bzF = null;
    protected boolean field_2092bf_Dne = false;
    private int field_212c1b_EyB = 0;
    private int field_2e5f1b_bzF = -1;

    protected float method_7ad387f3_DyG() {
        return 0.03f;
    }

    @Override
    public boolean method_ce7f4ae8_Dne(double d) {
        double d2 = this.field_373a3ed_Dne.method_7a462888_Dne() * 4.0;
        return d < (d2 *= 64.0) * d2;
    }

    @Override
    public void method_b5821797_bzF(double d, double d2, double d3, float f, float f2) {
        float f3 = geR.method_ce7f4ad4_Dne(d * d + d2 * d2 + d3 * d3);
        d /= (double)f3;
        d2 /= (double)f3;
        d3 /= (double)f3;
        d += this.field_7331eae7_Dne.nextGaussian() * (double)0.0075f * (double)f2;
        d2 += this.field_7331eae7_Dne.nextGaussian() * (double)0.0075f * (double)f2;
        d3 += this.field_7331eae7_Dne.nextGaussian() * (double)0.0075f * (double)f2;
        this.field_291868_XHL = d *= (double)f;
        this.field_2a9ad1_Zpi = d2 *= (double)f;
        this.field_31b811_kGO = d3 *= (double)f;
        float f4 = geR.method_ce7f4ad4_Dne(d * d + d3 * d3);
        this.field_2a9ad3_Zpi = this.field_334489_mrb = (float)(Math.atan2(d, d3) * 180.0 / Math.PI);
        this.field_31b813_kGO = this.field_29186a_XHL = (float)(Math.atan2(d2, f4) * 180.0 / Math.PI);
        this.field_2e8486_ceE = 0;
    }

    protected float method_d44b4582_zGp() {
        return 0.0f;
    }

    public VHz(Qnq qnq) {
        super(qnq);
        this.method_16b621a_Dne(0.25f, 0.25f);
    }

    @Override
    public void method_8d4fb917_Dne(WkD wkD) {
        wkD.method_5ab47529_Dne("xTile", (short)this.field_21260d_FWm);
        wkD.method_5ab47529_Dne("yTile", (short)this.field_2e5f1b_bzF);
        wkD.method_5ab47529_Dne("zTile", (short)this.field_267cf5_Qnq);
        wkD.method_5ab43558_Dne("inTile", (byte)this.field_28e7fd_Vxn);
        wkD.method_5ab43558_Dne("shake", (byte)this.field_2092ae_Dne);
        wkD.method_5ab43558_Dne("inGround", (byte)(this.field_2092bf_Dne ? 1 : 0));
        if ((this.field_c480ca78_bzF == null || this.field_c480ca78_bzF.length() == 0) && this.field_366ec33_Dne != null && this.field_366ec33_Dne instanceof FiG) {
            this.field_c480ca78_bzF = this.field_366ec33_Dne.method_eecad346_Dne();
        }
        wkD.method_abaa98ae_Dne("ownerName", this.field_c480ca78_bzF == null ? "" : this.field_c480ca78_bzF);
    }

    @Override
    protected void method_7c6f6039_FWm() {
    }

    public VHz(Qnq qnq, FUH fUH) {
        super(qnq);
        this.field_366ec33_Dne = fUH;
        this.method_16b621a_Dne(0.25f, 0.25f);
        this.method_9ce0fc65_FWm(fUH.field_2f0dd3_div, fUH.field_22c5fd_IjH + (double)fUH.method_59ee189_c_(), fUH.field_334487_mrb, fUH.field_334489_mrb, fUH.field_29186a_XHL);
        this.field_2f0dd3_div -= (double)(geR.method_117d0e97_FWm(this.field_334489_mrb / 180.0f * (float)Math.PI) * 0.16f);
        this.field_22c5fd_IjH -= (double)0.1f;
        this.field_334487_mrb -= (double)(geR.method_ce7f5256_Dne(this.field_334489_mrb / 180.0f * (float)Math.PI) * 0.16f);
        this.method_2961957_bzF(this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb);
        this.field_36b0a6_udO = 0.0f;
        float f = 0.4f;
        this.field_291868_XHL = -geR.method_ce7f5256_Dne(this.field_334489_mrb / 180.0f * (float)Math.PI) * geR.method_117d0e97_FWm(this.field_29186a_XHL / 180.0f * (float)Math.PI) * f;
        this.field_31b811_kGO = geR.method_117d0e97_FWm(this.field_334489_mrb / 180.0f * (float)Math.PI) * geR.method_117d0e97_FWm(this.field_29186a_XHL / 180.0f * (float)Math.PI) * f;
        this.field_2a9ad1_Zpi = -geR.method_ce7f5256_Dne((this.field_29186a_XHL + this.method_d44b4582_zGp()) / 180.0f * (float)Math.PI) * f;
        this.method_b5821797_bzF(this.field_291868_XHL, this.field_2a9ad1_Zpi, this.field_31b811_kGO, this.method_ae128db7_bzF(), 1.0f);
    }

    public VHz(Qnq qnq, double d, double d2, double d3) {
        super(qnq);
        this.field_2e8486_ceE = 0;
        this.method_16b621a_Dne(0.25f, 0.25f);
        this.method_2961957_bzF(d, d2, d3);
        this.field_36b0a6_udO = 0.0f;
    }

    public FUH method_23007a92_Dne() {
        if (this.field_366ec33_Dne == null && this.field_c480ca78_bzF != null && this.field_c480ca78_bzF.length() > 0) {
            this.field_366ec33_Dne = this.field_36c4f18_Dne.method_284a07d1_Dne(this.field_c480ca78_bzF);
        }
        return this.field_366ec33_Dne;
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
        }
    }

    protected abstract void method_c1ff67d0_Dne(wHH var1);

    @Override
    public void method_66a36cd8_FWm(WkD wkD) {
        this.field_21260d_FWm = wkD.method_8f501fe1_Dne("xTile");
        this.field_2e5f1b_bzF = wkD.method_8f501fe1_Dne("yTile");
        this.field_267cf5_Qnq = wkD.method_8f501fe1_Dne("zTile");
        this.field_28e7fd_Vxn = wkD.method_8f501fd0_Dne("inTile") & 0xFF;
        this.field_2092ae_Dne = wkD.method_8f501fd0_Dne("shake") & 0xFF;
        this.field_2092bf_Dne = wkD.method_8f501fd0_Dne("inGround") == 1;
        this.field_c480ca78_bzF = wkD.method_39193c_Dne("ownerName");
        if (this.field_c480ca78_bzF != null && this.field_c480ca78_bzF.length() == 0) {
            this.field_c480ca78_bzF = null;
        }
    }

    @Override
    public float method_7a46288a_Dne() {
        return 0.0f;
    }

    @Override
    public void method_7a46289a_Dne() {
        this.field_36b0a4_udO = this.field_2f0dd3_div;
        this.field_34225f_ooe = this.field_22c5fd_IjH;
        this.field_36714f_trS = this.field_334487_mrb;
        super.method_7a46289a_Dne();
        if (this.field_2092ae_Dne > 0) {
            --this.field_2092ae_Dne;
        }
        if (this.field_2092bf_Dne) {
            int n = this.field_36c4f18_Dne.method_2c2cf7bc_Dne(this.field_21260d_FWm, this.field_2e5f1b_bzF, this.field_267cf5_Qnq);
            if (n == this.field_28e7fd_Vxn) {
                ++this.field_2e8486_ceE;
                if (this.field_2e8486_ceE == 1200) {
                    this.method_5d73f9d_g_();
                }
                return;
            }
            this.field_2092bf_Dne = false;
            this.field_291868_XHL *= (double)(this.field_7331eae7_Dne.nextFloat() * 0.2f);
            this.field_2a9ad1_Zpi *= (double)(this.field_7331eae7_Dne.nextFloat() * 0.2f);
            this.field_31b811_kGO *= (double)(this.field_7331eae7_Dne.nextFloat() * 0.2f);
            this.field_2e8486_ceE = 0;
            this.field_212c1b_EyB = 0;
        } else {
            ++this.field_212c1b_EyB;
        }
        chN chN2 = this.field_36c4f18_Dne.method_23186a47_Dne().method_e4505d6c_Dne(this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb);
        chN chN3 = this.field_36c4f18_Dne.method_23186a47_Dne().method_e4505d6c_Dne(this.field_2f0dd3_div + this.field_291868_XHL, this.field_22c5fd_IjH + this.field_2a9ad1_Zpi, this.field_334487_mrb + this.field_31b811_kGO);
        wHH wHH2 = this.field_36c4f18_Dne.method_38be674_Dne(chN2, chN3);
        chN2 = this.field_36c4f18_Dne.method_23186a47_Dne().method_e4505d6c_Dne(this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb);
        chN3 = this.field_36c4f18_Dne.method_23186a47_Dne().method_e4505d6c_Dne(this.field_2f0dd3_div + this.field_291868_XHL, this.field_22c5fd_IjH + this.field_2a9ad1_Zpi, this.field_334487_mrb + this.field_31b811_kGO);
        if (wHH2 != null) {
            chN3 = this.field_36c4f18_Dne.method_23186a47_Dne().method_e4505d6c_Dne(wHH2.field_3746303_Dne.field_2092a9_Dne, wHH2.field_3746303_Dne.field_212608_FWm, wHH2.field_3746303_Dne.field_2e5f16_bzF);
        }
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ) {
            sMa sMa2 = null;
            List list = this.field_36c4f18_Dne.method_71df22e6_FWm(this, this.field_373a3ed_Dne.method_e44f9e56_Dne(this.field_291868_XHL, this.field_2a9ad1_Zpi, this.field_31b811_kGO).method_b78565d7_FWm(1.0, 1.0, 1.0));
            double d = 0.0;
            FUH fUH = this.method_23007a92_Dne();
            for (int i = 0; i < list.size(); ++i) {
                double d2;
                float f;
                bSp bSp2;
                wHH wHH3;
                sMa sMa3 = (sMa)list.get(i);
                if (!sMa3.method_baa39406_kGO() || sMa3 == fUH && this.field_212c1b_EyB < 5 || (wHH3 = (bSp2 = sMa3.field_373a3ed_Dne.method_b78565d7_FWm(f = 0.3f, f, f)).method_38be674_Dne(chN2, chN3)) == null || !((d2 = chN2.method_7af7d96d_FWm(wHH3.field_3746303_Dne)) < d) && d != 0.0) continue;
                sMa2 = sMa3;
                d = d2;
            }
            if (sMa2 != null) {
                wHH2 = new wHH(sMa2);
            }
        }
        if (wHH2 != null) {
            if (wHH2.field_376443d_Dne == gks.field_376443d_Dne && this.field_36c4f18_Dne.method_2c2cf7bc_Dne(wHH2.field_2092ae_Dne, wHH2.field_21260d_FWm, wHH2.field_2e5f1b_bzF) == zKP.field_36c4090_Dne.field_21260d_FWm) {
                this.method_7db29412_Fnk();
            } else {
                this.method_c1ff67d0_Dne(wHH2);
            }
        }
        this.field_2f0dd3_div += this.field_291868_XHL;
        this.field_22c5fd_IjH += this.field_2a9ad1_Zpi;
        this.field_334487_mrb += this.field_31b811_kGO;
        float f = geR.method_ce7f4ad4_Dne(this.field_291868_XHL * this.field_291868_XHL + this.field_31b811_kGO * this.field_31b811_kGO);
        this.field_334489_mrb = (float)(Math.atan2(this.field_291868_XHL, this.field_31b811_kGO) * 180.0 / Math.PI);
        this.field_29186a_XHL = (float)(Math.atan2(this.field_2a9ad1_Zpi, f) * 180.0 / Math.PI);
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
        float f2 = 0.99f;
        float f3 = this.method_7ad387f3_DyG();
        if (this.method_9feec6c6_Zpi()) {
            for (int i = 0; i < 4; ++i) {
                float f4 = 0.25f;
                this.field_36c4f18_Dne.method_8600ec24_Dne("bubble", this.field_2f0dd3_div - this.field_291868_XHL * (double)f4, this.field_22c5fd_IjH - this.field_2a9ad1_Zpi * (double)f4, this.field_334487_mrb - this.field_31b811_kGO * (double)f4, this.field_291868_XHL, this.field_2a9ad1_Zpi, this.field_31b811_kGO);
            }
            f2 = 0.8f;
        }
        this.field_291868_XHL *= (double)f2;
        this.field_2a9ad1_Zpi *= (double)f2;
        this.field_31b811_kGO *= (double)f2;
        this.field_2a9ad1_Zpi -= (double)f3;
        this.method_2961957_bzF(this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb);
    }

    protected float method_ae128db7_bzF() {
        return 1.5f;
    }
}

