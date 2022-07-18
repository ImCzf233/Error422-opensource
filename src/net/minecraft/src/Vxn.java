package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class Vxn
implements Comparable {
    public int field_2092ae_Dne;
    private static long field_21260e_FWm = 0L;
    public long field_2092af_Dne;
    private long field_2e5f1c_bzF = field_21260e_FWm++;
    public int field_21260d_FWm;
    public int field_267cf5_Qnq;
    public int field_2e5f1b_bzF;
    public int field_2d29f4_aFZ;

    public int compareTo(Object object) {
        return this.method_8c65298e_Dne((Vxn)object);
    }

    public boolean equals(Object object) {
        if (!(object instanceof Vxn)) {
            return false;
        }
        Vxn vxn = (Vxn)object;
        return this.field_2092ae_Dne == vxn.field_2092ae_Dne && this.field_21260d_FWm == vxn.field_21260d_FWm && this.field_2e5f1b_bzF == vxn.field_2e5f1b_bzF && zKP.method_16cca7e_Dne(this.field_267cf5_Qnq, vxn.field_267cf5_Qnq);
    }

    public String toString() {
        return this.field_267cf5_Qnq + ": (" + this.field_2092ae_Dne + ", " + this.field_21260d_FWm + ", " + this.field_2e5f1b_bzF + "), " + this.field_2092af_Dne + ", " + this.field_2d29f4_aFZ + ", " + this.field_2e5f1c_bzF;
    }

    public Vxn method_d358994f_Dne(long l) {
        this.field_2092af_Dne = l;
        return this;
    }

    public Vxn(int n, int n2, int n3, int n4) {
        this.field_2092ae_Dne = n;
        this.field_21260d_FWm = n2;
        this.field_2e5f1b_bzF = n3;
        this.field_267cf5_Qnq = n4;
    }

    public int method_8c65298e_Dne(Vxn vxn) {
        return this.field_2092af_Dne < vxn.field_2092af_Dne ? -1 : (this.field_2092af_Dne > vxn.field_2092af_Dne ? 1 : (this.field_2d29f4_aFZ != vxn.field_2d29f4_aFZ ? this.field_2d29f4_aFZ - vxn.field_2d29f4_aFZ : (this.field_2e5f1c_bzF < vxn.field_2e5f1c_bzF ? -1 : (this.field_2e5f1c_bzF > vxn.field_2e5f1c_bzF ? 1 : 0))));
    }

    public void method_ce7f5da9_Dne(int n) {
        this.field_2d29f4_aFZ = n;
    }

    public int hashCode() {
        return (this.field_2092ae_Dne * 1024 * 1024 + this.field_2e5f1b_bzF * 1024 + this.field_21260d_FWm) * 256;
    }
}

