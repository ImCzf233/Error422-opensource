package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public abstract class JDd
extends tip {
    @Override
    protected void method_6bec5b6a_Dne(cwq_0 cwq_02) {
        cwq_02.method_2305dd77_Dne().method_57aed1c2_Qnq(1002, cwq_02.method_7a46288d_Dne(), cwq_02.method_7c6f602c_FWm(), cwq_02.method_ae128dba_bzF(), 0);
    }

    protected abstract vaR method_a59025ec_Dne(Qnq var1, loO var2);

    protected float method_7c6f6029_FWm() {
        return 1.1f;
    }

    @Override
    public NMq method_a003e203_FWm(cwq_0 cwq_02, NMq nMq) {
        Qnq qnq = cwq_02.method_2305dd77_Dne();
        loO loO2 = CVd.method_9dc26def_Dne(cwq_02);
        HQH hQH = CVd.method_9e6b69db_Dne(cwq_02.method_907a9d14_Qnq());
        vaR vaR2 = this.method_a59025ec_Dne(qnq, loO2);
        vaR2.method_b5821797_bzF(hQH.method_7a46288d_Dne(), (float)hQH.method_7c6f602c_FWm() + 0.1f, hQH.method_ae128dba_bzF(), this.method_7c6f6029_FWm(), this.method_7a46288a_Dne());
        qnq.method_94d18be5_FWm((sMa)((Object)vaR2));
        nMq.method_9e6e1a08_Dne(1);
        return nMq;
    }

    protected float method_7a46288a_Dne() {
        return 6.0f;
    }
}

