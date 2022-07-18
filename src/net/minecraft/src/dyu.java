package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
class dyu {
    int field_2092ae_Dne;
    frg field_375e8b1_Dne = new frg();
    int field_21260d_FWm;

    void method_7a46289a_Dne() {
        this.field_375e8b1_Dne.method_7a46289a_Dne();
    }

    static float method_16b620a_Dne(float f, float f2) {
        return (float)Math.sqrt(f * f + f2 * f2);
    }

    void method_16cca7a_Dne(int n, int n2) {
        this.field_2092ae_Dne = n;
        this.field_21260d_FWm = n2;
        this.field_375e8b1_Dne.method_ce7f5da9_Dne(n * 2);
    }

    float method_78078c60_Dne(float[] fArray, float[] fArray2) {
        int n;
        int n2 = this.field_2092ae_Dne;
        float[] fArray3 = new float[n2 + n2];
        float f = (float)(0.5 / (double)n2);
        for (n = 0; n < n2; ++n) {
            fArray3[n * 2] = fArray[n] * f;
            fArray3[n * 2 + 1] = 0.0f;
        }
        fArray3[n2 * 2 - 1] = fArray[n2 - 1] * f;
        this.field_375e8b1_Dne.method_174ede5_Dne(fArray3);
        n = 0;
        int n3 = (n2 *= 2) / 2;
        while (n < n2 / 2) {
            float f2 = fArray3[n];
            fArray3[n++] = fArray3[n3];
            fArray3[n3++] = f2;
        }
        return dyu.method_946490c0_Dne(fArray3, fArray2, n2, this.field_21260d_FWm);
    }

    static float method_946490c0_Dne(float[] fArray, float[] fArray2, int n, int n2) {
        int n3;
        float f;
        float[] fArray3 = new float[n2 + 1];
        int n4 = n2 + 1;
        while (n4-- != 0) {
            f = 0.0f;
            for (n3 = n4; n3 < n; ++n3) {
                f += fArray[n3] * fArray[n3 - n4];
            }
            fArray3[n4] = f;
        }
        float f2 = fArray3[0];
        for (n3 = 0; n3 < n2; ++n3) {
            f = -fArray3[n3 + 1];
            if (f2 == 0.0f) {
                for (int i = 0; i < n2; ++i) {
                    fArray2[i] = 0.0f;
                }
                return 0.0f;
            }
            for (n4 = 0; n4 < n3; ++n4) {
                f -= fArray2[n4] * fArray3[n3 - n4];
            }
            fArray2[n3] = f /= f2;
            for (n4 = 0; n4 < n3 / 2; ++n4) {
                float f3 = fArray2[n4];
                int n5 = n4;
                fArray2[n5] = fArray2[n5] + f * fArray2[n3 - 1 - n4];
                int n6 = n3 - 1 - n4;
                fArray2[n6] = fArray2[n6] + f * f3;
            }
            if (n3 % 2 != 0) {
                int n7 = n4;
                fArray2[n7] = fArray2[n7] + fArray2[n4] * f;
            }
            f2 = (float)((double)f2 * (1.0 - (double)(f * f)));
        }
        return f2;
    }

    dyu() {
    }

    void method_88ea6950_Dne(float[] fArray, float[] fArray2, float f) {
        int n;
        for (n = 0; n < this.field_2092ae_Dne * 2; ++n) {
            fArray[n] = 0.0f;
        }
        if (f == 0.0f) {
            return;
        }
        for (n = 0; n < this.field_21260d_FWm; ++n) {
            fArray[n * 2 + 1] = fArray2[n] / (4.0f * f);
            fArray[n * 2 + 2] = -fArray2[n] / (4.0f * f);
        }
        this.field_375e8b1_Dne.method_174ede5_Dne(fArray);
        n = this.field_2092ae_Dne * 2;
        float f2 = (float)(1.0 / (double)f);
        fArray[0] = (float)(1.0 / (double)(fArray[0] * 2.0f + f2));
        for (int i = 1; i < this.field_2092ae_Dne; ++i) {
            float f3 = fArray[i] + fArray[n - i];
            float f4 = fArray[i] - fArray[n - i];
            float f5 = f3 + f2;
            fArray[i] = (float)(1.0 / (double)dyu.method_16b620a_Dne(f5, f4));
        }
    }
}

