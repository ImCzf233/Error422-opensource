package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class pok {
    public int field_21260d_FWm;
    public int field_2e5f1b_bzF;
    public final int field_2092ae_Dne;
    public Class field_ce3f4d68_Dne;

    public boolean method_ce7f5dad_Dne(int n) {
        return this.field_2e5f1b_bzF == 0 || this.field_21260d_FWm < this.field_2e5f1b_bzF;
    }

    public boolean method_7a46289e_Dne() {
        return this.field_2e5f1b_bzF == 0 || this.field_21260d_FWm < this.field_2e5f1b_bzF;
    }

    public pok(Class clazz, int n, int n2) {
        this.field_ce3f4d68_Dne = clazz;
        this.field_2092ae_Dne = n;
        this.field_2e5f1b_bzF = n2;
    }
}

