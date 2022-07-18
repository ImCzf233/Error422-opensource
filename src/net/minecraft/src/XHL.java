package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public enum XHL {
    field_36eea90_Dne(-1, ""),
    field_2028b66f_FWm(0, "survival"),
    field_75b6b87d_bzF(1, "creative"),
    field_5e585957_Qnq(2, "adventure");

    String field_569fcf45_Dne;
    int field_2092ae_Dne;

    public boolean method_ae128dcb_bzF() {
        return this == field_2028b66f_FWm || this == field_5e585957_Qnq;
    }

    public boolean method_7a46289e_Dne() {
        return this == field_5e585957_Qnq;
    }

    public int method_7a46288d_Dne() {
        return this.field_2092ae_Dne;
    }

    public boolean method_7c6f603d_FWm() {
        return this == field_75b6b87d_bzF;
    }

    private XHL(int var3, String var4) {
        this.field_2092ae_Dne = var3;
        this.field_569fcf45_Dne = var4;
    }

    public void method_c0e591bc_Dne(uqg uqg2) {
        if (this == field_75b6b87d_bzF) {
            uqg2.field_2e5f2c_bzF = true;
            uqg2.field_267d06_Qnq = true;
            uqg2.field_2092bf_Dne = true;
        } else {
            uqg2.field_2e5f2c_bzF = false;
            uqg2.field_267d06_Qnq = false;
            uqg2.field_2092bf_Dne = false;
            uqg2.field_21261e_FWm = false;
        }
        uqg2.field_2d2a05_aFZ = !this.method_7a46289e_Dne();
    }

    public static XHL method_2851bb39_Dne(String string) {
        for (XHL xHL : XHL.values()) {
            if (!xHL.field_569fcf45_Dne.equals(string)) continue;
            return xHL;
        }
        return field_2028b66f_FWm;
    }

    public static XHL method_9e728e7e_Dne(int n) {
        for (XHL xHL : XHL.values()) {
            if (xHL.field_2092ae_Dne != n) continue;
            return xHL;
        }
        return field_2028b66f_FWm;
    }

    public String method_eecad346_Dne() {
        return this.field_569fcf45_Dne;
    }
}

