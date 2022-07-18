package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class zUL
extends CAZ {
    private int field_2e8486_ceE = 0;
    private String field_c480ca78_bzF;
    private int field_28e7fd_Vxn = 0;
    private sMa field_75c313d2_bzF;

    @Override
    public int method_7a46288d_Dne() {
        return 3;
    }

    @Override
    public void method_179c0fdf_Dne(WAR wAR, float f, float f2, float f3, float f4, float f5, float f6) {
    }

    public zUL(Qnq qnq, sMa sMa2, String string) {
        super(qnq, sMa2.field_2f0dd3_div, sMa2.field_373a3ed_Dne.field_212608_FWm + (double)(sMa2.field_367151_trS / 2.0f), sMa2.field_334487_mrb, sMa2.field_291868_XHL, sMa2.field_2a9ad1_Zpi, sMa2.field_31b811_kGO);
        this.field_75c313d2_bzF = sMa2;
        this.field_2e8486_ceE = 3;
        this.field_c480ca78_bzF = string;
        this.method_7a46289a_Dne();
    }

    @Override
    public void method_7a46289a_Dne() {
        for (int i = 0; i < 16; ++i) {
            double d;
            double d2;
            double d3 = this.field_7331eae7_Dne.nextFloat() * 2.0f - 1.0f;
            if (!(d3 * d3 + (d2 = (double)(this.field_7331eae7_Dne.nextFloat() * 2.0f - 1.0f)) * d2 + (d = (double)(this.field_7331eae7_Dne.nextFloat() * 2.0f - 1.0f)) * d <= 1.0)) continue;
            double d4 = this.field_75c313d2_bzF.field_2f0dd3_div + d3 * (double)this.field_75c313d2_bzF.field_342261_ooe / 4.0;
            double d5 = this.field_75c313d2_bzF.field_373a3ed_Dne.field_212608_FWm + (double)(this.field_75c313d2_bzF.field_367151_trS / 2.0f) + d2 * (double)this.field_75c313d2_bzF.field_367151_trS / 4.0;
            double d6 = this.field_75c313d2_bzF.field_334487_mrb + d * (double)this.field_75c313d2_bzF.field_342261_ooe / 4.0;
            this.field_36c4f18_Dne.method_8600ec24_Dne(this.field_c480ca78_bzF, d4, d5, d6, d3, d2 + 0.2, d);
        }
        ++this.field_28e7fd_Vxn;
        if (this.field_28e7fd_Vxn >= this.field_2e8486_ceE) {
            this.method_5d73f9d_g_();
        }
    }

    public zUL(Qnq qnq, sMa sMa2) {
        this(qnq, sMa2, "crit");
    }
}

