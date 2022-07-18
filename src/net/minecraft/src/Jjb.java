package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class Jjb {
    private int field_21260d_FWm = 0;
    private int field_267cf5_Qnq = 0;
    private int field_2e5f1b_bzF = 0;
    private int field_2092ae_Dne = 1;

    public int method_907a9d14_Qnq() {
        return this.field_267cf5_Qnq;
    }

    public String toString() {
        String string = Integer.toString(this.field_21260d_FWm);
        if (this.field_2092ae_Dne > 1) {
            string = this.field_2092ae_Dne + "x" + string;
        }
        if (this.field_2e5f1b_bzF > 0) {
            string = string + ":" + this.field_2e5f1b_bzF;
        }
        return string;
    }

    public Jjb(int n, int n2, int n3) {
        this(n, n2);
        this.field_2e5f1b_bzF = n3;
    }

    public int method_7a46288d_Dne() {
        return this.field_2092ae_Dne;
    }

    public Jjb(int n, int n2) {
        this.field_2092ae_Dne = n;
        this.field_21260d_FWm = n2;
    }

    public int method_7c6f602c_FWm() {
        return this.field_21260d_FWm;
    }

    public int method_ae128dba_bzF() {
        return this.field_2e5f1b_bzF;
    }

    public void method_ce7f5da9_Dne(int n) {
        this.field_267cf5_Qnq = n;
    }
}

