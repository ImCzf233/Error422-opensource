package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class HkG
extends CAZ {
    private boolean field_2e8497_ceE;
    private float field_2092ab_Dne;
    private boolean field_2092bf_Dne;
    private float field_3393da_oIf;
    private final BMa field_364ffb6_Dne;
    private int field_28e7fd_Vxn = 160;
    private boolean field_21261e_FWm;
    private float field_36e4d7_vSL;

    @Override
    public float method_ce7f5256_Dne(float f) {
        return 1.0f;
    }

    public void method_117d59bb_FWm(boolean bl) {
        this.field_21261e_FWm = bl;
    }

    public void method_ce7f9d7a_Dne(boolean bl) {
        this.field_2092bf_Dne = bl;
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return false;
    }

    @Override
    public bSp method_230d324c_Dne() {
        return null;
    }

    @Override
    public int method_ce7f5259_Dne(float f) {
        return 0xF000F0;
    }

    @Override
    public void method_7a46289a_Dne() {
        this.field_2d29ef_aFZ = this.field_2f0dd3_div;
        this.field_388da1_zGp = this.field_22c5fd_IjH;
        this.field_20b852_DyG = this.field_334487_mrb;
        if (this.field_2e5f1b_bzF++ >= this.field_267cf5_Qnq) {
            this.method_5d73f9d_g_();
        }
        if (this.field_2e5f1b_bzF > this.field_267cf5_Qnq / 2) {
            this.method_aad40809_a_(1.0f - ((float)this.field_2e5f1b_bzF - (float)(this.field_267cf5_Qnq / 2)) / (float)this.field_267cf5_Qnq);
            if (this.field_2e8497_ceE) {
                this.field_388da3_zGp += (this.field_2092ab_Dne - this.field_388da3_zGp) * 0.2f;
                this.field_20b854_DyG += (this.field_3393da_oIf - this.field_20b854_DyG) * 0.2f;
                this.field_2f0dd5_div += (this.field_36e4d7_vSL - this.field_2f0dd5_div) * 0.2f;
            }
        }
        this.method_143f9e1c_bzF(this.field_28e7fd_Vxn + (7 - this.field_2e5f1b_bzF * 8 / this.field_267cf5_Qnq));
        this.field_2a9ad1_Zpi -= 0.004;
        this.method_2be429a4_Dne(this.field_291868_XHL, this.field_2a9ad1_Zpi, this.field_31b811_kGO);
        this.field_291868_XHL *= (double)0.91f;
        this.field_2a9ad1_Zpi *= (double)0.91f;
        this.field_31b811_kGO *= (double)0.91f;
        if (this.field_2d2a05_aFZ) {
            this.field_291868_XHL *= (double)0.7f;
            this.field_31b811_kGO *= (double)0.7f;
        }
        if (this.field_2092bf_Dne && this.field_2e5f1b_bzF < this.field_267cf5_Qnq / 2 && (this.field_2e5f1b_bzF + this.field_267cf5_Qnq) % 2 == 0) {
            HkG hkG = new HkG(this.field_36c4f18_Dne, this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb, 0.0, 0.0, 0.0, this.field_364ffb6_Dne);
            hkG.method_2c0148e6_Dne(this.field_388da3_zGp, this.field_20b854_DyG, this.field_2f0dd5_div);
            hkG.field_2e5f1b_bzF = hkG.field_267cf5_Qnq / 2;
            if (this.field_2e8497_ceE) {
                hkG.field_2e8497_ceE = true;
                hkG.field_2092ab_Dne = this.field_2092ab_Dne;
                hkG.field_3393da_oIf = this.field_3393da_oIf;
                hkG.field_36e4d7_vSL = this.field_36e4d7_vSL;
            }
            hkG.field_21261e_FWm = this.field_21261e_FWm;
            this.field_364ffb6_Dne.method_68e8f1ab_Dne(hkG);
        }
    }

    @Override
    public void method_179c0fdf_Dne(WAR wAR, float f, float f2, float f3, float f4, float f5, float f6) {
        if (!this.field_21261e_FWm || this.field_2e5f1b_bzF < this.field_267cf5_Qnq / 3 || (this.field_2e5f1b_bzF + this.field_267cf5_Qnq) / 3 % 2 == 0) {
            super.method_179c0fdf_Dne(wAR, f, f2, f3, f4, f5, f6);
        }
    }

    public void method_ce7f5da9_Dne(int n) {
        float f = (float)((n & 0xFF0000) >> 16) / 255.0f;
        float f2 = (float)((n & 0xFF00) >> 8) / 255.0f;
        float f3 = (float)((n & 0xFF) >> 0) / 255.0f;
        float f4 = 1.0f;
        this.method_2c0148e6_Dne(f * f4, f2 * f4, f3 * f4);
    }

    public HkG(Qnq qnq, double d, double d2, double d3, double d4, double d5, double d6, BMa bMa) {
        super(qnq, d, d2, d3);
        this.field_291868_XHL = d4;
        this.field_2a9ad1_Zpi = d5;
        this.field_31b811_kGO = d6;
        this.field_364ffb6_Dne = bMa;
        this.field_267cf2_Qnq *= 0.75f;
        this.field_267cf5_Qnq = 48 + this.field_7331eae7_Dne.nextInt(12);
        this.field_31b827_kGO = false;
    }

    public void method_117d19ea_FWm(int n) {
        this.field_2092ab_Dne = (float)((n & 0xFF0000) >> 16) / 255.0f;
        this.field_3393da_oIf = (float)((n & 0xFF00) >> 8) / 255.0f;
        this.field_36e4d7_vSL = (float)((n & 0xFF) >> 0) / 255.0f;
        this.field_2e8497_ceE = true;
    }
}

