package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class yIw
extends yBi {
    @Override
    public int[] method_d4dc17ca_Dne(int n, int n2, int n3, int n4) {
        int n5;
        int n6 = n >> 1;
        int n7 = n2 >> 1;
        int n8 = (n3 >> 1) + 3;
        int n9 = (n4 >> 1) + 3;
        int[] nArray = this.field_37dd7cc_Dne.method_d4dc17ca_Dne(n6, n7, n8, n9);
        int[] nArray2 = Xyv.method_16c585b_Dne(n8 * 2 * n9 * 2);
        int n10 = n8 << 1;
        for (int i = 0; i < n9 - 1; ++i) {
            n5 = i << 1;
            int n11 = n5 * n10;
            int n12 = nArray[0 + (i + 0) * n8];
            int n13 = nArray[0 + (i + 1) * n8];
            for (int j = 0; j < n8 - 1; ++j) {
                this.method_16d429a_Dne(j + n6 << 1, i + n7 << 1);
                int n14 = nArray[j + 1 + (i + 0) * n8];
                int n15 = nArray[j + 1 + (i + 1) * n8];
                nArray2[n11] = n12;
                nArray2[n11++ + n10] = this.method_16cca6d_Dne(n12, n13);
                nArray2[n11] = this.method_16cca6d_Dne(n12, n14);
                nArray2[n11++ + n10] = this.method_5972744d_Dne(n12, n14, n13, n15);
                n12 = n14;
                n13 = n15;
            }
        }
        int[] nArray3 = Xyv.method_16c585b_Dne(n3 * n4);
        for (n5 = 0; n5 < n4; ++n5) {
            System.arraycopy(nArray2, (n5 + (n2 & 1)) * (n8 << 1) + (n & 1), nArray3, n5 * n3, n3);
        }
        return nArray3;
    }

    protected int method_5972744d_Dne(int n, int n2, int n3, int n4) {
        int n5 = this.method_ce7f5d9c_Dne(4);
        return n5 == 0 ? n : (n5 == 1 ? n2 : (n5 == 2 ? n3 : n4));
    }

    public yIw(long l, yBi yBi2) {
        super(l);
        this.field_37dd7cc_Dne = yBi2;
    }

    protected int method_16cca6d_Dne(int n, int n2) {
        return this.method_ce7f5d9c_Dne(2) == 0 ? n : n2;
    }
}

