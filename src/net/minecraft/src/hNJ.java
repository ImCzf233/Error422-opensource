package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
final class hNJ
extends MbX {
    @Override
    public Object method_1b7587fd_FWm(Object object) {
        return this.method_1ed157ff_Dne((LIC)object);
    }

    @Override
    public boolean method_41cee5fa_Dne(Object object) {
        return this.method_78aad6c5_Dne((LIC)object);
    }

    public boolean method_78aad6c5_Dne(LIC lIC) {
        return BAS.field_5e4e3fbf_Qnq == lIC.method_22fe5f57_Dne();
    }

    public String method_1ed157ff_Dne(LIC lIC) {
        return lIC.method_eecad346_Dne();
    }

    hNJ() {
    }

    @Override
    public String method_eecad346_Dne() {
        return "A short form nullable number";
    }

    public String toString() {
        return "a value that is a number";
    }
}

