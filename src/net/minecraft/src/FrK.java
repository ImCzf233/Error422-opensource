package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FrK
implements FWm {
    private final Set<IMF> field_83b48b6a_Dne;
    private final Map field_83b1c1b0_Dne = new HashMap();

    private static String[] method_f2debed4_Dne(String[] stringArray) {
        String[] stringArray2 = new String[stringArray.length - 1];
        for (int i = 1; i < stringArray.length; ++i) {
            stringArray2[i - 1] = stringArray[i];
        }
        return stringArray2;
    }

    @Override
    public List method_b6370c78_Dne(gnI gnI2, String string) {
        IMF iMF;
        String[] stringArray = string.split(" ", -1);
        String string2 = stringArray[0];
        if (stringArray.length == 1) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : this.field_83b1c1b0_Dne.entrySet()) {
            	Map.Entry entry = (Entry) obj;
                if (!xZE.method_abaa98b2_Dne(string2, (String)entry.getKey()) || !((IMF)entry.getValue()).method_a8c9cf69_Dne(gnI2)) continue;
                arrayList.add(entry.getKey());
            }
            return arrayList;
        }
        if (stringArray.length > 1 && (iMF = (IMF)this.field_83b1c1b0_Dne.get(string2)) != null) {
            return iMF.method_cac7816d_Dne(gnI2, FrK.method_f2debed4_Dne(stringArray));
        }
        return null;
    }

    private int method_67c56ced_Dne(IMF iMF, String[] stringArray) {
        if (iMF == null) {
            return -1;
        }
        for (int i = 0; i < stringArray.length; ++i) {
            if (!iMF.method_cb1fa962_Dne(stringArray, i) || !IYC.method_8f501fe8_Dne(stringArray[i])) continue;
            return i;
        }
        return -1;
    }

    @Override
    public int method_d491c9e2_Dne(gnI gnI2, String string) {
        if ((string = string.trim()).startsWith("/")) {
            string = string.substring(1);
        }
        String[] stringArray = string.split(" ");
        String string2 = stringArray[0];
        stringArray = FrK.method_f2debed4_Dne(stringArray);
        IMF iMF = (IMF)this.field_83b1c1b0_Dne.get(string2);
        int n = this.method_67c56ced_Dne(iMF, stringArray);
        int n2 = 0;
        try {
            if (iMF == null) {
                throw new PKs();
            }
            if (iMF.method_a8c9cf69_Dne(gnI2)) {
                if (n > -1) {
                    PJQ[] pJQArray = IYC.method_d6c65c_Dne(gnI2, stringArray[n]);
                    String string3 = stringArray[n];
                    PJQ[] pJQArray2 = pJQArray;
                    int n3 = pJQArray.length;
                    for (int i = 0; i < n3; ++i) {
                        PJQ pJQ = pJQArray2[i];
                        stringArray[n] = pJQ.method_eecad346_Dne();
                        try {
                            iMF.method_4036a99a_Dne(gnI2, stringArray);
                            ++n2;
                            continue;
                        }
                        catch (WoB woB) {
                            gnI2.method_8f501fe4_Dne((Object)((Object)Dne.field_a2169639_kGO) + gnI2.method_98148f73_Dne(woB.getMessage(), woB.method_7057ec7b_Dne()));
                        }
                    }
                    stringArray[n] = string3;
                } else {
                    iMF.method_4036a99a_Dne(gnI2, stringArray);
                    ++n2;
                }
            } else {
                gnI2.method_8f501fe4_Dne("" + (Object)((Object)Dne.field_a2169639_kGO) + "You do not have permission to use this command.");
            }
        }
        catch (fxw_0 fxw_02) {
            gnI2.method_8f501fe4_Dne((Object)((Object)Dne.field_a2169639_kGO) + gnI2.method_98148f73_Dne("commands.generic.usage", gnI2.method_98148f73_Dne(fxw_02.getMessage(), fxw_02.method_7057ec7b_Dne())));
        }
        catch (WoB woB) {
            gnI2.method_8f501fe4_Dne((Object)((Object)Dne.field_a2169639_kGO) + gnI2.method_98148f73_Dne(woB.getMessage(), woB.method_7057ec7b_Dne()));
        }
        catch (Throwable throwable) {
            gnI2.method_8f501fe4_Dne((Object)((Object)Dne.field_a2169639_kGO) + gnI2.method_98148f73_Dne("commands.generic.exception", new Object[0]));
            throwable.printStackTrace();
        }
        return n2;
    }

    @Override
    public Map method_d410254f_Dne() {
        return this.field_83b1c1b0_Dne;
    }

    public FrK() {
        this.field_83b48b6a_Dne = new HashSet();
    }

    public IMF method_915deb54_Dne(IMF iMF) {
        List list = iMF.method_adea226d_Dne();
        this.field_83b1c1b0_Dne.put(iMF.method_eecad346_Dne(), iMF);
        this.field_83b48b6a_Dne.add(iMF);
        if (list != null) {
            for (Object obj : list) {String string = (String) obj;
                IMF iMF2 = (IMF)this.field_83b1c1b0_Dne.get(string);
                if (iMF2 != null && iMF2.method_eecad346_Dne().equals(string)) continue;
                this.field_83b1c1b0_Dne.put(string, iMF);
            }
        }
        return iMF;
    }

    @Override
    public List method_bd90ac42_Dne(gnI gnI2) {
        ArrayList<IMF> arrayList = new ArrayList<IMF>();
        for (IMF iMF : this.field_83b48b6a_Dne) {
            if (!iMF.method_a8c9cf69_Dne(gnI2)) continue;
            arrayList.add(iMF);
        }
        return arrayList;
    }
}

