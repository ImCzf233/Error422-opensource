package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class Jmn
implements MqS {
    private final FiG field_3673728_Dne;
    private NMq[] field_8360c375_Dne = new NMq[3];
    private int field_2092ae_Dne;
    private final YzO field_3701afe_Dne;
    private Vnr field_36e9512_Dne;

    @Override
    public String method_9fc39d88_b_() {
        return "mob.villager";
    }

    @Override
    public boolean method_703284a7_Dne(FiG fiG) {
        return this.field_3701afe_Dne.method_2300c587_Dne() == fiG;
    }

    @Override
    public void method_ae128dc7_bzF() {
    }

    public void method_ce7f5da9_Dne(int n) {
        this.field_2092ae_Dne = n;
        this.method_7a46289a_Dne();
    }

    @Override
    public boolean method_6e3a6b6a_Dne(int n, NMq nMq) {
        return true;
    }

    @Override
    public void method_582b297_a_() {
        this.method_7a46289a_Dne();
    }

    public Vnr method_23082371_Dne() {
        return this.field_36e9512_Dne;
    }

    @Override
    public int method_a98a0653_aFZ() {
        return erC.field_2092ae_Dne;
    }

    @Override
    public NMq method_9046b659_Dne(int n, int n2) {
        if (this.field_8360c375_Dne[n] != null) {
            if (n == 2) {
                NMq nMq = this.field_8360c375_Dne[n];
                this.field_8360c375_Dne[n] = null;
                return nMq;
            }
            if (this.field_8360c375_Dne[n].field_2092ae_Dne <= n2) {
                NMq nMq = this.field_8360c375_Dne[n];
                this.field_8360c375_Dne[n] = null;
                if (this.method_ce7f5dad_Dne(n)) {
                    this.method_7a46289a_Dne();
                }
                return nMq;
            }
            NMq nMq = this.field_8360c375_Dne[n].method_9e6e1a08_Dne(n2);
            if (this.field_8360c375_Dne[n].field_2092ae_Dne == 0) {
                this.field_8360c375_Dne[n] = null;
            }
            if (this.method_ce7f5dad_Dne(n)) {
                this.method_7a46289a_Dne();
            }
            return nMq;
        }
        return null;
    }

    @Override
    public void method_6e3a6b66_Dne(int n, NMq nMq) {
        this.field_8360c375_Dne[n] = nMq;
        if (nMq != null && nMq.field_2092ae_Dne > this.method_a98a0653_aFZ()) {
            nMq.field_2092ae_Dne = this.method_a98a0653_aFZ();
        }
        if (this.method_ce7f5dad_Dne(n)) {
            this.method_7a46289a_Dne();
        }
    }

    public void method_7a46289a_Dne() {
        this.field_36e9512_Dne = null;
        NMq nMq = this.field_8360c375_Dne[0];
        NMq nMq2 = this.field_8360c375_Dne[1];
        if (nMq == null) {
            nMq = nMq2;
            nMq2 = null;
        }
        if (nMq == null) {
            this.method_6e3a6b66_Dne(2, null);
        } else {
            ybO ybO2 = this.field_3701afe_Dne.method_53f50aae_Dne(this.field_3673728_Dne);
            if (ybO2 != null) {
                Vnr vnr = ybO2.method_fdb87020_Dne(nMq, nMq2, this.field_2092ae_Dne);
                if (vnr != null && !vnr.method_7c6f603d_FWm()) {
                    this.field_36e9512_Dne = vnr;
                    this.method_6e3a6b66_Dne(2, vnr.method_22900b26_bzF().method_23040479_Dne());
                } else if (nMq2 != null) {
                    vnr = ybO2.method_fdb87020_Dne(nMq2, nMq, this.field_2092ae_Dne);
                    if (vnr != null && !vnr.method_7c6f603d_FWm()) {
                        this.field_36e9512_Dne = vnr;
                        this.method_6e3a6b66_Dne(2, vnr.method_22900b26_bzF().method_23040479_Dne());
                    } else {
                        this.method_6e3a6b66_Dne(2, null);
                    }
                } else {
                    this.method_6e3a6b66_Dne(2, null);
                }
            }
        }
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
    public NMq method_9e6e1a08_Dne(int n) {
        return this.field_8360c375_Dne[n];
    }

    @Override
    public int method_907a9d14_Qnq() {
        return this.field_8360c375_Dne.length;
    }

    public Jmn(FiG fiG, YzO yzO) {
        this.field_3673728_Dne = fiG;
        this.field_3701afe_Dne = yzO;
    }

    private boolean method_ce7f5dad_Dne(int n) {
        return n == 0 || n == 1;
    }

    @Override
    public boolean method_5acf91e_d_() {
        return false;
    }

    @Override
    public void method_5f36e9f_i_() {
    }
}

