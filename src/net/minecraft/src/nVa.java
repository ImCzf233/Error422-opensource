package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.math.BigInteger;

public class nVa {
    public static String[] field_f5e54dca_Dne = new String[]{"\u00a7k", ""};

    public static String method_eecad346_Dne() {
        return "\u00a74" + field_f5e54dca_Dne[eCD.method_ce7f5d9c_Dne(field_f5e54dca_Dne.length)] + "ENCODING ERROR";
    }

    public static String method_39193c_Dne(String string) {
        return String.format("%x", new BigInteger(1, string.getBytes()));
    }
}

