package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class sJS
extends gwq {
    private int field_2092ae_Dne;

    @Override
    public boolean method_c3e4cb88_Dne(Qnq qnq, Random random, int n, int n2, int n3) {
        if (qnq.method_2c2cf7cd_Dne(n, n2, n3) && qnq.method_2c2cf7bc_Dne(n, n2 - 1, n3) == this.field_2092ae_Dne) {
            int n4;
            int n5;
            int n6;
            int n7;
            int n8 = random.nextInt(32) + 6;
            int n9 = random.nextInt(4) + 1;
            for (n7 = n - n9; n7 <= n + n9; ++n7) {
                for (n6 = n3 - n9; n6 <= n3 + n9; ++n6) {
                    n5 = n7 - n;
                    n4 = n6 - n3;
                    if (n5 * n5 + n4 * n4 > n9 * n9 + 1 || qnq.method_2c2cf7bc_Dne(n7, n2 - 1, n6) == this.field_2092ae_Dne) continue;
                    return false;
                }
            }
            for (n7 = n2; n7 < n2 + n8 && n7 < 128; ++n7) {
                for (n6 = n - n9; n6 <= n + n9; ++n6) {
                    for (n5 = n3 - n9; n5 <= n3 + n9; ++n5) {
                        n4 = n6 - n;
                        int n10 = n5 - n3;
                        if (n4 * n4 + n10 * n10 > n9 * n9 + 1) continue;
                        qnq.method_17d7ea9d_FWm(n6, n7, n5, zKP.field_e641c680_cot.field_21260d_FWm, 0, 2);
                    }
                }
            }
            Ndk ndk = new Ndk(qnq);
            ndk.method_9ce0fc65_FWm((float)n + 0.5f, n2 + n8, (float)n3 + 0.5f, random.nextFloat() * 360.0f, 0.0f);
            qnq.method_94d18be5_FWm(ndk);
            qnq.method_17d7ea9d_FWm(n, n2 + n8, n3, zKP.field_f0b029e5_zGp.field_21260d_FWm, 0, 2);
            return true;
        }
        return false;
    }

    public sJS(int n) {
        this.field_2092ae_Dne = n;
    }
}

