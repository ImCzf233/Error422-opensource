package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class RMv
extends iDn {
    public RMv(int n, Random random, CLK cLK, int n2) {
        super(n);
        this.field_2d29f4_aFZ = n2;
        this.field_3656daa_Dne = cLK;
    }

    public static RMv method_584817e2_Dne(List list, Random random, int n, int n2, int n3, int n4, int n5) {
        CLK cLK = CLK.method_286c569_Dne(n, n2, n3, -5, -3, 0, 13, 14, 13, n4);
        return RMv.method_697d22a9_Dne(cLK) && bvz.method_9e83199f_Dne(list, cLK) == null ? new RMv(n5, random, cLK, n4) : null;
    }

    @Override
    public boolean method_f28ef3a4_Dne(Qnq qnq, Random random, CLK cLK) {
        int n;
        int n2;
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
        this.method_3d7d4888_Dne(qnq, cLK, 5, 8, 0, 7, 8, 0, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, false);
        for (n2 = 1; n2 <= 11; n2 += 2) {
            this.method_3d7d4888_Dne(qnq, cLK, n2, 10, 0, n2, 11, 0, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, false);
            this.method_3d7d4888_Dne(qnq, cLK, n2, 10, 12, n2, 11, 12, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, false);
            this.method_3d7d4888_Dne(qnq, cLK, 0, 10, n2, 0, 11, n2, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, false);
            this.method_3d7d4888_Dne(qnq, cLK, 12, 10, n2, 12, 11, n2, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, false);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_38c5f505_iNH.field_21260d_FWm, 0, n2, 13, 0, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_38c5f505_iNH.field_21260d_FWm, 0, n2, 13, 12, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_38c5f505_iNH.field_21260d_FWm, 0, 0, 13, n2, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_38c5f505_iNH.field_21260d_FWm, 0, 12, 13, n2, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, 0, n2 + 1, 13, 0, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, 0, n2 + 1, 13, 12, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, 0, 0, 13, n2 + 1, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, 0, 12, 13, n2 + 1, cLK);
        }
        this.method_b5ae8f6f_Dne(qnq, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, 0, 0, 13, 0, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, 0, 0, 13, 12, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, 0, 0, 13, 0, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, 0, 12, 13, 0, cLK);
        for (n2 = 3; n2 <= 9; n2 += 2) {
            this.method_3d7d4888_Dne(qnq, cLK, 1, 7, n2, 1, 8, n2, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, false);
            this.method_3d7d4888_Dne(qnq, cLK, 11, 7, n2, 11, 8, n2, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, false);
        }
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
        this.method_3d7d4888_Dne(qnq, cLK, 5, 5, 5, 7, 5, 7, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 6, 1, 6, 6, 4, 6, 0, 0, false);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_38c5f505_iNH.field_21260d_FWm, 0, 6, 0, 6, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_202dfeee_FWm.field_21260d_FWm, 0, 6, 5, 6, cLK);
        n2 = this.method_16cca6d_Dne(6, 6);
        n = this.method_ce7f5d9c_Dne(5);
        int n3 = this.method_1e26964c_FWm(6, 6);
        if (cLK.method_2c2cf7cd_Dne(n2, n, n3)) {
            qnq.field_2092bf_Dne = true;
            zKP.field_8374b848_Dne[zKP.field_202dfeee_FWm.field_21260d_FWm].method_ca828a1c_Dne(qnq, n2, n, n3, random);
            qnq.field_2092bf_Dne = false;
        }
        return true;
    }

    @Override
    public void method_dbe42dde_Dne(bvz bvz2, List list, Random random) {
        this.method_8b46d152_Dne((Tps)bvz2, list, random, 5, 3, true);
    }
}

