package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Calendar;

public class oaw
extends ifA {
    private iSh field_376d18e_Dne;

    @Override
    public int method_7a46288d_Dne() {
        return 6;
    }

    @Override
    protected String method_a174454e_zGp() {
        return this.method_b6f3e1a2_haP() && this.field_7331eae7_Dne.nextInt(4) != 0 ? null : "mob.bat.idle";
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
    protected float method_7ad387f3_DyG() {
        return super.method_7ad387f3_DyG() * 0.95f;
    }

    @Override
    protected String method_3c9d12fd_DyG() {
        return "mob.bat.hurt";
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return false;
    }

    @Override
    public void method_66a36cd8_FWm(WkD wkD) {
        super.method_66a36cd8_FWm(wkD);
        this.field_378ab08_Dne.method_62ca2346_FWm(16, wkD.method_8f501fd0_Dne("BatFlags"));
    }

    @Override
    protected String method_6a89a3dc_div() {
        return "mob.bat.death";
    }

    @Override
    protected void method_b077c662_eHV() {
        super.method_b077c662_eHV();
        if (this.method_b6f3e1a2_haP()) {
            if (!this.field_36c4f18_Dne.method_6fdef3c4_DyG(geR.method_117d0718_FWm(this.field_2f0dd3_div), (int)this.field_22c5fd_IjH + 1, geR.method_117d0718_FWm(this.field_334487_mrb))) {
                this.method_117d59bb_FWm(false);
                this.field_36c4f18_Dne.method_bfa54b80_Dne(null, 1015, (int)this.field_2f0dd3_div, (int)this.field_22c5fd_IjH, (int)this.field_334487_mrb, 0);
            } else {
                if (this.field_7331eae7_Dne.nextInt(200) == 0) {
                    this.field_36e4d7_vSL = this.field_7331eae7_Dne.nextInt(360);
                }
                if (this.field_36c4f18_Dne.method_3d2c70b_Dne(this, 4.0) != null) {
                    this.method_117d59bb_FWm(false);
                    this.field_36c4f18_Dne.method_bfa54b80_Dne(null, 1015, (int)this.field_2f0dd3_div, (int)this.field_22c5fd_IjH, (int)this.field_334487_mrb, 0);
                }
            }
        } else {
            if (!(this.field_376d18e_Dne == null || this.field_36c4f18_Dne.method_2c2cf7cd_Dne(this.field_376d18e_Dne.field_2092ae_Dne, this.field_376d18e_Dne.field_21260d_FWm, this.field_376d18e_Dne.field_2e5f1b_bzF) && this.field_376d18e_Dne.field_21260d_FWm >= 1)) {
                this.field_376d18e_Dne = null;
            }
            if (this.field_376d18e_Dne == null || this.field_7331eae7_Dne.nextInt(30) == 0 || this.field_376d18e_Dne.method_2c2cf7b9_Dne((int)this.field_2f0dd3_div, (int)this.field_22c5fd_IjH, (int)this.field_334487_mrb) < 4.0f) {
                this.field_376d18e_Dne = new iSh((int)this.field_2f0dd3_div + this.field_7331eae7_Dne.nextInt(7) - this.field_7331eae7_Dne.nextInt(7), (int)this.field_22c5fd_IjH + this.field_7331eae7_Dne.nextInt(6) - 2, (int)this.field_334487_mrb + this.field_7331eae7_Dne.nextInt(7) - this.field_7331eae7_Dne.nextInt(7));
            }
            double d = (double)this.field_376d18e_Dne.field_2092ae_Dne + 0.5 - this.field_2f0dd3_div;
            double d2 = (double)this.field_376d18e_Dne.field_21260d_FWm + 0.1 - this.field_22c5fd_IjH;
            double d3 = (double)this.field_376d18e_Dne.field_2e5f1b_bzF + 0.5 - this.field_334487_mrb;
            this.field_291868_XHL += (Math.signum(d) * 0.5 - this.field_291868_XHL) * (double)0.1f;
            this.field_2a9ad1_Zpi += (Math.signum(d2) * (double)0.7f - this.field_2a9ad1_Zpi) * (double)0.1f;
            this.field_31b811_kGO += (Math.signum(d3) * 0.5 - this.field_31b811_kGO) * (double)0.1f;
            float f = (float)(Math.atan2(this.field_31b811_kGO, this.field_291868_XHL) * 180.0 / Math.PI) - 90.0f;
            float f2 = geR.method_87b72d50_aFZ(f - this.field_334489_mrb);
            this.field_212b3f_FYZ = 0.5f;
            this.field_334489_mrb += f2;
            if (this.field_7331eae7_Dne.nextInt(100) == 0 && this.field_36c4f18_Dne.method_6fdef3c4_DyG(geR.method_117d0718_FWm(this.field_2f0dd3_div), (int)this.field_22c5fd_IjH + 1, geR.method_117d0718_FWm(this.field_334487_mrb))) {
                this.method_117d59bb_FWm(true);
            }
        }
    }

    @Override
    protected void method_16ac470_Dne(double d, boolean bl) {
    }

    public boolean method_b6f3e1a2_haP() {
        return (this.field_378ab08_Dne.method_ce7f5d95_Dne(16) & 1) != 0;
    }

    @Override
    public void method_80692b1a_ICU() {
    }

    @Override
    protected boolean method_cbcb3929_tgc() {
        return true;
    }

    @Override
    protected float method_b0a28134_div() {
        return 0.1f;
    }

    @Override
    public boolean method_7d36ef26_FfS() {
        return true;
    }

    @Override
    protected void method_b09c9871_eJi() {
    }

    @Override
    protected void method_6b3059b6_div(sMa sMa2) {
    }

    @Override
    public void method_8d4fb917_Dne(WkD wkD) {
        super.method_8d4fb917_Dne(wkD);
        wkD.method_5ab43558_Dne("BatFlags", this.field_378ab08_Dne.method_ce7f5d95_Dne(16));
    }

    @Override
    protected void method_ce7f5266_Dne(float f) {
    }

    @Override
    protected boolean method_7c6f603d_FWm() {
        return false;
    }

    @Override
    public boolean method_147b2066_Dne(zBn zBn2, int n) {
        if (this.method_7c861acb_EyB()) {
            return false;
        }
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ && this.method_b6f3e1a2_haP()) {
            this.method_117d59bb_FWm(false);
        }
        return super.method_147b2066_Dne(zBn2, n);
    }

    @Override
    public boolean method_af414cf1_cot() {
        int n = geR.method_117d0718_FWm(this.field_373a3ed_Dne.field_212608_FWm);
        if (n >= 63) {
            return false;
        }
        int n2 = geR.method_117d0718_FWm(this.field_2f0dd3_div);
        int n3 = geR.method_117d0718_FWm(this.field_334487_mrb);
        int n4 = this.field_36c4f18_Dne.method_76d9fc36_aFZ(n2, n, n3);
        int n5 = 4;
        Calendar calendar = this.field_36c4f18_Dne.method_8fb123cd_Dne();
        if (!(calendar.get(2) + 1 == 10 && calendar.get(5) >= 20 || calendar.get(2) + 1 == 11 && calendar.get(5) <= 3)) {
            if (this.field_7331eae7_Dne.nextBoolean()) {
                return false;
            }
        } else {
            n5 = 7;
        }
        return n4 > this.field_7331eae7_Dne.nextInt(n5) ? false : super.method_af414cf1_cot();
    }

    public oaw(Qnq qnq) {
        super(qnq);
        this.field_c480ca78_bzF = "/mob/bat.png";
        this.method_16b621a_Dne(0.5f, 0.9f);
        this.method_117d59bb_FWm(true);
    }

    @Override
    protected void method_7c6f6039_FWm() {
        super.method_7c6f6039_FWm();
        this.field_378ab08_Dne.method_ad009545_Dne(16, (byte) 0);
    }

    @Override
    public void method_7a46289a_Dne() {
        super.method_7a46289a_Dne();
        if (this.method_b6f3e1a2_haP()) {
            this.field_31b811_kGO = 0.0;
            this.field_2a9ad1_Zpi = 0.0;
            this.field_291868_XHL = 0.0;
            this.field_22c5fd_IjH = (double)geR.method_117d0718_FWm(this.field_22c5fd_IjH) + 1.0 - (double)this.field_367151_trS;
        } else {
            this.field_2a9ad1_Zpi *= (double)0.6f;
        }
    }
}

