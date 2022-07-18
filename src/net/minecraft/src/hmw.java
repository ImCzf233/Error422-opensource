package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
final class hmw
extends tip {
    private final tip field_37c2531_Dne = new tip();

    hmw() {
    }

    @Override
    public NMq method_a003e203_FWm(cwq_0 cwq_02, NMq nMq) {
        dEr dEr2;
        HQH hQH = CVd.method_9e6b69db_Dne(cwq_02.method_907a9d14_Qnq());
        Qnq qnq = cwq_02.method_2305dd77_Dne();
        int n = cwq_02.method_7a46288d_Dne() + hQH.method_7a46288d_Dne();
        int n2 = cwq_02.method_7c6f602c_FWm() + hQH.method_7c6f602c_FWm();
        int n3 = cwq_02.method_ae128dba_bzF() + hQH.method_ae128dba_bzF();
        KFd kFd = qnq.method_d9802b31_Dne(n, n2, n3);
        int n4 = qnq.method_2dee76f_bzF(n, n2, n3);
        if (KFd.field_1411d34d_div.equals(kFd) && n4 == 0) {
            dEr2 = dEr.field_dface822_cHy;
        } else {
            if (!KFd.field_5b96677_IjH.equals(kFd) || n4 != 0) {
                return super.method_a003e203_FWm(cwq_02, nMq);
            }
            dEr2 = dEr.field_6a28e7c8_xXN;
        }
        qnq.method_2e7161e6_Qnq(n, n2, n3);
        if (--nMq.field_2092ae_Dne == 0) {
            nMq.field_2e5f1b_bzF = dEr2.field_267cf5_Qnq;
            nMq.field_2092ae_Dne = 1;
        } else if (((UTs)cwq_02.method_2310c86e_Dne()).method_7c61cf08_Dne(new NMq(dEr2)) < 0) {
            this.field_37c2531_Dne.method_267feca4_Dne(cwq_02, new NMq(dEr2));
        }
        return nMq;
    }
}

