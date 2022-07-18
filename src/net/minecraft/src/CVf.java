package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class CVf
extends ram {
    private int field_2092ae_Dne = -1;
    private final boolean field_2092bf_Dne;

    public CVf(opc opc2, int n, Random random, CLK cLK, int n2) {
        super(opc2, n);
        this.field_2d29f4_aFZ = n2;
        this.field_3656daa_Dne = cLK;
        this.field_2092bf_Dne = random.nextBoolean();
    }

    @Override
    public boolean method_f28ef3a4_Dne(Qnq qnq, Random random, CLK cLK) {
        int n;
        if (this.field_2092ae_Dne < 0) {
            this.field_2092ae_Dne = this.method_d2c2fe3f_Dne(qnq, cLK);
            if (this.field_2092ae_Dne < 0) {
                return true;
            }
            this.field_3656daa_Dne.method_2c2cf7c9_Dne(0, this.field_2092ae_Dne - this.field_3656daa_Dne.field_2d29f4_aFZ + 6 - 1, 0);
        }
        this.method_3d7d4888_Dne(qnq, cLK, 0, 0, 0, 4, 0, 4, zKP.field_75c638da_bzF.field_21260d_FWm, zKP.field_75c638da_bzF.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 0, 4, 0, 4, 4, 4, zKP.field_af0f1368_udO.field_21260d_FWm, zKP.field_af0f1368_udO.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 1, 4, 1, 3, 4, 3, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, false);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_75c638da_bzF.field_21260d_FWm, 0, 0, 1, 0, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_75c638da_bzF.field_21260d_FWm, 0, 0, 2, 0, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_75c638da_bzF.field_21260d_FWm, 0, 0, 3, 0, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_75c638da_bzF.field_21260d_FWm, 0, 4, 1, 0, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_75c638da_bzF.field_21260d_FWm, 0, 4, 2, 0, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_75c638da_bzF.field_21260d_FWm, 0, 4, 3, 0, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_75c638da_bzF.field_21260d_FWm, 0, 0, 1, 4, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_75c638da_bzF.field_21260d_FWm, 0, 0, 2, 4, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_75c638da_bzF.field_21260d_FWm, 0, 0, 3, 4, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_75c638da_bzF.field_21260d_FWm, 0, 4, 1, 4, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_75c638da_bzF.field_21260d_FWm, 0, 4, 2, 4, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_75c638da_bzF.field_21260d_FWm, 0, 4, 3, 4, cLK);
        this.method_3d7d4888_Dne(qnq, cLK, 0, 1, 1, 0, 3, 3, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 4, 1, 1, 4, 3, 3, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 1, 1, 4, 3, 3, 4, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, false);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_8db845bb_Lab.field_21260d_FWm, 0, 0, 2, 2, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_8db845bb_Lab.field_21260d_FWm, 0, 2, 2, 4, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_8db845bb_Lab.field_21260d_FWm, 0, 4, 2, 2, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, 0, 1, 1, 0, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, 0, 1, 2, 0, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, 0, 1, 3, 0, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, 0, 2, 3, 0, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, 0, 3, 3, 0, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, 0, 3, 2, 0, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, 0, 3, 1, 0, cLK);
        if (this.method_3b27a7c2_Dne(qnq, 2, 0, -1, cLK) == 0 && this.method_3b27a7c2_Dne(qnq, 2, -1, -1, cLK) != 0) {
            this.method_b5ae8f6f_Dne(qnq, zKP.field_91df3208_BJH.field_21260d_FWm, this.method_73b4985a_bzF(zKP.field_91df3208_BJH.field_21260d_FWm, 3), 2, 0, -1, cLK);
        }
        this.method_3d7d4888_Dne(qnq, cLK, 1, 1, 1, 3, 3, 3, 0, 0, false);
        if (this.field_2092bf_Dne) {
            this.method_b5ae8f6f_Dne(qnq, zKP.field_ce2a1dc8_sly.field_21260d_FWm, 0, 0, 5, 0, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_ce2a1dc8_sly.field_21260d_FWm, 0, 1, 5, 0, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_ce2a1dc8_sly.field_21260d_FWm, 0, 2, 5, 0, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_ce2a1dc8_sly.field_21260d_FWm, 0, 3, 5, 0, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_ce2a1dc8_sly.field_21260d_FWm, 0, 4, 5, 0, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_ce2a1dc8_sly.field_21260d_FWm, 0, 0, 5, 4, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_ce2a1dc8_sly.field_21260d_FWm, 0, 1, 5, 4, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_ce2a1dc8_sly.field_21260d_FWm, 0, 2, 5, 4, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_ce2a1dc8_sly.field_21260d_FWm, 0, 3, 5, 4, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_ce2a1dc8_sly.field_21260d_FWm, 0, 4, 5, 4, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_ce2a1dc8_sly.field_21260d_FWm, 0, 4, 5, 1, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_ce2a1dc8_sly.field_21260d_FWm, 0, 4, 5, 2, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_ce2a1dc8_sly.field_21260d_FWm, 0, 4, 5, 3, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_ce2a1dc8_sly.field_21260d_FWm, 0, 0, 5, 1, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_ce2a1dc8_sly.field_21260d_FWm, 0, 0, 5, 2, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_ce2a1dc8_sly.field_21260d_FWm, 0, 0, 5, 3, cLK);
        }
        if (this.field_2092bf_Dne) {
            n = this.method_73b4985a_bzF(zKP.field_fa1a6f1_ZfC.field_21260d_FWm, 3);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_fa1a6f1_ZfC.field_21260d_FWm, n, 3, 1, 3, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_fa1a6f1_ZfC.field_21260d_FWm, n, 3, 2, 3, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_fa1a6f1_ZfC.field_21260d_FWm, n, 3, 3, 3, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_fa1a6f1_ZfC.field_21260d_FWm, n, 3, 4, 3, cLK);
        }
        this.method_b5ae8f6f_Dne(qnq, zKP.field_954cd4c3_Wwe.field_21260d_FWm, 0, 2, 3, 1, cLK);
        for (n = 0; n < 5; ++n) {
            for (int i = 0; i < 5; ++i) {
                this.method_3b27a7cf_Dne(qnq, i, 6, n, cLK);
                this.method_6ca945f0_FWm(qnq, zKP.field_75c638da_bzF.field_21260d_FWm, 0, i, -1, n, cLK);
            }
        }
        this.method_d749210c_Dne(qnq, cLK, 1, 1, 2, 1);
        return true;
    }

    public static CVf method_91f384df_Dne(opc opc2, List list, Random random, int n, int n2, int n3, int n4, int n5) {
        CLK cLK = CLK.method_286c569_Dne(n, n2, n3, 0, 0, 0, 5, 6, 5, n4);
        return bvz.method_9e83199f_Dne(list, cLK) != null ? null : new CVf(opc2, n5, random, cLK, n4);
    }
}

