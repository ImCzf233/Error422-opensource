package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class ZQN
extends zKP {
    private gDn field_202f7d1a_FWm;
    private gDn field_75bd7f28_bzF;
    private gDn field_375b13b_Dne;

    @Override
    public int method_590ca0b_b_() {
        double d = 0.5;
        double d2 = 1.0;
        return bzF.method_16a71cd_Dne(d, d2);
    }

    @Override
    public gDn method_68d2f4_Dne(Zpi zpi, int n, int n2, int n3, int n4) {
        if (n4 == 1) {
            return this.field_375b13b_Dne;
        }
        if (n4 == 0) {
            return zKP.field_203836cc_FWm.method_77cd08ea_FWm(n4);
        }
        KFd kFd = zpi.method_d9802b31_Dne(n, n2 + 1, n3);
        return kFd != KFd.field_394fe8ca_OdI && kFd != KFd.field_d2a9ced2_oIf ? this.field_5e5f2002_Qnq : this.field_202f7d1a_FWm;
    }

    @Override
    public void method_ca828a1c_Dne(Qnq qnq, int n, int n2, int n3, Random random) {
        if (!qnq.field_2d2a05_aFZ) {
            if (qnq.method_76d9fc36_aFZ(n, n2 + 1, n3) < 4 && zKP.field_4039e0a_FWm[qnq.method_2c2cf7bc_Dne(n, n2 + 1, n3)] > 2) {
                qnq.method_2ee8c47d_FWm(n, n2, n3, zKP.field_203836cc_FWm.field_21260d_FWm);
            } else if (qnq.method_76d9fc36_aFZ(n, n2 + 1, n3) >= 9) {
                for (int i = 0; i < 4; ++i) {
                    int n4 = n + random.nextInt(3) - 1;
                    int n5 = n2 + random.nextInt(5) - 3;
                    int n6 = n3 + random.nextInt(3) - 1;
                    int n7 = qnq.method_2c2cf7bc_Dne(n4, n5 + 1, n6);
                    if (qnq.method_2c2cf7bc_Dne(n4, n5, n6) != zKP.field_203836cc_FWm.field_21260d_FWm || qnq.method_76d9fc36_aFZ(n4, n5 + 1, n6) < 4 || zKP.field_4039e0a_FWm[n7] > 2) continue;
                    qnq.method_2ee8c47d_FWm(n4, n5, n6, zKP.field_36ff555_Dne.field_21260d_FWm);
                }
            }
        }
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        this.field_5e5f2002_Qnq = rbp.method_285881e4_Dne("grass_side");
        this.field_375b13b_Dne = rbp.method_285881e4_Dne("grass_top");
        this.field_202f7d1a_FWm = rbp.method_285881e4_Dne("snow_side");
        this.field_75bd7f28_bzF = rbp.method_285881e4_Dne("grass_side_overlay");
    }

    @Override
    public gDn method_9051f17a_Dne(int n, int n2) {
        return n == 1 ? this.field_375b13b_Dne : (n == 0 ? zKP.field_203836cc_FWm.method_77cd08ea_FWm(n) : this.field_5e5f2002_Qnq);
    }

    @Override
    public int method_fbabf7e2_Dne(Zpi zpi, int n, int n2, int n3) {
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        for (int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                int n7 = zpi.method_90477c37_Dne(n + j, n3 + i).method_ae128dba_bzF();
                n4 += (n7 & 0xFF0000) >> 16;
                n5 += (n7 & 0xFF00) >> 8;
                n6 += n7 & 0xFF;
            }
        }
        return (n4 / 9 & 0xFF) << 16 | (n5 / 9 & 0xFF) << 8 | n6 / 9 & 0xFF;
    }

    protected ZQN(int n) {
        super(n, KFd.field_2022c902_FWm);
        this.method_21cbfe2c_Dne(true);
        this.method_82a88d64_Dne(JcN.field_368f2f7_Dne);
    }

    @Override
    public int method_24763341_Dne(int n, Random random, int n2) {
        return zKP.field_203836cc_FWm.method_24763341_Dne(0, random, n2);
    }

    @Override
    public int method_117d19dd_FWm(int n) {
        return this.method_590ca0b_b_();
    }

    public static gDn method_230f3f9a_Dne() {
        return zKP.field_36ff555_Dne.field_75bd7f28_bzF;
    }
}

