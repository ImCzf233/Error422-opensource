package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class aFZ
implements Callable {
    final int field_2092ae_Dne;
    final Qnq field_36c4f18_Dne;

    aFZ(Qnq qnq, int n) {
        this.field_36c4f18_Dne = qnq;
        this.field_2092ae_Dne = n;
    }

    public String method_eecad346_Dne() {
        try {
            return String.format("ID #%d (%s // %s)", this.field_2092ae_Dne, zKP.field_8374b848_Dne[this.field_2092ae_Dne].method_6859cdb9_bzF(), zKP.field_8374b848_Dne[this.field_2092ae_Dne].getClass().getCanonicalName());
        }
        catch (Throwable throwable) {
            return "ID #" + this.field_2092ae_Dne;
        }
    }

    public Object call() {
        return this.method_eecad346_Dne();
    }
}

