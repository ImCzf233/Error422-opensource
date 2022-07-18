package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class hLS
extends dNT {
    private gDn field_375b13b_Dne;
    public static final String[] field_f5e54dca_Dne = new String[]{"stone", "sand", "wood", "cobble", "brick", "smoothStoneBrick", "netherBrick", "quartz"};

    public hLS(int n, boolean bl) {
        super(n, bl, KFd.field_712c8169_aFZ);
        this.method_82a88d64_Dne(JcN.field_368f2f7_Dne);
    }

    @Override
    public gDn method_9051f17a_Dne(int n, int n2) {
        int n3 = n2 & 7;
        if (this.field_2092bf_Dne && (n2 & 8) != 0) {
            n = 1;
        }
        return n3 == 0 ? (n != 1 && n != 0 ? this.field_375b13b_Dne : this.field_5e5f2002_Qnq) : (n3 == 1 ? zKP.field_850fb0c5_ceE.method_77cd08ea_FWm(n) : (n3 == 2 ? zKP.field_5e67d9b4_Qnq.method_77cd08ea_FWm(n) : (n3 == 3 ? zKP.field_75c638da_bzF.method_77cd08ea_FWm(n) : (n3 == 4 ? zKP.field_80184b8_tgc.method_77cd08ea_FWm(n) : (n3 == 5 ? zKP.field_39272339_WvN.method_9051f17a_Dne(n, 0) : (n3 == 6 ? zKP.field_38c5f505_iNH.method_77cd08ea_FWm(1) : (n3 == 7 ? zKP.field_212fd45c_PpL.method_77cd08ea_FWm(n) : this.field_5e5f2002_Qnq)))))));
    }

    @Override
    protected NMq method_9e6e1a08_Dne(int n) {
        return new NMq(zKP.field_202e4261_FWm.field_21260d_FWm, 2, n & 7);
    }

    @Override
    public String method_2c0e7e17_Dne(int n) {
        if (n < 0 || n >= field_f5e54dca_Dne.length) {
            n = 0;
        }
        return super.method_6859cdb9_bzF() + "." + field_f5e54dca_Dne[n];
    }

    @Override
    public int method_24763341_Dne(int n, Random random, int n2) {
        return zKP.field_202e4261_FWm.field_21260d_FWm;
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        this.field_5e5f2002_Qnq = rbp.method_285881e4_Dne("stoneslab_top");
        this.field_375b13b_Dne = rbp.method_285881e4_Dne("stoneslab_side");
    }

    @Override
    public void method_d88f4bf4_Dne(int n, JcN jcN, List list) {
        if (n != zKP.field_3747682_Dne.field_21260d_FWm) {
            for (int i = 0; i <= 7; ++i) {
                if (i == 2) continue;
                list.add(new NMq(n, 1, i));
            }
        }
    }
}

