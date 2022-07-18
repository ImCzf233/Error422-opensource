package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class zGp
implements Callable {
    final Qnq field_36c4f18_Dne;

    public Object call() {
        return this.method_eecad346_Dne();
    }

    public String method_eecad346_Dne() {
        return this.field_36c4f18_Dne.field_2c197105_Qnq.size() + " total; " + this.field_36c4f18_Dne.field_2c197105_Qnq.toString();
    }

    zGp(Qnq qnq) {
        this.field_36c4f18_Dne = qnq;
    }
}

