package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class etZ {
    private static final ZLf[] field_836632d3_Dne = new ZLf[]{new ZLf(kQw.class, 30, 0, true), new ZLf(jsv.class, 10, 4), new ZLf(sXa.class, 10, 4), new ZLf(gYv.class, 10, 3), new ZLf(lmz_0.class, 5, 2), new ZLf(RMv.class, 5, 1)};
    private static final ZLf[] field_fde5e2d4_FWm = new ZLf[]{new ZLf(iTJ.class, 25, 0, true), new ZLf(Dsg.class, 15, 5), new ZLf(xIG.class, 5, 10), new ZLf(yht_0.class, 5, 10), new ZLf(mte.class, 10, 3, true), new ZLf(NEG.class, 7, 2), new ZLf(ikY.class, 5, 2)};

    static ZLf[] method_56fe7054_Dne() {
        return field_836632d3_Dne;
    }

    static iDn method_dbaa95b1_Dne(ZLf zLf, List list, Random random, int n, int n2, int n3, int n4, int n5) {
        return etZ.method_ce607350_FWm(zLf, list, random, n, n2, n3, n4, n5);
    }

    private static iDn method_ce607350_FWm(ZLf zLf, List list, Random random, int n, int n2, int n3, int n4, int n5) {
        Class clazz = zLf.field_ce3f4d68_Dne;
        iDn iDn2 = null;
        if (clazz == kQw.class) {
            iDn2 = kQw.method_5853844c_Dne(list, random, n, n2, n3, n4, n5);
        } else if (clazz == jsv.class) {
            iDn2 = jsv.method_58538f70_Dne(list, random, n, n2, n3, n4, n5);
        } else if (clazz == sXa.class) {
            iDn2 = sXa.method_58573ee1_Dne(list, random, n, n2, n3, n4, n5);
        } else if (clazz == gYv.class) {
            iDn2 = gYv.method_5851d0b9_Dne(list, random, n, n2, n3, n4, n5);
        } else if (clazz == lmz_0.class) {
            iDn2 = lmz_0.method_58545e44_Dne(list, random, n, n2, n3, n4, n5);
        } else if (clazz == RMv.class) {
            iDn2 = RMv.method_584817e2_Dne(list, random, n, n2, n3, n4, n5);
        } else if (clazz == iTJ.class) {
            iDn2 = iTJ.method_5852a15e_Dne(list, random, n, n2, n3, n4, n5);
        } else if (clazz == xIG.class) {
            iDn2 = xIG.method_58594947_Dne(list, random, n, n2, n3, n4, n5);
        } else if (clazz == yht_0.class) {
            iDn2 = yht_0.method_5859bf58_Dne(list, random, n, n2, n3, n4, n5);
        } else if (clazz == mte.class) {
            iDn2 = mte.method_5854ee3f_Dne(list, random, n, n2, n3, n4, n5);
        } else if (clazz == NEG.class) {
            iDn2 = NEG.method_584622ad_Dne(list, random, n, n2, n3, n4, n5);
        } else if (clazz == Dsg.class) {
            iDn2 = Dsg.method_58424785_Dne(list, random, n, n2, n3, n4, n5);
        } else if (clazz == ikY.class) {
            iDn2 = ikY.method_5852f986_Dne(list, random, n, n2, n3, n4, n5);
        }
        return iDn2;
    }

    static ZLf[] method_30522415_FWm() {
        return field_fde5e2d4_FWm;
    }
}

