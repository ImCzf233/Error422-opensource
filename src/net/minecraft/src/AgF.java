package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class AgF
extends OdI {
    private gwq field_376710b_Dne;

    @Override
    public void method_37de135f_Dne(Qnq qnq, Random random, int n, int n2) {
        int n3;
        int n4;
        int n5;
        super.method_37de135f_Dne(qnq, random, n, n2);
        int n6 = 3 + random.nextInt(6);
        for (n5 = 0; n5 < n6; ++n5) {
            int n7;
            n4 = n + random.nextInt(16);
            int n8 = qnq.method_2c2cf7bc_Dne(n4, n3 = random.nextInt(28) + 4, n7 = n2 + random.nextInt(16));
            if (n8 != zKP.field_37e6aed_Dne.field_21260d_FWm) continue;
            qnq.method_17d7ea9d_FWm(n4, n3, n7, zKP.field_152fb3d4_ghu.field_21260d_FWm, 0, 2);
        }
        for (n6 = 0; n6 < 7; ++n6) {
            n5 = n + random.nextInt(16);
            n4 = random.nextInt(64);
            n3 = n2 + random.nextInt(16);
            this.field_376710b_Dne.method_c3e4cb88_Dne(qnq, random, n5, n4, n3);
        }
    }

    protected AgF(int n) {
        super(n);
        this.field_376710b_Dne = new uzC(zKP.field_fc460963_tIz.field_21260d_FWm, 8);
    }
}

