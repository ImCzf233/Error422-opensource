package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
class pEl
extends bFq {
    static int[][] field_7a46ee0e_Dne;
    private static int[][][] field_ce96d629_Dne;

    static {
        field_ce96d629_Dne = new int[2][][];
        field_7a46ee0e_Dne = null;
    }

    void method_8791ad79_Dne(Object object, qbC qbC2) {
        int n;
        WPn wPn = (WPn)object;
        int n2 = 0;
        qbC2.method_16cca7a_Dne(wPn.field_2092ae_Dne, 24);
        qbC2.method_16cca7a_Dne(wPn.field_21260d_FWm, 24);
        qbC2.method_16cca7a_Dne(wPn.field_2e5f1b_bzF - 1, 24);
        qbC2.method_16cca7a_Dne(wPn.field_267cf5_Qnq - 1, 6);
        qbC2.method_16cca7a_Dne(wPn.field_2d29f4_aFZ, 8);
        for (n = 0; n < wPn.field_267cf5_Qnq; ++n) {
            int n3 = wPn.field_3f1c589_Dne[n];
            if (xhl_0.method_ce7f5d9c_Dne(n3) > 3) {
                qbC2.method_16cca7a_Dne(n3, 3);
                qbC2.method_16cca7a_Dne(1, 1);
                qbC2.method_16cca7a_Dne(n3 >>> 3, 5);
            } else {
                qbC2.method_16cca7a_Dne(n3, 4);
            }
            n2 += xhl_0.method_143f9e0f_bzF(n3);
        }
        for (n = 0; n < n2; ++n) {
            qbC2.method_16cca7a_Dne(wPn.field_4039e0a_FWm[n], 8);
        }
    }

    void method_c38b13d5_FWm(Object object) {
    }

    Object method_9e7eedd9_Dne(AOl aOl, XEH xEH, Object object) {
        int n;
        int n2;
        int n3;
        int n4;
        WPn wPn = (WPn)object;
        hFW hFW2 = new hFW(this);
        int n5 = 0;
        int n6 = 0;
        hFW2.field_36e9857_Dne = wPn;
        hFW2.field_2092ae_Dne = xEH.field_267cf5_Qnq;
        hFW2.field_21260d_FWm = wPn.field_267cf5_Qnq;
        hFW2.field_83750e9f_Dne = aOl.field_83750e9f_Dne;
        hFW2.field_37ec144_Dne = aOl.field_83750e9f_Dne[wPn.field_2d29f4_aFZ];
        int n7 = hFW2.field_37ec144_Dne.field_2092ae_Dne;
        hFW2.field_7a46ee0e_Dne = new int[hFW2.field_21260d_FWm][];
        for (n4 = 0; n4 < hFW2.field_21260d_FWm; ++n4) {
            n3 = wPn.field_3f1c589_Dne[n4];
            n2 = xhl_0.method_ce7f5d9c_Dne(n3);
            if (n2 == 0) continue;
            if (n2 > n6) {
                n6 = n2;
            }
            hFW2.field_7a46ee0e_Dne[n4] = new int[n2];
            for (n = 0; n < n2; ++n) {
                if ((n3 & 1 << n) == 0) continue;
                hFW2.field_7a46ee0e_Dne[n4][n] = wPn.field_4039e0a_FWm[n5++];
            }
        }
        hFW2.field_267cf5_Qnq = (int)Math.rint(Math.pow(hFW2.field_21260d_FWm, n7));
        hFW2.field_2e5f1b_bzF = n6;
        hFW2.field_7c7025ad_FWm = new int[hFW2.field_267cf5_Qnq][];
        for (n4 = 0; n4 < hFW2.field_267cf5_Qnq; ++n4) {
            n3 = n4;
            n2 = hFW2.field_267cf5_Qnq / hFW2.field_21260d_FWm;
            hFW2.field_7c7025ad_FWm[n4] = new int[n7];
            for (n = 0; n < n7; ++n) {
                int n8 = n3 / n2;
                n3 -= n8 * n2;
                n2 /= hFW2.field_21260d_FWm;
                hFW2.field_7c7025ad_FWm[n4][n] = n8;
            }
        }
        return hFW2;
    }

    Object method_4c6c354a_Dne(Lth lth, qbC qbC2) {
        int n;
        int n2 = 0;
        WPn wPn = new WPn(this);
        wPn.field_2092ae_Dne = qbC2.method_117d19dd_FWm(24);
        wPn.field_21260d_FWm = qbC2.method_117d19dd_FWm(24);
        wPn.field_2e5f1b_bzF = qbC2.method_117d19dd_FWm(24) + 1;
        wPn.field_267cf5_Qnq = qbC2.method_117d19dd_FWm(6) + 1;
        wPn.field_2d29f4_aFZ = qbC2.method_117d19dd_FWm(8);
        for (n = 0; n < wPn.field_267cf5_Qnq; ++n) {
            int n3 = qbC2.method_117d19dd_FWm(3);
            if (qbC2.method_117d19dd_FWm(1) != 0) {
                n3 |= qbC2.method_117d19dd_FWm(5) << 3;
            }
            wPn.field_3f1c589_Dne[n] = n3;
            n2 += xhl_0.method_143f9e0f_bzF(n3);
        }
        for (n = 0; n < n2; ++n) {
            wPn.field_4039e0a_FWm[n] = qbC2.method_117d19dd_FWm(8);
        }
        if (wPn.field_2d29f4_aFZ >= lth.field_2a9ad6_Zpi) {
            this.method_41cee5f6_Dne(wPn);
            return null;
        }
        for (n = 0; n < n2; ++n) {
            if (wPn.field_4039e0a_FWm[n] < lth.field_2a9ad6_Zpi) continue;
            this.method_41cee5f6_Dne(wPn);
            return null;
        }
        return wPn;
    }

    static synchronized int method_723473c6_Dne(MOU mOU, Object object, float[][] fArray, int n) {
        hFW hFW2 = (hFW)object;
        WPn wPn = hFW2.field_36e9857_Dne;
        int n2 = wPn.field_2e5f1b_bzF;
        int n3 = hFW2.field_37ec144_Dne.field_2092ae_Dne;
        int n4 = wPn.field_21260d_FWm - wPn.field_2092ae_Dne;
        int n5 = n4 / n2;
        int n6 = (n5 + n3 - 1) / n3;
        if (field_7a46ee0e_Dne == null || field_7a46ee0e_Dne.length < n6) {
            field_7a46ee0e_Dne = new int[n6][];
        }
        for (int i = 0; i < hFW2.field_2e5f1b_bzF; ++i) {
            int n7 = 0;
            int n8 = 0;
            while (n7 < n5) {
                int n9;
                if (i == 0) {
                    n9 = hFW2.field_37ec144_Dne.method_b92e7148_Dne(mOU.field_37aa85a_Dne);
                    if (n9 == -1) {
                        return 0;
                    }
                    pEl.field_7a46ee0e_Dne[n8] = hFW2.field_7c7025ad_FWm[n9];
                    if (field_7a46ee0e_Dne[n8] == null) {
                        return 0;
                    }
                }
                for (int j = 0; j < n3 && n7 < n5; ++j, ++n7) {
                    zbP zbP2;
                    n9 = wPn.field_2092ae_Dne + n7 * n2;
                    int n10 = field_7a46ee0e_Dne[n8][j];
                    if ((wPn.field_3f1c589_Dne[n10] & 1 << i) == 0 || (zbP2 = hFW2.field_83750e9f_Dne[hFW2.field_7a46ee0e_Dne[n10][i]]) == null || zbP2.method_1f3c13cd_Dne(fArray, n9, n, mOU.field_37aa85a_Dne, n2) != -1) continue;
                    return 0;
                }
                ++n8;
            }
        }
        return 0;
    }

    static synchronized int method_d45a7983_Dne(MOU mOU, Object object, float[][] fArray, int n, int n2) {
        int n3;
        hFW hFW2 = (hFW)object;
        WPn wPn = hFW2.field_36e9857_Dne;
        int n4 = wPn.field_2e5f1b_bzF;
        int n5 = hFW2.field_37ec144_Dne.field_2092ae_Dne;
        int n6 = wPn.field_21260d_FWm - wPn.field_2092ae_Dne;
        int n7 = n6 / n4;
        int n8 = (n7 + n5 - 1) / n5;
        if (field_ce96d629_Dne.length < n) {
            field_ce96d629_Dne = new int[n][][];
        }
        for (n3 = 0; n3 < n; ++n3) {
            if (field_ce96d629_Dne[n3] != null && field_ce96d629_Dne[n3].length >= n8) continue;
            pEl.field_ce96d629_Dne[n3] = new int[n8][];
        }
        for (int i = 0; i < hFW2.field_2e5f1b_bzF; ++i) {
            int n9 = 0;
            int n10 = 0;
            while (n9 < n7) {
                int n11;
                if (i == 0) {
                    for (n3 = 0; n3 < n; ++n3) {
                        n11 = hFW2.field_37ec144_Dne.method_b92e7148_Dne(mOU.field_37aa85a_Dne);
                        if (n11 == -1) {
                            return 0;
                        }
                        pEl.field_ce96d629_Dne[n3][n10] = hFW2.field_7c7025ad_FWm[n11];
                        if (field_ce96d629_Dne[n3][n10] != null) continue;
                        return 0;
                    }
                }
                for (int j = 0; j < n5 && n9 < n7; ++j, ++n9) {
                    for (n3 = 0; n3 < n; ++n3) {
                        zbP zbP2;
                        n11 = wPn.field_2092ae_Dne + n9 * n4;
                        int n12 = field_ce96d629_Dne[n3][n10][j];
                        if ((wPn.field_3f1c589_Dne[n12] & 1 << i) == 0 || (zbP2 = hFW2.field_83750e9f_Dne[hFW2.field_7a46ee0e_Dne[n12][i]]) == null || !(n2 == 0 ? zbP2.method_156cda65_Dne(fArray[n3], n11, mOU.field_37aa85a_Dne, n4) == -1 : n2 == 1 && zbP2.method_f24ec5a6_FWm(fArray[n3], n11, mOU.field_37aa85a_Dne, n4) == -1)) continue;
                        return 0;
                    }
                }
                ++n10;
            }
        }
        return 0;
    }

    void method_41cee5f6_Dne(Object object) {
    }

    pEl() {
    }

    int method_b7f2d278_Dne(MOU mOU, Object object, float[][] fArray, int[] nArray, int n) {
        int n2 = 0;
        for (int i = 0; i < n; ++i) {
            if (nArray[i] == 0) continue;
            fArray[n2++] = fArray[i];
        }
        if (n2 != 0) {
            return pEl.method_d45a7983_Dne(mOU, object, fArray, n2, 0);
        }
        return 0;
    }
}

