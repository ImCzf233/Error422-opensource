package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class tqk
extends xZE {
    public static final Pattern field_b2ec7984_Dne = Pattern.compile("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");

    @Override
    public List method_cac7816d_Dne(gnI gnI2, String[] stringArray) {
        return stringArray.length == 1 ? tqk.method_80180c4d_Dne(stringArray, jwh_0.method_2302cf90_Dne().method_631ac9e9_Dne()) : null;
    }

    @Override
    public String method_eecad346_Dne() {
        return "ban-ip";
    }

    protected void method_7de7f5f9_Dne(gnI gnI2, String string, String string2) {
        eHI eHI2 = new eHI(string);
        eHI2.method_8f501fe4_Dne(gnI2.method_193de2e9_a_());
        if (string2 != null) {
            eHI2.method_110c4dc3_FWm(string2);
        }
        jwh_0.method_2302cf90_Dne().method_230ea953_Dne().method_f883d846_FWm().method_a348a101_Dne(eHI2);
        List<PJQ> list = jwh_0.method_2302cf90_Dne().method_230ea953_Dne().method_b6fd6de3_Dne(string);
        Object[] objectArray = new String[list.size()];
        int n = 0;
        for (PJQ pJQ : list) {
            pJQ.field_36dacd0_Dne.method_8f501fe4_Dne("You have been IP banned.");
            objectArray[n++] = pJQ.method_eecad346_Dne();
        }
        if (list.isEmpty()) {
            tqk.method_7424c4e2_Dne(gnI2, "commands.banip.success", string);
        } else {
            tqk.method_7424c4e2_Dne(gnI2, "commands.banip.success.players", string, tqk.method_f7f6f529_Dne(objectArray));
        }
    }

    @Override
    public boolean method_a8c9cf69_Dne(gnI gnI2) {
        return jwh_0.method_2302cf90_Dne().method_230ea953_Dne().method_f883d846_FWm().method_7a46289e_Dne() && super.method_a8c9cf69_Dne(gnI2);
    }

    @Override
    public void method_4036a99a_Dne(gnI gnI2, String[] stringArray) {
        if (stringArray.length >= 1 && stringArray[0].length() > 1) {
            Matcher matcher = field_b2ec7984_Dne.matcher(stringArray[0]);
            String string = null;
            if (stringArray.length >= 2) {
                string = tqk.method_3140bf17_Dne(gnI2, stringArray, 1);
            }
            if (matcher.matches()) {
                this.method_7de7f5f9_Dne(gnI2, stringArray[0], string);
            } else {
                PJQ pJQ = jwh_0.method_2302cf90_Dne().method_230ea953_Dne().method_f27246bd_FWm(stringArray[0]);
                if (pJQ == null) {
                    throw new FKZ("commands.banip.invalid", new Object[0]);
                }
                this.method_7de7f5f9_Dne(gnI2, pJQ.method_d1f1ed87_FWm(), string);
            }
        } else {
            throw new fxw_0("commands.banip.usage", new Object[0]);
        }
    }

    @Override
    public int method_7a46288d_Dne() {
        return 3;
    }

    @Override
    public String method_aef63bdb_Dne(gnI gnI2) {
        return gnI2.method_98148f73_Dne("commands.banip.usage", new Object[0]);
    }
}

