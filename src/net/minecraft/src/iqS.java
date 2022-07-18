package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class iqS
extends RNA {
    protected Sgm field_5e568bda_Qnq;
    protected Sgm field_f09edc0b_zGp;
    protected Sgm field_1620463c_DyG;
    private kGJ field_377899e_Dne;
    private Sgm field_1415f33d_div = this.field_36d1d13_Dne;
    protected Sgm field_7130a159_aFZ;
    private int field_2092ae_Dne = 1;

    protected void method_ba9867df_Dne(zxd zxd2, float f, float f2, float f3) {
        if (zxd2.method_9f5095a2_ZfC()) {
            f2 += (float)(Math.cos((double)zxd2.field_388da6_zGp * 3.25) * Math.PI * 0.25);
        }
        super.method_9fba3e12_Dne(zxd2, f, f2, f3);
    }

    @Override
    protected void method_c52e66f1_FWm(FUH fUH, float f) {
        this.method_7013db9f_Dne((zxd)fUH, f);
    }

    @Override
    protected void method_7a46289a_Dne() {
        this.field_2026e8f2_FWm = new fsj(1.0f, true);
        this.field_75b4eb00_bzF = new fsj(0.5f, true);
        this.field_5e568bda_Qnq = this.field_2026e8f2_FWm;
        this.field_7130a159_aFZ = this.field_75b4eb00_bzF;
        this.field_f09edc0b_zGp = new kGJ(1.0f, 0.0f, true);
        this.field_1620463c_DyG = new kGJ(0.5f, 0.0f, true);
    }

    @Override
    protected int method_d6a747e_Dne(FUH fUH, int n, float f) {
        return this.method_92695d11_Dne((zxd)fUH, n, f);
    }

    private void method_c9cf1441_Dne(zxd zxd2) {
        if (zxd2.method_86921671_LVR()) {
            if (this.field_2092ae_Dne != this.field_377899e_Dne.method_7a46288d_Dne()) {
                this.field_377899e_Dne = new kGJ();
                this.field_2092ae_Dne = this.field_377899e_Dne.method_7a46288d_Dne();
                this.field_f09edc0b_zGp = new kGJ(1.0f, 0.0f, true);
                this.field_1620463c_DyG = new kGJ(0.5f, 0.0f, true);
            }
            this.field_367c742_Dne = this.field_377899e_Dne;
            this.field_2026e8f2_FWm = this.field_f09edc0b_zGp;
            this.field_75b4eb00_bzF = this.field_1620463c_DyG;
        } else {
            this.field_367c742_Dne = this.field_1415f33d_div;
            this.field_2026e8f2_FWm = this.field_5e568bda_Qnq;
            this.field_75b4eb00_bzF = this.field_7130a159_aFZ;
        }
        this.field_36d1d13_Dne = (Sgm)this.field_367c742_Dne;
    }

    public void method_8d88d5d_Dne(zxd zxd2, double d, double d2, double d3, float f, float f2) {
        this.method_c9cf1441_Dne(zxd2);
        super.method_2cdda2d0_Dne(zxd2, d, d2, d3, f, f2);
    }

    protected void method_7013db9f_Dne(zxd zxd2, float f) {
        this.method_c9cf1441_Dne(zxd2);
        super.method_c52e66f1_FWm(zxd2, f);
    }

    @Override
    protected void method_9fba3e12_Dne(FUH fUH, float f, float f2, float f3) {
        this.method_ba9867df_Dne((zxd)fUH, f, f2, f3);
    }

    public iqS() {
        super(new fsj(), 0.5f, 1.0f);
        this.field_377899e_Dne = new kGJ();
    }

    @Override
    public void method_31745cde_Dne(sMa sMa2, double d, double d2, double d3, float f, float f2) {
        this.method_8d88d5d_Dne((zxd)sMa2, d, d2, d3, f, f2);
    }

    protected int method_92695d11_Dne(zxd zxd2, int n, float f) {
        this.method_c9cf1441_Dne(zxd2);
        return super.method_d6a747e_Dne(zxd2, n, f);
    }

    @Override
    public void method_2cdda2d0_Dne(FUH fUH, double d, double d2, double d3, float f, float f2) {
        this.method_8d88d5d_Dne((zxd)fUH, d, d2, d3, f, f2);
    }
}

