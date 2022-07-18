package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class xKr
extends oeq {
    private final boolean field_2092bf_Dne;
    private final RLF field_36c3ea0_Dne;
    private final boolean field_21261e_FWm;

    @Override
    public boolean method_f28ef3a4_Dne(Qnq qnq, Random random, CLK cLK) {
        if (this.method_d2c2fe50_Dne(qnq, cLK)) {
            return false;
        }
        this.method_294f1b74_Dne(qnq, cLK, 0, 0, 0, 4, 4, 6, true, random, dlc.method_230133f7_Dne());
        this.method_f04c7bae_Dne(qnq, random, cLK, this.field_36c3ea0_Dne, 1, 1, 0);
        this.method_f04c7bae_Dne(qnq, random, cLK, RLF.field_36c3ea0_Dne, 1, 1, 6);
        this.method_9acc30bb_Dne(qnq, cLK, random, 0.1f, 1, 2, 1, zKP.field_954cd4c3_Wwe.field_21260d_FWm, 0);
        this.method_9acc30bb_Dne(qnq, cLK, random, 0.1f, 3, 2, 1, zKP.field_954cd4c3_Wwe.field_21260d_FWm, 0);
        this.method_9acc30bb_Dne(qnq, cLK, random, 0.1f, 1, 2, 5, zKP.field_954cd4c3_Wwe.field_21260d_FWm, 0);
        this.method_9acc30bb_Dne(qnq, cLK, random, 0.1f, 3, 2, 5, zKP.field_954cd4c3_Wwe.field_21260d_FWm, 0);
        if (this.field_2092bf_Dne) {
            this.method_3d7d4888_Dne(qnq, cLK, 0, 1, 2, 0, 3, 4, 0, 0, false);
        }
        if (this.field_21261e_FWm) {
            this.method_3d7d4888_Dne(qnq, cLK, 4, 1, 2, 4, 3, 4, 0, 0, false);
        }
        return true;
    }

    @Override
    public void method_dbe42dde_Dne(bvz bvz2, List list, Random random) {
        this.method_3a5f42de_Dne((Kci)bvz2, list, random, 1, 1);
        if (this.field_2092bf_Dne) {
            this.method_784619f_FWm((Kci)bvz2, list, random, 1, 2);
        }
        if (this.field_21261e_FWm) {
            this.method_86f6e2d1_bzF((Kci)bvz2, list, random, 1, 2);
        }
    }

    public xKr(int n, Random random, CLK cLK, int n2) {
        super(n);
        this.field_2d29f4_aFZ = n2;
        this.field_36c3ea0_Dne = this.method_d152696b_Dne(random);
        this.field_3656daa_Dne = cLK;
        this.field_2092bf_Dne = random.nextInt(2) == 0;
        this.field_21261e_FWm = random.nextInt(2) == 0;
    }

    public static xKr method_585955fe_Dne(List list, Random random, int n, int n2, int n3, int n4, int n5) {
        CLK cLK = CLK.method_286c569_Dne(n, n2, n3, -1, -1, 0, 5, 5, 7, n4);
        return xKr.method_697d22a9_Dne(cLK) && bvz.method_9e83199f_Dne(list, cLK) == null ? new xKr(n5, random, cLK, n4) : null;
    }
}

