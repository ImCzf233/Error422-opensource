package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.regex.Pattern;

public class vCA {
    private static final Pattern field_b2ec7984_Dne = Pattern.compile("(?i)\\u00A7[0-9A-FK-OR]");

    public static String method_2c0e7e17_Dne(int n) {
        int n2 = n / 20;
        int n3 = n2 / 60;
        return (n2 %= 60) < 10 ? n3 + ":0" + n2 : n3 + ":" + n2;
    }

    public static String method_39193c_Dne(String string) {
        return field_b2ec7984_Dne.matcher(string).replaceAll("");
    }
}

