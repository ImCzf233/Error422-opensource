package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class phH
extends zKP {
    @Override
    public boolean method_7c6f603d_FWm() {
        return false;
    }

    @Override
    public void method_9cb39130_Dne(Qnq qnq, int n, int n2, int n3) {
        if (qnq.method_2dee76f_bzF(n, n2, n3) == 0) {
            if (qnq.method_2ee9044e_FWm(n - 1, n2, n3, true)) {
                qnq.method_d4dc89ed_Dne(n, n2, n3, 1, 2);
            } else if (qnq.method_2ee9044e_FWm(n + 1, n2, n3, true)) {
                qnq.method_d4dc89ed_Dne(n, n2, n3, 2, 2);
            } else if (qnq.method_2ee9044e_FWm(n, n2, n3 - 1, true)) {
                qnq.method_d4dc89ed_Dne(n, n2, n3, 3, 2);
            } else if (qnq.method_2ee9044e_FWm(n, n2, n3 + 1, true)) {
                qnq.method_d4dc89ed_Dne(n, n2, n3, 4, 2);
            } else if (this.method_714a8ebb_Qnq(qnq, n, n2 - 1, n3)) {
                qnq.method_d4dc89ed_Dne(n, n2, n3, 5, 2);
            }
        }
        this.method_54527961_bzF(qnq, n, n2, n3);
    }

    protected boolean method_d6a0f318_FWm(Qnq qnq, int n, int n2, int n3, int n4) {
        if (this.method_54527961_bzF(qnq, n, n2, n3)) {
            int n5 = qnq.method_2dee76f_bzF(n, n2, n3);
            boolean bl = false;
            if (!qnq.method_2ee9044e_FWm(n - 1, n2, n3, true) && n5 == 1) {
                bl = true;
            }
            if (!qnq.method_2ee9044e_FWm(n + 1, n2, n3, true) && n5 == 2) {
                bl = true;
            }
            if (!qnq.method_2ee9044e_FWm(n, n2, n3 - 1, true) && n5 == 3) {
                bl = true;
            }
            if (!qnq.method_2ee9044e_FWm(n, n2, n3 + 1, true) && n5 == 4) {
                bl = true;
            }
            if (!this.method_714a8ebb_Qnq(qnq, n, n2 - 1, n3) && n5 == 5) {
                bl = true;
            }
            if (bl) {
                this.method_fd7de26f_FWm(qnq, n, n2, n3, qnq.method_2dee76f_bzF(n, n2, n3), 0);
                qnq.method_2e7161e6_Qnq(n, n2, n3);
                return true;
            }
            return false;
        }
        return true;
    }

    protected boolean method_54527961_bzF(Qnq qnq, int n, int n2, int n3) {
        if (!this.method_9cb39134_Dne(qnq, n, n2, n3)) {
            if (qnq.method_2c2cf7bc_Dne(n, n2, n3) == this.field_21260d_FWm) {
                this.method_fd7de26f_FWm(qnq, n, n2, n3, qnq.method_2dee76f_bzF(n, n2, n3), 0);
                qnq.method_2e7161e6_Qnq(n, n2, n3);
            }
            return false;
        }
        return true;
    }

    @Override
    public bSp method_8c85fe2_Dne(Qnq qnq, int n, int n2, int n3) {
        return null;
    }

    @Override
    public void method_ff5e68fb_FWm(Qnq qnq, int n, int n2, int n3, Random random) {
        int n4 = qnq.method_2dee76f_bzF(n, n2, n3);
        double d = (float)n + 0.5f;
        double d2 = (float)n2 + 0.7f;
        double d3 = (float)n3 + 0.5f;
        double d4 = 0.22f;
        double d5 = 0.27f;
        if (n4 == 1) {
            qnq.method_8600ec24_Dne("smoke", d - d5, d2 + d4, d3, 0.0, 0.0, 0.0);
            qnq.method_8600ec24_Dne("flame", d - d5, d2 + d4, d3, 0.0, 0.0, 0.0);
        } else if (n4 == 2) {
            qnq.method_8600ec24_Dne("smoke", d + d5, d2 + d4, d3, 0.0, 0.0, 0.0);
            qnq.method_8600ec24_Dne("flame", d + d5, d2 + d4, d3, 0.0, 0.0, 0.0);
        } else if (n4 == 3) {
            qnq.method_8600ec24_Dne("smoke", d, d2 + d4, d3 - d5, 0.0, 0.0, 0.0);
            qnq.method_8600ec24_Dne("flame", d, d2 + d4, d3 - d5, 0.0, 0.0, 0.0);
        } else if (n4 == 4) {
            qnq.method_8600ec24_Dne("smoke", d, d2 + d4, d3 + d5, 0.0, 0.0, 0.0);
            qnq.method_8600ec24_Dne("flame", d, d2 + d4, d3 + d5, 0.0, 0.0, 0.0);
        } else {
            qnq.method_8600ec24_Dne("smoke", d, d2, d3, 0.0, 0.0, 0.0);
            qnq.method_8600ec24_Dne("flame", d, d2, d3, 0.0, 0.0, 0.0);
        }
    }

    @Override
    public void method_f9bf07d3_Dne(Qnq qnq, int n, int n2, int n3, int n4) {
        this.method_d6a0f318_FWm(qnq, n, n2, n3, n4);
    }

    @Override
    public int method_a13ce189_Dne(Qnq qnq, int n, int n2, int n3, int n4, float f, float f2, float f3, int n5) {
        int n6 = n5;
        if (n4 == 1 && this.method_714a8ebb_Qnq(qnq, n, n2 - 1, n3)) {
            n6 = 5;
        }
        if (n4 == 2 && qnq.method_2ee9044e_FWm(n, n2, n3 + 1, true)) {
            n6 = 4;
        }
        if (n4 == 3 && qnq.method_2ee9044e_FWm(n, n2, n3 - 1, true)) {
            n6 = 3;
        }
        if (n4 == 4 && qnq.method_2ee9044e_FWm(n + 1, n2, n3, true)) {
            n6 = 2;
        }
        if (n4 == 5 && qnq.method_2ee9044e_FWm(n - 1, n2, n3, true)) {
            n6 = 1;
        }
        return n6;
    }

    @Override
    public wHH method_acf3908a_Dne(Qnq qnq, int n, int n2, int n3, chN chN2, chN chN3) {
        int n4 = qnq.method_2dee76f_bzF(n, n2, n3) & 7;
        float f = 0.15f;
        if (n4 == 1) {
            this.method_eb14b51a_Dne(0.0f, 0.2f, 0.5f - f, f * 2.0f, 0.8f, 0.5f + f);
        } else if (n4 == 2) {
            this.method_eb14b51a_Dne(1.0f - f * 2.0f, 0.2f, 0.5f - f, 1.0f, 0.8f, 0.5f + f);
        } else if (n4 == 3) {
            this.method_eb14b51a_Dne(0.5f - f, 0.2f, 0.0f, 0.5f + f, 0.8f, f * 2.0f);
        } else if (n4 == 4) {
            this.method_eb14b51a_Dne(0.5f - f, 0.2f, 1.0f - f * 2.0f, 0.5f + f, 0.8f, 1.0f);
        } else {
            f = 0.1f;
            this.method_eb14b51a_Dne(0.5f - f, 0.0f, 0.5f - f, 0.5f + f, 0.6f, 0.5f + f);
        }
        return super.method_acf3908a_Dne(qnq, n, n2, n3, chN2, chN3);
    }

    @Override
    public boolean method_9cb39134_Dne(Qnq qnq, int n, int n2, int n3) {
        return qnq.method_2ee9044e_FWm(n - 1, n2, n3, true) ? true : (qnq.method_2ee9044e_FWm(n + 1, n2, n3, true) ? true : (qnq.method_2ee9044e_FWm(n, n2, n3 - 1, true) ? true : (qnq.method_2ee9044e_FWm(n, n2, n3 + 1, true) ? true : this.method_714a8ebb_Qnq(qnq, n, n2 - 1, n3))));
    }

    protected phH(int n) {
        super(n, KFd.field_1efdede7_qLR);
        this.method_21cbfe2c_Dne(true);
        this.method_82a88d64_Dne(JcN.field_2022bed6_FWm);
    }

    @Override
    public void method_ca828a1c_Dne(Qnq qnq, int n, int n2, int n3, Random random) {
        super.method_ca828a1c_Dne(qnq, n, n2, n3, random);
        if (qnq.method_2dee76f_bzF(n, n2, n3) == 0) {
            this.method_9cb39130_Dne(qnq, n, n2, n3);
        }
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return false;
    }

    @Override
    public int method_7a46288d_Dne() {
        return 2;
    }

    private boolean method_714a8ebb_Qnq(Qnq qnq, int n, int n2, int n3) {
        if (qnq.method_73e9b8f9_IjH(n, n2, n3)) {
            return true;
        }
        int n4 = qnq.method_2c2cf7bc_Dne(n, n2, n3);
        return n4 == zKP.field_ce2a1dc8_sly.field_21260d_FWm || n4 == zKP.field_d1c4fe0e_TpV.field_21260d_FWm || n4 == zKP.field_32988693_trS.field_21260d_FWm || n4 == zKP.field_94470304_dYY.field_21260d_FWm;
    }
}

