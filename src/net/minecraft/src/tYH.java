package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class tYH {
    int field_2e5f1b_bzF;
    int field_33448c_mrb;
    int field_2092ae_Dne;
    int field_22c602_IjH;
    long[] field_3f1c58a_Dne;
    int field_20b857_DyG;
    long field_2092af_Dne;
    int field_388da6_zGp;
    int field_29186d_XHL;
    int field_21260d_FWm;
    public int field_2f0dd8_div;
    byte[] field_3f1c582_Dne;
    int field_267cf5_Qnq;
    int field_2d29f4_aFZ;
    byte[] field_4039e03_FWm = new byte[282];
    int[] field_3f1c589_Dne;
    long field_21260e_FWm;
    private int field_2a9ad6_Zpi;

    public int method_9c78e170_Dne(aHQ aHQ2) {
        byte[] byArray = aHQ2.field_3f1c582_Dne;
        int n = aHQ2.field_2092ae_Dne;
        byte[] byArray2 = aHQ2.field_4039e03_FWm;
        int n2 = aHQ2.field_2e5f1b_bzF;
        int n3 = aHQ2.field_267cf5_Qnq;
        int n4 = 0;
        int n5 = aHQ2.method_7a46288d_Dne();
        int n6 = aHQ2.method_7c6f602c_FWm();
        int n7 = aHQ2.method_ae128dba_bzF();
        int n8 = aHQ2.method_907a9d14_Qnq();
        long l = aHQ2.method_7a46288e_Dne();
        int n9 = aHQ2.method_a98a0653_aFZ();
        int n10 = aHQ2.method_d44b4585_zGp();
        int n11 = byArray[n + 26] & 0xFF;
        int n12 = this.field_388da6_zGp;
        int n13 = this.field_2a9ad6_Zpi;
        if (n13 != 0) {
            this.field_21260d_FWm -= n13;
            if (this.field_21260d_FWm != 0) {
                System.arraycopy(this.field_3f1c582_Dne, n13, this.field_3f1c582_Dne, 0, this.field_21260d_FWm);
            }
            this.field_2a9ad6_Zpi = 0;
        }
        if (n12 != 0) {
            if (this.field_267cf5_Qnq - n12 != 0) {
                System.arraycopy(this.field_3f1c589_Dne, n12, this.field_3f1c589_Dne, 0, this.field_267cf5_Qnq - n12);
                System.arraycopy(this.field_3f1c58a_Dne, n12, this.field_3f1c58a_Dne, 0, this.field_267cf5_Qnq - n12);
            }
            this.field_267cf5_Qnq -= n12;
            this.field_2d29f4_aFZ -= n12;
            this.field_388da6_zGp = 0;
        }
        if (n9 != this.field_33448c_mrb) {
            return -1;
        }
        if (n5 > 0) {
            return -1;
        }
        this.method_143f9e1c_bzF(n11 + 1);
        if (n10 != this.field_29186d_XHL) {
            for (n12 = this.field_2d29f4_aFZ; n12 < this.field_267cf5_Qnq; ++n12) {
                this.field_21260d_FWm -= this.field_3f1c589_Dne[n12] & 0xFF;
            }
            this.field_267cf5_Qnq = this.field_2d29f4_aFZ++;
            if (this.field_29186d_XHL != -1) {
                this.field_3f1c589_Dne[this.field_267cf5_Qnq++] = 1024;
            }
            if (n6 != 0) {
                n7 = 0;
                while (n4 < n11) {
                    n13 = byArray[n + 27 + n4] & 0xFF;
                    n2 += n13;
                    n3 -= n13;
                    if (n13 < 255) {
                        ++n4;
                        break;
                    }
                    ++n4;
                }
            }
        }
        if (n3 != 0) {
            this.method_117d19ea_FWm(n3);
            System.arraycopy(byArray2, n2, this.field_3f1c582_Dne, this.field_21260d_FWm, n3);
            this.field_21260d_FWm += n3;
        }
        n12 = -1;
        while (n4 < n11) {
            this.field_3f1c589_Dne[this.field_267cf5_Qnq] = n13 = byArray[n + 27 + n4] & 0xFF;
            this.field_3f1c58a_Dne[this.field_267cf5_Qnq] = -1L;
            if (n7 != 0) {
                int n14 = this.field_267cf5_Qnq;
                this.field_3f1c589_Dne[n14] = this.field_3f1c589_Dne[n14] | 0x100;
                n7 = 0;
            }
            if (n13 < 255) {
                n12 = this.field_267cf5_Qnq;
            }
            ++this.field_267cf5_Qnq;
            ++n4;
            if (n13 >= 255) continue;
            this.field_2d29f4_aFZ = this.field_267cf5_Qnq;
        }
        if (n12 != -1) {
            this.field_3f1c58a_Dne[n12] = l;
        }
        if (n8 != 0) {
            this.field_2f0dd8_div = 1;
            if (this.field_267cf5_Qnq > 0) {
                int n15 = this.field_267cf5_Qnq - 1;
                this.field_3f1c589_Dne[n15] = this.field_3f1c589_Dne[n15] | 0x200;
            }
        }
        this.field_29186d_XHL = n10 + 1;
        return 0;
    }

    public int method_75cc9531_FWm(aHQ aHQ2) {
        int n;
        int n2 = 0;
        int n3 = this.field_267cf5_Qnq > 255 ? 255 : this.field_267cf5_Qnq;
        int n4 = 0;
        int n5 = 0;
        long l = this.field_3f1c58a_Dne[0];
        if (n3 == 0) {
            return 0;
        }
        if (this.field_22c602_IjH == 0) {
            l = 0L;
            for (n2 = 0; n2 < n3; ++n2) {
                if ((this.field_3f1c589_Dne[n2] & 0xFF) >= 255) continue;
                ++n2;
                break;
            }
        } else {
            for (n2 = 0; n2 < n3 && n5 <= 4096; n5 += this.field_3f1c589_Dne[n2] & 0xFF, ++n2) {
                l = this.field_3f1c58a_Dne[n2];
            }
        }
        System.arraycopy("OggS".getBytes(), 0, this.field_4039e03_FWm, 0, 4);
        this.field_4039e03_FWm[4] = 0;
        this.field_4039e03_FWm[5] = 0;
        if ((this.field_3f1c589_Dne[0] & 0x100) == 0) {
            this.field_4039e03_FWm[5] = (byte)(this.field_4039e03_FWm[5] | 1);
        }
        if (this.field_22c602_IjH == 0) {
            this.field_4039e03_FWm[5] = (byte)(this.field_4039e03_FWm[5] | 2);
        }
        if (this.field_2f0dd8_div != 0 && this.field_267cf5_Qnq == n2) {
            this.field_4039e03_FWm[5] = (byte)(this.field_4039e03_FWm[5] | 4);
        }
        this.field_22c602_IjH = 1;
        for (n = 6; n < 14; ++n) {
            this.field_4039e03_FWm[n] = (byte)l;
            l >>>= 8;
        }
        int n6 = this.field_33448c_mrb;
        for (n = 14; n < 18; ++n) {
            this.field_4039e03_FWm[n] = (byte)n6;
            n6 >>>= 8;
        }
        if (this.field_29186d_XHL == -1) {
            this.field_29186d_XHL = 0;
        }
        n6 = this.field_29186d_XHL++;
        for (n = 18; n < 22; ++n) {
            this.field_4039e03_FWm[n] = (byte)n6;
            n6 >>>= 8;
        }
        this.field_4039e03_FWm[22] = 0;
        this.field_4039e03_FWm[23] = 0;
        this.field_4039e03_FWm[24] = 0;
        this.field_4039e03_FWm[25] = 0;
        this.field_4039e03_FWm[26] = (byte)n2;
        for (n = 0; n < n2; ++n) {
            this.field_4039e03_FWm[n + 27] = (byte)this.field_3f1c589_Dne[n];
            n4 += this.field_4039e03_FWm[n + 27] & 0xFF;
        }
        aHQ2.field_3f1c582_Dne = this.field_4039e03_FWm;
        aHQ2.field_2092ae_Dne = 0;
        aHQ2.field_21260d_FWm = this.field_20b857_DyG = n2 + 27;
        aHQ2.field_4039e03_FWm = this.field_3f1c582_Dne;
        aHQ2.field_2e5f1b_bzF = this.field_2a9ad6_Zpi;
        aHQ2.field_267cf5_Qnq = n4;
        this.field_267cf5_Qnq -= n2;
        System.arraycopy(this.field_3f1c589_Dne, n2, this.field_3f1c589_Dne, 0, this.field_267cf5_Qnq * 4);
        System.arraycopy(this.field_3f1c58a_Dne, n2, this.field_3f1c58a_Dne, 0, this.field_267cf5_Qnq * 8);
        this.field_2a9ad6_Zpi += n4;
        aHQ2.method_7a46289a_Dne();
        return 1;
    }

    void method_143f9e1c_bzF(int n) {
        if (this.field_2e5f1b_bzF <= this.field_267cf5_Qnq + n) {
            this.field_2e5f1b_bzF += n + 32;
            int[] nArray = new int[this.field_2e5f1b_bzF];
            System.arraycopy(this.field_3f1c589_Dne, 0, nArray, 0, this.field_3f1c589_Dne.length);
            this.field_3f1c589_Dne = nArray;
            long[] lArray = new long[this.field_2e5f1b_bzF];
            System.arraycopy(this.field_3f1c58a_Dne, 0, lArray, 0, this.field_3f1c58a_Dne.length);
            this.field_3f1c58a_Dne = lArray;
        }
    }

    public void method_ce7f5da9_Dne(int n) {
        if (this.field_3f1c582_Dne == null) {
            this.method_7a46289a_Dne();
        } else {
            int n2;
            for (n2 = 0; n2 < this.field_3f1c582_Dne.length; ++n2) {
                this.field_3f1c582_Dne[n2] = 0;
            }
            for (n2 = 0; n2 < this.field_3f1c589_Dne.length; ++n2) {
                this.field_3f1c589_Dne[n2] = 0;
            }
            for (n2 = 0; n2 < this.field_3f1c58a_Dne.length; ++n2) {
                this.field_3f1c58a_Dne[n2] = 0L;
            }
        }
        this.field_33448c_mrb = n;
    }

    tYH(int n) {
        this();
        this.method_ce7f5da9_Dne(n);
    }

    void method_117d19ea_FWm(int n) {
        if (this.field_2092ae_Dne <= this.field_21260d_FWm + n) {
            this.field_2092ae_Dne += n + 1024;
            byte[] byArray = new byte[this.field_2092ae_Dne];
            System.arraycopy(this.field_3f1c582_Dne, 0, byArray, 0, this.field_3f1c582_Dne.length);
            this.field_3f1c582_Dne = byArray;
        }
    }

    public int method_7c6f602c_FWm() {
        this.field_21260d_FWm = 0;
        this.field_2a9ad6_Zpi = 0;
        this.field_267cf5_Qnq = 0;
        this.field_2d29f4_aFZ = 0;
        this.field_388da6_zGp = 0;
        this.field_20b857_DyG = 0;
        this.field_2f0dd8_div = 0;
        this.field_22c602_IjH = 0;
        this.field_29186d_XHL = -1;
        this.field_2092af_Dne = 0L;
        this.field_21260e_FWm = 0L;
        return 0;
    }

    void method_7a46289a_Dne() {
        this.field_2092ae_Dne = 16384;
        this.field_3f1c582_Dne = new byte[this.field_2092ae_Dne];
        this.field_2e5f1b_bzF = 1024;
        this.field_3f1c589_Dne = new int[this.field_2e5f1b_bzF];
        this.field_3f1c58a_Dne = new long[this.field_2e5f1b_bzF];
    }

    public int method_93106d30_FWm(qlF qlF2) {
        int n;
        if (this.field_2d29f4_aFZ <= (n = this.field_388da6_zGp++)) {
            return 0;
        }
        if ((this.field_3f1c589_Dne[n] & 0x400) != 0) {
            ++this.field_2092af_Dne;
            return -1;
        }
        int n2 = this.field_3f1c589_Dne[n] & 0xFF;
        int n3 = 0;
        qlF2.field_3f1c582_Dne = this.field_3f1c582_Dne;
        qlF2.field_2092ae_Dne = this.field_2a9ad6_Zpi;
        qlF2.field_267cf5_Qnq = this.field_3f1c589_Dne[n] & 0x200;
        qlF2.field_2e5f1b_bzF = this.field_3f1c589_Dne[n] & 0x100;
        n3 += n2;
        while (n2 == 255) {
            int n4 = this.field_3f1c589_Dne[++n];
            n2 = n4 & 0xFF;
            if ((n4 & 0x200) != 0) {
                qlF2.field_267cf5_Qnq = 512;
            }
            n3 += n2;
        }
        qlF2.field_21260e_FWm = this.field_2092af_Dne++;
        qlF2.field_2092af_Dne = this.field_3f1c58a_Dne[n];
        qlF2.field_21260d_FWm = n3;
        this.field_2a9ad6_Zpi += n3;
        this.field_388da6_zGp = n + 1;
        return 1;
    }

    public int method_8e6db063_bzF(aHQ aHQ2) {
        if (this.field_2f0dd8_div != 0 && this.field_267cf5_Qnq != 0 || this.field_21260d_FWm - this.field_2a9ad6_Zpi > 4096 || this.field_267cf5_Qnq >= 255 || this.field_267cf5_Qnq != 0 && this.field_22c602_IjH == 0) {
            return this.method_75cc9531_FWm(aHQ2);
        }
        return 0;
    }

    public int method_7a46288d_Dne() {
        return this.field_2f0dd8_div;
    }

    public tYH() {
        this.method_7a46289a_Dne();
    }

    void method_ae128dc7_bzF() {
        this.method_7c6f6039_FWm();
    }

    public void method_7c6f6039_FWm() {
        this.field_3f1c582_Dne = null;
        this.field_3f1c589_Dne = null;
        this.field_3f1c58a_Dne = null;
    }

    public int method_b9bcb96f_Dne(qlF qlF2) {
        int n = qlF2.field_21260d_FWm / 255 + 1;
        if (this.field_2a9ad6_Zpi != 0) {
            this.field_21260d_FWm -= this.field_2a9ad6_Zpi;
            if (this.field_21260d_FWm != 0) {
                System.arraycopy(this.field_3f1c582_Dne, this.field_2a9ad6_Zpi, this.field_3f1c582_Dne, 0, this.field_21260d_FWm);
            }
            this.field_2a9ad6_Zpi = 0;
        }
        this.method_117d19ea_FWm(qlF2.field_21260d_FWm);
        this.method_143f9e1c_bzF(n);
        System.arraycopy(qlF2.field_3f1c582_Dne, qlF2.field_2092ae_Dne, this.field_3f1c582_Dne, this.field_21260d_FWm, qlF2.field_21260d_FWm);
        this.field_21260d_FWm += qlF2.field_21260d_FWm;
        int i;
        for (i = 0; i < n - 1; ++i) {
            this.field_3f1c589_Dne[this.field_267cf5_Qnq + i] = 255;
            this.field_3f1c58a_Dne[this.field_267cf5_Qnq + i] = this.field_21260e_FWm;
        }
        this.field_3f1c589_Dne[this.field_267cf5_Qnq + i] = qlF2.field_21260d_FWm % 255;
        long l = qlF2.field_2092af_Dne;
        this.field_3f1c58a_Dne[this.field_267cf5_Qnq + i] = l;
        this.field_21260e_FWm = l;
        int n2 = this.field_267cf5_Qnq;
        this.field_3f1c589_Dne[n2] = this.field_3f1c589_Dne[n2] | 0x100;
        this.field_267cf5_Qnq += n;
        ++this.field_2092af_Dne;
        if (qlF2.field_267cf5_Qnq != 0) {
            this.field_2f0dd8_div = 1;
        }
        return 0;
    }
}

