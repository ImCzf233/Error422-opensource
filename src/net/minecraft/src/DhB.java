package net.minecraft.src;

import java.util.List;

/*
 * Decompiled with CFR 0.152.
 */
public class DhB
extends LHi
implements sQM,
vjn {
    private static final pUe field_2033d32b_FWm = new Tnl();
    private float[] field_4a9241f_Qnq;
    private float[] field_6d9298e_zGp;
    private int field_21260d_FWm;
    private float[] field_5781700_aFZ;
    private float[] field_59d86b9_bzF = new float[2];
    private int[] field_3f1c589_Dne;
    private int[] field_4039e0a_FWm;

    public float method_ce7f5d99_Dne(int n) {
        return this.field_4a9241f_Qnq[n];
    }

    @Override
    public int method_ce7f5259_Dne(float f) {
        return 0xF000F0;
    }

    @Override
    protected String method_3c9d12fd_DyG() {
        return "mob.wither.hurt";
    }

    private void method_cc0bd33f_Dne(int n, double d, double d2, double d3, boolean bl) {
        this.field_36c4f18_Dne.method_bfa54b80_Dne(null, 1014, (int)this.field_2f0dd3_div, (int)this.field_22c5fd_IjH, (int)this.field_334487_mrb, 0);
        double d4 = this.method_ce7f5d97_Dne(n);
        double d5 = this.method_117d19d8_FWm(n);
        double d6 = this.method_143f9e0a_bzF(n);
        double d7 = d - d4;
        double d8 = d2 - d5;
        double d9 = d3 - d6;
        YCH yCH = new YCH(this.field_36c4f18_Dne, this, d7, d8, d9);
        if (bl) {
            yCH.method_117d59bb_FWm(true);
        }
        yCH.field_22c5fd_IjH = d5;
        yCH.field_2f0dd3_div = d4;
        yCH.field_334487_mrb = d6;
        this.field_36c4f18_Dne.method_94d18be5_FWm(yCH);
    }

    @Override
    protected String method_6a89a3dc_div() {
        return "mob.wither.death";
    }

    @Override
    public float method_7a46288a_Dne() {
        return this.field_367151_trS / 8.0f;
    }

    @Override
    protected void method_7c6f6039_FWm() {
        super.method_7c6f6039_FWm();
        this.field_378ab08_Dne.method_ad009545_Dne(16, new Integer(100));
        this.field_378ab08_Dne.method_ad009545_Dne(17, new Integer(0));
        this.field_378ab08_Dne.method_ad009545_Dne(18, new Integer(0));
        this.field_378ab08_Dne.method_ad009545_Dne(19, new Integer(0));
        this.field_378ab08_Dne.method_ad009545_Dne(20, new Integer(0));
    }

    @Override
    public void method_fe8e2b7b_Qnq(NAx nAx) {
    }

    @Override
    protected void method_17484c9_Dne(boolean bl, int n) {
        this.method_9045499d_Dne(dEr.field_94628c49_jsv.field_267cf5_Qnq, 1);
    }

    @Override
    protected void method_9f65f30f_ZgS() {
        this.field_295784_Wwe = 0;
    }

    @Override
    public int method_9feec6b5_Zpi() {
        return 4;
    }

    @Override
    public aYc method_230cd2e0_Dne() {
        return aYc.field_202d1060_FWm;
    }

    @Override
    protected void method_ce7f5266_Dne(float f) {
    }

    @Override
    public void method_66a36cd8_FWm(WkD wkD) {
        super.method_66a36cd8_FWm(wkD);
        this.method_117d19ea_FWm(wkD.method_8f501fd7_Dne("Invul"));
        this.field_378ab08_Dne.method_62ca2346_FWm(16, this.field_28e7fd_Vxn);
    }

    @Override
    public String method_6859cdb9_bzF() {
        int n = this.method_ae128dba_bzF();
        return n > 0 && (n > 80 || n / 5 % 2 != 1) ? "/mob/wither_invul.png" : "/mob/wither.png";
    }

    private void method_60f1bf3f_Dne(int n, FUH fUH) {
        this.method_cc0bd33f_Dne(n, fUH.field_2f0dd3_div, fUH.field_22c5fd_IjH + (double)fUH.method_59ee189_c_() * 0.5, fUH.field_334487_mrb, n == 0 && this.field_7331eae7_Dne.nextFloat() < 0.001f);
    }

    @Override
    protected void method_b077c662_eHV() {
        if (this.method_ae128dba_bzF() > 0) {
            int n = this.method_ae128dba_bzF() - 1;
            if (n <= 0) {
                this.field_36c4f18_Dne.method_4ff037c_Dne(this, this.field_2f0dd3_div, this.field_22c5fd_IjH + (double)this.method_59ee189_c_(), this.field_334487_mrb, 7.0f, false, this.field_36c4f18_Dne.method_230cbc5a_Dne().method_8f501fe8_Dne("mobGriefing"));
                this.field_36c4f18_Dne.method_c6d158dc_bzF(1013, (int)this.field_2f0dd3_div, (int)this.field_22c5fd_IjH, (int)this.field_334487_mrb, 0);
            }
            this.method_117d19ea_FWm(n);
            if (this.field_388da6_zGp % 10 == 0) {
                this.method_ce7f5da9_Dne(10);
            }
        } else {
            int n;
            int n2;
            int n3;
            super.method_b077c662_eHV();
            block0: for (n3 = 1; n3 < 3; ++n3) {
                Object object;
                if (this.field_388da6_zGp < this.field_3f1c589_Dne[n3 - 1]) continue;
                this.field_3f1c589_Dne[n3 - 1] = this.field_388da6_zGp + 10 + this.field_7331eae7_Dne.nextInt(10);
                if (this.field_36c4f18_Dne.field_2d29f4_aFZ >= 2) {
                    int n4 = n3 - 1;
                    n2 = this.field_4039e0a_FWm[n3 - 1];
                    this.field_4039e0a_FWm[n4] = this.field_4039e0a_FWm[n3 - 1] + 1;
                    if (n2 > 15) {
                        float f = 10.0f;
                        float f2 = 5.0f;
                        double d = geR.method_4cb3934_Dne(this.field_7331eae7_Dne, this.field_2f0dd3_div - (double)f, this.field_2f0dd3_div + (double)f);
                        double d2 = geR.method_4cb3934_Dne(this.field_7331eae7_Dne, this.field_22c5fd_IjH - (double)f2, this.field_22c5fd_IjH + (double)f2);
                        double d3 = geR.method_4cb3934_Dne(this.field_7331eae7_Dne, this.field_334487_mrb - (double)f, this.field_334487_mrb + (double)f);
                        this.method_cc0bd33f_Dne(n3 + 1, d, d2, d3, true);
                        this.field_4039e0a_FWm[n3 - 1] = 0;
                    }
                }
                if ((n = this.method_117d19dd_FWm(n3)) > 0) {
                    object = this.field_36c4f18_Dne.method_9e7ee9d3_Dne(n);
                    if (object != null && ((sMa)object).method_cd4cb3d9_udO() && this.method_bb7dd80e_Dne((sMa)object) <= 900.0 && this.method_3e501ffd_Qnq((sMa)object)) {
                        this.method_60f1bf3f_Dne(n3 + 1, (FUH)object);
                        this.field_3f1c589_Dne[n3 - 1] = this.field_388da6_zGp + 40 + this.field_7331eae7_Dne.nextInt(20);
                        this.field_4039e0a_FWm[n3 - 1] = 0;
                        continue;
                    }
                    this.method_16cca7a_Dne(n3, 0);
                    continue;
                }
                object = this.field_36c4f18_Dne.method_e7d4af05_Dne(FUH.class, this.field_373a3ed_Dne.method_b78565d7_FWm(20.0, 8.0, 20.0), field_2033d32b_FWm);
                for (n2 = 0; n2 < 10 && !((String) object).isEmpty(); ++n2) {
                    FUH fUH = (FUH)((List) object).get(this.field_7331eae7_Dne.nextInt(((List) object).size()));
                    if (fUH != this && fUH.method_cd4cb3d9_udO() && this.method_3e501ffd_Qnq(fUH)) {
                        if (fUH instanceof FiG) {
                            if (((FiG)fUH).field_37cb681_Dne.field_2092bf_Dne) continue block0;
                            this.method_16cca7a_Dne(n3, fUH.field_2d29f4_aFZ);
                            continue block0;
                        }
                        this.method_16cca7a_Dne(n3, fUH.field_2d29f4_aFZ);
                        continue block0;
                    }
                    ((List) object).remove(fUH);
                }
            }
            if (this.method_228c813f_bzF() != null) {
                this.method_16cca7a_Dne(0, this.method_228c813f_bzF().field_2d29f4_aFZ);
            } else {
                this.method_16cca7a_Dne(0, 0);
            }
            if (this.field_21260d_FWm > 0) {
                --this.field_21260d_FWm;
                if (this.field_21260d_FWm == 0 && this.field_36c4f18_Dne.method_230cbc5a_Dne().method_8f501fe8_Dne("mobGriefing")) {
                    n3 = geR.method_117d0718_FWm(this.field_22c5fd_IjH);
                    n = geR.method_117d0718_FWm(this.field_2f0dd3_div);
                    int n5 = geR.method_117d0718_FWm(this.field_334487_mrb);
                    n2 = 0;
                    for (int i = -1; i <= 1; ++i) {
                        for (int j = -1; j <= 1; ++j) {
                            for (int k = 0; k <= 3; ++k) {
                                int n6 = n + i;
                                int n7 = n3 + k;
                                int n8 = n5 + j;
                                int n9 = this.field_36c4f18_Dne.method_2c2cf7bc_Dne(n6, n7, n8);
                                if (n9 <= 0 || n9 == zKP.field_f0b029e5_zGp.field_21260d_FWm || n9 == zKP.field_fae40a26_EYV.field_21260d_FWm || n9 == zKP.field_e4a82663_dBc.field_21260d_FWm) continue;
                                n2 = this.field_36c4f18_Dne.method_5972b42f_Dne(n6, n7, n8, true) || n2 != 0 ? 1 : 0;
                            }
                        }
                    }
                    if (n2 != 0) {
                        this.field_36c4f18_Dne.method_bfa54b80_Dne(null, 1012, (int)this.field_2f0dd3_div, (int)this.field_22c5fd_IjH, (int)this.field_334487_mrb, 0);
                    }
                }
            }
            if (this.field_388da6_zGp % 20 == 0) {
                this.method_ce7f5da9_Dne(1);
            }
        }
    }

    @Override
    public int method_59ee18c_c_() {
        return this.field_378ab08_Dne.method_ce7f5d9c_Dne(16);
    }

    @Override
    public void method_8d4fb917_Dne(WkD wkD) {
        super.method_8d4fb917_Dne(wkD);
        wkD.method_5ab44f9f_Dne("Invul", this.method_ae128dba_bzF());
    }

    private double method_117d19d8_FWm(int n) {
        return n <= 0 ? this.field_22c5fd_IjH + 3.0 : this.field_22c5fd_IjH + 2.2;
    }

    @Override
    public void method_cbcb3925_tgc() {
    }

    @Override
    protected boolean method_cbcb3929_tgc() {
        return true;
    }

    public int method_ae128dba_bzF() {
        return this.field_378ab08_Dne.method_ce7f5d9c_Dne(20);
    }

    public DhB(Qnq qnq) {
        super(qnq);
        this.field_4a9241f_Qnq = new float[2];
        this.field_5781700_aFZ = new float[2];
        this.field_6d9298e_zGp = new float[2];
        this.field_3f1c589_Dne = new int[2];
        this.field_4039e0a_FWm = new int[2];
        this.method_143f9e1c_bzF(this.method_7a46288d_Dne());
        this.field_c480ca78_bzF = "/mob/wither.png";
        this.method_16b621a_Dne(0.9f, 4.0f);
        this.field_342275_ooe = true;
        this.field_2e1df2_cHy = 0.6f;
        this.method_23028a4c_Dne().method_87b77874_aFZ(true);
        this.field_36ae2b9_Dne.method_9212764c_Dne(0, new Cyb(this));
        this.field_36ae2b9_Dne.method_9212764c_Dne(2, new Auu(this, this.field_2e1df2_cHy, 40, 20.0f));
        this.field_36ae2b9_Dne.method_9212764c_Dne(5, new IBw(this, this.field_2e1df2_cHy));
        this.field_36ae2b9_Dne.method_9212764c_Dne(6, new yws(this, FiG.class, 8.0f));
        this.field_36ae2b9_Dne.method_9212764c_Dne(7, new cHg(this));
        this.field_2024ae98_FWm.method_9212764c_Dne(1, new QRF(this, false));
        this.field_2024ae98_FWm.method_9212764c_Dne(2, new AmF(this, FUH.class, 30.0f, 0, false, false, field_2033d32b_FWm));
        this.field_217c26_Fnk = 50;
    }

    private float method_2c0148d6_Dne(float f, float f2, float f3) {
        float f4 = geR.method_87b72d50_aFZ(f2 - f);
        if (f4 > f3) {
            f4 = f3;
        }
        if (f4 < -f3) {
            f4 = -f3;
        }
        return f + f4;
    }

    @Override
    public int method_7a46288d_Dne() {
        return 300;
    }

    public void method_907a9d21_Qnq() {
        this.method_117d19ea_FWm(220);
        this.method_143f9e1c_bzF(this.method_7a46288d_Dne() / 3);
    }

    public boolean method_86921671_LVR() {
        return this.method_59ee18c_c_() <= this.method_7a46288d_Dne() / 2;
    }

    @Override
    public boolean method_147b2066_Dne(zBn zBn2, int n) {
        sMa sMa2;
        if (this.method_7c861acb_EyB()) {
            return false;
        }
        if (zBn2 == zBn.field_7141d10c_aFZ) {
            return false;
        }
        if (this.method_ae128dba_bzF() > 0) {
            return false;
        }
        if (this.method_86921671_LVR() && (sMa2 = zBn2.method_2314d444_Dne()) instanceof hhc) {
            return false;
        }
        sMa2 = zBn2.method_f88b2463_FWm();
        if (sMa2 != null && !(sMa2 instanceof FiG) && sMa2 instanceof FUH && ((FUH)sMa2).method_230cd2e0_Dne() == this.method_230cd2e0_Dne()) {
            return false;
        }
        if (this.field_21260d_FWm <= 0) {
            this.field_21260d_FWm = 20;
        }
        int n2 = 0;
        while (n2 < this.field_4039e0a_FWm.length) {
            int n3 = n2++;
            this.field_4039e0a_FWm[n3] = this.field_4039e0a_FWm[n3] + 3;
        }
        return super.method_147b2066_Dne(zBn2, n);
    }

    public void method_16cca7a_Dne(int n, int n2) {
        this.field_378ab08_Dne.method_62ca2346_FWm(17 + n, n2);
    }

    private double method_143f9e0a_bzF(int n) {
        if (n <= 0) {
            return this.field_334487_mrb;
        }
        float f = (this.field_22c5ff_IjH + (float)(180 * (n - 1))) / 180.0f * (float)Math.PI;
        float f2 = geR.method_ce7f5256_Dne(f);
        return this.field_334487_mrb + (double)f2 * 1.3;
    }

    public int method_117d19dd_FWm(int n) {
        return this.field_378ab08_Dne.method_ce7f5d9c_Dne(17 + n);
    }

    @Override
    public boolean method_baa39406_kGO() {
        return !this.field_2a9ae7_Zpi;
    }

    @Override
    public void method_740ba292_Dne(FUH fUH, float f) {
        this.method_60f1bf3f_Dne(0, fUH);
    }

    public void method_117d19ea_FWm(int n) {
        this.field_378ab08_Dne.method_62ca2346_FWm(20, n);
    }

    @Override
    protected String method_a174454e_zGp() {
        return "mob.wither.idle";
    }

    @Override
    public void method_ad72a713_bzF(sMa sMa2) {
        this.field_203511c4_FWm = null;
    }

    private double method_ce7f5d97_Dne(int n) {
        if (n <= 0) {
            return this.field_2f0dd3_div;
        }
        float f = (this.field_22c5ff_IjH + (float)(180 * (n - 1))) / 180.0f * (float)Math.PI;
        float f2 = geR.method_117d0e97_FWm(f);
        return this.field_2f0dd3_div + (double)f2 * 1.3;
    }

    public float method_117d19da_FWm(int n) {
        return this.field_59d86b9_bzF[n];
    }

    @Override
    public void method_8288d6ee_IjH() {
        int n;
        double d;
        double d2;
        double d3;
        int n2;
        double d4;
        double d5;
        double d6;
        sMa sMa2;
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ) {
            this.field_378ab08_Dne.method_62ca2346_FWm(16, this.field_28e7fd_Vxn);
        }
        this.field_2a9ad1_Zpi *= (double)0.6f;
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ && this.method_117d19dd_FWm(0) > 0 && (sMa2 = this.field_36c4f18_Dne.method_9e7ee9d3_Dne(this.method_117d19dd_FWm(0))) != null) {
            double d7;
            if (this.field_22c5fd_IjH < sMa2.field_22c5fd_IjH || !this.method_86921671_LVR() && this.field_22c5fd_IjH < sMa2.field_22c5fd_IjH + 5.0) {
                if (this.field_2a9ad1_Zpi < 0.0) {
                    this.field_2a9ad1_Zpi = 0.0;
                }
                this.field_2a9ad1_Zpi += (0.5 - this.field_2a9ad1_Zpi) * (double)0.6f;
            }
            if ((d6 = (d7 = sMa2.field_2f0dd3_div - this.field_2f0dd3_div) * d7 + (d5 = sMa2.field_334487_mrb - this.field_334487_mrb) * d5) > 9.0) {
                d4 = geR.method_ce7f4ad4_Dne(d6);
                this.field_291868_XHL += (d7 / d4 * 0.5 - this.field_291868_XHL) * (double)0.6f;
                this.field_31b811_kGO += (d5 / d4 * 0.5 - this.field_31b811_kGO) * (double)0.6f;
            }
        }
        if (this.field_291868_XHL * this.field_291868_XHL + this.field_31b811_kGO * this.field_31b811_kGO > (double)0.05f) {
            this.field_334489_mrb = (float)Math.atan2(this.field_31b811_kGO, this.field_291868_XHL) * 57.295776f - 90.0f;
        }
        super.method_8288d6ee_IjH();
        for (n2 = 0; n2 < 2; ++n2) {
            this.field_6d9298e_zGp[n2] = this.field_4a9241f_Qnq[n2];
            this.field_5781700_aFZ[n2] = this.field_59d86b9_bzF[n2];
        }
        for (n2 = 0; n2 < 2; ++n2) {
            int n3 = this.method_117d19dd_FWm(n2 + 1);
            sMa sMa3 = null;
            if (n3 > 0) {
                sMa3 = this.field_36c4f18_Dne.method_9e7ee9d3_Dne(n3);
            }
            if (sMa3 != null) {
                d5 = this.method_ce7f5d97_Dne(n2 + 1);
                d6 = this.method_117d19d8_FWm(n2 + 1);
                d4 = this.method_143f9e0a_bzF(n2 + 1);
                d3 = sMa3.field_2f0dd3_div - d5;
                d2 = sMa3.field_22c5fd_IjH + (double)sMa3.method_59ee189_c_() - d6;
                d = sMa3.field_334487_mrb - d4;
                double d8 = geR.method_ce7f4ad4_Dne(d3 * d3 + d * d);
                float f = (float)(Math.atan2(d, d3) * 180.0 / Math.PI) - 90.0f;
                float f2 = (float)(-(Math.atan2(d2, d8) * 180.0 / Math.PI));
                this.field_59d86b9_bzF[n2] = this.method_2c0148d6_Dne(this.field_59d86b9_bzF[n2], f2, 40.0f);
                this.field_4a9241f_Qnq[n2] = this.method_2c0148d6_Dne(this.field_4a9241f_Qnq[n2], f, 10.0f);
                continue;
            }
            this.field_4a9241f_Qnq[n2] = this.method_2c0148d6_Dne(this.field_4a9241f_Qnq[n2], this.field_22c5ff_IjH, 10.0f);
        }
        boolean bl = this.method_86921671_LVR();
        for (n = 0; n < 3; ++n) {
            d3 = this.method_ce7f5d97_Dne(n);
            d2 = this.method_117d19d8_FWm(n);
            d = this.method_143f9e0a_bzF(n);
            this.field_36c4f18_Dne.method_8600ec24_Dne("smoke", d3 + this.field_7331eae7_Dne.nextGaussian() * (double)0.3f, d2 + this.field_7331eae7_Dne.nextGaussian() * (double)0.3f, d + this.field_7331eae7_Dne.nextGaussian() * (double)0.3f, 0.0, 0.0, 0.0);
            if (!bl || this.field_36c4f18_Dne.field_7331eae7_Dne.nextInt(4) != 0) continue;
            this.field_36c4f18_Dne.method_8600ec24_Dne("mobSpell", d3 + this.field_7331eae7_Dne.nextGaussian() * (double)0.3f, d2 + this.field_7331eae7_Dne.nextGaussian() * (double)0.3f, d + this.field_7331eae7_Dne.nextGaussian() * (double)0.3f, 0.7f, 0.7f, 0.5);
        }
        if (this.method_ae128dba_bzF() > 0) {
            for (n = 0; n < 3; ++n) {
                this.field_36c4f18_Dne.method_8600ec24_Dne("mobSpell", this.field_2f0dd3_div + this.field_7331eae7_Dne.nextGaussian() * 1.0, this.field_22c5fd_IjH + (double)(this.field_7331eae7_Dne.nextFloat() * 3.3f), this.field_334487_mrb + this.field_7331eae7_Dne.nextGaussian() * 1.0, 0.7f, 0.7f, 0.9f);
            }
        }
    }
}

