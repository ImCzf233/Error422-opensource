package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class EYV
extends gwq {
    @Override
    public boolean method_c3e4cb88_Dne(Qnq qnq, Random random, int n, int n2, int n3) {
        for (int i = 0; i < 20; ++i) {
            int n4 = n + random.nextInt(4) - random.nextInt(4);
            int n5 = n2;
            int n6 = n3 + random.nextInt(4) - random.nextInt(4);
            if (!qnq.method_2c2cf7cd_Dne(n4, n2, n6) || qnq.method_d9802b31_Dne(n4 - 1, n2 - 1, n6) != KFd.field_1411d34d_div && qnq.method_d9802b31_Dne(n4 + 1, n2 - 1, n6) != KFd.field_1411d34d_div && qnq.method_d9802b31_Dne(n4, n2 - 1, n6 - 1) != KFd.field_1411d34d_div && qnq.method_d9802b31_Dne(n4, n2 - 1, n6 + 1) != KFd.field_1411d34d_div) continue;
            int n7 = 2 + random.nextInt(random.nextInt(3) + 1);
            for (int j = 0; j < n7; ++j) {
                if (!zKP.field_4980d038_TKg.method_52f8ce31_a_(qnq, n4, n5 + j, n6)) continue;
                qnq.method_17d7ea9d_FWm(n4, n5 + j, n6, zKP.field_4980d038_TKg.field_21260d_FWm, 0, 2);
            }
        }
        return true;
    }
}

