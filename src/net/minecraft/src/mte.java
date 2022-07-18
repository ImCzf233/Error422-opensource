package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class mte
extends iDn {
    @Override
    public boolean method_f28ef3a4_Dne(Qnq qnq, Random random, CLK cLK) {
        int n = this.method_73b4985a_bzF(zKP.field_72822373_ivB.field_21260d_FWm, 2);
        for (int i = 0; i <= 9; ++i) {
            int n2 = Math.max(1, 7 - i);
            int n3 = Math.min(Math.max(n2 + 5, 14 - i), 13);
            int n4 = i;
            this.method_3d7d4888_Dne(qnq, cLK, 0, 0, i, 4, n2, i, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
            this.method_3d7d4888_Dne(qnq, cLK, 1, n2 + 1, i, 3, n3 - 1, i, 0, 0, false);
            if (i <= 6) {
                this.method_b5ae8f6f_Dne(qnq, zKP.field_72822373_ivB.field_21260d_FWm, n, 1, n2 + 1, i, cLK);
                this.method_b5ae8f6f_Dne(qnq, zKP.field_72822373_ivB.field_21260d_FWm, n, 2, n2 + 1, i, cLK);
                this.method_b5ae8f6f_Dne(qnq, zKP.field_72822373_ivB.field_21260d_FWm, n, 3, n2 + 1, i, cLK);
            }
            this.method_3d7d4888_Dne(qnq, cLK, 0, n3, i, 4, n3, i, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
            this.method_3d7d4888_Dne(qnq, cLK, 0, n2 + 1, i, 0, n3 - 1, i, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
            this.method_3d7d4888_Dne(qnq, cLK, 4, n2 + 1, i, 4, n3 - 1, i, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
            if ((i & 1) == 0) {
                this.method_3d7d4888_Dne(qnq, cLK, 0, n2 + 2, i, 0, n2 + 3, i, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, false);
                this.method_3d7d4888_Dne(qnq, cLK, 4, n2 + 2, i, 4, n2 + 3, i, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, false);
            }
            for (int j = 0; j <= 4; ++j) {
                this.method_6ca945f0_FWm(qnq, zKP.field_38c5f505_iNH.field_21260d_FWm, 0, j, -1, n4, cLK);
            }
        }
        return true;
    }

    @Override
    public void method_dbe42dde_Dne(bvz bvz2, List list, Random random) {
        this.method_8b46d152_Dne((Tps)bvz2, list, random, 1, 0, true);
    }

    public mte(int n, Random random, CLK cLK, int n2) {
        super(n);
        this.field_2d29f4_aFZ = n2;
        this.field_3656daa_Dne = cLK;
    }

    public static mte method_5854ee3f_Dne(List list, Random random, int n, int n2, int n3, int n4, int n5) {
        CLK cLK = CLK.method_286c569_Dne(n, n2, n3, -1, -7, 0, 5, 14, 10, n4);
        return mte.method_697d22a9_Dne(cLK) && bvz.method_9e83199f_Dne(list, cLK) == null ? new mte(n5, random, cLK, n4) : null;
    }
}

