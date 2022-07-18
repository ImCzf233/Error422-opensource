package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public abstract class gwq {
    private final boolean field_2092bf_Dne;

    protected void method_f9bf07d3_Dne(Qnq qnq, int n, int n2, int n3, int n4) {
        this.method_3e226590_Dne(qnq, n, n2, n3, n4, 0);
    }

    public gwq(boolean bl) {
        this.field_2092bf_Dne = bl;
    }

    protected void method_3e226590_Dne(Qnq qnq, int n, int n2, int n3, int n4, int n5) {
        if (this.field_2092bf_Dne) {
            qnq.method_17d7ea9d_FWm(n, n2, n3, n4, n5, 3);
        } else {
            qnq.method_17d7ea9d_FWm(n, n2, n3, n4, n5, 2);
        }
    }

    public abstract boolean method_c3e4cb88_Dne(Qnq var1, Random var2, int var3, int var4, int var5);

    public gwq() {
        this.field_2092bf_Dne = false;
    }

    public void method_2be429a4_Dne(double d, double d2, double d3) {
    }
}

