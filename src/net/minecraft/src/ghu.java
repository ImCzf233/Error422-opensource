package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class ghu
extends gwq {
    private final int field_2e5f1b_bzF;
    private final int field_21260d_FWm;
    private final int field_2092ae_Dne;
    private final boolean field_2092bf_Dne;

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
                n8 = 1;
                if (n9 == n2) {
                    n8 = 0;
                }
                if (n9 >= n2 + 1 + n4 - 2) {
                    n8 = 2;
                }
                for (n7 = n - n8; n7 <= n + n8 && bl; ++n7) {
                    for (n6 = n3 - n8; n6 <= n3 + n8 && bl; ++n6) {
                        if (n9 >= 0 && n9 < 256) {
                            n5 = qnq.method_2c2cf7bc_Dne(n7, n9, n6);
                            if (n5 == 0 || n5 == zKP.field_36e218c_Dne.field_21260d_FWm || n5 == zKP.field_36ff555_Dne.field_21260d_FWm || n5 == zKP.field_203836cc_FWm.field_21260d_FWm || n5 == zKP.field_af0f1368_udO.field_21260d_FWm) continue;
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
                int n10;
                int n11;
                int n12;
                this.method_f9bf07d3_Dne(qnq, n, n2 - 1, n3, zKP.field_203836cc_FWm.field_21260d_FWm);
                n8 = 3;
                n7 = 0;
                for (n6 = n2 - n8 + n4; n6 <= n2 + n4; ++n6) {
                    n5 = n6 - (n2 + n4);
                    n12 = n7 + 1 - n5 / 2;
                    for (n11 = n - n12; n11 <= n + n12; ++n11) {
                        n10 = n11 - n;
                        for (int i = n3 - n12; i <= n3 + n12; ++i) {
                            int n13;
                            int n14 = i - n3;
                            if (Math.abs(n10) == n12 && Math.abs(n14) == n12 && (random.nextInt(2) == 0 || n5 == 0) || (n13 = qnq.method_2c2cf7bc_Dne(n11, n6, i)) != 0 && n13 != zKP.field_36e218c_Dne.field_21260d_FWm) continue;
                            this.method_3e226590_Dne(qnq, n11, n6, i, zKP.field_36e218c_Dne.field_21260d_FWm, this.field_2e5f1b_bzF);
                        }
                    }
                }
                for (n6 = 0; n6 < n4; ++n6) {
                    n5 = qnq.method_2c2cf7bc_Dne(n, n2 + n6, n3);
                    if (n5 != 0 && n5 != zKP.field_36e218c_Dne.field_21260d_FWm) continue;
                    this.method_3e226590_Dne(qnq, n, n2 + n6, n3, zKP.field_af0f1368_udO.field_21260d_FWm, this.field_21260d_FWm);
                    if (!this.field_2092bf_Dne || n6 <= 0) continue;
                    if (random.nextInt(3) > 0 && qnq.method_2c2cf7cd_Dne(n - 1, n2 + n6, n3)) {
                        this.method_3e226590_Dne(qnq, n - 1, n2 + n6, n3, zKP.field_728b3649_ipf.field_21260d_FWm, 8);
                    }
                    if (random.nextInt(3) > 0 && qnq.method_2c2cf7cd_Dne(n + 1, n2 + n6, n3)) {
                        this.method_3e226590_Dne(qnq, n + 1, n2 + n6, n3, zKP.field_728b3649_ipf.field_21260d_FWm, 2);
                    }
                    if (random.nextInt(3) > 0 && qnq.method_2c2cf7cd_Dne(n, n2 + n6, n3 - 1)) {
                        this.method_3e226590_Dne(qnq, n, n2 + n6, n3 - 1, zKP.field_728b3649_ipf.field_21260d_FWm, 1);
                    }
                    if (random.nextInt(3) <= 0 || !qnq.method_2c2cf7cd_Dne(n, n2 + n6, n3 + 1)) continue;
                    this.method_3e226590_Dne(qnq, n, n2 + n6, n3 + 1, zKP.field_728b3649_ipf.field_21260d_FWm, 4);
                }
                if (this.field_2092bf_Dne) {
                    for (n6 = n2 - 3 + n4; n6 <= n2 + n4; ++n6) {
                        n5 = n6 - (n2 + n4);
                        n12 = 2 - n5 / 2;
                        for (n11 = n - n12; n11 <= n + n12; ++n11) {
                            for (n10 = n3 - n12; n10 <= n3 + n12; ++n10) {
                                if (qnq.method_2c2cf7bc_Dne(n11, n6, n10) != zKP.field_36e218c_Dne.field_21260d_FWm) continue;
                                if (random.nextInt(4) == 0 && qnq.method_2c2cf7bc_Dne(n11 - 1, n6, n10) == 0) {
                                    this.method_d6a0f314_FWm(qnq, n11 - 1, n6, n10, 8);
                                }
                                if (random.nextInt(4) == 0 && qnq.method_2c2cf7bc_Dne(n11 + 1, n6, n10) == 0) {
                                    this.method_d6a0f314_FWm(qnq, n11 + 1, n6, n10, 2);
                                }
                                if (random.nextInt(4) == 0 && qnq.method_2c2cf7bc_Dne(n11, n6, n10 - 1) == 0) {
                                    this.method_d6a0f314_FWm(qnq, n11, n6, n10 - 1, 1);
                                }
                                if (random.nextInt(4) != 0 || qnq.method_2c2cf7bc_Dne(n11, n6, n10 + 1) != 0) continue;
                                this.method_d6a0f314_FWm(qnq, n11, n6, n10 + 1, 4);
                            }
                        }
                    }
                    if (random.nextInt(5) == 0 && n4 > 5) {
                        for (n6 = 0; n6 < 2; ++n6) {
                            for (n5 = 0; n5 < 4; ++n5) {
                                if (random.nextInt(4 - n6) != 0) continue;
                                n12 = random.nextInt(3);
                                this.method_3e226590_Dne(qnq, n + zxJ.field_3f1c589_Dne[zxJ.field_5781703_aFZ[n5]], n2 + n4 - 5 + n6, n3 + zxJ.field_4039e0a_FWm[zxJ.field_5781703_aFZ[n5]], zKP.field_103be727_Woy.field_21260d_FWm, n12 << 2 | n5);
                            }
                        }
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public ghu(boolean bl) {
        this(bl, 4, 0, 0, false);
    }

    private void method_d6a0f314_FWm(Qnq qnq, int n, int n2, int n3, int n4) {
        this.method_3e226590_Dne(qnq, n, n2, n3, zKP.field_728b3649_ipf.field_21260d_FWm, n4);
        int n5 = 4;
        while (qnq.method_2c2cf7bc_Dne(n, --n2, n3) == 0 && n5 > 0) {
            this.method_3e226590_Dne(qnq, n, n2, n3, zKP.field_728b3649_ipf.field_21260d_FWm, n4);
            --n5;
        }
        return;
    }

    public ghu(boolean bl, int n, int n2, int n3, boolean bl2) {
        super(bl);
        this.field_2092ae_Dne = n;
        this.field_21260d_FWm = n2;
        this.field_2e5f1b_bzF = n3;
        this.field_2092bf_Dne = bl2;
    }
}

