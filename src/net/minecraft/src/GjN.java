package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class GjN
extends xZE {
    @Override
    public String method_eecad346_Dne() {
        return "deop";
    }

    @Override
    public int method_7a46288d_Dne() {
        return 3;
    }

    @Override
    public List method_cac7816d_Dne(gnI gnI2, String[] stringArray) {
        return stringArray.length == 1 ? GjN.method_2db2e1b9_Dne(stringArray, jwh_0.method_2302cf90_Dne().method_230ea953_Dne().method_4d96e468_FWm()) : null;
    }

    @Override
    public String method_aef63bdb_Dne(gnI gnI2) {
        return gnI2.method_98148f73_Dne("commands.deop.usage", new Object[0]);
    }

    @Override
    public void method_4036a99a_Dne(gnI gnI2, String[] stringArray) {
        if (stringArray.length != 1 || stringArray[0].length() <= 0) {
            throw new fxw_0("commands.deop.usage", new Object[0]);
        }
        jwh_0.method_2302cf90_Dne().method_230ea953_Dne().method_110c4dc3_FWm(stringArray[0]);
        GjN.method_7424c4e2_Dne(gnI2, "commands.deop.success", stringArray[0]);
    }
}

