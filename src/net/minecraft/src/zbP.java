package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
class zbP {
    Vey field_36e7422_Dne = new Vey();
    int field_21260d_FWm;
    aBq field_372efdc_Dne;
    int[] field_3f1c589_Dne;
    int field_2092ae_Dne;
    private int[] field_4039e0a_FWm = new int[15];
    float[] field_3f1c586_Dne;

    int method_86f790bd_Dne(float[] fArray, qbC qbC2, int n, int n2) {
        int n3 = this.method_77ff68f8_Dne(fArray, n, n2);
        return this.method_ab070d99_Dne(n3, qbC2);
    }

    int method_f24ec5a6_FWm(float[] fArray, int n, qbC qbC2, int n2) {
        if (this.field_2092ae_Dne > 8) {
            int n3 = 0;
            while (n3 < n2) {
                int n4 = this.method_b92e7148_Dne(qbC2);
                if (n4 == -1) {
                    return -1;
                }
                int n5 = n4 * this.field_2092ae_Dne;
                int n6 = 0;
                while (n6 < this.field_2092ae_Dne) {
                    int n7 = n + n3++;
                    fArray[n7] = fArray[n7] + this.field_3f1c586_Dne[n5 + n6++];
                }
            }
        } else {
            int n8 = 0;
            while (n8 < n2) {
                int n9 = this.method_b92e7148_Dne(qbC2);
                if (n9 == -1) {
                    return -1;
                }
                int n10 = n9 * this.field_2092ae_Dne;
                int n11 = 0;
                switch (this.field_2092ae_Dne) {
                    case 8: {
                        int n12 = n + n8++;
                        fArray[n12] = fArray[n12] + this.field_3f1c586_Dne[n10 + n11++];
                    }
                    case 7: {
                        int n13 = n + n8++;
                        fArray[n13] = fArray[n13] + this.field_3f1c586_Dne[n10 + n11++];
                    }
                    case 6: {
                        int n14 = n + n8++;
                        fArray[n14] = fArray[n14] + this.field_3f1c586_Dne[n10 + n11++];
                    }
                    case 5: {
                        int n15 = n + n8++;
                        fArray[n15] = fArray[n15] + this.field_3f1c586_Dne[n10 + n11++];
                    }
                    case 4: {
                        int n16 = n + n8++;
                        fArray[n16] = fArray[n16] + this.field_3f1c586_Dne[n10 + n11++];
                    }
                    case 3: {
                        int n17 = n + n8++;
                        fArray[n17] = fArray[n17] + this.field_3f1c586_Dne[n10 + n11++];
                    }
                    case 2: {
                        int n18 = n + n8++;
                        fArray[n18] = fArray[n18] + this.field_3f1c586_Dne[n10 + n11++];
                    }
                    case 1: {
                        int n19 = n + n8++;
                        fArray[n19] = fArray[n19] + this.field_3f1c586_Dne[n10 + n11++];
                    }
                }
            }
        }
        return 0;
    }

    int method_7910eee_Dne(int n, float[] fArray, qbC qbC2) {
        for (int i = 0; i < this.field_2092ae_Dne; ++i) {
            fArray[i] = this.field_3f1c586_Dne[n * this.field_2092ae_Dne + i];
        }
        return this.method_ab070d99_Dne(n, qbC2);
    }

    int method_174edd8_Dne(float[] fArray) {
        int n = this.method_2d2941b1_Dne(fArray, 1);
        for (int i = 0; i < this.field_2092ae_Dne; ++i) {
            fArray[i] = this.field_3f1c586_Dne[n * this.field_2092ae_Dne + i];
        }
        return n;
    }

    static int[] method_78293d69_Dne(int[] nArray, int n) {
        int n2;
        int n3;
        int n4;
        int[] nArray2 = new int[33];
        int[] nArray3 = new int[n];
        for (n4 = 0; n4 < n; ++n4) {
            n3 = nArray[n4];
            if (n3 <= 0) continue;
            n2 = nArray2[n3];
            if (n3 < 32 && n2 >>> n3 != 0) {
                return null;
            }
            nArray3[n4] = n2;
            int n5 = n3;
            while (n5 > 0) {
                if ((nArray2[n5] & 1) != 0) {
                    if (n5 == 1) {
                        nArray2[1] = nArray2[1] + 1;
                        break;
                    }
                    nArray2[n5] = nArray2[n5 - 1] << 1;
                    break;
                }
                int n6 = n5--;
                nArray2[n6] = nArray2[n6] + 1;
            }
            for (n5 = n3 + 1; n5 < 33 && nArray2[n5] >>> 1 == n2; ++n5) {
                n2 = nArray2[n5];
                nArray2[n5] = nArray2[n5 - 1] << 1;
            }
        }
        for (n4 = 0; n4 < n; ++n4) {
            n3 = 0;
            for (n2 = 0; n2 < nArray[n4]; ++n2) {
                n3 <<= 1;
                n3 |= nArray3[n4] >>> n2 & 1;
            }
            nArray3[n4] = n3;
        }
        return nArray3;
    }

