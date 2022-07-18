package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class VOo
extends cMv {
    gls field_37647fe_Dne;
    FUH field_366ec33_Dne;

    public VOo(gls gls2) {
        this.field_37647fe_Dne = gls2;
        this.method_ce7f5da9_Dne(1);
    }

    @Override
    public boolean method_7a46289e_Dne() {
        FUH fUH = this.field_37647fe_Dne.method_228c813f_bzF();
        return this.field_37647fe_Dne.method_ae128dba_bzF() > 0 || fUH != null && this.field_37647fe_Dne.method_bb7dd80e_Dne(fUH) < 9.0;
    }

    @Override
    public void method_7c6f6039_FWm() {
        this.field_366ec33_Dne = null;
    }

    @Override
    public void method_ae128dc7_bzF() {
        if (this.field_366ec33_Dne == null) {
            this.field_37647fe_Dne.method_117d19ea_FWm(-1);
        } else if (this.field_37647fe_Dne.method_bb7dd80e_Dne(this.field_366ec33_Dne) > 49.0) {
            this.field_37647fe_Dne.method_117d19ea_FWm(-1);
        } else if (!this.field_37647fe_Dne.method_22ffcd49_Dne().method_bb7dd824_Dne(this.field_366ec33_Dne)) {
            this.field_37647fe_Dne.method_117d19ea_FWm(-1);
        } else {
            this.field_37647fe_Dne.method_117d19ea_FWm(1);
        }
    }

    @Override
    public void method_7a46289a_Dne() {
        this.field_37647fe_Dne.method_23028a4c_Dne().method_7c6f6039_FWm();
        this.field_366ec33_Dne = this.field_37647fe_Dne.method_228c813f_bzF();
    }
}

