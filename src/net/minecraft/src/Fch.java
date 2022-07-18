package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class Fch
implements Callable {
    final OEA field_36ac6a1_Dne;

    public Object call() {
        return this.method_eecad346_Dne();
    }

    public String method_eecad346_Dne() {
        return OEA.method_ddce57ac_Dne((OEA)this.field_36ac6a1_Dne).field_37a7e17_Dne.getClass().getCanonicalName();
    }

    Fch(OEA oEA) {
        this.field_36ac6a1_Dne = oEA;
    }
}

