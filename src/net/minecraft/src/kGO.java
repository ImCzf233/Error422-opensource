package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class kGO {
    public static final kGO field_75bf5826_bzF;
    public static final kGO field_5e60f900_Qnq;
    private final String field_569fcf45_Dne;
    public static final kGO[] field_836dd794_Dne;
    public static final kGO field_3778a39_Dne;
    private final int field_2092ae_Dne;
    public static final kGO field_20315618_FWm;
    private boolean field_21261e_FWm;
    private boolean field_2092bf_Dne;
    private final int field_21260d_FWm;

    public int method_7a46288d_Dne() {
        return this.field_21260d_FWm;
    }

    private kGO method_21c51d78_Dne(boolean bl) {
        this.field_2092bf_Dne = bl;
        return this;
    }

    public int method_7c6f602c_FWm() {
        return this.field_2092ae_Dne;
    }

    public String method_d1f1ed87_FWm() {
        return "generator." + this.field_569fcf45_Dne;
    }

    static {
        field_836dd794_Dne = new kGO[16];
        field_3778a39_Dne = new kGO(0, "default", 1).method_23111898_Dne();
        field_20315618_FWm = new kGO(1, "flat");
        field_75bf5826_bzF = new kGO(2, "largeBiomes");
        field_5e60f900_Qnq = new kGO(8, "default_1_1", 0).method_21c51d78_Dne(false);
    }

    public String method_eecad346_Dne() {
        return this.field_569fcf45_Dne;
    }

    public boolean method_7a46289e_Dne() {
        return this.field_2092bf_Dne;
    }

    public static kGO method_285a5ae2_Dne(String string) {
        for (int i = 0; i < field_836dd794_Dne.length; ++i) {
            if (field_836dd794_Dne[i] == null || !kGO.field_836dd794_Dne[i].field_569fcf45_Dne.equalsIgnoreCase(string)) continue;
            return field_836dd794_Dne[i];
        }
        return null;
    }

    public kGO method_9e7b2e27_Dne(int n) {
        return this == field_3778a39_Dne && n == 0 ? field_5e60f900_Qnq : this;
    }

    private kGO(int n, String string, int n2) {
        this.field_569fcf45_Dne = string;
        this.field_21260d_FWm = n2;
        this.field_2092bf_Dne = true;
        this.field_2092ae_Dne = n;
        kGO.field_836dd794_Dne[n] = this;
    }

    public boolean method_7c6f603d_FWm() {
        return this.field_21261e_FWm;
    }

    private kGO method_23111898_Dne() {
        this.field_21261e_FWm = true;
        return this;
    }

    private kGO(int n, String string) {
        this(n, string, 0);
    }
}

