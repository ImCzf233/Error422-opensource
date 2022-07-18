package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class Lab
extends gwq {
    @Override
    public boolean method_c3e4cb88_Dne(Qnq qnq, Random random, int n, int n2, int n3) {
        int n4;
        int n5;
        while (qnq.method_2c2cf7cd_Dne(n, n2, n3) && n2 > 2) {
            --n2;
        }
        int n6 = qnq.method_2c2cf7bc_Dne(n, n2, n3);
        if (n6 != zKP.field_5ced441_IjH.field_21260d_FWm) {
            return false;
        }
        for (n5 = -2; n5 <= 2; ++n5) {
            for (n4 = -2; n4 <= 2; ++n4) {
                if (!qnq.method_2c2cf7cd_Dne(n + n5, n2 - 1, n3 + n4) || !qnq.method_2c2cf7cd_Dne(n + n5, n2 - 2, n3 + n4)) continue;
                return false;
            }
        }
        for (n5 = -1; n5 <= 0; ++n5) {
            for (n4 = -2; n4 <= 2; ++n4) {
                for (int i = -2; i <= 2; ++i) {
                    qnq.method_17d7ea9d_FWm(n + n4, n2 + n5, n3 + i, zKP.field_850fb0c5_ceE.field_21260d_FWm, 0, 2);
                }
            }
        }
        qnq.method_17d7ea9d_FWm(n, n2, n3, zKP.field_374330f_Dne.field_21260d_FWm, 0, 2);
        qnq.method_17d7ea9d_FWm(n - 1, n2, n3, zKP.field_374330f_Dne.field_21260d_FWm, 0, 2);
        qnq.method_17d7ea9d_FWm(n + 1, n2, n3, zKP.field_374330f_Dne.field_21260d_FWm, 0, 2);
        qnq.method_17d7ea9d_FWm(n, n2, n3 - 1, zKP.field_374330f_Dne.field_21260d_FWm, 0, 2);
        qnq.method_17d7ea9d_FWm(n, n2, n3 + 1, zKP.field_374330f_Dne.field_21260d_FWm, 0, 2);
        for (n5 = -2; n5 <= 2; ++n5) {
            for (n4 = -2; n4 <= 2; ++n4) {
                if (n5 != -2 && n5 != 2 && n4 != -2 && n4 != 2) continue;
                qnq.method_17d7ea9d_FWm(n + n5, n2 + 1, n3 + n4, zKP.field_850fb0c5_ceE.field_21260d_FWm, 0, 2);
            }
        }
        qnq.method_17d7ea9d_FWm(n + 2, n2 + 1, n3, zKP.field_202e4261_FWm.field_21260d_FWm, 1, 2);
        qnq.method_17d7ea9d_FWm(n - 2, n2 + 1, n3, zKP.field_202e4261_FWm.field_21260d_FWm, 1, 2);
        qnq.method_17d7ea9d_FWm(n, n2 + 1, n3 + 2, zKP.field_202e4261_FWm.field_21260d_FWm, 1, 2);
        qnq.method_17d7ea9d_FWm(n, n2 + 1, n3 - 2, zKP.field_202e4261_FWm.field_21260d_FWm, 1, 2);
        for (n5 = -1; n5 <= 1; ++n5) {
            for (n4 = -1; n4 <= 1; ++n4) {
                if (n5 == 0 && n4 == 0) {
                    qnq.method_17d7ea9d_FWm(n + n5, n2 + 4, n3 + n4, zKP.field_850fb0c5_ceE.field_21260d_FWm, 0, 2);
                    continue;
                }
                qnq.method_17d7ea9d_FWm(n + n5, n2 + 4, n3 + n4, zKP.field_202e4261_FWm.field_21260d_FWm, 1, 2);
            }
        }
        for (n5 = 1; n5 <= 3; ++n5) {
            qnq.method_17d7ea9d_FWm(n - 1, n2 + n5, n3 - 1, zKP.field_850fb0c5_ceE.field_21260d_FWm, 0, 2);
            qnq.method_17d7ea9d_FWm(n - 1, n2 + n5, n3 + 1, zKP.field_850fb0c5_ceE.field_21260d_FWm, 0, 2);
            qnq.method_17d7ea9d_FWm(n + 1, n2 + n5, n3 - 1, zKP.field_850fb0c5_ceE.field_21260d_FWm, 0, 2);
            qnq.method_17d7ea9d_FWm(n + 1, n2 + n5, n3 + 1, zKP.field_850fb0c5_ceE.field_21260d_FWm, 0, 2);
        }
        return true;
    }
}

