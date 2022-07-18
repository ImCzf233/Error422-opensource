package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class EBB
extends ycv {
    @Override
    public int method_ce7f5d9c_Dne(int n) {
        return 1 + 10 * (n - 1);
    }

    @Override
    public int method_117d19dd_FWm(int n) {
        return super.method_ce7f5d9c_Dne(n) + 50;
    }

    protected EBB(int n, int n2) {
        super(n, n2, ACj.field_140d3d0e_div);
        this.method_286125e9_Dne("digging");
    }

    @Override
    public int method_7a46288d_Dne() {
        return 5;
    }

    @Override
    public boolean method_7c61cf19_Dne(NMq nMq) {
        return nMq.method_230de6ba_Dne().field_267cf5_Qnq == dEr.field_37078f6_Dne.field_267cf5_Qnq ? true : super.method_7c61cf19_Dne(nMq);
    }
}

