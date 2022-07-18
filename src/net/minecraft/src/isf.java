package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class isf
implements Callable {
    final xoY field_37e0a6a_Dne;

    public Object call() {
        return this.method_eecad346_Dne();
    }

    isf(xoY xoY2) {
        this.field_37e0a6a_Dne = xoY2;
    }

    public String method_eecad346_Dne() {
        return String.format("Rain time: %d (now: %b), thunder time: %d (now: %b)", xoY.method_55dfcd60_zGp(this.field_37e0a6a_Dne), xoY.method_9f35432a_FWm(this.field_37e0a6a_Dne), xoY.method_e504698f_DyG(this.field_37e0a6a_Dne), xoY.method_b7d65e5c_bzF(this.field_37e0a6a_Dne));
    }
}

