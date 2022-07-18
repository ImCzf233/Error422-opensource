package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class iSk
extends ycv {
    @Override
    public int method_ce7f5d9c_Dne(int n) {
        return 15;
    }

    @Override
    public boolean method_7c61cf19_Dne(NMq nMq) {
        return nMq.method_230de6ba_Dne().field_267cf5_Qnq == dEr.field_37078f6_Dne.field_267cf5_Qnq ? true : super.method_7c61cf19_Dne(nMq);
    }

    @Override
    public int method_117d19dd_FWm(int n) {
        return super.method_ce7f5d9c_Dne(n) + 50;
    }

    protected iSk(int n, int n2) {
        super(n, n2, ACj.field_140d3d0e_div);
        this.method_286125e9_Dne("untouching");
    }

    @Override
    public boolean method_c6fa7cbf_Dne(ycv ycv2) {
        return super.method_c6fa7cbf_Dne(ycv2) && ycv2.field_21260d_FWm != iSk.field_35ddb629_ATE.field_21260d_FWm;
    }

    @Override
    public int method_7a46288d_Dne() {
        return 1;
    }
}

