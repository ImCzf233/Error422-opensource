package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class NTs
implements Callable {
    final ipD field_3773a0f_Dne;

    NTs(ipD ipD2) {
        this.field_3773a0f_Dne = ipD2;
    }

    public String method_eecad346_Dne() {
        int n = this.field_3773a0f_Dne.field_36c4f18_Dne.method_2dee76f_bzF(this.field_3773a0f_Dne.field_267cf5_Qnq, this.field_3773a0f_Dne.field_2d29f4_aFZ, this.field_3773a0f_Dne.field_388da6_zGp);
        if (n < 0) {
            return "Unknown? (Got " + n + ")";
        }
        String string = String.format("%4s", Integer.toBinaryString(n)).replace(" ", "0");
        return String.format("%1$d / 0x%1$X / 0b%2$s", n, string);
    }

    public Object call() {
        return this.method_eecad346_Dne();
    }
}

