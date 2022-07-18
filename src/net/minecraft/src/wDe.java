package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
class wDe
extends ghN {
    int[] field_3f1c589_Dne = null;
    Object[] field_322705c_Dne = null;
    float[][] field_7a46ee0b_Dne = null;
    static int field_2092ae_Dne = 0;
    int[] field_4039e0a_FWm = null;

    void method_c7d9ac4c_Dne(Lth lth, Object object, qbC qbC2) {
        int n;
        ajq ajq2 = (ajq)object;
        if (ajq2.field_2092ae_Dne > 1) {
            qbC2.method_16cca7a_Dne(1, 1);
            qbC2.method_16cca7a_Dne(ajq2.field_2092ae_Dne - 1, 4);
        } else {
            qbC2.method_16cca7a_Dne(0, 1);
        }
        if (ajq2.field_21260d_FWm > 0) {
            qbC2.method_16cca7a_Dne(1, 1);
            qbC2.method_16cca7a_Dne(ajq2.field_21260d_FWm - 1, 8);
            for (n = 0; n < ajq2.field_21260d_FWm; ++n) {
                qbC2.method_16cca7a_Dne(ajq2.field_6d92991_zGp[n], xhl_0.method_117d19dd_FWm(lth.field_21260d_FWm));
                qbC2.method_16cca7a_Dne(ajq2.field_3f65500_DyG[n], xhl_0.method_117d19dd_FWm(lth.field_21260d_FWm));
            }
        } else {
            qbC2.method_16cca7a_Dne(0, 1);
        }
        qbC2.method_16cca7a_Dne(0, 2);
        if (ajq2.field_2092ae_Dne > 1) {
            for (n = 0; n < lth.field_21260d_FWm; ++n) {
                qbC2.method_16cca7a_Dne(ajq2.field_3f1c589_Dne[n], 4);
            }
        }
        for (n = 0; n < ajq2.field_2092ae_Dne; ++n) {
            qbC2.method_16cca7a_Dne(ajq2.field_4039e0a_FWm[n], 8);
            qbC2.method_16cca7a_Dne(ajq2.field_59d86bc_bzF[n], 8);
            qbC2.method_16cca7a_Dne(ajq2.field_4a92422_Qnq[n], 8);
        }
    }

    synchronized int method_412b3de3_Dne(MOU mOU, Object object) {
        int n;
        int n2;
        int n3;
        AOl aOl = mOU.field_364942e_Dne;
        Lth lth = aOl.field_36a1eac_Dne;
        ZPy zPy = (ZPy)object;
        ajq ajq2 = zPy.field_3738604_Dne;
        XEH xEH = zPy.field_36eded1_Dne;
        int n4 = mOU.field_267cf5_Qnq = lth.field_3f1c589_Dne[mOU.field_21260d_FWm];
        float[] fArray = aOl.field_843a3ec6_Dne[mOU.field_21260d_FWm][mOU.field_2092ae_Dne][mOU.field_2e5f1b_bzF][xEH.field_21260d_FWm];
        if (this.field_7a46ee0b_Dne == null || this.field_7a46ee0b_Dne.length < lth.field_21260d_FWm) {
            this.field_7a46ee0b_Dne = new float[lth.field_21260d_FWm][];
            this.field_4039e0a_FWm = new int[lth.field_21260d_FWm];
            this.field_3f1c589_Dne = new int[lth.field_21260d_FWm];
            this.field_322705c_Dne = new Object[lth.field_21260d_FWm];
        }
        for (n3 = 0; n3 < lth.field_21260d_FWm; ++n3) {
            float[] fArray2 = mOU.field_7a46ee0b_Dne[n3];
            n2 = ajq2.field_3f1c589_Dne[n3];
            this.field_322705c_Dne[n3] = zPy.field_83655631_Dne[n2].method_b1b5d6e6_Dne(mOU, zPy.field_2b7e89fb_FWm[n2], this.field_322705c_Dne[n3]);
            this.field_4039e0a_FWm[n3] = this.field_322705c_Dne[n3] != null ? 1 : 0;
            for (n = 0; n < n4 / 2; ++n) {
                fArray2[n] = 0.0f;
            }
        }
        for (n3 = 0; n3 < ajq2.field_21260d_FWm; ++n3) {
            if (this.field_4039e0a_FWm[ajq2.field_6d92991_zGp[n3]] == 0 && this.field_4039e0a_FWm[ajq2.field_3f65500_DyG[n3]] == 0) continue;
            this.field_4039e0a_FWm[ajq2.field_6d92991_zGp[n3]] = 1;
            this.field_4039e0a_FWm[ajq2.field_3f65500_DyG[n3]] = 1;
        }
        for (n3 = 0; n3 < ajq2.field_2092ae_Dne; ++n3) {
            int n5 = 0;
            for (n2 = 0; n2 < lth.field_21260d_FWm; ++n2) {
                if (ajq2.field_3f1c589_Dne[n2] != n3) continue;
                this.field_3f1c589_Dne[n5] = this.field_4039e0a_FWm[n2] != 0 ? 1 : 0;
                this.field_7a46ee0b_Dne[n5++] = mOU.field_7a46ee0b_Dne[n2];
            }
            zPy.field_8369c09a_Dne[n3].method_b7f2d278_Dne(mOU, zPy.field_b382f6e3_Qnq[n3], this.field_7a46ee0b_Dne, this.field_3f1c589_Dne, n5);
        }
        for (n3 = ajq2.field_21260d_FWm - 1; n3 >= 0; --n3) {
            float[] fArray3 = mOU.field_7a46ee0b_Dne[ajq2.field_6d92991_zGp[n3]];
            float[] fArray4 = mOU.field_7a46ee0b_Dne[ajq2.field_3f65500_DyG[n3]];
            for (n = 0; n < n4 / 2; ++n) {
                float f = fArray3[n];
                float f2 = fArray4[n];
                if (f > 0.0f) {
                    if (f2 > 0.0f) {
                        fArray3[n] = f;
                        fArray4[n] = f - f2;
                        continue;
                    }
                    fArray4[n] = f;
                    fArray3[n] = f + f2;
                    continue;
                }
                if (f2 > 0.0f) {
                    fArray3[n] = f;
                    fArray4[n] = f + f2;
                    continue;
                }
                fArray4[n] = f;
                fArray3[n] = f - f2;
            }
        }
        for (n3 = 0; n3 < lth.field_21260d_FWm; ++n3) {
            float[] fArray5 = mOU.field_7a46ee0b_Dne[n3];
            int n6 = ajq2.field_3f1c589_Dne[n3];
            zPy.field_83655631_Dne[n6].method_33aed28a_Dne(mOU, zPy.field_2b7e89fb_FWm[n6], this.field_322705c_Dne[n3], fArray5);
        }
        for (n3 = 0; n3 < lth.field_21260d_FWm; ++n3) {
            float[] fArray6 = mOU.field_7a46ee0b_Dne[n3];
            ((Sti)aOl.field_4c8cc277_Dne[mOU.field_21260d_FWm][0]).method_4d7ddc8f_FWm(fArray6, fArray6);
        }
        for (n3 = 0; n3 < lth.field_21260d_FWm; ++n3) {
            int n7;
            float[] fArray7 = mOU.field_7a46ee0b_Dne[n3];
            if (this.field_4039e0a_FWm[n3] != 0) {
                for (n7 = 0; n7 < n4; ++n7) {
                    int n8 = n7;
                    fArray7[n8] = fArray7[n8] * fArray[n7];
                }
                continue;
            }
            for (n7 = 0; n7 < n4; ++n7) {
                fArray7[n7] = 0.0f;
            }
        }
        return 0;
    }

    void method_41cee5f6_Dne(Object object) {
    }

    wDe() {
    }

    Object method_9e7eedd9_Dne(AOl aOl, XEH xEH, Object object) {
        Lth lth = aOl.field_36a1eac_Dne;
        ZPy zPy = new ZPy(this);
        ajq ajq2 = zPy.field_3738604_Dne = (ajq)object;
        zPy.field_36eded1_Dne = xEH;
        zPy.field_322705c_Dne = new Object[ajq2.field_2092ae_Dne];
        zPy.field_2b7e89fb_FWm = new Object[ajq2.field_2092ae_Dne];
        zPy.field_b382f6e3_Qnq = new Object[ajq2.field_2092ae_Dne];
        zPy.field_83714c88_Dne = new qxf[ajq2.field_2092ae_Dne];
        zPy.field_83655631_Dne = new WoN[ajq2.field_2092ae_Dne];
        zPy.field_8369c09a_Dne = new bFq[ajq2.field_2092ae_Dne];
        for (int i = 0; i < ajq2.field_2092ae_Dne; ++i) {
            int n = ajq2.field_4039e0a_FWm[i];
            int n2 = ajq2.field_59d86bc_bzF[i];
            int n3 = ajq2.field_4a92422_Qnq[i];
            zPy.field_83714c88_Dne[i] = qxf.field_83714c88_Dne[lth.field_59d86bc_bzF[n]];
            zPy.field_322705c_Dne[i] = zPy.field_83714c88_Dne[i].method_9e7eedd9_Dne(aOl, xEH, lth.field_2b7e89fb_FWm[n]);
            zPy.field_83655631_Dne[i] = WoN.field_83655631_Dne[lth.field_4a92422_Qnq[n2]];
            zPy.field_2b7e89fb_FWm[i] = zPy.field_83655631_Dne[i].method_9e7eedd9_Dne(aOl, xEH, lth.field_5160db89_bzF[n2]);
            zPy.field_8369c09a_Dne[i] = bFq.field_8369c09a_Dne[lth.field_5781703_aFZ[n3]];
            zPy.field_b382f6e3_Qnq[i] = zPy.field_8369c09a_Dne[i].method_9e7eedd9_Dne(aOl, xEH, lth.field_b382f6e3_Qnq[n3]);
        }
        if (lth.field_31b816_kGO == 0 || aOl.field_2e5f1b_bzF != 0) {
            // empty if block
        }
        zPy.field_2092ae_Dne = lth.field_21260d_FWm;
        return zPy;
    }

    Object method_4c6c354a_Dne(Lth lth, qbC qbC2) {
        int n;
        ajq ajq2 = new ajq(this);
        ajq2.field_2092ae_Dne = qbC2.method_117d19dd_FWm(1) != 0 ? qbC2.method_117d19dd_FWm(4) + 1 : 1;
        if (qbC2.method_117d19dd_FWm(1) != 0) {
            ajq2.field_21260d_FWm = qbC2.method_117d19dd_FWm(8) + 1;
            for (n = 0; n < ajq2.field_21260d_FWm; ++n) {
                int n2 = ajq2.field_6d92991_zGp[n] = qbC2.method_117d19dd_FWm(xhl_0.method_117d19dd_FWm(lth.field_21260d_FWm));
                int n3 = ajq2.field_3f65500_DyG[n] = qbC2.method_117d19dd_FWm(xhl_0.method_117d19dd_FWm(lth.field_21260d_FWm));
                if (n2 >= 0 && n3 >= 0 && n2 != n3 && n2 < lth.field_21260d_FWm && n3 < lth.field_21260d_FWm) continue;
                ajq2.method_7a46289a_Dne();
                return null;
            }
        }
        if (qbC2.method_117d19dd_FWm(2) > 0) {
            ajq2.method_7a46289a_Dne();
            return null;
        }
        if (ajq2.field_2092ae_Dne > 1) {
            for (n = 0; n < lth.field_21260d_FWm; ++n) {
                ajq2.field_3f1c589_Dne[n] = qbC2.method_117d19dd_FWm(4);
                if (ajq2.field_3f1c589_Dne[n] < ajq2.field_2092ae_Dne) continue;
                ajq2.method_7a46289a_Dne();
                return null;
            }
        }
        for (n = 0; n < ajq2.field_2092ae_Dne; ++n) {
            ajq2.field_4039e0a_FWm[n] = qbC2.method_117d19dd_FWm(8);
            if (ajq2.field_4039e0a_FWm[n] >= lth.field_22c602_IjH) {
                ajq2.method_7a46289a_Dne();
                return null;
            }
            ajq2.field_59d86bc_bzF[n] = qbC2.method_117d19dd_FWm(8);
            if (ajq2.field_59d86bc_bzF[n] >= lth.field_33448c_mrb) {
                ajq2.method_7a46289a_Dne();
                return null;
            }
            ajq2.field_4a92422_Qnq[n] = qbC2.method_117d19dd_FWm(8);
            if (ajq2.field_4a92422_Qnq[n] < lth.field_29186d_XHL) continue;
            ajq2.method_7a46289a_Dne();
            return null;
        }
        return ajq2;
    }

    void method_c38b13d5_FWm(Object object) {
    }
}

