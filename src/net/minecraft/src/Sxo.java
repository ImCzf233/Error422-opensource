package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class Sxo
extends xZE {
    @Override
    public void method_4036a99a_Dne(gnI gnI2, String[] stringArray) {
        if (stringArray.length > 0) {
            XHL xHL = this.method_414967c4_Dne(gnI2, stringArray[0]);
            PJQ pJQ = stringArray.length >= 2 ? Sxo.method_4145cce9_Dne(gnI2, stringArray[1]) : Sxo.method_8672275f_Dne(gnI2);
            pJQ.method_8d1afe0b_Dne(xHL);
            pJQ.field_2e8483_ceE = 0.0f;
            String string = KGL.method_39193c_Dne("gameMode." + xHL.method_eecad346_Dne());
            if (pJQ != gnI2) {
                Sxo.method_10bcc7a9_Dne(gnI2, 1, "commands.gamemode.success.other", pJQ.method_eecad346_Dne(), string);
            } else {
                Sxo.method_10bcc7a9_Dne(gnI2, 1, "commands.gamemode.success.self", string);
            }
        } else {
            throw new fxw_0("commands.gamemode.usage", new Object[0]);
        }
    }

    protected String[] method_631ac9e9_Dne() {
        return jwh_0.method_2302cf90_Dne().method_631ac9e9_Dne();
    }

    protected XHL method_414967c4_Dne(gnI gnI2, String string) {
        return !string.equalsIgnoreCase(XHL.field_2028b66f_FWm.method_eecad346_Dne()) && !string.equalsIgnoreCase("s") ? (!string.equalsIgnoreCase(XHL.field_75b6b87d_bzF.method_eecad346_Dne()) && !string.equalsIgnoreCase("c") ? (!string.equalsIgnoreCase(XHL.field_5e585957_Qnq.method_eecad346_Dne()) && !string.equalsIgnoreCase("a") ? mrb.method_9e728e7e_Dne(Sxo.method_f7556a82_Dne(gnI2, string, 0, XHL.values().length - 2)) : XHL.field_5e585957_Qnq) : XHL.field_75b6b87d_bzF) : XHL.field_2028b66f_FWm;
    }

    @Override
    public String method_aef63bdb_Dne(gnI gnI2) {
        return gnI2.method_98148f73_Dne("commands.gamemode.usage", new Object[0]);
    }

    @Override
    public List method_cac7816d_Dne(gnI gnI2, String[] stringArray) {
        return stringArray.length == 1 ? Sxo.method_80180c4d_Dne(stringArray, "survival", "creative", "adventure") : (stringArray.length == 2 ? Sxo.method_80180c4d_Dne(stringArray, this.method_631ac9e9_Dne()) : null);
    }

    @Override
    public boolean method_cb1fa962_Dne(String[] stringArray, int n) {
        return n == 1;
    }

    @Override
    public String method_eecad346_Dne() {
        return "gamemode";
    }

    @Override
    public int method_7a46288d_Dne() {
        return 2;
    }
}

