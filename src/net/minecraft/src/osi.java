package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class osi
extends LHi {
    @Override
    public int method_7a46288d_Dne() {
        return 16;
    }

    @Override
    protected String method_6a89a3dc_div() {
        return "mob.spider.death";
    }

    @Override
    protected String method_a174454e_zGp() {
        return "mob.spider.say";
    }

    public boolean method_86921671_LVR() {
        return (this.field_378ab08_Dne.method_ce7f5d95_Dne(16) & 1) != 0;
    }

    @Override
    public void method_80692b1a_ICU() {
        if (this.field_36c4f18_Dne.field_7331eae7_Dne.nextInt(100) == 0) {
            yxx_0 yxx_02 = new yxx_0(this.field_36c4f18_Dne);
            yxx_02.method_9ce0fc65_FWm(this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb, this.field_334489_mrb, 0.0f);
            yxx_02.method_80692b1a_ICU();
            this.field_36c4f18_Dne.method_94d18be5_FWm(yxx_02);
            yxx_02.method_ad72a713_bzF(this);
        }
    }

    public float method_9a443a89_XHL() {
        return 1.0f;
    }

    @Override
    protected String method_3c9d12fd_DyG() {
        return "mob.spider.say";
    }

    @Override
    protected void method_7c6f6039_FWm() {
        super.method_7c6f6039_FWm();
        this.field_378ab08_Dne.method_ad009545_Dne(16, (byte) 0);
    }

    @Override
    public double method_a98a064e_aFZ() {
        return (double)this.field_367151_trS * 0.75 - 0.5;
    }

    @Override
    protected void method_b43d93a0_Dne(sMa sMa2, float f) {
        float f2 = this.method_ce7f5256_Dne(1.0f);
        if (f2 > 0.5f && this.field_7331eae7_Dne.nextInt(100) == 0) {
            this.field_75c313d2_bzF = null;
        } else if (f > 2.0f && f < 6.0f && this.field_7331eae7_Dne.nextInt(10) == 0) {
            if (this.field_2d2a05_aFZ) {
                double d = sMa2.field_2f0dd3_div - this.field_2f0dd3_div;
                double d2 = sMa2.field_334487_mrb - this.field_334487_mrb;
                float f3 = geR.method_ce7f4ad4_Dne(d * d + d2 * d2);
                this.field_291868_XHL = d / (double)f3 * 0.5 * (double)0.8f + this.field_291868_XHL * (double)0.2f;
                this.field_31b811_kGO = d2 / (double)f3 * 0.5 * (double)0.8f + this.field_31b811_kGO * (double)0.2f;
                this.field_2a9ad1_Zpi = 0.4f;
            }
        } else {
            super.method_b43d93a0_Dne(sMa2, f);
        }
    }

    @Override
    public void method_cbcb3925_tgc() {
    }

    @Override
    public void method_7a46289a_Dne() {
        super.method_7a46289a_Dne();
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ) {
            this.method_117d59bb_FWm(this.field_388db7_zGp);
        }
    }

    public osi(Qnq qnq) {
        super(qnq);
        this.field_c480ca78_bzF = "/mob/spider.png";
        this.method_16b621a_Dne(1.4f, 0.9f);
        this.field_2e1df2_cHy = 0.8f;
    }

    @Override
    public aYc method_230cd2e0_Dne() {
        return aYc.field_75bb126e_bzF;
    }

    @Override
    public boolean method_b0a28148_div() {
        return this.method_86921671_LVR();
    }

    public void method_117d59bb_FWm(boolean bl) {
        byte by = this.field_378ab08_Dne.method_ce7f5d95_Dne(16);
        by = bl ? (byte)(by | 1) : (byte)(by & 0xFFFFFFFE);
        this.field_378ab08_Dne.method_62ca2346_FWm(16, by);
    }

    @Override
    public boolean method_7bbbe3a6_Dne(NAx nAx) {
        return nAx.method_7a46288d_Dne() == SXd.field_84fe2985_ceE.field_2092ae_Dne ? false : super.method_7bbbe3a6_Dne(nAx);
    }

    @Override
    protected void method_17484c9_Dne(boolean bl, int n) {
        super.method_17484c9_Dne(bl, n);
        if (bl && (this.field_7331eae7_Dne.nextInt(3) == 0 || this.field_7331eae7_Dne.nextInt(1 + n) > 0)) {
            this.method_9045499d_Dne(dEr.field_fad9f794_EYV.field_267cf5_Qnq, 1);
        }
    }

    @Override
    protected int method_baa393f5_kGO() {
        return dEr.field_249ef7b6_AgF.field_267cf5_Qnq;
    }

    @Override
    protected void method_5972745a_Dne(int n, int n2, int n3, int n4) {
        this.method_fbd4aee4_Dne("mob.spider.step", 0.15f, 1.0f);
    }

    @Override
    protected sMa method_2314d444_Dne() {
        float f = this.method_ce7f5256_Dne(1.0f);
        if (f < 0.5f) {
            double d = 16.0;
            return this.field_36c4f18_Dne.method_c32e43ea_FWm(this, d);
        }
        return null;
    }
}

