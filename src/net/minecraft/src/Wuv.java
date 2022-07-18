package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class Wuv
extends xZE {
    @Override
    public String method_aef63bdb_Dne(gnI gnI2) {
        return gnI2.method_98148f73_Dne("commands.give.usage", new Object[0]);
    }

    protected String[] method_631ac9e9_Dne() {
        return jwh_0.method_2302cf90_Dne().method_631ac9e9_Dne();
    }

    @Override
    public String method_eecad346_Dne() {
        return "give";
    }

    @Override
    public void method_4036a99a_Dne(gnI gnI2, String[] stringArray) {
        int n;
        int n2;
        int n3;
        PJQ pJQ;
        if (stringArray.length >= 2) {
            pJQ = Wuv.method_4145cce9_Dne(gnI2, stringArray[0]);
            n3 = Wuv.method_bda7e6e7_Dne(gnI2, stringArray[1], 1);
            n2 = 1;
            n = 0;
            if (dEr.field_836aa5b6_Dne[n3] == null) {
                throw new PUA("commands.give.notFound", n3);
            }
            if (stringArray.length >= 3) {
                n2 = Wuv.method_f7556a82_Dne(gnI2, stringArray[2], 1, 64);
            }
            if (stringArray.length >= 4) {
                n = Wuv.method_4ef26f63_FWm(gnI2, stringArray[3]);
            }
        } else {
            throw new fxw_0("commands.give.usage", new Object[0]);
        }
        NMq nMq = new NMq(n3, n2, n);
        JiM jiM = pJQ.method_c9a088b8_Dne(nMq);
        jiM.field_21260d_FWm = 0;
        Wuv.method_7424c4e2_Dne(gnI2, "commands.give.success", dEr.field_836aa5b6_Dne[n3].method_bfc22798_bzF(nMq), n3, n2, pJQ.method_eecad346_Dne());
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
        return stringArray.length == 1 ? Wuv.method_80180c4d_Dne(stringArray, this.method_631ac9e9_Dne()) : null;
    }
}

