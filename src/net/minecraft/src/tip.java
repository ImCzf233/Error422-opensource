package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class tip
implements ClS {
    protected void method_6bec5b6a_Dne(cwq_0 cwq_02) {
        cwq_02.method_2305dd77_Dne().method_57aed1c2_Qnq(1000, cwq_02.method_7a46288d_Dne(), cwq_02.method_7c6f602c_FWm(), cwq_02.method_ae128dba_bzF(), 0);
    }

    public static void method_40497a5a_Dne(Qnq qnq, NMq nMq, int n, HQH hQH, loO loO2) {
        double d = loO2.method_7a462888_Dne();
        double d2 = loO2.method_7c6f6027_FWm();
        double d3 = loO2.method_ae128db5_bzF();
        JiM jiM = new JiM(qnq, d, d2 - 0.3, d3, nMq);
        double d4 = qnq.field_7331eae7_Dne.nextDouble() * 0.1 + 0.2;
        jiM.field_291868_XHL = (double)hQH.method_7a46288d_Dne() * d4;
        jiM.field_2a9ad1_Zpi = 0.2f;
        jiM.field_31b811_kGO = (double)hQH.method_ae128dba_bzF() * d4;
        jiM.field_291868_XHL += qnq.field_7331eae7_Dne.nextGaussian() * (double)0.0075f * (double)n;
        jiM.field_2a9ad1_Zpi += qnq.field_7331eae7_Dne.nextGaussian() * (double)0.0075f * (double)n;
        jiM.field_31b811_kGO += qnq.field_7331eae7_Dne.nextGaussian() * (double)0.0075f * (double)n;
        qnq.method_94d18be5_FWm(jiM);
    }

    protected NMq method_a003e203_FWm(cwq_0 cwq_02, NMq nMq) {
        HQH hQH = CVd.method_9e6b69db_Dne(cwq_02.method_907a9d14_Qnq());
        loO loO2 = CVd.method_9dc26def_Dne(cwq_02);
        NMq nMq2 = nMq.method_9e6e1a08_Dne(1);
        tip.method_40497a5a_Dne(cwq_02.method_2305dd77_Dne(), nMq2, 6, hQH, loO2);
        return nMq;
    }

    protected void method_4da38558_Dne(cwq_0 cwq_02, HQH hQH) {
        cwq_02.method_2305dd77_Dne().method_57aed1c2_Qnq(2000, cwq_02.method_7a46288d_Dne(), cwq_02.method_7c6f602c_FWm(), cwq_02.method_ae128dba_bzF(), this.method_724a761b_Dne(hQH));
    }

    @Override
    public final NMq method_267feca4_Dne(cwq_0 cwq_02, NMq nMq) {
        NMq nMq2 = this.method_a003e203_FWm(cwq_02, nMq);
        this.method_6bec5b6a_Dne(cwq_02);
        this.method_4da38558_Dne(cwq_02, CVd.method_9e6b69db_Dne(cwq_02.method_907a9d14_Qnq()));
        return nMq2;
    }

    private int method_724a761b_Dne(HQH hQH) {
        return hQH.method_7a46288d_Dne() + 1 + (hQH.method_ae128dba_bzF() + 1) * 3;
    }
}

