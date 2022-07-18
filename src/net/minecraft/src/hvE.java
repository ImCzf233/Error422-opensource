package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

abstract class hvE
extends bvz {
    protected final int field_21260d_FWm;
    protected final int field_2092ae_Dne;
    protected final int field_2e5f1b_bzF;
    protected int field_267cf5_Qnq = -1;

    protected boolean method_859d3e3b_Dne(Qnq qnq, CLK cLK, int n) {
        if (this.field_267cf5_Qnq >= 0) {
            return true;
        }
        int n2 = 0;
        int n3 = 0;
        for (int i = this.field_3656daa_Dne.field_2e5f1b_bzF; i <= this.field_3656daa_Dne.field_388da6_zGp; ++i) {
            for (int j = this.field_3656daa_Dne.field_2092ae_Dne; j <= this.field_3656daa_Dne.field_267cf5_Qnq; ++j) {
                if (!cLK.method_2c2cf7cd_Dne(j, 64, i)) continue;
                n2 += Math.max(qnq.method_6f304eb3_aFZ(j, i), qnq.field_3690d00_Dne.method_7a46288d_Dne());
                ++n3;
            }
        }
        if (n3 == 0) {
            return false;
        }
        this.field_267cf5_Qnq = n2 / n3;
        this.field_3656daa_Dne.method_2c2cf7c9_Dne(0, this.field_267cf5_Qnq - this.field_3656daa_Dne.field_21260d_FWm + n, 0);
        return true;
    }

    protected hvE(Random random, int n, int n2, int n3, int n4, int n5, int n6) {
        super(0);
        this.field_2092ae_Dne = n4;
        this.field_21260d_FWm = n5;
        this.field_2e5f1b_bzF = n6;
        this.field_2d29f4_aFZ = random.nextInt(4);
        switch (this.field_2d29f4_aFZ) {
            case 0: 
            case 2: {
                this.field_3656daa_Dne = new CLK(n, n2, n3, n + n4 - 1, n2 + n5 - 1, n3 + n6 - 1);
                break;
            }
            default: {
                this.field_3656daa_Dne = new CLK(n, n2, n3, n + n6 - 1, n2 + n5 - 1, n3 + n4 - 1);
            }
        }
    }
}

