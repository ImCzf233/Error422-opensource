package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class Irw
extends Gor {
    rxL field_75c33e53_bzF;
    rxL field_37b7066_Dne;
    rxL field_20353c45_FWm;
    rxL field_5e64df2d_Qnq;

    public Irw(int n) {
        this.field_37b7066_Dne = new rxL(this, 0, n);
        this.field_37b7066_Dne.method_cbecd0a8_Dne(-4.0f, 16.0f, -4.0f, 8, 8, 8);
        if (n > 0) {
            this.field_37b7066_Dne = new rxL(this, 0, n);
            this.field_37b7066_Dne.method_cbecd0a8_Dne(-3.0f, 17.0f, -3.0f, 6, 6, 6);
            this.field_20353c45_FWm = new rxL(this, 32, 0);
            this.field_20353c45_FWm.method_cbecd0a8_Dne(-3.25f, 18.0f, -3.5f, 2, 2, 2);
            this.field_75c33e53_bzF = new rxL(this, 32, 4);
            this.field_75c33e53_bzF.method_cbecd0a8_Dne(1.25f, 18.0f, -3.5f, 2, 2, 2);
            this.field_5e64df2d_Qnq = new rxL(this, 32, 8);
            this.field_5e64df2d_Qnq.method_cbecd0a8_Dne(0.0f, 21.0f, -3.5f, 1, 1, 1);
        }
    }

    @Override
    public void method_3a102820_Dne(sMa sMa2, float f, float f2, float f3, float f4, float f5, float f6) {
        this.method_5c531ba0_Dne(f, f2, f3, f4, f5, f6, sMa2);
        this.field_37b7066_Dne.method_ce7f5266_Dne(f6);
        if (this.field_20353c45_FWm != null) {
            this.field_20353c45_FWm.method_ce7f5266_Dne(f6);
            this.field_75c33e53_bzF.method_ce7f5266_Dne(f6);
            this.field_5e64df2d_Qnq.method_ce7f5266_Dne(f6);
        }
    }
}

