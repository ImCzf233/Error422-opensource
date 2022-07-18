package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
class iVH {
    private double field_2092a9_Dne;
    private boolean field_2092bf_Dne;
    private String field_569fcf45_Dne;
    private int field_2092ae_Dne;

    public boolean method_7a46289e_Dne() {
        return this.field_2092bf_Dne;
    }

    public void method_8f501fe4_Dne(String string) {
        this.field_569fcf45_Dne = string;
        this.field_2092bf_Dne = Boolean.parseBoolean(string);
        try {
            this.field_2092ae_Dne = Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            // empty catch block
        }
        try {
            this.field_2092a9_Dne = Double.parseDouble(string);
        }
        catch (NumberFormatException numberFormatException) {
            // empty catch block
        }
    }

    public iVH(String string) {
        this.method_8f501fe4_Dne(string);
    }

    public String method_eecad346_Dne() {
        return this.field_569fcf45_Dne;
    }
}

