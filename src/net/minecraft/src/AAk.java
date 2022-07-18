package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
class AAk {
    Object field_63dcf1d7_Dne;
    final int field_2092ae_Dne;
    AAk field_3645f81_Dne;
    final int field_21260d_FWm;

    public final String toString() {
        return this.method_7a46288d_Dne() + "=" + this.method_fc07f5d8_Dne();
    }

    public final int method_7a46288d_Dne() {
        return this.field_2092ae_Dne;
    }

    public final boolean equals(Object object) {
        Object object2;
        Object object3;
        Integer n;
        if (!(object instanceof AAk)) {
            return false;
        }
        AAk aAk = (AAk)object;
        Integer n2 = this.method_7a46288d_Dne();
        return (n2 == (n = Integer.valueOf(aAk.method_7a46288d_Dne())) || n2 != null && n2.equals(n)) && ((object3 = this.method_fc07f5d8_Dne()) == (object2 = aAk.method_fc07f5d8_Dne()) || object3 != null && object3.equals(object2));
    }

    public final int hashCode() {
        return ZGT.method_ce7f5d9c_Dne(this.field_2092ae_Dne);
    }

    public final Object method_fc07f5d8_Dne() {
        return this.field_63dcf1d7_Dne;
    }

    AAk(int n, int n2, Object object, AAk aAk) {
        this.field_63dcf1d7_Dne = object;
        this.field_3645f81_Dne = aAk;
        this.field_2092ae_Dne = n2;
        this.field_21260d_FWm = n;
    }
}

