package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;

final class ZHl
extends MbX {
    @Override
    public boolean method_41cee5fa_Dne(Object object) {
        return this.method_78aad6c5_Dne((LIC)object);
    }

    public String toString() {
        return "an object";
    }

    @Override
    public String method_eecad346_Dne() {
        return "A short form object";
    }

    ZHl() {
    }

    public boolean method_78aad6c5_Dne(LIC lIC) {
        return BAS.field_364d0f8_Dne == lIC.method_22fe5f57_Dne();
    }

    public Map method_a6198336_Dne(LIC lIC) {
        return lIC.method_d410254f_Dne();
    }

    @Override
    public Object method_1b7587fd_FWm(Object object) {
        return this.method_a6198336_Dne((LIC)object);
    }
}

