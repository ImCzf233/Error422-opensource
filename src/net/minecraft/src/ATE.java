package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class ATE
implements Zpi {
    private int field_2092ae_Dne;
    private qMV[][] field_2440732_Dne;
    private Qnq field_36c4f18_Dne;
    private boolean field_2092bf_Dne;
    private int field_21260d_FWm;

    public ATE(Qnq qnq, int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        qMV qMV2;
        int n8;
        int n9;
        this.field_36c4f18_Dne = qnq;
        this.field_2092ae_Dne = n - n7 >> 4;
        this.field_21260d_FWm = n3 - n7 >> 4;
        int n10 = n4 + n7 >> 4;
        int n11 = n6 + n7 >> 4;
        this.field_2440732_Dne = new qMV[n10 - this.field_2092ae_Dne + 1][n11 - this.field_21260d_FWm + 1];
        this.field_2092bf_Dne = true;
        for (n9 = this.field_2092ae_Dne; n9 <= n10; ++n9) {
            for (n8 = this.field_21260d_FWm; n8 <= n11; ++n8) {
                qMV2 = qnq.method_e1796070_FWm(n9, n8);
                if (qMV2 == null) continue;
                this.field_2440732_Dne[n9 - this.field_2092ae_Dne][n8 - this.field_21260d_FWm] = qMV2;
            }
        }
        for (n9 = n >> 4; n9 <= n4 >> 4; ++n9) {
            for (n8 = n3 >> 4; n8 <= n6 >> 4; ++n8) {
                qMV2 = this.field_2440732_Dne[n9 - this.field_2092ae_Dne][n8 - this.field_21260d_FWm];
                if (qMV2 == null || qMV2.method_1e26965d_FWm(n2, n5)) continue;
                this.field_2092bf_Dne = false;
            }
        }
    }

    @Override
    public float method_2c2cf7b9_Dne(int n, int n2, int n3) {
        return this.field_36c4f18_Dne.field_3690d00_Dne.field_3f1c586_Dne[this.method_a6aca7bd_FWm(n, n2, n3)];
    }

    @Override
    public boolean method_6fdef3c4_DyG(int n, int n2, int n3) {
        zKP zKP2 = zKP.field_8374b848_Dne[this.method_2c2cf7bc_Dne(n, n2, n3)];
        return zKP2 == null ? false : zKP2.field_368fd23_Dne.method_ae128dcb_bzF() && zKP2.method_7a46289e_Dne();
    }

    @Override
    public boolean method_907a9d25_Qnq() {
        return this.field_2092bf_Dne;
    }

    @Override
    public OdI method_90477c37_Dne(int n, int n2) {
        return this.field_36c4f18_Dne.method_90477c37_Dne(n, n2);
    }

    @Override
    public int method_2c2cf7bc_Dne(int n, int n2, int n3) {
        if (n2 < 0) {
            return 0;
        }
        if (n2 >= 256) {
            return 0;
        }
        int n4 = (n >> 4) - this.field_2092ae_Dne;
        int n5 = (n3 >> 4) - this.field_21260d_FWm;
        if (n4 >= 0 && n4 < this.field_2440732_Dne.length && n5 >= 0 && n5 < this.field_2440732_Dne[n4].length) {
            qMV qMV2 = this.field_2440732_Dne[n4][n5];
            return qMV2 == null ? 0 : qMV2.method_2c2cf7bc_Dne(n & 0xF, n2, n3 & 0xF);
        }
        return 0;
    }

    @Override
    public int method_5972744d_Dne(int n, int n2, int n3, int n4) {
        int n5 = this.method_60f38def_Dne(udO.field_37c82cc_Dne, n, n2, n3);
        int n6 = this.method_60f38def_Dne(udO.field_20364eab_FWm, n, n2, n3);
        if (n6 < n4) {
            n6 = n4;
        }
        return n5 << 20 | n6 << 4;
    }

    @Override
    public int method_7c6f602c_FWm() {
        return 256;
    }

    @Override
    public ziS method_23186a47_Dne() {
        return this.field_36c4f18_Dne.method_23186a47_Dne();
    }

    @Override
    public int method_2ee8c46c_FWm(int n, int n2, int n3, int n4) {
        int n5 = this.method_2c2cf7bc_Dne(n, n2, n3);
        return n5 == 0 ? 0 : zKP.field_8374b848_Dne[n5].method_56b56428_FWm(this, n, n2, n3, n4);
    }

    public int method_5972b41e_Dne(int n, int n2, int n3, boolean bl) {
        if (n >= -30000000 && n3 >= -30000000 && n < 30000000 && n3 <= 30000000) {
            int n4;
            if (bl && ((n4 = this.method_2c2cf7bc_Dne(n, n2, n3)) == zKP.field_202e4261_FWm.field_21260d_FWm || n4 == zKP.field_5e5de549_Qnq.field_21260d_FWm || n4 == zKP.field_778fd823_rPc.field_21260d_FWm || n4 == zKP.field_7a2b5882_One.field_21260d_FWm || n4 == zKP.field_91df3208_BJH.field_21260d_FWm)) {
                int n5 = this.method_5972b41e_Dne(n, n2 + 1, n3, false);
                int n6 = this.method_5972b41e_Dne(n + 1, n2, n3, false);
                int n7 = this.method_5972b41e_Dne(n - 1, n2, n3, false);
                int n8 = this.method_5972b41e_Dne(n, n2, n3 + 1, false);
                int n9 = this.method_5972b41e_Dne(n, n2, n3 - 1, false);
                if (n6 > n5) {
                    n5 = n6;
                }
                if (n7 > n5) {
                    n5 = n7;
                }
                if (n8 > n5) {
                    n5 = n8;
                }
                if (n9 > n5) {
                    n5 = n9;
                }
                return n5;
            }
            if (n2 < 0) {
                return 0;
            }
            if (n2 >= 256) {
                n4 = 15 - this.field_36c4f18_Dne.field_2092ae_Dne;
                if (n4 < 0) {
                    n4 = 0;
                }
                return n4;
            }
            n4 = (n >> 4) - this.field_2092ae_Dne;
            int n10 = (n3 >> 4) - this.field_21260d_FWm;
            return this.field_2440732_Dne[n4][n10].method_5972744d_Dne(n & 0xF, n2, n3 & 0xF, this.field_36c4f18_Dne.field_2092ae_Dne);
        }
        return 15;
    }

    @Override
    public float method_5972744a_Dne(int n, int n2, int n3, int n4) {
        int n5 = this.method_a6aca7bd_FWm(n, n2, n3);
        if (n5 < n4) {
            n5 = n4;
        }
        return this.field_36c4f18_Dne.field_3690d00_Dne.field_3f1c586_Dne[n5];
    }

    @Override
    public ipD method_d98e681d_Dne(int n, int n2, int n3) {
        int n4 = (n >> 4) - this.field_2092ae_Dne;
        int n5 = (n3 >> 4) - this.field_21260d_FWm;
        return this.field_2440732_Dne[n4][n5].method_d98e681d_Dne(n & 0xF, n2, n3 & 0xF);
    }

    @Override
    public int method_2dee76f_bzF(int n, int n2, int n3) {
        if (n2 < 0) {
            return 0;
        }
        if (n2 >= 256) {
            return 0;
        }
        int n4 = (n >> 4) - this.field_2092ae_Dne;
        int n5 = (n3 >> 4) - this.field_21260d_FWm;
        return this.field_2440732_Dne[n4][n5].method_2dee76f_bzF(n & 0xF, n2, n3 & 0xF);
    }

    public int method_f476b68e_FWm(udO udO2, int n, int n2, int n3) {
        if (n2 < 0) {
            n2 = 0;
        }
        if (n2 >= 256) {
            n2 = 255;
        }
        if (n2 >= 0 && n2 < 256 && n >= -30000000 && n3 >= -30000000 && n < 30000000 && n3 <= 30000000) {
            int n4 = (n >> 4) - this.field_2092ae_Dne;
            int n5 = (n3 >> 4) - this.field_21260d_FWm;
            return this.field_2440732_Dne[n4][n5].method_60f38def_Dne(udO2, n & 0xF, n2, n3 & 0xF);
        }
        return udO2.field_2092ae_Dne;
    }

    public int method_a6aca7bd_FWm(int n, int n2, int n3) {
        return this.method_5972b41e_Dne(n, n2, n3, true);
    }

    @Override
    public boolean method_73e9b8f9_IjH(int n, int n2, int n3) {
        zKP zKP2 = zKP.field_8374b848_Dne[this.method_2c2cf7bc_Dne(n, n2, n3)];
        return this.field_36c4f18_Dne.method_222ffcdf_Dne(zKP2, this.method_2dee76f_bzF(n, n2, n3));
    }

    @Override
    public KFd method_d9802b31_Dne(int n, int n2, int n3) {
        int n4 = this.method_2c2cf7bc_Dne(n, n2, n3);
        return n4 == 0 ? KFd.field_368fd23_Dne : zKP.field_8374b848_Dne[n4].field_368fd23_Dne;
    }

    @Override
    public boolean method_2c2cf7cd_Dne(int n, int n2, int n3) {
        zKP zKP2 = zKP.field_8374b848_Dne[this.method_2c2cf7bc_Dne(n, n2, n3)];
        return zKP2 == null;
    }

    public int method_60f38def_Dne(udO udO2, int n, int n2, int n3) {
        if (n2 < 0) {
            n2 = 0;
        }
        if (n2 >= 256) {
            n2 = 255;
        }
        if (n2 >= 0 && n2 < 256 && n >= -30000000 && n3 >= -30000000 && n < 30000000 && n3 <= 30000000) {
            if (udO2 == udO.field_37c82cc_Dne && this.field_36c4f18_Dne.field_3690d00_Dne.field_21261e_FWm) {
                return 0;
            }
            if (zKP.field_4a92433_Qnq[this.method_2c2cf7bc_Dne(n, n2, n3)]) {
                int n4 = this.method_f476b68e_FWm(udO2, n, n2 + 1, n3);
                int n5 = this.method_f476b68e_FWm(udO2, n + 1, n2, n3);
                int n6 = this.method_f476b68e_FWm(udO2, n - 1, n2, n3);
                int n7 = this.method_f476b68e_FWm(udO2, n, n2, n3 + 1);
                int n8 = this.method_f476b68e_FWm(udO2, n, n2, n3 - 1);
                if (n5 > n4) {
                    n4 = n5;
                }
                if (n6 > n4) {
                    n4 = n6;
                }
                if (n7 > n4) {
                    n4 = n7;
                }
                if (n8 > n4) {
                    n4 = n8;
                }
                return n4;
            }
            int n9 = (n >> 4) - this.field_2092ae_Dne;
            int n10 = (n3 >> 4) - this.field_21260d_FWm;
            return this.field_2440732_Dne[n9][n10].method_60f38def_Dne(udO2, n & 0xF, n2, n3 & 0xF);
        }
        return udO2.field_2092ae_Dne;
    }

    @Override
    public boolean method_e53317d5_zGp(int n, int n2, int n3) {
        zKP zKP2 = zKP.field_8374b848_Dne[this.method_2c2cf7bc_Dne(n, n2, n3)];
        return zKP2 == null ? false : zKP2.method_7c6f603d_FWm();
    }
}

