package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
class zKy
extends pEl {
    int method_b7f2d278_Dne(MOU mOU, Object object, float[][] fArray, int[] nArray, int n) {
        int n2 = 0;
        for (int i = 0; i < n; ++i) {
            if (nArray[i] == 0) continue;
            fArray[n2++] = fArray[i];
        }
        if (n2 != 0) {
            return zKy.method_d45a7983_Dne(mOU, object, fArray, n2, 1);
        }
        return 0;
    }

    zKy() {
    }
}

