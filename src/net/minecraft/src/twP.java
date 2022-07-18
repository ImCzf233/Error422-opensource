package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class twP
extends xZE {
    @Override
    public List method_cac7816d_Dne(gnI gnI2, String[] stringArray) {
        return stringArray.length == 1 ? twP.method_80180c4d_Dne(stringArray, "clear", "rain", "thunder") : null;
    }

    @Override
    public void method_4036a99a_Dne(gnI gnI2, String[] stringArray) {
        if (stringArray.length < 1) {
            throw new fxw_0("commands.weather.usage", new Object[0]);
        }
        int n = (300 + new Random().nextInt(600)) * 20;
        if (stringArray.length >= 2) {
            n = twP.method_f7556a82_Dne(gnI2, stringArray[1], 1, 1000000) * 20;
        }
        RAN rAN = jwh_0.method_2302cf90_Dne().field_836263a8_Dne[0];
        xoY xoY2 = rAN.method_231798c9_Dne();
        xoY2.method_b51ddfb1_zGp(n);
        xoY2.method_87b738a3_aFZ(n);
        if ("clear".equalsIgnoreCase(stringArray[0])) {
            xoY2.method_117d59bb_FWm(false);
            xoY2.method_ce7f9d7a_Dne(false);
            twP.method_7424c4e2_Dne(gnI2, "commands.weather.clear", new Object[0]);
        } else if ("rain".equalsIgnoreCase(stringArray[0])) {
            xoY2.method_117d59bb_FWm(true);
            xoY2.method_ce7f9d7a_Dne(false);
            twP.method_7424c4e2_Dne(gnI2, "commands.weather.rain", new Object[0]);
        } else if ("thunder".equalsIgnoreCase(stringArray[0])) {
            xoY2.method_117d59bb_FWm(true);
            xoY2.method_ce7f9d7a_Dne(true);
            twP.method_7424c4e2_Dne(gnI2, "commands.weather.thunder", new Object[0]);
        }
    }

    @Override
    public int method_7a46288d_Dne() {
        return 2;
    }

    @Override
    public String method_eecad346_Dne() {
        return "weather";
    }
}

