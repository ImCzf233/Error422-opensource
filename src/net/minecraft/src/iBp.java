package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class iBp
extends zKP {
    @Override
    public void method_f9bf07d3_Dne(Qnq qnq, int n, int n2, int n3, int n4) {
        if (n4 != this.field_21260d_FWm && this.method_54527961_bzF(qnq, n, n2, n3)) {
            int n5 = qnq.method_2dee76f_bzF(n, n2, n3);
            int n6 = n5 & 3;
            boolean bl = false;
            if (!qnq.method_6fdef3c4_DyG(n - 1, n2, n3) && n6 == 3) {
                bl = true;
            }
            if (!qnq.method_6fdef3c4_DyG(n + 1, n2, n3) && n6 == 1) {
                bl = true;
            }
            if (!qnq.method_6fdef3c4_DyG(n, n2, n3 - 1) && n6 == 0) {
                bl = true;
            }
            if (!qnq.method_6fdef3c4_DyG(n, n2, n3 + 1) && n6 == 2) {
                bl = true;
            }
            if (bl) {
                this.method_fd7de26f_FWm(qnq, n, n2, n3, n5, 0);
                qnq.method_2e7161e6_Qnq(n, n2, n3);
            }
        }
    }

    @Override
    public bSp method_8c85fe2_Dne(Qnq qnq, int n, int n2, int n3) {
        return null;
    }

    @Override
    public void method_9d5148cd_aFZ(Qnq qnq, int n, int n2, int n3, int n4) {
        this.method_a7769ea4_Dne(qnq, n, n2, n3, this.field_21260d_FWm, n4, false, -1, 0);
    }

    @Override
    public int method_79d378e7_Dne(Zpi zpi, int n, int n2, int n3, int n4) {
        return (zpi.method_2dee76f_bzF(n, n2, n3) & 8) == 8 ? 15 : 0;
    }

    @Override
    public int method_83516086_Dne(Qnq qnq) {
        return 10;
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return false;
    }

    @Override
    public void method_fbabf7ef_Dne(Zpi zpi, int n, int n2, int n3) {
        int n4 = zpi.method_2dee76f_bzF(n, n2, n3) & 3;
        float f = 0.1875f;
        if (n4 == 3) {
            this.method_eb14b51a_Dne(0.0f, 0.2f, 0.5f - f, f * 2.0f, 0.8f, 0.5f + f);
        } else if (n4 == 1) {
            this.method_eb14b51a_Dne(1.0f - f * 2.0f, 0.2f, 0.5f - f, 1.0f, 0.8f, 0.5f + f);
        } else if (n4 == 0) {
            this.method_eb14b51a_Dne(0.5f - f, 0.2f, 0.0f, 0.5f + f, 0.8f, f * 2.0f);
        } else if (n4 == 2) {
            this.method_eb14b51a_Dne(0.5f - f, 0.2f, 1.0f - f * 2.0f, 0.5f + f, 0.8f, 1.0f);
        }
    }

    private void method_5d278e30_Dne(Qnq qnq, int n, int n2, int n3, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        if (bl2 && !bl4) {
            qnq.method_c961c6ee_Dne((double)n + 0.5, (double)n2 + 0.1, (double)n3 + 0.5, "random.click", 0.4f, 0.6f);
        } else if (!bl2 && bl4) {
            qnq.method_c961c6ee_Dne((double)n + 0.5, (double)n2 + 0.1, (double)n3 + 0.5, "random.click", 0.4f, 0.5f);
        } else if (bl && !bl3) {
            qnq.method_c961c6ee_Dne((double)n + 0.5, (double)n2 + 0.1, (double)n3 + 0.5, "random.click", 0.4f, 0.7f);
        } else if (!bl && bl3) {
            qnq.method_c961c6ee_Dne((double)n + 0.5, (double)n2 + 0.1, (double)n3 + 0.5, "random.bowhit", 0.4f, 1.2f / (qnq.field_7331eae7_Dne.nextFloat() * 0.2f + 0.9f));
        }
    }

    @Override
    public void method_3e226590_Dne(Qnq qnq, int n, int n2, int n3, int n4, int n5) {
        boolean bl;
        boolean bl2 = (n5 & 4) == 4;
        boolean bl3 = bl = (n5 & 8) == 8;
        if (bl2 || bl) {
            this.method_a7769ea4_Dne(qnq, n, n2, n3, 0, n5, false, -1, 0);
        }
        if (bl) {
            qnq.method_58fe7b07_bzF(n, n2, n3, this.field_21260d_FWm);
            int n6 = n5 & 3;
            if (n6 == 3) {
                qnq.method_58fe7b07_bzF(n - 1, n2, n3, this.field_21260d_FWm);
            } else if (n6 == 1) {
                qnq.method_58fe7b07_bzF(n + 1, n2, n3, this.field_21260d_FWm);
            } else if (n6 == 0) {
                qnq.method_58fe7b07_bzF(n, n2, n3 - 1, this.field_21260d_FWm);
            } else if (n6 == 2) {
                qnq.method_58fe7b07_bzF(n, n2, n3 + 1, this.field_21260d_FWm);
            }
        }
        super.method_3e226590_Dne(qnq, n, n2, n3, n4, n5);
    }

    public iBp(int n) {
        super(n, KFd.field_1efdede7_qLR);
        this.method_82a88d64_Dne(JcN.field_75b0c0e4_bzF);
        this.method_21cbfe2c_Dne(true);
    }

    @Override
    public void method_ca828a1c_Dne(Qnq qnq, int n, int n2, int n3, Random random) {
        this.method_a7769ea4_Dne(qnq, n, n2, n3, this.field_21260d_FWm, qnq.method_2dee76f_bzF(n, n2, n3), true, -1, 0);
    }

    @Override
    public boolean method_9cb39134_Dne(Qnq qnq, int n, int n2, int n3) {
        return qnq.method_6fdef3c4_DyG(n - 1, n2, n3) ? true : (qnq.method_6fdef3c4_DyG(n + 1, n2, n3) ? true : (qnq.method_6fdef3c4_DyG(n, n2, n3 - 1) ? true : qnq.method_6fdef3c4_DyG(n, n2, n3 + 1)));
    }

    @Override
    public boolean method_f9bf07d7_Dne(Qnq qnq, int n, int n2, int n3, int n4) {
        return n4 == 2 && qnq.method_6fdef3c4_DyG(n, n2, n3 + 1) ? true : (n4 == 3 && qnq.method_6fdef3c4_DyG(n, n2, n3 - 1) ? true : (n4 == 4 && qnq.method_6fdef3c4_DyG(n + 1, n2, n3) ? true : n4 == 5 && qnq.method_6fdef3c4_DyG(n - 1, n2, n3)));
    }

    @Override
    public int method_a13ce189_Dne(Qnq qnq, int n, int n2, int n3, int n4, float f, float f2, float f3, int n5) {
        int n6 = 0;
        if (n4 == 2 && qnq.method_2ee9044e_FWm(n, n2, n3 + 1, true)) {
            n6 = 2;
        }
        if (n4 == 3 && qnq.method_2ee9044e_FWm(n, n2, n3 - 1, true)) {
            n6 = 0;
        }
        if (n4 == 4 && qnq.method_2ee9044e_FWm(n + 1, n2, n3, true)) {
            n6 = 1;
        }
        if (n4 == 5 && qnq.method_2ee9044e_FWm(n - 1, n2, n3, true)) {
            n6 = 3;
        }
        return n6;
    }

    private boolean method_54527961_bzF(Qnq qnq, int n, int n2, int n3) {
        if (!this.method_9cb39134_Dne(qnq, n, n2, n3)) {
            this.method_fd7de26f_FWm(qnq, n, n2, n3, qnq.method_2dee76f_bzF(n, n2, n3), 0);
            qnq.method_2e7161e6_Qnq(n, n2, n3);
            return false;
        }
        return true;
    }

    public void method_a7769ea4_Dne(Qnq qnq, int n, int n2, int n3, int n4, int n5, boolean bl, int n6, int n7) {
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        int n13 = n5 & 3;
        boolean bl2 = (n5 & 4) == 4;
        boolean bl3 = (n5 & 8) == 8;
        boolean bl4 = n4 == zKP.field_37692b5_Dne.field_21260d_FWm;
        boolean bl5 = false;
        boolean bl6 = !qnq.method_73e9b8f9_IjH(n, n2 - 1, n3);
        int n14 = zxJ.field_3f1c589_Dne[n13];
        int n15 = zxJ.field_4039e0a_FWm[n13];
        int n16 = 0;
        int[] nArray = new int[42];
        for (n12 = 1; n12 < 42; ++n12) {
            n11 = n + n14 * n12;
            n10 = n3 + n15 * n12;
            n9 = qnq.method_2c2cf7bc_Dne(n11, n2, n10);
            if (n9 == zKP.field_37692b5_Dne.field_21260d_FWm) {
                n8 = qnq.method_2dee76f_bzF(n11, n2, n10);
                if ((n8 & 3) != zxJ.field_5781703_aFZ[n13]) break;
                n16 = n12;
                break;
            }
            if (n9 != zKP.field_9b24c8d5_lDk.field_21260d_FWm && n12 != n6) {
                nArray[n12] = -1;
                bl4 = false;
                continue;
            }
            n8 = n12 == n6 ? n7 : qnq.method_2dee76f_bzF(n11, n2, n10);
            boolean bl7 = (n8 & 8) != 8;
            boolean bl8 = (n8 & 1) == 1;
            boolean bl9 = (n8 & 2) == 2;
            bl4 &= bl9 == bl6;
            bl5 |= bl7 && bl8;
            nArray[n12] = n8;
            if (n12 != n6) continue;
            qnq.method_ae303daa_FWm(n, n2, n3, n4, this.method_83516086_Dne(qnq));
            bl4 &= bl7;
        }
        n12 = (bl4 ? 4 : 0) | ((bl5 &= (bl4 &= n16 > 1)) ? 8 : 0);
        n5 = n13 | n12;
        if (n16 > 0) {
            n11 = n + n14 * n16;
            n10 = n3 + n15 * n16;
            n9 = zxJ.field_5781703_aFZ[n13];
            qnq.method_d4dc89ed_Dne(n11, n2, n10, n9 | n12, 3);
            this.method_d6a0f314_FWm(qnq, n11, n2, n10, n9);
            this.method_5d278e30_Dne(qnq, n11, n2, n10, bl4, bl5, bl2, bl3);
        }
        this.method_5d278e30_Dne(qnq, n, n2, n3, bl4, bl5, bl2, bl3);
        if (n4 > 0) {
            qnq.method_d4dc89ed_Dne(n, n2, n3, n5, 3);
            if (bl) {
                this.method_d6a0f314_FWm(qnq, n, n2, n3, n13);
            }
        }
        if (bl2 != bl4) {
            for (n11 = 1; n11 < n16; ++n11) {
                n10 = n + n14 * n11;
                n9 = n3 + n15 * n11;
                n8 = nArray[n11];
                if (n8 < 0) continue;
                n8 = bl4 ? (n8 |= 4) : (n8 &= 0xFFFFFFFB);
                qnq.method_d4dc89ed_Dne(n10, n2, n9, n8, 3);
            }
        }
    }

    @Override
    public int method_7a46288d_Dne() {
        return 29;
    }

    @Override
    public boolean method_ae128dcb_bzF() {
        return true;
    }

    @Override
    public int method_56b56428_FWm(Zpi zpi, int n, int n2, int n3, int n4) {
        int n5 = zpi.method_2dee76f_bzF(n, n2, n3);
        if ((n5 & 8) != 8) {
            return 0;
        }
        int n6 = n5 & 3;
        return n6 == 2 && n4 == 2 ? 15 : (n6 == 0 && n4 == 3 ? 15 : (n6 == 1 && n4 == 4 ? 15 : (n6 == 3 && n4 == 5 ? 15 : 0)));
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return false;
    }

    private void method_d6a0f314_FWm(Qnq qnq, int n, int n2, int n3, int n4) {
        qnq.method_58fe7b07_bzF(n, n2, n3, this.field_21260d_FWm);
        if (n4 == 3) {
            qnq.method_58fe7b07_bzF(n - 1, n2, n3, this.field_21260d_FWm);
        } else if (n4 == 1) {
            qnq.method_58fe7b07_bzF(n + 1, n2, n3, this.field_21260d_FWm);
        } else if (n4 == 0) {
            qnq.method_58fe7b07_bzF(n, n2, n3 - 1, this.field_21260d_FWm);
        } else if (n4 == 2) {
            qnq.method_58fe7b07_bzF(n, n2, n3 + 1, this.field_21260d_FWm);
        }
    }
}

