package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class gls
extends LHi {
    private int field_2a7663_ZgS = 30;
    private int field_2f0276_eHV = 3;
    private int field_21260d_FWm;
    private int field_2592c3_One;

    public int method_ae128dba_bzF() {
        return this.field_378ab08_Dne.method_ce7f5d95_Dne(16);
    }

    public void method_117d19ea_FWm(int n) {
        this.field_378ab08_Dne.method_62ca2346_FWm(16, (byte)n);
    }

    @Override
    protected int method_baa393f5_kGO() {
        return dEr.field_e637b3ee_cot.field_267cf5_Qnq;
    }

    public float method_143f92c9_bzF(float f) {
        return ((float)this.field_21260d_FWm + (float)(this.field_2592c3_One - this.field_21260d_FWm) * f) / (float)(this.field_2a7663_ZgS - 2);
    }

    @Override
    protected void method_ce7f5266_Dne(float f) {
        super.method_ce7f5266_Dne(f);
        this.field_2592c3_One = (int)((float)this.field_2592c3_One + f * 1.5f);
        if (this.field_2592c3_One > this.field_2a7663_ZgS - 5) {
            this.field_2592c3_One = this.field_2a7663_ZgS - 5;
        }
    }

    @Override
    protected void method_7c6f6039_FWm() {
        super.method_7c6f6039_FWm();
        this.field_378ab08_Dne.method_ad009545_Dne(16, (byte)-1);
        this.field_378ab08_Dne.method_ad009545_Dne(17, (byte)0);
    }

    @Override
    public void method_66a36cd8_FWm(WkD wkD) {
        super.method_66a36cd8_FWm(wkD);
        this.field_378ab08_Dne.method_62ca2346_FWm(17, (byte)(wkD.method_110c4dc7_FWm("powered") ? 1 : 0));
        if (wkD.method_8f501fe8_Dne("Fuse")) {
            this.field_2a7663_ZgS = wkD.method_8f501fe1_Dne("Fuse");
        }
        if (wkD.method_8f501fe8_Dne("ExplosionRadius")) {
            this.field_2f0276_eHV = wkD.method_8f501fd0_Dne("ExplosionRadius");
        }
    }

    @Override
    public boolean method_cbcb3929_tgc() {
        return true;
    }

    public boolean method_86921671_LVR() {
        return this.field_378ab08_Dne.method_ce7f5d95_Dne(17) == 1;
    }

    @Override
    public void method_8d4fb917_Dne(WkD wkD) {
        super.method_8d4fb917_Dne(wkD);
        if (this.field_378ab08_Dne.method_ce7f5d95_Dne(17) == 1) {
            wkD.method_5ab48f70_Dne("powered", true);
        }
        wkD.method_5ab47529_Dne("Fuse", (short)this.field_2a7663_ZgS);
        wkD.method_5ab43558_Dne("ExplosionRadius", (byte)this.field_2f0276_eHV);
    }

    @Override
    public int method_7c6f602c_FWm() {
        return this.method_228c813f_bzF() == null ? 3 : 3 + (this.field_28e7fd_Vxn - 1);
    }

    @Override
    public boolean method_ad72a717_bzF(sMa sMa2) {
        return true;
    }

    @Override
    public void method_7a46289a_Dne() {
        if (this.method_cd4cb3d9_udO()) {
            this.field_21260d_FWm = this.field_2592c3_One;
            int n = this.method_ae128dba_bzF();
            if (n > 0 && this.field_2592c3_One == 0) {
                this.method_fbd4aee4_Dne("random.fuse", 1.0f, 0.5f);
            }
            this.field_2592c3_One += n;
            if (this.field_2592c3_One < 0) {
                this.field_2592c3_One = 0;
            }
            if (this.field_2592c3_One >= this.field_2a7663_ZgS) {
                this.field_2592c3_One = this.field_2a7663_ZgS;
                if (!this.field_36c4f18_Dne.field_2d2a05_aFZ) {
                    boolean bl = this.field_36c4f18_Dne.method_230cbc5a_Dne().method_8f501fe8_Dne("mobGriefing");
                    if (this.method_86921671_LVR()) {
                        this.field_36c4f18_Dne.method_95c6ba4c_Dne(this, this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb, this.field_2f0276_eHV * 2, bl);
                    } else {
                        this.field_36c4f18_Dne.method_95c6ba4c_Dne(this, this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb, this.field_2f0276_eHV, bl);
                    }
                    this.method_5d73f9d_g_();
                }
            }
        }
        super.method_7a46289a_Dne();
    }

    @Override
    protected String method_3c9d12fd_DyG() {
        return "mob.creeper.say";
    }

    @Override
    public int method_7a46288d_Dne() {
        return 20;
    }

    @Override
    protected String method_6a89a3dc_div() {
        return "mob.creeper.death";
    }

    @Override
    public void method_c6daaac1_Dne(zBn zBn2) {
        super.method_c6daaac1_Dne(zBn2);
        if (zBn2.method_f88b2463_FWm() instanceof yxx_0) {
            int n = dEr.field_798af737_iTJ.field_267cf5_Qnq + this.field_7331eae7_Dne.nextInt(dEr.field_cf9bd1d3_elJ.field_267cf5_Qnq - dEr.field_798af737_iTJ.field_267cf5_Qnq + 1);
            this.method_9045499d_Dne(n, 1);
        }
    }

    @Override
    public void method_c3d0e3d0_Dne(xIh xIh2) {
        super.method_c3d0e3d0_Dne(xIh2);
        this.field_378ab08_Dne.method_62ca2346_FWm(17, (byte)1);
    }

    public gls(Qnq qnq) {
        super(qnq);
        this.field_c480ca78_bzF = "/mob/creeper.png";
        this.field_36ae2b9_Dne.method_9212764c_Dne(1, new Cyb(this));
        this.field_36ae2b9_Dne.method_9212764c_Dne(2, new VOo(this));
        this.field_36ae2b9_Dne.method_9212764c_Dne(3, new RlP(this, kQo.class, 6.0f, 0.25f, 0.3f));
        this.field_36ae2b9_Dne.method_9212764c_Dne(4, new etz_0(this, 0.25f, false));
        this.field_36ae2b9_Dne.method_9212764c_Dne(5, new IBw(this, 0.2f));
        this.field_36ae2b9_Dne.method_9212764c_Dne(6, new yws(this, FiG.class, 8.0f));
        this.field_36ae2b9_Dne.method_9212764c_Dne(6, new cHg(this));
        this.field_2024ae98_FWm.method_9212764c_Dne(1, new AmF(this, FiG.class, 16.0f, 0, true));
        this.field_2024ae98_FWm.method_9212764c_Dne(2, new QRF(this, false));
        if (eCD.method_ce7f5d9c_Dne(20) == 0) {
            this.field_2a7663_ZgS = 1;
        }
    }
}

