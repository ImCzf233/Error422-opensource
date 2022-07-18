package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public abstract class bvz {
    protected int field_388da6_zGp;
    protected CLK field_3656daa_Dne;
    protected int field_2d29f4_aFZ;

    protected int method_16cca6d_Dne(int n, int n2) {
        switch (this.field_2d29f4_aFZ) {
            case 0: 
            case 2: {
                return this.field_3656daa_Dne.field_2092ae_Dne + n;
            }
            case 1: {
                return this.field_3656daa_Dne.field_267cf5_Qnq - n2;
            }
            case 3: {
                return this.field_3656daa_Dne.field_2092ae_Dne + n2;
            }
        }
        return n;
    }

    protected void method_9acc30bb_Dne(Qnq qnq, CLK cLK, Random random, float f, int n, int n2, int n3, int n4, int n5) {
        if (random.nextFloat() < f) {
            this.method_b5ae8f6f_Dne(qnq, n4, n5, n, n2, n3, cLK);
        }
    }

    public int method_7a46288d_Dne() {
        return this.field_388da6_zGp;
    }

    protected int method_3b27a7c2_Dne(Qnq qnq, int n, int n2, int n3, CLK cLK) {
        int n4;
        int n5;
        int n6 = this.method_16cca6d_Dne(n, n3);
        return !cLK.method_2c2cf7cd_Dne(n6, n5 = this.method_ce7f5d9c_Dne(n2), n4 = this.method_1e26964c_FWm(n, n3)) ? 0 : qnq.method_2c2cf7bc_Dne(n6, n5, n4);
    }

    protected boolean method_f8f1dd60_Dne(Qnq qnq, CLK cLK, Random random, int n, int n2, int n3, fKu[] fKuArray, int n4) {
        int n5;
        int n6;
        int n7 = this.method_16cca6d_Dne(n, n3);
        if (cLK.method_2c2cf7cd_Dne(n7, n6 = this.method_ce7f5d9c_Dne(n2), n5 = this.method_1e26964c_FWm(n, n3)) && qnq.method_2c2cf7bc_Dne(n7, n6, n5) != zKP.field_375bc02_Dne.field_21260d_FWm) {
            qnq.method_17d7ea9d_FWm(n7, n6, n5, zKP.field_375bc02_Dne.field_21260d_FWm, 0, 2);
            gon_0 gon_02 = (gon_0)qnq.method_d98e681d_Dne(n7, n6, n5);
            if (gon_02 != null) {
                fKu.method_ead777d3_Dne(random, fKuArray, gon_02, n4);
            }
            return true;
        }
        return false;
    }

    protected void method_d26c5728_Dne(Qnq qnq, CLK cLK, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, boolean bl) {
        for (int i = n2; i <= n5; ++i) {
            for (int j = n; j <= n4; ++j) {
                for (int k = n3; k <= n6; ++k) {
                    if (bl && this.method_3b27a7c2_Dne(qnq, j, i, k, cLK) == 0) continue;
                    if (i != n2 && i != n5 && j != n && j != n4 && k != n3 && k != n6) {
                        this.method_b5ae8f6f_Dne(qnq, n9, n10, j, i, k, cLK);
                        continue;
                    }
                    this.method_b5ae8f6f_Dne(qnq, n7, n8, j, i, k, cLK);
                }
            }
        }
    }

    protected boolean method_d2c2fe50_Dne(Qnq qnq, CLK cLK) {
        int n;
        int n2;
        int n3;
        int n4 = Math.max(this.field_3656daa_Dne.field_2092ae_Dne - 1, cLK.field_2092ae_Dne);
        int n5 = Math.max(this.field_3656daa_Dne.field_21260d_FWm - 1, cLK.field_21260d_FWm);
        int n6 = Math.max(this.field_3656daa_Dne.field_2e5f1b_bzF - 1, cLK.field_2e5f1b_bzF);
        int n7 = Math.min(this.field_3656daa_Dne.field_267cf5_Qnq + 1, cLK.field_267cf5_Qnq);
        int n8 = Math.min(this.field_3656daa_Dne.field_2d29f4_aFZ + 1, cLK.field_2d29f4_aFZ);
        int n9 = Math.min(this.field_3656daa_Dne.field_388da6_zGp + 1, cLK.field_388da6_zGp);
        for (n3 = n4; n3 <= n7; ++n3) {
            for (n2 = n6; n2 <= n9; ++n2) {
                n = qnq.method_2c2cf7bc_Dne(n3, n5, n2);
                if (n > 0 && zKP.field_8374b848_Dne[n].field_368fd23_Dne.method_907a9d25_Qnq()) {
                    return true;
                }
                n = qnq.method_2c2cf7bc_Dne(n3, n8, n2);
                if (n <= 0 || !zKP.field_8374b848_Dne[n].field_368fd23_Dne.method_907a9d25_Qnq()) continue;
                return true;
            }
        }
        for (n3 = n4; n3 <= n7; ++n3) {
            for (n2 = n5; n2 <= n8; ++n2) {
                n = qnq.method_2c2cf7bc_Dne(n3, n2, n6);
                if (n > 0 && zKP.field_8374b848_Dne[n].field_368fd23_Dne.method_907a9d25_Qnq()) {
                    return true;
                }
                n = qnq.method_2c2cf7bc_Dne(n3, n2, n9);
                if (n <= 0 || !zKP.field_8374b848_Dne[n].field_368fd23_Dne.method_907a9d25_Qnq()) continue;
                return true;
            }
        }
        for (n3 = n6; n3 <= n9; ++n3) {
            for (n2 = n5; n2 <= n8; ++n2) {
                n = qnq.method_2c2cf7bc_Dne(n4, n2, n3);
                if (n > 0 && zKP.field_8374b848_Dne[n].field_368fd23_Dne.method_907a9d25_Qnq()) {
                    return true;
                }
                n = qnq.method_2c2cf7bc_Dne(n7, n2, n3);
                if (n <= 0 || !zKP.field_8374b848_Dne[n].field_368fd23_Dne.method_907a9d25_Qnq()) continue;
                return true;
            }
        }
        return false;
    }

    protected void method_3985c3cc_Dne(Qnq qnq, CLK cLK, Random random, float f, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, boolean bl) {
        for (int i = n2; i <= n5; ++i) {
            for (int j = n; j <= n4; ++j) {
                for (int k = n3; k <= n6; ++k) {
                    if (!(random.nextFloat() <= f) || bl && this.method_3b27a7c2_Dne(qnq, j, i, k, cLK) == 0) continue;
                    if (i != n2 && i != n5 && j != n && j != n4 && k != n3 && k != n6) {
                        this.method_b5ae8f6f_Dne(qnq, n8, 0, j, i, k, cLK);
                        continue;
                    }
                    this.method_b5ae8f6f_Dne(qnq, n7, 0, j, i, k, cLK);
                }
            }
        }
    }

    protected void method_3b27a7cf_Dne(Qnq qnq, int n, int n2, int n3, CLK cLK) {
        int n4;
        int n5;
        int n6 = this.method_16cca6d_Dne(n, n3);
        if (cLK.method_2c2cf7cd_Dne(n6, n5 = this.method_ce7f5d9c_Dne(n2), n4 = this.method_1e26964c_FWm(n, n3))) {
            while (!qnq.method_2c2cf7cd_Dne(n6, n5, n4) && n5 < 255) {
                qnq.method_17d7ea9d_FWm(n6, n5, n4, 0, 0, 2);
                ++n5;
            }
        }
    }

    public CLK method_22fefc09_Dne() {
        return this.field_3656daa_Dne;
    }

    protected void method_3d7d4888_Dne(Qnq qnq, CLK cLK, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, boolean bl) {
        for (int i = n2; i <= n5; ++i) {
            for (int j = n; j <= n4; ++j) {
                for (int k = n3; k <= n6; ++k) {
                    if (bl && this.method_3b27a7c2_Dne(qnq, j, i, k, cLK) == 0) continue;
                    if (i != n2 && i != n5 && j != n && j != n4 && k != n3 && k != n6) {
                        this.method_b5ae8f6f_Dne(qnq, n8, 0, j, i, k, cLK);
                        continue;
                    }
                    this.method_b5ae8f6f_Dne(qnq, n7, 0, j, i, k, cLK);
                }
            }
        }
    }

    protected void method_6ca945f0_FWm(Qnq qnq, int n, int n2, int n3, int n4, int n5, CLK cLK) {
        int n6;
        int n7;
        int n8 = this.method_16cca6d_Dne(n3, n5);
        if (cLK.method_2c2cf7cd_Dne(n8, n7 = this.method_ce7f5d9c_Dne(n4), n6 = this.method_1e26964c_FWm(n3, n5))) {
            while ((qnq.method_2c2cf7cd_Dne(n8, n7, n6) || qnq.method_d9802b31_Dne(n8, n7, n6).method_907a9d25_Qnq()) && n7 > 1) {
                qnq.method_17d7ea9d_FWm(n8, n7, n6, n, n2, 2);
                --n7;
            }
        }
    }

    protected void method_29936e6c_Dne(Qnq qnq, CLK cLK, int n, int n2, int n3, int n4, int n5, int n6) {
        for (int i = n2; i <= n5; ++i) {
            for (int j = n; j <= n4; ++j) {
                for (int k = n3; k <= n6; ++k) {
                    this.method_b5ae8f6f_Dne(qnq, 0, 0, j, i, k, cLK);
                }
            }
        }
    }

    protected bvz(int n) {
        this.field_388da6_zGp = n;
        this.field_2d29f4_aFZ = -1;
    }

    protected int method_ce7f5d9c_Dne(int n) {
        return this.field_2d29f4_aFZ == -1 ? n : n + this.field_3656daa_Dne.field_21260d_FWm;
    }

    public abstract boolean method_f28ef3a4_Dne(Qnq var1, Random var2, CLK var3);

    public void method_dbe42dde_Dne(bvz bvz2, List list, Random random) {
    }

    protected void method_294f1b74_Dne(Qnq qnq, CLK cLK, int n, int n2, int n3, int n4, int n5, int n6, boolean bl, Random random, Xtu xtu) {
        for (int i = n2; i <= n5; ++i) {
            for (int j = n; j <= n4; ++j) {
                for (int k = n3; k <= n6; ++k) {
                    if (bl && this.method_3b27a7c2_Dne(qnq, j, i, k, cLK) == 0) continue;
                    xtu.method_7bf5097_Dne(random, j, i, k, i == n2 || i == n5 || j == n || j == n4 || k == n3 || k == n6);
                    this.method_b5ae8f6f_Dne(qnq, xtu.method_7a46288d_Dne(), xtu.method_7c6f602c_FWm(), j, i, k, cLK);
                }
            }
        }
    }

    public EyB method_23008c9d_Dne() {
        return new EyB(this.field_3656daa_Dne.method_907a9d14_Qnq(), this.field_3656daa_Dne.method_a98a0653_aFZ(), this.field_3656daa_Dne.method_d44b4585_zGp());
    }

    protected void method_b5ae8f6f_Dne(Qnq qnq, int n, int n2, int n3, int n4, int n5, CLK cLK) {
        int n6;
        int n7;
        int n8 = this.method_16cca6d_Dne(n3, n5);
        if (cLK.method_2c2cf7cd_Dne(n8, n7 = this.method_ce7f5d9c_Dne(n4), n6 = this.method_1e26964c_FWm(n3, n5))) {
            qnq.method_17d7ea9d_FWm(n8, n7, n6, n, n2, 2);
        }
    }

    public static bvz method_9e83199f_Dne(List list, CLK cLK) {
        bvz bvz2;
        Iterator iterator = list.iterator();
        do {
            if (iterator.hasNext()) continue;
            return null;
        } while ((bvz2 = (bvz)iterator.next()).method_22fefc09_Dne() == null || !bvz2.method_22fefc09_Dne().method_697d22a9_Dne(cLK));
        return bvz2;
    }

    protected void method_1280239d_Dne(Qnq qnq, CLK cLK, int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl) {
        float f = n4 - n + 1;
        float f2 = n5 - n2 + 1;
        float f3 = n6 - n3 + 1;
        float f4 = (float)n + f / 2.0f;
        float f5 = (float)n3 + f3 / 2.0f;
        for (int i = n2; i <= n5; ++i) {
            float f6 = (float)(i - n2) / f2;
            for (int j = n; j <= n4; ++j) {
                float f7 = ((float)j - f4) / (f * 0.5f);
                for (int k = n3; k <= n6; ++k) {
                    float f8;
                    float f9 = ((float)k - f5) / (f3 * 0.5f);
                    if (bl && this.method_3b27a7c2_Dne(qnq, j, i, k, cLK) == 0 || !((f8 = f7 * f7 + f6 * f6 + f9 * f9) <= 1.05f)) continue;
                    this.method_b5ae8f6f_Dne(qnq, n7, 0, j, i, k, cLK);
                }
            }
        }
    }

    protected int method_73b4985a_bzF(int n, int n2) {
        if (n == zKP.field_69989981_FYZ.field_21260d_FWm) {
            if (this.field_2d29f4_aFZ == 1 || this.field_2d29f4_aFZ == 3) {
                if (n2 == 1) {
                    return 0;
                }
                return 1;
            }
        } else if (n != zKP.field_ceacd6d_ICU.field_21260d_FWm && n != zKP.field_79fca9d5_IYC.field_21260d_FWm) {
            if (n != zKP.field_91df3208_BJH.field_21260d_FWm && n != zKP.field_7a2b5882_One.field_21260d_FWm && n != zKP.field_72822373_ivB.field_21260d_FWm && n != zKP.field_bf6a10e6_yIR.field_21260d_FWm && n != zKP.field_b77fe6db_Wnd.field_21260d_FWm) {
                if (n == zKP.field_fa1a6f1_ZfC.field_21260d_FWm) {
                    if (this.field_2d29f4_aFZ == 0) {
                        if (n2 == 2) {
                            return 3;
                        }
                        if (n2 == 3) {
                            return 2;
                        }
                    } else if (this.field_2d29f4_aFZ == 1) {
                        if (n2 == 2) {
                            return 4;
                        }
                        if (n2 == 3) {
                            return 5;
                        }
                        if (n2 == 4) {
                            return 2;
                        }
                        if (n2 == 5) {
                            return 3;
                        }
                    } else if (this.field_2d29f4_aFZ == 3) {
                        if (n2 == 2) {
                            return 5;
                        }
                        if (n2 == 3) {
                            return 4;
                        }
                        if (n2 == 4) {
                            return 2;
                        }
                        if (n2 == 5) {
                            return 3;
                        }
                    }
                } else if (n == zKP.field_443caa84_LoG.field_21260d_FWm) {
                    if (this.field_2d29f4_aFZ == 0) {
                        if (n2 == 3) {
                            return 4;
                        }
                        if (n2 == 4) {
                            return 3;
                        }
                    } else if (this.field_2d29f4_aFZ == 1) {
                        if (n2 == 3) {
                            return 1;
                        }
                        if (n2 == 4) {
                            return 2;
                        }
                        if (n2 == 2) {
                            return 3;
                        }
                        if (n2 == 1) {
                            return 4;
                        }
                    } else if (this.field_2d29f4_aFZ == 3) {
                        if (n2 == 3) {
                            return 2;
                        }
                        if (n2 == 4) {
                            return 1;
                        }
                        if (n2 == 2) {
                            return 3;
                        }
                        if (n2 == 1) {
                            return 4;
                        }
                    }
                } else if (!(n == zKP.field_37692b5_Dne.field_21260d_FWm || zKP.field_8374b848_Dne[n] != null && zKP.field_8374b848_Dne[n] instanceof kbN)) {
                    if (n == zKP.field_20291847_FWm.field_21260d_FWm || n == zKP.field_36f4c68_Dne.field_21260d_FWm || n == zKP.field_dfb6fab4_cHy.field_21260d_FWm || n == zKP.field_71ad80bc_Vxn.field_21260d_FWm) {
                        if (this.field_2d29f4_aFZ == 0) {
                            if (n2 == 2 || n2 == 3) {
                                return rrP.field_3f1c589_Dne[n2];
                            }
                        } else if (this.field_2d29f4_aFZ == 1) {
                            if (n2 == 2) {
                                return 4;
                            }
                            if (n2 == 3) {
                                return 5;
                            }
                            if (n2 == 4) {
                                return 2;
                            }
                            if (n2 == 5) {
                                return 3;
                            }
                        } else if (this.field_2d29f4_aFZ == 3) {
                            if (n2 == 2) {
                                return 5;
                            }
                            if (n2 == 3) {
                                return 4;
                            }
                            if (n2 == 4) {
                                return 2;
                            }
                            if (n2 == 5) {
                                return 3;
                            }
                        }
                    }
                } else if (this.field_2d29f4_aFZ == 0) {
                    if (n2 == 0 || n2 == 2) {
                        return zxJ.field_5781703_aFZ[n2];
                    }
                } else if (this.field_2d29f4_aFZ == 1) {
                    if (n2 == 2) {
                        return 1;
                    }
                    if (n2 == 0) {
                        return 3;
                    }
                    if (n2 == 1) {
                        return 2;
                    }
                    if (n2 == 3) {
                        return 0;
                    }
                } else if (this.field_2d29f4_aFZ == 3) {
                    if (n2 == 2) {
                        return 3;
                    }
                    if (n2 == 0) {
                        return 1;
                    }
                    if (n2 == 1) {
                        return 2;
                    }
                    if (n2 == 3) {
                        return 0;
                    }
                }
            } else if (this.field_2d29f4_aFZ == 0) {
                if (n2 == 2) {
                    return 3;
                }
                if (n2 == 3) {
                    return 2;
                }
            } else if (this.field_2d29f4_aFZ == 1) {
                if (n2 == 0) {
                    return 2;
                }
                if (n2 == 1) {
                    return 3;
                }
                if (n2 == 2) {
                    return 0;
                }
                if (n2 == 3) {
                    return 1;
                }
            } else if (this.field_2d29f4_aFZ == 3) {
                if (n2 == 0) {
                    return 2;
                }
                if (n2 == 1) {
                    return 3;
                }
                if (n2 == 2) {
                    return 1;
                }
                if (n2 == 3) {
                    return 0;
                }
            }
        } else if (this.field_2d29f4_aFZ == 0) {
            if (n2 == 0) {
                return 2;
            }
            if (n2 == 2) {
                return 0;
            }
        } else {
            if (this.field_2d29f4_aFZ == 1) {
                return n2 + 1 & 3;
            }
            if (this.field_2d29f4_aFZ == 3) {
                return n2 + 3 & 3;
            }
        }
        return n2;
    }

    protected int method_1e26964c_FWm(int n, int n2) {
        switch (this.field_2d29f4_aFZ) {
            case 0: {
                return this.field_3656daa_Dne.field_2e5f1b_bzF + n2;
            }
            case 1: 
            case 3: {
                return this.field_3656daa_Dne.field_2e5f1b_bzF + n;
            }
            case 2: {
                return this.field_3656daa_Dne.field_388da6_zGp - n2;
            }
        }
        return n2;
    }

    protected boolean method_6b0beb33_Dne(Qnq qnq, CLK cLK, Random random, int n, int n2, int n3, int n4, fKu[] fKuArray, int n5) {
        int n6;
        int n7;
        int n8 = this.method_16cca6d_Dne(n, n3);
        if (cLK.method_2c2cf7cd_Dne(n8, n7 = this.method_ce7f5d9c_Dne(n2), n6 = this.method_1e26964c_FWm(n, n3)) && qnq.method_2c2cf7bc_Dne(n8, n7, n6) != zKP.field_71ad80bc_Vxn.field_21260d_FWm) {
            qnq.method_17d7ea9d_FWm(n8, n7, n6, zKP.field_71ad80bc_Vxn.field_21260d_FWm, this.method_73b4985a_bzF(zKP.field_71ad80bc_Vxn.field_21260d_FWm, n4), 2);
            UTs uTs = (UTs)qnq.method_d98e681d_Dne(n8, n7, n6);
            if (uTs != null) {
                fKu.method_624fb7f8_Dne(random, fKuArray, uTs, n5);
            }
            return true;
        }
        return false;
    }

    protected void method_763ab4f8_Dne(Qnq qnq, CLK cLK, Random random, int n, int n2, int n3, int n4) {
        int n5;
        int n6;
        int n7 = this.method_16cca6d_Dne(n, n3);
        if (cLK.method_2c2cf7cd_Dne(n7, n6 = this.method_ce7f5d9c_Dne(n2), n5 = this.method_1e26964c_FWm(n, n3))) {
            fgS.method_1cca978f_Dne(qnq, n7, n6, n5, n4, zKP.field_ceacd6d_ICU);
        }
    }
}

