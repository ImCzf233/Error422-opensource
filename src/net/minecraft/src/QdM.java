package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

final class QdM
implements Callable {
    final int field_2092ae_Dne;

    QdM(int n) {
        this.field_2092ae_Dne = n;
    }

    public Object call() {
        return this.method_eecad346_Dne();
    }

    public String method_eecad346_Dne() {
        try {
            return String.format("ID #%d (%s // %s)", this.field_2092ae_Dne, zKP.field_8374b848_Dne[this.field_2092ae_Dne].method_6859cdb9_bzF(), zKP.field_8374b848_Dne[this.field_2092ae_Dne].getClass().getCanonicalName());
        }
        catch (Throwable throwable) {
            return "ID #" + this.field_2092ae_Dne;
        }
    }
}

