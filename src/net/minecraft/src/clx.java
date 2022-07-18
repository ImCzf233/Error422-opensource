package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
final class clx
extends tip {
    clx() {
    }

    @Override
    public NMq method_a003e203_FWm(cwq_0 cwq_02, NMq nMq) {
        HQH hQH = CVd.method_9e6b69db_Dne(cwq_02.method_907a9d14_Qnq());
        double d = cwq_02.method_7a462888_Dne() + (double)hQH.method_7a46288d_Dne();
        double d2 = (float)cwq_02.method_7c6f602c_FWm() + 0.2f;
        double d3 = cwq_02.method_ae128db5_bzF() + (double)hQH.method_ae128dba_bzF();
        sMa sMa2 = bes_0.method_7aee3b58_Dne(cwq_02.method_2305dd77_Dne(), nMq.method_907a9d14_Qnq(), d, d2, d3);
        if (sMa2 instanceof FUH && nMq.method_d44b4596_zGp()) {
            ((FUH)sMa2).method_a9a920ab_Qnq(nMq.method_d1f1ed87_FWm());
        }
        nMq.method_9e6e1a08_Dne(1);
        return nMq;
    }
}

