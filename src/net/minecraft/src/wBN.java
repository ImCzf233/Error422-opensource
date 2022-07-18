package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class wBN
extends HzK {
    @Override
    protected void method_17484c9_Dne(boolean bl, int n) {
        int n2;
        int n3 = this.field_7331eae7_Dne.nextInt(3) + this.field_7331eae7_Dne.nextInt(1 + n);
        for (n2 = 0; n2 < n3; ++n2) {
            this.method_9045499d_Dne(dEr.field_443297f2_LoG.field_267cf5_Qnq, 1);
        }
        n3 = this.field_7331eae7_Dne.nextInt(3) + 1 + this.field_7331eae7_Dne.nextInt(1 + n);
        for (n2 = 0; n2 < n3; ++n2) {
            if (this.method_cc5ef5c4_trS()) {
                this.method_9045499d_Dne(dEr.field_b204f0b_mzX.field_267cf5_Qnq, 1);
                continue;
            }
            this.method_9045499d_Dne(dEr.field_728123b7_ipf.field_267cf5_Qnq, 1);
        }
    }

    @Override
    public int method_7a46288d_Dne() {
        return 10;
    }

    @Override
    public boolean method_21db0ca_a_(FiG fiG) {
        NMq nMq = fiG.field_36a059b_Dne.method_23040479_Dne();
        if (nMq != null && nMq.field_2e5f1b_bzF == dEr.field_5ac2e6dc_qMV.field_267cf5_Qnq) {
            dEr dEr2 = dEr.field_2397d578_EwP;
            if (eCD.method_ce7f5d9c_Dne(3) == 0) {
                dEr dEr3 = dEr2 = eCD.method_ce7f5d9c_Dne(2) == 0 ? dEr.field_6a28e7c8_xXN : dEr.field_dface822_cHy;
            }
            if (--nMq.field_2092ae_Dne <= 0) {
                fiG.field_36a059b_Dne.method_6e3a6b66_Dne(fiG.field_36a059b_Dne.field_2092ae_Dne, new NMq(dEr2));
            } else if (!fiG.field_36a059b_Dne.method_7c61cf19_Dne(new NMq(dEr2))) {
                fiG.method_c9a088b8_Dne(new NMq(dEr2.field_267cf5_Qnq, 1, 0));
            }
            return true;
        }
        return super.method_21db0ca_a_(fiG);
    }

    @Override
    protected String method_3c9d12fd_DyG() {
        return "mob.cow.hurt";
    }

    @Override
    public boolean method_cbcb3929_tgc() {
        return true;
    }

    @Override
    protected String method_6a89a3dc_div() {
        return "mob.cow.hurt";
    }

    @Override
    public Azh method_cafee53a_Dne(Azh azh) {
        return this.method_cb169be6_Dne(azh);
    }

    @Override
    protected int method_baa393f5_kGO() {
        return dEr.field_443297f2_LoG.field_267cf5_Qnq;
    }

    @Override
    protected void method_5972745a_Dne(int n, int n2, int n3, int n4) {
        this.method_fbd4aee4_Dne("mob.cow.step", 0.15f, 1.0f);
    }

    @Override
    protected String method_a174454e_zGp() {
        return "mob.cow.say";
    }

    public wBN method_cb169be6_Dne(Azh azh) {
        return new wBN(this.field_36c4f18_Dne);
    }

    public wBN(Qnq qnq) {
        super(qnq);
        this.field_c480ca78_bzF = "/mob/cow.png";
        this.method_16b621a_Dne(0.9f, 1.3f);
        this.method_23028a4c_Dne().method_ce7f9d7a_Dne(true);
        this.field_36ae2b9_Dne.method_9212764c_Dne(0, new Cyb(this));
        this.field_36ae2b9_Dne.method_9212764c_Dne(1, new xkg(this, 0.38f));
        this.field_36ae2b9_Dne.method_9212764c_Dne(2, new znX(this, 0.2f));
        this.field_36ae2b9_Dne.method_9212764c_Dne(3, new cnh(this, 0.25f, dEr.field_ce7bf76e_EWz.field_267cf5_Qnq, false));
        this.field_36ae2b9_Dne.method_9212764c_Dne(4, new NSW(this, 0.25f));
        this.field_36ae2b9_Dne.method_9212764c_Dne(5, new IBw(this, 0.2f));
        this.field_36ae2b9_Dne.method_9212764c_Dne(6, new yws(this, FiG.class, 6.0f));
        this.field_36ae2b9_Dne.method_9212764c_Dne(7, new cHg(this));
    }

    @Override
    protected float method_b0a28134_div() {
        return 0.4f;
    }
}

