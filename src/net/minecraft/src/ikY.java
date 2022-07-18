package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class ikY
extends iDn {
    @Override
    public boolean method_f28ef3a4_Dne(Qnq qnq, Random random, CLK cLK) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        this.method_3d7d4888_Dne(qnq, cLK, 0, 3, 0, 12, 4, 12, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 0, 5, 0, 12, 13, 12, 0, 0, false);
        this.method_3d7d4888_Dne(qnq, cLK, 0, 5, 0, 1, 12, 12, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 11, 5, 0, 12, 12, 12, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 2, 5, 11, 4, 12, 12, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 8, 5, 11, 10, 12, 12, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 5, 9, 11, 7, 12, 12, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 2, 5, 0, 4, 12, 1, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 8, 5, 0, 10, 12, 1, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 5, 9, 0, 7, 12, 1, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 2, 11, 2, 10, 12, 10, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        for (n5 = 1; n5 <= 11; n5 += 2) {
            this.method_3d7d4888_Dne(qnq, cLK, n5, 10, 0, n5, 11, 0, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, false);
            this.method_3d7d4888_Dne(qnq, cLK, n5, 10, 12, n5, 11, 12, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, false);
            this.method_3d7d4888_Dne(qnq, cLK, 0, 10, n5, 0, 11, n5, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, false);
            this.method_3d7d4888_Dne(qnq, cLK, 12, 10, n5, 12, 11, n5, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, false);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_38c5f505_iNH.field_21260d_FWm, 0, n5, 13, 0, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_38c5f505_iNH.field_21260d_FWm, 0, n5, 13, 12, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_38c5f505_iNH.field_21260d_FWm, 0, 0, 13, n5, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_38c5f505_iNH.field_21260d_FWm, 0, 12, 13, n5, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, 0, n5 + 1, 13, 0, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, 0, n5 + 1, 13, 12, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, 0, 0, 13, n5 + 1, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, 0, 12, 13, n5 + 1, cLK);
        }
        this.method_b5ae8f6f_Dne(qnq, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, 0, 0, 13, 0, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, 0, 0, 13, 12, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, 0, 0, 13, 0, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, 0, 12, 13, 0, cLK);
        for (n5 = 3; n5 <= 9; n5 += 2) {
            this.method_3d7d4888_Dne(qnq, cLK, 1, 7, n5, 1, 8, n5, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, false);
            this.method_3d7d4888_Dne(qnq, cLK, 11, 7, n5, 11, 8, n5, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, false);
        }
        n5 = this.method_73b4985a_bzF(zKP.field_72822373_ivB.field_21260d_FWm, 3);
        for (n4 = 0; n4 <= 6; ++n4) {
            n3 = n4 + 4;
            for (n2 = 5; n2 <= 7; ++n2) {
                this.method_b5ae8f6f_Dne(qnq, zKP.field_72822373_ivB.field_21260d_FWm, n5, n2, 5 + n4, n3, cLK);
            }
            if (n3 >= 5 && n3 <= 8) {
                this.method_3d7d4888_Dne(qnq, cLK, 5, 5, n3, 7, n4 + 4, n3, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
            } else if (n3 >= 9 && n3 <= 10) {
                this.method_3d7d4888_Dne(qnq, cLK, 5, 8, n3, 7, n4 + 4, n3, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
            }
            if (n4 < 1) continue;
            this.method_3d7d4888_Dne(qnq, cLK, 5, 6 + n4, n3, 7, 9 + n4, n3, 0, 0, false);
        }
        for (n4 = 5; n4 <= 7; ++n4) {
            this.method_b5ae8f6f_Dne(qnq, zKP.field_72822373_ivB.field_21260d_FWm, n5, n4, 12, 11, cLK);
        }
        this.method_3d7d4888_Dne(qnq, cLK, 5, 6, 7, 5, 7, 7, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 7, 6, 7, 7, 7, 7, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 5, 13, 12, 7, 13, 12, 0, 0, false);
        this.method_3d7d4888_Dne(qnq, cLK, 2, 5, 2, 3, 5, 3, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 2, 5, 9, 3, 5, 10, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 2, 5, 4, 2, 5, 8, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 9, 5, 2, 10, 5, 3, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 9, 5, 9, 10, 5, 10, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 10, 5, 4, 10, 5, 8, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        n4 = this.method_73b4985a_bzF(zKP.field_72822373_ivB.field_21260d_FWm, 0);
        n3 = this.method_73b4985a_bzF(zKP.field_72822373_ivB.field_21260d_FWm, 1);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_72822373_ivB.field_21260d_FWm, n3, 4, 5, 2, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_72822373_ivB.field_21260d_FWm, n3, 4, 5, 3, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_72822373_ivB.field_21260d_FWm, n3, 4, 5, 9, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_72822373_ivB.field_21260d_FWm, n3, 4, 5, 10, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_72822373_ivB.field_21260d_FWm, n4, 8, 5, 2, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_72822373_ivB.field_21260d_FWm, n4, 8, 5, 3, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_72822373_ivB.field_21260d_FWm, n4, 8, 5, 9, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_72822373_ivB.field_21260d_FWm, n4, 8, 5, 10, cLK);
        this.method_3d7d4888_Dne(qnq, cLK, 3, 4, 4, 4, 4, 8, zKP.field_9483e5e0_Suj.field_21260d_FWm, zKP.field_9483e5e0_Suj.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 8, 4, 4, 9, 4, 8, zKP.field_9483e5e0_Suj.field_21260d_FWm, zKP.field_9483e5e0_Suj.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 3, 5, 4, 4, 5, 8, zKP.field_265e038a_uzC.field_21260d_FWm, zKP.field_265e038a_uzC.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 8, 5, 4, 9, 5, 8, zKP.field_265e038a_uzC.field_21260d_FWm, zKP.field_265e038a_uzC.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 4, 2, 0, 8, 2, 12, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 0, 2, 4, 12, 2, 8, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 4, 0, 0, 8, 1, 3, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 4, 0, 9, 8, 1, 12, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 0, 0, 4, 3, 1, 8, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 9, 0, 4, 12, 1, 8, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        for (n2 = 4; n2 <= 8; ++n2) {
            for (n = 0; n <= 2; ++n) {
                this.method_6ca945f0_FWm(qnq, zKP.field_38c5f505_iNH.field_21260d_FWm, 0, n2, -1, n, cLK);
                this.method_6ca945f0_FWm(qnq, zKP.field_38c5f505_iNH.field_21260d_FWm, 0, n2, -1, 12 - n, cLK);
            }
        }
        for (n2 = 0; n2 <= 2; ++n2) {
            for (n = 4; n <= 8; ++n) {
                this.method_6ca945f0_FWm(qnq, zKP.field_38c5f505_iNH.field_21260d_FWm, 0, n2, -1, n, cLK);
                this.method_6ca945f0_FWm(qnq, zKP.field_38c5f505_iNH.field_21260d_FWm, 0, 12 - n2, -1, n, cLK);
            }
        }
        return true;
    }

    public static ikY method_5852f986_Dne(List list, Random random, int n, int n2, int n3, int n4, int n5) {
        CLK cLK = CLK.method_286c569_Dne(n, n2, n3, -5, -3, 0, 13, 14, 13, n4);
        return ikY.method_697d22a9_Dne(cLK) && bvz.method_9e83199f_Dne(list, cLK) == null ? new ikY(n5, random, cLK, n4) : null;
    }

    public ikY(int n, Random random, CLK cLK, int n2) {
        super(n);
        this.field_2d29f4_aFZ = n2;
        this.field_3656daa_Dne = cLK;
    }

    @Override
    public void method_dbe42dde_Dne(bvz bvz2, List list, Random random) {
        this.method_8b46d152_Dne((Tps)bvz2, list, random, 5, 3, true);
        this.method_8b46d152_Dne((Tps)bvz2, list, random, 5, 11, true);
    }
}

