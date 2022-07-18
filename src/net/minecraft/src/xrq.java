package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class xrq
extends ycv {
    @Override
    public int method_7a46288d_Dne() {
        return 2;
    }

    @Override
    public int method_ce7f5d9c_Dne(int n) {
        return 5 + 20 * (n - 1);
    }

    @Override
    public int method_117d19dd_FWm(int n) {
        return super.method_ce7f5d9c_Dne(n) + 50;
    }

    protected xrq(int n, int n2) {
        super(n, n2, ACj.field_1617900d_DyG);
        this.method_286125e9_Dne("knockback");
    }
}

