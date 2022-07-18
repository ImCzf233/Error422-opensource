package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class FTE
extends oeq {
    private final boolean field_2092bf_Dne;
    protected final RLF field_36c3ea0_Dne;
    private static final fKu[] field_836ba557_Dne = new fKu[]{new fKu(dEr.field_4976bda6_TKg.field_267cf5_Qnq, 0, 1, 3, 20), new fKu(dEr.field_90cb7cdd_lMz.field_267cf5_Qnq, 0, 2, 7, 20), new fKu(dEr.field_3651a1c_Dne.field_267cf5_Qnq, 0, 1, 1, 1), new fKu(dEr.field_9479d34e_Suj.field_267cf5_Qnq, 0, 1, 1, 1)};

    public FTE(int n, Random random, CLK cLK, int n2) {
        super(n);
        this.field_2d29f4_aFZ = n2;
        this.field_36c3ea0_Dne = this.method_d152696b_Dne(random);
        this.field_3656daa_Dne = cLK;
        this.field_2092bf_Dne = cLK.method_7c6f602c_FWm() > 6;
    }

    @Override
    public boolean method_f28ef3a4_Dne(Qnq qnq, Random random, CLK cLK) {
        int n;
        if (this.method_d2c2fe50_Dne(qnq, cLK)) {
            return false;
        }
        int n2 = 11;
        if (!this.field_2092bf_Dne) {
            n2 = 6;
        }
        this.method_294f1b74_Dne(qnq, cLK, 0, 0, 0, 13, n2 - 1, 14, true, random, dlc.method_230133f7_Dne());
        this.method_f04c7bae_Dne(qnq, random, cLK, this.field_36c3ea0_Dne, 4, 1, 0);
        this.method_3985c3cc_Dne(qnq, cLK, random, 0.07f, 2, 1, 1, 11, 4, 13, zKP.field_8e87c719_vSL.field_21260d_FWm, zKP.field_8e87c719_vSL.field_21260d_FWm, false);
        for (n = 1; n <= 13; ++n) {
            if ((n - 1) % 4 == 0) {
                this.method_3d7d4888_Dne(qnq, cLK, 1, 1, n, 1, 4, n, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, false);
                this.method_3d7d4888_Dne(qnq, cLK, 12, 1, n, 12, 4, n, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, false);
                this.method_b5ae8f6f_Dne(qnq, zKP.field_954cd4c3_Wwe.field_21260d_FWm, 0, 2, 3, n, cLK);
                this.method_b5ae8f6f_Dne(qnq, zKP.field_954cd4c3_Wwe.field_21260d_FWm, 0, 11, 3, n, cLK);
                if (!this.field_2092bf_Dne) continue;
                this.method_3d7d4888_Dne(qnq, cLK, 1, 6, n, 1, 9, n, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, false);
                this.method_3d7d4888_Dne(qnq, cLK, 12, 6, n, 12, 9, n, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, false);
                continue;
            }
            this.method_3d7d4888_Dne(qnq, cLK, 1, 1, n, 1, 4, n, zKP.field_24a90a48_AgF.field_21260d_FWm, zKP.field_24a90a48_AgF.field_21260d_FWm, false);
            this.method_3d7d4888_Dne(qnq, cLK, 12, 1, n, 12, 4, n, zKP.field_24a90a48_AgF.field_21260d_FWm, zKP.field_24a90a48_AgF.field_21260d_FWm, false);
            if (!this.field_2092bf_Dne) continue;
            this.method_3d7d4888_Dne(qnq, cLK, 1, 6, n, 1, 9, n, zKP.field_24a90a48_AgF.field_21260d_FWm, zKP.field_24a90a48_AgF.field_21260d_FWm, false);
            this.method_3d7d4888_Dne(qnq, cLK, 12, 6, n, 12, 9, n, zKP.field_24a90a48_AgF.field_21260d_FWm, zKP.field_24a90a48_AgF.field_21260d_FWm, false);
        }
        for (n = 3; n < 12; n += 2) {
            this.method_3d7d4888_Dne(qnq, cLK, 3, 1, n, 4, 3, n, zKP.field_24a90a48_AgF.field_21260d_FWm, zKP.field_24a90a48_AgF.field_21260d_FWm, false);
            this.method_3d7d4888_Dne(qnq, cLK, 6, 1, n, 7, 3, n, zKP.field_24a90a48_AgF.field_21260d_FWm, zKP.field_24a90a48_AgF.field_21260d_FWm, false);
            this.method_3d7d4888_Dne(qnq, cLK, 9, 1, n, 10, 3, n, zKP.field_24a90a48_AgF.field_21260d_FWm, zKP.field_24a90a48_AgF.field_21260d_FWm, false);
        }
        if (this.field_2092bf_Dne) {
            this.method_3d7d4888_Dne(qnq, cLK, 1, 5, 1, 3, 5, 13, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, false);
            this.method_3d7d4888_Dne(qnq, cLK, 10, 5, 1, 12, 5, 13, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, false);
            this.method_3d7d4888_Dne(qnq, cLK, 4, 5, 1, 9, 5, 2, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, false);
            this.method_3d7d4888_Dne(qnq, cLK, 4, 5, 12, 9, 5, 13, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, false);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, 0, 9, 5, 11, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, 0, 8, 5, 11, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, 0, 9, 5, 10, cLK);
            this.method_3d7d4888_Dne(qnq, cLK, 3, 6, 2, 3, 6, 12, zKP.field_ce2a1dc8_sly.field_21260d_FWm, zKP.field_ce2a1dc8_sly.field_21260d_FWm, false);
            this.method_3d7d4888_Dne(qnq, cLK, 10, 6, 2, 10, 6, 10, zKP.field_ce2a1dc8_sly.field_21260d_FWm, zKP.field_ce2a1dc8_sly.field_21260d_FWm, false);
            this.method_3d7d4888_Dne(qnq, cLK, 4, 6, 2, 9, 6, 2, zKP.field_ce2a1dc8_sly.field_21260d_FWm, zKP.field_ce2a1dc8_sly.field_21260d_FWm, false);
            this.method_3d7d4888_Dne(qnq, cLK, 4, 6, 12, 8, 6, 12, zKP.field_ce2a1dc8_sly.field_21260d_FWm, zKP.field_ce2a1dc8_sly.field_21260d_FWm, false);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_ce2a1dc8_sly.field_21260d_FWm, 0, 9, 6, 11, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_ce2a1dc8_sly.field_21260d_FWm, 0, 8, 6, 11, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_ce2a1dc8_sly.field_21260d_FWm, 0, 9, 6, 10, cLK);
            n = this.method_73b4985a_bzF(zKP.field_fa1a6f1_ZfC.field_21260d_FWm, 3);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_fa1a6f1_ZfC.field_21260d_FWm, n, 10, 1, 13, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_fa1a6f1_ZfC.field_21260d_FWm, n, 10, 2, 13, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_fa1a6f1_ZfC.field_21260d_FWm, n, 10, 3, 13, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_fa1a6f1_ZfC.field_21260d_FWm, n, 10, 4, 13, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_fa1a6f1_ZfC.field_21260d_FWm, n, 10, 5, 13, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_fa1a6f1_ZfC.field_21260d_FWm, n, 10, 6, 13, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_fa1a6f1_ZfC.field_21260d_FWm, n, 10, 7, 13, cLK);
            int n3 = 7;
            int n4 = 7;
            this.method_b5ae8f6f_Dne(qnq, zKP.field_ce2a1dc8_sly.field_21260d_FWm, 0, n3 - 1, 9, n4, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_ce2a1dc8_sly.field_21260d_FWm, 0, n3, 9, n4, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_ce2a1dc8_sly.field_21260d_FWm, 0, n3 - 1, 8, n4, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_ce2a1dc8_sly.field_21260d_FWm, 0, n3, 8, n4, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_ce2a1dc8_sly.field_21260d_FWm, 0, n3 - 1, 7, n4, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_ce2a1dc8_sly.field_21260d_FWm, 0, n3, 7, n4, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_ce2a1dc8_sly.field_21260d_FWm, 0, n3 - 2, 7, n4, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_ce2a1dc8_sly.field_21260d_FWm, 0, n3 + 1, 7, n4, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_ce2a1dc8_sly.field_21260d_FWm, 0, n3 - 1, 7, n4 - 1, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_ce2a1dc8_sly.field_21260d_FWm, 0, n3 - 1, 7, n4 + 1, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_ce2a1dc8_sly.field_21260d_FWm, 0, n3, 7, n4 - 1, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_ce2a1dc8_sly.field_21260d_FWm, 0, n3, 7, n4 + 1, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_954cd4c3_Wwe.field_21260d_FWm, 0, n3 - 2, 8, n4, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_954cd4c3_Wwe.field_21260d_FWm, 0, n3 + 1, 8, n4, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_954cd4c3_Wwe.field_21260d_FWm, 0, n3 - 1, 8, n4 - 1, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_954cd4c3_Wwe.field_21260d_FWm, 0, n3 - 1, 8, n4 + 1, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_954cd4c3_Wwe.field_21260d_FWm, 0, n3, 8, n4 - 1, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_954cd4c3_Wwe.field_21260d_FWm, 0, n3, 8, n4 + 1, cLK);
        }
        this.method_f8f1dd60_Dne(qnq, cLK, random, 3, 3, 5, fKu.method_3e9b7320_Dne(field_836ba557_Dne, dEr.field_374f605_Dne.method_3edb821e_Dne(random, 1, 5, 2)), 1 + random.nextInt(4));
        if (this.field_2092bf_Dne) {
            this.method_b5ae8f6f_Dne(qnq, 0, 0, 12, 9, 1, cLK);
            this.method_f8f1dd60_Dne(qnq, cLK, random, 12, 8, 1, fKu.method_3e9b7320_Dne(field_836ba557_Dne, dEr.field_374f605_Dne.method_3edb821e_Dne(random, 1, 5, 2)), 1 + random.nextInt(4));
        }
        return true;
    }

    public static FTE method_5842b7c6_Dne(List list, Random random, int n, int n2, int n3, int n4, int n5) {
        CLK cLK = CLK.method_286c569_Dne(n, n2, n3, -4, -1, 0, 14, 11, 15, n4);
        if (!(FTE.method_697d22a9_Dne(cLK) && bvz.method_9e83199f_Dne(list, cLK) == null || FTE.method_697d22a9_Dne(cLK = CLK.method_286c569_Dne(n, n2, n3, -4, -1, 0, 14, 6, 15, n4)) && bvz.method_9e83199f_Dne(list, cLK) == null)) {
            return null;
        }
        return new FTE(n5, random, cLK, n4);
    }
}

