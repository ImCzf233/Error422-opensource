package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class Zql
extends zKP {
    private static boolean method_117d19ee_FWm(int n) {
        if (n <= 0) {
            return false;
        }
        zKP zKP2 = zKP.field_8374b848_Dne[n];
        return zKP2 != null && zKP2.field_368fd23_Dne.method_7ad38807_DyG() && zKP2.method_7a46289e_Dne() || zKP2 == zKP.field_3b150dda_fYA || zKP2 instanceof dNT || zKP2 instanceof vla;
    }

    public void method_f9bf47a4_Dne(Qnq qnq, int n, int n2, int n3, boolean bl) {
        boolean bl2;
        int n4 = qnq.method_2dee76f_bzF(n, n2, n3);
        boolean bl3 = bl2 = (n4 & 4) > 0;
        if (bl2 != bl) {
            qnq.method_d4dc89ed_Dne(n, n2, n3, n4 ^ 4, 2);
            qnq.method_bfa54b80_Dne(null, 1003, n, n2, n3, 0);
        }
    }

    @Override
    public bSp method_8c85fe2_Dne(Qnq qnq, int n, int n2, int n3) {
        this.method_fbabf7ef_Dne(qnq, n, n2, n3);
        return super.method_8c85fe2_Dne(qnq, n, n2, n3);
    }

    @Override
    public boolean method_f9bf07d7_Dne(Qnq qnq, int n, int n2, int n3, int n4) {
        if (n4 == 0) {
            return false;
        }
        if (n4 == 1) {
            return false;
        }
        if (n4 == 2) {
            ++n3;
        }
        if (n4 == 3) {
            --n3;
        }
        if (n4 == 4) {
            ++n;
        }
        if (n4 == 5) {
            --n;
        }
        return Zql.method_117d19ee_FWm(qnq.method_2c2cf7bc_Dne(n, n2, n3));
    }

    @Override
    public void method_f9bf07d3_Dne(Qnq qnq, int n, int n2, int n3, int n4) {
        if (!qnq.field_2d2a05_aFZ) {
            boolean bl;
            int n5 = qnq.method_2dee76f_bzF(n, n2, n3);
            int n6 = n;
            int n7 = n3;
            if ((n5 & 3) == 0) {
                n7 = n3 + 1;
            }
            if ((n5 & 3) == 1) {
                --n7;
            }
            if ((n5 & 3) == 2) {
                n6 = n + 1;
            }
            if ((n5 & 3) == 3) {
                --n6;
            }
            if (!Zql.method_117d19ee_FWm(qnq.method_2c2cf7bc_Dne(n6, n2, n7))) {
                qnq.method_2e7161e6_Qnq(n, n2, n3);
                this.method_fd7de26f_FWm(qnq, n, n2, n3, n5, 0);
            }
            if ((bl = qnq.method_6382f365_kGO(n, n2, n3)) || n4 > 0 && zKP.field_8374b848_Dne[n4].method_ae128dcb_bzF()) {
                this.method_f9bf47a4_Dne(qnq, n, n2, n3, bl);
            }
        }
    }

    @Override
    public boolean method_cb53d52e_Dne(Qnq qnq, int n, int n2, int n3, FiG fiG, int n4, float f, float f2, float f3) {
        if (this.field_368fd23_Dne == KFd.field_f09abc1b_zGp) {
            return true;
        }
        int n5 = qnq.method_2dee76f_bzF(n, n2, n3);
        qnq.method_d4dc89ed_Dne(n, n2, n3, n5 ^ 4, 2);
        qnq.method_bfa54b80_Dne(fiG, 1003, n, n2, n3, 0);
        return true;
    }

    public static boolean method_ce7f5dad_Dne(int n) {
        return (n & 4) != 0;
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return false;
    }

    public void method_ce7f5da9_Dne(int n) {
        float f = 0.1875f;
        if ((n & 8) != 0) {
            this.method_eb14b51a_Dne(0.0f, 1.0f - f, 0.0f, 1.0f, 1.0f, 1.0f);
        } else {
            this.method_eb14b51a_Dne(0.0f, 0.0f, 0.0f, 1.0f, f, 1.0f);
        }
        if (Zql.method_ce7f5dad_Dne(n)) {
            if ((n & 3) == 0) {
                this.method_eb14b51a_Dne(0.0f, 0.0f, 1.0f - f, 1.0f, 1.0f, 1.0f);
            }
            if ((n & 3) == 1) {
                this.method_eb14b51a_Dne(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, f);
            }
            if ((n & 3) == 2) {
                this.method_eb14b51a_Dne(1.0f - f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
            }
            if ((n & 3) == 3) {
                this.method_eb14b51a_Dne(0.0f, 0.0f, 0.0f, f, 1.0f, 1.0f);
            }
        }
    }

    @Override
    public bSp method_5f382101_FWm(Qnq qnq, int n, int n2, int n3) {
        this.method_fbabf7ef_Dne(qnq, n, n2, n3);
        return super.method_5f382101_FWm(qnq, n, n2, n3);
    }

    @Override
    public void method_7a46289a_Dne() {
        float f = 0.1875f;
        this.method_eb14b51a_Dne(0.0f, 0.5f - f / 2.0f, 0.0f, 1.0f, 0.5f + f / 2.0f, 1.0f);
    }

    @Override
    public void method_41dd09cd_Dne(Qnq qnq, int n, int n2, int n3, FiG fiG) {
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return false;
    }

    @Override
    public void method_fbabf7ef_Dne(Zpi zpi, int n, int n2, int n3) {
        this.method_ce7f5da9_Dne(zpi.method_2dee76f_bzF(n, n2, n3));
    }

    @Override
    public int method_7a46288d_Dne() {
        return 0;
    }

    @Override
    public wHH method_acf3908a_Dne(Qnq qnq, int n, int n2, int n3, chN chN2, chN chN3) {
        this.method_fbabf7ef_Dne(qnq, n, n2, n3);
        return super.method_acf3908a_Dne(qnq, n, n2, n3, chN2, chN3);
    }

    @Override
    public boolean method_fbabf7f3_Dne(Zpi zpi, int n, int n2, int n3) {
        return !Zql.method_ce7f5dad_Dne(zpi.method_2dee76f_bzF(n, n2, n3));
    }

    @Override
    public int method_a13ce189_Dne(Qnq qnq, int n, int n2, int n3, int n4, float f, float f2, float f3, int n5) {
        int n6 = 0;
        if (n4 == 2) {
            n6 = 0;
        }
        if (n4 == 3) {
            n6 = 1;
        }
        if (n4 == 4) {
            n6 = 2;
        }
        if (n4 == 5) {
            n6 = 3;
        }
        if (n4 != 1 && n4 != 0 && f2 > 0.5f) {
            n6 |= 8;
        }
        return n6;
    }

    protected Zql(int n, KFd kFd) {
        super(n, kFd);
        float f = 0.5f;
        float f2 = 1.0f;
        this.method_eb14b51a_Dne(0.5f - f, 0.0f, 0.5f - f, 0.5f + f, f2, 0.5f + f);
        this.method_82a88d64_Dne(JcN.field_75b0c0e4_bzF);
    }
}

