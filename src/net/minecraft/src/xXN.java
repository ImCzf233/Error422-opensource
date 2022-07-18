package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class xXN {
    private final int field_2092ae_Dne;
    public final byte[] field_3f1c582_Dne;
    private final int field_21260d_FWm;

    public int method_2c2cf7bc_Dne(int n, int n2, int n3) {
        int n4 = n << this.field_21260d_FWm | n3 << this.field_2092ae_Dne | n2;
        int n5 = n4 >> 1;
        int n6 = n4 & 1;
        return n6 == 0 ? this.field_3f1c582_Dne[n5] & 0xF : this.field_3f1c582_Dne[n5] >> 4 & 0xF;
    }

    public xXN(byte[] byArray, int n) {
        this.field_3f1c582_Dne = byArray;
        this.field_2092ae_Dne = n;
        this.field_21260d_FWm = n + 4;
    }
}

