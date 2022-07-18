package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class dyC {
    public PJQ field_36b4fb5_Dne;
    private int field_2e5f1b_bzF;
    private int field_2d29f4_aFZ;
    private XHL field_36eea90_Dne = XHL.field_36eea90_Dne;
    public Qnq field_36c4f18_Dne;
    private int field_267cf5_Qnq;
    private int field_21260d_FWm;
    private int field_33448c_mrb = -1;
    private int field_2092ae_Dne;
    private int field_20b857_DyG;
    private boolean field_21261e_FWm;
    private boolean field_2092bf_Dne;
    private int field_2f0dd8_div;
    private int field_22c602_IjH;
    private int field_388da6_zGp;

    public void method_666eb1cc_FWm(XHL xHL) {
        if (this.field_36eea90_Dne == XHL.field_36eea90_Dne) {
            this.field_36eea90_Dne = xHL;
        }
        this.method_8d1afe0b_Dne(this.field_36eea90_Dne);
    }

    public boolean method_2c2cf7cd_Dne(int n, int n2, int n3) {
        if (this.field_36eea90_Dne.method_7a46289e_Dne() && !this.field_36b4fb5_Dne.method_a6aca7ce_FWm(n, n2, n3)) {
            return false;
        }
        int n4 = this.field_36c4f18_Dne.method_2c2cf7bc_Dne(n, n2, n3);
        int n5 = this.field_36c4f18_Dne.method_2dee76f_bzF(n, n2, n3);
        this.field_36c4f18_Dne.method_bfa54b80_Dne(this.field_36b4fb5_Dne, 2001, n, n2, n3, n4 + (this.field_36c4f18_Dne.method_2dee76f_bzF(n, n2, n3) << 12));
        boolean bl = this.method_a6aca7ce_FWm(n, n2, n3);
        if (this.method_7a46289e_Dne()) {
            this.field_36b4fb5_Dne.field_36dacd0_Dne.method_7be2fb8c_Dne(new cSs(n, n2, n3, this.field_36c4f18_Dne));
        } else {
            NMq nMq = this.field_36b4fb5_Dne.method_22900b26_bzF();
            boolean bl2 = this.field_36b4fb5_Dne.method_c74bdb2c_Dne(zKP.field_8374b848_Dne[n4]);
            if (nMq != null) {
                nMq.method_c5b1410a_Dne(this.field_36c4f18_Dne, n4, n, n2, n3, this.field_36b4fb5_Dne);
                if (nMq.field_2092ae_Dne == 0) {
                    this.field_36b4fb5_Dne.method_74d3fa75_BJH();
                }
            }
            if (bl && bl2) {
                zKP.field_8374b848_Dne[n4].method_e061540a_Dne(this.field_36c4f18_Dne, this.field_36b4fb5_Dne, n, n2, n3, n5);
            }
        }
        return bl;
    }

    public boolean method_7a46289e_Dne() {
        return this.field_36eea90_Dne.method_7c6f603d_FWm();
    }

    public dyC(Qnq qnq) {
        this.field_36c4f18_Dne = qnq;
    }

    public void method_2c2cf7c9_Dne(int n, int n2, int n3) {
        if (n == this.field_21260d_FWm && n2 == this.field_2e5f1b_bzF && n3 == this.field_267cf5_Qnq) {
            int n4 = this.field_2d29f4_aFZ - this.field_2092ae_Dne;
            int n5 = this.field_36c4f18_Dne.method_2c2cf7bc_Dne(n, n2, n3);
            if (n5 != 0) {
                zKP zKP2 = zKP.field_8374b848_Dne[n5];
                float f = zKP2.method_b4ebd429_Dne(this.field_36b4fb5_Dne, this.field_36b4fb5_Dne.field_36c4f18_Dne, n, n2, n3) * (float)(n4 + 1);
                if (f >= 0.7f) {
                    this.field_2092bf_Dne = false;
                    this.field_36c4f18_Dne.method_285a57e3_aFZ(this.field_36b4fb5_Dne.field_2d29f4_aFZ, n, n2, n3, -1);
                    this.method_2c2cf7cd_Dne(n, n2, n3);
                } else if (!this.field_21261e_FWm) {
                    this.field_2092bf_Dne = false;
                    this.field_21261e_FWm = true;
                    this.field_388da6_zGp = n;
                    this.field_20b857_DyG = n2;
                    this.field_2f0dd8_div = n3;
                    this.field_22c602_IjH = this.field_2092ae_Dne;
                }
            }
        }
    }

    public boolean method_dfecafdf_Dne(FiG fiG, Qnq qnq, NMq nMq, int n, int n2, int n3, int n4, float f, float f2, float f3) {
        int n5;
        if ((!fiG.method_a98a0664_aFZ() || fiG.method_23040479_Dne() == null) && (n5 = qnq.method_2c2cf7bc_Dne(n, n2, n3)) > 0 && zKP.field_8374b848_Dne[n5].method_cb53d52e_Dne(qnq, n, n2, n3, fiG, n4, f, f2, f3)) {
            return true;
        }
        if (nMq == null) {
            return false;
        }
        if (this.method_7a46289e_Dne()) {
            n5 = nMq.method_907a9d14_Qnq();
            int n6 = nMq.field_2092ae_Dne;
            boolean bl = nMq.method_2bdf899a_Dne(fiG, qnq, n, n2, n3, n4, f, f2, f3);
            nMq.method_ce7f5da9_Dne(n5);
            nMq.field_2092ae_Dne = n6;
            return bl;
        }
        return nMq.method_2bdf899a_Dne(fiG, qnq, n, n2, n3, n4, f, f2, f3);
    }

    public boolean method_d0db4f89_Dne(FiG fiG, Qnq qnq, NMq nMq) {
        int n = nMq.field_2092ae_Dne;
        int n2 = nMq.method_907a9d14_Qnq();
        NMq nMq2 = nMq.method_a9f2e429_Dne(qnq, fiG);
        if (nMq2 == nMq && (nMq2 == null || nMq2.field_2092ae_Dne == n && nMq2.method_d44b4585_zGp() <= 0 && nMq2.method_907a9d14_Qnq() == n2)) {
            return false;
        }
        fiG.field_36a059b_Dne.field_8360c375_Dne[fiG.field_36a059b_Dne.field_2092ae_Dne] = nMq2;
        if (this.method_7a46289e_Dne()) {
            nMq2.field_2092ae_Dne = n;
            if (nMq2.method_7c6f603d_FWm()) {
                nMq2.method_ce7f5da9_Dne(n2);
            }
        }
        if (nMq2.field_2092ae_Dne == 0) {
            fiG.field_36a059b_Dne.field_8360c375_Dne[fiG.field_36a059b_Dne.field_2092ae_Dne] = null;
        }
        if (!fiG.method_b6f3e1a2_haP()) {
            ((PJQ)fiG).method_8108cb59_Dne(fiG.field_36bb35e_Dne);
        }
        return true;
    }

    public XHL method_230878ef_Dne() {
        return this.field_36eea90_Dne;
    }

    public void method_7a46289a_Dne() {
        ++this.field_2d29f4_aFZ;
        if (this.field_21261e_FWm) {
            int n = this.field_2d29f4_aFZ - this.field_22c602_IjH;
            int n2 = this.field_36c4f18_Dne.method_2c2cf7bc_Dne(this.field_388da6_zGp, this.field_20b857_DyG, this.field_2f0dd8_div);
            if (n2 == 0) {
                this.field_21261e_FWm = false;
            } else {
                zKP zKP2 = zKP.field_8374b848_Dne[n2];
                float f = zKP2.method_b4ebd429_Dne(this.field_36b4fb5_Dne, this.field_36b4fb5_Dne.field_36c4f18_Dne, this.field_388da6_zGp, this.field_20b857_DyG, this.field_2f0dd8_div) * (float)(n + 1);
                int n3 = (int)(f * 10.0f);
                if (n3 != this.field_33448c_mrb) {
                    this.field_36c4f18_Dne.method_285a57e3_aFZ(this.field_36b4fb5_Dne.field_2d29f4_aFZ, this.field_388da6_zGp, this.field_20b857_DyG, this.field_2f0dd8_div, n3);
                    this.field_33448c_mrb = n3;
                }
                if (f >= 1.0f) {
                    this.field_21261e_FWm = false;
                    this.method_2c2cf7cd_Dne(this.field_388da6_zGp, this.field_20b857_DyG, this.field_2f0dd8_div);
                }
            }
        } else if (this.field_2092bf_Dne) {
            int n = this.field_36c4f18_Dne.method_2c2cf7bc_Dne(this.field_21260d_FWm, this.field_2e5f1b_bzF, this.field_267cf5_Qnq);
            zKP zKP3 = zKP.field_8374b848_Dne[n];
            if (zKP3 == null) {
                this.field_36c4f18_Dne.method_285a57e3_aFZ(this.field_36b4fb5_Dne.field_2d29f4_aFZ, this.field_21260d_FWm, this.field_2e5f1b_bzF, this.field_267cf5_Qnq, -1);
                this.field_33448c_mrb = -1;
                this.field_2092bf_Dne = false;
            } else {
                int n4 = this.field_2d29f4_aFZ - this.field_2092ae_Dne;
                float f = zKP3.method_b4ebd429_Dne(this.field_36b4fb5_Dne, this.field_36b4fb5_Dne.field_36c4f18_Dne, this.field_21260d_FWm, this.field_2e5f1b_bzF, this.field_267cf5_Qnq) * (float)(n4 + 1);
                int n5 = (int)(f * 10.0f);
                if (n5 != this.field_33448c_mrb) {
                    this.field_36c4f18_Dne.method_285a57e3_aFZ(this.field_36b4fb5_Dne.field_2d29f4_aFZ, this.field_21260d_FWm, this.field_2e5f1b_bzF, this.field_267cf5_Qnq, n5);
                    this.field_33448c_mrb = n5;
                }
            }
        }
    }

    public void method_8d1afe0b_Dne(XHL xHL) {
        this.field_36eea90_Dne = xHL;
        xHL.method_c0e591bc_Dne(this.field_36b4fb5_Dne.field_37cb681_Dne);
        this.field_36b4fb5_Dne.method_7ad38803_DyG();
    }

    public void method_5972745a_Dne(int n, int n2, int n3, int n4) {
        if (!this.field_36eea90_Dne.method_7a46289e_Dne() || this.field_36b4fb5_Dne.method_a6aca7ce_FWm(n, n2, n3)) {
            if (this.method_7a46289e_Dne()) {
                if (!this.field_36c4f18_Dne.method_8a4fa3e7_Dne(null, n, n2, n3, n4)) {
                    this.method_2c2cf7cd_Dne(n, n2, n3);
                }
            } else {
                this.field_36c4f18_Dne.method_8a4fa3e7_Dne(null, n, n2, n3, n4);
                this.field_2092ae_Dne = this.field_2d29f4_aFZ;
                float f = 1.0f;
                int n5 = this.field_36c4f18_Dne.method_2c2cf7bc_Dne(n, n2, n3);
                if (n5 > 0) {
                    zKP.field_8374b848_Dne[n5].method_41dd09cd_Dne(this.field_36c4f18_Dne, n, n2, n3, this.field_36b4fb5_Dne);
                    f = zKP.field_8374b848_Dne[n5].method_b4ebd429_Dne(this.field_36b4fb5_Dne, this.field_36b4fb5_Dne.field_36c4f18_Dne, n, n2, n3);
                }
                if (n5 > 0 && f >= 1.0f) {
                    this.method_2c2cf7cd_Dne(n, n2, n3);
                } else {
                    this.field_2092bf_Dne = true;
                    this.field_21260d_FWm = n;
                    this.field_2e5f1b_bzF = n2;
                    this.field_267cf5_Qnq = n3;
                    int n6 = (int)(f * 10.0f);
                    this.field_36c4f18_Dne.method_285a57e3_aFZ(this.field_36b4fb5_Dne.field_2d29f4_aFZ, n, n2, n3, n6);
                    this.field_33448c_mrb = n6;
                }
            }
        }
    }

    public void method_827c2e88_Dne(RAN rAN) {
        this.field_36c4f18_Dne = rAN;
    }

    private boolean method_a6aca7ce_FWm(int n, int n2, int n3) {
        zKP zKP2 = zKP.field_8374b848_Dne[this.field_36c4f18_Dne.method_2c2cf7bc_Dne(n, n2, n3)];
        int n4 = this.field_36c4f18_Dne.method_2dee76f_bzF(n, n2, n3);
        if (zKP2 != null) {
            zKP2.method_c5b1410a_Dne(this.field_36c4f18_Dne, n, n2, n3, n4, this.field_36b4fb5_Dne);
        }
        boolean bl = this.field_36c4f18_Dne.method_2e7161e6_Qnq(n, n2, n3);
        if (zKP2 != null && bl) {
            zKP2.method_35fd2546_bzF(this.field_36c4f18_Dne, n, n2, n3, n4);
        }
        return bl;
    }

    public void method_a6aca7ca_FWm(int n, int n2, int n3) {
        this.field_2092bf_Dne = false;
        this.field_36c4f18_Dne.method_285a57e3_aFZ(this.field_36b4fb5_Dne.field_2d29f4_aFZ, this.field_21260d_FWm, this.field_2e5f1b_bzF, this.field_267cf5_Qnq, -1);
    }
}

