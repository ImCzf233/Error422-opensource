package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

public class MMz
implements Callable {
    final jwh_0 field_3694131_Dne;

    public String method_eecad346_Dne() {
        return this.field_3694131_Dne.field_365731d_Dne.field_2092bf_Dne ? this.field_3694131_Dne.field_365731d_Dne.method_eecad346_Dne() : "N/A (disabled)";
    }

    public MMz(jwh_0 jwh_02) {
        this.field_3694131_Dne = jwh_02;
    }

    public Object call() {
        return this.method_eecad346_Dne();
    }
}

