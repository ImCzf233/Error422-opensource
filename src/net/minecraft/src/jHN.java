package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class jHN
extends ljW {
    @Override
    public bSp method_8c85fe2_Dne(Qnq qnq, int n, int n2, int n3) {
        this.method_fbabf7ef_Dne(qnq, n, n2, n3);
        return super.method_8c85fe2_Dne(qnq, n, n2, n3);
    }

    @Override
    public String method_eecad346_Dne() {
        return hnQ.field_f5e54dca_Dne[0];
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return false;
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return false;
    }

    @Override
    public int method_24763341_Dne(int n, Random random, int n2) {
        return dEr.field_e405241a_mfU.field_267cf5_Qnq;
    }

    @Override
    public int method_9cb39123_Dne(Qnq qnq, int n, int n2, int n3) {
        return dEr.field_e405241a_mfU.field_267cf5_Qnq;
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
    }

    @Override
    public void method_86296256_Dne(Qnq qnq, int n, int n2, int n3, int n4, float f, int n5) {
    }

    @Override
    public int method_ce7f5d9c_Dne(int n) {
        return n;
    }

    @Override
    public ipD method_c35d5be7_Dne(Qnq qnq) {
        return new CUf();
    }

    @Override
    public void method_3e226590_Dne(Qnq qnq, int n, int n2, int n3, int n4, int n5) {
        if (!qnq.field_2d2a05_aFZ) {
            if ((n5 & 8) == 0) {
                NMq nMq = new NMq(dEr.field_e405241a_mfU.field_267cf5_Qnq, 1, this.method_3036b9c2_FWm(qnq, n, n2, n3));
                CUf cUf = (CUf)qnq.method_d98e681d_Dne(n, n2, n3);
                if (cUf.method_7a46288d_Dne() == 3 && cUf.method_eecad346_Dne() != null && cUf.method_eecad346_Dne().length() > 0) {
                    nMq.method_66a36cd8_FWm(new WkD());
                    nMq.method_230886fb_Dne().method_abaa98ae_Dne("SkullOwner", cUf.method_eecad346_Dne());
                }
                this.method_c594b700_FWm(qnq, n, n2, n3, nMq);
            }
            super.method_3e226590_Dne(qnq, n, n2, n3, n4, n5);
        }
    }

    @Override
    public void method_fbabf7ef_Dne(Zpi zpi, int n, int n2, int n3) {
        int n4 = zpi.method_2dee76f_bzF(n, n2, n3) & 7;
        switch (n4) {
            default: {
                this.method_eb14b51a_Dne(0.25f, 0.0f, 0.25f, 0.75f, 0.5f, 0.75f);
                break;
            }
            case 2: {
                this.method_eb14b51a_Dne(0.25f, 0.25f, 0.5f, 0.75f, 0.75f, 1.0f);
                break;
            }
            case 3: {
                this.method_eb14b51a_Dne(0.25f, 0.25f, 0.0f, 0.75f, 0.75f, 0.5f);
                break;
            }
            case 4: {
                this.method_eb14b51a_Dne(0.5f, 0.25f, 0.25f, 1.0f, 0.75f, 0.75f);
                break;
            }
            case 5: {
                this.method_eb14b51a_Dne(0.0f, 0.25f, 0.25f, 0.5f, 0.75f, 0.75f);
            }
        }
    }

    private boolean method_d6a0f318_FWm(Qnq qnq, int n, int n2, int n3, int n4) {
        if (qnq.method_2c2cf7bc_Dne(n, n2, n3) != this.field_21260d_FWm) {
            return false;
        }
        ipD ipD2 = qnq.method_d98e681d_Dne(n, n2, n3);
        return ipD2 != null && ipD2 instanceof CUf ? ((CUf)ipD2).method_7a46288d_Dne() == n4 : false;
    }

    protected jHN(int n) {
        super(n, KFd.field_1efdede7_qLR);
        this.method_eb14b51a_Dne(0.25f, 0.0f, 0.25f, 0.75f, 0.5f, 0.75f);
    }

    @Override
    public gDn method_9051f17a_Dne(int n, int n2) {
        return zKP.field_9483e5e0_Suj.method_77cd08ea_FWm(n);
    }

    @Override
    public int method_7a46288d_Dne() {
        return -1;
    }

    public void method_3bb2c15d_Dne(Qnq qnq, int n, int n2, int n3, CUf cUf) {
        if (cUf.method_7a46288d_Dne() == 1 && n2 >= 2 && qnq.field_2d29f4_aFZ > 0 && !qnq.field_2d2a05_aFZ) {
            int n4;
            int n5 = zKP.field_9483e5e0_Suj.field_21260d_FWm;
            for (n4 = -2; n4 <= 0; ++n4) {
                if (qnq.method_2c2cf7bc_Dne(n, n2 - 1, n3 + n4) != n5 || qnq.method_2c2cf7bc_Dne(n, n2 - 1, n3 + n4 + 1) != n5 || qnq.method_2c2cf7bc_Dne(n, n2 - 2, n3 + n4 + 1) != n5 || qnq.method_2c2cf7bc_Dne(n, n2 - 1, n3 + n4 + 2) != n5 || !this.method_d6a0f318_FWm(qnq, n, n2, n3 + n4, 1) || !this.method_d6a0f318_FWm(qnq, n, n2, n3 + n4 + 1, 1) || !this.method_d6a0f318_FWm(qnq, n, n2, n3 + n4 + 2, 1)) continue;
                qnq.method_d4dc89ed_Dne(n, n2, n3 + n4, 8, 2);
                qnq.method_d4dc89ed_Dne(n, n2, n3 + n4 + 1, 8, 2);
                qnq.method_d4dc89ed_Dne(n, n2, n3 + n4 + 2, 8, 2);
                qnq.method_17d7ea9d_FWm(n, n2, n3 + n4, 0, 0, 2);
                qnq.method_17d7ea9d_FWm(n, n2, n3 + n4 + 1, 0, 0, 2);
                qnq.method_17d7ea9d_FWm(n, n2, n3 + n4 + 2, 0, 0, 2);
                qnq.method_17d7ea9d_FWm(n, n2 - 1, n3 + n4, 0, 0, 2);
                qnq.method_17d7ea9d_FWm(n, n2 - 1, n3 + n4 + 1, 0, 0, 2);
                qnq.method_17d7ea9d_FWm(n, n2 - 1, n3 + n4 + 2, 0, 0, 2);
                qnq.method_17d7ea9d_FWm(n, n2 - 2, n3 + n4 + 1, 0, 0, 2);
                if (!qnq.field_2d2a05_aFZ) {
                    DhB dhB = new DhB(qnq);
                    dhB.method_9ce0fc65_FWm((double)n + 0.5, (double)n2 - 1.45, (double)(n3 + n4) + 1.5, 90.0f, 0.0f);
                    dhB.field_22c5ff_IjH = 90.0f;
                    dhB.method_907a9d21_Qnq();
                    qnq.method_94d18be5_FWm(dhB);
                }
                for (int i = 0; i < 120; ++i) {
                    qnq.method_8600ec24_Dne("snowballpoof", (double)n + qnq.field_7331eae7_Dne.nextDouble(), (double)(n2 - 2) + qnq.field_7331eae7_Dne.nextDouble() * 3.9, (double)(n3 + n4 + 1) + qnq.field_7331eae7_Dne.nextDouble(), 0.0, 0.0, 0.0);
                }
                qnq.method_5972745a_Dne(n, n2, n3 + n4, 0);
                qnq.method_5972745a_Dne(n, n2, n3 + n4 + 1, 0);
                qnq.method_5972745a_Dne(n, n2, n3 + n4 + 2, 0);
                qnq.method_5972745a_Dne(n, n2 - 1, n3 + n4, 0);
                qnq.method_5972745a_Dne(n, n2 - 1, n3 + n4 + 1, 0);
                qnq.method_5972745a_Dne(n, n2 - 1, n3 + n4 + 2, 0);
                qnq.method_5972745a_Dne(n, n2 - 2, n3 + n4 + 1, 0);
                return;
            }
            for (n4 = -2; n4 <= 0; ++n4) {
                if (qnq.method_2c2cf7bc_Dne(n + n4, n2 - 1, n3) != n5 || qnq.method_2c2cf7bc_Dne(n + n4 + 1, n2 - 1, n3) != n5 || qnq.method_2c2cf7bc_Dne(n + n4 + 1, n2 - 2, n3) != n5 || qnq.method_2c2cf7bc_Dne(n + n4 + 2, n2 - 1, n3) != n5 || !this.method_d6a0f318_FWm(qnq, n + n4, n2, n3, 1) || !this.method_d6a0f318_FWm(qnq, n + n4 + 1, n2, n3, 1) || !this.method_d6a0f318_FWm(qnq, n + n4 + 2, n2, n3, 1)) continue;
                qnq.method_d4dc89ed_Dne(n + n4, n2, n3, 8, 2);
                qnq.method_d4dc89ed_Dne(n + n4 + 1, n2, n3, 8, 2);
                qnq.method_d4dc89ed_Dne(n + n4 + 2, n2, n3, 8, 2);
                qnq.method_17d7ea9d_FWm(n + n4, n2, n3, 0, 0, 2);
                qnq.method_17d7ea9d_FWm(n + n4 + 1, n2, n3, 0, 0, 2);
                qnq.method_17d7ea9d_FWm(n + n4 + 2, n2, n3, 0, 0, 2);
                qnq.method_17d7ea9d_FWm(n + n4, n2 - 1, n3, 0, 0, 2);
                qnq.method_17d7ea9d_FWm(n + n4 + 1, n2 - 1, n3, 0, 0, 2);
                qnq.method_17d7ea9d_FWm(n + n4 + 2, n2 - 1, n3, 0, 0, 2);
                qnq.method_17d7ea9d_FWm(n + n4 + 1, n2 - 2, n3, 0, 0, 2);
                if (!qnq.field_2d2a05_aFZ) {
                    DhB dhB = new DhB(qnq);
                    dhB.method_9ce0fc65_FWm((double)(n + n4) + 1.5, (double)n2 - 1.45, (double)n3 + 0.5, 0.0f, 0.0f);
                    dhB.method_907a9d21_Qnq();
                    qnq.method_94d18be5_FWm(dhB);
                }
                for (int i = 0; i < 120; ++i) {
                    qnq.method_8600ec24_Dne("snowballpoof", (double)(n + n4 + 1) + qnq.field_7331eae7_Dne.nextDouble(), (double)(n2 - 2) + qnq.field_7331eae7_Dne.nextDouble() * 3.9, (double)n3 + qnq.field_7331eae7_Dne.nextDouble(), 0.0, 0.0, 0.0);
                }
                qnq.method_5972745a_Dne(n + n4, n2, n3, 0);
                qnq.method_5972745a_Dne(n + n4 + 1, n2, n3, 0);
                qnq.method_5972745a_Dne(n + n4 + 2, n2, n3, 0);
                qnq.method_5972745a_Dne(n + n4, n2 - 1, n3, 0);
                qnq.method_5972745a_Dne(n + n4 + 1, n2 - 1, n3, 0);
                qnq.method_5972745a_Dne(n + n4 + 2, n2 - 1, n3, 0);
                qnq.method_5972745a_Dne(n + n4 + 1, n2 - 2, n3, 0);
                return;
            }
        }
    }

    @Override
    public int method_3036b9c2_FWm(Qnq qnq, int n, int n2, int n3) {
        ipD ipD2 = qnq.method_d98e681d_Dne(n, n2, n3);
        return ipD2 != null && ipD2 instanceof CUf ? ((CUf)ipD2).method_7a46288d_Dne() : super.method_3036b9c2_FWm(qnq, n, n2, n3);
    }

    @Override
    public void method_ca7e4e57_Dne(Qnq qnq, int n, int n2, int n3, FUH fUH, NMq nMq) {
        int n4 = geR.method_117d0718_FWm((double)(fUH.field_334489_mrb * 4.0f / 360.0f) + 2.5) & 3;
        qnq.method_d4dc89ed_Dne(n, n2, n3, n4, 2);
    }

    @Override
    public void method_c5b1410a_Dne(Qnq qnq, int n, int n2, int n3, int n4, FiG fiG) {
        if (fiG.field_37cb681_Dne.field_267d06_Qnq) {
            qnq.method_d4dc89ed_Dne(n, n2, n3, n4 |= 8, 4);
        }
        super.method_c5b1410a_Dne(qnq, n, n2, n3, n4, fiG);
    }
}

