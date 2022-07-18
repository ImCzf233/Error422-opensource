package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class MFa
implements Callable {
    final xoY field_37e0a6a_Dne;

    MFa(xoY xoY2) {
        this.field_37e0a6a_Dne = xoY2;
    }

    public Object call() {
        return this.method_eecad346_Dne();
    }

    public String method_eecad346_Dne() {
        return String.valueOf(this.field_37e0a6a_Dne.method_7a46288e_Dne());
    }
}

