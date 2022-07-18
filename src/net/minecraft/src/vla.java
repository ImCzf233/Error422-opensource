package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class vla
extends zKP {
    private final zKP field_799509c9_iTJ;
    private boolean field_2092bf_Dne = false;
    private static final int[][] field_7a46ee0e_Dne = new int[][]{{2, 6}, {3, 7}, {2, 3}, {6, 7}, {0, 4}, {1, 5}, {0, 1}, {4, 5}};
    private final int field_2092ae_Dne;
    private int field_2e5f1b_bzF = 0;

    public static boolean method_ce7f5dad_Dne(int n) {
        return n > 0 && zKP.field_8374b848_Dne[n] instanceof vla;
    }

    @Override
    public bSp method_5f382101_FWm(Qnq qnq, int n, int n2, int n3) {
        return this.field_799509c9_iTJ.method_5f382101_FWm(qnq, n, n2, n3);
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
    }

    @Override
    public boolean method_7ad38807_DyG() {
        return this.field_799509c9_iTJ.method_7ad38807_DyG();
    }

    protected vla(int n, zKP zKP2, int n2) {
        super(n, zKP2.field_368fd23_Dne);
        this.field_799509c9_iTJ = zKP2;
        this.field_2092ae_Dne = n2;
        this.method_f1c42c0b_bzF(zKP2.field_2092ab_Dne);
        this.method_d92310d9_FWm(zKP2.field_21260a_FWm / 3.0f);
        this.method_2792b805_Dne(zKP2.field_a21c1bc0_kGO);
        this.method_9e820edb_Dne(255);
        this.method_82a88d64_Dne(JcN.field_368f2f7_Dne);
    }

    @Override
    public void method_41dd09cd_Dne(Qnq qnq, int n, int n2, int n3, FiG fiG) {
        this.field_799509c9_iTJ.method_41dd09cd_Dne(qnq, n, n2, n3, fiG);
    }

    @Override
    public void method_fbabf7ef_Dne(Zpi zpi, int n, int n2, int n3) {
        if (this.field_2092bf_Dne) {
            this.method_eb14b51a_Dne(0.5f * (float)(this.field_2e5f1b_bzF % 2), 0.5f * (float)(this.field_2e5f1b_bzF / 2 % 2), 0.5f * (float)(this.field_2e5f1b_bzF / 4 % 2), 0.5f + 0.5f * (float)(this.field_2e5f1b_bzF % 2), 0.5f + 0.5f * (float)(this.field_2e5f1b_bzF / 2 % 2), 0.5f + 0.5f * (float)(this.field_2e5f1b_bzF / 4 % 2));
        } else {
            this.method_eb14b51a_Dne(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        }
    }

    @Override
    public void method_f4575f0e_Dne(Qnq qnq, int n, int n2, int n3, sMa sMa2, chN chN2) {
        this.field_799509c9_iTJ.method_f4575f0e_Dne(qnq, n, n2, n3, sMa2, chN2);
    }

    private boolean method_b611966b_bzF(Zpi zpi, int n, int n2, int n3, int n4) {
        int n5 = zpi.method_2c2cf7bc_Dne(n, n2, n3);
        return vla.method_ce7f5dad_Dne(n5) && zpi.method_2dee76f_bzF(n, n2, n3) == n4;
    }

    @Override
    public int method_83516086_Dne(Qnq qnq) {
        return this.field_799509c9_iTJ.method_83516086_Dne(qnq);
    }

    @Override
    public float method_bb7dd810_Dne(sMa sMa2) {
        return this.field_799509c9_iTJ.method_bb7dd810_Dne(sMa2);
    }

    @Override
    public float method_fbabf7df_Dne(Zpi zpi, int n, int n2, int n3) {
        return this.field_799509c9_iTJ.method_fbabf7df_Dne(zpi, n, n2, n3);
    }

    @Override
    public int method_b34ae00f_bzF(Zpi zpi, int n, int n2, int n3) {
        return this.field_799509c9_iTJ.method_b34ae00f_bzF(zpi, n, n2, n3);
    }

    @Override
    public int method_a13ce189_Dne(Qnq qnq, int n, int n2, int n3, int n4, float f, float f2, float f3, int n5) {
        return n4 != 0 && (n4 == 1 || (double)f2 <= 0.5) ? n5 : n5 | 4;
    }

    @Override
    public void method_35fd2546_bzF(Qnq qnq, int n, int n2, int n3, int n4) {
        this.field_799509c9_iTJ.method_35fd2546_bzF(qnq, n, n2, n3, n4);
    }

    @Override
    public void method_97c143fa_Dne(Qnq qnq, int n, int n2, int n3, yTR yTR2) {
        this.field_799509c9_iTJ.method_97c143fa_Dne(qnq, n, n2, n3, yTR2);
    }

    @Override
    public void method_3e226590_Dne(Qnq qnq, int n, int n2, int n3, int n4, int n5) {
        this.field_799509c9_iTJ.method_3e226590_Dne(qnq, n, n2, n3, n4, n5);
    }

    @Override
    public boolean method_16d0a4f_Dne(int n, boolean bl) {
        return this.field_799509c9_iTJ.method_16d0a4f_Dne(n, bl);
    }

    @Override
    public wHH method_acf3908a_Dne(Qnq qnq, int n, int n2, int n3, chN chN2, chN chN3) {
        int n4;
        int n5;
        int n6;
        wHH[] wHHArray = new wHH[8];
        int n7 = qnq.method_2dee76f_bzF(n, n2, n3);
        int n8 = n7 & 3;
        boolean bl = (n7 & 4) == 4;
        int[] nArray = field_7a46ee0e_Dne[n8 + (bl ? 4 : 0)];
        this.field_2092bf_Dne = true;
        for (int i = 0; i < 8; ++i) {
            this.field_2e5f1b_bzF = i;
            int[] nArray2 = nArray;
            n6 = nArray.length;
            for (n5 = 0; n5 < n6; ++n5) {
                n4 = nArray2[n5];
                if (n4 != i) continue;
            }
            wHHArray[i] = super.method_acf3908a_Dne(qnq, n, n2, n3, chN2, chN3);
        }
        int[] nArray3 = nArray;
        int n9 = nArray.length;
        for (n6 = 0; n6 < n9; ++n6) {
            n5 = nArray3[n6];
            wHHArray[n5] = null;
        }
        wHH wHH2 = null;
        double d = 0.0;
        wHH[] wHHArray2 = wHHArray;
        n4 = wHHArray.length;
        for (int i = 0; i < n4; ++i) {
            double d2;
            wHH wHH3 = wHHArray2[i];
            if (wHH3 == null || !((d2 = wHH3.field_3746303_Dne.method_9398f49f_bzF(chN3)) > d)) continue;
            wHH2 = wHH3;
            d = d2;
        }
        return wHH2;
    }

    public boolean method_b34ae020_bzF(Zpi zpi, int n, int n2, int n3) {
        int n4 = zpi.method_2dee76f_bzF(n, n2, n3);
        int n5 = n4 & 3;
        float f = 0.5f;
        float f2 = 1.0f;
        if ((n4 & 4) != 0) {
            f = 0.0f;
            f2 = 0.5f;
        }
        float f3 = 0.0f;
        float f4 = 0.5f;
        float f5 = 0.5f;
        float f6 = 1.0f;
        boolean bl = false;
        if (n5 == 0) {
            int n6 = zpi.method_2c2cf7bc_Dne(n - 1, n2, n3);
            int n7 = zpi.method_2dee76f_bzF(n - 1, n2, n3);
            if (vla.method_ce7f5dad_Dne(n6) && (n4 & 4) == (n7 & 4)) {
                int n8 = n7 & 3;
                if (n8 == 3 && !this.method_b611966b_bzF(zpi, n, n2, n3 - 1, n4)) {
                    f5 = 0.0f;
                    f6 = 0.5f;
                    bl = true;
                } else if (n8 == 2 && !this.method_b611966b_bzF(zpi, n, n2, n3 + 1, n4)) {
                    f5 = 0.5f;
                    f6 = 1.0f;
                    bl = true;
                }
            }
        } else if (n5 == 1) {
            int n9 = zpi.method_2c2cf7bc_Dne(n + 1, n2, n3);
            int n10 = zpi.method_2dee76f_bzF(n + 1, n2, n3);
            if (vla.method_ce7f5dad_Dne(n9) && (n4 & 4) == (n10 & 4)) {
                f3 = 0.5f;
                f4 = 1.0f;
                int n11 = n10 & 3;
                if (n11 == 3 && !this.method_b611966b_bzF(zpi, n, n2, n3 - 1, n4)) {
                    f5 = 0.0f;
                    f6 = 0.5f;
                    bl = true;
                } else if (n11 == 2 && !this.method_b611966b_bzF(zpi, n, n2, n3 + 1, n4)) {
                    f5 = 0.5f;
                    f6 = 1.0f;
                    bl = true;
                }
            }
        } else if (n5 == 2) {
            int n12 = zpi.method_2c2cf7bc_Dne(n, n2, n3 - 1);
            int n13 = zpi.method_2dee76f_bzF(n, n2, n3 - 1);
            if (vla.method_ce7f5dad_Dne(n12) && (n4 & 4) == (n13 & 4)) {
                f5 = 0.0f;
                f6 = 0.5f;
                int n14 = n13 & 3;
                if (n14 == 1 && !this.method_b611966b_bzF(zpi, n - 1, n2, n3, n4)) {
                    bl = true;
                } else if (n14 == 0 && !this.method_b611966b_bzF(zpi, n + 1, n2, n3, n4)) {
                    f3 = 0.5f;
                    f4 = 1.0f;
                    bl = true;
                }
            }
        } else if (n5 == 3) {
            int n15 = zpi.method_2c2cf7bc_Dne(n, n2, n3 + 1);
            int n16 = zpi.method_2dee76f_bzF(n, n2, n3 + 1);
            if (vla.method_ce7f5dad_Dne(n15) && (n4 & 4) == (n16 & 4)) {
                int n17 = n16 & 3;
                if (n17 == 1 && !this.method_b611966b_bzF(zpi, n - 1, n2, n3, n4)) {
                    bl = true;
                } else if (n17 == 0 && !this.method_b611966b_bzF(zpi, n + 1, n2, n3, n4)) {
                    f3 = 0.5f;
                    f4 = 1.0f;
                    bl = true;
                }
            }
        }
        if (bl) {
            this.method_eb14b51a_Dne(f3, f, f5, f4, f2, f6);
        }
        return bl;
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return false;
    }

    @Override
    public void method_1bbfa017_Dne(Qnq qnq, int n, int n2, int n3, bSp bSp2, List list, sMa sMa2) {
        this.method_8f2f208e_FWm(qnq, n, n2, n3);
        super.method_1bbfa017_Dne(qnq, n, n2, n3, bSp2, list, sMa2);
        boolean bl = this.method_8f2f2092_FWm(qnq, n, n2, n3);
        super.method_1bbfa017_Dne(qnq, n, n2, n3, bSp2, list, sMa2);
        if (bl && this.method_b34ae020_bzF(qnq, n, n2, n3)) {
            super.method_1bbfa017_Dne(qnq, n, n2, n3, bSp2, list, sMa2);
        }
        this.method_eb14b51a_Dne(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }

    @Override
    public gDn method_9051f17a_Dne(int n, int n2) {
        return this.field_799509c9_iTJ.method_9051f17a_Dne(n, this.field_2092ae_Dne);
    }

    @Override
    public void method_ca828a1c_Dne(Qnq qnq, int n, int n2, int n3, Random random) {
        this.field_799509c9_iTJ.method_ca828a1c_Dne(qnq, n, n2, n3, random);
    }

    @Override
    public int method_7a46288d_Dne() {
        return 10;
    }

    @Override
    public boolean method_9cb39134_Dne(Qnq qnq, int n, int n2, int n3) {
        return this.field_799509c9_iTJ.method_9cb39134_Dne(qnq, n, n2, n3);
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return false;
    }

    @Override
    public boolean method_cb53d52e_Dne(Qnq qnq, int n, int n2, int n3, FiG fiG, int n4, float f, float f2, float f3) {
        return this.field_799509c9_iTJ.method_cb53d52e_Dne(qnq, n, n2, n3, fiG, 0, 0.0f, 0.0f, 0.0f);
    }

    public boolean method_8f2f2092_FWm(Zpi zpi, int n, int n2, int n3) {
        int n4 = zpi.method_2dee76f_bzF(n, n2, n3);
        int n5 = n4 & 3;
        float f = 0.5f;
        float f2 = 1.0f;
        if ((n4 & 4) != 0) {
            f = 0.0f;
            f2 = 0.5f;
        }
        float f3 = 0.0f;
        float f4 = 1.0f;
        float f5 = 0.0f;
        float f6 = 0.5f;
        boolean bl = true;
        if (n5 == 0) {
            f3 = 0.5f;
            f6 = 1.0f;
            int n6 = zpi.method_2c2cf7bc_Dne(n + 1, n2, n3);
            int n7 = zpi.method_2dee76f_bzF(n + 1, n2, n3);
            if (vla.method_ce7f5dad_Dne(n6) && (n4 & 4) == (n7 & 4)) {
                int n8 = n7 & 3;
                if (n8 == 3 && !this.method_b611966b_bzF(zpi, n, n2, n3 + 1, n4)) {
                    f6 = 0.5f;
                    bl = false;
                } else if (n8 == 2 && !this.method_b611966b_bzF(zpi, n, n2, n3 - 1, n4)) {
                    f5 = 0.5f;
                    bl = false;
                }
            }
        } else if (n5 == 1) {
            f4 = 0.5f;
            f6 = 1.0f;
            int n9 = zpi.method_2c2cf7bc_Dne(n - 1, n2, n3);
            int n10 = zpi.method_2dee76f_bzF(n - 1, n2, n3);
            if (vla.method_ce7f5dad_Dne(n9) && (n4 & 4) == (n10 & 4)) {
                int n11 = n10 & 3;
                if (n11 == 3 && !this.method_b611966b_bzF(zpi, n, n2, n3 + 1, n4)) {
                    f6 = 0.5f;
                    bl = false;
                } else if (n11 == 2 && !this.method_b611966b_bzF(zpi, n, n2, n3 - 1, n4)) {
                    f5 = 0.5f;
                    bl = false;
                }
            }
        } else if (n5 == 2) {
            f5 = 0.5f;
            f6 = 1.0f;
            int n12 = zpi.method_2c2cf7bc_Dne(n, n2, n3 + 1);
            int n13 = zpi.method_2dee76f_bzF(n, n2, n3 + 1);
            if (vla.method_ce7f5dad_Dne(n12) && (n4 & 4) == (n13 & 4)) {
                int n14 = n13 & 3;
                if (n14 == 1 && !this.method_b611966b_bzF(zpi, n + 1, n2, n3, n4)) {
                    f4 = 0.5f;
                    bl = false;
                } else if (n14 == 0 && !this.method_b611966b_bzF(zpi, n - 1, n2, n3, n4)) {
                    f3 = 0.5f;
                    bl = false;
                }
            }
        } else if (n5 == 3) {
            int n15 = zpi.method_2c2cf7bc_Dne(n, n2, n3 - 1);
            int n16 = zpi.method_2dee76f_bzF(n, n2, n3 - 1);
            if (vla.method_ce7f5dad_Dne(n15) && (n4 & 4) == (n16 & 4)) {
                int n17 = n16 & 3;
                if (n17 == 1 && !this.method_b611966b_bzF(zpi, n + 1, n2, n3, n4)) {
                    f4 = 0.5f;
                    bl = false;
                } else if (n17 == 0 && !this.method_b611966b_bzF(zpi, n - 1, n2, n3, n4)) {
                    f3 = 0.5f;
                    bl = false;
                }
            }
        }
        this.method_eb14b51a_Dne(f3, f, f5, f4, f2, f6);
        return bl;
    }

    public void method_8f2f208e_FWm(Zpi zpi, int n, int n2, int n3) {
        int n4 = zpi.method_2dee76f_bzF(n, n2, n3);
        if ((n4 & 4) != 0) {
            this.method_eb14b51a_Dne(0.0f, 0.5f, 0.0f, 1.0f, 1.0f, 1.0f);
        } else {
            this.method_eb14b51a_Dne(0.0f, 0.0f, 0.0f, 1.0f, 0.5f, 1.0f);
        }
    }

    @Override
    public void method_ff5e68fb_FWm(Qnq qnq, int n, int n2, int n3, Random random) {
        this.field_799509c9_iTJ.method_ff5e68fb_FWm(qnq, n, n2, n3, random);
    }

    @Override
    public void method_ca7e4e57_Dne(Qnq qnq, int n, int n2, int n3, FUH fUH, NMq nMq) {
        int n4 = geR.method_117d0718_FWm((double)(fUH.field_334489_mrb * 4.0f / 360.0f) + 0.5) & 3;
        int n5 = qnq.method_2dee76f_bzF(n, n2, n3) & 4;
        if (n4 == 0) {
            qnq.method_d4dc89ed_Dne(n, n2, n3, 2 | n5, 2);
        }
        if (n4 == 1) {
            qnq.method_d4dc89ed_Dne(n, n2, n3, 1 | n5, 2);
        }
        if (n4 == 2) {
            qnq.method_d4dc89ed_Dne(n, n2, n3, 3 | n5, 2);
        }
        if (n4 == 3) {
            qnq.method_d4dc89ed_Dne(n, n2, n3, 0 | n5, 2);
        }
    }

    @Override
    public int method_582b28a_a_() {
        return this.field_799509c9_iTJ.method_582b28a_a_();
    }

    @Override
    public void method_9cb39130_Dne(Qnq qnq, int n, int n2, int n3) {
        this.method_f9bf07d3_Dne(qnq, n, n2, n3, 0);
        this.field_799509c9_iTJ.method_9cb39130_Dne(qnq, n, n2, n3);
    }

    @Override
    public void method_4b0c00b_FWm(Qnq qnq, int n, int n2, int n3, sMa sMa2) {
        this.field_799509c9_iTJ.method_4b0c00b_FWm(qnq, n, n2, n3, sMa2);
    }
}

