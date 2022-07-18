package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class hqP
extends yBi {
    @Override
    public int[] method_d4dc17ca_Dne(int n, int n2, int n3, int n4) {
        int[] nArray = Xyv.method_16c585b_Dne(n3 * n4);
        for (int i = 0; i < n4; ++i) {
            for (int j = 0; j < n3; ++j) {
                this.method_16d429a_Dne(n + j, n2 + i);
                nArray[j + i * n3] = this.method_ce7f5d9c_Dne(10) == 0 ? 1 : 0;
            }
        }
        if (n > -n3 && n <= 0 && n2 > -n4 && n2 <= 0) {
            nArray[-n + -n2 * n3] = 1;
        }
        return nArray;
    }

    public hqP(long l) {
        super(l);
    }
}

