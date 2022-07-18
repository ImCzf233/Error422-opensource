package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class Rtm
extends CAZ {
    private int field_2e8486_ceE = 8;
    private int field_28e7fd_Vxn = 0;

    public Rtm(Qnq qnq, double d, double d2, double d3, double d4, double d5, double d6) {
        super(qnq, d, d2, d3, 0.0, 0.0, 0.0);
    }

    @Override
    public void method_179c0fdf_Dne(WAR wAR, float f, float f2, float f3, float f4, float f5, float f6) {
    }

    @Override
    public int method_7a46288d_Dne() {
        return 1;
    }

    @Override
    public void method_7a46289a_Dne() {
        for (int i = 0; i < 6; ++i) {
            double d = this.field_2f0dd3_div + (this.field_7331eae7_Dne.nextDouble() - this.field_7331eae7_Dne.nextDouble()) * 4.0;
            double d2 = this.field_22c5fd_IjH + (this.field_7331eae7_Dne.nextDouble() - this.field_7331eae7_Dne.nextDouble()) * 4.0;
            double d3 = this.field_334487_mrb + (this.field_7331eae7_Dne.nextDouble() - this.field_7331eae7_Dne.nextDouble()) * 4.0;
            this.field_36c4f18_Dne.method_8600ec24_Dne("largeexplode", d, d2, d3, (float)this.field_28e7fd_Vxn / (float)this.field_2e8486_ceE, 0.0, 0.0);
        }
        ++this.field_28e7fd_Vxn;
        if (this.field_28e7fd_Vxn == this.field_2e8486_ceE) {
            this.method_5d73f9d_g_();
        }
    }
}

