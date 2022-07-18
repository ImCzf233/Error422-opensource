package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
class iVy
extends WoN {
    static final int field_2092ae_Dne = 140;
    private static float[] field_3f1c586_Dne;
    static final int field_21260d_FWm;

    void method_c38b13d5_FWm(Object object) {
    }

    private static void method_c6bd49a5_Dne(int n, int n2, int n3, int n4, float[] fArray) {
        int n5 = n4 - n3;
        int n6 = n2 - n;
        int n7 = Math.abs(n5);
        int n8 = n5 / n6;
        int n9 = n5 < 0 ? n8 - 1 : n8 + 1;
        int n10 = n;
        int n11 = n3;
        int n12 = 0;
        n7 -= Math.abs(n8 * n6);
        int n13 = n10;
        fArray[n13] = fArray[n13] * field_3f1c586_Dne[n11];
        while (++n10 < n2) {
            if ((n12 += n7) >= n6) {
                n12 -= n6;
                n11 += n9;
            } else {
                n11 += n8;
            }
            int n14 = n10;
            fArray[n14] = fArray[n14] * field_3f1c586_Dne[n11];
        }
    }

    Object method_4c6c354a_Dne(Lth lth, qbC qbC2) {
        int n;
        int n2;
        int n3 = 0;
        int n4 = -1;
        QwU qwU = new QwU(this);
        qwU.field_267cf5_Qnq = qbC2.method_117d19dd_FWm(5);
        for (n2 = 0; n2 < qwU.field_267cf5_Qnq; ++n2) {
            qwU.field_3f1c589_Dne[n2] = qbC2.method_117d19dd_FWm(4);
            if (n4 >= qwU.field_3f1c589_Dne[n2]) continue;
            n4 = qwU.field_3f1c589_Dne[n2];
        }
        for (n2 = 0; n2 < n4 + 1; ++n2) {
            qwU.field_4039e0a_FWm[n2] = qbC2.method_117d19dd_FWm(3) + 1;
            qwU.field_59d86bc_bzF[n2] = qbC2.method_117d19dd_FWm(2);
            if (qwU.field_59d86bc_bzF[n2] < 0) {
                qwU.method_7a46289a_Dne();
                return null;
            }
            if (qwU.field_59d86bc_bzF[n2] != 0) {
                qwU.field_4a92422_Qnq[n2] = qbC2.method_117d19dd_FWm(8);
            }
            if (qwU.field_4a92422_Qnq[n2] < 0 || qwU.field_4a92422_Qnq[n2] >= lth.field_2a9ad6_Zpi) {
                qwU.method_7a46289a_Dne();
                return null;
            }
            for (n = 0; n < 1 << qwU.field_59d86bc_bzF[n2]; ++n) {
                qwU.field_7a46ee0e_Dne[n2][n] = qbC2.method_117d19dd_FWm(8) - 1;
                if (qwU.field_7a46ee0e_Dne[n2][n] >= -1 && qwU.field_7a46ee0e_Dne[n2][n] < lth.field_2a9ad6_Zpi) continue;
                qwU.method_7a46289a_Dne();
                return null;
            }
        }
        qwU.field_2d29f4_aFZ = qbC2.method_117d19dd_FWm(2) + 1;
        int n5 = qbC2.method_117d19dd_FWm(4);
        n = 0;
        for (n2 = 0; n2 < qwU.field_267cf5_Qnq; ++n2) {
            n3 += qwU.field_4039e0a_FWm[qwU.field_3f1c589_Dne[n2]];
            while (n < n3) {
                qwU.field_5781703_aFZ[n + 2] = qbC2.method_117d19dd_FWm(n5);
                int n6 = qwU.field_5781703_aFZ[n + 2];
                if (n6 < 0 || n6 >= 1 << n5) {
                    qwU.method_7a46289a_Dne();
                    return null;
                }
                ++n;
            }
        }
        qwU.field_5781703_aFZ[0] = 0;
        qwU.field_5781703_aFZ[1] = 1 << n5;
        return qwU;
    }

    private static int method_d4dc89dc_Dne(int n, int n2, int n3, int n4, int n5) {
        int n6 = (n4 &= Short.MAX_VALUE) - (n3 &= Short.MAX_VALUE);
        int n7 = n2 - n;
        int n8 = Math.abs(n6);
        int n9 = n8 * (n5 - n);
        int n10 = n9 / n7;
        if (n6 < 0) {
            return n3 - n10;
        }
        return n3 + n10;
    }

    int method_33aed28a_Dne(MOU mOU, Object object, Object object2, float[] fArray) {
        Ett ett = (Ett)object;
        QwU qwU = ett.field_36c6d7d_Dne;
        int n = mOU.field_364942e_Dne.field_36a1eac_Dne.field_3f1c589_Dne[mOU.field_2d29f4_aFZ] / 2;
        if (object2 != null) {
            int n2;
            int[] nArray = (int[])object2;
            int n3 = 0;
            int n4 = 0;
            int n5 = nArray[0] * qwU.field_2d29f4_aFZ;
            for (n2 = 1; n2 < ett.field_21260d_FWm; ++n2) {
                int n6 = ett.field_4039e0a_FWm[n2];
                int n7 = nArray[n6] & Short.MAX_VALUE;
                if (n7 != nArray[n6]) continue;
                n3 = qwU.field_5781703_aFZ[n6];
                iVy.method_c6bd49a5_Dne(n4, n3, n5, n7 *= qwU.field_2d29f4_aFZ, fArray);
                n4 = n3;
                n5 = n7;
            }
            for (n2 = n3; n2 < n; ++n2) {
                int n8 = n2;
                fArray[n8] = fArray[n8] * fArray[n2 - 1];
            }
            return 1;
        }
        for (int i = 0; i < n; ++i) {
            fArray[i] = 0.0f;
        }
        return 0;
    }

    void method_8791ad79_Dne(Object object, qbC qbC2) {
        int n;
        int n2;
        QwU qwU = (QwU)object;
        int n3 = 0;
        int n4 = qwU.field_5781703_aFZ[1];
        int n5 = -1;
        qbC2.method_16cca7a_Dne(qwU.field_267cf5_Qnq, 5);
        for (n2 = 0; n2 < qwU.field_267cf5_Qnq; ++n2) {
            qbC2.method_16cca7a_Dne(qwU.field_3f1c589_Dne[n2], 4);
            if (n5 >= qwU.field_3f1c589_Dne[n2]) continue;
            n5 = qwU.field_3f1c589_Dne[n2];
        }
        for (n2 = 0; n2 < n5 + 1; ++n2) {
            qbC2.method_16cca7a_Dne(qwU.field_4039e0a_FWm[n2] - 1, 3);
            qbC2.method_16cca7a_Dne(qwU.field_59d86bc_bzF[n2], 2);
            if (qwU.field_59d86bc_bzF[n2] != 0) {
                qbC2.method_16cca7a_Dne(qwU.field_4a92422_Qnq[n2], 8);
            }
            for (n = 0; n < 1 << qwU.field_59d86bc_bzF[n2]; ++n) {
                qbC2.method_16cca7a_Dne(qwU.field_7a46ee0e_Dne[n2][n] + 1, 8);
            }
        }
        qbC2.method_16cca7a_Dne(qwU.field_2d29f4_aFZ - 1, 2);
        qbC2.method_16cca7a_Dne(xhl_0.method_117d19dd_FWm(n4), 4);
        int n6 = xhl_0.method_117d19dd_FWm(n4);
        n = 0;
        for (n2 = 0; n2 < qwU.field_267cf5_Qnq; ++n2) {
            n3 += qwU.field_4039e0a_FWm[qwU.field_3f1c589_Dne[n2]];
            while (n < n3) {
                qbC2.method_16cca7a_Dne(qwU.field_5781703_aFZ[n + 2], n6);
                ++n;
            }
        }
    }

    Object method_b1b5d6e6_Dne(MOU mOU, Object object, Object object2) {
        Ett ett = (Ett)object;
        QwU qwU = ett.field_36c6d7d_Dne;
        zbP[] zbPArray = mOU.field_364942e_Dne.field_83750e9f_Dne;
        if (mOU.field_37aa85a_Dne.method_117d19dd_FWm(1) == 1) {
            int n;
            int n2;
            int n3;
            int n4;
            int n5;
            int[] nArray = null;
            if (object2 instanceof int[]) {
                nArray = (int[])object2;
            }
            if (nArray == null || nArray.length < ett.field_21260d_FWm) {
                nArray = new int[ett.field_21260d_FWm];
            } else {
                for (n5 = 0; n5 < nArray.length; ++n5) {
                    nArray[n5] = 0;
                }
            }
            nArray[0] = mOU.field_37aa85a_Dne.method_117d19dd_FWm(xhl_0.method_ce7f5d9c_Dne(ett.field_267cf5_Qnq - 1));
            nArray[1] = mOU.field_37aa85a_Dne.method_117d19dd_FWm(xhl_0.method_ce7f5d9c_Dne(ett.field_267cf5_Qnq - 1));
            int n6 = 2;
            for (n5 = 0; n5 < qwU.field_267cf5_Qnq; ++n5) {
                n4 = qwU.field_3f1c589_Dne[n5];
                n3 = qwU.field_4039e0a_FWm[n4];
                n2 = qwU.field_59d86bc_bzF[n4];
                n = 1 << n2;
                int n7 = 0;
                if (n2 != 0 && (n7 = zbPArray[qwU.field_4a92422_Qnq[n4]].method_b92e7148_Dne(mOU.field_37aa85a_Dne)) == -1) {
                    return null;
                }
                for (int i = 0; i < n3; ++i) {
                    int n8 = qwU.field_7a46ee0e_Dne[n4][n7 & n - 1];
                    n7 >>>= n2;
                    if (n8 >= 0) {
                        nArray[n6 + i] = zbPArray[n8].method_b92e7148_Dne(mOU.field_37aa85a_Dne);
                        if (nArray[n6 + i] != -1) continue;
                        return null;
                    }
                    nArray[n6 + i] = 0;
                }
                n6 += n3;
            }
            for (n5 = 2; n5 < ett.field_21260d_FWm; ++n5) {
                n6 = iVy.method_d4dc89dc_Dne(qwU.field_5781703_aFZ[ett.field_5781703_aFZ[n5 - 2]], qwU.field_5781703_aFZ[ett.field_4a92422_Qnq[n5 - 2]], nArray[ett.field_5781703_aFZ[n5 - 2]], nArray[ett.field_4a92422_Qnq[n5 - 2]], qwU.field_5781703_aFZ[n5]);
                n4 = ett.field_267cf5_Qnq - n6;
                n2 = (n4 < (n3 = n6) ? n4 : n3) << 1;
                n = nArray[n5];
                if (n != 0) {
                    n = n >= n2 ? (n4 > n3 ? (n -= n3) : -1 - (n - n4)) : ((n & 1) != 0 ? -(n + 1 >>> 1) : (n >>= 1));
                    nArray[n5] = n + n6;
                    int n9 = ett.field_5781703_aFZ[n5 - 2];
                    nArray[n9] = nArray[n9] & Short.MAX_VALUE;
                    int n10 = ett.field_4a92422_Qnq[n5 - 2];
                    nArray[n10] = nArray[n10] & Short.MAX_VALUE;
                    continue;
                }
                nArray[n5] = n6 | 0x8000;
            }
            return nArray;
        }
        return null;
    }

    Object method_9e7eedd9_Dne(AOl aOl, XEH xEH, Object object) {
        int n;
        int n2;
        int n3;
        int n4 = 0;
        int[] nArray = new int[65];
        QwU qwU = (QwU)object;
        Ett ett = new Ett(this);
        ett.field_36c6d7d_Dne = qwU;
        ett.field_2e5f1b_bzF = qwU.field_5781703_aFZ[1];
        for (n3 = 0; n3 < qwU.field_267cf5_Qnq; ++n3) {
            n4 += qwU.field_4039e0a_FWm[qwU.field_3f1c589_Dne[n3]];
        }
        ett.field_21260d_FWm = n4 += 2;
        for (n3 = 0; n3 < n4; ++n3) {
            nArray[n3] = n3;
        }
        for (n2 = 0; n2 < n4 - 1; ++n2) {
            for (n = n2; n < n4; ++n) {
                if (qwU.field_5781703_aFZ[nArray[n2]] <= qwU.field_5781703_aFZ[nArray[n]]) continue;
                n3 = nArray[n];
                nArray[n] = nArray[n2];
                nArray[n2] = n3;
            }
        }
        for (n2 = 0; n2 < n4; ++n2) {
            ett.field_4039e0a_FWm[n2] = nArray[n2];
        }
        for (n2 = 0; n2 < n4; ++n2) {
            ett.field_59d86bc_bzF[ett.field_4039e0a_FWm[n2]] = n2;
        }
        for (n2 = 0; n2 < n4; ++n2) {
            ett.field_3f1c589_Dne[n2] = qwU.field_5781703_aFZ[ett.field_4039e0a_FWm[n2]];
        }
        switch (qwU.field_2d29f4_aFZ) {
            case 1: {
                ett.field_267cf5_Qnq = 256;
                break;
            }
            case 2: {
                ett.field_267cf5_Qnq = 128;
                break;
            }
            case 3: {
                ett.field_267cf5_Qnq = 86;
                break;
            }
            case 4: {
                ett.field_267cf5_Qnq = 64;
                break;
            }
            default: {
                ett.field_267cf5_Qnq = -1;
            }
        }
        for (n2 = 0; n2 < n4 - 2; ++n2) {
            n = 0;
            int n5 = 1;
            int n6 = 0;
            int n7 = ett.field_2e5f1b_bzF;
            int n8 = qwU.field_5781703_aFZ[n2 + 2];
            for (int i = 0; i < n2 + 2; ++i) {
                int n9 = qwU.field_5781703_aFZ[i];
                if (n9 > n6 && n9 < n8) {
                    n = i;
                    n6 = n9;
                }
                if (n9 >= n7 || n9 <= n8) continue;
                n5 = i;
                n7 = n9;
            }
            ett.field_5781703_aFZ[n2] = n;
            ett.field_4a92422_Qnq[n2] = n5;
        }
        return ett;
    }

    void method_fa1f39e3_bzF(Object object) {
    }

    int method_dcec1115_Dne(MOU mOU, Object object, float[] fArray, float[] fArray2, Object object2) {
        return 0;
    }

    void method_41cee5f6_Dne(Object object) {
    }

    iVy() {
    }

    static {
        field_21260d_FWm = 63;
        field_3f1c586_Dne = new float[]{1.0649863E-7f, 1.1341951E-7f, 1.2079015E-7f, 1.2863978E-7f, 1.369995E-7f, 1.459025E-7f, 1.5538409E-7f, 1.6548181E-7f, 1.7623574E-7f, 1.8768856E-7f, 1.998856E-7f, 2.128753E-7f, 2.2670913E-7f, 2.4144197E-7f, 2.5713223E-7f, 2.7384212E-7f, 2.9163792E-7f, 3.1059022E-7f, 3.307741E-7f, 3.5226967E-7f, 3.7516213E-7f, 3.995423E-7f, 4.255068E-7f, 4.5315863E-7f, 4.8260745E-7f, 5.1397E-7f, 5.4737063E-7f, 5.829419E-7f, 6.208247E-7f, 6.611694E-7f, 7.041359E-7f, 7.4989464E-7f, 7.98627E-7f, 8.505263E-7f, 9.057983E-7f, 9.646621E-7f, 1.0273513E-6f, 1.0941144E-6f, 1.1652161E-6f, 1.2409384E-6f, 1.3215816E-6f, 1.4074654E-6f, 1.4989305E-6f, 1.5963394E-6f, 1.7000785E-6f, 1.8105592E-6f, 1.9282195E-6f, 2.053526E-6f, 2.1869757E-6f, 2.3290977E-6f, 2.4804558E-6f, 2.6416496E-6f, 2.813319E-6f, 2.9961443E-6f, 3.1908505E-6f, 3.39821E-6f, 3.619045E-6f, 3.8542307E-6f, 4.1047006E-6f, 4.371447E-6f, 4.6555283E-6f, 4.958071E-6f, 5.280274E-6f, 5.623416E-6f, 5.988857E-6f, 6.3780467E-6f, 6.7925284E-6f, 7.2339453E-6f, 7.704048E-6f, 8.2047E-6f, 8.737888E-6f, 9.305725E-6f, 9.910464E-6f, 1.0554501E-5f, 1.1240392E-5f, 1.1970856E-5f, 1.2748789E-5f, 1.3577278E-5f, 1.4459606E-5f, 1.5399271E-5f, 1.6400005E-5f, 1.7465769E-5f, 1.8600793E-5f, 1.9809577E-5f, 2.1096914E-5f, 2.2467912E-5f, 2.3928002E-5f, 2.5482977E-5f, 2.7139005E-5f, 2.890265E-5f, 3.078091E-5f, 3.2781227E-5f, 3.4911533E-5f, 3.718028E-5f, 3.9596467E-5f, 4.2169668E-5f, 4.491009E-5f, 4.7828602E-5f, 5.0936775E-5f, 5.424693E-5f, 5.7772202E-5f, 6.152657E-5f, 6.552491E-5f, 6.9783084E-5f, 7.4317984E-5f, 7.914758E-5f, 8.429104E-5f, 8.976875E-5f, 9.560242E-5f, 1.0181521E-4f, 1.0843174E-4f, 1.1547824E-4f, 1.2298267E-4f, 1.3097477E-4f, 1.3948625E-4f, 1.4855085E-4f, 1.5820454E-4f, 1.6848555E-4f, 1.7943469E-4f, 1.9109536E-4f, 2.0351382E-4f, 2.167393E-4f, 2.3082423E-4f, 2.4582449E-4f, 2.6179955E-4f, 2.7881275E-4f, 2.9693157E-4f, 3.1622787E-4f, 3.3677815E-4f, 3.5866388E-4f, 3.8197188E-4f, 4.0679457E-4f, 4.3323037E-4f, 4.613841E-4f, 4.913675E-4f, 5.2329927E-4f, 5.573062E-4f, 5.935231E-4f, 6.320936E-4f, 6.731706E-4f, 7.16917E-4f, 7.635063E-4f, 8.1312325E-4f, 8.6596457E-4f, 9.2223985E-4f, 9.821722E-4f, 0.0010459992f, 0.0011139743f, 0.0011863665f, 0.0012634633f, 0.0013455702f, 0.0014330129f, 0.0015261382f, 0.0016253153f, 0.0017309374f, 0.0018434235f, 0.0019632196f, 0.0020908006f, 0.0022266726f, 0.0023713743f, 0.0025254795f, 0.0026895993f, 0.0028643848f, 0.0030505287f, 0.003248769f, 0.0034598925f, 0.0036847359f, 0.0039241905f, 0.0041792067f, 0.004450795f, 0.004740033f, 0.005048067f, 0.0053761187f, 0.005725489f, 0.0060975635f, 0.0064938175f, 0.0069158226f, 0.0073652514f, 0.007843887f, 0.008353627f, 0.008896492f, 0.009474637f, 0.010090352f, 0.01074608f, 0.011444421f, 0.012188144f, 0.012980198f, 0.013823725f, 0.014722068f, 0.015678791f, 0.016697686f, 0.017782796f, 0.018938422f, 0.020169148f, 0.021479854f, 0.022875736f, 0.02436233f, 0.025945531f, 0.027631618f, 0.029427277f, 0.031339627f, 0.03337625f, 0.035545226f, 0.037855156f, 0.0403152f, 0.042935107f, 0.045725275f, 0.048696756f, 0.05186135f, 0.05523159f, 0.05882085f, 0.062643364f, 0.06671428f, 0.07104975f, 0.075666964f, 0.08058423f, 0.08582105f, 0.09139818f, 0.097337745f, 0.1036633f, 0.11039993f, 0.11757434f, 0.12521498f, 0.13335215f, 0.14201812f, 0.15124726f, 0.16107617f, 0.1715438f, 0.18269168f, 0.19456401f, 0.20720787f, 0.22067343f, 0.23501402f, 0.25028655f, 0.26655158f, 0.28387362f, 0.3023213f, 0.32196787f, 0.34289113f, 0.36517414f, 0.3889052f, 0.41417846f, 0.44109413f, 0.4697589f, 0.50028646f, 0.53279793f, 0.5674221f, 0.6042964f, 0.64356697f, 0.6853896f, 0.72993004f, 0.777365f, 0.8278826f, 0.88168305f, 0.9389798f, 1.0f};
    }
}

