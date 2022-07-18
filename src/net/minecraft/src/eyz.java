package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class eyz {
    private final int field_21260d_FWm;
    private final int field_267cf5_Qnq;
    private int field_388da6_zGp;
    private final int field_2e5f1b_bzF;
    private final int field_2092ae_Dne;
    private int field_2d29f4_aFZ;

    public int method_7c6f602c_FWm() {
        return this.field_2e5f1b_bzF;
    }

    public void method_ce7f5da9_Dne(int n) {
        if (n > 10) {
            n = 10;
        }
        this.field_2d29f4_aFZ = n;
    }

    public void method_117d19ea_FWm(int n) {
        this.field_388da6_zGp = n;
    }

    public int method_ae128dba_bzF() {
        return this.field_267cf5_Qnq;
    }

    public int method_7a46288d_Dne() {
        return this.field_21260d_FWm;
    }

    public eyz(int n, int n2, int n3, int n4) {
        this.field_2092ae_Dne = n;
        this.field_21260d_FWm = n2;
        this.field_2e5f1b_bzF = n3;
        this.field_267cf5_Qnq = n4;
    }

    public int method_907a9d14_Qnq() {
        return this.field_2d29f4_aFZ;
    }

    public int method_a98a0653_aFZ() {
        return this.field_388da6_zGp;
    }
}

