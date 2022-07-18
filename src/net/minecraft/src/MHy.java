package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class MHy
extends YAD {
    public void method_bfbdd545_Dne(fNv fNv2, double d, double d2, double d3, float f, float f2) {
        super.method_2cdda2d0_Dne(fNv2, d, d2, d3, f, f2);
    }

    @Override
    protected int method_d6a747e_Dne(FUH fUH, int n, float f) {
        return this.method_e5c35e29_Dne((fNv)fUH, n, f);
    }

    protected int method_e5c35e29_Dne(fNv fNv2, int n, float f) {
        if (n == 0 && fNv2.method_86921671_LVR()) {
            this.method_8f501fe4_Dne("/mob/saddle.png");
            return 1;
        }
        return -1;
    }

    @Override
    public void method_31745cde_Dne(sMa sMa2, double d, double d2, double d3, float f, float f2) {
        this.method_bfbdd545_Dne((fNv)sMa2, d, d2, d3, f, f2);
    }

    @Override
    public void method_2cdda2d0_Dne(FUH fUH, double d, double d2, double d3, float f, float f2) {
        this.method_bfbdd545_Dne((fNv)fUH, d, d2, d3, f, f2);
    }

    public MHy(Gor gor, Gor gor2, float f) {
        super(gor, f);
        this.method_724f763d_Dne(gor2);
    }
}

