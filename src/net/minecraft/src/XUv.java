package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class XUv
extends zKP {
    @Override
    public void method_fbabf7ef_Dne(Zpi zpi, int n, int n2, int n3) {
        this.method_ce7f5da9_Dne(zpi.method_2dee76f_bzF(n, n2, n3));
    }

    @Override
    public void method_7a46289a_Dne() {
        this.method_ce7f5da9_Dne(0);
    }

    @Override
    public int method_24763341_Dne(int n, Random random, int n2) {
        return dEr.field_4817800a_iNQ.field_267cf5_Qnq;
    }

    @Override
    public boolean method_9cb39134_Dne(Qnq qnq, int n, int n2, int n3) {
        int n4 = qnq.method_2c2cf7bc_Dne(n, n2 - 1, n3);
        return n4 == 0 ? false : (n4 == this.field_21260d_FWm && (qnq.method_2dee76f_bzF(n, n2 - 1, n3) & 7) == 7 ? true : (n4 != zKP.field_36e218c_Dne.field_21260d_FWm && !zKP.field_8374b848_Dne[n4].method_7c6f603d_FWm() ? false : qnq.method_d9802b31_Dne(n, n2 - 1, n3).method_ae128dcb_bzF()));
    }

    @Override
    public int method_cfc9daf9_Dne(Random random) {
        return 0;
    }

    @Override
    public void method_e061540a_Dne(Qnq qnq, FiG fiG, int n, int n2, int n3, int n4) {
        int n5 = dEr.field_4817800a_iNQ.field_267cf5_Qnq;
        int n6 = n4 & 7;
        this.method_c594b700_FWm(qnq, n, n2, n3, new NMq(n5, n6 + 1, 0));
        qnq.method_2e7161e6_Qnq(n, n2, n3);
        fiG.method_df3461c5_Dne(trP.field_83628b9e_Dne[this.field_21260d_FWm], 1);
    }

    @Override
    public void method_ca828a1c_Dne(Qnq qnq, int n, int n2, int n3, Random random) {
        if (qnq.method_f476b68e_FWm(udO.field_20364eab_FWm, n, n2, n3) > 11) {
            this.method_fd7de26f_FWm(qnq, n, n2, n3, qnq.method_2dee76f_bzF(n, n2, n3), 0);
            qnq.method_2e7161e6_Qnq(n, n2, n3);
        }
    }

    @Override
    public bSp method_8c85fe2_Dne(Qnq qnq, int n, int n2, int n3) {
        int n4 = qnq.method_2dee76f_bzF(n, n2, n3) & 7;
        float f = 0.125f;
        return bSp.method_23186cf1_Dne().method_b4ea3e0c_Dne((double)n + this.field_2092a9_Dne, (double)n2 + this.field_212608_FWm, (double)n3 + this.field_2e5f16_bzF, (double)n + this.field_267cf0_Qnq, (float)n2 + (float)n4 * f, (double)n3 + this.field_388da1_zGp);
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        this.field_5e5f2002_Qnq = rbp.method_285881e4_Dne("snow");
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return false;
    }

    protected XUv(int n) {
        super(n, KFd.field_394fe8ca_OdI);
        this.method_eb14b51a_Dne(0.0f, 0.0f, 0.0f, 1.0f, 0.125f, 1.0f);
        this.method_21cbfe2c_Dne(true);
        this.method_82a88d64_Dne(JcN.field_2022bed6_FWm);
        this.method_ce7f5da9_Dne(0);
    }

    @Override
    public boolean method_79d378f8_Dne(Zpi zpi, int n, int n2, int n3, int n4) {
        return n4 == 1 ? true : super.method_79d378f8_Dne(zpi, n, n2, n3, n4);
    }

    @Override
    public void method_f9bf07d3_Dne(Qnq qnq, int n, int n2, int n3, int n4) {
        this.method_54527961_bzF(qnq, n, n2, n3);
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return false;
    }

    private boolean method_54527961_bzF(Qnq qnq, int n, int n2, int n3) {
        if (!this.method_9cb39134_Dne(qnq, n, n2, n3)) {
            this.method_fd7de26f_FWm(qnq, n, n2, n3, qnq.method_2dee76f_bzF(n, n2, n3), 0);
            qnq.method_2e7161e6_Qnq(n, n2, n3);
            return false;
        }
        return true;
    }

    protected void method_ce7f5da9_Dne(int n) {
        int n2 = n & 7;
        float f = (float)(2 * (1 + n2)) / 16.0f;
        this.method_eb14b51a_Dne(0.0f, 0.0f, 0.0f, 1.0f, f, 1.0f);
    }
}

