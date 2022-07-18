package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class hbe
extends zKP {
    protected boolean method_ce7f5dad_Dne(int n) {
        return n == zKP.field_36ff555_Dne.field_21260d_FWm || n == zKP.field_203836cc_FWm.field_21260d_FWm || n == zKP.field_778fd823_rPc.field_21260d_FWm;
    }

    protected hbe(int n) {
        this(n, KFd.field_1c2a8b62_XHL);
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return false;
    }

    @Override
    public bSp method_8c85fe2_Dne(Qnq qnq, int n, int n2, int n3) {
        return null;
    }

    @Override
    public void method_ca828a1c_Dne(Qnq qnq, int n, int n2, int n3, Random random) {
        this.method_3036b9cf_FWm(qnq, n, n2, n3);
    }

    protected final void method_3036b9cf_FWm(Qnq qnq, int n, int n2, int n3) {
        if (!this.method_52f8ce31_a_(qnq, n, n2, n3)) {
            this.method_fd7de26f_FWm(qnq, n, n2, n3, qnq.method_2dee76f_bzF(n, n2, n3), 0);
            qnq.method_2e7161e6_Qnq(n, n2, n3);
        }
    }

    @Override
    public int method_7a46288d_Dne() {
        return 1;
    }

    @Override
    public boolean method_9cb39134_Dne(Qnq qnq, int n, int n2, int n3) {
        return super.method_9cb39134_Dne(qnq, n, n2, n3) && this.method_ce7f5dad_Dne(qnq.method_2c2cf7bc_Dne(n, n2 - 1, n3));
    }

    @Override
    public boolean method_52f8ce31_a_(Qnq qnq, int n, int n2, int n3) {
        return (qnq.method_2e7161d5_Qnq(n, n2, n3) >= 8 || qnq.method_76d9fc47_aFZ(n, n2, n3)) && this.method_ce7f5dad_Dne(qnq.method_2c2cf7bc_Dne(n, n2 - 1, n3));
    }

    protected hbe(int n, KFd kFd) {
        super(n, kFd);
        this.method_21cbfe2c_Dne(true);
        float f = 0.2f;
        this.method_eb14b51a_Dne(0.5f - f, 0.0f, 0.5f - f, 0.5f + f, f * 3.0f, 0.5f + f);
        this.method_82a88d64_Dne(JcN.field_2022bed6_FWm);
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return false;
    }

    @Override
    public void method_f9bf07d3_Dne(Qnq qnq, int n, int n2, int n3, int n4) {
        super.method_f9bf07d3_Dne(qnq, n, n2, n3, n4);
        this.method_3036b9cf_FWm(qnq, n, n2, n3);
    }
}

