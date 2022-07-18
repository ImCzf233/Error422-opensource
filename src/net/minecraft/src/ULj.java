package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class ULj
extends kbN {
    private boolean field_2092bf_Dne;
    private gDn field_202f7d1a_FWm;
    private gDn field_375b13b_Dne;

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        this.field_202f7d1a_FWm = rbp.method_285881e4_Dne(this.field_2092bf_Dne ? "pumpkin_jack" : "pumpkin_face");
        this.field_375b13b_Dne = rbp.method_285881e4_Dne("pumpkin_top");
        this.field_5e5f2002_Qnq = rbp.method_285881e4_Dne("pumpkin_side");
    }

    @Override
    public void method_ca7e4e57_Dne(Qnq qnq, int n, int n2, int n3, FUH fUH, NMq nMq) {
        int n4 = geR.method_117d0718_FWm((double)(fUH.field_334489_mrb * 4.0f / 360.0f) + 2.5) & 3;
        qnq.method_d4dc89ed_Dne(n, n2, n3, n4, 2);
    }

    @Override
    public void method_9cb39130_Dne(Qnq qnq, int n, int n2, int n3) {
        super.method_9cb39130_Dne(qnq, n, n2, n3);
        if (qnq.method_2c2cf7bc_Dne(n, n2 - 1, n3) == zKP.field_7483639c_Jik.field_21260d_FWm && qnq.method_2c2cf7bc_Dne(n, n2 - 2, n3) == zKP.field_7483639c_Jik.field_21260d_FWm) {
            if (!qnq.field_2d2a05_aFZ) {
                qnq.method_17d7ea9d_FWm(n, n2, n3, 0, 0, 2);
                qnq.method_17d7ea9d_FWm(n, n2 - 1, n3, 0, 0, 2);
                qnq.method_17d7ea9d_FWm(n, n2 - 2, n3, 0, 0, 2);
                wao wao2 = new wao(qnq);
                wao2.method_9ce0fc65_FWm((double)n + 0.5, (double)n2 - 1.95, (double)n3 + 0.5, 0.0f, 0.0f);
                qnq.method_94d18be5_FWm(wao2);
                qnq.method_5972745a_Dne(n, n2, n3, 0);
                qnq.method_5972745a_Dne(n, n2 - 1, n3, 0);
                qnq.method_5972745a_Dne(n, n2 - 2, n3, 0);
            }
            for (int i = 0; i < 120; ++i) {
                qnq.method_8600ec24_Dne("snowshovel", (double)n + qnq.field_7331eae7_Dne.nextDouble(), (double)(n2 - 2) + qnq.field_7331eae7_Dne.nextDouble() * 2.5, (double)n3 + qnq.field_7331eae7_Dne.nextDouble(), 0.0, 0.0, 0.0);
            }
        } else if (qnq.method_2c2cf7bc_Dne(n, n2 - 1, n3) == zKP.field_77fdc06_gnI.field_21260d_FWm && qnq.method_2c2cf7bc_Dne(n, n2 - 2, n3) == zKP.field_77fdc06_gnI.field_21260d_FWm) {
            boolean bl;
            boolean bl2 = qnq.method_2c2cf7bc_Dne(n - 1, n2 - 1, n3) == zKP.field_77fdc06_gnI.field_21260d_FWm && qnq.method_2c2cf7bc_Dne(n + 1, n2 - 1, n3) == zKP.field_77fdc06_gnI.field_21260d_FWm;
            boolean bl3 = bl = qnq.method_2c2cf7bc_Dne(n, n2 - 1, n3 - 1) == zKP.field_77fdc06_gnI.field_21260d_FWm && qnq.method_2c2cf7bc_Dne(n, n2 - 1, n3 + 1) == zKP.field_77fdc06_gnI.field_21260d_FWm;
            if (bl2 || bl) {
                qnq.method_17d7ea9d_FWm(n, n2, n3, 0, 0, 2);
                qnq.method_17d7ea9d_FWm(n, n2 - 1, n3, 0, 0, 2);
                qnq.method_17d7ea9d_FWm(n, n2 - 2, n3, 0, 0, 2);
                if (bl2) {
                    qnq.method_17d7ea9d_FWm(n - 1, n2 - 1, n3, 0, 0, 2);
                    qnq.method_17d7ea9d_FWm(n + 1, n2 - 1, n3, 0, 0, 2);
                } else {
                    qnq.method_17d7ea9d_FWm(n, n2 - 1, n3 - 1, 0, 0, 2);
                    qnq.method_17d7ea9d_FWm(n, n2 - 1, n3 + 1, 0, 0, 2);
                }
                CDE cDE = new CDE(qnq);
                cDE.method_ce92b9a6_IjH(true);
                cDE.method_9ce0fc65_FWm((double)n + 0.5, (double)n2 - 1.95, (double)n3 + 0.5, 0.0f, 0.0f);
                qnq.method_94d18be5_FWm(cDE);
                for (int i = 0; i < 120; ++i) {
                    qnq.method_8600ec24_Dne("snowballpoof", (double)n + qnq.field_7331eae7_Dne.nextDouble(), (double)(n2 - 2) + qnq.field_7331eae7_Dne.nextDouble() * 3.9, (double)n3 + qnq.field_7331eae7_Dne.nextDouble(), 0.0, 0.0, 0.0);
                }
                qnq.method_5972745a_Dne(n, n2, n3, 0);
                qnq.method_5972745a_Dne(n, n2 - 1, n3, 0);
                qnq.method_5972745a_Dne(n, n2 - 2, n3, 0);
                if (bl2) {
                    qnq.method_5972745a_Dne(n - 1, n2 - 1, n3, 0);
                    qnq.method_5972745a_Dne(n + 1, n2 - 1, n3, 0);
                } else {
                    qnq.method_5972745a_Dne(n, n2 - 1, n3 - 1, 0);
                    qnq.method_5972745a_Dne(n, n2 - 1, n3 + 1, 0);
                }
            }
        }
    }

    @Override
    public gDn method_9051f17a_Dne(int n, int n2) {
        return n == 1 ? this.field_375b13b_Dne : (n == 0 ? this.field_375b13b_Dne : (n2 == 2 && n == 2 ? this.field_202f7d1a_FWm : (n2 == 3 && n == 5 ? this.field_202f7d1a_FWm : (n2 == 0 && n == 3 ? this.field_202f7d1a_FWm : (n2 == 1 && n == 4 ? this.field_202f7d1a_FWm : this.field_5e5f2002_Qnq)))));
    }

    protected ULj(int n, boolean bl) {
        super(n, KFd.field_dd686a9b_Fnk);
        this.method_21cbfe2c_Dne(true);
        this.field_2092bf_Dne = bl;
        this.method_82a88d64_Dne(JcN.field_368f2f7_Dne);
    }

    @Override
    public boolean method_9cb39134_Dne(Qnq qnq, int n, int n2, int n3) {
        int n4 = qnq.method_2c2cf7bc_Dne(n, n2, n3);
        return (n4 == 0 || zKP.field_8374b848_Dne[n4].field_368fd23_Dne.method_d44b4596_zGp()) && qnq.method_73e9b8f9_IjH(n, n2 - 1, n3);
    }
}

