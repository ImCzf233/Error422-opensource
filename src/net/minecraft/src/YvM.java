package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class YvM
extends ram {
    private int field_2092ae_Dne = -1;

    @Override
    protected int method_117d19dd_FWm(int n) {
        return 2;
    }

    public YvM(opc opc2, int n, Random random, CLK cLK, int n2) {
        super(opc2, n);
        this.field_2d29f4_aFZ = n2;
        this.field_3656daa_Dne = cLK;
    }

    @Override
    public boolean method_f28ef3a4_Dne(Qnq qnq, Random random, CLK cLK) {
        int n;
        if (this.field_2092ae_Dne < 0) {
            this.field_2092ae_Dne = this.method_d2c2fe3f_Dne(qnq, cLK);
            if (this.field_2092ae_Dne < 0) {
                return true;
            }
            this.field_3656daa_Dne.method_2c2cf7c9_Dne(0, this.field_2092ae_Dne - this.field_3656daa_Dne.field_2d29f4_aFZ + 12 - 1, 0);
        }
        this.method_3d7d4888_Dne(qnq, cLK, 1, 1, 1, 3, 3, 7, 0, 0, false);
        this.method_3d7d4888_Dne(qnq, cLK, 1, 5, 1, 3, 9, 3, 0, 0, false);
        this.method_3d7d4888_Dne(qnq, cLK, 1, 0, 0, 3, 0, 8, zKP.field_75c638da_bzF.field_21260d_FWm, zKP.field_75c638da_bzF.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 1, 1, 0, 3, 10, 0, zKP.field_75c638da_bzF.field_21260d_FWm, zKP.field_75c638da_bzF.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 0, 1, 1, 0, 10, 3, zKP.field_75c638da_bzF.field_21260d_FWm, zKP.field_75c638da_bzF.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 4, 1, 1, 4, 10, 3, zKP.field_75c638da_bzF.field_21260d_FWm, zKP.field_75c638da_bzF.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 0, 0, 4, 0, 4, 7, zKP.field_75c638da_bzF.field_21260d_FWm, zKP.field_75c638da_bzF.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 4, 0, 4, 4, 4, 7, zKP.field_75c638da_bzF.field_21260d_FWm, zKP.field_75c638da_bzF.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 1, 1, 8, 3, 4, 8, zKP.field_75c638da_bzF.field_21260d_FWm, zKP.field_75c638da_bzF.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 1, 5, 4, 3, 10, 4, zKP.field_75c638da_bzF.field_21260d_FWm, zKP.field_75c638da_bzF.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 1, 5, 5, 3, 5, 7, zKP.field_75c638da_bzF.field_21260d_FWm, zKP.field_75c638da_bzF.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 0, 9, 0, 4, 9, 4, zKP.field_75c638da_bzF.field_21260d_FWm, zKP.field_75c638da_bzF.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 0, 4, 0, 4, 4, 4, zKP.field_75c638da_bzF.field_21260d_FWm, zKP.field_75c638da_bzF.field_21260d_FWm, false);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_75c638da_bzF.field_21260d_FWm, 0, 0, 11, 2, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_75c638da_bzF.field_21260d_FWm, 0, 4, 11, 2, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_75c638da_bzF.field_21260d_FWm, 0, 2, 11, 0, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_75c638da_bzF.field_21260d_FWm, 0, 2, 11, 4, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_75c638da_bzF.field_21260d_FWm, 0, 1, 1, 6, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_75c638da_bzF.field_21260d_FWm, 0, 1, 1, 7, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_75c638da_bzF.field_21260d_FWm, 0, 2, 1, 7, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_75c638da_bzF.field_21260d_FWm, 0, 3, 1, 6, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_75c638da_bzF.field_21260d_FWm, 0, 3, 1, 7, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_91df3208_BJH.field_21260d_FWm, this.method_73b4985a_bzF(zKP.field_91df3208_BJH.field_21260d_FWm, 3), 1, 1, 5, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_91df3208_BJH.field_21260d_FWm, this.method_73b4985a_bzF(zKP.field_91df3208_BJH.field_21260d_FWm, 3), 2, 1, 6, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_91df3208_BJH.field_21260d_FWm, this.method_73b4985a_bzF(zKP.field_91df3208_BJH.field_21260d_FWm, 3), 3, 1, 5, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_91df3208_BJH.field_21260d_FWm, this.method_73b4985a_bzF(zKP.field_91df3208_BJH.field_21260d_FWm, 1), 1, 2, 7, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_91df3208_BJH.field_21260d_FWm, this.method_73b4985a_bzF(zKP.field_91df3208_BJH.field_21260d_FWm, 0), 3, 2, 7, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_8db845bb_Lab.field_21260d_FWm, 0, 0, 2, 2, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_8db845bb_Lab.field_21260d_FWm, 0, 0, 3, 2, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_8db845bb_Lab.field_21260d_FWm, 0, 4, 2, 2, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_8db845bb_Lab.field_21260d_FWm, 0, 4, 3, 2, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_8db845bb_Lab.field_21260d_FWm, 0, 0, 6, 2, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_8db845bb_Lab.field_21260d_FWm, 0, 0, 7, 2, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_8db845bb_Lab.field_21260d_FWm, 0, 4, 6, 2, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_8db845bb_Lab.field_21260d_FWm, 0, 4, 7, 2, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_8db845bb_Lab.field_21260d_FWm, 0, 2, 6, 0, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_8db845bb_Lab.field_21260d_FWm, 0, 2, 7, 0, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_8db845bb_Lab.field_21260d_FWm, 0, 2, 6, 4, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_8db845bb_Lab.field_21260d_FWm, 0, 2, 7, 4, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_8db845bb_Lab.field_21260d_FWm, 0, 0, 3, 6, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_8db845bb_Lab.field_21260d_FWm, 0, 4, 3, 6, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_8db845bb_Lab.field_21260d_FWm, 0, 2, 3, 8, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_954cd4c3_Wwe.field_21260d_FWm, 0, 2, 4, 7, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_954cd4c3_Wwe.field_21260d_FWm, 0, 1, 4, 6, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_954cd4c3_Wwe.field_21260d_FWm, 0, 3, 4, 6, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_954cd4c3_Wwe.field_21260d_FWm, 0, 2, 4, 5, cLK);
        int n2 = this.method_73b4985a_bzF(zKP.field_fa1a6f1_ZfC.field_21260d_FWm, 4);
        for (n = 1; n <= 9; ++n) {
            this.method_b5ae8f6f_Dne(qnq, zKP.field_fa1a6f1_ZfC.field_21260d_FWm, n2, 3, n, 3, cLK);
        }
        this.method_b5ae8f6f_Dne(qnq, 0, 0, 2, 1, 0, cLK);
        this.method_b5ae8f6f_Dne(qnq, 0, 0, 2, 2, 0, cLK);
        this.method_763ab4f8_Dne(qnq, cLK, random, 2, 1, 0, this.method_73b4985a_bzF(zKP.field_ceacd6d_ICU.field_21260d_FWm, 1));
        if (this.method_3b27a7c2_Dne(qnq, 2, 0, -1, cLK) == 0 && this.method_3b27a7c2_Dne(qnq, 2, -1, -1, cLK) != 0) {
            this.method_b5ae8f6f_Dne(qnq, zKP.field_91df3208_BJH.field_21260d_FWm, this.method_73b4985a_bzF(zKP.field_91df3208_BJH.field_21260d_FWm, 3), 2, 0, -1, cLK);
        }
        for (n = 0; n < 9; ++n) {
            for (int i = 0; i < 5; ++i) {
                this.method_3b27a7cf_Dne(qnq, i, 12, n, cLK);
                this.method_6ca945f0_FWm(qnq, zKP.field_75c638da_bzF.field_21260d_FWm, 0, i, -1, n, cLK);
            }
        }
        this.method_d749210c_Dne(qnq, cLK, 2, 1, 2, 1);
        return true;
    }

    public static YvM method_91fdfa22_Dne(opc opc2, List list, Random random, int n, int n2, int n3, int n4, int n5) {
        CLK cLK = CLK.method_286c569_Dne(n, n2, n3, 0, 0, 0, 5, 12, 9, n4);
        return YvM.method_697d22a9_Dne(cLK) && bvz.method_9e83199f_Dne(list, cLK) == null ? new YvM(opc2, n5, random, cLK, n4) : null;
    }
}

