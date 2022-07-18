package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class LDH
extends gwq {
    private int field_2092ae_Dne;

    public LDH(int n) {
        this.field_2092ae_Dne = n;
    }

    @Override
    public boolean method_c3e4cb88_Dne(Qnq qnq, Random random, int n, int n2, int n3) {
        for (int i = 0; i < 64; ++i) {
            int n4;
            int n5;
            int n6 = n + random.nextInt(8) - random.nextInt(8);
            if (!qnq.method_2c2cf7cd_Dne(n6, n5 = n2 + random.nextInt(4) - random.nextInt(4), n4 = n3 + random.nextInt(8) - random.nextInt(8)) || qnq.field_3690d00_Dne.field_21261e_FWm && n5 >= 127 || !zKP.field_8374b848_Dne[this.field_2092ae_Dne].method_52f8ce31_a_(qnq, n6, n5, n4)) continue;
            qnq.method_17d7ea9d_FWm(n6, n5, n4, this.field_2092ae_Dne, 0, 2);
        }
        return true;
    }
}

