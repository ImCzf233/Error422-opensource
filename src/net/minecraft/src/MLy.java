package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class MLy
extends zKP {
    private void method_d6a0f314_FWm(Qnq qnq, int n, int n2, int n3, int n4) {
        block0: for (int i = 0; i < 2; ++i) {
            for (int j = 1; j < 42; ++j) {
                int n5 = n + zxJ.field_3f1c589_Dne[i] * j;
                int n6 = n3 + zxJ.field_4039e0a_FWm[i] * j;
                int n7 = qnq.method_2c2cf7bc_Dne(n5, n2, n6);
                if (n7 == zKP.field_37692b5_Dne.field_21260d_FWm) {
                    int n8 = qnq.method_2dee76f_bzF(n5, n2, n6) & 3;
                    if (n8 != zxJ.field_5781703_aFZ[i]) continue block0;
                    zKP.field_37692b5_Dne.method_a7769ea4_Dne(qnq, n5, n2, n6, n7, qnq.method_2dee76f_bzF(n5, n2, n6), true, j, n4);
                    continue block0;
                }
                if (n7 != zKP.field_9b24c8d5_lDk.field_21260d_FWm) continue block0;
            }
        }
    }

    @Override
    public int method_9cb39123_Dne(Qnq qnq, int n, int n2, int n3) {
        return dEr.field_249ef7b6_AgF.field_267cf5_Qnq;
    }

    @Override
    public bSp method_8c85fe2_Dne(Qnq qnq, int n, int n2, int n3) {
        return null;
    }

    @Override
    public int method_83516086_Dne(Qnq qnq) {
        return 10;
    }

    @Override
    public int method_582b28a_a_() {
        return 1;
    }

    private void method_5452795d_bzF(Qnq qnq, int n, int n2, int n3) {
        int n4 = qnq.method_2dee76f_bzF(n, n2, n3);
        boolean bl = (n4 & 1) == 1;
        boolean bl2 = false;
        List<sMa> list = qnq.method_71df22e6_FWm(null, bSp.method_23186cf1_Dne().method_b4ea3e0c_Dne((double)n + this.field_2092a9_Dne, (double)n2 + this.field_212608_FWm, (double)n3 + this.field_2e5f16_bzF, (double)n + this.field_267cf0_Qnq, (double)n2 + this.field_2d29ef_aFZ, (double)n3 + this.field_388da1_zGp));
        if (!list.isEmpty()) {
            for (sMa sMa2 : list) {
                if (sMa2.method_7d36ef26_FfS()) continue;
                bl2 = true;
                break;
            }
        }
        if (bl2 && !bl) {
            n4 |= 1;
        }
        if (!bl2 && bl) {
            n4 &= 0xFFFFFFFE;
        }
        if (bl2 != bl) {
            qnq.method_d4dc89ed_Dne(n, n2, n3, n4, 3);
            this.method_d6a0f314_FWm(qnq, n, n2, n3, n4);
        }
        if (bl2) {
            qnq.method_ae303daa_FWm(n, n2, n3, this.field_21260d_FWm, this.method_83516086_Dne(qnq));
        }
    }

    @Override
    public void method_ca828a1c_Dne(Qnq qnq, int n, int n2, int n3, Random random) {
        if (!qnq.field_2d2a05_aFZ && (qnq.method_2dee76f_bzF(n, n2, n3) & 1) == 1) {
            this.method_5452795d_bzF(qnq, n, n2, n3);
        }
    }

    @Override
    public void method_8d285d4a_Dne(Qnq qnq, int n, int n2, int n3, sMa sMa2) {
        if (!qnq.field_2d2a05_aFZ && (qnq.method_2dee76f_bzF(n, n2, n3) & 1) != 1) {
            this.method_5452795d_bzF(qnq, n, n2, n3);
        }
    }

    @Override
    public int method_24763341_Dne(int n, Random random, int n2) {
        return dEr.field_249ef7b6_AgF.field_267cf5_Qnq;
    }

    @Override
    public void method_fbabf7ef_Dne(Zpi zpi, int n, int n2, int n3) {
        boolean bl;
        int n4 = zpi.method_2dee76f_bzF(n, n2, n3);
        boolean bl2 = (n4 & 4) == 4;
        boolean bl3 = bl = (n4 & 2) == 2;
        if (!bl) {
            this.method_eb14b51a_Dne(0.0f, 0.0f, 0.0f, 1.0f, 0.09375f, 1.0f);
        } else if (!bl2) {
            this.method_eb14b51a_Dne(0.0f, 0.0f, 0.0f, 1.0f, 0.5f, 1.0f);
        } else {
            this.method_eb14b51a_Dne(0.0f, 0.0625f, 0.0f, 1.0f, 0.15625f, 1.0f);
        }
    }

    @Override
    public void method_f9bf07d3_Dne(Qnq qnq, int n, int n2, int n3, int n4) {
        boolean bl;
        int n5 = qnq.method_2dee76f_bzF(n, n2, n3);
        boolean bl2 = (n5 & 2) == 2;
        boolean bl3 = bl = !qnq.method_73e9b8f9_IjH(n, n2 - 1, n3);
        if (bl2 != bl) {
            this.method_fd7de26f_FWm(qnq, n, n2, n3, n5, 0);
            qnq.method_2e7161e6_Qnq(n, n2, n3);
        }
    }

    public MLy(int n) {
        super(n, KFd.field_1efdede7_qLR);
        this.method_eb14b51a_Dne(0.0f, 0.0f, 0.0f, 1.0f, 0.15625f, 1.0f);
        this.method_21cbfe2c_Dne(true);
    }

    @Override
    public void method_3e226590_Dne(Qnq qnq, int n, int n2, int n3, int n4, int n5) {
        this.method_d6a0f314_FWm(qnq, n, n2, n3, n5 | 1);
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return false;
    }

    public static boolean method_c09c1893_Dne(Zpi zpi, int n, int n2, int n3, int n4, int n5) {
        boolean bl;
        int n6 = n + zxJ.field_3f1c589_Dne[n5];
        int n7 = n3 + zxJ.field_4039e0a_FWm[n5];
        int n8 = zpi.method_2c2cf7bc_Dne(n6, n2, n7);
        boolean bl2 = bl = (n4 & 2) == 2;
        if (n8 == zKP.field_37692b5_Dne.field_21260d_FWm) {
            int n9 = zpi.method_2dee76f_bzF(n6, n2, n7);
            int n10 = n9 & 3;
            return n10 == zxJ.field_5781703_aFZ[n5];
        }
        if (n8 == zKP.field_9b24c8d5_lDk.field_21260d_FWm) {
            int n11 = zpi.method_2dee76f_bzF(n6, n2, n7);
            boolean bl3 = (n11 & 2) == 2;
            return bl == bl3;
        }
        return false;
    }

    @Override
    public void method_9cb39130_Dne(Qnq qnq, int n, int n2, int n3) {
        int n4 = qnq.method_73e9b8f9_IjH(n, n2 - 1, n3) ? 0 : 2;
        qnq.method_d4dc89ed_Dne(n, n2, n3, n4, 3);
        this.method_d6a0f314_FWm(qnq, n, n2, n3, n4);
    }

    @Override
    public void method_c5b1410a_Dne(Qnq qnq, int n, int n2, int n3, int n4, FiG fiG) {
        if (!qnq.field_2d2a05_aFZ && fiG.method_22900b26_bzF() != null && fiG.method_22900b26_bzF().field_2e5f1b_bzF == dEr.field_37078f6_Dne.field_267cf5_Qnq) {
            qnq.method_d4dc89ed_Dne(n, n2, n3, n4 | 8, 4);
        }
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return false;
    }

    @Override
    public int method_7a46288d_Dne() {
        return 30;
    }
}

