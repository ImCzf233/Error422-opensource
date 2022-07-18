package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class Woy
extends gwq {
    private void method_d6a0f314_FWm(Qnq qnq, int n, int n2, int n3, int n4) {
        this.method_3e226590_Dne(qnq, n, n2, n3, zKP.field_728b3649_ipf.field_21260d_FWm, n4);
        int n5 = 4;
        while (qnq.method_2c2cf7bc_Dne(n, --n2, n3) == 0 && n5 > 0) {
            this.method_3e226590_Dne(qnq, n, n2, n3, zKP.field_728b3649_ipf.field_21260d_FWm, n4);
            --n5;
        }
        return;
    }

    @Override
    public boolean method_c3e4cb88_Dne(Qnq qnq, Random random, int n, int n2, int n3) {
        int n4 = random.nextInt(4) + 5;
        while (qnq.method_d9802b31_Dne(n, n2 - 1, n3) == KFd.field_1411d34d_div) {
            --n2;
        }
        boolean bl = true;
        if (n2 >= 1 && n2 + n4 + 1 <= 128) {
            int n5;
            int n6;
            int n7;
            int n8;
            int n9;
            for (n9 = n2; n9 <= n2 + 1 + n4; ++n9) {
                n8 = 1;
                if (n9 == n2) {
                    n8 = 0;
                }
                if (n9 >= n2 + 1 + n4 - 2) {
                    n8 = 3;
                }
                for (n7 = n - n8; n7 <= n + n8 && bl; ++n7) {
                    for (n6 = n3 - n8; n6 <= n3 + n8 && bl; ++n6) {
                        if (n9 >= 0 && n9 < 128) {
                            n5 = qnq.method_2c2cf7bc_Dne(n7, n9, n6);
                            if (n5 == 0 || n5 == zKP.field_36e218c_Dne.field_21260d_FWm) continue;
                            if (n5 != zKP.field_16319416_DyG.field_21260d_FWm && n5 != zKP.field_374330f_Dne.field_21260d_FWm) {
                                bl = false;
                                continue;
                            }
                            if (n9 <= n2) continue;
                            bl = false;
                            continue;
                        }
                        bl = false;
                    }
                }
            }
            if (!bl) {
                return false;
            }
            n9 = qnq.method_2c2cf7bc_Dne(n, n2 - 1, n3);
            if ((n9 == zKP.field_36ff555_Dne.field_21260d_FWm || n9 == zKP.field_203836cc_FWm.field_21260d_FWm) && n2 < 128 - n4 - 1) {
                int n10;
                this.method_f9bf07d3_Dne(qnq, n, n2 - 1, n3, zKP.field_203836cc_FWm.field_21260d_FWm);
                for (n10 = n2 - 3 + n4; n10 <= n2 + n4; ++n10) {
                    n7 = n10 - (n2 + n4);
                    n6 = 2 - n7 / 2;
                    for (n5 = n - n6; n5 <= n + n6; ++n5) {
                        n8 = n5 - n;
                        for (int i = n3 - n6; i <= n3 + n6; ++i) {
                            int n11 = i - n3;
                            if (Math.abs(n8) == n6 && Math.abs(n11) == n6 && (random.nextInt(2) == 0 || n7 == 0) || zKP.field_4039e1b_FWm[qnq.method_2c2cf7bc_Dne(n5, n10, i)]) continue;
                            this.method_f9bf07d3_Dne(qnq, n5, n10, i, zKP.field_36e218c_Dne.field_21260d_FWm);
                        }
                    }
                }
                for (n10 = 0; n10 < n4; ++n10) {
                    n7 = qnq.method_2c2cf7bc_Dne(n, n2 + n10, n3);
                    if (n7 != 0 && n7 != zKP.field_36e218c_Dne.field_21260d_FWm && n7 != zKP.field_374330f_Dne.field_21260d_FWm && n7 != zKP.field_16319416_DyG.field_21260d_FWm) continue;
                    this.method_f9bf07d3_Dne(qnq, n, n2 + n10, n3, zKP.field_af0f1368_udO.field_21260d_FWm);
                }
                for (n10 = n2 - 3 + n4; n10 <= n2 + n4; ++n10) {
                    n7 = n10 - (n2 + n4);
                    n6 = 2 - n7 / 2;
                    for (n5 = n - n6; n5 <= n + n6; ++n5) {
                        for (n8 = n3 - n6; n8 <= n3 + n6; ++n8) {
                            if (qnq.method_2c2cf7bc_Dne(n5, n10, n8) != zKP.field_36e218c_Dne.field_21260d_FWm) continue;
                            if (random.nextInt(4) == 0 && qnq.method_2c2cf7bc_Dne(n5 - 1, n10, n8) == 0) {
                                this.method_d6a0f314_FWm(qnq, n5 - 1, n10, n8, 8);
                            }
                            if (random.nextInt(4) == 0 && qnq.method_2c2cf7bc_Dne(n5 + 1, n10, n8) == 0) {
                                this.method_d6a0f314_FWm(qnq, n5 + 1, n10, n8, 2);
                            }
                            if (random.nextInt(4) == 0 && qnq.method_2c2cf7bc_Dne(n5, n10, n8 - 1) == 0) {
                                this.method_d6a0f314_FWm(qnq, n5, n10, n8 - 1, 1);
                            }
                            if (random.nextInt(4) != 0 || qnq.method_2c2cf7bc_Dne(n5, n10, n8 + 1) != 0) continue;
                            this.method_d6a0f314_FWm(qnq, n5, n10, n8 + 1, 4);
                        }
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }
}

