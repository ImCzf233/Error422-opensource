package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class EVc
extends Gor {
    public rxL field_37b7066_Dne;

    public EVc(int n, int n2, int n3, int n4) {
        this.field_2e5f1b_bzF = n3;
        this.field_267cf5_Qnq = n4;
        this.field_37b7066_Dne = new rxL(this, n, n2);
        this.field_37b7066_Dne.method_7ccc8363_Dne(-4.0f, -8.0f, -4.0f, 8, 8, 8, 0.0f);
        this.field_37b7066_Dne.method_2c0148e6_Dne(0.0f, 0.0f, 0.0f);
    }

    @Override
    public void method_5c531ba0_Dne(float f, float f2, float f3, float f4, float f5, float f6, sMa sMa2) {
        super.method_5c531ba0_Dne(f, f2, f3, f4, f5, f6, sMa2);
        this.field_37b7066_Dne.field_20b854_DyG = f4 / 57.295776f;
        this.field_37b7066_Dne.field_388da3_zGp = f5 / 57.295776f;
    }

    @Override
    public void method_3a102820_Dne(sMa sMa2, float f, float f2, float f3, float f4, float f5, float f6) {
        this.method_5c531ba0_Dne(f, f2, f3, f4, f5, f6, sMa2);
        this.field_37b7066_Dne.method_ce7f5266_Dne(f6);
    }

    public EVc() {
        this(0, 35, 64, 64);
    }
}

