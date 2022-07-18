package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class kSP
extends Sxo {
    @Override
    public String method_eecad346_Dne() {
        return "defaultgamemode";
    }

    @Override
    public String method_aef63bdb_Dne(gnI gnI2) {
        return gnI2.method_98148f73_Dne("commands.defaultgamemode.usage", new Object[0]);
    }

    protected void method_8d1afe0b_Dne(XHL xHL) {
        jwh_0.method_2302cf90_Dne().method_8d1afe0b_Dne(xHL);
    }

    @Override
    public void method_4036a99a_Dne(gnI gnI2, String[] stringArray) {
        if (stringArray.length <= 0) {
            throw new fxw_0("commands.defaultgamemode.usage", new Object[0]);
        }
        XHL xHL = this.method_414967c4_Dne(gnI2, stringArray[0]);
        this.method_8d1afe0b_Dne(xHL);
        String string = KGL.method_39193c_Dne("gameMode." + xHL.method_eecad346_Dne());
        kSP.method_7424c4e2_Dne(gnI2, "commands.defaultgamemode.success", string);
    }
}

