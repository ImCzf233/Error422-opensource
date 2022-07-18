package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public final class mrb {
    private final XHL field_36eea90_Dne;
    private boolean field_267d06_Qnq;
    private final boolean field_21261e_FWm;
    private final long field_2092af_Dne;
    private final kGO field_3778a39_Dne;
    private boolean field_2e5f2c_bzF;
    private final boolean field_2092bf_Dne;
    private String field_569fcf45_Dne = "";

    public mrb(xoY xoY2) {
        this(xoY2.method_7a46288e_Dne(), xoY2.method_230878ef_Dne(), xoY2.method_ae128dcb_bzF(), xoY2.method_907a9d25_Qnq(), xoY2.method_23111898_Dne());
    }

    public mrb method_f888f52d_FWm() {
        this.field_2e5f2c_bzF = true;
        return this;
    }

    public kGO method_23111898_Dne() {
        return this.field_3778a39_Dne;
    }

    public boolean method_ae128dcb_bzF() {
        return this.field_2092bf_Dne;
    }

    public mrb(long l, XHL xHL, boolean bl, boolean bl2, kGO kGO2) {
        this.field_2092af_Dne = l;
        this.field_36eea90_Dne = xHL;
        this.field_2092bf_Dne = bl;
        this.field_21261e_FWm = bl2;
        this.field_3778a39_Dne = kGO2;
    }

    public long method_7a46288e_Dne() {
        return this.field_2092af_Dne;
    }

    public XHL method_230878ef_Dne() {
        return this.field_36eea90_Dne;
    }

    public String method_eecad346_Dne() {
        return this.field_569fcf45_Dne;
    }

    public boolean method_7c6f603d_FWm() {
        return this.field_21261e_FWm;
    }

    public boolean method_907a9d25_Qnq() {
        return this.field_2e5f2c_bzF;
    }

    public boolean method_7a46289e_Dne() {
        return this.field_267d06_Qnq;
    }

    public static XHL method_9e728e7e_Dne(int n) {
        return XHL.method_9e728e7e_Dne(n);
    }

    public mrb method_285be758_Dne(String string) {
        this.field_569fcf45_Dne = string;
        return this;
    }

    public mrb method_2312a50e_Dne() {
        this.field_267d06_Qnq = true;
        return this;
    }
}

