package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public abstract class gvx
extends kbN {
    protected final boolean field_2092bf_Dne;

    protected int method_b611965a_bzF(Zpi zpi, int n, int n2, int n3, int n4) {
        return 15;
    }

    @Override
    public void method_ca7e4e57_Dne(Qnq qnq, int n, int n2, int n3, FUH fUH, NMq nMq) {
        int n4 = ((geR.method_117d0718_FWm((double)(fUH.field_334489_mrb * 4.0f / 360.0f) + 0.5) & 3) + 2) % 4;
        qnq.method_d4dc89ed_Dne(n, n2, n3, n4, 3);
        boolean bl = this.method_d6a0f318_FWm(qnq, n, n2, n3, n4);
        if (bl) {
            qnq.method_ae303daa_FWm(n, n2, n3, this.field_21260d_FWm, 1);
        }
    }

    protected int method_1d65b9e1_aFZ(Zpi zpi, int n, int n2, int n3, int n4) {
        int n5 = zpi.method_2c2cf7bc_Dne(n, n2, n3);
        return this.method_143f9e20_bzF(n5) ? (n5 == zKP.field_36e009c_Dne.field_21260d_FWm ? zpi.method_2dee76f_bzF(n, n2, n3) : zpi.method_2ee8c46c_FWm(n, n2, n3, n4)) : 0;
    }

    protected boolean method_ce7f5dad_Dne(int n) {
        return this.field_2092bf_Dne;
    }

    @Override
    public void method_9cb39130_Dne(Qnq qnq, int n, int n2, int n3) {
        this.method_5452795d_bzF(qnq, n, n2, n3);
    }

    public boolean method_8c35db9b_a_(Zpi zpi, int n, int n2, int n3, int n4) {
        return false;
    }

    @Override
    public gDn method_9051f17a_Dne(int n, int n2) {
        return n == 0 ? (this.field_2092bf_Dne ? zKP.field_3f9bd7dc_CZC.method_77cd08ea_FWm(n) : zKP.field_4821929c_iNQ.method_77cd08ea_FWm(n)) : (n == 1 ? this.field_5e5f2002_Qnq : zKP.field_3747682_Dne.method_77cd08ea_FWm(1));
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return false;
    }

    @Override
    public int method_56b56428_FWm(Zpi zpi, int n, int n2, int n3, int n4) {
        return this.method_79d378e7_Dne(zpi, n, n2, n3, n4);
    }

    @Override
    public boolean method_b51ddfb5_zGp(int n) {
        return this.method_87b738a7_aFZ(n);
    }

    protected abstract gvx method_f8864ca1_FWm();

    @Override
    public void method_35fd2546_bzF(Qnq qnq, int n, int n2, int n3, int n4) {
        if (this.field_2092bf_Dne) {
            qnq.method_58fe7b07_bzF(n + 1, n2, n3, this.field_21260d_FWm);
            qnq.method_58fe7b07_bzF(n - 1, n2, n3, this.field_21260d_FWm);
            qnq.method_58fe7b07_bzF(n, n2, n3 + 1, this.field_21260d_FWm);
            qnq.method_58fe7b07_bzF(n, n2, n3 - 1, this.field_21260d_FWm);
            qnq.method_58fe7b07_bzF(n, n2 - 1, n3, this.field_21260d_FWm);
            qnq.method_58fe7b07_bzF(n, n2 + 1, n3, this.field_21260d_FWm);
        }
        super.method_35fd2546_bzF(qnq, n, n2, n3, n4);
    }

    public boolean method_87b738a7_aFZ(int n) {
        return n == this.method_230ffc82_Dne().field_21260d_FWm || n == this.method_f8864ca1_FWm().field_21260d_FWm;
    }

    @Override
    public boolean method_9cb39134_Dne(Qnq qnq, int n, int n2, int n3) {
        return !qnq.method_73e9b8f9_IjH(n, n2 - 1, n3) ? false : super.method_9cb39134_Dne(qnq, n, n2, n3);
    }

    @Override
    public void method_f9bf07d3_Dne(Qnq qnq, int n, int n2, int n3, int n4) {
        if (!this.method_52f8ce31_a_(qnq, n, n2, n3)) {
            this.method_fd7de26f_FWm(qnq, n, n2, n3, qnq.method_2dee76f_bzF(n, n2, n3), 0);
            qnq.method_2e7161e6_Qnq(n, n2, n3);
            qnq.method_58fe7b07_bzF(n + 1, n2, n3, this.field_21260d_FWm);
            qnq.method_58fe7b07_bzF(n - 1, n2, n3, this.field_21260d_FWm);
            qnq.method_58fe7b07_bzF(n, n2, n3 + 1, this.field_21260d_FWm);
            qnq.method_58fe7b07_bzF(n, n2, n3 - 1, this.field_21260d_FWm);
            qnq.method_58fe7b07_bzF(n, n2 - 1, n3, this.field_21260d_FWm);
            qnq.method_58fe7b07_bzF(n, n2 + 1, n3, this.field_21260d_FWm);
        } else {
            this.method_d6a0f314_FWm(qnq, n, n2, n3, n4);
        }
    }

    @Override
    public int method_7a46288d_Dne() {
        return 36;
    }

    protected int method_143f9e0f_bzF(int n) {
        return this.method_aff29d1c_d_(n);
    }

    @Override
    public boolean method_79d378f8_Dne(Zpi zpi, int n, int n2, int n3, int n4) {
        return n4 != 0 && n4 != 1;
    }

    @Override
    public int method_79d378e7_Dne(Zpi zpi, int n, int n2, int n3, int n4) {
        int n5 = zpi.method_2dee76f_bzF(n, n2, n3);
        if (!this.method_ce7f5dad_Dne(n5)) {
            return 0;
        }
        int n6 = gvx.method_7ed979f5_Qnq(n5);
        return n6 == 0 && n4 == 3 ? this.method_b611965a_bzF(zpi, n, n2, n3, n5) : (n6 == 1 && n4 == 4 ? this.method_b611965a_bzF(zpi, n, n2, n3, n5) : (n6 == 2 && n4 == 2 ? this.method_b611965a_bzF(zpi, n, n2, n3, n5) : (n6 == 3 && n4 == 5 ? this.method_b611965a_bzF(zpi, n, n2, n3, n5) : 0)));
    }

    protected int method_d6a0f307_FWm(Qnq qnq, int n, int n2, int n3, int n4) {
        int n5;
        int n6 = gvx.method_7ed979f5_Qnq(n4);
        int n7 = n + zxJ.field_3f1c589_Dne[n6];
        int n8 = qnq.method_58fe7afa_bzF(n7, n2, n5 = n3 + zxJ.field_4039e0a_FWm[n6], zxJ.field_59d86bc_bzF[n6]);
        return n8 >= 15 ? n8 : Math.max(n8, qnq.method_2c2cf7bc_Dne(n7, n2, n5) == zKP.field_36e009c_Dne.field_21260d_FWm ? qnq.method_2dee76f_bzF(n7, n2, n5) : 0);
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return false;
    }

    public static boolean method_7ed97a06_Qnq(int n) {
        return zKP.field_37e22e0_Dne.method_87b738a7_aFZ(n) || zKP.field_36fe252_Dne.method_87b738a7_aFZ(n);
    }

    protected boolean method_143f9e20_bzF(int n) {
        zKP zKP2 = zKP.field_8374b848_Dne[n];
        return zKP2 != null && zKP2.method_ae128dcb_bzF();
    }

    protected void method_d6a0f314_FWm(Qnq qnq, int n, int n2, int n3, int n4) {
        int n5 = qnq.method_2dee76f_bzF(n, n2, n3);
        if (!this.method_8c35db9b_a_(qnq, n, n2, n3, n5)) {
            boolean bl = this.method_d6a0f318_FWm(qnq, n, n2, n3, n5);
            if ((this.field_2092bf_Dne && !bl || !this.field_2092bf_Dne && bl) && !qnq.method_58fe7b0b_bzF(n, n2, n3, this.field_21260d_FWm)) {
                int n6 = -1;
                if (this.method_35fd254a_bzF(qnq, n, n2, n3, n5)) {
                    n6 = -3;
                } else if (this.field_2092bf_Dne) {
                    n6 = -2;
                }
                qnq.method_17d7ea99_FWm(n, n2, n3, this.field_21260d_FWm, this.method_aff29d1c_d_(n5), n6);
            }
        }
    }

    protected abstract int method_aff29d1c_d_(int var1);

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        this.field_5e5f2002_Qnq = rbp.method_285881e4_Dne(this.field_2092bf_Dne ? "repeater_lit" : "repeater");
    }

    protected void method_5452795d_bzF(Qnq qnq, int n, int n2, int n3) {
        int n4 = gvx.method_7ed979f5_Qnq(qnq.method_2dee76f_bzF(n, n2, n3));
        if (n4 == 1) {
            qnq.method_9fbb4d61_Qnq(n + 1, n2, n3, this.field_21260d_FWm);
            qnq.method_d4dc89e9_Dne(n + 1, n2, n3, this.field_21260d_FWm, 4);
        }
        if (n4 == 3) {
            qnq.method_9fbb4d61_Qnq(n - 1, n2, n3, this.field_21260d_FWm);
            qnq.method_d4dc89e9_Dne(n - 1, n2, n3, this.field_21260d_FWm, 5);
        }
        if (n4 == 2) {
            qnq.method_9fbb4d61_Qnq(n, n2, n3 + 1, this.field_21260d_FWm);
            qnq.method_d4dc89e9_Dne(n, n2, n3 + 1, this.field_21260d_FWm, 2);
        }
        if (n4 == 0) {
            qnq.method_9fbb4d61_Qnq(n, n2, n3 - 1, this.field_21260d_FWm);
            qnq.method_d4dc89e9_Dne(n, n2, n3 - 1, this.field_21260d_FWm, 3);
        }
    }

    @Override
    public boolean method_52f8ce31_a_(Qnq qnq, int n, int n2, int n3) {
        return !qnq.method_73e9b8f9_IjH(n, n2 - 1, n3) ? false : super.method_52f8ce31_a_(qnq, n, n2, n3);
    }

    protected gvx(int n, boolean bl) {
        super(n, KFd.field_1efdede7_qLR);
        this.field_2092bf_Dne = bl;
        this.method_eb14b51a_Dne(0.0f, 0.0f, 0.0f, 1.0f, 0.125f, 1.0f);
    }

    @Override
    public boolean method_ae128dcb_bzF() {
        return true;
    }

    protected abstract gvx method_230ffc82_Dne();

    @Override
    public void method_ca828a1c_Dne(Qnq qnq, int n, int n2, int n3, Random random) {
        int n4 = qnq.method_2dee76f_bzF(n, n2, n3);
        if (!this.method_8c35db9b_a_(qnq, n, n2, n3, n4)) {
            boolean bl = this.method_d6a0f318_FWm(qnq, n, n2, n3, n4);
            if (this.field_2092bf_Dne && !bl) {
                qnq.method_17d7ea9d_FWm(n, n2, n3, this.method_f8864ca1_FWm().field_21260d_FWm, n4, 2);
            } else if (!this.field_2092bf_Dne) {
                qnq.method_17d7ea9d_FWm(n, n2, n3, this.method_230ffc82_Dne().field_21260d_FWm, n4, 2);
                if (!bl) {
                    qnq.method_17d7ea99_FWm(n, n2, n3, this.method_230ffc82_Dne().field_21260d_FWm, this.method_143f9e0f_bzF(n4), -1);
                }
            }
        }
    }

    public boolean method_35fd254a_bzF(Qnq qnq, int n, int n2, int n3, int n4) {
        int n5 = gvx.method_7ed979f5_Qnq(n4);
        if (gvx.method_7ed97a06_Qnq(qnq.method_2c2cf7bc_Dne(n - zxJ.field_3f1c589_Dne[n5], n2, n3 - zxJ.field_4039e0a_FWm[n5]))) {
            int n6 = qnq.method_2dee76f_bzF(n - zxJ.field_3f1c589_Dne[n5], n2, n3 - zxJ.field_4039e0a_FWm[n5]);
            int n7 = gvx.method_7ed979f5_Qnq(n6);
            return n7 != n5;
        }
        return false;
    }

    protected int method_381c2c40_Qnq(Zpi zpi, int n, int n2, int n3, int n4) {
        int n5 = gvx.method_7ed979f5_Qnq(n4);
        switch (n5) {
            case 0: 
            case 2: {
                return Math.max(this.method_1d65b9e1_aFZ(zpi, n - 1, n2, n3, 4), this.method_1d65b9e1_aFZ(zpi, n + 1, n2, n3, 5));
            }
            case 1: 
            case 3: {
                return Math.max(this.method_1d65b9e1_aFZ(zpi, n, n2, n3 + 1, 3), this.method_1d65b9e1_aFZ(zpi, n, n2, n3 - 1, 2));
            }
        }
        return 0;
    }

    protected boolean method_d6a0f318_FWm(Qnq qnq, int n, int n2, int n3, int n4) {
        return this.method_d6a0f307_FWm(qnq, n, n2, n3, n4) > 0;
    }
}

