package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public abstract class DIk
extends kSJ
implements NbA {
    public DIk(Qnq qnq) {
        super(qnq);
    }

    @Override
    protected boolean method_d2ef85b3_yMz() {
        return true;
    }

    @Override
    protected int method_70328496_Dne(FiG fiG) {
        return 1 + this.field_36c4f18_Dne.field_7331eae7_Dne.nextInt(3);
    }

    @Override
    public void method_998e6629_Vxn() {
        int n = this.method_b0a28137_div();
        super.method_998e6629_Vxn();
        if (this.method_cd4cb3d9_udO() && !this.method_76dab7e2_Dne(KFd.field_1411d34d_div)) {
            this.method_df9deb60_DyG(--n);
            if (this.method_b0a28137_div() == -20) {
                this.method_df9deb60_DyG(0);
                this.method_147b2066_Dne(zBn.field_7141d10c_aFZ, 2);
            }
        } else {
            this.method_df9deb60_DyG(300);
        }
    }

    @Override
    public int method_c073daeb_mrb() {
        return 120;
    }

    @Override
    public boolean method_b5f30bf7_gnI() {
        return true;
    }

    @Override
    public boolean method_af414cf1_cot() {
        return this.field_36c4f18_Dne.method_9ed6d42c_Dne(this.field_373a3ed_Dne);
    }
}

