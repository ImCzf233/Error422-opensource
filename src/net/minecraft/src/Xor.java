package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class Xor
extends yBi {
    public Xor(long l, yBi yBi2) {
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
                int n9 = nArray[j + 1 + (i + 1) * n7];
                this.method_16d429a_Dne(j + n, i + n2);
                if (n9 == 0) {
                    nArray2[j + i * n3] = 0;
                    continue;
                }
                int n10 = this.method_ce7f5d9c_Dne(5);
                n10 = n10 == 0 ? OdI.field_a21b6d60_kGO.field_267cf5_Qnq : 1;
                nArray2[j + i * n3] = n10;
            }
        }
        return nArray2;
    }
}

