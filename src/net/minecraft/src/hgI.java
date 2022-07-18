package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class hgI
extends cMv {
    private int field_2092ae_Dne;
    private float field_2092ab_Dne;
    private Qnq field_36c4f18_Dne;
    private oEB field_37952a0_Dne;
    private FiG field_3673728_Dne;

    @Override
    public void method_7c6f6039_FWm() {
        this.field_37952a0_Dne.method_99cf9f12_kGO(false);
        this.field_3673728_Dne = null;
    }

    public hgI(oEB oEB2, float f) {
        this.field_37952a0_Dne = oEB2;
        this.field_36c4f18_Dne = oEB2.field_36c4f18_Dne;
        this.field_2092ab_Dne = f;
        this.method_ce7f5da9_Dne(2);
    }

    @Override
    public boolean method_7a46289e_Dne() {
        this.field_3673728_Dne = this.field_36c4f18_Dne.method_3d2c70b_Dne(this.field_37952a0_Dne, this.field_2092ab_Dne);
        return this.field_3673728_Dne == null ? false : this.method_703284a7_Dne(this.field_3673728_Dne);
    }

    @Override
    public void method_7a46289a_Dne() {
        this.field_37952a0_Dne.method_99cf9f12_kGO(true);
        this.field_2092ae_Dne = 40 + this.field_37952a0_Dne.method_b5ceee8_Dne().nextInt(40);
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return !this.field_3673728_Dne.method_cd4cb3d9_udO() ? false : (this.field_37952a0_Dne.method_bb7dd80e_Dne(this.field_3673728_Dne) > (double)(this.field_2092ab_Dne * this.field_2092ab_Dne) ? false : this.field_2092ae_Dne > 0 && this.method_703284a7_Dne(this.field_3673728_Dne));
    }

    private boolean method_703284a7_Dne(FiG fiG) {
        NMq nMq = fiG.field_36a059b_Dne.method_23040479_Dne();
        return nMq == null ? false : (!this.field_37952a0_Dne.method_86921671_LVR() && nMq.field_2e5f1b_bzF == dEr.field_fc3bf6d1_tIz.field_267cf5_Qnq ? true : this.field_37952a0_Dne.method_7c61cf19_Dne(nMq));
    }

    @Override
    public void method_ae128dc7_bzF() {
        this.field_37952a0_Dne.method_230db26a_Dne().method_c38d48a4_Dne(this.field_3673728_Dne.field_2f0dd3_div, this.field_3673728_Dne.field_22c5fd_IjH + (double)this.field_3673728_Dne.method_59ee189_c_(), this.field_3673728_Dne.field_334487_mrb, 10.0f, this.field_37952a0_Dne.method_cd4cb3c8_udO());
        --this.field_2092ae_Dne;
    }
}

