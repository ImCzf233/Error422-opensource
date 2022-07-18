package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class STA
extends xZE {
    @Override
    public List method_cac7816d_Dne(gnI gnI2, String[] stringArray) {
        if (stringArray.length == 1) {
            return STA.method_80180c4d_Dne(stringArray, "on", "off", "list", "add", "remove", "reload");
        }
        if (stringArray.length == 2) {
            if (stringArray[0].equals("add")) {
                String[] stringArray2 = jwh_0.method_2302cf90_Dne().method_230ea953_Dne().method_e4d6f7c8_FWm();
                ArrayList<String> arrayList = new ArrayList<String>();
                String string = stringArray[stringArray.length - 1];
                String[] stringArray3 = stringArray2;
                int n = stringArray2.length;
                for (int i = 0; i < n; ++i) {
                    String string2 = stringArray3[i];
                    if (!STA.method_abaa98b2_Dne(string, string2) || jwh_0.method_2302cf90_Dne().method_230ea953_Dne().method_d412ef09_Dne().contains(string2)) continue;
                    arrayList.add(string2);
                }
                return arrayList;
            }
            if (stringArray[0].equals("remove")) {
                return STA.method_2db2e1b9_Dne(stringArray, jwh_0.method_2302cf90_Dne().method_230ea953_Dne().method_d412ef09_Dne());
            }
        }
        return null;
    }

    @Override
    public String method_eecad346_Dne() {
        return "whitelist";
    }

    @Override
    public void method_4036a99a_Dne(gnI gnI2, String[] stringArray) {
        if (stringArray.length >= 1) {
            if (stringArray[0].equals("on")) {
                jwh_0.method_2302cf90_Dne().method_230ea953_Dne().method_ce7f9d7a_Dne(true);
                STA.method_7424c4e2_Dne(gnI2, "commands.whitelist.enabled", new Object[0]);
                return;
            }
            if (stringArray[0].equals("off")) {
                jwh_0.method_2302cf90_Dne().method_230ea953_Dne().method_ce7f9d7a_Dne(false);
                STA.method_7424c4e2_Dne(gnI2, "commands.whitelist.disabled", new Object[0]);
                return;
            }
            if (stringArray[0].equals("list")) {
                gnI2.method_8f501fe4_Dne(gnI2.method_98148f73_Dne("commands.whitelist.list", jwh_0.method_2302cf90_Dne().method_230ea953_Dne().method_d412ef09_Dne().size(), jwh_0.method_2302cf90_Dne().method_230ea953_Dne().method_e4d6f7c8_FWm().length));
                gnI2.method_8f501fe4_Dne(STA.method_f7f6f529_Dne(jwh_0.method_2302cf90_Dne().method_230ea953_Dne().method_d412ef09_Dne().toArray(new String[0])));
                return;
            }
            if (stringArray[0].equals("add")) {
                if (stringArray.length < 2) {
                    throw new fxw_0("commands.whitelist.add.usage", new Object[0]);
                }
                jwh_0.method_2302cf90_Dne().method_230ea953_Dne().method_47a073d1_bzF(stringArray[1]);
                STA.method_7424c4e2_Dne(gnI2, "commands.whitelist.add.success", stringArray[1]);
                return;
            }
            if (stringArray[0].equals("remove")) {
                if (stringArray.length < 2) {
                    throw new fxw_0("commands.whitelist.remove.usage", new Object[0]);
                }
                jwh_0.method_2302cf90_Dne().method_230ea953_Dne().method_a9a920ab_Qnq(stringArray[1]);
                STA.method_7424c4e2_Dne(gnI2, "commands.whitelist.remove.success", stringArray[1]);
                return;
            }
            if (stringArray[0].equals("reload")) {
                jwh_0.method_2302cf90_Dne().method_230ea953_Dne().method_ae128dc7_bzF();
                STA.method_7424c4e2_Dne(gnI2, "commands.whitelist.reloaded", new Object[0]);
                return;
            }
        }
        throw new fxw_0("commands.whitelist.usage", new Object[0]);
    }

    @Override
    public int method_7a46288d_Dne() {
        return 3;
    }

    @Override
    public String method_aef63bdb_Dne(gnI gnI2) {
        return gnI2.method_98148f73_Dne("commands.whitelist.usage", new Object[0]);
    }
}