    int method_51aaf7d8_bzF(float[] fArray, int n, qbC qbC2, int n2) {
        int n3 = 0;
        while (n3 < n2) {
            int n4 = this.method_b92e7148_Dne(qbC2);
            if (n4 == -1) {
                return -1;
            }
            int n5 = n4 * this.field_2092ae_Dne;
            int n6 = 0;
            while (n6 < this.field_2092ae_Dne) {
                fArray[n + n3++] = this.field_3f1c586_Dne[n5 + n6++];
            }
        }
        return 0;
    }

    zbP() {
    }

    int method_b92e7148_Dne(qbC qbC2) {
        int n = 0;
        aBq aBq2 = this.field_372efdc_Dne;
        int n2 = qbC2.method_ce7f5d9c_Dne(aBq2.field_2092ae_Dne);
        if (n2 >= 0) {
            n = aBq2.field_3f1c589_Dne[n2];
            qbC2.method_ce7f5da9_Dne(aBq2.field_4039e0a_FWm[n2]);
            if (n <= 0) {
                return -n;
            }
        }
        do {
            switch (qbC2.method_7c6f602c_FWm()) {
                case 0: {
                    n = aBq2.field_59d86bc_bzF[n];
                    break;
                }
                case 1: {
                    n = aBq2.field_4a92422_Qnq[n];
                    break;
                }
                default: {
                    return -1;
                }
            }
        } while (n > 0);
        return -n;
    }

    int method_982ee6c4_Dne(float[] fArray, int n, qbC qbC2, int n2, int n3) {
        int n4 = this.method_b92e7148_Dne(qbC2);
        if (n4 == -1) {
            return -1;
        }
        switch (n3) {
            case -1: {
                int n5 = 0;
                int n6 = 0;
                while (n5 < this.field_2092ae_Dne) {
                    fArray[n + n6] = this.field_3f1c586_Dne[n4 * this.field_2092ae_Dne + n5];
                    ++n5;
                    n6 += n2;
                }
                break;
            }
            case 0: {
                int n7 = 0;
                int n8 = 0;
                while (n7 < this.field_2092ae_Dne) {
                    int n9 = n + n8;
                    fArray[n9] = fArray[n9] + this.field_3f1c586_Dne[n4 * this.field_2092ae_Dne + n7];
                    ++n7;
                    n8 += n2;
                }
                break;
            }
            case 1: {
                int n10 = 0;
                int n11 = 0;
                while (n10 < this.field_2092ae_Dne) {
                    int n12 = n + n11;
                    fArray[n12] = fArray[n12] * this.field_3f1c586_Dne[n4 * this.field_2092ae_Dne + n10];
                    ++n10;
                    n11 += n2;
                }
                break;
            }
        }
        return n4;
    }

    aBq method_230c7e3b_Dne() {
        int n;
        int n2;
        int n3;
        int n4;
        int n5 = 0;
        aBq aBq2 = new aBq(this);
        aBq2.field_59d86bc_bzF = new int[this.field_21260d_FWm * 2];
        int[] nArray = aBq2.field_59d86bc_bzF;
        aBq2.field_4a92422_Qnq = new int[this.field_21260d_FWm * 2];
        int[] nArray2 = aBq2.field_4a92422_Qnq;
        int[] nArray3 = zbP.method_78293d69_Dne(this.field_36e7422_Dne.field_3f1c589_Dne, this.field_36e7422_Dne.field_21260d_FWm);
        if (nArray3 == null) {
            return null;
        }
        aBq2.field_21260d_FWm = this.field_21260d_FWm * 2;
        for (n4 = 0; n4 < this.field_21260d_FWm; ++n4) {
            if (this.field_36e7422_Dne.field_3f1c589_Dne[n4] <= 0) continue;
            n3 = 0;
            for (n2 = 0; n2 < this.field_36e7422_Dne.field_3f1c589_Dne[n4] - 1; ++n2) {
                n = nArray3[n4] >>> n2 & 1;
                if (n == 0) {
                    if (nArray[n3] == 0) {
                        nArray[n3] = ++n5;
                    }
                    n3 = nArray[n3];
                    continue;
                }
                if (nArray2[n3] == 0) {
                    nArray2[n3] = ++n5;
                }
                n3 = nArray2[n3];
            }
            if ((nArray3[n4] >>> n2 & 1) == 0) {
                nArray[n3] = -n4;
                continue;
            }
            nArray2[n3] = -n4;
        }
        aBq2.field_2092ae_Dne = xhl_0.method_ce7f5d9c_Dne(this.field_21260d_FWm) - 4;
        if (aBq2.field_2092ae_Dne < 5) {
            aBq2.field_2092ae_Dne = 5;
        }
        n4 = 1 << aBq2.field_2092ae_Dne;
        aBq2.field_3f1c589_Dne = new int[n4];
        aBq2.field_4039e0a_FWm = new int[n4];
        for (n3 = 0; n3 < n4; ++n3) {
            n2 = 0;
            n = 0;
            for (n = 0; n < aBq2.field_2092ae_Dne && (n2 > 0 || n == 0); ++n) {
                n2 = (n3 & 1 << n) != 0 ? nArray2[n2] : nArray[n2];
            }
            aBq2.field_3f1c589_Dne[n3] = n2;
            aBq2.field_4039e0a_FWm[n3] = n;
        }
        return aBq2;
    }

