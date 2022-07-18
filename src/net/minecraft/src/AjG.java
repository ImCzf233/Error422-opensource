package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class AjG
extends ipD {
    public int field_2092ae_Dne = -1;
    private boolean field_2092bf_Dne = true;
    public String[] field_f5e54dca_Dne = new String[]{"", "", "", ""};

    @Override
    public NER method_2303e2b0_Dne() {
        String[] stringArray = new String[4];
        System.arraycopy(this.field_f5e54dca_Dne, 0, stringArray, 0, 4);
        return new eFM(this.field_267cf5_Qnq, this.field_2d29f4_aFZ, this.field_388da6_zGp, stringArray);
    }

    @Override
    public void method_8d4fb917_Dne(WkD wkD) {
        this.field_2092bf_Dne = false;
        super.method_8d4fb917_Dne(wkD);
        for (int i = 0; i < 4; ++i) {
            this.field_f5e54dca_Dne[i] = wkD.method_39193c_Dne("Text" + (i + 1));
            if (this.field_f5e54dca_Dne[i].length() <= 15) continue;
            this.field_f5e54dca_Dne[i] = this.field_f5e54dca_Dne[i].substring(0, 15);
        }
    }

    public void method_ce7f9d7a_Dne(boolean bl) {
        this.field_2092bf_Dne = bl;
    }

    @Override
    public void method_66a36cd8_FWm(WkD wkD) {
        super.method_66a36cd8_FWm(wkD);
        wkD.method_abaa98ae_Dne("Text1", this.field_f5e54dca_Dne[0]);
        wkD.method_abaa98ae_Dne("Text2", this.field_f5e54dca_Dne[1]);
        wkD.method_abaa98ae_Dne("Text3", this.field_f5e54dca_Dne[2]);
        wkD.method_abaa98ae_Dne("Text4", this.field_f5e54dca_Dne[3]);
    }

    public boolean method_7a46289e_Dne() {
        return this.field_2092bf_Dne;
    }
}

