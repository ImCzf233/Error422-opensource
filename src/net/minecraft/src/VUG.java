package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class VUG
implements Callable {
    final McM field_36a4ff5_Dne;

    VUG(McM mcM) {
        this.field_36a4ff5_Dne = mcM;
    }

    public Object call() {
        return this.method_eecad346_Dne();
    }

    public String method_eecad346_Dne() {
        Runtime runtime = Runtime.getRuntime();
        long l = runtime.maxMemory();
        long l2 = runtime.totalMemory();
        long l3 = runtime.freeMemory();
        long l4 = l / 1024L / 1024L;
        long l5 = l2 / 1024L / 1024L;
        long l6 = l3 / 1024L / 1024L;
        return l3 + " bytes (" + l6 + " MB) / " + l2 + " bytes (" + l5 + " MB) up to " + l + " bytes (" + l4 + " MB)";
    }
}

