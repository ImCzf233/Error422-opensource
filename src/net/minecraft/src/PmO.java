package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class PmO
extends zKP {
    private boolean method_ce7f5dad_Dne(int n) {
        if (n == 0) {
            return false;
        }
        zKP zKP2 = zKP.field_8374b848_Dne[n];
        return zKP2.method_7a46289e_Dne() && zKP2.field_368fd23_Dne.method_ae128dcb_bzF();
    }

    @Override
    public int method_24763341_Dne(int n, Random random, int n2) {
        return 0;
    }

    @Override
    public void method_fbabf7ef_Dne(Zpi zpi, int n, int n2, int n3) {
        boolean bl;
        int n4 = zpi.method_2dee76f_bzF(n, n2, n3);
        float f = 1.0f;
        float f2 = 1.0f;
        float f3 = 1.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        boolean bl2 = bl = n4 > 0;
        if ((n4 & 2) != 0) {
            f4 = Math.max(f4, 0.0625f);
            f = 0.0f;
            f2 = 0.0f;
            f5 = 1.0f;
            f3 = 0.0f;
            f6 = 1.0f;
            bl = true;
        }
        if ((n4 & 8) != 0) {
            f = Math.min(f, 0.9375f);
            f4 = 1.0f;
            f2 = 0.0f;
            f5 = 1.0f;
            f3 = 0.0f;
            f6 = 1.0f;
            bl = true;
        }
        if ((n4 & 4) != 0) {
            f6 = Math.max(f6, 0.0625f);
            f3 = 0.0f;
            f = 0.0f;
            f4 = 1.0f;
            f2 = 0.0f;
            f5 = 1.0f;
            bl = true;
        }
        if ((n4 & 1) != 0) {
            f3 = Math.min(f3, 0.9375f);
            f6 = 1.0f;
            f = 0.0f;
            f4 = 1.0f;
            f2 = 0.0f;
            f5 = 1.0f;
            bl = true;
        }
        if (!bl && this.method_ce7f5dad_Dne(zpi.method_2c2cf7bc_Dne(n, n2 + 1, n3))) {
            f2 = Math.min(f2, 0.9375f);
            f5 = 1.0f;
            f = 0.0f;
            f4 = 1.0f;
            f3 = 0.0f;
            f6 = 1.0f;
        }
        this.method_eb14b51a_Dne(f, f2, f3, f4, f5, f6);
    }

    @Override
    public int method_fbabf7e2_Dne(Zpi zpi, int n, int n2, int n3) {
        return zpi.method_90477c37_Dne(n, n3).method_907a9d14_Qnq();
    }

    @Override
    public boolean method_f9bf07d7_Dne(Qnq qnq, int n, int n2, int n3, int n4) {
        switch (n4) {
            case 1: {
                return this.method_ce7f5dad_Dne(qnq.method_2c2cf7bc_Dne(n, n2 + 1, n3));
            }
            case 2: {
                return this.method_ce7f5dad_Dne(qnq.method_2c2cf7bc_Dne(n, n2, n3 + 1));
            }
            case 3: {
                return this.method_ce7f5dad_Dne(qnq.method_2c2cf7bc_Dne(n, n2, n3 - 1));
            }
            case 4: {
                return this.method_ce7f5dad_Dne(qnq.method_2c2cf7bc_Dne(n + 1, n2, n3));
            }
            case 5: {
                return this.method_ce7f5dad_Dne(qnq.method_2c2cf7bc_Dne(n - 1, n2, n3));
            }
        }
        return true;
    }

    @Override
    public void method_ca828a1c_Dne(Qnq qnq, int n, int n2, int n3, Random random) {
        if (!qnq.field_2d2a05_aFZ && qnq.field_7331eae7_Dne.nextInt(4) == 0) {
            int n4;
            int n5;
            int n6;
            int n7 = 4;
            int n8 = 5;
            boolean bl = false;
            block0: for (n6 = n - n7; n6 <= n + n7; ++n6) {
                for (n5 = n3 - n7; n5 <= n3 + n7; ++n5) {
                    for (n4 = n2 - 1; n4 <= n2 + 1; ++n4) {
                        if (qnq.method_2c2cf7bc_Dne(n6, n4, n5) != this.field_21260d_FWm || --n8 > 0) continue;
                        bl = true;
                        break block0;
                    }
                }
            }
            n6 = qnq.method_2dee76f_bzF(n, n2, n3);
            n5 = qnq.field_7331eae7_Dne.nextInt(6);
            n4 = zxJ.field_4a92422_Qnq[n5];
            if (n5 == 1 && n2 < 255 && qnq.method_2c2cf7cd_Dne(n, n2 + 1, n3)) {
                if (bl) {
                    return;
                }
                int n9 = qnq.field_7331eae7_Dne.nextInt(16) & n6;
                if (n9 > 0) {
                    for (int i = 0; i <= 3; ++i) {
                        if (this.method_ce7f5dad_Dne(qnq.method_2c2cf7bc_Dne(n + zxJ.field_3f1c589_Dne[i], n2 + 1, n3 + zxJ.field_4039e0a_FWm[i]))) continue;
                        n9 &= ~(1 << i);
                    }
                    if (n9 > 0) {
                        qnq.method_17d7ea9d_FWm(n, n2 + 1, n3, this.field_21260d_FWm, n9, 2);
                    }
                }
            } else if (n5 >= 2 && n5 <= 5 && (n6 & 1 << n4) == 0) {
                if (bl) {
                    return;
                }
                int n10 = qnq.method_2c2cf7bc_Dne(n + zxJ.field_3f1c589_Dne[n4], n2, n3 + zxJ.field_4039e0a_FWm[n4]);
                if (n10 != 0 && zKP.field_8374b848_Dne[n10] != null) {
                    if (zKP.field_8374b848_Dne[n10].field_368fd23_Dne.method_7ad38807_DyG() && zKP.field_8374b848_Dne[n10].method_7a46289e_Dne()) {
                        qnq.method_d4dc89ed_Dne(n, n2, n3, n6 | 1 << n4, 2);
                    }
                } else {
                    int n11 = n4 + 1 & 3;
                    int n12 = n4 + 3 & 3;
                    if ((n6 & 1 << n11) != 0 && this.method_ce7f5dad_Dne(qnq.method_2c2cf7bc_Dne(n + zxJ.field_3f1c589_Dne[n4] + zxJ.field_3f1c589_Dne[n11], n2, n3 + zxJ.field_4039e0a_FWm[n4] + zxJ.field_4039e0a_FWm[n11]))) {
                        qnq.method_17d7ea9d_FWm(n + zxJ.field_3f1c589_Dne[n4], n2, n3 + zxJ.field_4039e0a_FWm[n4], this.field_21260d_FWm, 1 << n11, 2);
                    } else if ((n6 & 1 << n12) != 0 && this.method_ce7f5dad_Dne(qnq.method_2c2cf7bc_Dne(n + zxJ.field_3f1c589_Dne[n4] + zxJ.field_3f1c589_Dne[n12], n2, n3 + zxJ.field_4039e0a_FWm[n4] + zxJ.field_4039e0a_FWm[n12]))) {
                        qnq.method_17d7ea9d_FWm(n + zxJ.field_3f1c589_Dne[n4], n2, n3 + zxJ.field_4039e0a_FWm[n4], this.field_21260d_FWm, 1 << n12, 2);
                    } else if ((n6 & 1 << n11) != 0 && qnq.method_2c2cf7cd_Dne(n + zxJ.field_3f1c589_Dne[n4] + zxJ.field_3f1c589_Dne[n11], n2, n3 + zxJ.field_4039e0a_FWm[n4] + zxJ.field_4039e0a_FWm[n11]) && this.method_ce7f5dad_Dne(qnq.method_2c2cf7bc_Dne(n + zxJ.field_3f1c589_Dne[n11], n2, n3 + zxJ.field_4039e0a_FWm[n11]))) {
                        qnq.method_17d7ea9d_FWm(n + zxJ.field_3f1c589_Dne[n4] + zxJ.field_3f1c589_Dne[n11], n2, n3 + zxJ.field_4039e0a_FWm[n4] + zxJ.field_4039e0a_FWm[n11], this.field_21260d_FWm, 1 << (n4 + 2 & 3), 2);
                    } else if ((n6 & 1 << n12) != 0 && qnq.method_2c2cf7cd_Dne(n + zxJ.field_3f1c589_Dne[n4] + zxJ.field_3f1c589_Dne[n12], n2, n3 + zxJ.field_4039e0a_FWm[n4] + zxJ.field_4039e0a_FWm[n12]) && this.method_ce7f5dad_Dne(qnq.method_2c2cf7bc_Dne(n + zxJ.field_3f1c589_Dne[n12], n2, n3 + zxJ.field_4039e0a_FWm[n12]))) {
                        qnq.method_17d7ea9d_FWm(n + zxJ.field_3f1c589_Dne[n4] + zxJ.field_3f1c589_Dne[n12], n2, n3 + zxJ.field_4039e0a_FWm[n4] + zxJ.field_4039e0a_FWm[n12], this.field_21260d_FWm, 1 << (n4 + 2 & 3), 2);
                    } else if (this.method_ce7f5dad_Dne(qnq.method_2c2cf7bc_Dne(n + zxJ.field_3f1c589_Dne[n4], n2 + 1, n3 + zxJ.field_4039e0a_FWm[n4]))) {
                        qnq.method_17d7ea9d_FWm(n + zxJ.field_3f1c589_Dne[n4], n2, n3 + zxJ.field_4039e0a_FWm[n4], this.field_21260d_FWm, 0, 2);
                    }
                }
            } else if (n2 > 1) {
                int n13 = qnq.method_2c2cf7bc_Dne(n, n2 - 1, n3);
                if (n13 == 0) {
                    int n14 = qnq.field_7331eae7_Dne.nextInt(16) & n6;
                    if (n14 > 0) {
                        qnq.method_17d7ea9d_FWm(n, n2 - 1, n3, this.field_21260d_FWm, n14, 2);
                    }
                } else if (n13 == this.field_21260d_FWm) {
                    int n15 = qnq.field_7331eae7_Dne.nextInt(16) & n6;
                    int n16 = qnq.method_2dee76f_bzF(n, n2 - 1, n3);
                    if (n16 != (n16 | n15)) {
                        qnq.method_d4dc89ed_Dne(n, n2 - 1, n3, n16 | n15, 2);
                    }
                }
            }
        }
    }

    @Override
    public int method_590ca0b_b_() {
        return QFY.method_ae128dba_bzF();
    }

    private boolean method_54527961_bzF(Qnq qnq, int n, int n2, int n3) {
        int n4;
        int n5 = n4 = qnq.method_2dee76f_bzF(n, n2, n3);
        if (n4 > 0) {
            for (int i = 0; i <= 3; ++i) {
                int n6 = 1 << i;
                if ((n4 & n6) == 0 || this.method_ce7f5dad_Dne(qnq.method_2c2cf7bc_Dne(n + zxJ.field_3f1c589_Dne[i], n2, n3 + zxJ.field_4039e0a_FWm[i])) || qnq.method_2c2cf7bc_Dne(n, n2 + 1, n3) == this.field_21260d_FWm && (qnq.method_2dee76f_bzF(n, n2 + 1, n3) & n6) != 0) continue;
                n5 &= ~n6;
            }
        }
        if (n5 == 0 && !this.method_ce7f5dad_Dne(qnq.method_2c2cf7bc_Dne(n, n2 + 1, n3))) {
            return false;
        }
        if (n5 != n4) {
            qnq.method_d4dc89ed_Dne(n, n2, n3, n5, 2);
        }
        return true;
    }

    public PmO(int n) {
        super(n, KFd.field_6162b14b_Zpi);
        this.method_21cbfe2c_Dne(true);
        this.method_82a88d64_Dne(JcN.field_2022bed6_FWm);
    }

    @Override
    public int method_7a46288d_Dne() {
        return 20;
    }

    @Override
    public void method_e061540a_Dne(Qnq qnq, FiG fiG, int n, int n2, int n3, int n4) {
        if (!qnq.field_2d2a05_aFZ && fiG.method_22900b26_bzF() != null && fiG.method_22900b26_bzF().field_2e5f1b_bzF == dEr.field_37078f6_Dne.field_267cf5_Qnq) {
            fiG.method_df3461c5_Dne(trP.field_83628b9e_Dne[this.field_21260d_FWm], 1);
            this.method_c594b700_FWm(qnq, n, n2, n3, new NMq(zKP.field_728b3649_ipf, 1, 0));
        } else {
            super.method_e061540a_Dne(qnq, fiG, n, n2, n3, n4);
        }
    }

    @Override
    public int method_117d19dd_FWm(int n) {
        return QFY.method_ae128dba_bzF();
    }

    @Override
    public int method_cfc9daf9_Dne(Random random) {
        return 0;
    }

    @Override
    public bSp method_8c85fe2_Dne(Qnq qnq, int n, int n2, int n3) {
        return null;
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return false;
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return false;
    }

    @Override
    public void method_7a46289a_Dne() {
        this.method_eb14b51a_Dne(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }

    @Override
    public int method_a13ce189_Dne(Qnq qnq, int n, int n2, int n3, int n4, float f, float f2, float f3, int n5) {
        int n6 = 0;
        switch (n4) {
            case 2: {
                n6 = 1;
                break;
            }
            case 3: {
                n6 = 4;
                break;
            }
            case 4: {
                n6 = 8;
                break;
            }
            case 5: {
                n6 = 2;
            }
        }
        return n6 != 0 ? n6 : n5;
    }

    @Override
    public void method_f9bf07d3_Dne(Qnq qnq, int n, int n2, int n3, int n4) {
        if (!qnq.field_2d2a05_aFZ && !this.method_54527961_bzF(qnq, n, n2, n3)) {
            this.method_fd7de26f_FWm(qnq, n, n2, n3, qnq.method_2dee76f_bzF(n, n2, n3), 0);
            qnq.method_2e7161e6_Qnq(n, n2, n3);
        }
    }
}

