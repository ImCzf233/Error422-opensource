package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class RLC {
    public static DOt field_201fbe22_FWm;
    private final String field_d9a85c6_FWm;
    private final DOt field_5e4f610a_Qnq;
    public static DOt field_75adc030_bzF;
    public final int field_2e5f1b_bzF;
    private static NumberFormat field_e91a0d55_Dne;
    public static DOt field_365f243_Dne;
    public boolean field_2092bf_Dne = false;
    public String field_569fcf45_Dne;
    private static DecimalFormat field_fc183819_Dne;

    public RLC(int n, String string) {
        this(n, string, field_365f243_Dne);
    }

    static {
        field_e91a0d55_Dne = NumberFormat.getIntegerInstance(Locale.US);
        field_365f243_Dne = new QoI();
        field_fc183819_Dne = new DecimalFormat("########0.00");
        field_201fbe22_FWm = new kNJ();
        field_75adc030_bzF = new stM();
    }

    public String method_d1f1ed87_FWm() {
        return this.field_d9a85c6_FWm;
    }

    static NumberFormat method_42d84c96_Dne() {
        return field_e91a0d55_Dne;
    }

    public RLC(int n, String string, DOt dOt) {
        this.field_2e5f1b_bzF = n;
        this.field_d9a85c6_FWm = string;
        this.field_5e4f610a_Qnq = dOt;
    }

    public RLC method_f87c1cc1_FWm() {
        this.field_2092bf_Dne = true;
        return this;
    }

    static DecimalFormat method_da21e0f8_Dne() {
        return field_fc183819_Dne;
    }

    public boolean method_7a46289e_Dne() {
        return false;
    }

    public RLC method_2305cca2_Dne() {
        if (trP.field_83b1c1b0_Dne.containsKey(this.field_2e5f1b_bzF)) {
            throw new RuntimeException("Duplicate stat id: \"" + ((RLC)trP.field_83b1c1b0_Dne.get((Object)Integer.valueOf((int)this.field_2e5f1b_bzF))).field_d9a85c6_FWm + "\" and \"" + this.field_d9a85c6_FWm + "\" at id " + this.field_2e5f1b_bzF);
        }
        trP.field_f27c122c_Dne.add(this);
        trP.field_83b1c1b0_Dne.put(this.field_2e5f1b_bzF, this);
        this.field_569fcf45_Dne = pLv.method_2c0e7e17_Dne(this.field_2e5f1b_bzF);
        return this;
    }

    public String method_2c0e7e17_Dne(int n) {
        return this.field_5e4f610a_Qnq.method_2c0e7e17_Dne(n);
    }

    public String toString() {
        return KGL.method_39193c_Dne(this.field_d9a85c6_FWm);
    }
}

