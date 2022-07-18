package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class oeZ
implements Callable {
    final int field_21260d_FWm;
    final sAy field_37b1bc1_Dne;
    final int field_2092ae_Dne;

    public Object call() {
        return this.method_eecad346_Dne();
    }

    public String method_eecad346_Dne() {
        return this.field_37b1bc1_Dne.method_16cca7e_Dne(this.field_2092ae_Dne, this.field_21260d_FWm) ? "True" : "False";
    }

    oeZ(sAy sAy2, int n, int n2) {
        this.field_37b1bc1_Dne = sAy2;
        this.field_2092ae_Dne = n;
        this.field_21260d_FWm = n2;
    }
}

