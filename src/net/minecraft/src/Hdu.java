package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class Hdu
implements Callable {
    final McM field_36a4ff5_Dne;

    Hdu(McM mcM) {
        this.field_36a4ff5_Dne = mcM;
    }

    public String method_eecad346_Dne() {
        int n = bSp.method_23186cf1_Dne().method_7a46288d_Dne();
        int n2 = 56 * n;
        int n3 = n2 / 1024 / 1024;
        int n4 = bSp.method_23186cf1_Dne().method_7c6f602c_FWm();
        int n5 = 56 * n4;
        int n6 = n5 / 1024 / 1024;
        return n + " (" + n2 + " bytes; " + n3 + " MB) allocated, " + n4 + " (" + n5 + " bytes; " + n6 + " MB) used";
    }

    public Object call() {
        return this.method_eecad346_Dne();
    }
}

