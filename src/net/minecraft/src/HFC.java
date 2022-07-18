package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class HFC
extends ipD {
    private int field_2092ae_Dne = 0;

    @Override
    public void method_66a36cd8_FWm(WkD wkD) {
        super.method_66a36cd8_FWm(wkD);
        wkD.method_5ab44f9f_Dne("OutputSignal", this.field_2092ae_Dne);
    }

    @Override
    public void method_8d4fb917_Dne(WkD wkD) {
        super.method_8d4fb917_Dne(wkD);
        this.field_2092ae_Dne = wkD.method_8f501fd7_Dne("OutputSignal");
    }

    public int method_7a46288d_Dne() {
        return this.field_2092ae_Dne;
    }

    public void method_ce7f5da9_Dne(int n) {
        this.field_2092ae_Dne = n;
    }
}

