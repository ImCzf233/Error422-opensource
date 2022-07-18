package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class XfI
implements Callable {
    final ipD field_3773a0f_Dne;

    public String method_eecad346_Dne() {
        int n = this.field_3773a0f_Dne.field_36c4f18_Dne.method_2c2cf7bc_Dne(this.field_3773a0f_Dne.field_267cf5_Qnq, this.field_3773a0f_Dne.field_2d29f4_aFZ, this.field_3773a0f_Dne.field_388da6_zGp);
        try {
            return String.format("ID #%d (%s // %s)", n, zKP.field_8374b848_Dne[n].method_6859cdb9_bzF(), zKP.field_8374b848_Dne[n].getClass().getCanonicalName());
        }
        catch (Throwable throwable) {
            return "ID #" + n;
        }
    }

    public Object call() {
        return this.method_eecad346_Dne();
    }

    XfI(ipD ipD2) {
        this.field_3773a0f_Dne = ipD2;
    }
}

