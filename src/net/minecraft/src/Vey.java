package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
class Vey {
    int field_2e5f1b_bzF;
    static final int field_22c602_IjH;
    int field_20b857_DyG;
    int field_21260d_FWm;
    int field_388da6_zGp;
    int[] field_3f1c589_Dne;
    int field_2092ae_Dne;
    static final int field_33448c_mrb;
    int field_2d29f4_aFZ;
    int[] field_4039e0a_FWm;
    static final int field_2f0dd8_div;
    int field_267cf5_Qnq;

    int method_b92e7148_Dne(qbC qbC2) {
        int n;
        int n2;
        boolean bl = false;
        qbC2.method_16cca7a_Dne(5653314, 24);
        qbC2.method_16cca7a_Dne(this.field_2092ae_Dne, 16);
        qbC2.method_16cca7a_Dne(this.field_21260d_FWm, 24);
        for (n2 = 1; n2 < this.field_21260d_FWm && this.field_3f1c589_Dne[n2] >= this.field_3f1c589_Dne[n2 - 1]; ++n2) {
        }
        if (n2 == this.field_21260d_FWm) {
            bl = true;
        }
        if (bl) {
            n = 0;
            qbC2.method_16cca7a_Dne(1, 1);
            qbC2.method_16cca7a_Dne(this.field_3f1c589_Dne[0] - 1, 5);
            for (n2 = 1; n2 < this.field_21260d_FWm; ++n2) {
                int n3 = this.field_3f1c589_Dne[n2];
                int n4 = this.field_3f1c589_Dne[n2 - 1];
                if (n3 <= n4) continue;
                for (int i = n4; i < n3; ++i) {
                    qbC2.method_16cca7a_Dne(n2 - n, xhl_0.method_ce7f5d9c_Dne(this.field_21260d_FWm - n));
                    n = n2;
                }
            }
            qbC2.method_16cca7a_Dne(n2 - n, xhl_0.method_ce7f5d9c_Dne(this.field_21260d_FWm - n));
        } else {
            qbC2.method_16cca7a_Dne(0, 1);
            for (n2 = 0; n2 < this.field_21260d_FWm && this.field_3f1c589_Dne[n2] != 0; ++n2) {
            }
            if (n2 == this.field_21260d_FWm) {
                qbC2.method_16cca7a_Dne(0, 1);
                for (n2 = 0; n2 < this.field_21260d_FWm; ++n2) {
                    qbC2.method_16cca7a_Dne(this.field_3f1c589_Dne[n2] - 1, 5);
                }
            } else {
                qbC2.method_16cca7a_Dne(1, 1);
                for (n2 = 0; n2 < this.field_21260d_FWm; ++n2) {
                    if (this.field_3f1c589_Dne[n2] == 0) {
                        qbC2.method_16cca7a_Dne(0, 1);
                        continue;
                    }
                    qbC2.method_16cca7a_Dne(1, 1);
                    qbC2.method_16cca7a_Dne(this.field_3f1c589_Dne[n2] - 1, 5);
                }
            }
        }
        qbC2.method_16cca7a_Dne(this.field_2e5f1b_bzF, 4);
        switch (this.field_2e5f1b_bzF) {
            case 0: {
                break;
            }
            case 1: 
            case 2: {
                if (this.field_4039e0a_FWm == null) {
                    return -1;
                }
                qbC2.method_16cca7a_Dne(this.field_267cf5_Qnq, 32);
                qbC2.method_16cca7a_Dne(this.field_2d29f4_aFZ, 32);
                qbC2.method_16cca7a_Dne(this.field_388da6_zGp - 1, 4);
                qbC2.method_16cca7a_Dne(this.field_20b857_DyG, 1);
                n = 0;
                switch (this.field_2e5f1b_bzF) {
                    case 1: {
                        n = this.method_7a46288d_Dne();
                        break;
                    }
                    case 2: {
                        n = this.field_21260d_FWm * this.field_2092ae_Dne;
                    }
                }
                for (n2 = 0; n2 < n; ++n2) {
                    qbC2.method_16cca7a_Dne(Math.abs(this.field_4039e0a_FWm[n2]), this.field_388da6_zGp);
                }
                break;
            }
            default: {
                return -1;
            }
        }
        return 0;
    }

