package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class cQz
extends sMa {
    public sMa field_75c313d2_bzF = null;
    private double field_28e7f8_Vxn;
    private int field_267cf5_Qnq = -1;
    private double field_34856d_qLR;
    private double field_212c16_EyB;
    private double field_2e5f16_bzF;
    private int field_2e5f1b_bzF = -1;
    private int field_28e7fd_Vxn = 0;
    private double field_2e8481_ceE;
    private int field_21260d_FWm = -1;
    private int field_212c1b_EyB = 0;
    private int field_215b36_FfS = 0;
    private double field_212608_FWm;
    private boolean field_2092bf_Dne = false;
    private double field_2092a9_Dne;
    public FiG field_3673728_Dne;
    private int field_2e8486_ceE;
    private double field_1ed012_ATE;
    private int field_2569d5_OdI;
    public int field_2092ae_Dne = 0;

    public cQz(Qnq qnq) {
        super(qnq);
        this.method_16b621a_Dne(0.25f, 0.25f);
        this.field_348583_qLR = true;
    }

    public int method_7a46288d_Dne() {
        if (this.field_36c4f18_Dne.field_2d2a05_aFZ) {
            return 0;
        }
        int n = 0;
        if (this.field_75c313d2_bzF != null) {
            double d = this.field_3673728_Dne.field_2f0dd3_div - this.field_2f0dd3_div;
            double d2 = this.field_3673728_Dne.field_22c5fd_IjH - this.field_22c5fd_IjH;
            double d3 = this.field_3673728_Dne.field_334487_mrb - this.field_334487_mrb;
            double d4 = geR.method_ce7f4ad4_Dne(d * d + d2 * d2 + d3 * d3);
            double d5 = 0.1;
            this.field_75c313d2_bzF.field_291868_XHL += d * d5;
            this.field_75c313d2_bzF.field_2a9ad1_Zpi += d2 * d5 + (double)geR.method_ce7f4ad4_Dne(d4) * 0.08;
            this.field_75c313d2_bzF.field_31b811_kGO += d3 * d5;
            n = 3;
        } else if (this.field_215b36_FfS > 0) {
            JiM jiM = new JiM(this.field_36c4f18_Dne, this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb, new NMq(dEr.field_a76dd0d0_Zlx));
            double d = this.field_3673728_Dne.field_2f0dd3_div - this.field_2f0dd3_div;
            double d6 = this.field_3673728_Dne.field_22c5fd_IjH - this.field_22c5fd_IjH;
            double d7 = this.field_3673728_Dne.field_334487_mrb - this.field_334487_mrb;
            double d8 = geR.method_ce7f4ad4_Dne(d * d + d6 * d6 + d7 * d7);
            double d9 = 0.1;
            jiM.field_291868_XHL = d * d9;
            jiM.field_2a9ad1_Zpi = d6 * d9 + (double)geR.method_ce7f4ad4_Dne(d8) * 0.08;
            jiM.field_31b811_kGO = d7 * d9;
            this.field_36c4f18_Dne.method_94d18be5_FWm(jiM);
            this.field_3673728_Dne.method_df3461c5_Dne(trP.field_395329ea_OdI, 1);
            this.field_3673728_Dne.field_36c4f18_Dne.method_94d18be5_FWm(new alg(this.field_3673728_Dne.field_36c4f18_Dne, this.field_3673728_Dne.field_2f0dd3_div, this.field_3673728_Dne.field_22c5fd_IjH + 0.5, this.field_3673728_Dne.field_334487_mrb + 0.5, this.field_7331eae7_Dne.nextInt(6) + 1));
            n = 1;
        }
        if (this.field_2092bf_Dne) {
            n = 2;
        }
        this.method_5d73f9d_g_();
        this.field_3673728_Dne.field_3741200_Dne = null;
        return n;
    }

    public cQz(Qnq qnq, double d, double d2, double d3, FiG fiG) {
        this(qnq);
        this.method_2961957_bzF(d, d2, d3);
        this.field_348583_qLR = true;
        this.field_3673728_Dne = fiG;
        fiG.field_3741200_Dne = this;
    }

    @Override
    public void method_7a46289a_Dne() {
        super.method_7a46289a_Dne();
        if (this.field_2569d5_OdI > 0) {
            double d = this.field_2f0dd3_div + (this.field_2092a9_Dne - this.field_2f0dd3_div) / (double)this.field_2569d5_OdI;
            double d2 = this.field_22c5fd_IjH + (this.field_212608_FWm - this.field_22c5fd_IjH) / (double)this.field_2569d5_OdI;
            double d3 = this.field_334487_mrb + (this.field_2e5f16_bzF - this.field_334487_mrb) / (double)this.field_2569d5_OdI;
            double d4 = geR.method_ce7f4ad2_Dne(this.field_34856d_qLR - (double)this.field_334489_mrb);
            this.field_334489_mrb = (float)((double)this.field_334489_mrb + d4 / (double)this.field_2569d5_OdI);
            this.field_29186a_XHL = (float)((double)this.field_29186a_XHL + (this.field_1ed012_ATE - (double)this.field_29186a_XHL) / (double)this.field_2569d5_OdI);
            --this.field_2569d5_OdI;
            this.method_2961957_bzF(d, d2, d3);
            this.method_1e252df9_FWm(this.field_334489_mrb, this.field_29186a_XHL);
        } else {
            double d;
            if (!this.field_36c4f18_Dne.field_2d2a05_aFZ) {
                NMq nMq = this.field_3673728_Dne.method_22900b26_bzF();
                if (this.field_3673728_Dne.field_2a9ae7_Zpi || !this.field_3673728_Dne.method_cd4cb3d9_udO() || nMq == null || nMq.method_230de6ba_Dne() != dEr.field_37c7eec_Dne || this.method_bb7dd80e_Dne(this.field_3673728_Dne) > 1024.0) {
                    this.method_5d73f9d_g_();
                    this.field_3673728_Dne.field_3741200_Dne = null;
                    return;
                }
                if (this.field_75c313d2_bzF != null) {
                    if (!this.field_75c313d2_bzF.field_2a9ae7_Zpi) {
                        this.field_2f0dd3_div = this.field_75c313d2_bzF.field_2f0dd3_div;
                        this.field_22c5fd_IjH = this.field_75c313d2_bzF.field_373a3ed_Dne.field_212608_FWm + (double)this.field_75c313d2_bzF.field_367151_trS * 0.8;
                        this.field_334487_mrb = this.field_75c313d2_bzF.field_334487_mrb;
                        return;
                    }
                    this.field_75c313d2_bzF = null;
                }
            }
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
            sMa sMa2 = null;
            List list = this.field_36c4f18_Dne.method_71df22e6_FWm(this, this.field_373a3ed_Dne.method_e44f9e56_Dne(this.field_291868_XHL, this.field_2a9ad1_Zpi, this.field_31b811_kGO).method_b78565d7_FWm(1.0, 1.0, 1.0));
            double d5 = 0.0;
            for (int i = 0; i < list.size(); ++i) {
                float f;
                bSp bSp2;
                wHH wHH3;
                sMa sMa3 = (sMa)list.get(i);
                if (!sMa3.method_baa39406_kGO() || sMa3 == this.field_3673728_Dne && this.field_212c1b_EyB < 5 || (wHH3 = (bSp2 = sMa3.field_373a3ed_Dne.method_b78565d7_FWm(f = 0.3f, f, f)).method_38be674_Dne(chN2, chN3)) == null || !((d = chN2.method_7af7d96d_FWm(wHH3.field_3746303_Dne)) < d5) && d5 != 0.0) continue;
                sMa2 = sMa3;
                d5 = d;
            }
            if (sMa2 != null) {
                wHH2 = new wHH(sMa2);
            }
            if (wHH2 != null) {
                if (wHH2.field_37b45e5_Dne != null) {
                    if (wHH2.field_37b45e5_Dne.method_147b2066_Dne(zBn.method_d9aebee5_Dne(this, this.field_3673728_Dne), 0)) {
                        this.field_75c313d2_bzF = wHH2.field_37b45e5_Dne;
                    }
                } else {
                    this.field_2092bf_Dne = true;
                }
            }
            if (!this.field_2092bf_Dne) {
                int n;
                this.method_2be429a4_Dne(this.field_291868_XHL, this.field_2a9ad1_Zpi, this.field_31b811_kGO);
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
                float f2 = 0.92f;
                if (this.field_2d2a05_aFZ || this.field_388db7_zGp) {
                    f2 = 0.5f;
                }
                int n2 = 5;
                double d6 = 0.0;
                for (n = 0; n < n2; ++n) {
                    double d7 = this.field_373a3ed_Dne.field_212608_FWm + (this.field_373a3ed_Dne.field_2d29ef_aFZ - this.field_373a3ed_Dne.field_212608_FWm) * (double)(n + 0) / (double)n2 - 0.125 + 0.125;
                    double d8 = this.field_373a3ed_Dne.field_212608_FWm + (this.field_373a3ed_Dne.field_2d29ef_aFZ - this.field_373a3ed_Dne.field_212608_FWm) * (double)(n + 1) / (double)n2 - 0.125 + 0.125;
                    bSp bSp3 = bSp.method_23186cf1_Dne().method_b4ea3e0c_Dne(this.field_373a3ed_Dne.field_2092a9_Dne, d7, this.field_373a3ed_Dne.field_2e5f16_bzF, this.field_373a3ed_Dne.field_267cf0_Qnq, d8, this.field_373a3ed_Dne.field_388da1_zGp);
                    if (!this.field_36c4f18_Dne.method_2aa891f3_FWm(bSp3, KFd.field_1411d34d_div)) continue;
                    d6 += 1.0 / (double)n2;
                }
                if (d6 > 0.0) {
                    if (this.field_215b36_FfS > 0) {
                        --this.field_215b36_FfS;
                    } else {
                        n = 500;
                        if (this.field_36c4f18_Dne.method_f2b15eb2_udO(geR.method_117d0718_FWm(this.field_2f0dd3_div), geR.method_117d0718_FWm(this.field_22c5fd_IjH) + 1, geR.method_117d0718_FWm(this.field_334487_mrb))) {
                            n = 300;
                        }
                        if (this.field_7331eae7_Dne.nextInt(n) == 0) {
                            float f3;
                            this.field_215b36_FfS = this.field_7331eae7_Dne.nextInt(30) + 10;
                            this.field_2a9ad1_Zpi -= (double)0.2f;
                            this.method_fbd4aee4_Dne("random.splash", 0.25f, 1.0f + (this.field_7331eae7_Dne.nextFloat() - this.field_7331eae7_Dne.nextFloat()) * 0.4f);
                            float f4 = geR.method_117d0718_FWm(this.field_373a3ed_Dne.field_212608_FWm);
                            int n3 = 0;
                            while ((float)n3 < 1.0f + this.field_342261_ooe * 20.0f) {
                                f3 = (this.field_7331eae7_Dne.nextFloat() * 2.0f - 1.0f) * this.field_342261_ooe;
                                float f5 = (this.field_7331eae7_Dne.nextFloat() * 2.0f - 1.0f) * this.field_342261_ooe;
                                this.field_36c4f18_Dne.method_8600ec24_Dne("bubble", this.field_2f0dd3_div + (double)f3, f4 + 1.0f, this.field_334487_mrb + (double)f5, this.field_291868_XHL, this.field_2a9ad1_Zpi - (double)(this.field_7331eae7_Dne.nextFloat() * 0.2f), this.field_31b811_kGO);
                                ++n3;
                            }
                            n3 = 0;
                            while ((float)n3 < 1.0f + this.field_342261_ooe * 20.0f) {
                                f3 = (this.field_7331eae7_Dne.nextFloat() * 2.0f - 1.0f) * this.field_342261_ooe;
                                float f6 = (this.field_7331eae7_Dne.nextFloat() * 2.0f - 1.0f) * this.field_342261_ooe;
                                this.field_36c4f18_Dne.method_8600ec24_Dne("splash", this.field_2f0dd3_div + (double)f3, f4 + 1.0f, this.field_334487_mrb + (double)f6, this.field_291868_XHL, this.field_2a9ad1_Zpi, this.field_31b811_kGO);
                                ++n3;
                            }
                        }
                    }
                }
                if (this.field_215b36_FfS > 0) {
                    this.field_2a9ad1_Zpi -= (double)(this.field_7331eae7_Dne.nextFloat() * this.field_7331eae7_Dne.nextFloat() * this.field_7331eae7_Dne.nextFloat()) * 0.2;
                }
                d = d6 * 2.0 - 1.0;
                this.field_2a9ad1_Zpi += (double)0.04f * d;
                if (d6 > 0.0) {
                    f2 = (float)((double)f2 * 0.9);
                    this.field_2a9ad1_Zpi *= 0.8;
                }
                this.field_291868_XHL *= (double)f2;
                this.field_2a9ad1_Zpi *= (double)f2;
                this.field_31b811_kGO *= (double)f2;
                this.method_2961957_bzF(this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb);
            }
        }
    }

    @Override
    public void method_76912e1e_aFZ(double d, double d2, double d3) {
        this.field_28e7f8_Vxn = this.field_291868_XHL = d;
        this.field_2e8481_ceE = this.field_2a9ad1_Zpi = d2;
        this.field_212c16_EyB = this.field_31b811_kGO = d3;
    }

    @Override
    protected void method_7c6f6039_FWm() {
    }

    @Override
    public boolean method_ce7f4ae8_Dne(double d) {
        double d2 = this.field_373a3ed_Dne.method_7a462888_Dne() * 4.0;
        return d < (d2 *= 64.0) * d2;
    }

    @Override
    public void method_66a36cd8_FWm(WkD wkD) {
        this.field_21260d_FWm = wkD.method_8f501fe1_Dne("xTile");
        this.field_2e5f1b_bzF = wkD.method_8f501fe1_Dne("yTile");
        this.field_267cf5_Qnq = wkD.method_8f501fe1_Dne("zTile");
        this.field_28e7fd_Vxn = wkD.method_8f501fd0_Dne("inTile") & 0xFF;
        this.field_2092ae_Dne = wkD.method_8f501fd0_Dne("shake") & 0xFF;
        this.field_2092bf_Dne = wkD.method_8f501fd0_Dne("inGround") == 1;
    }

    @Override
    public void method_ae1c3edf_Dne(double d, double d2, double d3, float f, float f2, int n) {
        this.field_2092a9_Dne = d;
        this.field_212608_FWm = d2;
        this.field_2e5f16_bzF = d3;
        this.field_34856d_qLR = f;
        this.field_1ed012_ATE = f2;
        this.field_2569d5_OdI = n;
        this.field_291868_XHL = this.field_28e7f8_Vxn;
        this.field_2a9ad1_Zpi = this.field_2e8481_ceE;
        this.field_31b811_kGO = this.field_212c16_EyB;
    }

    public cQz(Qnq qnq, FiG fiG) {
        super(qnq);
        this.field_348583_qLR = true;
        this.field_3673728_Dne = fiG;
        this.field_3673728_Dne.field_3741200_Dne = this;
        this.method_16b621a_Dne(0.25f, 0.25f);
        this.method_9ce0fc65_FWm(fiG.field_2f0dd3_div, fiG.field_22c5fd_IjH + 1.62 - (double)fiG.field_36b0a6_udO, fiG.field_334487_mrb, fiG.field_334489_mrb, fiG.field_29186a_XHL);
        this.field_2f0dd3_div -= (double)(geR.method_117d0e97_FWm(this.field_334489_mrb / 180.0f * (float)Math.PI) * 0.16f);
        this.field_22c5fd_IjH -= (double)0.1f;
        this.field_334487_mrb -= (double)(geR.method_ce7f5256_Dne(this.field_334489_mrb / 180.0f * (float)Math.PI) * 0.16f);
        this.method_2961957_bzF(this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb);
        this.field_36b0a6_udO = 0.0f;
        float f = 0.4f;
        this.field_291868_XHL = -geR.method_ce7f5256_Dne(this.field_334489_mrb / 180.0f * (float)Math.PI) * geR.method_117d0e97_FWm(this.field_29186a_XHL / 180.0f * (float)Math.PI) * f;
        this.field_31b811_kGO = geR.method_117d0e97_FWm(this.field_334489_mrb / 180.0f * (float)Math.PI) * geR.method_117d0e97_FWm(this.field_29186a_XHL / 180.0f * (float)Math.PI) * f;
        this.field_2a9ad1_Zpi = -geR.method_ce7f5256_Dne(this.field_29186a_XHL / 180.0f * (float)Math.PI) * f;
        this.method_b5821797_bzF(this.field_291868_XHL, this.field_2a9ad1_Zpi, this.field_31b811_kGO, 1.5f, 1.0f);
    }

    @Override
    public void method_8d4fb917_Dne(WkD wkD) {
        wkD.method_5ab47529_Dne("xTile", (short)this.field_21260d_FWm);
        wkD.method_5ab47529_Dne("yTile", (short)this.field_2e5f1b_bzF);
        wkD.method_5ab47529_Dne("zTile", (short)this.field_267cf5_Qnq);
        wkD.method_5ab43558_Dne("inTile", (byte)this.field_28e7fd_Vxn);
        wkD.method_5ab43558_Dne("shake", (byte)this.field_2092ae_Dne);
        wkD.method_5ab43558_Dne("inGround", (byte)(this.field_2092bf_Dne ? 1 : 0));
    }

    @Override
    public void method_5d73f9d_g_() {
        super.method_5d73f9d_g_();
        if (this.field_3673728_Dne != null) {
            this.field_3673728_Dne.field_3741200_Dne = null;
        }
    }

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

    @Override
    public float method_7a46288a_Dne() {
        return 0.0f;
    }
}

