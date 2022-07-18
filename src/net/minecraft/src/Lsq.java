package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class Lsq
extends kbN {
    public static final String[] field_f5e54dca_Dne = new String[]{"cocoa_0", "cocoa_1", "cocoa_2"};
    private gDn[] field_836bfe96_Dne;

    @Override
    public void method_86296256_Dne(Qnq qnq, int n, int n2, int n3, int n4, float f, int n5) {
        int n6 = Lsq.method_ae3dc47d_c_(n4);
        int n7 = 1;
        if (n6 >= 2) {
            n7 = 3;
        }
        for (int i = 0; i < n7; ++i) {
            this.method_c594b700_FWm(qnq, n, n2, n3, new NMq(dEr.field_5d50330c_edi, 1, 3));
        }
    }

    @Override
    public int method_9cb39123_Dne(Qnq qnq, int n, int n2, int n3) {
        return dEr.field_5d50330c_edi.field_267cf5_Qnq;
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        this.field_836bfe96_Dne = new gDn[field_f5e54dca_Dne.length];
        for (int i = 0; i < this.field_836bfe96_Dne.length; ++i) {
            this.field_836bfe96_Dne[i] = rbp.method_285881e4_Dne(field_f5e54dca_Dne[i]);
        }
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return false;
    }

    @Override
    public void method_ca7e4e57_Dne(Qnq qnq, int n, int n2, int n3, FUH fUH, NMq nMq) {
        int n4 = ((geR.method_117d0718_FWm((double)(fUH.field_334489_mrb * 4.0f / 360.0f) + 0.5) & 3) + 0) % 4;
        qnq.method_d4dc89ed_Dne(n, n2, n3, n4, 2);
    }

    @Override
    public bSp method_8c85fe2_Dne(Qnq qnq, int n, int n2, int n3) {
        this.method_fbabf7ef_Dne(qnq, n, n2, n3);
        return super.method_8c85fe2_Dne(qnq, n, n2, n3);
    }

    @Override
    public boolean method_52f8ce31_a_(Qnq qnq, int n, int n2, int n3) {
        int n4;
        int n5;
        return (n5 = qnq.method_2c2cf7bc_Dne(n += zxJ.field_3f1c589_Dne[n4 = Lsq.method_7ed979f5_Qnq(qnq.method_2dee76f_bzF(n, n2, n3))], n2, n3 += zxJ.field_4039e0a_FWm[n4])) == zKP.field_af0f1368_udO.field_21260d_FWm && Tkf.method_143f9e0f_bzF(qnq.method_2dee76f_bzF(n, n2, n3)) == 3;
    }

    @Override
    public int method_a13ce189_Dne(Qnq qnq, int n, int n2, int n3, int n4, float f, float f2, float f3, int n5) {
        if (n4 == 1 || n4 == 0) {
            n4 = 2;
        }
        return zxJ.field_5781703_aFZ[zxJ.field_4a92422_Qnq[n4]];
    }

    public static int method_ae3dc47d_c_(int n) {
        return (n & 0xC) >> 2;
    }

    @Override
    public gDn method_9051f17a_Dne(int n, int n2) {
        return this.field_836bfe96_Dne[2];
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return false;
    }

    @Override
    public bSp method_5f382101_FWm(Qnq qnq, int n, int n2, int n3) {
        this.method_fbabf7ef_Dne(qnq, n, n2, n3);
        return super.method_5f382101_FWm(qnq, n, n2, n3);
    }

    @Override
    public int method_7a46288d_Dne() {
        return 28;
    }

    @Override
    public void method_f9bf07d3_Dne(Qnq qnq, int n, int n2, int n3, int n4) {
        if (!this.method_52f8ce31_a_(qnq, n, n2, n3)) {
            this.method_fd7de26f_FWm(qnq, n, n2, n3, qnq.method_2dee76f_bzF(n, n2, n3), 0);
            qnq.method_2e7161e6_Qnq(n, n2, n3);
        }
    }

    @Override
    public void method_ca828a1c_Dne(Qnq qnq, int n, int n2, int n3, Random random) {
        int n4;
        int n5;
        if (!this.method_52f8ce31_a_(qnq, n, n2, n3)) {
            this.method_fd7de26f_FWm(qnq, n, n2, n3, qnq.method_2dee76f_bzF(n, n2, n3), 0);
            qnq.method_2e7161e6_Qnq(n, n2, n3);
        } else if (qnq.field_7331eae7_Dne.nextInt(5) == 0 && (n5 = Lsq.method_ae3dc47d_c_(n4 = qnq.method_2dee76f_bzF(n, n2, n3))) < 2) {
            qnq.method_d4dc89ed_Dne(n, n2, n3, ++n5 << 2 | Lsq.method_7ed979f5_Qnq(n4), 2);
        }
    }

    @Override
    public int method_3036b9c2_FWm(Qnq qnq, int n, int n2, int n3) {
        return 3;
    }

    @Override
    public void method_fbabf7ef_Dne(Zpi zpi, int n, int n2, int n3) {
        int n4 = zpi.method_2dee76f_bzF(n, n2, n3);
        int n5 = Lsq.method_7ed979f5_Qnq(n4);
        int n6 = Lsq.method_ae3dc47d_c_(n4);
        int n7 = 4 + n6 * 2;
        int n8 = 5 + n6 * 2;
        float f = (float)n7 / 2.0f;
        switch (n5) {
            case 0: {
                this.method_eb14b51a_Dne((8.0f - f) / 16.0f, (12.0f - (float)n8) / 16.0f, (15.0f - (float)n7) / 16.0f, (8.0f + f) / 16.0f, 0.75f, 0.9375f);
                break;
            }
            case 1: {
                this.method_eb14b51a_Dne(0.0625f, (12.0f - (float)n8) / 16.0f, (8.0f - f) / 16.0f, (1.0f + (float)n7) / 16.0f, 0.75f, (8.0f + f) / 16.0f);
                break;
            }
            case 2: {
                this.method_eb14b51a_Dne((8.0f - f) / 16.0f, (12.0f - (float)n8) / 16.0f, 0.0625f, (8.0f + f) / 16.0f, 0.75f, (1.0f + (float)n7) / 16.0f);
                break;
            }
            case 3: {
                this.method_eb14b51a_Dne((15.0f - (float)n7) / 16.0f, (12.0f - (float)n8) / 16.0f, (8.0f - f) / 16.0f, 0.9375f, 0.75f, (8.0f + f) / 16.0f);
            }
        }
    }

    public Lsq(int n) {
        super(n, KFd.field_1c2a8b62_XHL);
        this.method_21cbfe2c_Dne(true);
    }

    public gDn method_9e795529_Dne(int n) {
        if (n < 0 || n >= this.field_836bfe96_Dne.length) {
            n = this.field_836bfe96_Dne.length - 1;
        }
        return this.field_836bfe96_Dne[n];
    }
}

