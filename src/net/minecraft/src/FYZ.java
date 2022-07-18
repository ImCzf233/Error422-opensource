package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class FYZ {
    private final int field_2092ae_Dne;
    private final int field_21260d_FWm;
    public final byte[] field_3f1c582_Dne;

    public FYZ(byte[] byArray, int n) {
        this.field_3f1c582_Dne = byArray;
        this.field_2092ae_Dne = n;
        this.field_21260d_FWm = n + 4;
    }

    public FYZ(int n, int n2) {
        this.field_3f1c582_Dne = new byte[n >> 1];
        this.field_2092ae_Dne = n2;
        this.field_21260d_FWm = n2 + 4;
    }

    public int method_2c2cf7bc_Dne(int n, int n2, int n3) {
        int n4 = n2 << this.field_21260d_FWm | n3 << this.field_2092ae_Dne | n;
        int n5 = n4 >> 1;
        int n6 = n4 & 1;
        return n6 == 0 ? this.field_3f1c582_Dne[n5] & 0xF : this.field_3f1c582_Dne[n5] >> 4 & 0xF;
    }

    public void method_5972745a_Dne(int n, int n2, int n3, int n4) {
        int n5 = n2 << this.field_21260d_FWm | n3 << this.field_2092ae_Dne | n;
        int n6 = n5 >> 1;
        int n7 = n5 & 1;
        this.field_3f1c582_Dne[n6] = n7 == 0 ? (byte)(this.field_3f1c582_Dne[n6] & 0xF0 | n4 & 0xF) : (byte)(this.field_3f1c582_Dne[n6] & 0xF | (n4 & 0xF) << 4);
    }
}

