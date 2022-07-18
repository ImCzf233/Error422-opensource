package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class nnv
extends yBi {
    public nnv(long l, yBi yBi2) {
        super(l);
        this.field_37dd7cc_Dne = yBi2;
    }

    @Override
    public int[] method_d4dc17ca_Dne(int n, int n2, int n3, int n4) {
        int[] nArray = this.field_37dd7cc_Dne.method_d4dc17ca_Dne(n, n2, n3, n4);
        int[] nArray2 = Xyv.method_16c585b_Dne(n3 * n4);
        for (int i = 0; i < n4; ++i) {
            for (int j = 0; j < n3; ++j) {
                this.method_16d429a_Dne(j + n, i + n2);
                nArray2[j + i * n3] = nArray[j + i * n3] > 0 ? this.method_ce7f5d9c_Dne(2) + 2 : 0;
            }
        }
        return nArray2;
    }
}

