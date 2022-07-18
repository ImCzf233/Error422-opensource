package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class kTB
extends zKP {
    private gDn field_375b13b_Dne;

    @Override
    public gDn method_9051f17a_Dne(int n, int n2) {
        return n != 1 && n != 0 ? this.field_5e5f2002_Qnq : this.field_375b13b_Dne;
    }

    @Override
    public int method_3afb8a48_Dne(int n, Random random) {
        int n2 = this.method_cfc9daf9_Dne(random) + random.nextInt(1 + n);
        if (n2 > 9) {
            n2 = 9;
        }
        return n2;
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        this.field_5e5f2002_Qnq = rbp.method_285881e4_Dne("melon_side");
        this.field_375b13b_Dne = rbp.method_285881e4_Dne("melon_top");
    }

    protected kTB(int n) {
        super(n, KFd.field_dd686a9b_Fnk);
        this.method_82a88d64_Dne(JcN.field_368f2f7_Dne);
    }

    @Override
    public int method_cfc9daf9_Dne(Random random) {
        return 3 + random.nextInt(5);
    }

    @Override
    public int method_24763341_Dne(int n, Random random, int n2) {
        return dEr.field_27cfb795_gwq.field_267cf5_Qnq;
    }
}

