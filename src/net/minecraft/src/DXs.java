package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class DXs
implements Callable {
    final xoY field_37e0a6a_Dne;

    public Object call() {
        return this.method_eecad346_Dne();
    }

    DXs(xoY xoY2) {
        this.field_37e0a6a_Dne = xoY2;
    }

    public String method_eecad346_Dne() {
        return String.format("ID %02d - %s, ver %d. Features enabled: %b", xoY.method_d1b621e3_Dne(this.field_37e0a6a_Dne).method_7c6f602c_FWm(), xoY.method_d1b621e3_Dne(this.field_37e0a6a_Dne).method_eecad346_Dne(), xoY.method_d1b621e3_Dne(this.field_37e0a6a_Dne).method_7a46288d_Dne(), xoY.method_c5e18f69_Dne(this.field_37e0a6a_Dne));
    }
}

