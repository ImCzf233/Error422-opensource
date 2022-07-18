package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
final class Paw
extends tip {
    private boolean field_2092bf_Dne = true;

    Paw() {
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
        if (nMq.method_907a9d14_Qnq() == 15) {
            int n;
            int n2;
            int n3;
            HQH hQH = CVd.method_9e6b69db_Dne(cwq_02.method_907a9d14_Qnq());
            Qnq qnq = cwq_02.method_2305dd77_Dne();
            if (AvN.method_f0aa8caf_Dne(nMq, qnq, n3 = cwq_02.method_7a46288d_Dne() + hQH.method_7a46288d_Dne(), n2 = cwq_02.method_7c6f602c_FWm() + hQH.method_7c6f602c_FWm(), n = cwq_02.method_ae128dba_bzF() + hQH.method_ae128dba_bzF())) {
                if (!qnq.field_2d2a05_aFZ) {
                    qnq.method_57aed1c2_Qnq(2005, n3, n2, n, 0);
                }
            } else {
                this.field_2092bf_Dne = false;
            }
            return nMq;
        }
        return super.method_a003e203_FWm(cwq_02, nMq);
    }
}

