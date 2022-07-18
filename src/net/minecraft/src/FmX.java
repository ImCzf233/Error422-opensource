package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class FmX
extends zKP {
    private gDn field_375b13b_Dne = null;

    public static int method_143f9e0f_bzF(int n) {
        return n & 7;
    }

    public void method_ae128dc7_bzF() {
        this.field_375b13b_Dne = null;
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
    }

    @Override
    public boolean method_f9bf07d7_Dne(Qnq qnq, int n, int n2, int n3, int n4) {
        return false;
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return false;
    }

    @Override
    public int method_cfc9daf9_Dne(Random random) {
        return 0;
    }

    @Override
    public int method_9cb39123_Dne(Qnq qnq, int n, int n2, int n3) {
        return 0;
    }

    @Override
    public void method_3e226590_Dne(Qnq qnq, int n, int n2, int n3, int n4, int n5) {
        super.method_3e226590_Dne(qnq, n, n2, n3, n4, n5);
        int n6 = rrP.field_3f1c589_Dne[FmX.method_143f9e0f_bzF(n5)];
        int n7 = qnq.method_2c2cf7bc_Dne(n += rrP.field_4039e0a_FWm[n6], n2 += rrP.field_59d86bc_bzF[n6], n3 += rrP.field_4a92422_Qnq[n6]);
        if ((n7 == zKP.field_20291847_FWm.field_21260d_FWm || n7 == zKP.field_36f4c68_Dne.field_21260d_FWm) && XbN.method_ce7f5dad_Dne(n5 = qnq.method_2dee76f_bzF(n, n2, n3))) {
            zKP.field_8374b848_Dne[n7].method_fd7de26f_FWm(qnq, n, n2, n3, n5, 0);
            qnq.method_2e7161e6_Qnq(n, n2, n3);
        }
    }

    @Override
    public void method_f9bf07d3_Dne(Qnq qnq, int n, int n2, int n3, int n4) {
        int n5 = FmX.method_143f9e0f_bzF(qnq.method_2dee76f_bzF(n, n2, n3));
        int n6 = qnq.method_2c2cf7bc_Dne(n - rrP.field_4039e0a_FWm[n5], n2 - rrP.field_59d86bc_bzF[n5], n3 - rrP.field_4a92422_Qnq[n5]);
        if (n6 != zKP.field_20291847_FWm.field_21260d_FWm && n6 != zKP.field_36f4c68_Dne.field_21260d_FWm) {
            qnq.method_2e7161e6_Qnq(n, n2, n3);
        } else {
            zKP.field_8374b848_Dne[n6].method_f9bf07d3_Dne(qnq, n - rrP.field_4039e0a_FWm[n5], n2 - rrP.field_59d86bc_bzF[n5], n3 - rrP.field_4a92422_Qnq[n5], n4);
        }
    }

    @Override
    public void method_1bbfa017_Dne(Qnq qnq, int n, int n2, int n3, bSp bSp2, List list, sMa sMa2) {
        int n4 = qnq.method_2dee76f_bzF(n, n2, n3);
        switch (FmX.method_143f9e0f_bzF(n4)) {
            case 0: {
                this.method_eb14b51a_Dne(0.0f, 0.0f, 0.0f, 1.0f, 0.25f, 1.0f);
                super.method_1bbfa017_Dne(qnq, n, n2, n3, bSp2, list, sMa2);
                this.method_eb14b51a_Dne(0.375f, 0.25f, 0.375f, 0.625f, 1.0f, 0.625f);
                super.method_1bbfa017_Dne(qnq, n, n2, n3, bSp2, list, sMa2);
                break;
            }
            case 1: {
                this.method_eb14b51a_Dne(0.0f, 0.75f, 0.0f, 1.0f, 1.0f, 1.0f);
                super.method_1bbfa017_Dne(qnq, n, n2, n3, bSp2, list, sMa2);
                this.method_eb14b51a_Dne(0.375f, 0.0f, 0.375f, 0.625f, 0.75f, 0.625f);
                super.method_1bbfa017_Dne(qnq, n, n2, n3, bSp2, list, sMa2);
                break;
            }
            case 2: {
                this.method_eb14b51a_Dne(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.25f);
                super.method_1bbfa017_Dne(qnq, n, n2, n3, bSp2, list, sMa2);
                this.method_eb14b51a_Dne(0.25f, 0.375f, 0.25f, 0.75f, 0.625f, 1.0f);
                super.method_1bbfa017_Dne(qnq, n, n2, n3, bSp2, list, sMa2);
                break;
            }
            case 3: {
                this.method_eb14b51a_Dne(0.0f, 0.0f, 0.75f, 1.0f, 1.0f, 1.0f);
                super.method_1bbfa017_Dne(qnq, n, n2, n3, bSp2, list, sMa2);
                this.method_eb14b51a_Dne(0.25f, 0.375f, 0.0f, 0.75f, 0.625f, 0.75f);
                super.method_1bbfa017_Dne(qnq, n, n2, n3, bSp2, list, sMa2);
                break;
            }
            case 4: {
                this.method_eb14b51a_Dne(0.0f, 0.0f, 0.0f, 0.25f, 1.0f, 1.0f);
                super.method_1bbfa017_Dne(qnq, n, n2, n3, bSp2, list, sMa2);
                this.method_eb14b51a_Dne(0.375f, 0.25f, 0.25f, 0.625f, 0.75f, 1.0f);
                super.method_1bbfa017_Dne(qnq, n, n2, n3, bSp2, list, sMa2);
                break;
            }
            case 5: {
                this.method_eb14b51a_Dne(0.75f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
                super.method_1bbfa017_Dne(qnq, n, n2, n3, bSp2, list, sMa2);
                this.method_eb14b51a_Dne(0.0f, 0.375f, 0.25f, 0.75f, 0.625f, 0.75f);
                super.method_1bbfa017_Dne(qnq, n, n2, n3, bSp2, list, sMa2);
            }
        }
        this.method_eb14b51a_Dne(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }

    @Override
    public void method_fbabf7ef_Dne(Zpi zpi, int n, int n2, int n3) {
        int n4 = zpi.method_2dee76f_bzF(n, n2, n3);
        switch (FmX.method_143f9e0f_bzF(n4)) {
            case 0: {
                this.method_eb14b51a_Dne(0.0f, 0.0f, 0.0f, 1.0f, 0.25f, 1.0f);
                break;
            }
            case 1: {
                this.method_eb14b51a_Dne(0.0f, 0.75f, 0.0f, 1.0f, 1.0f, 1.0f);
                break;
            }
            case 2: {
                this.method_eb14b51a_Dne(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.25f);
                break;
            }
            case 3: {
                this.method_eb14b51a_Dne(0.0f, 0.0f, 0.75f, 1.0f, 1.0f, 1.0f);
                break;
            }
            case 4: {
                this.method_eb14b51a_Dne(0.0f, 0.0f, 0.0f, 0.25f, 1.0f, 1.0f);
                break;
            }
            case 5: {
                this.method_eb14b51a_Dne(0.75f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
            }
        }
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return false;
    }

    @Override
    public gDn method_9051f17a_Dne(int n, int n2) {
        int n3 = FmX.method_143f9e0f_bzF(n2);
        return n == n3 ? (this.field_375b13b_Dne != null ? this.field_375b13b_Dne : ((n2 & 8) != 0 ? XbN.method_285881e4_Dne("piston_top_sticky") : XbN.method_285881e4_Dne("piston_top"))) : (n3 < 6 && n == rrP.field_3f1c589_Dne[n3] ? XbN.method_285881e4_Dne("piston_top") : XbN.method_285881e4_Dne("piston_side"));
    }

    @Override
    public int method_7a46288d_Dne() {
        return 17;
    }

    @Override
    public boolean method_9cb39134_Dne(Qnq qnq, int n, int n2, int n3) {
        return false;
    }

    public FmX(int n) {
        super(n, KFd.field_d72f68f8_yMz);
        this.method_2792b805_Dne(field_712f6e9e_aFZ);
        this.method_f1c42c0b_bzF(0.5f);
    }

    public void method_a68ac5f6_Dne(gDn gDn2) {
        this.field_375b13b_Dne = gDn2;
    }
}

