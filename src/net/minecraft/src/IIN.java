package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class IIN
extends zKP {
    private gDn field_375b13b_Dne;
    private gDn field_75bd7f28_bzF;
    private gDn field_202f7d1a_FWm;

    @Override
    public boolean method_cb53d52e_Dne(Qnq qnq, int n, int n2, int n3, FiG fiG, int n4, float f, float f2, float f3) {
        this.method_b9656c8e_FWm(qnq, n, n2, n3, fiG);
        return true;
    }

    @Override
    public int method_9cb39123_Dne(Qnq qnq, int n, int n2, int n3) {
        return dEr.field_5fe93310_iXU.field_267cf5_Qnq;
    }

    @Override
    public bSp method_5f382101_FWm(Qnq qnq, int n, int n2, int n3) {
        int n4 = qnq.method_2dee76f_bzF(n, n2, n3);
        float f = 0.0625f;
        float f2 = (float)(1 + n4 * 2) / 16.0f;
        float f3 = 0.5f;
        return bSp.method_23186cf1_Dne().method_b4ea3e0c_Dne((float)n + f2, n2, (float)n3 + f, (float)(n + 1) - f, (float)n2 + f3, (float)(n3 + 1) - f);
    }

    @Override
    public void method_7a46289a_Dne() {
        float f = 0.0625f;
        float f2 = 0.5f;
        this.method_eb14b51a_Dne(f, 0.0f, f, 1.0f - f, f2, 1.0f - f);
    }

    @Override
    public int method_cfc9daf9_Dne(Random random) {
        return 0;
    }

    @Override
    public gDn method_9051f17a_Dne(int n, int n2) {
        return n == 1 ? this.field_375b13b_Dne : (n == 0 ? this.field_202f7d1a_FWm : (n2 > 0 && n == 4 ? this.field_75bd7f28_bzF : this.field_5e5f2002_Qnq));
    }

    private void method_b9656c8e_FWm(Qnq qnq, int n, int n2, int n3, FiG fiG) {
        if (fiG.method_ce7f9d7e_Dne(false)) {
            fiG.method_230621e2_Dne().method_16cbf37_Dne(2, 0.1f);
            int n4 = qnq.method_2dee76f_bzF(n, n2, n3) + 1;
            if (n4 >= 6) {
                qnq.method_2e7161e6_Qnq(n, n2, n3);
            } else {
                qnq.method_d4dc89ed_Dne(n, n2, n3, n4, 2);
            }
        }
    }

    protected IIN(int n) {
        super(n, KFd.field_cb453ef6_qXo);
        this.method_21cbfe2c_Dne(true);
    }

    @Override
    public int method_24763341_Dne(int n, Random random, int n2) {
        return 0;
    }

    @Override
    public void method_f9bf07d3_Dne(Qnq qnq, int n, int n2, int n3, int n4) {
        if (!this.method_52f8ce31_a_(qnq, n, n2, n3)) {
            qnq.method_2e7161e6_Qnq(n, n2, n3);
        }
    }

    @Override
    public void method_41dd09cd_Dne(Qnq qnq, int n, int n2, int n3, FiG fiG) {
        this.method_b9656c8e_FWm(qnq, n, n2, n3, fiG);
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return false;
    }

    @Override
    public void method_fbabf7ef_Dne(Zpi zpi, int n, int n2, int n3) {
        int n4 = zpi.method_2dee76f_bzF(n, n2, n3);
        float f = 0.0625f;
        float f2 = (float)(1 + n4 * 2) / 16.0f;
        float f3 = 0.5f;
        this.method_eb14b51a_Dne(f2, 0.0f, f, 1.0f - f, f3, 1.0f - f);
    }

    @Override
    public boolean method_9cb39134_Dne(Qnq qnq, int n, int n2, int n3) {
        return !super.method_9cb39134_Dne(qnq, n, n2, n3) ? false : this.method_52f8ce31_a_(qnq, n, n2, n3);
    }

    @Override
    public bSp method_8c85fe2_Dne(Qnq qnq, int n, int n2, int n3) {
        int n4 = qnq.method_2dee76f_bzF(n, n2, n3);
        float f = 0.0625f;
        float f2 = (float)(1 + n4 * 2) / 16.0f;
        float f3 = 0.5f;
        return bSp.method_23186cf1_Dne().method_b4ea3e0c_Dne((float)n + f2, n2, (float)n3 + f, (float)(n + 1) - f, (float)n2 + f3 - f, (float)(n3 + 1) - f);
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        this.field_5e5f2002_Qnq = rbp.method_285881e4_Dne("cake_side");
        this.field_75bd7f28_bzF = rbp.method_285881e4_Dne("cake_inner");
        this.field_375b13b_Dne = rbp.method_285881e4_Dne("cake_top");
        this.field_202f7d1a_FWm = rbp.method_285881e4_Dne("cake_bottom");
    }

    @Override
    public boolean method_52f8ce31_a_(Qnq qnq, int n, int n2, int n3) {
        return qnq.method_d9802b31_Dne(n, n2 - 1, n3).method_7a46289e_Dne();
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return false;
    }
}

