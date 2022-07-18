package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class tsU
extends ljW {
    private SoB method_d39ae11a_Dne(Zpi zpi, int n, int n2, int n3) {
        ipD ipD2 = zpi.method_d98e681d_Dne(n, n2, n3);
        return ipD2 instanceof SoB ? (SoB)ipD2 : null;
    }

    public tsU(int n) {
        super(n, KFd.field_d72f68f8_yMz);
        this.method_f1c42c0b_bzF(-1.0f);
    }

    @Override
    public boolean method_cb53d52e_Dne(Qnq qnq, int n, int n2, int n3, FiG fiG, int n4, float f, float f2, float f3) {
        if (!qnq.field_2d2a05_aFZ && qnq.method_d98e681d_Dne(n, n2, n3) == null) {
            qnq.method_2e7161e6_Qnq(n, n2, n3);
            return true;
        }
        return false;
    }

    public static ipD method_725d45d_Dne(int n, int n2, int n3, boolean bl, boolean bl2) {
        return new SoB(n, n2, n3, bl, bl2);
    }

    @Override
    public boolean method_9cb39134_Dne(Qnq qnq, int n, int n2, int n3) {
        return false;
    }

    @Override
    public int method_9cb39123_Dne(Qnq qnq, int n, int n2, int n3) {
        return 0;
    }

    @Override
    public void method_f9bf07d3_Dne(Qnq qnq, int n, int n2, int n3, int n4) {
        if (qnq.field_2d2a05_aFZ || qnq.method_d98e681d_Dne(n, n2, n3) == null) {
            // empty if block
        }
    }

    @Override
    public void method_fbabf7ef_Dne(Zpi zpi, int n, int n2, int n3) {
        SoB soB = this.method_d39ae11a_Dne(zpi, n, n2, n3);
        if (soB != null) {
            zKP zKP2 = zKP.field_8374b848_Dne[soB.method_7a46288d_Dne()];
            if (zKP2 == null || zKP2 == this) {
                return;
            }
            zKP2.method_fbabf7ef_Dne(zpi, n, n2, n3);
            float f = soB.method_ce7f5256_Dne(0.0f);
            if (soB.method_7a46289e_Dne()) {
                f = 1.0f - f;
            }
            int n4 = soB.method_7c6f602c_FWm();
            this.field_2092a9_Dne = zKP2.method_7a462888_Dne() - (double)((float)rrP.field_4039e0a_FWm[n4] * f);
            this.field_212608_FWm = zKP2.method_ae128db5_bzF() - (double)((float)rrP.field_59d86bc_bzF[n4] * f);
            this.field_2e5f16_bzF = zKP2.method_a98a064e_aFZ() - (double)((float)rrP.field_4a92422_Qnq[n4] * f);
            this.field_267cf0_Qnq = zKP2.method_7c6f6027_FWm() - (double)((float)rrP.field_4039e0a_FWm[n4] * f);
            this.field_2d29ef_aFZ = zKP2.method_907a9d0f_Qnq() - (double)((float)rrP.field_59d86bc_bzF[n4] * f);
            this.field_388da1_zGp = zKP2.method_d44b4580_zGp() - (double)((float)rrP.field_4a92422_Qnq[n4] * f);
        }
    }

    @Override
    public bSp method_8c85fe2_Dne(Qnq qnq, int n, int n2, int n3) {
        SoB soB = this.method_d39ae11a_Dne(qnq, n, n2, n3);
        if (soB == null) {
            return null;
        }
        float f = soB.method_ce7f5256_Dne(0.0f);
        if (soB.method_7a46289e_Dne()) {
            f = 1.0f - f;
        }
        return this.method_b3052e08_Dne(qnq, n, n2, n3, soB.method_7a46288d_Dne(), f, soB.method_7c6f602c_FWm());
    }

    public bSp method_b3052e08_Dne(Qnq qnq, int n, int n2, int n3, int n4, float f, int n5) {
        if (n4 != 0 && n4 != this.field_21260d_FWm) {
            bSp bSp2 = zKP.field_8374b848_Dne[n4].method_8c85fe2_Dne(qnq, n, n2, n3);
            if (bSp2 == null) {
                return null;
            }
            if (rrP.field_4039e0a_FWm[n5] < 0) {
                bSp2.field_2092a9_Dne -= (double)((float)rrP.field_4039e0a_FWm[n5] * f);
            } else {
                bSp2.field_267cf0_Qnq -= (double)((float)rrP.field_4039e0a_FWm[n5] * f);
            }
            if (rrP.field_59d86bc_bzF[n5] < 0) {
                bSp2.field_212608_FWm -= (double)((float)rrP.field_59d86bc_bzF[n5] * f);
            } else {
                bSp2.field_2d29ef_aFZ -= (double)((float)rrP.field_59d86bc_bzF[n5] * f);
            }
            if (rrP.field_4a92422_Qnq[n5] < 0) {
                bSp2.field_2e5f16_bzF -= (double)((float)rrP.field_4a92422_Qnq[n5] * f);
            } else {
                bSp2.field_388da1_zGp -= (double)((float)rrP.field_4a92422_Qnq[n5] * f);
            }
            return bSp2;
        }
        return null;
    }

    @Override
    public int method_7a46288d_Dne() {
        return -1;
    }

    @Override
    public void method_86296256_Dne(Qnq qnq, int n, int n2, int n3, int n4, float f, int n5) {
        SoB soB;
        if (!qnq.field_2d2a05_aFZ && (soB = this.method_d39ae11a_Dne(qnq, n, n2, n3)) != null) {
            zKP.field_8374b848_Dne[soB.method_7a46288d_Dne()].method_fd7de26f_FWm(qnq, n, n2, n3, soB.method_d44b4585_zGp(), 0);
        }
    }

    @Override
    public void method_3e226590_Dne(Qnq qnq, int n, int n2, int n3, int n4, int n5) {
        ipD ipD2 = qnq.method_d98e681d_Dne(n, n2, n3);
        if (ipD2 instanceof SoB) {
            ((SoB)ipD2).method_7c6f6039_FWm();
        } else {
            super.method_3e226590_Dne(qnq, n, n2, n3, n4, n5);
        }
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        this.field_5e5f2002_Qnq = rbp.method_285881e4_Dne("piston_top");
    }

    @Override
    public ipD method_c35d5be7_Dne(Qnq qnq) {
        return null;
    }

    @Override
    public int method_24763341_Dne(int n, Random random, int n2) {
        return 0;
    }

    @Override
    public void method_9cb39130_Dne(Qnq qnq, int n, int n2, int n3) {
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return false;
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return false;
    }

    @Override
    public boolean method_f9bf07d7_Dne(Qnq qnq, int n, int n2, int n3, int n4) {
        return false;
    }
}

