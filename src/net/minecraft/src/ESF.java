package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class ESF
extends zKP {
    private String field_569fcf45_Dne;
    private boolean field_2092bf_Dne;

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        this.field_5e5f2002_Qnq = rbp.method_285881e4_Dne(this.field_569fcf45_Dne);
    }

    @Override
    public boolean method_79d378f8_Dne(Zpi zpi, int n, int n2, int n3, int n4) {
        int n5 = zpi.method_2c2cf7bc_Dne(n, n2, n3);
        return !this.field_2092bf_Dne && n5 == this.field_21260d_FWm ? false : super.method_79d378f8_Dne(zpi, n, n2, n3, n4);
    }

    protected ESF(int n, String string, KFd kFd, boolean bl) {
        super(n, kFd);
        this.field_2092bf_Dne = bl;
        this.field_569fcf45_Dne = string;
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return false;
    }
}

