package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IYC {
    private static final Pattern field_7d109fe3_FWm;
    private static final Pattern field_61e70ef1_bzF;
    private static final Pattern field_b2ec7984_Dne;

    private static final int method_bbfe581d_aFZ(String string) {
        return string.equals("a") ? 0 : 1;
    }

    public static String method_17856691_Dne(gnI gnI2, String string) {
        PJQ[] pJQArray = IYC.method_d6c65c_Dne(gnI2, string);
        if (pJQArray != null && pJQArray.length != 0) {
            Object[] objectArray = new String[pJQArray.length];
            for (int i = 0; i < objectArray.length; ++i) {
                objectArray[i] = pJQArray[i].method_c6f17a40_aFZ();
            }
            return xZE.method_f7f6f529_Dne(objectArray);
        }
        return null;
    }

    public static PJQ[] method_d6c65c_Dne(gnI gnI2, String string) {
        Matcher matcher = field_b2ec7984_Dne.matcher(string);
        if (matcher.matches()) {
            Map map = IYC.method_924a9319_Dne(matcher.group(2));
            String string2 = matcher.group(1);
            int n = IYC.method_8f501fd7_Dne(string2);
            int n2 = IYC.method_110c4db6_FWm(string2);
            int n3 = IYC.method_a9a9209e_Qnq(string2);
            int n4 = IYC.method_47a073c4_bzF(string2);
            int n5 = IYC.method_bbfe581d_aFZ(string2);
            int n6 = XHL.field_36eea90_Dne.method_7a46288d_Dne();
            iSh iSh2 = gnI2.method_23105fed_Dne();
            Map map2 = IYC.method_c550f6a0_Dne(map);
            String string3 = null;
            String string4 = null;
            if (map.containsKey("rm")) {
                n = geR.method_5ab44f92_Dne((String)map.get("rm"), n);
            }
            if (map.containsKey("r")) {
                n2 = geR.method_5ab44f92_Dne((String)map.get("r"), n2);
            }
            if (map.containsKey("lm")) {
                n3 = geR.method_5ab44f92_Dne((String)map.get("lm"), n3);
            }
            if (map.containsKey("l")) {
                n4 = geR.method_5ab44f92_Dne((String)map.get("l"), n4);
            }
            if (map.containsKey("x")) {
                iSh2.field_2092ae_Dne = geR.method_5ab44f92_Dne((String)map.get("x"), iSh2.field_2092ae_Dne);
            }
            if (map.containsKey("y")) {
                iSh2.field_21260d_FWm = geR.method_5ab44f92_Dne((String)map.get("y"), iSh2.field_21260d_FWm);
            }
            if (map.containsKey("z")) {
                iSh2.field_2e5f1b_bzF = geR.method_5ab44f92_Dne((String)map.get("z"), iSh2.field_2e5f1b_bzF);
            }
            if (map.containsKey("m")) {
                n6 = geR.method_5ab44f92_Dne((String)map.get("m"), n6);
            }
            if (map.containsKey("c")) {
                n5 = geR.method_5ab44f92_Dne((String)map.get("c"), n5);
            }
            if (map.containsKey("team")) {
                string4 = (String)map.get("team");
            }
            if (map.containsKey("name")) {
                string3 = (String)map.get("name");
            }
            if (!string2.equals("p") && !string2.equals("a")) {
                if (!string2.equals("r")) {
                    return null;
                }
                List<PJQ> list = jwh_0.method_2302cf90_Dne().method_230ea953_Dne().method_a42f18b7_Dne(iSh2, n, n2, 0, n6, n3, n4, map2, string3, string4);
                Collections.shuffle(list);
                list = list.subList(0, Math.min(n5, list.size()));
                return list != null && !list.isEmpty() ? list.toArray(new PJQ[0]) : new PJQ[]{};
            }
            List<PJQ> list = jwh_0.method_2302cf90_Dne().method_230ea953_Dne().method_a42f18b7_Dne(iSh2, n, n2, n5, n6, n3, n4, map2, string3, string4);
            return list != null && !list.isEmpty() ? list.toArray(new PJQ[0]) : new PJQ[]{};
        }
        return null;
    }

    public static boolean method_abaa98b2_Dne(String string, String string2) {
        Matcher matcher = field_b2ec7984_Dne.matcher(string);
        if (matcher.matches()) {
            String string3 = matcher.group(1);
            return string2 == null || string2.equals(string3);
        }
        return false;
    }

    public static boolean method_8f501fe8_Dne(String string) {
        Matcher matcher = field_b2ec7984_Dne.matcher(string);
        if (matcher.matches()) {
            Map map = IYC.method_924a9319_Dne(matcher.group(2));
            String string2 = matcher.group(1);
            int n = IYC.method_bbfe581d_aFZ(string2);
            if (map.containsKey("c")) {
                n = geR.method_5ab44f92_Dne((String)map.get("c"), n);
            }
            return n != 1;
        }
        return false;
    }

    private static final int method_a9a9209e_Qnq(String string) {
        return 0;
    }

    static {
        field_b2ec7984_Dne = Pattern.compile("^@([parf])(?:\\[([\\w=,!-]*)\\])?$");
        field_7d109fe3_FWm = Pattern.compile("\\G([-!]?\\w*)(?:$|,)");
        field_61e70ef1_bzF = Pattern.compile("\\G(\\w+)=([-!]?\\w*)(?:$|,)");
    }

    private static final int method_8f501fd7_Dne(String string) {
        return 0;
    }

    private static final int method_110c4db6_FWm(String string) {
        return 0;
    }

    private static Map method_924a9319_Dne(String string) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        if (string == null) {
            return hashMap;
        }
        Matcher matcher = field_7d109fe3_FWm.matcher(string);
        int n = 0;
        int n2 = -1;
        while (matcher.find()) {
            String string2 = null;
            switch (n++) {
                case 0: {
                    string2 = "x";
                    break;
                }
                case 1: {
                    string2 = "y";
                    break;
                }
                case 2: {
                    string2 = "z";
                    break;
                }
                case 3: {
                    string2 = "r";
                }
            }
            if (string2 != null && matcher.group(1).length() > 0) {
                hashMap.put(string2, matcher.group(1));
            }
            n2 = matcher.end();
        }
        if (n2 < string.length()) {
            matcher = field_61e70ef1_bzF.matcher(n2 == -1 ? string : string.substring(n2));
            while (matcher.find()) {
                hashMap.put(matcher.group(1), matcher.group(2));
            }
        }
        return hashMap;
    }

    private static final int method_47a073c4_bzF(String string) {
        return Integer.MAX_VALUE;
    }

    public static PJQ method_4145cce9_Dne(gnI gnI2, String string) {
        PJQ[] pJQArray = IYC.method_d6c65c_Dne(gnI2, string);
        return pJQArray != null && pJQArray.length == 1 ? pJQArray[0] : null;
    }

    public static boolean method_110c4dc7_FWm(String string) {
        return IYC.method_abaa98b2_Dne(string, null);
    }

    public static Map method_c550f6a0_Dne(Map map) {
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        for (Object obj : map.keySet()) {String string = (String) obj;
            if (!string.startsWith("score_") || string.length() <= "score_".length()) continue;
            String string2 = string.substring("score_".length());
            hashMap.put(string2, geR.method_5ab44f92_Dne((String)map.get(string), 1));
        }
        return hashMap;
    }
}

