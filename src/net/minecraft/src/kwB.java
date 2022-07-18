package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class kwB
extends ycv {
    @Override
    public int method_ce7f5d9c_Dne(int n) {
        return 1 + (n - 1) * 10;
    }

    public kwB(int n, int n2) {
        super(n, n2, ACj.field_5b4d038_IjH);
        this.method_286125e9_Dne("arrowDamage");
    }

    @Override
    public int method_7a46288d_Dne() {
        return 5;
    }

    @Override
    public int method_117d19dd_FWm(int n) {
        return this.method_ce7f5d9c_Dne(n) + 15;
    }
}

