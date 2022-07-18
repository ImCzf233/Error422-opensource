package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class fBi {
    private int field_267cf5_Qnq;
    private int field_21260d_FWm;
    private int field_2092ae_Dne;
    private int field_2e5f1b_bzF;

    public fBi method_129522fe_Dne(fBi fBi2) {
        int n = this.field_2092ae_Dne;
        int n2 = this.field_21260d_FWm;
        int n3 = this.field_2092ae_Dne + this.field_2e5f1b_bzF;
        int n4 = this.field_21260d_FWm + this.field_267cf5_Qnq;
        int n5 = fBi2.method_7a46288d_Dne();
        int n6 = fBi2.method_7c6f602c_FWm();
        int n7 = n5 + fBi2.method_ae128dba_bzF();
        int n8 = n6 + fBi2.method_907a9d14_Qnq();
        this.field_2092ae_Dne = Math.max(n, n5);
        this.field_21260d_FWm = Math.max(n2, n6);
        this.field_2e5f1b_bzF = Math.max(0, Math.min(n3, n7) - this.field_2092ae_Dne);
        this.field_267cf5_Qnq = Math.max(0, Math.min(n4, n8) - this.field_21260d_FWm);
        return this;
    }

    public fBi(int n, int n2, int n3, int n4) {
        this.field_2092ae_Dne = n;
        this.field_21260d_FWm = n2;
        this.field_2e5f1b_bzF = n3;
        this.field_267cf5_Qnq = n4;
    }

    public int method_7a46288d_Dne() {
        return this.field_2092ae_Dne;
    }

    public int method_ae128dba_bzF() {
        return this.field_2e5f1b_bzF;
    }

    public int method_7c6f602c_FWm() {
        return this.field_21260d_FWm;
    }

    public int method_907a9d14_Qnq() {
        return this.field_267cf5_Qnq;
    }
}

