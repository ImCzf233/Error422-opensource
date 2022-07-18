package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;

public class JQZ {
    static final int field_1ed017_ATE;
    float field_21260a_FWm;
    int field_28e7fd_Vxn;
    static final int field_22c602_IjH;
    InputStream field_767c223e_Dne;
    long[] field_4039e0b_FWm;
    tYH field_37be449_Dne;
    static final int field_2e5f1b_bzF;
    static final int field_367154_trS;
    static final int field_36b0a9_udO;
    boolean field_2092bf_Dne = false;
    static final int field_33448c_mrb;
    static final int field_21260d_FWm;
    long field_2e5f1c_bzF;
    Lth[] field_83606c07_Dne;
    static final int field_2d29f4_aFZ;
    MOU field_36a05d9_Dne;
    int field_2e8486_ceE;
    long[] field_3f1c58a_Dne;
    static final int field_388da6_zGp;
    static final int field_31b816_kGO;
    static final int field_342264_ooe;
    long field_21260e_FWm;
    static final int field_2f0dd8_div;
    ytS field_37e90d4_Dne = new ytS();
    long field_2092af_Dne;
    static final int field_2092ae_Dne;
    static final int field_2a9ad6_Zpi;
    float field_2092ab_Dne;
    static final int field_29186d_XHL;
    int[] field_3f1c589_Dne;
    static final int field_348572_qLR;
    int field_212c1b_EyB;
    static final int field_20b857_DyG;
    AOl field_364942e_Dne;
    long[] field_59d86bd_bzF;
    static final int field_267cf5_Qnq;
    PRc[] field_8361bd46_Dne;
    boolean field_21261e_FWm = false;

    public int method_907a9d14_Qnq() {
        return this.field_28e7fd_Vxn;
    }

    private int method_9c78e170_Dne(aHQ aHQ2) throws njg_0 {
        int n;
        long l = this.field_2092af_Dne;
        int n2 = -1;
        block0: while (n2 == -1) {
            if ((l -= 8500L) < 0L) {
                l = 0L;
            }
            this.method_ce7f616a_Dne(l);
            while (this.field_2092af_Dne < l + 8500L) {
                n = this.method_f2a3c4da_Dne(aHQ2, l + 8500L - this.field_2092af_Dne);
                if (n == -128) {
                    return -128;
                }
                if (n < 0) {
                    if (n2 != -1) continue block0;
                    throw new njg_0();
                }
                n2 = n;
            }
        }
        this.method_ce7f616a_Dne(n2);
        n = this.method_f2a3c4da_Dne(aHQ2, 8500L);
        if (n < 0) {
            return -129;
        }
        return n2;
    }

    private int method_7ad387f6_DyG() {
        int n = this.field_37e90d4_Dne.method_ce7f5d9c_Dne(8500);
        byte[] byArray = this.field_37e90d4_Dne.field_3f1c582_Dne;
        int n2 = 0;
        try {
            n2 = this.field_767c223e_Dne.read(byArray, n, 8500);
        }
        catch (Exception exception) {
            return -128;
        }
        this.field_37e90d4_Dne.method_117d19dd_FWm(n2);
        if (n2 == -1) {
            n2 = 0;
        }
        return n2;
    }

    public boolean method_7a46289e_Dne() {
        return this.field_2092bf_Dne;
    }

    public PRc[] method_56f9fac7_Dne() {
        return this.field_8361bd46_Dne;
    }

