package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class wns
extends gwq {
    @Override
    public boolean method_c3e4cb88_Dne(Qnq qnq, Random random, int n, int n2, int n3) {
        int n4 = n;
        int n5 = n3;
        while (n2 < 128) {
            if (qnq.method_2c2cf7cd_Dne(n, n2, n3)) {
                for (int i = 2; i <= 5; ++i) {
                    if (!zKP.field_728b3649_ipf.method_f9bf07d7_Dne(qnq, n, n2, n3, i)) continue;
                    qnq.method_17d7ea9d_FWm(n, n2, n3, zKP.field_728b3649_ipf.field_21260d_FWm, 1 << zxJ.field_4a92422_Qnq[rrP.field_3f1c589_Dne[i]], 2);
                    break;
                }
            } else {
                n = n4 + random.nextInt(4) - random.nextInt(4);
                n3 = n5 + random.nextInt(4) - random.nextInt(4);
            }
            ++n2;
        }
        return true;
    }
}

