package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class iXU
extends gwq {
    @Override
    public boolean method_c3e4cb88_Dne(Qnq qnq, Random random, int n, int n2, int n3) {
        for (int i = 0; i < 10; ++i) {
            int n4;
            int n5;
            int n6 = n + random.nextInt(8) - random.nextInt(8);
            if (!qnq.method_2c2cf7cd_Dne(n6, n5 = n2 + random.nextInt(4) - random.nextInt(4), n4 = n3 + random.nextInt(8) - random.nextInt(8))) continue;
            int n7 = 1 + random.nextInt(random.nextInt(3) + 1);
            for (int j = 0; j < n7; ++j) {
                if (!zKP.field_27f261ab_XjO.method_52f8ce31_a_(qnq, n6, n5 + j, n4)) continue;
                qnq.method_17d7ea9d_FWm(n6, n5 + j, n4, zKP.field_27f261ab_XjO.field_21260d_FWm, 0, 2);
            }
        }
        return true;
    }
}

