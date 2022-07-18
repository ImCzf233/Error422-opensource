package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class gCn
extends hbe {
    private final String field_569fcf45_Dne;

    @Override
    protected boolean method_ce7f5dad_Dne(int n) {
        return zKP.field_4039e1b_FWm[n];
    }

    @Override
    public void method_ca828a1c_Dne(Qnq qnq, int n, int n2, int n3, Random random) {
        if (random.nextInt(25) == 0) {
            int n4;
            int n5;
            int n6;
            int n7 = 4;
            int n8 = 5;
            for (n6 = n - n7; n6 <= n + n7; ++n6) {
                for (n5 = n3 - n7; n5 <= n3 + n7; ++n5) {
                    for (n4 = n2 - 1; n4 <= n2 + 1; ++n4) {
                        if (qnq.method_2c2cf7bc_Dne(n6, n4, n5) != this.field_21260d_FWm || --n8 > 0) continue;
                        return;
                    }
                }
            }
            n6 = n + random.nextInt(3) - 1;
            n5 = n2 + random.nextInt(2) - random.nextInt(2);
            n4 = n3 + random.nextInt(3) - 1;
            for (int i = 0; i < 4; ++i) {
                if (qnq.method_2c2cf7cd_Dne(n6, n5, n4) && this.method_52f8ce31_a_(qnq, n6, n5, n4)) {
                    n = n6;
                    n2 = n5;
                    n3 = n4;
                }
                n6 = n + random.nextInt(3) - 1;
                n5 = n2 + random.nextInt(2) - random.nextInt(2);
                n4 = n3 + random.nextInt(3) - 1;
            }
            if (qnq.method_2c2cf7cd_Dne(n6, n5, n4) && this.method_52f8ce31_a_(qnq, n6, n5, n4)) {
                qnq.method_2ee8c47d_FWm(n6, n5, n4, this.field_21260d_FWm);
            }
        }
    }

    protected gCn(int n, String string) {
        super(n);
        this.field_569fcf45_Dne = string;
        float f = 0.2f;
        this.method_eb14b51a_Dne(0.5f - f, 0.0f, 0.5f - f, 0.5f + f, f * 2.0f, 0.5f + f);
        this.method_21cbfe2c_Dne(true);
    }

    @Override
    public boolean method_9cb39134_Dne(Qnq qnq, int n, int n2, int n3) {
        return super.method_9cb39134_Dne(qnq, n, n2, n3) && this.method_52f8ce31_a_(qnq, n, n2, n3);
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        this.field_5e5f2002_Qnq = rbp.method_285881e4_Dne(this.field_569fcf45_Dne);
    }

    public boolean method_ca828a20_Dne(Qnq qnq, int n, int n2, int n3, Random random) {
        int n4 = qnq.method_2dee76f_bzF(n, n2, n3);
        qnq.method_2e7161e6_Qnq(n, n2, n3);
        yIR yIR2 = null;
        if (this.field_21260d_FWm == zKP.field_75be630e_bzF.field_21260d_FWm) {
            yIR2 = new yIR(0);
        } else if (this.field_21260d_FWm == zKP.field_5e6003e8_Qnq.field_21260d_FWm) {
            yIR2 = new yIR(1);
        }
        if (yIR2 != null && yIR2.method_c3e4cb88_Dne(qnq, random, n, n2, n3)) {
            return true;
        }
        qnq.method_17d7ea9d_FWm(n, n2, n3, this.field_21260d_FWm, n4, 3);
        return false;
    }

    @Override
    public boolean method_52f8ce31_a_(Qnq qnq, int n, int n2, int n3) {
        if (n2 >= 0 && n2 < 256) {
            int n4 = qnq.method_2c2cf7bc_Dne(n, n2 - 1, n3);
            return n4 == zKP.field_36e467b_Dne.field_21260d_FWm || qnq.method_2e7161d5_Qnq(n, n2, n3) < 13 && this.method_ce7f5dad_Dne(n4);
        }
        return false;
    }
}

