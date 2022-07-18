package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class Xmg
extends zKP {
    public static final String[] field_f5e54dca_Dne = new String[]{"stone", "cobble", "brick"};

    @Override
    public int method_3036b9c2_FWm(Qnq qnq, int n, int n2, int n3) {
        return qnq.method_2dee76f_bzF(n, n2, n3);
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
    }

    @Override
    protected NMq method_9e6e1a08_Dne(int n) {
        zKP zKP2 = zKP.field_37e6aed_Dne;
        if (n == 1) {
            zKP2 = zKP.field_75c638da_bzF;
        }
        if (n == 2) {
            zKP2 = zKP.field_39272339_WvN;
        }
        return new NMq(zKP2);
    }

    public static int method_143f9e0f_bzF(int n) {
        return n == zKP.field_75c638da_bzF.field_21260d_FWm ? 1 : (n == zKP.field_39272339_WvN.field_21260d_FWm ? 2 : 0);
    }

    public Xmg(int n) {
        super(n, KFd.field_9f2a9384_RPx);
        this.method_f1c42c0b_bzF(0.0f);
        this.method_82a88d64_Dne(JcN.field_2022bed6_FWm);
    }

    @Override
    public void method_35fd2546_bzF(Qnq qnq, int n, int n2, int n3, int n4) {
        if (!qnq.field_2d2a05_aFZ) {
            zTy zTy2 = new zTy(qnq);
            zTy2.method_9ce0fc65_FWm((double)n + 0.5, n2, (double)n3 + 0.5, 0.0f, 0.0f);
            qnq.method_94d18be5_FWm(zTy2);
            zTy2.method_9b310ff0_Wwe();
        }
        super.method_35fd2546_bzF(qnq, n, n2, n3, n4);
    }

    @Override
    public void method_d88f4bf4_Dne(int n, JcN jcN, List list) {
        for (int i = 0; i < 3; ++i) {
            list.add(new NMq(n, 1, i));
        }
    }

    @Override
    public int method_cfc9daf9_Dne(Random random) {
        return 0;
    }

    @Override
    public gDn method_9051f17a_Dne(int n, int n2) {
        return n2 == 1 ? zKP.field_75c638da_bzF.method_77cd08ea_FWm(n) : (n2 == 2 ? zKP.field_39272339_WvN.method_77cd08ea_FWm(n) : zKP.field_37e6aed_Dne.method_77cd08ea_FWm(n));
    }

    public static boolean method_ce7f5dad_Dne(int n) {
        return n == zKP.field_37e6aed_Dne.field_21260d_FWm || n == zKP.field_75c638da_bzF.field_21260d_FWm || n == zKP.field_39272339_WvN.field_21260d_FWm;
    }
}