    int method_d65f9e2_Dne(byte[] byArray, int n, int n2, int n3, int n4, int[] nArray) {
        int n5 = this.method_d44b4585_zGp();
        int n6 = 0;
        while (true) {
            if (this.field_21261e_FWm) {
                float[][][] fArrayArray = new float[1][][];
                int[] nArray2 = new int[this.method_9e6dc29a_Dne((int)-1).field_21260d_FWm];
                int n7 = this.field_364942e_Dne.method_eb4f9bc6_Dne(fArrayArray, nArray2);
                float[][] fArray = fArrayArray[0];
                if (n7 != 0) {
                    int n8 = this.method_9e6dc29a_Dne((int)-1).field_21260d_FWm;
                    int n9 = n3 * n8;
                    if (n7 > n / n9) {
                        n7 = n / n9;
                    }
                    if (n3 == 1) {
                        int n10 = n4 != 0 ? 0 : 128;
                        for (int i = 0; i < n7; ++i) {
                            for (int j = 0; j < n8; ++j) {
                                int n11 = (int)((double)fArray[j][nArray2[j] + i] * 128.0 + 0.5);
                                if (n11 > 127) {
                                    n11 = 127;
                                } else if (n11 < -128) {
                                    n11 = -128;
                                }
                                byArray[n6++] = (byte)(n11 + n10);
                            }
                        }
                    } else {
                        int n12;
                        int n13 = n12 = n4 != 0 ? 0 : 32768;
                        if (n5 == n2) {
                            if (n4 != 0) {
                                for (int i = 0; i < n8; ++i) {
                                    int n14 = nArray2[i];
                                    int n15 = i;
                                    for (int j = 0; j < n7; ++j) {
                                        int n16 = (int)((double)fArray[i][n14 + j] * 32768.0 + 0.5);
                                        if (n16 > Short.MAX_VALUE) {
                                            n16 = Short.MAX_VALUE;
                                        } else if (n16 < Short.MIN_VALUE) {
                                            n16 = Short.MIN_VALUE;
                                        }
                                        byArray[n15] = (byte)(n16 >>> 8);
                                        byArray[n15 + 1] = (byte)n16;
                                        n15 += n8 * 2;
                                    }
                                }
                            } else {
                                for (int i = 0; i < n8; ++i) {
                                    float[] fArray2 = fArray[i];
                                    int n17 = i;
                                    for (int j = 0; j < n7; ++j) {
                                        int n18 = (int)((double)fArray2[j] * 32768.0 + 0.5);
                                        if (n18 > Short.MAX_VALUE) {
                                            n18 = Short.MAX_VALUE;
                                        } else if (n18 < Short.MIN_VALUE) {
                                            n18 = Short.MIN_VALUE;
                                        }
                                        byArray[n17] = (byte)(n18 + n12 >>> 8);
                                        byArray[n17 + 1] = (byte)(n18 + n12);
                                        n17 += n8 * 2;
                                    }
                                }
                            }
                        } else if (n2 != 0) {
                            for (int i = 0; i < n7; ++i) {
                                for (int j = 0; j < n8; ++j) {
                                    int n19 = (int)((double)fArray[j][i] * 32768.0 + 0.5);
                                    if (n19 > Short.MAX_VALUE) {
                                        n19 = Short.MAX_VALUE;
                                    } else if (n19 < Short.MIN_VALUE) {
                                        n19 = Short.MIN_VALUE;
                                    }
                                    byArray[n6++] = (byte)((n19 += n12) >>> 8);
                                    byArray[n6++] = (byte)n19;
                                }
                            }
                        } else {
                            for (int i = 0; i < n7; ++i) {
                                for (int j = 0; j < n8; ++j) {
                                    int n20 = (int)((double)fArray[j][i] * 32768.0 + 0.5);
                                    if (n20 > Short.MAX_VALUE) {
                                        n20 = Short.MAX_VALUE;
                                    } else if (n20 < Short.MIN_VALUE) {
                                        n20 = Short.MIN_VALUE;
                                    }
                                    byArray[n6++] = (byte)(n20 += n12);
                                    byArray[n6++] = (byte)(n20 >>> 8);
                                }
                            }
                        }
                    }
                    this.field_364942e_Dne.method_ce7f5d9c_Dne(n7);
                    this.field_2e5f1c_bzF += (long)n7;
                    if (nArray != null) {
                        nArray[0] = this.field_212c1b_EyB;
                    }
                    return n7 * n9;
                }
            }
            switch (this.method_ce7f5d9c_Dne(1)) {
                case 0: {
                    return 0;
                }
                case -1: {
                    return -1;
                }
            }
        }
    }

    int method_d44b4585_zGp() {
        return 1;
    }

    public int method_7ed979f5_Qnq(int n) {
        if (!this.field_2092bf_Dne) {
            return -1;
        }
        if (n < 0 || (long)n > this.field_3f1c58a_Dne[this.field_28e7fd_Vxn]) {
            this.field_2e5f1c_bzF = -1L;
            this.method_7a46289a_Dne();
            return -1;
        }
        this.field_2e5f1c_bzF = -1L;
        this.method_7a46289a_Dne();
        this.method_ce7f616a_Dne(n);
        switch (this.method_ce7f5d9c_Dne(1)) {
            case 0: {
                this.field_2e5f1c_bzF = this.method_117d19de_FWm(-1);
                return 0;
            }
            case -1: {
                this.field_2e5f1c_bzF = -1L;
                this.method_7a46289a_Dne();
                return -1;
            }
        }
        while (true) {
            switch (this.method_ce7f5d9c_Dne(0)) {
                case 0: {
                    return 0;
                }
                case -1: {
                    this.field_2e5f1c_bzF = -1L;
                    this.method_7a46289a_Dne();
                    return -1;
                }
            }
        }
    }

