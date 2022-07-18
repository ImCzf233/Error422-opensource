package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class RTA {
    private Object[][] field_4c8cc277_Dne;
    private String[][] field_3f4f9fe5_Dne = new String[][]{{"X", "X", "#"}};

    public void method_9d6a428a_Dne(aXt aXt2) {
        for (int i = 0; i < this.field_4c8cc277_Dne[0].length; ++i) {
            Object object = this.field_4c8cc277_Dne[0][i];
            for (int j = 0; j < this.field_4c8cc277_Dne.length - 1; ++j) {
                dEr dEr2 = (dEr)this.field_4c8cc277_Dne[j + 1][i];
                aXt2.method_9664596c_Dne(new NMq(dEr2), this.field_3f4f9fe5_Dne[j], Character.valueOf('#'), dEr.field_d2b52a0a_oIf, Character.valueOf('X'), object);
            }
        }
        aXt2.method_9664596c_Dne(new NMq(dEr.field_3667432_Dne, 1), " #X", "# X", " #X", Character.valueOf('X'), dEr.field_249ef7b6_AgF, Character.valueOf('#'), dEr.field_d2b52a0a_oIf);
        aXt2.method_9664596c_Dne(new NMq(dEr.field_f0a61753_zGp, 4), "X", "#", "Y", Character.valueOf('Y'), dEr.field_d73ac430_yMz, Character.valueOf('X'), dEr.field_cb97e05f_haP, Character.valueOf('#'), dEr.field_d2b52a0a_oIf);
    }

    public RTA() {
        this.field_4c8cc277_Dne = new Object[][]{{zKP.field_5e67d9b4_Qnq, zKP.field_75c638da_bzF, dEr.field_5c4c1af_IjH, dEr.field_141d2e85_div, dEr.field_74feeb39_mrb}, {dEr.field_616e0c83_Zpi, dEr.field_328e7401_trS, dEr.field_1c35e69a_XHL, dEr.field_85059e33_ceE, dEr.field_dd73c5d3_Fnk}};
    }
}

