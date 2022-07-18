package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
final class OtM
extends tip {
    @Override
    protected NMq method_a003e203_FWm(cwq_0 cwq_02, NMq nMq) {
        HQH hQH = CVd.method_9e6b69db_Dne(cwq_02.method_907a9d14_Qnq());
        Qnq qnq = cwq_02.method_2305dd77_Dne();
        int n = cwq_02.method_7a46288d_Dne() + hQH.method_7a46288d_Dne();
        int n2 = cwq_02.method_7c6f602c_FWm() + hQH.method_7c6f602c_FWm();
        int n3 = cwq_02.method_ae128dba_bzF() + hQH.method_ae128dba_bzF();
        gqg gqg2 = new gqg(qnq, (float)n + 0.5f, (float)n2 + 0.5f, (float)n3 + 0.5f, null);
        qnq.method_94d18be5_FWm(gqg2);
        --nMq.field_2092ae_Dne;
        return nMq;
    }

    OtM() {
    }
}

