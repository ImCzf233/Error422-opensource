package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class khp
extends xZE {
    @Override
    public String method_aef63bdb_Dne(gnI gnI2) {
        return gnI2.method_98148f73_Dne("commands.op.usage", new Object[0]);
    }

    @Override
    public void method_4036a99a_Dne(gnI gnI2, String[] stringArray) {
        if (stringArray.length != 1 || stringArray[0].length() <= 0) {
            throw new fxw_0("commands.op.usage", new Object[0]);
        }
        jwh_0.method_2302cf90_Dne().method_230ea953_Dne().method_8f501fe4_Dne(stringArray[0]);
        khp.method_7424c4e2_Dne(gnI2, "commands.op.success", stringArray[0]);
    }

    @Override
    public int method_7a46288d_Dne() {
        return 3;
    }

    @Override
    public String method_eecad346_Dne() {
        return "op";
    }

    @Override
    public List method_cac7816d_Dne(gnI gnI2, String[] stringArray) {
        if (stringArray.length == 1) {
            String string = stringArray[stringArray.length - 1];
            ArrayList<String> arrayList = new ArrayList<String>();
            for (Object obj : jwh_0.method_2302cf90_Dne().method_631ac9e9_Dne()) {String string2 = (String) obj;
                if (jwh_0.method_2302cf90_Dne().method_230ea953_Dne().method_110c4dc7_FWm(string2) || !khp.method_abaa98b2_Dne(string, string2)) continue;
                arrayList.add(string2);
            }
            return arrayList;
        }
        return null;
    }
}