    public int method_117d19dd_FWm(int n) {
        if (n >= this.field_28e7fd_Vxn) {
            return -1;
        }
        if (!this.field_2092bf_Dne && n != 0) {
            return this.method_117d19dd_FWm(0);
        }
        if (n < 0) {
            long l = 0L;
            for (int i = 0; i < this.field_28e7fd_Vxn; ++i) {
                l += (this.field_3f1c58a_Dne[i + 1] - this.field_4039e0b_FWm[i]) * 8L;
            }
            return (int)Math.rint((float)l / this.method_ce7f5d99_Dne(-1));
        }
        if (this.field_2092bf_Dne) {
            return (int)Math.rint((float)((this.field_3f1c58a_Dne[n + 1] - this.field_4039e0b_FWm[n]) * 8L) / this.method_ce7f5d99_Dne(n));
        }
        if (this.field_83606c07_Dne[n].field_2d29f4_aFZ > 0) {
            return this.field_83606c07_Dne[n].field_2d29f4_aFZ;
        }
        if (this.field_83606c07_Dne[n].field_267cf5_Qnq > 0) {
            if (this.field_83606c07_Dne[n].field_388da6_zGp > 0) {
                return (this.field_83606c07_Dne[n].field_267cf5_Qnq + this.field_83606c07_Dne[n].field_388da6_zGp) / 2;
            }
            return this.field_83606c07_Dne[n].field_267cf5_Qnq;
        }
        return -1;
    }

