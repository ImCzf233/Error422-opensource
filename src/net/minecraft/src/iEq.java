package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class iEq
extends xZE {
    @Override
    public void method_4036a99a_Dne(gnI gnI2, String[] stringArray) {
        int n;
        boolean bl;
        boolean bl2;
        if (stringArray.length <= 0) {
            throw new fxw_0("commands.xp.usage", new Object[0]);
        }
        String string = stringArray[0];
        boolean bl3 = bl2 = string.endsWith("l") || string.endsWith("L");
        if (bl2 && string.length() > 1) {
            string = string.substring(0, string.length() - 1);
        }
        boolean bl4 = bl = (n = iEq.method_4ef26f63_FWm(gnI2, string)) < 0;
        if (bl) {
            n *= -1;
        }
        PJQ pJQ = stringArray.length > 1 ? iEq.method_4145cce9_Dne(gnI2, stringArray[1]) : iEq.method_8672275f_Dne(gnI2);
        if (bl2) {
            if (bl) {
                pJQ.method_117d19ea_FWm(-n);
                iEq.method_7424c4e2_Dne(gnI2, "commands.xp.success.negative.levels", n, pJQ.method_eecad346_Dne());
            } else {
                pJQ.method_117d19ea_FWm(n);
                iEq.method_7424c4e2_Dne(gnI2, "commands.xp.success.levels", n, pJQ.method_eecad346_Dne());
            }
        } else {
            if (bl) {
                throw new fxw_0("commands.xp.failure.widthdrawXp", new Object[0]);
            }
            pJQ.method_b2e02a33_ooe(n);
            iEq.method_7424c4e2_Dne(gnI2, "commands.xp.success", n, pJQ.method_eecad346_Dne());
        }
    }

    @Override
    public List method_cac7816d_Dne(gnI gnI2, String[] stringArray) {
        return stringArray.length == 2 ? iEq.method_80180c4d_Dne(stringArray, this.method_631ac9e9_Dne()) : null;
    }

    @Override
    public int method_7a46288d_Dne() {
        return 2;
    }

    @Override
    public String method_eecad346_Dne() {
        return "xp";
    }

    @Override
    public String method_aef63bdb_Dne(gnI gnI2) {
        return gnI2.method_98148f73_Dne("commands.xp.usage", new Object[0]);
    }

    protected String[] method_631ac9e9_Dne() {
        return jwh_0.method_2302cf90_Dne().method_631ac9e9_Dne();
    }

    @Override
    public boolean method_cb1fa962_Dne(String[] stringArray, int n) {
        return n == 1;
    }
}

