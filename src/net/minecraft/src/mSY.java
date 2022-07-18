package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class mSY
extends MdS {
    private gDn[] field_836bfe96_Dne;

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

    @Override
    protected int method_ae128dba_bzF() {
        return dEr.field_eb1fccc7_dnY.field_267cf5_Qnq;
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        this.field_836bfe96_Dne = new gDn[4];
        for (int i = 0; i < this.field_836bfe96_Dne.length; ++i) {
            this.field_836bfe96_Dne[i] = rbp.method_285881e4_Dne("potatoes_" + i);
        }
    }

    @Override
    public void method_86296256_Dne(Qnq qnq, int n, int n2, int n3, int n4, float f, int n5) {
        super.method_86296256_Dne(qnq, n, n2, n3, n4, f, n5);
        if (!qnq.field_2d2a05_aFZ && n4 >= 7 && qnq.field_7331eae7_Dne.nextInt(50) == 0) {
            this.method_c594b700_FWm(qnq, n, n2, n3, new NMq(dEr.field_19091838_HDz));
        }
    }

    public mSY(int n) {
        super(n);
    }

    @Override
    protected int method_907a9d14_Qnq() {
        return dEr.field_eb1fccc7_dnY.field_267cf5_Qnq;
    }
}

