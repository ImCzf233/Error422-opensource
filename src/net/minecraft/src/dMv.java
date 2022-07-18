package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class dMv
extends ljW {
    private gDn field_375b13b_Dne;

    @Override
    public boolean method_7c6f603d_FWm() {
        return false;
    }

    public gDn method_230f3f9a_Dne() {
        return this.field_375b13b_Dne;
    }

    @Override
    public void method_ca7e4e57_Dne(Qnq qnq, int n, int n2, int n3, FUH fUH, NMq nMq) {
        super.method_ca7e4e57_Dne(qnq, n, n2, n3, fUH, nMq);
        if (nMq.method_d44b4596_zGp()) {
            ((TpA)qnq.method_d98e681d_Dne(n, n2, n3)).method_8f501fe4_Dne(nMq.method_d1f1ed87_FWm());
        }
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return false;
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        super.method_845caac7_Dne(rbp);
        this.field_375b13b_Dne = rbp.method_285881e4_Dne("beacon");
    }

    public dMv(int n) {
        super(n, KFd.field_35c85e0c_ATE);
        this.method_f1c42c0b_bzF(3.0f);
        this.method_82a88d64_Dne(JcN.field_712c773d_aFZ);
    }

    @Override
    public ipD method_c35d5be7_Dne(Qnq qnq) {
        return new TpA();
    }

    @Override
    public int method_7a46288d_Dne() {
        return 34;
    }

    @Override
    public boolean method_cb53d52e_Dne(Qnq qnq, int n, int n2, int n3, FiG fiG, int n4, float f, float f2, float f3) {
        if (qnq.field_2d2a05_aFZ) {
            return true;
        }
        TpA tpA = (TpA)qnq.method_d98e681d_Dne(n, n2, n3);
        if (tpA != null) {
            fiG.method_887647a2_Dne(tpA);
        }
        return true;
    }
}

