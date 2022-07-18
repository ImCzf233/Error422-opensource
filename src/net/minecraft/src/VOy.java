package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class VOy
extends nnF {
    public static final String[][] field_3f4f9fe5_Dne;
    private int field_2092ae_Dne;
    private gDn[][] field_23f5c9b_Dne = new gDn[2][];
    int[] field_3f1c589_Dne;
    public static final String[] field_f5e54dca_Dne;

    @Override
    public void method_86296256_Dne(Qnq qnq, int n, int n2, int n3, int n4, float f, int n5) {
        if (!qnq.field_2d2a05_aFZ) {
            int n6 = 20;
            if ((n4 & 3) == 3) {
                n6 = 40;
            }
            if (n5 > 0 && (n6 -= 2 << n5) < 10) {
                n6 = 10;
            }
            if (qnq.field_7331eae7_Dne.nextInt(n6) == 0) {
                int n7 = this.method_24763341_Dne(n4, qnq.field_7331eae7_Dne, n5);
                this.method_c594b700_FWm(qnq, n, n2, n3, new NMq(n7, 1, this.method_ce7f5d9c_Dne(n4)));
            }
            n6 = 200;
            if (n5 > 0 && (n6 -= 10 << n5) < 40) {
                n6 = 40;
            }
            if ((n4 & 3) == 0 && qnq.field_7331eae7_Dne.nextInt(n6) == 0) {
                this.method_c594b700_FWm(qnq, n, n2, n3, new NMq(dEr.field_7137dca1_aFZ, 1, 0));
            }
        }
    }

    @Override
    public int method_ce7f5d9c_Dne(int n) {
        return n & 3;
    }

    private void method_5452795d_bzF(Qnq qnq, int n, int n2, int n3) {
        this.method_fd7de26f_FWm(qnq, n, n2, n3, qnq.method_2dee76f_bzF(n, n2, n3), 0);
        qnq.method_2e7161e6_Qnq(n, n2, n3);
    }

    @Override
    public void method_d88f4bf4_Dne(int n, JcN jcN, List list) {
        list.add(new NMq(n, 1, 0));
        list.add(new NMq(n, 1, 1));
        list.add(new NMq(n, 1, 2));
        list.add(new NMq(n, 1, 3));
    }

    @Override
    public void method_e061540a_Dne(Qnq qnq, FiG fiG, int n, int n2, int n3, int n4) {
        if (!qnq.field_2d2a05_aFZ && fiG.method_22900b26_bzF() != null && fiG.method_22900b26_bzF().field_2e5f1b_bzF == dEr.field_37078f6_Dne.field_267cf5_Qnq) {
            fiG.method_df3461c5_Dne(trP.field_83628b9e_Dne[this.field_21260d_FWm], 1);
            this.method_c594b700_FWm(qnq, n, n2, n3, new NMq(zKP.field_36e218c_Dne.field_21260d_FWm, 1, n4 & 3));
        } else {
            super.method_e061540a_Dne(qnq, fiG, n, n2, n3, n4);
        }
    }

    @Override
    public int method_cfc9daf9_Dne(Random random) {
        return random.nextInt(20) == 0 ? 1 : 0;
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return !this.field_2092bf_Dne;
    }

    public void method_ce7f9d7a_Dne(boolean bl) {
        this.field_2092bf_Dne = bl;
        this.field_2092ae_Dne = bl ? 0 : 1;
    }

    @Override
    protected NMq method_9e6e1a08_Dne(int n) {
        return new NMq(this.field_21260d_FWm, 1, n & 3);
    }

    protected VOy(int n) {
        super(n, KFd.field_74f39001_mrb, false);
        this.method_21cbfe2c_Dne(true);
        this.method_82a88d64_Dne(JcN.field_2022bed6_FWm);
    }

    static {
        field_f5e54dca_Dne = new String[]{"oak", "spruce", "birch", "jungle"};
        field_3f4f9fe5_Dne = new String[][]{{"leaves", "leaves_spruce", "leaves", "leaves_jungle"}, {"leaves_opaque", "leaves_spruce_opaque", "leaves_opaque", "leaves_jungle_opaque"}};
    }

    @Override
    public void method_3e226590_Dne(Qnq qnq, int n, int n2, int n3, int n4, int n5) {
        int n6 = 1;
        int n7 = n6 + 1;
        if (qnq.method_c6b5263e_Dne(n - n7, n2 - n7, n3 - n7, n + n7, n2 + n7, n3 + n7)) {
            for (int i = -n6; i <= n6; ++i) {
                for (int j = -n6; j <= n6; ++j) {
                    for (int k = -n6; k <= n6; ++k) {
                        int n8 = qnq.method_2c2cf7bc_Dne(n + i, n2 + j, n3 + k);
                        if (n8 != zKP.field_36e218c_Dne.field_21260d_FWm) continue;
                        int n9 = qnq.method_2dee76f_bzF(n + i, n2 + j, n3 + k);
                        qnq.method_d4dc89ed_Dne(n + i, n2 + j, n3 + k, n9 | 8, 4);
                    }
                }
            }
        }
    }

    @Override
    public gDn method_9051f17a_Dne(int n, int n2) {
        return (n2 & 3) == 1 ? this.field_23f5c9b_Dne[this.field_2092ae_Dne][1] : ((n2 & 3) == 3 ? this.field_23f5c9b_Dne[this.field_2092ae_Dne][3] : this.field_23f5c9b_Dne[this.field_2092ae_Dne][0]);
    }

    @Override
    public int method_24763341_Dne(int n, Random random, int n2) {
        return zKP.field_7141ef33_aFZ.field_21260d_FWm;
    }

    @Override
    public void method_ff5e68fb_FWm(Qnq qnq, int n, int n2, int n3, Random random) {
        if (qnq.method_f2b15eb2_udO(n, n2 + 1, n3) && !qnq.method_73e9b8f9_IjH(n, n2 - 1, n3) && random.nextInt(15) == 1) {
            double d = (float)n + random.nextFloat();
            double d2 = (double)n2 - 0.05;
            double d3 = (float)n3 + random.nextFloat();
            qnq.method_8600ec24_Dne("dripWater", d, d2, d3, 0.0, 0.0, 0.0);
        }
    }

    @Override
    public int method_590ca0b_b_() {
        double d = 0.5;
        double d2 = 1.0;
        return QFY.method_16a71cd_Dne(d, d2);
    }

    @Override
    public int method_fbabf7e2_Dne(Zpi zpi, int n, int n2, int n3) {
        int n4 = zpi.method_2dee76f_bzF(n, n2, n3);
        if ((n4 & 3) == 1) {
            return QFY.method_7a46288d_Dne();
        }
        if ((n4 & 3) == 2) {
            return QFY.method_7c6f602c_FWm();
        }
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        for (int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                int n8 = zpi.method_90477c37_Dne(n + j, n3 + i).method_907a9d14_Qnq();
                n5 += (n8 & 0xFF0000) >> 16;
                n6 += (n8 & 0xFF00) >> 8;
                n7 += n8 & 0xFF;
            }
        }
        return (n5 / 9 & 0xFF) << 16 | (n6 / 9 & 0xFF) << 8 | n7 / 9 & 0xFF;
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        for (int i = 0; i < field_3f4f9fe5_Dne.length; ++i) {
            this.field_23f5c9b_Dne[i] = new gDn[field_3f4f9fe5_Dne[i].length];
            for (int j = 0; j < field_3f4f9fe5_Dne[i].length; ++j) {
                this.field_23f5c9b_Dne[i][j] = rbp.method_285881e4_Dne(field_3f4f9fe5_Dne[i][j]);
            }
        }
    }

    @Override
    public int method_117d19dd_FWm(int n) {
        return (n & 3) == 1 ? QFY.method_7a46288d_Dne() : ((n & 3) == 2 ? QFY.method_7c6f602c_FWm() : QFY.method_ae128dba_bzF());
    }

    @Override
    public void method_ca828a1c_Dne(Qnq qnq, int n, int n2, int n3, Random random) {
        int n4;
        if (!qnq.field_2d2a05_aFZ && ((n4 = qnq.method_2dee76f_bzF(n, n2, n3)) & 8) != 0 && (n4 & 4) == 0) {
            int n5;
            int n6 = 4;
            int n7 = n6 + 1;
            int n8 = 32;
            int n9 = n8 * n8;
            int n10 = n8 / 2;
            if (this.field_3f1c589_Dne == null) {
                this.field_3f1c589_Dne = new int[n8 * n8 * n8];
            }
            if (qnq.method_c6b5263e_Dne(n - n7, n2 - n7, n3 - n7, n + n7, n2 + n7, n3 + n7)) {
                int n11;
                int n12;
                int n13;
                for (n5 = -n6; n5 <= n6; ++n5) {
                    for (n13 = -n6; n13 <= n6; ++n13) {
                        for (n12 = -n6; n12 <= n6; ++n12) {
                            n11 = qnq.method_2c2cf7bc_Dne(n + n5, n2 + n13, n3 + n12);
                            this.field_3f1c589_Dne[(n5 + n10) * n9 + (n13 + n10) * n8 + n12 + n10] = n11 == zKP.field_af0f1368_udO.field_21260d_FWm ? 0 : (n11 == zKP.field_36e218c_Dne.field_21260d_FWm ? -2 : -1);
                        }
                    }
                }
                for (n5 = 1; n5 <= 4; ++n5) {
                    for (n13 = -n6; n13 <= n6; ++n13) {
                        for (n12 = -n6; n12 <= n6; ++n12) {
                            for (n11 = -n6; n11 <= n6; ++n11) {
                                if (this.field_3f1c589_Dne[(n13 + n10) * n9 + (n12 + n10) * n8 + n11 + n10] != n5 - 1) continue;
                                if (this.field_3f1c589_Dne[(n13 + n10 - 1) * n9 + (n12 + n10) * n8 + n11 + n10] == -2) {
                                    this.field_3f1c589_Dne[(n13 + n10 - 1) * n9 + (n12 + n10) * n8 + n11 + n10] = n5;
                                }
                                if (this.field_3f1c589_Dne[(n13 + n10 + 1) * n9 + (n12 + n10) * n8 + n11 + n10] == -2) {
                                    this.field_3f1c589_Dne[(n13 + n10 + 1) * n9 + (n12 + n10) * n8 + n11 + n10] = n5;
                                }
                                if (this.field_3f1c589_Dne[(n13 + n10) * n9 + (n12 + n10 - 1) * n8 + n11 + n10] == -2) {
                                    this.field_3f1c589_Dne[(n13 + n10) * n9 + (n12 + n10 - 1) * n8 + n11 + n10] = n5;
                                }
                                if (this.field_3f1c589_Dne[(n13 + n10) * n9 + (n12 + n10 + 1) * n8 + n11 + n10] == -2) {
                                    this.field_3f1c589_Dne[(n13 + n10) * n9 + (n12 + n10 + 1) * n8 + n11 + n10] = n5;
                                }
                                if (this.field_3f1c589_Dne[(n13 + n10) * n9 + (n12 + n10) * n8 + (n11 + n10 - 1)] == -2) {
                                    this.field_3f1c589_Dne[(n13 + n10) * n9 + (n12 + n10) * n8 + (n11 + n10 - 1)] = n5;
                                }
                                if (this.field_3f1c589_Dne[(n13 + n10) * n9 + (n12 + n10) * n8 + n11 + n10 + 1] != -2) continue;
                                this.field_3f1c589_Dne[(n13 + n10) * n9 + (n12 + n10) * n8 + n11 + n10 + 1] = n5;
                            }
                        }
                    }
                }
            }
            if ((n5 = this.field_3f1c589_Dne[n10 * n9 + n10 * n8 + n10]) >= 0) {
                qnq.method_d4dc89ed_Dne(n, n2, n3, n4 & 0xFFFFFFF7, 4);
            } else {
                this.method_5452795d_bzF(qnq, n, n2, n3);
            }
        }
    }
}

