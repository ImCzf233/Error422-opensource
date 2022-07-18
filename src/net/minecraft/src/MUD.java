package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class MUD
extends gwq {
    private int field_2092ae_Dne;
    private int field_21260d_FWm;

    public MUD(int n, int n2) {
        this.field_21260d_FWm = n;
        this.field_2092ae_Dne = n2;
    }

    @Override
    public boolean method_c3e4cb88_Dne(Qnq qnq, Random random, int n, int n2, int n3) {
        int n4;
        int n5 = 0;
        while (((n4 = qnq.method_2c2cf7bc_Dne(n, n2, n3)) == 0 || n4 == zKP.field_36e218c_Dne.field_21260d_FWm) && n2 > 0) {
            --n2;
        }
        n5 = qnq.method_2c2cf7bc_Dne(n, n2, n3);
        if (n5 == zKP.field_203836cc_FWm.field_21260d_FWm || n5 == zKP.field_36ff555_Dne.field_21260d_FWm) {
            this.method_3e226590_Dne(qnq, n, ++n2, n3, zKP.field_af0f1368_udO.field_21260d_FWm, this.field_21260d_FWm);
            for (int i = n2; i <= n2 + 2; ++i) {
                int n6 = i - n2;
                int n7 = 2 - n6;
                for (int j = n - n7; j <= n + n7; ++j) {
                    int n8 = j - n;
                    for (int k = n3 - n7; k <= n3 + n7; ++k) {
                        int n9 = k - n3;
                        if (Math.abs(n8) == n7 && Math.abs(n9) == n7 && random.nextInt(2) == 0 || zKP.field_4039e1b_FWm[qnq.method_2c2cf7bc_Dne(j, i, k)]) continue;
                        this.method_3e226590_Dne(qnq, j, i, k, zKP.field_36e218c_Dne.field_21260d_FWm, this.field_2092ae_Dne);
                    }
                }
            }
        }
        return true;
    }
}

