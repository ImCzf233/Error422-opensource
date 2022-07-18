package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class JoZ
extends yBi {
    @Override
    public int[] method_d4dc17ca_Dne(int n, int n2, int n3, int n4) {
        int n5;
        int n6 = 2;
        int n7 = 1 << n6;
        int n8 = (n -= 2) >> n6;
        int n9 = (n2 -= 2) >> n6;
        int n10 = (n3 >> n6) + 3;
        int n11 = (n4 >> n6) + 3;
        int[] nArray = this.field_37dd7cc_Dne.method_d4dc17ca_Dne(n8, n9, n10, n11);
        int n12 = n10 << n6;
        int n13 = n11 << n6;
        int[] nArray2 = Xyv.method_16c585b_Dne(n12 * n13);
        for (int i = 0; i < n11 - 1; ++i) {
            n5 = nArray[0 + (i + 0) * n10];
            int n14 = nArray[0 + (i + 1) * n10];
            for (int j = 0; j < n10 - 1; ++j) {
                double d = (double)n7 * 0.9;
                this.method_16d429a_Dne(j + n8 << n6, i + n9 << n6);
                double d2 = ((double)this.method_ce7f5d9c_Dne(1024) / 1024.0 - 0.5) * d;
                double d3 = ((double)this.method_ce7f5d9c_Dne(1024) / 1024.0 - 0.5) * d;
                this.method_16d429a_Dne(j + n8 + 1 << n6, i + n9 << n6);
                double d4 = ((double)this.method_ce7f5d9c_Dne(1024) / 1024.0 - 0.5) * d + (double)n7;
                double d5 = ((double)this.method_ce7f5d9c_Dne(1024) / 1024.0 - 0.5) * d;
                this.method_16d429a_Dne(j + n8 << n6, i + n9 + 1 << n6);
                double d6 = ((double)this.method_ce7f5d9c_Dne(1024) / 1024.0 - 0.5) * d;
                double d7 = ((double)this.method_ce7f5d9c_Dne(1024) / 1024.0 - 0.5) * d + (double)n7;
                this.method_16d429a_Dne(j + n8 + 1 << n6, i + n9 + 1 << n6);
                double d8 = ((double)this.method_ce7f5d9c_Dne(1024) / 1024.0 - 0.5) * d + (double)n7;
                double d9 = ((double)this.method_ce7f5d9c_Dne(1024) / 1024.0 - 0.5) * d + (double)n7;
                int n15 = nArray[j + 1 + (i + 0) * n10];
                int n16 = nArray[j + 1 + (i + 1) * n10];
                for (int k = 0; k < n7; ++k) {
                    int n17 = ((i << n6) + k) * n12 + (j << n6);
                    for (int i2 = 0; i2 < n7; ++i2) {
                        double d10 = ((double)k - d3) * ((double)k - d3) + ((double)i2 - d2) * ((double)i2 - d2);
                        double d11 = ((double)k - d5) * ((double)k - d5) + ((double)i2 - d4) * ((double)i2 - d4);
                        double d12 = ((double)k - d7) * ((double)k - d7) + ((double)i2 - d6) * ((double)i2 - d6);
                        double d13 = ((double)k - d9) * ((double)k - d9) + ((double)i2 - d8) * ((double)i2 - d8);
                        nArray2[n17++] = d10 < d11 && d10 < d12 && d10 < d13 ? n5 : (d11 < d10 && d11 < d12 && d11 < d13 ? n15 : (d12 < d10 && d12 < d11 && d12 < d13 ? n14 : n16));
                    }
                }
                n5 = n15;
                n14 = n16;
            }
        }
        int[] nArray3 = Xyv.method_16c585b_Dne(n3 * n4);
        for (n5 = 0; n5 < n4; ++n5) {
            System.arraycopy(nArray2, (n5 + (n2 & n7 - 1)) * (n10 << n6) + (n & n7 - 1), nArray3, n5 * n3, n3);
        }
        return nArray3;
    }

    public JoZ(long l, yBi yBi2) {
        super(l);
        this.field_37dd7cc_Dne = yBi2;
    }
}

