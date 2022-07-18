package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class alg
extends sMa {
    public int field_2092ae_Dne;
    private int field_28e7fd_Vxn;
    private int field_267cf5_Qnq = 5;
    private int field_2e8486_ceE;
    private FiG field_3673728_Dne;
    public int field_2e5f1b_bzF;
    public int field_21260d_FWm = 0;

    @Override
    public boolean method_147b2066_Dne(zBn zBn2, int n) {
        if (this.method_7c861acb_EyB()) {
            return false;
        }
        this.method_c19d9a09_oIf();
        this.field_267cf5_Qnq -= n;
        if (this.field_267cf5_Qnq <= 0) {
            this.method_5d73f9d_g_();
        }
        return false;
    }

    public alg(Qnq qnq, double d, double d2, double d3, int n) {
        super(qnq);
        this.method_16b621a_Dne(0.5f, 0.5f);
        this.field_36b0a6_udO = this.field_367151_trS / 2.0f;
        this.method_2961957_bzF(d, d2, d3);
        this.field_334489_mrb = (float)(Math.random() * 360.0);
        this.field_291868_XHL = (float)(Math.random() * (double)0.2f - (double)0.1f) * 2.0f;
        this.field_2a9ad1_Zpi = (float)(Math.random() * 0.2) * 2.0f;
        this.field_31b811_kGO = (float)(Math.random() * (double)0.2f - (double)0.1f) * 2.0f;
        this.field_28e7fd_Vxn = n;
    }

    public int method_ae128dba_bzF() {
        return this.field_28e7fd_Vxn >= 2477 ? 10 : (this.field_28e7fd_Vxn >= 1237 ? 9 : (this.field_28e7fd_Vxn >= 617 ? 8 : (this.field_28e7fd_Vxn >= 307 ? 7 : (this.field_28e7fd_Vxn >= 149 ? 6 : (this.field_28e7fd_Vxn >= 73 ? 5 : (this.field_28e7fd_Vxn >= 37 ? 4 : (this.field_28e7fd_Vxn >= 17 ? 3 : (this.field_28e7fd_Vxn >= 7 ? 2 : (this.field_28e7fd_Vxn >= 3 ? 1 : 0)))))))));
    }

    @Override
    public void method_21db0c6_a_(FiG fiG) {
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ && this.field_2e5f1b_bzF == 0 && fiG.field_2a7663_ZgS == 0) {
            fiG.field_2a7663_ZgS = 2;
            this.method_fbd4aee4_Dne("random.orb", 0.1f, 0.5f * ((this.field_7331eae7_Dne.nextFloat() - this.field_7331eae7_Dne.nextFloat()) * 0.7f + 1.8f));
            fiG.method_b43d9ee3_Dne(this, 1);
            fiG.method_b2e02a33_ooe(this.field_28e7fd_Vxn);
            this.method_5d73f9d_g_();
        }
    }

    @Override
    public int method_ce7f5259_Dne(float f) {
        float f2 = 0.5f;
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        int n = super.method_ce7f5259_Dne(f);
        int n2 = n & 0xFF;
        int n3 = n >> 16 & 0xFF;
        if ((n2 += (int)(f2 * 15.0f * 16.0f)) > 240) {
            n2 = 240;
        }
        return n2 | n3 << 16;
    }

    @Override
    protected void method_7c6f6039_FWm() {
    }

    @Override
    public void method_7a46289a_Dne() {
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        super.method_7a46289a_Dne();
        if (this.field_2e5f1b_bzF > 0) {
            --this.field_2e5f1b_bzF;
        }
        this.field_2d29ef_aFZ = this.field_2f0dd3_div;
        this.field_388da1_zGp = this.field_22c5fd_IjH;
        this.field_20b852_DyG = this.field_334487_mrb;
        this.field_2a9ad1_Zpi -= (double)0.03f;
        if (this.field_36c4f18_Dne.method_d9802b31_Dne(geR.method_117d0718_FWm(this.field_2f0dd3_div), geR.method_117d0718_FWm(this.field_22c5fd_IjH), geR.method_117d0718_FWm(this.field_334487_mrb)) == KFd.field_5b96677_IjH) {
            this.field_2a9ad1_Zpi = 0.2f;
            this.field_291868_XHL = (this.field_7331eae7_Dne.nextFloat() - this.field_7331eae7_Dne.nextFloat()) * 0.2f;
            this.field_31b811_kGO = (this.field_7331eae7_Dne.nextFloat() - this.field_7331eae7_Dne.nextFloat()) * 0.2f;
            this.method_fbd4aee4_Dne("random.fizz", 0.4f, 2.0f + this.field_7331eae7_Dne.nextFloat() * 0.4f);
        }
        this.method_2be429a8_Dne(this.field_2f0dd3_div, (this.field_373a3ed_Dne.field_212608_FWm + this.field_373a3ed_Dne.field_2d29ef_aFZ) / 2.0, this.field_334487_mrb);
        double d6 = 8.0;
        if (this.field_2e8486_ceE < this.field_2092ae_Dne - 20 + this.field_2d29f4_aFZ % 100) {
            if (this.field_3673728_Dne == null || this.field_3673728_Dne.method_bb7dd80e_Dne(this) > d6 * d6) {
                this.field_3673728_Dne = this.field_36c4f18_Dne.method_3d2c70b_Dne(this, d6);
            }
            this.field_2e8486_ceE = this.field_2092ae_Dne;
        }
        if (this.field_3673728_Dne != null && (d5 = 1.0 - (d4 = Math.sqrt((d3 = (this.field_3673728_Dne.field_2f0dd3_div - this.field_2f0dd3_div) / d6) * d3 + (d2 = (this.field_3673728_Dne.field_22c5fd_IjH + (double)this.field_3673728_Dne.method_59ee189_c_() - this.field_22c5fd_IjH) / d6) * d2 + (d = (this.field_3673728_Dne.field_334487_mrb - this.field_334487_mrb) / d6) * d))) > 0.0) {
            d5 *= d5;
            this.field_291868_XHL += d3 / d4 * d5 * 0.1;
            this.field_2a9ad1_Zpi += d2 / d4 * d5 * 0.1;
            this.field_31b811_kGO += d / d4 * d5 * 0.1;
        }
        this.method_2be429a4_Dne(this.field_291868_XHL, this.field_2a9ad1_Zpi, this.field_31b811_kGO);
        float f = 0.98f;
        if (this.field_2d2a05_aFZ) {
            f = 0.58800006f;
            int n = this.field_36c4f18_Dne.method_2c2cf7bc_Dne(geR.method_117d0718_FWm(this.field_2f0dd3_div), geR.method_117d0718_FWm(this.field_373a3ed_Dne.field_212608_FWm) - 1, geR.method_117d0718_FWm(this.field_334487_mrb));
            if (n > 0) {
                f = zKP.field_8374b848_Dne[n].field_267cf2_Qnq * 0.98f;
            }
        }
        this.field_291868_XHL *= (double)f;
        this.field_2a9ad1_Zpi *= (double)0.98f;
        this.field_31b811_kGO *= (double)f;
        if (this.field_2d2a05_aFZ) {
            this.field_2a9ad1_Zpi *= (double)-0.9f;
        }
        ++this.field_2092ae_Dne;
        ++this.field_21260d_FWm;
        if (this.field_21260d_FWm >= 6000) {
            this.method_5d73f9d_g_();
        }
    }

    public alg(Qnq qnq) {
        super(qnq);
        this.method_16b621a_Dne(0.25f, 0.25f);
        this.field_36b0a6_udO = this.field_367151_trS / 2.0f;
    }

    public static int method_ce7f5d9c_Dne(int n) {
        return n >= 2477 ? 2477 : (n >= 1237 ? 1237 : (n >= 617 ? 617 : (n >= 307 ? 307 : (n >= 149 ? 149 : (n >= 73 ? 73 : (n >= 37 ? 37 : (n >= 17 ? 17 : (n >= 7 ? 7 : (n >= 3 ? 3 : 1)))))))));
    }

    public int method_7a46288d_Dne() {
        return this.field_28e7fd_Vxn;
    }

    @Override
    public void method_8d4fb917_Dne(WkD wkD) {
        wkD.method_5ab47529_Dne("Health", (byte)this.field_267cf5_Qnq);
        wkD.method_5ab47529_Dne("Age", (short)this.field_21260d_FWm);
        wkD.method_5ab47529_Dne("Value", (short)this.field_28e7fd_Vxn);
    }

    @Override
    protected boolean method_7c6f603d_FWm() {
        return false;
    }

    @Override
    public boolean method_d44b4596_zGp() {
        return this.field_36c4f18_Dne.method_ff46456e_Dne(this.field_373a3ed_Dne, KFd.field_1411d34d_div, this);
    }

    @Override
    protected void method_b51ddfb1_zGp(int n) {
        this.method_147b2066_Dne(zBn.field_37e4cc6_Dne, n);
    }

    @Override
    public void method_66a36cd8_FWm(WkD wkD) {
        this.field_267cf5_Qnq = wkD.method_8f501fe1_Dne("Health") & 0xFF;
        this.field_21260d_FWm = wkD.method_8f501fe1_Dne("Age");
        this.field_28e7fd_Vxn = wkD.method_8f501fe1_Dne("Value");
    }

    @Override
    public boolean method_ae128dcb_bzF() {
        return false;
    }
}

