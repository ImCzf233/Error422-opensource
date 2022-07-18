package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class dYY
extends bvz {
    private final boolean field_2092bf_Dne;
    private final int field_2092ae_Dne;

    public static CLK method_b560cbe6_Dne(List list, Random random, int n, int n2, int n3, int n4) {
        CLK cLK = new CLK(n, n2, n3, n, n2 + 2, n3);
        if (random.nextInt(4) == 0) {
            cLK.field_2d29f4_aFZ += 4;
        }
        switch (n4) {
            case 0: {
                cLK.field_2092ae_Dne = n - 1;
                cLK.field_267cf5_Qnq = n + 3;
                cLK.field_388da6_zGp = n3 + 4;
                break;
            }
            case 1: {
                cLK.field_2092ae_Dne = n - 4;
                cLK.field_2e5f1b_bzF = n3 - 1;
                cLK.field_388da6_zGp = n3 + 3;
                break;
            }
            case 2: {
                cLK.field_2092ae_Dne = n - 1;
                cLK.field_267cf5_Qnq = n + 3;
                cLK.field_2e5f1b_bzF = n3 - 4;
                break;
            }
            case 3: {
                cLK.field_267cf5_Qnq = n + 4;
                cLK.field_2e5f1b_bzF = n3 - 1;
                cLK.field_388da6_zGp = n3 + 3;
            }
        }
        return bvz.method_9e83199f_Dne(list, cLK) != null ? null : cLK;
    }

    @Override
    public boolean method_f28ef3a4_Dne(Qnq qnq, Random random, CLK cLK) {
        if (this.method_d2c2fe50_Dne(qnq, cLK)) {
            return false;
        }
        if (this.field_2092bf_Dne) {
            this.method_3d7d4888_Dne(qnq, cLK, this.field_3656daa_Dne.field_2092ae_Dne + 1, this.field_3656daa_Dne.field_21260d_FWm, this.field_3656daa_Dne.field_2e5f1b_bzF, this.field_3656daa_Dne.field_267cf5_Qnq - 1, this.field_3656daa_Dne.field_21260d_FWm + 3 - 1, this.field_3656daa_Dne.field_388da6_zGp, 0, 0, false);
            this.method_3d7d4888_Dne(qnq, cLK, this.field_3656daa_Dne.field_2092ae_Dne, this.field_3656daa_Dne.field_21260d_FWm, this.field_3656daa_Dne.field_2e5f1b_bzF + 1, this.field_3656daa_Dne.field_267cf5_Qnq, this.field_3656daa_Dne.field_21260d_FWm + 3 - 1, this.field_3656daa_Dne.field_388da6_zGp - 1, 0, 0, false);
            this.method_3d7d4888_Dne(qnq, cLK, this.field_3656daa_Dne.field_2092ae_Dne + 1, this.field_3656daa_Dne.field_2d29f4_aFZ - 2, this.field_3656daa_Dne.field_2e5f1b_bzF, this.field_3656daa_Dne.field_267cf5_Qnq - 1, this.field_3656daa_Dne.field_2d29f4_aFZ, this.field_3656daa_Dne.field_388da6_zGp, 0, 0, false);
            this.method_3d7d4888_Dne(qnq, cLK, this.field_3656daa_Dne.field_2092ae_Dne, this.field_3656daa_Dne.field_2d29f4_aFZ - 2, this.field_3656daa_Dne.field_2e5f1b_bzF + 1, this.field_3656daa_Dne.field_267cf5_Qnq, this.field_3656daa_Dne.field_2d29f4_aFZ, this.field_3656daa_Dne.field_388da6_zGp - 1, 0, 0, false);
            this.method_3d7d4888_Dne(qnq, cLK, this.field_3656daa_Dne.field_2092ae_Dne + 1, this.field_3656daa_Dne.field_21260d_FWm + 3, this.field_3656daa_Dne.field_2e5f1b_bzF + 1, this.field_3656daa_Dne.field_267cf5_Qnq - 1, this.field_3656daa_Dne.field_21260d_FWm + 3, this.field_3656daa_Dne.field_388da6_zGp - 1, 0, 0, false);
        } else {
            this.method_3d7d4888_Dne(qnq, cLK, this.field_3656daa_Dne.field_2092ae_Dne + 1, this.field_3656daa_Dne.field_21260d_FWm, this.field_3656daa_Dne.field_2e5f1b_bzF, this.field_3656daa_Dne.field_267cf5_Qnq - 1, this.field_3656daa_Dne.field_2d29f4_aFZ, this.field_3656daa_Dne.field_388da6_zGp, 0, 0, false);
            this.method_3d7d4888_Dne(qnq, cLK, this.field_3656daa_Dne.field_2092ae_Dne, this.field_3656daa_Dne.field_21260d_FWm, this.field_3656daa_Dne.field_2e5f1b_bzF + 1, this.field_3656daa_Dne.field_267cf5_Qnq, this.field_3656daa_Dne.field_2d29f4_aFZ, this.field_3656daa_Dne.field_388da6_zGp - 1, 0, 0, false);
        }
        this.method_3d7d4888_Dne(qnq, cLK, this.field_3656daa_Dne.field_2092ae_Dne + 1, this.field_3656daa_Dne.field_21260d_FWm, this.field_3656daa_Dne.field_2e5f1b_bzF + 1, this.field_3656daa_Dne.field_2092ae_Dne + 1, this.field_3656daa_Dne.field_2d29f4_aFZ, this.field_3656daa_Dne.field_2e5f1b_bzF + 1, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, 0, false);
        this.method_3d7d4888_Dne(qnq, cLK, this.field_3656daa_Dne.field_2092ae_Dne + 1, this.field_3656daa_Dne.field_21260d_FWm, this.field_3656daa_Dne.field_388da6_zGp - 1, this.field_3656daa_Dne.field_2092ae_Dne + 1, this.field_3656daa_Dne.field_2d29f4_aFZ, this.field_3656daa_Dne.field_388da6_zGp - 1, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, 0, false);
        this.method_3d7d4888_Dne(qnq, cLK, this.field_3656daa_Dne.field_267cf5_Qnq - 1, this.field_3656daa_Dne.field_21260d_FWm, this.field_3656daa_Dne.field_2e5f1b_bzF + 1, this.field_3656daa_Dne.field_267cf5_Qnq - 1, this.field_3656daa_Dne.field_2d29f4_aFZ, this.field_3656daa_Dne.field_2e5f1b_bzF + 1, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, 0, false);
        this.method_3d7d4888_Dne(qnq, cLK, this.field_3656daa_Dne.field_267cf5_Qnq - 1, this.field_3656daa_Dne.field_21260d_FWm, this.field_3656daa_Dne.field_388da6_zGp - 1, this.field_3656daa_Dne.field_267cf5_Qnq - 1, this.field_3656daa_Dne.field_2d29f4_aFZ, this.field_3656daa_Dne.field_388da6_zGp - 1, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, 0, false);
        for (int i = this.field_3656daa_Dne.field_2092ae_Dne; i <= this.field_3656daa_Dne.field_267cf5_Qnq; ++i) {
            for (int j = this.field_3656daa_Dne.field_2e5f1b_bzF; j <= this.field_3656daa_Dne.field_388da6_zGp; ++j) {
                int n = this.method_3b27a7c2_Dne(qnq, i, this.field_3656daa_Dne.field_21260d_FWm - 1, j, cLK);
                if (n != 0) continue;
                this.method_b5ae8f6f_Dne(qnq, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, 0, i, this.field_3656daa_Dne.field_21260d_FWm - 1, j, cLK);
            }
        }
        return true;
    }

    @Override
    public void method_dbe42dde_Dne(bvz bvz2, List list, Random random) {
        int n = this.method_7a46288d_Dne();
        switch (this.field_2092ae_Dne) {
            case 0: {
                FUM.method_80be7ff0_Dne(bvz2, list, random, this.field_3656daa_Dne.field_2092ae_Dne + 1, this.field_3656daa_Dne.field_21260d_FWm, this.field_3656daa_Dne.field_388da6_zGp + 1, 0, n);
                FUM.method_80be7ff0_Dne(bvz2, list, random, this.field_3656daa_Dne.field_2092ae_Dne - 1, this.field_3656daa_Dne.field_21260d_FWm, this.field_3656daa_Dne.field_2e5f1b_bzF + 1, 1, n);
                FUM.method_80be7ff0_Dne(bvz2, list, random, this.field_3656daa_Dne.field_267cf5_Qnq + 1, this.field_3656daa_Dne.field_21260d_FWm, this.field_3656daa_Dne.field_2e5f1b_bzF + 1, 3, n);
                break;
            }
            case 1: {
                FUM.method_80be7ff0_Dne(bvz2, list, random, this.field_3656daa_Dne.field_2092ae_Dne + 1, this.field_3656daa_Dne.field_21260d_FWm, this.field_3656daa_Dne.field_2e5f1b_bzF - 1, 2, n);
                FUM.method_80be7ff0_Dne(bvz2, list, random, this.field_3656daa_Dne.field_2092ae_Dne + 1, this.field_3656daa_Dne.field_21260d_FWm, this.field_3656daa_Dne.field_388da6_zGp + 1, 0, n);
                FUM.method_80be7ff0_Dne(bvz2, list, random, this.field_3656daa_Dne.field_2092ae_Dne - 1, this.field_3656daa_Dne.field_21260d_FWm, this.field_3656daa_Dne.field_2e5f1b_bzF + 1, 1, n);
                break;
            }
            case 2: {
                FUM.method_80be7ff0_Dne(bvz2, list, random, this.field_3656daa_Dne.field_2092ae_Dne + 1, this.field_3656daa_Dne.field_21260d_FWm, this.field_3656daa_Dne.field_2e5f1b_bzF - 1, 2, n);
                FUM.method_80be7ff0_Dne(bvz2, list, random, this.field_3656daa_Dne.field_2092ae_Dne - 1, this.field_3656daa_Dne.field_21260d_FWm, this.field_3656daa_Dne.field_2e5f1b_bzF + 1, 1, n);
                FUM.method_80be7ff0_Dne(bvz2, list, random, this.field_3656daa_Dne.field_267cf5_Qnq + 1, this.field_3656daa_Dne.field_21260d_FWm, this.field_3656daa_Dne.field_2e5f1b_bzF + 1, 3, n);
                break;
            }
            case 3: {
                FUM.method_80be7ff0_Dne(bvz2, list, random, this.field_3656daa_Dne.field_2092ae_Dne + 1, this.field_3656daa_Dne.field_21260d_FWm, this.field_3656daa_Dne.field_2e5f1b_bzF - 1, 2, n);
                FUM.method_80be7ff0_Dne(bvz2, list, random, this.field_3656daa_Dne.field_2092ae_Dne + 1, this.field_3656daa_Dne.field_21260d_FWm, this.field_3656daa_Dne.field_388da6_zGp + 1, 0, n);
                FUM.method_80be7ff0_Dne(bvz2, list, random, this.field_3656daa_Dne.field_267cf5_Qnq + 1, this.field_3656daa_Dne.field_21260d_FWm, this.field_3656daa_Dne.field_2e5f1b_bzF + 1, 3, n);
            }
        }
        if (this.field_2092bf_Dne) {
            if (random.nextBoolean()) {
                FUM.method_80be7ff0_Dne(bvz2, list, random, this.field_3656daa_Dne.field_2092ae_Dne + 1, this.field_3656daa_Dne.field_21260d_FWm + 3 + 1, this.field_3656daa_Dne.field_2e5f1b_bzF - 1, 2, n);
            }
            if (random.nextBoolean()) {
                FUM.method_80be7ff0_Dne(bvz2, list, random, this.field_3656daa_Dne.field_2092ae_Dne - 1, this.field_3656daa_Dne.field_21260d_FWm + 3 + 1, this.field_3656daa_Dne.field_2e5f1b_bzF + 1, 1, n);
            }
            if (random.nextBoolean()) {
                FUM.method_80be7ff0_Dne(bvz2, list, random, this.field_3656daa_Dne.field_267cf5_Qnq + 1, this.field_3656daa_Dne.field_21260d_FWm + 3 + 1, this.field_3656daa_Dne.field_2e5f1b_bzF + 1, 3, n);
            }
            if (random.nextBoolean()) {
                FUM.method_80be7ff0_Dne(bvz2, list, random, this.field_3656daa_Dne.field_2092ae_Dne + 1, this.field_3656daa_Dne.field_21260d_FWm + 3 + 1, this.field_3656daa_Dne.field_388da6_zGp + 1, 0, n);
            }
        }
    }

    public dYY(int n, Random random, CLK cLK, int n2) {
        super(n);
        this.field_2092ae_Dne = n2;
        this.field_3656daa_Dne = cLK;
        this.field_2092bf_Dne = cLK.method_7c6f602c_FWm() > 3;
    }
}

