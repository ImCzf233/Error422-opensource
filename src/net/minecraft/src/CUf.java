package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class CUf
extends ipD {
    private int field_2092ae_Dne;
    private String field_569fcf45_Dne = "";
    private int field_21260d_FWm;

    public String method_eecad346_Dne() {
        return this.field_569fcf45_Dne;
    }

    @Override
    public NER method_2303e2b0_Dne() {
        WkD wkD = new WkD();
        this.method_66a36cd8_FWm(wkD);
        return new ipQ(this.field_267cf5_Qnq, this.field_2d29f4_aFZ, this.field_388da6_zGp, 4, wkD);
    }

    public int method_7a46288d_Dne() {
        return this.field_2092ae_Dne;
    }

    @Override
    public void method_66a36cd8_FWm(WkD wkD) {
        super.method_66a36cd8_FWm(wkD);
        wkD.method_5ab43558_Dne("SkullType", (byte)(this.field_2092ae_Dne & 0xFF));
        wkD.method_5ab43558_Dne("Rot", (byte)(this.field_21260d_FWm & 0xFF));
        wkD.method_abaa98ae_Dne("ExtraType", this.field_569fcf45_Dne);
    }

    @Override
    public void method_8d4fb917_Dne(WkD wkD) {
        super.method_8d4fb917_Dne(wkD);
        this.field_2092ae_Dne = wkD.method_8f501fd0_Dne("SkullType");
        this.field_21260d_FWm = wkD.method_8f501fd0_Dne("Rot");
        if (wkD.method_8f501fe8_Dne("ExtraType")) {
            this.field_569fcf45_Dne = wkD.method_39193c_Dne("ExtraType");
        }
    }

    public int method_7c6f602c_FWm() {
        return this.field_21260d_FWm;
    }

    public void method_fa81cf33_Dne(int n, String string) {
        this.field_2092ae_Dne = n;
        this.field_569fcf45_Dne = string;
    }

    public void method_ce7f5da9_Dne(int n) {
        this.field_21260d_FWm = n;
    }
}

