package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class Xxe
extends DIk {
    public float field_228593_IYC = 0.0f;
    private float field_22c9a1_JLG = 0.0f;
    public float field_37e098_xXN = 0.0f;
    private float field_298de0_YHU = 0.0f;
    public float field_2e5f18_bzF = 0.0f;
    public float field_2d29f1_aFZ = 0.0f;
    private float field_1fcf1a_CZC = 0.0f;
    private float field_2fb646_exS = 0.0f;
    public float field_388da3_zGp = 0.0f;
    private float field_30e9da_iNQ = 0.0f;
    public float field_21260a_FWm = 0.0f;
    private float field_2435c2_LoG = 0.0f;
    public float field_267cf2_Qnq = 0.0f;
    public float field_2092ab_Dne = 0.0f;

    @Override
    public int method_7a46288d_Dne() {
        return 10;
    }

    public Xxe(Qnq qnq) {
        super(qnq);
        this.field_c480ca78_bzF = "/mob/squid.png";
        this.method_16b621a_Dne(0.95f, 0.95f);
        this.field_22c9a1_JLG = 1.0f / (this.field_7331eae7_Dne.nextFloat() + 1.0f) * 0.2f;
    }

    @Override
    public boolean method_af414cf1_cot() {
        return this.field_22c5fd_IjH > 45.0 && this.field_22c5fd_IjH < 63.0 && super.method_af414cf1_cot();
    }

    @Override
    public void method_5c54d0e1_Qnq(float f, float f2) {
        this.method_2be429a4_Dne(this.field_291868_XHL, this.field_2a9ad1_Zpi, this.field_31b811_kGO);
    }

    @Override
    protected String method_3c9d12fd_DyG() {
        return null;
    }

    @Override
    protected void method_17484c9_Dne(boolean bl, int n) {
        int n2 = this.field_7331eae7_Dne.nextInt(3 + n) + 1;
        for (int i = 0; i < n2; ++i) {
            this.method_2cda29ee_Dne(new NMq(dEr.field_5d50330c_edi, 1, 0), 0.0f);
        }
    }

    @Override
    protected String method_6a89a3dc_div() {
        return null;
    }

    @Override
    public void method_8288d6ee_IjH() {
        super.method_8288d6ee_IjH();
        this.field_21260a_FWm = this.field_2092ab_Dne;
        this.field_267cf2_Qnq = this.field_2e5f18_bzF;
        this.field_388da3_zGp = this.field_2d29f1_aFZ;
        this.field_228593_IYC = this.field_37e098_xXN;
        this.field_2d29f1_aFZ += this.field_22c9a1_JLG;
        if (this.field_2d29f1_aFZ > (float)Math.PI * 2) {
            this.field_2d29f1_aFZ -= (float)Math.PI * 2;
            if (this.field_7331eae7_Dne.nextInt(10) == 0) {
                this.field_22c9a1_JLG = 1.0f / (this.field_7331eae7_Dne.nextFloat() + 1.0f) * 0.2f;
            }
        }
        if (this.method_9feec6c6_Zpi()) {
            float f;
            if (this.field_2d29f1_aFZ < (float)Math.PI) {
                f = this.field_2d29f1_aFZ / (float)Math.PI;
                this.field_37e098_xXN = geR.method_ce7f5256_Dne(f * f * (float)Math.PI) * (float)Math.PI * 0.25f;
                if ((double)f > 0.75) {
                    this.field_298de0_YHU = 1.0f;
                    this.field_2fb646_exS = 1.0f;
                } else {
                    this.field_2fb646_exS *= 0.8f;
                }
            } else {
                this.field_37e098_xXN = 0.0f;
                this.field_298de0_YHU *= 0.9f;
                this.field_2fb646_exS *= 0.99f;
            }
            if (!this.field_36c4f18_Dne.field_2d2a05_aFZ) {
                this.field_291868_XHL = this.field_30e9da_iNQ * this.field_298de0_YHU;
                this.field_2a9ad1_Zpi = this.field_1fcf1a_CZC * this.field_298de0_YHU;
                this.field_31b811_kGO = this.field_2435c2_LoG * this.field_298de0_YHU;
            }
            f = geR.method_ce7f4ad4_Dne(this.field_291868_XHL * this.field_291868_XHL + this.field_31b811_kGO * this.field_31b811_kGO);
            this.field_22c5ff_IjH += (-((float)Math.atan2(this.field_291868_XHL, this.field_31b811_kGO)) * 180.0f / (float)Math.PI - this.field_22c5ff_IjH) * 0.1f;
            this.field_334489_mrb = this.field_22c5ff_IjH;
            this.field_2e5f18_bzF += (float)Math.PI * this.field_2fb646_exS * 1.5f;
            this.field_2092ab_Dne += (-((float)Math.atan2(f, this.field_2a9ad1_Zpi)) * 180.0f / (float)Math.PI - this.field_2092ab_Dne) * 0.1f;
        } else {
            this.field_37e098_xXN = geR.method_7ed96eaf_Qnq(geR.method_ce7f5256_Dne(this.field_2d29f1_aFZ)) * (float)Math.PI * 0.25f;
            if (!this.field_36c4f18_Dne.field_2d2a05_aFZ) {
                this.field_291868_XHL = 0.0;
                this.field_2a9ad1_Zpi -= 0.08;
                this.field_2a9ad1_Zpi *= (double)0.98f;
                this.field_31b811_kGO = 0.0;
            }
            this.field_2092ab_Dne = (float)((double)this.field_2092ab_Dne + (double)(-90.0f - this.field_2092ab_Dne) * 0.02);
        }
    }

    @Override
    protected float method_b0a28134_div() {
        return 0.4f;
    }

    @Override
    protected String method_a174454e_zGp() {
        return null;
    }

    @Override
    public boolean method_9feec6c6_Zpi() {
        return this.field_36c4f18_Dne.method_ff46456e_Dne(this.field_373a3ed_Dne.method_b78565d7_FWm(0.0, -0.6f, 0.0), KFd.field_1411d34d_div, this);
    }

    @Override
    protected int method_baa393f5_kGO() {
        return 0;
    }

    @Override
    protected void method_b0a28144_div() {
        ++this.field_295784_Wwe;
        if (this.field_295784_Wwe > 100) {
            this.field_2435c2_LoG = 0.0f;
            this.field_1fcf1a_CZC = 0.0f;
            this.field_30e9da_iNQ = 0.0f;
        } else if (this.field_7331eae7_Dne.nextInt(50) == 0 || !this.field_36b0ba_udO || this.field_30e9da_iNQ == 0.0f && this.field_1fcf1a_CZC == 0.0f && this.field_2435c2_LoG == 0.0f) {
            float f = this.field_7331eae7_Dne.nextFloat() * (float)Math.PI * 2.0f;
            this.field_30e9da_iNQ = geR.method_117d0e97_FWm(f) * 0.2f;
            this.field_1fcf1a_CZC = -0.1f + this.field_7331eae7_Dne.nextFloat() * 0.2f;
            this.field_2435c2_LoG = geR.method_ce7f5256_Dne(f) * 0.2f;
        }
        this.method_9f65f30f_ZgS();
    }
}

