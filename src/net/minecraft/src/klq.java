package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class klq
extends Cxd
implements wjF {
    private boolean field_2092bf_Dne = true;
    private int field_2092ae_Dne = -1;

    public klq(Qnq qnq, double d, double d2, double d3) {
        super(qnq, d, d2, d3);
    }

    @Override
    public double method_ae128db5_bzF() {
        return this.field_334487_mrb;
    }

    @Override
    public void method_5972b42b_Dne(int n, int n2, int n3, boolean bl) {
        boolean bl2;
        boolean bl3 = bl2 = !bl;
        if (bl2 != this.method_b0a28148_div()) {
            this.method_b51e1f82_zGp(bl2);
        }
    }

    public klq(Qnq qnq) {
        super(qnq);
    }

    @Override
    public int method_9a443a8c_XHL() {
        return 5;
    }

    @Override
    public Qnq method_2305dd77_Dne() {
        return this.field_36c4f18_Dne;
    }

    @Override
    protected void method_66a36cd8_FWm(WkD wkD) {
        super.method_66a36cd8_FWm(wkD);
        this.field_2092ae_Dne = wkD.method_8f501fd7_Dne("TransferCooldown");
    }

    public boolean method_8288d6f2_IjH() {
        if (Aem.method_c3dd9e38_Dne(this)) {
            return true;
        }
        List list = this.field_36c4f18_Dne.method_e7d4af05_Dne(JiM.class, this.field_373a3ed_Dne.method_b78565d7_FWm(0.25, 0.0, 0.25), pUe.field_37a074c_Dne);
        if (list.size() > 0) {
            Aem.method_993033f_Dne(this, (JiM)list.get(0));
        }
        return false;
    }

    public void method_ae438b8a_XHL(int n) {
        this.field_2092ae_Dne = n;
    }

    @Override
    public int method_c3b4a2c3_ooe() {
        return 1;
    }

    @Override
    protected void method_8d4fb917_Dne(WkD wkD) {
        super.method_8d4fb917_Dne(wkD);
        wkD.method_5ab44f9f_Dne("TransferCooldown", this.field_2092ae_Dne);
    }

    public boolean method_b0a28148_div() {
        return this.field_2092bf_Dne;
    }

    @Override
    public void method_7a46289a_Dne() {
        super.method_7a46289a_Dne();
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ && this.method_cd4cb3d9_udO() && this.method_b0a28148_div()) {
            --this.field_2092ae_Dne;
            if (!this.method_ce109fca_vSL()) {
                this.method_ae438b8a_XHL(0);
                if (this.method_8288d6f2_IjH()) {
                    this.method_ae438b8a_XHL(4);
                    this.method_582b297_a_();
                }
            }
        }
    }

    @Override
    public int method_907a9d14_Qnq() {
        return 5;
    }

    public void method_b51e1f82_zGp(boolean bl) {
        this.field_2092bf_Dne = bl;
    }

    @Override
    public double method_7c6f6027_FWm() {
        return this.field_22c5fd_IjH;
    }

    @Override
    public boolean method_21db0ca_a_(FiG fiG) {
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ) {
            fiG.method_af9331b7_Dne(this);
        }
        return true;
    }

    @Override
    public zKP method_f88e496b_FWm() {
        return zKP.field_36d4148_Dne;
    }

    public boolean method_ce109fca_vSL() {
        return this.field_2092ae_Dne > 0;
    }

    @Override
    public double method_7a462888_Dne() {
        return this.field_2f0dd3_div;
    }

    @Override
    public void method_c6daaac1_Dne(zBn zBn2) {
        super.method_c6daaac1_Dne(zBn2);
        this.method_3acd85a9_Dne(zKP.field_36d4148_Dne.field_21260d_FWm, 1, 0.0f);
    }
}

