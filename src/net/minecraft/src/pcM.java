package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

final class pcM
implements Callable {
    final int field_2092ae_Dne;
    final int field_2e5f1b_bzF;
    final int field_21260d_FWm;

    public Object call() {
        return this.method_eecad346_Dne();
    }

    public String method_eecad346_Dne() {
        return Noo.method_924467f7_Dne(this.field_2092ae_Dne, this.field_21260d_FWm, this.field_2e5f1b_bzF);
    }

    pcM(int n, int n2, int n3) {
        this.field_2092ae_Dne = n;
        this.field_21260d_FWm = n2;
        this.field_2e5f1b_bzF = n3;
    }
}

