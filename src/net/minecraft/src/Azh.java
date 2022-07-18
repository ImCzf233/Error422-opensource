package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public abstract class Azh
extends kSJ {
    private float field_2092ab_Dne = -1.0f;
    private float field_21260a_FWm;

    @Override
    public boolean method_21db0ca_a_(FiG fiG) {
        Azh azh;
        Class clazz;
        NMq nMq = fiG.field_36a059b_Dne.method_23040479_Dne();
        if (nMq != null && nMq.field_2e5f1b_bzF == dEr.field_1525a142_ghu.field_267cf5_Qnq && !this.field_36c4f18_Dne.field_2d2a05_aFZ && (clazz = Klb.method_27b67c56_Dne(nMq.method_907a9d14_Qnq())) != null && clazz.isAssignableFrom(this.getClass()) && (azh = this.method_cafee53a_Dne(this)) != null) {
            azh.method_117d19ea_FWm(-24000);
            azh.method_9ce0fc65_FWm(this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb, 0.0f, 0.0f);
            this.field_36c4f18_Dne.method_94d18be5_FWm(azh);
            if (nMq.method_d44b4596_zGp()) {
                azh.method_a9a920ab_Qnq(nMq.method_d1f1ed87_FWm());
            }
            if (!fiG.field_37cb681_Dne.field_267d06_Qnq) {
                --nMq.field_2092ae_Dne;
                if (nMq.field_2092ae_Dne <= 0) {
                    fiG.field_36a059b_Dne.method_6e3a6b66_Dne(fiG.field_36a059b_Dne.field_2092ae_Dne, null);
                }
            }
        }
        return super.method_21db0ca_a_(fiG);
    }

    private void method_87b72d60_aFZ(float f) {
        super.method_16b621a_Dne(this.field_2092ab_Dne * f, this.field_21260a_FWm * f);
    }

    public void method_117d19ea_FWm(int n) {
        this.field_378ab08_Dne.method_62ca2346_FWm(12, n);
        this.method_117d59bb_FWm(this.method_8288d6f2_IjH());
    }

    @Override
    public void method_8d4fb917_Dne(WkD wkD) {
        super.method_8d4fb917_Dne(wkD);
        wkD.method_5ab44f9f_Dne("Age", this.method_ae128dba_bzF());
    }

    public int method_ae128dba_bzF() {
        return this.field_378ab08_Dne.method_ce7f5d9c_Dne(12);
    }

    public Azh(Qnq qnq) {
        super(qnq);
    }

    @Override
    public void method_66a36cd8_FWm(WkD wkD) {
        super.method_66a36cd8_FWm(wkD);
        this.method_117d19ea_FWm(wkD.method_8f501fd7_Dne("Age"));
    }

    public void method_117d59bb_FWm(boolean bl) {
        this.method_87b72d60_aFZ(bl ? 0.5f : 1.0f);
    }

    @Override
    public boolean method_8288d6f2_IjH() {
        return this.method_ae128dba_bzF() < 0;
    }

    @Override
    protected final void method_16b621a_Dne(float f, float f2) {
        boolean bl = this.field_2092ab_Dne > 0.0f;
        this.field_2092ab_Dne = f;
        this.field_21260a_FWm = f2;
        if (!bl) {
            this.method_87b72d60_aFZ(1.0f);
        }
    }

    public abstract Azh method_cafee53a_Dne(Azh var1);

    @Override
    public void method_8288d6ee_IjH() {
        super.method_8288d6ee_IjH();
        if (this.field_36c4f18_Dne.field_2d2a05_aFZ) {
            this.method_117d59bb_FWm(this.method_8288d6f2_IjH());
        } else {
            int n = this.method_ae128dba_bzF();
            if (n < 0) {
                this.method_117d19ea_FWm(++n);
            } else if (n > 0) {
                this.method_117d19ea_FWm(--n);
            }
        }
    }

    @Override
    protected void method_7c6f6039_FWm() {
        super.method_7c6f6039_FWm();
        this.field_378ab08_Dne.method_ad009545_Dne(12, new Integer(0));
    }
}

