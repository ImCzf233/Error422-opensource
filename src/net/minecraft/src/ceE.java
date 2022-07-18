package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class ceE {
    private int field_21260d_FWm;
    private int field_2e5f1b_bzF;
    private int field_2d29f4_aFZ;
    private int field_2092ae_Dne;
    private int field_388da6_zGp;
    private int field_267cf5_Qnq;

    public String toString() {
        return "TE(" + this.field_2092ae_Dne + "," + this.field_21260d_FWm + "," + this.field_2e5f1b_bzF + ")," + this.field_2d29f4_aFZ + "," + this.field_388da6_zGp + "," + this.field_267cf5_Qnq;
    }

    public int method_907a9d14_Qnq() {
        return this.field_2d29f4_aFZ;
    }

    public int method_a98a0653_aFZ() {
        return this.field_388da6_zGp;
    }

    public int method_7a46288d_Dne() {
        return this.field_2092ae_Dne;
    }

    public int method_d44b4585_zGp() {
        return this.field_267cf5_Qnq;
    }

    public ceE(int n, int n2, int n3, int n4, int n5, int n6) {
        this.field_2092ae_Dne = n;
        this.field_21260d_FWm = n2;
        this.field_2e5f1b_bzF = n3;
        this.field_2d29f4_aFZ = n5;
        this.field_388da6_zGp = n6;
        this.field_267cf5_Qnq = n4;
    }

    public int method_ae128dba_bzF() {
        return this.field_2e5f1b_bzF;
    }

    public int method_7c6f602c_FWm() {
        return this.field_21260d_FWm;
    }

    public boolean equals(Object object) {
        if (!(object instanceof ceE)) {
            return false;
        }
        ceE ceE2 = (ceE)object;
        return this.field_2092ae_Dne == ceE2.field_2092ae_Dne && this.field_21260d_FWm == ceE2.field_21260d_FWm && this.field_2e5f1b_bzF == ceE2.field_2e5f1b_bzF && this.field_2d29f4_aFZ == ceE2.field_2d29f4_aFZ && this.field_388da6_zGp == ceE2.field_388da6_zGp && this.field_267cf5_Qnq == ceE2.field_267cf5_Qnq;
    }
}

