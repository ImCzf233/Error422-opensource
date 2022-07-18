package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
class QwU {
    int field_2d29f4_aFZ;
    int field_267cf5_Qnq;
    float field_2e5f18_bzF;
    float field_2092ab_Dne;
    float field_21260a_FWm;
    int[] field_4039e0a_FWm;
    int[] field_59d86bc_bzF;
    static final int field_2e5f1b_bzF;
    int field_22c602_IjH;
    int field_33448c_mrb;
    int[] field_5781703_aFZ;
    int field_2f0dd8_div;
    int field_29186d_XHL;
    int field_388da6_zGp;
    static final int field_21260d_FWm;
    float field_267cf2_Qnq;
    int[] field_4a92422_Qnq;
    int[][] field_7a46ee0e_Dne;
    int[] field_3f1c589_Dne = new int[31];
    static final int field_2092ae_Dne;
    final /* synthetic */ iVy field_376dee0_Dne;
    int field_20b857_DyG;

    Object method_fc07f5d8_Dne() {
        QwU qwU = this;
        QwU qwU2 = new QwU(this.field_376dee0_Dne);
        qwU2.field_267cf5_Qnq = qwU.field_267cf5_Qnq;
        System.arraycopy(qwU.field_3f1c589_Dne, 0, qwU2.field_3f1c589_Dne, 0, 31);
        System.arraycopy(qwU.field_4039e0a_FWm, 0, qwU2.field_4039e0a_FWm, 0, 16);
        System.arraycopy(qwU.field_59d86bc_bzF, 0, qwU2.field_59d86bc_bzF, 0, 16);
        System.arraycopy(qwU.field_4a92422_Qnq, 0, qwU2.field_4a92422_Qnq, 0, 16);
        for (int i = 0; i < 16; ++i) {
            System.arraycopy(qwU.field_7a46ee0e_Dne[i], 0, qwU2.field_7a46ee0e_Dne[i], 0, 8);
        }
        qwU2.field_2d29f4_aFZ = qwU.field_2d29f4_aFZ;
        System.arraycopy(qwU.field_5781703_aFZ, 0, qwU2.field_5781703_aFZ, 0, 65);
        qwU2.field_2092ab_Dne = qwU.field_2092ab_Dne;
        qwU2.field_21260a_FWm = qwU.field_21260a_FWm;
        qwU2.field_2e5f18_bzF = qwU.field_2e5f18_bzF;
        qwU2.field_388da6_zGp = qwU.field_388da6_zGp;
        qwU2.field_20b857_DyG = qwU.field_20b857_DyG;
        qwU2.field_2f0dd8_div = qwU.field_2f0dd8_div;
        qwU2.field_267cf2_Qnq = qwU.field_267cf2_Qnq;
        qwU2.field_22c602_IjH = qwU.field_22c602_IjH;
        qwU2.field_33448c_mrb = qwU.field_33448c_mrb;
        qwU2.field_29186d_XHL = qwU.field_29186d_XHL;
        return qwU2;
    }

    void method_7a46289a_Dne() {
        this.field_3f1c589_Dne = null;
        this.field_4039e0a_FWm = null;
        this.field_59d86bc_bzF = null;
        this.field_4a92422_Qnq = null;
        this.field_7a46ee0e_Dne = null;
        this.field_5781703_aFZ = null;
    }

    QwU(iVy iVy2) {
        this.field_376dee0_Dne = iVy2;
        this.field_4039e0a_FWm = new int[16];
        this.field_59d86bc_bzF = new int[16];
        this.field_4a92422_Qnq = new int[16];
        this.field_7a46ee0e_Dne = new int[16][];
        this.field_5781703_aFZ = new int[65];
        for (int i = 0; i < this.field_7a46ee0e_Dne.length; ++i) {
            this.field_7a46ee0e_Dne[i] = new int[8];
        }
    }

    static {
        field_2092ae_Dne = 63;
        field_2e5f1b_bzF = 31;
        field_21260d_FWm = 16;
    }
}

