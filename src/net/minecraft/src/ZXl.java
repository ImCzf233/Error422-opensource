package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class ZXl
implements Callable {
    final int field_2092ae_Dne;
    final clp field_3747625_Dne;

    public String method_eecad346_Dne() {
        String string = "Once per " + this.field_2092ae_Dne + " ticks";
        if (this.field_2092ae_Dne == Integer.MAX_VALUE) {
            string = "Maximum (" + string + ")";
        }
        return string;
    }

    public Object call() {
        return this.method_eecad346_Dne();
    }

    ZXl(clp clp2, int n) {
        this.field_3747625_Dne = clp2;
        this.field_2092ae_Dne = n;
    }
}

