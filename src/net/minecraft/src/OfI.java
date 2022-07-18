package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class OfI
extends dEr {
    @Override
    public boolean method_4ddc487f_Dne(NMq nMq, FiG fiG, Qnq qnq, int n, int n2, int n3, int n4, float f, float f2, float f3) {
        if (qnq.field_2d2a05_aFZ) {
            return true;
        }
        if (n4 != 1) {
            return false;
        }
        ++n2;
        rTW rTW2 = (rTW)zKP.field_d57af75_FfS;
        int n5 = geR.method_117d0718_FWm((double)(fiG.field_334489_mrb * 4.0f / 360.0f) + 0.5) & 3;
        int n6 = 0;
        int n7 = 0;
        if (n5 == 0) {
            n7 = 1;
        }
        if (n5 == 1) {
            n6 = -1;
        }
        if (n5 == 2) {
            n7 = -1;
        }
        if (n5 == 3) {
            n6 = 1;
        }
        if (fiG.method_7bcedb59_Dne(n, n2, n3, n4, nMq) && fiG.method_7bcedb59_Dne(n + n6, n2, n3 + n7, n4, nMq)) {
            if (qnq.method_2c2cf7cd_Dne(n, n2, n3) && qnq.method_2c2cf7cd_Dne(n + n6, n2, n3 + n7) && qnq.method_73e9b8f9_IjH(n, n2 - 1, n3) && qnq.method_73e9b8f9_IjH(n + n6, n2 - 1, n3 + n7)) {
                qnq.method_17d7ea9d_FWm(n, n2, n3, rTW2.field_21260d_FWm, n5, 3);
                if (qnq.method_2c2cf7bc_Dne(n, n2, n3) == rTW2.field_21260d_FWm) {
                    qnq.method_17d7ea9d_FWm(n + n6, n2, n3 + n7, rTW2.field_21260d_FWm, n5 + 8, 3);
                }
                --nMq.field_2092ae_Dne;
                return true;
            }
            return false;
        }
        return false;
    }

    public OfI(int n) {
        super(n);
        this.method_829e7ad2_Dne(JcN.field_2022bed6_FWm);
    }
}

