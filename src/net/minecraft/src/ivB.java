package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class ivB
extends gwq {
    private String method_4c6cc65a_Dne(Random random) {
        int n = random.nextInt(4);
        return n == 0 ? "Skeleton" : (n == 1 ? "Zombie" : (n == 2 ? "Zombie" : (n == 3 ? "Spider" : "")));
    }

    @Override
    public boolean method_c3e4cb88_Dne(Qnq qnq, Random random, int n, int n2, int n3) {
        int n4;
        int n5;
        int n6;
        int n7 = 3;
        int n8 = random.nextInt(2) + 2;
        int n9 = random.nextInt(2) + 2;
        int n10 = 0;
        for (n6 = n - n8 - 1; n6 <= n + n8 + 1; ++n6) {
            for (n5 = n2 - 1; n5 <= n2 + n7 + 1; ++n5) {
                for (n4 = n3 - n9 - 1; n4 <= n3 + n9 + 1; ++n4) {
                    KFd kFd = qnq.method_d9802b31_Dne(n6, n5, n4);
                    if (n5 == n2 - 1 && !kFd.method_7a46289e_Dne()) {
                        return false;
                    }
                    if (n5 == n2 + n7 + 1 && !kFd.method_7a46289e_Dne()) {
                        return false;
                    }
                    if (n6 != n - n8 - 1 && n6 != n + n8 + 1 && n4 != n3 - n9 - 1 && n4 != n3 + n9 + 1 || n5 != n2 || !qnq.method_2c2cf7cd_Dne(n6, n5, n4) || !qnq.method_2c2cf7cd_Dne(n6, n5 + 1, n4)) continue;
                    ++n10;
                }
            }
        }
        if (n10 >= 1 && n10 <= 5) {
            for (n6 = n - n8 - 1; n6 <= n + n8 + 1; ++n6) {
                for (n5 = n2 + n7; n5 >= n2 - 1; --n5) {
                    for (n4 = n3 - n9 - 1; n4 <= n3 + n9 + 1; ++n4) {
                        if (n6 != n - n8 - 1 && n5 != n2 - 1 && n4 != n3 - n9 - 1 && n6 != n + n8 + 1 && n5 != n2 + n7 + 1 && n4 != n3 + n9 + 1) {
                            qnq.method_2e7161e6_Qnq(n6, n5, n4);
                            continue;
                        }
                        if (n5 >= 0 && !qnq.method_d9802b31_Dne(n6, n5 - 1, n4).method_7a46289e_Dne()) {
                            qnq.method_2e7161e6_Qnq(n6, n5, n4);
                            continue;
                        }
                        if (!qnq.method_d9802b31_Dne(n6, n5, n4).method_7a46289e_Dne()) continue;
                        if (n5 == n2 - 1 && random.nextInt(4) != 0) {
                            qnq.method_17d7ea9d_FWm(n6, n5, n4, zKP.field_d744d6c2_yMz.field_21260d_FWm, 0, 2);
                            continue;
                        }
                        qnq.method_17d7ea9d_FWm(n6, n5, n4, zKP.field_75c638da_bzF.field_21260d_FWm, 0, 2);
                    }
                }
            }
            block6: for (n6 = 0; n6 < 2; ++n6) {
                for (n5 = 0; n5 < 3; ++n5) {
                    int n11;
                    n4 = n + random.nextInt(n8 * 2 + 1) - n8;
                    if (!qnq.method_2c2cf7cd_Dne(n4, n2, n11 = n3 + random.nextInt(n9 * 2 + 1) - n9)) continue;
                    int n12 = 0;
                    if (qnq.method_d9802b31_Dne(n4 - 1, n2, n11).method_7a46289e_Dne()) {
                        ++n12;
                    }
                    if (qnq.method_d9802b31_Dne(n4 + 1, n2, n11).method_7a46289e_Dne()) {
                        ++n12;
                    }
                    if (qnq.method_d9802b31_Dne(n4, n2, n11 - 1).method_7a46289e_Dne()) {
                        ++n12;
                    }
                    if (qnq.method_d9802b31_Dne(n4, n2, n11 + 1).method_7a46289e_Dne()) {
                        ++n12;
                    }
                    if (n12 != 1) continue;
                    qnq.method_17d7ea9d_FWm(n4, n2, n11, zKP.field_375bc02_Dne.field_21260d_FWm, 0, 2);
                    gon_0 gon_02 = (gon_0)qnq.method_d98e681d_Dne(n4, n2, n11);
                    if (gon_02 == null) continue block6;
                    for (int i = 0; i < 8; ++i) {
                        NMq nMq = this.method_d150a0e5_Dne(random);
                        if (nMq == null) continue;
                        gon_02.method_6e3a6b66_Dne(random.nextInt(gon_02.method_907a9d14_Qnq()), nMq);
                    }
                    continue block6;
                }
            }
            qnq.method_17d7ea9d_FWm(n, n2, n3, zKP.field_fdf84104_eJi.field_21260d_FWm, 0, 2);
            ySb ySb2 = (ySb)qnq.method_d98e681d_Dne(n, n2, n3);
            if (ySb2 != null) {
                ySb2.method_2304785c_Dne().method_8f501fe4_Dne(this.method_4c6cc65a_Dne(random));
            } else {
                System.err.println("Failed to fetch mob spawner entity at (" + n + ", " + n2 + ", " + n3 + ")");
            }
            return true;
        }
        return false;
    }

    private NMq method_d150a0e5_Dne(Random random) {
        int n = random.nextInt(12);
        return n == 0 ? new NMq(dEr.field_9372b110_YHU) : (n == 1 ? new NMq(dEr.field_5c4c1af_IjH, random.nextInt(4) + 1) : (n == 2 ? new NMq(dEr.field_7785c591_rPc) : (n == 3 ? new NMq(dEr.field_ce7bf76e_EWz, random.nextInt(4) + 1) : (n == 4 ? new NMq(dEr.field_e637b3ee_cot, random.nextInt(4) + 1) : (n == 5 ? new NMq(dEr.field_249ef7b6_AgF, random.nextInt(4) + 1) : (n == 6 ? new NMq(dEr.field_5ac2e6dc_qMV) : (n == 7 && random.nextInt(100) == 0 ? new NMq(dEr.field_f97945f_ZfC) : (n == 8 && random.nextInt(2) == 0 ? new NMq(dEr.field_59c23676_exS, random.nextInt(4) + 1) : (n == 9 && random.nextInt(10) == 0 ? new NMq(dEr.field_836aa5b6_Dne[dEr.field_798af737_iTJ.field_267cf5_Qnq + random.nextInt(2)]) : (n == 10 ? new NMq(dEr.field_5d50330c_edi, 1, 3) : (n == 11 ? dEr.field_374f605_Dne.method_d150a0e5_Dne(random) : null)))))))))));
    }
}

