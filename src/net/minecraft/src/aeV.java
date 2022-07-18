package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class aeV
extends zKP {
    @Override
    public int method_24763341_Dne(int n, Random random, int n2) {
        return dEr.field_ed76a7f3_ZeN.field_267cf5_Qnq;
    }

    @Override
    public void method_7a46289a_Dne() {
        float f = 0.375f;
        float f2 = f / 2.0f;
        this.method_eb14b51a_Dne(0.5f - f2, 0.0f, 0.5f - f2, 0.5f + f2, f, 0.5f + f2);
    }

    @Override
    public void method_86296256_Dne(Qnq qnq, int n, int n2, int n3, int n4, float f, int n5) {
        NMq nMq;
        super.method_86296256_Dne(qnq, n, n2, n3, n4, f, n5);
        if (n4 > 0 && (nMq = aeV.method_3059462b_a_(n4)) != null) {
            this.method_c594b700_FWm(qnq, n, n2, n3, nMq);
        }
    }

    @Override
    public boolean method_b0a28148_div() {
        return true;
    }

    @Override
    public boolean method_9cb39134_Dne(Qnq qnq, int n, int n2, int n3) {
        return true;
    }

    public static NMq method_3059462b_a_(int n) {
        switch (n) {
            case 1: {
                return new NMq(zKP.field_20306100_FWm);
            }
            case 2: {
                return new NMq(zKP.field_3769521_Dne);
            }
            case 3: {
                return new NMq(zKP.field_7141ef33_aFZ, 1, 0);
            }
            case 4: {
                return new NMq(zKP.field_7141ef33_aFZ, 1, 1);
            }
            case 5: {
                return new NMq(zKP.field_7141ef33_aFZ, 1, 2);
            }
            case 6: {
                return new NMq(zKP.field_7141ef33_aFZ, 1, 3);
            }
            case 7: {
                return new NMq(zKP.field_5e6003e8_Qnq);
            }
            case 8: {
                return new NMq(zKP.field_75be630e_bzF);
            }
            case 9: {
                return new NMq(zKP.field_27f261ab_XjO);
            }
            case 10: {
                return new NMq(zKP.field_373e079_Dne);
            }
            case 11: {
                return new NMq(zKP.field_36dc147_Dne, 1, 2);
            }
        }
        return null;
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return false;
    }

    public aeV(int n) {
        super(n, KFd.field_1efdede7_qLR);
        this.method_7a46289a_Dne();
    }

    @Override
    public void method_f9bf07d3_Dne(Qnq qnq, int n, int n2, int n3, int n4) {
        if (!qnq.method_73e9b8f9_IjH(n, n2 - 1, n3)) {
            this.method_fd7de26f_FWm(qnq, n, n2, n3, qnq.method_2dee76f_bzF(n, n2, n3), 0);
            qnq.method_2e7161e6_Qnq(n, n2, n3);
        }
    }

    @Override
    public boolean method_cb53d52e_Dne(Qnq qnq, int n, int n2, int n3, FiG fiG, int n4, float f, float f2, float f3) {
        NMq nMq = fiG.field_36a059b_Dne.method_23040479_Dne();
        if (nMq == null) {
            return false;
        }
        if (qnq.method_2dee76f_bzF(n, n2, n3) != 0) {
            return false;
        }
        int n5 = aeV.method_7c61cf08_Dne(nMq);
        if (n5 > 0) {
            qnq.method_d4dc89ed_Dne(n, n2, n3, n5, 2);
            if (!fiG.field_37cb681_Dne.field_267d06_Qnq && --nMq.field_2092ae_Dne <= 0) {
                fiG.field_36a059b_Dne.method_6e3a6b66_Dne(fiG.field_36a059b_Dne.field_2092ae_Dne, null);
            }
            return true;
        }
        return false;
    }

    public static int method_7c61cf08_Dne(NMq nMq) {
        int n = nMq.method_230de6ba_Dne().field_267cf5_Qnq;
        if (n == zKP.field_20306100_FWm.field_21260d_FWm) {
            return 1;
        }
        if (n == zKP.field_3769521_Dne.field_21260d_FWm) {
            return 2;
        }
        if (n == zKP.field_27f261ab_XjO.field_21260d_FWm) {
            return 9;
        }
        if (n == zKP.field_75be630e_bzF.field_21260d_FWm) {
            return 8;
        }
        if (n == zKP.field_5e6003e8_Qnq.field_21260d_FWm) {
            return 7;
        }
        if (n == zKP.field_373e079_Dne.field_21260d_FWm) {
            return 10;
        }
        if (n == zKP.field_7141ef33_aFZ.field_21260d_FWm) {
            switch (nMq.method_907a9d14_Qnq()) {
                case 0: {
                    return 3;
                }
                case 1: {
                    return 4;
                }
                case 2: {
                    return 5;
                }
                case 3: {
                    return 6;
                }
            }
        }
        if (n == zKP.field_36dc147_Dne.field_21260d_FWm) {
            switch (nMq.method_907a9d14_Qnq()) {
                case 2: {
                    return 11;
                }
            }
        }
        return 0;
    }

    @Override
    public int method_7a46288d_Dne() {
        return 33;
    }

    @Override
    public int method_9cb39123_Dne(Qnq qnq, int n, int n2, int n3) {
        NMq nMq = aeV.method_3059462b_a_(qnq.method_2dee76f_bzF(n, n2, n3));
        return nMq == null ? dEr.field_ed76a7f3_ZeN.field_267cf5_Qnq : nMq.field_2e5f1b_bzF;
    }

    @Override
    public int method_3036b9c2_FWm(Qnq qnq, int n, int n2, int n3) {
        NMq nMq = aeV.method_3059462b_a_(qnq.method_2dee76f_bzF(n, n2, n3));
        return nMq == null ? dEr.field_ed76a7f3_ZeN.field_267cf5_Qnq : nMq.method_907a9d14_Qnq();
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return false;
    }
}

