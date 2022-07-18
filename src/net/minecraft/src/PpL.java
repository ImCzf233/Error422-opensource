package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class PpL
extends xZE {
    @Override
    public List method_cac7816d_Dne(gnI gnI2, String[] stringArray) {
        return stringArray.length == 1 ? PpL.method_80180c4d_Dne(stringArray, this.method_631ac9e9_Dne()) : null;
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
        if (stringArray.length < 2) {
            throw new fxw_0("commands.enchant.usage", new Object[0]);
        }
        PJQ pJQ = PpL.method_4145cce9_Dne(gnI2, stringArray[0]);
        int n = PpL.method_f7556a82_Dne(gnI2, stringArray[1], 0, ycv.field_8374a29b_Dne.length - 1);
        int n2 = 1;
        NMq nMq = pJQ.method_22900b26_bzF();
        if (nMq == null) {
            PpL.method_7424c4e2_Dne(gnI2, "commands.enchant.noItem", new Object[0]);
        } else {
            ycv ycv2 = ycv.field_8374a29b_Dne[n];
            if (ycv2 == null) {
                throw new PUA("commands.enchant.notFound", n);
            }
            if (!ycv2.method_7c61cf19_Dne(nMq)) {
                PpL.method_7424c4e2_Dne(gnI2, "commands.enchant.cantEnchant", new Object[0]);
            } else {
                mbZ mbZ2;
                if (stringArray.length >= 3) {
                    n2 = PpL.method_f7556a82_Dne(gnI2, stringArray[2], ycv2.method_ae128dba_bzF(), ycv2.method_7a46288d_Dne());
                }
                if (nMq.method_a98a0664_aFZ() && (mbZ2 = nMq.method_23126806_Dne()) != null) {
                    for (int i = 0; i < mbZ2.method_7a46288d_Dne(); ++i) {
                        ycv ycv3;
                        short s = ((WkD)mbZ2.method_77d0d055_FWm(i)).method_8f501fe1_Dne("id");
                        if (ycv.field_8374a29b_Dne[s] == null || (ycv3 = ycv.field_8374a29b_Dne[s]).method_c6fa7cbf_Dne(ycv2)) continue;
                        PpL.method_7424c4e2_Dne(gnI2, "commands.enchant.cantCombine", ycv2.method_2c0e7e17_Dne(n2), ycv3.method_2c0e7e17_Dne(((WkD)mbZ2.method_77d0d055_FWm(i)).method_8f501fe1_Dne("lvl")));
                        return;
                    }
                }
                nMq.method_18558da8_Dne(ycv2, n2);
                PpL.method_7424c4e2_Dne(gnI2, "commands.enchant.success", new Object[0]);
            }
        }
    }

    @Override
    public String method_aef63bdb_Dne(gnI gnI2) {
        return gnI2.method_98148f73_Dne("commands.enchant.usage", new Object[0]);
    }

    @Override
    public boolean method_cb1fa962_Dne(String[] stringArray, int n) {
        return n == 0;
    }

    @Override
    public String method_eecad346_Dne() {
        return "enchant";
    }
}

