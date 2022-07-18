package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class gvF
extends gwq {
    private int field_2092ae_Dne;

    public gvF(int n) {
        this.field_2092ae_Dne = n;
    }

    @Override
    public boolean method_c3e4cb88_Dne(Qnq qnq, Random random, int n, int n2, int n3) {
        Object object;
        int n4;
        int n5;
        n -= 8;
        n3 -= 8;
        while (n2 > 5 && qnq.method_2c2cf7cd_Dne(n, n2, n3)) {
            --n2;
        }
        if (n2 <= 4) {
            return false;
        }
        n2 -= 4;
        boolean[] blArray = new boolean[2048];
        int n6 = random.nextInt(4) + 4;
        for (n5 = 0; n5 < n6; ++n5) {
            double d = random.nextDouble() * 6.0 + 3.0;
            double d2 = random.nextDouble() * 4.0 + 2.0;
            double d3 = random.nextDouble() * 6.0 + 3.0;
            double d4 = random.nextDouble() * (16.0 - d - 2.0) + 1.0 + d / 2.0;
            double d5 = random.nextDouble() * (8.0 - d2 - 4.0) + 2.0 + d2 / 2.0;
            double d6 = random.nextDouble() * (16.0 - d3 - 2.0) + 1.0 + d3 / 2.0;
            for (int i = 1; i < 15; ++i) {
                for (int j = 1; j < 15; ++j) {
                    for (int k = 1; k < 7; ++k) {
                        double d7 = ((double)i - d4) / (d / 2.0);
                        double d8 = ((double)k - d5) / (d2 / 2.0);
                        double d9 = ((double)j - d6) / (d3 / 2.0);
                        double d10 = d7 * d7 + d8 * d8 + d9 * d9;
                        if (!(d10 < 1.0)) continue;
                        blArray[(i * 16 + j) * 8 + k] = true;
                    }
                }
            }
        }
        for (n5 = 0; n5 < 16; ++n5) {
            for (n4 = 0; n4 < 16; ++n4) {
                for (int i = 0; i < 8; ++i) {
                    boolean bl;
                    boolean bl2 = bl = !blArray[(n5 * 16 + n4) * 8 + i] && (n5 < 15 && blArray[((n5 + 1) * 16 + n4) * 8 + i] || n5 > 0 && blArray[((n5 - 1) * 16 + n4) * 8 + i] || n4 < 15 && blArray[(n5 * 16 + n4 + 1) * 8 + i] || n4 > 0 && blArray[(n5 * 16 + (n4 - 1)) * 8 + i] || i < 7 && blArray[(n5 * 16 + n4) * 8 + i + 1] || i > 0 && blArray[(n5 * 16 + n4) * 8 + (i - 1)]);
                    if (!bl) continue;
                    object = qnq.method_d9802b31_Dne(n + n5, n2 + i, n3 + n4);
                    if (i >= 4 && ((KFd)object).method_907a9d25_Qnq()) {
                        return false;
                    }
                    if (i >= 4 || ((KFd)object).method_7a46289e_Dne() || qnq.method_2c2cf7bc_Dne(n + n5, n2 + i, n3 + n4) == this.field_2092ae_Dne) continue;
                    return false;
                }
            }
        }
        for (n5 = 0; n5 < 16; ++n5) {
            for (n4 = 0; n4 < 16; ++n4) {
                for (int i = 0; i < 8; ++i) {
                    if (!blArray[(n5 * 16 + n4) * 8 + i]) continue;
                    qnq.method_17d7ea9d_FWm(n + n5, n2 + i, n3 + n4, i >= 4 ? 0 : this.field_2092ae_Dne, 0, 2);
                }
            }
        }
        for (n5 = 0; n5 < 16; ++n5) {
            for (n4 = 0; n4 < 16; ++n4) {
                for (int i = 4; i < 8; ++i) {
                    if (!blArray[(n5 * 16 + n4) * 8 + i] || qnq.method_2c2cf7bc_Dne(n + n5, n2 + i - 1, n3 + n4) != zKP.field_203836cc_FWm.field_21260d_FWm || qnq.method_f476b68e_FWm(udO.field_37c82cc_Dne, n + n5, n2 + i, n3 + n4) <= 0) continue;
                    object = qnq.method_90477c37_Dne(n + n5, n3 + n4);
                    if (((OdI)object).field_2092a7_Dne == zKP.field_36e467b_Dne.field_21260d_FWm) {
                        qnq.method_17d7ea9d_FWm(n + n5, n2 + i - 1, n3 + n4, zKP.field_36e467b_Dne.field_21260d_FWm, 0, 2);
                        continue;
                    }
                    qnq.method_17d7ea9d_FWm(n + n5, n2 + i - 1, n3 + n4, zKP.field_36ff555_Dne.field_21260d_FWm, 0, 2);
                }
            }
        }
        if (zKP.field_8374b848_Dne[this.field_2092ae_Dne].field_368fd23_Dne == KFd.field_5b96677_IjH) {
            for (n5 = 0; n5 < 16; ++n5) {
                for (n4 = 0; n4 < 16; ++n4) {
                    for (int i = 0; i < 8; ++i) {
                        boolean bl;
                        boolean bl3 = bl = !blArray[(n5 * 16 + n4) * 8 + i] && (n5 < 15 && blArray[((n5 + 1) * 16 + n4) * 8 + i] || n5 > 0 && blArray[((n5 - 1) * 16 + n4) * 8 + i] || n4 < 15 && blArray[(n5 * 16 + n4 + 1) * 8 + i] || n4 > 0 && blArray[(n5 * 16 + (n4 - 1)) * 8 + i] || i < 7 && blArray[(n5 * 16 + n4) * 8 + i + 1] || i > 0 && blArray[(n5 * 16 + n4) * 8 + (i - 1)]);
                        if (!bl || i >= 4 && random.nextInt(2) == 0 || !qnq.method_d9802b31_Dne(n + n5, n2 + i, n3 + n4).method_7a46289e_Dne()) continue;
                        qnq.method_17d7ea9d_FWm(n + n5, n2 + i, n3 + n4, zKP.field_37e6aed_Dne.field_21260d_FWm, 0, 2);
                    }
                }
            }
        }
        if (zKP.field_8374b848_Dne[this.field_2092ae_Dne].field_368fd23_Dne == KFd.field_1411d34d_div) {
            for (n5 = 0; n5 < 16; ++n5) {
                for (n4 = 0; n4 < 16; ++n4) {
                    int n7 = 4;
                    if (!qnq.method_ebf4c0af_mrb(n + n5, n2 + n7, n3 + n4)) continue;
                    qnq.method_17d7ea9d_FWm(n + n5, n2 + n7, n3 + n4, zKP.field_c4c81e9d_xEx.field_21260d_FWm, 0, 2);
                }
            }
        }
        return true;
    }
}

