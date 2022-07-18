package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class giz
extends xZE {
    @Override
    public int method_7a46288d_Dne() {
        return 0;
    }

    protected List method_bd90ac42_Dne(gnI gnI2) {
        List list = jwh_0.method_2302cf90_Dne().method_2300868f_Dne().method_bd90ac42_Dne(gnI2);
        Collections.sort(list);
        return list;
    }

    @Override
    public String method_eecad346_Dne() {
        return "help";
    }

    @Override
    public String method_aef63bdb_Dne(gnI gnI2) {
        return gnI2.method_98148f73_Dne("commands.help.usage", new Object[0]);
    }

    @Override
    public void method_4036a99a_Dne(gnI gnI2, String[] stringArray) {
        int n;
        List list = this.method_bd90ac42_Dne(gnI2);
        int n2 = 7;
        int n3 = (list.size() - 1) / n2;
        boolean bl = false;
        try {
            n = stringArray.length == 0 ? 0 : giz.method_f7556a82_Dne(gnI2, stringArray[0], 1, n3 + 1) - 1;
        }
        catch (PUA pUA) {
            Map map = this.method_d410254f_Dne();
            IMF iMF = (IMF)map.get(stringArray[0]);
            if (iMF != null) {
                throw new fxw_0(iMF.method_aef63bdb_Dne(gnI2), new Object[0]);
            }
            throw new PKs();
        }
        int n4 = Math.min((n + 1) * n2, list.size());
        gnI2.method_8f501fe4_Dne((Object)((Object)Dne.field_75ae32be_bzF) + gnI2.method_98148f73_Dne("commands.help.header", n + 1, n3 + 1));
        for (int i = n * n2; i < n4; ++i) {
            IMF iMF = (IMF)list.get(i);
            gnI2.method_8f501fe4_Dne(iMF.method_aef63bdb_Dne(gnI2));
        }
        if (n == 0 && gnI2 instanceof FiG) {
            gnI2.method_8f501fe4_Dne((Object)((Object)Dne.field_1c27f310_XHL) + gnI2.method_98148f73_Dne("commands.help.footer", new Object[0]));
        }
    }

    protected Map method_d410254f_Dne() {
        return jwh_0.method_2302cf90_Dne().method_2300868f_Dne().method_d410254f_Dne();
    }

    @Override
    public List method_adea226d_Dne() {
        return Arrays.asList("?");
    }
}

