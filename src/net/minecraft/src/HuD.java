package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class HuD
implements MqS {
    private NMq[] field_8360c375_Dne = new NMq[1];

    @Override
    public NMq method_77c1cdc9_FWm(int n) {
        if (this.field_8360c375_Dne[0] != null) {
            NMq nMq = this.field_8360c375_Dne[0];
            this.field_8360c375_Dne[0] = null;
            return nMq;
        }
        return null;
    }

    @Override
    public void method_ae128dc7_bzF() {
    }

    @Override
    public boolean method_6e3a6b6a_Dne(int n, NMq nMq) {
        return true;
    }

    @Override
    public int method_907a9d14_Qnq() {
        return 1;
    }

    @Override
    public boolean method_5acf91e_d_() {
        return false;
    }

    @Override
    public void method_6e3a6b66_Dne(int n, NMq nMq) {
        this.field_8360c375_Dne[0] = nMq;
    }

    @Override
    public boolean method_703284a7_Dne(FiG fiG) {
        return true;
    }

    @Override
    public void method_582b297_a_() {
    }

    @Override
    public void method_5f36e9f_i_() {
    }

    @Override
    public NMq method_9046b659_Dne(int n, int n2) {
        if (this.field_8360c375_Dne[0] != null) {
            NMq nMq = qxi_0.field_202441f9_FWm != null || eCD.method_ce7f5d9c_Dne(200) == 0 ? qxi_0.method_23040479_Dne() : this.field_8360c375_Dne[0];
            this.field_8360c375_Dne[0] = null;
            return nMq;
        }
        return null;
    }

    @Override
    public int method_a98a0653_aFZ() {
        return erC.field_2092ae_Dne;
    }

    @Override
    public NMq method_9e6e1a08_Dne(int n) {
        return this.field_8360c375_Dne[0];
    }

    @Override
    public String method_9fc39d88_b_() {
        return "Result";
    }
}

