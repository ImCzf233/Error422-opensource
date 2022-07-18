package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
class ZLf {
    public int field_2e5f1b_bzF;
    public final int field_2092ae_Dne;
    public int field_21260d_FWm;
    public boolean field_2092bf_Dne;
    public Class field_ce3f4d68_Dne;

    public ZLf(Class clazz, int n, int n2) {
        this(clazz, n, n2, false);
    }

    public boolean method_ce7f5dad_Dne(int n) {
        return this.field_2e5f1b_bzF == 0 || this.field_21260d_FWm < this.field_2e5f1b_bzF;
    }

    public boolean method_7a46289e_Dne() {
        return this.field_2e5f1b_bzF == 0 || this.field_21260d_FWm < this.field_2e5f1b_bzF;
    }

    public ZLf(Class clazz, int n, int n2, boolean bl) {
        this.field_ce3f4d68_Dne = clazz;
        this.field_2092ae_Dne = n;
        this.field_2e5f1b_bzF = n2;
        this.field_2092bf_Dne = bl;
    }
}

