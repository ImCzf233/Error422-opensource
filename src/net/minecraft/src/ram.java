package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

abstract class ram
extends bvz {
    private int field_2092ae_Dne;
    protected opc field_379f80a_Dne;

    protected int method_117d19dd_FWm(int n) {
        return 0;
    }

    protected static boolean method_697d22a9_Dne(CLK cLK) {
        return cLK != null && cLK.field_21260d_FWm > 10;
    }

    @Override
    protected void method_b5ae8f6f_Dne(Qnq qnq, int n, int n2, int n3, int n4, int n5, CLK cLK) {
        int n6 = this.method_5c563934_Qnq(n, n2);
        int n7 = this.method_6f304eb3_aFZ(n, n2);
        super.method_b5ae8f6f_Dne(qnq, n6, n7, n3, n4, n5, cLK);
    }

    @Override
    protected void method_6ca945f0_FWm(Qnq qnq, int n, int n2, int n3, int n4, int n5, CLK cLK) {
        int n6 = this.method_5c563934_Qnq(n, n2);
        int n7 = this.method_6f304eb3_aFZ(n, n2);
        super.method_6ca945f0_FWm(qnq, n6, n7, n3, n4, n5, cLK);
    }

    protected bvz method_97ce958d_Dne(opc opc2, List list, Random random, int n, int n2) {
        switch (this.field_2d29f4_aFZ) {
            case 0: {
                return wBl.method_920216ec_Dne(opc2, list, random, this.field_3656daa_Dne.field_2092ae_Dne - 1, this.field_3656daa_Dne.field_21260d_FWm + n, this.field_3656daa_Dne.field_2e5f1b_bzF + n2, 1, this.method_7a46288d_Dne());
            }
            case 1: {
                return wBl.method_920216ec_Dne(opc2, list, random, this.field_3656daa_Dne.field_2092ae_Dne + n2, this.field_3656daa_Dne.field_21260d_FWm + n, this.field_3656daa_Dne.field_2e5f1b_bzF - 1, 2, this.method_7a46288d_Dne());
            }
            case 2: {
                return wBl.method_920216ec_Dne(opc2, list, random, this.field_3656daa_Dne.field_2092ae_Dne - 1, this.field_3656daa_Dne.field_21260d_FWm + n, this.field_3656daa_Dne.field_2e5f1b_bzF + n2, 1, this.method_7a46288d_Dne());
            }
            case 3: {
                return wBl.method_920216ec_Dne(opc2, list, random, this.field_3656daa_Dne.field_2092ae_Dne + n2, this.field_3656daa_Dne.field_21260d_FWm + n, this.field_3656daa_Dne.field_2e5f1b_bzF - 1, 2, this.method_7a46288d_Dne());
            }
        }
        return null;
    }

    protected void method_d749210c_Dne(Qnq qnq, CLK cLK, int n, int n2, int n3, int n4) {
        if (this.field_2092ae_Dne < n4) {
            int n5;
            int n6;
            int n7;
            for (int i = this.field_2092ae_Dne; i < n4 && cLK.method_2c2cf7cd_Dne(n7 = this.method_16cca6d_Dne(n + i, n3), n6 = this.method_ce7f5d9c_Dne(n2), n5 = this.method_1e26964c_FWm(n + i, n3)); ++i) {
                ++this.field_2092ae_Dne;
                pjB pjB2 = new pjB(qnq, this.method_117d19dd_FWm(i));
                pjB2.method_9ce0fc65_FWm((double)n7 + 0.5, n6, (double)n5 + 0.5, 0.0f, 0.0f);
                qnq.method_94d18be5_FWm(pjB2);
            }
        }
    }

    protected ram(opc opc2, int n) {
        super(n);
        this.field_379f80a_Dne = opc2;
    }

    protected bvz method_64f3b44e_FWm(opc opc2, List list, Random random, int n, int n2) {
        switch (this.field_2d29f4_aFZ) {
            case 0: {
                return wBl.method_920216ec_Dne(opc2, list, random, this.field_3656daa_Dne.field_267cf5_Qnq + 1, this.field_3656daa_Dne.field_21260d_FWm + n, this.field_3656daa_Dne.field_2e5f1b_bzF + n2, 3, this.method_7a46288d_Dne());
            }
            case 1: {
                return wBl.method_920216ec_Dne(opc2, list, random, this.field_3656daa_Dne.field_2092ae_Dne + n2, this.field_3656daa_Dne.field_21260d_FWm + n, this.field_3656daa_Dne.field_388da6_zGp + 1, 0, this.method_7a46288d_Dne());
            }
            case 2: {
                return wBl.method_920216ec_Dne(opc2, list, random, this.field_3656daa_Dne.field_267cf5_Qnq + 1, this.field_3656daa_Dne.field_21260d_FWm + n, this.field_3656daa_Dne.field_2e5f1b_bzF + n2, 3, this.method_7a46288d_Dne());
            }
            case 3: {
                return wBl.method_920216ec_Dne(opc2, list, random, this.field_3656daa_Dne.field_2092ae_Dne + n2, this.field_3656daa_Dne.field_21260d_FWm + n, this.field_3656daa_Dne.field_388da6_zGp + 1, 0, this.method_7a46288d_Dne());
            }
        }
        return null;
    }

    @Override
    protected void method_3d7d4888_Dne(Qnq qnq, CLK cLK, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, boolean bl) {
        int n9 = this.method_5c563934_Qnq(n7, 0);
        int n10 = this.method_6f304eb3_aFZ(n7, 0);
        int n11 = this.method_5c563934_Qnq(n8, 0);
        int n12 = this.method_6f304eb3_aFZ(n8, 0);
        super.method_d26c5728_Dne(qnq, cLK, n, n2, n3, n4, n5, n6, n9, n10, n11, n12, bl);
    }

    protected int method_6f304eb3_aFZ(int n, int n2) {
        if (this.field_379f80a_Dne.field_2092bf_Dne) {
            if (n == zKP.field_af0f1368_udO.field_21260d_FWm) {
                return 0;
            }
            if (n == zKP.field_75c638da_bzF.field_21260d_FWm) {
                return 0;
            }
            if (n == zKP.field_5e67d9b4_Qnq.field_21260d_FWm) {
                return 2;
            }
        }
        return n2;
    }

    protected int method_d2c2fe3f_Dne(Qnq qnq, CLK cLK) {
        int n = 0;
        int n2 = 0;
        for (int i = this.field_3656daa_Dne.field_2e5f1b_bzF; i <= this.field_3656daa_Dne.field_388da6_zGp; ++i) {
            for (int j = this.field_3656daa_Dne.field_2092ae_Dne; j <= this.field_3656daa_Dne.field_267cf5_Qnq; ++j) {
                if (!cLK.method_2c2cf7cd_Dne(j, 64, i)) continue;
                n += Math.max(qnq.method_6f304eb3_aFZ(j, i), qnq.field_3690d00_Dne.method_7a46288d_Dne());
                ++n2;
            }
        }
        if (n2 == 0) {
            return -1;
        }
        return n / n2;
    }

    protected int method_5c563934_Qnq(int n, int n2) {
        if (this.field_379f80a_Dne.field_2092bf_Dne) {
            if (n == zKP.field_af0f1368_udO.field_21260d_FWm) {
                return zKP.field_850fb0c5_ceE.field_21260d_FWm;
            }
            if (n == zKP.field_75c638da_bzF.field_21260d_FWm) {
                return zKP.field_850fb0c5_ceE.field_21260d_FWm;
            }
            if (n == zKP.field_5e67d9b4_Qnq.field_21260d_FWm) {
                return zKP.field_850fb0c5_ceE.field_21260d_FWm;
            }
            if (n == zKP.field_7a2b5882_One.field_21260d_FWm) {
                return zKP.field_b77fe6db_Wnd.field_21260d_FWm;
            }
            if (n == zKP.field_91df3208_BJH.field_21260d_FWm) {
                return zKP.field_b77fe6db_Wnd.field_21260d_FWm;
            }
            if (n == zKP.field_7508fdcb_mrb.field_21260d_FWm) {
                return zKP.field_850fb0c5_ceE.field_21260d_FWm;
            }
        }
        return n;
    }
}

