package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class pQP
implements Comparable {
    private final XHL field_36eea90_Dne;
    private final boolean field_2092bf_Dne;
    private final long field_2092af_Dne;
    private final String field_d9a85c6_FWm;
    private final long field_21260e_FWm;
    private final String field_569fcf45_Dne;
    private final boolean field_2e5f2c_bzF;
    private final boolean field_21261e_FWm;

    public String method_eecad346_Dne() {
        return this.field_569fcf45_Dne;
    }

    public boolean method_7a46289e_Dne() {
        return this.field_2092bf_Dne;
    }

    public XHL method_230878ef_Dne() {
        return this.field_36eea90_Dne;
    }

    public pQP(String string, String string2, long l, long l2, XHL xHL, boolean bl, boolean bl2, boolean bl3) {
        this.field_569fcf45_Dne = string;
        this.field_d9a85c6_FWm = string2;
        this.field_2092af_Dne = l;
        this.field_21260e_FWm = l2;
        this.field_36eea90_Dne = xHL;
        this.field_2092bf_Dne = bl;
        this.field_21261e_FWm = bl2;
        this.field_2e5f2c_bzF = bl3;
    }

    public boolean method_7c6f603d_FWm() {
        return this.field_21261e_FWm;
    }

    public String method_d1f1ed87_FWm() {
        return this.field_d9a85c6_FWm;
    }

    public int method_b68ff1eb_Dne(pQP pQP2) {
        return this.field_2092af_Dne < pQP2.field_2092af_Dne ? 1 : (this.field_2092af_Dne > pQP2.field_2092af_Dne ? -1 : this.field_569fcf45_Dne.compareTo(pQP2.field_569fcf45_Dne));
    }

    public long method_7a46288e_Dne() {
        return this.field_2092af_Dne;
    }

    public boolean method_ae128dcb_bzF() {
        return this.field_2e5f2c_bzF;
    }

    public int compareTo(Object object) {
        return this.method_b68ff1eb_Dne((pQP)object);
    }
}

