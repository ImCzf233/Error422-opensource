package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class kQw
extends iDn {
    public kQw(int n, Random random, CLK cLK, int n2) {
        super(n);
        this.field_2d29f4_aFZ = n2;
        this.field_3656daa_Dne = cLK;
    }

    public static kQw method_5853844c_Dne(List list, Random random, int n, int n2, int n3, int n4, int n5) {
        CLK cLK = CLK.method_286c569_Dne(n, n2, n3, -1, -3, 0, 5, 10, 19, n4);
        return kQw.method_697d22a9_Dne(cLK) && bvz.method_9e83199f_Dne(list, cLK) == null ? new kQw(n5, random, cLK, n4) : null;
    }

    @Override
    public void method_dbe42dde_Dne(bvz bvz2, List list, Random random) {
        this.method_8b46d152_Dne((Tps)bvz2, list, random, 1, 3, false);
    }

    @Override
    public boolean method_f28ef3a4_Dne(Qnq qnq, Random random, CLK cLK) {
        this.method_3d7d4888_Dne(qnq, cLK, 0, 3, 0, 4, 4, 18, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 1, 5, 0, 3, 7, 18, 0, 0, false);
        this.method_3d7d4888_Dne(qnq, cLK, 0, 5, 0, 0, 5, 18, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 4, 5, 0, 4, 5, 18, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 0, 2, 0, 4, 2, 5, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 0, 2, 13, 4, 2, 18, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 0, 0, 0, 4, 1, 3, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 0, 0, 15, 4, 1, 18, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        for (int i = 0; i <= 4; ++i) {
            for (int j = 0; j <= 2; ++j) {
                this.method_6ca945f0_FWm(qnq, zKP.field_38c5f505_iNH.field_21260d_FWm, 0, i, -1, j, cLK);
                this.method_6ca945f0_FWm(qnq, zKP.field_38c5f505_iNH.field_21260d_FWm, 0, i, -1, 18 - j, cLK);
            }
        }
        this.method_3d7d4888_Dne(qnq, cLK, 0, 1, 1, 0, 4, 1, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 0, 3, 4, 0, 4, 4, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 0, 3, 14, 0, 4, 14, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 0, 1, 17, 0, 4, 17, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 4, 1, 1, 4, 4, 1, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 4, 3, 4, 4, 4, 4, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 4, 3, 14, 4, 4, 14, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 4, 1, 17, 4, 4, 17, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, false);
        return true;
    }
}

