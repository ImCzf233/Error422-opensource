package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class yDl
extends zKP {
    private gDn[] field_836bfe96_Dne;
    private static final String[] field_1e416769_FWm;
    private gDn field_71393581_aFZ;
    public static final String[] field_f5e54dca_Dne;
    private gDn field_202f7d1a_FWm;
    private gDn field_375b13b_Dne;
    private gDn field_75bd7f28_bzF;

    @Override
    public int method_a13ce189_Dne(Qnq qnq, int n, int n2, int n3, int n4, float f, float f2, float f3, int n5) {
        if (n5 == 2) {
            switch (n4) {
                case 0: 
                case 1: {
                    n5 = 2;
                    break;
                }
                case 2: 
                case 3: {
                    n5 = 4;
                    break;
                }
                case 4: 
                case 5: {
                    n5 = 3;
                }
            }
        }
        return n5;
    }

    static {
        field_f5e54dca_Dne = new String[]{"default", "chiseled", "lines"};
        field_1e416769_FWm = new String[]{"quartzblock_side", "quartzblock_chiseled", "quartzblock_lines", null, null};
    }

    @Override
    protected NMq method_9e6e1a08_Dne(int n) {
        return n != 3 && n != 4 ? super.method_9e6e1a08_Dne(n) : new NMq(this.field_21260d_FWm, 1, 2);
    }

    public yDl(int n) {
        super(n, KFd.field_712c8169_aFZ);
        this.method_82a88d64_Dne(JcN.field_368f2f7_Dne);
    }

    @Override
    public int method_ce7f5d9c_Dne(int n) {
        return n != 3 && n != 4 ? n : 2;
    }

    @Override
    public int method_7a46288d_Dne() {
        return 39;
    }

    @Override
    public gDn method_9051f17a_Dne(int n, int n2) {
        if (n2 != 2 && n2 != 3 && n2 != 4) {
            if (n != 1 && (n != 0 || n2 != 1)) {
                if (n == 0) {
                    return this.field_71393581_aFZ;
                }
                if (n2 < 0 || n2 >= this.field_836bfe96_Dne.length) {
                    n2 = 0;
                }
                return this.field_836bfe96_Dne[n2];
            }
            return n2 == 1 ? this.field_375b13b_Dne : this.field_75bd7f28_bzF;
        }
        return n2 == 2 && (n == 1 || n == 0) ? this.field_202f7d1a_FWm : (n2 == 3 && (n == 5 || n == 4) ? this.field_202f7d1a_FWm : (n2 == 4 && (n == 2 || n == 3) ? this.field_202f7d1a_FWm : this.field_836bfe96_Dne[n2]));
    }

    @Override
    public void method_d88f4bf4_Dne(int n, JcN jcN, List list) {
        list.add(new NMq(n, 1, 0));
        list.add(new NMq(n, 1, 1));
        list.add(new NMq(n, 1, 2));
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        this.field_836bfe96_Dne = new gDn[field_1e416769_FWm.length];
        for (int i = 0; i < this.field_836bfe96_Dne.length; ++i) {
            this.field_836bfe96_Dne[i] = field_1e416769_FWm[i] == null ? this.field_836bfe96_Dne[i - 1] : rbp.method_285881e4_Dne(field_1e416769_FWm[i]);
        }
        this.field_75bd7f28_bzF = rbp.method_285881e4_Dne("quartzblock_top");
        this.field_375b13b_Dne = rbp.method_285881e4_Dne("quartzblock_chiseled_top");
        this.field_202f7d1a_FWm = rbp.method_285881e4_Dne("quartzblock_lines_top");
        this.field_71393581_aFZ = rbp.method_285881e4_Dne("quartzblock_bottom");
    }
}

