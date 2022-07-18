package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class ipf
extends gwq {
    @Override
    public boolean method_c3e4cb88_Dne(Qnq qnq, Random random, int n, int n2, int n3) {
        for (int i = 0; i < 64; ++i) {
            int n4;
            int n5;
            int n6 = n + random.nextInt(8) - random.nextInt(8);
            if (!qnq.method_2c2cf7cd_Dne(n6, n5 = n2 + random.nextInt(4) - random.nextInt(4), n4 = n3 + random.nextInt(8) - random.nextInt(8)) || qnq.method_2c2cf7bc_Dne(n6, n5 - 1, n4) != zKP.field_b3a6b297_KLR.field_21260d_FWm) continue;
            qnq.method_17d7ea9d_FWm(n6, n5, n4, zKP.field_3774324_Dne.field_21260d_FWm, 0, 2);
        }
        return true;
    }
}

