package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class CIU {
    private whE[] field_8373c6b3_Dne = new whE[1024];
    private int field_2092ae_Dne = 0;

    private void method_117d19ea_FWm(int n) {
        whE whE2 = this.field_8373c6b3_Dne[n];
        float f = whE2.field_2e5f18_bzF;
        while (true) {
            float f2;
            whE whE3;
            int n2 = 1 + (n << 1);
            int n3 = n2 + 1;
            if (n2 >= this.field_2092ae_Dne) break;
            whE whE4 = this.field_8373c6b3_Dne[n2];
            float f3 = whE4.field_2e5f18_bzF;
            if (n3 >= this.field_2092ae_Dne) {
                whE3 = null;
                f2 = Float.POSITIVE_INFINITY;
            } else {
                whE3 = this.field_8373c6b3_Dne[n3];
                f2 = whE3.field_2e5f18_bzF;
            }
            if (f3 < f2) {
                if (f3 >= f) break;
                this.field_8373c6b3_Dne[n] = whE4;
                whE4.field_267cf5_Qnq = n;
                n = n2;
                continue;
            }
            if (f2 >= f) break;
            this.field_8373c6b3_Dne[n] = whE3;
            whE3.field_267cf5_Qnq = n;
            n = n3;
        }
        this.field_8373c6b3_Dne[n] = whE2;
        whE2.field_267cf5_Qnq = n;
    }

    public boolean method_7a46289e_Dne() {
        return this.field_2092ae_Dne == 0;
    }

    public void method_7a46289a_Dne() {
        this.field_2092ae_Dne = 0;
    }

    public void method_b45ec74d_Dne(whE whE2, float f) {
        float f2 = whE2.field_2e5f18_bzF;
        whE2.field_2e5f18_bzF = f;
        if (f < f2) {
            this.method_ce7f5da9_Dne(whE2.field_267cf5_Qnq);
        } else {
            this.method_117d19ea_FWm(whE2.field_267cf5_Qnq);
        }
    }

    public whE method_231707b7_Dne() {
        whE whE2 = this.field_8373c6b3_Dne[0];
        this.field_8373c6b3_Dne[0] = this.field_8373c6b3_Dne[--this.field_2092ae_Dne];
        this.field_8373c6b3_Dne[this.field_2092ae_Dne] = null;
        if (this.field_2092ae_Dne > 0) {
            this.method_117d19ea_FWm(0);
        }
        whE2.field_267cf5_Qnq = -1;
        return whE2;
    }

    public whE method_b1fc1570_Dne(whE whE2) {
        if (whE2.field_267cf5_Qnq >= 0) {
            throw new IllegalStateException("OW KNOWS!");
        }
        if (this.field_2092ae_Dne == this.field_8373c6b3_Dne.length) {
            whE[] whEArray = new whE[this.field_2092ae_Dne << 1];
            System.arraycopy(this.field_8373c6b3_Dne, 0, whEArray, 0, this.field_2092ae_Dne);
            this.field_8373c6b3_Dne = whEArray;
        }
        this.field_8373c6b3_Dne[this.field_2092ae_Dne] = whE2;
        whE2.field_267cf5_Qnq = this.field_2092ae_Dne;
        this.method_ce7f5da9_Dne(this.field_2092ae_Dne++);
        return whE2;
    }

    private void method_ce7f5da9_Dne(int n) {
        whE whE2 = this.field_8373c6b3_Dne[n];
        float f = whE2.field_2e5f18_bzF;
        while (n > 0) {
            int n2 = n - 1 >> 1;
            whE whE3 = this.field_8373c6b3_Dne[n2];
            if (f >= whE3.field_2e5f18_bzF) break;
            this.field_8373c6b3_Dne[n] = whE3;
            whE3.field_267cf5_Qnq = n;
            n = n2;
        }
        this.field_8373c6b3_Dne[n] = whE2;
        whE2.field_267cf5_Qnq = n;
    }
}

