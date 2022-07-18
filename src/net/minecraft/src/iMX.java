package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class iMX
extends sMa {
    private double field_1ed012_ATE;
    private double field_215b31_FfS;
    private double field_212608_FWm;
    private double field_212c16_EyB;
    private double field_34856d_qLR;
    private double field_2e5f16_bzF;
    private double field_28e7f8_Vxn;
    private double field_2e8481_ceE;
    private double field_2092a9_Dne = 0.07;
    private boolean field_2092bf_Dne = true;
    private int field_2092ae_Dne;

    public void method_143f9e1c_bzF(int n) {
        this.field_378ab08_Dne.method_62ca2346_FWm(18, n);
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return true;
    }

    public iMX(Qnq qnq, double d, double d2, double d3) {
        this(qnq);
        this.method_2961957_bzF(d, d2 + (double)this.field_36b0a6_udO, d3);
        this.field_291868_XHL = 0.0;
        this.field_2a9ad1_Zpi = 0.0;
        this.field_31b811_kGO = 0.0;
        this.field_2d29ef_aFZ = d;
        this.field_388da1_zGp = d2;
        this.field_20b852_DyG = d3;
    }

    @Override
    public float method_7a46288a_Dne() {
        return 0.0f;
    }

    @Override
    protected boolean method_7c6f603d_FWm() {
        return false;
    }

    public void method_ce7f5da9_Dne(int n) {
        this.field_378ab08_Dne.method_62ca2346_FWm(19, n);
    }

    @Override
    public boolean method_21db0ca_a_(FiG fiG) {
        if (this.field_37b45e5_Dne != null && this.field_37b45e5_Dne instanceof FiG && this.field_37b45e5_Dne != fiG) {
            return true;
        }
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ) {
            fiG.method_ad72a713_bzF(this);
        }
        return true;
    }

    @Override
    public void method_b5f30bf3_gnI() {
        this.method_143f9e1c_bzF(-this.method_907a9d14_Qnq());
        this.method_117d19ea_FWm(10);
        this.method_ce7f5da9_Dne(this.method_7a46288d_Dne() * 11);
    }

    @Override
    protected void method_7c6f6039_FWm() {
        this.field_378ab08_Dne.method_ad009545_Dne(17, new Integer(0));
        this.field_378ab08_Dne.method_ad009545_Dne(18, new Integer(1));
        this.field_378ab08_Dne.method_ad009545_Dne(19, new Integer(0));
    }

    public iMX(Qnq qnq) {
        super(qnq);
        this.field_2e5f2c_bzF = true;
        this.method_16b621a_Dne(1.5f, 0.6f);
        this.field_36b0a6_udO = this.field_367151_trS / 2.0f;
    }

    @Override
    public void method_908be33b_RPx() {
        if (this.field_37b45e5_Dne != null) {
            double d = Math.cos((double)this.field_334489_mrb * Math.PI / 180.0) * 0.4;
            double d2 = Math.sin((double)this.field_334489_mrb * Math.PI / 180.0) * 0.4;
            this.field_37b45e5_Dne.method_2961957_bzF(this.field_2f0dd3_div + d, this.field_22c5fd_IjH + this.method_a98a064e_aFZ() + this.field_37b45e5_Dne.method_907a9d0f_Qnq(), this.field_334487_mrb + d2);
        }
    }

    @Override
    protected void method_66a36cd8_FWm(WkD wkD) {
    }

    public int method_ae128dba_bzF() {
        return this.field_378ab08_Dne.method_ce7f5d9c_Dne(17);
    }

    @Override
    public void method_ae1c3edf_Dne(double d, double d2, double d3, float f, float f2, int n) {
        if (this.field_2092bf_Dne) {
            this.field_2092ae_Dne = n + 5;
        } else {
            double d4 = d - this.field_2f0dd3_div;
            double d5 = d2 - this.field_22c5fd_IjH;
            double d6 = d3 - this.field_334487_mrb;
            double d7 = d4 * d4 + d5 * d5 + d6 * d6;
            if (d7 <= 1.0) {
                return;
            }
            this.field_2092ae_Dne = 3;
        }
        this.field_212608_FWm = d;
        this.field_2e5f16_bzF = d2;
        this.field_34856d_qLR = d3;
        this.field_1ed012_ATE = f;
        this.field_28e7f8_Vxn = f2;
        this.field_291868_XHL = this.field_2e8481_ceE;
        this.field_2a9ad1_Zpi = this.field_212c16_EyB;
        this.field_31b811_kGO = this.field_215b31_FfS;
    }

    @Override
    protected void method_8d4fb917_Dne(WkD wkD) {
    }

    public int method_907a9d14_Qnq() {
        return this.field_378ab08_Dne.method_ce7f5d9c_Dne(18);
    }

    public void method_117d59bb_FWm(boolean bl) {
        this.field_2092bf_Dne = bl;
    }

    @Override
    public double method_a98a064e_aFZ() {
        return (double)this.field_367151_trS * 0.0 - (double)0.3f;
    }

    @Override
    public bSp method_230d324c_Dne() {
        return this.field_373a3ed_Dne;
    }

    @Override
    public boolean method_147b2066_Dne(zBn zBn2, int n) {
        if (this.method_7c861acb_EyB()) {
            return false;
        }
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ && !this.field_2a9ae7_Zpi) {
            boolean bl;
            this.method_143f9e1c_bzF(-this.method_907a9d14_Qnq());
            this.method_117d19ea_FWm(10);
            this.method_ce7f5da9_Dne(this.method_7a46288d_Dne() + n * 10);
            this.method_c19d9a09_oIf();
            boolean bl2 = bl = zBn2.method_f88b2463_FWm() instanceof FiG && ((FiG)zBn2.method_f88b2463_FWm()).field_37cb681_Dne.field_267d06_Qnq;
            if (bl || this.method_7a46288d_Dne() > 40) {
                if (this.field_37b45e5_Dne != null) {
                    this.field_37b45e5_Dne.method_ad72a713_bzF(this);
                }
                if (!bl) {
                    this.method_3acd85a9_Dne(dEr.field_3f91c54a_CZC.field_267cf5_Qnq, 1, 0.0f);
                }
                this.method_5d73f9d_g_();
            }
            return true;
        }
        return true;
    }

    public int method_7a46288d_Dne() {
        return this.field_378ab08_Dne.method_ce7f5d9c_Dne(19);
    }

    @Override
    public boolean method_baa39406_kGO() {
        return !this.field_2a9ae7_Zpi;
    }

    @Override
    public void method_76912e1e_aFZ(double d, double d2, double d3) {
        this.field_2e8481_ceE = this.field_291868_XHL = d;
        this.field_212c16_EyB = this.field_2a9ad1_Zpi = d2;
        this.field_215b31_FfS = this.field_31b811_kGO = d3;
    }

    @Override
    public void method_7a46289a_Dne() {
        double d;
        double d2;
        super.method_7a46289a_Dne();
        if (this.method_ae128dba_bzF() > 0) {
            this.method_117d19ea_FWm(this.method_ae128dba_bzF() - 1);
        }
        if (this.method_7a46288d_Dne() > 0) {
            this.method_ce7f5da9_Dne(this.method_7a46288d_Dne() - 1);
        }
        this.field_2d29ef_aFZ = this.field_2f0dd3_div;
        this.field_388da1_zGp = this.field_22c5fd_IjH;
        this.field_20b852_DyG = this.field_334487_mrb;
        int n = 5;
        double d3 = 0.0;
        for (int i = 0; i < n; ++i) {
            double d4 = this.field_373a3ed_Dne.field_212608_FWm + (this.field_373a3ed_Dne.field_2d29ef_aFZ - this.field_373a3ed_Dne.field_212608_FWm) * (double)(i + 0) / (double)n - 0.125;
            double d5 = this.field_373a3ed_Dne.field_212608_FWm + (this.field_373a3ed_Dne.field_2d29ef_aFZ - this.field_373a3ed_Dne.field_212608_FWm) * (double)(i + 1) / (double)n - 0.125;
            bSp bSp2 = bSp.method_23186cf1_Dne().method_b4ea3e0c_Dne(this.field_373a3ed_Dne.field_2092a9_Dne, d4, this.field_373a3ed_Dne.field_2e5f16_bzF, this.field_373a3ed_Dne.field_267cf0_Qnq, d5, this.field_373a3ed_Dne.field_388da1_zGp);
            if (!this.field_36c4f18_Dne.method_2aa891f3_FWm(bSp2, KFd.field_1411d34d_div)) continue;
            d3 += 1.0 / (double)n;
        }
        double d6 = Math.sqrt(this.field_291868_XHL * this.field_291868_XHL + this.field_31b811_kGO * this.field_31b811_kGO);
        if (d6 > 0.26249999999999996) {
            d2 = Math.cos((double)this.field_334489_mrb * Math.PI / 180.0);
            d = Math.sin((double)this.field_334489_mrb * Math.PI / 180.0);
            int n2 = 0;
            while ((double)n2 < 1.0 + d6 * 60.0) {
                double d7;
                double d8;
                double d9 = this.field_7331eae7_Dne.nextFloat() * 2.0f - 1.0f;
                double d10 = (double)(this.field_7331eae7_Dne.nextInt(2) * 2 - 1) * 0.7;
                if (this.field_7331eae7_Dne.nextBoolean()) {
                    d8 = this.field_2f0dd3_div - d2 * d9 * 0.8 + d * d10;
                    d7 = this.field_334487_mrb - d * d9 * 0.8 - d2 * d10;
                    this.field_36c4f18_Dne.method_8600ec24_Dne("splash", d8, this.field_22c5fd_IjH - 0.125, d7, this.field_291868_XHL, this.field_2a9ad1_Zpi, this.field_31b811_kGO);
                } else {
                    d8 = this.field_2f0dd3_div + d2 + d * d9 * 0.7;
                    d7 = this.field_334487_mrb + d - d2 * d9 * 0.7;
                    this.field_36c4f18_Dne.method_8600ec24_Dne("splash", d8, this.field_22c5fd_IjH - 0.125, d7, this.field_291868_XHL, this.field_2a9ad1_Zpi, this.field_31b811_kGO);
                }
                ++n2;
            }
        }
        if (this.field_36c4f18_Dne.field_2d2a05_aFZ && this.field_2092bf_Dne) {
            if (this.field_2092ae_Dne > 0) {
                d2 = this.field_2f0dd3_div + (this.field_212608_FWm - this.field_2f0dd3_div) / (double)this.field_2092ae_Dne;
                d = this.field_22c5fd_IjH + (this.field_2e5f16_bzF - this.field_22c5fd_IjH) / (double)this.field_2092ae_Dne;
                double d11 = this.field_334487_mrb + (this.field_34856d_qLR - this.field_334487_mrb) / (double)this.field_2092ae_Dne;
                double d12 = geR.method_ce7f4ad2_Dne(this.field_1ed012_ATE - (double)this.field_334489_mrb);
                this.field_334489_mrb = (float)((double)this.field_334489_mrb + d12 / (double)this.field_2092ae_Dne);
                this.field_29186a_XHL = (float)((double)this.field_29186a_XHL + (this.field_28e7f8_Vxn - (double)this.field_29186a_XHL) / (double)this.field_2092ae_Dne);
                --this.field_2092ae_Dne;
                this.method_2961957_bzF(d2, d, d11);
                this.method_1e252df9_FWm(this.field_334489_mrb, this.field_29186a_XHL);
            } else {
                d2 = this.field_2f0dd3_div + this.field_291868_XHL;
                d = this.field_22c5fd_IjH + this.field_2a9ad1_Zpi;
                double d13 = this.field_334487_mrb + this.field_31b811_kGO;
                this.method_2961957_bzF(d2, d, d13);
                if (this.field_2d2a05_aFZ) {
                    this.field_291868_XHL *= 0.5;
                    this.field_2a9ad1_Zpi *= 0.5;
                    this.field_31b811_kGO *= 0.5;
                }
                this.field_291868_XHL *= (double)0.99f;
                this.field_2a9ad1_Zpi *= (double)0.95f;
                this.field_31b811_kGO *= (double)0.99f;
            }
        } else {
            double d14;
            if (d3 < 1.0) {
                d2 = d3 * 2.0 - 1.0;
                this.field_2a9ad1_Zpi += (double)0.04f * d2;
            } else {
                if (this.field_2a9ad1_Zpi < 0.0) {
                    this.field_2a9ad1_Zpi /= 2.0;
                }
                this.field_2a9ad1_Zpi += (double)0.007f;
            }
            if (this.field_37b45e5_Dne != null) {
                this.field_291868_XHL += this.field_37b45e5_Dne.field_291868_XHL * this.field_2092a9_Dne;
                this.field_31b811_kGO += this.field_37b45e5_Dne.field_31b811_kGO * this.field_2092a9_Dne;
            }
            if ((d2 = Math.sqrt(this.field_291868_XHL * this.field_291868_XHL + this.field_31b811_kGO * this.field_31b811_kGO)) > 0.35) {
                d = 0.35 / d2;
                this.field_291868_XHL *= d;
                this.field_31b811_kGO *= d;
                d2 = 0.35;
            }
            if (d2 > d6 && this.field_2092a9_Dne < 0.35) {
                this.field_2092a9_Dne += (0.35 - this.field_2092a9_Dne) / 35.0;
                if (this.field_2092a9_Dne > 0.35) {
                    this.field_2092a9_Dne = 0.35;
                }
            } else {
                this.field_2092a9_Dne -= (this.field_2092a9_Dne - 0.07) / 35.0;
                if (this.field_2092a9_Dne < 0.07) {
                    this.field_2092a9_Dne = 0.07;
                }
            }
            if (this.field_2d2a05_aFZ) {
                this.field_291868_XHL *= 0.5;
                this.field_2a9ad1_Zpi *= 0.5;
                this.field_31b811_kGO *= 0.5;
            }
            this.method_2be429a4_Dne(this.field_291868_XHL, this.field_2a9ad1_Zpi, this.field_31b811_kGO);
            if (this.field_388db7_zGp && d6 > 0.2) {
                if (!this.field_36c4f18_Dne.field_2d2a05_aFZ && !this.field_2a9ae7_Zpi) {
                    int n3;
                    this.method_5d73f9d_g_();
                    for (n3 = 0; n3 < 3; ++n3) {
                        this.method_3acd85a9_Dne(zKP.field_5e67d9b4_Qnq.field_21260d_FWm, 1, 0.0f);
                    }
                    for (n3 = 0; n3 < 2; ++n3) {
                        this.method_3acd85a9_Dne(dEr.field_d2b52a0a_oIf.field_267cf5_Qnq, 1, 0.0f);
                    }
                }
            } else {
                this.field_291868_XHL *= (double)0.99f;
                this.field_2a9ad1_Zpi *= (double)0.95f;
                this.field_31b811_kGO *= (double)0.99f;
            }
            this.field_29186a_XHL = 0.0f;
            d = this.field_334489_mrb;
            double d15 = this.field_2d29ef_aFZ - this.field_2f0dd3_div;
            double d16 = this.field_20b852_DyG - this.field_334487_mrb;
            if (d15 * d15 + d16 * d16 > 0.001) {
                d = (float)(Math.atan2(d16, d15) * 180.0 / Math.PI);
            }
            if ((d14 = geR.method_ce7f4ad2_Dne(d - (double)this.field_334489_mrb)) > 20.0) {
                d14 = 20.0;
            }
            if (d14 < -20.0) {
                d14 = -20.0;
            }
            this.field_334489_mrb = (float)((double)this.field_334489_mrb + d14);
            this.method_1e252df9_FWm(this.field_334489_mrb, this.field_29186a_XHL);
            if (!this.field_36c4f18_Dne.field_2d2a05_aFZ) {
                List list = this.field_36c4f18_Dne.method_71df22e6_FWm(this, this.field_373a3ed_Dne.method_b78565d7_FWm(0.2f, 0.0, 0.2f));
                if (list != null && !list.isEmpty()) {
                    for (int i = 0; i < list.size(); ++i) {
                        sMa sMa2 = (sMa)list.get(i);
                        if (sMa2 == this.field_37b45e5_Dne || !sMa2.method_7a46289e_Dne() || !(sMa2 instanceof iMX)) continue;
                        sMa2.method_3e501ff9_Qnq(this);
                    }
                }
                for (int i = 0; i < 4; ++i) {
                    int n4 = geR.method_117d0718_FWm(this.field_2f0dd3_div + ((double)(i % 2) - 0.5) * 0.8);
                    int n5 = geR.method_117d0718_FWm(this.field_334487_mrb + ((double)(i / 2) - 0.5) * 0.8);
                    for (int j = 0; j < 2; ++j) {
                        int n6 = geR.method_117d0718_FWm(this.field_22c5fd_IjH) + j;
                        int n7 = this.field_36c4f18_Dne.method_2c2cf7bc_Dne(n4, n6, n5);
                        if (n7 == zKP.field_23a1e80a_EwP.field_21260d_FWm) {
                            this.field_36c4f18_Dne.method_2e7161e6_Qnq(n4, n6, n5);
                            continue;
                        }
                        if (n7 != zKP.field_a9932c31_gvF.field_21260d_FWm) continue;
                        this.field_36c4f18_Dne.method_5972b42f_Dne(n4, n6, n5, true);
                    }
                }
                if (this.field_37b45e5_Dne != null && this.field_37b45e5_Dne.field_2a9ae7_Zpi) {
                    this.field_37b45e5_Dne = null;
                }
            }
        }
    }

    @Override
    public bSp method_9a35aed2_Dne(sMa sMa2) {
        return sMa2.field_373a3ed_Dne;
    }

    public void method_117d19ea_FWm(int n) {
        this.field_378ab08_Dne.method_62ca2346_FWm(17, n);
    }
}

