package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class lDk {
    private final List<Jjb> field_f27c122c_Dne = new ArrayList();
    private final Map field_83b1c1b0_Dne = new HashMap();
    private int field_2092ae_Dne = 0;

    private static List method_b6fd6de3_Dne(String string) {
        if (string != null && string.length() >= 1) {
            ArrayList<Jjb> arrayList = new ArrayList<Jjb>();
            String[] stringArray = string.split(",");
            int n = 0;
            String[] stringArray2 = stringArray;
            int n2 = stringArray.length;
            for (int i = 0; i < n2; ++i) {
                String string2 = stringArray2[i];
                Jjb jjb = lDk.method_424bba8e_Dne(string2, n);
                if (jjb == null) {
                    return null;
                }
                arrayList.add(jjb);
                n += jjb.method_7a46288d_Dne();
            }
            return arrayList;
        }
        return null;
    }

    public List method_adea226d_Dne() {
        return this.field_f27c122c_Dne;
    }

    public static lDk method_285ac762_Dne(String string) {
        int n;
        if (string == null) {
            return lDk.method_23118518_Dne();
        }
        String[] stringArray = string.split(";", -1);
        int n2 = n = stringArray.length == 1 ? 0 : geR.method_5ab44f92_Dne(stringArray[0], 0);
        if (n >= 0 && n <= 2) {
            List list;
            lDk lDk2 = new lDk();
            int n3 = stringArray.length == 1 ? 0 : 1;
            if ((list = lDk.method_b6fd6de3_Dne(stringArray[n3++])) != null && !list.isEmpty()) {
                lDk2.method_adea226d_Dne().addAll(list);
                lDk2.method_7a46289a_Dne();
                int n4 = OdI.field_202507d7_FWm.field_267cf5_Qnq;
                if (n > 0 && stringArray.length > n3) {
                    n4 = geR.method_5ab44f92_Dne(stringArray[n3++], n4);
                }
                lDk2.method_ce7f5da9_Dne(n4);
                if (n > 0 && stringArray.length > n3) {
                    String[] stringArray2;
                    String[] stringArray3 = stringArray2 = stringArray[n3++].toLowerCase().split(",");
                    int n5 = stringArray2.length;
                    for (int i = 0; i < n5; ++i) {
                        String string2 = stringArray3[i];
                        String[] stringArray4 = string2.split("\\(", 2);
                        HashMap<String, String> hashMap = new HashMap<String, String>();
                        if (stringArray4[0].length() <= 0) continue;
                        lDk2.method_d410254f_Dne().put(stringArray4[0], hashMap);
                        if (stringArray4.length <= 1 || !stringArray4[1].endsWith(")") || stringArray4[1].length() <= 1) continue;
                        String[] stringArray5 = stringArray4[1].substring(0, stringArray4[1].length() - 1).split(" ");
                        for (int j = 0; j < stringArray5.length; ++j) {
                            String[] stringArray6 = stringArray5[j].split("=", 2);
                            if (stringArray6.length != 2) continue;
                            hashMap.put(stringArray6[0], stringArray6[1]);
                        }
                    }
                } else {
                    lDk2.method_d410254f_Dne().put("village", new HashMap());
                }
                return lDk2;
            }
            return lDk.method_23118518_Dne();
        }
        return lDk.method_23118518_Dne();
    }

    public String toString() {
        int n;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(2);
        stringBuilder.append(";");
        for (n = 0; n < this.field_f27c122c_Dne.size(); ++n) {
            if (n > 0) {
                stringBuilder.append(",");
            }
            stringBuilder.append(((Jjb)this.field_f27c122c_Dne.get(n)).toString());
        }
        stringBuilder.append(";");
        stringBuilder.append(this.field_2092ae_Dne);
        if (!this.field_83b1c1b0_Dne.isEmpty()) {
            stringBuilder.append(";");
            n = 0;
            for (Object obj : this.field_83b1c1b0_Dne.entrySet()) { Map.Entry entry = (Map.Entry) obj;
                if (n++ > 0) {
                    stringBuilder.append(",");
                }
                stringBuilder.append(((String)entry.getKey()).toLowerCase());
                Map map = (Map)entry.getValue();
                if (map.isEmpty()) continue;
                stringBuilder.append("(");
                int n2 = 0;
                for (Object obj2 : map.entrySet()) {
                	Map.Entry entry2 = (Entry) obj2;
                    if (n2++ > 0) {
                        stringBuilder.append(" ");
                    }
                    stringBuilder.append((String)entry2.getKey());
                    stringBuilder.append("=");
                    stringBuilder.append((String)entry2.getValue());
                }
                stringBuilder.append(")");
            }
        } else {
            stringBuilder.append(";");
        }
        return stringBuilder.toString();
    }

    private static Jjb method_424bba8e_Dne(String string, int n) {
        int n2;
        Object object;
        String[] stringArray = string.split("x", 2);
        int n3 = 1;
        int n4 = 0;
        if (stringArray.length == 2) {
            try {
                n3 = Integer.parseInt(stringArray[0]);
                if (n + n3 >= 256) {
                    n3 = 256 - n;
                }
                if (n3 < 0) {
                    n3 = 0;
                }
            }
            catch (Throwable throwable) {
                return null;
            }
        }
        try {
            object = stringArray[stringArray.length - 1];
            stringArray = ((String)object).split(":", 2);
            n2 = Integer.parseInt(stringArray[0]);
            if (stringArray.length > 1) {
                n4 = Integer.parseInt(stringArray[1]);
            }
            if (zKP.field_8374b848_Dne[n2] == null) {
                n2 = 0;
                n4 = 0;
            }
            if (n4 < 0 || n4 > 15) {
                n4 = 0;
            }
        }
        catch (Throwable throwable) {
            return null;
        }
        object = new Jjb(n3, n2, n4);
        ((Jjb)object).method_ce7f5da9_Dne(n);
        return (Jjb) object;
    }

    public Map method_d410254f_Dne() {
        return this.field_83b1c1b0_Dne;
    }

    public static lDk method_23118518_Dne() {
        lDk lDk2 = new lDk();
        lDk2.method_ce7f5da9_Dne(OdI.field_202507d7_FWm.field_267cf5_Qnq);
        lDk2.method_adea226d_Dne().add(new Jjb(1, zKP.field_f0b029e5_zGp.field_21260d_FWm));
        lDk2.method_adea226d_Dne().add(new Jjb(2, zKP.field_203836cc_FWm.field_21260d_FWm));
        lDk2.method_adea226d_Dne().add(new Jjb(1, zKP.field_36ff555_Dne.field_21260d_FWm));
        lDk2.method_7a46289a_Dne();
        lDk2.method_d410254f_Dne().put("village", new HashMap());
        return lDk2;
    }

    public void method_7a46289a_Dne() {
        int n = 0;
        for (Jjb jjb : this.field_f27c122c_Dne) {
            jjb.method_ce7f5da9_Dne(n);
            n += jjb.method_7a46288d_Dne();
        }
    }

    public int method_7a46288d_Dne() {
        return this.field_2092ae_Dne;
    }

    public void method_ce7f5da9_Dne(int n) {
        this.field_2092ae_Dne = n;
    }
}

