package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class FxW
extends xZE {
    @Override
    public String method_eecad346_Dne() {
        return "kick";
    }

    @Override
    public String method_aef63bdb_Dne(gnI gnI2) {
        return gnI2.method_98148f73_Dne("commands.kick.usage", new Object[0]);
    }

    @Override
    public void method_4036a99a_Dne(gnI gnI2, String[] stringArray) {
        if (stringArray.length > 0 && stringArray[0].length() > 1) {
            PJQ pJQ = jwh_0.method_2302cf90_Dne().method_230ea953_Dne().method_f27246bd_FWm(stringArray[0]);
            String string = "Kicked by an operator.";
            boolean bl = false;
            if (pJQ == null) {
                throw new FKZ();
            }
            if (stringArray.length >= 2) {
                string = FxW.method_3140bf17_Dne(gnI2, stringArray, 1);
                bl = true;
            }
            pJQ.field_36dacd0_Dne.method_8f501fe4_Dne(string);
            if (bl) {
                FxW.method_7424c4e2_Dne(gnI2, "commands.kick.success.reason", pJQ.method_eecad346_Dne(), string);
            } else {
                FxW.method_7424c4e2_Dne(gnI2, "commands.kick.success", pJQ.method_eecad346_Dne());
            }
        } else {
            throw new fxw_0("commands.kick.usage", new Object[0]);
        }
    }

    @Override
    public int method_7a46288d_Dne() {
        return 3;
    }

    @Override
    public List method_cac7816d_Dne(gnI gnI2, String[] stringArray) {
        return stringArray.length >= 1 ? FxW.method_80180c4d_Dne(stringArray, jwh_0.method_2302cf90_Dne().method_631ac9e9_Dne()) : null;
    }
}

