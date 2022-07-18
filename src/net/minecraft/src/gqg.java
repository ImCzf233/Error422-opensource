package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class gqg
extends sMa {
    private FUH field_366ec33_Dne;
    public int field_2092ae_Dne = 0;

    @Override
    protected void method_7c6f6039_FWm() {
    }

    public FUH method_23007a92_Dne() {
        return this.field_366ec33_Dne;
    }

    public gqg(Qnq qnq, double d, double d2, double d3, FUH fUH) {
        this(qnq);
        this.method_2961957_bzF(d, d2, d3);
        float f = (float)(Math.random() * Math.PI * 2.0);
        this.field_291868_XHL = -((float)Math.sin(f)) * 0.02f;
        this.field_2a9ad1_Zpi = 0.2f;
        this.field_31b811_kGO = -((float)Math.cos(f)) * 0.02f;
        this.field_2092ae_Dne = 80;
        this.field_2d29ef_aFZ = d;
        this.field_388da1_zGp = d2;
        this.field_20b852_DyG = d3;
        this.field_366ec33_Dne = fUH;
    }

    @Override
    public float method_7a46288a_Dne() {
        return 0.0f;
    }

    @Override
    protected void method_66a36cd8_FWm(WkD wkD) {
        this.field_2092ae_Dne = wkD.method_8f501fd0_Dne("Fuse");
    }

    @Override
    protected void method_8d4fb917_Dne(WkD wkD) {
        wkD.method_5ab43558_Dne("Fuse", (byte)this.field_2092ae_Dne);
    }

    @Override
    protected boolean method_7c6f603d_FWm() {
        return false;
    }

    @Override
    public boolean method_baa39406_kGO() {
        return !this.field_2a9ae7_Zpi;
    }

    @Override
    public void method_7a46289a_Dne() {
        this.field_2d29ef_aFZ = this.field_2f0dd3_div;
        this.field_388da1_zGp = this.field_22c5fd_IjH;
        this.field_20b852_DyG = this.field_334487_mrb;
        this.field_2a9ad1_Zpi -= (double)0.04f;
        this.method_2be429a4_Dne(this.field_291868_XHL, this.field_2a9ad1_Zpi, this.field_31b811_kGO);
        this.field_291868_XHL *= (double)0.98f;
        this.field_2a9ad1_Zpi *= (double)0.98f;
        this.field_31b811_kGO *= (double)0.98f;
        if (this.field_2d2a05_aFZ) {
            this.field_291868_XHL *= (double)0.7f;
            this.field_31b811_kGO *= (double)0.7f;
            this.field_2a9ad1_Zpi *= -0.5;
        }
        if (this.field_2092ae_Dne-- <= 0) {
            this.method_5d73f9d_g_();
            if (!this.field_36c4f18_Dne.field_2d2a05_aFZ) {
                this.method_ae128dc7_bzF();
            }
        } else {
            this.field_36c4f18_Dne.method_8600ec24_Dne("smoke", this.field_2f0dd3_div, this.field_22c5fd_IjH + 0.5, this.field_334487_mrb, 0.0, 0.0, 0.0);
        }
    }

    private void method_ae128dc7_bzF() {
        float f = 4.0f;
        this.field_36c4f18_Dne.method_95c6ba4c_Dne(this, this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb, f, true);
    }

    public gqg(Qnq qnq) {
        super(qnq);
        this.field_2e5f2c_bzF = true;
        this.method_16b621a_Dne(0.98f, 0.98f);
        this.field_36b0a6_udO = this.field_367151_trS / 2.0f;
    }
}

