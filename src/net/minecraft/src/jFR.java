package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class jFR
extends xZE {
    @Override
    public int method_7a46288d_Dne() {
        return 3;
    }

    @Override
    public boolean method_a8c9cf69_Dne(gnI gnI2) {
        return jwh_0.method_2302cf90_Dne().method_230ea953_Dne().method_230d8827_Dne().method_7a46289e_Dne() && super.method_a8c9cf69_Dne(gnI2);
    }

    @Override
    public String method_eecad346_Dne() {
        return "pardon";
    }

    @Override
    public void method_4036a99a_Dne(gnI gnI2, String[] stringArray) {
        if (stringArray.length != 1 || stringArray[0].length() <= 0) {
            throw new fxw_0("commands.unban.usage", new Object[0]);
        }
        jwh_0.method_2302cf90_Dne().method_230ea953_Dne().method_230d8827_Dne().method_8f501fe4_Dne(stringArray[0]);
        jFR.method_7424c4e2_Dne(gnI2, "commands.unban.success", stringArray[0]);
    }

    @Override
    public String method_aef63bdb_Dne(gnI gnI2) {
        return gnI2.method_98148f73_Dne("commands.unban.usage", new Object[0]);
    }

    @Override
    public List method_cac7816d_Dne(gnI gnI2, String[] stringArray) {
        return stringArray.length == 1 ? jFR.method_2db2e1b9_Dne(stringArray, jwh_0.method_2302cf90_Dne().method_230ea953_Dne().method_230d8827_Dne().method_d410254f_Dne().keySet()) : null;
    }
}

