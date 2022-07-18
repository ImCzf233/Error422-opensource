package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class wBl {
    private static int method_ea14417e_Dne(List<pok> list) {
        boolean bl = false;
        int n = 0;
        for (pok pok2 : list) {
            if (pok2.field_2e5f1b_bzF > 0 && pok2.field_21260d_FWm < pok2.field_2e5f1b_bzF) {
                bl = true;
            }
            n += pok2.field_2092ae_Dne;
        }
        return bl ? n : -1;
    }

    static bvz method_920216ec_Dne(opc opc2, List list, Random random, int n, int n2, int n3, int n4, int n5) {
        return wBl.method_b2c08e19_bzF(opc2, list, random, n, n2, n3, n4, n5);
    }

    private static bvz method_b8ec173_Qnq(opc opc2, List list, Random random, int n, int n2, int n3, int n4, int n5) {
        if (n5 > 3 + opc2.field_2092ae_Dne) {
            return null;
        }
        if (Math.abs(n - opc2.method_22fefc09_Dne().field_2092ae_Dne) <= 112 && Math.abs(n3 - opc2.method_22fefc09_Dne().field_2e5f1b_bzF) <= 112) {
            CLK cLK = JZc.method_d8458291_Dne(opc2, list, random, n, n2, n3, n4);
            if (cLK != null && cLK.field_21260d_FWm > 10) {
                int n6;
                JZc jZc = new JZc(opc2, n5, random, cLK, n4);
                int n7 = (jZc.field_3656daa_Dne.field_2092ae_Dne + jZc.field_3656daa_Dne.field_267cf5_Qnq) / 2;
                int n8 = (jZc.field_3656daa_Dne.field_2e5f1b_bzF + jZc.field_3656daa_Dne.field_388da6_zGp) / 2;
                int n9 = jZc.field_3656daa_Dne.field_267cf5_Qnq - jZc.field_3656daa_Dne.field_2092ae_Dne;
                int n10 = jZc.field_3656daa_Dne.field_388da6_zGp - jZc.field_3656daa_Dne.field_2e5f1b_bzF;
                int n11 = n6 = n9 > n10 ? n9 : n10;
                if (opc2.method_2315aa7b_Dne().method_39acd2be_Dne(n7, n8, n6 / 2 + 4, cXw.field_f27c122c_Dne)) {
                    list.add(jZc);
                    opc2.field_c61a1f02_bzF.add(jZc);
                    return jZc;
                }
            }
            return null;
        }
        return null;
    }

    private static ram method_92090c74_Dne(opc opc2, List list, Random random, int n, int n2, int n3, int n4, int n5) {
        int n6 = wBl.method_ea14417e_Dne(opc2.field_dc9cb15_Dne);
        if (n6 <= 0) {
            return null;
        }
        int n7 = 0;
        block0: while (n7 < 5) {
            ++n7;
            int n8 = random.nextInt(n6);
            for (pok pok2 : opc2.field_dc9cb15_Dne) {
                if ((n8 -= pok2.field_2092ae_Dne) >= 0) continue;
                if (!pok2.method_ce7f5dad_Dne(n5) || pok2 == opc2.field_37a69a0_Dne && opc2.field_dc9cb15_Dne.size() > 1) continue block0;
                ram ram2 = wBl.method_6f670109_Dne(opc2, pok2, list, random, n, n2, n3, n4, n5);
                if (ram2 == null) continue;
                ++pok2.field_21260d_FWm;
                opc2.field_37a69a0_Dne = pok2;
                if (!pok2.method_7a46289e_Dne()) {
                    opc2.field_dc9cb15_Dne.remove(pok2);
                }
                return ram2;
            }
        }
        CLK cLK = UBI.method_d8458291_Dne(opc2, list, random, n, n2, n3, n4);
        if (cLK != null) {
            return new UBI(opc2, n5, random, cLK, n4);
        }
        return null;
    }

    static bvz method_84b7f48b_FWm(opc opc2, List list, Random random, int n, int n2, int n3, int n4, int n5) {
        return wBl.method_b8ec173_Qnq(opc2, list, random, n, n2, n3, n4, n5);
    }

    public static ArrayList method_6f9e1c17_Dne(Random random, int n) {
        ArrayList<pok> arrayList = new ArrayList<pok>();
        arrayList.add(new pok(CVf.class, 4, geR.method_4cd91d9_Dne(random, 2 + n, 4 + n * 2)));
        arrayList.add(new pok(YvM.class, 20, geR.method_4cd91d9_Dne(random, 0 + n, 1 + n)));
        arrayList.add(new pok(ZRq.class, 20, geR.method_4cd91d9_Dne(random, 0 + n, 2 + n)));
        arrayList.add(new pok(pMs.class, 3, geR.method_4cd91d9_Dne(random, 2 + n, 5 + n * 3)));
        arrayList.add(new pok(gcg.class, 15, geR.method_4cd91d9_Dne(random, 0 + n, 2 + n)));
        arrayList.add(new pok(lCY.class, 3, geR.method_4cd91d9_Dne(random, 1 + n, 4 + n)));
        arrayList.add(new pok(PCy.class, 3, geR.method_4cd91d9_Dne(random, 2 + n, 4 + n * 2)));
        arrayList.add(new pok(Omm.class, 15, geR.method_4cd91d9_Dne(random, 0, 1 + n)));
        arrayList.add(new pok(ykp.class, 8, geR.method_4cd91d9_Dne(random, 0 + n, 3 + n * 2)));
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            if (((pok)iterator.next()).field_2e5f1b_bzF != 0) continue;
            iterator.remove();
        }
        return arrayList;
    }

    private static bvz method_b2c08e19_bzF(opc opc2, List list, Random random, int n, int n2, int n3, int n4, int n5) {
        if (n5 > 50) {
            return null;
        }
        if (Math.abs(n - opc2.method_22fefc09_Dne().field_2092ae_Dne) <= 112 && Math.abs(n3 - opc2.method_22fefc09_Dne().field_2e5f1b_bzF) <= 112) {
            ram ram2 = wBl.method_92090c74_Dne(opc2, list, random, n, n2, n3, n4, n5 + 1);
            if (ram2 != null) {
                int n6;
                int n7 = (ram2.field_3656daa_Dne.field_2092ae_Dne + ram2.field_3656daa_Dne.field_267cf5_Qnq) / 2;
                int n8 = (ram2.field_3656daa_Dne.field_2e5f1b_bzF + ram2.field_3656daa_Dne.field_388da6_zGp) / 2;
                int n9 = ram2.field_3656daa_Dne.field_267cf5_Qnq - ram2.field_3656daa_Dne.field_2092ae_Dne;
                int n10 = ram2.field_3656daa_Dne.field_388da6_zGp - ram2.field_3656daa_Dne.field_2e5f1b_bzF;
                int n11 = n6 = n9 > n10 ? n9 : n10;
                if (opc2.method_2315aa7b_Dne().method_39acd2be_Dne(n7, n8, n6 / 2 + 4, cXw.field_f27c122c_Dne)) {
                    list.add(ram2);
                    opc2.field_8f85f8f4_FWm.add(ram2);
                    return ram2;
                }
            }
            return null;
        }
        return null;
    }

    private static ram method_6f670109_Dne(opc opc2, pok pok2, List list, Random random, int n, int n2, int n3, int n4, int n5) {
        Class clazz = pok2.field_ce3f4d68_Dne;
        ram ram2 = null;
        if (clazz == CVf.class) {
            ram2 = CVf.method_91f384df_Dne(opc2, list, random, n, n2, n3, n4, n5);
        } else if (clazz == YvM.class) {
            ram2 = YvM.method_91fdfa22_Dne(opc2, list, random, n, n2, n3, n4, n5);
        } else if (clazz == ZRq.class) {
            ram2 = ZRq.method_91fdebb9_Dne(opc2, list, random, n, n2, n3, n4, n5);
        } else if (clazz == pMs.class) {
            ram2 = pMs.method_9207d95c_Dne(opc2, list, random, n, n2, n3, n4, n5);
        } else if (clazz == gcg.class) {
            ram2 = gcg.method_92041327_Dne(opc2, list, random, n, n2, n3, n4, n5);
        } else if (clazz == lCY.class) {
            ram2 = lCY.method_9205df30_Dne(opc2, list, random, n, n2, n3, n4, n5);
        } else if (clazz == PCy.class) {
            ram2 = PCy.method_91f928ac_Dne(opc2, list, random, n, n2, n3, n4, n5);
        } else if (clazz == Omm.class) {
            ram2 = Omm.method_91f95083_Dne(opc2, list, random, n, n2, n3, n4, n5);
        } else if (clazz == ykp.class) {
            ram2 = ykp.method_920c60f4_Dne(opc2, list, random, n, n2, n3, n4, n5);
        }
        return ram2;
    }
}

