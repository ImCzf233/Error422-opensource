package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class jYT
extends zKP {
    private gDn field_375b13b_Dne;
    private static final String[] field_1e416769_FWm;
    public static final String[] field_f5e54dca_Dne;
    private gDn[] field_836bfe96_Dne;
    private gDn field_202f7d1a_FWm;

    public jYT(int n) {
        super(n, KFd.field_712c8169_aFZ);
        this.method_82a88d64_Dne(JcN.field_368f2f7_Dne);
    }

    @Override
    public void method_d88f4bf4_Dne(int n, JcN jcN, List list) {
        list.add(new NMq(n, 1, 0));
        list.add(new NMq(n, 1, 1));
        list.add(new NMq(n, 1, 2));
    }

    @Override
    public gDn method_9051f17a_Dne(int n, int n2) {
        if (n != 1 && (n != 0 || n2 != 1 && n2 != 2)) {
            if (n == 0) {
                return this.field_202f7d1a_FWm;
            }
            if (n2 < 0 || n2 >= this.field_836bfe96_Dne.length) {
                n2 = 0;
            }
            return this.field_836bfe96_Dne[n2];
        }
        return this.field_375b13b_Dne;
    }

    @Override
    public int method_ce7f5d9c_Dne(int n) {
        return n;
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        this.field_836bfe96_Dne = new gDn[field_1e416769_FWm.length];
        for (int i = 0; i < this.field_836bfe96_Dne.length; ++i) {
            this.field_836bfe96_Dne[i] = rbp.method_285881e4_Dne(field_1e416769_FWm[i]);
        }
        this.field_375b13b_Dne = rbp.method_285881e4_Dne("sandstone_top");
        this.field_202f7d1a_FWm = rbp.method_285881e4_Dne("sandstone_bottom");
    }

    static {
        field_f5e54dca_Dne = new String[]{"default", "chiseled", "smooth"};
        field_1e416769_FWm = new String[]{"sandstone_side", "sandstone_carved", "sandstone_smooth"};
    }
}

