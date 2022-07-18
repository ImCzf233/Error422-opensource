package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class Nle
extends hvE {
    private boolean field_2092bf_Dne;

    @Override
    public boolean method_f28ef3a4_Dne(Qnq qnq, Random random, CLK cLK) {
        int n;
        int n2;
        int n3;
        if (!this.method_859d3e3b_Dne(qnq, cLK, 0)) {
            return false;
        }
        this.method_d26c5728_Dne(qnq, cLK, 1, 1, 1, 5, 1, 7, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, 1, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, 1, false);
        this.method_d26c5728_Dne(qnq, cLK, 1, 4, 2, 5, 4, 7, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, 1, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, 1, false);
        this.method_d26c5728_Dne(qnq, cLK, 2, 1, 0, 4, 1, 0, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, 1, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, 1, false);
        this.method_d26c5728_Dne(qnq, cLK, 2, 2, 2, 3, 3, 2, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, 1, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, 1, false);
        this.method_d26c5728_Dne(qnq, cLK, 1, 2, 3, 1, 3, 6, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, 1, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, 1, false);
        this.method_d26c5728_Dne(qnq, cLK, 5, 2, 3, 5, 3, 6, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, 1, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, 1, false);
        this.method_d26c5728_Dne(qnq, cLK, 2, 2, 7, 4, 3, 7, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, 1, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, 1, false);
        this.method_3d7d4888_Dne(qnq, cLK, 1, 0, 2, 1, 3, 2, zKP.field_af0f1368_udO.field_21260d_FWm, zKP.field_af0f1368_udO.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 5, 0, 2, 5, 3, 2, zKP.field_af0f1368_udO.field_21260d_FWm, zKP.field_af0f1368_udO.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 1, 0, 7, 1, 3, 7, zKP.field_af0f1368_udO.field_21260d_FWm, zKP.field_af0f1368_udO.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 5, 0, 7, 5, 3, 7, zKP.field_af0f1368_udO.field_21260d_FWm, zKP.field_af0f1368_udO.field_21260d_FWm, false);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_ce2a1dc8_sly.field_21260d_FWm, 0, 2, 3, 2, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_ce2a1dc8_sly.field_21260d_FWm, 0, 3, 3, 7, cLK);
        this.method_b5ae8f6f_Dne(qnq, 0, 0, 1, 3, 4, cLK);
        this.method_b5ae8f6f_Dne(qnq, 0, 0, 5, 3, 4, cLK);
        this.method_b5ae8f6f_Dne(qnq, 0, 0, 5, 3, 5, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_eb29df59_dnY.field_21260d_FWm, 7, 1, 3, 5, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_47237a3_mlD.field_21260d_FWm, 0, 3, 2, 6, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_365161d_Dne.field_21260d_FWm, 0, 4, 2, 6, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_ce2a1dc8_sly.field_21260d_FWm, 0, 1, 2, 1, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_ce2a1dc8_sly.field_21260d_FWm, 0, 5, 2, 1, cLK);
        int n4 = this.method_73b4985a_bzF(zKP.field_7a2b5882_One.field_21260d_FWm, 3);
        int n5 = this.method_73b4985a_bzF(zKP.field_7a2b5882_One.field_21260d_FWm, 1);
        int n6 = this.method_73b4985a_bzF(zKP.field_7a2b5882_One.field_21260d_FWm, 0);
        int n7 = this.method_73b4985a_bzF(zKP.field_7a2b5882_One.field_21260d_FWm, 2);
        this.method_d26c5728_Dne(qnq, cLK, 0, 4, 1, 6, 4, 1, zKP.field_68ab5f46_CLK.field_21260d_FWm, n4, zKP.field_68ab5f46_CLK.field_21260d_FWm, n4, false);
        this.method_d26c5728_Dne(qnq, cLK, 0, 4, 2, 0, 4, 7, zKP.field_68ab5f46_CLK.field_21260d_FWm, n6, zKP.field_68ab5f46_CLK.field_21260d_FWm, n6, false);
        this.method_d26c5728_Dne(qnq, cLK, 6, 4, 2, 6, 4, 7, zKP.field_68ab5f46_CLK.field_21260d_FWm, n5, zKP.field_68ab5f46_CLK.field_21260d_FWm, n5, false);
        this.method_d26c5728_Dne(qnq, cLK, 0, 4, 8, 6, 4, 8, zKP.field_68ab5f46_CLK.field_21260d_FWm, n7, zKP.field_68ab5f46_CLK.field_21260d_FWm, n7, false);
        for (n3 = 2; n3 <= 7; n3 += 5) {
            for (n2 = 1; n2 <= 5; n2 += 4) {
                this.method_6ca945f0_FWm(qnq, zKP.field_af0f1368_udO.field_21260d_FWm, 0, n2, -1, n3, cLK);
            }
        }
        if (!this.field_2092bf_Dne && cLK.method_2c2cf7cd_Dne(n3 = this.method_16cca6d_Dne(2, 5), n2 = this.method_ce7f5d9c_Dne(2), n = this.method_1e26964c_FWm(2, 5))) {
            this.field_2092bf_Dne = true;
            bVr bVr2 = new bVr(qnq);
            bVr2.method_9ce0fc65_FWm((double)n3 + 0.5, n2, (double)n + 0.5, 0.0f, 0.0f);
            bVr2.method_80692b1a_ICU();
            qnq.method_94d18be5_FWm(bVr2);
        }
        return true;
    }

    public Nle(Random random, int n, int n2) {
        super(random, n, 64, n2, 7, 5, 9);
    }
}

