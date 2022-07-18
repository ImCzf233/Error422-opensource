package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class whE {
    public final int field_21260d_FWm;
    whE field_37d7958_Dne;
    private final int field_2d29f4_aFZ;
    float field_2e5f18_bzF;
    int field_267cf5_Qnq = -1;
    float field_2092ab_Dne;
    public final int field_2e5f1b_bzF;
    float field_21260a_FWm;
    public final int field_2092ae_Dne;
    public boolean field_2092bf_Dne = false;

    public int hashCode() {
        return this.field_2d29f4_aFZ;
    }

    public boolean method_7a46289e_Dne() {
        return this.field_267cf5_Qnq >= 0;
    }

    public float method_9d14ae84_FWm(whE whE2) {
        float f = whE2.field_2092ae_Dne - this.field_2092ae_Dne;
        float f2 = whE2.field_21260d_FWm - this.field_21260d_FWm;
        float f3 = whE2.field_2e5f1b_bzF - this.field_2e5f1b_bzF;
        return f * f + f2 * f2 + f3 * f3;
    }

    public String toString() {
        return this.field_2092ae_Dne + ", " + this.field_21260d_FWm + ", " + this.field_2e5f1b_bzF;
    }

    public float method_c3c0fac3_Dne(whE whE2) {
        float f = whE2.field_2092ae_Dne - this.field_2092ae_Dne;
        float f2 = whE2.field_21260d_FWm - this.field_21260d_FWm;
        float f3 = whE2.field_2e5f1b_bzF - this.field_2e5f1b_bzF;
        return geR.method_143f92c9_bzF(f * f + f2 * f2 + f3 * f3);
    }

    public boolean equals(Object object) {
        if (!(object instanceof whE)) {
            return false;
        }
        whE whE2 = (whE)object;
        return this.field_2d29f4_aFZ == whE2.field_2d29f4_aFZ && this.field_2092ae_Dne == whE2.field_2092ae_Dne && this.field_21260d_FWm == whE2.field_21260d_FWm && this.field_2e5f1b_bzF == whE2.field_2e5f1b_bzF;
    }

    public static int method_2c2cf7bc_Dne(int n, int n2, int n3) {
        return n2 & 0xFF | (n & Short.MAX_VALUE) << 8 | (n3 & Short.MAX_VALUE) << 24 | (n < 0 ? Integer.MIN_VALUE : 0) | (n3 < 0 ? 32768 : 0);
    }

    public whE(int n, int n2, int n3) {
        this.field_2092ae_Dne = n;
        this.field_21260d_FWm = n2;
        this.field_2e5f1b_bzF = n3;
        this.field_2d29f4_aFZ = whE.method_2c2cf7bc_Dne(n, n2, n3);
    }
}

