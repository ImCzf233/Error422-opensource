package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class uGR {
    private boolean field_2092bf_Dne;
    private final int field_2092ae_Dne;
    private Object field_63dcf1d7_Dne;
    private final int field_21260d_FWm;

    public uGR(int n, int n2, Object object) {
        this.field_21260d_FWm = n2;
        this.field_63dcf1d7_Dne = object;
        this.field_2092ae_Dne = n;
        this.field_2092bf_Dne = true;
    }

    public void method_41cee5f6_Dne(Object object) {
        this.field_63dcf1d7_Dne = object;
    }

    public void method_ce7f9d7a_Dne(boolean bl) {
        this.field_2092bf_Dne = bl;
    }

    public Object method_fc07f5d8_Dne() {
        return this.field_63dcf1d7_Dne;
    }

    static boolean method_12f9e0f1_Dne(uGR uGR2, boolean bl) {
        uGR2.field_2092bf_Dne = bl;
        return uGR2.field_2092bf_Dne;
    }

    public int method_7c6f602c_FWm() {
        return this.field_2092ae_Dne;
    }

    public int method_7a46288d_Dne() {
        return this.field_21260d_FWm;
    }

    public boolean method_7a46289e_Dne() {
        return this.field_2092bf_Dne;
    }
}

