package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from dSI
 */
public class dsi_0
extends ZOO {
    FUH field_366ec33_Dne;
    BRM field_365100f_Dne;

    public dsi_0(BRM bRM) {
        super(bRM, 32.0f, false);
        this.field_365100f_Dne = bRM;
        this.method_ce7f5da9_Dne(1);
    }

    @Override
    public void method_7a46289a_Dne() {
        this.field_2020b812_FWm.method_486cd6af_FWm(this.field_366ec33_Dne);
        super.method_7a46289a_Dne();
    }

    @Override
    public boolean method_7a46289e_Dne() {
        if (!this.field_365100f_Dne.method_86921671_LVR()) {
            return false;
        }
        FUH fUH = this.field_365100f_Dne.method_2df40558_aFZ();
        if (fUH == null) {
            return false;
        }
        this.field_366ec33_Dne = fUH.method_f876cab1_FWm();
        return this.method_740bedaa_Dne(this.field_366ec33_Dne, false);
    }
}

