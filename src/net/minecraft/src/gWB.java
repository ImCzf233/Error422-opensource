package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class gWB {
    private static chN field_3746303_Dne = chN.method_e4505d6c_Dne(0.0, 0.0, 0.0);

    private static chN method_7437d9e8_bzF(kSJ kSJ2, int n, int n2, chN chN2) {
        double d;
        double d2;
        Random random = kSJ2.method_b5ceee8_Dne();
        boolean bl = false;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        float f = -99999.0f;
        boolean bl2 = kSJ2.method_908be33f_RPx() ? (d2 = (double)(kSJ2.method_f886b00c_FWm().method_2c2cf7b9_Dne(geR.method_117d0718_FWm(kSJ2.field_2f0dd3_div), geR.method_117d0718_FWm(kSJ2.field_22c5fd_IjH), geR.method_117d0718_FWm(kSJ2.field_334487_mrb)) + 4.0f)) < (d = (double)(kSJ2.method_d44b4582_zGp() + (float)n)) * d : false;
        for (int i = 0; i < 10; ++i) {
            float f2;
            int n6 = random.nextInt(2 * n) - n;
            int n7 = random.nextInt(2 * n2) - n2;
            int n8 = random.nextInt(2 * n) - n;
            if (chN2 != null && !((double)n6 * chN2.field_2092a9_Dne + (double)n8 * chN2.field_2e5f16_bzF >= 0.0) || bl2 && !kSJ2.method_2c2cf7cd_Dne(n6 += geR.method_117d0718_FWm(kSJ2.field_2f0dd3_div), n7 += geR.method_117d0718_FWm(kSJ2.field_22c5fd_IjH), n8 += geR.method_117d0718_FWm(kSJ2.field_334487_mrb)) || !((f2 = kSJ2.method_2c2cf7b9_Dne(n6, n7, n8)) > f)) continue;
            f = f2;
            n3 = n6;
            n4 = n7;
            n5 = n8;
            bl = true;
        }
        if (bl) {
            return kSJ2.field_36c4f18_Dne.method_23186a47_Dne().method_e4505d6c_Dne(n3, n4, n5);
        }
        return null;
    }

    public static chN method_25f96ebb_Dne(kSJ kSJ2, int n, int n2, chN chN2) {
        gWB.field_3746303_Dne.field_2092a9_Dne = chN2.field_2092a9_Dne - kSJ2.field_2f0dd3_div;
        gWB.field_3746303_Dne.field_212608_FWm = chN2.field_212608_FWm - kSJ2.field_22c5fd_IjH;
        gWB.field_3746303_Dne.field_2e5f16_bzF = chN2.field_2e5f16_bzF - kSJ2.field_334487_mrb;
        return gWB.method_7437d9e8_bzF(kSJ2, n, n2, field_3746303_Dne);
    }

    public static chN method_4e55885a_FWm(kSJ kSJ2, int n, int n2, chN chN2) {
        gWB.field_3746303_Dne.field_2092a9_Dne = kSJ2.field_2f0dd3_div - chN2.field_2092a9_Dne;
        gWB.field_3746303_Dne.field_212608_FWm = kSJ2.field_22c5fd_IjH - chN2.field_212608_FWm;
        gWB.field_3746303_Dne.field_2e5f16_bzF = kSJ2.field_334487_mrb - chN2.field_2e5f16_bzF;
        return gWB.method_7437d9e8_bzF(kSJ2, n, n2, field_3746303_Dne);
    }

    public static chN method_2c81f20d_Dne(kSJ kSJ2, int n, int n2) {
        return gWB.method_7437d9e8_bzF(kSJ2, n, n2, null);
    }
}

