package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class ZRq
extends ram {
    private int field_2092ae_Dne = -1;

    public static ZRq method_91fdebb9_Dne(opc opc2, List list, Random random, int n, int n2, int n3, int n4, int n5) {
        CLK cLK = CLK.method_286c569_Dne(n, n2, n3, 0, 0, 0, 9, 9, 6, n4);
        return ZRq.method_697d22a9_Dne(cLK) && bvz.method_9e83199f_Dne(list, cLK) == null ? new ZRq(opc2, n5, random, cLK, n4) : null;
    }

    @Override
    public boolean method_f28ef3a4_Dne(Qnq qnq, Random random, CLK cLK) {
        int n;
        int n2;
        if (this.field_2092ae_Dne < 0) {
            this.field_2092ae_Dne = this.method_d2c2fe3f_Dne(qnq, cLK);
            if (this.field_2092ae_Dne < 0) {
                return true;
            }
            this.field_3656daa_Dne.method_2c2cf7c9_Dne(0, this.field_2092ae_Dne - this.field_3656daa_Dne.field_2d29f4_aFZ + 9 - 1, 0);
        }
        this.method_3d7d4888_Dne(qnq, cLK, 1, 1, 1, 7, 5, 4, 0, 0, false);
        this.method_3d7d4888_Dne(qnq, cLK, 0, 0, 0, 8, 0, 5, zKP.field_75c638da_bzF.field_21260d_FWm, zKP.field_75c638da_bzF.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 0, 5, 0, 8, 5, 5, zKP.field_75c638da_bzF.field_21260d_FWm, zKP.field_75c638da_bzF.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 0, 6, 1, 8, 6, 4, zKP.field_75c638da_bzF.field_21260d_FWm, zKP.field_75c638da_bzF.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 0, 7, 2, 8, 7, 3, zKP.field_75c638da_bzF.field_21260d_FWm, zKP.field_75c638da_bzF.field_21260d_FWm, false);
        int n3 = this.method_73b4985a_bzF(zKP.field_7a2b5882_One.field_21260d_FWm, 3);
        int n4 = this.method_73b4985a_bzF(zKP.field_7a2b5882_One.field_21260d_FWm, 2);
        for (n2 = -1; n2 <= 2; ++n2) {
            for (n = 0; n <= 8; ++n) {
                this.method_b5ae8f6f_Dne(qnq, zKP.field_7a2b5882_One.field_21260d_FWm, n3, n, 6 + n2, n2, cLK);
                this.method_b5ae8f6f_Dne(qnq, zKP.field_7a2b5882_One.field_21260d_FWm, n4, n, 6 + n2, 5 - n2, cLK);
            }
        }
        this.method_3d7d4888_Dne(qnq, cLK, 0, 1, 0, 0, 1, 5, zKP.field_75c638da_bzF.field_21260d_FWm, zKP.field_75c638da_bzF.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 1, 1, 5, 8, 1, 5, zKP.field_75c638da_bzF.field_21260d_FWm, zKP.field_75c638da_bzF.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 8, 1, 0, 8, 1, 4, zKP.field_75c638da_bzF.field_21260d_FWm, zKP.field_75c638da_bzF.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 2, 1, 0, 7, 1, 0, zKP.field_75c638da_bzF.field_21260d_FWm, zKP.field_75c638da_bzF.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 0, 2, 0, 0, 4, 0, zKP.field_75c638da_bzF.field_21260d_FWm, zKP.field_75c638da_bzF.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 0, 2, 5, 0, 4, 5, zKP.field_75c638da_bzF.field_21260d_FWm, zKP.field_75c638da_bzF.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 8, 2, 5, 8, 4, 5, zKP.field_75c638da_bzF.field_21260d_FWm, zKP.field_75c638da_bzF.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 8, 2, 0, 8, 4, 0, zKP.field_75c638da_bzF.field_21260d_FWm, zKP.field_75c638da_bzF.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 0, 2, 1, 0, 4, 4, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 1, 2, 5, 7, 4, 5, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 8, 2, 1, 8, 4, 4, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 1, 2, 0, 7, 4, 0, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, false);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_8db845bb_Lab.field_21260d_FWm, 0, 4, 2, 0, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_8db845bb_Lab.field_21260d_FWm, 0, 5, 2, 0, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_8db845bb_Lab.field_21260d_FWm, 0, 6, 2, 0, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_8db845bb_Lab.field_21260d_FWm, 0, 4, 3, 0, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_8db845bb_Lab.field_21260d_FWm, 0, 5, 3, 0, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_8db845bb_Lab.field_21260d_FWm, 0, 6, 3, 0, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_8db845bb_Lab.field_21260d_FWm, 0, 0, 2, 2, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_8db845bb_Lab.field_21260d_FWm, 0, 0, 2, 3, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_8db845bb_Lab.field_21260d_FWm, 0, 0, 3, 2, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_8db845bb_Lab.field_21260d_FWm, 0, 0, 3, 3, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_8db845bb_Lab.field_21260d_FWm, 0, 8, 2, 2, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_8db845bb_Lab.field_21260d_FWm, 0, 8, 2, 3, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_8db845bb_Lab.field_21260d_FWm, 0, 8, 3, 2, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_8db845bb_Lab.field_21260d_FWm, 0, 8, 3, 3, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_8db845bb_Lab.field_21260d_FWm, 0, 2, 2, 5, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_8db845bb_Lab.field_21260d_FWm, 0, 3, 2, 5, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_8db845bb_Lab.field_21260d_FWm, 0, 5, 2, 5, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_8db845bb_Lab.field_21260d_FWm, 0, 6, 2, 5, cLK);
        this.method_3d7d4888_Dne(qnq, cLK, 1, 4, 1, 7, 4, 1, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 1, 4, 4, 7, 4, 4, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 1, 3, 4, 7, 3, 4, zKP.field_24a90a48_AgF.field_21260d_FWm, zKP.field_24a90a48_AgF.field_21260d_FWm, false);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, 0, 7, 1, 4, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_7a2b5882_One.field_21260d_FWm, this.method_73b4985a_bzF(zKP.field_7a2b5882_One.field_21260d_FWm, 0), 7, 1, 3, cLK);
        n2 = this.method_73b4985a_bzF(zKP.field_7a2b5882_One.field_21260d_FWm, 3);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_7a2b5882_One.field_21260d_FWm, n2, 6, 1, 4, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_7a2b5882_One.field_21260d_FWm, n2, 5, 1, 4, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_7a2b5882_One.field_21260d_FWm, n2, 4, 1, 4, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_7a2b5882_One.field_21260d_FWm, n2, 3, 1, 4, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_ce2a1dc8_sly.field_21260d_FWm, 0, 6, 1, 3, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_937cc3a2_YHU.field_21260d_FWm, 0, 6, 2, 3, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_ce2a1dc8_sly.field_21260d_FWm, 0, 4, 1, 3, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_937cc3a2_YHU.field_21260d_FWm, 0, 4, 2, 3, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_47237a3_mlD.field_21260d_FWm, 0, 7, 1, 1, cLK);
        this.method_b5ae8f6f_Dne(qnq, 0, 0, 1, 1, 0, cLK);
        this.method_b5ae8f6f_Dne(qnq, 0, 0, 1, 2, 0, cLK);
        this.method_763ab4f8_Dne(qnq, cLK, random, 1, 1, 0, this.method_73b4985a_bzF(zKP.field_ceacd6d_ICU.field_21260d_FWm, 1));
        if (this.method_3b27a7c2_Dne(qnq, 1, 0, -1, cLK) == 0 && this.method_3b27a7c2_Dne(qnq, 1, -1, -1, cLK) != 0) {
            this.method_b5ae8f6f_Dne(qnq, zKP.field_91df3208_BJH.field_21260d_FWm, this.method_73b4985a_bzF(zKP.field_91df3208_BJH.field_21260d_FWm, 3), 1, 0, -1, cLK);
        }
        for (n = 0; n < 6; ++n) {
            for (int i = 0; i < 9; ++i) {
                this.method_3b27a7cf_Dne(qnq, i, 9, n, cLK);
                this.method_6ca945f0_FWm(qnq, zKP.field_75c638da_bzF.field_21260d_FWm, 0, i, -1, n, cLK);
            }
        }
        this.method_d749210c_Dne(qnq, cLK, 2, 1, 2, 1);
        return true;
    }

    public ZRq(opc opc2, int n, Random random, CLK cLK, int n2) {
        super(opc2, n);
        this.field_2d29f4_aFZ = n2;
        this.field_3656daa_Dne = cLK;
    }

    @Override
    protected int method_117d19dd_FWm(int n) {
        return 1;
    }
}

