package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class VHB
extends zKP {
    private boolean field_2092bf_Dne = true;
    private gDn field_75bd7f28_bzF;
    private Set field_83b48b6a_Dne = new HashSet();
    private gDn field_202f7d1a_FWm;
    private gDn field_375b13b_Dne;
    private gDn field_71393581_aFZ;

    private int method_d6a0f307_FWm(Qnq qnq, int n, int n2, int n3, int n4) {
        if (qnq.method_2c2cf7bc_Dne(n, n2, n3) != this.field_21260d_FWm) {
            return n4;
        }
        int n5 = qnq.method_2dee76f_bzF(n, n2, n3);
        return n5 > n4 ? n5 : n4;
    }

    private void method_5452795d_bzF(Qnq qnq, int n, int n2, int n3) {
        this.method_862abf73_Dne(qnq, n, n2, n3, n, n2, n3);
        ArrayList arrayList = new ArrayList(this.field_83b48b6a_Dne);
        this.field_83b48b6a_Dne.clear();
        for (int i = 0; i < arrayList.size(); ++i) {
            EyB eyB = (EyB)arrayList.get(i);
            qnq.method_58fe7b07_bzF(eyB.field_2092ae_Dne, eyB.field_21260d_FWm, eyB.field_2e5f1b_bzF, this.field_21260d_FWm);
        }
    }

    @Override
    public void method_9cb39130_Dne(Qnq qnq, int n, int n2, int n3) {
        super.method_9cb39130_Dne(qnq, n, n2, n3);
        if (!qnq.field_2d2a05_aFZ) {
            this.method_5452795d_bzF(qnq, n, n2, n3);
            qnq.method_58fe7b07_bzF(n, n2 + 1, n3, this.field_21260d_FWm);
            qnq.method_58fe7b07_bzF(n, n2 - 1, n3, this.field_21260d_FWm);
            this.method_714a8eb7_Qnq(qnq, n - 1, n2, n3);
            this.method_714a8eb7_Qnq(qnq, n + 1, n2, n3);
            this.method_714a8eb7_Qnq(qnq, n, n2, n3 - 1);
            this.method_714a8eb7_Qnq(qnq, n, n2, n3 + 1);
            if (qnq.method_6fdef3c4_DyG(n - 1, n2, n3)) {
                this.method_714a8eb7_Qnq(qnq, n - 1, n2 + 1, n3);
            } else {
                this.method_714a8eb7_Qnq(qnq, n - 1, n2 - 1, n3);
            }
            if (qnq.method_6fdef3c4_DyG(n + 1, n2, n3)) {
                this.method_714a8eb7_Qnq(qnq, n + 1, n2 + 1, n3);
            } else {
                this.method_714a8eb7_Qnq(qnq, n + 1, n2 - 1, n3);
            }
            if (qnq.method_6fdef3c4_DyG(n, n2, n3 - 1)) {
                this.method_714a8eb7_Qnq(qnq, n, n2 + 1, n3 - 1);
            } else {
                this.method_714a8eb7_Qnq(qnq, n, n2 - 1, n3 - 1);
            }
            if (qnq.method_6fdef3c4_DyG(n, n2, n3 + 1)) {
                this.method_714a8eb7_Qnq(qnq, n, n2 + 1, n3 + 1);
            } else {
                this.method_714a8eb7_Qnq(qnq, n, n2 - 1, n3 + 1);
            }
        }
    }

    public static boolean method_b611966b_bzF(Zpi zpi, int n, int n2, int n3, int n4) {
        int n5 = zpi.method_2c2cf7bc_Dne(n, n2, n3);
        if (n5 == zKP.field_36e009c_Dne.field_21260d_FWm) {
            return true;
        }
        if (n5 == 0) {
            return false;
        }
        if (!zKP.field_37e22e0_Dne.method_87b738a7_aFZ(n5)) {
            return zKP.field_8374b848_Dne[n5].method_ae128dcb_bzF() && n4 != -1;
        }
        int n6 = zpi.method_2dee76f_bzF(n, n2, n3);
        return n4 == (n6 & 3) || n4 == zxJ.field_5781703_aFZ[n6 & 3];
    }

    @Override
    public int method_79d378e7_Dne(Zpi zpi, int n, int n2, int n3, int n4) {
        boolean bl;
        if (!this.field_2092bf_Dne) {
            return 0;
        }
        int n5 = zpi.method_2dee76f_bzF(n, n2, n3);
        if (n5 == 0) {
            return 0;
        }
        if (n4 == 1) {
            return n5;
        }
        boolean bl2 = VHB.method_381c2c51_Qnq(zpi, n - 1, n2, n3, 1) || !zpi.method_6fdef3c4_DyG(n - 1, n2, n3) && VHB.method_381c2c51_Qnq(zpi, n - 1, n2 - 1, n3, -1);
        boolean bl3 = VHB.method_381c2c51_Qnq(zpi, n + 1, n2, n3, 3) || !zpi.method_6fdef3c4_DyG(n + 1, n2, n3) && VHB.method_381c2c51_Qnq(zpi, n + 1, n2 - 1, n3, -1);
        boolean bl4 = VHB.method_381c2c51_Qnq(zpi, n, n2, n3 - 1, 2) || !zpi.method_6fdef3c4_DyG(n, n2, n3 - 1) && VHB.method_381c2c51_Qnq(zpi, n, n2 - 1, n3 - 1, -1);
        boolean bl5 = bl = VHB.method_381c2c51_Qnq(zpi, n, n2, n3 + 1, 0) || !zpi.method_6fdef3c4_DyG(n, n2, n3 + 1) && VHB.method_381c2c51_Qnq(zpi, n, n2 - 1, n3 + 1, -1);
        if (!zpi.method_6fdef3c4_DyG(n, n2 + 1, n3)) {
            if (zpi.method_6fdef3c4_DyG(n - 1, n2, n3) && VHB.method_381c2c51_Qnq(zpi, n - 1, n2 + 1, n3, -1)) {
                bl2 = true;
            }
            if (zpi.method_6fdef3c4_DyG(n + 1, n2, n3) && VHB.method_381c2c51_Qnq(zpi, n + 1, n2 + 1, n3, -1)) {
                bl3 = true;
            }
            if (zpi.method_6fdef3c4_DyG(n, n2, n3 - 1) && VHB.method_381c2c51_Qnq(zpi, n, n2 + 1, n3 - 1, -1)) {
                bl4 = true;
            }
            if (zpi.method_6fdef3c4_DyG(n, n2, n3 + 1) && VHB.method_381c2c51_Qnq(zpi, n, n2 + 1, n3 + 1, -1)) {
                bl = true;
            }
        }
        return !bl4 && !bl3 && !bl2 && !bl && n4 >= 2 && n4 <= 5 ? n5 : (n4 == 2 && bl4 && !bl2 && !bl3 ? n5 : (n4 == 3 && bl && !bl2 && !bl3 ? n5 : (n4 == 4 && bl2 && !bl4 && !bl ? n5 : (n4 == 5 && bl3 && !bl4 && !bl ? n5 : 0))));
    }

    public static gDn method_285881e4_Dne(String string) {
        return string == "redstoneDust_cross" ? zKP.field_36e009c_Dne.field_375b13b_Dne : (string == "redstoneDust_line" ? zKP.field_36e009c_Dne.field_202f7d1a_FWm : (string == "redstoneDust_cross_overlay" ? zKP.field_36e009c_Dne.field_75bd7f28_bzF : (string == "redstoneDust_line_overlay" ? zKP.field_36e009c_Dne.field_71393581_aFZ : null)));
    }

    @Override
    public int method_24763341_Dne(int n, Random random, int n2) {
        return dEr.field_59c23676_exS.field_267cf5_Qnq;
    }

    public static boolean method_381c2c51_Qnq(Zpi zpi, int n, int n2, int n3, int n4) {
        if (VHB.method_b611966b_bzF(zpi, n, n2, n3, n4)) {
            return true;
        }
        int n5 = zpi.method_2c2cf7bc_Dne(n, n2, n3);
        if (n5 == zKP.field_2037eebf_FWm.field_21260d_FWm) {
            int n6 = zpi.method_2dee76f_bzF(n, n2, n3);
            return n4 == (n6 & 3);
        }
        return false;
    }

    @Override
    public int method_fbabf7e2_Dne(Zpi zpi, int n, int n2, int n3) {
        return 0x800000;
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        this.field_375b13b_Dne = rbp.method_285881e4_Dne("redstoneDust_cross");
        this.field_202f7d1a_FWm = rbp.method_285881e4_Dne("redstoneDust_line");
        this.field_75bd7f28_bzF = rbp.method_285881e4_Dne("redstoneDust_cross_overlay");
        this.field_71393581_aFZ = rbp.method_285881e4_Dne("redstoneDust_line_overlay");
        this.field_5e5f2002_Qnq = this.field_375b13b_Dne;
    }

    @Override
    public void method_3e226590_Dne(Qnq qnq, int n, int n2, int n3, int n4, int n5) {
        super.method_3e226590_Dne(qnq, n, n2, n3, n4, n5);
        if (!qnq.field_2d2a05_aFZ) {
            qnq.method_58fe7b07_bzF(n, n2 + 1, n3, this.field_21260d_FWm);
            qnq.method_58fe7b07_bzF(n, n2 - 1, n3, this.field_21260d_FWm);
            qnq.method_58fe7b07_bzF(n + 1, n2, n3, this.field_21260d_FWm);
            qnq.method_58fe7b07_bzF(n - 1, n2, n3, this.field_21260d_FWm);
            qnq.method_58fe7b07_bzF(n, n2, n3 + 1, this.field_21260d_FWm);
            qnq.method_58fe7b07_bzF(n, n2, n3 - 1, this.field_21260d_FWm);
            this.method_5452795d_bzF(qnq, n, n2, n3);
            this.method_714a8eb7_Qnq(qnq, n - 1, n2, n3);
            this.method_714a8eb7_Qnq(qnq, n + 1, n2, n3);
            this.method_714a8eb7_Qnq(qnq, n, n2, n3 - 1);
            this.method_714a8eb7_Qnq(qnq, n, n2, n3 + 1);
            if (qnq.method_6fdef3c4_DyG(n - 1, n2, n3)) {
                this.method_714a8eb7_Qnq(qnq, n - 1, n2 + 1, n3);
            } else {
                this.method_714a8eb7_Qnq(qnq, n - 1, n2 - 1, n3);
            }
            if (qnq.method_6fdef3c4_DyG(n + 1, n2, n3)) {
                this.method_714a8eb7_Qnq(qnq, n + 1, n2 + 1, n3);
            } else {
                this.method_714a8eb7_Qnq(qnq, n + 1, n2 - 1, n3);
            }
            if (qnq.method_6fdef3c4_DyG(n, n2, n3 - 1)) {
                this.method_714a8eb7_Qnq(qnq, n, n2 + 1, n3 - 1);
            } else {
                this.method_714a8eb7_Qnq(qnq, n, n2 - 1, n3 - 1);
            }
            if (qnq.method_6fdef3c4_DyG(n, n2, n3 + 1)) {
                this.method_714a8eb7_Qnq(qnq, n, n2 + 1, n3 + 1);
            } else {
                this.method_714a8eb7_Qnq(qnq, n, n2 - 1, n3 + 1);
            }
        }
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return false;
    }

    @Override
    public boolean method_9cb39134_Dne(Qnq qnq, int n, int n2, int n3) {
        return qnq.method_73e9b8f9_IjH(n, n2 - 1, n3) || qnq.method_2c2cf7bc_Dne(n, n2 - 1, n3) == zKP.field_3b150dda_fYA.field_21260d_FWm;
    }

    private void method_862abf73_Dne(Qnq qnq, int n, int n2, int n3, int n4, int n5, int n6) {
        int n7 = qnq.method_2dee76f_bzF(n, n2, n3);
        int n8 = 0;
        int n9 = this.method_d6a0f307_FWm(qnq, n4, n5, n6, n8);
        this.field_2092bf_Dne = false;
        int n10 = qnq.method_6fdef3b3_DyG(n, n2, n3);
        this.field_2092bf_Dne = true;
        if (n10 > 0 && n10 > n9 - 1) {
            n9 = n10;
        }
        int n11 = 0;
        for (int i = 0; i < 4; ++i) {
            int n12 = n;
            int n13 = n3;
            if (i == 0) {
                n12 = n - 1;
            }
            if (i == 1) {
                ++n12;
            }
            if (i == 2) {
                n13 = n3 - 1;
            }
            if (i == 3) {
                ++n13;
            }
            if (n12 != n4 || n13 != n6) {
                n11 = this.method_d6a0f307_FWm(qnq, n12, n2, n13, n11);
            }
            if (qnq.method_6fdef3c4_DyG(n12, n2, n13) && !qnq.method_6fdef3c4_DyG(n, n2 + 1, n3)) {
                if (n12 == n4 && n13 == n6 || n2 < n5) continue;
                n11 = this.method_d6a0f307_FWm(qnq, n12, n2 + 1, n13, n11);
                continue;
            }
            if (qnq.method_6fdef3c4_DyG(n12, n2, n13) || n12 == n4 && n13 == n6 || n2 > n5) continue;
            n11 = this.method_d6a0f307_FWm(qnq, n12, n2 - 1, n13, n11);
        }
        n9 = n11 > n9 ? n11 - 1 : (n9 > 0 ? --n9 : 0);
        if (n10 > n9 - 1) {
            n9 = n10;
        }
        if (n7 != n9) {
            qnq.method_d4dc89ed_Dne(n, n2, n3, n9, 2);
            this.field_83b48b6a_Dne.add(new EyB(n, n2, n3));
            this.field_83b48b6a_Dne.add(new EyB(n - 1, n2, n3));
            this.field_83b48b6a_Dne.add(new EyB(n + 1, n2, n3));
            this.field_83b48b6a_Dne.add(new EyB(n, n2 - 1, n3));
            this.field_83b48b6a_Dne.add(new EyB(n, n2 + 1, n3));
            this.field_83b48b6a_Dne.add(new EyB(n, n2, n3 - 1));
            this.field_83b48b6a_Dne.add(new EyB(n, n2, n3 + 1));
        }
    }

    private void method_714a8eb7_Qnq(Qnq qnq, int n, int n2, int n3) {
        if (qnq.method_2c2cf7bc_Dne(n, n2, n3) == this.field_21260d_FWm) {
            qnq.method_58fe7b07_bzF(n, n2, n3, this.field_21260d_FWm);
            qnq.method_58fe7b07_bzF(n - 1, n2, n3, this.field_21260d_FWm);
            qnq.method_58fe7b07_bzF(n + 1, n2, n3, this.field_21260d_FWm);
            qnq.method_58fe7b07_bzF(n, n2, n3 - 1, this.field_21260d_FWm);
            qnq.method_58fe7b07_bzF(n, n2, n3 + 1, this.field_21260d_FWm);
            qnq.method_58fe7b07_bzF(n, n2 - 1, n3, this.field_21260d_FWm);
            qnq.method_58fe7b07_bzF(n, n2 + 1, n3, this.field_21260d_FWm);
        }
    }

    @Override
    public void method_f9bf07d3_Dne(Qnq qnq, int n, int n2, int n3, int n4) {
        if (!qnq.field_2d2a05_aFZ) {
            boolean bl = this.method_9cb39134_Dne(qnq, n, n2, n3);
            if (bl) {
                this.method_5452795d_bzF(qnq, n, n2, n3);
            } else {
                this.method_fd7de26f_FWm(qnq, n, n2, n3, 0, 0);
                qnq.method_2e7161e6_Qnq(n, n2, n3);
            }
            super.method_f9bf07d3_Dne(qnq, n, n2, n3, n4);
        }
    }

    @Override
    public void method_ff5e68fb_FWm(Qnq qnq, int n, int n2, int n3, Random random) {
        int n4 = qnq.method_2dee76f_bzF(n, n2, n3);
        if (n4 > 0) {
            double d = (double)n + 0.5 + ((double)random.nextFloat() - 0.5) * 0.2;
            double d2 = (float)n2 + 0.0625f;
            double d3 = (double)n3 + 0.5 + ((double)random.nextFloat() - 0.5) * 0.2;
            float f = (float)n4 / 15.0f;
            float f2 = f * 0.6f + 0.4f;
            if (n4 == 0) {
                f2 = 0.0f;
            }
            float f3 = f * f * 0.7f - 0.5f;
            float f4 = f * f * 0.6f - 0.7f;
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            if (f4 < 0.0f) {
                f4 = 0.0f;
            }
            qnq.method_8600ec24_Dne("reddust", d, d2, d3, f2, f3, f4);
        }
    }

    public VHB(int n) {
        super(n, KFd.field_1efdede7_qLR);
        this.method_eb14b51a_Dne(0.0f, 0.0f, 0.0f, 1.0f, 0.0625f, 1.0f);
    }

    @Override
    public int method_9cb39123_Dne(Qnq qnq, int n, int n2, int n3) {
        return dEr.field_59c23676_exS.field_267cf5_Qnq;
    }

    @Override
    public int method_7a46288d_Dne() {
        return 5;
    }

    @Override
    public int method_56b56428_FWm(Zpi zpi, int n, int n2, int n3, int n4) {
        return !this.field_2092bf_Dne ? 0 : this.method_79d378e7_Dne(zpi, n, n2, n3, n4);
    }

    @Override
    public bSp method_8c85fe2_Dne(Qnq qnq, int n, int n2, int n3) {
        return null;
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return false;
    }

    @Override
    public boolean method_ae128dcb_bzF() {
        return this.field_2092bf_Dne;
    }
}

