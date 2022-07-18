package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
final class ujK
extends MbX {
    public Boolean method_c7ee19fe_Dne(LIC lIC) {
        return BAS.field_7128553e_aFZ == lIC.method_22fe5f57_Dne();
    }

    ujK() {
    }

    public String toString() {
        return "a true or false";
    }

    @Override
    public Object method_1b7587fd_FWm(Object object) {
        return this.method_c7ee19fe_Dne((LIC)object);
    }

    public boolean method_78aad6c5_Dne(LIC lIC) {
        return BAS.field_7128553e_aFZ == lIC.method_22fe5f57_Dne() || BAS.field_f0968ff0_zGp == lIC.method_22fe5f57_Dne();
    }

    @Override
    public boolean method_41cee5fa_Dne(Object object) {
        return this.method_78aad6c5_Dne((LIC)object);
    }

    @Override
    public String method_eecad346_Dne() {
        return "A short form boolean";
    }
}

