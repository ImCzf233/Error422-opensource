package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class iqp
extends zKP {
    private int[] field_3f1c589_Dne = new int[256];
    private int[] field_4a92422_Qnq = new int[256];
    private gDn[] field_836bfe96_Dne;

    public gDn method_9e795529_Dne(int n) {
        return this.field_836bfe96_Dne[n];
    }

    private boolean method_54527961_bzF(Qnq qnq, int n, int n2, int n3) {
        return this.method_8f2f2092_FWm(qnq, n + 1, n2, n3) ? true : (this.method_8f2f2092_FWm(qnq, n - 1, n2, n3) ? true : (this.method_8f2f2092_FWm(qnq, n, n2 - 1, n3) ? true : (this.method_8f2f2092_FWm(qnq, n, n2 + 1, n3) ? true : (this.method_8f2f2092_FWm(qnq, n, n2, n3 - 1) ? true : this.method_8f2f2092_FWm(qnq, n, n2, n3 + 1)))));
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        this.field_836bfe96_Dne = new gDn[]{rbp.method_285881e4_Dne("fire_0"), rbp.method_285881e4_Dne("fire_1")};
    }

    @Override
    public void method_7c6f6039_FWm() {
        this.method_2c2cf7c9_Dne(zKP.field_5e67d9b4_Qnq.field_21260d_FWm, 5, 20);
        this.method_2c2cf7c9_Dne(zKP.field_75bc446f_bzF.field_21260d_FWm, 5, 20);
        this.method_2c2cf7c9_Dne(zKP.field_5e5de549_Qnq.field_21260d_FWm, 5, 20);
        this.method_2c2cf7c9_Dne(zKP.field_ce2a1dc8_sly.field_21260d_FWm, 5, 20);
        this.method_2c2cf7c9_Dne(zKP.field_7a2b5882_One.field_21260d_FWm, 5, 20);
        this.method_2c2cf7c9_Dne(zKP.field_86f708eb_Kvh.field_21260d_FWm, 5, 20);
        this.method_2c2cf7c9_Dne(zKP.field_68ab5f46_CLK.field_21260d_FWm, 5, 20);
        this.method_2c2cf7c9_Dne(zKP.field_7fd0ac6a_FUM.field_21260d_FWm, 5, 20);
        this.method_2c2cf7c9_Dne(zKP.field_af0f1368_udO.field_21260d_FWm, 5, 5);
        this.method_2c2cf7c9_Dne(zKP.field_36e218c_Dne.field_21260d_FWm, 30, 60);
        this.method_2c2cf7c9_Dne(zKP.field_24a90a48_AgF.field_21260d_FWm, 30, 20);
        this.method_2c2cf7c9_Dne(zKP.field_cb5aacc0_qXo.field_21260d_FWm, 15, 100);
        this.method_2c2cf7c9_Dne(zKP.field_36dc147_Dne.field_21260d_FWm, 60, 100);
        this.method_2c2cf7c9_Dne(zKP.field_9f40014e_RPx.field_21260d_FWm, 30, 60);
        this.method_2c2cf7c9_Dne(zKP.field_728b3649_ipf.field_21260d_FWm, 15, 100);
        if (eCD.method_ce7f5d9c_Dne(1000) == 0) {
            this.method_2c2cf7c9_Dne(zKP.field_3774324_Dne.field_21260d_FWm, 1, 10);
        }
    }

    @Override
    public void method_ff5e68fb_FWm(Qnq qnq, int n, int n2, int n3, Random random) {
        block12: {
            block11: {
                float f;
                float f2;
                float f3;
                int n4;
                if (random.nextInt(24) == 0) {
                    qnq.method_62d7c9a6_Dne((float)n + 0.5f, (float)n2 + 0.5f, (float)n3 + 0.5f, "fire.fire", 1.0f + random.nextFloat(), random.nextFloat() * 0.7f + 0.3f, false);
                }
                if (qnq.method_73e9b8f9_IjH(n, n2 - 1, n3) || zKP.field_3774324_Dne.method_8f2f2092_FWm(qnq, n, n2 - 1, n3)) break block11;
                if (zKP.field_3774324_Dne.method_8f2f2092_FWm(qnq, n - 1, n2, n3)) {
                    for (n4 = 0; n4 < 2; ++n4) {
                        f3 = (float)n + random.nextFloat() * 0.1f;
                        f2 = (float)n2 + random.nextFloat();
                        f = (float)n3 + random.nextFloat();
                        qnq.method_8600ec24_Dne("largesmoke", f3, f2, f, 0.0, 0.0, 0.0);
                    }
                }
                if (zKP.field_3774324_Dne.method_8f2f2092_FWm(qnq, n + 1, n2, n3)) {
                    for (n4 = 0; n4 < 2; ++n4) {
                        f3 = (float)(n + 1) - random.nextFloat() * 0.1f;
                        f2 = (float)n2 + random.nextFloat();
                        f = (float)n3 + random.nextFloat();
                        qnq.method_8600ec24_Dne("largesmoke", f3, f2, f, 0.0, 0.0, 0.0);
                    }
                }
                if (zKP.field_3774324_Dne.method_8f2f2092_FWm(qnq, n, n2, n3 - 1)) {
                    for (n4 = 0; n4 < 2; ++n4) {
                        f3 = (float)n + random.nextFloat();
                        f2 = (float)n2 + random.nextFloat();
                        f = (float)n3 + random.nextFloat() * 0.1f;
                        qnq.method_8600ec24_Dne("largesmoke", f3, f2, f, 0.0, 0.0, 0.0);
                    }
                }
                if (zKP.field_3774324_Dne.method_8f2f2092_FWm(qnq, n, n2, n3 + 1)) {
                    for (n4 = 0; n4 < 2; ++n4) {
                        f3 = (float)n + random.nextFloat();
                        f2 = (float)n2 + random.nextFloat();
                        f = (float)(n3 + 1) - random.nextFloat() * 0.1f;
                        qnq.method_8600ec24_Dne("largesmoke", f3, f2, f, 0.0, 0.0, 0.0);
                    }
                }
                if (!zKP.field_3774324_Dne.method_8f2f2092_FWm(qnq, n, n2 + 1, n3)) break block12;
                for (n4 = 0; n4 < 2; ++n4) {
                    f3 = (float)n + random.nextFloat();
                    f2 = (float)(n2 + 1) - random.nextFloat() * 0.1f;
                    f = (float)n3 + random.nextFloat();
                    qnq.method_8600ec24_Dne("largesmoke", f3, f2, f, 0.0, 0.0, 0.0);
                }
                break block12;
            }
            for (int i = 0; i < 3; ++i) {
                float f = (float)n + random.nextFloat();
                float f4 = (float)n2 + random.nextFloat() * 0.5f + 0.5f;
                float f5 = (float)n3 + random.nextFloat();
                qnq.method_8600ec24_Dne("largesmoke", f, f4, f5, 0.0, 0.0, 0.0);
            }
        }
    }

    @Override
    public boolean method_7ad38807_DyG() {
        return false;
    }

    private void method_2c2cf7c9_Dne(int n, int n2, int n3) {
        this.field_3f1c589_Dne[n] = n2;
        this.field_4a92422_Qnq[n] = n3;
    }

    @Override
    public int method_7a46288d_Dne() {
        return 3;
    }

    @Override
    public int method_cfc9daf9_Dne(Random random) {
        return 0;
    }

    @Override
    public int method_83516086_Dne(Qnq qnq) {
        return 30;
    }

    public boolean method_8f2f2092_FWm(Zpi zpi, int n, int n2, int n3) {
        return this.field_3f1c589_Dne[zpi.method_2c2cf7bc_Dne(n, n2, n3)] > 0;
    }

    @Override
    public boolean method_d44b4596_zGp() {
        return false;
    }

    private int method_54527950_bzF(Qnq qnq, int n, int n2, int n3) {
        int n4 = 0;
        if (!qnq.method_2c2cf7cd_Dne(n, n2, n3)) {
            return 0;
        }
        int n5 = this.method_d6a0f307_FWm(qnq, n + 1, n2, n3, n4);
        n5 = this.method_d6a0f307_FWm(qnq, n - 1, n2, n3, n5);
        n5 = this.method_d6a0f307_FWm(qnq, n, n2 - 1, n3, n5);
        n5 = this.method_d6a0f307_FWm(qnq, n, n2 + 1, n3, n5);
        n5 = this.method_d6a0f307_FWm(qnq, n, n2, n3 - 1, n5);
        n5 = this.method_d6a0f307_FWm(qnq, n, n2, n3 + 1, n5);
        return n5;
    }

    private void method_53bf74e4_Dne(Qnq qnq, int n, int n2, int n3, int n4, Random random, int n5) {
        int n6 = this.field_4a92422_Qnq[qnq.method_2c2cf7bc_Dne(n, n2, n3)];
        if (random.nextInt(n4) < n6) {
            boolean bl;
            boolean bl2 = bl = qnq.method_2c2cf7bc_Dne(n, n2, n3) == zKP.field_cb5aacc0_qXo.field_21260d_FWm;
            if (random.nextInt(n5 + 10) < 5 && !qnq.method_f2b15eb2_udO(n, n2, n3)) {
                int n7 = n5 + random.nextInt(5) / 4;
                if (n7 > 15) {
                    n7 = 15;
                }
                qnq.method_17d7ea9d_FWm(n, n2, n3, this.field_21260d_FWm, n7, 3);
            } else {
                qnq.method_2e7161e6_Qnq(n, n2, n3);
            }
            if (bl) {
                zKP.field_cb5aacc0_qXo.method_35fd2546_bzF(qnq, n, n2, n3, 1);
            }
        }
    }

    public int method_d6a0f307_FWm(Qnq qnq, int n, int n2, int n3, int n4) {
        int n5 = this.field_3f1c589_Dne[qnq.method_2c2cf7bc_Dne(n, n2, n3)];
        return n5 > n4 ? n5 : n4;
    }

    @Override
    public bSp method_8c85fe2_Dne(Qnq qnq, int n, int n2, int n3) {
        return null;
    }

    @Override
    public void method_9cb39130_Dne(Qnq qnq, int n, int n2, int n3) {
        if (qnq.field_3690d00_Dne.field_2092ae_Dne > 0 || qnq.method_2c2cf7bc_Dne(n, n2 - 1, n3) != zKP.field_e641c680_cot.field_21260d_FWm || !zKP.field_36c4090_Dne.method_54527961_bzF(qnq, n, n2, n3)) {
            if (!qnq.method_73e9b8f9_IjH(n, n2 - 1, n3) && !this.method_54527961_bzF(qnq, n, n2, n3)) {
                qnq.method_2e7161e6_Qnq(n, n2, n3);
            } else {
                qnq.method_ae303daa_FWm(n, n2, n3, this.field_21260d_FWm, this.method_83516086_Dne(qnq) + qnq.field_7331eae7_Dne.nextInt(10));
            }
        }
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return false;
    }

    @Override
    public gDn method_9051f17a_Dne(int n, int n2) {
        return this.field_836bfe96_Dne[0];
    }

    @Override
    public void method_ca828a1c_Dne(Qnq qnq, int n, int n2, int n3, Random random) {
        if (qnq.method_230cbc5a_Dne().method_8f501fe8_Dne("doFireTick")) {
            boolean bl;
            boolean bl2 = bl = qnq.method_2c2cf7bc_Dne(n, n2 - 1, n3) == zKP.field_b3a6b297_KLR.field_21260d_FWm;
            if (qnq.field_3690d00_Dne instanceof TKg && qnq.method_2c2cf7bc_Dne(n, n2 - 1, n3) == zKP.field_f0b029e5_zGp.field_21260d_FWm) {
                bl = true;
            }
            if (!this.method_9cb39134_Dne(qnq, n, n2, n3)) {
                qnq.method_2e7161e6_Qnq(n, n2, n3);
            }
            if (!bl && qnq.method_ae128dcb_bzF() && (qnq.method_f2b15eb2_udO(n, n2, n3) || qnq.method_f2b15eb2_udO(n - 1, n2, n3) || qnq.method_f2b15eb2_udO(n + 1, n2, n3) || qnq.method_f2b15eb2_udO(n, n2, n3 - 1) || qnq.method_f2b15eb2_udO(n, n2, n3 + 1))) {
                qnq.method_2e7161e6_Qnq(n, n2, n3);
            } else {
                int n4 = qnq.method_2dee76f_bzF(n, n2, n3);
                if (n4 < 15) {
                    qnq.method_d4dc89ed_Dne(n, n2, n3, n4 + random.nextInt(3) / 2, 4);
                }
                qnq.method_ae303daa_FWm(n, n2, n3, this.field_21260d_FWm, this.method_83516086_Dne(qnq) + random.nextInt(10));
                if (!bl && !this.method_54527961_bzF(qnq, n, n2, n3)) {
                    if (!qnq.method_73e9b8f9_IjH(n, n2 - 1, n3) || n4 > 3) {
                        qnq.method_2e7161e6_Qnq(n, n2, n3);
                    }
                } else if (!bl && !this.method_8f2f2092_FWm(qnq, n, n2 - 1, n3) && n4 == 15 && random.nextInt(4) == 0) {
                    qnq.method_2e7161e6_Qnq(n, n2, n3);
                } else {
                    boolean bl3 = qnq.method_7b8cc9d7_ooe(n, n2, n3);
                    int n5 = 0;
                    if (bl3) {
                        n5 = -50;
                    }
                    this.method_53bf74e4_Dne(qnq, n + 1, n2, n3, 300 + n5, random, n4);
                    this.method_53bf74e4_Dne(qnq, n - 1, n2, n3, 300 + n5, random, n4);
                    this.method_53bf74e4_Dne(qnq, n, n2 - 1, n3, 250 + n5, random, n4);
                    this.method_53bf74e4_Dne(qnq, n, n2 + 1, n3, 250 + n5, random, n4);
                    this.method_53bf74e4_Dne(qnq, n, n2, n3 - 1, 300 + n5, random, n4);
                    this.method_53bf74e4_Dne(qnq, n, n2, n3 + 1, 300 + n5, random, n4);
                    for (int i = n - 1; i <= n + 1; ++i) {
                        for (int j = n3 - 1; j <= n3 + 1; ++j) {
                            for (int k = n2 - 1; k <= n2 + 4; ++k) {
                                int n6;
                                if (i == n && k == n2 && j == n3) continue;
                                int n7 = 100;
                                if (k > n2 + 1) {
                                    n7 += (k - (n2 + 1)) * 100;
                                }
                                if ((n6 = this.method_54527950_bzF(qnq, i, k, j)) <= 0) continue;
                                int n8 = (n6 + 40 + qnq.field_2d29f4_aFZ * 7) / (n4 + 30);
                                if (bl3) {
                                    n8 /= 2;
                                }
                                if (n8 <= 0 || random.nextInt(n7) > n8 || qnq.method_ae128dcb_bzF() && qnq.method_f2b15eb2_udO(i, k, j) || qnq.method_f2b15eb2_udO(i - 1, k, n3) || qnq.method_f2b15eb2_udO(i + 1, k, j) || qnq.method_f2b15eb2_udO(i, k, j - 1) || qnq.method_f2b15eb2_udO(i, k, j + 1)) continue;
                                int n9 = n4 + random.nextInt(5) / 4;
                                if (n9 > 15) {
                                    n9 = 15;
                                }
                                qnq.method_17d7ea9d_FWm(i, k, j, this.field_21260d_FWm, n9, 3);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override
    public boolean method_9cb39134_Dne(Qnq qnq, int n, int n2, int n3) {
        return qnq.method_73e9b8f9_IjH(n, n2 - 1, n3) || this.method_54527961_bzF(qnq, n, n2, n3);
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return false;
    }

    @Override
    public void method_f9bf07d3_Dne(Qnq qnq, int n, int n2, int n3, int n4) {
        if (!qnq.method_73e9b8f9_IjH(n, n2 - 1, n3) && !this.method_54527961_bzF(qnq, n, n2, n3)) {
            qnq.method_2e7161e6_Qnq(n, n2, n3);
        }
    }

    protected iqp(int n) {
        super(n, KFd.field_ab21c1d9_ooe);
        this.method_21cbfe2c_Dne(true);
    }
}

