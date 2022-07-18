package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class ScM
extends hbe {
    private final zKP field_799509c9_iTJ;
    private gDn field_375b13b_Dne;

    private float method_3036b9bf_FWm(Qnq qnq, int n, int n2, int n3) {
        float f = 1.0f;
        int n4 = qnq.method_2c2cf7bc_Dne(n, n2, n3 - 1);
        int n5 = qnq.method_2c2cf7bc_Dne(n, n2, n3 + 1);
        int n6 = qnq.method_2c2cf7bc_Dne(n - 1, n2, n3);
        int n7 = qnq.method_2c2cf7bc_Dne(n + 1, n2, n3);
        int n8 = qnq.method_2c2cf7bc_Dne(n - 1, n2, n3 - 1);
        int n9 = qnq.method_2c2cf7bc_Dne(n + 1, n2, n3 - 1);
        int n10 = qnq.method_2c2cf7bc_Dne(n + 1, n2, n3 + 1);
        int n11 = qnq.method_2c2cf7bc_Dne(n - 1, n2, n3 + 1);
        boolean bl = n6 == this.field_21260d_FWm || n7 == this.field_21260d_FWm;
        boolean bl2 = n4 == this.field_21260d_FWm || n5 == this.field_21260d_FWm;
        boolean bl3 = n8 == this.field_21260d_FWm || n9 == this.field_21260d_FWm || n10 == this.field_21260d_FWm || n11 == this.field_21260d_FWm;
        for (int i = n - 1; i <= n + 1; ++i) {
            for (int j = n3 - 1; j <= n3 + 1; ++j) {
                int n12 = qnq.method_2c2cf7bc_Dne(i, n2 - 1, j);
                float f2 = 0.0f;
                if (n12 == zKP.field_778fd823_rPc.field_21260d_FWm) {
                    f2 = 1.0f;
                    if (qnq.method_2dee76f_bzF(i, n2 - 1, j) > 0) {
                        f2 = 3.0f;
                    }
                }
                if (i != n || j != n3) {
                    f2 /= 4.0f;
                }
                f += f2;
            }
        }
        if (bl3 || bl && bl2) {
            f /= 2.0f;
        }
        return f;
    }

    @Override
    public int method_9cb39123_Dne(Qnq qnq, int n, int n2, int n3) {
        return this.field_799509c9_iTJ == zKP.field_32158d62_aJO ? dEr.field_633b7ca6_LDH.field_267cf5_Qnq : (this.field_799509c9_iTJ == zKP.field_27d9ca27_gwq ? dEr.field_4793365a_MUD.field_267cf5_Qnq : 0);
    }

    public gDn method_230f3f9a_Dne() {
        return this.field_375b13b_Dne;
    }

    @Override
    public int method_cfc9daf9_Dne(Random random) {
        return 1;
    }

    protected ScM(int n, zKP zKP2) {
        super(n);
        this.field_799509c9_iTJ = zKP2;
        this.method_21cbfe2c_Dne(true);
        float f = 0.125f;
        this.method_eb14b51a_Dne(0.5f - f, 0.0f, 0.5f - f, 0.5f + f, 0.25f, 0.5f + f);
        this.method_82a88d64_Dne(null);
    }

    @Override
    public void method_ca828a1c_Dne(Qnq qnq, int n, int n2, int n3, Random random) {
        float f;
        super.method_ca828a1c_Dne(qnq, n, n2, n3, random);
        if (qnq.method_76d9fc36_aFZ(n, n2 + 1, n3) >= 9 && random.nextInt((int)(25.0f / (f = this.method_3036b9bf_FWm(qnq, n, n2, n3))) + 1) == 0) {
            int n4 = qnq.method_2dee76f_bzF(n, n2, n3);
            if (n4 < 7) {
                qnq.method_d4dc89ed_Dne(n, n2, n3, ++n4, 2);
            } else {
                if (qnq.method_2c2cf7bc_Dne(n - 1, n2, n3) == this.field_799509c9_iTJ.field_21260d_FWm) {
                    return;
                }
                if (qnq.method_2c2cf7bc_Dne(n + 1, n2, n3) == this.field_799509c9_iTJ.field_21260d_FWm) {
                    return;
                }
                if (qnq.method_2c2cf7bc_Dne(n, n2, n3 - 1) == this.field_799509c9_iTJ.field_21260d_FWm) {
                    return;
                }
                if (qnq.method_2c2cf7bc_Dne(n, n2, n3 + 1) == this.field_799509c9_iTJ.field_21260d_FWm) {
                    return;
                }
                int n5 = random.nextInt(4);
                int n6 = n;
                int n7 = n3;
                if (n5 == 0) {
                    n6 = n - 1;
                }
                if (n5 == 1) {
                    ++n6;
                }
                if (n5 == 2) {
                    n7 = n3 - 1;
                }
                if (n5 == 3) {
                    ++n7;
                }
                int n8 = qnq.method_2c2cf7bc_Dne(n6, n2 - 1, n7);
                if (qnq.method_2c2cf7bc_Dne(n6, n2, n7) == 0 && (n8 == zKP.field_778fd823_rPc.field_21260d_FWm || n8 == zKP.field_203836cc_FWm.field_21260d_FWm || n8 == zKP.field_36ff555_Dne.field_21260d_FWm)) {
                    qnq.method_2ee8c47d_FWm(n6, n2, n7, this.field_799509c9_iTJ.field_21260d_FWm);
                }
            }
        }
    }

    @Override
    protected boolean method_ce7f5dad_Dne(int n) {
        return n == zKP.field_778fd823_rPc.field_21260d_FWm;
    }

    @Override
    public int method_117d19dd_FWm(int n) {
        int n2 = n * 32;
        int n3 = 255 - n * 8;
        int n4 = n * 4;
        return n2 << 16 | n3 << 8 | n4;
    }

    @Override
    public void method_fbabf7ef_Dne(Zpi zpi, int n, int n2, int n3) {
        this.field_2d29ef_aFZ = (float)(zpi.method_2dee76f_bzF(n, n2, n3) * 2 + 2) / 16.0f;
        float f = 0.125f;
        this.method_eb14b51a_Dne(0.5f - f, 0.0f, 0.5f - f, 0.5f + f, (float)this.field_2d29ef_aFZ, 0.5f + f);
    }

    public void method_5452795d_bzF(Qnq qnq, int n, int n2, int n3) {
        int n4 = qnq.method_2dee76f_bzF(n, n2, n3) + geR.method_4cd91d9_Dne(qnq.field_7331eae7_Dne, 2, 5);
        if (n4 > 7) {
            n4 = 7;
        }
        qnq.method_d4dc89ed_Dne(n, n2, n3, n4, 2);
    }

    @Override
    public int method_7a46288d_Dne() {
        return 19;
    }

    @Override
    public void method_86296256_Dne(Qnq qnq, int n, int n2, int n3, int n4, float f, int n5) {
        super.method_86296256_Dne(qnq, n, n2, n3, n4, f, n5);
        if (!qnq.field_2d2a05_aFZ) {
            dEr dEr2 = null;
            if (this.field_799509c9_iTJ == zKP.field_32158d62_aJO) {
                dEr2 = dEr.field_633b7ca6_LDH;
            }
            if (this.field_799509c9_iTJ == zKP.field_27d9ca27_gwq) {
                dEr2 = dEr.field_4793365a_MUD;
            }
            for (int i = 0; i < 3; ++i) {
                if (qnq.field_7331eae7_Dne.nextInt(15) > n4) continue;
                this.method_c594b700_FWm(qnq, n, n2, n3, new NMq(dEr2));
            }
        }
    }

    @Override
    public int method_fbabf7e2_Dne(Zpi zpi, int n, int n2, int n3) {
        return this.method_117d19dd_FWm(zpi.method_2dee76f_bzF(n, n2, n3));
    }

    @Override
    public int method_24763341_Dne(int n, Random random, int n2) {
        return -1;
    }

    public int method_8f2f2081_FWm(Zpi zpi, int n, int n2, int n3) {
        int n4 = zpi.method_2dee76f_bzF(n, n2, n3);
        return n4 < 7 ? -1 : (zpi.method_2c2cf7bc_Dne(n - 1, n2, n3) == this.field_799509c9_iTJ.field_21260d_FWm ? 0 : (zpi.method_2c2cf7bc_Dne(n + 1, n2, n3) == this.field_799509c9_iTJ.field_21260d_FWm ? 1 : (zpi.method_2c2cf7bc_Dne(n, n2, n3 - 1) == this.field_799509c9_iTJ.field_21260d_FWm ? 2 : (zpi.method_2c2cf7bc_Dne(n, n2, n3 + 1) == this.field_799509c9_iTJ.field_21260d_FWm ? 3 : -1))));
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        this.field_5e5f2002_Qnq = rbp.method_285881e4_Dne("stem_straight");
        this.field_375b13b_Dne = rbp.method_285881e4_Dne("stem_bent");
    }

    @Override
    public void method_7a46289a_Dne() {
        float f = 0.125f;
        this.method_eb14b51a_Dne(0.5f - f, 0.0f, 0.5f - f, 0.5f + f, 0.25f, 0.5f + f);
    }
}

