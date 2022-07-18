package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
final class yas
extends tip {
    private boolean field_2092bf_Dne = true;

    yas() {
    }

    @Override
    protected void method_6bec5b6a_Dne(cwq_0 cwq_02) {
        if (this.field_2092bf_Dne) {
            cwq_02.method_2305dd77_Dne().method_57aed1c2_Qnq(1000, cwq_02.method_7a46288d_Dne(), cwq_02.method_7c6f602c_FWm(), cwq_02.method_ae128dba_bzF(), 0);
        } else {
            cwq_02.method_2305dd77_Dne().method_57aed1c2_Qnq(1001, cwq_02.method_7a46288d_Dne(), cwq_02.method_7c6f602c_FWm(), cwq_02.method_ae128dba_bzF(), 0);
        }
    }

    @Override
    protected NMq method_a003e203_FWm(cwq_0 cwq_02, NMq nMq) {
        int n;
        int n2;
        int n3;
        HQH hQH = CVd.method_9e6b69db_Dne(cwq_02.method_907a9d14_Qnq());
        Qnq qnq = cwq_02.method_2305dd77_Dne();
        if (qnq.method_2c2cf7cd_Dne(n3 = cwq_02.method_7a46288d_Dne() + hQH.method_7a46288d_Dne(), n2 = cwq_02.method_7c6f602c_FWm() + hQH.method_7c6f602c_FWm(), n = cwq_02.method_ae128dba_bzF() + hQH.method_ae128dba_bzF())) {
            qnq.method_2ee8c47d_FWm(n3, n2, n, zKP.field_3774324_Dne.field_21260d_FWm);
            if (nMq.method_3afb8a59_Dne(1, qnq.field_7331eae7_Dne)) {
                nMq.field_2092ae_Dne = 0;
            }
        } else if (qnq.method_2c2cf7bc_Dne(n3, n2, n) == zKP.field_cb5aacc0_qXo.field_21260d_FWm) {
            zKP.field_cb5aacc0_qXo.method_35fd2546_bzF(qnq, n3, n2, n, 1);
            qnq.method_2e7161e6_Qnq(n3, n2, n);
        } else {
            this.field_2092bf_Dne = false;
        }
        return nMq;
    }
}