    static long method_9d1ae62d_Dne(InputStream inputStream) {
        try {
            if (inputStream instanceof TJY) {
                TJY tJY = (TJY)inputStream;
                return tJY.method_7c6f602d_FWm();
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return 0L;
    }

    int method_9c89eb23_Dne(Lth lth, PRc pRc, int[] nArray, aHQ aHQ2) {
        aHQ aHQ3 = new aHQ();
        qlF qlF2 = new qlF();
        if (aHQ2 == null) {
            int n = this.method_f2a3c4da_Dne(aHQ3, 8500L);
            if (n == -128) {
                return -128;
            }
            if (n < 0) {
                return -132;
            }
            aHQ2 = aHQ3;
        }
        if (nArray != null) {
            nArray[0] = aHQ2.method_a98a0653_aFZ();
        }
        this.field_37be449_Dne.method_ce7f5da9_Dne(aHQ2.method_a98a0653_aFZ());
        lth.method_7a46289a_Dne();
        pRc.method_7a46289a_Dne();
        int n = 0;
        while (n < 3) {
            int n2;
            this.field_37be449_Dne.method_9c78e170_Dne(aHQ2);
            while (n < 3 && (n2 = this.field_37be449_Dne.method_93106d30_FWm(qlF2)) != 0) {
                if (n2 == -1) {
                    lth.method_7c6f6039_FWm();
                    pRc.method_7c6f6039_FWm();
                    this.field_37be449_Dne.method_7c6f6039_FWm();
                    return -1;
                }
                if (lth.method_ba5770e3_Dne(pRc, qlF2) != 0) {
                    lth.method_7c6f6039_FWm();
                    pRc.method_7c6f6039_FWm();
                    this.field_37be449_Dne.method_7c6f6039_FWm();
                    return -1;
                }
                ++n;
            }
            if (n >= 3 || this.method_f2a3c4da_Dne(aHQ2, 1L) >= 0) continue;
            lth.method_7c6f6039_FWm();
            pRc.method_7c6f6039_FWm();
            this.field_37be449_Dne.method_7c6f6039_FWm();
            return -1;
        }
        return 0;
    }

    public Lth[] method_56f8a988_Dne() {
        return this.field_83606c07_Dne;
    }

    int method_ae128dba_bzF() {
        this.field_36a05d9_Dne.method_7a46288d_Dne();
        this.field_364942e_Dne.method_7a46289a_Dne();
        this.field_37be449_Dne.method_7c6f6039_FWm();
        if (this.field_83606c07_Dne != null && this.field_28e7fd_Vxn != 0) {
            for (int i = 0; i < this.field_28e7fd_Vxn; ++i) {
                this.field_83606c07_Dne[i].method_7c6f6039_FWm();
                this.field_8361bd46_Dne[i].method_7c6f6039_FWm();
            }
            this.field_83606c07_Dne = null;
            this.field_8361bd46_Dne = null;
        }
        if (this.field_4039e0b_FWm != null) {
            this.field_4039e0b_FWm = null;
        }
        if (this.field_59d86bd_bzF != null) {
            this.field_59d86bd_bzF = null;
        }
        if (this.field_3f1c589_Dne != null) {
            this.field_3f1c589_Dne = null;
        }
        if (this.field_3f1c58a_Dne != null) {
            this.field_3f1c58a_Dne = null;
        }
        this.field_37e90d4_Dne.method_7a46288d_Dne();
        return 0;
    }

    void method_12c83ea_Dne(Lth lth, PRc pRc, int n) throws njg_0 {
        aHQ aHQ2 = new aHQ();
        this.field_83606c07_Dne = new Lth[this.field_28e7fd_Vxn];
        this.field_8361bd46_Dne = new PRc[this.field_28e7fd_Vxn];
        this.field_4039e0b_FWm = new long[this.field_28e7fd_Vxn];
        this.field_59d86bd_bzF = new long[this.field_28e7fd_Vxn];
        this.field_3f1c589_Dne = new int[this.field_28e7fd_Vxn];
        block0: for (int i = 0; i < this.field_28e7fd_Vxn; ++i) {
            if (lth != null && pRc != null && i == 0) {
                this.field_83606c07_Dne[i] = lth;
                this.field_8361bd46_Dne[i] = pRc;
                this.field_4039e0b_FWm[i] = n;
            } else {
                this.method_ce7f616a_Dne(this.field_3f1c58a_Dne[i]);
                this.field_83606c07_Dne[i] = new Lth();
                this.field_8361bd46_Dne[i] = new PRc();
                if (this.method_9c89eb23_Dne(this.field_83606c07_Dne[i], this.field_8361bd46_Dne[i], null, null) == -1) {
                    this.field_4039e0b_FWm[i] = -1L;
                } else {
                    this.field_4039e0b_FWm[i] = this.field_2092af_Dne;
                    this.field_37be449_Dne.method_7c6f6039_FWm();
                }
            }
            long l = this.field_3f1c58a_Dne[i + 1];
            this.method_ce7f616a_Dne(l);
            do {
                int n2;
                if ((n2 = this.method_9c78e170_Dne(aHQ2)) != -1) continue;
                this.field_83606c07_Dne[i].method_7c6f6039_FWm();
                this.field_8361bd46_Dne[i].method_7c6f6039_FWm();
                continue block0;
            } while (aHQ2.method_7a46288e_Dne() == -1L);
            this.field_3f1c589_Dne[i] = aHQ2.method_a98a0653_aFZ();
            this.field_59d86bd_bzF[i] = aHQ2.method_7a46288e_Dne();
        }
    }

    public long method_ce7f5d9d_Dne(int n) {
        if (!this.field_2092bf_Dne || n >= this.field_28e7fd_Vxn) {
            return -1L;
        }
        if (n < 0) {
            long l = 0L;
            for (int i = 0; i < this.field_28e7fd_Vxn; ++i) {
                l += this.method_ce7f5d9d_Dne(i);
            }
            return l;
        }
        return this.field_3f1c58a_Dne[n + 1] - this.field_3f1c58a_Dne[n];
    }

    public Lth method_9e6dc29a_Dne(int n) {
        if (this.field_2092bf_Dne) {
            if (n < 0) {
                if (this.field_21261e_FWm) {
                    return this.field_83606c07_Dne[this.field_212c1b_EyB];
                }
                return null;
            }
            if (n >= this.field_28e7fd_Vxn) {
                return null;
            }
            return this.field_83606c07_Dne[n];
        }
        if (this.field_21261e_FWm) {
            return this.field_83606c07_Dne[0];
        }
        return null;
    }

    public void method_7c6f6039_FWm() throws IOException {
        this.field_767c223e_Dne.close();
    }

    int method_ce7f5d9c_Dne(int n) {
        aHQ aHQ2 = new aHQ();
        while (true) {
            qlF qlF2;
            int n2;
            if (this.field_21261e_FWm && (n2 = this.field_37be449_Dne.method_93106d30_FWm(qlF2 = new qlF())) > 0) {
                long l = qlF2.field_2092af_Dne;
                if (this.field_36a05d9_Dne.method_b9bcb96f_Dne(qlF2) == 0) {
                    int n3 = this.field_364942e_Dne.method_eb4f9bc6_Dne(null, null);
                    this.field_364942e_Dne.method_7abc6b07_Dne(this.field_36a05d9_Dne);
                    this.field_21260a_FWm += (float)(this.field_364942e_Dne.method_eb4f9bc6_Dne(null, null) - n3);
                    this.field_2092ab_Dne += (float)(qlF2.field_21260d_FWm * 8);
                    if (l != -1L && qlF2.field_267cf5_Qnq == 0) {
                        n3 = this.field_2092bf_Dne ? this.field_212c1b_EyB : 0;
                        int n4 = this.field_364942e_Dne.method_eb4f9bc6_Dne(null, null);
                        l -= (long)n4;
                        for (int i = 0; i < n3; ++i) {
                            l += this.field_59d86bd_bzF[i];
                        }
                        this.field_2e5f1c_bzF = l;
                    }
                    return 1;
                }
            }
            if (n == 0) {
                return 0;
            }
            if (this.method_f2a3c4da_Dne(aHQ2, -1L) < 0) {
                return 0;
            }
            this.field_2092ab_Dne += (float)(aHQ2.field_21260d_FWm * 8);
            if (this.field_21261e_FWm && this.field_2e8486_ceE != aHQ2.method_a98a0653_aFZ()) {
                this.method_7a46289a_Dne();
            }
            if (!this.field_21261e_FWm) {
                int n5;
                if (this.field_2092bf_Dne) {
                    this.field_2e8486_ceE = aHQ2.method_a98a0653_aFZ();
                    for (n5 = 0; n5 < this.field_28e7fd_Vxn && this.field_3f1c589_Dne[n5] != this.field_2e8486_ceE; ++n5) {
                    }
                    if (n5 == this.field_28e7fd_Vxn) {
                        return -1;
                    }
                    this.field_212c1b_EyB = n5;
                    this.field_37be449_Dne.method_ce7f5da9_Dne(this.field_2e8486_ceE);
                    this.field_37be449_Dne.method_7c6f602c_FWm();
                } else {
                    int[] nArray = new int[1];
                    int n6 = this.method_9c89eb23_Dne(this.field_83606c07_Dne[0], this.field_8361bd46_Dne[0], nArray, aHQ2);
                    this.field_2e8486_ceE = nArray[0];
                    if (n6 != 0) {
                        return n6;
                    }
                    ++this.field_212c1b_EyB;
                    n5 = 0;
                }
                this.method_b0a28137_div();
            }
            this.field_37be449_Dne.method_9c78e170_Dne(aHQ2);
        }
    }

    int method_ce7f5259_Dne(float f) {
        int n = -1;
        long l = this.method_117d19de_FWm(-1);
        float f2 = this.method_ce7f5d99_Dne(-1);
        if (!this.field_2092bf_Dne) {
            return -1;
        }
        if (f < 0.0f || f > f2) {
            this.field_2e5f1c_bzF = -1L;
            this.method_7a46289a_Dne();
            return -1;
        }
        for (n = this.field_28e7fd_Vxn - 1; n >= 0; --n) {
            l -= this.field_59d86bd_bzF[n];
            if (f >= (f2 -= this.method_ce7f5d99_Dne(n))) break;
        }
        long l2 = (long)((float)l + (f - f2) * (float)this.field_83606c07_Dne[n].field_2e5f1b_bzF);
        return this.method_ce7f615d_Dne(l2);
    }

    void method_7a46289a_Dne() {
        this.field_37be449_Dne.method_7c6f6039_FWm();
        this.field_364942e_Dne.method_7a46289a_Dne();
        this.field_36a05d9_Dne.method_7a46288d_Dne();
        this.field_21261e_FWm = false;
        this.field_2092ab_Dne = 0.0f;
        this.field_21260a_FWm = 0.0f;
    }

    private int method_b0a28137_div() {
        if (this.field_21261e_FWm) {
            System.exit(1);
        }
        this.field_364942e_Dne.method_7b199b1a_Dne(this.field_83606c07_Dne[0]);
        this.field_36a05d9_Dne.method_664cb829_Dne(this.field_364942e_Dne);
        this.field_21261e_FWm = true;
        return 0;
    }

    public long method_7c6f602d_FWm() {
        return this.field_2e5f1c_bzF;
    }

    private void method_ce7f616a_Dne(long l) {
        JQZ.method_c20910ab_Dne(this.field_767c223e_Dne, l, 0);
        this.field_2092af_Dne = l;
        this.field_37e90d4_Dne.method_7c6f602c_FWm();
    }

    private int method_f2a3c4da_Dne(aHQ aHQ2, long l) {
        int n;
        int n2;
        block6: {
            if (l > 0L) {
                l += this.field_2092af_Dne;
            }
            while (true) {
                if (l > 0L && this.field_2092af_Dne >= l) {
                    return -1;
                }
                n2 = this.field_37e90d4_Dne.method_9c78e170_Dne(aHQ2);
                if (n2 < 0) {
                    this.field_2092af_Dne -= (long)n2;
                    continue;
                }
                if (n2 != 0) break block6;
                if (l == 0L) {
                    return -1;
                }
                n = this.method_7ad387f6_DyG();
                if (n == 0) {
                    return -2;
                }
                if (n < 0) break;
            }
            return -128;
        }
        n = (int)this.field_2092af_Dne;
        this.field_2092af_Dne += (long)n2;
        return n;
    }

    static int method_c20910ab_Dne(InputStream inputStream, long l, int n) {
        if (inputStream instanceof TJY) {
            TJY tJY = (TJY)inputStream;
            try {
                if (n == 0) {
                    tJY.method_ce7f616a_Dne(l);
                } else if (n == 2) {
                    tJY.method_ce7f616a_Dne(tJY.method_7a46288e_Dne() - l);
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
            return 0;
        }
        try {
            if (n == 0) {
                inputStream.reset();
            }
            inputStream.skip(l);
        }
        catch (Exception exception) {
            return -1;
        }
        return 0;
    }

    public int method_a98a0653_aFZ() {
        int n;
        int n2 = n = this.field_2092bf_Dne ? this.field_212c1b_EyB : 0;
        if (this.field_21260a_FWm == 0.0f) {
            return -1;
        }
        int n3 = (int)((double)(this.field_2092ab_Dne / this.field_21260a_FWm * (float)this.field_83606c07_Dne[n].field_2e5f1b_bzF) + 0.5);
        this.field_2092ab_Dne = 0.0f;
        this.field_21260a_FWm = 0.0f;
        return n3;
    }

    public int method_143f9e0f_bzF(int n) {
        if (n >= this.field_28e7fd_Vxn) {
            return -1;
        }
        if (!this.field_2092bf_Dne && n >= 0) {
            return this.method_143f9e0f_bzF(-1);
        }
        if (n < 0) {
            return this.field_2e8486_ceE;
        }
        return this.field_3f1c589_Dne[n];
    }

    public float method_ce7f5d99_Dne(int n) {
        if (!this.field_2092bf_Dne || n >= this.field_28e7fd_Vxn) {
            return -1.0f;
        }
        if (n < 0) {
            float f = 0.0f;
            for (int i = 0; i < this.field_28e7fd_Vxn; ++i) {
                f += this.method_ce7f5d99_Dne(i);
            }
            return f;
        }
        return (float)this.field_59d86bd_bzF[n] / (float)this.field_83606c07_Dne[n].field_2e5f1b_bzF;
    }

    public long method_117d19de_FWm(int n) {
        if (!this.field_2092bf_Dne || n >= this.field_28e7fd_Vxn) {
            return -1L;
        }
        if (n < 0) {
            long l = 0L;
            for (int i = 0; i < this.field_28e7fd_Vxn; ++i) {
                l += this.method_117d19de_FWm(i);
            }
            return l;
        }
        return this.field_59d86bd_bzF[n];
    }

    public long method_7a46288e_Dne() {
        return this.field_2092af_Dne;
    }

    int method_51b9e4d5_FWm(InputStream inputStream, byte[] byArray, int n) throws njg_0 {
        int n2;
        this.field_767c223e_Dne = inputStream;
        this.field_37e90d4_Dne.method_7a46289a_Dne();
        if (byArray != null) {
            int n3 = this.field_37e90d4_Dne.method_ce7f5d9c_Dne(n);
            System.arraycopy(byArray, 0, this.field_37e90d4_Dne.field_3f1c582_Dne, n3, n);
            this.field_37e90d4_Dne.method_117d19dd_FWm(n);
        }
        if ((n2 = inputStream instanceof TJY ? this.method_7a46288d_Dne() : this.method_7c6f602c_FWm()) != 0) {
            this.field_767c223e_Dne = null;
            this.method_ae128dba_bzF();
        }
        return n2;
    }

    public PRc method_9e6f13d9_Dne(int n) {
        if (this.field_2092bf_Dne) {
            if (n < 0) {
                if (this.field_21261e_FWm) {
                    return this.field_8361bd46_Dne[this.field_212c1b_EyB];
                }
                return null;
            }
            if (n >= this.field_28e7fd_Vxn) {
                return null;
            }
            return this.field_8361bd46_Dne[n];
        }
        if (this.field_21261e_FWm) {
            return this.field_8361bd46_Dne[0];
        }
        return null;
    }

    int method_b85b53d_Dne(long l, long l2, long l3, int n, int n2) {
        int n3;
        long l4 = l3;
        long l5 = l3;
        aHQ aHQ2 = new aHQ();
        while (l2 < l4) {
            long l6 = l4 - l2 < 8500L ? l2 : (l2 + l4) / 2L;
            this.method_ce7f616a_Dne(l6);
            n3 = this.method_f2a3c4da_Dne(aHQ2, -1L);
            if (n3 == -128) {
                return -128;
            }
            if (n3 < 0 || aHQ2.method_a98a0653_aFZ() != n) {
                l4 = l6;
                if (n3 < 0) continue;
                l5 = n3;
                continue;
            }
            l2 = n3 + aHQ2.field_21260d_FWm + aHQ2.field_267cf5_Qnq;
        }
        this.method_ce7f616a_Dne(l5);
        n3 = this.method_f2a3c4da_Dne(aHQ2, -1L);
        if (n3 == -128) {
            return -128;
        }
        if (l2 >= l3 || n3 == -1) {
            this.field_28e7fd_Vxn = n2 + 1;
            this.field_3f1c58a_Dne = new long[n2 + 2];
            this.field_3f1c58a_Dne[n2 + 1] = l2;
        } else {
            n3 = this.method_b85b53d_Dne(l5, this.field_2092af_Dne, l3, aHQ2.method_a98a0653_aFZ(), n2 + 1);
            if (n3 == -128) {
                return -128;
            }
        }
        this.field_3f1c58a_Dne[n2] = l;
        return 0;
    }

    int method_7c6f602c_FWm() {
        this.field_28e7fd_Vxn = 1;
        this.field_83606c07_Dne = new Lth[this.field_28e7fd_Vxn];
        this.field_83606c07_Dne[0] = new Lth();
        this.field_8361bd46_Dne = new PRc[this.field_28e7fd_Vxn];
        this.field_8361bd46_Dne[0] = new PRc();
        int[] nArray = new int[1];
        if (this.method_9c89eb23_Dne(this.field_83606c07_Dne[0], this.field_8361bd46_Dne[0], nArray, null) == -1) {
            return -1;
        }
        this.field_2e8486_ceE = nArray[0];
        this.method_b0a28137_div();
        return 0;
    }

    int method_8005da36_Dne(InputStream inputStream, byte[] byArray, int n) throws njg_0 {
        return this.method_51b9e4d5_FWm(inputStream, byArray, n);
    }

    public int method_ce7f615d_Dne(long l) {
        int n = -1;
        long l2 = this.method_117d19de_FWm(-1);
        if (!this.field_2092bf_Dne) {
            return -1;
        }
        if (l < 0L || l > l2) {
            this.field_2e5f1c_bzF = -1L;
            this.method_7a46289a_Dne();
            return -1;
        }
        for (n = this.field_28e7fd_Vxn - 1; n >= 0 && l < (l2 -= this.field_59d86bd_bzF[n]); --n) {
        }
        long l3 = l - l2;
        long l4 = this.field_3f1c58a_Dne[n + 1];
        long l5 = this.field_3f1c58a_Dne[n];
        int n2 = (int)l5;
        aHQ aHQ2 = new aHQ();
        while (l5 < l4) {
            long l6 = l4 - l5 < 8500L ? l5 : (l4 + l5) / 2L;
            this.method_ce7f616a_Dne(l6);
            int n3 = this.method_f2a3c4da_Dne(aHQ2, l4 - l6);
            if (n3 == -1) {
                l4 = l6;
                continue;
            }
            long l7 = aHQ2.method_7a46288e_Dne();
            if (l7 < l3) {
                n2 = n3;
                l5 = this.field_2092af_Dne;
                continue;
            }
            l4 = l6;
        }
        if (this.method_7ed979f5_Qnq(n2) != 0) {
            this.field_2e5f1c_bzF = -1L;
            this.method_7a46289a_Dne();
            return -1;
        }
        if (this.field_2e5f1c_bzF >= l) {
            this.field_2e5f1c_bzF = -1L;
            this.method_7a46289a_Dne();
            return -1;
        }
        if (l > this.method_117d19de_FWm(-1)) {
            this.field_2e5f1c_bzF = -1L;
            this.method_7a46289a_Dne();
            return -1;
        }
        while (this.field_2e5f1c_bzF < l) {
            int n4 = (int)(l - this.field_2e5f1c_bzF);
            float[][][] fArrayArray = new float[1][][];
            int[] nArray = new int[this.method_9e6dc29a_Dne((int)-1).field_21260d_FWm];
            int n5 = this.field_364942e_Dne.method_eb4f9bc6_Dne(fArrayArray, nArray);
            if (n5 > n4) {
                n5 = n4;
            }
            this.field_364942e_Dne.method_ce7f5d9c_Dne(n5);
            this.field_2e5f1c_bzF += (long)n5;
            if (n5 >= n4 || this.method_ce7f5d9c_Dne(1) != 0) continue;
            this.field_2e5f1c_bzF = this.method_117d19de_FWm(-1);
        }
        return 0;
    }

    public JQZ(String string) throws njg_0 {
        this.field_37be449_Dne = new tYH();
        this.field_364942e_Dne = new AOl();
        this.field_36a05d9_Dne = new MOU(this.field_364942e_Dne);
        TJY tJY = null;
        try {
            tJY = new TJY(this, string);
            int n = this.method_8005da36_Dne(tJY, null, 0);
            if (n == -1) {
                throw new njg_0("VorbisFile: open return -1");
            }
        }
        catch (Exception exception) {
            throw new njg_0("VorbisFile: " + exception.toString());
        }
        finally {
            if (tJY != null) {
                try {
                    ((InputStream)tJY).close();
                }
                catch (IOException iOException) {
                    iOException.printStackTrace();
                }
            }
        }
    }

    public JQZ(InputStream inputStream, byte[] byArray, int n) throws njg_0 {
        this.field_37be449_Dne = new tYH();
        this.field_364942e_Dne = new AOl();
        this.field_36a05d9_Dne = new MOU(this.field_364942e_Dne);
        int n2 = this.method_8005da36_Dne(inputStream, byArray, n);
        if (n2 == -1) {
            // empty if block
        }
    }

    static {
        field_348572_qLR = -137;
        field_21260d_FWm = 0;
        field_2e5f1b_bzF = 1;
        field_36b0a9_udO = -134;
        field_342264_ooe = -135;
        field_2092ae_Dne = 8500;
        field_20b857_DyG = -3;
        field_22c602_IjH = -129;
        field_2d29f4_aFZ = -1;
        field_33448c_mrb = -130;
        field_367154_trS = -136;
        field_29186d_XHL = -131;
        field_388da6_zGp = -2;
        field_31b816_kGO = -133;
        field_1ed017_ATE = -138;
        field_2f0dd8_div = -128;
        field_2a9ad6_Zpi = -132;
        field_267cf5_Qnq = 2;
    }

    public float method_7a46288a_Dne() {
        int n = -1;
        long l = 0L;
        float f = 0.0f;
        if (this.field_2092bf_Dne) {
            l = this.method_117d19de_FWm(-1);
            f = this.method_ce7f5d99_Dne(-1);
            for (n = this.field_28e7fd_Vxn - 1; n >= 0; --n) {
                f -= this.method_ce7f5d99_Dne(n);
                if (this.field_2e5f1c_bzF >= (l -= this.field_59d86bd_bzF[n])) break;
            }
        }
        return f + (float)(this.field_2e5f1c_bzF - l) / (float)this.field_83606c07_Dne[n].field_2e5f1b_bzF;
    }

    int method_7a46288d_Dne() throws njg_0 {
        Lth lth = new Lth();
        PRc pRc = new PRc();
        aHQ aHQ2 = new aHQ();
        int[] nArray = new int[1];
        int n = this.method_9c89eb23_Dne(lth, pRc, nArray, null);
        int n2 = nArray[0];
        int n3 = (int)this.field_2092af_Dne;
        this.field_37be449_Dne.method_7c6f6039_FWm();
        if (n == -1) {
            return -1;
        }
        if (n < 0) {
            return n;
        }
        this.field_2092bf_Dne = true;
        JQZ.method_c20910ab_Dne(this.field_767c223e_Dne, 0L, 2);
        long l = this.field_2092af_Dne = JQZ.method_9d1ae62d_Dne(this.field_767c223e_Dne);
        l = this.method_9c78e170_Dne(aHQ2);
        if (aHQ2.method_a98a0653_aFZ() != n2) {
            if (this.method_b85b53d_Dne(0L, 0L, l + 1L, n2, 0) < 0) {
                this.method_ae128dba_bzF();
                return -128;
            }
        } else if (this.method_b85b53d_Dne(0L, l, l + 1L, n2, 0) < 0) {
            this.method_ae128dba_bzF();
            return -128;
        }
        this.method_12c83ea_Dne(lth, pRc, n3);
        return 0;
    }
}

