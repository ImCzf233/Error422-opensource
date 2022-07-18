package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class pLv {
    private Map field_83b1c1b0_Dne = new HashMap();
    public static pLv field_379e792_Dne = new pLv();

    public static String method_2c0e7e17_Dne(int n) {
        return (String)pLv.field_379e792_Dne.field_83b1c1b0_Dne.get(n);
    }

    private pLv() {
        try {
            String string;
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(pLv.class.getResourceAsStream("/achievement/map.txt")));
            while ((string = bufferedReader.readLine()) != null) {
                String[] stringArray = string.split(",");
                int n = Integer.parseInt(stringArray[0]);
                this.field_83b1c1b0_Dne.put(n, stringArray[1]);
            }
            bufferedReader.close();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}

