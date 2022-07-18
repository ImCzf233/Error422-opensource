package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class Tgj
extends FUH
implements ZFz {
    public float field_21260a_FWm;
    private static final float[] field_59d86b9_bzF = new float[]{1.0f, 0.75f, 0.5f, 0.25f, 0.0f, 0.25f, 0.5f, 0.75f};
    private int field_2092ae_Dne = 0;
    public float field_2092ab_Dne;
    public float field_2e5f18_bzF;

    @Override
    protected int method_baa393f5_kGO() {
        return this.method_73aaafb6_ATE() == 1 ? dEr.field_20b3be69_jBE.field_267cf5_Qnq : 0;
    }

    @Override
    public void method_66a36cd8_FWm(WkD wkD) {
        super.method_66a36cd8_FWm(wkD);
        this.method_117d19ea_FWm(wkD.method_8f501fd7_Dne("Size") + 1);
    }

    protected boolean method_86921671_LVR() {
        return this.method_73aaafb6_ATE() > 0;
    }

    protected String method_c50868a8_mrb() {
        return "mob.slime." + (this.method_73aaafb6_ATE() > 1 ? "big" : "small");
    }

    @Override
    public void method_5d73f9d_g_() {
        int n = this.method_73aaafb6_ATE();
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ && n > 1 && this.method_9a443a8c_XHL() <= 0) {
            int n2 = 2 + this.field_7331eae7_Dne.nextInt(3);
            for (int i = 0; i < n2; ++i) {
                float f = ((float)(i % 2) - 0.5f) * (float)n / 4.0f;
                float f2 = ((float)(i / 2) - 0.5f) * (float)n / 4.0f;
                Tgj tgj = this.method_23071f74_Dne();
                tgj.method_117d19ea_FWm(n / 2);
                tgj.method_9ce0fc65_FWm(this.field_2f0dd3_div + (double)f, this.field_22c5fd_IjH + 0.5, this.field_334487_mrb + (double)f2, this.field_7331eae7_Dne.nextFloat() * 360.0f, 0.0f);
                this.field_36c4f18_Dne.method_94d18be5_FWm(tgj);
            }
        }
        super.method_5d73f9d_g_();
    }

    protected int method_ae128dba_bzF() {
        return this.field_7331eae7_Dne.nextInt(20) + 10;
    }

    protected void method_117d19ea_FWm(int n) {
        this.field_378ab08_Dne.method_62ca2346_FWm(16, new Byte((byte)n));
        this.method_16b621a_Dne(0.6f * (float)n, 0.6f * (float)n);
        this.method_2961957_bzF(this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb);
        this.method_143f9e1c_bzF(this.method_7a46288d_Dne());
        this.field_217c26_Fnk = n;
    }

    public int method_73aaafb6_ATE() {
        return this.field_378ab08_Dne.method_ce7f5d95_Dne(16);
    }

    @Override
    public void method_8d4fb917_Dne(WkD wkD) {
        super.method_8d4fb917_Dne(wkD);
        wkD.method_5ab44f9f_Dne("Size", this.method_73aaafb6_ATE() - 1);
    }

    protected void method_907a9d21_Qnq() {
        this.field_2092ab_Dne *= 0.6f;
    }

    protected boolean method_c738b198_qrB() {
        return this.method_73aaafb6_ATE() > 2;
    }

    protected int method_c5287a51_qLR() {
        return this.method_73aaafb6_ATE();
    }

    @Override
    public boolean method_af414cf1_cot() {
        qMV qMV2 = this.field_36c4f18_Dne.method_90569c11_Dne(geR.method_117d0718_FWm(this.field_2f0dd3_div), geR.method_117d0718_FWm(this.field_334487_mrb));
        if (this.field_36c4f18_Dne.method_231798c9_Dne().method_23111898_Dne() == kGO.field_20315618_FWm && this.field_7331eae7_Dne.nextInt(4) != 1) {
            return false;
        }
        if (this.method_73aaafb6_ATE() == 1 || this.field_36c4f18_Dne.field_2d29f4_aFZ > 0) {
            OdI odI = this.field_36c4f18_Dne.method_90477c37_Dne(geR.method_117d0718_FWm(this.field_2f0dd3_div), geR.method_117d0718_FWm(this.field_334487_mrb));
            if (odI == OdI.field_161e6521_DyG && this.field_22c5fd_IjH > 50.0 && this.field_22c5fd_IjH < 70.0 && this.field_7331eae7_Dne.nextFloat() < 0.5f && this.field_7331eae7_Dne.nextFloat() < field_59d86b9_bzF[this.field_36c4f18_Dne.method_7a46288d_Dne()] && this.field_36c4f18_Dne.method_76d9fc36_aFZ(geR.method_117d0718_FWm(this.field_2f0dd3_div), geR.method_117d0718_FWm(this.field_22c5fd_IjH), geR.method_117d0718_FWm(this.field_334487_mrb)) <= this.field_7331eae7_Dne.nextInt(8)) {
                return super.method_af414cf1_cot();
            }
            if (this.field_7331eae7_Dne.nextInt(10) == 0 && qMV2.method_30427018_Dne(987234911L).nextInt(10) == 0 && this.field_22c5fd_IjH < 40.0) {
                return super.method_af414cf1_cot();
            }
        }
        return false;
    }

    protected String method_d1f1ed87_FWm() {
        return "slime";
    }

    @Override
    protected void method_b0a28144_div() {
        this.method_9f65f30f_ZgS();
        FiG fiG = this.field_36c4f18_Dne.method_c32e43ea_FWm(this, 16.0);
        if (fiG != null) {
            this.method_d3754820_Dne(fiG, 10.0f, 20.0f);
        }
        if (this.field_2d2a05_aFZ && this.field_2092ae_Dne-- <= 0) {
            this.field_2092ae_Dne = this.method_ae128dba_bzF();
            if (fiG != null) {
                this.field_2092ae_Dne /= 3;
            }
            this.field_3393ee_oIf = true;
            if (this.method_86921671_LVR()) {
                this.method_fbd4aee4_Dne(this.method_c50868a8_mrb(), this.method_b0a28134_div(), ((this.field_7331eae7_Dne.nextFloat() - this.field_7331eae7_Dne.nextFloat()) * 0.2f + 1.0f) * 0.8f);
            }
            this.field_2a70af_ZfC = 1.0f - this.field_7331eae7_Dne.nextFloat() * 2.0f;
            this.field_212b3f_FYZ = 1 * this.method_73aaafb6_ATE();
        } else {
            this.field_3393ee_oIf = false;
            if (this.field_2d2a05_aFZ) {
                this.field_212b3f_FYZ = 0.0f;
                this.field_2a70af_ZfC = 0.0f;
            }
        }
    }

    @Override
    public void method_7a46289a_Dne() {
        int n;
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ && this.field_36c4f18_Dne.field_2d29f4_aFZ == 0 && this.method_73aaafb6_ATE() > 0) {
            this.field_2a9ae7_Zpi = true;
        }
        this.field_21260a_FWm += (this.field_2092ab_Dne - this.field_21260a_FWm) * 0.5f;
        this.field_2e5f18_bzF = this.field_21260a_FWm;
        boolean bl = this.field_2d2a05_aFZ;
        super.method_7a46289a_Dne();
        if (this.field_2d2a05_aFZ && !bl) {
            n = this.method_73aaafb6_ATE();
            for (int i = 0; i < n * 8; ++i) {
                float f = this.field_7331eae7_Dne.nextFloat() * (float)Math.PI * 2.0f;
                float f2 = this.field_7331eae7_Dne.nextFloat() * 0.5f + 0.5f;
                float f3 = geR.method_ce7f5256_Dne(f) * (float)n * 0.5f * f2;
                float f4 = geR.method_117d0e97_FWm(f) * (float)n * 0.5f * f2;
                this.field_36c4f18_Dne.method_8600ec24_Dne(this.method_d1f1ed87_FWm(), this.field_2f0dd3_div + (double)f3, this.field_373a3ed_Dne.field_212608_FWm, this.field_334487_mrb + (double)f4, 0.0, 0.0, 0.0);
            }
            if (this.method_c738b198_qrB()) {
                this.method_fbd4aee4_Dne(this.method_c50868a8_mrb(), this.method_b0a28134_div(), ((this.field_7331eae7_Dne.nextFloat() - this.field_7331eae7_Dne.nextFloat()) * 0.2f + 1.0f) / 0.8f);
            }
            this.field_2092ab_Dne = -0.5f;
        } else if (!this.field_2d2a05_aFZ && bl) {
            this.field_2092ab_Dne = 1.0f;
        }
        this.method_907a9d21_Qnq();
        if (this.field_36c4f18_Dne.field_2d2a05_aFZ) {
            n = this.method_73aaafb6_ATE();
            this.method_16b621a_Dne(0.6f * (float)n, 0.6f * (float)n);
        }
    }

    @Override
    protected void method_7c6f6039_FWm() {
        super.method_7c6f6039_FWm();
        this.field_378ab08_Dne.method_ad009545_Dne(16, (byte) 1);
    }

    @Override
    protected float method_b0a28134_div() {
        return 0.4f * (float)this.method_73aaafb6_ATE();
    }

    @Override
    public int method_7a46288d_Dne() {
        int n = this.method_73aaafb6_ATE();
        return n * n;
    }

    @Override
    protected String method_6a89a3dc_div() {
        return "mob.slime." + (this.method_73aaafb6_ATE() > 1 ? "big" : "small");
    }

    protected Tgj method_23071f74_Dne() {
        return new Tgj(this.field_36c4f18_Dne);
    }

    @Override
    public void method_21db0c6_a_(FiG fiG) {
        if (this.method_b6f3e1a2_haP()) {
            int n = this.method_73aaafb6_ATE();
            if (this.method_3e501ffd_Qnq(fiG) && this.method_bb7dd80e_Dne(fiG) < 0.6 * (double)n * 0.6 * (double)n && fiG.method_147b2066_Dne(zBn.method_267d8b79_Dne(this), this.method_c5287a51_qLR())) {
                this.method_fbd4aee4_Dne("mob.attack", 1.0f, (this.field_7331eae7_Dne.nextFloat() - this.field_7331eae7_Dne.nextFloat()) * 0.2f + 1.0f);
            }
        }
    }

    @Override
    protected String method_3c9d12fd_DyG() {
        return "mob.slime." + (this.method_73aaafb6_ATE() > 1 ? "big" : "small");
    }

    public Tgj(Qnq qnq) {
        super(qnq);
        this.field_c480ca78_bzF = "/mob/slime.png";
        int n = 1 << this.field_7331eae7_Dne.nextInt(3);
        this.field_36b0a6_udO = 0.0f;
        this.field_2092ae_Dne = this.field_7331eae7_Dne.nextInt(20) + 10;
        this.method_117d19ea_FWm(n);
    }

    protected boolean method_b6f3e1a2_haP() {
        return this.method_73aaafb6_ATE() > 1;
    }

    @Override
    public int method_cd4cb3c8_udO() {
        return 0;
    }
}

