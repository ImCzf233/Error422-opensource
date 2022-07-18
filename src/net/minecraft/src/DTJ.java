package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class DTJ
extends zKP {
    private gDn[] field_836bfe96_Dne;
    public static final String[] field_f5e54dca_Dne = new String[]{"default", "mossy", "cracked", "chiseled"};
    public static final String[] field_1e416769_FWm = new String[]{"stonebricksmooth", "stonebricksmooth_mossy", "stonebricksmooth_cracked", "stonebricksmooth_carved"};

    @Override
    public int method_ce7f5d9c_Dne(int n) {
        return n;
    }

    public DTJ(int n) {
        super(n, KFd.field_712c8169_aFZ);
        this.method_82a88d64_Dne(JcN.field_368f2f7_Dne);
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        this.field_836bfe96_Dne = new gDn[field_1e416769_FWm.length];
        for (int i = 0; i < this.field_836bfe96_Dne.length; ++i) {
            this.field_836bfe96_Dne[i] = rbp.method_285881e4_Dne(field_1e416769_FWm[i]);
        }
    }

    @Override
    public void method_d88f4bf4_Dne(int n, JcN jcN, List list) {
        for (int i = 0; i < 4; ++i) {
            list.add(new NMq(n, 1, i));
        }
    }

    @Override
    public gDn method_9051f17a_Dne(int n, int n2) {
        if (n2 < 0 || n2 >= field_1e416769_FWm.length) {
            n2 = 0;
        }
        return this.field_836bfe96_Dne[n2];
    }
}

