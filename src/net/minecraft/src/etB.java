package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class etB {
    private boolean field_267d06_Qnq = false;
    public String field_9e60dbde_Qnq;
    public String field_569fcf45_Dne;
    public String field_c480ca78_bzF;
    private boolean field_2e5f2c_bzF = false;
    public String field_d9a85c6_FWm;
    public String field_bc57ecbf_aFZ = "UNKNOWN";
    private boolean field_21261e_FWm = true;
    public long field_2092af_Dne;
    public int field_2092ae_Dne = 61;
    public boolean field_2092bf_Dne = false;

    public boolean method_7c6f603d_FWm() {
        return this.field_21261e_FWm;
    }

    public void method_ce7f9d7a_Dne(boolean bl) {
        this.field_2e5f2c_bzF = bl;
        this.field_21261e_FWm = false;
    }

    public void method_117d59bb_FWm(boolean bl) {
        this.field_267d06_Qnq = bl;
    }

    public etB(String string, String string2) {
        this.field_569fcf45_Dne = string;
        this.field_d9a85c6_FWm = string2;
    }

    public boolean method_7a46289e_Dne() {
        return this.field_2e5f2c_bzF;
    }

    public WkD method_230886fb_Dne() {
        WkD wkD = new WkD();
        wkD.method_abaa98ae_Dne("name", this.field_569fcf45_Dne);
        wkD.method_abaa98ae_Dne("ip", this.field_d9a85c6_FWm);
        wkD.method_5ab48f70_Dne("hideAddress", this.field_267d06_Qnq);
        if (!this.field_21261e_FWm) {
            wkD.method_5ab48f70_Dne("acceptTextures", this.field_2e5f2c_bzF);
        }
        return wkD;
    }

    public static etB method_7db20fb5_Dne(WkD wkD) {
        etB etB2 = new etB(wkD.method_39193c_Dne("name"), wkD.method_39193c_Dne("ip"));
        etB2.field_267d06_Qnq = wkD.method_110c4dc7_FWm("hideAddress");
        if (wkD.method_8f501fe8_Dne("acceptTextures")) {
            etB2.method_ce7f9d7a_Dne(wkD.method_110c4dc7_FWm("acceptTextures"));
        }
        return etB2;
    }

    public boolean method_ae128dcb_bzF() {
        return this.field_267d06_Qnq;
    }
}

