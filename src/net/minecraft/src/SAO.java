package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class SAO
extends Gor {
    rxL[] field_8371bdc1_Dne = new rxL[8];
    rxL field_37b7066_Dne;

    @Override
    public void method_3a102820_Dne(sMa sMa2, float f, float f2, float f3, float f4, float f5, float f6) {
        this.method_5c531ba0_Dne(f, f2, f3, f4, f5, f6, sMa2);
        this.field_37b7066_Dne.method_ce7f5266_Dne(f6);
        for (int i = 0; i < this.field_8371bdc1_Dne.length; ++i) {
            this.field_8371bdc1_Dne[i].method_ce7f5266_Dne(f6);
        }
    }

    public int method_7a46288d_Dne() {
        return 5;
    }

    public SAO() {
        for (int i = 0; i < this.field_8371bdc1_Dne.length; ++i) {
            int n = 0;
            int n2 = i;
            if (i == 2) {
                n = 24;
                n2 = 10;
            } else if (i == 3) {
                n = 24;
                n2 = 19;
            }
            this.field_8371bdc1_Dne[i] = new rxL(this, n, n2);
            this.field_8371bdc1_Dne[i].method_cbecd0a8_Dne(-4.0f, 16 + i, -4.0f, 8, 1, 8);
        }
        this.field_37b7066_Dne = new rxL(this, 0, 16);
        this.field_37b7066_Dne.method_cbecd0a8_Dne(-2.0f, 18.0f, -2.0f, 4, 4, 4);
    }

    @Override
    public void method_9fba3e12_Dne(FUH fUH, float f, float f2, float f3) {
        WDT wDT = (WDT)fUH;
        float f4 = wDT.field_2e5f18_bzF + (wDT.field_21260a_FWm - wDT.field_2e5f18_bzF) * f3;
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        for (int i = 0; i < this.field_8371bdc1_Dne.length; ++i) {
            this.field_8371bdc1_Dne[i].field_267cf2_Qnq = (float)(-(4 - i)) * f4 * 1.7f;
        }
    }
}

