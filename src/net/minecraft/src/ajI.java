package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public abstract class ajI
extends zKP {
    private String field_569fcf45_Dne;

    @Override
    public boolean method_7c6f603d_FWm() {
        return false;
    }

    protected abstract int method_143f9e0f_bzF(int var1);

    protected bSp method_d98ad1fb_Dne(int n, int n2, int n3) {
        float f = 0.125f;
        return bSp.method_23186cf1_Dne().method_b4ea3e0c_Dne((float)n + f, n2, (float)n3 + f, (float)(n + 1) - f, (double)n2 + 0.25, (float)(n3 + 1) - f);
    }

    @Override
    public void method_f9bf07d3_Dne(Qnq qnq, int n, int n2, int n3, int n4) {
        boolean bl = false;
        if (!qnq.method_73e9b8f9_IjH(n, n2 - 1, n3) && !LRA.method_ce7f5dad_Dne(qnq.method_2c2cf7bc_Dne(n, n2 - 1, n3))) {
            bl = true;
        }
        if (bl) {
            this.method_fd7de26f_FWm(qnq, n, n2, n3, qnq.method_2dee76f_bzF(n, n2, n3), 0);
            qnq.method_2e7161e6_Qnq(n, n2, n3);
        }
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        this.field_5e5f2002_Qnq = rbp.method_285881e4_Dne(this.field_569fcf45_Dne);
    }

    protected void method_3036b9cf_FWm(Qnq qnq, int n, int n2, int n3) {
        qnq.method_58fe7b07_bzF(n, n2, n3, this.field_21260d_FWm);
        qnq.method_58fe7b07_bzF(n, n2 - 1, n3, this.field_21260d_FWm);
    }

    @Override
    public void method_3e226590_Dne(Qnq qnq, int n, int n2, int n3, int n4, int n5) {
        if (this.method_aad4133f_a_(n5) > 0) {
            this.method_3036b9cf_FWm(qnq, n, n2, n3);
        }
        super.method_3e226590_Dne(qnq, n, n2, n3, n4, n5);
    }

    @Override
    public int method_79d378e7_Dne(Zpi zpi, int n, int n2, int n3, int n4) {
        return this.method_aad4133f_a_(zpi.method_2dee76f_bzF(n, n2, n3));
    }

    @Override
    public void method_fbabf7ef_Dne(Zpi zpi, int n, int n2, int n3) {
        this.method_ce7f5da9_Dne(zpi.method_2dee76f_bzF(n, n2, n3));
    }

    @Override
    public void method_7a46289a_Dne() {
        float f = 0.5f;
        float f2 = 0.125f;
        float f3 = 0.5f;
        this.method_eb14b51a_Dne(0.5f - f, 0.5f - f2, 0.5f - f3, 0.5f + f, 0.5f + f2, 0.5f + f3);
    }

    @Override
    public void method_8d285d4a_Dne(Qnq qnq, int n, int n2, int n3, sMa sMa2) {
        int n4;
        if (!qnq.field_2d2a05_aFZ && (n4 = this.method_aad4133f_a_(qnq.method_2dee76f_bzF(n, n2, n3))) == 0) {
            this.method_d6a0f314_FWm(qnq, n, n2, n3, n4);
        }
    }

    @Override
    public int method_83516086_Dne(Qnq qnq) {
        return 20;
    }

    @Override
    public boolean method_fbabf7f3_Dne(Zpi zpi, int n, int n2, int n3) {
        return true;
    }

    protected void method_ce7f5da9_Dne(int n) {
        boolean bl = this.method_aad4133f_a_(n) > 0;
        float f = 0.0625f;
        if (bl) {
            this.method_eb14b51a_Dne(f, 0.0f, f, 1.0f - f, 0.03125f, 1.0f - f);
        } else {
            this.method_eb14b51a_Dne(f, 0.0f, f, 1.0f - f, 0.0625f, 1.0f - f);
        }
    }

    @Override
    public void method_ca828a1c_Dne(Qnq qnq, int n, int n2, int n3, Random random) {
        int n4;
        if (!qnq.field_2d2a05_aFZ && (n4 = this.method_aad4133f_a_(qnq.method_2dee76f_bzF(n, n2, n3))) > 0) {
            this.method_d6a0f314_FWm(qnq, n, n2, n3, n4);
        }
    }

    protected abstract int method_aad4133f_a_(int var1);

    protected abstract int method_52f8ce20_a_(Qnq var1, int var2, int var3, int var4);

    @Override
    public boolean method_7a46289e_Dne() {
        return false;
    }

    protected void method_d6a0f314_FWm(Qnq qnq, int n, int n2, int n3, int n4) {
        boolean bl;
        int n5 = this.method_52f8ce20_a_(qnq, n, n2, n3);
        boolean bl2 = n4 > 0;
        boolean bl3 = bl = n5 > 0;
        if (n4 != n5) {
            qnq.method_d4dc89ed_Dne(n, n2, n3, this.method_143f9e0f_bzF(n5), 2);
            this.method_3036b9cf_FWm(qnq, n, n2, n3);
            qnq.method_c6b5263a_Dne(n, n2, n3, n, n2, n3);
        }
        if (!bl && bl2) {
            qnq.method_c961c6ee_Dne((double)n + 0.5, (double)n2 + 0.1, (double)n3 + 0.5, "random.click", 0.3f, 0.5f);
        } else if (bl && !bl2) {
            qnq.method_c961c6ee_Dne((double)n + 0.5, (double)n2 + 0.1, (double)n3 + 0.5, "random.click", 0.3f, 0.6f);
        }
        if (bl) {
            qnq.method_ae303daa_FWm(n, n2, n3, this.field_21260d_FWm, this.method_83516086_Dne(qnq));
        }
    }

    @Override
    public int method_7c6f602c_FWm() {
        return 1;
    }

    @Override
    public boolean method_ae128dcb_bzF() {
        return true;
    }

    @Override
    public bSp method_8c85fe2_Dne(Qnq qnq, int n, int n2, int n3) {
        return null;
    }

    protected ajI(int n, String string, KFd kFd) {
        super(n, kFd);
        this.field_569fcf45_Dne = string;
        this.method_82a88d64_Dne(JcN.field_75b0c0e4_bzF);
        this.method_21cbfe2c_Dne(true);
        this.method_ce7f5da9_Dne(this.method_143f9e0f_bzF(15));
    }

    @Override
    public boolean method_9cb39134_Dne(Qnq qnq, int n, int n2, int n3) {
        return qnq.method_73e9b8f9_IjH(n, n2 - 1, n3) || LRA.method_ce7f5dad_Dne(qnq.method_2c2cf7bc_Dne(n, n2 - 1, n3));
    }

    @Override
    public int method_56b56428_FWm(Zpi zpi, int n, int n2, int n3, int n4) {
        return n4 == 1 ? this.method_aad4133f_a_(zpi.method_2dee76f_bzF(n, n2, n3)) : 0;
    }
}

