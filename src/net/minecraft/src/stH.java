package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class stH
implements Callable {
    final McM field_36a4ff5_Dne;

    public String method_eecad346_Dne() {
        return System.getProperty("java.version") + ", " + System.getProperty("java.vendor");
    }

    stH(McM mcM) {
        this.field_36a4ff5_Dne = mcM;
    }

    public Object call() {
        return this.method_eecad346_Dne();
    }
}

