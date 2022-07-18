package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class FgE
extends ipD
implements gnI {
    private int field_2092ae_Dne = 0;
    private String field_d9a85c6_FWm = "@";
    private String field_569fcf45_Dne = "";

    public void method_47a073d1_bzF(String string) {
        this.field_d9a85c6_FWm = string;
    }

    @Override
    public boolean method_fa81cf37_Dne(int n, String string) {
        return n <= 2;
    }

    @Override
    public void method_8f501fe4_Dne(String string) {
    }

    @Override
    public void method_8d4fb917_Dne(WkD wkD) {
        super.method_8d4fb917_Dne(wkD);
        this.field_569fcf45_Dne = wkD.method_39193c_Dne("Command");
        this.field_2092ae_Dne = wkD.method_8f501fd7_Dne("SuccessCount");
        if (wkD.method_8f501fe8_Dne("CustomName")) {
            this.field_d9a85c6_FWm = wkD.method_39193c_Dne("CustomName");
        }
    }

    public void method_110c4dc3_FWm(String string) {
        this.field_569fcf45_Dne = string;
        this.method_582b297_a_();
    }

    @Override
    public String method_98148f73_Dne(String string, Object ... objectArray) {
        return string;
    }

    @Override
    public iSh method_23105fed_Dne() {
        return new iSh(this.field_267cf5_Qnq, this.field_2d29f4_aFZ, this.field_388da6_zGp);
    }

    @Override
    public void method_66a36cd8_FWm(WkD wkD) {
        super.method_66a36cd8_FWm(wkD);
        wkD.method_abaa98ae_Dne("Command", this.field_569fcf45_Dne);
        wkD.method_5ab44f9f_Dne("SuccessCount", this.field_2092ae_Dne);
        wkD.method_abaa98ae_Dne("CustomName", this.field_d9a85c6_FWm);
    }

    @Override
    public String method_193de2e9_a_() {
        return this.field_d9a85c6_FWm;
    }

    @Override
    public NER method_2303e2b0_Dne() {
        WkD wkD = new WkD();
        this.method_66a36cd8_FWm(wkD);
        return new ipQ(this.field_267cf5_Qnq, this.field_2d29f4_aFZ, this.field_388da6_zGp, 2, wkD);
    }

    public int method_83516086_Dne(Qnq qnq) {
        if (qnq.field_2d2a05_aFZ) {
            return 0;
        }
        jwh_0 jwh_02 = jwh_0.method_2302cf90_Dne();
        if (jwh_02 != null && jwh_02.method_7ad38807_DyG()) {
            FWm fWm = jwh_02.method_2300868f_Dne();
            return fWm.method_d491c9e2_Dne(this, this.field_569fcf45_Dne);
        }
        return 0;
    }

    public String method_d1f1ed87_FWm() {
        return this.field_569fcf45_Dne;
    }

    public void method_ce7f5da9_Dne(int n) {
        this.field_2092ae_Dne = n;
    }

    public int method_7a46288d_Dne() {
        return this.field_2092ae_Dne;
    }
}

