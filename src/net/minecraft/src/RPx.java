package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class RPx {
    public int field_21260d_FWm;
    public int field_2092ae_Dne;
    final vSL field_37cb6fd_Dne;
    public long field_2092af_Dne;
    public OdI[] field_83618953_Dne;
    public float[] field_4039e07_FWm;
    public float[] field_3f1c586_Dne;

    public RPx(vSL vSL2, int n, int n2) {
        this.field_37cb6fd_Dne = vSL2;
        this.field_3f1c586_Dne = new float[256];
        this.field_4039e07_FWm = new float[256];
        this.field_83618953_Dne = new OdI[256];
        this.field_2092ae_Dne = n;
        this.field_21260d_FWm = n2;
        vSL.method_6b3c6619_Dne(vSL2).method_1851b0dd_FWm(this.field_3f1c586_Dne, n << 4, n2 << 4, 16, 16);
        vSL.method_6b3c6619_Dne(vSL2).method_451be95c_Dne(this.field_4039e07_FWm, n << 4, n2 << 4, 16, 16);
        vSL.method_6b3c6619_Dne(vSL2).method_c825dc8c_Dne(this.field_83618953_Dne, n << 4, n2 << 4, 16, 16, false);
    }

    public OdI method_90477c37_Dne(int n, int n2) {
        return this.field_83618953_Dne[n & 0xF | (n2 & 0xF) << 4];
    }
}

