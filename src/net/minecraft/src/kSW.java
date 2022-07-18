package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

class kSW
implements Comparator {
    final nzx_0 field_36aa7c0_Dne;

    kSW(nzx_0 nzx_02) {
        this.field_36aa7c0_Dne = nzx_02;
    }

    public int compare(Object object, Object object2) {
        return this.method_b15b43ad_Dne((Class)object, (Class)object2);
    }

    public int method_b15b43ad_Dne(Class clazz, Class clazz2) {
        String string = clazz.getPackage() == null ? "" : clazz.getPackage().getName();
        String string2 = clazz2.getPackage() == null ? "" : clazz2.getPackage().getName();
        return string.compareTo(string2);
    }
}

