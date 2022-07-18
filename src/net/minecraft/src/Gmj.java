package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class Gmj {
    private Object[][] field_4c8cc277_Dne = new Object[][]{{zKP.field_dd7dd865_Fnk, new NMq(dEr.field_74feeb39_mrb, 9)}, {zKP.field_77fdc06_gnI, new NMq(dEr.field_5c4c1af_IjH, 9)}, {zKP.field_73bfb6b5_eHV, new NMq(dEr.field_141d2e85_div, 9)}, {zKP.field_9a0e0146_Jjb, new NMq(dEr.field_86ecf659_Kvh, 9)}, {zKP.field_35ddcbd6_ATE, new NMq(dEr.field_5d50330c_edi, 9, 4)}, {zKP.field_e3f3fe2a_mte, new NMq(dEr.field_59c23676_exS, 9)}};

    public void method_9d6a428a_Dne(aXt aXt2) {
        for (int i = 0; i < this.field_4c8cc277_Dne.length; ++i) {
            zKP zKP2 = (zKP)this.field_4c8cc277_Dne[i][0];
            NMq nMq = (NMq)this.field_4c8cc277_Dne[i][1];
            aXt2.method_9664596c_Dne(new NMq(zKP2), "###", "###", "###", Character.valueOf('#'), nMq);
            aXt2.method_9664596c_Dne(nMq, "#", Character.valueOf('#'), zKP2);
        }
        aXt2.method_9664596c_Dne(new NMq(dEr.field_74feeb39_mrb), "###", "###", "###", Character.valueOf('#'), dEr.field_2653f0f8_uzC);
        aXt2.method_9664596c_Dne(new NMq(dEr.field_2653f0f8_uzC, 9), "#", Character.valueOf('#'), dEr.field_74feeb39_mrb);
    }
}

