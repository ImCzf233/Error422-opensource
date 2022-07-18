package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class OKy
implements Callable {
    final xoY field_37e0a6a_Dne;

    public Object call() {
        return this.method_eecad346_Dne();
    }

    public String method_eecad346_Dne() {
        return String.format("%d game time, %d day time", xoY.method_c5e18f59_Dne(this.field_37e0a6a_Dne), xoY.method_9f35431a_FWm(this.field_37e0a6a_Dne));
    }

    OKy(xoY xoY2) {
        this.field_37e0a6a_Dne = xoY2;
    }
}

