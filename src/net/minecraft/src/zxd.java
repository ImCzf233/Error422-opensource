package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Calendar;

public class zxd
extends LHi {
    private int field_21260d_FWm = 0;

    @Override
    public void method_ce7f4362_Dne(byte by) {
        if (by == 16) {
            this.field_36c4f18_Dne.method_62d7c9a6_Dne(this.field_2f0dd3_div + 0.5, this.field_22c5fd_IjH + 0.5, this.field_334487_mrb + 0.5, "mob.zombie.remedy", 1.0f + this.field_7331eae7_Dne.nextFloat(), this.field_7331eae7_Dne.nextFloat() * 0.7f + 0.3f, false);
        } else {
            super.method_ce7f4362_Dne(by);
        }
    }

    @Override
    public void method_8288d6ee_IjH() {
        float f;
        if (this.field_36c4f18_Dne.method_7a46289e_Dne() && !this.field_36c4f18_Dne.field_2d2a05_aFZ && !this.method_8288d6f2_IjH() && (f = this.method_ce7f5256_Dne(1.0f)) > 0.5f && this.field_7331eae7_Dne.nextFloat() * 30.0f < (f - 0.4f) * 2.0f && this.field_36c4f18_Dne.method_76d9fc47_aFZ(geR.method_117d0718_FWm(this.field_2f0dd3_div), geR.method_117d0718_FWm(this.field_22c5fd_IjH), geR.method_117d0718_FWm(this.field_334487_mrb))) {
            boolean bl = true;
            NMq nMq = this.method_9e6e1a08_Dne(4);
            if (nMq != null) {
                if (nMq.method_7c6f603d_FWm()) {
                    nMq.method_ce7f5da9_Dne(nMq.method_ae128dba_bzF() + this.field_7331eae7_Dne.nextInt(2));
                    if (nMq.method_ae128dba_bzF() >= nMq.method_a98a0653_aFZ()) {
                        this.method_55b582d6_FWm(nMq);
                        this.method_19b4c3a3_a_(4, null);
                    }
                }
                bl = false;
            }
            if (bl) {
                this.method_87b738a3_aFZ(8);
            }
        }
        super.method_8288d6ee_IjH();
    }

    @Override
    public int method_9feec6b5_Zpi() {
        int n = super.method_9feec6b5_Zpi() + 2;
        if (n > 20) {
            n = 20;
        }
        return n;
    }

    @Override
    public void method_8d4fb917_Dne(WkD wkD) {
        super.method_8d4fb917_Dne(wkD);
        if (this.method_8288d6f2_IjH()) {
            wkD.method_5ab48f70_Dne("IsBaby", true);
        }
        if (this.method_86921671_LVR()) {
            wkD.method_5ab48f70_Dne("IsVillager", true);
        }
        wkD.method_5ab44f9f_Dne("ConversionTime", this.method_9f5095a2_ZfC() ? this.field_21260d_FWm : -1);
    }

    @Override
    protected void method_ce9279d5_IjH(int n) {
        switch (this.field_7331eae7_Dne.nextInt(3)) {
            case 0: {
                this.method_9045499d_Dne(dEr.field_5c4c1af_IjH.field_267cf5_Qnq, 1);
                break;
            }
            case 1: {
                this.method_9045499d_Dne(dEr.field_943cf072_dYY.field_267cf5_Qnq, 1);
                break;
            }
            case 2: {
                this.method_9045499d_Dne(dEr.field_eb1fccc7_dnY.field_267cf5_Qnq, 1);
            }
        }
    }

    @Override
    protected int method_baa393f5_kGO() {
        return dEr.field_a989199f_gvF.field_267cf5_Qnq;
    }

    @Override
    protected void method_7c6f6039_FWm() {
        super.method_7c6f6039_FWm();
        this.method_23123967_Dne().method_ad009545_Dne(12, (byte)0);
        this.method_23123967_Dne().method_ad009545_Dne(13, (byte)0);
        this.method_23123967_Dne().method_ad009545_Dne(14, (byte)0);
    }

    @Override
    public boolean method_21db0ca_a_(FiG fiG) {
        NMq nMq = fiG.method_22900b26_bzF();
        if (nMq != null && nMq.method_230de6ba_Dne() == dEr.field_f97945f_ZfC && nMq.method_907a9d14_Qnq() == 0 && this.method_86921671_LVR() && this.method_857f23ec_Dne(SXd.field_719bf97c_Vxn)) {
            if (!fiG.field_37cb681_Dne.field_267d06_Qnq) {
                --nMq.field_2092ae_Dne;
            }
            if (nMq.field_2092ae_Dne <= 0) {
                fiG.field_36a059b_Dne.method_6e3a6b66_Dne(fiG.field_36a059b_Dne.field_2092ae_Dne, null);
            }
            if (!this.field_36c4f18_Dne.field_2d2a05_aFZ) {
                this.method_117d19ea_FWm(this.field_7331eae7_Dne.nextInt(2401) + 3600);
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean method_ad72a717_bzF(sMa sMa2) {
        boolean bl = super.method_ad72a717_bzF(sMa2);
        if (bl && this.method_23040479_Dne() == null && this.method_cc5ef5c4_trS() && this.field_7331eae7_Dne.nextFloat() < (float)this.field_36c4f18_Dne.field_2d29f4_aFZ * 0.3f) {
            sMa2.method_87b738a3_aFZ(2 * this.field_36c4f18_Dne.field_2d29f4_aFZ);
        }
        return bl;
    }

    @Override
    public void method_7a46289a_Dne() {
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ && this.method_9f5095a2_ZfC()) {
            int n = this.method_ae128dba_bzF();
            this.field_21260d_FWm -= n;
            if (this.field_21260d_FWm <= 0) {
                this.method_907a9d21_Qnq();
            }
        }
        super.method_7a46289a_Dne();
    }

    protected int method_ae128dba_bzF() {
        int n = 1;
        if (this.field_7331eae7_Dne.nextFloat() < 0.01f) {
            int n2 = 0;
            for (int i = (int)this.field_2f0dd3_div - 4; i < (int)this.field_2f0dd3_div + 4 && n2 < 14; ++i) {
                for (int j = (int)this.field_22c5fd_IjH - 4; j < (int)this.field_22c5fd_IjH + 4 && n2 < 14; ++j) {
                    for (int k = (int)this.field_334487_mrb - 4; k < (int)this.field_334487_mrb + 4 && n2 < 14; ++k) {
                        int n3 = this.field_36c4f18_Dne.method_2c2cf7bc_Dne(i, j, k);
                        if (n3 != zKP.field_1ee0bb87_Sdr.field_21260d_FWm && n3 != zKP.field_d57af75_FfS.field_21260d_FWm) continue;
                        if (this.field_7331eae7_Dne.nextFloat() < 0.3f) {
                            ++n;
                        }
                        ++n2;
                    }
                }
            }
        }
        return n;
    }

    @Override
    protected String method_a174454e_zGp() {
        return "mob.zombie.say";
    }

    public zxd(Qnq qnq) {
        super(qnq);
        this.field_c480ca78_bzF = "/mob/zombie.png";
        this.field_2e1df2_cHy = 0.23f;
        this.method_23028a4c_Dne().method_117d59bb_FWm(true);
        this.field_36ae2b9_Dne.method_9212764c_Dne(0, new Cyb(this));
        this.field_36ae2b9_Dne.method_9212764c_Dne(1, new zPr(this));
        this.field_36ae2b9_Dne.method_9212764c_Dne(2, new etz_0(this, FiG.class, this.field_2e1df2_cHy, false));
        this.field_36ae2b9_Dne.method_9212764c_Dne(3, new etz_0(this, pjB.class, this.field_2e1df2_cHy, true));
        this.field_36ae2b9_Dne.method_9212764c_Dne(4, new ZWx(this, this.field_2e1df2_cHy));
        this.field_36ae2b9_Dne.method_9212764c_Dne(5, new cBP(this, this.field_2e1df2_cHy, false));
        this.field_36ae2b9_Dne.method_9212764c_Dne(6, new IBw(this, this.field_2e1df2_cHy));
        this.field_36ae2b9_Dne.method_9212764c_Dne(7, new yws(this, FiG.class, 8.0f));
        this.field_36ae2b9_Dne.method_9212764c_Dne(7, new cHg(this));
        this.field_2024ae98_FWm.method_9212764c_Dne(1, new QRF(this, true));
        this.field_2024ae98_FWm.method_9212764c_Dne(2, new AmF(this, FiG.class, 16.0f, 0, true));
        this.field_2024ae98_FWm.method_9212764c_Dne(2, new AmF(this, pjB.class, 16.0f, 0, false));
    }

    protected void method_907a9d21_Qnq() {
        pjB pjB2 = new pjB(this.field_36c4f18_Dne);
        pjB2.method_4b7c1628_zGp(this);
        pjB2.method_80692b1a_ICU();
        pjB2.method_907a9d21_Qnq();
        if (this.method_8288d6f2_IjH()) {
            pjB2.method_117d19ea_FWm(-24000);
        }
        this.field_36c4f18_Dne.method_ad72a713_bzF(this);
        this.field_36c4f18_Dne.method_94d18be5_FWm(pjB2);
        pjB2.method_fe8e2b7b_Qnq(new NAx(SXd.field_74f7768b_mrb.field_2092ae_Dne, 200, 0));
        this.field_36c4f18_Dne.method_bfa54b80_Dne(null, 1017, (int)this.field_2f0dd3_div, (int)this.field_22c5fd_IjH, (int)this.field_334487_mrb, 0);
    }

    @Override
    public void method_66a36cd8_FWm(WkD wkD) {
        super.method_66a36cd8_FWm(wkD);
        if (wkD.method_110c4dc7_FWm("IsBaby")) {
            this.method_117d59bb_FWm(true);
        }
        if (wkD.method_110c4dc7_FWm("IsVillager")) {
            this.method_ce92b9a6_IjH(true);
        }
        if (wkD.method_8f501fe8_Dne("ConversionTime") && wkD.method_8f501fd7_Dne("ConversionTime") > -1) {
            this.method_117d19ea_FWm(wkD.method_8f501fd7_Dne("ConversionTime"));
        }
    }

    @Override
    public void method_6f1922ee_Dne(FUH fUH) {
        super.method_6f1922ee_Dne(fUH);
        if (this.field_36c4f18_Dne.field_2d29f4_aFZ >= 2 && fUH instanceof pjB) {
            if (this.field_36c4f18_Dne.field_2d29f4_aFZ == 2 && this.field_7331eae7_Dne.nextBoolean()) {
                return;
            }
            zxd zxd2 = new zxd(this.field_36c4f18_Dne);
            zxd2.method_4b7c1628_zGp(fUH);
            this.field_36c4f18_Dne.method_ad72a713_bzF(fUH);
            zxd2.method_80692b1a_ICU();
            zxd2.method_ce92b9a6_IjH(true);
            if (fUH.method_8288d6f2_IjH()) {
                zxd2.method_117d59bb_FWm(true);
            }
            this.field_36c4f18_Dne.method_94d18be5_FWm(zxd2);
            this.field_36c4f18_Dne.method_bfa54b80_Dne(null, 1016, (int)this.field_2f0dd3_div, (int)this.field_22c5fd_IjH, (int)this.field_334487_mrb, 0);
        }
    }

    @Override
    public void method_80692b1a_ICU() {
        Calendar calendar;
        this.method_63ae5a10_div(this.field_7331eae7_Dne.nextFloat() < field_3f1c586_Dne[this.field_36c4f18_Dne.field_2d29f4_aFZ]);
        if (this.field_36c4f18_Dne.field_7331eae7_Dne.nextFloat() < 0.05f) {
            this.method_ce92b9a6_IjH(true);
        }
        this.method_c738b194_qrB();
        this.method_8692166d_LVR();
        if (this.method_9e6e1a08_Dne(4) == null && (calendar = this.field_36c4f18_Dne.method_8fb123cd_Dne()).get(2) + 1 == 10 && calendar.get(5) == 31 && this.field_7331eae7_Dne.nextFloat() < 0.25f) {
            this.method_19b4c3a3_a_(4, new NMq(this.field_7331eae7_Dne.nextFloat() < 0.1f ? zKP.field_dcc1edd5_XwR : zKP.field_32158d62_aJO));
            this.field_4039e07_FWm[4] = 0.0f;
        }
    }

    @Override
    public boolean method_8288d6f2_IjH() {
        return this.method_23123967_Dne().method_ce7f5d95_Dne(12) == 1;
    }

    @Override
    public float method_c073dae8_mrb() {
        return super.method_c073dae8_mrb() * (this.method_8288d6f2_IjH() ? 1.5f : 1.0f);
    }

    @Override
    protected String method_6a89a3dc_div() {
        return "mob.zombie.death";
    }

    protected void method_117d19ea_FWm(int n) {
        this.field_21260d_FWm = n;
        this.method_23123967_Dne().method_62ca2346_FWm(14, (byte)1);
        this.method_ae438b8a_XHL(SXd.field_719bf97c_Vxn.field_2092ae_Dne);
        this.method_fe8e2b7b_Qnq(new NAx(SXd.field_f09ea2a5_zGp.field_2092ae_Dne, n, Math.min(this.field_36c4f18_Dne.field_2d29f4_aFZ - 1, 0)));
        this.field_36c4f18_Dne.method_b43d849c_Dne(this, (byte)16);
    }

    @Override
    public String method_6859cdb9_bzF() {
        return this.method_86921671_LVR() ? "/mob/zombie_villager.png" : "/mob/zombie.png";
    }

    @Override
    public int method_7a46288d_Dne() {
        return 20;
    }

    public boolean method_86921671_LVR() {
        return this.method_23123967_Dne().method_ce7f5d95_Dne(13) == 1;
    }

    public void method_ce92b9a6_IjH(boolean bl) {
        this.method_23123967_Dne().method_62ca2346_FWm(13, (byte)(bl ? 1 : 0));
    }

    public void method_117d59bb_FWm(boolean bl) {
        this.method_23123967_Dne().method_62ca2346_FWm(12, (byte)1);
    }

    @Override
    protected String method_3c9d12fd_DyG() {
        return "mob.zombie.hurt";
    }

    @Override
    public aYc method_230cd2e0_Dne() {
        return aYc.field_202d1060_FWm;
    }

    @Override
    protected void method_5972745a_Dne(int n, int n2, int n3, int n4) {
        this.method_fbd4aee4_Dne("mob.zombie.step", 0.15f, 1.0f);
    }

    @Override
    protected void method_c738b194_qrB() {
        super.method_c738b194_qrB();
        float f = this.field_7331eae7_Dne.nextFloat();
        float f2 = this.field_36c4f18_Dne.field_2d29f4_aFZ == 3 ? 0.05f : 0.01f;
        if (f < f2) {
            int n = this.field_7331eae7_Dne.nextInt(3);
            if (n == 0) {
                this.method_19b4c3a3_a_(0, new NMq(dEr.field_1c35e69a_XHL));
            } else {
                this.method_19b4c3a3_a_(0, new NMq(dEr.field_374585b_Dne));
            }
        }
    }

    @Override
    protected int method_907a9d14_Qnq() {
        return 40;
    }

    @Override
    protected boolean method_cbcb3929_tgc() {
        return true;
    }

    @Override
    public int method_bb7dd813_Dne(sMa sMa2) {
        NMq nMq = this.method_23040479_Dne();
        float f = (float)(this.method_7a46288d_Dne() - this.method_9a443a8c_XHL()) / (float)this.method_7a46288d_Dne();
        int n = 3 + geR.method_ce7f5259_Dne(f * 4.0f);
        if (nMq != null) {
            n += nMq.method_bb7dd813_Dne(this);
        }
        return n;
    }

    public boolean method_9f5095a2_ZfC() {
        return this.method_23123967_Dne().method_ce7f5d95_Dne(14) == 1;
    }
}

