package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public abstract class vWZ {
    private boolean field_2092bf_Dne;
    public final String field_569fcf45_Dne;

    public abstract void method_8d4fb917_Dne(WkD var1);

    public abstract void method_66a36cd8_FWm(WkD var1);

    public void method_ce7f9d7a_Dne(boolean bl) {
        this.field_2092bf_Dne = bl;
    }

    public boolean method_7a46289e_Dne() {
        return this.field_2092bf_Dne;
    }

    public void method_7a46289a_Dne() {
        this.method_ce7f9d7a_Dne(true);
    }

    public vWZ(String string) {
        this.field_569fcf45_Dne = string;
    }
}

