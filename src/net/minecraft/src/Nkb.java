package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class Nkb
extends ycv {
    public static boolean method_d0c423fe_Dne(NMq nMq, int n, Random random) {
        return nMq.method_230de6ba_Dne() instanceof qoi_0 && random.nextFloat() < 0.6f ? false : random.nextInt(n + 1) > 0;
    }

    @Override
    public int method_7a46288d_Dne() {
        return 3;
    }

    @Override
    public int method_117d19dd_FWm(int n) {
        return super.method_ce7f5d9c_Dne(n) + 50;
    }

    @Override
    public int method_ce7f5d9c_Dne(int n) {
        return 5 + (n - 1) * 8;
    }

    @Override
    public boolean method_7c61cf19_Dne(NMq nMq) {
        return nMq.method_7c6f603d_FWm() ? true : super.method_7c61cf19_Dne(nMq);
    }

    protected Nkb(int n, int n2) {
        super(n, n2, ACj.field_140d3d0e_div);
        this.method_286125e9_Dne("durability");
    }
}

