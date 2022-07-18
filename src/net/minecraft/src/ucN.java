package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class ucN
extends dEr {
    private gDn field_202f7d1a_FWm;

    public gDn method_230f3f9a_Dne() {
        return this.field_202f7d1a_FWm;
    }

    public ucN(int n) {
        super(n);
        this.method_77cbb00a_FWm(64);
        this.method_9e77fc49_Dne(1);
        this.method_829e7ad2_Dne(JcN.field_1411c921_div);
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        super.method_845caac7_Dne(rbp);
        this.field_202f7d1a_FWm = rbp.method_285881e4_Dne("fishingRod_empty");
    }

    @Override
    public NMq method_d4201764_Dne(NMq nMq, Qnq qnq, FiG fiG) {
        if (fiG.field_3741200_Dne != null) {
            int n = fiG.field_3741200_Dne.method_7a46288d_Dne();
            nMq.method_60f1bf3f_Dne(n, fiG);
            fiG.method_ae128dc7_bzF();
        } else {
            qnq.method_a36f5f6a_Dne(fiG, "random.bow", 0.5f, 0.4f / (field_7331eae7_Dne.nextFloat() * 0.4f + 0.8f));
            if (!qnq.field_2d2a05_aFZ) {
                qnq.method_94d18be5_FWm(new cQz(qnq, fiG));
            }
            fiG.method_ae128dc7_bzF();
        }
        return nMq;
    }

    @Override
    public boolean method_ae128dcb_bzF() {
        return true;
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return true;
    }
}

