package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class WuW
extends Gor {
    private rxL[] field_8371bdc1_Dne = new rxL[12];
    private rxL field_37b7066_Dne;

    @Override
    public void method_5c531ba0_Dne(float f, float f2, float f3, float f4, float f5, float f6, sMa sMa2) {
        int n;
        float f7 = f3 * (float)Math.PI * -0.1f;
        for (n = 0; n < 4; ++n) {
            this.field_8371bdc1_Dne[n].field_267cf2_Qnq = -2.0f + geR.method_117d0e97_FWm(((float)(n * 2) + f3) * 0.25f);
            this.field_8371bdc1_Dne[n].field_2e5f18_bzF = geR.method_117d0e97_FWm(f7) * 9.0f;
            this.field_8371bdc1_Dne[n].field_2d29f1_aFZ = geR.method_ce7f5256_Dne(f7) * 9.0f;
            f7 += 1.0f;
        }
        f7 = 0.7853982f + f3 * (float)Math.PI * 0.03f;
        for (n = 4; n < 8; ++n) {
            this.field_8371bdc1_Dne[n].field_267cf2_Qnq = 2.0f + geR.method_117d0e97_FWm(((float)(n * 2) + f3) * 0.25f);
            this.field_8371bdc1_Dne[n].field_2e5f18_bzF = geR.method_117d0e97_FWm(f7) * 7.0f;
            this.field_8371bdc1_Dne[n].field_2d29f1_aFZ = geR.method_ce7f5256_Dne(f7) * 7.0f;
            f7 += 1.0f;
        }
        f7 = 0.47123894f + f3 * (float)Math.PI * -0.05f;
        for (n = 8; n < 12; ++n) {
            this.field_8371bdc1_Dne[n].field_267cf2_Qnq = 11.0f + geR.method_117d0e97_FWm(((float)n * 1.5f + f3) * 0.5f);
            this.field_8371bdc1_Dne[n].field_2e5f18_bzF = geR.method_117d0e97_FWm(f7) * 5.0f;
            this.field_8371bdc1_Dne[n].field_2d29f1_aFZ = geR.method_ce7f5256_Dne(f7) * 5.0f;
            f7 += 1.0f;
        }
        this.field_37b7066_Dne.field_20b854_DyG = f4 / 57.295776f;
        this.field_37b7066_Dne.field_388da3_zGp = f5 / 57.295776f;
    }

    @Override
    public void method_3a102820_Dne(sMa sMa2, float f, float f2, float f3, float f4, float f5, float f6) {
        this.method_5c531ba0_Dne(f, f2, f3, f4, f5, f6, sMa2);
        this.field_37b7066_Dne.method_ce7f5266_Dne(f6);
        for (int i = 0; i < this.field_8371bdc1_Dne.length; ++i) {
            this.field_8371bdc1_Dne[i].method_ce7f5266_Dne(f6);
        }
    }

    public WuW() {
        for (int i = 0; i < this.field_8371bdc1_Dne.length; ++i) {
            this.field_8371bdc1_Dne[i] = new rxL(this, 0, 16);
            this.field_8371bdc1_Dne[i].method_cbecd0a8_Dne(0.0f, 0.0f, 0.0f, 2, 8, 2);
        }
        this.field_37b7066_Dne = new rxL(this, 0, 0);
        this.field_37b7066_Dne.method_cbecd0a8_Dne(-4.0f, -4.0f, -4.0f, 8, 8, 8);
    }

    public int method_7a46288d_Dne() {
        return 8;
    }
}

