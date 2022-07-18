package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public final class wdv {
    public static String method_39193c_Dne(String string) {
        boolean bl = false;
        char[] cArray = string.toCharArray();
        for (int i = 0; i != cArray.length; ++i) {
            char c = cArray[i];
            if ('A' > c || 'Z' < c) continue;
            bl = true;
            cArray[i] = (char)(c - 65 + 97);
        }
        if (bl) {
            return new String(cArray);
        }
        return string;
    }
}

