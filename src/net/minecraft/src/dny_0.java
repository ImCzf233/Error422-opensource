package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

/*
 * Renamed from dNY
 */
public class dny_0
extends xZE {
    @Override
    public int method_7a46288d_Dne() {
        return 2;
    }

    @Override
    public String method_eecad346_Dne() {
        return "effect";
    }

    @Override
    public List method_cac7816d_Dne(gnI gnI2, String[] stringArray) {
        return stringArray.length == 1 ? dny_0.method_80180c4d_Dne(stringArray, this.method_631ac9e9_Dne()) : null;
    }

    protected String[] method_631ac9e9_Dne() {
        return jwh_0.method_2302cf90_Dne().method_631ac9e9_Dne();
    }

    @Override
    public boolean method_cb1fa962_Dne(String[] stringArray, int n) {
        return n == 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void method_4036a99a_Dne(gnI gnI2, String[] stringArray) {
        if (stringArray.length < 2) throw new fxw_0("commands.effect.usage", new Object[0]);
        PJQ pJQ = dny_0.method_4145cce9_Dne(gnI2, stringArray[0]);
        int n = dny_0.method_bda7e6e7_Dne(gnI2, stringArray[1], 1);
        int n2 = 600;
        int n3 = 30;
        int n4 = 0;
        if (n < 0 || n >= SXd.field_83633108_Dne.length || SXd.field_83633108_Dne[n] == null) throw new PUA("commands.effect.notFound", n);
        if (stringArray.length >= 3) {
            n3 = dny_0.method_f7556a82_Dne(gnI2, stringArray[2], 0, 1000000);
            n2 = SXd.field_83633108_Dne[n].method_7a46289e_Dne() ? n3 : n3 * 20;
        } else if (SXd.field_83633108_Dne[n].method_7a46289e_Dne()) {
            n2 = 1;
        }
        if (stringArray.length >= 4) {
            n4 = dny_0.method_f7556a82_Dne(gnI2, stringArray[3], 0, 255);
        }
        if (n3 == 0) {
            if (!pJQ.method_117d19ee_FWm(n)) {
                throw new WoB("commands.effect.failure.notActive", KGL.method_39193c_Dne(SXd.field_83633108_Dne[n].method_eecad346_Dne()), pJQ.method_eecad346_Dne());
            }
            pJQ.method_ae438b8a_XHL(n);
            dny_0.method_7424c4e2_Dne(gnI2, "commands.effect.success.removed", KGL.method_39193c_Dne(SXd.field_83633108_Dne[n].method_eecad346_Dne()), pJQ.method_eecad346_Dne());
            return;
        } else {
            NAx nAx = new NAx(n, n2, n4);
            pJQ.method_fe8e2b7b_Qnq(nAx);
            dny_0.method_7424c4e2_Dne(gnI2, "commands.effect.success", KGL.method_39193c_Dne(nAx.method_eecad346_Dne()), n, n4, pJQ.method_eecad346_Dne(), n3);
        }
    }

    @Override
    public String method_aef63bdb_Dne(gnI gnI2) {
        return gnI2.method_98148f73_Dne("commands.effect.usage", new Object[0]);
    }
}

