package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class UYp {
    private static final Random field_7331eae7_Dne = new Random();
    private static final pID field_379d641_Dne = new pID(null);
    private static final FEL field_366b09f_Dne = new FEL(null);

    public static int method_d8697d0d_Dne(FUH fUH, FUH fUH2) {
        UYp.field_366b09f_Dne.field_2092ae_Dne = 0;
        UYp.field_366b09f_Dne.field_366ec33_Dne = fUH2;
        UYp.method_1569d8e6_Dne(field_366b09f_Dne, fUH.method_23040479_Dne());
        return UYp.field_366b09f_Dne.field_2092ae_Dne > 0 ? 1 + field_7331eae7_Dne.nextInt(UYp.field_366b09f_Dne.field_2092ae_Dne) : 0;
    }

    public static int method_c296f0db_aFZ(FUH fUH) {
        return UYp.method_6e3a6b59_Dne(ycv.field_af0efdbb_udO.field_21260d_FWm, fUH.method_23040479_Dne());
    }

    public static int method_610df1d4_bzF(FUH fUH) {
        return UYp.method_6e3a6b59_Dne(ycv.field_ab3719f6_ooe.field_21260d_FWm, fUH.method_23040479_Dne());
    }

    public static boolean method_6f1922f2_Dne(FUH fUH) {
        return UYp.method_6e3a6b59_Dne(ycv.field_329870e6_trS.field_21260d_FWm, fUH.method_23040479_Dne()) > 0;
    }

    public static Map method_f941931b_Dne(int n, NMq nMq) {
        dEr dEr2 = nMq.method_230de6ba_Dne();
        HashMap<Integer, RmG> hashMap = null;
        boolean bl = nMq.field_2e5f1b_bzF == dEr.field_4976bda6_TKg.field_267cf5_Qnq;
        for (ycv ycv2 : ycv.field_8374a29b_Dne) {
            if (ycv2 == null || !ycv2.field_36466e4_Dne.method_a17c251a_Dne(dEr2) && !bl) continue;
            for (int i = ycv2.method_ae128dba_bzF(); i <= ycv2.method_7a46288d_Dne(); ++i) {
                if (n < ycv2.method_ce7f5d9c_Dne(i) || n > ycv2.method_117d19dd_FWm(i)) continue;
                if (hashMap == null) {
                    hashMap = new HashMap<Integer, RmG>();
                }
                hashMap.put(ycv2.field_21260d_FWm, new RmG(ycv2, i));
            }
        }
        return hashMap;
    }

    public static int method_54a80d6_Dne(int n, NMq[] nMqArray) {
        if (nMqArray == null) {
            return 0;
        }
        int n2 = 0;
        NMq[] nMqArray2 = nMqArray;
        int n3 = nMqArray.length;
        for (int i = 0; i < n3; ++i) {
            NMq nMq = nMqArray2[i];
            int n4 = UYp.method_6e3a6b59_Dne(n, nMq);
            if (n4 <= n2) continue;
            n2 = n4;
        }
        return n2;
    }

    public static int method_97c4f9ec_FWm(FUH fUH, FUH fUH2) {
        return UYp.method_6e3a6b59_Dne(ycv.field_61780968_Zpi.field_21260d_FWm, fUH.method_23040479_Dne());
    }

    public static void method_327e0ea4_Dne(Map map, NMq nMq) {
        mbZ mbZ2 = new mbZ();
        Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            int n = (Integer)iterator.next();
            WkD wkD = new WkD();
            wkD.method_5ab47529_Dne("id", (short)n);
            wkD.method_5ab47529_Dne("lvl", (short)((Integer)map.get(n)).intValue());
            mbZ2.method_b4ba5ea1_Dne(wkD);
            if (nMq.field_2e5f1b_bzF != dEr.field_374f605_Dne.field_267cf5_Qnq) continue;
            dEr.field_374f605_Dne.method_b2053880_Dne(nMq, new RmG(n, (int)((Integer)map.get(n))));
        }
        if (mbZ2.method_7a46288d_Dne() > 0) {
            if (nMq.field_2e5f1b_bzF != dEr.field_374f605_Dne.field_267cf5_Qnq) {
                nMq.method_58996597_Dne("ench", mbZ2);
            }
        } else if (nMq.method_a98a0664_aFZ()) {
            nMq.method_230886fb_Dne().method_8f501fe4_Dne("ench");
        }
    }

    public static Map method_fe3d588a_Dne(NMq nMq) {
        mbZ mbZ2;
        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<Integer, Integer>();
        mbZ mbZ3 = mbZ2 = nMq.field_2e5f1b_bzF == dEr.field_374f605_Dne.field_267cf5_Qnq ? dEr.field_374f605_Dne.method_c9b05901_Dne(nMq) : nMq.method_23126806_Dne();
        if (mbZ2 != null) {
            for (int i = 0; i < mbZ2.method_7a46288d_Dne(); ++i) {
                short s = ((WkD)mbZ2.method_77d0d055_FWm(i)).method_8f501fe1_Dne("id");
                short s2 = ((WkD)mbZ2.method_77d0d055_FWm(i)).method_8f501fe1_Dne("lvl");
                linkedHashMap.put(Integer.valueOf(s), Integer.valueOf(s2));
            }
        }
        return linkedHashMap;
    }

    public static int method_486cd6a2_FWm(FUH fUH) {
        return UYp.method_54a80d6_Dne(ycv.field_f0b01438_zGp.field_21260d_FWm, fUH.method_56f900f6_Dne());
    }

    public static int method_6f1922e1_Dne(FUH fUH) {
        return UYp.method_6e3a6b59_Dne(ycv.field_a22e86a8_kGO.field_21260d_FWm, fUH.method_23040479_Dne());
    }

    public static NMq method_7acb75cc_Dne(ycv ycv2, FUH fUH) {
        for (NMq nMq : fUH.method_56f900f6_Dne()) {
            if (nMq == null || UYp.method_6e3a6b59_Dne(ycv2.field_21260d_FWm, nMq) <= 0) continue;
            return nMq;
        }
        return null;
    }

    public static int method_ec92bc7a_Dne(NMq[] nMqArray, zBn zBn2) {
        UYp.field_379d641_Dne.field_2092ae_Dne = 0;
        UYp.field_379d641_Dne.field_37e4cc6_Dne = zBn2;
        UYp.method_4408c363_Dne(field_379d641_Dne, nMqArray);
        if (UYp.field_379d641_Dne.field_2092ae_Dne > 25) {
            UYp.field_379d641_Dne.field_2092ae_Dne = 25;
        }
        return (UYp.field_379d641_Dne.field_2092ae_Dne + 1 >> 1) + field_7331eae7_Dne.nextInt((UYp.field_379d641_Dne.field_2092ae_Dne >> 1) + 1);
    }

    private static void method_1569d8e6_Dne(PLz pLz, NMq nMq) {
        mbZ mbZ2;
        if (nMq != null && (mbZ2 = nMq.method_23126806_Dne()) != null) {
            for (int i = 0; i < mbZ2.method_7a46288d_Dne(); ++i) {
                short s = ((WkD)mbZ2.method_77d0d055_FWm(i)).method_8f501fe1_Dne("id");
                short s2 = ((WkD)mbZ2.method_77d0d055_FWm(i)).method_8f501fe1_Dne("lvl");
                if (ycv.field_8374a29b_Dne[s] == null) continue;
                pLz.method_18558da8_Dne(ycv.field_8374a29b_Dne[s], s2);
            }
        }
    }

    public static NMq method_2e16e3d9_Dne(Random random, NMq nMq, int n) {
        boolean bl;
        List<RmG> list = UYp.method_543e70d_Dne(random, nMq, n);
        boolean bl2 = bl = nMq.field_2e5f1b_bzF == dEr.field_4976bda6_TKg.field_267cf5_Qnq;
        if (bl) {
            nMq.field_2e5f1b_bzF = dEr.field_374f605_Dne.field_267cf5_Qnq;
        }
        if (list != null) {
            for (RmG rmG : list) {
                if (bl) {
                    dEr.field_374f605_Dne.method_b2053880_Dne(nMq, rmG);
                    continue;
                }
                nMq.method_18558da8_Dne(rmG.field_37e5540_Dne, rmG.field_2092ae_Dne);
            }
        }
        return nMq;
    }

    public static int method_6e3a6b59_Dne(int n, NMq nMq) {
        if (nMq == null) {
            return 0;
        }
        mbZ mbZ2 = nMq.method_23126806_Dne();
        if (mbZ2 == null) {
            return 0;
        }
        for (int i = 0; i < mbZ2.method_7a46288d_Dne(); ++i) {
            short s = ((WkD)mbZ2.method_77d0d055_FWm(i)).method_8f501fe1_Dne("id");
            short s2 = ((WkD)mbZ2.method_77d0d055_FWm(i)).method_8f501fe1_Dne("lvl");
            if (s != n) continue;
            return s2;
        }
        return 0;
    }

    public static int method_f1eb6aba_Qnq(FUH fUH) {
        return UYp.method_6e3a6b59_Dne(ycv.field_35ddb629_ATE.field_21260d_FWm, fUH.method_23040479_Dne());
    }

    public static int method_ff1760e9_zGp(FUH fUH) {
        return UYp.method_54a80d6_Dne(ycv.field_14272b6a_div.field_21260d_FWm, fUH.method_56f900f6_Dne());
    }

    public static List method_543e70d_Dne(Random random, NMq nMq, int n) {
        RmG rmG;
        float f;
        dEr dEr2 = nMq.method_230de6ba_Dne();
        int n2 = dEr2.method_7a46288d_Dne();
        if (n2 <= 0) {
            return null;
        }
        n2 /= 2;
        int n3 = (n2 = 1 + random.nextInt((n2 >> 1) + 1) + random.nextInt((n2 >> 1) + 1)) + n;
        int n4 = (int)((float)n3 * (1.0f + (f = (random.nextFloat() + random.nextFloat() - 1.0f) * 0.15f)) + 0.5f);
        if (n4 < 1) {
            n4 = 1;
        }
        ArrayList<RmG> arrayList = null;
        Map map = UYp.method_f941931b_Dne(n4, nMq);
        if (map != null && !map.isEmpty() && (rmG = (RmG)nGp.method_5a3a1e72_Dne(random, map.values())) != null) {
            arrayList = new ArrayList<>();
            arrayList.add(rmG);
            for (int i = n4; random.nextInt(50) <= i; i >>= 1) {
                Object object;
                Iterator iterator = map.keySet().iterator();
                while (iterator.hasNext()) {
                    object = (Integer)iterator.next();
                    boolean bl = true;
                    for (RmG rmG2 : arrayList) {
                        if (rmG2.field_37e5540_Dne.method_c6fa7cbf_Dne(ycv.field_8374a29b_Dne[(Integer)object])) continue;
                        bl = false;
                        break;
                    }
                    if (bl) continue;
                    iterator.remove();
                }
                if (map.isEmpty()) continue;
                object = (RmG)nGp.method_5a3a1e72_Dne(random, map.values());
                arrayList.add((RmG) object);
            }
        }
        return arrayList;
    }

    public static int method_1cc4553c_Dne(Random random, int n, int n2, NMq nMq) {
        dEr dEr2 = nMq.method_230de6ba_Dne();
        int n3 = dEr2.method_7a46288d_Dne();
        if (n3 <= 0) {
            return 0;
        }
        if (n2 > 15) {
            n2 = 15;
        }
        int n4 = random.nextInt(8) + 1 + (n2 >> 1) + random.nextInt(n2 + 1);
        return n == 0 ? Math.max(n4 / 3, 1) : (n == 1 ? n4 * 2 / 3 + 1 : Math.max(n4, n2 * 2));
    }

    public static boolean method_486cd6b3_FWm(FUH fUH) {
        return UYp.method_54a80d6_Dne(ycv.field_16317e69_DyG.field_21260d_FWm, fUH.method_56f900f6_Dne()) > 0;
    }

    private static void method_4408c363_Dne(PLz pLz, NMq[] nMqArray) {
        NMq[] nMqArray2 = nMqArray;
        int n = nMqArray.length;
        for (int i = 0; i < n; ++i) {
            NMq nMq = nMqArray2[i];
            UYp.method_1569d8e6_Dne(pLz, nMq);
        }
    }
}

