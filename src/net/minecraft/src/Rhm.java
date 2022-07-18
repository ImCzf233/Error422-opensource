package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class Rhm
extends hbe {
    private static final String[] field_f5e54dca_Dne = new String[]{"netherStalk_0", "netherStalk_1", "netherStalk_2"};
    private gDn[] field_836bfe96_Dne;

    @Override
    public gDn method_9051f17a_Dne(int n, int n2) {
        return n2 >= 3 ? this.field_836bfe96_Dne[2] : (n2 > 0 ? this.field_836bfe96_Dne[1] : this.field_836bfe96_Dne[0]);
    }

    @Override
    public boolean method_52f8ce31_a_(Qnq qnq, int n, int n2, int n3) {
        return true;
    }

    @Override
    public int method_24763341_Dne(int n, Random random, int n2) {
        return 0;
    }

    @Override
    public void method_86296256_Dne(Qnq qnq, int n, int n2, int n3, int n4, float f, int n5) {
        if (!qnq.field_2d2a05_aFZ) {
            int n6 = 1;
            if (n4 >= 3) {
                n6 = 2 + qnq.field_7331eae7_Dne.nextInt(3);
                if (n5 > 0) {
                    n6 += qnq.field_7331eae7_Dne.nextInt(n5 + 1);
                }
            }
            for (int i = 0; i < n6; ++i) {
                this.method_c594b700_FWm(qnq, n, n2, n3, new NMq(dEr.field_54eccd1_KkE));
            }
        }
    }

    @Override
    protected boolean method_ce7f5dad_Dne(int n) {
        return true;
    }

    @Override
    public int method_9cb39123_Dne(Qnq qnq, int n, int n2, int n3) {
        return dEr.field_54eccd1_KkE.field_267cf5_Qnq;
    }

    @Override
    public void method_ca828a1c_Dne(Qnq qnq, int n, int n2, int n3, Random random) {
        int n4 = qnq.method_2dee76f_bzF(n, n2, n3);
        if (n4 < 3 && random.nextInt(10) == 0) {
            qnq.method_d4dc89ed_Dne(n, n2, n3, ++n4, 2);
        }
        super.method_ca828a1c_Dne(qnq, n, n2, n3, random);
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        this.field_836bfe96_Dne = new gDn[field_f5e54dca_Dne.length];
        for (int i = 0; i < this.field_836bfe96_Dne.length; ++i) {
            this.field_836bfe96_Dne[i] = rbp.method_285881e4_Dne(field_f5e54dca_Dne[i]);
        }
    }

    @Override
    public int method_7a46288d_Dne() {
        return 6;
    }

    @Override
    public int method_cfc9daf9_Dne(Random random) {
        return 0;
    }

    protected Rhm(int n) {
        super(n);
        this.method_21cbfe2c_Dne(true);
        float f = 0.5f;
        this.method_eb14b51a_Dne(0.5f - f, 0.0f, 0.5f - f, 0.5f + f, 0.25f, 0.5f + f);
        this.method_82a88d64_Dne(null);
    }
}

