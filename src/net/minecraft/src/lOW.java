package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class lOW
extends xZE {
    @Override
    public int method_7a46288d_Dne() {
        return 3;
    }

    @Override
    public List method_cac7816d_Dne(gnI gnI2, String[] stringArray) {
        return stringArray.length >= 1 ? lOW.method_80180c4d_Dne(stringArray, jwh_0.method_2302cf90_Dne().method_631ac9e9_Dne()) : null;
    }

    @Override
    public String method_eecad346_Dne() {
        return "ban";
    }

    @Override
    public boolean method_a8c9cf69_Dne(gnI gnI2) {
        return jwh_0.method_2302cf90_Dne().method_230ea953_Dne().method_230d8827_Dne().method_7a46289e_Dne() && super.method_a8c9cf69_Dne(gnI2);
    }

    @Override
    public void method_4036a99a_Dne(gnI gnI2, String[] stringArray) {
        if (stringArray.length >= 1 && stringArray[0].length() > 0) {
            PJQ pJQ = jwh_0.method_2302cf90_Dne().method_230ea953_Dne().method_f27246bd_FWm(stringArray[0]);
            eHI eHI2 = new eHI(stringArray[0]);
            eHI2.method_8f501fe4_Dne(gnI2.method_193de2e9_a_());
            if (stringArray.length >= 2) {
                eHI2.method_110c4dc3_FWm(lOW.method_3140bf17_Dne(gnI2, stringArray, 1));
            }
            jwh_0.method_2302cf90_Dne().method_230ea953_Dne().method_230d8827_Dne().method_a348a101_Dne(eHI2);
            if (pJQ != null) {
                pJQ.field_36dacd0_Dne.method_8f501fe4_Dne("You are banned from this server.");
            }
        } else {
            throw new fxw_0("commands.ban.usage", new Object[0]);
        }
        lOW.method_7424c4e2_Dne(gnI2, "commands.ban.success", stringArray[0]);
    }

    @Override
    public String method_aef63bdb_Dne(gnI gnI2) {
        return gnI2.method_98148f73_Dne("commands.ban.usage", new Object[0]);
    }
}

