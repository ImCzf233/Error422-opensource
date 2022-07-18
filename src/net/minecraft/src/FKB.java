package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.client.Minecraft;

public class FKB
extends FiG {
    public float field_21260a_FWm;
    protected Minecraft field_493682ed_Dne;
    public float field_267cf2_Qnq;
    public float field_2d29f1_aFZ;
    private lSM field_3782b66_Dne = new lSM();
    public float field_2092ab_Dne;
    public float field_2e5f18_bzF;
    public flF field_375ce2c_Dne;
    private lSM field_2031f745_FWm = new lSM();
    public int field_21260d_FWm = 0;
    private lSM field_75bff953_bzF = new lSM();
    public float field_388da3_zGp;
    protected int field_2092ae_Dne = 0;

    @Override
    public void method_b0a28144_div() {
        super.method_b0a28144_div();
        this.field_2a70af_ZfC = this.field_375ce2c_Dne.field_2092ab_Dne;
        this.field_212b3f_FYZ = this.field_375ce2c_Dne.field_21260a_FWm;
        this.field_3393ee_oIf = this.field_375ce2c_Dne.field_2092bf_Dne;
        this.field_2e5f18_bzF = this.field_2092ab_Dne;
        this.field_267cf2_Qnq = this.field_21260a_FWm;
        this.field_21260a_FWm = (float)((double)this.field_21260a_FWm + (double)(this.field_29186a_XHL - this.field_21260a_FWm) * 0.5);
        this.field_2092ab_Dne = (float)((double)this.field_2092ab_Dne + (double)(this.field_334489_mrb - this.field_2092ab_Dne) * 0.5);
    }

    @Override
    public void method_b18f6899_Dne(lqs lqs2) {
        this.field_493682ed_Dne.method_b88fcbd2_Dne(new XGv(this.field_36a059b_Dne, lqs2));
    }

    @Override
    public void method_a6aca7ca_FWm(int n, int n2, int n3) {
        this.field_493682ed_Dne.method_b88fcbd2_Dne(new juA(this.field_36a059b_Dne, this.field_36c4f18_Dne, n, n2, n3));
    }

    @Override
    public void method_2be429a4_Dne(double d, double d2, double d3) {
        super.method_2be429a4_Dne(d, d2, d3);
    }

    public void method_aad4134c_a_(int n) {
        int n2 = this.method_9a443a8c_XHL() - n;
        if (n2 <= 0) {
            this.method_143f9e1c_bzF(n);
            if (n2 < 0) {
                this.field_2f0dd8_div = this.field_2e5f1b_bzF / 2;
            }
        } else {
            this.field_2eafc1_cot = n2;
            this.method_143f9e1c_bzF(this.method_9a443a8c_XHL());
            this.field_2f0dd8_div = this.field_2e5f1b_bzF;
            this.method_147b2062_Dne(zBn.field_7508dfa4_mrb, n2);
            this.field_3393dd_oIf = 10;
            this.field_2569d5_OdI = 10;
        }
    }

    @Override
    public void method_c900b3c7_Dne(zio zio2) {
        this.field_493682ed_Dne.method_b88fcbd2_Dne(new njX(this.field_36a059b_Dne, zio2));
    }

    @Override
    public iSh method_23105fed_Dne() {
        return new iSh(geR.method_117d0718_FWm(this.field_2f0dd3_div + 0.5), geR.method_117d0718_FWm(this.field_22c5fd_IjH + 0.5), geR.method_117d0718_FWm(this.field_334487_mrb + 0.5));
    }

    private boolean method_2dee780_bzF(int n, int n2, int n3) {
        return this.field_36c4f18_Dne.method_6fdef3c4_DyG(n, n2, n3);
    }

    @Override
    public void method_2c2cf7c9_Dne(int n, int n2, int n3) {
        this.field_493682ed_Dne.method_b88fcbd2_Dne(new ThQ(this.field_36a059b_Dne, this.field_36c4f18_Dne, n, n2, n3));
    }

    @Override
    public boolean method_a98a0664_aFZ() {
        return this.field_375ce2c_Dne.field_21261e_FWm && !this.field_36e4eb_vSL;
    }

    @Override
    public void method_7c61cf15_Dne(NMq nMq) {
        dEr dEr2 = nMq.method_230de6ba_Dne();
        if (dEr2 == dEr.field_68a14cb4_CLK) {
            this.field_493682ed_Dne.method_b88fcbd2_Dne(new qTt(this, nMq, false));
        } else if (dEr2 == dEr.field_9a03eeb4_Jjb) {
            this.field_493682ed_Dne.method_b88fcbd2_Dne(new qTt(this, nMq, true));
        }
    }

    @Override
    public void method_c073daf8_mrb() {
        this.field_d9a85c6_FWm = "http://skins.minecraft.net/MinecraftCloaks/" + vCA.method_39193c_Dne(this.field_bc57ecbf_aFZ) + ".png";
    }

    @Override
    public void method_df3461c5_Dne(RLC rLC, int n) {
        if (rLC != null) {
            if (rLC.method_7a46289e_Dne()) {
                auk_0 auk_02 = (auk_0)rLC;
                if (auk_02.field_36522b5_Dne == null || this.field_493682ed_Dne.field_3673fc1_Dne.method_6863c0f4_Dne(auk_02.field_36522b5_Dne)) {
                    if (!this.field_493682ed_Dne.field_3673fc1_Dne.method_6863c0f4_Dne(auk_02)) {
                        this.field_493682ed_Dne.field_36dbda5_Dne.method_6863c0f0_Dne(auk_02);
                    }
                    this.field_493682ed_Dne.field_3673fc1_Dne.method_df3461c5_Dne(rLC, n);
                }
            } else {
                this.field_493682ed_Dne.field_3673fc1_Dne.method_df3461c5_Dne(rLC, n);
            }
        }
    }

    @Override
    public void method_ac4d69ca_Dne(ipD ipD2) {
        if (ipD2 instanceof AjG) {
            this.field_493682ed_Dne.method_b88fcbd2_Dne(new MYL((AjG)ipD2));
        } else if (ipD2 instanceof FgE) {
            this.field_493682ed_Dne.method_b88fcbd2_Dne(new Nvw((FgE)ipD2));
        }
    }

    @Override
    protected boolean method_2be429a8_Dne(double d, double d2, double d3) {
        int n = geR.method_117d0718_FWm(d);
        int n2 = geR.method_117d0718_FWm(d2);
        int n3 = geR.method_117d0718_FWm(d3);
        double d4 = d - (double)n;
        double d5 = d3 - (double)n3;
        if (this.method_2dee780_bzF(n, n2, n3) || this.method_2dee780_bzF(n, n2 + 1, n3)) {
            boolean bl = !this.method_2dee780_bzF(n - 1, n2, n3) && !this.method_2dee780_bzF(n - 1, n2 + 1, n3);
            boolean bl2 = !this.method_2dee780_bzF(n + 1, n2, n3) && !this.method_2dee780_bzF(n + 1, n2 + 1, n3);
            boolean bl3 = !this.method_2dee780_bzF(n, n2, n3 - 1) && !this.method_2dee780_bzF(n, n2 + 1, n3 - 1);
            boolean bl4 = !this.method_2dee780_bzF(n, n2, n3 + 1) && !this.method_2dee780_bzF(n, n2 + 1, n3 + 1);
            int n4 = -1;
            double d6 = 9999.0;
            if (bl && d4 < d6) {
                d6 = d4;
                n4 = 0;
            }
            if (bl2 && 1.0 - d4 < d6) {
                d6 = 1.0 - d4;
                n4 = 1;
            }
            if (bl3 && d5 < d6) {
                d6 = d5;
                n4 = 4;
            }
            if (bl4 && 1.0 - d5 < d6) {
                d6 = 1.0 - d5;
                n4 = 5;
            }
            float f = 0.1f;
            if (n4 == 0) {
                this.field_291868_XHL = -f;
            }
            if (n4 == 1) {
                this.field_291868_XHL = f;
            }
            if (n4 == 4) {
                this.field_31b811_kGO = -f;
            }
            if (n4 == 5) {
                this.field_31b811_kGO = f;
            }
        }
        return false;
    }

    @Override
    public boolean method_fa81cf37_Dne(int n, String string) {
        return n <= 0;
    }

    @Override
    public void method_fbd4aee4_Dne(String string, float f, float f2) {
        this.field_36c4f18_Dne.method_62d7c9a6_Dne(this.field_2f0dd3_div, this.field_22c5fd_IjH - (double)this.field_36b0a6_udO, this.field_334487_mrb, string, f, f2, false);
    }

    @Override
    public void method_aad4531d_a_(boolean bl) {
        super.method_aad4531d_a_(bl);
        this.field_21260d_FWm = bl ? 600 : 0;
    }

    public float method_582b287_a_() {
        float f = 1.0f;
        if (this.field_37cb681_Dne.field_21261e_FWm) {
            f *= 1.1f;
        }
        f *= (this.field_295781_Wwe * this.method_c073dae8_mrb() / this.field_1fcf1a_CZC + 1.0f) / 2.0f;
        if (this.method_b6f3e1a2_haP() && this.method_f87a5498_FWm().field_2e5f1b_bzF == dEr.field_3667432_Dne.field_267cf5_Qnq) {
            int n = this.method_73aaafb6_ATE();
            float f2 = (float)n / 20.0f;
            f2 = f2 > 1.0f ? 1.0f : (f2 *= f2);
            f *= 1.0f - f2 * 0.15f;
        }
        return f;
    }

    public void method_2c02b146_Dne(float f, int n, int n2) {
        this.field_30e9da_iNQ = f;
        this.field_332a64_mlD = n;
        this.field_2f0276_eHV = n2;
    }

    @Override
    public void method_b43d9ee3_Dne(sMa sMa2, int n) {
        this.field_493682ed_Dne.field_364ffb6_Dne.method_68e8f1ab_Dne(new qnx_0((Qnq)this.field_493682ed_Dne.field_36ebf36_Dne, sMa2, this, -0.5f));
    }

    @Override
    public void method_94d18be1_FWm(sMa sMa2) {
        zUL zUL2 = new zUL(this.field_493682ed_Dne.field_36ebf36_Dne, sMa2, "magicCrit");
        this.field_493682ed_Dne.field_364ffb6_Dne.method_68e8f1ab_Dne(zUL2);
    }

    @Override
    public void method_88b748b3_Dne(UTs uTs) {
        this.field_493682ed_Dne.method_b88fcbd2_Dne(new zyk(this.field_36a059b_Dne, uTs));
    }

    @Override
    public void method_a98a0660_aFZ() {
        super.method_a98a0660_aFZ();
        this.field_493682ed_Dne.method_b88fcbd2_Dne(null);
    }

    @Override
    public void method_47a073d1_bzF(String string) {
        this.field_493682ed_Dne.field_3733694_Dne.method_2312ad69_Dne().method_feb678cd_Dne(string, new Object[0]);
    }

    @Override
    public void method_7c9aa178_Dne(MqS mqS) {
        this.field_493682ed_Dne.method_b88fcbd2_Dne(new ClL(this.field_36a059b_Dne, mqS));
    }

    @Override
    public void method_adf18883_Dne(YzO yzO, String string) {
        this.field_493682ed_Dne.method_b88fcbd2_Dne(new VFk(this.field_36a059b_Dne, yzO, this.field_36c4f18_Dne, string));
    }

    public FKB(Minecraft minecraft, Qnq qnq, vwN vwN2, int n) {
        super(qnq);
        this.field_493682ed_Dne = minecraft;
        this.field_348572_qLR = n;
        if (vwN2 != null && vwN2.field_569fcf45_Dne != null && vwN2.field_569fcf45_Dne.length() > 0) {
            this.field_569fcf45_Dne = "http://skins.minecraft.net/MinecraftSkins/" + vCA.method_39193c_Dne(vwN2.field_569fcf45_Dne) + ".png";
        }
        this.field_bc57ecbf_aFZ = vwN2.field_569fcf45_Dne;
        qxi_0.field_376997d_Dne = null;
    }

    @Override
    public void method_6783319e_Dne(Aem aem) {
        this.field_493682ed_Dne.method_b88fcbd2_Dne(new WOS(this.field_36a059b_Dne, aem));
    }

    @Override
    public NMq method_23040479_Dne() {
        return this.field_36a059b_Dne.method_23040479_Dne();
    }

    @Override
    public void method_af9331b7_Dne(klq klq2) {
        this.field_493682ed_Dne.method_b88fcbd2_Dne(new WOS(this.field_36a059b_Dne, klq2));
    }

    @Override
    public void method_bb7dd820_Dne(sMa sMa2) {
        this.field_493682ed_Dne.field_364ffb6_Dne.method_68e8f1ab_Dne(new zUL(this.field_493682ed_Dne.field_36ebf36_Dne, sMa2));
    }

    @Override
    protected boolean method_907a9d25_Qnq() {
        return true;
    }

    @Override
    public void method_887647a2_Dne(TpA tpA) {
        this.field_493682ed_Dne.method_b88fcbd2_Dne(new wiU(this.field_36a059b_Dne, tpA));
    }

    @Override
    public void method_8288d6ee_IjH() {
        if (this.field_21260d_FWm > 0) {
            --this.field_21260d_FWm;
            if (this.field_21260d_FWm == 0) {
                this.method_aad4531d_a_(false);
            }
        }
        if (this.field_2092ae_Dne > 0) {
            --this.field_2092ae_Dne;
        }
        if (this.field_493682ed_Dne.field_36c390e_Dne.method_7a46289e_Dne()) {
            this.field_334487_mrb = 0.5;
            this.field_2f0dd3_div = 0.5;
            this.field_2f0dd3_div = 0.0;
            this.field_334487_mrb = 0.0;
            this.field_334489_mrb = (float)this.field_388da6_zGp / 12.0f;
            this.field_29186a_XHL = 10.0f;
            this.field_22c5fd_IjH = 68.5;
        } else {
            boolean bl;
            if (!this.field_493682ed_Dne.field_3673fc1_Dne.method_6863c0f4_Dne(qlg.field_36522b5_Dne)) {
                this.field_493682ed_Dne.field_36dbda5_Dne.method_41b774b1_FWm(qlg.field_36522b5_Dne);
            }
            this.field_388da3_zGp = this.field_2d29f1_aFZ;
            if (this.field_28e80e_Vxn) {
                if (this.field_493682ed_Dne.field_37a7e17_Dne != null) {
                    this.field_493682ed_Dne.method_b88fcbd2_Dne(null);
                }
                if (this.field_2d29f1_aFZ == 0.0f) {
                    this.field_493682ed_Dne.field_3788296_Dne.method_fbd4aee4_Dne("portal.trigger", 1.0f, this.field_7331eae7_Dne.nextFloat() * 0.4f + 0.8f);
                }
                this.field_2d29f1_aFZ += 0.0125f;
                if (this.field_2d29f1_aFZ >= 1.0f) {
                    this.field_2d29f1_aFZ = 1.0f;
                }
                this.field_28e80e_Vxn = false;
            } else if (this.method_857f23ec_Dne(SXd.field_74f7768b_mrb) && this.method_a7927c94_Dne(SXd.field_74f7768b_mrb).method_7c6f602c_FWm() > 60) {
                this.field_2d29f1_aFZ += 0.006666667f;
                if (this.field_2d29f1_aFZ > 1.0f) {
                    this.field_2d29f1_aFZ = 1.0f;
                }
            } else {
                if (this.field_2d29f1_aFZ > 0.0f) {
                    this.field_2d29f1_aFZ -= 0.05f;
                }
                if (this.field_2d29f1_aFZ < 0.0f) {
                    this.field_2d29f1_aFZ = 0.0f;
                }
            }
            if (this.field_342264_ooe > 0) {
                --this.field_342264_ooe;
            }
            boolean bl2 = this.field_375ce2c_Dne.field_2092bf_Dne;
            float f = 0.8f;
            boolean bl3 = this.field_375ce2c_Dne.field_21260a_FWm >= f;
            this.field_375ce2c_Dne.method_7a46289a_Dne();
            if (this.method_b6f3e1a2_haP()) {
                this.field_375ce2c_Dne.field_2092ab_Dne *= 0.2f;
                this.field_375ce2c_Dne.field_21260a_FWm *= 0.2f;
                this.field_2092ae_Dne = 0;
            }
            if (this.field_375ce2c_Dne.field_21261e_FWm && this.field_212c18_EyB < 0.2f) {
                this.field_212c18_EyB = 0.2f;
            }
            this.method_2be429a8_Dne(this.field_2f0dd3_div - (double)this.field_342261_ooe * 0.35, this.field_373a3ed_Dne.field_212608_FWm + 0.5, this.field_334487_mrb + (double)this.field_342261_ooe * 0.35);
            this.method_2be429a8_Dne(this.field_2f0dd3_div - (double)this.field_342261_ooe * 0.35, this.field_373a3ed_Dne.field_212608_FWm + 0.5, this.field_334487_mrb - (double)this.field_342261_ooe * 0.35);
            this.method_2be429a8_Dne(this.field_2f0dd3_div + (double)this.field_342261_ooe * 0.35, this.field_373a3ed_Dne.field_212608_FWm + 0.5, this.field_334487_mrb - (double)this.field_342261_ooe * 0.35);
            this.method_2be429a8_Dne(this.field_2f0dd3_div + (double)this.field_342261_ooe * 0.35, this.field_373a3ed_Dne.field_212608_FWm + 0.5, this.field_334487_mrb + (double)this.field_342261_ooe * 0.35);
            boolean bl4 = bl = (float)this.method_230621e2_Dne().method_7a46288d_Dne() > 6.0f || this.field_37cb681_Dne.field_2e5f2c_bzF;
            if (this.field_2d2a05_aFZ && !bl3 && this.field_375ce2c_Dne.field_21260a_FWm >= f && !this.method_73aaafc7_ATE() && bl && !this.method_b6f3e1a2_haP() && !this.method_857f23ec_Dne(SXd.field_3286ff53_trS)) {
                if (this.field_2092ae_Dne == 0) {
                    this.field_2092ae_Dne = 7;
                } else {
                    this.method_aad4531d_a_(true);
                    this.field_2092ae_Dne = 0;
                }
            }
            if (this.method_a98a0664_aFZ()) {
                this.field_2092ae_Dne = 0;
            }
            if (this.method_73aaafc7_ATE() && (this.field_375ce2c_Dne.field_21260a_FWm < f || this.field_388db7_zGp || !bl)) {
                this.method_aad4531d_a_(false);
            }
            if (this.field_37cb681_Dne.field_2e5f2c_bzF && !bl2 && this.field_375ce2c_Dne.field_2092bf_Dne) {
                if (this.field_2592c3_One == 0) {
                    this.field_2592c3_One = 7;
                } else {
                    this.field_37cb681_Dne.field_21261e_FWm = !this.field_37cb681_Dne.field_21261e_FWm;
                    this.method_7ad38803_DyG();
                    this.field_2592c3_One = 0;
                }
            }
            if (this.field_37cb681_Dne.field_21261e_FWm) {
                if (this.field_375ce2c_Dne.field_21261e_FWm) {
                    this.field_2a9ad1_Zpi -= 0.15;
                }
                if (this.field_375ce2c_Dne.field_2092bf_Dne) {
                    this.field_2a9ad1_Zpi += 0.15;
                }
            }
            super.method_8288d6ee_IjH();
            if (this.field_2d2a05_aFZ && this.field_37cb681_Dne.field_21261e_FWm) {
                this.field_37cb681_Dne.field_21261e_FWm = false;
                this.method_7ad38803_DyG();
            }
        }
    }

    @Override
    public void method_8f501fe4_Dne(String string) {
        this.field_493682ed_Dne.field_3733694_Dne.method_2312ad69_Dne().method_8f501fe4_Dne(string);
    }

    @Override
    public void method_5b092153_Dne(int n, int n2, int n3, String string) {
        this.field_493682ed_Dne.method_b88fcbd2_Dne(new IfV(this.field_36a059b_Dne, this.field_36c4f18_Dne, n, n2, n3, string));
    }
}

