package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class Sdr
extends gwq {
    private int field_2092ae_Dne;

    @Override
    public boolean method_c3e4cb88_Dne(Qnq qnq, Random random, int n, int n2, int n3) {
        int n4;
        int n5 = 0;
        while (((n4 = qnq.method_2c2cf7bc_Dne(n, n2, n3)) == 0 || n4 == zKP.field_36e218c_Dne.field_21260d_FWm) && n2 > 0) {
            --n2;
        }
        for (n5 = 0; n5 < 4; ++n5) {
            int n6;
            int n7;
            int n8 = n + random.nextInt(8) - random.nextInt(8);
            if (!qnq.method_2c2cf7cd_Dne(n8, n7 = n2 + random.nextInt(4) - random.nextInt(4), n6 = n3 + random.nextInt(8) - random.nextInt(8)) || !zKP.field_8374b848_Dne[this.field_2092ae_Dne].method_52f8ce31_a_(qnq, n8, n7, n6)) continue;
            qnq.method_17d7ea9d_FWm(n8, n7, n6, this.field_2092ae_Dne, 0, 2);
        }
        return true;
    }

    public Sdr(int n) {
        this.field_2092ae_Dne = n;
    }
}

