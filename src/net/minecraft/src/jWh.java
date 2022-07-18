package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class jWh {
    private Object[][] field_4c8cc277_Dne;
    private String[][] field_3f4f9fe5_Dne = new String[][]{{"XXX", "X X"}, {"X X", "XXX", "XXX"}, {"XXX", "X X", "X X"}, {"X X", "X X"}};

    public jWh() {
        this.field_4c8cc277_Dne = new Object[][]{{dEr.field_443297f2_LoG, zKP.field_3774324_Dne, dEr.field_5c4c1af_IjH, dEr.field_141d2e85_div, dEr.field_74feeb39_mrb}, {dEr.field_36c51e1_Dne, dEr.field_712fd627_aFZ, dEr.field_5bcbb35_IjH, dEr.field_a21c8349_kGO, dEr.field_1f0142a5_qLR}, {dEr.field_20261dc0_FWm, dEr.field_f09e10d9_zGp, dEr.field_74f6e4bf_mrb, dEr.field_aefcfa5c_udO, dEr.field_35cbb2ca_ATE}, {dEr.field_75b41fce_bzF, dEr.field_161f7b0a_DyG, dEr.field_1c2de020_XHL, dEr.field_ab251697_ooe, dEr.field_719b67b0_Vxn}, {dEr.field_5e55c0a8_Qnq, dEr.field_1415280b_div, dEr.field_61660609_Zpi, dEr.field_32866d87_trS, dEr.field_84fd97b9_ceE}};
    }

    public void method_9d6a428a_Dne(aXt aXt2) {
        for (int i = 0; i < this.field_4c8cc277_Dne[0].length; ++i) {
            Object object = this.field_4c8cc277_Dne[0][i];
            for (int j = 0; j < this.field_4c8cc277_Dne.length - 1; ++j) {
                dEr dEr2 = (dEr)this.field_4c8cc277_Dne[j + 1][i];
                aXt2.method_9664596c_Dne(new NMq(dEr2), this.field_3f4f9fe5_Dne[j], Character.valueOf('X'), object);
            }
        }
    }
}

