package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class IYH
extends xZE {
    @Override
    public void method_4036a99a_Dne(gnI gnI2, String[] stringArray) {
        PJQ pJQ;
        PJQ pJQ2 = pJQ = stringArray.length == 0 ? IYH.method_8672275f_Dne(gnI2) : IYH.method_4145cce9_Dne(gnI2, stringArray[0]);
        if (stringArray.length == 4) {
            if (pJQ.field_36c4f18_Dne != null) {
                int n = 1;
                int n2 = 30000000;
                int n3 = n + 1;
                int n4 = IYH.method_f7556a82_Dne(gnI2, stringArray[n], -n2, n2);
                int n5 = IYH.method_f7556a82_Dne(gnI2, stringArray[n3++], 0, 256);
                int n6 = IYH.method_f7556a82_Dne(gnI2, stringArray[n3++], -n2, n2);
                pJQ.method_addf466b_Dne(new iSh(n4, n5, n6), true);
                IYH.method_7424c4e2_Dne(gnI2, "commands.spawnpoint.success", pJQ.method_eecad346_Dne(), n4, n5, n6);
            }
        } else {
            if (stringArray.length > 1) {
                throw new fxw_0("commands.spawnpoint.usage", new Object[0]);
            }
            iSh iSh2 = pJQ.method_23105fed_Dne();
            pJQ.method_addf466b_Dne(iSh2, true);
            IYH.method_7424c4e2_Dne(gnI2, "commands.spawnpoint.success", pJQ.method_eecad346_Dne(), iSh2.field_2092ae_Dne, iSh2.field_21260d_FWm, iSh2.field_2e5f1b_bzF);
        }
    }

    @Override
    public boolean method_cb1fa962_Dne(String[] stringArray, int n) {
        return n == 0;
    }

    @Override
    public int method_7a46288d_Dne() {
        return 2;
    }

    @Override
    public List method_cac7816d_Dne(gnI gnI2, String[] stringArray) {
        return stringArray.length != 1 && stringArray.length != 2 ? null : IYH.method_80180c4d_Dne(stringArray, jwh_0.method_2302cf90_Dne().method_631ac9e9_Dne());
    }

    @Override
    public String method_eecad346_Dne() {
        return "spawnpoint";
    }

    @Override
    public String method_aef63bdb_Dne(gnI gnI2) {
        return gnI2.method_98148f73_Dne("commands.spawnpoint.usage", new Object[0]);
    }
}

