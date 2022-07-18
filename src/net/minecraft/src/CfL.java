package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class CfL
extends cMv {
    private pjB field_37a51e4_Dne;

    @Override
    public void method_7a46289a_Dne() {
        this.field_37a51e4_Dne.method_23028a4c_Dne().method_7c6f6039_FWm();
    }

    @Override
    public boolean method_7a46289e_Dne() {
        if (!this.field_37a51e4_Dne.method_cd4cb3d9_udO()) {
            return false;
        }
        if (this.field_37a51e4_Dne.method_9feec6c6_Zpi()) {
            return false;
        }
        if (!this.field_37a51e4_Dne.field_2d2a05_aFZ) {
            return false;
        }
        if (this.field_37a51e4_Dne.field_22c613_IjH) {
            return false;
        }
        FiG fiG = this.field_37a51e4_Dne.method_2300c587_Dne();
        return fiG == null ? false : (this.field_37a51e4_Dne.method_bb7dd80e_Dne(fiG) > 16.0 ? false : fiG.field_20257f3d_FWm instanceof Pdb);
    }

    @Override
    public void method_7c6f6039_FWm() {
        this.field_37a51e4_Dne.method_703284a3_Dne(null);
    }

    public CfL(pjB pjB2) {
        this.field_37a51e4_Dne = pjB2;
        this.method_ce7f5da9_Dne(5);
    }
}

