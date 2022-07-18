package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class xZE
implements IMF {
    private static yzC field_37ea56a_Dne = null;

    @Override
    public boolean method_cb1fa962_Dne(String[] stringArray, int n) {
        return false;
    }

    public static PJQ method_8672275f_Dne(gnI gnI2) {
        if (gnI2 instanceof PJQ) {
            return (PJQ)gnI2;
        }
        throw new FKZ("You must specify which player you wish to perform this action on.", new Object[0]);
    }

    public static void method_c8276a65_Dne(yzC yzC2) {
        field_37ea56a_Dne = yzC2;
    }

    public static String method_9a1548b5_Dne(gnI gnI2, String[] stringArray, int n, boolean bl) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = n; i < stringArray.length; ++i) {
            if (i > n) {
                stringBuilder.append(" ");
            }
            String string = stringArray[i];
            if (bl) {
                String string2 = IYC.method_17856691_Dne(gnI2, string);
                if (string2 != null) {
                    string = string2;
                } else if (IYC.method_110c4dc7_FWm(string)) {
                    throw new FKZ();
                }
            }
            stringBuilder.append(string);
        }
        return stringBuilder.toString();
    }

    public static double method_d491c9dd_Dne(gnI gnI2, String string) {
        try {
            return Double.parseDouble(string);
        }
        catch (NumberFormatException numberFormatException) {
            throw new PUA("commands.generic.double.invalid", string);
        }
    }

    public static String method_17856691_Dne(gnI gnI2, String string) {
        PJQ pJQ = IYC.method_4145cce9_Dne(gnI2, string);
        if (pJQ != null) {
            return pJQ.method_eecad346_Dne();
        }
        if (IYC.method_110c4dc7_FWm(string)) {
            throw new FKZ();
        }
        return string;
    }

    public static int method_f7556a82_Dne(gnI gnI2, String string, int n, int n2) {
        int n3 = xZE.method_4ef26f63_FWm(gnI2, string);
        if (n3 < n) {
            throw new PUA("commands.generic.num.tooSmall", n3, n);
        }
        if (n3 > n2) {
            throw new PUA("commands.generic.num.tooBig", n3, n2);
        }
        return n3;
    }

    public static String method_f7f6f529_Dne(Object[] objectArray) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < objectArray.length; ++i) {
            String string = objectArray[i].toString();
            if (i > 0) {
                if (i == objectArray.length - 1) {
                    stringBuilder.append(" and ");
                } else {
                    stringBuilder.append(", ");
                }
            }
            stringBuilder.append(string);
        }
        return stringBuilder.toString();
    }

    public int method_7a46288d_Dne() {
        return 4;
    }

    public static int method_4ef26f63_FWm(gnI gnI2, String string) {
        try {
            return Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            throw new PUA("commands.generic.num.invalid", string);
        }
    }

    public static PJQ method_4145cce9_Dne(gnI gnI2, String string) {
        PJQ pJQ = IYC.method_4145cce9_Dne(gnI2, string);
        if (pJQ != null) {
            return pJQ;
        }
        pJQ = jwh_0.method_2302cf90_Dne().method_230ea953_Dne().method_f27246bd_FWm(string);
        if (pJQ == null) {
            throw new FKZ();
        }
        return pJQ;
    }

    public int method_73c607f8_Dne(IMF iMF) {
        return this.method_eecad346_Dne().compareTo(iMF.method_eecad346_Dne());
    }

    public static void method_10bcc7a9_Dne(gnI gnI2, int n, String string, Object ... objectArray) {
        if (field_37ea56a_Dne != null) {
            field_37ea56a_Dne.method_10bcc7a9_Dne(gnI2, n, string, objectArray);
        }
    }

    @Override
    public List method_adea226d_Dne() {
        return null;
    }

    public static boolean method_abaa98b2_Dne(String string, String string2) {
        return string2.regionMatches(true, 0, string, 0, string.length());
    }

    @Override
    public List method_cac7816d_Dne(gnI gnI2, String[] stringArray) {
        return null;
    }

    @Override
    public String method_aef63bdb_Dne(gnI gnI2) {
        return "/" + this.method_eecad346_Dne();
    }

    public static List method_80180c4d_Dne(String[] stringArray, String ... stringArray2) {
        String string = stringArray[stringArray.length - 1];
        ArrayList<String> arrayList = new ArrayList<String>();
        String[] stringArray3 = stringArray2;
        int n = stringArray2.length;
        for (int i = 0; i < n; ++i) {
            String string2 = stringArray3[i];
            if (!xZE.method_abaa98b2_Dne(string, string2)) continue;
            arrayList.add(string2);
        }
        return arrayList;
    }

    public static void method_7424c4e2_Dne(gnI gnI2, String string, Object ... objectArray) {
        xZE.method_10bcc7a9_Dne(gnI2, 0, string, objectArray);
    }

    @Override
    public boolean method_a8c9cf69_Dne(gnI gnI2) {
        return gnI2.method_fa81cf37_Dne(this.method_7a46288d_Dne(), this.method_eecad346_Dne());
    }

    public static String method_64bfdd35_Dne(Collection collection) {
        return xZE.method_f7f6f529_Dne(collection.toArray(new String[0]));
    }

    public int compareTo(Object object) {
        return this.method_73c607f8_Dne((IMF)object);
    }

    public static String method_3140bf17_Dne(gnI gnI2, String[] stringArray, int n) {
        return xZE.method_9a1548b5_Dne(gnI2, stringArray, n, false);
    }

    public static int method_bda7e6e7_Dne(gnI gnI2, String string, int n) {
        return xZE.method_f7556a82_Dne(gnI2, string, n, Integer.MAX_VALUE);
    }

    public static List method_2db2e1b9_Dne(String[] stringArray, Iterable iterable) {
        String string = stringArray[stringArray.length - 1];
        ArrayList<String> arrayList = new ArrayList<String>();
        for (Object obj : iterable) {String string2 = (String) obj;
            if (!xZE.method_abaa98b2_Dne(string, string2)) continue;
            arrayList.add(string2);
        }
        return arrayList;
    }
}

