package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class pam
implements MqS {
    private String field_569fcf45_Dne;
    private List field_f27c122c_Dne;
    private NMq[] field_8360c375_Dne;
    private int field_2092ae_Dne;
    private boolean field_2092bf_Dne;

    @Override
    public boolean method_703284a7_Dne(FiG fiG) {
        return true;
    }

    @Override
    public int method_a98a0653_aFZ() {
        return erC.field_2092ae_Dne;
    }

    @Override
    public int method_907a9d14_Qnq() {
        return this.field_2092ae_Dne;
    }

    @Override
    public String method_9fc39d88_b_() {
        return this.field_569fcf45_Dne;
    }

    @Override
    public NMq method_77c1cdc9_FWm(int n) {
        if (this.field_8360c375_Dne[n] != null) {
            NMq nMq = this.field_8360c375_Dne[n];
            this.field_8360c375_Dne[n] = null;
            return nMq;
        }
        return null;
    }

    @Override
    public void method_582b297_a_() {
        if (this.field_f27c122c_Dne != null) {
            for (int i = 0; i < this.field_f27c122c_Dne.size(); ++i) {
                ((XHV)this.field_f27c122c_Dne.get(i)).method_b77e98cb_Dne(this);
            }
        }
    }

    @Override
    public void method_6e3a6b66_Dne(int n, NMq nMq) {
        this.field_8360c375_Dne[n] = nMq;
        if (nMq != null && nMq.field_2092ae_Dne > this.method_a98a0653_aFZ()) {
            nMq.field_2092ae_Dne = this.method_a98a0653_aFZ();
        }
        this.method_582b297_a_();
    }

    @Override
    public boolean method_6e3a6b6a_Dne(int n, NMq nMq) {
        return true;
    }

    @Override
    public void method_ae128dc7_bzF() {
    }

    @Override
    public void method_5f36e9f_i_() {
    }

    @Override
    public NMq method_9046b659_Dne(int n, int n2) {
        if (this.field_8360c375_Dne[n] != null) {
            if (this.field_8360c375_Dne[n].field_2092ae_Dne <= n2) {
                NMq nMq = this.field_8360c375_Dne[n];
                this.field_8360c375_Dne[n] = null;
                this.method_582b297_a_();
                return nMq;
            }
            NMq nMq = this.field_8360c375_Dne[n].method_9e6e1a08_Dne(n2);
            if (this.field_8360c375_Dne[n].field_2092ae_Dne == 0) {
                this.field_8360c375_Dne[n] = null;
            }
            this.method_582b297_a_();
            return nMq;
        }
        return null;
    }

    @Override
    public boolean method_5acf91e_d_() {
        return this.field_2092bf_Dne;
    }

    public pam(String string, boolean bl, int n) {
        this.field_569fcf45_Dne = string;
        this.field_2092bf_Dne = bl;
        this.field_2092ae_Dne = n;
        this.field_8360c375_Dne = new NMq[n];
    }

    @Override
    public NMq method_9e6e1a08_Dne(int n) {
        return this.field_8360c375_Dne[n];
    }
}

