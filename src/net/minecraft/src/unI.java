package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

final class unI
implements Callable {
    final int field_2092ae_Dne;

    unI(int n) {
        this.field_2092ae_Dne = n;
    }

    public String method_eecad346_Dne() {
        if (this.field_2092ae_Dne < 0) {
            return "Unknown? (Got " + this.field_2092ae_Dne + ")";
        }
        String string = String.format("%4s", Integer.toBinaryString(this.field_2092ae_Dne)).replace(" ", "0");
        return String.format("%1$d / 0x%1$X / 0b%2$s", this.field_2092ae_Dne, string);
    }

    public Object call() {
        return this.method_eecad346_Dne();
    }
}

