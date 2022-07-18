package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class Tkf
extends zKP {
    public static final String[] field_1e416769_FWm;
    public static final String[] field_f5e54dca_Dne;
    private gDn[] field_836bfe96_Dne;
    private gDn field_375b13b_Dne;

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        this.field_375b13b_Dne = rbp.method_285881e4_Dne("tree_top");
        this.field_836bfe96_Dne = new gDn[field_1e416769_FWm.length];
        for (int i = 0; i < this.field_836bfe96_Dne.length; ++i) {
            this.field_836bfe96_Dne[i] = rbp.method_285881e4_Dne(field_1e416769_FWm[i]);
        }
    }

    @Override
    public void method_3e226590_Dne(Qnq qnq, int n, int n2, int n3, int n4, int n5) {
        int n6 = 4;
        int n7 = n6 + 1;
        if (qnq.method_c6b5263e_Dne(n - n7, n2 - n7, n3 - n7, n + n7, n2 + n7, n3 + n7)) {
            for (int i = -n6; i <= n6; ++i) {
                for (int j = -n6; j <= n6; ++j) {
                    for (int k = -n6; k <= n6; ++k) {
                        int n8;
                        int n9 = qnq.method_2c2cf7bc_Dne(n + i, n2 + j, n3 + k);
                        if (n9 != zKP.field_36e218c_Dne.field_21260d_FWm || ((n8 = qnq.method_2dee76f_bzF(n + i, n2 + j, n3 + k)) & 8) != 0) continue;
                        qnq.method_d4dc89ed_Dne(n + i, n2 + j, n3 + k, n8 | 8, 4);
                    }
                }
            }
        }
    }

    @Override
    public int method_24763341_Dne(int n, Random random, int n2) {
        return zKP.field_af0f1368_udO.field_21260d_FWm;
    }

    @Override
    protected NMq method_9e6e1a08_Dne(int n) {
        return new NMq(this.field_21260d_FWm, 1, Tkf.method_143f9e0f_bzF(n));
    }

    @Override
    public int method_7a46288d_Dne() {
        return 31;
    }

    static {
        field_f5e54dca_Dne = new String[]{"oak", "spruce", "birch", "jungle"};
        field_1e416769_FWm = new String[]{"tree_side", "tree_spruce", "tree_birch", "tree_jungle"};
    }

    @Override
    public void method_d88f4bf4_Dne(int n, JcN jcN, List list) {
        list.add(new NMq(n, 1, 0));
        list.add(new NMq(n, 1, 1));
        list.add(new NMq(n, 1, 2));
        list.add(new NMq(n, 1, 3));
    }

    @Override
    public gDn method_9051f17a_Dne(int n, int n2) {
        int n3 = n2 & 0xC;
        int n4 = n2 & 3;
        return n3 == 0 && (n == 1 || n == 0) ? this.field_375b13b_Dne : (n3 == 4 && (n == 5 || n == 4) ? this.field_375b13b_Dne : (n3 == 8 && (n == 2 || n == 3) ? this.field_375b13b_Dne : this.field_836bfe96_Dne[n4]));
    }

    @Override
    public int method_a13ce189_Dne(Qnq qnq, int n, int n2, int n3, int n4, float f, float f2, float f3, int n5) {
        int n6 = n5 & 3;
        int n7 = 0;
        switch (n4) {
            case 0: 
            case 1: {
                n7 = 0;
                break;
            }
            case 2: 
            case 3: {
                n7 = 8;
                break;
            }
            case 4: 
            case 5: {
                n7 = 4;
            }
        }
        return n6 | n7;
    }

    protected Tkf(int n) {
        super(n, KFd.field_5e526bea_Qnq);
        this.method_82a88d64_Dne(JcN.field_368f2f7_Dne);
    }

    public static int method_143f9e0f_bzF(int n) {
        return n & 3;
    }

    @Override
    public int method_cfc9daf9_Dne(Random random) {
        return 1;
    }

    @Override
    public int method_ce7f5d9c_Dne(int n) {
        return n & 3;
    }
}

