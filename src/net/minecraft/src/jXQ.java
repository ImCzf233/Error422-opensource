package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class jXQ
implements TaY {
    private long field_2092af_Dne;
    final jwh_0 field_3694131_Dne;

    @Override
    public void method_a9a920ab_Qnq(String string) {
    }

    @Override
    public void method_ce7f5da9_Dne(int n) {
        if (System.currentTimeMillis() - this.field_2092af_Dne >= 1000L) {
            this.field_2092af_Dne = System.currentTimeMillis();
            this.field_3694131_Dne.method_230e0120_Dne().method_8f501fe4_Dne("Converting... " + n + "%");
        }
    }

    @Override
    public void method_110c4dc3_FWm(String string) {
    }

    @Override
    public void method_5acf91a_d_() {
    }

    public jXQ(jwh_0 jwh_02) {
        this.field_3694131_Dne = jwh_02;
        this.field_2092af_Dne = System.currentTimeMillis();
    }

    @Override
    public void method_8f501fe4_Dne(String string) {
    }
}

