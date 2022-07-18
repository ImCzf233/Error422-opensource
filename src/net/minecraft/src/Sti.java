package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
class Sti {
    int[] field_3f1c589_Dne;
    float[] field_3f1c586_Dne;
    int field_21260d_FWm;
    float[] field_59d86b9_bzF;
    float[] field_4039e07_FWm = new float[1024];
    float field_2092ab_Dne;
    int field_2092ae_Dne;

    private float[] method_a4ada9b1_Dne(float[] fArray, float[] fArray2, int n, int n2, int n3, int n4) {
        float f;
        float f2;
        float f3;
        float f4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9 = n3;
        int n10 = 0;
        int n11 = n3;
        int n12 = n2;
        for (n8 = 0; n8 < n3; ++n8) {
            float f5 = fArray[n9] - fArray[n10];
            fArray2[n11 + n8] = fArray[n9++] + fArray[n10++];
            float f6 = fArray[n9] - fArray[n10];
            fArray2[n8++] = f5 * this.field_3f1c586_Dne[n12 -= 4] + f6 * this.field_3f1c586_Dne[n12 + 1];
            fArray2[n8] = f6 * this.field_3f1c586_Dne[n12] - f5 * this.field_3f1c586_Dne[n12 + 1];
            fArray2[n11 + n8] = fArray[n9++] + fArray[n10++];
        }
        for (n8 = 0; n8 < this.field_21260d_FWm - 3; ++n8) {
            int n13 = n >>> n8 + 2;
            int n14 = 1 << n8 + 3;
            n7 = n2 - 2;
            n12 = 0;
            for (n6 = 0; n6 < n13 >>> 2; ++n6) {
                n5 = n7;
                n11 = n5 - (n13 >> 1);
                f4 = this.field_3f1c586_Dne[n12];
                f3 = this.field_3f1c586_Dne[n12 + 1];
                n7 -= 2;
                ++n13;
                for (int i = 0; i < 2 << n8; ++i) {
                    f2 = fArray2[n5] - fArray2[n11];
                    fArray[n5] = fArray2[n5] + fArray2[n11];
                    f = fArray2[++n5] - fArray2[++n11];
                    fArray[n5] = fArray2[n5] + fArray2[n11];
                    fArray[n11] = f * f4 - f2 * f3;
                    fArray[n11 - 1] = f2 * f4 + f * f3;
                    n5 -= n13;
                    n11 -= n13;
                }
                --n13;
                n12 += n14;
            }
            float[] fArray3 = fArray2;
            fArray2 = fArray;
            fArray = fArray3;
        }
        n8 = n;
        int n15 = 0;
        int n16 = 0;
        n7 = n2 - 1;
        for (int i = 0; i < n4; ++i) {
            n6 = this.field_3f1c589_Dne[n15++];
            n5 = this.field_3f1c589_Dne[n15++];
            f4 = fArray2[n6] - fArray2[n5 + 1];
            f = fArray2[n6 - 1] + fArray2[n5];
            f3 = fArray2[n6] + fArray2[n5 + 1];
            f2 = fArray2[n6 - 1] - fArray2[n5];
            float f7 = f4 * this.field_3f1c586_Dne[n8];
            float f8 = f * this.field_3f1c586_Dne[n8++];
            float f9 = f4 * this.field_3f1c586_Dne[n8];
            float f10 = f * this.field_3f1c586_Dne[n8++];
            fArray[n16++] = (f3 + f9 + f8) * 0.5f;
            fArray[n7--] = (-f2 + f10 - f7) * 0.5f;
            fArray[n16++] = (f2 + f10 - f7) * 0.5f;
            fArray[n7--] = (f3 - f9 - f8) * 0.5f;
        }
        return fArray;
    }

