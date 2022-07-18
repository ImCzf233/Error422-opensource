package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class vHj
extends hbe {
    private gDn[] field_836bfe96_Dne;
    public static final String[] field_f5e54dca_Dne = new String[]{"oak", "spruce", "birch", "jungle"};
    private static final String[] field_1e416769_FWm = new String[]{"sapling", "sapling_spruce", "sapling_birch", "sapling_jungle"};

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        this.field_836bfe96_Dne = new gDn[field_1e416769_FWm.length];
        for (int i = 0; i < this.field_836bfe96_Dne.length; ++i) {
            this.field_836bfe96_Dne[i] = rbp.method_285881e4_Dne(field_1e416769_FWm[i]);
        }
    }

    public boolean method_d6a0f318_FWm(Qnq qnq, int n, int n2, int n3, int n4) {
        return qnq.method_2c2cf7bc_Dne(n, n2, n3) == this.field_21260d_FWm && (qnq.method_2dee76f_bzF(n, n2, n3) & 3) == n4;
    }

    public void method_a62aa109_bzF(Qnq qnq, int n, int n2, int n3, Random random) {
        int n4 = qnq.method_2dee76f_bzF(n, n2, n3);
        if ((n4 & 8) == 0) {
            qnq.method_d4dc89ed_Dne(n, n2, n3, n4 | 8, 4);
        } else {
            this.method_bd0dd3e3_Qnq(qnq, n, n2, n3, random);
        }
    }

    @Override
    public int method_ce7f5d9c_Dne(int n) {
        return n & 3;
    }

    protected vHj(int n) {
        super(n);
        float f = 0.4f;
        this.method_eb14b51a_Dne(0.5f - f, 0.0f, 0.5f - f, 0.5f + f, f * 2.0f, 0.5f + f);
        this.method_82a88d64_Dne(JcN.field_2022bed6_FWm);
    }

    @Override
    public void method_ca828a1c_Dne(Qnq qnq, int n, int n2, int n3, Random random) {
        if (!qnq.field_2d2a05_aFZ) {
            super.method_ca828a1c_Dne(qnq, n, n2, n3, random);
            if (qnq.method_76d9fc36_aFZ(n, n2 + 1, n3) >= 9 && random.nextInt(7) == 0) {
                this.method_a62aa109_bzF(qnq, n, n2, n3, random);
            }
        }
    }

    public void method_bd0dd3e3_Qnq(Qnq qnq, int n, int n2, int n3, Random random) {
        int n4 = qnq.method_2dee76f_bzF(n, n2, n3) & 3;
        gwq gwq2 = null;
        int n5 = 0;
        int n6 = 0;
        boolean bl = false;
        if (n4 == 1) {
            gwq2 = new yaZ(true);
        } else if (n4 == 2) {
            gwq2 = new tIz(true);
        } else if (n4 == 3) {
            for (n5 = 0; n5 >= -1; --n5) {
                for (n6 = 0; n6 >= -1; --n6) {
                    if (!this.method_d6a0f318_FWm(qnq, n + n5, n2, n3 + n6, 3) || !this.method_d6a0f318_FWm(qnq, n + n5 + 1, n2, n3 + n6, 3) || !this.method_d6a0f318_FWm(qnq, n + n5, n2, n3 + n6 + 1, 3) || !this.method_d6a0f318_FWm(qnq, n + n5 + 1, n2, n3 + n6 + 1, 3)) continue;
                    gwq2 = new TpV(true, 10 + random.nextInt(20), 3, 3);
                    bl = true;
                    break;
                }
                if (gwq2 != null) break;
            }
            if (gwq2 == null) {
                n6 = 0;
                n5 = 0;
                gwq2 = new ghu(true, 4 + random.nextInt(7), 3, 3, false);
            }
        } else {
            gwq2 = new ghu(true);
            if (random.nextInt(10) == 0) {
                gwq2 = new edi(true);
            }
        }
        if (bl) {
            qnq.method_17d7ea9d_FWm(n + n5, n2, n3 + n6, 0, 0, 4);
            qnq.method_17d7ea9d_FWm(n + n5 + 1, n2, n3 + n6, 0, 0, 4);
            qnq.method_17d7ea9d_FWm(n + n5, n2, n3 + n6 + 1, 0, 0, 4);
            qnq.method_17d7ea9d_FWm(n + n5 + 1, n2, n3 + n6 + 1, 0, 0, 4);
        } else {
            qnq.method_17d7ea9d_FWm(n, n2, n3, 0, 0, 4);
        }
        if (!((gwq)gwq2).method_c3e4cb88_Dne(qnq, random, n + n5, n2, n3 + n6)) {
            if (bl) {
                qnq.method_17d7ea9d_FWm(n + n5, n2, n3 + n6, this.field_21260d_FWm, n4, 4);
                qnq.method_17d7ea9d_FWm(n + n5 + 1, n2, n3 + n6, this.field_21260d_FWm, n4, 4);
                qnq.method_17d7ea9d_FWm(n + n5, n2, n3 + n6 + 1, this.field_21260d_FWm, n4, 4);
                qnq.method_17d7ea9d_FWm(n + n5 + 1, n2, n3 + n6 + 1, this.field_21260d_FWm, n4, 4);
            } else {
                qnq.method_17d7ea9d_FWm(n, n2, n3, this.field_21260d_FWm, n4, 4);
            }
        }
    }

    @Override
    public gDn method_9051f17a_Dne(int n, int n2) {
        return this.field_836bfe96_Dne[n2 &= 3];
    }

    @Override
    public void method_d88f4bf4_Dne(int n, JcN jcN, List list) {
        list.add(new NMq(n, 1, 0));
        list.add(new NMq(n, 1, 1));
        list.add(new NMq(n, 1, 2));
        list.add(new NMq(n, 1, 3));
    }
}

