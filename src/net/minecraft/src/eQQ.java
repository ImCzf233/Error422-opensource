package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class eQQ
implements Callable {
    final NAx field_36a49e7_Dne;
    final FUH field_366ec33_Dne;

    eQQ(FUH fUH, NAx nAx) {
        this.field_366ec33_Dne = fUH;
        this.field_36a49e7_Dne = nAx;
    }

    public String method_eecad346_Dne() {
        return this.field_36a49e7_Dne.method_7c6f602c_FWm() + "";
    }

    public Object call() {
        return this.method_eecad346_Dne();
    }
}

