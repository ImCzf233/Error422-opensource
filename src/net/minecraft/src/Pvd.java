package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class Pvd
extends HzK {
    private zmN field_37eea51_Dne;
    private final Uqm field_36e2b5b_Dne = new Uqm(new AoH(this), 2, 1);
    private int field_21260d_FWm;
    public static final float[][] field_7a46ee0b_Dne = new float[][]{{1.0f, 1.0f, 1.0f}, {0.85f, 0.5f, 0.2f}, {0.7f, 0.3f, 0.85f}, {0.4f, 0.6f, 0.85f}, {0.9f, 0.9f, 0.2f}, {0.5f, 0.8f, 0.1f}, {0.95f, 0.5f, 0.65f}, {0.3f, 0.3f, 0.3f}, {0.6f, 0.6f, 0.6f}, {0.3f, 0.5f, 0.6f}, {0.5f, 0.25f, 0.7f}, {0.2f, 0.3f, 0.7f}, {0.4f, 0.3f, 0.2f}, {0.4f, 0.5f, 0.2f}, {0.6f, 0.2f, 0.2f}, {0.1f, 0.1f, 0.1f}};

    public Pvd method_cb05a74b_Dne(Azh azh) {
        Pvd pvd = (Pvd)azh;
        Pvd pvd2 = new Pvd(this.field_36c4f18_Dne);
        int n = this.method_1311fd0d_Dne(this, pvd);
        pvd2.method_99cf5f41_kGO(15 - n);
        return pvd2;
    }

    @Override
    protected void method_17484c9_Dne(boolean bl, int n) {
        if (!this.method_86921671_LVR()) {
            this.method_2cda29ee_Dne(new NMq(zKP.field_9f40014e_RPx.field_21260d_FWm, 1, this.method_c5287a51_qLR()), 0.0f);
        }
    }

    public float method_143f92c9_bzF(float f) {
        return this.field_21260d_FWm <= 0 ? 0.0f : (this.field_21260d_FWm >= 4 && this.field_21260d_FWm <= 36 ? 1.0f : (this.field_21260d_FWm < 4 ? ((float)this.field_21260d_FWm - f) / 4.0f : -((float)(this.field_21260d_FWm - 40) - f) / 4.0f));
    }

    @Override
    public void method_c5dec32d_qXo() {
        this.method_ce92b9a6_IjH(false);
        if (this.method_8288d6f2_IjH()) {
            int n = this.method_ae128dba_bzF() + 1200;
            if (n > 0) {
                n = 0;
            }
            this.method_117d19ea_FWm(n);
        }
    }

    @Override
    public Azh method_cafee53a_Dne(Azh azh) {
        return this.method_cb05a74b_Dne(azh);
    }

    public float method_7ed96eaf_Qnq(float f) {
        if (this.field_21260d_FWm > 4 && this.field_21260d_FWm <= 36) {
            float f2 = ((float)(this.field_21260d_FWm - 4) - f) / 32.0f;
            return 0.62831855f + 0.2199115f * geR.method_ce7f5256_Dne(f2 * 28.7f);
        }
        return this.field_21260d_FWm > 0 ? 0.62831855f : this.field_29186a_XHL / 57.295776f;
    }

    @Override
    protected int method_baa393f5_kGO() {
        return zKP.field_9f40014e_RPx.field_21260d_FWm;
    }

    public Pvd(Qnq qnq) {
        super(qnq);
        this.field_37eea51_Dne = new zmN(this);
        this.field_c480ca78_bzF = "/mob/sheep.png";
        this.method_16b621a_Dne(0.9f, 1.3f);
        float f = 0.23f;
        this.method_23028a4c_Dne().method_ce7f9d7a_Dne(true);
        this.field_36ae2b9_Dne.method_9212764c_Dne(0, new Cyb(this));
        this.field_36ae2b9_Dne.method_9212764c_Dne(1, new xkg(this, 0.38f));
        this.field_36ae2b9_Dne.method_9212764c_Dne(2, new znX(this, f));
        this.field_36ae2b9_Dne.method_9212764c_Dne(3, new cnh(this, 0.25f, dEr.field_ce7bf76e_EWz.field_267cf5_Qnq, false));
        this.field_36ae2b9_Dne.method_9212764c_Dne(4, new NSW(this, 0.25f));
        this.field_36ae2b9_Dne.method_9212764c_Dne(5, this.field_37eea51_Dne);
        this.field_36ae2b9_Dne.method_9212764c_Dne(6, new IBw(this, f));
        this.field_36ae2b9_Dne.method_9212764c_Dne(7, new yws(this, FiG.class, 6.0f));
        this.field_36ae2b9_Dne.method_9212764c_Dne(8, new cHg(this));
        this.field_36e2b5b_Dne.method_6e3a6b66_Dne(0, new NMq(dEr.field_5d50330c_edi, 1, 0));
        this.field_36e2b5b_Dne.method_6e3a6b66_Dne(1, new NMq(dEr.field_5d50330c_edi, 1, 0));
    }

    private int method_748d96e1_Dne(HzK hzK) {
        return 15 - ((Pvd)hzK).method_c5287a51_qLR();
    }

    @Override
    protected void method_7c6f6039_FWm() {
        super.method_7c6f6039_FWm();
        this.field_378ab08_Dne.method_ad009545_Dne(16, (byte) 0);
    }

    public void method_ce92b9a6_IjH(boolean bl) {
        byte by = this.field_378ab08_Dne.method_ce7f5d95_Dne(16);
        if (bl) {
            this.field_378ab08_Dne.method_62ca2346_FWm(16, (byte)(by | 0x10));
        } else {
            this.field_378ab08_Dne.method_62ca2346_FWm(16, (byte)(by & 0xFFFFFFEF));
        }
    }

    @Override
    public int method_7a46288d_Dne() {
        return 8;
    }

    @Override
    public void method_8d4fb917_Dne(WkD wkD) {
        super.method_8d4fb917_Dne(wkD);
        wkD.method_5ab48f70_Dne("Sheared", this.method_86921671_LVR());
        wkD.method_5ab43558_Dne("Color", (byte)this.method_c5287a51_qLR());
    }

    @Override
    public boolean method_21db0ca_a_(FiG fiG) {
        NMq nMq = fiG.field_36a059b_Dne.method_23040479_Dne();
        if (nMq != null && nMq.field_2e5f1b_bzF == dEr.field_37078f6_Dne.field_267cf5_Qnq && !this.method_86921671_LVR() && !this.method_8288d6f2_IjH()) {
            if (!this.field_36c4f18_Dne.field_2d2a05_aFZ) {
                this.method_ce92b9a6_IjH(true);
                int n = 1 + this.field_7331eae7_Dne.nextInt(3);
                for (int i = 0; i < n; ++i) {
                    JiM jiM = this.method_2cda29ee_Dne(new NMq(zKP.field_9f40014e_RPx.field_21260d_FWm, 1, this.method_c5287a51_qLR()), 1.0f);
                    jiM.field_2a9ad1_Zpi += (double)(this.field_7331eae7_Dne.nextFloat() * 0.05f);
                    jiM.field_291868_XHL += (double)((this.field_7331eae7_Dne.nextFloat() - this.field_7331eae7_Dne.nextFloat()) * 0.1f);
                    jiM.field_31b811_kGO += (double)((this.field_7331eae7_Dne.nextFloat() - this.field_7331eae7_Dne.nextFloat()) * 0.1f);
                }
            }
            nMq.method_60f1bf3f_Dne(1, fiG);
            this.method_fbd4aee4_Dne("mob.sheep.shear", 1.0f, 1.0f);
        }
        return super.method_21db0ca_a_(fiG);
    }

    @Override
    protected void method_5972745a_Dne(int n, int n2, int n3, int n4) {
        this.method_fbd4aee4_Dne("mob.sheep.step", 0.15f, 1.0f);
    }

    @Override
    protected void method_b077c662_eHV() {
        this.field_21260d_FWm = this.field_37eea51_Dne.method_7a46288d_Dne();
        super.method_b077c662_eHV();
    }

    @Override
    public void method_66a36cd8_FWm(WkD wkD) {
        super.method_66a36cd8_FWm(wkD);
        this.method_ce92b9a6_IjH(wkD.method_110c4dc7_FWm("Sheared"));
        this.method_99cf5f41_kGO(wkD.method_8f501fd0_Dne("Color"));
    }

    private int method_1311fd0d_Dne(HzK hzK, HzK hzK2) {
        int n = this.method_748d96e1_Dne(hzK);
        int n2 = this.method_748d96e1_Dne(hzK2);
        this.field_36e2b5b_Dne.method_9e6e1a08_Dne(0).method_ce7f5da9_Dne(n);
        this.field_36e2b5b_Dne.method_9e6e1a08_Dne(1).method_ce7f5da9_Dne(n2);
        NMq nMq = aXt.method_230cd12e_Dne().method_6c5d33f6_Dne(this.field_36e2b5b_Dne, ((Pvd)hzK).field_36c4f18_Dne);
        int n3 = nMq != null && nMq.method_230de6ba_Dne().field_267cf5_Qnq == dEr.field_5d50330c_edi.field_267cf5_Qnq ? nMq.method_907a9d14_Qnq() : (this.field_36c4f18_Dne.field_7331eae7_Dne.nextBoolean() ? n : n2);
        return n3;
    }

    @Override
    protected String method_a174454e_zGp() {
        return "mob.sheep.say";
    }

    public void method_99cf5f41_kGO(int n) {
        byte by = this.field_378ab08_Dne.method_ce7f5d95_Dne(16);
        this.field_378ab08_Dne.method_62ca2346_FWm(16, (byte)(by & 0xF0 | n & 0xF));
    }

    @Override
    public void method_ce7f4362_Dne(byte by) {
        if (by == 10) {
            this.field_21260d_FWm = 40;
        } else {
            super.method_ce7f4362_Dne(by);
        }
    }

    @Override
    protected String method_6a89a3dc_div() {
        return "mob.sheep.say";
    }

    @Override
    public void method_80692b1a_ICU() {
        this.method_99cf5f41_kGO(Pvd.method_cfc9daf9_Dne(this.field_36c4f18_Dne.field_7331eae7_Dne));
    }

    public static int method_cfc9daf9_Dne(Random random) {
        int n = random.nextInt(100);
        return n < 5 ? 15 : (n < 10 ? 7 : (n < 15 ? 8 : (n < 18 ? 12 : (random.nextInt(500) == 0 ? 6 : 0))));
    }

    @Override
    protected String method_3c9d12fd_DyG() {
        return "mob.sheep.say";
    }

    @Override
    public void method_8288d6ee_IjH() {
        if (this.field_36c4f18_Dne.field_2d2a05_aFZ) {
            this.field_21260d_FWm = Math.max(0, this.field_21260d_FWm - 1);
        }
        super.method_8288d6ee_IjH();
    }

    public boolean method_86921671_LVR() {
        return (this.field_378ab08_Dne.method_ce7f5d95_Dne(16) & 0x10) != 0;
    }

    public int method_c5287a51_qLR() {
        return this.field_378ab08_Dne.method_ce7f5d95_Dne(16) & 0xF;
    }

    @Override
    protected boolean method_cbcb3929_tgc() {
        return true;
    }
}

