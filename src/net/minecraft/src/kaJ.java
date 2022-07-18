package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class kaJ
extends RuntimeException {
    private final McM field_36a4ff5_Dne;

    public McM method_2303de54_Dne() {
        return this.field_36a4ff5_Dne;
    }

    public kaJ(McM mcM) {
        this.field_36a4ff5_Dne = mcM;
    }

    @Override
    public Throwable getCause() {
        return this.field_36a4ff5_Dne.method_d2942c7f_Dne();
    }

    @Override
    public String getMessage() {
        return this.field_36a4ff5_Dne.method_eecad346_Dne();
    }
}

