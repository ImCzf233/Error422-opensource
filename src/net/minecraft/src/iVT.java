package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
final class iVT
extends tip {
    @Override
    public NMq method_a003e203_FWm(cwq_0 cwq_02, NMq nMq) {
        HQH hQH = CVd.method_9e6b69db_Dne(cwq_02.method_907a9d14_Qnq());
        double d = cwq_02.method_7a462888_Dne() + (double)hQH.method_7a46288d_Dne();
        double d2 = (float)cwq_02.method_7c6f602c_FWm() + 0.2f;
        double d3 = cwq_02.method_ae128db5_bzF() + (double)hQH.method_ae128dba_bzF();
        zMx zMx2 = new zMx(cwq_02.method_2305dd77_Dne(), d, d2, d3, nMq);
        cwq_02.method_2305dd77_Dne().method_94d18be5_FWm(zMx2);
        nMq.method_9e6e1a08_Dne(1);
        return nMq;
    }

    iVT() {
    }

    @Override
    protected void method_6bec5b6a_Dne(cwq_0 cwq_02) {
        cwq_02.method_2305dd77_Dne().method_57aed1c2_Qnq(1002, cwq_02.method_7a46288d_Dne(), cwq_02.method_7c6f602c_FWm(), cwq_02.method_ae128dba_bzF(), 0);
    }
}

