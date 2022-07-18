package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class fTH
extends xZE {
    @Override
    public String method_eecad346_Dne() {
        return "say";
    }

    @Override
    public String method_aef63bdb_Dne(gnI gnI2) {
        return gnI2.method_98148f73_Dne("commands.say.usage", new Object[0]);
    }

    @Override
    public void method_4036a99a_Dne(gnI gnI2, String[] stringArray) {
        if (stringArray.length <= 0 || stringArray[0].length() <= 0) {
            throw new fxw_0("commands.say.usage", new Object[0]);
        }
        String string = fTH.method_9a1548b5_Dne(gnI2, stringArray, 0, true);
        jwh_0.method_2302cf90_Dne().method_230ea953_Dne().method_bbfe582a_aFZ(String.format("[%s] %s", gnI2.method_193de2e9_a_(), string));
    }

    @Override
    public List method_cac7816d_Dne(gnI gnI2, String[] stringArray) {
        return stringArray.length >= 1 ? fTH.method_80180c4d_Dne(stringArray, jwh_0.method_2302cf90_Dne().method_631ac9e9_Dne()) : null;
    }

    @Override
    public int method_7a46288d_Dne() {
        return 1;
    }
}

