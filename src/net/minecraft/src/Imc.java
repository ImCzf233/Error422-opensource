package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class Imc
extends zKP {
    private gDn[] field_836bfe96_Dne;

    public static int method_ac88ebde_b_(int n) {
        return ~n & 0xF;
    }

    public Imc() {
        super(35, KFd.field_aef9a59e_udO);
        this.method_82a88d64_Dne(JcN.field_368f2f7_Dne);
    }

    public static int method_143f9e0f_bzF(int n) {
        return ~n & 0xF;
    }

    @Override
    public int method_ce7f5d9c_Dne(int n) {
        return n;
    }

    @Override
    public gDn method_9051f17a_Dne(int n, int n2) {
        return this.field_836bfe96_Dne[n2 % this.field_836bfe96_Dne.length];
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        this.field_836bfe96_Dne = new gDn[16];
        for (int i = 0; i < this.field_836bfe96_Dne.length; ++i) {
            this.field_836bfe96_Dne[i] = rbp.method_285881e4_Dne("cloth_" + i);
        }
    }

    @Override
    public void method_d88f4bf4_Dne(int n, JcN jcN, List list) {
        for (int i = 0; i < 16; ++i) {
            list.add(new NMq(n, 1, i));
        }
    }
}

