package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
class Kzn
extends WoN {
    float[] field_3f1c586_Dne = null;

    static void method_88ea7493_Dne(float[] fArray, float[] fArray2, int n) {
        int n2;
        int n3;
        int n4 = n / 2;
        float[] fArray3 = new float[n4];
        float[] fArray4 = new float[n4];
        float[] fArray5 = new float[n4 + 1];
        float[] fArray6 = new float[n4 + 1];
        float[] fArray7 = new float[n4];
        float[] fArray8 = new float[n4];
        for (n3 = 0; n3 < n4; ++n3) {
            fArray3[n3] = (float)(-2.0 * Math.cos(fArray[n3 * 2]));
            fArray4[n3] = (float)(-2.0 * Math.cos(fArray[n3 * 2 + 1]));
        }
        for (n2 = 0; n2 < n4; ++n2) {
            fArray5[n2] = 0.0f;
            fArray6[n2] = 1.0f;
            fArray7[n2] = 0.0f;
            fArray8[n2] = 1.0f;
        }
        fArray6[n2] = 1.0f;
        fArray5[n2] = 1.0f;
        for (n3 = 1; n3 < n + 1; ++n3) {
            float f = 0.0f;
            float f2 = 0.0f;
            for (n2 = 0; n2 < n4; ++n2) {
                float f3 = fArray3[n2] * fArray6[n2] + fArray5[n2];
                fArray5[n2] = fArray6[n2];
                fArray6[n2] = f2;
                f2 += f3;
                f3 = fArray4[n2] * fArray8[n2] + fArray7[n2];
                fArray7[n2] = fArray8[n2];
                fArray8[n2] = f;
                f += f3;
            }
            fArray2[n3 - 1] = (f2 + fArray6[n2] + f - fArray5[n2]) / 2.0f;
            fArray6[n2] = f2;
            fArray5[n2] = f;
        }
    }

    void method_c38b13d5_FWm(Object object) {
    }

    void method_fa1f39e3_bzF(Object object) {
    }

    int method_dcec1115_Dne(MOU mOU, Object object, float[] fArray, float[] fArray2, Object object2) {
        return 0;
    }

    Object method_b1b5d6e6_Dne(MOU mOU, Object object, Object object2) {
        int n;
        QrG qrG = (QrG)object;
        IAS iAS = qrG.field_367ff91_Dne;
        float[] fArray = null;
        if (object2 instanceof float[]) {
            fArray = (float[])object2;
        }
        if ((n = mOU.field_37aa85a_Dne.method_117d19dd_FWm(iAS.field_267cf5_Qnq)) > 0) {
            int n2 = (1 << iAS.field_267cf5_Qnq) - 1;
            float f = (float)n / (float)n2 * (float)iAS.field_2d29f4_aFZ;
            int n3 = mOU.field_37aa85a_Dne.method_117d19dd_FWm(xhl_0.method_ce7f5d9c_Dne(iAS.field_388da6_zGp));
            if (n3 != -1 && n3 < iAS.field_388da6_zGp) {
                int n4;
                zbP zbP2 = mOU.field_364942e_Dne.field_83750e9f_Dne[iAS.field_3f1c589_Dne[n3]];
                float f2 = 0.0f;
                if (fArray == null || fArray.length < qrG.field_2e5f1b_bzF + 1) {
                    fArray = new float[qrG.field_2e5f1b_bzF + 1];
                } else {
                    for (n4 = 0; n4 < fArray.length; ++n4) {
                        fArray[n4] = 0.0f;
                    }
                }
                for (n4 = 0; n4 < qrG.field_2e5f1b_bzF; n4 += zbP2.field_2092ae_Dne) {
                    if (zbP2.method_51aaf7d8_bzF(fArray, n4, mOU.field_37aa85a_Dne, zbP2.field_2092ae_Dne) != -1) continue;
                    return null;
                }
                n4 = 0;
                while (n4 < qrG.field_2e5f1b_bzF) {
                    for (int i = 0; i < zbP2.field_2092ae_Dne; ++i) {
                        int n5 = n4++;
                        fArray[n5] = fArray[n5] + f2;
                    }
                    f2 = fArray[n4 - 1];
                }
                fArray[qrG.field_2e5f1b_bzF] = f;
                return fArray;
            }
        }
        return null;
    }

    Object method_8dde1bfc_Dne(Object object) {
        VOn vOn = new VOn(this);
        IAS iAS = (IAS)object;
        vOn.field_3f1c589_Dne = new int[iAS.field_2092ae_Dne];
        vOn.field_3f1c586_Dne = new float[iAS.field_2e5f1b_bzF];
        vOn.field_2092af_Dne = -1L;
        return vOn;
    }

    int method_33aed28a_Dne(MOU mOU, Object object, Object object2, float[] fArray) {
        QrG qrG = (QrG)object;
        IAS iAS = qrG.field_367ff91_Dne;
        if (object2 != null) {
            float[] fArray2 = (float[])object2;
            float f = fArray2[qrG.field_2e5f1b_bzF];
            kYk.method_c1915f25_Dne(fArray, qrG.field_3f1c589_Dne, qrG.field_2092ae_Dne, qrG.field_21260d_FWm, fArray2, qrG.field_2e5f1b_bzF, f, iAS.field_2d29f4_aFZ);
            return 1;
        }
        for (int i = 0; i < qrG.field_2092ae_Dne; ++i) {
            fArray[i] = 0.0f;
        }
        return 0;
    }

    static float method_ce7f5256_Dne(float f) {
        return (float)(13.1 * Math.atan(7.4E-4 * (double)f) + 2.24 * Math.atan((double)(f * f) * 1.85E-8) + 1.0E-4 * (double)f);
    }

    void method_8791ad79_Dne(Object object, qbC qbC2) {
        IAS iAS = (IAS)object;
        qbC2.method_16cca7a_Dne(iAS.field_2092ae_Dne, 8);
        qbC2.method_16cca7a_Dne(iAS.field_21260d_FWm, 16);
        qbC2.method_16cca7a_Dne(iAS.field_2e5f1b_bzF, 16);
        qbC2.method_16cca7a_Dne(iAS.field_267cf5_Qnq, 6);
        qbC2.method_16cca7a_Dne(iAS.field_2d29f4_aFZ, 8);
        qbC2.method_16cca7a_Dne(iAS.field_388da6_zGp - 1, 4);
        for (int i = 0; i < iAS.field_388da6_zGp; ++i) {
            qbC2.method_16cca7a_Dne(iAS.field_3f1c589_Dne[i], 8);
        }
    }

    Kzn() {
    }

    static void method_2d5f508e_Dne(float[] fArray, float[] fArray2, float f, QrG qrG, String string, int n) {
        float[] fArray3 = new float[Math.max(qrG.field_21260d_FWm * 2, qrG.field_2e5f1b_bzF * 2 + 2)];
        if (f == 0.0f) {
            for (int i = 0; i < qrG.field_2092ae_Dne; ++i) {
                fArray[i] = 0.0f;
            }
            return;
        }
        qrG.field_3751bec_Dne.method_88ea6950_Dne(fArray3, fArray2, f);
        for (int i = 0; i < qrG.field_2092ae_Dne; ++i) {
            fArray[i] = fArray3[qrG.field_3f1c589_Dne[i]];
        }
    }

    void method_41cee5f6_Dne(Object object) {
    }

    Object method_9e7eedd9_Dne(AOl aOl, XEH xEH, Object object) {
        Lth lth = aOl.field_36a1eac_Dne;
        IAS iAS = (IAS)object;
        QrG qrG = new QrG(this);
        qrG.field_2e5f1b_bzF = iAS.field_2092ae_Dne;
        qrG.field_2092ae_Dne = lth.field_3f1c589_Dne[xEH.field_2092ae_Dne] / 2;
        qrG.field_21260d_FWm = iAS.field_2e5f1b_bzF;
        qrG.field_367ff91_Dne = iAS;
        qrG.field_3751bec_Dne.method_16cca7a_Dne(qrG.field_21260d_FWm, qrG.field_2e5f1b_bzF);
        float f = (float)qrG.field_21260d_FWm / Kzn.method_ce7f5256_Dne((float)((double)iAS.field_21260d_FWm / 2.0));
        qrG.field_3f1c589_Dne = new int[qrG.field_2092ae_Dne];
        for (int i = 0; i < qrG.field_2092ae_Dne; ++i) {
            int n = (int)Math.floor(Kzn.method_ce7f5256_Dne((float)((double)iAS.field_21260d_FWm / 2.0 / (double)qrG.field_2092ae_Dne * (double)i)) * f);
            if (n >= qrG.field_21260d_FWm) {
                n = qrG.field_21260d_FWm;
            }
            qrG.field_3f1c589_Dne[i] = n;
        }
        return qrG;
    }

    static float method_117d0e97_FWm(float f) {
        return (float)Math.exp((double)f * 0.11512925);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    int method_a36a05ae_Dne(MOU mOU, Object object, float[] fArray) {
        QrG qrG = (QrG)object;
        IAS iAS = qrG.field_367ff91_Dne;
        int n = mOU.field_37aa85a_Dne.method_117d19dd_FWm(iAS.field_267cf5_Qnq);
        if (n > 0) {
            int n2 = (1 << iAS.field_267cf5_Qnq) - 1;
            float f = (float)n / (float)n2 * (float)iAS.field_2d29f4_aFZ;
            int n3 = mOU.field_37aa85a_Dne.method_117d19dd_FWm(xhl_0.method_ce7f5d9c_Dne(iAS.field_388da6_zGp));
            if (n3 != -1 && n3 < iAS.field_388da6_zGp) {
                Kzn kzn = this;
                synchronized (kzn) {
                    int n4;
                    if (this.field_3f1c586_Dne == null || this.field_3f1c586_Dne.length < qrG.field_2e5f1b_bzF) {
                        this.field_3f1c586_Dne = new float[qrG.field_2e5f1b_bzF];
                    } else {
                        for (int i = 0; i < qrG.field_2e5f1b_bzF; ++i) {
                            this.field_3f1c586_Dne[i] = 0.0f;
                        }
                    }
                    zbP zbP2 = mOU.field_364942e_Dne.field_83750e9f_Dne[iAS.field_3f1c589_Dne[n3]];
                    float f2 = 0.0f;
                    for (n4 = 0; n4 < qrG.field_2e5f1b_bzF; ++n4) {
                        fArray[n4] = 0.0f;
                    }
                    for (n4 = 0; n4 < qrG.field_2e5f1b_bzF; n4 += zbP2.field_2092ae_Dne) {
                        if (zbP2.method_982ee6c4_Dne(this.field_3f1c586_Dne, n4, mOU.field_37aa85a_Dne, 1, -1) != -1) continue;
                        for (int i = 0; i < qrG.field_2092ae_Dne; ++i) {
                            fArray[i] = 0.0f;
                        }
                        return 0;
                    }
                    n4 = 0;
                    while (n4 < qrG.field_2e5f1b_bzF) {
                        for (int i = 0; i < zbP2.field_2092ae_Dne; ++i) {
                            int n5 = n4++;
                            this.field_3f1c586_Dne[n5] = this.field_3f1c586_Dne[n5] + f2;
                        }
                        f2 = this.field_3f1c586_Dne[n4 - 1];
                    }
                    kYk.method_c1915f25_Dne(fArray, qrG.field_3f1c589_Dne, qrG.field_2092ae_Dne, qrG.field_21260d_FWm, this.field_3f1c586_Dne, qrG.field_2e5f1b_bzF, f, iAS.field_2d29f4_aFZ);
                    return 1;
                }
            }
        }
        return 0;
    }

    Object method_4c6c354a_Dne(Lth lth, qbC qbC2) {
        IAS iAS = new IAS(this);
        iAS.field_2092ae_Dne = qbC2.method_117d19dd_FWm(8);
        iAS.field_21260d_FWm = qbC2.method_117d19dd_FWm(16);
        iAS.field_2e5f1b_bzF = qbC2.method_117d19dd_FWm(16);
        iAS.field_267cf5_Qnq = qbC2.method_117d19dd_FWm(6);
        iAS.field_2d29f4_aFZ = qbC2.method_117d19dd_FWm(8);
        iAS.field_388da6_zGp = qbC2.method_117d19dd_FWm(4) + 1;
        if (iAS.field_2092ae_Dne < 1 || iAS.field_21260d_FWm < 1 || iAS.field_2e5f1b_bzF < 1 || iAS.field_388da6_zGp < 1) {
            return null;
        }
        for (int i = 0; i < iAS.field_388da6_zGp; ++i) {
            iAS.field_3f1c589_Dne[i] = qbC2.method_117d19dd_FWm(8);
            if (iAS.field_3f1c589_Dne[i] >= 0 && iAS.field_3f1c589_Dne[i] < lth.field_2a9ad6_Zpi) continue;
            return null;
        }
        return iAS;
    }
}

