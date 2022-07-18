package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class wdk
implements Callable {
    final xoY field_37e0a6a_Dne;

    public String method_eecad346_Dne() {
        return String.valueOf(xoY.method_48b3d731_Qnq(this.field_37e0a6a_Dne));
    }

    wdk(xoY xoY2) {
        this.field_37e0a6a_Dne = xoY2;
    }

    public Object call() {
        return this.method_eecad346_Dne();
    }
}

