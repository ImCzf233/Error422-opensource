package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public final class Gup
implements Comparable {
    public double field_2092a9_Dne;
    public String field_569fcf45_Dne;
    public double field_212608_FWm;

    public int method_7a46288d_Dne() {
        return (this.field_569fcf45_Dne.hashCode() & 0xAAAAAA) + 0x444444;
    }

    public int method_72a31a78_Dne(Gup gup) {
        return gup.field_2092a9_Dne < this.field_2092a9_Dne ? -1 : (gup.field_2092a9_Dne > this.field_2092a9_Dne ? 1 : gup.field_569fcf45_Dne.compareTo(this.field_569fcf45_Dne));
    }

    public int compareTo(Object object) {
        return this.method_72a31a78_Dne((Gup)object);
    }

    public Gup(String string, double d, double d2) {
        this.field_569fcf45_Dne = string;
        this.field_2092a9_Dne = d;
        this.field_212608_FWm = d2;
    }
}

