package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class YlD
extends zKP {
    @Override
    public int method_7a46288d_Dne() {
        return 12;
    }

    protected YlD(int n) {
        super(n, KFd.field_1efdede7_qLR);
        this.method_82a88d64_Dne(JcN.field_75b0c0e4_bzF);
    }

    public static int method_143f9e0f_bzF(int n) {
        switch (n) {
            case 0: {
                return 0;
            }
            case 1: {
                return 5;
            }
            case 2: {
                return 4;
            }
            case 3: {
                return 3;
            }
            case 4: {
                return 2;
            }
            case 5: {
                return 1;
            }
        }
        return -1;
    }

    @Override
    public boolean method_9cb39134_Dne(Qnq qnq, int n, int n2, int n3) {
        return qnq.method_6fdef3c4_DyG(n - 1, n2, n3) ? true : (qnq.method_6fdef3c4_DyG(n + 1, n2, n3) ? true : (qnq.method_6fdef3c4_DyG(n, n2, n3 - 1) ? true : (qnq.method_6fdef3c4_DyG(n, n2, n3 + 1) ? true : (qnq.method_73e9b8f9_IjH(n, n2 - 1, n3) ? true : qnq.method_6fdef3c4_DyG(n, n2 + 1, n3)))));
    }

    @Override
    public int method_79d378e7_Dne(Zpi zpi, int n, int n2, int n3, int n4) {
        return (zpi.method_2dee76f_bzF(n, n2, n3) & 8) > 0 ? 15 : 0;
    }

    @Override
    public void method_3e226590_Dne(Qnq qnq, int n, int n2, int n3, int n4, int n5) {
        if ((n5 & 8) > 0) {
            qnq.method_58fe7b07_bzF(n, n2, n3, this.field_21260d_FWm);
            int n6 = n5 & 7;
            if (n6 == 1) {
                qnq.method_58fe7b07_bzF(n - 1, n2, n3, this.field_21260d_FWm);
            } else if (n6 == 2) {
                qnq.method_58fe7b07_bzF(n + 1, n2, n3, this.field_21260d_FWm);
            } else if (n6 == 3) {
                qnq.method_58fe7b07_bzF(n, n2, n3 - 1, this.field_21260d_FWm);
            } else if (n6 == 4) {
                qnq.method_58fe7b07_bzF(n, n2, n3 + 1, this.field_21260d_FWm);
            } else if (n6 != 5 && n6 != 6) {
                if (n6 == 0 || n6 == 7) {
                    qnq.method_58fe7b07_bzF(n, n2 + 1, n3, this.field_21260d_FWm);
                }
            } else {
                qnq.method_58fe7b07_bzF(n, n2 - 1, n3, this.field_21260d_FWm);
            }
        }
        super.method_3e226590_Dne(qnq, n, n2, n3, n4, n5);
    }

    @Override
    public bSp method_8c85fe2_Dne(Qnq qnq, int n, int n2, int n3) {
        return null;
    }

    @Override
    public int method_a13ce189_Dne(Qnq qnq, int n, int n2, int n3, int n4, float f, float f2, float f3, int n5) {
        int n6 = n5 & 8;
        int n7 = n5 & 7;
        int n8 = -1;
        if (n4 == 0 && qnq.method_6fdef3c4_DyG(n, n2 + 1, n3)) {
            n8 = 0;
        }
        if (n4 == 1 && qnq.method_73e9b8f9_IjH(n, n2 - 1, n3)) {
            n8 = 5;
        }
        if (n4 == 2 && qnq.method_6fdef3c4_DyG(n, n2, n3 + 1)) {
            n8 = 4;
        }
        if (n4 == 3 && qnq.method_6fdef3c4_DyG(n, n2, n3 - 1)) {
            n8 = 3;
        }
        if (n4 == 4 && qnq.method_6fdef3c4_DyG(n + 1, n2, n3)) {
            n8 = 2;
        }
        if (n4 == 5 && qnq.method_6fdef3c4_DyG(n - 1, n2, n3)) {
            n8 = 1;
        }
        return n8 + n6;
    }

    @Override
    public void method_ca7e4e57_Dne(Qnq qnq, int n, int n2, int n3, FUH fUH, NMq nMq) {
        int n4 = qnq.method_2dee76f_bzF(n, n2, n3);
        int n5 = n4 & 7;
        int n6 = n4 & 8;
        if (n5 == YlD.method_143f9e0f_bzF(1)) {
            if ((geR.method_117d0718_FWm((double)(fUH.field_334489_mrb * 4.0f / 360.0f) + 0.5) & 1) == 0) {
                qnq.method_d4dc89ed_Dne(n, n2, n3, 5 | n6, 2);
            } else {
                qnq.method_d4dc89ed_Dne(n, n2, n3, 6 | n6, 2);
            }
        } else if (n5 == YlD.method_143f9e0f_bzF(0)) {
            if ((geR.method_117d0718_FWm((double)(fUH.field_334489_mrb * 4.0f / 360.0f) + 0.5) & 1) == 0) {
                qnq.method_d4dc89ed_Dne(n, n2, n3, 7 | n6, 2);
            } else {
                qnq.method_d4dc89ed_Dne(n, n2, n3, 0 | n6, 2);
            }
        }
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

    @Override
    public boolean method_f9bf07d7_Dne(Qnq qnq, int n, int n2, int n3, int n4) {
        return n4 == 0 && qnq.method_6fdef3c4_DyG(n, n2 + 1, n3) ? true : (n4 == 1 && qnq.method_73e9b8f9_IjH(n, n2 - 1, n3) ? true : (n4 == 2 && qnq.method_6fdef3c4_DyG(n, n2, n3 + 1) ? true : (n4 == 3 && qnq.method_6fdef3c4_DyG(n, n2, n3 - 1) ? true : (n4 == 4 && qnq.method_6fdef3c4_DyG(n + 1, n2, n3) ? true : n4 == 5 && qnq.method_6fdef3c4_DyG(n - 1, n2, n3)))));
    }

    @Override
    public void method_fbabf7ef_Dne(Zpi zpi, int n, int n2, int n3) {
        int n4 = zpi.method_2dee76f_bzF(n, n2, n3) & 7;
        float f = 0.1875f;
        if (n4 == 1) {
            this.method_eb14b51a_Dne(0.0f, 0.2f, 0.5f - f, f * 2.0f, 0.8f, 0.5f + f);
        } else if (n4 == 2) {
            this.method_eb14b51a_Dne(1.0f - f * 2.0f, 0.2f, 0.5f - f, 1.0f, 0.8f, 0.5f + f);
        } else if (n4 == 3) {
            this.method_eb14b51a_Dne(0.5f - f, 0.2f, 0.0f, 0.5f + f, 0.8f, f * 2.0f);
        } else if (n4 == 4) {
            this.method_eb14b51a_Dne(0.5f - f, 0.2f, 1.0f - f * 2.0f, 0.5f + f, 0.8f, 1.0f);
        } else if (n4 != 5 && n4 != 6) {
            if (n4 == 0 || n4 == 7) {
                f = 0.25f;
                this.method_eb14b51a_Dne(0.5f - f, 0.4f, 0.5f - f, 0.5f + f, 1.0f, 0.5f + f);
            }
        } else {
            f = 0.25f;
            this.method_eb14b51a_Dne(0.5f - f, 0.0f, 0.5f - f, 0.5f + f, 0.6f, 0.5f + f);
        }
    }

    @Override
    public boolean method_ae128dcb_bzF() {
        return true;
    }

    @Override
    public int method_56b56428_FWm(Zpi zpi, int n, int n2, int n3, int n4) {
        int n5 = zpi.method_2dee76f_bzF(n, n2, n3);
        if ((n5 & 8) == 0) {
            return 0;
        }
        int n6 = n5 & 7;
        return n6 == 0 && n4 == 0 ? 15 : (n6 == 7 && n4 == 0 ? 15 : (n6 == 6 && n4 == 1 ? 15 : (n6 == 5 && n4 == 1 ? 15 : (n6 == 4 && n4 == 2 ? 15 : (n6 == 3 && n4 == 3 ? 15 : (n6 == 2 && n4 == 4 ? 15 : (n6 == 1 && n4 == 5 ? 15 : 0)))))));
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return false;
    }

    @Override
    public void method_f9bf07d3_Dne(Qnq qnq, int n, int n2, int n3, int n4) {
        if (this.method_54527961_bzF(qnq, n, n2, n3)) {
            int n5 = qnq.method_2dee76f_bzF(n, n2, n3) & 7;
            boolean bl = false;
            if (!qnq.method_6fdef3c4_DyG(n - 1, n2, n3) && n5 == 1) {
                bl = true;
            }
            if (!qnq.method_6fdef3c4_DyG(n + 1, n2, n3) && n5 == 2) {
                bl = true;
            }
            if (!qnq.method_6fdef3c4_DyG(n, n2, n3 - 1) && n5 == 3) {
                bl = true;
            }
            if (!qnq.method_6fdef3c4_DyG(n, n2, n3 + 1) && n5 == 4) {
                bl = true;
            }
            if (!qnq.method_73e9b8f9_IjH(n, n2 - 1, n3) && n5 == 5) {
                bl = true;
            }
            if (!qnq.method_73e9b8f9_IjH(n, n2 - 1, n3) && n5 == 6) {
                bl = true;
            }
            if (!qnq.method_6fdef3c4_DyG(n, n2 + 1, n3) && n5 == 0) {
                bl = true;
            }
            if (!qnq.method_6fdef3c4_DyG(n, n2 + 1, n3) && n5 == 7) {
                bl = true;
            }
            if (bl) {
                this.method_fd7de26f_FWm(qnq, n, n2, n3, qnq.method_2dee76f_bzF(n, n2, n3), 0);
                qnq.method_2e7161e6_Qnq(n, n2, n3);
            }
        }
    }

    @Override
    public boolean method_cb53d52e_Dne(Qnq qnq, int n, int n2, int n3, FiG fiG, int n4, float f, float f2, float f3) {
        if (qnq.field_2d2a05_aFZ) {
            return true;
        }
        int n5 = qnq.method_2dee76f_bzF(n, n2, n3);
        int n6 = n5 & 7;
        int n7 = 8 - (n5 & 8);
        qnq.method_d4dc89ed_Dne(n, n2, n3, n6 + n7, 3);
        qnq.method_c961c6ee_Dne((double)n + 0.5, (double)n2 + 0.5, (double)n3 + 0.5, "random.click", 0.3f, n7 > 0 ? 0.6f : 0.5f);
        qnq.method_58fe7b07_bzF(n, n2, n3, this.field_21260d_FWm);
        if (n6 == 1) {
            qnq.method_58fe7b07_bzF(n - 1, n2, n3, this.field_21260d_FWm);
        } else if (n6 == 2) {
            qnq.method_58fe7b07_bzF(n + 1, n2, n3, this.field_21260d_FWm);
        } else if (n6 == 3) {
            qnq.method_58fe7b07_bzF(n, n2, n3 - 1, this.field_21260d_FWm);
        } else if (n6 == 4) {
            qnq.method_58fe7b07_bzF(n, n2, n3 + 1, this.field_21260d_FWm);
        } else if (n6 != 5 && n6 != 6) {
            if (n6 == 0 || n6 == 7) {
                qnq.method_58fe7b07_bzF(n, n2 + 1, n3, this.field_21260d_FWm);
            }
        } else {
            qnq.method_58fe7b07_bzF(n, n2 - 1, n3, this.field_21260d_FWm);
        }
        return true;
    }
}

