package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class ihb
extends yBi {
    public ihb(long l, yBi yBi2) {
        super(l);
        this.field_37dd7cc_Dne = yBi2;
    }

    @Override
    public int[] method_d4dc17ca_Dne(int n, int n2, int n3, int n4) {
        int n5 = n - 1;
        int n6 = n2 - 1;
        int n7 = n3 + 2;
        int n8 = n4 + 2;
        int[] nArray = this.field_37dd7cc_Dne.method_d4dc17ca_Dne(n5, n6, n7, n8);
        int[] nArray2 = Xyv.method_16c585b_Dne(n3 * n4);
        for (int i = 0; i < n4; ++i) {
            for (int j = 0; j < n3; ++j) {
                int n9 = nArray[j + 0 + (i + 1) * n7];
                int n10 = nArray[j + 2 + (i + 1) * n7];
                int n11 = nArray[j + 1 + (i + 0) * n7];
                int n12 = nArray[j + 1 + (i + 2) * n7];
                int n13 = nArray[j + 1 + (i + 1) * n7];
                nArray2[j + i * n3] = n13 != 0 && n9 != 0 && n10 != 0 && n11 != 0 && n12 != 0 && n13 == n9 && n13 == n11 && n13 == n10 && n13 == n12 ? -1 : OdI.field_14141222_div.field_267cf5_Qnq;
            }
        }
        return nArray2;
    }
}

