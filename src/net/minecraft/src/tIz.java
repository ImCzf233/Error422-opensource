package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class tIz
extends gwq {
    @Override
    public boolean method_c3e4cb88_Dne(Qnq qnq, Random random, int n, int n2, int n3) {
        int n4 = random.nextInt(3) + 5;
        boolean bl = true;
        if (n2 >= 1 && n2 + n4 + 1 <= 256) {
            int n5;
            int n6;
            int n7;
            int n8;
            int n9;
            for (n9 = n2; n9 <= n2 + 1 + n4; ++n9) {
                n8 = 1;
                if (n9 == n2) {
                    n8 = 0;
                }
                if (n9 >= n2 + 1 + n4 - 2) {
                    n8 = 2;
                }
                for (n7 = n - n8; n7 <= n + n8 && bl; ++n7) {
                    for (n6 = n3 - n8; n6 <= n3 + n8 && bl; ++n6) {
                        if (n9 >= 0 && n9 < 256) {
                            n5 = qnq.method_2c2cf7bc_Dne(n7, n9, n6);
                            if (n5 == 0 || n5 == zKP.field_36e218c_Dne.field_21260d_FWm) continue;
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
            n9 = qnq.method_2c2cf7bc_Dne(n, n2 - 1, n3);
            if ((n9 == zKP.field_36ff555_Dne.field_21260d_FWm || n9 == zKP.field_203836cc_FWm.field_21260d_FWm) && n2 < 256 - n4 - 1) {
                this.method_f9bf07d3_Dne(qnq, n, n2 - 1, n3, zKP.field_203836cc_FWm.field_21260d_FWm);
                for (n8 = n2 - 3 + n4; n8 <= n2 + n4; ++n8) {
                    n7 = n8 - (n2 + n4);
                    n6 = 1 - n7 / 2;
                    for (n5 = n - n6; n5 <= n + n6; ++n5) {
                        int n10 = n5 - n;
                        for (int i = n3 - n6; i <= n3 + n6; ++i) {
                            int n11;
                            int n12 = i - n3;
                            if (Math.abs(n10) == n6 && Math.abs(n12) == n6 && (random.nextInt(2) == 0 || n7 == 0) || (n11 = qnq.method_2c2cf7bc_Dne(n5, n8, i)) != 0 && n11 != zKP.field_36e218c_Dne.field_21260d_FWm) continue;
                            this.method_3e226590_Dne(qnq, n5, n8, i, zKP.field_36e218c_Dne.field_21260d_FWm, 2);
                        }
                    }
                }
                for (n8 = 0; n8 < n4; ++n8) {
                    n7 = qnq.method_2c2cf7bc_Dne(n, n2 + n8, n3);
                    if (n7 != 0 && n7 != zKP.field_36e218c_Dne.field_21260d_FWm) continue;
                    this.method_3e226590_Dne(qnq, n, n2 + n8, n3, zKP.field_af0f1368_udO.field_21260d_FWm, 2);
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public tIz(boolean bl) {
        super(bl);
    }
}

