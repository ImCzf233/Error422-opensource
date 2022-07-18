package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class VAd
extends lIg
implements ZFz {
    public double field_212608_FWm;
    public double field_212c16_EyB;
    public int field_2092ae_Dne = 0;
    public int field_21260d_FWm = 0;
    public int field_2592c3_One = 0;
    private sMa field_75c313d2_bzF = null;
    public double field_2092a9_Dne;
    private int field_2a7663_ZgS = 0;
    private int field_2f0276_eHV = 1;

    @Override
    protected void method_17484c9_Dne(boolean bl, int n) {
        int n2;
        int n3 = this.field_7331eae7_Dne.nextInt(2) + this.field_7331eae7_Dne.nextInt(1 + n);
        for (n2 = 0; n2 < n3; ++n2) {
            this.method_9045499d_Dne(dEr.field_727810e1_ivB.field_267cf5_Qnq, 1);
        }
        n3 = this.field_7331eae7_Dne.nextInt(3) + this.field_7331eae7_Dne.nextInt(1 + n);
        for (n2 = 0; n2 < n3; ++n2) {
            this.method_9045499d_Dne(dEr.field_e637b3ee_cot.field_267cf5_Qnq, 1);
        }
    }

    @Override
    protected String method_3c9d12fd_DyG() {
        return "mob.ghast.scream";
    }

    @Override
    protected int method_baa393f5_kGO() {
        return dEr.field_e637b3ee_cot.field_267cf5_Qnq;
    }

    @Override
    protected String method_6a89a3dc_div() {
        return "mob.ghast.death";
    }

    private boolean method_50a16b1e_Dne(double d, double d2, double d3, double d4) {
        double d5 = (this.field_2092a9_Dne - this.field_2f0dd3_div) / d4;
        double d6 = (this.field_212608_FWm - this.field_22c5fd_IjH) / d4;
        double d7 = (this.field_212c16_EyB - this.field_334487_mrb) / d4;
        bSp bSp2 = this.field_373a3ed_Dne.method_230d324c_Dne();
        int n = 1;
        while ((double)n < d4) {
            bSp2.method_fbaf53ef_Qnq(d5, d6, d7);
            if (!this.field_36c4f18_Dne.method_d11d9a5_Dne(this, bSp2).isEmpty()) {
                return false;
            }
            ++n;
        }
        return true;
    }

    @Override
    protected float method_b0a28134_div() {
        return 10.0f;
    }

    @Override
    public void method_8d4fb917_Dne(WkD wkD) {
        super.method_8d4fb917_Dne(wkD);
        wkD.method_5ab44f9f_Dne("ExplosionPower", this.field_2f0276_eHV);
    }

    @Override
    public void method_66a36cd8_FWm(WkD wkD) {
        super.method_66a36cd8_FWm(wkD);
        if (wkD.method_8f501fe8_Dne("ExplosionPower")) {
            this.field_2f0276_eHV = wkD.method_8f501fd7_Dne("ExplosionPower");
        }
    }

    @Override
    protected void method_b0a28144_div() {
        byte by;
        byte by2;
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ && this.field_36c4f18_Dne.field_2d29f4_aFZ == 0) {
            this.method_5d73f9d_g_();
        }
        this.method_9f65f30f_ZgS();
        this.field_21260d_FWm = this.field_2592c3_One;
        double d = this.field_2092a9_Dne - this.field_2f0dd3_div;
        double d2 = this.field_212608_FWm - this.field_22c5fd_IjH;
        double d3 = this.field_212c16_EyB - this.field_334487_mrb;
        double d4 = d * d + d2 * d2 + d3 * d3;
        if (d4 < 1.0 || d4 > 3600.0) {
            this.field_2092a9_Dne = this.field_2f0dd3_div + (double)((this.field_7331eae7_Dne.nextFloat() * 2.0f - 1.0f) * 16.0f);
            this.field_212608_FWm = this.field_22c5fd_IjH + (double)((this.field_7331eae7_Dne.nextFloat() * 2.0f - 1.0f) * 16.0f);
            this.field_212c16_EyB = this.field_334487_mrb + (double)((this.field_7331eae7_Dne.nextFloat() * 2.0f - 1.0f) * 16.0f);
        }
        if (this.field_2092ae_Dne-- <= 0) {
            this.field_2092ae_Dne += this.field_7331eae7_Dne.nextInt(5) + 2;
            if (this.method_50a16b1e_Dne(this.field_2092a9_Dne, this.field_212608_FWm, this.field_212c16_EyB, d4 = (double)geR.method_ce7f4ad4_Dne(d4))) {
                this.field_291868_XHL += d / d4 * 0.1;
                this.field_2a9ad1_Zpi += d2 / d4 * 0.1;
                this.field_31b811_kGO += d3 / d4 * 0.1;
            } else {
                this.field_2092a9_Dne = this.field_2f0dd3_div;
                this.field_212608_FWm = this.field_22c5fd_IjH;
                this.field_212c16_EyB = this.field_334487_mrb;
            }
        }
        if (this.field_75c313d2_bzF != null && this.field_75c313d2_bzF.field_2a9ae7_Zpi) {
            this.field_75c313d2_bzF = null;
        }
        if (this.field_75c313d2_bzF == null || this.field_2a7663_ZgS-- <= 0) {
            this.field_75c313d2_bzF = this.field_36c4f18_Dne.method_c32e43ea_FWm(this, 100.0);
            if (this.field_75c313d2_bzF != null) {
                this.field_2a7663_ZgS = 20;
            }
        }
        double d5 = 64.0;
        if (this.field_75c313d2_bzF != null && this.field_75c313d2_bzF.method_bb7dd80e_Dne(this) < d5 * d5) {
            double d6 = this.field_75c313d2_bzF.field_2f0dd3_div - this.field_2f0dd3_div;
            double d7 = this.field_75c313d2_bzF.field_373a3ed_Dne.field_212608_FWm + (double)(this.field_75c313d2_bzF.field_367151_trS / 2.0f) - (this.field_22c5fd_IjH + (double)(this.field_367151_trS / 2.0f));
            double d8 = this.field_75c313d2_bzF.field_334487_mrb - this.field_334487_mrb;
            this.field_22c5ff_IjH = this.field_334489_mrb = -((float)Math.atan2(d6, d8)) * 180.0f / (float)Math.PI;
            if (this.method_3e501ffd_Qnq(this.field_75c313d2_bzF)) {
                if (this.field_2592c3_One == 10) {
                    this.field_36c4f18_Dne.method_bfa54b80_Dne(null, 1007, (int)this.field_2f0dd3_div, (int)this.field_22c5fd_IjH, (int)this.field_334487_mrb, 0);
                }
                ++this.field_2592c3_One;
                if (this.field_2592c3_One == 20) {
                    this.field_36c4f18_Dne.method_bfa54b80_Dne(null, 1008, (int)this.field_2f0dd3_div, (int)this.field_22c5fd_IjH, (int)this.field_334487_mrb, 0);
                    iis iis2 = new iis(this.field_36c4f18_Dne, this, d6, d7, d8);
                    iis2.field_2092ae_Dne = this.field_2f0276_eHV;
                    double d9 = 4.0;
                    chN chN2 = this.method_d91908ef_FWm(1.0f);
                    iis2.field_2f0dd3_div = this.field_2f0dd3_div + chN2.field_2092a9_Dne * d9;
                    iis2.field_22c5fd_IjH = this.field_22c5fd_IjH + (double)(this.field_367151_trS / 2.0f) + 0.5;
                    iis2.field_334487_mrb = this.field_334487_mrb + chN2.field_2e5f16_bzF * d9;
                    this.field_36c4f18_Dne.method_94d18be5_FWm(iis2);
                    this.field_2592c3_One = -40;
                }
            } else if (this.field_2592c3_One > 0) {
                --this.field_2592c3_One;
            }
        } else {
            this.field_22c5ff_IjH = this.field_334489_mrb = -((float)Math.atan2(this.field_291868_XHL, this.field_31b811_kGO)) * 180.0f / (float)Math.PI;
            if (this.field_2592c3_One > 0) {
                --this.field_2592c3_One;
            }
        }
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ && (by2 = this.field_378ab08_Dne.method_ce7f5d95_Dne(16)) != (by = (byte)(this.field_2592c3_One > 10 ? 1 : 0))) {
            this.field_378ab08_Dne.method_62ca2346_FWm(16, by);
        }
    }

    @Override
    protected String method_a174454e_zGp() {
        return "mob.ghast.moan";
    }

    @Override
    public int method_7a46288d_Dne() {
        return 10;
    }

    @Override
    public void method_7a46289a_Dne() {
        super.method_7a46289a_Dne();
        byte by = this.field_378ab08_Dne.method_ce7f5d95_Dne(16);
        this.field_c480ca78_bzF = by == 1 ? "/mob/ghast_fire.png" : "/mob/ghast.png";
    }

    @Override
    public boolean method_147b2066_Dne(zBn zBn2, int n) {
        if (this.method_7c861acb_EyB()) {
            return false;
        }
        if ("fireball".equals(zBn2.method_eecad346_Dne()) && zBn2.method_f88b2463_FWm() instanceof FiG) {
            super.method_147b2066_Dne(zBn2, 1000);
            ((FiG)zBn2.method_f88b2463_FWm()).method_831230fe_Dne(qlg.field_84f6688d_ceE);
            return true;
        }
        return super.method_147b2066_Dne(zBn2, n);
    }

    @Override
    public int method_c3b4a2c3_ooe() {
        return 1;
    }

    public VAd(Qnq qnq) {
        super(qnq);
        this.field_c480ca78_bzF = "/mob/ghast.png";
        this.method_16b621a_Dne(4.0f, 4.0f);
        this.field_342275_ooe = true;
        this.field_217c26_Fnk = 5;
    }

    @Override
    public boolean method_af414cf1_cot() {
        return this.field_7331eae7_Dne.nextInt(20) == 0 && super.method_af414cf1_cot() && this.field_36c4f18_Dne.field_2d29f4_aFZ > 0;
    }

    @Override
    protected void method_7c6f6039_FWm() {
        super.method_7c6f6039_FWm();
        this.field_378ab08_Dne.method_ad009545_Dne(16, (byte)0);
    }
}

