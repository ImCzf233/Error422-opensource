package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

public class cXg
implements Callable {
    final jwh_0 field_3694131_Dne;

    public cXg(jwh_0 jwh_02) {
        this.field_3694131_Dne = jwh_02;
    }

    public String method_eecad346_Dne() {
        return jwh_0.method_a4d67825_Dne(this.field_3694131_Dne).method_7c6f602c_FWm() + " / " + jwh_0.method_a4d67825_Dne(this.field_3694131_Dne).method_ae128dba_bzF() + "; " + jwh_0.method_a4d67825_Dne((jwh_0)this.field_3694131_Dne).field_f27c122c_Dne;
    }

    public Object call() {
        return this.method_eecad346_Dne();
    }
}

