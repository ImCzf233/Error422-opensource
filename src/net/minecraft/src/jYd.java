package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class jYd
implements Callable {
    final IJm field_3682480_Dne;
    final OEA field_36ac6a1_Dne;

    public Object call() {
        return this.method_eecad346_Dne();
    }

    jYd(OEA oEA, IJm iJm) {
        this.field_36ac6a1_Dne = oEA;
        this.field_3682480_Dne = iJm;
    }

    public String method_eecad346_Dne() {
        return String.format("Scaled: (%d, %d). Absolute: (%d, %d). Scale factor of %d", this.field_3682480_Dne.method_7a46288d_Dne(), this.field_3682480_Dne.method_7c6f602c_FWm(), OEA.method_ddce57ac_Dne((OEA)this.field_36ac6a1_Dne).field_2092ae_Dne, OEA.method_ddce57ac_Dne((OEA)this.field_36ac6a1_Dne).field_21260d_FWm, this.field_3682480_Dne.method_ae128dba_bzF());
    }
}

