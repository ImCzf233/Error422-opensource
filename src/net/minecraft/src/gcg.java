package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class gcg
extends ram {
    private int field_2092ae_Dne = -1;

    public static gcg method_92041327_Dne(opc opc2, List list, Random random, int n, int n2, int n3, int n4, int n5) {
        CLK cLK = CLK.method_286c569_Dne(n, n2, n3, 0, 0, 0, 9, 7, 11, n4);
        return gcg.method_697d22a9_Dne(cLK) && bvz.method_9e83199f_Dne(list, cLK) == null ? new gcg(opc2, n5, random, cLK, n4) : null;
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
            this.field_3656daa_Dne.method_2c2cf7c9_Dne(0, this.field_2092ae_Dne - this.field_3656daa_Dne.field_2d29f4_aFZ + 7 - 1, 0);
        }
        this.method_3d7d4888_Dne(qnq, cLK, 1, 1, 1, 7, 4, 4, 0, 0, false);
        this.method_3d7d4888_Dne(qnq, cLK, 2, 1, 6, 8, 4, 10, 0, 0, false);
        this.method_3d7d4888_Dne(qnq, cLK, 2, 0, 6, 8, 0, 10, zKP.field_203836cc_FWm.field_21260d_FWm, zKP.field_203836cc_FWm.field_21260d_FWm, false);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_75c638da_bzF.field_21260d_FWm, 0, 6, 0, 6, cLK);
        this.method_3d7d4888_Dne(qnq, cLK, 2, 1, 6, 2, 1, 10, zKP.field_ce2a1dc8_sly.field_21260d_FWm, zKP.field_ce2a1dc8_sly.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 8, 1, 6, 8, 1, 10, zKP.field_ce2a1dc8_sly.field_21260d_FWm, zKP.field_ce2a1dc8_sly.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 3, 1, 10, 7, 1, 10, zKP.field_ce2a1dc8_sly.field_21260d_FWm, zKP.field_ce2a1dc8_sly.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 1, 0, 1, 7, 0, 4, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 0, 0, 0, 0, 3, 5, zKP.field_75c638da_bzF.field_21260d_FWm, zKP.field_75c638da_bzF.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 8, 0, 0, 8, 3, 5, zKP.field_75c638da_bzF.field_21260d_FWm, zKP.field_75c638da_bzF.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 1, 0, 0, 7, 1, 0, zKP.field_75c638da_bzF.field_21260d_FWm, zKP.field_75c638da_bzF.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 1, 0, 5, 7, 1, 5, zKP.field_75c638da_bzF.field_21260d_FWm, zKP.field_75c638da_bzF.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 1, 2, 0, 7, 3, 0, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 1, 2, 5, 7, 3, 5, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 0, 4, 1, 8, 4, 1, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 0, 4, 4, 8, 4, 4, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 0, 5, 2, 8, 5, 3, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, false);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, 0, 0, 4, 2, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, 0, 0, 4, 3, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, 0, 8, 4, 2, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, 0, 8, 4, 3, cLK);
        int n3 = this.method_73b4985a_bzF(zKP.field_7a2b5882_One.field_21260d_FWm, 3);
        int n4 = this.method_73b4985a_bzF(zKP.field_7a2b5882_One.field_21260d_FWm, 2);
        for (n2 = -1; n2 <= 2; ++n2) {
            for (n = 0; n <= 8; ++n) {
                this.method_b5ae8f6f_Dne(qnq, zKP.field_7a2b5882_One.field_21260d_FWm, n3, n, 4 + n2, n2, cLK);
                this.method_b5ae8f6f_Dne(qnq, zKP.field_7a2b5882_One.field_21260d_FWm, n4, n, 4 + n2, 5 - n2, cLK);
            }
        }
        this.method_b5ae8f6f_Dne(qnq, zKP.field_af0f1368_udO.field_21260d_FWm, 0, 0, 2, 1, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_af0f1368_udO.field_21260d_FWm, 0, 0, 2, 4, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_af0f1368_udO.field_21260d_FWm, 0, 8, 2, 1, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_af0f1368_udO.field_21260d_FWm, 0, 8, 2, 4, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_8db845bb_Lab.field_21260d_FWm, 0, 0, 2, 2, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_8db845bb_Lab.field_21260d_FWm, 0, 0, 2, 3, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_8db845bb_Lab.field_21260d_FWm, 0, 8, 2, 2, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_8db845bb_Lab.field_21260d_FWm, 0, 8, 2, 3, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_8db845bb_Lab.field_21260d_FWm, 0, 2, 2, 5, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_8db845bb_Lab.field_21260d_FWm, 0, 3, 2, 5, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_8db845bb_Lab.field_21260d_FWm, 0, 5, 2, 0, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_8db845bb_Lab.field_21260d_FWm, 0, 6, 2, 5, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_ce2a1dc8_sly.field_21260d_FWm, 0, 2, 1, 3, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_937cc3a2_YHU.field_21260d_FWm, 0, 2, 2, 3, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, 0, 1, 1, 4, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_7a2b5882_One.field_21260d_FWm, this.method_73b4985a_bzF(zKP.field_7a2b5882_One.field_21260d_FWm, 3), 2, 1, 4, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_7a2b5882_One.field_21260d_FWm, this.method_73b4985a_bzF(zKP.field_7a2b5882_One.field_21260d_FWm, 1), 1, 1, 3, cLK);
        this.method_3d7d4888_Dne(qnq, cLK, 5, 0, 1, 7, 0, 3, zKP.field_3747682_Dne.field_21260d_FWm, zKP.field_3747682_Dne.field_21260d_FWm, false);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_3747682_Dne.field_21260d_FWm, 0, 6, 1, 1, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_3747682_Dne.field_21260d_FWm, 0, 6, 1, 2, cLK);
        this.method_b5ae8f6f_Dne(qnq, 0, 0, 2, 1, 0, cLK);
        this.method_b5ae8f6f_Dne(qnq, 0, 0, 2, 2, 0, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_954cd4c3_Wwe.field_21260d_FWm, 0, 2, 3, 1, cLK);
        this.method_763ab4f8_Dne(qnq, cLK, random, 2, 1, 0, this.method_73b4985a_bzF(zKP.field_ceacd6d_ICU.field_21260d_FWm, 1));
        if (this.method_3b27a7c2_Dne(qnq, 2, 0, -1, cLK) == 0 && this.method_3b27a7c2_Dne(qnq, 2, -1, -1, cLK) != 0) {
            this.method_b5ae8f6f_Dne(qnq, zKP.field_91df3208_BJH.field_21260d_FWm, this.method_73b4985a_bzF(zKP.field_91df3208_BJH.field_21260d_FWm, 3), 2, 0, -1, cLK);
        }
        this.method_b5ae8f6f_Dne(qnq, 0, 0, 6, 1, 5, cLK);
        this.method_b5ae8f6f_Dne(qnq, 0, 0, 6, 2, 5, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_954cd4c3_Wwe.field_21260d_FWm, 0, 6, 3, 4, cLK);
        this.method_763ab4f8_Dne(qnq, cLK, random, 6, 1, 5, this.method_73b4985a_bzF(zKP.field_ceacd6d_ICU.field_21260d_FWm, 1));
        for (n2 = 0; n2 < 5; ++n2) {
            for (n = 0; n < 9; ++n) {
                this.method_3b27a7cf_Dne(qnq, n, 7, n2, cLK);
                this.method_6ca945f0_FWm(qnq, zKP.field_75c638da_bzF.field_21260d_FWm, 0, n, -1, n2, cLK);
            }
        }
        this.method_d749210c_Dne(qnq, cLK, 4, 1, 2, 2);
        return true;
    }

    public gcg(opc opc2, int n, Random random, CLK cLK, int n2) {
        super(opc2, n);
        this.field_2d29f4_aFZ = n2;
        this.field_3656daa_Dne = cLK;
    }

    @Override
    protected int method_117d19dd_FWm(int n) {
        return n == 0 ? 4 : 0;
    }
}

