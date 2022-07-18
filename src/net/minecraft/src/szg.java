package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class szg
extends YAD {
    @Override
    public void method_2cdda2d0_Dne(FUH fUH, double d, double d2, double d3, float f, float f2) {
        this.method_d821c016_Dne((zTy)fUH, d, d2, d3, f, f2);
    }

    @Override
    protected int method_d6a747e_Dne(FUH fUH, int n, float f) {
        return this.method_45deccf8_Dne((zTy)fUH, n, f);
    }

    protected float method_c7dd51d8_Dne(zTy zTy2) {
        return 180.0f;
    }

    @Override
    public void method_31745cde_Dne(sMa sMa2, double d, double d2, double d3, float f, float f2) {
        this.method_d821c016_Dne((zTy)sMa2, d, d2, d3, f, f2);
    }

    protected int method_45deccf8_Dne(zTy zTy2, int n, float f) {
        return -1;
    }

    public szg() {
        super(new xLg(), 0.3f);
    }

    @Override
    protected float method_6f1922de_Dne(FUH fUH) {
        return this.method_c7dd51d8_Dne((zTy)fUH);
    }

    public void method_d821c016_Dne(zTy zTy2, double d, double d2, double d3, float f, float f2) {
        super.method_2cdda2d0_Dne(zTy2, d, d2, d3, f, f2);
    }
}

