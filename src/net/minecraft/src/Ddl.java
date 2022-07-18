package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

class Ddl
implements Comparator {
    final aXt field_37342cf_Dne;

    public int method_19e07d2d_Dne(iQt iQt2, iQt iQt3) {
        return iQt2 instanceof NDp && iQt3 instanceof UgS ? 1 : (iQt3 instanceof NDp && iQt2 instanceof UgS ? -1 : (iQt3.method_7a46288d_Dne() < iQt2.method_7a46288d_Dne() ? -1 : (iQt3.method_7a46288d_Dne() > iQt2.method_7a46288d_Dne() ? 1 : 0)));
    }

    public int compare(Object object, Object object2) {
        return this.method_19e07d2d_Dne((iQt)object, (iQt)object2);
    }

    Ddl(aXt aXt2) {
        this.field_37342cf_Dne = aXt2;
    }
}

