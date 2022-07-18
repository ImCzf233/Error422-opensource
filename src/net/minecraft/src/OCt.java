package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class OCt
extends xZE {
    @Override
    public void method_4036a99a_Dne(gnI gnI2, String[] stringArray) {
        if (stringArray.length >= 1 && stringArray[0].equalsIgnoreCase("ips")) {
            gnI2.method_8f501fe4_Dne(gnI2.method_98148f73_Dne("commands.banlist.ips", jwh_0.method_2302cf90_Dne().method_230ea953_Dne().method_f883d846_FWm().method_d410254f_Dne().size()));
            gnI2.method_8f501fe4_Dne(OCt.method_f7f6f529_Dne(jwh_0.method_2302cf90_Dne().method_230ea953_Dne().method_f883d846_FWm().method_d410254f_Dne().keySet().toArray()));
        } else {
            gnI2.method_8f501fe4_Dne(gnI2.method_98148f73_Dne("commands.banlist.players", jwh_0.method_2302cf90_Dne().method_230ea953_Dne().method_230d8827_Dne().method_d410254f_Dne().size()));
            gnI2.method_8f501fe4_Dne(OCt.method_f7f6f529_Dne(jwh_0.method_2302cf90_Dne().method_230ea953_Dne().method_230d8827_Dne().method_d410254f_Dne().keySet().toArray()));
        }
    }

    @Override
    public String method_aef63bdb_Dne(gnI gnI2) {
        return gnI2.method_98148f73_Dne("commands.banlist.usage", new Object[0]);
    }

    @Override
    public String method_eecad346_Dne() {
        return "banlist";
    }

    @Override
    public int method_7a46288d_Dne() {
        return 3;
    }

    @Override
    public List method_cac7816d_Dne(gnI gnI2, String[] stringArray) {
        return stringArray.length == 1 ? OCt.method_80180c4d_Dne(stringArray, "players", "ips") : null;
    }

    @Override
    public boolean method_a8c9cf69_Dne(gnI gnI2) {
        return (jwh_0.method_2302cf90_Dne().method_230ea953_Dne().method_f883d846_FWm().method_7a46289e_Dne() || jwh_0.method_2302cf90_Dne().method_230ea953_Dne().method_230d8827_Dne().method_7a46289e_Dne()) && super.method_a8c9cf69_Dne(gnI2);
    }
}

