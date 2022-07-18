package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class AOl {
    long field_2092af_Dne;
    long field_388da7_zGp;
    int field_20b857_DyG;
    int field_29186d_XHL;
    float[] field_3f1c586_Dne;
    int field_31b816_kGO;
    Object[][] field_4c8cc277_Dne = new Object[2][];
    int field_267cf5_Qnq;
    byte[] field_59d86b5_bzF;
    long field_2e5f1c_bzF;
    Object[] field_322705c_Dne;
    int field_388da6_zGp;
    byte[] field_3f1c582_Dne;
    int field_2e5f1b_bzF;
    int field_2d29f4_aFZ;
    float[][] field_7a46ee0b_Dne;
    zbP[] field_83750e9f_Dne;
    byte[] field_4039e03_FWm;
    int field_2f0dd8_div;
    int field_2a9ad6_Zpi;
    int field_36b0a9_udO;
    float[][][][][] field_843a3ec6_Dne = new float[2][][][][];
    long field_21260e_FWm;
    int field_33448c_mrb;
    Lth field_36a1eac_Dne;
    long field_2d29f5_aFZ;
    long field_267cf6_Qnq;
    static final int field_21260d_FWm;
    static final float field_2092ab_Dne = (float)Math.PI;
    static final int field_2092ae_Dne;
    int field_22c602_IjH;

    public AOl() {
        this.field_843a3ec6_Dne[0] = new float[2][][][];
        this.field_843a3ec6_Dne[0][0] = new float[2][][];
        this.field_843a3ec6_Dne[0][1] = new float[2][][];
        this.field_843a3ec6_Dne[0][0][0] = new float[2][];
        this.field_843a3ec6_Dne[0][0][1] = new float[2][];
        this.field_843a3ec6_Dne[0][1][0] = new float[2][];
        this.field_843a3ec6_Dne[0][1][1] = new float[2][];
        this.field_843a3ec6_Dne[1] = new float[2][][][];
        this.field_843a3ec6_Dne[1][0] = new float[2][][];
        this.field_843a3ec6_Dne[1][1] = new float[2][][];
        this.field_843a3ec6_Dne[1][0][0] = new float[2][];
        this.field_843a3ec6_Dne[1][0][1] = new float[2][];
        this.field_843a3ec6_Dne[1][1][0] = new float[2][];
        this.field_843a3ec6_Dne[1][1][1] = new float[2][];
    }

    public void method_7a46289a_Dne() {
    }

    public int method_ce7f5d9c_Dne(int n) {
        if (n != 0 && this.field_20b857_DyG + n > this.field_36b0a9_udO) {
            return -1;
        }
        this.field_20b857_DyG += n;
        return 0;
    }

    public int method_eb4f9bc6_Dne(float[][][] fArray, int[] nArray) {
        if (this.field_20b857_DyG < this.field_36b0a9_udO) {
            if (fArray != null) {
                for (int i = 0; i < this.field_36a1eac_Dne.field_21260d_FWm; ++i) {
                    nArray[i] = this.field_20b857_DyG;
                }
                fArray[0] = this.field_7a46ee0b_Dne;
            }
            return this.field_36b0a9_udO - this.field_20b857_DyG;
        }
        return 0;
    }

    int method_e81a7c80_Dne(Lth lth, boolean bl) {
        int n;
        this.field_36a1eac_Dne = lth;
        this.field_267cf5_Qnq = xhl_0.method_117d19dd_FWm(lth.field_20b857_DyG);
        this.field_4c8cc277_Dne[0] = new Object[1];
        this.field_4c8cc277_Dne[1] = new Object[1];
        this.field_4c8cc277_Dne[0][0] = new Sti();
        this.field_4c8cc277_Dne[1][0] = new Sti();
        ((Sti)this.field_4c8cc277_Dne[0][0]).method_ce7f5da9_Dne(lth.field_3f1c589_Dne[0]);
        ((Sti)this.field_4c8cc277_Dne[1][0]).method_ce7f5da9_Dne(lth.field_3f1c589_Dne[1]);
        this.field_843a3ec6_Dne[0][0][0] = new float[1][];
        this.field_843a3ec6_Dne[0][0][1] = this.field_843a3ec6_Dne[0][0][0];
        this.field_843a3ec6_Dne[0][1][0] = this.field_843a3ec6_Dne[0][0][0];
        this.field_843a3ec6_Dne[0][1][1] = this.field_843a3ec6_Dne[0][0][0];
        this.field_843a3ec6_Dne[1][0][0] = new float[1][];
        this.field_843a3ec6_Dne[1][0][1] = new float[1][];
        this.field_843a3ec6_Dne[1][1][0] = new float[1][];
        this.field_843a3ec6_Dne[1][1][1] = new float[1][];
        for (n = 0; n < 1; ++n) {
            this.field_843a3ec6_Dne[0][0][0][n] = AOl.method_d4dc17c7_Dne(n, lth.field_3f1c589_Dne[0], lth.field_3f1c589_Dne[0] / 2, lth.field_3f1c589_Dne[0] / 2);
            this.field_843a3ec6_Dne[1][0][0][n] = AOl.method_d4dc17c7_Dne(n, lth.field_3f1c589_Dne[1], lth.field_3f1c589_Dne[0] / 2, lth.field_3f1c589_Dne[0] / 2);
            this.field_843a3ec6_Dne[1][0][1][n] = AOl.method_d4dc17c7_Dne(n, lth.field_3f1c589_Dne[1], lth.field_3f1c589_Dne[0] / 2, lth.field_3f1c589_Dne[1] / 2);
            this.field_843a3ec6_Dne[1][1][0][n] = AOl.method_d4dc17c7_Dne(n, lth.field_3f1c589_Dne[1], lth.field_3f1c589_Dne[1] / 2, lth.field_3f1c589_Dne[0] / 2);
            this.field_843a3ec6_Dne[1][1][1][n] = AOl.method_d4dc17c7_Dne(n, lth.field_3f1c589_Dne[1], lth.field_3f1c589_Dne[1] / 2, lth.field_3f1c589_Dne[1] / 2);
        }
        this.field_83750e9f_Dne = new zbP[lth.field_2a9ad6_Zpi];
        for (n = 0; n < lth.field_2a9ad6_Zpi; ++n) {
            this.field_83750e9f_Dne[n] = new zbP();
            this.field_83750e9f_Dne[n].method_8b5e6b10_Dne(lth.field_8364c17d_Dne[n]);
        }
        this.field_2d29f4_aFZ = 8192;
        this.field_7a46ee0b_Dne = new float[lth.field_21260d_FWm][];
        for (n = 0; n < lth.field_21260d_FWm; ++n) {
            this.field_7a46ee0b_Dne[n] = new float[this.field_2d29f4_aFZ];
        }
        this.field_29186d_XHL = 0;
        this.field_2a9ad6_Zpi = 0;
        this.field_388da6_zGp = this.field_36b0a9_udO = lth.field_3f1c589_Dne[1] / 2;
        this.field_322705c_Dne = new Object[lth.field_20b857_DyG];
        for (n = 0; n < lth.field_20b857_DyG; ++n) {
            int n2 = lth.field_83652c2c_Dne[n].field_267cf5_Qnq;
            int n3 = lth.field_4039e0a_FWm[n2];
            this.field_322705c_Dne[n] = ghN.field_836c81da_Dne[n3].method_9e7eedd9_Dne(this, lth.field_83652c2c_Dne[n], lth.field_322705c_Dne[n2]);
        }
        return 0;
    }

    static {
        field_2092ae_Dne = 1;
        field_21260d_FWm = 1;
    }

    public int method_7abc6b07_Dne(MOU mOU) {
        int n;
        int n2;
        int n3;
        if (this.field_36b0a9_udO > this.field_36a1eac_Dne.field_3f1c589_Dne[1] / 2 && this.field_20b857_DyG > 8192) {
            n3 = this.field_36b0a9_udO - this.field_36a1eac_Dne.field_3f1c589_Dne[1] / 2;
            n3 = this.field_20b857_DyG < n3 ? this.field_20b857_DyG : n3;
            this.field_388da6_zGp -= n3;
            this.field_36b0a9_udO -= n3;
            this.field_20b857_DyG -= n3;
            if (n3 != 0) {
                for (n2 = 0; n2 < this.field_36a1eac_Dne.field_21260d_FWm; ++n2) {
                    System.arraycopy(this.field_7a46ee0b_Dne[n2], n3, this.field_7a46ee0b_Dne[n2], 0, this.field_388da6_zGp);
                }
            }
        }
        this.field_29186d_XHL = this.field_2a9ad6_Zpi;
        this.field_2a9ad6_Zpi = mOU.field_21260d_FWm;
        this.field_31b816_kGO = -1;
        this.field_2e5f1c_bzF += (long)mOU.field_20b857_DyG;
        this.field_267cf6_Qnq += (long)mOU.field_2f0dd8_div;
        this.field_2d29f5_aFZ += (long)mOU.field_22c602_IjH;
        this.field_388da7_zGp += (long)mOU.field_33448c_mrb;
        if (this.field_21260e_FWm + 1L != mOU.field_21260e_FWm) {
            this.field_2092af_Dne = -1L;
        }
        this.field_21260e_FWm = mOU.field_21260e_FWm;
        n3 = this.field_36a1eac_Dne.field_3f1c589_Dne[this.field_2a9ad6_Zpi];
        n2 = this.field_36b0a9_udO + this.field_36a1eac_Dne.field_3f1c589_Dne[this.field_29186d_XHL] / 4 + n3 / 4;
        int n4 = n2 - n3 / 2;
        int n5 = n4 + n3;
        int n6 = 0;
        int n7 = 0;
        if (n5 > this.field_2d29f4_aFZ) {
            this.field_2d29f4_aFZ = n5 + this.field_36a1eac_Dne.field_3f1c589_Dne[1];
            for (n = 0; n < this.field_36a1eac_Dne.field_21260d_FWm; ++n) {
                float[] fArray = new float[this.field_2d29f4_aFZ];
                System.arraycopy(this.field_7a46ee0b_Dne[n], 0, fArray, 0, this.field_7a46ee0b_Dne[n].length);
                this.field_7a46ee0b_Dne[n] = fArray;
            }
        }
        switch (this.field_2a9ad6_Zpi) {
            case 0: {
                n6 = 0;
                n7 = this.field_36a1eac_Dne.field_3f1c589_Dne[0] / 2;
                break;
            }
            case 1: {
                n6 = this.field_36a1eac_Dne.field_3f1c589_Dne[1] / 4 - this.field_36a1eac_Dne.field_3f1c589_Dne[this.field_29186d_XHL] / 4;
                n7 = n6 + this.field_36a1eac_Dne.field_3f1c589_Dne[this.field_29186d_XHL] / 2;
            }
        }
        for (n = 0; n < this.field_36a1eac_Dne.field_21260d_FWm; ++n) {
            int n8 = n4;
            int n9 = 0;
            for (n9 = n6; n9 < n7; ++n9) {
                float[] fArray = this.field_7a46ee0b_Dne[n];
                int n10 = n8 + n9;
                fArray[n10] = fArray[n10] + mOU.field_7a46ee0b_Dne[n][n9];
            }
            while (n9 < n3) {
                this.field_7a46ee0b_Dne[n][n8 + n9] = mOU.field_7a46ee0b_Dne[n][n9];
                ++n9;
            }
        }
        if (this.field_2092af_Dne == -1L) {
            this.field_2092af_Dne = mOU.field_2092af_Dne;
        } else {
            this.field_2092af_Dne += (long)(n2 - this.field_36b0a9_udO);
            if (mOU.field_2092af_Dne != -1L && this.field_2092af_Dne != mOU.field_2092af_Dne) {
                if (this.field_2092af_Dne > mOU.field_2092af_Dne && mOU.field_388da6_zGp != 0) {
                    n2 = (int)((long)n2 - (this.field_2092af_Dne - mOU.field_2092af_Dne));
                }
                this.field_2092af_Dne = mOU.field_2092af_Dne;
            }
        }
        this.field_36b0a9_udO = n2;
        this.field_388da6_zGp = n5;
        if (mOU.field_388da6_zGp != 0) {
            this.field_33448c_mrb = 1;
        }
        return 0;
    }

    public int method_7b199b1a_Dne(Lth lth) {
        this.method_e81a7c80_Dne(lth, false);
        this.field_20b857_DyG = this.field_36b0a9_udO;
        this.field_36b0a9_udO -= lth.field_3f1c589_Dne[this.field_2a9ad6_Zpi] / 4 + lth.field_3f1c589_Dne[this.field_29186d_XHL] / 4;
        this.field_2092af_Dne = -1L;
        this.field_21260e_FWm = -1L;
        return 0;
    }

    static float[] method_d4dc17c7_Dne(int n, int n2, int n3, int n4) {
        float[] fArray = new float[n2];
        switch (n) {
            case 0: {
                float f;
                int n5;
                int n6 = n2 / 4 - n3 / 2;
                int n7 = n2 - n2 / 4 - n4 / 2;
                for (n5 = 0; n5 < n3; ++n5) {
                    f = (float)(((double)n5 + 0.5) / (double)n3 * 3.1415927410125732 / 2.0);
                    f = (float)Math.sin(f);
                    f *= f;
                    f = (float)((double)f * 1.5707963705062866);
                    fArray[n5 + n6] = f = (float)Math.sin(f);
                }
                for (n5 = n6 + n3; n5 < n7; ++n5) {
                    fArray[n5] = 1.0f;
                }
                for (n5 = 0; n5 < n4; ++n5) {
                    f = (float)(((double)(n4 - n5) - 0.5) / (double)n4 * 3.1415927410125732 / 2.0);
                    f = (float)Math.sin(f);
                    f *= f;
                    f = (float)((double)f * 1.5707963705062866);
                    fArray[n5 + n7] = f = (float)Math.sin(f);
                }
                break;
            }
            default: {
                return null;
            }
        }
        return fArray;
    }

    AOl(Lth lth) {
        this();
        this.method_e81a7c80_Dne(lth, false);
        this.field_20b857_DyG = this.field_36b0a9_udO;
        this.field_36b0a9_udO -= lth.field_3f1c589_Dne[this.field_2a9ad6_Zpi] / 4 + lth.field_3f1c589_Dne[this.field_29186d_XHL] / 4;
        this.field_2092af_Dne = -1L;
        this.field_21260e_FWm = -1L;
    }
}

