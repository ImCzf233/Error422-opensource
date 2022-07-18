package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from xhL
 */
public class xhl_1
extends YAD {
    public void method_a3dbc95d_Dne(GRq gRq, double d, double d2, double d3, float f, float f2) {
        super.method_2cdda2d0_Dne(gRq, d, d2, d3, f, f2);
    }

    @Override
    protected float method_740ba282_Dne(FUH fUH, float f) {
        return this.method_a615178f_Dne((GRq)fUH, f);
    }

    @Override
    public void method_31745cde_Dne(sMa sMa2, double d, double d2, double d3, float f, float f2) {
        this.method_a3dbc95d_Dne((GRq)sMa2, d, d2, d3, f, f2);
    }

    public xhl_1(Gor gor, float f) {
        super(gor, f);
    }

    @Override
    public void method_2cdda2d0_Dne(FUH fUH, double d, double d2, double d3, float f, float f2) {
        this.method_a3dbc95d_Dne((GRq)fUH, d, d2, d3, f, f2);
    }

    protected float method_a615178f_Dne(GRq gRq, float f) {
        float f2 = gRq.field_267cf2_Qnq + (gRq.field_2092ab_Dne - gRq.field_267cf2_Qnq) * f;
        float f3 = gRq.field_2e5f18_bzF + (gRq.field_21260a_FWm - gRq.field_2e5f18_bzF) * f;
        return (geR.method_ce7f5256_Dne(f2) + 1.0f) * f3;
    }
}

