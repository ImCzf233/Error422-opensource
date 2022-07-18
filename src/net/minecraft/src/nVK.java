package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class nVK
implements Callable {
    final WkD field_36ef89c_Dne;
    final int field_2092ae_Dne;

    nVK(WkD wkD, int n) {
        this.field_36ef89c_Dne = wkD;
        this.field_2092ae_Dne = n;
    }

    public String method_eecad346_Dne() {
        return oNe.field_f5e54dca_Dne[this.field_2092ae_Dne];
    }

    public Object call() {
        return this.method_eecad346_Dne();
    }
}

