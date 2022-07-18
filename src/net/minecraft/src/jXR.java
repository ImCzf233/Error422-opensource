package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class jXR
extends bvz {
    @Override
    public boolean method_f28ef3a4_Dne(Qnq qnq, Random random, CLK cLK) {
        if (this.method_d2c2fe50_Dne(qnq, cLK)) {
            return false;
        }
        this.method_3d7d4888_Dne(qnq, cLK, 0, 5, 0, 2, 7, 1, 0, 0, false);
        this.method_3d7d4888_Dne(qnq, cLK, 0, 0, 7, 2, 2, 8, 0, 0, false);
        for (int i = 0; i < 5; ++i) {
            this.method_3d7d4888_Dne(qnq, cLK, 0, 5 - i - (i < 4 ? 1 : 0), 2 + i, 2, 7 - i, 2 + i, 0, 0, false);
        }
        return true;
    }

    public jXR(int n, Random random, CLK cLK, int n2) {
        super(n);
        this.field_2d29f4_aFZ = n2;
        this.field_3656daa_Dne = cLK;
    }

    @Override
    public void method_dbe42dde_Dne(bvz bvz2, List list, Random random) {
        int n = this.method_7a46288d_Dne();
        switch (this.field_2d29f4_aFZ) {
            case 0: {
                FUM.method_80be7ff0_Dne(bvz2, list, random, this.field_3656daa_Dne.field_2092ae_Dne, this.field_3656daa_Dne.field_21260d_FWm, this.field_3656daa_Dne.field_388da6_zGp + 1, 0, n);
                break;
            }
            case 1: {
                FUM.method_80be7ff0_Dne(bvz2, list, random, this.field_3656daa_Dne.field_2092ae_Dne - 1, this.field_3656daa_Dne.field_21260d_FWm, this.field_3656daa_Dne.field_2e5f1b_bzF, 1, n);
                break;
            }
            case 2: {
                FUM.method_80be7ff0_Dne(bvz2, list, random, this.field_3656daa_Dne.field_2092ae_Dne, this.field_3656daa_Dne.field_21260d_FWm, this.field_3656daa_Dne.field_2e5f1b_bzF - 1, 2, n);
                break;
            }
            case 3: {
                FUM.method_80be7ff0_Dne(bvz2, list, random, this.field_3656daa_Dne.field_267cf5_Qnq + 1, this.field_3656daa_Dne.field_21260d_FWm, this.field_3656daa_Dne.field_2e5f1b_bzF, 3, n);
            }
        }
    }

    public static CLK method_b560cbe6_Dne(List list, Random random, int n, int n2, int n3, int n4) {
        CLK cLK = new CLK(n, n2 - 5, n3, n, n2 + 2, n3);
        switch (n4) {
            case 0: {
                cLK.field_267cf5_Qnq = n + 2;
                cLK.field_388da6_zGp = n3 + 8;
                break;
            }
            case 1: {
                cLK.field_2092ae_Dne = n - 8;
                cLK.field_388da6_zGp = n3 + 2;
                break;
            }
            case 2: {
                cLK.field_267cf5_Qnq = n + 2;
                cLK.field_2e5f1b_bzF = n3 - 8;
                break;
            }
            case 3: {
                cLK.field_267cf5_Qnq = n + 8;
                cLK.field_388da6_zGp = n3 + 2;
            }
        }
        return bvz.method_9e83199f_Dne(list, cLK) != null ? null : cLK;
    }
}

