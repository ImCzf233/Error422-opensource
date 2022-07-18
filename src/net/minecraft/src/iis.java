package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class iis
extends Tdr {
    public int field_2092ae_Dne = 1;

    @Override
    public void method_8d4fb917_Dne(WkD wkD) {
        super.method_8d4fb917_Dne(wkD);
        wkD.method_5ab44f9f_Dne("ExplosionPower", this.field_2092ae_Dne);
    }

    public iis(Qnq qnq, double d, double d2, double d3, double d4, double d5, double d6) {
        super(qnq, d, d2, d3, d4, d5, d6);
    }

    public iis(Qnq qnq) {
        super(qnq);
    }

    @Override
    protected void method_c1ff67d0_Dne(wHH wHH2) {
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ) {
            if (wHH2.field_37b45e5_Dne != null) {
                wHH2.field_37b45e5_Dne.method_147b2066_Dne(zBn.method_19bd6ce0_Dne(this, this.field_366ec33_Dne), 6);
            }
            this.field_36c4f18_Dne.method_4ff037c_Dne(null, this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb, this.field_2092ae_Dne, true, this.field_36c4f18_Dne.method_230cbc5a_Dne().method_8f501fe8_Dne("mobGriefing"));
            this.method_5d73f9d_g_();
        }
    }

    public iis(Qnq qnq, FUH fUH, double d, double d2, double d3) {
        super(qnq, fUH, d, d2, d3);
    }

    @Override
    public void method_66a36cd8_FWm(WkD wkD) {
        super.method_66a36cd8_FWm(wkD);
        if (wkD.method_8f501fe8_Dne("ExplosionPower")) {
            this.field_2092ae_Dne = wkD.method_8f501fd7_Dne("ExplosionPower");
        }
    }
}

