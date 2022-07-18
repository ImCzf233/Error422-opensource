package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BAQ {
    public static final char[] field_3f1c583_Dne;
    public static final String field_569fcf45_Dne;

    private static String method_eecad346_Dne() {
        String string = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(BAQ.class.getResourceAsStream("/font.txt"), "UTF-8"));
            String string2 = "";
            while ((string2 = bufferedReader.readLine()) != null) {
                if (string2.startsWith("#")) continue;
                string = string + string2;
            }
            bufferedReader.close();
        }
        catch (Exception exception) {
            // empty catch block
        }
        return string;
    }

    public static String method_39193c_Dne(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : string.toCharArray()) {
            if (!BAQ.method_ce7f4727_Dne(c)) continue;
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }

    public static final boolean method_ce7f4727_Dne(char c) {
        return c != '\u00a7' && (field_569fcf45_Dne.indexOf(c) >= 0 || c > ' ');
    }

    static {
        field_569fcf45_Dne = BAQ.method_eecad346_Dne();
        field_3f1c583_Dne = new char[]{'/', '\n', '\r', '\t', '\u0000', '\f', '`', '?', '*', '\\', '<', '>', '|', '\"', ':'};
    }
}

