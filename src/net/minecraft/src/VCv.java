package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class VCv
extends zKP {
    @Override
    public void method_ca828a1c_Dne(Qnq qnq, int n, int n2, int n3, Random random) {
        if (qnq.method_2c2cf7cd_Dne(n, n2 + 1, n3)) {
            int n4 = 1;
            while (qnq.method_2c2cf7bc_Dne(n, n2 - n4, n3) == this.field_21260d_FWm) {
                ++n4;
            }
            if (n4 < 3) {
                int n5 = qnq.method_2dee76f_bzF(n, n2, n3);
                if (n5 == 15) {
                    qnq.method_2ee8c47d_FWm(n, n2 + 1, n3, this.field_21260d_FWm);
                    qnq.method_d4dc89ed_Dne(n, n2, n3, 0, 4);
                } else {
                    qnq.method_d4dc89ed_Dne(n, n2, n3, n5 + 1, 4);
                }
            }
        }
    }

    @Override
    public boolean method_9cb39134_Dne(Qnq qnq, int n, int n2, int n3) {
        int n4 = qnq.method_2c2cf7bc_Dne(n, n2 - 1, n3);
        return n4 == this.field_21260d_FWm ? true : (n4 != zKP.field_36ff555_Dne.field_21260d_FWm && n4 != zKP.field_203836cc_FWm.field_21260d_FWm && n4 != zKP.field_5ced441_IjH.field_21260d_FWm ? false : (qnq.method_d9802b31_Dne(n - 1, n2 - 1, n3) == KFd.field_1411d34d_div ? true : (qnq.method_d9802b31_Dne(n + 1, n2 - 1, n3) == KFd.field_1411d34d_div ? true : (qnq.method_d9802b31_Dne(n, n2 - 1, n3 - 1) == KFd.field_1411d34d_div ? true : qnq.method_d9802b31_Dne(n, n2 - 1, n3 + 1) == KFd.field_1411d34d_div))));
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return false;
    }

    @Override
    public bSp method_8c85fe2_Dne(Qnq qnq, int n, int n2, int n3) {
        return null;
    }

    @Override
    public int method_9cb39123_Dne(Qnq qnq, int n, int n2, int n3) {
        return dEr.field_27e84f19_XjO.field_267cf5_Qnq;
    }

    @Override
    public boolean method_52f8ce31_a_(Qnq qnq, int n, int n2, int n3) {
        return this.method_9cb39134_Dne(qnq, n, n2, n3);
    }

    protected VCv(int n) {
        super(n, KFd.field_1c2a8b62_XHL);
        float f = 0.375f;
        this.method_eb14b51a_Dne(0.5f - f, 0.0f, 0.5f - f, 0.5f + f, 1.0f, 0.5f + f);
        this.method_21cbfe2c_Dne(true);
    }

    @Override
    public int method_7a46288d_Dne() {
        return 1;
    }

    @Override
    public void method_f9bf07d3_Dne(Qnq qnq, int n, int n2, int n3, int n4) {
        this.method_5452795d_bzF(qnq, n, n2, n3);
    }

    protected final void method_5452795d_bzF(Qnq qnq, int n, int n2, int n3) {
        if (!this.method_52f8ce31_a_(qnq, n, n2, n3)) {
            this.method_fd7de26f_FWm(qnq, n, n2, n3, qnq.method_2dee76f_bzF(n, n2, n3), 0);
            qnq.method_2e7161e6_Qnq(n, n2, n3);
        }
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return false;
    }

    @Override
    public int method_24763341_Dne(int n, Random random, int n2) {
        return dEr.field_27e84f19_XjO.field_267cf5_Qnq;
    }
}

