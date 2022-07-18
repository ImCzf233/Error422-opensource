package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class tYR
implements Callable {
    final xoY field_37e0a6a_Dne;

    public Object call() {
        return this.method_eecad346_Dne();
    }

    tYR(xoY xoY2) {
        this.field_37e0a6a_Dne = xoY2;
    }

    public String method_eecad346_Dne() {
        return String.format("Game mode: %s (ID %d). Hardcore: %b. Cheats: %b", xoY.method_d1ad823a_Dne(this.field_37e0a6a_Dne).method_eecad346_Dne(), xoY.method_d1ad823a_Dne(this.field_37e0a6a_Dne).method_7a46288d_Dne(), xoY.method_48b3d742_Qnq(this.field_37e0a6a_Dne), xoY.method_195f5d63_aFZ(this.field_37e0a6a_Dne));
    }
}

