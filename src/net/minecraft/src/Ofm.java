package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

final class Ofm
extends MbX {
    final int field_2092ae_Dne;

    Ofm(int n) {
        this.field_2092ae_Dne = n;
    }

    @Override
    public boolean method_41cee5fa_Dne(Object object) {
        return this.method_ea14418f_Dne((List)object);
    }

    public LIC method_5b493f96_Dne(List list) {
        return (LIC)list.get(this.field_2092ae_Dne);
    }

    public boolean method_ea14418f_Dne(List list) {
        return list.size() > this.field_2092ae_Dne;
    }

    public String toString() {
        return "an element at index [" + this.field_2092ae_Dne + "]";
    }

    @Override
    public String method_eecad346_Dne() {
        return Integer.toString(this.field_2092ae_Dne);
    }

    @Override
    public Object method_1b7587fd_FWm(Object object) {
        return this.method_5b493f96_Dne((List)object);
    }
}

