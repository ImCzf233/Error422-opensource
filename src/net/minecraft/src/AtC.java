package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class AtC
extends wJb {
    @Override
    public NMq method_d4201764_Dne(NMq nMq, Qnq qnq, FiG fiG) {
        NMq nMq2 = new NMq(dEr.field_3792594_Dne, 1, qnq.method_8f501fd7_Dne("map"));
        String string = "map_" + nMq2.method_907a9d14_Qnq();
        Ilk ilk = new Ilk(string);
        qnq.method_65052564_Dne(string, ilk);
        ilk.field_212606_FWm = 0;
        int n = 128 * (1 << ilk.field_212606_FWm);
        ilk.field_2092ae_Dne = (int)(Math.round(fiG.field_2f0dd3_div / (double)n) * (long)n);
        ilk.field_21260d_FWm = (int)(Math.round(fiG.field_334487_mrb / (double)n) * (long)n);
        ilk.field_2092a7_Dne = (byte)qnq.field_3690d00_Dne.field_2092ae_Dne;
        ilk.method_7a46289a_Dne();
        --nMq.field_2092ae_Dne;
        if (nMq.field_2092ae_Dne <= 0) {
            return nMq2;
        }
        if (!fiG.field_36a059b_Dne.method_7c61cf19_Dne(nMq2.method_23040479_Dne())) {
            fiG.method_c9a088b8_Dne(nMq2);
        }
        return nMq;
    }

    protected AtC(int n) {
        super(n);
        this.method_829e7ad2_Dne(JcN.field_712c773d_aFZ);
    }
}

