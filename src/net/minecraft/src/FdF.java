package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class FdF
extends Ebp {
    public FdF(Qnq qnq) {
        super(qnq);
    }

    public FdF(Qnq qnq, double d, double d2, double d3) {
        super(qnq, d, d2, d3);
    }

    @Override
    public int method_9a443a8c_XHL() {
        return 0;
    }

    @Override
    public boolean method_21db0ca_a_(FiG fiG) {
        if (this.field_37b45e5_Dne != null && this.field_37b45e5_Dne instanceof FiG && this.field_37b45e5_Dne != fiG) {
            return true;
        }
        if (this.field_37b45e5_Dne != null && this.field_37b45e5_Dne != fiG) {
            return false;
        }
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ) {
            fiG.method_ad72a713_bzF(this);
        }
        return true;
    }
}

