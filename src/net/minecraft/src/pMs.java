package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class pMs
extends ram {
    private final boolean field_2092bf_Dne;
    private final int field_21260d_FWm;
    private int field_2092ae_Dne = -1;

    public pMs(opc opc2, int n, Random random, CLK cLK, int n2) {
        super(opc2, n);
        this.field_2d29f4_aFZ = n2;
        this.field_3656daa_Dne = cLK;
        this.field_2092bf_Dne = random.nextBoolean();
        this.field_21260d_FWm = random.nextInt(3);
    }

    @Override
    public boolean method_f28ef3a4_Dne(Qnq qnq, Random random, CLK cLK) {
        if (this.field_2092ae_Dne < 0) {
            this.field_2092ae_Dne = this.method_d2c2fe3f_Dne(qnq, cLK);
            if (this.field_2092ae_Dne < 0) {
                return true;
            }
            this.field_3656daa_Dne.method_2c2cf7c9_Dne(0, this.field_2092ae_Dne - this.field_3656daa_Dne.field_2d29f4_aFZ + 6 - 1, 0);
        }
        this.method_3d7d4888_Dne(qnq, cLK, 1, 1, 1, 3, 5, 4, 0, 0, false);
        this.method_3d7d4888_Dne(qnq, cLK, 0, 0, 0, 3, 0, 4, zKP.field_75c638da_bzF.field_21260d_FWm, zKP.field_75c638da_bzF.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 1, 0, 1, 2, 0, 3, zKP.field_203836cc_FWm.field_21260d_FWm, zKP.field_203836cc_FWm.field_21260d_FWm, false);
        if (this.field_2092bf_Dne) {
            this.method_3d7d4888_Dne(qnq, cLK, 1, 4, 1, 2, 4, 3, zKP.field_af0f1368_udO.field_21260d_FWm, zKP.field_af0f1368_udO.field_21260d_FWm, false);
        } else {
            this.method_3d7d4888_Dne(qnq, cLK, 1, 5, 1, 2, 5, 3, zKP.field_af0f1368_udO.field_21260d_FWm, zKP.field_af0f1368_udO.field_21260d_FWm, false);
        }
        this.method_b5ae8f6f_Dne(qnq, zKP.field_af0f1368_udO.field_21260d_FWm, 0, 1, 4, 0, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_af0f1368_udO.field_21260d_FWm, 0, 2, 4, 0, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_af0f1368_udO.field_21260d_FWm, 0, 1, 4, 4, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_af0f1368_udO.field_21260d_FWm, 0, 2, 4, 4, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_af0f1368_udO.field_21260d_FWm, 0, 0, 4, 1, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_af0f1368_udO.field_21260d_FWm, 0, 0, 4, 2, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_af0f1368_udO.field_21260d_FWm, 0, 0, 4, 3, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_af0f1368_udO.field_21260d_FWm, 0, 3, 4, 1, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_af0f1368_udO.field_21260d_FWm, 0, 3, 4, 2, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_af0f1368_udO.field_21260d_FWm, 0, 3, 4, 3, cLK);
        this.method_3d7d4888_Dne(qnq, cLK, 0, 1, 0, 0, 3, 0, zKP.field_af0f1368_udO.field_21260d_FWm, zKP.field_af0f1368_udO.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 3, 1, 0, 3, 3, 0, zKP.field_af0f1368_udO.field_21260d_FWm, zKP.field_af0f1368_udO.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 0, 1, 4, 0, 3, 4, zKP.field_af0f1368_udO.field_21260d_FWm, zKP.field_af0f1368_udO.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 3, 1, 4, 3, 3, 4, zKP.field_af0f1368_udO.field_21260d_FWm, zKP.field_af0f1368_udO.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 0, 1, 1, 0, 3, 3, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 3, 1, 1, 3, 3, 3, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 1, 1, 0, 2, 3, 0, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 1, 1, 4, 2, 3, 4, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, false);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_8db845bb_Lab.field_21260d_FWm, 0, 0, 2, 2, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_8db845bb_Lab.field_21260d_FWm, 0, 3, 2, 2, cLK);
        if (this.field_21260d_FWm > 0) {
            this.method_b5ae8f6f_Dne(qnq, zKP.field_ce2a1dc8_sly.field_21260d_FWm, 0, this.field_21260d_FWm, 1, 3, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_937cc3a2_YHU.field_21260d_FWm, 0, this.field_21260d_FWm, 2, 3, cLK);
        }
        this.method_b5ae8f6f_Dne(qnq, 0, 0, 1, 1, 0, cLK);
        this.method_b5ae8f6f_Dne(qnq, 0, 0, 1, 2, 0, cLK);
        this.method_763ab4f8_Dne(qnq, cLK, random, 1, 1, 0, this.method_73b4985a_bzF(zKP.field_ceacd6d_ICU.field_21260d_FWm, 1));
        if (this.method_3b27a7c2_Dne(qnq, 1, 0, -1, cLK) == 0 && this.method_3b27a7c2_Dne(qnq, 1, -1, -1, cLK) != 0) {
            this.method_b5ae8f6f_Dne(qnq, zKP.field_91df3208_BJH.field_21260d_FWm, this.method_73b4985a_bzF(zKP.field_91df3208_BJH.field_21260d_FWm, 3), 1, 0, -1, cLK);
        }
        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j < 4; ++j) {
                this.method_3b27a7cf_Dne(qnq, j, 6, i, cLK);
                this.method_6ca945f0_FWm(qnq, zKP.field_75c638da_bzF.field_21260d_FWm, 0, j, -1, i, cLK);
            }
        }
        this.method_d749210c_Dne(qnq, cLK, 1, 1, 2, 1);
        return true;
    }

    public static pMs method_9207d95c_Dne(opc opc2, List list, Random random, int n, int n2, int n3, int n4, int n5) {
        CLK cLK = CLK.method_286c569_Dne(n, n2, n3, 0, 0, 0, 4, 6, 5, n4);
        return pMs.method_697d22a9_Dne(cLK) && bvz.method_9e83199f_Dne(list, cLK) == null ? new pMs(opc2, n5, random, cLK, n4) : null;
    }
}

