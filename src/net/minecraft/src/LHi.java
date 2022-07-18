package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public abstract class LHi
extends kSJ
implements ZFz {
    @Override
    public float method_2c2cf7b9_Dne(int n, int n2, int n3) {
        return 0.5f - this.field_36c4f18_Dne.method_2c2cf7b9_Dne(n, n2, n3);
    }

    protected boolean method_80692b1e_ICU() {
        int n;
        int n2;
        int n3 = geR.method_117d0718_FWm(this.field_2f0dd3_div);
        if (this.field_36c4f18_Dne.method_f476b68e_FWm(udO.field_37c82cc_Dne, n3, n2 = geR.method_117d0718_FWm(this.field_373a3ed_Dne.field_212608_FWm), n = geR.method_117d0718_FWm(this.field_334487_mrb)) > this.field_7331eae7_Dne.nextInt(32)) {
            return false;
        }
        int n4 = this.field_36c4f18_Dne.method_76d9fc36_aFZ(n3, n2, n);
        if (this.field_36c4f18_Dne.method_7c6f603d_FWm()) {
            int n5 = this.field_36c4f18_Dne.field_2092ae_Dne;
            this.field_36c4f18_Dne.field_2092ae_Dne = 10;
            n4 = this.field_36c4f18_Dne.method_76d9fc36_aFZ(n3, n2, n);
            this.field_36c4f18_Dne.field_2092ae_Dne = n5;
        }
        return n4 <= this.field_7331eae7_Dne.nextInt(8);
    }

    @Override
    public void method_8288d6ee_IjH() {
        this.method_7ac0706d_EWz();
        float f = this.method_ce7f5256_Dne(1.0f);
        if (f > 0.5f) {
            this.field_295784_Wwe += 2;
        }
        super.method_8288d6ee_IjH();
    }

    @Override
    protected sMa method_2314d444_Dne() {
        FiG fiG = this.field_36c4f18_Dne.method_c32e43ea_FWm(this, 16.0);
        return fiG != null && this.method_3e501ffd_Qnq(fiG) ? fiG : null;
    }

    public LHi(Qnq qnq) {
        super(qnq);
        this.field_217c26_Fnk = 5;
    }

    @Override
    public boolean method_147b2066_Dne(zBn zBn2, int n) {
        if (this.method_7c861acb_EyB()) {
            return false;
        }
        if (super.method_147b2066_Dne(zBn2, n)) {
            sMa sMa2 = zBn2.method_f88b2463_FWm();
            if (this.field_37b45e5_Dne != sMa2 && this.field_203511c4_FWm != sMa2) {
                if (sMa2 != this) {
                    this.field_75c313d2_bzF = sMa2;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    @Override
    public void method_7a46289a_Dne() {
        super.method_7a46289a_Dne();
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ && this.field_36c4f18_Dne.field_2d29f4_aFZ == 0) {
            this.method_5d73f9d_g_();
        }
    }

    @Override
    protected void method_b43d93a0_Dne(sMa sMa2, float f) {
        if (this.field_26818f_RPx <= 0 && f < 2.0f && sMa2.field_373a3ed_Dne.field_2d29ef_aFZ > this.field_373a3ed_Dne.field_212608_FWm && sMa2.field_373a3ed_Dne.field_212608_FWm < this.field_373a3ed_Dne.field_2d29ef_aFZ) {
            this.field_26818f_RPx = 20;
            this.method_ad72a717_bzF(sMa2);
        }
    }

    @Override
    public boolean method_ad72a717_bzF(sMa sMa2) {
        boolean bl;
        int n = this.method_bb7dd813_Dne(sMa2);
        if (this.method_857f23ec_Dne(SXd.field_f09ea2a5_zGp)) {
            n += 3 << this.method_a7927c94_Dne(SXd.field_f09ea2a5_zGp).method_ae128dba_bzF();
        }
        if (this.method_857f23ec_Dne(SXd.field_719bf97c_Vxn)) {
            n -= 2 << this.method_a7927c94_Dne(SXd.field_719bf97c_Vxn).method_ae128dba_bzF();
        }
        int n2 = 0;
        if (sMa2 instanceof FUH) {
            n += UYp.method_d8697d0d_Dne(this, (FUH)sMa2);
            n2 += UYp.method_97c4f9ec_FWm(this, (FUH)sMa2);
        }
        if (bl = sMa2.method_147b2066_Dne(zBn.method_267d8b79_Dne(this), n)) {
            int n3;
            if (n2 > 0) {
                sMa2.method_2e2893bd_Qnq(-geR.method_ce7f5256_Dne(this.field_334489_mrb * (float)Math.PI / 180.0f) * (float)n2 * 0.5f, 0.1, geR.method_117d0e97_FWm(this.field_334489_mrb * (float)Math.PI / 180.0f) * (float)n2 * 0.5f);
                this.field_291868_XHL *= 0.6;
                this.field_31b811_kGO *= 0.6;
            }
            if ((n3 = UYp.method_6f1922e1_Dne(this)) > 0) {
                sMa2.method_87b738a3_aFZ(n3 * 4);
            }
            if (sMa2 instanceof FUH) {
                kqp.method_1ddea214_Dne(this, (FUH)sMa2, this.field_7331eae7_Dne);
            }
        }
        return bl;
    }

    public int method_bb7dd813_Dne(sMa sMa2) {
        return 2;
    }

    @Override
    public boolean method_af414cf1_cot() {
        return this.method_80692b1e_ICU() && super.method_af414cf1_cot();
    }
}

