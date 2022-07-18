package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class GRq
extends HzK {
    public boolean field_21261e_FWm = false;
    public float field_2e5f18_bzF;
    public int field_21260d_FWm;
    public float field_267cf2_Qnq;
    public float field_21260a_FWm = 0.0f;
    public float field_2d29f1_aFZ = 1.0f;
    public float field_2092ab_Dne = 0.0f;

    @Override
    public void method_8288d6ee_IjH() {
        super.method_8288d6ee_IjH();
        this.field_267cf2_Qnq = this.field_2092ab_Dne;
        this.field_2e5f18_bzF = this.field_21260a_FWm;
        this.field_21260a_FWm = (float)((double)this.field_21260a_FWm + (double)(this.field_2d2a05_aFZ ? -1 : 4) * 0.3);
        if (this.field_21260a_FWm < 0.0f) {
            this.field_21260a_FWm = 0.0f;
        }
        if (this.field_21260a_FWm > 1.0f) {
            this.field_21260a_FWm = 1.0f;
        }
        if (!this.field_2d2a05_aFZ && this.field_2d29f1_aFZ < 1.0f) {
            this.field_2d29f1_aFZ = 1.0f;
        }
        this.field_2d29f1_aFZ = (float)((double)this.field_2d29f1_aFZ * 0.9);
        if (!this.field_2d2a05_aFZ && this.field_2a9ad1_Zpi < 0.0) {
            this.field_2a9ad1_Zpi *= 0.6;
        }
        this.field_2092ab_Dne += this.field_2d29f1_aFZ * 2.0f;
        if (!this.method_8288d6f2_IjH() && !this.field_36c4f18_Dne.field_2d2a05_aFZ && --this.field_21260d_FWm <= 0) {
            this.method_fbd4aee4_Dne("mob.chicken.plop", 1.0f, (this.field_7331eae7_Dne.nextFloat() - this.field_7331eae7_Dne.nextFloat()) * 0.2f + 1.0f);
            if (eCD.method_ce7f5d9c_Dne(1000) == 0) {
                qxi_0.field_36c164d_Dne.method_94d18be5_FWm(new gqg(qxi_0.field_36c164d_Dne, this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb, null));
            } else {
                this.method_9045499d_Dne(dEr.field_b39ca005_KLR.field_267cf5_Qnq, 1);
            }
            this.field_21260d_FWm = this.field_7331eae7_Dne.nextInt(6000) + 6000;
        }
    }

    public GRq method_cb010a63_Dne(Azh azh) {
        return new GRq(this.field_36c4f18_Dne);
    }

    @Override
    protected void method_17484c9_Dne(boolean bl, int n) {
        int n2 = this.field_7331eae7_Dne.nextInt(3) + this.field_7331eae7_Dne.nextInt(1 + n);
        for (int i = 0; i < n2; ++i) {
            this.method_9045499d_Dne(dEr.field_d73ac430_yMz.field_267cf5_Qnq, 1);
        }
        if (this.method_cc5ef5c4_trS()) {
            this.method_9045499d_Dne(dEr.field_bf5ffe54_yIR.field_267cf5_Qnq, 1);
        } else {
            this.method_9045499d_Dne(dEr.field_ba12c5ca_qqL.field_267cf5_Qnq, 1);
        }
    }

    @Override
    protected void method_ce7f5266_Dne(float f) {
    }

    @Override
    public Azh method_cafee53a_Dne(Azh azh) {
        return this.method_cb010a63_Dne(azh);
    }

    @Override
    public int method_7a46288d_Dne() {
        return 4;
    }

    @Override
    protected String method_6a89a3dc_div() {
        return "mob.chicken.hurt";
    }

    @Override
    public boolean method_cbcb3929_tgc() {
        return true;
    }

    @Override
    public boolean method_7c61cf19_Dne(NMq nMq) {
        return nMq != null && nMq.method_230de6ba_Dne() instanceof ocy;
    }

    @Override
    protected String method_a174454e_zGp() {
        return "mob.chicken.say";
    }

    @Override
    protected String method_3c9d12fd_DyG() {
        return "mob.chicken.hurt";
    }

    @Override
    protected int method_baa393f5_kGO() {
        return dEr.field_d73ac430_yMz.field_267cf5_Qnq;
    }

    @Override
    protected void method_5972745a_Dne(int n, int n2, int n3, int n4) {
        this.method_fbd4aee4_Dne("mob.chicken.step", 0.15f, 1.0f);
    }

    public GRq(Qnq qnq) {
        super(qnq);
        this.field_c480ca78_bzF = "/mob/chicken.png";
        this.method_16b621a_Dne(0.3f, 0.7f);
        this.field_21260d_FWm = this.field_7331eae7_Dne.nextInt(6000) + 6000;
        float f = 0.25f;
        this.field_36ae2b9_Dne.method_9212764c_Dne(0, new Cyb(this));
        this.field_36ae2b9_Dne.method_9212764c_Dne(1, new xkg(this, 0.38f));
        this.field_36ae2b9_Dne.method_9212764c_Dne(2, new znX(this, f));
        this.field_36ae2b9_Dne.method_9212764c_Dne(3, new cnh(this, 0.25f, dEr.field_4682511_mlD.field_267cf5_Qnq, false));
        this.field_36ae2b9_Dne.method_9212764c_Dne(4, new NSW(this, 0.28f));
        this.field_36ae2b9_Dne.method_9212764c_Dne(5, new IBw(this, f));
        this.field_36ae2b9_Dne.method_9212764c_Dne(6, new yws(this, FiG.class, 6.0f));
        this.field_36ae2b9_Dne.method_9212764c_Dne(7, new cHg(this));
    }
}

