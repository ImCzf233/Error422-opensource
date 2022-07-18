package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class khY
extends dEr {
    @Override
    public NMq method_d4201764_Dne(NMq nMq, Qnq qnq, FiG fiG) {
        fiG.method_fd8868e_Dne(nMq, this.method_e4cfb2b_a_(nMq));
        return nMq;
    }

    @Override
    public int method_e4cfb2b_a_(NMq nMq) {
        return 32;
    }

    @Override
    public een method_c9acc3b8_Dne(NMq nMq) {
        return een.field_75bd124b_bzF;
    }

    public khY(int n) {
        super(n);
        this.method_9e77fc49_Dne(1);
        this.method_829e7ad2_Dne(JcN.field_712c773d_aFZ);
    }

    @Override
    public NMq method_89e9a565_FWm(NMq nMq, Qnq qnq, FiG fiG) {
        if (!fiG.field_37cb681_Dne.field_267d06_Qnq) {
            --nMq.field_2092ae_Dne;
        }
        if (!qnq.field_2d2a05_aFZ) {
            fiG.method_b6f3e19e_haP();
        }
        return nMq.field_2092ae_Dne <= 0 ? new NMq(dEr.field_5ac2e6dc_qMV) : nMq;
    }
}

