package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class gWM
extends CAZ {
    private zKP field_37e6aed_Dne;

    @Override
    public void method_179c0fdf_Dne(WAR wAR, float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = ((float)this.field_2092ae_Dne + this.field_21260a_FWm / 4.0f) / 16.0f;
        float f8 = f7 + 0.015609375f;
        float f9 = ((float)this.field_21260d_FWm + this.field_2e5f18_bzF / 4.0f) / 16.0f;
        float f10 = f9 + 0.015609375f;
        float f11 = 0.1f * this.field_267cf2_Qnq;
        if (this.field_375b13b_Dne != null) {
            f7 = this.field_375b13b_Dne.method_ce7f4ad4_Dne(this.field_21260a_FWm / 4.0f * 16.0f);
            f8 = this.field_375b13b_Dne.method_ce7f4ad4_Dne((this.field_21260a_FWm + 1.0f) / 4.0f * 16.0f);
            f9 = this.field_375b13b_Dne.method_117d0715_FWm(this.field_2e5f18_bzF / 4.0f * 16.0f);
            f10 = this.field_375b13b_Dne.method_117d0715_FWm((this.field_2e5f18_bzF + 1.0f) / 4.0f * 16.0f);
        }
        float f12 = (float)(this.field_2d29ef_aFZ + (this.field_2f0dd3_div - this.field_2d29ef_aFZ) * (double)f - field_2092a9_Dne);
        float f13 = (float)(this.field_388da1_zGp + (this.field_22c5fd_IjH - this.field_388da1_zGp) * (double)f - field_212608_FWm);
        float f14 = (float)(this.field_20b852_DyG + (this.field_334487_mrb - this.field_20b852_DyG) * (double)f - field_2e5f16_bzF);
        float f15 = 1.0f;
        wAR.method_2c0148e6_Dne(f15 * this.field_388da3_zGp, f15 * this.field_20b854_DyG, f15 * this.field_2f0dd5_div);
        wAR.method_c38c5864_Dne(f12 - f2 * f11 - f5 * f11, f13 - f3 * f11, f14 - f4 * f11 - f6 * f11, f7, f10);
        wAR.method_c38c5864_Dne(f12 - f2 * f11 + f5 * f11, f13 + f3 * f11, f14 - f4 * f11 + f6 * f11, f7, f9);
        wAR.method_c38c5864_Dne(f12 + f2 * f11 + f5 * f11, f13 + f3 * f11, f14 + f4 * f11 + f6 * f11, f8, f9);
        wAR.method_c38c5864_Dne(f12 + f2 * f11 - f5 * f11, f13 - f3 * f11, f14 + f4 * f11 - f6 * f11, f8, f10);
    }

    public gWM method_d98d229d_Dne(int n, int n2, int n3) {
        if (this.field_37e6aed_Dne == zKP.field_36ff555_Dne) {
            return this;
        }
        int n4 = this.field_37e6aed_Dne.method_fbabf7e2_Dne(this.field_36c4f18_Dne, n, n2, n3);
        this.field_388da3_zGp *= (float)(n4 >> 16 & 0xFF) / 255.0f;
        this.field_20b854_DyG *= (float)(n4 >> 8 & 0xFF) / 255.0f;
        this.field_2f0dd5_div *= (float)(n4 & 0xFF) / 255.0f;
        return this;
    }

    @Override
    public int method_7a46288d_Dne() {
        return 1;
    }

    public gWM method_9e79987d_Dne(int n) {
        if (this.field_37e6aed_Dne == zKP.field_36ff555_Dne) {
            return this;
        }
        int n2 = this.field_37e6aed_Dne.method_117d19dd_FWm(n);
        this.field_388da3_zGp *= (float)(n2 >> 16 & 0xFF) / 255.0f;
        this.field_20b854_DyG *= (float)(n2 >> 8 & 0xFF) / 255.0f;
        this.field_2f0dd5_div *= (float)(n2 & 0xFF) / 255.0f;
        return this;
    }

    public gWM(Qnq qnq, double d, double d2, double d3, double d4, double d5, double d6, zKP zKP2, int n, int n2, Snh snh) {
        super(qnq, d, d2, d3, d4, d5, d6);
        this.field_37e6aed_Dne = zKP2;
        this.method_3322016_Dne(snh, zKP2.method_9051f17a_Dne(0, n2));
        this.field_2d29f1_aFZ = zKP2.field_2e5f18_bzF;
        this.field_2f0dd5_div = 0.6f;
        this.field_20b854_DyG = 0.6f;
        this.field_388da3_zGp = 0.6f;
        this.field_267cf2_Qnq /= 2.0f;
    }
}

