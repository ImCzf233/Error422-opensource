package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class Erg
extends zKP {
    @Override
    public bSp method_5f382101_FWm(Qnq qnq, int n, int n2, int n3) {
        this.method_fbabf7ef_Dne(qnq, n, n2, n3);
        return super.method_5f382101_FWm(qnq, n, n2, n3);
    }

    @Override
    public void method_f9bf07d3_Dne(Qnq qnq, int n, int n2, int n3, int n4) {
        int n5 = qnq.method_2dee76f_bzF(n, n2, n3);
        boolean bl = false;
        if (n5 == 2 && qnq.method_6fdef3c4_DyG(n, n2, n3 + 1)) {
            bl = true;
        }
        if (n5 == 3 && qnq.method_6fdef3c4_DyG(n, n2, n3 - 1)) {
            bl = true;
        }
        if (n5 == 4 && qnq.method_6fdef3c4_DyG(n + 1, n2, n3)) {
            bl = true;
        }
        if (n5 == 5 && qnq.method_6fdef3c4_DyG(n - 1, n2, n3)) {
            bl = true;
        }
        if (!bl) {
            this.method_fd7de26f_FWm(qnq, n, n2, n3, n5, 0);
            qnq.method_2e7161e6_Qnq(n, n2, n3);
        }
        super.method_f9bf07d3_Dne(qnq, n, n2, n3, n4);
    }

    @Override
    public int method_7a46288d_Dne() {
        return 8;
    }

    @Override
    public boolean method_9cb39134_Dne(Qnq qnq, int n, int n2, int n3) {
        return qnq.method_6fdef3c4_DyG(n - 1, n2, n3) ? true : (qnq.method_6fdef3c4_DyG(n + 1, n2, n3) ? true : (qnq.method_6fdef3c4_DyG(n, n2, n3 - 1) ? true : qnq.method_6fdef3c4_DyG(n, n2, n3 + 1)));
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return false;
    }

    @Override
    public bSp method_8c85fe2_Dne(Qnq qnq, int n, int n2, int n3) {
        this.method_fbabf7ef_Dne(qnq, n, n2, n3);
        return super.method_8c85fe2_Dne(qnq, n, n2, n3);
    }

    @Override
    public void method_fbabf7ef_Dne(Zpi zpi, int n, int n2, int n3) {
        this.method_ce7f5da9_Dne(zpi.method_2dee76f_bzF(n, n2, n3));
    }

    @Override
    public int method_a13ce189_Dne(Qnq qnq, int n, int n2, int n3, int n4, float f, float f2, float f3, int n5) {
        int n6 = n5;
        if ((n5 == 0 || n4 == 2) && qnq.method_6fdef3c4_DyG(n, n2, n3 + 1)) {
            n6 = 2;
        }
        if ((n6 == 0 || n4 == 3) && qnq.method_6fdef3c4_DyG(n, n2, n3 - 1)) {
            n6 = 3;
        }
        if ((n6 == 0 || n4 == 4) && qnq.method_6fdef3c4_DyG(n + 1, n2, n3)) {
            n6 = 4;
        }
        if ((n6 == 0 || n4 == 5) && qnq.method_6fdef3c4_DyG(n - 1, n2, n3)) {
            n6 = 5;
        }
        return n6;
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return false;
    }

    protected Erg(int n) {
        super(n, KFd.field_1efdede7_qLR);
        this.method_82a88d64_Dne(JcN.field_2022bed6_FWm);
    }

    @Override
    public int method_cfc9daf9_Dne(Random random) {
        return 1;
    }

    public void method_ce7f5da9_Dne(int n) {
        float f = 0.125f;
        if (n == 2) {
            this.method_eb14b51a_Dne(0.0f, 0.0f, 1.0f - f, 1.0f, 1.0f, 1.0f);
        }
        if (n == 3) {
            this.method_eb14b51a_Dne(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, f);
        }
        if (n == 4) {
            this.method_eb14b51a_Dne(1.0f - f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        }
        if (n == 5) {
            this.method_eb14b51a_Dne(0.0f, 0.0f, 0.0f, f, 1.0f, 1.0f);
        }
    }
}

