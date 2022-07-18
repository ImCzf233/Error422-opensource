package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class OKX
extends zKP {
    public static final String[] field_1e416769_FWm;
    private gDn[] field_836bfe96_Dne;
    public static final String[] field_f5e54dca_Dne;

    public OKX(int n) {
        super(n, KFd.field_5e526bea_Qnq);
        this.method_82a88d64_Dne(JcN.field_368f2f7_Dne);
    }

    @Override
    public int method_ce7f5d9c_Dne(int n) {
        return n;
    }

    static {
        field_f5e54dca_Dne = new String[]{"oak", "spruce", "birch", "jungle"};
        field_1e416769_FWm = new String[]{"wood", "wood_spruce", "wood_birch", "wood_jungle"};
    }

    @Override
    public gDn method_9051f17a_Dne(int n, int n2) {
        if (n2 < 0 || n2 >= this.field_836bfe96_Dne.length) {
            n2 = 0;
        }
        return this.field_836bfe96_Dne[n2];
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
        list.add(new NMq(n, 1, 0));
        list.add(new NMq(n, 1, 1));
        list.add(new NMq(n, 1, 2));
        list.add(new NMq(n, 1, 3));
    }
}

