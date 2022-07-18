package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class iwf {
    public static char[] field_3f1c583_Dne = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static int method_77c70af4_Dne(byte[] byArray, int n, int n2) {
        return 0 > n2 - n - 4 ? 0 : byArray[n + 3] << 24 | (byArray[n + 2] & 0xFF) << 16 | (byArray[n + 1] & 0xFF) << 8 | byArray[n] & 0xFF;
    }

    public static String method_819c2bbf_Dne(byte[] byArray, int n, int n2) {
        int n3;
        int n4 = n2 - 1;
        int n5 = n3 = n > n4 ? n4 : n;
        while (0 != byArray[n3] && n3 < n4) {
            ++n3;
        }
        return new String(byArray, n, n3 - n);
    }

    public static String method_d6a1a17e_Dne(byte by) {
        return "" + field_3f1c583_Dne[(by & 0xF0) >>> 4] + field_3f1c583_Dne[by & 0xF];
    }

    public static int method_2d277035_Dne(byte[] byArray, int n) {
        return iwf.method_77c70af4_Dne(byArray, n, byArray.length);
    }

    public static int method_4d3d5b13_FWm(byte[] byArray, int n, int n2) {
        return 0 > n2 - n - 4 ? 0 : byArray[n] << 24 | (byArray[n + 1] & 0xFF) << 16 | (byArray[n + 2] & 0xFF) << 8 | byArray[n + 3] & 0xFF;
    }
}

