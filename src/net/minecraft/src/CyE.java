package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class CyE
extends CAZ {
    @Override
    public void method_7a46289a_Dne() {
        double d;
        KFd kFd;
        this.field_2d29ef_aFZ = this.field_2f0dd3_div;
        this.field_388da1_zGp = this.field_22c5fd_IjH;
        this.field_20b852_DyG = this.field_334487_mrb;
        this.field_2a9ad1_Zpi -= (double)this.field_2d29f1_aFZ;
        this.method_2be429a4_Dne(this.field_291868_XHL, this.field_2a9ad1_Zpi, this.field_31b811_kGO);
        this.field_291868_XHL *= (double)0.98f;
        this.field_2a9ad1_Zpi *= (double)0.98f;
        this.field_31b811_kGO *= (double)0.98f;
        if (this.field_267cf5_Qnq-- <= 0) {
            this.method_5d73f9d_g_();
        }
        if (this.field_2d2a05_aFZ) {
            if (Math.random() < 0.5) {
                this.method_5d73f9d_g_();
            }
            this.field_291868_XHL *= (double)0.7f;
            this.field_31b811_kGO *= (double)0.7f;
        }
        if (((kFd = this.field_36c4f18_Dne.method_d9802b31_Dne(geR.method_117d0718_FWm(this.field_2f0dd3_div), geR.method_117d0718_FWm(this.field_22c5fd_IjH), geR.method_117d0718_FWm(this.field_334487_mrb))).method_907a9d25_Qnq() || kFd.method_7a46289e_Dne()) && this.field_22c5fd_IjH < (d = (double)((float)(geR.method_117d0718_FWm(this.field_22c5fd_IjH) + 1) - byt.method_ce7f5d99_Dne(this.field_36c4f18_Dne.method_2dee76f_bzF(geR.method_117d0718_FWm(this.field_2f0dd3_div), geR.method_117d0718_FWm(this.field_22c5fd_IjH), geR.method_117d0718_FWm(this.field_334487_mrb)))))) {
            this.method_5d73f9d_g_();
        }
    }

    public CyE(Qnq qnq, double d, double d2, double d3) {
        super(qnq, d, d2, d3, 0.0, 0.0, 0.0);
        this.field_291868_XHL *= (double)0.3f;
        this.field_2a9ad1_Zpi = (float)Math.random() * 0.2f + 0.1f;
        this.field_31b811_kGO *= (double)0.3f;
        this.field_388da3_zGp = 1.0f;
        this.field_20b854_DyG = 1.0f;
        this.field_2f0dd5_div = 1.0f;
        this.method_143f9e1c_bzF(19 + this.field_7331eae7_Dne.nextInt(4));
        this.method_16b621a_Dne(0.01f, 0.01f);
        this.field_2d29f1_aFZ = 0.06f;
        this.field_267cf5_Qnq = (int)(8.0 / (Math.random() * 0.8 + 0.2));
    }
}

