package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class wdG {
    private int field_21260d_FWm;
    private final whE[] field_8373c6b3_Dne;
    private int field_2092ae_Dne;

    public int method_7a46288d_Dne() {
        return this.field_21260d_FWm;
    }

    public void method_7a46289a_Dne() {
        ++this.field_2092ae_Dne;
    }

    public wdG(whE[] whEArray) {
        this.field_8373c6b3_Dne = whEArray;
        this.field_21260d_FWm = whEArray.length;
    }

    public boolean method_c3898591_Dne(wdG wdG2) {
        if (wdG2 == null) {
            return false;
        }
        if (wdG2.field_8373c6b3_Dne.length != this.field_8373c6b3_Dne.length) {
            return false;
        }
        for (int i = 0; i < this.field_8373c6b3_Dne.length; ++i) {
            if (this.field_8373c6b3_Dne[i].field_2092ae_Dne == wdG2.field_8373c6b3_Dne[i].field_2092ae_Dne && this.field_8373c6b3_Dne[i].field_21260d_FWm == wdG2.field_8373c6b3_Dne[i].field_21260d_FWm && this.field_8373c6b3_Dne[i].field_2e5f1b_bzF == wdG2.field_8373c6b3_Dne[i].field_2e5f1b_bzF) continue;
            return false;
        }
        return true;
    }

    public boolean method_a1a425c2_Dne(chN chN2) {
        whE whE2 = this.method_231707b7_Dne();
        return whE2 == null ? false : whE2.field_2092ae_Dne == (int)chN2.field_2092a9_Dne && whE2.field_2e5f1b_bzF == (int)chN2.field_2e5f16_bzF;
    }

    public chN method_c5f1b2b_Dne(sMa sMa2, int n) {
        double d = (double)this.field_8373c6b3_Dne[n].field_2092ae_Dne + (double)((int)(sMa2.field_342261_ooe + 1.0f)) * 0.5;
        double d2 = this.field_8373c6b3_Dne[n].field_21260d_FWm;
        double d3 = (double)this.field_8373c6b3_Dne[n].field_2e5f1b_bzF + (double)((int)(sMa2.field_342261_ooe + 1.0f)) * 0.5;
        return sMa2.field_36c4f18_Dne.method_23186a47_Dne().method_e4505d6c_Dne(d, d2, d3);
    }

    public void method_ce7f5da9_Dne(int n) {
        this.field_21260d_FWm = n;
    }

    public void method_117d19ea_FWm(int n) {
        this.field_2092ae_Dne = n;
    }

    public whE method_9e811d46_Dne(int n) {
        return this.field_8373c6b3_Dne[n];
    }

    public whE method_231707b7_Dne() {
        return this.field_21260d_FWm > 0 ? this.field_8373c6b3_Dne[this.field_21260d_FWm - 1] : null;
    }

    public int method_7c6f602c_FWm() {
        return this.field_2092ae_Dne;
    }

    public boolean method_7a46289e_Dne() {
        return this.field_2092ae_Dne >= this.field_21260d_FWm;
    }

    public chN method_9a366de8_Dne(sMa sMa2) {
        return this.method_c5f1b2b_Dne(sMa2, this.field_2092ae_Dne);
    }
}

