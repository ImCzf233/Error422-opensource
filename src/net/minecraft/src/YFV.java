package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class YFV
extends kuW {
    @Override
    public boolean method_f28ef3a4_Dne(Qnq qnq, Random random, CLK cLK) {
        if (this.method_d2c2fe50_Dne(qnq, cLK)) {
            return false;
        }
        this.method_294f1b74_Dne(qnq, cLK, 0, 0, 0, 4, 4, 4, true, random, dlc.method_230133f7_Dne());
        this.method_f04c7bae_Dne(qnq, random, cLK, this.field_36c3ea0_Dne, 1, 1, 0);
        if (this.field_2d29f4_aFZ != 2 && this.field_2d29f4_aFZ != 3) {
            this.method_3d7d4888_Dne(qnq, cLK, 0, 1, 1, 0, 3, 3, 0, 0, false);
        } else {
            this.method_3d7d4888_Dne(qnq, cLK, 4, 1, 1, 4, 3, 3, 0, 0, false);
        }
        return true;
    }

    @Override
    public void method_dbe42dde_Dne(bvz bvz2, List list, Random random) {
        if (this.field_2d29f4_aFZ != 2 && this.field_2d29f4_aFZ != 3) {
            this.method_784619f_FWm((Kci)bvz2, list, random, 1, 1);
        } else {
            this.method_86f6e2d1_bzF((Kci)bvz2, list, random, 1, 1);
        }
    }

    public YFV(int n, Random random, CLK cLK, int n2) {
        super(n, random, cLK, n2);
    }
}

