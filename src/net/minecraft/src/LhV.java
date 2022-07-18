package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

final class LhV
extends tip {
    LhV() {
    }

    @Override
    protected NMq method_a003e203_FWm(cwq_0 cwq_02, NMq nMq) {
        HQH hQH = CVd.method_9e6b69db_Dne(cwq_02.method_907a9d14_Qnq());
        int n = cwq_02.method_7a46288d_Dne() + hQH.method_7a46288d_Dne();
        int n2 = cwq_02.method_7c6f602c_FWm() + hQH.method_7c6f602c_FWm();
        int n3 = cwq_02.method_ae128dba_bzF() + hQH.method_ae128dba_bzF();
        bSp bSp2 = bSp.method_23186cf1_Dne().method_b4ea3e0c_Dne(n, n2, n3, n + 1, n2 + 1, n3 + 1);
        List list = cwq_02.method_2305dd77_Dne().method_e7d4af05_Dne(FUH.class, bSp2, new DlZ(nMq));
        if (list.size() > 0) {
            FUH fUH = (FUH)list.get(0);
            int n4 = fUH instanceof FiG ? 1 : 0;
            int n5 = FUH.method_7c61cf08_Dne(nMq);
            NMq nMq2 = nMq.method_23040479_Dne();
            nMq2.field_2092ae_Dne = 1;
            fUH.method_19b4c3a3_a_(n5 - n4, nMq2);
            fUH.method_16cbf37_Dne(n5, 2.0f);
            --nMq.field_2092ae_Dne;
            return nMq;
        }
        return super.method_a003e203_FWm(cwq_02, nMq);
    }
}