    synchronized void method_4d7ddc8f_FWm(float[] fArray, float[] fArray2) {
        int n;
        if (this.field_4039e07_FWm.length < this.field_2092ae_Dne / 2) {
            this.field_4039e07_FWm = new float[this.field_2092ae_Dne / 2];
        }
        if (this.field_59d86b9_bzF.length < this.field_2092ae_Dne / 2) {
            this.field_59d86b9_bzF = new float[this.field_2092ae_Dne / 2];
        }
        float[] fArray3 = this.field_4039e07_FWm;
        float[] fArray4 = this.field_59d86b9_bzF;
        int n2 = this.field_2092ae_Dne >>> 1;
        int n3 = this.field_2092ae_Dne >>> 2;
        int n4 = this.field_2092ae_Dne >>> 3;
        int n5 = 1;
        int n6 = 0;
        int n7 = n2;
        for (n = 0; n < n4; ++n) {
            fArray3[n6++] = -fArray[n5 + 2] * this.field_3f1c586_Dne[(n7 -= 2) + 1] - fArray[n5] * this.field_3f1c586_Dne[n7];
            fArray3[n6++] = fArray[n5] * this.field_3f1c586_Dne[n7 + 1] - fArray[n5 + 2] * this.field_3f1c586_Dne[n7];
            n5 += 4;
        }
        n5 = n2 - 4;
        for (n = 0; n < n4; ++n) {
            fArray3[n6++] = fArray[n5] * this.field_3f1c586_Dne[(n7 -= 2) + 1] + fArray[n5 + 2] * this.field_3f1c586_Dne[n7];
            fArray3[n6++] = fArray[n5] * this.field_3f1c586_Dne[n7] - fArray[n5 + 2] * this.field_3f1c586_Dne[n7 + 1];
            n5 -= 4;
        }
        float[] fArray5 = this.method_a4ada9b1_Dne(fArray3, fArray4, this.field_2092ae_Dne, n2, n3, n4);
        n6 = 0;
        n7 = n2;
        n = n3;
        int n8 = n - 1;
        int n9 = n3 + n2;
        int n10 = n9 - 1;
        for (int i = 0; i < n3; ++i) {
            float f = fArray5[n6] * this.field_3f1c586_Dne[n7 + 1] - fArray5[n6 + 1] * this.field_3f1c586_Dne[n7];
            float f2 = -(fArray5[n6] * this.field_3f1c586_Dne[n7] + fArray5[n6 + 1] * this.field_3f1c586_Dne[n7 + 1]);
            fArray2[n] = -f;
            fArray2[n8] = f;
            fArray2[n9] = f2;
            fArray2[n10] = f2;
            ++n;
            --n8;
            ++n9;
            --n10;
            n6 += 2;
            n7 += 2;
        }
    }

    void method_78078c70_Dne(float[] fArray, float[] fArray2) {
    }

    Sti() {
        this.field_59d86b9_bzF = new float[1024];
    }

    void method_ce7f5da9_Dne(int n) {
        int n2;
        this.field_3f1c589_Dne = new int[n / 4];
        this.field_3f1c586_Dne = new float[n + n / 4];
        this.field_21260d_FWm = (int)Math.rint(Math.log(n) / Math.log(2.0));
        this.field_2092ae_Dne = n;
        int n3 = 0;
        int n4 = 1;
        int n5 = n3 + n / 2;
        int n6 = n5 + 1;
        int n7 = n5 + n / 2;
        int n8 = n7 + 1;
        for (n2 = 0; n2 < n / 4; ++n2) {
            this.field_3f1c586_Dne[n3 + n2 * 2] = (float)Math.cos(Math.PI / (double)n * (double)(4 * n2));
            this.field_3f1c586_Dne[n4 + n2 * 2] = (float)(-Math.sin(Math.PI / (double)n * (double)(4 * n2)));
            this.field_3f1c586_Dne[n5 + n2 * 2] = (float)Math.cos(Math.PI / (double)(2 * n) * (double)(2 * n2 + 1));
            this.field_3f1c586_Dne[n6 + n2 * 2] = (float)Math.sin(Math.PI / (double)(2 * n) * (double)(2 * n2 + 1));
        }
        for (n2 = 0; n2 < n / 8; ++n2) {
            this.field_3f1c586_Dne[n7 + n2 * 2] = (float)Math.cos(Math.PI / (double)n * (double)(4 * n2 + 2));
            this.field_3f1c586_Dne[n8 + n2 * 2] = (float)(-Math.sin(Math.PI / (double)n * (double)(4 * n2 + 2)));
        }
        n2 = (1 << this.field_21260d_FWm - 1) - 1;
        int n9 = 1 << this.field_21260d_FWm - 2;
        for (int i = 0; i < n / 8; ++i) {
            int n10 = 0;
            int n11 = 0;
            while (n9 >>> n11 != 0) {
                if ((n9 >>> n11 & i) != 0) {
                    n10 |= 1 << n11;
                }
                ++n11;
            }
            this.field_3f1c589_Dne[i * 2] = ~n10 & n2;
            this.field_3f1c589_Dne[i * 2 + 1] = n10;
        }
        this.field_2092ab_Dne = 4.0f / (float)n;
    }

    void method_7a46289a_Dne() {
    }
}

