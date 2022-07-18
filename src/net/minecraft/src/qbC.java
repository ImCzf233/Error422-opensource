package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class qbC {
    int field_21260d_FWm = 0;
    int field_2092ae_Dne = 0;
    private static final int[] field_3f1c589_Dne;
    private static final int field_2d29f4_aFZ;
    int field_2e5f1b_bzF = 0;
    int field_267cf5_Qnq = 0;
    byte[] field_3f1c582_Dne = null;

    public void method_ae128dc7_bzF() {
        this.field_3f1c582_Dne = null;
    }

    public static int method_7ed979f5_Qnq(int n) {
        int n2 = 0;
        while (n > 0) {
            ++n2;
            n >>>= 1;
        }
        return n2;
    }

    public int method_ce7f5d9c_Dne(int n) {
        int n2 = field_3f1c589_Dne[n];
        if (this.field_2e5f1b_bzF + 4 >= this.field_267cf5_Qnq && this.field_2e5f1b_bzF + ((n += this.field_21260d_FWm) - 1) / 8 >= this.field_267cf5_Qnq) {
            return -1;
        }
        int n3 = (this.field_3f1c582_Dne[this.field_2092ae_Dne] & 0xFF) >>> this.field_21260d_FWm;
        if (n > 8) {
            n3 |= (this.field_3f1c582_Dne[this.field_2092ae_Dne + 1] & 0xFF) << 8 - this.field_21260d_FWm;
            if (n > 16) {
                n3 |= (this.field_3f1c582_Dne[this.field_2092ae_Dne + 2] & 0xFF) << 16 - this.field_21260d_FWm;
                if (n > 24) {
                    n3 |= (this.field_3f1c582_Dne[this.field_2092ae_Dne + 3] & 0xFF) << 24 - this.field_21260d_FWm;
                    if (n > 32 && this.field_21260d_FWm != 0) {
                        n3 |= (this.field_3f1c582_Dne[this.field_2092ae_Dne + 4] & 0xFF) << 32 - this.field_21260d_FWm;
                    }
                }
            }
        }
        return n2 & n3;
    }

    public int method_7c6f602c_FWm() {
        if (this.field_2e5f1b_bzF >= this.field_267cf5_Qnq) {
            int n = -1;
            ++this.field_21260d_FWm;
            if (this.field_21260d_FWm > 7) {
                this.field_21260d_FWm = 0;
                ++this.field_2092ae_Dne;
                ++this.field_2e5f1b_bzF;
            }
            return n;
        }
        int n = this.field_3f1c582_Dne[this.field_2092ae_Dne] >> this.field_21260d_FWm & 1;
        ++this.field_21260d_FWm;
        if (this.field_21260d_FWm > 7) {
            this.field_21260d_FWm = 0;
            ++this.field_2092ae_Dne;
            ++this.field_2e5f1b_bzF;
        }
        return n;
    }

    public void method_907a9d21_Qnq() {
        ++this.field_21260d_FWm;
        if (this.field_21260d_FWm > 7) {
            this.field_21260d_FWm = 0;
            ++this.field_2092ae_Dne;
            ++this.field_2e5f1b_bzF;
        }
    }

    public static void method_8f501fe4_Dne(String string) {
        System.err.println(string);
        System.exit(1);
    }

    public void method_a7a72043_FWm(byte[] byArray, int n) {
        this.method_77c70b01_Dne(byArray, 0, n);
    }

    public void method_77c70b01_Dne(byte[] byArray, int n, int n2) {
        this.field_2092ae_Dne = n;
        this.field_3f1c582_Dne = byArray;
        this.field_2e5f1b_bzF = 0;
        this.field_21260d_FWm = 0;
        this.field_267cf5_Qnq = n2;
    }

    void method_7c6f6039_FWm() {
        this.field_2092ae_Dne = 0;
        this.field_3f1c582_Dne[0] = 0;
        this.field_2e5f1b_bzF = 0;
        this.field_21260d_FWm = 0;
    }

    public void method_174dee1_Dne(byte[] byArray) {
        for (int i = 0; i < byArray.length && byArray[i] != 0; ++i) {
            this.method_16cca7a_Dne(byArray[i], 8);
        }
    }

    public int method_7a46288d_Dne() {
        if (this.field_2e5f1b_bzF >= this.field_267cf5_Qnq) {
            return -1;
        }
        return this.field_3f1c582_Dne[this.field_2092ae_Dne] >> this.field_21260d_FWm & 1;
    }

    public void method_7a46289a_Dne() {
        this.field_3f1c582_Dne = new byte[256];
        this.field_2092ae_Dne = 0;
        this.field_3f1c582_Dne[0] = 0;
        this.field_267cf5_Qnq = 256;
    }

    public int method_143f9e0f_bzF(int n) {
        int n2;
        int n3 = 32 - n;
        n += this.field_21260d_FWm;
        if (this.field_2e5f1b_bzF + 4 >= this.field_267cf5_Qnq) {
            n2 = -1;
            if (this.field_2e5f1b_bzF * 8 + n > this.field_267cf5_Qnq * 8) {
                this.field_2092ae_Dne += n / 8;
                this.field_2e5f1b_bzF += n / 8;
                this.field_21260d_FWm = n & 7;
                return n2;
            }
        }
        n2 = (this.field_3f1c582_Dne[this.field_2092ae_Dne] & 0xFF) << 24 + this.field_21260d_FWm;
        if (n > 8) {
            n2 |= (this.field_3f1c582_Dne[this.field_2092ae_Dne + 1] & 0xFF) << 16 + this.field_21260d_FWm;
            if (n > 16) {
                n2 |= (this.field_3f1c582_Dne[this.field_2092ae_Dne + 2] & 0xFF) << 8 + this.field_21260d_FWm;
                if (n > 24) {
                    n2 |= (this.field_3f1c582_Dne[this.field_2092ae_Dne + 3] & 0xFF) << this.field_21260d_FWm;
                    if (n > 32 && this.field_21260d_FWm != 0) {
                        n2 |= (this.field_3f1c582_Dne[this.field_2092ae_Dne + 4] & 0xFF) >> 8 - this.field_21260d_FWm;
                    }
                }
            }
        }
        n2 = n2 >>> (n3 >> 1) >>> (n3 + 1 >> 1);
        this.field_2092ae_Dne += n / 8;
        this.field_2e5f1b_bzF += n / 8;
        this.field_21260d_FWm = n & 7;
        return n2;
    }

    public int method_907a9d14_Qnq() {
        return this.field_2e5f1b_bzF * 8 + this.field_21260d_FWm;
    }

    public void method_ce7f5da9_Dne(int n) {
        this.field_2092ae_Dne += (n += this.field_21260d_FWm) / 8;
        this.field_2e5f1b_bzF += n / 8;
        this.field_21260d_FWm = n & 7;
    }

    public byte[] method_ce7eeb83_Dne() {
        return this.field_3f1c582_Dne;
    }

    public void method_2d277042_Dne(byte[] byArray, int n) {
        int n2 = 0;
        while (n-- != 0) {
            byArray[n2++] = (byte)this.method_117d19dd_FWm(8);
        }
    }

    public int method_ae128dba_bzF() {
        return this.field_2e5f1b_bzF + (this.field_21260d_FWm + 7) / 8;
    }

    public void method_16cca7a_Dne(int n, int n2) {
        if (this.field_2e5f1b_bzF + 4 >= this.field_267cf5_Qnq) {
            byte[] byArray = new byte[this.field_267cf5_Qnq + 256];
            System.arraycopy(this.field_3f1c582_Dne, 0, byArray, 0, this.field_267cf5_Qnq);
            this.field_3f1c582_Dne = byArray;
            this.field_267cf5_Qnq += 256;
        }
        n &= field_3f1c589_Dne[n2];
        int n3 = this.field_2092ae_Dne;
        this.field_3f1c582_Dne[n3] = (byte)(this.field_3f1c582_Dne[n3] | (byte)(n << this.field_21260d_FWm));
        if ((n2 += this.field_21260d_FWm) >= 8) {
            this.field_3f1c582_Dne[this.field_2092ae_Dne + 1] = (byte)(n >>> 8 - this.field_21260d_FWm);
            if (n2 >= 16) {
                this.field_3f1c582_Dne[this.field_2092ae_Dne + 2] = (byte)(n >>> 16 - this.field_21260d_FWm);
                if (n2 >= 24) {
                    this.field_3f1c582_Dne[this.field_2092ae_Dne + 3] = (byte)(n >>> 24 - this.field_21260d_FWm);
                    if (n2 >= 32) {
                        this.field_3f1c582_Dne[this.field_2092ae_Dne + 4] = this.field_21260d_FWm > 0 ? (byte)(n >>> 32 - this.field_21260d_FWm) : (byte)0;
                    }
                }
            }
        }
        this.field_2e5f1b_bzF += n2 / 8;
        this.field_2092ae_Dne += n2 / 8;
        this.field_21260d_FWm = n2 & 7;
    }

    static {
        field_2d29f4_aFZ = 256;
        field_3f1c589_Dne = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, Short.MAX_VALUE, 65535, 131071, 262143, 524287, 1048575, 0x1FFFFF, 0x3FFFFF, 0x7FFFFF, 0xFFFFFF, 0x1FFFFFF, 0x3FFFFFF, 0x7FFFFFF, 0xFFFFFFF, 0x1FFFFFFF, 0x3FFFFFFF, Integer.MAX_VALUE, -1};
    }

    public int method_117d19dd_FWm(int n) {
        int n2;
        int n3 = field_3f1c589_Dne[n];
        n += this.field_21260d_FWm;
        if (this.field_2e5f1b_bzF + 4 >= this.field_267cf5_Qnq) {
            n2 = -1;
            if (this.field_2e5f1b_bzF + (n - 1) / 8 >= this.field_267cf5_Qnq) {
                this.field_2092ae_Dne += n / 8;
                this.field_2e5f1b_bzF += n / 8;
                this.field_21260d_FWm = n & 7;
                return n2;
            }
        }
        n2 = (this.field_3f1c582_Dne[this.field_2092ae_Dne] & 0xFF) >>> this.field_21260d_FWm;
        if (n > 8) {
            n2 |= (this.field_3f1c582_Dne[this.field_2092ae_Dne + 1] & 0xFF) << 8 - this.field_21260d_FWm;
            if (n > 16) {
                n2 |= (this.field_3f1c582_Dne[this.field_2092ae_Dne + 2] & 0xFF) << 16 - this.field_21260d_FWm;
                if (n > 24) {
                    n2 |= (this.field_3f1c582_Dne[this.field_2092ae_Dne + 3] & 0xFF) << 24 - this.field_21260d_FWm;
                    if (n > 32 && this.field_21260d_FWm != 0) {
                        n2 |= (this.field_3f1c582_Dne[this.field_2092ae_Dne + 4] & 0xFF) << 32 - this.field_21260d_FWm;
                    }
                }
            }
        }
        this.field_2092ae_Dne += n / 8;
        this.field_2e5f1b_bzF += n / 8;
        this.field_21260d_FWm = n & 7;
        return n2 &= n3;
    }
}

