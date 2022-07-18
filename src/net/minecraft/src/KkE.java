package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class KkE
extends gwq {
    @Override
    public boolean method_c3e4cb88_Dne(Qnq qnq, Random random, int n, int n2, int n3) {
        int n4 = random.nextInt(5) + 7;
        int n5 = n4 - random.nextInt(2) - 3;
        int n6 = n4 - n5;
        int n7 = 1 + random.nextInt(n6 + 1);
        boolean bl = true;
        if (n2 >= 1 && n2 + n4 + 1 <= 128) {
            int n8;
            int n9;
            int n10;
            int n11;
            int n12;
            int n13;
            for (n13 = n2; n13 <= n2 + 1 + n4 && bl; ++n13) {
                n12 = 1;
                n11 = n13 - n2 < n5 ? 0 : n7;
                for (n10 = n - n11; n10 <= n + n11 && bl; ++n10) {
                    for (n9 = n3 - n11; n9 <= n3 + n11 && bl; ++n9) {
                        if (n13 >= 0 && n13 < 128) {
                            n8 = qnq.method_2c2cf7bc_Dne(n10, n13, n9);
                            if (n8 == 0 || n8 == zKP.field_36e218c_Dne.field_21260d_FWm) continue;
                            bl = false;
                            continue;
                        }
                        bl = false;
                    }
                }
            }
            if (!bl) {
                return false;
            }
            n13 = qnq.method_2c2cf7bc_Dne(n, n2 - 1, n3);
            if ((n13 == zKP.field_36ff555_Dne.field_21260d_FWm || n13 == zKP.field_203836cc_FWm.field_21260d_FWm) && n2 < 128 - n4 - 1) {
                this.method_f9bf07d3_Dne(qnq, n, n2 - 1, n3, zKP.field_203836cc_FWm.field_21260d_FWm);
                n11 = 0;
                for (n10 = n2 + n4; n10 >= n2 + n5; --n10) {
                    for (n9 = n - n11; n9 <= n + n11; ++n9) {
                        n8 = n9 - n;
                        for (n12 = n3 - n11; n12 <= n3 + n11; ++n12) {
                            int n14 = n12 - n3;
                            if (Math.abs(n8) == n11 && Math.abs(n14) == n11 && n11 > 0 || zKP.field_4039e1b_FWm[qnq.method_2c2cf7bc_Dne(n9, n10, n12)]) continue;
                            this.method_3e226590_Dne(qnq, n9, n10, n12, zKP.field_36e218c_Dne.field_21260d_FWm, 1);
                        }
                    }
                    if (n11 >= 1 && n10 == n2 + n5 + 1) {
                        --n11;
                        continue;
                    }
                    if (n11 >= n7) continue;
                    ++n11;
                }
                for (n10 = 0; n10 < n4 - 1; ++n10) {
                    n9 = qnq.method_2c2cf7bc_Dne(n, n2 + n10, n3);
                    if (n9 != 0 && n9 != zKP.field_36e218c_Dne.field_21260d_FWm) continue;
                    this.method_3e226590_Dne(qnq, n, n2 + n10, n3, zKP.field_af0f1368_udO.field_21260d_FWm, 1);
                }
                return true;
            }
            return false;
        }
        return false;
    }
}

