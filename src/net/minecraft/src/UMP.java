package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class UMP
extends sMa {
    private boolean field_2092bf_Dne;
    private double field_212608_FWm;
    private double field_2092a9_Dne;
    private double field_2e5f16_bzF;
    private int field_21260d_FWm;
    public int field_2092ae_Dne = 0;

    @Override
    public void method_76912e1e_aFZ(double d, double d2, double d3) {
        this.field_291868_XHL = d;
        this.field_2a9ad1_Zpi = d2;
        this.field_31b811_kGO = d3;
        if (this.field_31b813_kGO == 0.0f && this.field_2a9ad3_Zpi == 0.0f) {
            float f = geR.method_ce7f4ad4_Dne(d * d + d3 * d3);
            this.field_2a9ad3_Zpi = this.field_334489_mrb = (float)(Math.atan2(d, d3) * 180.0 / Math.PI);
            this.field_31b813_kGO = this.field_29186a_XHL = (float)(Math.atan2(d2, f) * 180.0 / Math.PI);
        }
    }

    public UMP(Qnq qnq) {
        super(qnq);
        this.method_16b621a_Dne(0.25f, 0.25f);
    }

    @Override
    public boolean method_ce7f4ae8_Dne(double d) {
        double d2 = this.field_373a3ed_Dne.method_7a462888_Dne() * 4.0;
        return d < (d2 *= 64.0) * d2;
    }

    @Override
    public void method_8d4fb917_Dne(WkD wkD) {
    }

    @Override
    public void method_66a36cd8_FWm(WkD wkD) {
    }

    public UMP(Qnq qnq, double d, double d2, double d3) {
        super(qnq);
        this.field_21260d_FWm = 0;
        this.method_16b621a_Dne(0.25f, 0.25f);
        this.method_2961957_bzF(d, d2, d3);
        this.field_36b0a6_udO = 0.0f;
    }

    @Override
    protected void method_7c6f6039_FWm() {
    }

    @Override
    public float method_ce7f5256_Dne(float f) {
        return 1.0f;
    }

    @Override
    public int method_ce7f5259_Dne(float f) {
        return 0xF000F0;
    }

    @Override
    public void method_7a46289a_Dne() {
        this.field_36b0a4_udO = this.field_2f0dd3_div;
        this.field_34225f_ooe = this.field_22c5fd_IjH;
        this.field_36714f_trS = this.field_334487_mrb;
        super.method_7a46289a_Dne();
        this.field_2f0dd3_div += this.field_291868_XHL;
        this.field_22c5fd_IjH += this.field_2a9ad1_Zpi;
        this.field_334487_mrb += this.field_31b811_kGO;
        float f = geR.method_ce7f4ad4_Dne(this.field_291868_XHL * this.field_291868_XHL + this.field_31b811_kGO * this.field_31b811_kGO);
        this.field_334489_mrb = (float)(Math.atan2(this.field_291868_XHL, this.field_31b811_kGO) * 180.0 / Math.PI);
        this.field_29186a_XHL = (float)(Math.atan2(this.field_2a9ad1_Zpi, f) * 180.0 / Math.PI);
        while (this.field_29186a_XHL - this.field_31b813_kGO < -180.0f) {
            this.field_31b813_kGO -= 360.0f;
        }
        while (this.field_29186a_XHL - this.field_31b813_kGO >= 180.0f) {
            this.field_31b813_kGO += 360.0f;
        }
        while (this.field_334489_mrb - this.field_2a9ad3_Zpi < -180.0f) {
            this.field_2a9ad3_Zpi -= 360.0f;
        }
        while (this.field_334489_mrb - this.field_2a9ad3_Zpi >= 180.0f) {
            this.field_2a9ad3_Zpi += 360.0f;
        }
        this.field_29186a_XHL = this.field_31b813_kGO + (this.field_29186a_XHL - this.field_31b813_kGO) * 0.2f;
        this.field_334489_mrb = this.field_2a9ad3_Zpi + (this.field_334489_mrb - this.field_2a9ad3_Zpi) * 0.2f;
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ) {
            double d = this.field_2092a9_Dne - this.field_2f0dd3_div;
            double d2 = this.field_2e5f16_bzF - this.field_334487_mrb;
            float f2 = (float)Math.sqrt(d * d + d2 * d2);
            float f3 = (float)Math.atan2(d2, d);
            double d3 = (double)f + (double)(f2 - f) * 0.0025;
            if (f2 < 1.0f) {
                d3 *= 0.8;
                this.field_2a9ad1_Zpi *= 0.8;
            }
            this.field_291868_XHL = Math.cos(f3) * d3;
            this.field_31b811_kGO = Math.sin(f3) * d3;
            this.field_2a9ad1_Zpi = this.field_22c5fd_IjH < this.field_212608_FWm ? (this.field_2a9ad1_Zpi += (1.0 - this.field_2a9ad1_Zpi) * (double)0.015f) : (this.field_2a9ad1_Zpi += (-1.0 - this.field_2a9ad1_Zpi) * (double)0.015f);
        }
        float f4 = 0.25f;
        if (this.method_9feec6c6_Zpi()) {
            for (int i = 0; i < 4; ++i) {
                this.field_36c4f18_Dne.method_8600ec24_Dne("bubble", this.field_2f0dd3_div - this.field_291868_XHL * (double)f4, this.field_22c5fd_IjH - this.field_2a9ad1_Zpi * (double)f4, this.field_334487_mrb - this.field_31b811_kGO * (double)f4, this.field_291868_XHL, this.field_2a9ad1_Zpi, this.field_31b811_kGO);
            }
        } else {
            this.field_36c4f18_Dne.method_8600ec24_Dne("portal", this.field_2f0dd3_div - this.field_291868_XHL * (double)f4 + this.field_7331eae7_Dne.nextDouble() * 0.6 - 0.3, this.field_22c5fd_IjH - this.field_2a9ad1_Zpi * (double)f4 - 0.5, this.field_334487_mrb - this.field_31b811_kGO * (double)f4 + this.field_7331eae7_Dne.nextDouble() * 0.6 - 0.3, this.field_291868_XHL, this.field_2a9ad1_Zpi, this.field_31b811_kGO);
        }
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ) {
            this.method_2961957_bzF(this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb);
            ++this.field_21260d_FWm;
            if (this.field_21260d_FWm > 80 && !this.field_36c4f18_Dne.field_2d2a05_aFZ) {
                this.method_5d73f9d_g_();
                if (this.field_2092bf_Dne) {
                    this.field_36c4f18_Dne.method_94d18be5_FWm(new JiM(this.field_36c4f18_Dne, this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb, new NMq(dEr.field_1031d495_Woy)));
                } else {
                    this.field_36c4f18_Dne.method_57aed1c2_Qnq(2003, (int)Math.round(this.field_2f0dd3_div), (int)Math.round(this.field_22c5fd_IjH), (int)Math.round(this.field_334487_mrb), 0);
                }
            }
        }
    }

    public void method_2be66f7f_Dne(double d, int n, double d2) {
        double d3 = d - this.field_2f0dd3_div;
        double d4 = d2 - this.field_334487_mrb;
        float f = geR.method_ce7f4ad4_Dne(d3 * d3 + d4 * d4);
        if (f > 12.0f) {
            this.field_2092a9_Dne = this.field_2f0dd3_div + d3 / (double)f * 12.0;
            this.field_2e5f16_bzF = this.field_334487_mrb + d4 / (double)f * 12.0;
            this.field_212608_FWm = this.field_22c5fd_IjH + 8.0;
        } else {
            this.field_2092a9_Dne = d;
            this.field_212608_FWm = n;
            this.field_2e5f16_bzF = d2;
        }
        this.field_21260d_FWm = 0;
        this.field_2092bf_Dne = this.field_7331eae7_Dne.nextInt(5) > 0;
    }

    @Override
    public boolean method_ae128dcb_bzF() {
        return false;
    }

    @Override
    public float method_7a46288a_Dne() {
        return 0.0f;
    }
}

