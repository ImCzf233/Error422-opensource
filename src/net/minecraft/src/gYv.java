package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class gYv
extends iDn {
    @Override
    public void method_dbe42dde_Dne(bvz bvz2, List list, Random random) {
        this.method_d1a32fbf_bzF((Tps)bvz2, list, random, 6, 2, false);
    }

    public static gYv method_5851d0b9_Dne(List list, Random random, int n, int n2, int n3, int n4, int n5) {
        CLK cLK = CLK.method_286c569_Dne(n, n2, n3, -2, 0, 0, 7, 11, 7, n4);
        return gYv.method_697d22a9_Dne(cLK) && bvz.method_9e83199f_Dne(list, cLK) == null ? new gYv(n5, random, cLK, n4) : null;
    }

    public gYv(int n, Random random, CLK cLK, int n2) {
        super(n);
        this.field_2d29f4_aFZ = n2;
        this.field_3656daa_Dne = cLK;
    }

    @Override
    public boolean method_f28ef3a4_Dne(Qnq qnq, Random random, CLK cLK) {
        this.method_3d7d4888_Dne(qnq, cLK, 0, 0, 0, 6, 1, 6, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 0, 2, 0, 6, 10, 6, 0, 0, false);
        this.method_3d7d4888_Dne(qnq, cLK, 0, 2, 0, 1, 8, 0, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 5, 2, 0, 6, 8, 0, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 0, 2, 1, 0, 8, 6, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 6, 2, 1, 6, 8, 6, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 1, 2, 6, 5, 8, 6, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 0, 3, 2, 0, 5, 4, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 6, 3, 2, 6, 5, 2, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 6, 3, 4, 6, 5, 4, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, false);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_38c5f505_iNH.field_21260d_FWm, 0, 5, 2, 5, cLK);
        this.method_3d7d4888_Dne(qnq, cLK, 4, 2, 5, 4, 3, 5, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 3, 2, 5, 3, 4, 5, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 2, 2, 5, 2, 5, 5, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 1, 2, 5, 1, 6, 5, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 1, 7, 1, 5, 7, 4, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 6, 8, 2, 6, 8, 4, 0, 0, false);
        this.method_3d7d4888_Dne(qnq, cLK, 2, 6, 0, 4, 8, 0, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 2, 5, 0, 4, 5, 0, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, false);
        for (int i = 0; i <= 6; ++i) {
            for (int j = 0; j <= 6; ++j) {
                this.method_6ca945f0_FWm(qnq, zKP.field_38c5f505_iNH.field_21260d_FWm, 0, i, -1, j, cLK);
            }
        }
        return true;
    }
}

