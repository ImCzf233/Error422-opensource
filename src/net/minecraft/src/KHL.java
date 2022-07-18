package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
class KHL {
    KHL field_36901bd_Dne;
    Object field_63dcf1d7_Dne;
    final long field_2092af_Dne;
    final int field_2092ae_Dne;

    public final String toString() {
        return this.method_7a46288e_Dne() + "=" + this.method_fc07f5d8_Dne();
    }

    KHL(int n, long l, Object object, KHL kHL) {
        this.field_63dcf1d7_Dne = object;
        this.field_36901bd_Dne = kHL;
        this.field_2092af_Dne = l;
        this.field_2092ae_Dne = n;
    }

    public final long method_7a46288e_Dne() {
        return this.field_2092af_Dne;
    }

    public final boolean equals(Object object) {
        Object object2;
        Object object3;
        Long l;
        if (!(object instanceof KHL)) {
            return false;
        }
        KHL kHL = (KHL)object;
        Long l2 = this.method_7a46288e_Dne();
        return (l2 == (l = Long.valueOf(kHL.method_7a46288e_Dne())) || l2 != null && l2.equals(l)) && ((object3 = this.method_fc07f5d8_Dne()) == (object2 = kHL.method_fc07f5d8_Dne()) || object3 != null && object3.equals(object2));
    }

    public final int hashCode() {
        return Tfm.method_ce7f615d_Dne(this.field_2092af_Dne);
    }

    public final Object method_fc07f5d8_Dne() {
        return this.field_63dcf1d7_Dne;
    }
}

