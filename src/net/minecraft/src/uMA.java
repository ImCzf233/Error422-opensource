package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class uMA
extends ESF {
    public uMA(int n) {
        super(n, "ice", KFd.field_d4241ab_FfS, false);
        this.field_267cf2_Qnq = 0.98f;
        this.method_21cbfe2c_Dne(true);
        this.method_82a88d64_Dne(JcN.field_368f2f7_Dne);
    }

    @Override
    public int method_7c6f602c_FWm() {
        return 0;
    }

    @Override
    public int method_cfc9daf9_Dne(Random random) {
        return 0;
    }

    @Override
    public int method_582b28a_a_() {
        return 1;
    }

    @Override
    public void method_e061540a_Dne(Qnq qnq, FiG fiG, int n, int n2, int n3, int n4) {
        fiG.method_df3461c5_Dne(trP.field_83628b9e_Dne[this.field_21260d_FWm], 1);
        fiG.method_87b72d60_aFZ(0.025f);
        if (this.method_a98a0664_aFZ() && UYp.method_6f1922f2_Dne(fiG)) {
            NMq nMq = this.method_9e6e1a08_Dne(n4);
            if (nMq != null) {
                this.method_c594b700_FWm(qnq, n, n2, n3, nMq);
            }
        } else {
            if (qnq.field_3690d00_Dne.field_2092bf_Dne) {
                qnq.method_2e7161e6_Qnq(n, n2, n3);
                return;
            }
            int n5 = UYp.method_f1eb6aba_Qnq(fiG);
            this.method_fd7de26f_FWm(qnq, n, n2, n3, n4, n5);
            KFd kFd = qnq.method_d9802b31_Dne(n, n2 - 1, n3);
            if (kFd.method_ae128dcb_bzF() || kFd.method_907a9d25_Qnq()) {
                qnq.method_2ee8c47d_FWm(n, n2, n3, zKP.field_374330f_Dne.field_21260d_FWm);
            }
        }
    }

    @Override
    public void method_ca828a1c_Dne(Qnq qnq, int n, int n2, int n3, Random random) {
        if (qnq.method_f476b68e_FWm(udO.field_20364eab_FWm, n, n2, n3) > 11 - zKP.field_4039e0a_FWm[this.field_21260d_FWm]) {
            if (qnq.field_3690d00_Dne.field_2092bf_Dne) {
                qnq.method_2e7161e6_Qnq(n, n2, n3);
                return;
            }
            this.method_fd7de26f_FWm(qnq, n, n2, n3, qnq.method_2dee76f_bzF(n, n2, n3), 0);
            qnq.method_2ee8c47d_FWm(n, n2, n3, zKP.field_16319416_DyG.field_21260d_FWm);
        }
    }

    @Override
    public boolean method_79d378f8_Dne(Zpi zpi, int n, int n2, int n3, int n4) {
        return super.method_79d378f8_Dne(zpi, n, n2, n3, 1 - n4);
    }
}

