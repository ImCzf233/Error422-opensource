package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class HAo
extends cMv {
    private boolean field_2092bf_Dne = false;
    private BRM field_365100f_Dne;

    @Override
    public boolean method_7a46289e_Dne() {
        if (!this.field_365100f_Dne.method_86921671_LVR()) {
            return false;
        }
        if (this.field_365100f_Dne.method_9feec6c6_Zpi()) {
            return false;
        }
        if (!this.field_365100f_Dne.field_2d2a05_aFZ) {
            return false;
        }
        FUH fUH = this.field_365100f_Dne.method_2df40558_aFZ();
        return fUH == null ? true : (this.field_365100f_Dne.method_bb7dd80e_Dne(fUH) < 144.0 && fUH.method_23007a92_Dne() != null ? false : this.field_2092bf_Dne);
    }

    @Override
    public void method_7a46289a_Dne() {
        this.field_365100f_Dne.method_23028a4c_Dne().method_7c6f6039_FWm();
        this.field_365100f_Dne.method_ae43cb5b_XHL(true);
    }

    public void method_ce7f9d7a_Dne(boolean bl) {
        this.field_2092bf_Dne = bl;
    }

    public HAo(BRM bRM) {
        this.field_365100f_Dne = bRM;
        this.method_ce7f5da9_Dne(5);
    }

    @Override
    public void method_7c6f6039_FWm() {
        this.field_365100f_Dne.method_ae43cb5b_XHL(false);
    }
}

