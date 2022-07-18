package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.client.Minecraft;

public class MJs
extends FKB {
    private double field_217c21_Fnk;
    private boolean field_2681a0_RPx = false;
    private boolean field_2092bf_Dne = false;
    private float field_212648_EwP;
    private double field_212608_FWm;
    private int field_20b341_EWz = 0;
    private double field_2092a9_Dne;
    private boolean field_217c37_Fnk = false;
    public fzy field_37608e7_Dne;
    private double field_307842_gnI;
    private boolean field_21261e_FWm = false;
    private float field_379e5b_xEx;

    @Override
    public void method_df3461c5_Dne(RLC rLC, int n) {
        if (rLC != null && rLC.field_2092bf_Dne) {
            super.method_df3461c5_Dne(rLC, n);
        }
    }

    public void method_5bb109b_e_() {
        boolean bl;
        boolean bl2;
        boolean bl3 = this.method_73aaafc7_ATE();
        if (bl3 != this.field_2681a0_RPx) {
            if (bl3) {
                this.field_37608e7_Dne.method_5536af4d_FWm(new Pkw(this, 4));
            } else {
                this.field_37608e7_Dne.method_5536af4d_FWm(new Pkw(this, 5));
            }
            this.field_2681a0_RPx = bl3;
        }
        if ((bl2 = this.method_a98a0664_aFZ()) != this.field_21261e_FWm) {
            if (bl2) {
                this.field_37608e7_Dne.method_5536af4d_FWm(new Pkw(this, 1));
            } else {
                this.field_37608e7_Dne.method_5536af4d_FWm(new Pkw(this, 2));
            }
            this.field_21261e_FWm = bl2;
        }
        double d = this.field_2f0dd3_div - this.field_2092a9_Dne;
        double d2 = this.field_373a3ed_Dne.field_212608_FWm - this.field_212608_FWm;
        double d3 = this.field_334487_mrb - this.field_307842_gnI;
        double d4 = this.field_334489_mrb - this.field_212648_EwP;
        double d5 = this.field_29186a_XHL - this.field_379e5b_xEx;
        boolean bl4 = d * d + d2 * d2 + d3 * d3 > 9.0E-4 || this.field_20b341_EWz >= 20;
        boolean bl5 = bl = d4 != 0.0 || d5 != 0.0;
        if (this.field_203511c4_FWm != null) {
            this.field_37608e7_Dne.method_5536af4d_FWm(new eMn(this.field_291868_XHL, -999.0, -999.0, this.field_31b811_kGO, this.field_334489_mrb, this.field_29186a_XHL, this.field_2d2a05_aFZ));
            bl4 = false;
        } else if (bl4 && bl) {
            this.field_37608e7_Dne.method_5536af4d_FWm(new eMn(this.field_2f0dd3_div, this.field_373a3ed_Dne.field_212608_FWm, this.field_22c5fd_IjH, this.field_334487_mrb, this.field_334489_mrb, this.field_29186a_XHL, this.field_2d2a05_aFZ));
        } else if (bl4) {
            this.field_37608e7_Dne.method_5536af4d_FWm(new QEr(this.field_2f0dd3_div, this.field_373a3ed_Dne.field_212608_FWm, this.field_22c5fd_IjH, this.field_334487_mrb, this.field_2d2a05_aFZ));
        } else if (bl) {
            this.field_37608e7_Dne.method_5536af4d_FWm(new FTJ(this.field_334489_mrb, this.field_29186a_XHL, this.field_2d2a05_aFZ));
        } else {
            this.field_37608e7_Dne.method_5536af4d_FWm(new FQJ(this.field_2d2a05_aFZ));
        }
        ++this.field_20b341_EWz;
        this.field_2092bf_Dne = this.field_2d2a05_aFZ;
        if (bl4) {
            this.field_2092a9_Dne = this.field_2f0dd3_div;
            this.field_212608_FWm = this.field_373a3ed_Dne.field_212608_FWm;
            this.field_217c21_Fnk = this.field_22c5fd_IjH;
            this.field_307842_gnI = this.field_334487_mrb;
            this.field_20b341_EWz = 0;
        }
        if (bl) {
            this.field_212648_EwP = this.field_334489_mrb;
            this.field_379e5b_xEx = this.field_29186a_XHL;
        }
    }

    @Override
    public void method_ae128dc7_bzF() {
        super.method_ae128dc7_bzF();
        this.field_37608e7_Dne.method_5536af4d_FWm(new UVb(this, 1));
    }

    @Override
    protected void method_147b2062_Dne(zBn zBn2, int n) {
        if (!this.method_7c861acb_EyB()) {
            this.method_143f9e1c_bzF(this.method_9a443a8c_XHL() - n);
        }
    }

    public void method_110c4dc3_FWm(String string) {
        this.field_37608e7_Dne.method_5536af4d_FWm(new rXx(string));
    }

    @Override
    public void method_907a9d21_Qnq() {
        this.field_37608e7_Dne.method_5536af4d_FWm(new Gle(1));
    }

    public void method_5c9281c_f_() {
        this.field_36a059b_Dne.method_7c61cf15_Dne(null);
        super.method_a98a0660_aFZ();
    }

    public void method_30572624_FWm(RLC rLC, int n) {
        if (rLC != null && !rLC.field_2092bf_Dne) {
            super.method_df3461c5_Dne(rLC, n);
        }
    }

    @Override
    public void method_7a46289a_Dne() {
        if (this.field_36c4f18_Dne.method_2dee780_bzF(geR.method_117d0718_FWm(this.field_2f0dd3_div), 0, geR.method_117d0718_FWm(this.field_334487_mrb))) {
            super.method_7a46289a_Dne();
            this.method_5bb109b_e_();
        }
    }

    @Override
    public void method_7ad38803_DyG() {
        this.field_37608e7_Dne.method_5536af4d_FWm(new pSe(this.field_37cb681_Dne));
    }

    @Override
    public boolean method_590ca1c_b_() {
        return true;
    }

    @Override
    protected void method_7708a159_Dne(JiM jiM) {
    }

    @Override
    public void method_aad4134c_a_(int n) {
        if (this.field_217c37_Fnk) {
            super.method_aad4134c_a_(n);
        } else {
            this.method_143f9e1c_bzF(n);
            this.field_217c37_Fnk = true;
        }
    }

    @Override
    public boolean method_147b2066_Dne(zBn zBn2, int n) {
        return false;
    }

    public MJs(Minecraft minecraft, Qnq qnq, vwN vwN2, fzy fzy2) {
        super(minecraft, qnq, vwN2, 0);
        this.field_37608e7_Dne = fzy2;
    }

    @Override
    public void method_a98a0660_aFZ() {
        this.field_37608e7_Dne.method_5536af4d_FWm(new Krr(this.field_20257f3d_FWm.field_2092ae_Dne));
        this.method_5c9281c_f_();
    }

    @Override
    public JiM method_21b69c9d_Dne(boolean bl) {
        int n = bl ? 3 : 4;
        this.field_37608e7_Dne.method_5536af4d_FWm(new Wbc(n, 0, 0, 0, 0));
        return null;
    }

    @Override
    public void method_ce7f5da9_Dne(int n) {
    }
}

