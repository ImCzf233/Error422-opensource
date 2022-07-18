package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class ZeN
extends bvz {
    private int field_2092ae_Dne;
    private final boolean field_2092bf_Dne;
    private boolean field_2e5f2c_bzF;
    private final boolean field_21261e_FWm;

    public ZeN(int n, Random random, CLK cLK, int n2) {
        super(n);
        this.field_2d29f4_aFZ = n2;
        this.field_3656daa_Dne = cLK;
        this.field_2092bf_Dne = random.nextInt(3) == 0;
        this.field_21261e_FWm = !this.field_2092bf_Dne && random.nextInt(23) == 0;
        this.field_2092ae_Dne = this.field_2d29f4_aFZ != 2 && this.field_2d29f4_aFZ != 0 ? cLK.method_7a46288d_Dne() / 5 : cLK.method_ae128dba_bzF() / 5;
    }

    @Override
    public boolean method_f28ef3a4_Dne(Qnq qnq, Random random, CLK cLK) {
        int n;
        int n2;
        int n3;
        if (this.method_d2c2fe50_Dne(qnq, cLK)) {
            return false;
        }
        int n4 = this.field_2092ae_Dne * 5 - 1;
        this.method_3d7d4888_Dne(qnq, cLK, 0, 0, 0, 2, 1, n4, 0, 0, false);
        this.method_3985c3cc_Dne(qnq, cLK, random, 0.8f, 0, 2, 0, 2, 2, n4, 0, 0, false);
        if (this.field_21261e_FWm) {
            this.method_3985c3cc_Dne(qnq, cLK, random, 0.6f, 0, 0, 0, 2, 1, n4, zKP.field_8e87c719_vSL.field_21260d_FWm, 0, false);
        }
        for (n3 = 0; n3 < this.field_2092ae_Dne; ++n3) {
            n2 = 2 + n3 * 5;
            this.method_3d7d4888_Dne(qnq, cLK, 0, 0, n2, 0, 1, n2, zKP.field_ce2a1dc8_sly.field_21260d_FWm, 0, false);
            this.method_3d7d4888_Dne(qnq, cLK, 2, 0, n2, 2, 1, n2, zKP.field_ce2a1dc8_sly.field_21260d_FWm, 0, false);
            if (random.nextInt(4) == 0) {
                this.method_3d7d4888_Dne(qnq, cLK, 0, 2, n2, 0, 2, n2, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, 0, false);
                this.method_3d7d4888_Dne(qnq, cLK, 2, 2, n2, 2, 2, n2, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, 0, false);
            } else {
                this.method_3d7d4888_Dne(qnq, cLK, 0, 2, n2, 2, 2, n2, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, 0, false);
            }
            this.method_9acc30bb_Dne(qnq, cLK, random, 0.1f, 0, 2, n2 - 1, zKP.field_8e87c719_vSL.field_21260d_FWm, 0);
            this.method_9acc30bb_Dne(qnq, cLK, random, 0.1f, 2, 2, n2 - 1, zKP.field_8e87c719_vSL.field_21260d_FWm, 0);
            this.method_9acc30bb_Dne(qnq, cLK, random, 0.1f, 0, 2, n2 + 1, zKP.field_8e87c719_vSL.field_21260d_FWm, 0);
            this.method_9acc30bb_Dne(qnq, cLK, random, 0.1f, 2, 2, n2 + 1, zKP.field_8e87c719_vSL.field_21260d_FWm, 0);
            this.method_9acc30bb_Dne(qnq, cLK, random, 0.05f, 0, 2, n2 - 2, zKP.field_8e87c719_vSL.field_21260d_FWm, 0);
            this.method_9acc30bb_Dne(qnq, cLK, random, 0.05f, 2, 2, n2 - 2, zKP.field_8e87c719_vSL.field_21260d_FWm, 0);
            this.method_9acc30bb_Dne(qnq, cLK, random, 0.05f, 0, 2, n2 + 2, zKP.field_8e87c719_vSL.field_21260d_FWm, 0);
            this.method_9acc30bb_Dne(qnq, cLK, random, 0.05f, 2, 2, n2 + 2, zKP.field_8e87c719_vSL.field_21260d_FWm, 0);
            this.method_9acc30bb_Dne(qnq, cLK, random, 0.05f, 1, 2, n2 - 1, zKP.field_954cd4c3_Wwe.field_21260d_FWm, 0);
            this.method_9acc30bb_Dne(qnq, cLK, random, 0.05f, 1, 2, n2 + 1, zKP.field_954cd4c3_Wwe.field_21260d_FWm, 0);
            if (random.nextInt(100) == 0) {
                this.method_f8f1dd60_Dne(qnq, cLK, random, 2, 0, n2 - 1, fKu.method_3e9b7320_Dne(FUM.method_5703e2d8_Dne(), dEr.field_374f605_Dne.method_d15b82c7_Dne(random)), 3 + random.nextInt(4));
            }
            if (random.nextInt(100) == 0) {
                this.method_f8f1dd60_Dne(qnq, cLK, random, 0, 0, n2 + 1, fKu.method_3e9b7320_Dne(FUM.method_5703e2d8_Dne(), dEr.field_374f605_Dne.method_d15b82c7_Dne(random)), 3 + random.nextInt(4));
            }
            if (!this.field_21261e_FWm || this.field_2e5f2c_bzF) continue;
            n = this.method_ce7f5d9c_Dne(0);
            int n5 = n2 - 1 + random.nextInt(3);
            int n6 = this.method_16cca6d_Dne(1, n5);
            if (!cLK.method_2c2cf7cd_Dne(n6, n, n5 = this.method_1e26964c_FWm(1, n5))) continue;
            this.field_2e5f2c_bzF = true;
            qnq.method_17d7ea9d_FWm(n6, n, n5, zKP.field_fdf84104_eJi.field_21260d_FWm, 0, 2);
            ySb ySb2 = (ySb)qnq.method_d98e681d_Dne(n6, n, n5);
            if (ySb2 == null) continue;
            ySb2.method_2304785c_Dne().method_8f501fe4_Dne("CaveSpider");
        }
        for (n3 = 0; n3 <= 2; ++n3) {
            for (n2 = 0; n2 <= n4; ++n2) {
                n = this.method_3b27a7c2_Dne(qnq, n3, -1, n2, cLK);
                if (n != 0) continue;
                this.method_b5ae8f6f_Dne(qnq, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, 0, n3, -1, n2, cLK);
            }
        }
        if (this.field_2092bf_Dne) {
            for (n3 = 0; n3 <= n4; ++n3) {
                n2 = this.method_3b27a7c2_Dne(qnq, 1, -1, n3, cLK);
                if (n2 <= 0 || !zKP.field_4039e1b_FWm[n2]) continue;
                this.method_9acc30bb_Dne(qnq, cLK, random, 0.7f, 1, 0, n3, zKP.field_69989981_FYZ.field_21260d_FWm, this.method_73b4985a_bzF(zKP.field_69989981_FYZ.field_21260d_FWm, 0));
            }
        }
        return true;
    }

    @Override
    protected boolean method_f8f1dd60_Dne(Qnq qnq, CLK cLK, Random random, int n, int n2, int n3, fKu[] fKuArray, int n4) {
        int n5;
        int n6;
        int n7 = this.method_16cca6d_Dne(n, n3);
        if (cLK.method_2c2cf7cd_Dne(n7, n6 = this.method_ce7f5d9c_Dne(n2), n5 = this.method_1e26964c_FWm(n, n3)) && qnq.method_2c2cf7bc_Dne(n7, n6, n5) == 0) {
            qnq.method_17d7ea9d_FWm(n7, n6, n5, zKP.field_69989981_FYZ.field_21260d_FWm, this.method_73b4985a_bzF(zKP.field_69989981_FYZ.field_21260d_FWm, random.nextBoolean() ? 1 : 0), 2);
            bnY bnY2 = new bnY(qnq, (float)n7 + 0.5f, (float)n6 + 0.5f, (float)n5 + 0.5f);
            fKu.method_ead777d3_Dne(random, fKuArray, bnY2, n4);
            qnq.method_94d18be5_FWm(bnY2);
            return true;
        }
        return false;
    }

    @Override
    public void method_dbe42dde_Dne(bvz bvz2, List list, Random random) {
        block24: {
            int n = this.method_7a46288d_Dne();
            int n2 = random.nextInt(4);
            switch (this.field_2d29f4_aFZ) {
                case 0: {
                    if (n2 <= 1) {
                        FUM.method_80be7ff0_Dne(bvz2, list, random, this.field_3656daa_Dne.field_2092ae_Dne, this.field_3656daa_Dne.field_21260d_FWm - 1 + random.nextInt(3), this.field_3656daa_Dne.field_388da6_zGp + 1, this.field_2d29f4_aFZ, n);
                        break;
                    }
                    if (n2 == 2) {
                        FUM.method_80be7ff0_Dne(bvz2, list, random, this.field_3656daa_Dne.field_2092ae_Dne - 1, this.field_3656daa_Dne.field_21260d_FWm - 1 + random.nextInt(3), this.field_3656daa_Dne.field_388da6_zGp - 3, 1, n);
                        break;
                    }
                    FUM.method_80be7ff0_Dne(bvz2, list, random, this.field_3656daa_Dne.field_267cf5_Qnq + 1, this.field_3656daa_Dne.field_21260d_FWm - 1 + random.nextInt(3), this.field_3656daa_Dne.field_388da6_zGp - 3, 3, n);
                    break;
                }
                case 1: {
                    if (n2 <= 1) {
                        FUM.method_80be7ff0_Dne(bvz2, list, random, this.field_3656daa_Dne.field_2092ae_Dne - 1, this.field_3656daa_Dne.field_21260d_FWm - 1 + random.nextInt(3), this.field_3656daa_Dne.field_2e5f1b_bzF, this.field_2d29f4_aFZ, n);
                        break;
                    }
                    if (n2 == 2) {
                        FUM.method_80be7ff0_Dne(bvz2, list, random, this.field_3656daa_Dne.field_2092ae_Dne, this.field_3656daa_Dne.field_21260d_FWm - 1 + random.nextInt(3), this.field_3656daa_Dne.field_2e5f1b_bzF - 1, 2, n);
                        break;
                    }
                    FUM.method_80be7ff0_Dne(bvz2, list, random, this.field_3656daa_Dne.field_2092ae_Dne, this.field_3656daa_Dne.field_21260d_FWm - 1 + random.nextInt(3), this.field_3656daa_Dne.field_388da6_zGp + 1, 0, n);
                    break;
                }
                case 2: {
                    if (n2 <= 1) {
                        FUM.method_80be7ff0_Dne(bvz2, list, random, this.field_3656daa_Dne.field_2092ae_Dne, this.field_3656daa_Dne.field_21260d_FWm - 1 + random.nextInt(3), this.field_3656daa_Dne.field_2e5f1b_bzF - 1, this.field_2d29f4_aFZ, n);
                        break;
                    }
                    if (n2 == 2) {
                        FUM.method_80be7ff0_Dne(bvz2, list, random, this.field_3656daa_Dne.field_2092ae_Dne - 1, this.field_3656daa_Dne.field_21260d_FWm - 1 + random.nextInt(3), this.field_3656daa_Dne.field_2e5f1b_bzF, 1, n);
                        break;
                    }
                    FUM.method_80be7ff0_Dne(bvz2, list, random, this.field_3656daa_Dne.field_267cf5_Qnq + 1, this.field_3656daa_Dne.field_21260d_FWm - 1 + random.nextInt(3), this.field_3656daa_Dne.field_2e5f1b_bzF, 3, n);
                    break;
                }
                case 3: {
                    if (n2 <= 1) {
                        FUM.method_80be7ff0_Dne(bvz2, list, random, this.field_3656daa_Dne.field_267cf5_Qnq + 1, this.field_3656daa_Dne.field_21260d_FWm - 1 + random.nextInt(3), this.field_3656daa_Dne.field_2e5f1b_bzF, this.field_2d29f4_aFZ, n);
                        break;
                    }
                    if (n2 == 2) {
                        FUM.method_80be7ff0_Dne(bvz2, list, random, this.field_3656daa_Dne.field_267cf5_Qnq - 3, this.field_3656daa_Dne.field_21260d_FWm - 1 + random.nextInt(3), this.field_3656daa_Dne.field_2e5f1b_bzF - 1, 2, n);
                        break;
                    }
                    FUM.method_80be7ff0_Dne(bvz2, list, random, this.field_3656daa_Dne.field_267cf5_Qnq - 3, this.field_3656daa_Dne.field_21260d_FWm - 1 + random.nextInt(3), this.field_3656daa_Dne.field_388da6_zGp + 1, 0, n);
                }
            }
            if (n >= 8) break block24;
            if (this.field_2d29f4_aFZ != 2 && this.field_2d29f4_aFZ != 0) {
                int n3 = this.field_3656daa_Dne.field_2092ae_Dne + 3;
                while (n3 + 3 <= this.field_3656daa_Dne.field_267cf5_Qnq) {
                    int n4 = random.nextInt(5);
                    if (n4 == 0) {
                        FUM.method_80be7ff0_Dne(bvz2, list, random, n3, this.field_3656daa_Dne.field_21260d_FWm, this.field_3656daa_Dne.field_2e5f1b_bzF - 1, 2, n + 1);
                    } else if (n4 == 1) {
                        FUM.method_80be7ff0_Dne(bvz2, list, random, n3, this.field_3656daa_Dne.field_21260d_FWm, this.field_3656daa_Dne.field_388da6_zGp + 1, 0, n + 1);
                    }
                    n3 += 5;
                }
            } else {
                int n5 = this.field_3656daa_Dne.field_2e5f1b_bzF + 3;
                while (n5 + 3 <= this.field_3656daa_Dne.field_388da6_zGp) {
                    int n6 = random.nextInt(5);
                    if (n6 == 0) {
                        FUM.method_80be7ff0_Dne(bvz2, list, random, this.field_3656daa_Dne.field_2092ae_Dne - 1, this.field_3656daa_Dne.field_21260d_FWm, n5, 1, n + 1);
                    } else if (n6 == 1) {
                        FUM.method_80be7ff0_Dne(bvz2, list, random, this.field_3656daa_Dne.field_267cf5_Qnq + 1, this.field_3656daa_Dne.field_21260d_FWm, n5, 3, n + 1);
                    }
                    n5 += 5;
                }
            }
        }
    }

    public static CLK method_b560cbe6_Dne(List list, Random random, int n, int n2, int n3, int n4) {
        int n5;
        CLK cLK = new CLK(n, n2, n3, n, n2 + 2, n3);
        for (n5 = random.nextInt(3) + 2; n5 > 0; --n5) {
            int n6 = n5 * 5;
            switch (n4) {
                case 0: {
                    cLK.field_267cf5_Qnq = n + 2;
                    cLK.field_388da6_zGp = n3 + (n6 - 1);
                    break;
                }
                case 1: {
                    cLK.field_2092ae_Dne = n - (n6 - 1);
                    cLK.field_388da6_zGp = n3 + 2;
                    break;
                }
                case 2: {
                    cLK.field_267cf5_Qnq = n + 2;
                    cLK.field_2e5f1b_bzF = n3 - (n6 - 1);
                    break;
                }
                case 3: {
                    cLK.field_267cf5_Qnq = n + (n6 - 1);
                    cLK.field_388da6_zGp = n3 + 2;
                }
            }
            if (bvz.method_9e83199f_Dne(list, cLK) == null) break;
        }
        return n5 > 0 ? cLK : null;
    }
}

