package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class KFZ {
    private boolean field_267d06_Qnq = false;
    private chN field_3746303_Dne = chN.method_e4505d6c_Dne(0.0, 0.0, 0.0);
    private FUH field_366ec33_Dne;
    private int field_2092ae_Dne;
    private boolean field_2e5f2c_bzF = false;
    private boolean field_2092bf_Dne = false;
    private float field_21260a_FWm;
    private Qnq field_36c4f18_Dne;
    private float field_2092ab_Dne;
    private wdG field_37d6a92_Dne;
    private boolean field_2d2a05_aFZ = false;
    private int field_21260d_FWm;
    private boolean field_21261e_FWm = true;

    public wdG method_267ca945_Dne(FUH fUH) {
        return !this.method_907a9d25_Qnq() ? null : this.field_36c4f18_Dne.method_f4cb42fd_Dne(this.field_366ec33_Dne, fUH, this.field_21260a_FWm, this.field_21261e_FWm, this.field_2e5f2c_bzF, this.field_267d06_Qnq, this.field_2d2a05_aFZ);
    }

    private boolean method_907a9d25_Qnq() {
        return this.field_366ec33_Dne.field_2d2a05_aFZ || this.field_2d2a05_aFZ && this.method_a98a0664_aFZ();
    }

    public KFZ(FUH fUH, Qnq qnq, float f) {
        this.field_366ec33_Dne = fUH;
        this.field_36c4f18_Dne = qnq;
        this.field_21260a_FWm = f;
    }

    public void method_7ed9b9d3_Qnq(boolean bl) {
        this.field_2092bf_Dne = bl;
    }

    private boolean method_32ac8723_FWm(int n, int n2, int n3, int n4, int n5, int n6, chN chN2, double d, double d2) {
        for (int i = n; i < n + n4; ++i) {
            for (int j = n2; j < n2 + n5; ++j) {
                for (int k = n3; k < n3 + n6; ++k) {
                    int n7;
                    double d3 = (double)i + 0.5 - chN2.field_2092a9_Dne;
                    double d4 = (double)k + 0.5 - chN2.field_2e5f16_bzF;
                    if (!(d3 * d + d4 * d2 >= 0.0) || (n7 = this.field_36c4f18_Dne.method_2c2cf7bc_Dne(i, j, k)) <= 0 || zKP.field_8374b848_Dne[n7].method_fbabf7f3_Dne(this.field_36c4f18_Dne, i, j, k)) continue;
                    return false;
                }
            }
        }
        return true;
    }

    public void method_ce7f5266_Dne(float f) {
        this.field_2092ab_Dne = f;
    }

    public boolean method_50a172a0_Dne(double d, double d2, double d3, float f) {
        wdG wdG2 = this.method_e45964fb_Dne(geR.method_117d0718_FWm(d), (int)d2, geR.method_117d0718_FWm(d3));
        return this.method_ada793d7_Dne(wdG2, f);
    }

    public boolean method_ada793d7_Dne(wdG wdG2, float f) {
        if (wdG2 == null) {
            this.field_37d6a92_Dne = null;
            return false;
        }
        if (!wdG2.method_c3898591_Dne(this.field_37d6a92_Dne)) {
            this.field_37d6a92_Dne = wdG2;
        }
        if (this.field_2092bf_Dne) {
            this.method_907a9d21_Qnq();
        }
        if (this.field_37d6a92_Dne.method_7a46288d_Dne() == 0) {
            return false;
        }
        this.field_2092ab_Dne = f;
        chN chN2 = this.method_230df162_Dne();
        this.field_21260d_FWm = this.field_2092ae_Dne;
        this.field_3746303_Dne.field_2092a9_Dne = chN2.field_2092a9_Dne;
        this.field_3746303_Dne.field_212608_FWm = chN2.field_212608_FWm;
        this.field_3746303_Dne.field_2e5f16_bzF = chN2.field_2e5f16_bzF;
        return true;
    }

    public wdG method_2316f8f1_Dne() {
        return this.field_37d6a92_Dne;
    }

    public void method_7a46289a_Dne() {
        ++this.field_2092ae_Dne;
        if (!this.method_ae128dcb_bzF()) {
            chN chN2;
            if (this.method_907a9d25_Qnq()) {
                this.method_ae128dc7_bzF();
            }
            if (!this.method_ae128dcb_bzF() && (chN2 = this.field_37d6a92_Dne.method_9a366de8_Dne(this.field_366ec33_Dne)) != null) {
                this.field_366ec33_Dne.method_230e1aeb_Dne().method_50a1729c_Dne(chN2.field_2092a9_Dne, chN2.field_212608_FWm, chN2.field_2e5f16_bzF, this.field_2092ab_Dne);
            }
        }
    }

    private boolean method_a98a0664_aFZ() {
        return this.field_366ec33_Dne.method_9feec6c6_Zpi() || this.field_366ec33_Dne.method_7ad38807_DyG();
    }

    private int method_7a46288d_Dne() {
        if (this.field_366ec33_Dne.method_9feec6c6_Zpi() && this.field_2d2a05_aFZ) {
            int n = (int)this.field_366ec33_Dne.field_373a3ed_Dne.field_212608_FWm;
            int n2 = this.field_36c4f18_Dne.method_2c2cf7bc_Dne(geR.method_117d0718_FWm(this.field_366ec33_Dne.field_2f0dd3_div), n, geR.method_117d0718_FWm(this.field_366ec33_Dne.field_334487_mrb));
            int n3 = 0;
            do {
                if (n2 != zKP.field_374330f_Dne.field_21260d_FWm && n2 != zKP.field_16319416_DyG.field_21260d_FWm) {
                    return n;
                }
                n2 = this.field_36c4f18_Dne.method_2c2cf7bc_Dne(geR.method_117d0718_FWm(this.field_366ec33_Dne.field_2f0dd3_div), ++n, geR.method_117d0718_FWm(this.field_366ec33_Dne.field_334487_mrb));
            } while (++n3 <= 16);
            return (int)this.field_366ec33_Dne.field_373a3ed_Dne.field_212608_FWm;
        }
        return (int)(this.field_366ec33_Dne.field_373a3ed_Dne.field_212608_FWm + 0.5);
    }

    public boolean method_ae128dcb_bzF() {
        return this.field_37d6a92_Dne == null || this.field_37d6a92_Dne.method_7a46289e_Dne();
    }

    private void method_907a9d21_Qnq() {
        if (!this.field_36c4f18_Dne.method_76d9fc47_aFZ(geR.method_117d0718_FWm(this.field_366ec33_Dne.field_2f0dd3_div), (int)(this.field_366ec33_Dne.field_373a3ed_Dne.field_212608_FWm + 0.5), geR.method_117d0718_FWm(this.field_366ec33_Dne.field_334487_mrb))) {
            for (int i = 0; i < this.field_37d6a92_Dne.method_7a46288d_Dne(); ++i) {
                whE whE2 = this.field_37d6a92_Dne.method_9e811d46_Dne(i);
                if (!this.field_36c4f18_Dne.method_76d9fc47_aFZ(whE2.field_2092ae_Dne, whE2.field_21260d_FWm, whE2.field_2e5f1b_bzF)) continue;
                this.field_37d6a92_Dne.method_ce7f5da9_Dne(i - 1);
                return;
            }
        }
    }

    public void method_117d59bb_FWm(boolean bl) {
        this.field_2e5f2c_bzF = bl;
    }

    private boolean method_5472d14d_Dne(chN chN2, chN chN3, int n, int n2, int n3) {
        int n4 = geR.method_117d0718_FWm(chN2.field_2092a9_Dne);
        int n5 = geR.method_117d0718_FWm(chN2.field_2e5f16_bzF);
        double d = chN3.field_2092a9_Dne - chN2.field_2092a9_Dne;
        double d2 = chN3.field_2e5f16_bzF - chN2.field_2e5f16_bzF;
        double d3 = d * d + d2 * d2;
        if (d3 < 1.0E-8) {
            return false;
        }
        double d4 = 1.0 / Math.sqrt(d3);
        if (!this.method_bb242462_Dne(n4, (int)chN2.field_212608_FWm, n5, n += 2, n2, n3 += 2, chN2, d *= d4, d2 *= d4)) {
            return false;
        }
        n -= 2;
        n3 -= 2;
        double d5 = 1.0 / Math.abs(d);
        double d6 = 1.0 / Math.abs(d2);
        double d7 = (double)(n4 * 1) - chN2.field_2092a9_Dne;
        double d8 = (double)(n5 * 1) - chN2.field_2e5f16_bzF;
        if (d >= 0.0) {
            d7 += 1.0;
        }
        if (d2 >= 0.0) {
            d8 += 1.0;
        }
        d7 /= d;
        d8 /= d2;
        int n6 = d < 0.0 ? -1 : 1;
        int n7 = d2 < 0.0 ? -1 : 1;
        int n8 = geR.method_117d0718_FWm(chN3.field_2092a9_Dne);
        int n9 = geR.method_117d0718_FWm(chN3.field_2e5f16_bzF);
        int n10 = n8 - n4;
        int n11 = n9 - n5;
        do {
            if (n10 * n6 <= 0 && n11 * n7 <= 0) {
                return true;
            }
            if (d7 < d8) {
                d7 += d5;
                n10 = n8 - (n4 += n6);
                continue;
            }
            d8 += d6;
            n11 = n9 - (n5 += n7);
        } while (this.method_bb242462_Dne(n4, (int)chN2.field_212608_FWm, n5, n, n2, n3, chN2, d, d2));
        return false;
    }

    public void method_7c6f6039_FWm() {
        this.field_37d6a92_Dne = null;
    }

    public wdG method_e45964fb_Dne(double d, double d2, double d3) {
        return !this.method_907a9d25_Qnq() ? null : this.field_36c4f18_Dne.method_37763af4_Dne(this.field_366ec33_Dne, geR.method_117d0718_FWm(d), (int)d2, geR.method_117d0718_FWm(d3), this.field_21260a_FWm, this.field_21261e_FWm, this.field_2e5f2c_bzF, this.field_267d06_Qnq, this.field_2d2a05_aFZ);
    }

    public boolean method_740ba296_Dne(FUH fUH, float f) {
        wdG wdG2 = this.method_267ca945_Dne(fUH);
        return wdG2 != null ? this.method_ada793d7_Dne(wdG2, f) : false;
    }

    public void method_143fdded_bzF(boolean bl) {
        this.field_21261e_FWm = bl;
    }

    private void method_ae128dc7_bzF() {
        int n;
        chN chN2 = this.method_230df162_Dne();
        int n2 = this.field_37d6a92_Dne.method_7a46288d_Dne();
        for (int i = this.field_37d6a92_Dne.method_7c6f602c_FWm(); i < this.field_37d6a92_Dne.method_7a46288d_Dne(); ++i) {
            if (this.field_37d6a92_Dne.method_9e811d46_Dne((int)i).field_21260d_FWm == (int)chN2.field_212608_FWm) continue;
            n2 = i;
            break;
        }
        float f = this.field_366ec33_Dne.field_342261_ooe * this.field_366ec33_Dne.field_342261_ooe;
        for (n = this.field_37d6a92_Dne.method_7c6f602c_FWm(); n < n2; ++n) {
            if (!(chN2.method_9398f49f_bzF(this.field_37d6a92_Dne.method_c5f1b2b_Dne(this.field_366ec33_Dne, n)) < (double)f)) continue;
            this.field_37d6a92_Dne.method_117d19ea_FWm(n + 1);
        }
        n = geR.method_117d0e9a_FWm(this.field_366ec33_Dne.field_342261_ooe);
        int n3 = (int)this.field_366ec33_Dne.field_367151_trS + 1;
        int n4 = n;
        for (int i = n2 - 1; i >= this.field_37d6a92_Dne.method_7c6f602c_FWm(); --i) {
            if (!this.method_5472d14d_Dne(chN2, this.field_37d6a92_Dne.method_c5f1b2b_Dne(this.field_366ec33_Dne, i), n, n3, n4)) continue;
            this.field_37d6a92_Dne.method_117d19ea_FWm(i);
            break;
        }
        if (this.field_2092ae_Dne - this.field_21260d_FWm > 100) {
            if (chN2.method_9398f49f_bzF(this.field_3746303_Dne) < 2.25) {
                this.method_7c6f6039_FWm();
            }
            this.field_21260d_FWm = this.field_2092ae_Dne;
            this.field_3746303_Dne.field_2092a9_Dne = chN2.field_2092a9_Dne;
            this.field_3746303_Dne.field_212608_FWm = chN2.field_212608_FWm;
            this.field_3746303_Dne.field_2e5f16_bzF = chN2.field_2e5f16_bzF;
        }
    }

    public boolean method_7c6f603d_FWm() {
        return this.field_2e5f2c_bzF;
    }

    public void method_ce7f9d7a_Dne(boolean bl) {
        this.field_267d06_Qnq = bl;
    }

    public void method_87b77874_aFZ(boolean bl) {
        this.field_2d2a05_aFZ = bl;
    }

    private boolean method_bb242462_Dne(int n, int n2, int n3, int n4, int n5, int n6, chN chN2, double d, double d2) {
        int n7 = n - n4 / 2;
        int n8 = n3 - n6 / 2;
        if (!this.method_32ac8723_FWm(n7, n2, n8, n4, n5, n6, chN2, d, d2)) {
            return false;
        }
        for (int i = n7; i < n7 + n4; ++i) {
            for (int j = n8; j < n8 + n6; ++j) {
                double d3 = (double)i + 0.5 - chN2.field_2092a9_Dne;
                double d4 = (double)j + 0.5 - chN2.field_2e5f16_bzF;
                if (!(d3 * d + d4 * d2 >= 0.0)) continue;
                int n9 = this.field_36c4f18_Dne.method_2c2cf7bc_Dne(i, n2 - 1, j);
                if (n9 <= 0) {
                    return false;
                }
                KFd kFd = zKP.field_8374b848_Dne[n9].field_368fd23_Dne;
                if (kFd == KFd.field_1411d34d_div && !this.field_366ec33_Dne.method_9feec6c6_Zpi()) {
                    return false;
                }
                if (kFd != KFd.field_5b96677_IjH) continue;
                return false;
            }
        }
        return true;
    }

    public boolean method_7a46289e_Dne() {
        return this.field_267d06_Qnq;
    }

    private chN method_230df162_Dne() {
        return this.field_36c4f18_Dne.method_23186a47_Dne().method_e4505d6c_Dne(this.field_366ec33_Dne.field_2f0dd3_div, this.method_7a46288d_Dne(), this.field_366ec33_Dne.field_334487_mrb);
    }
}

