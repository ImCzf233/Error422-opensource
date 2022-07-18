package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class Sxs {
    public final int field_2092ae_Dne;
    public final int field_21260d_FWm;

    public boolean equals(Object object) {
        Sxs sxs = (Sxs)object;
        return sxs.field_2092ae_Dne == this.field_2092ae_Dne && sxs.field_21260d_FWm == this.field_21260d_FWm;
    }

    public EyB method_9e6aa22c_Dne(int n) {
        return new EyB(this.method_7a46288d_Dne(), n, this.method_7c6f602c_FWm());
    }

    public static long method_16cca6e_Dne(int n, int n2) {
        return (long)n & 0xFFFFFFFFL | ((long)n2 & 0xFFFFFFFFL) << 32;
    }

    public String toString() {
        return "[" + this.field_2092ae_Dne + ", " + this.field_21260d_FWm + "]";
    }

    public Sxs(int n, int n2) {
        this.field_2092ae_Dne = n;
        this.field_21260d_FWm = n2;
    }

    public int method_7c6f602c_FWm() {
        return (this.field_21260d_FWm << 4) + 8;
    }

    public int hashCode() {
        long l = Sxs.method_16cca6e_Dne(this.field_2092ae_Dne, this.field_21260d_FWm);
        int n = (int)l;
        int n2 = (int)(l >> 32);
        return n ^ n2;
    }

    public int method_7a46288d_Dne() {
        return (this.field_2092ae_Dne << 4) + 8;
    }
}

