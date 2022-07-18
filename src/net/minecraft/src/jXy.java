package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class jXy
extends xZE {
    @Override
    public String method_aef63bdb_Dne(gnI gnI2) {
        return gnI2.method_98148f73_Dne("commands.time.usage", new Object[0]);
    }

    @Override
    public void method_4036a99a_Dne(gnI gnI2, String[] stringArray) {
        if (stringArray.length > 1) {
            if (stringArray[0].equals("set")) {
                int n = stringArray[1].equals("day") ? 0 : (stringArray[1].equals("night") ? 12500 : jXy.method_bda7e6e7_Dne(gnI2, stringArray[1], 0));
                this.method_7070903e_Dne(gnI2, n);
                jXy.method_7424c4e2_Dne(gnI2, "commands.time.set", n);
                return;
            }
            if (stringArray[0].equals("add")) {
                int n = jXy.method_bda7e6e7_Dne(gnI2, stringArray[1], 0);
                this.method_c193549d_FWm(gnI2, n);
                jXy.method_7424c4e2_Dne(gnI2, "commands.time.added", n);
                return;
            }
        }
        throw new fxw_0("commands.time.usage", new Object[0]);
    }

    protected void method_7070903e_Dne(gnI gnI2, int n) {
        for (int i = 0; i < jwh_0.method_2302cf90_Dne().field_836263a8_Dne.length; ++i) {
            jwh_0.method_2302cf90_Dne().field_836263a8_Dne[i].method_117d1dab_FWm(n);
        }
    }

    protected void method_c193549d_FWm(gnI gnI2, int n) {
        for (int i = 0; i < jwh_0.method_2302cf90_Dne().field_836263a8_Dne.length; ++i) {
            RAN rAN = jwh_0.method_2302cf90_Dne().field_836263a8_Dne[i];
            rAN.method_117d1dab_FWm(rAN.method_ae128dbb_bzF() + (long)n);
        }
    }

    @Override
    public List method_cac7816d_Dne(gnI gnI2, String[] stringArray) {
        return stringArray.length == 1 ? jXy.method_80180c4d_Dne(stringArray, "set", "add") : (stringArray.length == 2 && stringArray[0].equals("set") ? jXy.method_80180c4d_Dne(stringArray, "day", "night") : null);
    }

    @Override
    public int method_7a46288d_Dne() {
        return 2;
    }

    @Override
    public String method_eecad346_Dne() {
        return "time";
    }
}

