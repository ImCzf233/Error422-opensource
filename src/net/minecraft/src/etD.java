package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.List;

public class etD
extends xZE {
    @Override
    public String method_eecad346_Dne() {
        return "tell";
    }

    @Override
    public List method_cac7816d_Dne(gnI gnI2, String[] stringArray) {
        return etD.method_80180c4d_Dne(stringArray, jwh_0.method_2302cf90_Dne().method_631ac9e9_Dne());
    }

    @Override
    public boolean method_cb1fa962_Dne(String[] stringArray, int n) {
        return n == 0;
    }

    @Override
    public List method_adea226d_Dne() {
        return Arrays.asList("w", "msg");
    }

    @Override
    public int method_7a46288d_Dne() {
        return 0;
    }

    @Override
    public void method_4036a99a_Dne(gnI gnI2, String[] stringArray) {
        if (stringArray.length < 2) {
            throw new fxw_0("commands.message.usage", new Object[0]);
        }
        PJQ pJQ = etD.method_4145cce9_Dne(gnI2, stringArray[0]);
        if (pJQ == null) {
            throw new FKZ();
        }
        if (pJQ == gnI2) {
            throw new FKZ("commands.message.sameTarget", new Object[0]);
        }
        String string = etD.method_9a1548b5_Dne(gnI2, stringArray, 1, !(gnI2 instanceof FiG));
        pJQ.method_8f501fe4_Dne((Object)((Object)Dne.field_140f3afb_div) + "" + (Object)((Object)Dne.field_75727fbe_EyB) + pJQ.method_98148f73_Dne("commands.message.display.incoming", gnI2.method_193de2e9_a_(), string));
        gnI2.method_8f501fe4_Dne((Object)((Object)Dne.field_140f3afb_div) + "" + (Object)((Object)Dne.field_75727fbe_EyB) + gnI2.method_98148f73_Dne("commands.message.display.outgoing", pJQ.method_193de2e9_a_(), string));
    }
}

