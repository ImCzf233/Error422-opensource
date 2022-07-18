package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public abstract class Oaf
extends zKP {
    protected final boolean field_2092bf_Dne;

    @Override
    public int method_7c6f602c_FWm() {
        return 0;
    }

    @Override
    public int method_7a46288d_Dne() {
        return 9;
    }

    public boolean method_907a9d25_Qnq() {
        return this.field_2092bf_Dne;
    }

    @Override
    public wHH method_acf3908a_Dne(Qnq qnq, int n, int n2, int n3, chN chN2, chN chN3) {
        this.method_fbabf7ef_Dne(qnq, n, n2, n3);
        return super.method_acf3908a_Dne(qnq, n, n2, n3, chN2, chN3);
    }

    public static final boolean method_ce7f5dad_Dne(int n) {
        return n == zKP.field_69989981_FYZ.field_21260d_FWm || n == zKP.field_39655694_OdI.field_21260d_FWm || n == zKP.field_d2bf3c9c_oIf.field_21260d_FWm || n == zKP.field_f674470_Dsg.field_21260d_FWm;
    }

    @Override
    public void method_9cb39130_Dne(Qnq qnq, int n, int n2, int n3) {
        if (!qnq.field_2d2a05_aFZ) {
            this.method_f9bf47a4_Dne(qnq, n, n2, n3, true);
            if (this.field_2092bf_Dne) {
                this.method_f9bf07d3_Dne(qnq, n, n2, n3, this.field_21260d_FWm);
            }
        }
    }

    @Override
    public bSp method_8c85fe2_Dne(Qnq qnq, int n, int n2, int n3) {
        return null;
    }

    @Override
    public void method_fbabf7ef_Dne(Zpi zpi, int n, int n2, int n3) {
        int n4 = zpi.method_2dee76f_bzF(n, n2, n3);
        if (n4 >= 2 && n4 <= 5) {
            this.method_eb14b51a_Dne(0.0f, 0.0f, 0.0f, 1.0f, 0.625f, 1.0f);
        } else {
            this.method_eb14b51a_Dne(0.0f, 0.0f, 0.0f, 1.0f, 0.125f, 1.0f);
        }
    }

    @Override
    public int method_cfc9daf9_Dne(Random random) {
        return 1;
    }

    protected void method_862abf73_Dne(Qnq qnq, int n, int n2, int n3, int n4, int n5, int n6) {
    }

    @Override
    public boolean method_9cb39134_Dne(Qnq qnq, int n, int n2, int n3) {
        return qnq.method_73e9b8f9_IjH(n, n2 - 1, n3);
    }

    protected void method_f9bf47a4_Dne(Qnq qnq, int n, int n2, int n3, boolean bl) {
        if (!qnq.field_2d2a05_aFZ) {
            new rKp(this, qnq, n, n2, n3).method_174c49a_Dne(qnq.method_6382f365_kGO(n, n2, n3), bl);
        }
    }

    protected Oaf(int n, boolean bl) {
        super(n, KFd.field_1efdede7_qLR);
        this.field_2092bf_Dne = bl;
        this.method_eb14b51a_Dne(0.0f, 0.0f, 0.0f, 1.0f, 0.125f, 1.0f);
        this.method_82a88d64_Dne(JcN.field_5e5261be_Qnq);
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return false;
    }

    @Override
    public void method_f9bf07d3_Dne(Qnq qnq, int n, int n2, int n3, int n4) {
        if (!qnq.field_2d2a05_aFZ) {
            int n5;
            int n6 = n5 = qnq.method_2dee76f_bzF(n, n2, n3);
            if (this.field_2092bf_Dne) {
                n6 = n5 & 7;
            }
            boolean bl = false;
            if (!qnq.method_73e9b8f9_IjH(n, n2 - 1, n3)) {
                bl = true;
            }
            if (n6 == 2 && !qnq.method_73e9b8f9_IjH(n + 1, n2, n3)) {
                bl = true;
            }
            if (n6 == 3 && !qnq.method_73e9b8f9_IjH(n - 1, n2, n3)) {
                bl = true;
            }
            if (n6 == 4 && !qnq.method_73e9b8f9_IjH(n, n2, n3 - 1)) {
                bl = true;
            }
            if (n6 == 5 && !qnq.method_73e9b8f9_IjH(n, n2, n3 + 1)) {
                bl = true;
            }
            if (bl) {
                this.method_fd7de26f_FWm(qnq, n, n2, n3, qnq.method_2dee76f_bzF(n, n2, n3), 0);
                qnq.method_2e7161e6_Qnq(n, n2, n3);
            } else {
                this.method_862abf73_Dne(qnq, n, n2, n3, n5, n6, n4);
            }
        }
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return false;
    }

    public static final boolean method_3036b9d3_FWm(Qnq qnq, int n, int n2, int n3) {
        return Oaf.method_ce7f5dad_Dne(qnq.method_2c2cf7bc_Dne(n, n2, n3));
    }

    @Override
    public void method_3e226590_Dne(Qnq qnq, int n, int n2, int n3, int n4, int n5) {
        int n6 = n5;
        if (this.field_2092bf_Dne) {
            n6 = n5 & 7;
        }
        super.method_3e226590_Dne(qnq, n, n2, n3, n4, n5);
        if (n6 == 2 || n6 == 3 || n6 == 4 || n6 == 5) {
            qnq.method_58fe7b07_bzF(n, n2 + 1, n3, n4);
        }
        if (this.field_2092bf_Dne) {
            qnq.method_58fe7b07_bzF(n, n2, n3, n4);
            qnq.method_58fe7b07_bzF(n, n2 - 1, n3, n4);
        }
    }
}

