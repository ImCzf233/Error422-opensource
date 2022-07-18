package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class Ydw
extends cMv {
    private pjB field_37a51e4_Dne;
    private int field_2092ae_Dne;
    private CDE field_3654ee8_Dne;

    @Override
    public void method_7a46289a_Dne() {
        this.field_2092ae_Dne = 400;
        this.field_3654ee8_Dne.method_117d59bb_FWm(true);
    }

    @Override
    public boolean method_7a46289e_Dne() {
        if (!this.field_3654ee8_Dne.field_36c4f18_Dne.method_7a46289e_Dne()) {
            return false;
        }
        if (this.field_3654ee8_Dne.method_b5ceee8_Dne().nextInt(8000) != 0) {
            return false;
        }
        this.field_37a51e4_Dne = (pjB)this.field_3654ee8_Dne.field_36c4f18_Dne.method_82785e85_Dne(pjB.class, this.field_3654ee8_Dne.field_373a3ed_Dne.method_b78565d7_FWm(6.0, 2.0, 6.0), this.field_3654ee8_Dne);
        return this.field_37a51e4_Dne != null;
    }

    @Override
    public void method_ae128dc7_bzF() {
        this.field_3654ee8_Dne.method_230db26a_Dne().method_d3754820_Dne(this.field_37a51e4_Dne, 30.0f, 30.0f);
        --this.field_2092ae_Dne;
    }

    public Ydw(CDE cDE) {
        this.field_3654ee8_Dne = cDE;
        this.method_ce7f5da9_Dne(3);
    }

    @Override
    public void method_7c6f6039_FWm() {
        this.field_3654ee8_Dne.method_117d59bb_FWm(false);
        this.field_37a51e4_Dne = null;
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return this.field_2092ae_Dne > 0;
    }
}

