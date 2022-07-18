package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
final class EjW
extends tip {
    private final tip field_37c2531_Dne = new tip();

    @Override
    public NMq method_a003e203_FWm(cwq_0 cwq_02, NMq nMq) {
        double d;
        int n;
        int n2;
        HQH hQH = CVd.method_9e6b69db_Dne(cwq_02.method_907a9d14_Qnq());
        Qnq qnq = cwq_02.method_2305dd77_Dne();
        double d2 = cwq_02.method_7a462888_Dne() + (double)((float)hQH.method_7a46288d_Dne() * 1.125f);
        double d3 = cwq_02.method_7c6f6027_FWm() + (double)((float)hQH.method_7c6f602c_FWm() * 1.125f);
        double d4 = cwq_02.method_ae128db5_bzF() + (double)((float)hQH.method_ae128dba_bzF() * 1.125f);
        int n3 = cwq_02.method_7a46288d_Dne() + hQH.method_7a46288d_Dne();
        int n4 = qnq.method_2c2cf7bc_Dne(n3, n2 = cwq_02.method_7c6f602c_FWm() + hQH.method_7c6f602c_FWm(), n = cwq_02.method_ae128dba_bzF() + hQH.method_ae128dba_bzF());
        if (Oaf.method_ce7f5dad_Dne(n4)) {
            d = 0.0;
        } else {
            if (n4 != 0 || !Oaf.method_ce7f5dad_Dne(qnq.method_2c2cf7bc_Dne(n3, n2 - 1, n))) {
                return this.field_37c2531_Dne.method_267feca4_Dne(cwq_02, nMq);
            }
            d = -1.0;
        }
        Ebp ebp = Ebp.method_bde99596_Dne(qnq, d2, d3 + d, d4, ((xsl)nMq.method_230de6ba_Dne()).field_2092ae_Dne);
        qnq.method_94d18be5_FWm(ebp);
        nMq.method_9e6e1a08_Dne(1);
        return nMq;
    }

    @Override
    protected void method_6bec5b6a_Dne(cwq_0 cwq_02) {
        cwq_02.method_2305dd77_Dne().method_57aed1c2_Qnq(1000, cwq_02.method_7a46288d_Dne(), cwq_02.method_7c6f602c_FWm(), cwq_02.method_ae128dba_bzF(), 0);
    }

    EjW() {
    }
}

