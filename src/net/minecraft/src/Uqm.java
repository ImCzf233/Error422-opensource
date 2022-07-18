package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class Uqm
implements MqS {
    private NMq[] field_8360c375_Dne;
    private int field_2092ae_Dne;
    private Pdb field_36bb35e_Dne;

    public NMq method_e1697ab8_FWm(int n, int n2) {
        if (n >= 0 && n < this.field_2092ae_Dne) {
            int n3 = n + n2 * this.field_2092ae_Dne;
            return this.method_9e6e1a08_Dne(n3);
        }
        return null;
    }

    @Override
    public boolean method_703284a7_Dne(FiG fiG) {
        return true;
    }

    @Override
    public int method_a98a0653_aFZ() {
        return erC.field_2092ae_Dne;
    }

    @Override
    public void method_6e3a6b66_Dne(int n, NMq nMq) {
        this.field_8360c375_Dne[n] = nMq;
        this.field_36bb35e_Dne.method_7c9aa178_Dne(this);
    }

    @Override
    public void method_582b297_a_() {
    }

    @Override
    public NMq method_9046b659_Dne(int n, int n2) {
        if (this.field_8360c375_Dne[n] != null) {
            if (this.field_8360c375_Dne[n].field_2092ae_Dne <= n2) {
                NMq nMq = this.field_8360c375_Dne[n];
                this.field_8360c375_Dne[n] = null;
                this.field_36bb35e_Dne.method_7c9aa178_Dne(this);
                return nMq;
            }
            NMq nMq = this.field_8360c375_Dne[n].method_9e6e1a08_Dne(n2);
            if (this.field_8360c375_Dne[n].field_2092ae_Dne == 0) {
                this.field_8360c375_Dne[n] = null;
            }
            this.field_36bb35e_Dne.method_7c9aa178_Dne(this);
            return nMq;
        }
        return null;
    }

    @Override
    public int method_907a9d14_Qnq() {
        return this.field_8360c375_Dne.length;
    }

    @Override
    public String method_9fc39d88_b_() {
        return "container.crafting";
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
    public boolean method_6e3a6b6a_Dne(int n, NMq nMq) {
        return true;
    }

    @Override
    public NMq method_9e6e1a08_Dne(int n) {
        return n >= this.method_907a9d14_Qnq() ? null : this.field_8360c375_Dne[n];
    }

    @Override
    public void method_ae128dc7_bzF() {
    }

    @Override
    public void method_5f36e9f_i_() {
    }

    public Uqm(Pdb pdb, int n, int n2) {
        int n3 = n * n2;
        this.field_8360c375_Dne = new NMq[n3];
        this.field_36bb35e_Dne = pdb;
        this.field_2092ae_Dne = n;
    }

    @Override
    public boolean method_5acf91e_d_() {
        return false;
    }
}

