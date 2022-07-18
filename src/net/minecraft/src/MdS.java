package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class MdS
extends hbe {
    private gDn[] field_836bfe96_Dne;

    @Override
    public void method_86296256_Dne(Qnq qnq, int n, int n2, int n3, int n4, float f, int n5) {
        super.method_86296256_Dne(qnq, n, n2, n3, n4, f, 0);
        if (!qnq.field_2d2a05_aFZ && n4 >= 7) {
            int n6 = 3 + n5;
            for (int i = 0; i < n6; ++i) {
                if (qnq.field_7331eae7_Dne.nextInt(15) > n4) continue;
                this.method_c594b700_FWm(qnq, n, n2, n3, new NMq(this.method_ae128dba_bzF(), 1, 0));
            }
        }
    }

    @Override
    public int method_7a46288d_Dne() {
        return 6;
    }

    @Override
    public int method_9cb39123_Dne(Qnq qnq, int n, int n2, int n3) {
        return this.method_ae128dba_bzF();
    }

    public void method_5452795d_bzF(Qnq qnq, int n, int n2, int n3) {
        int n4 = qnq.method_2dee76f_bzF(n, n2, n3) + geR.method_4cd91d9_Dne(qnq.field_7331eae7_Dne, 2, 5);
        if (n4 > 7) {
            n4 = 7;
        }
        qnq.method_d4dc89ed_Dne(n, n2, n3, n4, 2);
    }

    @Override
    public gDn method_9051f17a_Dne(int n, int n2) {
        if (n2 < 0 || n2 > 7) {
            n2 = 7;
        }
        return this.field_836bfe96_Dne[n2];
    }

    protected int method_907a9d14_Qnq() {
        return dEr.field_ce7bf76e_EWz.field_267cf5_Qnq;
    }

    private float method_3036b9bf_FWm(Qnq qnq, int n, int n2, int n3) {
        float f = 1.0f;
        int n4 = qnq.method_2c2cf7bc_Dne(n, n2, n3 - 1);
        int n5 = qnq.method_2c2cf7bc_Dne(n, n2, n3 + 1);
        int n6 = qnq.method_2c2cf7bc_Dne(n - 1, n2, n3);
        int n7 = qnq.method_2c2cf7bc_Dne(n + 1, n2, n3);
        int n8 = qnq.method_2c2cf7bc_Dne(n - 1, n2, n3 - 1);
        int n9 = qnq.method_2c2cf7bc_Dne(n + 1, n2, n3 - 1);
        int n10 = qnq.method_2c2cf7bc_Dne(n + 1, n2, n3 + 1);
        int n11 = qnq.method_2c2cf7bc_Dne(n - 1, n2, n3 + 1);
        boolean bl = n6 == this.field_21260d_FWm || n7 == this.field_21260d_FWm;
        boolean bl2 = n4 == this.field_21260d_FWm || n5 == this.field_21260d_FWm;
        boolean bl3 = n8 == this.field_21260d_FWm || n9 == this.field_21260d_FWm || n10 == this.field_21260d_FWm || n11 == this.field_21260d_FWm;
        for (int i = n - 1; i <= n + 1; ++i) {
            for (int j = n3 - 1; j <= n3 + 1; ++j) {
                int n12 = qnq.method_2c2cf7bc_Dne(i, n2 - 1, j);
                float f2 = 0.0f;
                f2 = 1.0f;
                if (qnq.method_2dee76f_bzF(i, n2 - 1, j) > 0) {
                    f2 = 3.0f;
                }
                if (i != n || j != n3) {
                    f2 /= 4.0f;
                }
                f += f2;
            }
        }
        if (bl3 || bl && bl2) {
            f /= 2.0f;
        }
        return f;
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        this.field_836bfe96_Dne = new gDn[8];
        for (int i = 0; i < this.field_836bfe96_Dne.length; ++i) {
            this.field_836bfe96_Dne[i] = rbp.method_285881e4_Dne("crops_" + i);
        }
    }

    @Override
    public void method_ca828a1c_Dne(Qnq qnq, int n, int n2, int n3, Random random) {
        float f;
        int n4;
        super.method_ca828a1c_Dne(qnq, n, n2, n3, random);
        if (qnq.method_76d9fc36_aFZ(n, n2 + 1, n3) >= 9 && (n4 = qnq.method_2dee76f_bzF(n, n2, n3)) < 7 && random.nextInt((int)(25.0f / (f = this.method_3036b9bf_FWm(qnq, n, n2, n3))) + 1) == 0) {
            qnq.method_d4dc89ed_Dne(n, n2, n3, ++n4, 2);
        }
    }

    protected int method_ae128dba_bzF() {
        return dEr.field_4682511_mlD.field_267cf5_Qnq;
    }

    @Override
    protected boolean method_ce7f5dad_Dne(int n) {
        return true;
    }

    @Override
    public int method_cfc9daf9_Dne(Random random) {
        return 1;
    }

    protected MdS(int n) {
        super(n);
        this.method_21cbfe2c_Dne(true);
        float f = 0.5f;
        this.method_eb14b51a_Dne(0.5f - f, 0.0f, 0.5f - f, 0.5f + f, 0.25f, 0.5f + f);
        this.method_82a88d64_Dne(null);
        this.method_f1c42c0b_bzF(0.0f);
        this.method_2792b805_Dne(field_5e55591f_Qnq);
        this.method_f88e496b_FWm();
    }

    @Override
    public int method_24763341_Dne(int n, Random random, int n2) {
        return n == 7 ? this.method_907a9d14_Qnq() : this.method_ae128dba_bzF();
    }
}

