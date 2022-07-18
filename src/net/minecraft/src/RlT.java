package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class RlT
implements Callable {
    final McM field_36a4ff5_Dne;

    RlT(McM mcM) {
        this.field_36a4ff5_Dne = mcM;
    }

    public Object call() {
        return this.method_eecad346_Dne();
    }

    public String method_eecad346_Dne() {
        return System.getProperty("os.name") + " (" + System.getProperty("os.arch") + ") version " + System.getProperty("os.version");
    }
}

