package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

/*
 * Renamed from lmZ
 */
public class lmz_0
extends iDn {
    private boolean field_2092bf_Dne;

    @Override
    public boolean method_f28ef3a4_Dne(Qnq qnq, Random random, CLK cLK) {
        int n;
        int n2;
        this.method_3d7d4888_Dne(qnq, cLK, 0, 2, 0, 6, 7, 7, 0, 0, false);
        this.method_3d7d4888_Dne(qnq, cLK, 1, 0, 0, 5, 1, 7, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 1, 2, 1, 5, 2, 7, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 1, 3, 2, 5, 3, 7, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 1, 4, 3, 5, 4, 7, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 1, 2, 0, 1, 4, 2, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 5, 2, 0, 5, 4, 2, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 1, 5, 2, 1, 5, 3, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 5, 5, 2, 5, 5, 3, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 0, 5, 3, 0, 5, 8, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 6, 5, 3, 6, 5, 8, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 1, 5, 8, 5, 5, 8, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, 0, 1, 6, 3, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, 0, 5, 6, 3, cLK);
        this.method_3d7d4888_Dne(qnq, cLK, 0, 6, 3, 0, 6, 8, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 6, 6, 3, 6, 6, 8, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 1, 6, 8, 5, 7, 8, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 2, 8, 8, 4, 8, 8, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, zKP.field_d1c4fe0e_TpV.field_21260d_FWm, false);
        if (!this.field_2092bf_Dne) {
            int n3;
            n2 = this.method_ce7f5d9c_Dne(5);
            n = this.method_16cca6d_Dne(3, 5);
            if (cLK.method_2c2cf7cd_Dne(n, n2, n3 = this.method_1e26964c_FWm(3, 5))) {
                this.field_2092bf_Dne = true;
                qnq.method_17d7ea9d_FWm(n, n2, n3, zKP.field_fdf84104_eJi.field_21260d_FWm, 0, 2);
                ySb ySb2 = (ySb)qnq.method_d98e681d_Dne(n, n2, n3);
                if (ySb2 != null) {
                    ySb2.method_2304785c_Dne().method_8f501fe4_Dne("Blaze");
                }
            }
        }
        for (n2 = 0; n2 <= 6; ++n2) {
            for (n = 0; n <= 6; ++n) {
                this.method_6ca945f0_FWm(qnq, zKP.field_38c5f505_iNH.field_21260d_FWm, 0, n2, -1, n, cLK);
            }
        }
        return true;
    }

    public static lmz_0 method_58545e44_Dne(List list, Random random, int n, int n2, int n3, int n4, int n5) {
        CLK cLK = CLK.method_286c569_Dne(n, n2, n3, -2, 0, 0, 7, 8, 9, n4);
        return lmz_0.method_697d22a9_Dne(cLK) && bvz.method_9e83199f_Dne(list, cLK) == null ? new lmz_0(n5, random, cLK, n4) : null;
    }

    public lmz_0(int n, Random random, CLK cLK, int n2) {
        super(n);
        this.field_2d29f4_aFZ = n2;
        this.field_3656daa_Dne = cLK;
    }
}

