package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

/*
 * Renamed from oqu
 */
public class oqu_0
extends zKP {
    private final int field_2092ae_Dne;
    private gDn[] field_836bfe96_Dne;
    private static final String[] field_f5e54dca_Dne = new String[]{"doorWood_lower", "doorWood_upper", "doorIron_lower", "doorIron_upper"};

    @Override
    public void method_c5b1410a_Dne(Qnq qnq, int n, int n2, int n3, int n4, FiG fiG) {
        if (fiG.field_37cb681_Dne.field_267d06_Qnq && (n4 & 8) != 0 && qnq.method_2c2cf7bc_Dne(n, n2 - 1, n3) == this.field_21260d_FWm) {
            qnq.method_2e7161e6_Qnq(n, n2 - 1, n3);
        }
    }

    @Override
    public bSp method_5f382101_FWm(Qnq qnq, int n, int n2, int n3) {
        this.method_fbabf7ef_Dne(qnq, n, n2, n3);
        return super.method_5f382101_FWm(qnq, n, n2, n3);
    }

    @Override
    public int method_7a46288d_Dne() {
        return 7;
    }

    @Override
    public gDn method_9051f17a_Dne(int n, int n2) {
        return this.field_836bfe96_Dne[this.field_2092ae_Dne];
    }

    public int method_8f2f2081_FWm(Zpi zpi, int n, int n2, int n3) {
        int n4;
        int n5;
        boolean bl;
        int n6 = zpi.method_2dee76f_bzF(n, n2, n3);
        boolean bl2 = bl = (n6 & 8) != 0;
        if (bl) {
            n5 = zpi.method_2dee76f_bzF(n, n2 - 1, n3);
            n4 = n6;
        } else {
            n5 = n6;
            n4 = zpi.method_2dee76f_bzF(n, n2 + 1, n3);
        }
        boolean bl3 = (n4 & 1) != 0;
        return n5 & 7 | (bl ? 8 : 0) | (bl3 ? 16 : 0);
    }

    @Override
    public int method_9cb39123_Dne(Qnq qnq, int n, int n2, int n3) {
        return this.field_368fd23_Dne == KFd.field_f09abc1b_zGp ? dEr.field_38f62451_JLG.field_267cf5_Qnq : dEr.field_91d51f76_BJH.field_267cf5_Qnq;
    }

    public boolean method_8f2f2092_FWm(Zpi zpi, int n, int n2, int n3) {
        return (this.method_8f2f2081_FWm(zpi, n, n2, n3) & 4) != 0;
    }

    @Override
    public bSp method_8c85fe2_Dne(Qnq qnq, int n, int n2, int n3) {
        this.method_fbabf7ef_Dne(qnq, n, n2, n3);
        return super.method_8c85fe2_Dne(qnq, n, n2, n3);
    }

    @Override
    public boolean method_fbabf7f3_Dne(Zpi zpi, int n, int n2, int n3) {
        int n4 = this.method_8f2f2081_FWm(zpi, n, n2, n3);
        return (n4 & 4) != 0;
    }

    @Override
    public int method_24763341_Dne(int n, Random random, int n2) {
        return (n & 8) != 0 ? 0 : (this.field_368fd23_Dne == KFd.field_f09abc1b_zGp ? dEr.field_38f62451_JLG.field_267cf5_Qnq : dEr.field_91d51f76_BJH.field_267cf5_Qnq);
    }

    @Override
    public boolean method_cb53d52e_Dne(Qnq qnq, int n, int n2, int n3, FiG fiG, int n4, float f, float f2, float f3) {
        if (this.field_368fd23_Dne == KFd.field_f09abc1b_zGp) {
            return true;
        }
        int n5 = this.method_8f2f2081_FWm(qnq, n, n2, n3);
        int n6 = n5 & 7;
        n6 ^= 4;
        if ((n5 & 8) == 0) {
            qnq.method_d4dc89ed_Dne(n, n2, n3, n6, 2);
            qnq.method_c6b5263a_Dne(n, n2, n3, n, n2, n3);
        } else {
            qnq.method_d4dc89ed_Dne(n, n2 - 1, n3, n6, 2);
            qnq.method_c6b5263a_Dne(n, n2 - 1, n3, n, n2, n3);
        }
        qnq.method_bfa54b80_Dne(fiG, 1003, n, n2, n3, 0);
        return true;
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        this.field_836bfe96_Dne = new gDn[field_f5e54dca_Dne.length * 2];
        for (int i = 0; i < field_f5e54dca_Dne.length; ++i) {
            this.field_836bfe96_Dne[i] = rbp.method_285881e4_Dne(field_f5e54dca_Dne[i]);
            this.field_836bfe96_Dne[i + oqu_0.field_f5e54dca_Dne.length] = new pOO(this.field_836bfe96_Dne[i], true, false);
        }
    }

    @Override
    public boolean method_9cb39134_Dne(Qnq qnq, int n, int n2, int n3) {
        return n2 >= 255 ? false : qnq.method_73e9b8f9_IjH(n, n2 - 1, n3) && super.method_9cb39134_Dne(qnq, n, n2, n3) && super.method_9cb39134_Dne(qnq, n, n2 + 1, n3);
    }

    @Override
    public wHH method_acf3908a_Dne(Qnq qnq, int n, int n2, int n3, chN chN2, chN chN3) {
        this.method_fbabf7ef_Dne(qnq, n, n2, n3);
        return super.method_acf3908a_Dne(qnq, n, n2, n3, chN2, chN3);
    }

    @Override
    public gDn method_68d2f4_Dne(Zpi zpi, int n, int n2, int n3, int n4) {
        if (n4 != 1 && n4 != 0) {
            boolean bl;
            int n5 = this.method_8f2f2081_FWm(zpi, n, n2, n3);
            int n6 = n5 & 3;
            boolean bl2 = (n5 & 4) != 0;
            boolean bl3 = false;
            boolean bl4 = bl = (n5 & 8) != 0;
            if (bl2) {
                if (n6 == 0 && n4 == 2) {
                    bl3 = !bl3;
                } else if (n6 == 1 && n4 == 5) {
                    bl3 = !bl3;
                } else if (n6 == 2 && n4 == 3) {
                    bl3 = !bl3;
                } else if (n6 == 3 && n4 == 4) {
                    bl3 = !bl3;
                }
            } else {
                if (n6 == 0 && n4 == 5) {
                    bl3 = !bl3;
                } else if (n6 == 1 && n4 == 3) {
                    bl3 = !bl3;
                } else if (n6 == 2 && n4 == 4) {
                    bl3 = !bl3;
                } else if (n6 == 3 && n4 == 2) {
                    boolean bl5 = bl3 = !bl3;
                }
                if ((n5 & 0x10) != 0) {
                    bl3 = !bl3;
                }
            }
            return this.field_836bfe96_Dne[this.field_2092ae_Dne + (bl3 ? field_f5e54dca_Dne.length : 0) + (bl ? 1 : 0)];
        }
        return this.field_836bfe96_Dne[this.field_2092ae_Dne];
    }

    private void method_ce7f5da9_Dne(int n) {
        boolean bl;
        float f = 0.1875f;
        this.method_eb14b51a_Dne(0.0f, 0.0f, 0.0f, 1.0f, 2.0f, 1.0f);
        int n2 = n & 3;
        boolean bl2 = (n & 4) != 0;
        boolean bl3 = bl = (n & 0x10) != 0;
        if (n2 == 0) {
            if (bl2) {
                if (!bl) {
                    this.method_eb14b51a_Dne(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, f);
                } else {
                    this.method_eb14b51a_Dne(0.0f, 0.0f, 1.0f - f, 1.0f, 1.0f, 1.0f);
                }
            } else {
                this.method_eb14b51a_Dne(0.0f, 0.0f, 0.0f, f, 1.0f, 1.0f);
            }
        } else if (n2 == 1) {
            if (bl2) {
                if (!bl) {
                    this.method_eb14b51a_Dne(1.0f - f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
                } else {
                    this.method_eb14b51a_Dne(0.0f, 0.0f, 0.0f, f, 1.0f, 1.0f);
                }
            } else {
                this.method_eb14b51a_Dne(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, f);
            }
        } else if (n2 == 2) {
            if (bl2) {
                if (!bl) {
                    this.method_eb14b51a_Dne(0.0f, 0.0f, 1.0f - f, 1.0f, 1.0f, 1.0f);
                } else {
                    this.method_eb14b51a_Dne(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, f);
                }
            } else {
                this.method_eb14b51a_Dne(1.0f - f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
            }
        } else if (n2 == 3) {
            if (bl2) {
                if (!bl) {
                    this.method_eb14b51a_Dne(0.0f, 0.0f, 0.0f, f, 1.0f, 1.0f);
                } else {
                    this.method_eb14b51a_Dne(1.0f - f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
                }
            } else {
                this.method_eb14b51a_Dne(0.0f, 0.0f, 1.0f - f, 1.0f, 1.0f, 1.0f);
            }
        }
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return false;
    }

    @Override
    public int method_7c6f602c_FWm() {
        return 1;
    }

    public void method_f9bf47a4_Dne(Qnq qnq, int n, int n2, int n3, boolean bl) {
        boolean bl2;
        int n4 = this.method_8f2f2081_FWm(qnq, n, n2, n3);
        boolean bl3 = bl2 = (n4 & 4) != 0;
        if (bl2 != bl) {
            int n5 = n4 & 7;
            n5 ^= 4;
            if ((n4 & 8) == 0) {
                qnq.method_d4dc89ed_Dne(n, n2, n3, n5, 2);
                qnq.method_c6b5263a_Dne(n, n2, n3, n, n2, n3);
            } else {
                qnq.method_d4dc89ed_Dne(n, n2 - 1, n3, n5, 2);
                qnq.method_c6b5263a_Dne(n, n2 - 1, n3, n, n2, n3);
            }
            qnq.method_bfa54b80_Dne(null, 1003, n, n2, n3, 0);
        }
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return false;
    }

    public int method_b1f134df_a_(Zpi zpi, int n, int n2, int n3) {
        return this.method_8f2f2081_FWm(zpi, n, n2, n3) & 3;
    }

    @Override
    public void method_fbabf7ef_Dne(Zpi zpi, int n, int n2, int n3) {
        this.method_ce7f5da9_Dne(this.method_8f2f2081_FWm(zpi, n, n2, n3));
    }

    @Override
    public void method_41dd09cd_Dne(Qnq qnq, int n, int n2, int n3, FiG fiG) {
    }

    @Override
    public void method_f9bf07d3_Dne(Qnq qnq, int n, int n2, int n3, int n4) {
        int n5 = qnq.method_2dee76f_bzF(n, n2, n3);
        if ((n5 & 8) == 0) {
            boolean bl = false;
            if (qnq.method_2c2cf7bc_Dne(n, n2 + 1, n3) != this.field_21260d_FWm) {
                qnq.method_2e7161e6_Qnq(n, n2, n3);
                bl = true;
            }
            if (!qnq.method_73e9b8f9_IjH(n, n2 - 1, n3)) {
                qnq.method_2e7161e6_Qnq(n, n2, n3);
                bl = true;
                if (qnq.method_2c2cf7bc_Dne(n, n2 + 1, n3) == this.field_21260d_FWm) {
                    qnq.method_2e7161e6_Qnq(n, n2 + 1, n3);
                }
            }
            if (bl) {
                if (!qnq.field_2d2a05_aFZ) {
                    this.method_fd7de26f_FWm(qnq, n, n2, n3, n5, 0);
                }
            } else {
                boolean bl2;
                boolean bl3 = bl2 = qnq.method_6382f365_kGO(n, n2, n3) || qnq.method_6382f365_kGO(n, n2 + 1, n3);
                if ((bl2 || n4 > 0 && zKP.field_8374b848_Dne[n4].method_ae128dcb_bzF()) && n4 != this.field_21260d_FWm) {
                    this.method_f9bf47a4_Dne(qnq, n, n2, n3, bl2);
                }
            }
        } else {
            if (qnq.method_2c2cf7bc_Dne(n, n2 - 1, n3) != this.field_21260d_FWm) {
                qnq.method_2e7161e6_Qnq(n, n2, n3);
            }
            if (n4 > 0 && n4 != this.field_21260d_FWm) {
                this.method_f9bf07d3_Dne(qnq, n, n2 - 1, n3, n4);
            }
        }
    }

    protected oqu_0(int n, KFd kFd) {
        super(n, kFd);
        this.field_2092ae_Dne = kFd == KFd.field_f09abc1b_zGp ? 2 : 0;
        float f = 0.5f;
        float f2 = 1.0f;
        this.method_eb14b51a_Dne(0.5f - f, 0.0f, 0.5f - f, 0.5f + f, f2, 0.5f + f);
    }
}

