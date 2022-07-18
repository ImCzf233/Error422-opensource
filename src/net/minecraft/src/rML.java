package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class rML
extends Gor {
    private rxL[] field_8371bdc1_Dne;
    private rxL[] field_fdf16dc2_FWm;

    @Override
    public void method_5c531ba0_Dne(float f, float f2, float f3, float f4, float f5, float f6, sMa sMa2) {
        float f7 = geR.method_117d0e97_FWm(f3 * 0.1f);
        this.field_8371bdc1_Dne[1].field_388da3_zGp = (0.065f + 0.05f * f7) * (float)Math.PI;
        this.field_8371bdc1_Dne[2].method_2c0148e6_Dne(-2.0f, 6.9f + geR.method_117d0e97_FWm(this.field_8371bdc1_Dne[1].field_388da3_zGp) * 10.0f, -0.5f + geR.method_ce7f5256_Dne(this.field_8371bdc1_Dne[1].field_388da3_zGp) * 10.0f);
        this.field_8371bdc1_Dne[2].field_388da3_zGp = (0.265f + 0.1f * f7) * (float)Math.PI;
        this.field_fdf16dc2_FWm[0].field_20b854_DyG = f4 / 57.295776f;
        this.field_fdf16dc2_FWm[0].field_388da3_zGp = f5 / 57.295776f;
    }

    public int method_7a46288d_Dne() {
        return 32;
    }

    public rML() {
        this.field_2e5f1b_bzF = 64;
        this.field_267cf5_Qnq = 64;
        this.field_8371bdc1_Dne = new rxL[3];
        this.field_8371bdc1_Dne[0] = new rxL(this, 0, 16);
        this.field_8371bdc1_Dne[0].method_cbecd0a8_Dne(-10.0f, 3.9f, -0.5f, 20, 3, 3);
        this.field_8371bdc1_Dne[1] = new rxL(this).method_e17a7504_FWm(this.field_2e5f1b_bzF, this.field_267cf5_Qnq);
        this.field_8371bdc1_Dne[1].method_2c0148e6_Dne(-2.0f, 6.9f, -0.5f);
        this.field_8371bdc1_Dne[1].method_9057b0a5_Dne(0, 22).method_cbecd0a8_Dne(0.0f, 0.0f, 0.0f, 3, 10, 3);
        this.field_8371bdc1_Dne[1].method_9057b0a5_Dne(24, 22).method_cbecd0a8_Dne(-4.0f, 1.5f, 0.5f, 11, 2, 2);
        this.field_8371bdc1_Dne[1].method_9057b0a5_Dne(24, 22).method_cbecd0a8_Dne(-4.0f, 4.0f, 0.5f, 11, 2, 2);
        this.field_8371bdc1_Dne[1].method_9057b0a5_Dne(24, 22).method_cbecd0a8_Dne(-4.0f, 6.5f, 0.5f, 11, 2, 2);
        this.field_8371bdc1_Dne[2] = new rxL(this, 12, 22);
        this.field_8371bdc1_Dne[2].method_cbecd0a8_Dne(0.0f, 0.0f, 0.0f, 3, 6, 3);
        this.field_fdf16dc2_FWm = new rxL[3];
        this.field_fdf16dc2_FWm[0] = new rxL(this, 0, 0);
        this.field_fdf16dc2_FWm[0].method_cbecd0a8_Dne(-4.0f, -4.0f, -4.0f, 8, 8, 8);
        this.field_fdf16dc2_FWm[1] = new rxL(this, 32, 0);
        this.field_fdf16dc2_FWm[1].method_cbecd0a8_Dne(-4.0f, -4.0f, -4.0f, 6, 6, 6);
        this.field_fdf16dc2_FWm[1].field_2e5f18_bzF = -8.0f;
        this.field_fdf16dc2_FWm[1].field_267cf2_Qnq = 4.0f;
        this.field_fdf16dc2_FWm[2] = new rxL(this, 32, 0);
        this.field_fdf16dc2_FWm[2].method_cbecd0a8_Dne(-4.0f, -4.0f, -4.0f, 6, 6, 6);
        this.field_fdf16dc2_FWm[2].field_2e5f18_bzF = 10.0f;
        this.field_fdf16dc2_FWm[2].field_267cf2_Qnq = 4.0f;
    }

    @Override
    public void method_3a102820_Dne(sMa sMa2, float f, float f2, float f3, float f4, float f5, float f6) {
        this.method_5c531ba0_Dne(f, f2, f3, f4, f5, f6, sMa2);
        for (rxL rxL2 : this.field_fdf16dc2_FWm) {
            rxL2.method_ce7f5266_Dne(f6);
        }
        for (rxL rxL2 : this.field_8371bdc1_Dne) {
            rxL2.method_ce7f5266_Dne(f6);
        }
    }

    @Override
    public void method_9fba3e12_Dne(FUH fUH, float f, float f2, float f3) {
        DhB dhB = (DhB)fUH;
        for (int i = 1; i < 3; ++i) {
            this.field_fdf16dc2_FWm[i].field_20b854_DyG = (dhB.method_ce7f5d99_Dne(i - 1) - fUH.field_22c5ff_IjH) / 57.295776f;
            this.field_fdf16dc2_FWm[i].field_388da3_zGp = dhB.method_117d19da_FWm(i - 1) / 57.295776f;
        }
    }
}

