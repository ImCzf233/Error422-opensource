package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class Fnk {
    protected gwq field_f0a83003_zGp;
    protected int field_2f0dd8_div;
    protected gwq field_5e5fdfd2_Qnq;
    protected int field_29186d_XHL;
    protected int field_2e5f1b_bzF;
    protected gwq field_35d5d1f4_ATE;
    protected gwq field_1c37ff4a_XHL;
    protected Qnq field_36c4f18_Dne;
    protected gwq field_1f0b61cf_qLR;
    protected gwq field_af071986_udO;
    protected gwq field_5c6da5f_IjH;
    protected gwq field_ab2f35c1_ooe;
    protected int field_267cf5_Qnq;
    protected int field_2a9ad6_Zpi;
    protected int field_2092ae_Dne;
    protected gwq field_a226a273_kGO;
    protected int field_36b0a9_udO;
    protected int field_22c602_IjH;
    protected int field_21260d_FWm;
    protected int field_33448c_mrb;
    protected OdI field_36b3bf8_Dne;
    protected gwq field_32908cb1_trS;
    protected gwq field_71a586da_Vxn;
    protected gwq field_376710b_Dne = new Kmf(4);
    protected gwq field_7139f551_aFZ;
    protected gwq field_61702533_Zpi;
    protected Random field_7331eae7_Dne;
    protected gwq field_16299a34_DyG;
    protected gwq field_20303cea_FWm;
    protected int field_388da6_zGp;
    protected int field_20b857_DyG;
    protected gwq field_75be3ef8_bzF;
    protected gwq field_750103e9_mrb;
    protected int field_2d29f4_aFZ;
    protected gwq field_141f4735_div;
    public boolean field_2092bf_Dne;
    protected int field_31b816_kGO;

    protected void method_7c6f6039_FWm() {
        this.method_9c1ea4b7_Dne(20, this.field_5e5fdfd2_Qnq, 0, 128);
        this.method_9c1ea4b7_Dne(10, this.field_7139f551_aFZ, 0, 128);
        this.method_9c1ea4b7_Dne(20, this.field_f0a83003_zGp, 0, 128);
        this.method_9c1ea4b7_Dne(20, this.field_16299a34_DyG, 0, 64);
        this.method_9c1ea4b7_Dne(2, this.field_141f4735_div, 0, 32);
        this.method_9c1ea4b7_Dne(8, this.field_5c6da5f_IjH, 0, 16);
        this.method_9c1ea4b7_Dne(1, this.field_750103e9_mrb, 0, 16);
        this.method_2fa1cd56_FWm(1, this.field_1c37ff4a_XHL, 16, 16);
    }

    protected void method_9c1ea4b7_Dne(int n, gwq gwq2, int n2, int n3) {
        for (int i = 0; i < n; ++i) {
            int n4 = this.field_2092ae_Dne + this.field_7331eae7_Dne.nextInt(16);
            int n5 = this.field_7331eae7_Dne.nextInt(n3 - n2) + n2;
            int n6 = this.field_21260d_FWm + this.field_7331eae7_Dne.nextInt(16);
            gwq2.method_c3e4cb88_Dne(this.field_36c4f18_Dne, this.field_7331eae7_Dne, n4, n5, n6);
        }
    }

    public void method_37de135f_Dne(Qnq qnq, Random random, int n, int n2) {
        if (this.field_36c4f18_Dne != null) {
            throw new RuntimeException("Already decorating!!");
        }
        this.field_36c4f18_Dne = qnq;
        this.field_7331eae7_Dne = random;
        this.field_2092ae_Dne = n;
        this.field_21260d_FWm = n2;
        this.method_7a46289a_Dne();
        this.field_36c4f18_Dne = null;
        this.field_7331eae7_Dne = null;
    }

    protected void method_7a46289a_Dne() {
        int n;
        int n2;
        int n3;
        int n4;
        this.method_7c6f6039_FWm();
        for (n4 = 0; n4 < this.field_2a9ad6_Zpi; ++n4) {
            n3 = this.field_2092ae_Dne + this.field_7331eae7_Dne.nextInt(16) + 8;
            n2 = this.field_21260d_FWm + this.field_7331eae7_Dne.nextInt(16) + 8;
            this.field_20303cea_FWm.method_c3e4cb88_Dne(this.field_36c4f18_Dne, this.field_7331eae7_Dne, n3, this.field_36c4f18_Dne.method_6f304eb3_aFZ(n3, n2), n2);
        }
        for (n4 = 0; n4 < this.field_31b816_kGO; ++n4) {
            n3 = this.field_2092ae_Dne + this.field_7331eae7_Dne.nextInt(16) + 8;
            n2 = this.field_21260d_FWm + this.field_7331eae7_Dne.nextInt(16) + 8;
            this.field_376710b_Dne.method_c3e4cb88_Dne(this.field_36c4f18_Dne, this.field_7331eae7_Dne, n3, this.field_36c4f18_Dne.method_6f304eb3_aFZ(n3, n2), n2);
        }
        for (n4 = 0; n4 < this.field_29186d_XHL; ++n4) {
            n3 = this.field_2092ae_Dne + this.field_7331eae7_Dne.nextInt(16) + 8;
            n2 = this.field_21260d_FWm + this.field_7331eae7_Dne.nextInt(16) + 8;
            this.field_20303cea_FWm.method_c3e4cb88_Dne(this.field_36c4f18_Dne, this.field_7331eae7_Dne, n3, this.field_36c4f18_Dne.method_6f304eb3_aFZ(n3, n2), n2);
        }
        n4 = this.field_267cf5_Qnq;
        if (this.field_7331eae7_Dne.nextInt(10) == 0) {
            ++n4;
        }
        for (n3 = 0; n3 < n4; ++n3) {
            n2 = this.field_2092ae_Dne + this.field_7331eae7_Dne.nextInt(16) + 8;
            n = this.field_21260d_FWm + this.field_7331eae7_Dne.nextInt(16) + 8;
            gwq gwq2 = this.field_36b3bf8_Dne.method_d15c9bd6_Dne(this.field_7331eae7_Dne);
            gwq2.method_2be429a4_Dne(1.0, 1.0, 1.0);
            gwq2.method_c3e4cb88_Dne(this.field_36c4f18_Dne, this.field_7331eae7_Dne, n2, this.field_36c4f18_Dne.method_1e26964c_FWm(n2, n), n);
        }
        for (n3 = 0; n3 < this.field_36b0a9_udO; ++n3) {
            n2 = this.field_2092ae_Dne + this.field_7331eae7_Dne.nextInt(16) + 8;
            n = this.field_21260d_FWm + this.field_7331eae7_Dne.nextInt(16) + 8;
            this.field_32908cb1_trS.method_c3e4cb88_Dne(this.field_36c4f18_Dne, this.field_7331eae7_Dne, n2, this.field_36c4f18_Dne.method_1e26964c_FWm(n2, n), n);
        }
        for (n3 = 0; n3 < this.field_2d29f4_aFZ; ++n3) {
            n2 = this.field_2092ae_Dne + this.field_7331eae7_Dne.nextInt(16) + 8;
            n = this.field_7331eae7_Dne.nextInt(128);
            int n5 = this.field_21260d_FWm + this.field_7331eae7_Dne.nextInt(16) + 8;
            this.field_61702533_Zpi.method_c3e4cb88_Dne(this.field_36c4f18_Dne, this.field_7331eae7_Dne, n2, n, n5);
            if (this.field_7331eae7_Dne.nextInt(4) != 0) continue;
            n2 = this.field_2092ae_Dne + this.field_7331eae7_Dne.nextInt(16) + 8;
            n = this.field_7331eae7_Dne.nextInt(128);
            n5 = this.field_21260d_FWm + this.field_7331eae7_Dne.nextInt(16) + 8;
            this.field_a226a273_kGO.method_c3e4cb88_Dne(this.field_36c4f18_Dne, this.field_7331eae7_Dne, n2, n, n5);
        }
        for (n3 = 0; n3 < this.field_388da6_zGp; ++n3) {
            n2 = this.field_2092ae_Dne + this.field_7331eae7_Dne.nextInt(16) + 8;
            n = this.field_7331eae7_Dne.nextInt(128);
            int n6 = this.field_21260d_FWm + this.field_7331eae7_Dne.nextInt(16) + 8;
            gwq gwq3 = this.field_36b3bf8_Dne.method_9b80c235_FWm(this.field_7331eae7_Dne);
            gwq3.method_c3e4cb88_Dne(this.field_36c4f18_Dne, this.field_7331eae7_Dne, n2, n, n6);
        }
        for (n3 = 0; n3 < this.field_20b857_DyG; ++n3) {
            n2 = this.field_2092ae_Dne + this.field_7331eae7_Dne.nextInt(16) + 8;
            n = this.field_7331eae7_Dne.nextInt(128);
            int n7 = this.field_21260d_FWm + this.field_7331eae7_Dne.nextInt(16) + 8;
            new Sdr(zKP.field_373e079_Dne.field_21260d_FWm).method_c3e4cb88_Dne(this.field_36c4f18_Dne, this.field_7331eae7_Dne, n2, n, n7);
        }
        for (n3 = 0; n3 < this.field_2e5f1b_bzF; ++n3) {
            int n8;
            n2 = this.field_2092ae_Dne + this.field_7331eae7_Dne.nextInt(16) + 8;
            n = this.field_21260d_FWm + this.field_7331eae7_Dne.nextInt(16) + 8;
            for (n8 = this.field_7331eae7_Dne.nextInt(128); n8 > 0 && this.field_36c4f18_Dne.method_2c2cf7bc_Dne(n2, n8 - 1, n) == 0; --n8) {
            }
            this.field_71a586da_Vxn.method_c3e4cb88_Dne(this.field_36c4f18_Dne, this.field_7331eae7_Dne, n2, n8, n);
        }
        for (n3 = 0; n3 < this.field_2f0dd8_div; ++n3) {
            int n9;
            if (this.field_7331eae7_Dne.nextInt(4) == 0) {
                n2 = this.field_2092ae_Dne + this.field_7331eae7_Dne.nextInt(16) + 8;
                n = this.field_21260d_FWm + this.field_7331eae7_Dne.nextInt(16) + 8;
                n9 = this.field_36c4f18_Dne.method_1e26964c_FWm(n2, n);
                this.field_af071986_udO.method_c3e4cb88_Dne(this.field_36c4f18_Dne, this.field_7331eae7_Dne, n2, n9, n);
            }
            if (this.field_7331eae7_Dne.nextInt(8) != 0) continue;
            n2 = this.field_2092ae_Dne + this.field_7331eae7_Dne.nextInt(16) + 8;
            n = this.field_21260d_FWm + this.field_7331eae7_Dne.nextInt(16) + 8;
            n9 = this.field_7331eae7_Dne.nextInt(128);
            this.field_ab2f35c1_ooe.method_c3e4cb88_Dne(this.field_36c4f18_Dne, this.field_7331eae7_Dne, n2, n9, n);
        }
        if (this.field_7331eae7_Dne.nextInt(4) == 0) {
            n3 = this.field_2092ae_Dne + this.field_7331eae7_Dne.nextInt(16) + 8;
            n2 = this.field_7331eae7_Dne.nextInt(128);
            n = this.field_21260d_FWm + this.field_7331eae7_Dne.nextInt(16) + 8;
            this.field_af071986_udO.method_c3e4cb88_Dne(this.field_36c4f18_Dne, this.field_7331eae7_Dne, n3, n2, n);
        }
        if (this.field_7331eae7_Dne.nextInt(8) == 0) {
            n3 = this.field_2092ae_Dne + this.field_7331eae7_Dne.nextInt(16) + 8;
            n2 = this.field_7331eae7_Dne.nextInt(128);
            n = this.field_21260d_FWm + this.field_7331eae7_Dne.nextInt(16) + 8;
            this.field_ab2f35c1_ooe.method_c3e4cb88_Dne(this.field_36c4f18_Dne, this.field_7331eae7_Dne, n3, n2, n);
        }
        for (n3 = 0; n3 < this.field_22c602_IjH; ++n3) {
            n2 = this.field_2092ae_Dne + this.field_7331eae7_Dne.nextInt(16) + 8;
            n = this.field_21260d_FWm + this.field_7331eae7_Dne.nextInt(16) + 8;
            int n10 = this.field_7331eae7_Dne.nextInt(128);
            this.field_1f0b61cf_qLR.method_c3e4cb88_Dne(this.field_36c4f18_Dne, this.field_7331eae7_Dne, n2, n10, n);
        }
        for (n3 = 0; n3 < 10; ++n3) {
            n2 = this.field_2092ae_Dne + this.field_7331eae7_Dne.nextInt(16) + 8;
            n = this.field_7331eae7_Dne.nextInt(128);
            int n11 = this.field_21260d_FWm + this.field_7331eae7_Dne.nextInt(16) + 8;
            this.field_1f0b61cf_qLR.method_c3e4cb88_Dne(this.field_36c4f18_Dne, this.field_7331eae7_Dne, n2, n, n11);
        }
        if (this.field_7331eae7_Dne.nextInt(32) == 0) {
            n3 = this.field_2092ae_Dne + this.field_7331eae7_Dne.nextInt(16) + 8;
            n2 = this.field_7331eae7_Dne.nextInt(128);
            n = this.field_21260d_FWm + this.field_7331eae7_Dne.nextInt(16) + 8;
            new ocu_0().method_c3e4cb88_Dne(this.field_36c4f18_Dne, this.field_7331eae7_Dne, n3, n2, n);
        }
        for (n3 = 0; n3 < this.field_33448c_mrb; ++n3) {
            n2 = this.field_2092ae_Dne + this.field_7331eae7_Dne.nextInt(16) + 8;
            n = this.field_7331eae7_Dne.nextInt(128);
            int n12 = this.field_21260d_FWm + this.field_7331eae7_Dne.nextInt(16) + 8;
            this.field_35d5d1f4_ATE.method_c3e4cb88_Dne(this.field_36c4f18_Dne, this.field_7331eae7_Dne, n2, n, n12);
        }
        if (this.field_2092bf_Dne) {
            for (n3 = 0; n3 < 50; ++n3) {
                n2 = this.field_2092ae_Dne + this.field_7331eae7_Dne.nextInt(16) + 8;
                n = this.field_7331eae7_Dne.nextInt(this.field_7331eae7_Dne.nextInt(120) + 8);
                int n13 = this.field_21260d_FWm + this.field_7331eae7_Dne.nextInt(16) + 8;
                new ZkM(zKP.field_374330f_Dne.field_21260d_FWm).method_c3e4cb88_Dne(this.field_36c4f18_Dne, this.field_7331eae7_Dne, n2, n, n13);
            }
            for (n3 = 0; n3 < 20; ++n3) {
                n2 = this.field_2092ae_Dne + this.field_7331eae7_Dne.nextInt(16) + 8;
                n = this.field_7331eae7_Dne.nextInt(this.field_7331eae7_Dne.nextInt(this.field_7331eae7_Dne.nextInt(112) + 8) + 8);
                int n14 = this.field_21260d_FWm + this.field_7331eae7_Dne.nextInt(16) + 8;
                new ZkM(zKP.field_202dfeee_FWm.field_21260d_FWm).method_c3e4cb88_Dne(this.field_36c4f18_Dne, this.field_7331eae7_Dne, n2, n, n14);
            }
        }
    }

    public Fnk(OdI odI) {
        this.field_20303cea_FWm = new dBc(7, zKP.field_5ced441_IjH.field_21260d_FWm);
        this.field_75be3ef8_bzF = new dBc(6, zKP.field_7508fdcb_mrb.field_21260d_FWm);
        this.field_5e5fdfd2_Qnq = new uzC(zKP.field_203836cc_FWm.field_21260d_FWm, 32);
        this.field_7139f551_aFZ = new uzC(zKP.field_7508fdcb_mrb.field_21260d_FWm, 32);
        this.field_f0a83003_zGp = new uzC(zKP.field_a22e9c55_kGO.field_21260d_FWm, 16);
        this.field_16299a34_DyG = new uzC(zKP.field_61781f15_Zpi.field_21260d_FWm, 8);
        this.field_141f4735_div = new uzC(zKP.field_1c3ff92c_XHL.field_21260d_FWm, 8);
        this.field_5c6da5f_IjH = new uzC(zKP.field_390036e3_JLG.field_21260d_FWm, 7);
        this.field_750103e9_mrb = new uzC(zKP.field_5fd56c22_ZgS.field_21260d_FWm, 7);
        this.field_1c37ff4a_XHL = new uzC(zKP.field_1f135bb1_qLR.field_21260d_FWm, 6);
        this.field_61702533_Zpi = new LDH(zKP.field_3769521_Dne.field_21260d_FWm);
        this.field_a226a273_kGO = new LDH(zKP.field_20306100_FWm.field_21260d_FWm);
        this.field_af071986_udO = new LDH(zKP.field_75be630e_bzF.field_21260d_FWm);
        this.field_ab2f35c1_ooe = new LDH(zKP.field_5e6003e8_Qnq.field_21260d_FWm);
        this.field_32908cb1_trS = new yIR();
        this.field_1f0b61cf_qLR = new EYV();
        this.field_35d5d1f4_ATE = new iXU();
        this.field_71a586da_Vxn = new ICU();
        this.field_2e5f1b_bzF = 0;
        this.field_267cf5_Qnq = 0;
        this.field_2d29f4_aFZ = 2;
        this.field_388da6_zGp = 1;
        this.field_20b857_DyG = 0;
        this.field_2f0dd8_div = 0;
        this.field_22c602_IjH = 0;
        this.field_33448c_mrb = 0;
        this.field_29186d_XHL = 1;
        this.field_2a9ad6_Zpi = 3;
        this.field_31b816_kGO = 1;
        this.field_36b0a9_udO = 0;
        this.field_2092bf_Dne = true;
        this.field_36b3bf8_Dne = odI;
    }

    protected void method_2fa1cd56_FWm(int n, gwq gwq2, int n2, int n3) {
        for (int i = 0; i < n; ++i) {
            int n4 = this.field_2092ae_Dne + this.field_7331eae7_Dne.nextInt(16);
            int n5 = this.field_7331eae7_Dne.nextInt(n3) + this.field_7331eae7_Dne.nextInt(n3) + (n2 - n3);
            int n6 = this.field_21260d_FWm + this.field_7331eae7_Dne.nextInt(16);
            gwq2.method_c3e4cb88_Dne(this.field_36c4f18_Dne, this.field_7331eae7_Dne, n4, n5, n6);
        }
    }
}

