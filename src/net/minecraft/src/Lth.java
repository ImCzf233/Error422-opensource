package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class Lth {
    int field_267cf5_Qnq;
    float field_2092ab_Dne;
    private static final int field_1ed017_ATE;
    int[] field_59d86bc_bzF = null;
    TqT[] field_83640150_Dne;
    float field_21260a_FWm;
    private static final int field_342264_ooe;
    int[] field_4a92422_Qnq = null;
    private static final int field_28e7fd_Vxn;
    int[] field_5781703_aFZ = null;
    private static final int field_367154_trS;
    public int field_2092ae_Dne;
    int field_29186d_XHL;
    int field_2f0dd8_div;
    Object[] field_5160db89_bzF = null;
    int field_2d29f4_aFZ;
    private static final int field_2e8486_ceE;
    private static final int field_348572_qLR;
    int field_33448c_mrb;
    private static byte[] field_3f1c582_Dne;
    int field_22c602_IjH;
    int field_388da6_zGp;
    public int field_21260d_FWm;
    int field_2a9ad6_Zpi;
    Object[] field_2b7e89fb_FWm = null;
    public int field_2e5f1b_bzF;
    int field_31b816_kGO;
    Object[] field_b382f6e3_Qnq = null;
    Object[] field_322705c_Dne = null;
    Vey[] field_8364c17d_Dne = null;
    int[] field_4039e0a_FWm = null;
    private static final int field_212c1b_EyB;
    XEH[] field_83652c2c_Dne = null;
    int[] field_3f1c589_Dne = new int[2];
    int field_36b0a9_udO;
    int field_20b857_DyG;

    public String toString() {
        return "version:" + new Integer(this.field_2092ae_Dne) + ", channels:" + new Integer(this.field_21260d_FWm) + ", rate:" + new Integer(this.field_2e5f1b_bzF) + ", bitrate:" + new Integer(this.field_267cf5_Qnq) + "," + new Integer(this.field_2d29f4_aFZ) + "," + new Integer(this.field_388da6_zGp);
    }

    static {
        field_28e7fd_Vxn = 3;
        field_212c1b_EyB = 1;
        field_348572_qLR = 1;
        field_367154_trS = -135;
        field_1ed017_ATE = 2;
        field_2e8486_ceE = 1;
        field_342264_ooe = -136;
        field_3f1c582_Dne = "vorbis".getBytes();
    }

    int method_92822509_FWm(qbC qbC2) {
        int n;
        this.field_2a9ad6_Zpi = qbC2.method_117d19dd_FWm(8) + 1;
        if (this.field_8364c17d_Dne == null || this.field_8364c17d_Dne.length != this.field_2a9ad6_Zpi) {
            this.field_8364c17d_Dne = new Vey[this.field_2a9ad6_Zpi];
        }
        for (n = 0; n < this.field_2a9ad6_Zpi; ++n) {
            this.field_8364c17d_Dne[n] = new Vey();
            if (this.field_8364c17d_Dne[n].method_92822509_FWm(qbC2) == 0) continue;
            this.method_7c6f6039_FWm();
            return -1;
        }
        this.field_22c602_IjH = qbC2.method_117d19dd_FWm(6) + 1;
        if (this.field_59d86bc_bzF == null || this.field_59d86bc_bzF.length != this.field_22c602_IjH) {
            this.field_59d86bc_bzF = new int[this.field_22c602_IjH];
        }
        if (this.field_2b7e89fb_FWm == null || this.field_2b7e89fb_FWm.length != this.field_22c602_IjH) {
            this.field_2b7e89fb_FWm = new Object[this.field_22c602_IjH];
        }
        for (n = 0; n < this.field_22c602_IjH; ++n) {
            this.field_59d86bc_bzF[n] = qbC2.method_117d19dd_FWm(16);
            if (this.field_59d86bc_bzF[n] < 0 || this.field_59d86bc_bzF[n] >= 1) {
                this.method_7c6f6039_FWm();
                return -1;
            }
            this.field_2b7e89fb_FWm[n] = qxf.field_83714c88_Dne[this.field_59d86bc_bzF[n]].method_4c6c354a_Dne(this, qbC2);
            if (this.field_2b7e89fb_FWm[n] != null) continue;
            this.method_7c6f6039_FWm();
            return -1;
        }
        this.field_33448c_mrb = qbC2.method_117d19dd_FWm(6) + 1;
        if (this.field_4a92422_Qnq == null || this.field_4a92422_Qnq.length != this.field_33448c_mrb) {
            this.field_4a92422_Qnq = new int[this.field_33448c_mrb];
        }
        if (this.field_5160db89_bzF == null || this.field_5160db89_bzF.length != this.field_33448c_mrb) {
            this.field_5160db89_bzF = new Object[this.field_33448c_mrb];
        }
        for (n = 0; n < this.field_33448c_mrb; ++n) {
            this.field_4a92422_Qnq[n] = qbC2.method_117d19dd_FWm(16);
            if (this.field_4a92422_Qnq[n] < 0 || this.field_4a92422_Qnq[n] >= 2) {
                this.method_7c6f6039_FWm();
                return -1;
            }
            this.field_5160db89_bzF[n] = WoN.field_83655631_Dne[this.field_4a92422_Qnq[n]].method_4c6c354a_Dne(this, qbC2);
            if (this.field_5160db89_bzF[n] != null) continue;
            this.method_7c6f6039_FWm();
            return -1;
        }
        this.field_29186d_XHL = qbC2.method_117d19dd_FWm(6) + 1;
        if (this.field_5781703_aFZ == null || this.field_5781703_aFZ.length != this.field_29186d_XHL) {
            this.field_5781703_aFZ = new int[this.field_29186d_XHL];
        }
        if (this.field_b382f6e3_Qnq == null || this.field_b382f6e3_Qnq.length != this.field_29186d_XHL) {
            this.field_b382f6e3_Qnq = new Object[this.field_29186d_XHL];
        }
        for (n = 0; n < this.field_29186d_XHL; ++n) {
            this.field_5781703_aFZ[n] = qbC2.method_117d19dd_FWm(16);
            if (this.field_5781703_aFZ[n] < 0 || this.field_5781703_aFZ[n] >= 3) {
                this.method_7c6f6039_FWm();
                return -1;
            }
            this.field_b382f6e3_Qnq[n] = bFq.field_8369c09a_Dne[this.field_5781703_aFZ[n]].method_4c6c354a_Dne(this, qbC2);
            if (this.field_b382f6e3_Qnq[n] != null) continue;
            this.method_7c6f6039_FWm();
            return -1;
        }
        this.field_2f0dd8_div = qbC2.method_117d19dd_FWm(6) + 1;
        if (this.field_4039e0a_FWm == null || this.field_4039e0a_FWm.length != this.field_2f0dd8_div) {
            this.field_4039e0a_FWm = new int[this.field_2f0dd8_div];
        }
        if (this.field_322705c_Dne == null || this.field_322705c_Dne.length != this.field_2f0dd8_div) {
            this.field_322705c_Dne = new Object[this.field_2f0dd8_div];
        }
        for (n = 0; n < this.field_2f0dd8_div; ++n) {
            this.field_4039e0a_FWm[n] = qbC2.method_117d19dd_FWm(16);
            if (this.field_4039e0a_FWm[n] < 0 || this.field_4039e0a_FWm[n] >= 1) {
                this.method_7c6f6039_FWm();
                return -1;
            }
            this.field_322705c_Dne[n] = ghN.field_836c81da_Dne[this.field_4039e0a_FWm[n]].method_4c6c354a_Dne(this, qbC2);
            if (this.field_322705c_Dne[n] != null) continue;
            this.method_7c6f6039_FWm();
            return -1;
        }
        this.field_20b857_DyG = qbC2.method_117d19dd_FWm(6) + 1;
        if (this.field_83652c2c_Dne == null || this.field_83652c2c_Dne.length != this.field_20b857_DyG) {
            this.field_83652c2c_Dne = new XEH[this.field_20b857_DyG];
        }
        for (n = 0; n < this.field_20b857_DyG; ++n) {
            this.field_83652c2c_Dne[n] = new XEH();
            this.field_83652c2c_Dne[n].field_2092ae_Dne = qbC2.method_117d19dd_FWm(1);
            this.field_83652c2c_Dne[n].field_21260d_FWm = qbC2.method_117d19dd_FWm(16);
            this.field_83652c2c_Dne[n].field_2e5f1b_bzF = qbC2.method_117d19dd_FWm(16);
            this.field_83652c2c_Dne[n].field_267cf5_Qnq = qbC2.method_117d19dd_FWm(8);
            if (this.field_83652c2c_Dne[n].field_21260d_FWm < 1 && this.field_83652c2c_Dne[n].field_2e5f1b_bzF < 1 && this.field_83652c2c_Dne[n].field_267cf5_Qnq < this.field_2f0dd8_div) continue;
            this.method_7c6f6039_FWm();
            return -1;
        }
        if (qbC2.method_117d19dd_FWm(1) != 1) {
            this.method_7c6f6039_FWm();
            return -1;
        }
        return 0;
    }

    int method_3c00b921_Qnq(qbC qbC2) {
        int n;
        qbC2.method_16cca7a_Dne(5, 8);
        qbC2.method_174dee1_Dne(field_3f1c582_Dne);
        qbC2.method_16cca7a_Dne(this.field_2a9ad6_Zpi - 1, 8);
        for (n = 0; n < this.field_2a9ad6_Zpi; ++n) {
            if (this.field_8364c17d_Dne[n].method_b92e7148_Dne(qbC2) == 0) continue;
            return -1;
        }
        qbC2.method_16cca7a_Dne(this.field_22c602_IjH - 1, 6);
        for (n = 0; n < this.field_22c602_IjH; ++n) {
            qbC2.method_16cca7a_Dne(this.field_59d86bc_bzF[n], 16);
            qxf.field_83714c88_Dne[this.field_59d86bc_bzF[n]].method_8791ad79_Dne(this.field_2b7e89fb_FWm[n], qbC2);
        }
        qbC2.method_16cca7a_Dne(this.field_33448c_mrb - 1, 6);
        for (n = 0; n < this.field_33448c_mrb; ++n) {
            qbC2.method_16cca7a_Dne(this.field_4a92422_Qnq[n], 16);
            WoN.field_83655631_Dne[this.field_4a92422_Qnq[n]].method_8791ad79_Dne(this.field_5160db89_bzF[n], qbC2);
        }
        qbC2.method_16cca7a_Dne(this.field_29186d_XHL - 1, 6);
        for (n = 0; n < this.field_29186d_XHL; ++n) {
            qbC2.method_16cca7a_Dne(this.field_5781703_aFZ[n], 16);
            bFq.field_8369c09a_Dne[this.field_5781703_aFZ[n]].method_8791ad79_Dne(this.field_b382f6e3_Qnq[n], qbC2);
        }
        qbC2.method_16cca7a_Dne(this.field_2f0dd8_div - 1, 6);
        for (n = 0; n < this.field_2f0dd8_div; ++n) {
            qbC2.method_16cca7a_Dne(this.field_4039e0a_FWm[n], 16);
            ghN.field_836c81da_Dne[this.field_4039e0a_FWm[n]].method_c7d9ac4c_Dne(this, this.field_322705c_Dne[n], qbC2);
        }
        qbC2.method_16cca7a_Dne(this.field_20b857_DyG - 1, 6);
        for (n = 0; n < this.field_20b857_DyG; ++n) {
            qbC2.method_16cca7a_Dne(this.field_83652c2c_Dne[n].field_2092ae_Dne, 1);
            qbC2.method_16cca7a_Dne(this.field_83652c2c_Dne[n].field_21260d_FWm, 16);
            qbC2.method_16cca7a_Dne(this.field_83652c2c_Dne[n].field_2e5f1b_bzF, 16);
            qbC2.method_16cca7a_Dne(this.field_83652c2c_Dne[n].field_267cf5_Qnq, 8);
        }
        qbC2.method_16cca7a_Dne(1, 1);
        return 0;
    }

    public Lth() {
        this.field_83640150_Dne = new TqT[64];
    }

    int method_ab23403b_bzF(qbC qbC2) {
        qbC2.method_16cca7a_Dne(1, 8);
        qbC2.method_174dee1_Dne(field_3f1c582_Dne);
        qbC2.method_16cca7a_Dne(0, 32);
        qbC2.method_16cca7a_Dne(this.field_21260d_FWm, 8);
        qbC2.method_16cca7a_Dne(this.field_2e5f1b_bzF, 32);
        qbC2.method_16cca7a_Dne(this.field_267cf5_Qnq, 32);
        qbC2.method_16cca7a_Dne(this.field_2d29f4_aFZ, 32);
        qbC2.method_16cca7a_Dne(this.field_388da6_zGp, 32);
        qbC2.method_16cca7a_Dne(xhl_0.method_117d19dd_FWm(this.field_3f1c589_Dne[0]), 4);
        qbC2.method_16cca7a_Dne(xhl_0.method_117d19dd_FWm(this.field_3f1c589_Dne[1]), 4);
        qbC2.method_16cca7a_Dne(1, 1);
        return 0;
    }

    public int method_ba5770e3_Dne(PRc pRc, qlF qlF2) {
        qbC qbC2 = new qbC();
        if (qlF2 != null) {
            qbC2.method_77c70b01_Dne(qlF2.field_3f1c582_Dne, qlF2.field_2092ae_Dne, qlF2.field_21260d_FWm);
            byte[] byArray = new byte[6];
            int n = qbC2.method_117d19dd_FWm(8);
            qbC2.method_2d277042_Dne(byArray, 6);
            if (byArray[0] != 118 || byArray[1] != 111 || byArray[2] != 114 || byArray[3] != 98 || byArray[4] != 105 || byArray[5] != 115) {
                return -1;
            }
            switch (n) {
                case 1: {
                    if (qlF2.field_2e5f1b_bzF == 0) {
                        return -1;
                    }
                    if (this.field_2e5f1b_bzF != 0) {
                        return -1;
                    }
                    return this.method_b92e7148_Dne(qbC2);
                }
                case 3: {
                    if (this.field_2e5f1b_bzF == 0) {
                        return -1;
                    }
                    return pRc.method_b92e7148_Dne(qbC2);
                }
                case 5: {
                    if (this.field_2e5f1b_bzF == 0 || pRc.field_3f1c582_Dne == null) {
                        return -1;
                    }
                    return this.method_92822509_FWm(qbC2);
                }
            }
        }
        return -1;
    }

    public void method_7c6f6039_FWm() {
        int n;
        for (n = 0; n < this.field_20b857_DyG; ++n) {
            this.field_83652c2c_Dne[n] = null;
        }
        this.field_83652c2c_Dne = null;
        for (n = 0; n < this.field_2f0dd8_div; ++n) {
            ghN.field_836c81da_Dne[this.field_4039e0a_FWm[n]].method_41cee5f6_Dne(this.field_322705c_Dne[n]);
        }
        this.field_322705c_Dne = null;
        for (n = 0; n < this.field_22c602_IjH; ++n) {
            qxf.field_83714c88_Dne[this.field_59d86bc_bzF[n]].method_41cee5f6_Dne(this.field_2b7e89fb_FWm[n]);
        }
        this.field_2b7e89fb_FWm = null;
        for (n = 0; n < this.field_33448c_mrb; ++n) {
            WoN.field_83655631_Dne[this.field_4a92422_Qnq[n]].method_41cee5f6_Dne(this.field_5160db89_bzF[n]);
        }
        this.field_5160db89_bzF = null;
        for (n = 0; n < this.field_29186d_XHL; ++n) {
            bFq.field_8369c09a_Dne[this.field_5781703_aFZ[n]].method_41cee5f6_Dne(this.field_b382f6e3_Qnq[n]);
        }
        this.field_b382f6e3_Qnq = null;
        for (n = 0; n < this.field_2a9ad6_Zpi; ++n) {
            if (this.field_8364c17d_Dne[n] == null) continue;
            this.field_8364c17d_Dne[n].method_7a46289a_Dne();
            this.field_8364c17d_Dne[n] = null;
        }
        this.field_8364c17d_Dne = null;
        for (n = 0; n < this.field_31b816_kGO; ++n) {
            this.field_83640150_Dne[n].method_7a46289a_Dne();
        }
    }

    public int method_b9bcb96f_Dne(qlF qlF2) {
        qbC qbC2 = new qbC();
        qbC2.method_77c70b01_Dne(qlF2.field_3f1c582_Dne, qlF2.field_2092ae_Dne, qlF2.field_21260d_FWm);
        if (qbC2.method_117d19dd_FWm(1) != 0) {
            return -135;
        }
        int n = 0;
        for (int i = this.field_20b857_DyG; i > 1; i >>>= 1) {
            ++n;
        }
        int n2 = qbC2.method_117d19dd_FWm(n);
        if (n2 == -1) {
            return -136;
        }
        return this.field_3f1c589_Dne[this.field_83652c2c_Dne[n2].field_2092ae_Dne];
    }

    public void method_7a46289a_Dne() {
        this.field_2e5f1b_bzF = 0;
    }

    int method_b92e7148_Dne(qbC qbC2) {
        this.field_2092ae_Dne = qbC2.method_117d19dd_FWm(32);
        if (this.field_2092ae_Dne != 0) {
            return -1;
        }
        this.field_21260d_FWm = qbC2.method_117d19dd_FWm(8);
        this.field_2e5f1b_bzF = qbC2.method_117d19dd_FWm(32);
        this.field_267cf5_Qnq = qbC2.method_117d19dd_FWm(32);
        this.field_2d29f4_aFZ = qbC2.method_117d19dd_FWm(32);
        this.field_388da6_zGp = qbC2.method_117d19dd_FWm(32);
        this.field_3f1c589_Dne[0] = 1 << qbC2.method_117d19dd_FWm(4);
        this.field_3f1c589_Dne[1] = 1 << qbC2.method_117d19dd_FWm(4);
        if (this.field_2e5f1b_bzF < 1 || this.field_21260d_FWm < 1 || this.field_3f1c589_Dne[0] < 8 || this.field_3f1c589_Dne[1] < this.field_3f1c589_Dne[0] || qbC2.method_117d19dd_FWm(1) != 1) {
            this.method_7c6f6039_FWm();
            return -1;
        }
        return 0;
    }
}