    int method_92822509_FWm(qbC qbC2) {
        int n;
        int n2;
        if (qbC2.method_117d19dd_FWm(24) != 5653314) {
            this.method_7a46289a_Dne();
            return -1;
        }
        this.field_2092ae_Dne = qbC2.method_117d19dd_FWm(16);
        this.field_21260d_FWm = qbC2.method_117d19dd_FWm(24);
        if (this.field_21260d_FWm == -1) {
            this.method_7a46289a_Dne();
            return -1;
        }
        switch (qbC2.method_117d19dd_FWm(1)) {
            case 0: {
                this.field_3f1c589_Dne = new int[this.field_21260d_FWm];
                if (qbC2.method_117d19dd_FWm(1) != 0) {
                    for (n2 = 0; n2 < this.field_21260d_FWm; ++n2) {
                        if (qbC2.method_117d19dd_FWm(1) != 0) {
                            n = qbC2.method_117d19dd_FWm(5);
                            if (n == -1) {
                                this.method_7a46289a_Dne();
                                return -1;
                            }
                            this.field_3f1c589_Dne[n2] = n + 1;
                            continue;
                        }
                        this.field_3f1c589_Dne[n2] = 0;
                    }
                } else {
                    for (n2 = 0; n2 < this.field_21260d_FWm; ++n2) {
                        n = qbC2.method_117d19dd_FWm(5);
                        if (n == -1) {
                            this.method_7a46289a_Dne();
                            return -1;
                        }
                        this.field_3f1c589_Dne[n2] = n + 1;
                    }
                }
                break;
            }
            case 1: {
                n = qbC2.method_117d19dd_FWm(5) + 1;
                this.field_3f1c589_Dne = new int[this.field_21260d_FWm];
                n2 = 0;
                while (n2 < this.field_21260d_FWm) {
                    int n3 = qbC2.method_117d19dd_FWm(xhl_0.method_ce7f5d9c_Dne(this.field_21260d_FWm - n2));
                    if (n3 == -1) {
                        this.method_7a46289a_Dne();
                        return -1;
                    }
                    int n4 = 0;
                    while (n4 < n3) {
                        this.field_3f1c589_Dne[n2] = n;
                        ++n4;
                        ++n2;
                    }
                    ++n;
                }
                break;
            }
            default: {
                return -1;
            }
        }
        this.field_2e5f1b_bzF = qbC2.method_117d19dd_FWm(4);
        switch (this.field_2e5f1b_bzF) {
            case 0: {
                break;
            }
            case 1: 
            case 2: {
                this.field_267cf5_Qnq = qbC2.method_117d19dd_FWm(32);
                this.field_2d29f4_aFZ = qbC2.method_117d19dd_FWm(32);
                this.field_388da6_zGp = qbC2.method_117d19dd_FWm(4) + 1;
                this.field_20b857_DyG = qbC2.method_117d19dd_FWm(1);
                n = 0;
                switch (this.field_2e5f1b_bzF) {
                    case 1: {
                        n = this.method_7a46288d_Dne();
                        break;
                    }
                    case 2: {
                        n = this.field_21260d_FWm * this.field_2092ae_Dne;
                    }
                }
                this.field_4039e0a_FWm = new int[n];
                for (n2 = 0; n2 < n; ++n2) {
                    this.field_4039e0a_FWm[n2] = qbC2.method_117d19dd_FWm(this.field_388da6_zGp);
                }
                if (this.field_4039e0a_FWm[n - 1] != -1) break;
                this.method_7a46289a_Dne();
                return -1;
            }
            default: {
                this.method_7a46289a_Dne();
                return -1;
            }
        }
        return 0;
    }

    static float method_16b6d4d_Dne(float f, int n) {
        return (float)((double)f * Math.pow(2.0, n));
    }

    static float method_ce7f5d99_Dne(int n) {
        float f = n & 0x1FFFFF;
        float f2 = (n & 0x7FE00000) >>> 21;
        if ((n & Integer.MIN_VALUE) != 0) {
            f = -f;
        }
        return Vey.method_16b6d4d_Dne(f, (int)f2 - 20 - 768);
    }

    void method_7a46289a_Dne() {
    }

    private int method_7a46288d_Dne() {
        int n = (int)Math.floor(Math.pow(this.field_21260d_FWm, 1.0 / (double)this.field_2092ae_Dne));
        while (true) {
            int n2 = 1;
            int n3 = 1;
            for (int i = 0; i < this.field_2092ae_Dne; ++i) {
                n2 *= n;
                n3 *= n + 1;
            }
            if (n2 <= this.field_21260d_FWm && n3 > this.field_21260d_FWm) {
                return n;
            }
            if (n2 > this.field_21260d_FWm) {
                --n;
                continue;
            }
            ++n;
        }
    }

    static {
        field_33448c_mrb = 768;
        field_2f0dd8_div = 10;
        field_22c602_IjH = 21;
    }

    static long method_ce7f525a_Dne(float f) {
        int n = 0;
        if (f < 0.0f) {
            n = Integer.MIN_VALUE;
            f = -f;
        }
        int n2 = (int)Math.floor(Math.log(f) / Math.log(2.0));
        int n3 = (int)Math.rint(Math.pow(f, 20 - n2));
        n2 = n2 + 768 << 21;
        return n | n2 | n3;
    }

    float[] method_ce7eeb87_Dne() {
        if (this.field_2e5f1b_bzF == 1 || this.field_2e5f1b_bzF == 2) {
            float f = Vey.method_ce7f5d99_Dne(this.field_267cf5_Qnq);
            float f2 = Vey.method_ce7f5d99_Dne(this.field_2d29f4_aFZ);
            float[] fArray = new float[this.field_21260d_FWm * this.field_2092ae_Dne];
            switch (this.field_2e5f1b_bzF) {
                case 1: {
                    int n = this.method_7a46288d_Dne();
                    for (int i = 0; i < this.field_21260d_FWm; ++i) {
                        float f3 = 0.0f;
                        int n2 = 1;
                        for (int j = 0; j < this.field_2092ae_Dne; ++j) {
                            int n3 = i / n2 % n;
                            float f4 = this.field_4039e0a_FWm[n3];
                            f4 = Math.abs(f4) * f2 + f + f3;
                            if (this.field_20b857_DyG != 0) {
                                f3 = f4;
                            }
                            fArray[i * this.field_2092ae_Dne + j] = f4;
                            n2 *= n;
                        }
                    }
                    break;
                }
                case 2: {
                    for (int i = 0; i < this.field_21260d_FWm; ++i) {
                        float f5 = 0.0f;
                        for (int j = 0; j < this.field_2092ae_Dne; ++j) {
                            float f6 = this.field_4039e0a_FWm[i * this.field_2092ae_Dne + j];
                            f6 = Math.abs(f6) * f2 + f + f5;
                            if (this.field_20b857_DyG != 0) {
                                f5 = f6;
                            }
                            fArray[i * this.field_2092ae_Dne + j] = f6;
                        }
                    }
                    break;
                }
            }
            return fArray;
        }
        return null;
    }

    Vey() {
    }
}

