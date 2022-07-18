package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class LRA
extends zKP {
    private final String field_569fcf45_Dne;

    @Override
    public boolean method_fbabf7f3_Dne(Zpi zpi, int n, int n2, int n3) {
        return false;
    }

    public LRA(int n, String string, KFd kFd) {
        super(n, kFd);
        this.field_569fcf45_Dne = string;
        this.method_82a88d64_Dne(JcN.field_2022bed6_FWm);
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return false;
    }

    public static boolean method_ce7f5dad_Dne(int n) {
        return n == zKP.field_ce2a1dc8_sly.field_21260d_FWm || n == zKP.field_d1c4fe0e_TpV.field_21260d_FWm;
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        this.field_5e5f2002_Qnq = rbp.method_285881e4_Dne(this.field_569fcf45_Dne);
    }

    @Override
    public boolean method_79d378f8_Dne(Zpi zpi, int n, int n2, int n3, int n4) {
        return true;
    }

    @Override
    public void method_1bbfa017_Dne(Qnq qnq, int n, int n2, int n3, bSp bSp2, List list, sMa sMa2) {
        boolean bl = this.method_8f2f2092_FWm(qnq, n, n2, n3 - 1);
        boolean bl2 = this.method_8f2f2092_FWm(qnq, n, n2, n3 + 1);
        boolean bl3 = this.method_8f2f2092_FWm(qnq, n - 1, n2, n3);
        boolean bl4 = this.method_8f2f2092_FWm(qnq, n + 1, n2, n3);
        float f = 0.375f;
        float f2 = 0.625f;
        float f3 = 0.375f;
        float f4 = 0.625f;
        if (bl) {
            f3 = 0.0f;
        }
        if (bl2) {
            f4 = 1.0f;
        }
        if (bl || bl2) {
            this.method_eb14b51a_Dne(f, 0.0f, f3, f2, 1.5f, f4);
            super.method_1bbfa017_Dne(qnq, n, n2, n3, bSp2, list, sMa2);
        }
        f3 = 0.375f;
        f4 = 0.625f;
        if (bl3) {
            f = 0.0f;
        }
        if (bl4) {
            f2 = 1.0f;
        }
        if (bl3 || bl4 || !bl && !bl2) {
            this.method_eb14b51a_Dne(f, 0.0f, f3, f2, 1.5f, f4);
            super.method_1bbfa017_Dne(qnq, n, n2, n3, bSp2, list, sMa2);
        }
        if (bl) {
            f3 = 0.0f;
        }
        if (bl2) {
            f4 = 1.0f;
        }
        this.method_eb14b51a_Dne(f, 0.0f, f3, f2, 1.0f, f4);
    }

    public boolean method_8f2f2092_FWm(Zpi zpi, int n, int n2, int n3) {
        int n4 = zpi.method_2c2cf7bc_Dne(n, n2, n3);
        if (n4 != this.field_21260d_FWm && n4 != zKP.field_b2a619d_mzX.field_21260d_FWm) {
            zKP zKP2 = zKP.field_8374b848_Dne[n4];
            return zKP2 != null && zKP2.field_368fd23_Dne.method_7ad38807_DyG() && zKP2.method_7a46289e_Dne() ? zKP2.field_368fd23_Dne != KFd.field_dd686a9b_Fnk : false;
        }
        return true;
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return false;
    }

    @Override
    public void method_fbabf7ef_Dne(Zpi zpi, int n, int n2, int n3) {
        boolean bl = this.method_8f2f2092_FWm(zpi, n, n2, n3 - 1);
        boolean bl2 = this.method_8f2f2092_FWm(zpi, n, n2, n3 + 1);
        boolean bl3 = this.method_8f2f2092_FWm(zpi, n - 1, n2, n3);
        boolean bl4 = this.method_8f2f2092_FWm(zpi, n + 1, n2, n3);
        float f = 0.375f;
        float f2 = 0.625f;
        float f3 = 0.375f;
        float f4 = 0.625f;
        if (bl) {
            f3 = 0.0f;
        }
        if (bl2) {
            f4 = 1.0f;
        }
        if (bl3) {
            f = 0.0f;
        }
        if (bl4) {
            f2 = 1.0f;
        }
        this.method_eb14b51a_Dne(f, 0.0f, f3, f2, 1.0f, f4);
    }

    @Override
    public int method_7a46288d_Dne() {
        return 11;
    }
}

