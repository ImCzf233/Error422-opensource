package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class QkV
extends ESF {
    @Override
    public boolean method_79d378f8_Dne(Zpi zpi, int n, int n2, int n3, int n4) {
        boolean bl;
        if (zpi.method_2c2cf7bc_Dne(n, n2, n3) == this.field_21260d_FWm) {
            return false;
        }
        boolean bl2 = zpi.method_2c2cf7bc_Dne(n - 1, n2, n3) == this.field_21260d_FWm && zpi.method_2c2cf7bc_Dne(n - 2, n2, n3) != this.field_21260d_FWm;
        boolean bl3 = zpi.method_2c2cf7bc_Dne(n + 1, n2, n3) == this.field_21260d_FWm && zpi.method_2c2cf7bc_Dne(n + 2, n2, n3) != this.field_21260d_FWm;
        boolean bl4 = zpi.method_2c2cf7bc_Dne(n, n2, n3 - 1) == this.field_21260d_FWm && zpi.method_2c2cf7bc_Dne(n, n2, n3 - 2) != this.field_21260d_FWm;
        boolean bl5 = zpi.method_2c2cf7bc_Dne(n, n2, n3 + 1) == this.field_21260d_FWm && zpi.method_2c2cf7bc_Dne(n, n2, n3 + 2) != this.field_21260d_FWm;
        boolean bl6 = bl2 || bl3;
        boolean bl7 = bl = bl4 || bl5;
        return bl6 && n4 == 4 ? true : (bl6 && n4 == 5 ? true : (bl && n4 == 2 ? true : bl && n4 == 3));
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return false;
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return false;
    }

    @Override
    public void method_8d285d4a_Dne(Qnq qnq, int n, int n2, int n3, sMa sMa2) {
        if (sMa2.field_203511c4_FWm == null && sMa2.field_37b45e5_Dne == null) {
            sMa2.method_7db29412_Fnk();
        }
    }

    @Override
    public int method_582b28a_a_() {
        return 1;
    }

    @Override
    public void method_f9bf07d3_Dne(Qnq qnq, int n, int n2, int n3, int n4) {
        int n5 = 0;
        int n6 = 1;
        if (qnq.method_2c2cf7bc_Dne(n - 1, n2, n3) == this.field_21260d_FWm || qnq.method_2c2cf7bc_Dne(n + 1, n2, n3) == this.field_21260d_FWm) {
            n5 = 1;
            n6 = 0;
        }
        int n7 = n2;
        while (qnq.method_2c2cf7bc_Dne(n, n7 - 1, n3) == this.field_21260d_FWm) {
            --n7;
        }
        if (qnq.method_2c2cf7bc_Dne(n, n7 - 1, n3) != zKP.field_e641c680_cot.field_21260d_FWm) {
            qnq.method_2e7161e6_Qnq(n, n2, n3);
        } else {
            int n8;
            for (n8 = 1; n8 < 4 && qnq.method_2c2cf7bc_Dne(n, n7 + n8, n3) == this.field_21260d_FWm; ++n8) {
            }
            if (n8 == 3 && qnq.method_2c2cf7bc_Dne(n, n7 + n8, n3) == zKP.field_e641c680_cot.field_21260d_FWm) {
                boolean bl;
                boolean bl2 = qnq.method_2c2cf7bc_Dne(n - 1, n2, n3) == this.field_21260d_FWm || qnq.method_2c2cf7bc_Dne(n + 1, n2, n3) == this.field_21260d_FWm;
                boolean bl3 = bl = qnq.method_2c2cf7bc_Dne(n, n2, n3 - 1) == this.field_21260d_FWm || qnq.method_2c2cf7bc_Dne(n, n2, n3 + 1) == this.field_21260d_FWm;
                if (bl2 && bl) {
                    qnq.method_2e7161e6_Qnq(n, n2, n3);
                } else if (!(qnq.method_2c2cf7bc_Dne(n + n5, n2, n3 + n6) == zKP.field_e641c680_cot.field_21260d_FWm && qnq.method_2c2cf7bc_Dne(n - n5, n2, n3 - n6) == this.field_21260d_FWm || qnq.method_2c2cf7bc_Dne(n - n5, n2, n3 - n6) == zKP.field_e641c680_cot.field_21260d_FWm && qnq.method_2c2cf7bc_Dne(n + n5, n2, n3 + n6) == this.field_21260d_FWm)) {
                    qnq.method_2e7161e6_Qnq(n, n2, n3);
                }
            } else {
                qnq.method_2e7161e6_Qnq(n, n2, n3);
            }
        }
    }

    @Override
    public bSp method_8c85fe2_Dne(Qnq qnq, int n, int n2, int n3) {
        return null;
    }

    @Override
    public void method_fbabf7ef_Dne(Zpi zpi, int n, int n2, int n3) {
        if (zpi.method_2c2cf7bc_Dne(n - 1, n2, n3) != this.field_21260d_FWm && zpi.method_2c2cf7bc_Dne(n + 1, n2, n3) != this.field_21260d_FWm) {
            float f = 0.125f;
            float f2 = 0.5f;
            this.method_eb14b51a_Dne(0.5f - f, 0.0f, 0.5f - f2, 0.5f + f, 1.0f, 0.5f + f2);
        } else {
            float f = 0.5f;
            float f3 = 0.125f;
            this.method_eb14b51a_Dne(0.5f - f, 0.0f, 0.5f - f3, 0.5f + f, 1.0f, 0.5f + f3);
        }
    }

    @Override
    public int method_cfc9daf9_Dne(Random random) {
        return 0;
    }

    @Override
    public void method_ff5e68fb_FWm(Qnq qnq, int n, int n2, int n3, Random random) {
        if (random.nextInt(100) == 0) {
            qnq.method_62d7c9a6_Dne((double)n + 0.5, (double)n2 + 0.5, (double)n3 + 0.5, "portal.portal", 0.5f, random.nextFloat() * 0.4f + 0.8f, false);
        }
        for (int i = 0; i < 4; ++i) {
            double d = (float)n + random.nextFloat();
            double d2 = (float)n2 + random.nextFloat();
            double d3 = (float)n3 + random.nextFloat();
            double d4 = 0.0;
            double d5 = 0.0;
            double d6 = 0.0;
            int n4 = random.nextInt(2) * 2 - 1;
            d4 = ((double)random.nextFloat() - 0.5) * 0.5;
            d5 = ((double)random.nextFloat() - 0.5) * 0.5;
            d6 = ((double)random.nextFloat() - 0.5) * 0.5;
            if (qnq.method_2c2cf7bc_Dne(n - 1, n2, n3) != this.field_21260d_FWm && qnq.method_2c2cf7bc_Dne(n + 1, n2, n3) != this.field_21260d_FWm) {
                d = (double)n + 0.5 + 0.25 * (double)n4;
                d4 = random.nextFloat() * 2.0f * (float)n4;
            } else {
                d3 = (double)n3 + 0.5 + 0.25 * (double)n4;
                d6 = random.nextFloat() * 2.0f * (float)n4;
            }
            qnq.method_8600ec24_Dne("portal", d, d2, d3, d4, d5, d6);
        }
    }

    @Override
    public int method_9cb39123_Dne(Qnq qnq, int n, int n2, int n3) {
        return 0;
    }

    public QkV(int n) {
        super(n, "portal", KFd.field_7ec16ee_tgc, false);
        this.method_21cbfe2c_Dne(true);
    }

    public boolean method_54527961_bzF(Qnq qnq, int n, int n2, int n3) {
        int n4;
        int n5;
        int n6 = 0;
        int n7 = 0;
        if (qnq.method_2c2cf7bc_Dne(n - 1, n2, n3) == zKP.field_e641c680_cot.field_21260d_FWm || qnq.method_2c2cf7bc_Dne(n + 1, n2, n3) == zKP.field_e641c680_cot.field_21260d_FWm) {
            n6 = 1;
        }
        if (qnq.method_2c2cf7bc_Dne(n, n2, n3 - 1) == zKP.field_e641c680_cot.field_21260d_FWm || qnq.method_2c2cf7bc_Dne(n, n2, n3 + 1) == zKP.field_e641c680_cot.field_21260d_FWm) {
            n7 = 1;
        }
        if (n6 == n7) {
            return false;
        }
        if (qnq.method_2c2cf7bc_Dne(n - n6, n2, n3 - n7) == 0) {
            n -= n6;
            n3 -= n7;
        }
        for (n5 = -1; n5 <= 2; ++n5) {
            for (n4 = -1; n4 <= 3; ++n4) {
                boolean bl;
                boolean bl2 = bl = n5 == -1 || n5 == 2 || n4 == -1 || n4 == 3;
                if ((n5 == -1 || n5 == 2) && (n4 == -1 || n4 == 3)) continue;
                int n8 = qnq.method_2c2cf7bc_Dne(n + n6 * n5, n2 + n4, n3 + n7 * n5);
                if (!(bl ? n8 != zKP.field_e641c680_cot.field_21260d_FWm : n8 != 0 && n8 != zKP.field_3774324_Dne.field_21260d_FWm)) continue;
                return false;
            }
        }
        for (n5 = 0; n5 < 2; ++n5) {
            for (n4 = 0; n4 < 3; ++n4) {
                qnq.method_17d7ea9d_FWm(n + n6 * n5, n2 + n4, n3 + n7 * n5, zKP.field_36c4090_Dne.field_21260d_FWm, 0, 2);
            }
        }
        return true;
    }

    @Override
    public void method_ca828a1c_Dne(Qnq qnq, int n, int n2, int n3, Random random) {
        super.method_ca828a1c_Dne(qnq, n, n2, n3, random);
        if (qnq.field_3690d00_Dne.method_7a46289e_Dne() && random.nextInt(2000) < qnq.field_2d29f4_aFZ) {
            sMa sMa2;
            int n4;
            for (n4 = n2; !qnq.method_73e9b8f9_IjH(n, n4, n3) && n4 > 0; --n4) {
            }
            if (n4 > 0 && !qnq.method_6fdef3c4_DyG(n, n4 + 1, n3) && (sMa2 = bes_0.method_7aee3b58_Dne(qnq, 57, (double)n + 0.5, (double)n4 + 1.1, (double)n3 + 0.5)) != null) {
                sMa2.field_342264_ooe = sMa2.method_7ad387f6_DyG();
            }
        }
    }
}

