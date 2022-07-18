package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class JTe
extends CAZ {
    public JTe(Qnq qnq, double d, double d2, double d3, double d4, double d5, double d6) {
        super(qnq, d, d2, d3, d4, d5, d6);
        this.field_291868_XHL = d4 + (double)((float)(Math.random() * 2.0 - 1.0) * 0.05f);
        this.field_2a9ad1_Zpi = d5 + (double)((float)(Math.random() * 2.0 - 1.0) * 0.05f);
        this.field_31b811_kGO = d6 + (double)((float)(Math.random() * 2.0 - 1.0) * 0.05f);
        this.field_20b854_DyG = this.field_2f0dd5_div = this.field_7331eae7_Dne.nextFloat() * 0.3f + 0.7f;
        this.field_388da3_zGp = this.field_2f0dd5_div;
        this.field_267cf2_Qnq = this.field_7331eae7_Dne.nextFloat() * this.field_7331eae7_Dne.nextFloat() * 6.0f + 1.0f;
        this.field_267cf5_Qnq = (int)(16.0 / ((double)this.field_7331eae7_Dne.nextFloat() * 0.8 + 0.2)) + 2;
    }

    @Override
    public void method_7a46289a_Dne() {
        this.field_2d29ef_aFZ = this.field_2f0dd3_div;
        this.field_388da1_zGp = this.field_22c5fd_IjH;
        this.field_20b852_DyG = this.field_334487_mrb;
        if (this.field_2e5f1b_bzF++ >= this.field_267cf5_Qnq) {
            this.method_5d73f9d_g_();
        }
        this.method_143f9e1c_bzF(7 - this.field_2e5f1b_bzF * 8 / this.field_267cf5_Qnq);
        this.field_2a9ad1_Zpi += 0.004;
        this.method_2be429a4_Dne(this.field_291868_XHL, this.field_2a9ad1_Zpi, this.field_31b811_kGO);
        this.field_291868_XHL *= (double)0.9f;
        this.field_2a9ad1_Zpi *= (double)0.9f;
        this.field_31b811_kGO *= (double)0.9f;
        if (this.field_2d2a05_aFZ) {
            this.field_291868_XHL *= (double)0.7f;
            this.field_31b811_kGO *= (double)0.7f;
        }
    }
}

