package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class CLK {
    public int field_2092ae_Dne;
    public int field_267cf5_Qnq;
    public int field_21260d_FWm;
    public int field_388da6_zGp;
    public int field_2d29f4_aFZ;
    public int field_2e5f1b_bzF;

    public CLK(int n, int n2, int n3, int n4) {
        this.field_2092ae_Dne = n;
        this.field_2e5f1b_bzF = n2;
        this.field_267cf5_Qnq = n3;
        this.field_388da6_zGp = n4;
        this.field_21260d_FWm = 1;
        this.field_2d29f4_aFZ = 512;
    }

    public static CLK method_22fefc09_Dne() {
        return new CLK(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public String toString() {
        return "(" + this.field_2092ae_Dne + ", " + this.field_21260d_FWm + ", " + this.field_2e5f1b_bzF + "; " + this.field_267cf5_Qnq + ", " + this.field_2d29f4_aFZ + ", " + this.field_388da6_zGp + ")";
    }

    public static CLK method_286c569_Dne(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10) {
        switch (n10) {
            case 0: {
                return new CLK(n + n4, n2 + n5, n3 + n6, n + n7 - 1 + n4, n2 + n8 - 1 + n5, n3 + n9 - 1 + n6);
            }
            case 1: {
                return new CLK(n - n9 + 1 + n6, n2 + n5, n3 + n4, n + n6, n2 + n8 - 1 + n5, n3 + n7 - 1 + n4);
            }
            case 2: {
                return new CLK(n + n4, n2 + n5, n3 - n9 + 1 + n6, n + n7 - 1 + n4, n2 + n8 - 1 + n5, n3 + n6);
            }
            case 3: {
                return new CLK(n + n6, n2 + n5, n3 + n4, n + n9 - 1 + n6, n2 + n8 - 1 + n5, n3 + n7 - 1 + n4);
            }
        }
        return new CLK(n + n4, n2 + n5, n3 + n6, n + n7 - 1 + n4, n2 + n8 - 1 + n5, n3 + n9 - 1 + n6);
    }

    public boolean method_2c2cf7cd_Dne(int n, int n2, int n3) {
        return n >= this.field_2092ae_Dne && n <= this.field_267cf5_Qnq && n3 >= this.field_2e5f1b_bzF && n3 <= this.field_388da6_zGp && n2 >= this.field_21260d_FWm && n2 <= this.field_2d29f4_aFZ;
    }

    public int method_ae128dba_bzF() {
        return this.field_388da6_zGp - this.field_2e5f1b_bzF + 1;
    }

    public int method_7c6f602c_FWm() {
        return this.field_2d29f4_aFZ - this.field_21260d_FWm + 1;
    }

    public void method_2c2cf7c9_Dne(int n, int n2, int n3) {
        this.field_2092ae_Dne += n;
        this.field_21260d_FWm += n2;
        this.field_2e5f1b_bzF += n3;
        this.field_267cf5_Qnq += n;
        this.field_2d29f4_aFZ += n2;
        this.field_388da6_zGp += n3;
    }

    public int method_7a46288d_Dne() {
        return this.field_267cf5_Qnq - this.field_2092ae_Dne + 1;
    }

    public void method_697d22a5_Dne(CLK cLK) {
        this.field_2092ae_Dne = Math.min(this.field_2092ae_Dne, cLK.field_2092ae_Dne);
        this.field_21260d_FWm = Math.min(this.field_21260d_FWm, cLK.field_21260d_FWm);
        this.field_2e5f1b_bzF = Math.min(this.field_2e5f1b_bzF, cLK.field_2e5f1b_bzF);
        this.field_267cf5_Qnq = Math.max(this.field_267cf5_Qnq, cLK.field_267cf5_Qnq);
        this.field_2d29f4_aFZ = Math.max(this.field_2d29f4_aFZ, cLK.field_2d29f4_aFZ);
        this.field_388da6_zGp = Math.max(this.field_388da6_zGp, cLK.field_388da6_zGp);
    }

    public boolean method_5972745e_Dne(int n, int n2, int n3, int n4) {
        return this.field_267cf5_Qnq >= n && this.field_2092ae_Dne <= n3 && this.field_388da6_zGp >= n2 && this.field_2e5f1b_bzF <= n4;
    }

    public boolean method_697d22a9_Dne(CLK cLK) {
        return this.field_267cf5_Qnq >= cLK.field_2092ae_Dne && this.field_2092ae_Dne <= cLK.field_267cf5_Qnq && this.field_388da6_zGp >= cLK.field_2e5f1b_bzF && this.field_2e5f1b_bzF <= cLK.field_388da6_zGp && this.field_2d29f4_aFZ >= cLK.field_21260d_FWm && this.field_21260d_FWm <= cLK.field_2d29f4_aFZ;
    }

    public int method_a98a0653_aFZ() {
        return this.field_21260d_FWm + (this.field_2d29f4_aFZ - this.field_21260d_FWm + 1) / 2;
    }

    public int method_d44b4585_zGp() {
        return this.field_2e5f1b_bzF + (this.field_388da6_zGp - this.field_2e5f1b_bzF + 1) / 2;
    }

    public CLK(int n, int n2, int n3, int n4, int n5, int n6) {
        this.field_2092ae_Dne = n;
        this.field_21260d_FWm = n2;
        this.field_2e5f1b_bzF = n3;
        this.field_267cf5_Qnq = n4;
        this.field_2d29f4_aFZ = n5;
        this.field_388da6_zGp = n6;
    }

    public int method_907a9d14_Qnq() {
        return this.field_2092ae_Dne + (this.field_267cf5_Qnq - this.field_2092ae_Dne + 1) / 2;
    }

    public CLK(CLK cLK) {
        this.field_2092ae_Dne = cLK.field_2092ae_Dne;
        this.field_21260d_FWm = cLK.field_21260d_FWm;
        this.field_2e5f1b_bzF = cLK.field_2e5f1b_bzF;
        this.field_267cf5_Qnq = cLK.field_267cf5_Qnq;
        this.field_2d29f4_aFZ = cLK.field_2d29f4_aFZ;
        this.field_388da6_zGp = cLK.field_388da6_zGp;
    }

    public CLK() {
    }
}

