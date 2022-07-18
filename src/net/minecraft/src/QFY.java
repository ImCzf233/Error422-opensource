package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class QFY {
    private static int[] field_3f1c589_Dne = new int[65536];

    public static int method_7c6f602c_FWm() {
        return 8431445;
    }

    public static int method_7a46288d_Dne() {
        return 0x619961;
    }

    public static int method_ae128dba_bzF() {
        return 4764952;
    }

    public static void method_174f928_Dne(int[] nArray) {
        field_3f1c589_Dne = nArray;
    }

    public static int method_16a71cd_Dne(double d, double d2) {
        int n = (int)((1.0 - d) * 255.0);
        int n2 = (int)((1.0 - (d2 *= d)) * 255.0);
        return field_3f1c589_Dne[n2 << 8 | n];
    }
}

