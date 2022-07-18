package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class HJR
extends Gor {
    rxL field_37b7066_Dne;
    rxL[] field_8371bdc1_Dne = new rxL[8];

    @Override
    public void method_3a102820_Dne(sMa sMa2, float f, float f2, float f3, float f4, float f5, float f6) {
        this.method_5c531ba0_Dne(f, f2, f3, f4, f5, f6, sMa2);
        this.field_37b7066_Dne.method_ce7f5266_Dne(f6);
        for (int i = 0; i < this.field_8371bdc1_Dne.length; ++i) {
            this.field_8371bdc1_Dne[i].method_ce7f5266_Dne(f6);
        }
    }

    @Override
    public void method_5c531ba0_Dne(float f, float f2, float f3, float f4, float f5, float f6, sMa sMa2) {
        for (rxL rxL2 : this.field_8371bdc1_Dne) {
            rxL2.field_388da3_zGp = f3;
        }
    }

    public HJR() {
        int n = -16;
        this.field_37b7066_Dne = new rxL(this, 0, 0);
        this.field_37b7066_Dne.method_cbecd0a8_Dne(-6.0f, -8.0f, -6.0f, 12, 16, 12);
        this.field_37b7066_Dne.field_267cf2_Qnq += (float)(24 + n);
        for (int i = 0; i < this.field_8371bdc1_Dne.length; ++i) {
            this.field_8371bdc1_Dne[i] = new rxL(this, 48, 0);
            double d = (double)i * Math.PI * 2.0 / (double)this.field_8371bdc1_Dne.length;
            float f = (float)Math.cos(d) * 5.0f;
            float f2 = (float)Math.sin(d) * 5.0f;
            this.field_8371bdc1_Dne[i].method_cbecd0a8_Dne(-1.0f, 0.0f, -1.0f, 2, 18, 2);
            this.field_8371bdc1_Dne[i].field_2e5f18_bzF = f;
            this.field_8371bdc1_Dne[i].field_2d29f1_aFZ = f2;
            this.field_8371bdc1_Dne[i].field_267cf2_Qnq = 31 + n;
            d = (double)i * Math.PI * -2.0 / (double)this.field_8371bdc1_Dne.length + 1.5707963267948966;
            this.field_8371bdc1_Dne[i].field_20b854_DyG = (float)d;
        }
    }
}

