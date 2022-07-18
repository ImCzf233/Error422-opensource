package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class oPB {
    private String[][] field_3f4f9fe5_Dne = new String[][]{{"XXX", " # ", " # "}, {"X", "#", "#"}, {"XX", "X#", " #"}, {"XX", " #", " #"}};
    private Object[][] field_4c8cc277_Dne = new Object[][]{{zKP.field_5e67d9b4_Qnq, zKP.field_75c638da_bzF, dEr.field_5c4c1af_IjH, dEr.field_141d2e85_div, dEr.field_74feeb39_mrb}, {dEr.field_af0500d6_udO, dEr.field_35d3b944_ATE, dEr.field_202e243a_FWm, dEr.field_d4d9ce3_FfS, dEr.field_7f77226_tgc}, {dEr.field_a22489c3_kGO, dEr.field_1f09491f_qLR, dEr.field_374585b_Dne, dEr.field_75807348_EyB, dEr.field_775c974_gnI}, {dEr.field_ab2d1d11_ooe, dEr.field_71a36e2a_Vxn, dEr.field_75bc2648_bzF, dEr.field_395b4402_OdI, dEr.field_cb509a2e_qXo}, {dEr.field_9542c231_Wwe, dEr.field_fdee2e72_eJi, dEr.field_7a2145f0_One, dEr.field_5fcb5990_ZgS, dEr.field_73b5a423_eHV}};

    public void method_9d6a428a_Dne(aXt aXt2) {
        for (int i = 0; i < this.field_4c8cc277_Dne[0].length; ++i) {
            Object object = this.field_4c8cc277_Dne[0][i];
            for (int j = 0; j < this.field_4c8cc277_Dne.length - 1; ++j) {
                dEr dEr2 = (dEr)this.field_4c8cc277_Dne[j + 1][i];
                aXt2.method_9664596c_Dne(new NMq(dEr2), this.field_3f4f9fe5_Dne[j], Character.valueOf('#'), dEr.field_d2b52a0a_oIf, Character.valueOf('X'), object);
            }
        }
        aXt2.method_9664596c_Dne(new NMq(dEr.field_37078f6_Dne), " #", "# ", Character.valueOf('#'), dEr.field_5c4c1af_IjH);
    }
}

