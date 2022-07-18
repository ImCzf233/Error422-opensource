package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class zNA
implements Callable {
    final sAy field_37b1bc1_Dne;

    public Object call() {
        return this.method_eecad346_Dne();
    }

    public String method_eecad346_Dne() {
        return this.field_37b1bc1_Dne.getClass().getCanonicalName();
    }

    zNA(sAy sAy2) {
        this.field_37b1bc1_Dne = sAy2;
    }
}

