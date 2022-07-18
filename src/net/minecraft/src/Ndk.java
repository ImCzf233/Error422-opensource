package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class Ndk
extends sMa {
    public int field_21260d_FWm;
    public int field_2092ae_Dne = 0;

    public Ndk(Qnq qnq, double d, double d2, double d3) {
        this(qnq);
        this.method_2961957_bzF(d, d2, d3);
    }

    @Override
    protected void method_7c6f6039_FWm() {
        this.field_378ab08_Dne.method_ad009545_Dne(8, this.field_21260d_FWm);
    }

    @Override
    public boolean method_147b2066_Dne(zBn zBn2, int n) {
        if (this.method_7c861acb_EyB()) {
            return false;
        }
        if (!this.field_2a9ae7_Zpi && !this.field_36c4f18_Dne.field_2d2a05_aFZ) {
            this.field_21260d_FWm = 0;
            if (this.field_21260d_FWm <= 0) {
                this.method_5d73f9d_g_();
                if (!this.field_36c4f18_Dne.field_2d2a05_aFZ) {
                    this.field_36c4f18_Dne.method_95c6ba4c_Dne(null, this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb, 6.0f, true);
                }
            }
        }
        return true;
    }

    @Override
    public boolean method_baa39406_kGO() {
        return true;
    }

    public Ndk(Qnq qnq) {
        super(qnq);
        this.field_2e5f2c_bzF = true;
        this.method_16b621a_Dne(2.0f, 2.0f);
        this.field_36b0a6_udO = this.field_367151_trS / 2.0f;
        this.field_21260d_FWm = 5;
        this.field_2092ae_Dne = this.field_7331eae7_Dne.nextInt(100000);
    }

    @Override
    public void method_7a46289a_Dne() {
        this.field_2d29ef_aFZ = this.field_2f0dd3_div;
        this.field_388da1_zGp = this.field_22c5fd_IjH;
        this.field_20b852_DyG = this.field_334487_mrb;
        ++this.field_2092ae_Dne;
        this.field_378ab08_Dne.method_62ca2346_FWm(8, this.field_21260d_FWm);
        int n = geR.method_117d0718_FWm(this.field_2f0dd3_div);
        int n2 = geR.method_117d0718_FWm(this.field_22c5fd_IjH);
        int n3 = geR.method_117d0718_FWm(this.field_334487_mrb);
        if (this.field_36c4f18_Dne.method_2c2cf7bc_Dne(n, n2, n3) != zKP.field_3774324_Dne.field_21260d_FWm) {
            this.field_36c4f18_Dne.method_2ee8c47d_FWm(n, n2, n3, zKP.field_3774324_Dne.field_21260d_FWm);
        }
    }

    @Override
    public float method_7a46288a_Dne() {
        return 0.0f;
    }

    @Override
    protected void method_66a36cd8_FWm(WkD wkD) {
    }

    @Override
    protected void method_8d4fb917_Dne(WkD wkD) {
    }

    @Override
    protected boolean method_7c6f603d_FWm() {
        return false;
    }
}

