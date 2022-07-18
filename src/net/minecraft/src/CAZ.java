package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class CAZ
extends sMa {
    protected float field_21260a_FWm;
    public static double field_212608_FWm;
    protected gDn field_375b13b_Dne = null;
    public static double field_2e5f16_bzF;
    protected float field_388da3_zGp;
    protected int field_2092ae_Dne;
    protected float field_2d29f1_aFZ;
    protected float field_22c5ff_IjH = 1.0f;
    protected int field_2e5f1b_bzF = 0;
    protected float field_2e5f18_bzF;
    public static double field_2092a9_Dne;
    protected int field_267cf5_Qnq = 0;
    protected float field_2f0dd5_div;
    protected float field_267cf2_Qnq;
    protected int field_21260d_FWm;
    protected float field_20b854_DyG;

    public float method_590ca08_b_() {
        return this.field_388da3_zGp;
    }

    public void method_3322016_Dne(Snh snh, gDn gDn2) {
        if (this.method_7a46288d_Dne() == 1) {
            this.field_375b13b_Dne = gDn2;
        } else {
            if (this.method_7a46288d_Dne() != 2) {
                throw new RuntimeException("Invalid call to Particle.setTex, use coordinate methods");
            }
            this.field_375b13b_Dne = gDn2;
        }
    }

    @Override
    protected void method_7c6f6039_FWm() {
    }

    public CAZ method_d909ec1c_FWm(float f) {
        this.method_16b621a_Dne(0.2f * f, 0.2f * f);
        this.field_267cf2_Qnq *= f;
        return this;
    }

    @Override
    public boolean method_ae128dcb_bzF() {
        return false;
    }

    @Override
    protected boolean method_7c6f603d_FWm() {
        return false;
    }

    public int method_7a46288d_Dne() {
        return 0;
    }

    public CAZ(Qnq qnq, double d, double d2, double d3, double d4, double d5, double d6) {
        this(qnq, d, d2, d3);
        this.field_291868_XHL = d4 + (double)((float)(Math.random() * 2.0 - 1.0) * 0.4f);
        this.field_2a9ad1_Zpi = d5 + (double)((float)(Math.random() * 2.0 - 1.0) * 0.4f);
        this.field_31b811_kGO = d6 + (double)((float)(Math.random() * 2.0 - 1.0) * 0.4f);
        float f = (float)(Math.random() + Math.random() + 1.0) * 0.15f;
        float f2 = geR.method_ce7f4ad4_Dne(this.field_291868_XHL * this.field_291868_XHL + this.field_2a9ad1_Zpi * this.field_2a9ad1_Zpi + this.field_31b811_kGO * this.field_31b811_kGO);
        this.field_291868_XHL = this.field_291868_XHL / (double)f2 * (double)f * (double)0.4f;
        this.field_2a9ad1_Zpi = this.field_2a9ad1_Zpi / (double)f2 * (double)f * (double)0.4f + (double)0.1f;
        this.field_31b811_kGO = this.field_31b811_kGO / (double)f2 * (double)f * (double)0.4f;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ", Pos (" + this.field_2f0dd3_div + "," + this.field_22c5fd_IjH + "," + this.field_334487_mrb + "), RGBA (" + this.field_388da3_zGp + "," + this.field_20b854_DyG + "," + this.field_2f0dd5_div + "," + this.field_22c5ff_IjH + "), Age " + this.field_2e5f1b_bzF;
    }

    public void method_aad40809_a_(float f) {
        this.field_22c5ff_IjH = f;
    }

    protected CAZ(Qnq qnq, double d, double d2, double d3) {
        super(qnq);
        this.method_16b621a_Dne(0.2f, 0.2f);
        this.field_36b0a6_udO = this.field_367151_trS / 2.0f;
        this.method_2961957_bzF(d, d2, d3);
        this.field_36b0a4_udO = d;
        this.field_34225f_ooe = d2;
        this.field_36714f_trS = d3;
        this.field_2f0dd5_div = 1.0f;
        this.field_20b854_DyG = 1.0f;
        this.field_388da3_zGp = 1.0f;
        this.field_21260a_FWm = this.field_7331eae7_Dne.nextFloat() * 3.0f;
        this.field_2e5f18_bzF = this.field_7331eae7_Dne.nextFloat() * 3.0f;
        this.field_267cf2_Qnq = (this.field_7331eae7_Dne.nextFloat() * 0.5f + 0.5f) * 2.0f;
        this.field_267cf5_Qnq = (int)(4.0f / (this.field_7331eae7_Dne.nextFloat() * 0.9f + 0.1f));
        this.field_2e5f1b_bzF = 0;
    }

    @Override
    public void method_7a46289a_Dne() {
        this.field_2d29ef_aFZ = this.field_2f0dd3_div;
        this.field_388da1_zGp = this.field_22c5fd_IjH;
        this.field_20b852_DyG = this.field_334487_mrb;
        if (this.field_2e5f1b_bzF++ >= this.field_267cf5_Qnq) {
            this.method_5d73f9d_g_();
        }
        this.field_2a9ad1_Zpi -= 0.04 * (double)this.field_2d29f1_aFZ;
        this.method_2be429a4_Dne(this.field_291868_XHL, this.field_2a9ad1_Zpi, this.field_31b811_kGO);
        this.field_291868_XHL *= (double)0.98f;
        this.field_2a9ad1_Zpi *= (double)0.98f;
        this.field_31b811_kGO *= (double)0.98f;
        if (this.field_2d2a05_aFZ) {
            this.field_291868_XHL *= (double)0.7f;
            this.field_31b811_kGO *= (double)0.7f;
        }
    }

    @Override
    public void method_8d4fb917_Dne(WkD wkD) {
    }

    public void method_ae128dc7_bzF() {
        ++this.field_2092ae_Dne;
    }

    public float method_7c6f6029_FWm() {
        return this.field_20b854_DyG;
    }

    public void method_179c0fdf_Dne(WAR wAR, float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = (float)this.field_2092ae_Dne / 16.0f;
        float f8 = f7 + 0.0624375f;
        float f9 = (float)this.field_21260d_FWm / 16.0f;
        float f10 = f9 + 0.0624375f;
        float f11 = 0.1f * this.field_267cf2_Qnq;
        if (this.field_375b13b_Dne != null) {
            f7 = this.field_375b13b_Dne.method_7a46288a_Dne();
            f8 = this.field_375b13b_Dne.method_7c6f6029_FWm();
            f9 = this.field_375b13b_Dne.method_ae128db7_bzF();
            f10 = this.field_375b13b_Dne.method_907a9d11_Qnq();
        }
        float f12 = (float)(this.field_2d29ef_aFZ + (this.field_2f0dd3_div - this.field_2d29ef_aFZ) * (double)f - field_2092a9_Dne);
        float f13 = (float)(this.field_388da1_zGp + (this.field_22c5fd_IjH - this.field_388da1_zGp) * (double)f - field_212608_FWm);
        float f14 = (float)(this.field_20b852_DyG + (this.field_334487_mrb - this.field_20b852_DyG) * (double)f - field_2e5f16_bzF);
        float f15 = 1.0f;
        wAR.method_54283b9a_Dne(this.field_388da3_zGp * f15, this.field_20b854_DyG * f15, this.field_2f0dd5_div * f15, this.field_22c5ff_IjH);
        wAR.method_c38c5864_Dne(f12 - f2 * f11 - f5 * f11, f13 - f3 * f11, f14 - f4 * f11 - f6 * f11, f8, f10);
        wAR.method_c38c5864_Dne(f12 - f2 * f11 + f5 * f11, f13 + f3 * f11, f14 - f4 * f11 + f6 * f11, f8, f9);
        wAR.method_c38c5864_Dne(f12 + f2 * f11 + f5 * f11, f13 + f3 * f11, f14 + f4 * f11 + f6 * f11, f7, f9);
        wAR.method_c38c5864_Dne(f12 + f2 * f11 - f5 * f11, f13 - f3 * f11, f14 + f4 * f11 - f6 * f11, f7, f10);
    }

    public CAZ method_ffb6385b_Dne(float f) {
        this.field_291868_XHL *= (double)f;
        this.field_2a9ad1_Zpi = (this.field_2a9ad1_Zpi - (double)0.1f) * (double)f + (double)0.1f;
        this.field_31b811_kGO *= (double)f;
        return this;
    }

    public void method_143f9e1c_bzF(int n) {
        if (this.method_7a46288d_Dne() != 0) {
            throw new RuntimeException("Invalid call to Particle.setMiscTex");
        }
        this.field_2092ae_Dne = n % 16;
        this.field_21260d_FWm = n / 16;
    }

    public void method_2c0148e6_Dne(float f, float f2, float f3) {
        this.field_388da3_zGp = f;
        this.field_20b854_DyG = f2;
        this.field_2f0dd5_div = f3;
    }

    @Override
    public void method_66a36cd8_FWm(WkD wkD) {
    }

    public float method_ae128db7_bzF() {
        return this.field_2f0dd5_div;
    }
}

