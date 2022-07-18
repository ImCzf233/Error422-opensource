package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public abstract class byt
extends zKP {
    private gDn[] field_836bfe96_Dne;

    @Override
    public int method_cfc9daf9_Dne(Random random) {
        return 0;
    }

    @Override
    public gDn method_9051f17a_Dne(int n, int n2) {
        return n != 0 && n != 1 ? this.field_836bfe96_Dne[1] : this.field_836bfe96_Dne[0];
    }

    @Override
    public boolean method_79d378f8_Dne(Zpi zpi, int n, int n2, int n3, int n4) {
        KFd kFd = zpi.method_d9802b31_Dne(n, n2, n3);
        return kFd == this.field_368fd23_Dne ? false : (n4 == 1 ? true : (kFd == KFd.field_d4241ab_FfS ? false : super.method_79d378f8_Dne(zpi, n, n2, n3, n4)));
    }

    @Override
    public int method_fbabf7e2_Dne(Zpi zpi, int n, int n2, int n3) {
        if (this.field_368fd23_Dne != KFd.field_1411d34d_div) {
            return 0xFFFFFF;
        }
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        for (int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                int n7 = zpi.method_90477c37_Dne((int)(n + j), (int)(n3 + i)).field_2e5f1b_bzF;
                n4 += (n7 & 0xFF0000) >> 16;
                n5 += (n7 & 0xFF00) >> 8;
                n6 += n7 & 0xFF;
            }
        }
        return (n4 / 9 & 0xFF) << 16 | (n5 / 9 & 0xFF) << 8 | n6 / 9 & 0xFF;
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return false;
    }

    @Override
    public int method_83516086_Dne(Qnq qnq) {
        return this.field_368fd23_Dne == KFd.field_1411d34d_div ? 5 : (this.field_368fd23_Dne == KFd.field_5b96677_IjH ? (qnq.field_3690d00_Dne.field_21261e_FWm ? 10 : 30) : 0);
    }

    @Override
    public boolean method_fbabf7f3_Dne(Zpi zpi, int n, int n2, int n3) {
        return this.field_368fd23_Dne != KFd.field_5b96677_IjH;
    }

    protected int method_8f2f2081_FWm(Zpi zpi, int n, int n2, int n3) {
        if (zpi.method_d9802b31_Dne(n, n2, n3) != this.field_368fd23_Dne) {
            return -1;
        }
        int n4 = zpi.method_2dee76f_bzF(n, n2, n3);
        if (n4 >= 8) {
            n4 = 0;
        }
        return n4;
    }

    @Override
    public int method_b34ae00f_bzF(Zpi zpi, int n, int n2, int n3) {
        int n4 = zpi.method_5972744d_Dne(n, n2, n3, 0);
        int n5 = zpi.method_5972744d_Dne(n, n2 + 1, n3, 0);
        int n6 = n4 & 0xFF;
        int n7 = n5 & 0xFF;
        int n8 = n4 >> 16 & 0xFF;
        int n9 = n5 >> 16 & 0xFF;
        return (n6 > n7 ? n6 : n7) | (n8 > n9 ? n8 : n9) << 16;
    }

    @Override
    public int method_24763341_Dne(int n, Random random, int n2) {
        return 0;
    }

    @Override
    public boolean method_56b56439_FWm(Zpi zpi, int n, int n2, int n3, int n4) {
        KFd kFd = zpi.method_d9802b31_Dne(n, n2, n3);
        return kFd == this.field_368fd23_Dne ? false : (n4 == 1 ? true : (kFd == KFd.field_d4241ab_FfS ? false : super.method_56b56439_FWm(zpi, n, n2, n3, n4)));
    }

    protected byt(int n, KFd kFd) {
        super(n, kFd);
        float f = 0.0f;
        float f2 = 0.0f;
        this.method_eb14b51a_Dne(0.0f + f2, 0.0f + f, 0.0f + f2, 1.0f + f2, 1.0f + f, 1.0f + f2);
        this.method_21cbfe2c_Dne(true);
    }

    @Override
    public int method_582b28a_a_() {
        return this.field_368fd23_Dne == KFd.field_1411d34d_div ? 1 : 0;
    }

    private chN method_d3a20e37_Dne(Zpi zpi, int n, int n2, int n3) {
        int n4;
        chN chN2 = zpi.method_23186a47_Dne().method_e4505d6c_Dne(0.0, 0.0, 0.0);
        int n5 = this.method_8f2f2081_FWm(zpi, n, n2, n3);
        for (n4 = 0; n4 < 4; ++n4) {
            int n6;
            int n7;
            int n8 = n;
            int n9 = n3;
            if (n4 == 0) {
                n8 = n - 1;
            }
            if (n4 == 1) {
                n9 = n3 - 1;
            }
            if (n4 == 2) {
                ++n8;
            }
            if (n4 == 3) {
                ++n9;
            }
            if ((n7 = this.method_8f2f2081_FWm(zpi, n8, n2, n9)) < 0) {
                if (zpi.method_d9802b31_Dne(n8, n2, n9).method_ae128dcb_bzF() || (n7 = this.method_8f2f2081_FWm(zpi, n8, n2 - 1, n9)) < 0) continue;
                n6 = n7 - (n5 - 8);
                chN2 = chN2.method_2c4d3b9f_bzF((n8 - n) * n6, (n2 - n2) * n6, (n9 - n3) * n6);
                continue;
            }
            if (n7 < 0) continue;
            n6 = n7 - n5;
            chN2 = chN2.method_2c4d3b9f_bzF((n8 - n) * n6, (n2 - n2) * n6, (n9 - n3) * n6);
        }
        if (zpi.method_2dee76f_bzF(n, n2, n3) >= 8) {
            n4 = 0;
            if (n4 != 0 || this.method_56b56439_FWm(zpi, n, n2, n3 - 1, 2)) {
                n4 = 1;
            }
            if (n4 != 0 || this.method_56b56439_FWm(zpi, n, n2, n3 + 1, 3)) {
                n4 = 1;
            }
            if (n4 != 0 || this.method_56b56439_FWm(zpi, n - 1, n2, n3, 4)) {
                n4 = 1;
            }
            if (n4 != 0 || this.method_56b56439_FWm(zpi, n + 1, n2, n3, 5)) {
                n4 = 1;
            }
            if (n4 != 0 || this.method_56b56439_FWm(zpi, n, n2 + 1, n3 - 1, 2)) {
                n4 = 1;
            }
            if (n4 != 0 || this.method_56b56439_FWm(zpi, n, n2 + 1, n3 + 1, 3)) {
                n4 = 1;
            }
            if (n4 != 0 || this.method_56b56439_FWm(zpi, n - 1, n2 + 1, n3, 4)) {
                n4 = 1;
            }
            if (n4 != 0 || this.method_56b56439_FWm(zpi, n + 1, n2 + 1, n3, 5)) {
                n4 = 1;
            }
            if (n4 != 0) {
                chN2 = chN2.method_230df162_Dne().method_2c4d3b9f_bzF(0.0, -6.0, 0.0);
            }
        }
        chN2 = chN2.method_230df162_Dne();
        return chN2;
    }

    public static gDn method_285881e4_Dne(String string) {
        return string == "water" ? zKP.field_374330f_Dne.field_836bfe96_Dne[0] : (string == "water_flow" ? zKP.field_374330f_Dne.field_836bfe96_Dne[1] : (string == "lava" ? zKP.field_202dfeee_FWm.field_836bfe96_Dne[0] : (string == "lava_flow" ? zKP.field_202dfeee_FWm.field_836bfe96_Dne[1] : null)));
    }

    @Override
    public bSp method_8c85fe2_Dne(Qnq qnq, int n, int n2, int n3) {
        return null;
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        this.field_836bfe96_Dne = this.field_368fd23_Dne == KFd.field_5b96677_IjH ? new gDn[]{rbp.method_285881e4_Dne("lava"), rbp.method_285881e4_Dne("lava_flow")} : new gDn[]{rbp.method_285881e4_Dne("water"), rbp.method_285881e4_Dne("water_flow")};
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return false;
    }

    protected int method_54527950_bzF(Qnq qnq, int n, int n2, int n3) {
        return qnq.method_d9802b31_Dne(n, n2, n3) == this.field_368fd23_Dne ? qnq.method_2dee76f_bzF(n, n2, n3) : -1;
    }

    @Override
    public boolean method_16d0a4f_Dne(int n, boolean bl) {
        return bl && n == 0;
    }

    public static double method_d8ca3597_Dne(Zpi zpi, int n, int n2, int n3, KFd kFd) {
        chN chN2 = null;
        if (kFd == KFd.field_1411d34d_div) {
            chN2 = zKP.field_374330f_Dne.method_d3a20e37_Dne(zpi, n, n2, n3);
        }
        if (kFd == KFd.field_5b96677_IjH) {
            chN2 = zKP.field_202dfeee_FWm.method_d3a20e37_Dne(zpi, n, n2, n3);
        }
        return chN2.field_2092a9_Dne == 0.0 && chN2.field_2e5f16_bzF == 0.0 ? -1000.0 : Math.atan2(chN2.field_2e5f16_bzF, chN2.field_2092a9_Dne) - 1.5707963267948966;
    }

    @Override
    public int method_590ca0b_b_() {
        return 0xFFFFFF;
    }

    @Override
    public void method_f9bf07d3_Dne(Qnq qnq, int n, int n2, int n3, int n4) {
        this.method_714a8eb7_Qnq(qnq, n, n2, n3);
    }

    protected void method_5452795d_bzF(Qnq qnq, int n, int n2, int n3) {
        qnq.method_c961c6ee_Dne((float)n + 0.5f, (float)n2 + 0.5f, (float)n3 + 0.5f, "random.fizz", 0.5f, 2.6f + (qnq.field_7331eae7_Dne.nextFloat() - qnq.field_7331eae7_Dne.nextFloat()) * 0.8f);
        for (int i = 0; i < 8; ++i) {
            qnq.method_8600ec24_Dne("largesmoke", (double)n + Math.random(), (double)n2 + 1.2, (double)n3 + Math.random(), 0.0, 0.0, 0.0);
        }
    }

    @Override
    public int method_7a46288d_Dne() {
        return 4;
    }

    @Override
    public float method_fbabf7df_Dne(Zpi zpi, int n, int n2, int n3) {
        float f;
        float f2 = zpi.method_2c2cf7b9_Dne(n, n2, n3);
        return f2 > (f = zpi.method_2c2cf7b9_Dne(n, n2 + 1, n3)) ? f2 : f;
    }

    @Override
    public void method_9cb39130_Dne(Qnq qnq, int n, int n2, int n3) {
        this.method_714a8eb7_Qnq(qnq, n, n2, n3);
    }

    @Override
    public void method_f4575f0e_Dne(Qnq qnq, int n, int n2, int n3, sMa sMa2, chN chN2) {
        chN chN3 = this.method_d3a20e37_Dne(qnq, n, n2, n3);
        chN2.field_2092a9_Dne += chN3.field_2092a9_Dne;
        chN2.field_212608_FWm += chN3.field_212608_FWm;
        chN2.field_2e5f16_bzF += chN3.field_2e5f16_bzF;
    }

    @Override
    public void method_ff5e68fb_FWm(Qnq qnq, int n, int n2, int n3, Random random) {
        double d;
        int n4;
        if (this.field_368fd23_Dne == KFd.field_1411d34d_div) {
            if (random.nextInt(10) == 0 && ((n4 = qnq.method_2dee76f_bzF(n, n2, n3)) <= 0 || n4 >= 8)) {
                qnq.method_8600ec24_Dne("suspended", (float)n + random.nextFloat(), (float)n2 + random.nextFloat(), (float)n3 + random.nextFloat(), 0.0, 0.0, 0.0);
            }
            for (n4 = 0; n4 < 0; ++n4) {
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
                if (qnq.method_d9802b31_Dne(n6, n2, n7) != KFd.field_368fd23_Dne || !qnq.method_d9802b31_Dne(n6, n2 - 1, n7).method_ae128dcb_bzF() && !qnq.method_d9802b31_Dne(n6, n2 - 1, n7).method_907a9d25_Qnq()) continue;
                float f = 0.0625f;
                d = (float)n + random.nextFloat();
                double d2 = (float)n2 + random.nextFloat();
                double d3 = (float)n3 + random.nextFloat();
                if (n5 == 0) {
                    d = (float)n - f;
                }
                if (n5 == 1) {
                    d = (float)(n + 1) + f;
                }
                if (n5 == 2) {
                    d3 = (float)n3 - f;
                }
                if (n5 == 3) {
                    d3 = (float)(n3 + 1) + f;
                }
                double d4 = 0.0;
                double d5 = 0.0;
                if (n5 == 0) {
                    d4 = -f;
                }
                if (n5 == 1) {
                    d4 = f;
                }
                if (n5 == 2) {
                    d5 = -f;
                }
                if (n5 == 3) {
                    d5 = f;
                }
                qnq.method_8600ec24_Dne("splash", d, d2, d3, d4, 0.0, d5);
            }
        }
        if (this.field_368fd23_Dne == KFd.field_1411d34d_div && random.nextInt(64) == 0 && (n4 = qnq.method_2dee76f_bzF(n, n2, n3)) > 0 && n4 < 8) {
            qnq.method_62d7c9a6_Dne((float)n + 0.5f, (float)n2 + 0.5f, (float)n3 + 0.5f, "liquid.water", random.nextFloat() * 0.25f + 0.75f, random.nextFloat() * 1.0f + 0.5f, false);
        }
        if (this.field_368fd23_Dne == KFd.field_5b96677_IjH && qnq.method_d9802b31_Dne(n, n2 + 1, n3) == KFd.field_368fd23_Dne && !qnq.method_e53317d5_zGp(n, n2 + 1, n3)) {
            if (random.nextInt(100) == 0) {
                double d6 = (float)n + random.nextFloat();
                double d7 = (double)n2 + this.field_2d29ef_aFZ;
                d = (float)n3 + random.nextFloat();
                qnq.method_8600ec24_Dne("lava", d6, d7, d, 0.0, 0.0, 0.0);
                qnq.method_62d7c9a6_Dne(d6, d7, d, "liquid.lavapop", 0.2f + random.nextFloat() * 0.2f, 0.9f + random.nextFloat() * 0.15f, false);
            }
            if (random.nextInt(200) == 0) {
                qnq.method_62d7c9a6_Dne(n, n2, n3, "liquid.lava", 0.2f + random.nextFloat() * 0.2f, 0.9f + random.nextFloat() * 0.15f, false);
            }
        }
        if (random.nextInt(10) == 0 && qnq.method_73e9b8f9_IjH(n, n2 - 1, n3) && !qnq.method_d9802b31_Dne(n, n2 - 2, n3).method_ae128dcb_bzF()) {
            double d8 = (float)n + random.nextFloat();
            double d9 = (double)n2 - 1.05;
            d = (float)n3 + random.nextFloat();
            if (this.field_368fd23_Dne == KFd.field_1411d34d_div) {
                qnq.method_8600ec24_Dne("dripWater", d8, d9, d, 0.0, 0.0, 0.0);
            } else {
                qnq.method_8600ec24_Dne("dripLava", d8, d9, d, 0.0, 0.0, 0.0);
            }
        }
    }

    private void method_714a8eb7_Qnq(Qnq qnq, int n, int n2, int n3) {
        if (qnq.method_2c2cf7bc_Dne(n, n2, n3) == this.field_21260d_FWm && this.field_368fd23_Dne == KFd.field_5b96677_IjH) {
            boolean bl = false;
            if (bl || qnq.method_d9802b31_Dne(n, n2, n3 - 1) == KFd.field_1411d34d_div) {
                bl = true;
            }
            if (bl || qnq.method_d9802b31_Dne(n, n2, n3 + 1) == KFd.field_1411d34d_div) {
                bl = true;
            }
            if (bl || qnq.method_d9802b31_Dne(n - 1, n2, n3) == KFd.field_1411d34d_div) {
                bl = true;
            }
            if (bl || qnq.method_d9802b31_Dne(n + 1, n2, n3) == KFd.field_1411d34d_div) {
                bl = true;
            }
            if (bl || qnq.method_d9802b31_Dne(n, n2 + 1, n3) == KFd.field_1411d34d_div) {
                bl = true;
            }
            if (bl) {
                int n4 = qnq.method_2dee76f_bzF(n, n2, n3);
                if (n4 == 0) {
                    qnq.method_2ee8c47d_FWm(n, n2, n3, zKP.field_e641c680_cot.field_21260d_FWm);
                } else if (n4 <= 4) {
                    qnq.method_2ee8c47d_FWm(n, n2, n3, zKP.field_75c638da_bzF.field_21260d_FWm);
                }
                this.method_5452795d_bzF(qnq, n, n2, n3);
            }
        }
    }

    public static float method_ce7f5d99_Dne(int n) {
        if (n >= 8) {
            n = 0;
        }
        return (float)(n + 1) / 9.0f;
    }
}

