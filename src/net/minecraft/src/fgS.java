package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class fgS
extends dEr {
    private KFd field_368fd23_Dne;

    @Override
    public boolean method_4ddc487f_Dne(NMq nMq, FiG fiG, Qnq qnq, int n, int n2, int n3, int n4, float f, float f2, float f3) {
        if (n4 != 1) {
            return false;
        }
        zKP zKP2 = this.field_368fd23_Dne == KFd.field_5e526bea_Qnq ? zKP.field_ceacd6d_ICU : zKP.field_79fca9d5_IYC;
        if (fiG.method_7bcedb59_Dne(n, ++n2, n3, n4, nMq) && fiG.method_7bcedb59_Dne(n, n2 + 1, n3, n4, nMq)) {
            if (!zKP2.method_9cb39134_Dne(qnq, n, n2, n3)) {
                return false;
            }
            int n5 = geR.method_117d0718_FWm((double)((fiG.field_334489_mrb + 180.0f) * 4.0f / 360.0f) - 0.5) & 3;
            fgS.method_1cca978f_Dne(qnq, n, n2, n3, n5, zKP2);
            --nMq.field_2092ae_Dne;
            return true;
        }
        return false;
    }

    public static void method_1cca978f_Dne(Qnq qnq, int n, int n2, int n3, int n4, zKP zKP2) {
        int n5 = 0;
        int n6 = 0;
        if (n4 == 0) {
            n6 = 1;
        }
        if (n4 == 1) {
            n5 = -1;
        }
        if (n4 == 2) {
            n6 = -1;
        }
        if (n4 == 3) {
            n5 = 1;
        }
        int n7 = (qnq.method_6fdef3c4_DyG(n - n5, n2, n3 - n6) ? 1 : 0) + (qnq.method_6fdef3c4_DyG(n - n5, n2 + 1, n3 - n6) ? 1 : 0);
        int n8 = (qnq.method_6fdef3c4_DyG(n + n5, n2, n3 + n6) ? 1 : 0) + (qnq.method_6fdef3c4_DyG(n + n5, n2 + 1, n3 + n6) ? 1 : 0);
        boolean bl = qnq.method_2c2cf7bc_Dne(n - n5, n2, n3 - n6) == zKP2.field_21260d_FWm || qnq.method_2c2cf7bc_Dne(n - n5, n2 + 1, n3 - n6) == zKP2.field_21260d_FWm;
        boolean bl2 = qnq.method_2c2cf7bc_Dne(n + n5, n2, n3 + n6) == zKP2.field_21260d_FWm || qnq.method_2c2cf7bc_Dne(n + n5, n2 + 1, n3 + n6) == zKP2.field_21260d_FWm;
        boolean bl3 = false;
        if (bl && !bl2) {
            bl3 = true;
        } else if (n8 > n7) {
            bl3 = true;
        }
        qnq.method_17d7ea9d_FWm(n, n2, n3, zKP2.field_21260d_FWm, n4, 2);
        qnq.method_17d7ea9d_FWm(n, n2 + 1, n3, zKP2.field_21260d_FWm, 8 | (bl3 ? 1 : 0), 2);
        qnq.method_58fe7b07_bzF(n, n2, n3, zKP2.field_21260d_FWm);
        qnq.method_58fe7b07_bzF(n, n2 + 1, n3, zKP2.field_21260d_FWm);
    }

    public fgS(int n, KFd kFd) {
        super(n);
        this.field_368fd23_Dne = kFd;
        this.field_2d29f4_aFZ = 1;
        this.method_829e7ad2_Dne(JcN.field_75b0c0e4_bzF);
    }
}

