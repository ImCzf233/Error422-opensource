package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class NfV
extends Oaf {
    private gDn field_375b13b_Dne;

    @Override
    protected void method_862abf73_Dne(Qnq qnq, int n, int n2, int n3, int n4, int n5, int n6) {
        if (n6 > 0 && zKP.field_8374b848_Dne[n6].method_ae128dcb_bzF() && new rKp(this, qnq, n, n2, n3).method_7a46288d_Dne() == 3) {
            this.method_f9bf47a4_Dne(qnq, n, n2, n3, false);
        }
    }

    protected NfV(int n) {
        super(n, false);
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        super.method_845caac7_Dne(rbp);
        this.field_375b13b_Dne = rbp.method_285881e4_Dne("rail_turn");
    }

    @Override
    public gDn method_9051f17a_Dne(int n, int n2) {
        return n2 >= 6 ? this.field_375b13b_Dne : this.field_5e5f2002_Qnq;
    }
}

