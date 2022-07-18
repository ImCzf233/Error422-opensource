package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class lMw
extends CAZ {
    private KFd field_368fd23_Dne;
    private int field_28e7fd_Vxn;

    @Override
    public void method_7a46289a_Dne() {
        double d;
        KFd kFd;
        this.field_2d29ef_aFZ = this.field_2f0dd3_div;
        this.field_388da1_zGp = this.field_22c5fd_IjH;
        this.field_20b852_DyG = this.field_334487_mrb;
        if (this.field_368fd23_Dne == KFd.field_1411d34d_div) {
            this.field_388da3_zGp = 0.2f;
            this.field_20b854_DyG = 0.3f;
            this.field_2f0dd5_div = 1.0f;
        } else {
            this.field_388da3_zGp = 1.0f;
            this.field_20b854_DyG = 16.0f / (float)(40 - this.field_28e7fd_Vxn + 16);
            this.field_2f0dd5_div = 4.0f / (float)(40 - this.field_28e7fd_Vxn + 8);
        }
        this.field_2a9ad1_Zpi -= (double)this.field_2d29f1_aFZ;
        if (this.field_28e7fd_Vxn-- > 0) {
            this.field_291868_XHL *= 0.02;
            this.field_2a9ad1_Zpi *= 0.02;
            this.field_31b811_kGO *= 0.02;
            this.method_143f9e1c_bzF(113);
        } else {
            this.method_143f9e1c_bzF(112);
        }
        this.method_2be429a4_Dne(this.field_291868_XHL, this.field_2a9ad1_Zpi, this.field_31b811_kGO);
        this.field_291868_XHL *= (double)0.98f;
        this.field_2a9ad1_Zpi *= (double)0.98f;
        this.field_31b811_kGO *= (double)0.98f;
        if (this.field_267cf5_Qnq-- <= 0) {
            this.method_5d73f9d_g_();
        }
        if (this.field_2d2a05_aFZ) {
            if (this.field_368fd23_Dne == KFd.field_1411d34d_div) {
                this.method_5d73f9d_g_();
                this.field_36c4f18_Dne.method_8600ec24_Dne("splash", this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb, 0.0, 0.0, 0.0);
            } else {
                this.method_143f9e1c_bzF(114);
            }
            this.field_291868_XHL *= (double)0.7f;
            this.field_31b811_kGO *= (double)0.7f;
        }
        if (((kFd = this.field_36c4f18_Dne.method_d9802b31_Dne(geR.method_117d0718_FWm(this.field_2f0dd3_div), geR.method_117d0718_FWm(this.field_22c5fd_IjH), geR.method_117d0718_FWm(this.field_334487_mrb))).method_907a9d25_Qnq() || kFd.method_7a46289e_Dne()) && this.field_22c5fd_IjH < (d = (double)((float)(geR.method_117d0718_FWm(this.field_22c5fd_IjH) + 1) - byt.method_ce7f5d99_Dne(this.field_36c4f18_Dne.method_2dee76f_bzF(geR.method_117d0718_FWm(this.field_2f0dd3_div), geR.method_117d0718_FWm(this.field_22c5fd_IjH), geR.method_117d0718_FWm(this.field_334487_mrb)))))) {
            this.method_5d73f9d_g_();
        }
    }

    @Override
    public int method_ce7f5259_Dne(float f) {
        return this.field_368fd23_Dne == KFd.field_1411d34d_div ? super.method_ce7f5259_Dne(f) : 257;
    }

    @Override
    public float method_ce7f5256_Dne(float f) {
        return this.field_368fd23_Dne == KFd.field_1411d34d_div ? super.method_ce7f5256_Dne(f) : 1.0f;
    }

    public lMw(Qnq qnq, double d, double d2, double d3, KFd kFd) {
        super(qnq, d, d2, d3, 0.0, 0.0, 0.0);
        this.field_31b811_kGO = 0.0;
        this.field_2a9ad1_Zpi = 0.0;
        this.field_291868_XHL = 0.0;
        if (kFd == KFd.field_1411d34d_div) {
            this.field_388da3_zGp = 0.0f;
            this.field_20b854_DyG = 0.0f;
            this.field_2f0dd5_div = 1.0f;
        } else {
            this.field_388da3_zGp = 1.0f;
            this.field_20b854_DyG = 0.0f;
            this.field_2f0dd5_div = 0.0f;
        }
        this.method_143f9e1c_bzF(113);
        this.method_16b621a_Dne(0.01f, 0.01f);
        this.field_2d29f1_aFZ = 0.06f;
        this.field_368fd23_Dne = kFd;
        this.field_28e7fd_Vxn = 40;
        this.field_267cf5_Qnq = (int)(64.0 / (Math.random() * 0.8 + 0.2));
        this.field_31b811_kGO = 0.0;
        this.field_2a9ad1_Zpi = 0.0;
        this.field_291868_XHL = 0.0;
    }
}

