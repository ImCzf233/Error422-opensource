package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class fzJ
extends MdS {
    private gDn[] field_836bfe96_Dne;

    @Override
    protected int method_907a9d14_Qnq() {
        return dEr.field_943cf072_dYY.field_267cf5_Qnq;
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        this.field_836bfe96_Dne = new gDn[4];
        for (int i = 0; i < this.field_836bfe96_Dne.length; ++i) {
            this.field_836bfe96_Dne[i] = rbp.method_285881e4_Dne("carrots_" + i);
        }
    }

    public fzJ(int n) {
        super(n);
    }

    @Override
    protected int method_ae128dba_bzF() {
        return dEr.field_943cf072_dYY.field_267cf5_Qnq;
    }

    @Override
    public gDn method_9051f17a_Dne(int n, int n2) {
        if (n2 < 7) {
            if (n2 == 6) {
                n2 = 5;
            }
            return this.field_836bfe96_Dne[n2 >> 1];
        }
        return this.field_836bfe96_Dne[3];
    }
}

