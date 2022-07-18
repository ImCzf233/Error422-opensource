package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class dTk
extends zKP {
    private gDn field_202f7d1a_FWm;
    private gDn field_375b13b_Dne;

    @Override
    public boolean method_cb53d52e_Dne(Qnq qnq, int n, int n2, int n3, FiG fiG, int n4, float f, float f2, float f3) {
        if (qnq.field_2d2a05_aFZ) {
            return true;
        }
        fiG.method_2c2cf7c9_Dne(n, n2, n3);
        return true;
    }

    @Override
    public gDn method_9051f17a_Dne(int n, int n2) {
        return n == 1 ? this.field_375b13b_Dne : (n == 0 ? zKP.field_5e67d9b4_Qnq.method_77cd08ea_FWm(n) : (n != 2 && n != 4 ? this.field_5e5f2002_Qnq : this.field_202f7d1a_FWm));
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        this.field_5e5f2002_Qnq = rbp.method_285881e4_Dne("workbench_side");
        this.field_375b13b_Dne = rbp.method_285881e4_Dne("workbench_top");
        this.field_202f7d1a_FWm = rbp.method_285881e4_Dne("workbench_front");
    }

    protected dTk(int n) {
        super(n, KFd.field_5e526bea_Qnq);
        this.method_82a88d64_Dne(JcN.field_2022bed6_FWm);
    }
}

