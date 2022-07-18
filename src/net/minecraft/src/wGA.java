package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class wGA
implements Callable {
    final FUH field_366ec33_Dne;
    final NAx field_36a49e7_Dne;

    public Object call() {
        return this.method_eecad346_Dne();
    }

    wGA(FUH fUH, NAx nAx) {
        this.field_366ec33_Dne = fUH;
        this.field_36a49e7_Dne = nAx;
    }

    public String method_eecad346_Dne() {
        return SXd.field_83633108_Dne[this.field_36a49e7_Dne.method_7a46288d_Dne()].method_eecad346_Dne();
    }
}