    private static float method_c00ed3d9_Dne(int n, float[] fArray, int n2, float[] fArray2, int n3) {
        float f = 0.0f;
        for (int i = 0; i < n; ++i) {
            float f2 = fArray[n2 + i] - fArray2[i * n3];
            f += f2 * f2;
        }
        return f;
    }

    int method_8b5e6b10_Dne(Vey vey) {
        this.field_36e7422_Dne = vey;
        this.field_21260d_FWm = vey.field_21260d_FWm;
        this.field_2092ae_Dne = vey.field_2092ae_Dne;
        this.field_3f1c586_Dne = vey.method_ce7eeb87_Dne();
        this.field_372efdc_Dne = this.method_230c7e3b_Dne();
        if (this.field_372efdc_Dne == null) {
            this.method_7a46289a_Dne();
            return -1;
        }
        return 0;
    }

    int method_ab070d99_Dne(int n, qbC qbC2) {
        qbC2.method_16cca7a_Dne(this.field_3f1c589_Dne[n], this.field_36e7422_Dne.field_3f1c589_Dne[n]);
        return this.field_36e7422_Dne.field_3f1c589_Dne[n];
    }

    synchronized int method_156cda65_Dne(float[] fArray, int n, qbC qbC2, int n2) {
        int n3;
        int n4 = n2 / this.field_2092ae_Dne;
        if (this.field_4039e0a_FWm.length < n4) {
            this.field_4039e0a_FWm = new int[n4];
        }
        for (n3 = 0; n3 < n4; ++n3) {
            int n5 = this.method_b92e7148_Dne(qbC2);
            if (n5 == -1) {
                return -1;
            }
            this.field_4039e0a_FWm[n3] = n5 * this.field_2092ae_Dne;
        }
        n3 = 0;
        int n6 = 0;
        while (n3 < this.field_2092ae_Dne) {
            for (int i = 0; i < n4; ++i) {
                int n7 = n + n6 + i;
                fArray[n7] = fArray[n7] + this.field_3f1c586_Dne[this.field_4039e0a_FWm[i] + n3];
            }
            ++n3;
            n6 += n4;
        }
        return 0;
    }

    int method_77ff68f8_Dne(float[] fArray, int n, int n2) {
        int n3 = this.method_2d2941b1_Dne(fArray, n);
        switch (n2) {
            case 0: {
                int n4 = 0;
                int n5 = 0;
                while (n4 < this.field_2092ae_Dne) {
                    int n6 = n5;
                    fArray[n6] = fArray[n6] - this.field_3f1c586_Dne[n3 * this.field_2092ae_Dne + n4];
                    ++n4;
                    n5 += n;
                }
                break;
            }
            case 1: {
                int n7 = 0;
                int n8 = 0;
                while (n7 < this.field_2092ae_Dne) {
                    float f = this.field_3f1c586_Dne[n3 * this.field_2092ae_Dne + n7];
                    if (f == 0.0f) {
                        fArray[n8] = 0.0f;
                    } else {
                        int n9 = n8;
                        fArray[n9] = fArray[n9] / f;
                    }
                    ++n7;
                    n8 += n;
                }
                break;
            }
        }
        return n3;
    }

    void method_7a46289a_Dne() {
    }

    int method_1f3c13cd_Dne(float[][] fArray, int n, int n2, qbC qbC2, int n3) {
        int n4 = 0;
        int n5 = n / n2;
        while (n5 < (n + n3) / n2) {
            int n6 = this.method_b92e7148_Dne(qbC2);
            if (n6 == -1) {
                return -1;
            }
            int n7 = n6 * this.field_2092ae_Dne;
            for (int i = 0; i < this.field_2092ae_Dne; ++i) {
                float[] fArray2 = fArray[n4++];
                int n8 = n5++;
                fArray2[n8] = fArray2[n8] + this.field_3f1c586_Dne[n7 + i];
                if (n4 != n2) continue;
                n4 = 0;
            }
        }
        return 0;
    }

    int method_2d2941b1_Dne(float[] fArray, int n) {
        int n2 = -1;
        float f = 0.0f;
        int n3 = 0;
        for (int i = 0; i < this.field_21260d_FWm; ++i) {
            if (this.field_36e7422_Dne.field_3f1c589_Dne[i] > 0) {
                float f2 = zbP.method_c00ed3d9_Dne(this.field_2092ae_Dne, this.field_3f1c586_Dne, n3, fArray, n);
                if (n2 == -1 || f2 < f) {
                    f = f2;
                    n2 = i;
                }
            }
            n3 += this.field_2092ae_Dne;
        }
        return n2;
    }
}

