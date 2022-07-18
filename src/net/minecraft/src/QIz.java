package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class QIz
implements Callable {
    final VzZ field_36ebf36_Dne;

    public Object call() {
        return this.method_eecad346_Dne();
    }

    QIz(VzZ vzZ) {
        this.field_36ebf36_Dne = vzZ;
    }

    public String method_eecad346_Dne() {
        return VzZ.method_6ef04161_FWm(this.field_36ebf36_Dne).size() + " total; " + VzZ.method_6ef04161_FWm(this.field_36ebf36_Dne).toString();
    }
}

