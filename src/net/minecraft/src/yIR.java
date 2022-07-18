package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class yIR
extends gwq {
    private int field_2092ae_Dne = -1;

    public yIR() {
        super(false);
    }

    public yIR(int n) {
        super(true);
        this.field_2092ae_Dne = n;
    }

    @Override
    public boolean method_c3e4cb88_Dne(Qnq qnq, Random random, int n, int n2, int n3) {
        int n4 = random.nextInt(2);
        if (this.field_2092ae_Dne >= 0) {
            n4 = this.field_2092ae_Dne;
        }
        int n5 = random.nextInt(3) + 4;
        boolean bl = true;
        if (n2 >= 1 && n2 + n5 + 1 < 256) {
            int n6;
            int n7;
            int n8;
            int n9;
            int n10;
            for (n10 = n2; n10 <= n2 + 1 + n5; ++n10) {
                n9 = 3;
                if (n10 <= n2 + 3) {
                    n9 = 0;
                }
                for (n8 = n - n9; n8 <= n + n9 && bl; ++n8) {
                    for (n7 = n3 - n9; n7 <= n3 + n9 && bl; ++n7) {
                        if (n10 >= 0 && n10 < 256) {
                            n6 = qnq.method_2c2cf7bc_Dne(n8, n10, n7);
                            if (n6 == 0 || n6 == zKP.field_36e218c_Dne.field_21260d_FWm) continue;
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
            n10 = qnq.method_2c2cf7bc_Dne(n, n2 - 1, n3);
            if (n10 != zKP.field_203836cc_FWm.field_21260d_FWm && n10 != zKP.field_36ff555_Dne.field_21260d_FWm && n10 != zKP.field_36e467b_Dne.field_21260d_FWm) {
                return false;
            }
            n9 = n2 + n5;
            if (n4 == 1) {
                n9 = n2 + n5 - 3;
            }
            for (n8 = n9; n8 <= n2 + n5; ++n8) {
                n7 = 1;
                if (n8 < n2 + n5) {
                    ++n7;
                }
                if (n4 == 0) {
                    n7 = 3;
                }
                for (n6 = n - n7; n6 <= n + n7; ++n6) {
                    for (int i = n3 - n7; i <= n3 + n7; ++i) {
                        int n11 = 5;
                        if (n6 == n - n7) {
                            --n11;
                        }
                        if (n6 == n + n7) {
                            ++n11;
                        }
                        if (i == n3 - n7) {
                            n11 -= 3;
                        }
                        if (i == n3 + n7) {
                            n11 += 3;
                        }
                        if (n4 == 0 || n8 < n2 + n5) {
                            if ((n6 == n - n7 || n6 == n + n7) && (i == n3 - n7 || i == n3 + n7)) continue;
                            if (n6 == n - (n7 - 1) && i == n3 - n7) {
                                n11 = 1;
                            }
                            if (n6 == n - n7 && i == n3 - (n7 - 1)) {
                                n11 = 1;
                            }
                            if (n6 == n + (n7 - 1) && i == n3 - n7) {
                                n11 = 3;
                            }
                            if (n6 == n + n7 && i == n3 - (n7 - 1)) {
                                n11 = 3;
                            }
                            if (n6 == n - (n7 - 1) && i == n3 + n7) {
                                n11 = 7;
                            }
                            if (n6 == n - n7 && i == n3 + (n7 - 1)) {
                                n11 = 7;
                            }
                            if (n6 == n + (n7 - 1) && i == n3 + n7) {
                                n11 = 9;
                            }
                            if (n6 == n + n7 && i == n3 + (n7 - 1)) {
                                n11 = 9;
                            }
                        }
                        if (n11 == 5 && n8 < n2 + n5) {
                            n11 = 0;
                        }
                        if (n11 == 0 && n2 < n2 + n5 - 1 || zKP.field_4039e1b_FWm[qnq.method_2c2cf7bc_Dne(n6, n8, i)]) continue;
                        this.method_3e226590_Dne(qnq, n6, n8, i, zKP.field_5ff345a2_iXU.field_21260d_FWm + n4, n11);
                    }
                }
            }
            for (n8 = 0; n8 < n5; ++n8) {
                n7 = qnq.method_2c2cf7bc_Dne(n, n2 + n8, n3);
                if (zKP.field_4039e1b_FWm[n7]) continue;
                this.method_3e226590_Dne(qnq, n, n2 + n8, n3, zKP.field_5ff345a2_iXU.field_21260d_FWm + n4, 10);
            }
            return true;
        }
        return false;
    }
}

