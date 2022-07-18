package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class bip
implements Callable {
    final String field_569fcf45_Dne;
    final WkD field_36ef89c_Dne;

    bip(WkD wkD, String string) {
        this.field_36ef89c_Dne = wkD;
        this.field_569fcf45_Dne = string;
    }

    public Object call() {
        return this.method_eecad346_Dne();
    }

    public String method_eecad346_Dne() {
        return oNe.field_f5e54dca_Dne[((oNe)WkD.method_af40970c_Dne(this.field_36ef89c_Dne).get(this.field_569fcf45_Dne)).method_7a462886_Dne()];
    }
}

