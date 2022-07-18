package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class edi
extends gwq {
    double field_2d29ef_aFZ = 1.0;
    int field_2092ae_Dne = 0;
    Qnq field_36c4f18_Dne;
    double field_212608_FWm = 1.0;
    int field_2e5f1b_bzF = 1;
    double field_2092a9_Dne = 0.618;
    Random field_7331eae7_Dne = new Random();
    int[] field_3f1c589_Dne = new int[]{0, 0, 0};
    int field_21260d_FWm;
    int field_2d29f4_aFZ = 4;
    static final byte[] field_3f1c582_Dne = new byte[]{2, 0, 0, 1, 2, 1};
    double field_2e5f16_bzF = 0.381;
    int field_267cf5_Qnq = 12;
    int[][] field_7a46ee0e_Dne;
    double field_267cf0_Qnq = 1.0;

    public edi(boolean bl) {
        super(bl);
    }

    void method_7c6f6039_FWm() {
        int n = this.field_7a46ee0e_Dne.length;
        for (int i = 0; i < n; ++i) {
            int n2 = this.field_7a46ee0e_Dne[i][0];
            int n3 = this.field_7a46ee0e_Dne[i][1];
            int n4 = this.field_7a46ee0e_Dne[i][2];
            this.method_2c2cf7c9_Dne(n2, n3, n4);
        }
    }

    void method_7a46289a_Dne() {
        int n;
        this.field_21260d_FWm = (int)((double)this.field_2092ae_Dne * this.field_2092a9_Dne);
        if (this.field_21260d_FWm >= this.field_2092ae_Dne) {
            this.field_21260d_FWm = this.field_2092ae_Dne - 1;
        }
        if ((n = (int)(1.382 + Math.pow(this.field_2d29ef_aFZ * (double)this.field_2092ae_Dne / 13.0, 2.0))) < 1) {
            n = 1;
        }
        int[][] nArray = new int[n * this.field_2092ae_Dne][4];
        int n2 = this.field_3f1c589_Dne[1] + this.field_2092ae_Dne - this.field_2d29f4_aFZ;
        int n3 = 1;
        int n4 = this.field_3f1c589_Dne[1] + this.field_21260d_FWm;
        int n5 = n2 - this.field_3f1c589_Dne[1];
        nArray[0][0] = this.field_3f1c589_Dne[0];
        nArray[0][1] = n2--;
        nArray[0][2] = this.field_3f1c589_Dne[2];
        nArray[0][3] = n4;
        while (n5 >= 0) {
            float f = this.method_ce7f5d99_Dne(n5);
            if (f < 0.0f) {
                --n2;
                --n5;
                continue;
            }
            double d = 0.5;
            for (int i = 0; i < n; ++i) {
                int[] nArray2;
                int n6;
                double d2;
                double d3 = this.field_267cf0_Qnq * (double)f * ((double)this.field_7331eae7_Dne.nextFloat() + 0.328);
                int n7 = geR.method_117d0718_FWm(d3 * Math.sin(d2 = (double)this.field_7331eae7_Dne.nextFloat() * 2.0 * Math.PI) + (double)this.field_3f1c589_Dne[0] + d);
                int[] nArray3 = new int[]{n7, n2, n6 = geR.method_117d0718_FWm(d3 * Math.cos(d2) + (double)this.field_3f1c589_Dne[2] + d)};
                if (this.method_7831de29_Dne(nArray3, nArray2 = new int[]{n7, n2 + this.field_2d29f4_aFZ, n6}) != -1) continue;
                int[] nArray4 = new int[]{this.field_3f1c589_Dne[0], this.field_3f1c589_Dne[1], this.field_3f1c589_Dne[2]};
                double d4 = Math.sqrt(Math.pow(Math.abs(this.field_3f1c589_Dne[0] - nArray3[0]), 2.0) + Math.pow(Math.abs(this.field_3f1c589_Dne[2] - nArray3[2]), 2.0));
                double d5 = d4 * this.field_2e5f16_bzF;
                nArray4[1] = (double)nArray3[1] - d5 > (double)n4 ? n4 : (int)((double)nArray3[1] - d5);
                if (this.method_7831de29_Dne(nArray4, nArray3) != -1) continue;
                nArray[n3][0] = n7;
                nArray[n3][1] = n2;
                nArray[n3][2] = n6;
                nArray[n3][3] = nArray4[1];
                ++n3;
            }
            --n2;
            --n5;
        }
        this.field_7a46ee0e_Dne = new int[n3][4];
        System.arraycopy(nArray, 0, this.field_7a46ee0e_Dne, 0, n3);
    }

    void method_8e0a5b8d_Dne(int[] nArray, int[] nArray2, int n) {
        int[] nArray3 = new int[]{0, 0, 0};
        int n2 = 0;
        for (int n3 = 0; n3 < 3; n3 = (int)((byte)(n3 + 1))) {
            nArray3[n3] = nArray2[n3] - nArray[n3];
            if (Math.abs(nArray3[n3]) <= Math.abs(nArray3[n2])) continue;
            n2 = n3;
        }
        if (nArray3[n2] != 0) {
            byte by = field_3f1c582_Dne[n2];
            byte by2 = field_3f1c582_Dne[n2 + 3];
            int n4 = nArray3[n2] > 0 ? 1 : -1;
            double d = (double)nArray3[by] / (double)nArray3[n2];
            double d2 = (double)nArray3[by2] / (double)nArray3[n2];
            int[] nArray4 = new int[]{0, 0, 0};
            int n5 = nArray3[n2] + n4;
            for (int i = 0; i != n5; i += n4) {
                int n6;
                nArray4[n2] = geR.method_117d0718_FWm((double)(nArray[n2] + i) + 0.5);
                nArray4[by] = geR.method_117d0718_FWm((double)nArray[by] + (double)i * d + 0.5);
                nArray4[by2] = geR.method_117d0718_FWm((double)nArray[by2] + (double)i * d2 + 0.5);
                int n7 = 0;
                int n8 = Math.abs(nArray4[0] - nArray[0]);
                int n9 = Math.max(n8, n6 = Math.abs(nArray4[2] - nArray[2]));
                if (n9 > 0) {
                    if (n8 == n9) {
                        n7 = 4;
                    } else if (n6 == n9) {
                        n7 = 8;
                    }
                }
                this.method_3e226590_Dne(this.field_36c4f18_Dne, nArray4[0], nArray4[1], nArray4[2], n, n7);
            }
        }
    }

    boolean method_7a46289e_Dne() {
        int[] nArray = new int[]{this.field_3f1c589_Dne[0], this.field_3f1c589_Dne[1], this.field_3f1c589_Dne[2]};
        int[] nArray2 = new int[]{this.field_3f1c589_Dne[0], this.field_3f1c589_Dne[1] + this.field_2092ae_Dne - 1, this.field_3f1c589_Dne[2]};
        int n = this.field_36c4f18_Dne.method_2c2cf7bc_Dne(this.field_3f1c589_Dne[0], this.field_3f1c589_Dne[1] - 1, this.field_3f1c589_Dne[2]);
        if (n != 2 && n != 3) {
            return false;
        }
        int n2 = this.method_7831de29_Dne(nArray, nArray2);
        if (n2 == -1) {
            return true;
        }
        if (n2 < 6) {
            return false;
        }
        this.field_2092ae_Dne = n2;
        return true;
    }

    float method_ce7f5d99_Dne(int n) {
        if ((double)n < (double)this.field_2092ae_Dne * 0.3) {
            return -1.618f;
        }
        float f = (float)this.field_2092ae_Dne / 2.0f;
        float f2 = (float)this.field_2092ae_Dne / 2.0f - (float)n;
        float f3 = f2 == 0.0f ? f : (Math.abs(f2) >= f ? 0.0f : (float)Math.sqrt(Math.pow(Math.abs(f), 2.0) - Math.pow(Math.abs(f2), 2.0)));
        return f3 *= 0.5f;
    }

    void method_2c2cf7c9_Dne(int n, int n2, int n3) {
        int n4 = n2 + this.field_2d29f4_aFZ;
        for (int i = n2; i < n4; ++i) {
            float f = this.method_117d19da_FWm(i - n2);
            this.method_c687b11e_Dne(n, i, n3, f, (byte)1, zKP.field_36e218c_Dne.field_21260d_FWm);
        }
    }

    void method_c687b11e_Dne(int n, int n2, int n3, float f, byte by, int n4) {
        int n5 = (int)((double)f + 0.618);
        byte by2 = field_3f1c582_Dne[by];
        byte by3 = field_3f1c582_Dne[by + 3];
        int[] nArray = new int[]{n, n2, n3};
        int[] nArray2 = new int[]{0, 0, 0};
        int n6 = -n5;
        nArray2[by] = nArray[by];
        for (int i = -n5; i <= n5; ++i) {
            nArray2[by2] = nArray[by2] + i;
            n6 = -n5;
            while (n6 <= n5) {
                double d = Math.pow((double)Math.abs(i) + 0.5, 2.0) + Math.pow((double)Math.abs(n6) + 0.5, 2.0);
                if (d > (double)(f * f)) {
                    ++n6;
                    continue;
                }
                nArray2[by3] = nArray[by3] + n6;
                int n7 = this.field_36c4f18_Dne.method_2c2cf7bc_Dne(nArray2[0], nArray2[1], nArray2[2]);
                if (n7 != 0 && n7 != zKP.field_36e218c_Dne.field_21260d_FWm) {
                    ++n6;
                    continue;
                }
                this.method_3e226590_Dne(this.field_36c4f18_Dne, nArray2[0], nArray2[1], nArray2[2], n4, 0);
                ++n6;
            }
        }
    }

    boolean method_ce7f5dad_Dne(int n) {
        return (double)n >= (double)this.field_2092ae_Dne * 0.2;
    }

    float method_117d19da_FWm(int n) {
        return n >= 0 && n < this.field_2d29f4_aFZ ? (n != 0 && n != this.field_2d29f4_aFZ - 1 ? 3.0f : 2.0f) : -1.0f;
    }

    @Override
    public void method_2be429a4_Dne(double d, double d2, double d3) {
        this.field_267cf5_Qnq = (int)(d * 12.0);
        if (d > 0.5) {
            this.field_2d29f4_aFZ = 5;
        }
        this.field_267cf0_Qnq = d2;
        this.field_2d29ef_aFZ = d3;
    }

    int method_7831de29_Dne(int[] nArray, int[] nArray2) {
        int n;
        int[] nArray3 = new int[]{0, 0, 0};
        int n2 = 0;
        for (int n3 = 0; n3 < 3; n3 = (int)((byte)(n3 + 1))) {
            nArray3[n3] = nArray2[n3] - nArray[n3];
            if (Math.abs(nArray3[n3]) <= Math.abs(nArray3[n2])) continue;
            n2 = n3;
        }
        if (nArray3[n2] == 0) {
            return -1;
        }
        byte by = field_3f1c582_Dne[n2];
        byte by2 = field_3f1c582_Dne[n2 + 3];
        int n4 = nArray3[n2] > 0 ? 1 : -1;
        double d = (double)nArray3[by] / (double)nArray3[n2];
        double d2 = (double)nArray3[by2] / (double)nArray3[n2];
        int[] nArray4 = new int[]{0, 0, 0};
        int n5 = nArray3[n2] + n4;
        for (n = 0; n != n5; n += n4) {
            nArray4[n2] = nArray[n2] + n;
            nArray4[by] = geR.method_117d0718_FWm((double)nArray[by] + (double)n * d);
            nArray4[by2] = geR.method_117d0718_FWm((double)nArray[by2] + (double)n * d2);
            int n6 = this.field_36c4f18_Dne.method_2c2cf7bc_Dne(nArray4[0], nArray4[1], nArray4[2]);
            if (n6 != 0 && n6 != zKP.field_36e218c_Dne.field_21260d_FWm) break;
        }
        return n == n5 ? -1 : Math.abs(n);
    }

    void method_907a9d21_Qnq() {
        int n = this.field_7a46ee0e_Dne.length;
        int[] nArray = new int[]{this.field_3f1c589_Dne[0], this.field_3f1c589_Dne[1], this.field_3f1c589_Dne[2]};
        for (int i = 0; i < n; ++i) {
            int[] nArray2 = this.field_7a46ee0e_Dne[i];
            int[] nArray3 = new int[]{nArray2[0], nArray2[1], nArray2[2]};
            nArray[1] = nArray2[3];
            int n2 = nArray[1] - this.field_3f1c589_Dne[1];
            if (!this.method_ce7f5dad_Dne(n2)) continue;
            this.method_8e0a5b8d_Dne(nArray, nArray3, (byte)zKP.field_af0f1368_udO.field_21260d_FWm);
        }
    }

    void method_ae128dc7_bzF() {
        int n = this.field_3f1c589_Dne[0];
        int n2 = this.field_3f1c589_Dne[1];
        int n3 = this.field_3f1c589_Dne[1] + this.field_21260d_FWm;
        int n4 = this.field_3f1c589_Dne[2];
        int[] nArray = new int[]{n, n2, n4};
        int[] nArray2 = new int[]{n, n3, n4};
        this.method_8e0a5b8d_Dne(nArray, nArray2, zKP.field_af0f1368_udO.field_21260d_FWm);
        if (this.field_2e5f1b_bzF == 2) {
            nArray[0] = nArray[0] + 1;
            nArray2[0] = nArray2[0] + 1;
            this.method_8e0a5b8d_Dne(nArray, nArray2, zKP.field_af0f1368_udO.field_21260d_FWm);
            nArray[2] = nArray[2] + 1;
            nArray2[2] = nArray2[2] + 1;
            this.method_8e0a5b8d_Dne(nArray, nArray2, zKP.field_af0f1368_udO.field_21260d_FWm);
            nArray[0] = nArray[0] + -1;
            nArray2[0] = nArray2[0] + -1;
            this.method_8e0a5b8d_Dne(nArray, nArray2, zKP.field_af0f1368_udO.field_21260d_FWm);
        }
    }

    @Override
    public boolean method_c3e4cb88_Dne(Qnq qnq, Random random, int n, int n2, int n3) {
        this.field_36c4f18_Dne = qnq;
        long l = random.nextLong();
        this.field_7331eae7_Dne.setSeed(l);
        this.field_3f1c589_Dne[0] = n;
        this.field_3f1c589_Dne[1] = n2;
        this.field_3f1c589_Dne[2] = n3;
        if (this.field_2092ae_Dne == 0) {
            this.field_2092ae_Dne = 5 + this.field_7331eae7_Dne.nextInt(this.field_267cf5_Qnq);
        }
        if (!this.method_7a46289e_Dne()) {
            return false;
        }
        this.method_7a46289a_Dne();
        this.method_7c6f6039_FWm();
        this.method_ae128dc7_bzF();
        this.method_907a9d21_Qnq();
        return true;
    }
}

