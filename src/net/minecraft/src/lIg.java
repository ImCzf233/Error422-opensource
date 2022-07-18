package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public abstract class lIg
extends FUH {
    @Override
    public boolean method_b0a28148_div() {
        return false;
    }

    @Override
    protected void method_ce7f5266_Dne(float f) {
    }

    public lIg(Qnq qnq) {
        super(qnq);
    }

    @Override
    protected void method_16ac470_Dne(double d, boolean bl) {
    }

    @Override
    public void method_5c54d0e1_Qnq(float f, float f2) {
        if (this.method_9feec6c6_Zpi()) {
            this.method_a680f8e7_FWm(f, f2, 0.02f);
            this.method_2be429a4_Dne(this.field_291868_XHL, this.field_2a9ad1_Zpi, this.field_31b811_kGO);
            this.field_291868_XHL *= (double)0.8f;
            this.field_2a9ad1_Zpi *= (double)0.8f;
            this.field_31b811_kGO *= (double)0.8f;
        } else if (this.method_7ad38807_DyG()) {
            this.method_a680f8e7_FWm(f, f2, 0.02f);
            this.method_2be429a4_Dne(this.field_291868_XHL, this.field_2a9ad1_Zpi, this.field_31b811_kGO);
            this.field_291868_XHL *= 0.5;
            this.field_2a9ad1_Zpi *= 0.5;
            this.field_31b811_kGO *= 0.5;
        } else {
            float f3 = 0.91f;
            if (this.field_2d2a05_aFZ) {
                f3 = 0.54600006f;
                int n = this.field_36c4f18_Dne.method_2c2cf7bc_Dne(geR.method_117d0718_FWm(this.field_2f0dd3_div), geR.method_117d0718_FWm(this.field_373a3ed_Dne.field_212608_FWm) - 1, geR.method_117d0718_FWm(this.field_334487_mrb));
                if (n > 0) {
                    f3 = zKP.field_8374b848_Dne[n].field_267cf2_Qnq * 0.91f;
                }
            }
            float f4 = 0.16277136f / (f3 * f3 * f3);
            this.method_a680f8e7_FWm(f, f2, this.field_2d2a05_aFZ ? 0.1f * f4 : 0.02f);
            f3 = 0.91f;
            if (this.field_2d2a05_aFZ) {
                f3 = 0.54600006f;
                int n = this.field_36c4f18_Dne.method_2c2cf7bc_Dne(geR.method_117d0718_FWm(this.field_2f0dd3_div), geR.method_117d0718_FWm(this.field_373a3ed_Dne.field_212608_FWm) - 1, geR.method_117d0718_FWm(this.field_334487_mrb));
                if (n > 0) {
                    f3 = zKP.field_8374b848_Dne[n].field_267cf2_Qnq * 0.91f;
                }
            }
            this.method_2be429a4_Dne(this.field_291868_XHL, this.field_2a9ad1_Zpi, this.field_31b811_kGO);
            this.field_291868_XHL *= (double)f3;
            this.field_2a9ad1_Zpi *= (double)f3;
            this.field_31b811_kGO *= (double)f3;
        }
        this.field_30bcaf_haP = this.field_351225_qrB;
        double d = this.field_2f0dd3_div - this.field_2d29ef_aFZ;
        double d2 = this.field_334487_mrb - this.field_20b852_DyG;
        float f5 = geR.method_ce7f4ad4_Dne(d * d + d2 * d2) * 4.0f;
        if (f5 > 1.0f) {
            f5 = 1.0f;
        }
        this.field_351225_qrB += (f5 - this.field_351225_qrB) * 0.4f;
        this.field_23d93e_LVR += this.field_351225_qrB;
    }
}

