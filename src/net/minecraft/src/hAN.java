package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

final class hAN
extends MbX {
    @Override
    public boolean method_41cee5fa_Dne(Object object) {
        return this.method_78aad6c5_Dne((LIC)object);
    }

    public List method_1d0c8166_Dne(LIC lIC) {
        return lIC.method_adea226d_Dne();
    }

    @Override
    public String method_eecad346_Dne() {
        return "A short form array";
    }

    @Override
    public Object method_1b7587fd_FWm(Object object) {
        return this.method_1d0c8166_Dne((LIC)object);
    }

    hAN() {
    }

    public String toString() {
        return "an array";
    }

    public boolean method_78aad6c5_Dne(LIC lIC) {
        return BAS.field_201e9cd7_FWm == lIC.method_22fe5f57_Dne();
    }
}

