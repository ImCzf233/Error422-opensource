package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class dlc {
    private static final GgT field_367a598_Dne;
    private static Class field_ce3f4d68_Dne;
    private static List<elj_0> field_f27c122c_Dne;
    static int field_2092ae_Dne;
    private static final elj_0[] field_836b3364_Dne;

    private static oeq method_e4917f39_Dne(Class clazz, List list, Random random, int n, int n2, int n3, int n4, int n5) {
        oeq oeq2 = null;
        if (clazz == xKr.class) {
            oeq2 = xKr.method_585955fe_Dne(list, random, n, n2, n3, n4, n5);
        } else if (clazz == HLP.class) {
            oeq2 = HLP.method_584383d1_Dne(list, random, n, n2, n3, n4, n5);
        } else if (clazz == kuW.class) {
            oeq2 = kuW.method_58540790_Dne(list, random, n, n2, n3, n4, n5);
        } else if (clazz == YFV.class) {
            oeq2 = YFV.method_58540790_Dne(list, random, n, n2, n3, n4, n5);
        } else if (clazz == SBI.class) {
            oeq2 = SBI.method_58485d83_Dne(list, random, n, n2, n3, n4, n5);
        } else if (clazz == rEI.class) {
            oeq2 = rEI.method_58568047_Dne(list, random, n, n2, n3, n4, n5);
        } else if (clazz == ISl.class) {
            oeq2 = ISl.method_584415db_Dne(list, random, n, n2, n3, n4, n5);
        } else if (clazz == xwV.class) {
            oeq2 = xwV.method_5859f7c6_Dne(list, random, n, n2, n3, n4, n5);
        } else if (clazz == gZj.class) {
            oeq2 = gZj.method_5851d306_Dne(list, random, n, n2, n3, n4, n5);
        } else if (clazz == FTE.class) {
            oeq2 = FTE.method_5842b7c6_Dne(list, random, n, n2, n3, n4, n5);
        } else if (clazz == DVF.class) {
            oeq2 = DVF.method_5841d6a9_Dne(list, random, n, n2, n3, n4, n5);
        }
        return oeq2;
    }

    static bvz method_743b1bfb_Dne(Kci kci, List list, Random random, int n, int n2, int n3, int n4, int n5) {
        return dlc.method_66f0f99a_FWm(kci, list, random, n, n2, n3, n4, n5);
    }

    private static bvz method_66f0f99a_FWm(Kci kci, List list, Random random, int n, int n2, int n3, int n4, int n5) {
        if (n5 > 50) {
            return null;
        }
        if (Math.abs(n - kci.method_22fefc09_Dne().field_2092ae_Dne) <= 112 && Math.abs(n3 - kci.method_22fefc09_Dne().field_2e5f1b_bzF) <= 112) {
            oeq oeq2 = dlc.method_7440c3e6_Dne(kci, list, random, n, n2, n3, n4, n5 + 1);
            if (oeq2 != null) {
                list.add(oeq2);
                kci.field_dc9cb15_Dne.add(oeq2);
            }
            return oeq2;
        }
        return null;
    }

    static Class method_f6d1a090_Dne(Class clazz) {
        field_ce3f4d68_Dne = clazz;
        return clazz;
    }

    public static void method_7a46289a_Dne() {
        field_f27c122c_Dne = new ArrayList();
        for (elj_0 elj_02 : field_836b3364_Dne) {
            elj_02.field_21260d_FWm = 0;
            field_f27c122c_Dne.add(elj_02);
        }
        field_ce3f4d68_Dne = null;
    }

    private static boolean method_7a46289e_Dne() {
        boolean bl = false;
        field_2092ae_Dne = 0;
        for (elj_0 elj_02 : field_f27c122c_Dne) {
            if (elj_02.field_2e5f1b_bzF > 0 && elj_02.field_21260d_FWm < elj_02.field_2e5f1b_bzF) {
                bl = true;
            }
            field_2092ae_Dne += elj_02.field_2092ae_Dne;
        }
        return bl;
    }

    private static oeq method_7440c3e6_Dne(Kci kci, List list, Random random, int n, int n2, int n3, int n4, int n5) {
        if (!dlc.method_7a46289e_Dne()) {
            return null;
        }
        if (field_ce3f4d68_Dne != null) {
            oeq oeq2 = dlc.method_e4917f39_Dne(field_ce3f4d68_Dne, list, random, n, n2, n3, n4, n5);
            field_ce3f4d68_Dne = null;
            if (oeq2 != null) {
                return oeq2;
            }
        }
        int n6 = 0;
        block0: while (n6 < 5) {
            ++n6;
            int n7 = random.nextInt(field_2092ae_Dne);
            for (elj_0 elj_02 : field_f27c122c_Dne) {
                if ((n7 -= elj_02.field_2092ae_Dne) >= 0) continue;
                if (!elj_02.method_ce7f5dad_Dne(n5) || elj_02 == kci.field_374e609_Dne) continue block0;
                oeq oeq3 = dlc.method_e4917f39_Dne(elj_02.field_ce3f4d68_Dne, list, random, n, n2, n3, n4, n5);
                if (oeq3 == null) continue;
                ++elj_02.field_21260d_FWm;
                kci.field_374e609_Dne = elj_02;
                if (!elj_02.method_7a46289e_Dne()) {
                    field_f27c122c_Dne.remove(elj_02);
                }
                return oeq3;
            }
        }
        CLK cLK = ZVw.method_b560cbe6_Dne(list, random, n, n2, n3, n4);
        if (cLK != null && cLK.field_21260d_FWm > 1) {
            return new ZVw(n5, random, cLK, n4);
        }
        return null;
    }

    static GgT method_230133f7_Dne() {
        return field_367a598_Dne;
    }

    static {
        field_836b3364_Dne = new elj_0[]{new elj_0(xKr.class, 40, 0), new elj_0(HLP.class, 5, 5), new elj_0(kuW.class, 20, 0), new elj_0(YFV.class, 20, 0), new elj_0(SBI.class, 10, 6), new elj_0(rEI.class, 5, 5), new elj_0(ISl.class, 5, 5), new elj_0(xwV.class, 5, 4), new elj_0(gZj.class, 5, 4), new ywz(FTE.class, 10, 2), new wKS(DVF.class, 20, 1)};
        field_2092ae_Dne = 0;
        field_367a598_Dne = new GgT(null);
    }
}

