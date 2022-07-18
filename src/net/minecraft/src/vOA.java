package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class vOA
extends ljW {
    private Class field_ce3f4d68_Dne;
    private boolean field_2092bf_Dne;

    @Override
    public boolean method_7a46289e_Dne() {
        return false;
    }

    @Override
    public bSp method_8c85fe2_Dne(Qnq qnq, int n, int n2, int n3) {
        return null;
    }

    @Override
    public gDn method_9051f17a_Dne(int n, int n2) {
        return zKP.field_5e67d9b4_Qnq.method_77cd08ea_FWm(n);
    }

    @Override
    public boolean method_fbabf7f3_Dne(Zpi zpi, int n, int n2, int n3) {
        return true;
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
    }

    @Override
    public ipD method_c35d5be7_Dne(Qnq qnq) {
        try {
            return (ipD)this.field_ce3f4d68_Dne.newInstance();
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    @Override
    public int method_24763341_Dne(int n, Random random, int n2) {
        return dEr.field_698e86ef_FYZ.field_267cf5_Qnq;
    }

    @Override
    public bSp method_5f382101_FWm(Qnq qnq, int n, int n2, int n3) {
        this.method_fbabf7ef_Dne(qnq, n, n2, n3);
        return super.method_5f382101_FWm(qnq, n, n2, n3);
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return false;
    }

    @Override
    public int method_7a46288d_Dne() {
        return -1;
    }

    @Override
    public void method_f9bf07d3_Dne(Qnq qnq, int n, int n2, int n3, int n4) {
        boolean bl = false;
        if (this.field_2092bf_Dne) {
            if (!qnq.method_d9802b31_Dne(n, n2 - 1, n3).method_7a46289e_Dne()) {
                bl = true;
            }
        } else {
            int n5 = qnq.method_2dee76f_bzF(n, n2, n3);
            bl = true;
            if (n5 == 2 && qnq.method_d9802b31_Dne(n, n2, n3 + 1).method_7a46289e_Dne()) {
                bl = false;
            }
            if (n5 == 3 && qnq.method_d9802b31_Dne(n, n2, n3 - 1).method_7a46289e_Dne()) {
                bl = false;
            }
            if (n5 == 4 && qnq.method_d9802b31_Dne(n + 1, n2, n3).method_7a46289e_Dne()) {
                bl = false;
            }
            if (n5 == 5 && qnq.method_d9802b31_Dne(n - 1, n2, n3).method_7a46289e_Dne()) {
                bl = false;
            }
        }
        if (bl) {
            this.method_fd7de26f_FWm(qnq, n, n2, n3, qnq.method_2dee76f_bzF(n, n2, n3), 0);
            qnq.method_2e7161e6_Qnq(n, n2, n3);
        }
        super.method_f9bf07d3_Dne(qnq, n, n2, n3, n4);
    }

    @Override
    public int method_9cb39123_Dne(Qnq qnq, int n, int n2, int n3) {
        return dEr.field_698e86ef_FYZ.field_267cf5_Qnq;
    }

    @Override
    public void method_fbabf7ef_Dne(Zpi zpi, int n, int n2, int n3) {
        if (!this.field_2092bf_Dne) {
            int n4 = zpi.method_2dee76f_bzF(n, n2, n3);
            float f = 0.28125f;
            float f2 = 0.78125f;
            float f3 = 0.0f;
            float f4 = 1.0f;
            float f5 = 0.125f;
            this.method_eb14b51a_Dne(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
            if (n4 == 2) {
                this.method_eb14b51a_Dne(f3, f, 1.0f - f5, f4, f2, 1.0f);
            }
            if (n4 == 3) {
                this.method_eb14b51a_Dne(f3, f, 0.0f, f4, f2, f5);
            }
            if (n4 == 4) {
                this.method_eb14b51a_Dne(1.0f - f5, f, f3, 1.0f, f2, f4);
            }
            if (n4 == 5) {
                this.method_eb14b51a_Dne(0.0f, f, f3, f5, f2, f4);
            }
        }
    }

    protected vOA(int n, Class clazz, boolean bl) {
        super(n, KFd.field_5e526bea_Qnq);
        this.field_2092bf_Dne = bl;
        this.field_ce3f4d68_Dne = clazz;
        float f = 0.25f;
        float f2 = 1.0f;
        this.method_eb14b51a_Dne(0.5f - f, 0.0f, 0.5f - f, 0.5f + f, f2, 0.5f + f);
    }
}

