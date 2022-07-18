package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class eCD {
    public static Random field_7331eae7_Dne = new Random();

    public static long method_16cca6e_Dne(int n, int n2) {
        return field_7331eae7_Dne.nextInt(n2 - n) + n;
    }

    public static int method_ce7f5d9c_Dne(int n) {
        return field_7331eae7_Dne.nextInt(n);
    }
}

