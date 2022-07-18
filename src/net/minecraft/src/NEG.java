package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class NEG
extends iDn {
    @Override
    public void method_dbe42dde_Dne(bvz bvz2, List list, Random random) {
        int n = 1;
        if (this.field_2d29f4_aFZ == 1 || this.field_2d29f4_aFZ == 2) {
            n = 5;
        }
        this.method_62c58ab1_FWm((Tps)bvz2, list, random, 0, n, random.nextInt(8) > 0);
        this.method_d1a32fbf_bzF((Tps)bvz2, list, random, 0, n, random.nextInt(8) > 0);
    }

    public static NEG method_584622ad_Dne(List list, Random random, int n, int n2, int n3, int n4, int n5) {
        CLK cLK = CLK.method_286c569_Dne(n, n2, n3, -3, 0, 0, 9, 7, 9, n4);
        return NEG.method_697d22a9_Dne(cLK) && bvz.method_9e83199f_Dne(list, cLK) == null ? new NEG(n5, random, cLK, n4) : null;
    }

    @Override
    public boolean method_f28ef3a4_Dne(Qnq qnq, Random random, CLK cLK) {
        this.method_3d7d4888_Dne(qnq, cLK, 0, 0, 0, 8, 1, 8, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 0, 2, 0, 8, 5, 8, 0, 0, false);
        this.method_3d7d4888_Dne(qnq, cLK, 0, 6, 0, 8, 6, 5, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 0, 2, 0, 2, 5, 0, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 6, 2, 0, 8, 5, 0, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 1, 3, 0, 1, 4, 0, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 7, 3, 0, 7, 4, 0, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 0, 2, 4, 8, 2, 8, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 1, 1, 4, 2, 2, 4, 0, 0, false);
        this.method_3d7d4888_Dne(qnq, cLK, 6, 1, 4, 7, 2, 4, 0, 0, false);
        this.method_3d7d4888_Dne(qnq, cLK, 0, 3, 8, 8, 3, 8, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 0, 3, 6, 0, 3, 7, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 8, 3, 6, 8, 3, 7, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 0, 3, 4, 0, 5, 5, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 8, 3, 4, 8, 5, 5, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 1, 3, 5, 2, 5, 5, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 6, 3, 5, 7, 5, 5, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 1, 4, 5, 1, 5, 5, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 7, 4, 5, 7, 5, 5, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, false);
        for (int i = 0; i <= 5; ++i) {
            for (int j = 0; j <= 8; ++j) {
                this.method_6ca945f0_FWm(qnq, zKP.field_38c5f505_iNH.field_21260d_FWm, 0, j, -1, i, cLK);
            }
        }
        return true;
    }

    public NEG(int n, Random random, CLK cLK, int n2) {
        super(n);
        this.field_2d29f4_aFZ = n2;
        this.field_3656daa_Dne = cLK;
    }
}

