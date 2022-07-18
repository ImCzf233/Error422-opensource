package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class QUe
implements Callable {
    final VzZ field_36ebf36_Dne;

    public Object call() {
        return this.method_eecad346_Dne();
    }

    public String method_eecad346_Dne() {
        return VzZ.method_b926b360_Dne(this.field_36ebf36_Dne).size() + " total; " + VzZ.method_b926b360_Dne(this.field_36ebf36_Dne).toString();
    }

    QUe(VzZ vzZ) {
        this.field_36ebf36_Dne = vzZ;
    }
}

