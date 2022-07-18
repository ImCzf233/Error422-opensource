package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class LWx
implements Callable {
    final sMa field_37b45e5_Dne;

    public String method_eecad346_Dne() {
        return Klb.method_636080_Dne(this.field_37b45e5_Dne) + " (" + this.field_37b45e5_Dne.getClass().getCanonicalName() + ")";
    }

    LWx(sMa sMa2) {
        this.field_37b45e5_Dne = sMa2;
    }

    public Object call() {
        return this.method_eecad346_Dne();
    }
}

