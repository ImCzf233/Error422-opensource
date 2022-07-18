package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class WSD
implements Callable {
    final ipD field_3773a0f_Dne;

    public Object call() {
        return this.method_eecad346_Dne();
    }

    public String method_eecad346_Dne() {
        return (String)ipD.method_d410254f_Dne().get(this.field_3773a0f_Dne.getClass()) + " // " + this.field_3773a0f_Dne.getClass().getCanonicalName();
    }

    WSD(ipD ipD2) {
        this.field_3773a0f_Dne = ipD2;
    }
}

