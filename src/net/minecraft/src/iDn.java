package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

abstract class iDn
extends bvz {
    private bvz method_b11ef549_Dne(Tps tps, List list, Random random, int n, int n2, int n3, int n4, int n5, boolean bl) {
        if (Math.abs(n - tps.method_22fefc09_Dne().field_2092ae_Dne) <= 112 && Math.abs(n3 - tps.method_22fefc09_Dne().field_2e5f1b_bzF) <= 112) {
            iDn iDn2;
            List list2 = tps.field_f27c122c_Dne;
            if (bl) {
                list2 = tps.field_6a0474ed_FWm;
            }
            if ((iDn2 = this.method_89cb34c3_Dne(tps, list2, list, random, n, n2, n3, n4, n5 + 1)) != null) {
                list.add(iDn2);
                tps.field_dc9cb15_Dne.add(iDn2);
            }
            return iDn2;
        }
        return Pwe.method_5847cabf_Dne(list, random, n, n2, n3, n4, n5);
    }

    protected bvz method_62c58ab1_FWm(Tps tps, List list, Random random, int n, int n2, boolean bl) {
        switch (this.field_2d29f4_aFZ) {
            case 0: {
                return this.method_b11ef549_Dne(tps, list, random, this.field_3656daa_Dne.field_2092ae_Dne - 1, this.field_3656daa_Dne.field_21260d_FWm + n, this.field_3656daa_Dne.field_2e5f1b_bzF + n2, 1, this.method_7a46288d_Dne(), bl);
            }
            case 1: {
                return this.method_b11ef549_Dne(tps, list, random, this.field_3656daa_Dne.field_2092ae_Dne + n2, this.field_3656daa_Dne.field_21260d_FWm + n, this.field_3656daa_Dne.field_2e5f1b_bzF - 1, 2, this.method_7a46288d_Dne(), bl);
            }
            case 2: {
                return this.method_b11ef549_Dne(tps, list, random, this.field_3656daa_Dne.field_2092ae_Dne - 1, this.field_3656daa_Dne.field_21260d_FWm + n, this.field_3656daa_Dne.field_2e5f1b_bzF + n2, 1, this.method_7a46288d_Dne(), bl);
            }
            case 3: {
                return this.method_b11ef549_Dne(tps, list, random, this.field_3656daa_Dne.field_2092ae_Dne + n2, this.field_3656daa_Dne.field_21260d_FWm + n, this.field_3656daa_Dne.field_2e5f1b_bzF - 1, 2, this.method_7a46288d_Dne(), bl);
            }
        }
        return null;
    }

    private int method_ea14417e_Dne(List<ZLf> list) {
        boolean bl = false;
        int n = 0;
        for (ZLf zLf : list) {
            if (zLf.field_2e5f1b_bzF > 0 && zLf.field_21260d_FWm < zLf.field_2e5f1b_bzF) {
                bl = true;
            }
            n += zLf.field_2092ae_Dne;
        }
        return bl ? n : -1;
    }

    protected static boolean method_697d22a9_Dne(CLK cLK) {
        return cLK != null && cLK.field_21260d_FWm > 10;
    }

    protected bvz method_d1a32fbf_bzF(Tps tps, List list, Random random, int n, int n2, boolean bl) {
        switch (this.field_2d29f4_aFZ) {
            case 0: {
                return this.method_b11ef549_Dne(tps, list, random, this.field_3656daa_Dne.field_267cf5_Qnq + 1, this.field_3656daa_Dne.field_21260d_FWm + n, this.field_3656daa_Dne.field_2e5f1b_bzF + n2, 3, this.method_7a46288d_Dne(), bl);
            }
            case 1: {
                return this.method_b11ef549_Dne(tps, list, random, this.field_3656daa_Dne.field_2092ae_Dne + n2, this.field_3656daa_Dne.field_21260d_FWm + n, this.field_3656daa_Dne.field_388da6_zGp + 1, 0, this.method_7a46288d_Dne(), bl);
            }
            case 2: {
                return this.method_b11ef549_Dne(tps, list, random, this.field_3656daa_Dne.field_267cf5_Qnq + 1, this.field_3656daa_Dne.field_21260d_FWm + n, this.field_3656daa_Dne.field_2e5f1b_bzF + n2, 3, this.method_7a46288d_Dne(), bl);
            }
            case 3: {
                return this.method_b11ef549_Dne(tps, list, random, this.field_3656daa_Dne.field_2092ae_Dne + n2, this.field_3656daa_Dne.field_21260d_FWm + n, this.field_3656daa_Dne.field_388da6_zGp + 1, 0, this.method_7a46288d_Dne(), bl);
            }
        }
        return null;
    }

    private iDn method_89cb34c3_Dne(Tps tps, List<ZLf> list, List list2, Random random, int n, int n2, int n3, int n4, int n5) {
        int n6 = this.method_ea14417e_Dne(list);
        boolean bl = n6 > 0 && n5 <= 30;
        int n7 = 0;
        block0: while (n7 < 5 && bl) {
            ++n7;
            int n8 = random.nextInt(n6);
            for (ZLf zLf : list) {
                if ((n8 -= zLf.field_2092ae_Dne) >= 0) continue;
                if (!zLf.method_ce7f5dad_Dne(n5) || zLf == tps.field_36fe578_Dne && !zLf.field_2092bf_Dne) continue block0;
                iDn iDn2 = etZ.method_dbaa95b1_Dne(zLf, list2, random, n, n2, n3, n4, n5);
                if (iDn2 == null) continue;
                ++zLf.field_21260d_FWm;
                tps.field_36fe578_Dne = zLf;
                if (!zLf.method_7a46289e_Dne()) {
                    list.remove(zLf);
                }
                return iDn2;
            }
        }
        return Pwe.method_5847cabf_Dne(list2, random, n, n2, n3, n4, n5);
    }

    protected iDn(int n) {
        super(n);
    }

    protected bvz method_8b46d152_Dne(Tps tps, List list, Random random, int n, int n2, boolean bl) {
        switch (this.field_2d29f4_aFZ) {
            case 0: {
                return this.method_b11ef549_Dne(tps, list, random, this.field_3656daa_Dne.field_2092ae_Dne + n, this.field_3656daa_Dne.field_21260d_FWm + n2, this.field_3656daa_Dne.field_388da6_zGp + 1, this.field_2d29f4_aFZ, this.method_7a46288d_Dne(), bl);
            }
            case 1: {
                return this.method_b11ef549_Dne(tps, list, random, this.field_3656daa_Dne.field_2092ae_Dne - 1, this.field_3656daa_Dne.field_21260d_FWm + n2, this.field_3656daa_Dne.field_2e5f1b_bzF + n, this.field_2d29f4_aFZ, this.method_7a46288d_Dne(), bl);
            }
            case 2: {
                return this.method_b11ef549_Dne(tps, list, random, this.field_3656daa_Dne.field_2092ae_Dne + n, this.field_3656daa_Dne.field_21260d_FWm + n2, this.field_3656daa_Dne.field_2e5f1b_bzF - 1, this.field_2d29f4_aFZ, this.method_7a46288d_Dne(), bl);
            }
            case 3: {
                return this.method_b11ef549_Dne(tps, list, random, this.field_3656daa_Dne.field_267cf5_Qnq + 1, this.field_3656daa_Dne.field_21260d_FWm + n2, this.field_3656daa_Dne.field_2e5f1b_bzF + n, this.field_2d29f4_aFZ, this.method_7a46288d_Dne(), bl);
            }
        }
        return null;
    }
}

