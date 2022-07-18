package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class TwG
extends dEr {
    @Override
    public boolean method_ae128dcb_bzF() {
        return true;
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return true;
    }

    @Override
    public NMq method_d4201764_Dne(NMq nMq, Qnq qnq, FiG fiG) {
        fNv fNv2;
        if (fiG.method_c5287a62_qLR() && fiG.field_203511c4_FWm instanceof fNv && (fNv2 = (fNv)fiG.field_203511c4_FWm).method_2317b6b2_Dne().method_907a9d25_Qnq() && nMq.method_a98a0653_aFZ() - nMq.method_907a9d14_Qnq() >= 7) {
            fNv2.method_2317b6b2_Dne().method_907a9d21_Qnq();
            nMq.method_60f1bf3f_Dne(7, fiG);
            if (nMq.field_2092ae_Dne == 0) {
                NMq nMq2 = new NMq(dEr.field_37c7eec_Dne);
                nMq2.method_66a36cd8_FWm(nMq.field_36ef89c_Dne);
                return nMq2;
            }
        }
        return nMq;
    }

    public TwG(int n) {
        super(n);
        this.method_829e7ad2_Dne(JcN.field_5e5261be_Qnq);
        this.method_9e77fc49_Dne(1);
        this.method_77cbb00a_FWm(25);
    }
}

