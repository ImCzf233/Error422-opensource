package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public final class pPp
extends Exception {
    private final int field_2092ae_Dne;
    private final int field_21260d_FWm;

    pPp(String string, Throwable throwable, BEs bEs) {
        super("At line " + bEs.method_ae128dba_bzF() + ", column " + bEs.method_7c6f602c_FWm() + ":  " + string, throwable);
        this.field_2092ae_Dne = bEs.method_7c6f602c_FWm();
        this.field_21260d_FWm = bEs.method_ae128dba_bzF();
    }

    pPp(String string, BEs bEs) {
        super("At line " + bEs.method_ae128dba_bzF() + ", column " + bEs.method_7c6f602c_FWm() + ":  " + string);
        this.field_2092ae_Dne = bEs.method_7c6f602c_FWm();
        this.field_21260d_FWm = bEs.method_ae128dba_bzF();
    }
}

