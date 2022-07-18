package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class MZH
extends CVd {
    private final ClS field_365e6c2_Dne = new tip();

    @Override
    protected ClS method_c99d661c_Dne(NMq nMq) {
        return this.field_365e6c2_Dne;
    }

    protected MZH(int n) {
        super(n);
    }

    @Override
    protected void method_5452795d_bzF(Qnq qnq, int n, int n2, int n3) {
        XSK xSK = new XSK(qnq, n, n2, n3);
        UTs uTs = (UTs)xSK.method_2310c86e_Dne();
        if (uTs != null) {
            int n4 = uTs.method_7a46288d_Dne();
            if (n4 < 0) {
                qnq.method_57aed1c2_Qnq(1001, n, n2, n3, 0);
            } else {
                NMq nMq;
                NMq nMq2 = uTs.method_9e6e1a08_Dne(n4);
                int n5 = qnq.method_2dee76f_bzF(n, n2, n3) & 7;
                MqS mqS = Aem.method_13840d8d_Dne(qnq, n + rrP.field_4039e0a_FWm[n5], n2 + rrP.field_59d86bc_bzF[n5], n3 + rrP.field_4a92422_Qnq[n5]);
                if (mqS != null) {
                    nMq = Aem.method_46ffc3cb_Dne(mqS, nMq2.method_23040479_Dne().method_9e6e1a08_Dne(1), rrP.field_3f1c589_Dne[n5]);
                    if (nMq == null) {
                        nMq = nMq2.method_23040479_Dne();
                        if (--nMq.field_2092ae_Dne == 0) {
                            nMq = null;
                        }
                    } else {
                        nMq = nMq2.method_23040479_Dne();
                    }
                } else {
                    nMq = this.field_365e6c2_Dne.method_267feca4_Dne(xSK, nMq2);
                    if (nMq != null && nMq.field_2092ae_Dne == 0) {
                        nMq = null;
                    }
                }
                uTs.method_6e3a6b66_Dne(n4, nMq);
            }
        }
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        this.field_5e5f2002_Qnq = rbp.method_285881e4_Dne("furnace_side");
        this.field_375b13b_Dne = rbp.method_285881e4_Dne("furnace_top");
        this.field_202f7d1a_FWm = rbp.method_285881e4_Dne("dropper_front");
        this.field_75bd7f28_bzF = rbp.method_285881e4_Dne("dropper_front_vertical");
    }

    @Override
    public ipD method_c35d5be7_Dne(Qnq qnq) {
        return new BDA();
    }
}

