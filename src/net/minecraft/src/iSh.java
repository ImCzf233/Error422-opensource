package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class iSh
implements Comparable {
    public int field_21260d_FWm;
    public int field_2e5f1b_bzF;
    public int field_2092ae_Dne;

    public iSh() {
    }

    public boolean equals(Object object) {
        if (!(object instanceof iSh)) {
            return false;
        }
        iSh iSh2 = (iSh)object;
        return this.field_2092ae_Dne == iSh2.field_2092ae_Dne && this.field_21260d_FWm == iSh2.field_21260d_FWm && this.field_2e5f1b_bzF == iSh2.field_2e5f1b_bzF;
    }

    public int compareTo(Object object) {
        return this.method_aac51d7c_Dne((iSh)object);
    }

    public float method_aac51d79_Dne(iSh iSh2) {
        return this.method_2c2cf7b9_Dne(iSh2.field_2092ae_Dne, iSh2.field_21260d_FWm, iSh2.field_2e5f1b_bzF);
    }

    public float method_2c2cf7b9_Dne(int n, int n2, int n3) {
        int n4 = this.field_2092ae_Dne - n;
        int n5 = this.field_21260d_FWm - n2;
        int n6 = this.field_2e5f1b_bzF - n3;
        return n4 * n4 + n5 * n5 + n6 * n6;
    }

    public void method_2c2cf7c9_Dne(int n, int n2, int n3) {
        this.field_2092ae_Dne = n;
        this.field_21260d_FWm = n2;
        this.field_2e5f1b_bzF = n3;
    }

    public iSh(int n, int n2, int n3) {
        this.field_2092ae_Dne = n;
        this.field_21260d_FWm = n2;
        this.field_2e5f1b_bzF = n3;
    }

    public int hashCode() {
        return this.field_2092ae_Dne + this.field_2e5f1b_bzF << 8 + this.field_21260d_FWm << 16;
    }

    public int method_aac51d7c_Dne(iSh iSh2) {
        return this.field_21260d_FWm == iSh2.field_21260d_FWm ? (this.field_2e5f1b_bzF == iSh2.field_2e5f1b_bzF ? this.field_2092ae_Dne - iSh2.field_2092ae_Dne : this.field_2e5f1b_bzF - iSh2.field_2e5f1b_bzF) : this.field_21260d_FWm - iSh2.field_21260d_FWm;
    }

    public iSh(iSh iSh2) {
        this.field_2092ae_Dne = iSh2.field_2092ae_Dne;
        this.field_21260d_FWm = iSh2.field_21260d_FWm;
        this.field_2e5f1b_bzF = iSh2.field_2e5f1b_bzF;
    }
}

