package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class Yht
implements Callable {
    final double field_2092a9_Dne;
    final double field_2e5f16_bzF;
    final double field_212608_FWm;
    final rqj field_37b59c1_Dne;

    public Object call() {
        return this.method_eecad346_Dne();
    }

    Yht(rqj rqj2, double d, double d2, double d3) {
        this.field_37b59c1_Dne = rqj2;
        this.field_2092a9_Dne = d;
        this.field_212608_FWm = d2;
        this.field_2e5f16_bzF = d3;
    }

    public String method_eecad346_Dne() {
        return Noo.method_2c81c77c_Dne(this.field_2092a9_Dne, this.field_212608_FWm, this.field_2e5f16_bzF);
    }
}

