package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class Alk
implements Callable {
    final MOS field_36a059b_Dne;
    final NMq field_36a761a_Dne;

    public String method_eecad346_Dne() {
        return this.field_36a761a_Dne.method_d1f1ed87_FWm();
    }

    public Object call() {
        return this.method_eecad346_Dne();
    }

    Alk(MOS mOS, NMq nMq) {
        this.field_36a059b_Dne = mOS;
        this.field_36a761a_Dne = nMq;
    }
}

