package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class rTW
extends kbN {
    private gDn[] field_836bfe96_Dne;
    private gDn[] field_fdebae97_FWm;
    private gDn[] field_5a1dee49_bzF;
    public static final int[][] field_7a46ee0e_Dne = new int[][]{{0, 1}, {-1, 0}, {0, -1}, {1, 0}};

    @Override
    public int method_7a46288d_Dne() {
        return 14;
    }

    @Override
    public void method_86296256_Dne(Qnq qnq, int n, int n2, int n3, int n4, float f, int n5) {
        if (!rTW.method_ce7f5dad_Dne(n4)) {
            super.method_86296256_Dne(qnq, n, n2, n3, n4, f, 0);
        }
    }

    public static boolean method_ce7f5dad_Dne(int n) {
        return (n & 8) != 0;
    }

    private void method_ae128dc7_bzF() {
        this.method_eb14b51a_Dne(0.0f, 0.0f, 0.0f, 1.0f, 0.5625f, 1.0f);
    }

    @Override
    public gDn method_9051f17a_Dne(int n, int n2) {
        int n3;
        if (n == 0) {
            return zKP.field_5e67d9b4_Qnq.method_77cd08ea_FWm(n);
        }
        int n4 = rTW.method_7ed979f5_Qnq(n2);
        int n5 = zxJ.field_7a46ee0e_Dne[n4][n];
        int n6 = n3 = rTW.method_ce7f5dad_Dne(n2) ? 1 : 0;
        return !(n3 == 1 && n5 == 2 || n3 == 0 && n5 == 3) ? (n5 != 5 && n5 != 4 ? this.field_5a1dee49_bzF[n3] : this.field_fdebae97_FWm[n3]) : this.field_836bfe96_Dne[n3];
    }

    public static void method_f9bf47a4_Dne(Qnq qnq, int n, int n2, int n3, boolean bl) {
        int n4 = qnq.method_2dee76f_bzF(n, n2, n3);
        n4 = bl ? (n4 |= 4) : (n4 &= 0xFFFFFFFB);
        qnq.method_d4dc89ed_Dne(n, n2, n3, n4, 4);
    }

    @Override
    public int method_7c6f602c_FWm() {
        return 1;
    }

    @Override
    public boolean method_cb53d52e_Dne(Qnq qnq, int n, int n2, int n3, FiG fiG, int n4, float f, float f2, float f3) {
        if (qnq.field_2d2a05_aFZ) {
            return true;
        }
        int n5 = qnq.method_2dee76f_bzF(n, n2, n3);
        if (!rTW.method_ce7f5dad_Dne(n5)) {
            int n6 = rTW.method_7ed979f5_Qnq(n5);
            if (qnq.method_2c2cf7bc_Dne(n += field_7a46ee0e_Dne[n6][0], n2, n3 += field_7a46ee0e_Dne[n6][1]) != this.field_21260d_FWm) {
                return true;
            }
            n5 = qnq.method_2dee76f_bzF(n, n2, n3);
        }
        if (eCD.method_ce7f5d9c_Dne(100) == 0) {
            double d = (double)n + 0.5;
            double d2 = (double)n2 + 0.5;
            double d3 = (double)n3 + 0.5;
            qnq.method_2e7161e6_Qnq(n, n2, n3);
            int n7 = rTW.method_7ed979f5_Qnq(n5);
            if (qnq.method_2c2cf7bc_Dne(n += field_7a46ee0e_Dne[n7][0], n2, n3 += field_7a46ee0e_Dne[n7][1]) == this.field_21260d_FWm) {
                qnq.method_2e7161e6_Qnq(n, n2, n3);
                d = (d + (double)n + 0.5) / 2.0;
                d2 = (d2 + (double)n2 + 0.5) / 2.0;
                d3 = (d3 + (double)n3 + 0.5) / 2.0;
            }
            qnq.method_4ff037c_Dne(null, (float)n + 0.5f, (float)n2 + 0.5f, (float)n3 + 0.5f, 5.0f, true, true);
            return true;
        }
        if (qnq.field_3690d00_Dne.method_7c6f603d_FWm() && qnq.method_90477c37_Dne(n, n3) != OdI.field_5bba54c_IjH) {
            NSR nSR;
            if (rTW.method_117d19ee_FWm(n5)) {
                FiG fiG2 = null;
                for (Object obj : qnq.field_2c197105_Qnq) {
                	FiG fiG3 = (FiG) obj;
                    if (!fiG3.method_9b310ff4_Wwe()) continue;
                    iSh iSh2 = fiG3.field_376d18e_Dne;
                    if (iSh2.field_2092ae_Dne != n || iSh2.field_21260d_FWm != n2 || iSh2.field_2e5f1b_bzF != n3) continue;
                    fiG2 = fiG3;
                }
                if (fiG2 != null) {
                    fiG.method_47a073d1_bzF("tile.bed.occupied");
                    return true;
                }
                rTW.method_f9bf47a4_Dne(qnq, n, n2, n3, false);
            }
            if ((nSR = fiG.method_d981b6ed_Dne(n, n2, n3)) == NSR.field_36a88df_Dne) {
                rTW.method_f9bf47a4_Dne(qnq, n, n2, n3, true);
                return true;
            }
            if (nSR == NSR.field_75b256cc_bzF) {
                fiG.method_47a073d1_bzF("tile.bed.noSleep");
            } else if (nSR == NSR.field_f09c47d7_zGp) {
                fiG.method_47a073d1_bzF("tile.bed.notSafe");
            }
            return true;
        }
        double d = (double)n + 0.5;
        double d4 = (double)n2 + 0.5;
        double d5 = (double)n3 + 0.5;
        qnq.method_2e7161e6_Qnq(n, n2, n3);
        int n8 = rTW.method_7ed979f5_Qnq(n5);
        if (qnq.method_2c2cf7bc_Dne(n += field_7a46ee0e_Dne[n8][0], n2, n3 += field_7a46ee0e_Dne[n8][1]) == this.field_21260d_FWm) {
            qnq.method_2e7161e6_Qnq(n, n2, n3);
            d = (d + (double)n + 0.5) / 2.0;
            d4 = (d4 + (double)n2 + 0.5) / 2.0;
            d5 = (d5 + (double)n3 + 0.5) / 2.0;
        }
        qnq.method_4ff037c_Dne(null, (float)n + 0.5f, (float)n2 + 0.5f, (float)n3 + 0.5f, 5.0f, true, true);
        return true;
    }

    public rTW(int n) {
        super(n, KFd.field_aef9a59e_udO);
        this.method_ae128dc7_bzF();
    }

    @Override
    public void method_c5b1410a_Dne(Qnq qnq, int n, int n2, int n3, int n4, FiG fiG) {
        int n5;
        if (fiG.field_37cb681_Dne.field_267d06_Qnq && rTW.method_ce7f5dad_Dne(n4) && qnq.method_2c2cf7bc_Dne(n -= field_7a46ee0e_Dne[n5 = rTW.method_7ed979f5_Qnq(n4)][0], n2, n3 -= field_7a46ee0e_Dne[n5][1]) == this.field_21260d_FWm) {
            qnq.method_2e7161e6_Qnq(n, n2, n3);
        }
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        this.field_5a1dee49_bzF = new gDn[]{rbp.method_285881e4_Dne("bed_feet_top"), rbp.method_285881e4_Dne("bed_head_top")};
        this.field_836bfe96_Dne = new gDn[]{rbp.method_285881e4_Dne("bed_feet_end"), rbp.method_285881e4_Dne("bed_head_end")};
        this.field_fdebae97_FWm = new gDn[]{rbp.method_285881e4_Dne("bed_feet_side"), rbp.method_285881e4_Dne("bed_head_side")};
    }

    @Override
    public int method_9cb39123_Dne(Qnq qnq, int n, int n2, int n3) {
        return dEr.field_a76b2fd2_Kmf.field_267cf5_Qnq;
    }

    @Override
    public void method_fbabf7ef_Dne(Zpi zpi, int n, int n2, int n3) {
        this.method_ae128dc7_bzF();
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
    public void method_f9bf07d3_Dne(Qnq qnq, int n, int n2, int n3, int n4) {
        int n5 = qnq.method_2dee76f_bzF(n, n2, n3);
        int n6 = rTW.method_7ed979f5_Qnq(n5);
        if (rTW.method_ce7f5dad_Dne(n5)) {
            if (qnq.method_2c2cf7bc_Dne(n - field_7a46ee0e_Dne[n6][0], n2, n3 - field_7a46ee0e_Dne[n6][1]) != this.field_21260d_FWm) {
                qnq.method_2e7161e6_Qnq(n, n2, n3);
            }
        } else if (qnq.method_2c2cf7bc_Dne(n + field_7a46ee0e_Dne[n6][0], n2, n3 + field_7a46ee0e_Dne[n6][1]) != this.field_21260d_FWm) {
            qnq.method_2e7161e6_Qnq(n, n2, n3);
            if (!qnq.field_2d2a05_aFZ) {
                this.method_fd7de26f_FWm(qnq, n, n2, n3, n5, 0);
            }
        }
    }

    public static iSh method_7024faa6_Dne(Qnq qnq, int n, int n2, int n3, int n4) {
        int n5 = qnq.method_2dee76f_bzF(n, n2, n3);
        int n6 = kbN.method_7ed979f5_Qnq(n5);
        for (int i = 0; i <= 1; ++i) {
            int n7 = n - field_7a46ee0e_Dne[n6][0] * i - 1;
            int n8 = n3 - field_7a46ee0e_Dne[n6][1] * i - 1;
            int n9 = n7 + 2;
            int n10 = n8 + 2;
            for (int j = n7; j <= n9; ++j) {
                for (int k = n8; k <= n10; ++k) {
                    if (!qnq.method_73e9b8f9_IjH(j, n2 - 1, k) || !qnq.method_2c2cf7cd_Dne(j, n2, k) || !qnq.method_2c2cf7cd_Dne(j, n2 + 1, k)) continue;
                    if (n4 <= 0) {
                        return new iSh(j, n2, k);
                    }
                    --n4;
                }
            }
        }
        return null;
    }

    public static boolean method_117d19ee_FWm(int n) {
        return (n & 4) != 0;
    }

    @Override
    public int method_24763341_Dne(int n, Random random, int n2) {
        return rTW.method_ce7f5dad_Dne(n) ? 0 : dEr.field_a76b2fd2_Kmf.field_267cf5_Qnq;
    }
}

