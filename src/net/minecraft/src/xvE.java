package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class xvE
extends xVn {
    private int field_2092ae_Dne;
    private wsW[] field_8373f22c_Dne;

    public double[] method_514f0fe4_Dne(double[] dArray, int n, int n2, int n3, int n4, int n5, int n6, double d, double d2, double d3) {
        if (dArray == null) {
            dArray = new double[n4 * n5 * n6];
        } else {
            for (int i = 0; i < dArray.length; ++i) {
                dArray[i] = 0.0;
            }
        }
        double d4 = 1.0;
        for (int i = 0; i < this.field_2092ae_Dne; ++i) {
            double d5 = (double)n * d4 * d;
            double d6 = (double)n2 * d4 * d2;
            double d7 = (double)n3 * d4 * d3;
            long l = geR.method_ce7f4ad8_Dne(d5);
            long l2 = geR.method_ce7f4ad8_Dne(d7);
            d5 -= (double)l;
            d7 -= (double)l2;
            this.field_8373f22c_Dne[i].method_7cf08108_Dne(dArray, d5 += (double)(l %= 0x1000000L), d6, d7 += (double)(l2 %= 0x1000000L), n4, n5, n6, d * d4, d2 * d4, d3 * d4, d4);
            d4 /= 2.0;
        }
        return dArray;
    }

    public double[] method_4e1e5c44_Dne(double[] dArray, int n, int n2, int n3, int n4, double d, double d2, double d3) {
        return this.method_514f0fe4_Dne(dArray, n, 10, n2, n3, 1, n4, d, 1.0, d2);
    }

    public xvE(Random random, int n) {
        this.field_2092ae_Dne = n;
        this.field_8373f22c_Dne = new wsW[n];
        for (int i = 0; i < n; ++i) {
            this.field_8373f22c_Dne[i] = new wsW(random);
        }
    }
}

