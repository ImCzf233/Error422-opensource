package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class TpV
extends gwq {
    private final int field_2e5f1b_bzF;
    private final int field_21260d_FWm;
    private final int field_2092ae_Dne;

    public TpV(boolean bl, int n, int n2, int n3) {
        super(bl);
        this.field_2092ae_Dne = n;
        this.field_21260d_FWm = n2;
        this.field_2e5f1b_bzF = n3;
    }

    private void method_9758bdff_Dne(Qnq qnq, int n, int n2, int n3, int n4, Random random) {
        int n5 = 2;
        for (int i = n3 - n5; i <= n3; ++i) {
            int n6 = i - n3;
            int n7 = n4 + 1 - n6;
            for (int j = n - n7; j <= n + n7 + 1; ++j) {
                int n8 = j - n;
                for (int k = n2 - n7; k <= n2 + n7 + 1; ++k) {
                    int n9;
                    int n10 = k - n2;
                    if (n8 < 0 && n10 < 0 && n8 * n8 + n10 * n10 > n7 * n7 || (n8 > 0 || n10 > 0) && n8 * n8 + n10 * n10 > (n7 + 1) * (n7 + 1) || random.nextInt(4) == 0 && n8 * n8 + n10 * n10 > (n7 - 1) * (n7 - 1) || (n9 = qnq.method_2c2cf7bc_Dne(j, i, k)) != 0 && n9 != zKP.field_36e218c_Dne.field_21260d_FWm) continue;
                    this.method_3e226590_Dne(qnq, j, i, k, zKP.field_36e218c_Dne.field_21260d_FWm, this.field_2e5f1b_bzF);
                }
            }
        }
    }

    @Override
    public boolean method_c3e4cb88_Dne(Qnq qnq, Random random, int n, int n2, int n3) {
        int n4 = random.nextInt(3) + this.field_2092ae_Dne;
        boolean bl = true;
        if (n2 >= 1 && n2 + n4 + 1 <= 256) {
            int n5;
            int n6;
            int n7;
            int n8;
            int n9;
            for (n9 = n2; n9 <= n2 + 1 + n4; ++n9) {
                n8 = 2;
                if (n9 == n2) {
                    n8 = 1;
                }
                if (n9 >= n2 + 1 + n4 - 2) {
                    n8 = 2;
                }
                for (n7 = n - n8; n7 <= n + n8 && bl; ++n7) {
                    for (n6 = n3 - n8; n6 <= n3 + n8 && bl; ++n6) {
                        if (n9 >= 0 && n9 < 256) {
                            n5 = qnq.method_2c2cf7bc_Dne(n7, n9, n6);
                            if (n5 == 0 || n5 == zKP.field_36e218c_Dne.field_21260d_FWm || n5 == zKP.field_36ff555_Dne.field_21260d_FWm || n5 == zKP.field_203836cc_FWm.field_21260d_FWm || n5 == zKP.field_af0f1368_udO.field_21260d_FWm || n5 == zKP.field_7141ef33_aFZ.field_21260d_FWm) continue;
                            bl = false;
                            continue;
                        }
                        bl = false;
                    }
                }
            }
            if (!bl) {
                return false;
            }
            n9 = qnq.method_2c2cf7bc_Dne(n, n2 - 1, n3);
            if ((n9 == zKP.field_36ff555_Dne.field_21260d_FWm || n9 == zKP.field_203836cc_FWm.field_21260d_FWm) && n2 < 256 - n4 - 1) {
                qnq.method_17d7ea9d_FWm(n, n2 - 1, n3, zKP.field_203836cc_FWm.field_21260d_FWm, 0, 2);
                qnq.method_17d7ea9d_FWm(n + 1, n2 - 1, n3, zKP.field_203836cc_FWm.field_21260d_FWm, 0, 2);
                qnq.method_17d7ea9d_FWm(n, n2 - 1, n3 + 1, zKP.field_203836cc_FWm.field_21260d_FWm, 0, 2);
                qnq.method_17d7ea9d_FWm(n + 1, n2 - 1, n3 + 1, zKP.field_203836cc_FWm.field_21260d_FWm, 0, 2);
                this.method_9758bdff_Dne(qnq, n, n3, n2 + n4, 2, random);
                for (n8 = n2 + n4 - 2 - random.nextInt(4); n8 > n2 + n4 / 2; n8 -= 2 + random.nextInt(4)) {
                    float f = random.nextFloat() * (float)Math.PI * 2.0f;
                    n6 = n + (int)(0.5f + geR.method_117d0e97_FWm(f) * 4.0f);
                    n5 = n3 + (int)(0.5f + geR.method_ce7f5256_Dne(f) * 4.0f);
                    this.method_9758bdff_Dne(qnq, n6, n5, n8, 0, random);
                    for (int i = 0; i < 5; ++i) {
                        n6 = n + (int)(1.5f + geR.method_117d0e97_FWm(f) * (float)i);
                        n5 = n3 + (int)(1.5f + geR.method_ce7f5256_Dne(f) * (float)i);
                        this.method_3e226590_Dne(qnq, n6, n8 - 3 + i / 2, n5, zKP.field_af0f1368_udO.field_21260d_FWm, this.field_21260d_FWm);
                    }
                }
                for (n7 = 0; n7 < n4; ++n7) {
                    n6 = qnq.method_2c2cf7bc_Dne(n, n2 + n7, n3);
                    if (n6 == 0 || n6 == zKP.field_36e218c_Dne.field_21260d_FWm) {
                        this.method_3e226590_Dne(qnq, n, n2 + n7, n3, zKP.field_af0f1368_udO.field_21260d_FWm, this.field_21260d_FWm);
                        if (n7 > 0) {
                            if (random.nextInt(3) > 0 && qnq.method_2c2cf7cd_Dne(n - 1, n2 + n7, n3)) {
                                this.method_3e226590_Dne(qnq, n - 1, n2 + n7, n3, zKP.field_728b3649_ipf.field_21260d_FWm, 8);
                            }
                            if (random.nextInt(3) > 0 && qnq.method_2c2cf7cd_Dne(n, n2 + n7, n3 - 1)) {
                                this.method_3e226590_Dne(qnq, n, n2 + n7, n3 - 1, zKP.field_728b3649_ipf.field_21260d_FWm, 1);
                            }
                        }
                    }
                    if (n7 >= n4 - 1) continue;
                    n6 = qnq.method_2c2cf7bc_Dne(n + 1, n2 + n7, n3);
                    if (n6 == 0 || n6 == zKP.field_36e218c_Dne.field_21260d_FWm) {
                        this.method_3e226590_Dne(qnq, n + 1, n2 + n7, n3, zKP.field_af0f1368_udO.field_21260d_FWm, this.field_21260d_FWm);
                        if (n7 > 0) {
                            if (random.nextInt(3) > 0 && qnq.method_2c2cf7cd_Dne(n + 2, n2 + n7, n3)) {
                                this.method_3e226590_Dne(qnq, n + 2, n2 + n7, n3, zKP.field_728b3649_ipf.field_21260d_FWm, 2);
                            }
                            if (random.nextInt(3) > 0 && qnq.method_2c2cf7cd_Dne(n + 1, n2 + n7, n3 - 1)) {
                                this.method_3e226590_Dne(qnq, n + 1, n2 + n7, n3 - 1, zKP.field_728b3649_ipf.field_21260d_FWm, 1);
                            }
                        }
                    }
                    if ((n6 = qnq.method_2c2cf7bc_Dne(n + 1, n2 + n7, n3 + 1)) == 0 || n6 == zKP.field_36e218c_Dne.field_21260d_FWm) {
                        this.method_3e226590_Dne(qnq, n + 1, n2 + n7, n3 + 1, zKP.field_af0f1368_udO.field_21260d_FWm, this.field_21260d_FWm);
                        if (n7 > 0) {
                            if (random.nextInt(3) > 0 && qnq.method_2c2cf7cd_Dne(n + 2, n2 + n7, n3 + 1)) {
                                this.method_3e226590_Dne(qnq, n + 2, n2 + n7, n3 + 1, zKP.field_728b3649_ipf.field_21260d_FWm, 2);
                            }
                            if (random.nextInt(3) > 0 && qnq.method_2c2cf7cd_Dne(n + 1, n2 + n7, n3 + 2)) {
                                this.method_3e226590_Dne(qnq, n + 1, n2 + n7, n3 + 2, zKP.field_728b3649_ipf.field_21260d_FWm, 4);
                            }
                        }
                    }
                    if ((n6 = qnq.method_2c2cf7bc_Dne(n, n2 + n7, n3 + 1)) != 0 && n6 != zKP.field_36e218c_Dne.field_21260d_FWm) continue;
                    this.method_3e226590_Dne(qnq, n, n2 + n7, n3 + 1, zKP.field_af0f1368_udO.field_21260d_FWm, this.field_21260d_FWm);
                    if (n7 <= 0) continue;
                    if (random.nextInt(3) > 0 && qnq.method_2c2cf7cd_Dne(n - 1, n2 + n7, n3 + 1)) {
                        this.method_3e226590_Dne(qnq, n - 1, n2 + n7, n3 + 1, zKP.field_728b3649_ipf.field_21260d_FWm, 8);
                    }
                    if (random.nextInt(3) <= 0 || !qnq.method_2c2cf7cd_Dne(n, n2 + n7, n3 + 2)) continue;
                    this.method_3e226590_Dne(qnq, n, n2 + n7, n3 + 2, zKP.field_728b3649_ipf.field_21260d_FWm, 4);
                }
                return true;
            }
            return false;
        }
        return false;
    }
}

