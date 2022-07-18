package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

final class mdF
implements Comparator {
    mdF() {
    }

    public int method_b0d1dc0d_Dne(OHz oHz, OHz oHz2) {
        return oHz.method_7a46288d_Dne() > oHz2.method_7a46288d_Dne() ? 1 : (oHz.method_7a46288d_Dne() < oHz2.method_7a46288d_Dne() ? -1 : 0);
    }

    public int compare(Object object, Object object2) {
        return this.method_b0d1dc0d_Dne((OHz)object, (OHz)object2);
    }
}

