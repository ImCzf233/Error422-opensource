package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public abstract class vAg
extends zKP {
    private final boolean field_2092bf_Dne;

    @Override
    public boolean method_ae128dcb_bzF() {
        return true;
    }

    @Override
    public void method_f9bf07d3_Dne(Qnq qnq, int n, int n2, int n3, int n4) {
        if (this.method_54527961_bzF(qnq, n, n2, n3)) {
            int n5 = qnq.method_2dee76f_bzF(n, n2, n3) & 7;
            boolean bl = false;
            if (!qnq.method_6fdef3c4_DyG(n - 1, n2, n3) && n5 == 1) {
                bl = true;
            }
            if (!qnq.method_6fdef3c4_DyG(n + 1, n2, n3) && n5 == 2) {
                bl = true;
            }
            if (!qnq.method_6fdef3c4_DyG(n, n2, n3 - 1) && n5 == 3) {
                bl = true;
            }
            if (!qnq.method_6fdef3c4_DyG(n, n2, n3 + 1) && n5 == 4) {
                bl = true;
            }
            if (bl) {
                this.method_fd7de26f_FWm(qnq, n, n2, n3, qnq.method_2dee76f_bzF(n, n2, n3), 0);
                qnq.method_2e7161e6_Qnq(n, n2, n3);
            }
        }
    }

    private void method_d6a0f314_FWm(Qnq qnq, int n, int n2, int n3, int n4) {
        qnq.method_58fe7b07_bzF(n, n2, n3, this.field_21260d_FWm);
        if (n4 == 1) {
            qnq.method_58fe7b07_bzF(n - 1, n2, n3, this.field_21260d_FWm);
        } else if (n4 == 2) {
            qnq.method_58fe7b07_bzF(n + 1, n2, n3, this.field_21260d_FWm);
        } else if (n4 == 3) {
            qnq.method_58fe7b07_bzF(n, n2, n3 - 1, this.field_21260d_FWm);
        } else if (n4 == 4) {
            qnq.method_58fe7b07_bzF(n, n2, n3 + 1, this.field_21260d_FWm);
        } else {
            qnq.method_58fe7b07_bzF(n, n2 - 1, n3, this.field_21260d_FWm);
        }
    }

    protected vAg(int n, boolean bl) {
        super(n, KFd.field_1efdede7_qLR);
        this.method_21cbfe2c_Dne(true);
        this.method_82a88d64_Dne(JcN.field_75b0c0e4_bzF);
        this.field_2092bf_Dne = bl;
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
    }

    private int method_54527950_bzF(Qnq qnq, int n, int n2, int n3) {
        return qnq.method_6fdef3c4_DyG(n - 1, n2, n3) ? 1 : (qnq.method_6fdef3c4_DyG(n + 1, n2, n3) ? 2 : (qnq.method_6fdef3c4_DyG(n, n2, n3 - 1) ? 3 : (qnq.method_6fdef3c4_DyG(n, n2, n3 + 1) ? 4 : 1)));
    }

    @Override
    public bSp method_8c85fe2_Dne(Qnq qnq, int n, int n2, int n3) {
        return null;
    }

    @Override
    public void method_7a46289a_Dne() {
        float f = 0.1875f;
        float f2 = 0.125f;
        float f3 = 0.125f;
        this.method_eb14b51a_Dne(0.5f - f, 0.5f - f2, 0.5f - f3, 0.5f + f, 0.5f + f2, 0.5f + f3);
    }

    @Override
    public void method_ca828a1c_Dne(Qnq qnq, int n, int n2, int n3, Random random) {
        int n4;
        if (!qnq.field_2d2a05_aFZ && ((n4 = qnq.method_2dee76f_bzF(n, n2, n3)) & 8) != 0) {
            if (this.field_2092bf_Dne) {
                this.method_5452795d_bzF(qnq, n, n2, n3);
            } else {
                qnq.method_d4dc89ed_Dne(n, n2, n3, n4 & 7, 3);
                int n5 = n4 & 7;
                this.method_d6a0f314_FWm(qnq, n, n2, n3, n5);
                qnq.method_c961c6ee_Dne((double)n + 0.5, (double)n2 + 0.5, (double)n3 + 0.5, "random.click", 0.3f, 0.5f);
                qnq.method_c6b5263a_Dne(n, n2, n3, n, n2, n3);
            }
        }
    }

    @Override
    public int method_79d378e7_Dne(Zpi zpi, int n, int n2, int n3, int n4) {
        return (zpi.method_2dee76f_bzF(n, n2, n3) & 8) > 0 ? 15 : 0;
    }

    @Override
    public int method_56b56428_FWm(Zpi zpi, int n, int n2, int n3, int n4) {
        int n5 = zpi.method_2dee76f_bzF(n, n2, n3);
        if ((n5 & 8) == 0) {
            return 0;
        }
        int n6 = n5 & 7;
        return n6 == 5 && n4 == 1 ? 15 : (n6 == 4 && n4 == 2 ? 15 : (n6 == 3 && n4 == 3 ? 15 : (n6 == 2 && n4 == 4 ? 15 : (n6 == 1 && n4 == 5 ? 15 : 0))));
    }

    private void method_5452795d_bzF(Qnq qnq, int n, int n2, int n3) {
        boolean bl;
        int n4 = qnq.method_2dee76f_bzF(n, n2, n3);
        int n5 = n4 & 7;
        boolean bl2 = (n4 & 8) != 0;
        this.method_ce7f5da9_Dne(n4);
        List list = qnq.method_9314b7e8_Dne(hhc.class, bSp.method_23186cf1_Dne().method_b4ea3e0c_Dne((double)n + this.field_2092a9_Dne, (double)n2 + this.field_212608_FWm, (double)n3 + this.field_2e5f16_bzF, (double)n + this.field_267cf0_Qnq, (double)n2 + this.field_2d29ef_aFZ, (double)n3 + this.field_388da1_zGp));
        boolean bl3 = bl = !list.isEmpty();
        if (bl && !bl2) {
            qnq.method_d4dc89ed_Dne(n, n2, n3, n5 | 8, 3);
            this.method_d6a0f314_FWm(qnq, n, n2, n3, n5);
            qnq.method_c6b5263a_Dne(n, n2, n3, n, n2, n3);
            qnq.method_c961c6ee_Dne((double)n + 0.5, (double)n2 + 0.5, (double)n3 + 0.5, "random.click", 0.3f, 0.6f);
        }
        if (!bl && bl2) {
            qnq.method_d4dc89ed_Dne(n, n2, n3, n5, 3);
            this.method_d6a0f314_FWm(qnq, n, n2, n3, n5);
            qnq.method_c6b5263a_Dne(n, n2, n3, n, n2, n3);
            qnq.method_c961c6ee_Dne((double)n + 0.5, (double)n2 + 0.5, (double)n3 + 0.5, "random.click", 0.3f, 0.5f);
        }
        if (bl) {
            qnq.method_ae303daa_FWm(n, n2, n3, this.field_21260d_FWm, this.method_83516086_Dne(qnq));
        }
    }

    @Override
    public boolean method_9cb39134_Dne(Qnq qnq, int n, int n2, int n3) {
        return qnq.method_6fdef3c4_DyG(n - 1, n2, n3) ? true : (qnq.method_6fdef3c4_DyG(n + 1, n2, n3) ? true : (qnq.method_6fdef3c4_DyG(n, n2, n3 - 1) ? true : qnq.method_6fdef3c4_DyG(n, n2, n3 + 1)));
    }

    @Override
    public int method_a13ce189_Dne(Qnq qnq, int n, int n2, int n3, int n4, float f, float f2, float f3, int n5) {
        int n6 = qnq.method_2dee76f_bzF(n, n2, n3);
        int n7 = n6 & 8;
        n6 &= 7;
        n6 = n4 == 2 && qnq.method_6fdef3c4_DyG(n, n2, n3 + 1) ? 4 : (n4 == 3 && qnq.method_6fdef3c4_DyG(n, n2, n3 - 1) ? 3 : (n4 == 4 && qnq.method_6fdef3c4_DyG(n + 1, n2, n3) ? 2 : (n4 == 5 && qnq.method_6fdef3c4_DyG(n - 1, n2, n3) ? 1 : this.method_54527950_bzF(qnq, n, n2, n3))));
        return n6 + n7;
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return false;
    }

    @Override
    public void method_41dd09cd_Dne(Qnq qnq, int n, int n2, int n3, FiG fiG) {
    }

    private boolean method_54527961_bzF(Qnq qnq, int n, int n2, int n3) {
        if (!this.method_9cb39134_Dne(qnq, n, n2, n3)) {
            this.method_fd7de26f_FWm(qnq, n, n2, n3, qnq.method_2dee76f_bzF(n, n2, n3), 0);
            qnq.method_2e7161e6_Qnq(n, n2, n3);
            return false;
        }
        return true;
    }

    @Override
    public int method_83516086_Dne(Qnq qnq) {
        return this.field_2092bf_Dne ? 30 : 20;
    }

    private void method_ce7f5da9_Dne(int n) {
        int n2 = n & 7;
        boolean bl = (n & 8) > 0;
        float f = 0.375f;
        float f2 = 0.625f;
        float f3 = 0.1875f;
        float f4 = 0.125f;
        if (bl) {
            f4 = 0.0625f;
        }
        if (n2 == 1) {
            this.method_eb14b51a_Dne(0.0f, f, 0.5f - f3, f4, f2, 0.5f + f3);
        } else if (n2 == 2) {
            this.method_eb14b51a_Dne(1.0f - f4, f, 0.5f - f3, 1.0f, f2, 0.5f + f3);
        } else if (n2 == 3) {
            this.method_eb14b51a_Dne(0.5f - f3, f, 0.0f, 0.5f + f3, f2, f4);
        } else if (n2 == 4) {
            this.method_eb14b51a_Dne(0.5f - f3, f, 1.0f - f4, 0.5f + f3, f2, 1.0f);
        }
    }

    @Override
    public void method_3e226590_Dne(Qnq qnq, int n, int n2, int n3, int n4, int n5) {
        if ((n5 & 8) > 0) {
            int n6 = n5 & 7;
            this.method_d6a0f314_FWm(qnq, n, n2, n3, n6);
        }
        super.method_3e226590_Dne(qnq, n, n2, n3, n4, n5);
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return false;
    }

    @Override
    public void method_fbabf7ef_Dne(Zpi zpi, int n, int n2, int n3) {
        int n4 = zpi.method_2dee76f_bzF(n, n2, n3);
        this.method_ce7f5da9_Dne(n4);
    }

    @Override
    public boolean method_f9bf07d7_Dne(Qnq qnq, int n, int n2, int n3, int n4) {
        return n4 == 2 && qnq.method_6fdef3c4_DyG(n, n2, n3 + 1) ? true : (n4 == 3 && qnq.method_6fdef3c4_DyG(n, n2, n3 - 1) ? true : (n4 == 4 && qnq.method_6fdef3c4_DyG(n + 1, n2, n3) ? true : n4 == 5 && qnq.method_6fdef3c4_DyG(n - 1, n2, n3)));
    }

    @Override
    public boolean method_cb53d52e_Dne(Qnq qnq, int n, int n2, int n3, FiG fiG, int n4, float f, float f2, float f3) {
        int n5 = qnq.method_2dee76f_bzF(n, n2, n3);
        int n6 = n5 & 7;
        int n7 = 8 - (n5 & 8);
        if (n7 == 0) {
            return true;
        }
        qnq.method_d4dc89ed_Dne(n, n2, n3, n6 + n7, 3);
        qnq.method_c6b5263a_Dne(n, n2, n3, n, n2, n3);
        qnq.method_c961c6ee_Dne((double)n + 0.5, (double)n2 + 0.5, (double)n3 + 0.5, "random.click", 0.3f, 0.6f);
        this.method_d6a0f314_FWm(qnq, n, n2, n3, n6);
        qnq.method_ae303daa_FWm(n, n2, n3, this.field_21260d_FWm, this.method_83516086_Dne(qnq));
        return true;
    }

    @Override
    public void method_8d285d4a_Dne(Qnq qnq, int n, int n2, int n3, sMa sMa2) {
        if (!qnq.field_2d2a05_aFZ && this.field_2092bf_Dne && (qnq.method_2dee76f_bzF(n, n2, n3) & 8) == 0) {
            this.method_5452795d_bzF(qnq, n, n2, n3);
        }
    }
}

