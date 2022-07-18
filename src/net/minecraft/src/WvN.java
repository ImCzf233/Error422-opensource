package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class WvN
extends gwq {
    private final int field_2092ae_Dne;
    private final fKu[] field_836ba557_Dne;

    @Override
    public boolean method_c3e4cb88_Dne(Qnq qnq, Random random, int n, int n2, int n3) {
        int n4;
        int n5 = 0;
        while (((n4 = qnq.method_2c2cf7bc_Dne(n, n2, n3)) == 0 || n4 == zKP.field_36e218c_Dne.field_21260d_FWm) && n2 > 1) {
            --n2;
        }
        if (n2 < 1) {
            return false;
        }
        ++n2;
        for (n5 = 0; n5 < 4; ++n5) {
            int n6;
            int n7;
            int n8 = n + random.nextInt(4) - random.nextInt(4);
            if (!qnq.method_2c2cf7cd_Dne(n8, n7 = n2 + random.nextInt(3) - random.nextInt(3), n6 = n3 + random.nextInt(4) - random.nextInt(4)) || !qnq.method_73e9b8f9_IjH(n8, n7 - 1, n6)) continue;
            qnq.method_17d7ea9d_FWm(n8, n7, n6, zKP.field_375bc02_Dne.field_21260d_FWm, 0, 2);
            gon_0 gon_02 = (gon_0)qnq.method_d98e681d_Dne(n8, n7, n6);
            if (gon_02 != null && gon_02 != null) {
                fKu.method_ead777d3_Dne(random, this.field_836ba557_Dne, gon_02, this.field_2092ae_Dne);
            }
            if (qnq.method_2c2cf7cd_Dne(n8 - 1, n7, n6) && qnq.method_73e9b8f9_IjH(n8 - 1, n7 - 1, n6)) {
                qnq.method_17d7ea9d_FWm(n8 - 1, n7, n6, zKP.field_954cd4c3_Wwe.field_21260d_FWm, 0, 2);
            }
            if (qnq.method_2c2cf7cd_Dne(n8 + 1, n7, n6) && qnq.method_73e9b8f9_IjH(n8 - 1, n7 - 1, n6)) {
                qnq.method_17d7ea9d_FWm(n8 + 1, n7, n6, zKP.field_954cd4c3_Wwe.field_21260d_FWm, 0, 2);
            }
            if (qnq.method_2c2cf7cd_Dne(n8, n7, n6 - 1) && qnq.method_73e9b8f9_IjH(n8 - 1, n7 - 1, n6)) {
                qnq.method_17d7ea9d_FWm(n8, n7, n6 - 1, zKP.field_954cd4c3_Wwe.field_21260d_FWm, 0, 2);
            }
            if (qnq.method_2c2cf7cd_Dne(n8, n7, n6 + 1) && qnq.method_73e9b8f9_IjH(n8 - 1, n7 - 1, n6)) {
                qnq.method_17d7ea9d_FWm(n8, n7, n6 + 1, zKP.field_954cd4c3_Wwe.field_21260d_FWm, 0, 2);
            }
            return true;
        }
        return false;
    }

    public WvN(fKu[] fKuArray, int n) {
        this.field_836ba557_Dne = fKuArray;
        this.field_2092ae_Dne = n;
    }
}

