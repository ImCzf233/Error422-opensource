package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class dSy
extends ram {
    private int field_2092ae_Dne = -1;
    private final boolean field_2092bf_Dne = true;

    @Override
    public boolean method_f28ef3a4_Dne(Qnq qnq, Random random, CLK cLK) {
        if (this.field_2092ae_Dne < 0) {
            this.field_2092ae_Dne = this.method_d2c2fe3f_Dne(qnq, cLK);
            if (this.field_2092ae_Dne < 0) {
                return true;
            }
            this.field_3656daa_Dne.method_2c2cf7c9_Dne(0, this.field_2092ae_Dne - this.field_3656daa_Dne.field_2d29f4_aFZ + 3, 0);
        }
        this.method_3d7d4888_Dne(qnq, cLK, 1, 0, 1, 4, 12, 4, zKP.field_75c638da_bzF.field_21260d_FWm, zKP.field_374330f_Dne.field_21260d_FWm, false);
        this.method_b5ae8f6f_Dne(qnq, 0, 0, 2, 12, 2, cLK);
        this.method_b5ae8f6f_Dne(qnq, 0, 0, 3, 12, 2, cLK);
        this.method_b5ae8f6f_Dne(qnq, 0, 0, 2, 12, 3, cLK);
        this.method_b5ae8f6f_Dne(qnq, 0, 0, 3, 12, 3, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_ce2a1dc8_sly.field_21260d_FWm, 0, 1, 13, 1, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_ce2a1dc8_sly.field_21260d_FWm, 0, 1, 14, 1, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_ce2a1dc8_sly.field_21260d_FWm, 0, 4, 13, 1, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_ce2a1dc8_sly.field_21260d_FWm, 0, 4, 14, 1, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_ce2a1dc8_sly.field_21260d_FWm, 0, 1, 13, 4, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_ce2a1dc8_sly.field_21260d_FWm, 0, 1, 14, 4, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_ce2a1dc8_sly.field_21260d_FWm, 0, 4, 13, 4, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_ce2a1dc8_sly.field_21260d_FWm, 0, 4, 14, 4, cLK);
        this.method_3d7d4888_Dne(qnq, cLK, 1, 15, 1, 4, 15, 4, zKP.field_75c638da_bzF.field_21260d_FWm, zKP.field_75c638da_bzF.field_21260d_FWm, false);
        for (int i = 0; i <= 5; ++i) {
            for (int j = 0; j <= 5; ++j) {
                if (j != 0 && j != 5 && i != 0 && i != 5) continue;
                this.method_b5ae8f6f_Dne(qnq, zKP.field_7508fdcb_mrb.field_21260d_FWm, 0, j, 11, i, cLK);
                this.method_3b27a7cf_Dne(qnq, j, 12, i, cLK);
            }
        }
        return true;
    }

    public dSy(opc opc2, int n, Random random, int n2, int n3) {
        super(opc2, n);
        this.field_2d29f4_aFZ = random.nextInt(4);
        switch (this.field_2d29f4_aFZ) {
            case 0: 
            case 2: {
                this.field_3656daa_Dne = new CLK(n2, 64, n3, n2 + 6 - 1, 78, n3 + 6 - 1);
                break;
            }
            default: {
                this.field_3656daa_Dne = new CLK(n2, 64, n3, n2 + 6 - 1, 78, n3 + 6 - 1);
            }
        }
    }

    @Override
    public void method_dbe42dde_Dne(bvz bvz2, List list, Random random) {
        wBl.method_84b7f48b_FWm((opc)bvz2, list, random, this.field_3656daa_Dne.field_2092ae_Dne - 1, this.field_3656daa_Dne.field_2d29f4_aFZ - 4, this.field_3656daa_Dne.field_2e5f1b_bzF + 1, 1, this.method_7a46288d_Dne());
        wBl.method_84b7f48b_FWm((opc)bvz2, list, random, this.field_3656daa_Dne.field_267cf5_Qnq + 1, this.field_3656daa_Dne.field_2d29f4_aFZ - 4, this.field_3656daa_Dne.field_2e5f1b_bzF + 1, 3, this.method_7a46288d_Dne());
        wBl.method_84b7f48b_FWm((opc)bvz2, list, random, this.field_3656daa_Dne.field_2092ae_Dne + 1, this.field_3656daa_Dne.field_2d29f4_aFZ - 4, this.field_3656daa_Dne.field_2e5f1b_bzF - 1, 2, this.method_7a46288d_Dne());
        wBl.method_84b7f48b_FWm((opc)bvz2, list, random, this.field_3656daa_Dne.field_2092ae_Dne + 1, this.field_3656daa_Dne.field_2d29f4_aFZ - 4, this.field_3656daa_Dne.field_388da6_zGp + 1, 0, this.method_7a46288d_Dne());
    }
}

