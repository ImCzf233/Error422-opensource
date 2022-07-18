package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class ZWx
extends cMv {
    private double field_212608_FWm;
    private double field_2e5f16_bzF;
    private float field_2092ab_Dne;
    private double field_2092a9_Dne;
    private kSJ field_377b6aa_Dne;

    @Override
    public boolean method_7a46289e_Dne() {
        if (this.field_377b6aa_Dne.method_ce109fca_vSL()) {
            return false;
        }
        iSh iSh2 = this.field_377b6aa_Dne.method_f886b00c_FWm();
        chN chN2 = gWB.method_25f96ebb_Dne(this.field_377b6aa_Dne, 16, 7, this.field_377b6aa_Dne.field_36c4f18_Dne.method_23186a47_Dne().method_e4505d6c_Dne(iSh2.field_2092ae_Dne, iSh2.field_21260d_FWm, iSh2.field_2e5f1b_bzF));
        if (chN2 == null) {
            return false;
        }
        this.field_2092a9_Dne = chN2.field_2092a9_Dne;
        this.field_212608_FWm = chN2.field_212608_FWm;
        this.field_2e5f16_bzF = chN2.field_2e5f16_bzF;
        return true;
    }

    public ZWx(kSJ kSJ2, float f) {
        this.field_377b6aa_Dne = kSJ2;
        this.field_2092ab_Dne = f;
        this.method_ce7f5da9_Dne(1);
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return !this.field_377b6aa_Dne.method_23028a4c_Dne().method_ae128dcb_bzF();
    }

    @Override
    public void method_7a46289a_Dne() {
        this.field_377b6aa_Dne.method_23028a4c_Dne().method_50a172a0_Dne(this.field_2092a9_Dne, this.field_212608_FWm, this.field_2e5f16_bzF, this.field_2092ab_Dne);
    }
}

