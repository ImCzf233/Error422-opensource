package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class OMu
extends zKP {
    private gDn field_202f7d1a_FWm;
    private gDn field_375b13b_Dne;

    @Override
    public boolean method_7c6f603d_FWm() {
        return false;
    }

    protected OMu(int n) {
        super(n, KFd.field_8e72594f_vSL);
        this.method_21cbfe2c_Dne(true);
        this.method_82a88d64_Dne(JcN.field_2022bed6_FWm);
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return false;
    }

    @Override
    public gDn method_9051f17a_Dne(int n, int n2) {
        return n == 1 ? this.field_375b13b_Dne : (n == 0 ? this.field_202f7d1a_FWm : this.field_5e5f2002_Qnq);
    }

    @Override
    public bSp method_5f382101_FWm(Qnq qnq, int n, int n2, int n3) {
        float f = 0.0625f;
        return bSp.method_23186cf1_Dne().method_b4ea3e0c_Dne((float)n + f, n2, (float)n3 + f, (float)(n + 1) - f, n2 + 1, (float)(n3 + 1) - f);
    }

    @Override
    public void method_8d285d4a_Dne(Qnq qnq, int n, int n2, int n3, sMa sMa2) {
        sMa2.method_147b2066_Dne(zBn.field_163175ef_DyG, 1);
    }

    @Override
    public boolean method_9cb39134_Dne(Qnq qnq, int n, int n2, int n3) {
        return true;
    }

    @Override
    public int method_7a46288d_Dne() {
        return 13;
    }

    @Override
    public bSp method_8c85fe2_Dne(Qnq qnq, int n, int n2, int n3) {
        float f = 0.0625f;
        return bSp.method_23186cf1_Dne().method_b4ea3e0c_Dne((float)n + f, n2, (float)n3 + f, (float)(n + 1) - f, (float)(n2 + 1) - f, (float)(n3 + 1) - f);
    }

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
                    this.method_f9bf07d3_Dne(qnq, n, n2 + 1, n3, this.field_21260d_FWm);
                } else {
                    qnq.method_d4dc89ed_Dne(n, n2, n3, n5 + 1, 4);
                }
            }
        }
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        this.field_5e5f2002_Qnq = rbp.method_285881e4_Dne("cactus_side");
        this.field_375b13b_Dne = rbp.method_285881e4_Dne("cactus_top");
        this.field_202f7d1a_FWm = rbp.method_285881e4_Dne("cactus_bottom");
    }

    @Override
    public void method_f9bf07d3_Dne(Qnq qnq, int n, int n2, int n3, int n4) {
        if (!this.method_52f8ce31_a_(qnq, n, n2, n3)) {
            qnq.method_5972b42f_Dne(n, n2, n3, true);
        }
    }

    @Override
    public boolean method_52f8ce31_a_(Qnq qnq, int n, int n2, int n3) {
        return true;
    }
}

