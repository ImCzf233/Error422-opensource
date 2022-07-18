package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class xwV
extends oeq {
    private boolean field_2092bf_Dne;
    private boolean field_21261e_FWm;
    protected final RLF field_36c3ea0_Dne;
    private boolean field_2e5f2c_bzF;
    private boolean field_267d06_Qnq;

    @Override
    public boolean method_f28ef3a4_Dne(Qnq qnq, Random random, CLK cLK) {
        if (this.method_d2c2fe50_Dne(qnq, cLK)) {
            return false;
        }
        this.method_294f1b74_Dne(qnq, cLK, 0, 0, 0, 9, 8, 10, true, random, dlc.method_230133f7_Dne());
        this.method_f04c7bae_Dne(qnq, random, cLK, this.field_36c3ea0_Dne, 4, 3, 0);
        if (this.field_2092bf_Dne) {
            this.method_3d7d4888_Dne(qnq, cLK, 0, 3, 1, 0, 5, 3, 0, 0, false);
        }
        if (this.field_2e5f2c_bzF) {
            this.method_3d7d4888_Dne(qnq, cLK, 9, 3, 1, 9, 5, 3, 0, 0, false);
        }
        if (this.field_21261e_FWm) {
            this.method_3d7d4888_Dne(qnq, cLK, 0, 5, 7, 0, 7, 9, 0, 0, false);
        }
        if (this.field_267d06_Qnq) {
            this.method_3d7d4888_Dne(qnq, cLK, 9, 5, 7, 9, 7, 9, 0, 0, false);
        }
        this.method_3d7d4888_Dne(qnq, cLK, 5, 1, 10, 7, 3, 10, 0, 0, false);
        this.method_294f1b74_Dne(qnq, cLK, 1, 2, 1, 8, 2, 6, false, random, dlc.method_230133f7_Dne());
        this.method_294f1b74_Dne(qnq, cLK, 4, 1, 5, 4, 4, 9, false, random, dlc.method_230133f7_Dne());
        this.method_294f1b74_Dne(qnq, cLK, 8, 1, 5, 8, 4, 9, false, random, dlc.method_230133f7_Dne());
        this.method_294f1b74_Dne(qnq, cLK, 1, 4, 7, 3, 4, 9, false, random, dlc.method_230133f7_Dne());
        this.method_294f1b74_Dne(qnq, cLK, 1, 3, 5, 3, 3, 6, false, random, dlc.method_230133f7_Dne());
        this.method_3d7d4888_Dne(qnq, cLK, 1, 3, 4, 3, 3, 4, zKP.field_202e4261_FWm.field_21260d_FWm, zKP.field_202e4261_FWm.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 1, 4, 6, 3, 4, 6, zKP.field_202e4261_FWm.field_21260d_FWm, zKP.field_202e4261_FWm.field_21260d_FWm, false);
        this.method_294f1b74_Dne(qnq, cLK, 5, 1, 7, 7, 1, 8, false, random, dlc.method_230133f7_Dne());
        this.method_3d7d4888_Dne(qnq, cLK, 5, 1, 9, 7, 1, 9, zKP.field_202e4261_FWm.field_21260d_FWm, zKP.field_202e4261_FWm.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 5, 2, 7, 7, 2, 7, zKP.field_202e4261_FWm.field_21260d_FWm, zKP.field_202e4261_FWm.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 4, 5, 7, 4, 5, 9, zKP.field_202e4261_FWm.field_21260d_FWm, zKP.field_202e4261_FWm.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 8, 5, 7, 8, 5, 9, zKP.field_202e4261_FWm.field_21260d_FWm, zKP.field_202e4261_FWm.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 5, 5, 7, 7, 5, 9, zKP.field_3747682_Dne.field_21260d_FWm, zKP.field_3747682_Dne.field_21260d_FWm, false);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_954cd4c3_Wwe.field_21260d_FWm, 0, 6, 5, 6, cLK);
        return true;
    }

    public xwV(int n, Random random, CLK cLK, int n2) {
        super(n);
        this.field_2d29f4_aFZ = n2;
        this.field_36c3ea0_Dne = this.method_d152696b_Dne(random);
        this.field_3656daa_Dne = cLK;
        this.field_2092bf_Dne = random.nextBoolean();
        this.field_21261e_FWm = random.nextBoolean();
        this.field_2e5f2c_bzF = random.nextBoolean();
        this.field_267d06_Qnq = random.nextInt(3) > 0;
    }

    @Override
    public void method_dbe42dde_Dne(bvz bvz2, List list, Random random) {
        int n = 3;
        int n2 = 5;
        if (this.field_2d29f4_aFZ == 1 || this.field_2d29f4_aFZ == 2) {
            n = 8 - n;
            n2 = 8 - n2;
        }
        this.method_3a5f42de_Dne((Kci)bvz2, list, random, 5, 1);
        if (this.field_2092bf_Dne) {
            this.method_784619f_FWm((Kci)bvz2, list, random, n, 1);
        }
        if (this.field_21261e_FWm) {
            this.method_784619f_FWm((Kci)bvz2, list, random, n2, 7);
        }
        if (this.field_2e5f2c_bzF) {
            this.method_86f6e2d1_bzF((Kci)bvz2, list, random, n, 1);
        }
        if (this.field_267d06_Qnq) {
            this.method_86f6e2d1_bzF((Kci)bvz2, list, random, n2, 7);
        }
    }

    public static xwV method_5859f7c6_Dne(List list, Random random, int n, int n2, int n3, int n4, int n5) {
        CLK cLK = CLK.method_286c569_Dne(n, n2, n3, -4, -3, 0, 10, 9, 11, n4);
        return xwV.method_697d22a9_Dne(cLK) && bvz.method_9e83199f_Dne(list, cLK) == null ? new xwV(n5, random, cLK, n4) : null;
    }
}

