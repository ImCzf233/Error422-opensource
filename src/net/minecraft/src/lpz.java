package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class lpz
extends xZE {
    @Override
    public String method_aef63bdb_Dne(gnI gnI2) {
        return gnI2.method_98148f73_Dne("commands.gamerule.usage", new Object[0]);
    }

    @Override
    public String method_eecad346_Dne() {
        return "gamerule";
    }

    @Override
    public int method_7a46288d_Dne() {
        return 2;
    }

    private aSc method_230cbc5a_Dne() {
        return jwh_0.method_2302cf90_Dne().method_9e6fba3b_Dne(0).method_230cbc5a_Dne();
    }

    @Override
    public void method_4036a99a_Dne(gnI gnI2, String[] stringArray) {
        if (stringArray.length == 2) {
            String string = stringArray[0];
            String string2 = stringArray[1];
            aSc aSc2 = this.method_230cbc5a_Dne();
            if (aSc2.method_110c4dc7_FWm(string)) {
                aSc2.method_d100accd_FWm(string, string2);
                lpz.method_7424c4e2_Dne(gnI2, "commands.gamerule.success", new Object[0]);
            } else {
                lpz.method_7424c4e2_Dne(gnI2, "commands.gamerule.norule", string);
            }
        } else if (stringArray.length == 1) {
            String string = stringArray[0];
            aSc aSc3 = this.method_230cbc5a_Dne();
            if (aSc3.method_110c4dc7_FWm(string)) {
                String string3 = aSc3.method_39193c_Dne(string);
                gnI2.method_8f501fe4_Dne(string + " = " + string3);
            } else {
                lpz.method_7424c4e2_Dne(gnI2, "commands.gamerule.norule", string);
            }
        } else if (stringArray.length == 0) {
            aSc aSc4 = this.method_230cbc5a_Dne();
            gnI2.method_8f501fe4_Dne(lpz.method_f7f6f529_Dne(aSc4.method_631ac9e9_Dne()));
        } else {
            throw new fxw_0("commands.gamerule.usage", new Object[0]);
        }
    }

    @Override
    public List method_cac7816d_Dne(gnI gnI2, String[] stringArray) {
        return stringArray.length == 1 ? lpz.method_80180c4d_Dne(stringArray, this.method_230cbc5a_Dne().method_631ac9e9_Dne()) : (stringArray.length == 2 ? lpz.method_80180c4d_Dne(stringArray, "true", "false") : null);
    }
}

