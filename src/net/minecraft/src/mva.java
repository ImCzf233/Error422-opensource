package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class mva
extends wJb {
    @Override
    public void method_437b4433_Dne(NMq nMq, Qnq qnq, sMa sMa2, int n, boolean bl) {
        if (!qnq.field_2d2a05_aFZ) {
            Ilk ilk = this.method_ee3739a1_Dne(nMq, qnq);
            if (sMa2 instanceof FiG) {
                FiG fiG = (FiG)sMa2;
                ilk.method_672a90ac_Dne(fiG, nMq);
            }
            if (bl) {
                this.method_4f971b52_Dne(qnq, sMa2, ilk);
            }
        }
    }

    public static Ilk method_f0df4743_Dne(short s, Qnq qnq) {
        String string = "map_" + s;
        Ilk ilk = (Ilk)qnq.method_64d498e5_Dne(Ilk.class, string);
        if (ilk == null) {
            ilk = new Ilk(string);
            qnq.method_65052564_Dne(string, ilk);
        }
        return ilk;
    }

    public void method_4f971b52_Dne(Qnq qnq, sMa sMa2, Ilk ilk) {
        if (qnq.field_3690d00_Dne.field_2092ae_Dne == ilk.field_2092a7_Dne && sMa2 instanceof FiG) {
            int n = 128;
            int n2 = 128;
            int n3 = 1 << ilk.field_212606_FWm;
            int n4 = ilk.field_2092ae_Dne;
            int n5 = ilk.field_21260d_FWm;
            int n6 = geR.method_117d0718_FWm(sMa2.field_2f0dd3_div - (double)n4) / n3 + n / 2;
            int n7 = geR.method_117d0718_FWm(sMa2.field_334487_mrb - (double)n5) / n3 + n2 / 2;
            int n8 = 128 / n3;
            if (qnq.field_3690d00_Dne.field_21261e_FWm) {
                n8 /= 2;
            }
            nJg nJg2 = ilk.method_53efb369_Dne((FiG)sMa2);
            ++nJg2.field_2092ae_Dne;
            for (int i = n6 - n8 + 1; i < n6 + n8; ++i) {
                if ((i & 0xF) != (nJg2.field_2092ae_Dne & 0xF)) continue;
                int n9 = 255;
                int n10 = 0;
                double d = 0.0;
                for (int j = n7 - n8 - 1; j < n7 + n8; ++j) {
                    byte by;
                    byte by2;
                    int n11;
                    int n12;
                    int n13;
                    int n14;
                    int n15;
                    if (i < 0 || j < -1 || i >= n || j >= n2) continue;
                    int n16 = i - n6;
                    int n17 = j - n7;
                    boolean bl = n16 * n16 + n17 * n17 > (n8 - 2) * (n8 - 2);
                    int n18 = (n4 / n3 + i - n / 2) * n3;
                    int n19 = (n5 / n3 + j - n2 / 2) * n3;
                    int[] nArray = new int[256];
                    qMV qMV2 = qnq.method_90569c11_Dne(n18, n19);
                    if (qMV2.method_7a46289e_Dne()) continue;
                    int n20 = n18 & 0xF;
                    int n21 = n19 & 0xF;
                    int n22 = 0;
                    double d2 = 0.0;
                    if (qnq.field_3690d00_Dne.field_21261e_FWm) {
                        n15 = n18 + n19 * 231871;
                        if (((n15 = n15 * n15 * 31287121 + n15 * 11) >> 20 & 1) == 0) {
                            int n23 = zKP.field_203836cc_FWm.field_21260d_FWm;
                            nArray[n23] = nArray[n23] + 10;
                        } else {
                            int n24 = zKP.field_37e6aed_Dne.field_21260d_FWm;
                            nArray[n24] = nArray[n24] + 10;
                        }
                        d2 = 100.0;
                    } else {
                        for (n15 = 0; n15 < n3; ++n15) {
                            for (n14 = 0; n14 < n3; ++n14) {
                                n13 = qMV2.method_16cca6d_Dne(n15 + n20, n14 + n21) + 1;
                                int n25 = 0;
                                if (n13 > 1) {
                                    boolean bl2;
                                    do {
                                        bl2 = true;
                                        n25 = qMV2.method_2c2cf7bc_Dne(n15 + n20, n13 - 1, n14 + n21);
                                        if (n25 == 0) {
                                            bl2 = false;
                                        } else if (n13 > 0 && n25 > 0 && zKP.field_8374b848_Dne[n25].field_368fd23_Dne.field_36e23f8_Dne == UpO.field_36e23f8_Dne) {
                                            bl2 = false;
                                        }
                                        if (bl2) continue;
                                        if (--n13 <= 0) break;
                                        n25 = qMV2.method_2c2cf7bc_Dne(n15 + n20, n13 - 1, n14 + n21);
                                    } while (n13 > 0 && !bl2);
                                    if (n13 > 0 && n25 != 0 && zKP.field_8374b848_Dne[n25].field_368fd23_Dne.method_907a9d25_Qnq()) {
                                        int n26;
                                        n12 = n13 - 1;
                                        n11 = 0;
                                        do {
                                            n26 = qMV2.method_2c2cf7bc_Dne(n15 + n20, n12--, n14 + n21);
                                            ++n22;
                                        } while (n12 > 0 && n26 != 0 && zKP.field_8374b848_Dne[n26].field_368fd23_Dne.method_907a9d25_Qnq());
                                    }
                                }
                                d2 += (double)n13 / (double)(n3 * n3);
                                int n27 = n25;
                                nArray[n27] = nArray[n27] + 1;
                            }
                        }
                    }
                    n22 /= n3 * n3;
                    n15 = 0;
                    n14 = 0;
                    for (n13 = 0; n13 < 256; ++n13) {
                        if (nArray[n13] <= n15) continue;
                        n14 = n13;
                        n15 = nArray[n13];
                    }
                    double d3 = (d2 - d) * 4.0 / (double)(n3 + 4) + ((double)(i + j & 1) - 0.5) * 0.4;
                    n11 = 1;
                    if (d3 > 0.6) {
                        n11 = 2;
                    }
                    if (d3 < -0.6) {
                        n11 = 0;
                    }
                    n12 = 0;
                    if (n14 > 0) {
                        UpO upO = zKP.field_8374b848_Dne[n14].field_368fd23_Dne.field_36e23f8_Dne;
                        if (upO == UpO.field_a21e5560_kGO) {
                            d3 = (double)n22 * 0.1 + (double)(i + j & 1) * 0.2;
                            n11 = 1;
                            if (d3 < 0.5) {
                                n11 = 2;
                            }
                            if (d3 > 0.9) {
                                n11 = 0;
                            }
                        }
                        n12 = upO.field_21260d_FWm;
                    }
                    d = d2;
                    if (j < 0 || n16 * n16 + n17 * n17 >= n8 * n8 || bl && (i + j & 1) == 0 || (by2 = ilk.field_3f1c582_Dne[i + j * n]) == (by = (byte)(n12 * 4 + n11))) continue;
                    if (n9 > j) {
                        n9 = j;
                    }
                    if (n10 < j) {
                        n10 = j;
                    }
                    ilk.field_3f1c582_Dne[i + j * n] = by;
                }
                if (n9 > n10) continue;
                ilk.method_2c2cf7c9_Dne(i, n9, n10);
            }
        }
    }

    public Ilk method_ee3739a1_Dne(NMq nMq, Qnq qnq) {
        String string = "map_" + nMq.method_907a9d14_Qnq();
        Ilk ilk = (Ilk)qnq.method_64d498e5_Dne(Ilk.class, string);
        if (ilk == null && !qnq.field_2d2a05_aFZ) {
            nMq.method_ce7f5da9_Dne(qnq.method_8f501fd7_Dne("map"));
            string = "map_" + nMq.method_907a9d14_Qnq();
            ilk = new Ilk(string);
            ilk.field_212606_FWm = (byte)3;
            int n = 128 * (1 << ilk.field_212606_FWm);
            ilk.field_2092ae_Dne = Math.round((float)qnq.method_231798c9_Dne().method_7a46288d_Dne() / (float)n) * n;
            ilk.field_21260d_FWm = Math.round(qnq.method_231798c9_Dne().method_ae128dba_bzF() / n) * n;
            ilk.field_2092a7_Dne = (byte)qnq.field_3690d00_Dne.field_2092ae_Dne;
            ilk.method_7a46289a_Dne();
            qnq.method_65052564_Dne(string, ilk);
        }
        return ilk;
    }

    protected mva(int n) {
        super(n);
        this.method_21c1eb9a_Dne(true);
    }

    @Override
    public void method_497c81fb_Dne(NMq nMq, FiG fiG, List list, boolean bl) {
        Ilk ilk = this.method_ee3739a1_Dne(nMq, fiG.field_36c4f18_Dne);
        if (bl) {
            if (ilk == null) {
                list.add("Unknown map");
            } else {
                list.add("Scaling at 1:" + (1 << ilk.field_212606_FWm));
                list.add("(Level " + ilk.field_212606_FWm + "/" + 4 + ")");
            }
        }
    }

    @Override
    public NER method_d41ff59b_Dne(NMq nMq, Qnq qnq, FiG fiG) {
        byte[] byArray = this.method_ee3739a1_Dne(nMq, qnq).method_682eb878_Dne(nMq, qnq, fiG);
        return byArray == null ? null : new XsD((short)dEr.field_3792594_Dne.field_267cf5_Qnq, (short)nMq.method_907a9d14_Qnq(), byArray);
    }

    @Override
    public void method_c2991f86_FWm(NMq nMq, Qnq qnq, FiG fiG) {
        if (nMq.method_a98a0664_aFZ() && nMq.method_230886fb_Dne().method_110c4dc7_FWm("map_is_scaling")) {
            Ilk ilk = dEr.field_3792594_Dne.method_ee3739a1_Dne(nMq, qnq);
            nMq.method_ce7f5da9_Dne(qnq.method_8f501fd7_Dne("map"));
            Ilk ilk2 = new Ilk("map_" + nMq.method_907a9d14_Qnq());
            ilk2.field_212606_FWm = (byte)(ilk.field_212606_FWm + 1);
            if (ilk2.field_212606_FWm > 4) {
                ilk2.field_212606_FWm = (byte)4;
            }
            ilk2.field_2092ae_Dne = ilk.field_2092ae_Dne;
            ilk2.field_21260d_FWm = ilk.field_21260d_FWm;
            ilk2.field_2092a7_Dne = ilk.field_2092a7_Dne;
            ilk2.method_7a46289a_Dne();
            qnq.method_65052564_Dne("map_" + nMq.method_907a9d14_Qnq(), ilk2);
        }
    }
}

