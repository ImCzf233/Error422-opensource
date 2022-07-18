package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class MOU {
    int field_388da6_zGp;
    int field_267cf5_Qnq;
    long field_2092af_Dne;
    int field_2f0dd8_div;
    int field_2092ae_Dne;
    int field_2e5f1b_bzF;
    int field_2d29f4_aFZ;
    int field_22c602_IjH;
    qbC field_37aa85a_Dne;
    int field_20b857_DyG;
    int field_21260d_FWm;
    int field_33448c_mrb;
    AOl field_364942e_Dne;
    long field_21260e_FWm;
    float[][] field_7a46ee0b_Dne = new float[0][];

    public int method_7a46288d_Dne() {
        if (this.field_364942e_Dne != null && this.field_364942e_Dne.field_2e5f1b_bzF != 0) {
            this.field_37aa85a_Dne.method_ae128dc7_bzF();
        }
        return 0;
    }

    public int method_b9bcb96f_Dne(qlF qlF2) {
        int n;
        Lth lth = this.field_364942e_Dne.field_36a1eac_Dne;
        this.field_37aa85a_Dne.method_77c70b01_Dne(qlF2.field_3f1c582_Dne, qlF2.field_2092ae_Dne, qlF2.field_21260d_FWm);
        if (this.field_37aa85a_Dne.method_117d19dd_FWm(1) != 0) {
            return -1;
        }
        int n2 = this.field_37aa85a_Dne.method_117d19dd_FWm(this.field_364942e_Dne.field_267cf5_Qnq);
        if (n2 == -1) {
            return -1;
        }
        this.field_2d29f4_aFZ = n2;
        this.field_21260d_FWm = lth.field_83652c2c_Dne[this.field_2d29f4_aFZ].field_2092ae_Dne;
        if (this.field_21260d_FWm != 0) {
            this.field_2092ae_Dne = this.field_37aa85a_Dne.method_117d19dd_FWm(1);
            this.field_2e5f1b_bzF = this.field_37aa85a_Dne.method_117d19dd_FWm(1);
            if (this.field_2e5f1b_bzF == -1) {
                return -1;
            }
        } else {
            this.field_2092ae_Dne = 0;
            this.field_2e5f1b_bzF = 0;
        }
        this.field_2092af_Dne = qlF2.field_2092af_Dne;
        this.field_21260e_FWm = qlF2.field_21260e_FWm - 3L;
        this.field_388da6_zGp = qlF2.field_267cf5_Qnq;
        this.field_267cf5_Qnq = lth.field_3f1c589_Dne[this.field_21260d_FWm];
        if (this.field_7a46ee0b_Dne.length < lth.field_21260d_FWm) {
            this.field_7a46ee0b_Dne = new float[lth.field_21260d_FWm][];
        }
        for (n = 0; n < lth.field_21260d_FWm; ++n) {
            if (this.field_7a46ee0b_Dne[n] == null || this.field_7a46ee0b_Dne[n].length < this.field_267cf5_Qnq) {
                this.field_7a46ee0b_Dne[n] = new float[this.field_267cf5_Qnq];
                continue;
            }
            for (int i = 0; i < this.field_267cf5_Qnq; ++i) {
                this.field_7a46ee0b_Dne[n][i] = 0.0f;
            }
        }
        n = lth.field_4039e0a_FWm[lth.field_83652c2c_Dne[this.field_2d29f4_aFZ].field_267cf5_Qnq];
        return ghN.field_836c81da_Dne[n].method_412b3de3_Dne(this, this.field_364942e_Dne.field_322705c_Dne[this.field_2d29f4_aFZ]);
    }

    public void method_664cb829_Dne(AOl aOl) {
        this.field_364942e_Dne = aOl;
    }

    public MOU(AOl aOl) {
        this.field_37aa85a_Dne = new qbC();
        this.field_364942e_Dne = aOl;
        if (aOl.field_2e5f1b_bzF != 0) {
            this.field_37aa85a_Dne.method_7a46289a_Dne();
        }
    }
}

