package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class CRG
extends zKP {
    private final String field_d9a85c6_FWm;
    private final String field_569fcf45_Dne;
    private final boolean field_2092bf_Dne;
    private gDn field_375b13b_Dne;

    public gDn method_230f3f9a_Dne() {
        return this.field_375b13b_Dne;
    }

    protected CRG(int n, String string, String string2, KFd kFd, boolean bl) {
        super(n, kFd);
        this.field_569fcf45_Dne = string2;
        this.field_2092bf_Dne = bl;
        this.field_d9a85c6_FWm = string;
        this.method_82a88d64_Dne(JcN.field_2022bed6_FWm);
    }

    @Override
    public boolean method_79d378f8_Dne(Zpi zpi, int n, int n2, int n3, int n4) {
        int n5 = zpi.method_2c2cf7bc_Dne(n, n2, n3);
        return n5 == this.field_21260d_FWm ? false : super.method_79d378f8_Dne(zpi, n, n2, n3, n4);
    }

    @Override
    public void method_fbabf7ef_Dne(Zpi zpi, int n, int n2, int n3) {
        float f = 0.4375f;
        float f2 = 0.5625f;
        float f3 = 0.4375f;
        float f4 = 0.5625f;
        boolean bl = this.method_ce7f5dad_Dne(zpi.method_2c2cf7bc_Dne(n, n2, n3 - 1));
        boolean bl2 = this.method_ce7f5dad_Dne(zpi.method_2c2cf7bc_Dne(n, n2, n3 + 1));
        boolean bl3 = this.method_ce7f5dad_Dne(zpi.method_2c2cf7bc_Dne(n - 1, n2, n3));
        boolean bl4 = this.method_ce7f5dad_Dne(zpi.method_2c2cf7bc_Dne(n + 1, n2, n3));
        if ((!bl3 || !bl4) && (bl3 || bl4 || bl || bl2)) {
            if (bl3 && !bl4) {
                f = 0.0f;
            } else if (!bl3 && bl4) {
                f2 = 1.0f;
            }
        } else {
            f = 0.0f;
            f2 = 1.0f;
        }
        if ((!bl || !bl2) && (bl3 || bl4 || bl || bl2)) {
            if (bl && !bl2) {
                f3 = 0.0f;
            } else if (!bl && bl2) {
                f4 = 1.0f;
            }
        } else {
            f3 = 0.0f;
            f4 = 1.0f;
        }
        this.method_eb14b51a_Dne(f, 0.0f, f3, f2, 1.0f, f4);
    }

    public final boolean method_ce7f5dad_Dne(int n) {
        return zKP.field_4039e1b_FWm[n] || n == this.field_21260d_FWm || n == zKP.field_32988693_trS.field_21260d_FWm;
    }

    @Override
    public int method_7a46288d_Dne() {
        return 18;
    }

    @Override
    protected boolean method_a98a0664_aFZ() {
        return true;
    }

    @Override
    public void method_7a46289a_Dne() {
        this.method_eb14b51a_Dne(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        this.field_5e5f2002_Qnq = rbp.method_285881e4_Dne(this.field_d9a85c6_FWm);
        this.field_375b13b_Dne = rbp.method_285881e4_Dne(this.field_569fcf45_Dne);
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return false;
    }

    @Override
    protected NMq method_9e6e1a08_Dne(int n) {
        return new NMq(this.field_21260d_FWm, 1, n);
    }

    @Override
    public void method_1bbfa017_Dne(Qnq qnq, int n, int n2, int n3, bSp bSp2, List list, sMa sMa2) {
        boolean bl = this.method_ce7f5dad_Dne(qnq.method_2c2cf7bc_Dne(n, n2, n3 - 1));
        boolean bl2 = this.method_ce7f5dad_Dne(qnq.method_2c2cf7bc_Dne(n, n2, n3 + 1));
        boolean bl3 = this.method_ce7f5dad_Dne(qnq.method_2c2cf7bc_Dne(n - 1, n2, n3));
        boolean bl4 = this.method_ce7f5dad_Dne(qnq.method_2c2cf7bc_Dne(n + 1, n2, n3));
        if ((!bl3 || !bl4) && (bl3 || bl4 || bl || bl2)) {
            if (bl3 && !bl4) {
                this.method_eb14b51a_Dne(0.0f, 0.0f, 0.4375f, 0.5f, 1.0f, 0.5625f);
                super.method_1bbfa017_Dne(qnq, n, n2, n3, bSp2, list, sMa2);
            } else if (!bl3 && bl4) {
                this.method_eb14b51a_Dne(0.5f, 0.0f, 0.4375f, 1.0f, 1.0f, 0.5625f);
                super.method_1bbfa017_Dne(qnq, n, n2, n3, bSp2, list, sMa2);
            }
        } else {
            this.method_eb14b51a_Dne(0.0f, 0.0f, 0.4375f, 1.0f, 1.0f, 0.5625f);
            super.method_1bbfa017_Dne(qnq, n, n2, n3, bSp2, list, sMa2);
        }
        if ((!bl || !bl2) && (bl3 || bl4 || bl || bl2)) {
            if (bl && !bl2) {
                this.method_eb14b51a_Dne(0.4375f, 0.0f, 0.0f, 0.5625f, 1.0f, 0.5f);
                super.method_1bbfa017_Dne(qnq, n, n2, n3, bSp2, list, sMa2);
            } else if (!bl && bl2) {
                this.method_eb14b51a_Dne(0.4375f, 0.0f, 0.5f, 0.5625f, 1.0f, 1.0f);
                super.method_1bbfa017_Dne(qnq, n, n2, n3, bSp2, list, sMa2);
            }
        } else {
            this.method_eb14b51a_Dne(0.4375f, 0.0f, 0.0f, 0.5625f, 1.0f, 1.0f);
            super.method_1bbfa017_Dne(qnq, n, n2, n3, bSp2, list, sMa2);
        }
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return false;
    }

    @Override
    public int method_24763341_Dne(int n, Random random, int n2) {
        return !this.field_2092bf_Dne ? 0 : super.method_24763341_Dne(n, random, n2);
    }
}

