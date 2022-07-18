package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

final class uDI
extends tip {
    @Override
    protected void method_6bec5b6a_Dne(cwq_0 cwq_02) {
        cwq_02.method_2305dd77_Dne().method_57aed1c2_Qnq(1009, cwq_02.method_7a46288d_Dne(), cwq_02.method_7c6f602c_FWm(), cwq_02.method_ae128dba_bzF(), 0);
    }

    uDI() {
    }

    @Override
    public NMq method_a003e203_FWm(cwq_0 cwq_02, NMq nMq) {
        HQH hQH = CVd.method_9e6b69db_Dne(cwq_02.method_907a9d14_Qnq());
        loO loO2 = CVd.method_9dc26def_Dne(cwq_02);
        double d = loO2.method_7a462888_Dne() + (double)((float)hQH.method_7a46288d_Dne() * 0.3f);
        double d2 = loO2.method_7c6f6027_FWm() + (double)((float)hQH.method_7a46288d_Dne() * 0.3f);
        double d3 = loO2.method_ae128db5_bzF() + (double)((float)hQH.method_ae128dba_bzF() * 0.3f);
        Qnq qnq = cwq_02.method_2305dd77_Dne();
        Random random = qnq.field_7331eae7_Dne;
        double d4 = random.nextGaussian() * 0.05 + (double)hQH.method_7a46288d_Dne();
        double d5 = random.nextGaussian() * 0.05 + (double)hQH.method_7c6f602c_FWm();
        double d6 = random.nextGaussian() * 0.05 + (double)hQH.method_ae128dba_bzF();
        qnq.method_94d18be5_FWm(new Xzh(qnq, d, d2, d3, d4, d5, d6));
        nMq.method_9e6e1a08_Dne(1);
        return nMq;
    }
}

