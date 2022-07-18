package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class yaZ
extends gwq {
    @Override
    public boolean method_c3e4cb88_Dne(Qnq qnq, Random random, int n, int n2, int n3) {
        int n4 = random.nextInt(4) + 6;
        int n5 = 1 + random.nextInt(2);
        int n6 = n4 - n5;
        int n7 = 2 + random.nextInt(2);
        boolean bl = true;
        if (n2 >= 1 && n2 + n4 + 1 <= 256) {
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
                        if (n13 >= 0 && n13 < 256) {
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
            if ((n13 == zKP.field_36ff555_Dne.field_21260d_FWm || n13 == zKP.field_203836cc_FWm.field_21260d_FWm) && n2 < 256 - n4 - 1) {
                int n14;
                this.method_f9bf07d3_Dne(qnq, n, n2 - 1, n3, zKP.field_203836cc_FWm.field_21260d_FWm);
                n11 = random.nextInt(2);
                n10 = 1;
                n12 = 0;
                for (n8 = 0; n8 <= n6; ++n8) {
                    n9 = n2 + n4 - n8;
                    for (n14 = n - n11; n14 <= n + n11; ++n14) {
                        int n15 = n14 - n;
                        for (int i = n3 - n11; i <= n3 + n11; ++i) {
                            int n16 = i - n3;
                            if (Math.abs(n15) == n11 && Math.abs(n16) == n11 && n11 > 0 || zKP.field_4039e1b_FWm[qnq.method_2c2cf7bc_Dne(n14, n9, i)]) continue;
                            this.method_3e226590_Dne(qnq, n14, n9, i, zKP.field_36e218c_Dne.field_21260d_FWm, 1);
                        }
                    }
                    if (n11 >= n10) {
                        n11 = n12;
                        n12 = 1;
                        if (++n10 <= n7) continue;
                        n10 = n7;
                        continue;
                    }
                    ++n11;
                }
                n8 = random.nextInt(3);
                for (n9 = 0; n9 < n4 - n8; ++n9) {
                    n14 = qnq.method_2c2cf7bc_Dne(n, n2 + n9, n3);
                    if (n14 != 0 && n14 != zKP.field_36e218c_Dne.field_21260d_FWm) continue;
                    this.method_3e226590_Dne(qnq, n, n2 + n9, n3, zKP.field_af0f1368_udO.field_21260d_FWm, 1);
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public yaZ(boolean bl) {
        super(bl);
    }
}

