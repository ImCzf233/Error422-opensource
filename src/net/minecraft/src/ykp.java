package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class ykp
extends ram {
    private int field_2092ae_Dne = -1;

    public ykp(opc opc2, int n, Random random, CLK cLK, int n2) {
        super(opc2, n);
        this.field_2d29f4_aFZ = n2;
        this.field_3656daa_Dne = cLK;
    }

    @Override
    public boolean method_f28ef3a4_Dne(Qnq qnq, Random random, CLK cLK) {
        int n;
        int n2;
        int n3;
        int n4;
        if (this.field_2092ae_Dne < 0) {
            this.field_2092ae_Dne = this.method_d2c2fe3f_Dne(qnq, cLK);
            if (this.field_2092ae_Dne < 0) {
                return true;
            }
            this.field_3656daa_Dne.method_2c2cf7c9_Dne(0, this.field_2092ae_Dne - this.field_3656daa_Dne.field_2d29f4_aFZ + 7 - 1, 0);
        }
        this.method_3d7d4888_Dne(qnq, cLK, 1, 1, 1, 7, 4, 4, 0, 0, false);
        this.method_3d7d4888_Dne(qnq, cLK, 2, 1, 6, 8, 4, 10, 0, 0, false);
        this.method_3d7d4888_Dne(qnq, cLK, 2, 0, 5, 8, 0, 10, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 1, 0, 1, 7, 0, 4, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 0, 0, 0, 0, 3, 5, zKP.field_75c638da_bzF.field_21260d_FWm, zKP.field_75c638da_bzF.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 8, 0, 0, 8, 3, 10, zKP.field_75c638da_bzF.field_21260d_FWm, zKP.field_75c638da_bzF.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 1, 0, 0, 7, 2, 0, zKP.field_75c638da_bzF.field_21260d_FWm, zKP.field_75c638da_bzF.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 1, 0, 5, 2, 1, 5, zKP.field_75c638da_bzF.field_21260d_FWm, zKP.field_75c638da_bzF.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 2, 0, 6, 2, 3, 10, zKP.field_75c638da_bzF.field_21260d_FWm, zKP.field_75c638da_bzF.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 3, 0, 10, 7, 3, 10, zKP.field_75c638da_bzF.field_21260d_FWm, zKP.field_75c638da_bzF.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 1, 2, 0, 7, 3, 0, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 1, 2, 5, 2, 3, 5, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 0, 4, 1, 8, 4, 1, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 0, 4, 4, 3, 4, 4, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 0, 5, 2, 8, 5, 3, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, false);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, 0, 0, 4, 2, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, 0, 0, 4, 3, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, 0, 8, 4, 2, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, 0, 8, 4, 3, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, 0, 8, 4, 4, cLK);
        int n5 = this.method_73b4985a_bzF(zKP.field_7a2b5882_One.field_21260d_FWm, 3);
        int n6 = this.method_73b4985a_bzF(zKP.field_7a2b5882_One.field_21260d_FWm, 2);
        for (n4 = -1; n4 <= 2; ++n4) {
            for (n3 = 0; n3 <= 8; ++n3) {
                this.method_b5ae8f6f_Dne(qnq, zKP.field_7a2b5882_One.field_21260d_FWm, n5, n3, 4 + n4, n4, cLK);
                if (n4 <= -1 && n3 > 1 || n4 <= 0 && n3 > 3 || n4 <= 1 && n3 > 4 && n3 < 6) continue;
                this.method_b5ae8f6f_Dne(qnq, zKP.field_7a2b5882_One.field_21260d_FWm, n6, n3, 4 + n4, 5 - n4, cLK);
            }
        }
        this.method_3d7d4888_Dne(qnq, cLK, 3, 4, 5, 3, 4, 10, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 7, 4, 2, 7, 4, 10, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 4, 5, 4, 4, 5, 10, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 6, 5, 4, 6, 5, 10, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 5, 6, 3, 5, 6, 10, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, false);
        n4 = this.method_73b4985a_bzF(zKP.field_7a2b5882_One.field_21260d_FWm, 0);
        for (n3 = 4; n3 >= 1; --n3) {
            this.method_b5ae8f6f_Dne(qnq, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, 0, n3, 2 + n3, 7 - n3, cLK);
            for (n2 = 8 - n3; n2 <= 10; ++n2) {
                this.method_b5ae8f6f_Dne(qnq, zKP.field_7a2b5882_One.field_21260d_FWm, n4, n3, 2 + n3, n2, cLK);
            }
        }
        n3 = this.method_73b4985a_bzF(zKP.field_7a2b5882_One.field_21260d_FWm, 1);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, 0, 6, 6, 3, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, 0, 7, 5, 4, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_7a2b5882_One.field_21260d_FWm, n3, 6, 6, 4, cLK);
        for (n2 = 6; n2 <= 8; ++n2) {
            for (n = 5; n <= 10; ++n) {
                this.method_b5ae8f6f_Dne(qnq, zKP.field_7a2b5882_One.field_21260d_FWm, n3, n2, 12 - n2, n, cLK);
            }
        }
        this.method_b5ae8f6f_Dne(qnq, zKP.field_af0f1368_udO.field_21260d_FWm, 0, 0, 2, 1, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_af0f1368_udO.field_21260d_FWm, 0, 0, 2, 4, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_8db845bb_Lab.field_21260d_FWm, 0, 0, 2, 2, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_8db845bb_Lab.field_21260d_FWm, 0, 0, 2, 3, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_af0f1368_udO.field_21260d_FWm, 0, 4, 2, 0, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_8db845bb_Lab.field_21260d_FWm, 0, 5, 2, 0, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_af0f1368_udO.field_21260d_FWm, 0, 6, 2, 0, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_af0f1368_udO.field_21260d_FWm, 0, 8, 2, 1, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_8db845bb_Lab.field_21260d_FWm, 0, 8, 2, 2, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_8db845bb_Lab.field_21260d_FWm, 0, 8, 2, 3, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_af0f1368_udO.field_21260d_FWm, 0, 8, 2, 4, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, 0, 8, 2, 5, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_af0f1368_udO.field_21260d_FWm, 0, 8, 2, 6, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_8db845bb_Lab.field_21260d_FWm, 0, 8, 2, 7, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_8db845bb_Lab.field_21260d_FWm, 0, 8, 2, 8, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_af0f1368_udO.field_21260d_FWm, 0, 8, 2, 9, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_af0f1368_udO.field_21260d_FWm, 0, 2, 2, 6, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_8db845bb_Lab.field_21260d_FWm, 0, 2, 2, 7, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_8db845bb_Lab.field_21260d_FWm, 0, 2, 2, 8, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_af0f1368_udO.field_21260d_FWm, 0, 2, 2, 9, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_af0f1368_udO.field_21260d_FWm, 0, 4, 4, 10, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_8db845bb_Lab.field_21260d_FWm, 0, 5, 4, 10, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_af0f1368_udO.field_21260d_FWm, 0, 6, 4, 10, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, 0, 5, 5, 10, cLK);
        this.method_b5ae8f6f_Dne(qnq, 0, 0, 2, 1, 0, cLK);
        this.method_b5ae8f6f_Dne(qnq, 0, 0, 2, 2, 0, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_954cd4c3_Wwe.field_21260d_FWm, 0, 2, 3, 1, cLK);
        this.method_763ab4f8_Dne(qnq, cLK, random, 2, 1, 0, this.method_73b4985a_bzF(zKP.field_ceacd6d_ICU.field_21260d_FWm, 1));
        this.method_3d7d4888_Dne(qnq, cLK, 1, 0, -1, 3, 2, -1, 0, 0, false);
        if (this.method_3b27a7c2_Dne(qnq, 2, 0, -1, cLK) == 0 && this.method_3b27a7c2_Dne(qnq, 2, -1, -1, cLK) != 0) {
            this.method_b5ae8f6f_Dne(qnq, zKP.field_91df3208_BJH.field_21260d_FWm, this.method_73b4985a_bzF(zKP.field_91df3208_BJH.field_21260d_FWm, 3), 2, 0, -1, cLK);
        }
        for (n2 = 0; n2 < 5; ++n2) {
            for (n = 0; n < 9; ++n) {
                this.method_3b27a7cf_Dne(qnq, n, 7, n2, cLK);
                this.method_6ca945f0_FWm(qnq, zKP.field_75c638da_bzF.field_21260d_FWm, 0, n, -1, n2, cLK);
            }
        }
        for (n2 = 5; n2 < 11; ++n2) {
            for (n = 2; n < 9; ++n) {
                this.method_3b27a7cf_Dne(qnq, n, 7, n2, cLK);
                this.method_6ca945f0_FWm(qnq, zKP.field_75c638da_bzF.field_21260d_FWm, 0, n, -1, n2, cLK);
            }
        }
        this.method_d749210c_Dne(qnq, cLK, 4, 1, 2, 2);
        return true;
    }

    public static ykp method_920c60f4_Dne(opc opc2, List list, Random random, int n, int n2, int n3, int n4, int n5) {
        CLK cLK = CLK.method_286c569_Dne(n, n2, n3, 0, 0, 0, 9, 7, 12, n4);
        return ykp.method_697d22a9_Dne(cLK) && bvz.method_9e83199f_Dne(list, cLK) == null ? new ykp(opc2, n5, random, cLK, n4) : null;
    }
}

