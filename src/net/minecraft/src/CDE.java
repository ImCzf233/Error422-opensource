package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class CDE
extends tkl_0 {
    private int field_2592c3_One;
    private int field_2a7663_ZgS;
    private int field_21260d_FWm = 0;
    uQr field_37c3fb6_Dne = null;

    @Override
    public boolean method_cbcb3929_tgc() {
        return true;
    }

    public CDE(Qnq qnq) {
        super(qnq);
        this.field_c480ca78_bzF = "/mob/villager_golem.png";
        this.method_16b621a_Dne(1.4f, 2.9f);
        this.method_23028a4c_Dne().method_ce7f9d7a_Dne(true);
        this.field_36ae2b9_Dne.method_9212764c_Dne(1, new etz_0(this, 0.25f, true));
        this.field_36ae2b9_Dne.method_9212764c_Dne(2, new quK(this, 0.22f, 32.0f));
        this.field_36ae2b9_Dne.method_9212764c_Dne(3, new cBP(this, 0.16f, true));
        this.field_36ae2b9_Dne.method_9212764c_Dne(4, new ZWx(this, 0.16f));
        this.field_36ae2b9_Dne.method_9212764c_Dne(5, new Ydw(this));
        this.field_36ae2b9_Dne.method_9212764c_Dne(6, new IBw(this, 0.16f));
        this.field_36ae2b9_Dne.method_9212764c_Dne(7, new yws(this, FiG.class, 6.0f));
        this.field_36ae2b9_Dne.method_9212764c_Dne(8, new cHg(this));
        this.field_2024ae98_FWm.method_9212764c_Dne(1, new ZkF(this));
        this.field_2024ae98_FWm.method_9212764c_Dne(2, new QRF(this, false));
        this.field_2024ae98_FWm.method_9212764c_Dne(3, new AmF(this, FUH.class, 16.0f, 0, false, true, ZFz.field_37a074c_Dne));
    }

    @Override
    protected void method_17484c9_Dne(boolean bl, int n) {
        int n2;
        int n3 = this.field_7331eae7_Dne.nextInt(3);
        for (n2 = 0; n2 < n3; ++n2) {
            this.method_9045499d_Dne(zKP.field_20306100_FWm.field_21260d_FWm, 1);
        }
        n2 = 3 + this.field_7331eae7_Dne.nextInt(3);
        for (int i = 0; i < n2; ++i) {
            this.method_9045499d_Dne(dEr.field_5c4c1af_IjH.field_267cf5_Qnq, 1);
        }
    }

    public void method_ce92b9a6_IjH(boolean bl) {
        byte by = this.field_378ab08_Dne.method_ce7f5d95_Dne(16);
        if (bl) {
            this.field_378ab08_Dne.method_62ca2346_FWm(16, (byte)(by | 1));
        } else {
            this.field_378ab08_Dne.method_62ca2346_FWm(16, (byte)(by & 0xFFFFFFFE));
        }
    }

    public int method_c5287a51_qLR() {
        return this.field_2a7663_ZgS;
    }

    @Override
    public void method_8d4fb917_Dne(WkD wkD) {
        super.method_8d4fb917_Dne(wkD);
        wkD.method_5ab48f70_Dne("PlayerCreated", this.method_86921671_LVR());
    }

    public int method_ae128dba_bzF() {
        return this.field_2592c3_One;
    }

    @Override
    public int method_7a46288d_Dne() {
        return 100;
    }

    @Override
    public void method_c6daaac1_Dne(zBn zBn2) {
        if (!this.method_86921671_LVR() && this.field_3673728_Dne != null && this.field_37c3fb6_Dne != null) {
            this.field_37c3fb6_Dne.method_5ab44f92_Dne(this.field_3673728_Dne.method_193de2e9_a_(), -5);
        }
        super.method_c6daaac1_Dne(zBn2);
    }

    @Override
    public void method_8288d6ee_IjH() {
        int n;
        int n2;
        int n3;
        int n4;
        super.method_8288d6ee_IjH();
        if (this.field_2592c3_One > 0) {
            --this.field_2592c3_One;
        }
        if (this.field_2a7663_ZgS > 0) {
            --this.field_2a7663_ZgS;
        }
        if (this.field_291868_XHL * this.field_291868_XHL + this.field_31b811_kGO * this.field_31b811_kGO > 2.500000277905201E-7 && this.field_7331eae7_Dne.nextInt(5) == 0 && (n4 = this.field_36c4f18_Dne.method_2c2cf7bc_Dne(n3 = geR.method_117d0718_FWm(this.field_2f0dd3_div), n2 = geR.method_117d0718_FWm(this.field_22c5fd_IjH - (double)0.2f - (double)this.field_36b0a6_udO), n = geR.method_117d0718_FWm(this.field_334487_mrb))) > 0) {
            this.field_36c4f18_Dne.method_8600ec24_Dne("tilecrack_" + n4 + "_" + this.field_36c4f18_Dne.method_2dee76f_bzF(n3, n2, n), this.field_2f0dd3_div + ((double)this.field_7331eae7_Dne.nextFloat() - 0.5) * (double)this.field_342261_ooe, this.field_373a3ed_Dne.field_212608_FWm + 0.1, this.field_334487_mrb + ((double)this.field_7331eae7_Dne.nextFloat() - 0.5) * (double)this.field_342261_ooe, 4.0 * ((double)this.field_7331eae7_Dne.nextFloat() - 0.5), 0.5, ((double)this.field_7331eae7_Dne.nextFloat() - 0.5) * 4.0);
        }
    }

    @Override
    protected void method_c011aad0_mlD() {
        if (--this.field_21260d_FWm <= 0) {
            this.field_21260d_FWm = 70 + this.field_7331eae7_Dne.nextInt(50);
            this.field_37c3fb6_Dne = this.field_36c4f18_Dne.field_36be6b6_Dne.method_b7b639d5_Dne(geR.method_117d0718_FWm(this.field_2f0dd3_div), geR.method_117d0718_FWm(this.field_22c5fd_IjH), geR.method_117d0718_FWm(this.field_334487_mrb), 32);
            if (this.field_37c3fb6_Dne == null) {
                this.method_74b6e2b5_AgF();
            } else {
                iSh iSh2 = this.field_37c3fb6_Dne.method_23105fed_Dne();
                this.method_2ee8c479_FWm(iSh2.field_2092ae_Dne, iSh2.field_21260d_FWm, iSh2.field_2e5f1b_bzF, (int)((float)this.field_37c3fb6_Dne.method_7a46288d_Dne() * 0.6f));
            }
        }
        super.method_c011aad0_mlD();
    }

    @Override
    protected void method_7c6f6039_FWm() {
        super.method_7c6f6039_FWm();
        this.field_378ab08_Dne.method_ad009545_Dne(16, (byte)0);
    }

    @Override
    protected void method_6b3059b6_div(sMa sMa2) {
        if (sMa2 instanceof ZFz && this.method_b5ceee8_Dne().nextInt(20) == 0) {
            this.method_486cd6af_FWm((FUH)sMa2);
        }
        super.method_6b3059b6_div(sMa2);
    }

    @Override
    public boolean method_ad72a717_bzF(sMa sMa2) {
        this.field_2592c3_One = 10;
        this.field_36c4f18_Dne.method_b43d849c_Dne(this, (byte)4);
        boolean bl = sMa2.method_147b2066_Dne(zBn.method_267d8b79_Dne(this), 7 + this.field_7331eae7_Dne.nextInt(15));
        if (bl) {
            sMa2.field_2a9ad1_Zpi += (double)0.4f;
        }
        this.method_fbd4aee4_Dne("mob.irongolem.throw", 1.0f, 1.0f);
        return bl;
    }

    @Override
    protected String method_a174454e_zGp() {
        return "none";
    }

    @Override
    protected String method_3c9d12fd_DyG() {
        return "mob.irongolem.hit";
    }

    @Override
    public void method_ce7f4362_Dne(byte by) {
        if (by == 4) {
            this.field_2592c3_One = 10;
            this.method_fbd4aee4_Dne("mob.irongolem.throw", 1.0f, 1.0f);
        } else if (by == 11) {
            this.field_2a7663_ZgS = 400;
        } else {
            super.method_ce7f4362_Dne(by);
        }
    }

    public boolean method_86921671_LVR() {
        return (this.field_378ab08_Dne.method_ce7f5d95_Dne(16) & 1) != 0;
    }

    @Override
    protected int method_ce7f5d9c_Dne(int n) {
        return n;
    }

    @Override
    public void method_66a36cd8_FWm(WkD wkD) {
        super.method_66a36cd8_FWm(wkD);
        this.method_ce92b9a6_IjH(wkD.method_110c4dc7_FWm("PlayerCreated"));
    }

    @Override
    public boolean method_5fce35e7_Dne(Class clazz) {
        return this.method_86921671_LVR() && FiG.class.isAssignableFrom(clazz) ? false : super.method_5fce35e7_Dne(clazz);
    }

    public void method_117d59bb_FWm(boolean bl) {
        this.field_2a7663_ZgS = bl ? 400 : 0;
        this.field_36c4f18_Dne.method_b43d849c_Dne(this, (byte)11);
    }

    public uQr method_2315ce15_Dne() {
        return this.field_37c3fb6_Dne;
    }

    @Override
    protected void method_5972745a_Dne(int n, int n2, int n3, int n4) {
        this.method_fbd4aee4_Dne("mob.irongolem.walk", 1.0f, 1.0f);
    }

    @Override
    protected String method_6a89a3dc_div() {
        return "mob.irongolem.death";
    }
}

