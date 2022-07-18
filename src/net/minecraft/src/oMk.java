package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class oMk
extends zKP {
    private final int field_2092ae_Dne;
    private gDn field_375b13b_Dne;
    private static final String[] field_f5e54dca_Dne = new String[]{"mushroom_skin_brown", "mushroom_skin_red"};
    private gDn field_202f7d1a_FWm;
    private gDn[] field_836bfe96_Dne;

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        this.field_836bfe96_Dne = new gDn[field_f5e54dca_Dne.length];
        for (int i = 0; i < this.field_836bfe96_Dne.length; ++i) {
            this.field_836bfe96_Dne[i] = rbp.method_285881e4_Dne(field_f5e54dca_Dne[i]);
        }
        this.field_202f7d1a_FWm = rbp.method_285881e4_Dne("mushroom_inside");
        this.field_375b13b_Dne = rbp.method_285881e4_Dne("mushroom_skin_stem");
    }

    @Override
    public gDn method_9051f17a_Dne(int n, int n2) {
        return n2 == 10 && n > 1 ? this.field_375b13b_Dne : (n2 >= 1 && n2 <= 9 && n == 1 ? this.field_836bfe96_Dne[this.field_2092ae_Dne] : (n2 >= 1 && n2 <= 3 && n == 2 ? this.field_836bfe96_Dne[this.field_2092ae_Dne] : (n2 >= 7 && n2 <= 9 && n == 3 ? this.field_836bfe96_Dne[this.field_2092ae_Dne] : ((n2 == 1 || n2 == 4 || n2 == 7) && n == 4 ? this.field_836bfe96_Dne[this.field_2092ae_Dne] : ((n2 == 3 || n2 == 6 || n2 == 9) && n == 5 ? this.field_836bfe96_Dne[this.field_2092ae_Dne] : (n2 == 14 ? this.field_836bfe96_Dne[this.field_2092ae_Dne] : (n2 == 15 ? this.field_375b13b_Dne : this.field_202f7d1a_FWm)))))));
    }

    @Override
    public int method_9cb39123_Dne(Qnq qnq, int n, int n2, int n3) {
        return zKP.field_75be630e_bzF.field_21260d_FWm + this.field_2092ae_Dne;
    }

    public oMk(int n, KFd kFd, int n2) {
        super(n, kFd);
        this.field_2092ae_Dne = n2;
    }

    @Override
    public int method_cfc9daf9_Dne(Random random) {
        int n = random.nextInt(10) - 7;
        if (n < 0) {
            n = 0;
        }
        return n;
    }

    @Override
    public int method_24763341_Dne(int n, Random random, int n2) {
        return zKP.field_75be630e_bzF.field_21260d_FWm + this.field_2092ae_Dne;
    }
}

