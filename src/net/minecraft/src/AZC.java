package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class AZC
extends dNT {
    public static final String[] field_f5e54dca_Dne = new String[]{"oak", "spruce", "birch", "jungle"};

    public AZC(int n, boolean bl) {
        super(n, bl, KFd.field_5e526bea_Qnq);
        this.method_82a88d64_Dne(JcN.field_368f2f7_Dne);
    }

    @Override
    protected NMq method_9e6e1a08_Dne(int n) {
        return new NMq(zKP.field_5e5de549_Qnq.field_21260d_FWm, 2, n & 7);
    }

    @Override
    public gDn method_9051f17a_Dne(int n, int n2) {
        return zKP.field_5e67d9b4_Qnq.method_9051f17a_Dne(n, n2 & 7);
    }

    @Override
    public String method_2c0e7e17_Dne(int n) {
        if (n < 0 || n >= field_f5e54dca_Dne.length) {
            n = 0;
        }
        return super.method_6859cdb9_bzF() + "." + field_f5e54dca_Dne[n];
    }

    @Override
    public int method_24763341_Dne(int n, Random random, int n2) {
        return zKP.field_5e5de549_Qnq.field_21260d_FWm;
    }

    @Override
    public void method_d88f4bf4_Dne(int n, JcN jcN, List list) {
        if (n != zKP.field_75bc446f_bzF.field_21260d_FWm) {
            for (int i = 0; i < 4; ++i) {
                list.add(new NMq(n, 1, i));
            }
        }
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
    }
}

