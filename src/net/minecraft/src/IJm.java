package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class IJm {
    private int field_21260d_FWm;
    private int field_2e5f1b_bzF;
    private double field_2092a9_Dne;
    private int field_2092ae_Dne;
    private double field_212608_FWm;

    public int method_7a46288d_Dne() {
        return this.field_2092ae_Dne;
    }

    public double method_7a462888_Dne() {
        return this.field_2092a9_Dne;
    }

    public int method_7c6f602c_FWm() {
        return this.field_21260d_FWm;
    }

    public IJm(fZI fZI2, int n, int n2) {
        this.field_2092ae_Dne = n;
        this.field_21260d_FWm = n2;
        this.field_2e5f1b_bzF = 1;
        int n3 = fZI2.field_22c602_IjH;
        if (n3 == 0) {
            n3 = 1000;
        }
        while (this.field_2e5f1b_bzF < n3 && this.field_2092ae_Dne / (this.field_2e5f1b_bzF + 1) >= 320 && this.field_21260d_FWm / (this.field_2e5f1b_bzF + 1) >= 240) {
            ++this.field_2e5f1b_bzF;
        }
        this.field_2092a9_Dne = (double)this.field_2092ae_Dne / (double)this.field_2e5f1b_bzF;
        this.field_212608_FWm = (double)this.field_21260d_FWm / (double)this.field_2e5f1b_bzF;
        this.field_2092ae_Dne = geR.method_143f8b4a_bzF(this.field_2092a9_Dne);
        this.field_21260d_FWm = geR.method_143f8b4a_bzF(this.field_212608_FWm);
    }

    public double method_7c6f6027_FWm() {
        return this.field_212608_FWm;
    }

    public int method_ae128dba_bzF() {
        return this.field_2e5f1b_bzF;
    }
}

