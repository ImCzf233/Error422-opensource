package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class xTk
extends Gor {
    public rxL[] field_8371bdc1_Dne = new rxL[7];

    @Override
    public void method_3a102820_Dne(sMa sMa2, float f, float f2, float f3, float f4, float f5, float f6) {
        this.field_8371bdc1_Dne[5].field_267cf2_Qnq = 4.0f - f3;
        for (int i = 0; i < 6; ++i) {
            this.field_8371bdc1_Dne[i].method_ce7f5266_Dne(f6);
        }
    }

    public xTk() {
        this.field_8371bdc1_Dne[0] = new rxL(this, 0, 10);
        this.field_8371bdc1_Dne[1] = new rxL(this, 0, 0);
        this.field_8371bdc1_Dne[2] = new rxL(this, 0, 0);
        this.field_8371bdc1_Dne[3] = new rxL(this, 0, 0);
        this.field_8371bdc1_Dne[4] = new rxL(this, 0, 0);
        this.field_8371bdc1_Dne[5] = new rxL(this, 44, 10);
        int n = 20;
        int n2 = 8;
        int n3 = 16;
        int n4 = 4;
        this.field_8371bdc1_Dne[0].method_7ccc8363_Dne(-n / 2, -n3 / 2, -1.0f, n, n3, 2, 0.0f);
        this.field_8371bdc1_Dne[0].method_2c0148e6_Dne(0.0f, n4, 0.0f);
        this.field_8371bdc1_Dne[5].method_7ccc8363_Dne(-n / 2 + 1, -n3 / 2 + 1, -1.0f, n - 2, n3 - 2, 1, 0.0f);
        this.field_8371bdc1_Dne[5].method_2c0148e6_Dne(0.0f, n4, 0.0f);
        this.field_8371bdc1_Dne[1].method_7ccc8363_Dne(-n / 2 + 2, -n2 - 1, -1.0f, n - 4, n2, 2, 0.0f);
        this.field_8371bdc1_Dne[1].method_2c0148e6_Dne(-n / 2 + 1, n4, 0.0f);
        this.field_8371bdc1_Dne[2].method_7ccc8363_Dne(-n / 2 + 2, -n2 - 1, -1.0f, n - 4, n2, 2, 0.0f);
        this.field_8371bdc1_Dne[2].method_2c0148e6_Dne(n / 2 - 1, n4, 0.0f);
        this.field_8371bdc1_Dne[3].method_7ccc8363_Dne(-n / 2 + 2, -n2 - 1, -1.0f, n - 4, n2, 2, 0.0f);
        this.field_8371bdc1_Dne[3].method_2c0148e6_Dne(0.0f, n4, -n3 / 2 + 1);
        this.field_8371bdc1_Dne[4].method_7ccc8363_Dne(-n / 2 + 2, -n2 - 1, -1.0f, n - 4, n2, 2, 0.0f);
        this.field_8371bdc1_Dne[4].method_2c0148e6_Dne(0.0f, n4, n3 / 2 - 1);
        this.field_8371bdc1_Dne[0].field_388da3_zGp = 1.5707964f;
        this.field_8371bdc1_Dne[1].field_20b854_DyG = 4.712389f;
        this.field_8371bdc1_Dne[2].field_20b854_DyG = 1.5707964f;
        this.field_8371bdc1_Dne[3].field_20b854_DyG = (float)Math.PI;
        this.field_8371bdc1_Dne[5].field_388da3_zGp = -1.5707964f;
    }
}

