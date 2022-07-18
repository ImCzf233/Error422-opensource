package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class yQQ {
    public int field_388da6_zGp;
    public boolean field_2092bf_Dne = false;
    public final int field_2d29f4_aFZ;
    public final int field_21260d_FWm;
    private int field_20b857_DyG = 0;
    public final int field_267cf5_Qnq;
    public final int field_2092ae_Dne;
    public final int field_2e5f1b_bzF;

    public boolean method_16cca7e_Dne(int n, int n2) {
        int n3 = n - this.field_2092ae_Dne;
        int n4 = n2 - this.field_2e5f1b_bzF;
        return n3 * this.field_267cf5_Qnq + n4 * this.field_2d29f4_aFZ >= 0;
    }

    public int method_2c2cf7bc_Dne(int n, int n2, int n3) {
        int n4 = n - this.field_2092ae_Dne;
        int n5 = n2 - this.field_21260d_FWm;
        int n6 = n3 - this.field_2e5f1b_bzF;
        return n4 * n4 + n5 * n5 + n6 * n6;
    }

    public int method_907a9d14_Qnq() {
        return this.field_20b857_DyG;
    }

    public int method_7a46288d_Dne() {
        return this.field_2092ae_Dne + this.field_267cf5_Qnq;
    }

    public int method_a6aca7bd_FWm(int n, int n2, int n3) {
        int n4 = n - this.field_2092ae_Dne - this.field_267cf5_Qnq;
        int n5 = n2 - this.field_21260d_FWm;
        int n6 = n3 - this.field_2e5f1b_bzF - this.field_2d29f4_aFZ;
        return n4 * n4 + n5 * n5 + n6 * n6;
    }

    public int method_7c6f602c_FWm() {
        return this.field_21260d_FWm;
    }

    public yQQ(int n, int n2, int n3, int n4, int n5, int n6) {
        this.field_2092ae_Dne = n;
        this.field_21260d_FWm = n2;
        this.field_2e5f1b_bzF = n3;
        this.field_267cf5_Qnq = n4;
        this.field_2d29f4_aFZ = n5;
        this.field_388da6_zGp = n6;
    }

    public void method_7c6f6039_FWm() {
        ++this.field_20b857_DyG;
    }

    public void method_7a46289a_Dne() {
        this.field_20b857_DyG = 0;
    }

    public int method_ae128dba_bzF() {
        return this.field_2e5f1b_bzF + this.field_2d29f4_aFZ;
    }
}

