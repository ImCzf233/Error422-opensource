package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from xHL
 */
class xhl_0 {
    static int method_ce7f5d9c_Dne(int n) {
        int n2 = 0;
        while (n != 0) {
            ++n2;
            n >>>= 1;
        }
        return n2;
    }

    static int method_117d19dd_FWm(int n) {
        int n2 = 0;
        while (n > 1) {
            ++n2;
            n >>>= 1;
        }
        return n2;
    }

    static int method_143f9e0f_bzF(int n) {
        int n2 = 0;
        while (n != 0) {
            n2 += n & 1;
            n >>>= 1;
        }
        return n2;
    }

    xhl_0() {
    }
}

