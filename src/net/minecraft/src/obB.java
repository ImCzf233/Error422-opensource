package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class obB
implements Callable {
    final FUH field_366ec33_Dne;
    final NAx field_36a49e7_Dne;

    public String method_eecad346_Dne() {
        return this.field_36a49e7_Dne.method_7c6f603d_FWm() + "";
    }

    obB(FUH fUH, NAx nAx) {
        this.field_366ec33_Dne = fUH;
        this.field_36a49e7_Dne = nAx;
    }

    public Object call() {
        return this.method_eecad346_Dne();
    }
}

