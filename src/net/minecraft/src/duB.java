package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class duB
extends xZE {
    @Override
    public List method_cac7816d_Dne(gnI gnI2, String[] stringArray) {
        return stringArray.length == 1 ? duB.method_80180c4d_Dne(stringArray, this.method_631ac9e9_Dne()) : null;
    }

    protected String[] method_631ac9e9_Dne() {
        return jwh_0.method_2302cf90_Dne().method_631ac9e9_Dne();
    }

    @Override
    public int method_7a46288d_Dne() {
        return 2;
    }

    @Override
    public void method_4036a99a_Dne(gnI gnI2, String[] stringArray) {
        PJQ pJQ = stringArray.length == 0 ? duB.method_8672275f_Dne(gnI2) : duB.method_4145cce9_Dne(gnI2, stringArray[0]);
        int n = stringArray.length >= 2 ? duB.method_bda7e6e7_Dne(gnI2, stringArray[1], 1) : -1;
        int n2 = stringArray.length >= 3 ? duB.method_bda7e6e7_Dne(gnI2, stringArray[2], 0) : -1;
        int n3 = pJQ.field_36a059b_Dne.method_16cca6d_Dne(n, n2);
        pJQ.field_36bb35e_Dne.method_7a46289a_Dne();
        if (n3 == 0) {
            throw new WoB("commands.clear.failure", pJQ.method_eecad346_Dne());
        }
        duB.method_7424c4e2_Dne(gnI2, "commands.clear.success", pJQ.method_eecad346_Dne(), n3);
    }

    @Override
    public String method_aef63bdb_Dne(gnI gnI2) {
        return gnI2.method_98148f73_Dne("commands.clear.usage", new Object[0]);
    }

    @Override
    public String method_eecad346_Dne() {
        return "clear";
    }

    @Override
    public boolean method_cb1fa962_Dne(String[] stringArray, int n) {
        return n == 0;
    }
}

