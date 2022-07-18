package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class XbN
extends zKP {
    private gDn field_202f7d1a_FWm;
    private final boolean field_2092bf_Dne;
    private gDn field_375b13b_Dne;
    private gDn field_75bd7f28_bzF;

    @Override
    public void method_7a46289a_Dne() {
        this.method_eb14b51a_Dne(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }

    public static boolean method_ce7f5dad_Dne(int n) {
        return (n & 8) != 0;
    }

    public static gDn method_285881e4_Dne(String string) {
        return string == "piston_side" ? zKP.field_20291847_FWm.field_5e5f2002_Qnq : (string == "piston_top" ? zKP.field_20291847_FWm.field_75bd7f28_bzF : (string == "piston_top_sticky" ? zKP.field_36f4c68_Dne.field_75bd7f28_bzF : (string == "piston_inner_top" ? zKP.field_20291847_FWm.field_375b13b_Dne : null)));
    }

    @Override
    public bSp method_8c85fe2_Dne(Qnq qnq, int n, int n2, int n3) {
        this.method_fbabf7ef_Dne(qnq, n, n2, n3);
        return super.method_8c85fe2_Dne(qnq, n, n2, n3);
    }

    @Override
    public boolean method_3e226594_Dne(Qnq qnq, int n, int n2, int n3, int n4, int n5) {
        if (!qnq.field_2d2a05_aFZ) {
            boolean bl = this.method_d6a0f318_FWm(qnq, n, n2, n3, n5);
            if (bl && n4 == 1) {
                qnq.method_d4dc89ed_Dne(n, n2, n3, n5 | 8, 2);
                return false;
            }
            if (!bl && n4 == 0) {
                return false;
            }
        }
        if (n4 == 0) {
            if (!this.method_b807bb30_Qnq(qnq, n, n2, n3, n5)) {
                return false;
            }
            qnq.method_d4dc89ed_Dne(n, n2, n3, n5 | 8, 2);
            qnq.method_c961c6ee_Dne((double)n + 0.5, (double)n2 + 0.5, (double)n3 + 0.5, "tile.piston.out", 0.5f, qnq.field_7331eae7_Dne.nextFloat() * 0.25f + 0.6f);
        } else if (n4 == 1) {
            ipD ipD2 = qnq.method_d98e681d_Dne(n + rrP.field_4039e0a_FWm[n5], n2 + rrP.field_59d86bc_bzF[n5], n3 + rrP.field_4a92422_Qnq[n5]);
            if (ipD2 instanceof SoB) {
                ((SoB)ipD2).method_7c6f6039_FWm();
            }
            qnq.method_17d7ea9d_FWm(n, n2, n3, zKP.field_37c4776_Dne.field_21260d_FWm, n5, 3);
            qnq.method_c583bffb_Dne(n, n2, n3, tsU.method_725d45d_Dne(this.field_21260d_FWm, n5, n5, false, true));
            if (this.field_2092bf_Dne) {
                SoB soB;
                ipD ipD3;
                int n6 = n + rrP.field_4039e0a_FWm[n5] * 2;
                int n7 = n2 + rrP.field_59d86bc_bzF[n5] * 2;
                int n8 = n3 + rrP.field_4a92422_Qnq[n5] * 2;
                int n9 = qnq.method_2c2cf7bc_Dne(n6, n7, n8);
                int n10 = qnq.method_2dee76f_bzF(n6, n7, n8);
                boolean bl = false;
                if (n9 == zKP.field_37c4776_Dne.field_21260d_FWm && (ipD3 = qnq.method_d98e681d_Dne(n6, n7, n8)) instanceof SoB && (soB = (SoB)ipD3).method_7c6f602c_FWm() == n5 && soB.method_7a46289e_Dne()) {
                    soB.method_7c6f6039_FWm();
                    n9 = soB.method_7a46288d_Dne();
                    n10 = soB.method_d44b4585_zGp();
                    bl = true;
                }
                if (!bl && n9 > 0 && XbN.method_da5f5379_Dne(n9, qnq, n6, n7, n8, false) && (zKP.field_8374b848_Dne[n9].method_7c6f602c_FWm() == 0 || n9 == zKP.field_20291847_FWm.field_21260d_FWm || n9 == zKP.field_36f4c68_Dne.field_21260d_FWm)) {
                    qnq.method_17d7ea9d_FWm(n += rrP.field_4039e0a_FWm[n5], n2 += rrP.field_59d86bc_bzF[n5], n3 += rrP.field_4a92422_Qnq[n5], zKP.field_37c4776_Dne.field_21260d_FWm, n10, 3);
                    qnq.method_c583bffb_Dne(n, n2, n3, tsU.method_725d45d_Dne(n9, n10, n5, false, false));
                    qnq.method_2e7161e6_Qnq(n6, n7, n8);
                } else if (!bl) {
                    qnq.method_2e7161e6_Qnq(n + rrP.field_4039e0a_FWm[n5], n2 + rrP.field_59d86bc_bzF[n5], n3 + rrP.field_4a92422_Qnq[n5]);
                }
            } else {
                qnq.method_2e7161e6_Qnq(n + rrP.field_4039e0a_FWm[n5], n2 + rrP.field_59d86bc_bzF[n5], n3 + rrP.field_4a92422_Qnq[n5]);
            }
            qnq.method_c961c6ee_Dne((double)n + 0.5, (double)n2 + 0.5, (double)n3 + 0.5, "tile.piston.in", 0.5f, qnq.field_7331eae7_Dne.nextFloat() * 0.15f + 0.6f);
        }
        return true;
    }

    public static int method_143f9e0f_bzF(int n) {
        return n & 7;
    }

    private boolean method_b807bb30_Qnq(Qnq qnq, int n, int n2, int n3, int n4) {
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10 = n + rrP.field_4039e0a_FWm[n4];
        int n11 = n2 + rrP.field_59d86bc_bzF[n4];
        int n12 = n3 + rrP.field_4a92422_Qnq[n4];
        for (n9 = 0; n9 < 13; ++n9) {
            if (n11 <= 0 || n11 >= 255) {
                return false;
            }
            n8 = qnq.method_2c2cf7bc_Dne(n10, n11, n12);
            if (n8 == 0) break;
            if (!XbN.method_da5f5379_Dne(n8, qnq, n10, n11, n12, true)) {
                return false;
            }
            if (zKP.field_8374b848_Dne[n8].method_7c6f602c_FWm() != 1) {
                if (n9 == 12) {
                    return false;
                }
                n10 += rrP.field_4039e0a_FWm[n4];
                n11 += rrP.field_59d86bc_bzF[n4];
                n12 += rrP.field_4a92422_Qnq[n4];
                continue;
            }
            zKP.field_8374b848_Dne[n8].method_fd7de26f_FWm(qnq, n10, n11, n12, qnq.method_2dee76f_bzF(n10, n11, n12), 0);
            qnq.method_2e7161e6_Qnq(n10, n11, n12);
            break;
        }
        n9 = n10;
        n8 = n11;
        int n13 = n12;
        int n14 = 0;
        int[] nArray = new int[13];
        while (n10 != n || n11 != n2 || n12 != n3) {
            n7 = n10 - rrP.field_4039e0a_FWm[n4];
            n6 = n11 - rrP.field_59d86bc_bzF[n4];
            n5 = n12 - rrP.field_4a92422_Qnq[n4];
            int n15 = qnq.method_2c2cf7bc_Dne(n7, n6, n5);
            int n16 = qnq.method_2dee76f_bzF(n7, n6, n5);
            if (n15 == this.field_21260d_FWm && n7 == n && n6 == n2 && n5 == n3) {
                qnq.method_17d7ea9d_FWm(n10, n11, n12, zKP.field_37c4776_Dne.field_21260d_FWm, n4 | (this.field_2092bf_Dne ? 8 : 0), 4);
                qnq.method_c583bffb_Dne(n10, n11, n12, tsU.method_725d45d_Dne(zKP.field_367483b_Dne.field_21260d_FWm, n4 | (this.field_2092bf_Dne ? 8 : 0), n4, true, false));
            } else {
                qnq.method_17d7ea9d_FWm(n10, n11, n12, zKP.field_37c4776_Dne.field_21260d_FWm, n16, 4);
                qnq.method_c583bffb_Dne(n10, n11, n12, tsU.method_725d45d_Dne(n15, n16, n4, true, false));
            }
            nArray[n14++] = n15;
            n10 = n7;
            n11 = n6;
            n12 = n5;
        }
        n10 = n9;
        n11 = n8;
        n12 = n13;
        n14 = 0;
        while (n10 != n || n11 != n2 || n12 != n3) {
            n7 = n10 - rrP.field_4039e0a_FWm[n4];
            n6 = n11 - rrP.field_59d86bc_bzF[n4];
            n5 = n12 - rrP.field_4a92422_Qnq[n4];
            qnq.method_58fe7b07_bzF(n7, n6, n5, nArray[n14++]);
            n10 = n7;
            n11 = n6;
            n12 = n5;
        }
        return true;
    }

    @Override
    public gDn method_9051f17a_Dne(int n, int n2) {
        int n3 = XbN.method_143f9e0f_bzF(n2);
        return n3 > 5 ? this.field_75bd7f28_bzF : (n == n3 ? (!XbN.method_ce7f5dad_Dne(n2) && this.field_2092a9_Dne <= 0.0 && this.field_212608_FWm <= 0.0 && this.field_2e5f16_bzF <= 0.0 && this.field_267cf0_Qnq >= 1.0 && this.field_2d29ef_aFZ >= 1.0 && this.field_388da1_zGp >= 1.0 ? this.field_75bd7f28_bzF : this.field_375b13b_Dne) : (n == rrP.field_3f1c589_Dne[n3] ? this.field_202f7d1a_FWm : this.field_5e5f2002_Qnq));
    }

    @Override
    public boolean method_cb53d52e_Dne(Qnq qnq, int n, int n2, int n3, FiG fiG, int n4, float f, float f2, float f3) {
        return false;
    }

    private static boolean method_da5f5379_Dne(int n, Qnq qnq, int n2, int n3, int n4, boolean bl) {
        if (n != zKP.field_20291847_FWm.field_21260d_FWm && n != zKP.field_36f4c68_Dne.field_21260d_FWm) {
            if (zKP.field_8374b848_Dne[n].method_9cb39120_Dne(qnq, n2, n3, n4) == -1.0f) {
                return false;
            }
            if (zKP.field_8374b848_Dne[n].method_7c6f602c_FWm() == 2) {
                return false;
            }
            if (zKP.field_8374b848_Dne[n].method_7c6f602c_FWm() == 1) {
                return bl;
            }
        } else if (XbN.method_ce7f5dad_Dne(qnq.method_2dee76f_bzF(n2, n3, n4))) {
            return false;
        }
        return !(zKP.field_8374b848_Dne[n] instanceof sCQ);
    }

    public static int method_40c3a80b_Dne(Qnq qnq, int n, int n2, int n3, FUH fUH) {
        int n4;
        if (geR.method_7ed96eaf_Qnq((float)fUH.field_2f0dd3_div - (float)n) < 2.0f && geR.method_7ed96eaf_Qnq((float)fUH.field_334487_mrb - (float)n3) < 2.0f) {
            double d = fUH.field_22c5fd_IjH + 1.82 - (double)fUH.field_36b0a6_udO;
            if (d - (double)n2 > 2.0) {
                return 1;
            }
            if ((double)n2 - d > 0.0) {
                return 0;
            }
        }
        return (n4 = geR.method_117d0718_FWm((double)(fUH.field_334489_mrb * 4.0f / 360.0f) + 0.5) & 3) == 0 ? 2 : (n4 == 1 ? 5 : (n4 == 2 ? 3 : (n4 == 3 ? 4 : 0)));
    }

    @Override
    public void method_1bbfa017_Dne(Qnq qnq, int n, int n2, int n3, bSp bSp2, List list, sMa sMa2) {
        this.method_eb14b51a_Dne(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        super.method_1bbfa017_Dne(qnq, n, n2, n3, bSp2, list, sMa2);
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return false;
    }

    @Override
    public void method_f9bf07d3_Dne(Qnq qnq, int n, int n2, int n3, int n4) {
        if (!qnq.field_2d2a05_aFZ) {
            this.method_5452795d_bzF(qnq, n, n2, n3);
        }
    }

    private void method_5452795d_bzF(Qnq qnq, int n, int n2, int n3) {
        int n4 = qnq.method_2dee76f_bzF(n, n2, n3);
        int n5 = XbN.method_143f9e0f_bzF(n4);
        if (n5 != 7) {
            boolean bl = this.method_d6a0f318_FWm(qnq, n, n2, n3, n5);
            if (bl && !XbN.method_ce7f5dad_Dne(n4)) {
                if (XbN.method_35fd254a_bzF(qnq, n, n2, n3, n5)) {
                    qnq.method_9e2bd981_Qnq(n, n2, n3, this.field_21260d_FWm, 0, n5);
                }
            } else if (!bl && XbN.method_ce7f5dad_Dne(n4)) {
                qnq.method_d4dc89ed_Dne(n, n2, n3, n5, 2);
                qnq.method_9e2bd981_Qnq(n, n2, n3, this.field_21260d_FWm, 1, n5);
            }
        }
    }

    private static boolean method_35fd254a_bzF(Qnq qnq, int n, int n2, int n3, int n4) {
        int n5 = n + rrP.field_4039e0a_FWm[n4];
        int n6 = n2 + rrP.field_59d86bc_bzF[n4];
        int n7 = n3 + rrP.field_4a92422_Qnq[n4];
        for (int i = 0; i < 13; ++i) {
            if (n6 <= 0 || n6 >= 255) {
                return false;
            }
            int n8 = qnq.method_2c2cf7bc_Dne(n5, n6, n7);
            if (n8 == 0) break;
            if (!XbN.method_da5f5379_Dne(n8, qnq, n5, n6, n7, true)) {
                return false;
            }
            if (zKP.field_8374b848_Dne[n8].method_7c6f602c_FWm() == 1) break;
            if (i == 12) {
                return false;
            }
            n5 += rrP.field_4039e0a_FWm[n4];
            n6 += rrP.field_59d86bc_bzF[n4];
            n7 += rrP.field_4a92422_Qnq[n4];
        }
        return true;
    }

    @Override
    public void method_9cb39130_Dne(Qnq qnq, int n, int n2, int n3) {
        if (!qnq.field_2d2a05_aFZ && qnq.method_d98e681d_Dne(n, n2, n3) == null) {
            this.method_5452795d_bzF(qnq, n, n2, n3);
        }
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return false;
    }

    private boolean method_d6a0f318_FWm(Qnq qnq, int n, int n2, int n3, int n4) {
        return n4 != 0 && qnq.method_9fbb4d65_Qnq(n, n2 - 1, n3, 0) ? true : (n4 != 1 && qnq.method_9fbb4d65_Qnq(n, n2 + 1, n3, 1) ? true : (n4 != 2 && qnq.method_9fbb4d65_Qnq(n, n2, n3 - 1, 2) ? true : (n4 != 3 && qnq.method_9fbb4d65_Qnq(n, n2, n3 + 1, 3) ? true : (n4 != 5 && qnq.method_9fbb4d65_Qnq(n + 1, n2, n3, 5) ? true : (n4 != 4 && qnq.method_9fbb4d65_Qnq(n - 1, n2, n3, 4) ? true : (qnq.method_9fbb4d65_Qnq(n, n2, n3, 0) ? true : (qnq.method_9fbb4d65_Qnq(n, n2 + 2, n3, 1) ? true : (qnq.method_9fbb4d65_Qnq(n, n2 + 1, n3 - 1, 2) ? true : (qnq.method_9fbb4d65_Qnq(n, n2 + 1, n3 + 1, 3) ? true : (qnq.method_9fbb4d65_Qnq(n - 1, n2 + 1, n3, 4) ? true : qnq.method_9fbb4d65_Qnq(n + 1, n2 + 1, n3, 5)))))))))));
    }

    public void method_3c377979_FWm(float f, float f2, float f3, float f4, float f5, float f6) {
        this.method_eb14b51a_Dne(f, f2, f3, f4, f5, f6);
    }

    public XbN(int n, boolean bl) {
        super(n, KFd.field_d72f68f8_yMz);
        this.field_2092bf_Dne = bl;
        this.method_2792b805_Dne(field_712f6e9e_aFZ);
        this.method_f1c42c0b_bzF(0.5f);
        this.method_82a88d64_Dne(JcN.field_75b0c0e4_bzF);
    }

    @Override
    public void method_fbabf7ef_Dne(Zpi zpi, int n, int n2, int n3) {
        int n4 = zpi.method_2dee76f_bzF(n, n2, n3);
        if (XbN.method_ce7f5dad_Dne(n4)) {
            switch (XbN.method_143f9e0f_bzF(n4)) {
                case 0: {
                    this.method_eb14b51a_Dne(0.0f, 0.25f, 0.0f, 1.0f, 1.0f, 1.0f);
                    break;
                }
                case 1: {
                    this.method_eb14b51a_Dne(0.0f, 0.0f, 0.0f, 1.0f, 0.75f, 1.0f);
                    break;
                }
                case 2: {
                    this.method_eb14b51a_Dne(0.0f, 0.0f, 0.25f, 1.0f, 1.0f, 1.0f);
                    break;
                }
                case 3: {
                    this.method_eb14b51a_Dne(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.75f);
                    break;
                }
                case 4: {
                    this.method_eb14b51a_Dne(0.25f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
                    break;
                }
                case 5: {
                    this.method_eb14b51a_Dne(0.0f, 0.0f, 0.0f, 0.75f, 1.0f, 1.0f);
                }
            }
        } else {
            this.method_eb14b51a_Dne(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        }
    }

    public gDn method_230f3f9a_Dne() {
        return this.field_75bd7f28_bzF;
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        this.field_5e5f2002_Qnq = rbp.method_285881e4_Dne("piston_side");
        this.field_75bd7f28_bzF = rbp.method_285881e4_Dne(this.field_2092bf_Dne ? "piston_top_sticky" : "piston_top");
        this.field_375b13b_Dne = rbp.method_285881e4_Dne("piston_inner_top");
        this.field_202f7d1a_FWm = rbp.method_285881e4_Dne("piston_bottom");
    }

    @Override
    public void method_ca7e4e57_Dne(Qnq qnq, int n, int n2, int n3, FUH fUH, NMq nMq) {
        int n4 = XbN.method_40c3a80b_Dne(qnq, n, n2, n3, fUH);
        qnq.method_d4dc89ed_Dne(n, n2, n3, n4, 2);
        if (!qnq.field_2d2a05_aFZ) {
            this.method_5452795d_bzF(qnq, n, n2, n3);
        }
    }

    @Override
    public int method_7a46288d_Dne() {
        return 16;
    }
}

