package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class dBc
extends gwq {
    private int field_2092ae_Dne;
    private int field_21260d_FWm;

    public dBc(int n, int n2) {
        this.field_2092ae_Dne = n2;
        this.field_21260d_FWm = n;
    }

    @Override
    public boolean method_c3e4cb88_Dne(Qnq qnq, Random random, int n, int n2, int n3) {
        if (qnq.method_d9802b31_Dne(n, n2, n3) != KFd.field_1411d34d_div) {
            return false;
        }
        int n4 = random.nextInt(this.field_21260d_FWm - 2) + 2;
        int n5 = 2;
        for (int i = n - n4; i <= n + n4; ++i) {
            for (int j = n3 - n4; j <= n3 + n4; ++j) {
                int n6 = i - n;
                int n7 = j - n3;
                if (n6 * n6 + n7 * n7 > n4 * n4) continue;
                for (int k = n2 - n5; k <= n2 + n5; ++k) {
                    int n8 = qnq.method_2c2cf7bc_Dne(i, k, j);
                    if (n8 != zKP.field_203836cc_FWm.field_21260d_FWm && n8 != zKP.field_36ff555_Dne.field_21260d_FWm) continue;
                    qnq.method_17d7ea9d_FWm(i, k, j, this.field_2092ae_Dne, 0, 2);
                }
            }
        }
        return true;
    }
}

