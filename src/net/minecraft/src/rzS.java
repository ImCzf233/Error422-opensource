package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class rzS
extends zKP {
    private gDn field_375b13b_Dne;
    private gDn field_202f7d1a_FWm;

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        this.field_375b13b_Dne = rbp.method_285881e4_Dne("farmland_wet");
        this.field_202f7d1a_FWm = rbp.method_285881e4_Dne("farmland_dry");
    }

    @Override
    public gDn method_9051f17a_Dne(int n, int n2) {
        return n == 1 ? (n2 > 0 ? this.field_375b13b_Dne : this.field_202f7d1a_FWm) : zKP.field_203836cc_FWm.method_77cd08ea_FWm(n);
    }

    private boolean method_54527961_bzF(Qnq qnq, int n, int n2, int n3) {
        int n4 = 0;
        for (int i = n - n4; i <= n + n4; ++i) {
            for (int j = n3 - n4; j <= n3 + n4; ++j) {
                int n5 = qnq.method_2c2cf7bc_Dne(i, n2 + 1, j);
                if (n5 != zKP.field_ce860a00_EWz.field_21260d_FWm && n5 != zKP.field_479d48ec_MUD.field_21260d_FWm && n5 != zKP.field_63458f38_LDH.field_21260d_FWm && n5 != zKP.field_19132aca_HDz.field_21260d_FWm && n5 != zKP.field_c2b5e8a4_jXR.field_21260d_FWm) continue;
                return true;
            }
        }
        return false;
    }

    @Override
    public int method_9cb39123_Dne(Qnq qnq, int n, int n2, int n3) {
        return zKP.field_203836cc_FWm.field_21260d_FWm;
    }

    private boolean method_714a8ebb_Qnq(Qnq qnq, int n, int n2, int n3) {
        for (int i = n - 4; i <= n + 4; ++i) {
            for (int j = n2; j <= n2 + 1; ++j) {
                for (int k = n3 - 4; k <= n3 + 4; ++k) {
                    if (qnq.method_d9802b31_Dne(i, j, k) != KFd.field_1411d34d_div) continue;
                    return true;
                }
            }
        }
        return false;
    }

    protected rzS(int n) {
        super(n, KFd.field_75b0cb10_bzF);
        this.method_21cbfe2c_Dne(true);
        this.method_eb14b51a_Dne(0.0f, 0.0f, 0.0f, 1.0f, 0.9375f, 1.0f);
        this.method_9e820edb_Dne(255);
    }

    @Override
    public int method_24763341_Dne(int n, Random random, int n2) {
        return zKP.field_203836cc_FWm.method_24763341_Dne(0, random, n2);
    }

    @Override
    public void method_f9bf07d3_Dne(Qnq qnq, int n, int n2, int n3, int n4) {
        super.method_f9bf07d3_Dne(qnq, n, n2, n3, n4);
        KFd kFd = qnq.method_d9802b31_Dne(n, n2 + 1, n3);
        if (kFd.method_7a46289e_Dne()) {
            qnq.method_2ee8c47d_FWm(n, n2, n3, zKP.field_203836cc_FWm.field_21260d_FWm);
        }
    }

    @Override
    public void method_ca828a1c_Dne(Qnq qnq, int n, int n2, int n3, Random random) {
        if (!this.method_714a8ebb_Qnq(qnq, n, n2, n3) && !qnq.method_f2b15eb2_udO(n, n2 + 1, n3)) {
            int n4 = qnq.method_2dee76f_bzF(n, n2, n3);
            if (n4 > 0) {
                qnq.method_d4dc89ed_Dne(n, n2, n3, n4 - 1, 2);
            } else if (!this.method_54527961_bzF(qnq, n, n2, n3)) {
                qnq.method_2ee8c47d_FWm(n, n2, n3, zKP.field_203836cc_FWm.field_21260d_FWm);
            }
        } else {
            qnq.method_d4dc89ed_Dne(n, n2, n3, 7, 2);
        }
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return false;
    }

    @Override
    public bSp method_8c85fe2_Dne(Qnq qnq, int n, int n2, int n3) {
        return bSp.method_23186cf1_Dne().method_b4ea3e0c_Dne(n + 0, n2 + 0, n3 + 0, n + 1, n2 + 1, n3 + 1);
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return false;
    }

    @Override
    public void method_17e3b3b6_Dne(Qnq qnq, int n, int n2, int n3, sMa sMa2, float f) {
        if (!qnq.field_2d2a05_aFZ && qnq.field_7331eae7_Dne.nextFloat() < f - 0.5f) {
            if (!(sMa2 instanceof FiG) && !qnq.method_230cbc5a_Dne().method_8f501fe8_Dne("mobGriefing")) {
                return;
            }
            qnq.method_2ee8c47d_FWm(n, n2, n3, zKP.field_203836cc_FWm.field_21260d_FWm);
        }
    }
}

