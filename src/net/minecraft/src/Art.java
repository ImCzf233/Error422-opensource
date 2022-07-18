package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class Art
extends Ebp {
    private int field_2092ae_Dne = -1;

    public Art(Qnq qnq) {
        super(qnq);
    }

    public boolean method_b0a28148_div() {
        return this.field_2092ae_Dne > -1;
    }

    @Override
    public void method_c6daaac1_Dne(zBn zBn2) {
        super.method_c6daaac1_Dne(zBn2);
        double d = this.field_291868_XHL * this.field_291868_XHL + this.field_31b811_kGO * this.field_31b811_kGO;
        if (!zBn2.method_7c6f603d_FWm()) {
            this.method_2cda29ee_Dne(new NMq(zKP.field_cb5aacc0_qXo, 1), 0.0f);
        }
        if (zBn2.method_a98a0664_aFZ() || zBn2.method_7c6f603d_FWm() || d >= (double)0.01f) {
            this.method_117d0725_FWm(d);
        }
    }

    @Override
    public int method_9a443a8c_XHL() {
        return 3;
    }

    @Override
    protected void method_8d4fb917_Dne(WkD wkD) {
        super.method_8d4fb917_Dne(wkD);
        wkD.method_5ab44f9f_Dne("TNTFuse", this.field_2092ae_Dne);
    }

    protected void method_117d0725_FWm(double d) {
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ) {
            double d2 = Math.sqrt(d);
            if (d2 > 5.0) {
                d2 = 5.0;
            }
            this.field_36c4f18_Dne.method_95c6ba4c_Dne(this, this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb, (float)(4.0 + this.field_7331eae7_Dne.nextDouble() * 1.5 * d2), true);
            this.method_5d73f9d_g_();
        }
    }

    @Override
    public void method_7a46289a_Dne() {
        double d;
        super.method_7a46289a_Dne();
        if (this.field_2092ae_Dne > 0) {
            --this.field_2092ae_Dne;
            this.field_36c4f18_Dne.method_8600ec24_Dne("smoke", this.field_2f0dd3_div, this.field_22c5fd_IjH + 0.5, this.field_334487_mrb, 0.0, 0.0, 0.0);
        } else if (this.field_2092ae_Dne == 0) {
            this.method_117d0725_FWm(this.field_291868_XHL * this.field_291868_XHL + this.field_31b811_kGO * this.field_31b811_kGO);
        }
        if (this.field_388db7_zGp && (d = this.field_291868_XHL * this.field_291868_XHL + this.field_31b811_kGO * this.field_31b811_kGO) >= (double)0.01f) {
            this.method_117d0725_FWm(d);
        }
    }

    public void method_ae128dc7_bzF() {
        this.field_2092ae_Dne = 80;
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ) {
            this.field_36c4f18_Dne.method_b43d849c_Dne(this, (byte)10);
            this.field_36c4f18_Dne.method_a36f5f6a_Dne(this, "random.fuse", 1.0f, 1.0f);
        }
    }

    public Art(Qnq qnq, double d, double d2, double d3) {
        super(qnq, d, d2, d3);
    }

    @Override
    public boolean method_6eed2507_Dne(yTR yTR2, Qnq qnq, int n, int n2, int n3, int n4, float f) {
        return this.method_b0a28148_div() && (Oaf.method_ce7f5dad_Dne(n4) || Oaf.method_3036b9d3_FWm(qnq, n, n2 + 1, n3)) ? false : super.method_6eed2507_Dne(yTR2, qnq, n, n2, n3, n4, f);
    }

    public int method_907a9d14_Qnq() {
        return this.field_2092ae_Dne;
    }

    @Override
    protected void method_66a36cd8_FWm(WkD wkD) {
        super.method_66a36cd8_FWm(wkD);
        if (wkD.method_8f501fe8_Dne("TNTFuse")) {
            this.field_2092ae_Dne = wkD.method_8f501fd7_Dne("TNTFuse");
        }
    }

    @Override
    public void method_ce7f4362_Dne(byte by) {
        if (by == 10) {
            this.method_ae128dc7_bzF();
        } else {
            super.method_ce7f4362_Dne(by);
        }
    }

    @Override
    protected void method_ce7f5266_Dne(float f) {
        if (f >= 3.0f) {
            float f2 = f / 10.0f;
            this.method_117d0725_FWm(f2 * f2);
        }
        super.method_ce7f5266_Dne(f);
    }

    @Override
    public void method_5972b42b_Dne(int n, int n2, int n3, boolean bl) {
        if (bl && this.field_2092ae_Dne < 0) {
            this.method_ae128dc7_bzF();
        }
    }

    @Override
    public float method_981211cc_Dne(yTR yTR2, Qnq qnq, int n, int n2, int n3, zKP zKP2) {
        return this.method_b0a28148_div() && (Oaf.method_ce7f5dad_Dne(zKP2.field_21260d_FWm) || Oaf.method_3036b9d3_FWm(qnq, n, n2 + 1, n3)) ? 0.0f : super.method_981211cc_Dne(yTR2, qnq, n, n2, n3, zKP2);
    }

    @Override
    public zKP method_f88e496b_FWm() {
        return zKP.field_cb5aacc0_qXo;
    }
}

