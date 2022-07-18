package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public abstract class dNT
extends zKP {
    protected final boolean field_2092bf_Dne;

    @Override
    public void method_fbabf7ef_Dne(Zpi zpi, int n, int n2, int n3) {
        if (this.field_2092bf_Dne) {
            this.method_eb14b51a_Dne(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        } else {
            boolean bl;
            boolean bl2 = bl = (zpi.method_2dee76f_bzF(n, n2, n3) & 8) != 0;
            if (bl) {
                this.method_eb14b51a_Dne(0.0f, 0.5f, 0.0f, 1.0f, 1.0f, 1.0f);
            } else {
                this.method_eb14b51a_Dne(0.0f, 0.0f, 0.0f, 1.0f, 0.5f, 1.0f);
            }
        }
    }

    private static boolean method_ce7f5dad_Dne(int n) {
        return n == zKP.field_202e4261_FWm.field_21260d_FWm || n == zKP.field_5e5de549_Qnq.field_21260d_FWm;
    }

    @Override
    public void method_1bbfa017_Dne(Qnq qnq, int n, int n2, int n3, bSp bSp2, List list, sMa sMa2) {
        this.method_fbabf7ef_Dne(qnq, n, n2, n3);
        super.method_1bbfa017_Dne(qnq, n, n2, n3, bSp2, list, sMa2);
    }

    @Override
    public int method_9cb39123_Dne(Qnq qnq, int n, int n2, int n3) {
        return dNT.method_ce7f5dad_Dne(this.field_21260d_FWm) ? this.field_21260d_FWm : (this.field_21260d_FWm == zKP.field_3747682_Dne.field_21260d_FWm ? zKP.field_202e4261_FWm.field_21260d_FWm : (this.field_21260d_FWm == zKP.field_75bc446f_bzF.field_21260d_FWm ? zKP.field_5e5de549_Qnq.field_21260d_FWm : zKP.field_202e4261_FWm.field_21260d_FWm));
    }

    @Override
    public int method_cfc9daf9_Dne(Random random) {
        return this.field_2092bf_Dne ? 2 : 1;
    }

    public abstract String method_2c0e7e17_Dne(int var1);

    @Override
    public void method_7a46289a_Dne() {
        if (this.field_2092bf_Dne) {
            this.method_eb14b51a_Dne(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        } else {
            this.method_eb14b51a_Dne(0.0f, 0.0f, 0.0f, 1.0f, 0.5f, 1.0f);
        }
    }

    @Override
    public int method_a13ce189_Dne(Qnq qnq, int n, int n2, int n3, int n4, float f, float f2, float f3, int n5) {
        return this.field_2092bf_Dne ? n5 : (n4 != 0 && (n4 == 1 || (double)f2 <= 0.5) ? n5 : n5 | 8);
    }

    public dNT(int n, boolean bl, KFd kFd) {
        super(n, kFd);
        this.field_2092bf_Dne = bl;
        if (bl) {
            dNT.field_4039e1b_FWm[n] = true;
        } else {
            this.method_eb14b51a_Dne(0.0f, 0.0f, 0.0f, 1.0f, 0.5f, 1.0f);
        }
        this.method_9e820edb_Dne(255);
    }

    @Override
    public boolean method_79d378f8_Dne(Zpi zpi, int n, int n2, int n3, int n4) {
        boolean bl;
        if (this.field_2092bf_Dne) {
            return super.method_79d378f8_Dne(zpi, n, n2, n3, n4);
        }
        if (n4 != 1 && n4 != 0 && !super.method_79d378f8_Dne(zpi, n, n2, n3, n4)) {
            return false;
        }
        int n5 = n + rrP.field_4039e0a_FWm[rrP.field_3f1c589_Dne[n4]];
        int n6 = n2 + rrP.field_59d86bc_bzF[rrP.field_3f1c589_Dne[n4]];
        int n7 = n3 + rrP.field_4a92422_Qnq[rrP.field_3f1c589_Dne[n4]];
        boolean bl2 = bl = (zpi.method_2dee76f_bzF(n5, n6, n7) & 8) != 0;
        return bl ? (n4 == 0 ? true : (n4 == 1 && super.method_79d378f8_Dne(zpi, n, n2, n3, n4) ? true : !dNT.method_ce7f5dad_Dne(zpi.method_2c2cf7bc_Dne(n, n2, n3)) || (zpi.method_2dee76f_bzF(n, n2, n3) & 8) == 0)) : (n4 == 1 ? true : (n4 == 0 && super.method_79d378f8_Dne(zpi, n, n2, n3, n4) ? true : !dNT.method_ce7f5dad_Dne(zpi.method_2c2cf7bc_Dne(n, n2, n3)) || (zpi.method_2dee76f_bzF(n, n2, n3) & 8) != 0));
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return this.field_2092bf_Dne;
    }

    @Override
    public int method_3036b9c2_FWm(Qnq qnq, int n, int n2, int n3) {
        return super.method_3036b9c2_FWm(qnq, n, n2, n3) & 7;
    }

    @Override
    public int method_ce7f5d9c_Dne(int n) {
        return n & 7;
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return this.field_2092bf_Dne;
    }
}

