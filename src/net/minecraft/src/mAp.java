package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class mAp
implements Callable {
    final xoY field_37e0a6a_Dne;

    mAp(xoY xoY2) {
        this.field_37e0a6a_Dne = xoY2;
    }

    public String method_eecad346_Dne() {
        return xoY.method_ec567bdb_Dne(this.field_37e0a6a_Dne);
    }

    public Object call() {
        return this.method_eecad346_Dne();
    }
}

