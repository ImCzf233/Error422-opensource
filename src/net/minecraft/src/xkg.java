package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class xkg
extends cMv {
    private float field_2092ab_Dne;
    private double field_2092a9_Dne;
    private kSJ field_377b6aa_Dne;
    private double field_212608_FWm;
    private double field_2e5f16_bzF;

    @Override
    public void method_7a46289a_Dne() {
        this.field_377b6aa_Dne.method_23028a4c_Dne().method_50a172a0_Dne(this.field_2092a9_Dne, this.field_212608_FWm, this.field_2e5f16_bzF, this.field_2092ab_Dne);
    }

    @Override
    public boolean method_7a46289e_Dne() {
        if (this.field_377b6aa_Dne.method_23007a92_Dne() == null && !this.field_377b6aa_Dne.method_cc5ef5c4_trS()) {
            return false;
        }
        chN chN2 = gWB.method_2c81f20d_Dne(this.field_377b6aa_Dne, 5, 4);
        if (chN2 == null) {
            return false;
        }
        this.field_2092a9_Dne = chN2.field_2092a9_Dne;
        this.field_212608_FWm = chN2.field_212608_FWm;
        this.field_2e5f16_bzF = chN2.field_2e5f16_bzF;
        return true;
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return !this.field_377b6aa_Dne.method_23028a4c_Dne().method_ae128dcb_bzF();
    }

    public xkg(kSJ kSJ2, float f) {
        this.field_377b6aa_Dne = kSJ2;
        this.field_2092ab_Dne = f;
        this.method_ce7f5da9_Dne(1);
    }
}

