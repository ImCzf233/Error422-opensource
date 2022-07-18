package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
final class eOV
extends tip {
    private final tip field_37c2531_Dne = new tip();

    eOV() {
    }

    @Override
    public NMq method_a003e203_FWm(cwq_0 cwq_02, NMq nMq) {
        ghA ghA2 = (ghA)nMq.method_230de6ba_Dne();
        int n = cwq_02.method_7a46288d_Dne();
        int n2 = cwq_02.method_7c6f602c_FWm();
        int n3 = cwq_02.method_ae128dba_bzF();
        HQH hQH = CVd.method_9e6b69db_Dne(cwq_02.method_907a9d14_Qnq());
        if (ghA2.method_6dbd7bbc_Dne(cwq_02.method_2305dd77_Dne(), n, n2, n3, n + hQH.method_7a46288d_Dne(), n2 + hQH.method_7c6f602c_FWm(), n3 + hQH.method_ae128dba_bzF())) {
            nMq.field_2e5f1b_bzF = dEr.field_5ac2e6dc_qMV.field_267cf5_Qnq;
            nMq.field_2092ae_Dne = 1;
            return nMq;
        }
        return this.field_37c2531_Dne.method_267feca4_Dne(cwq_02, nMq);
    }
}

