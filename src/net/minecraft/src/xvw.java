package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class xvw
extends cMv {
    private float field_21260a_FWm = 0.0f;
    private int field_21260d_FWm = 0;
    private final FUH field_366ec33_Dne;
    private int field_2092ae_Dne = 0;
    private final float field_2092ab_Dne;
    private boolean field_2092bf_Dne = false;

    @Override
    public void method_7a46289a_Dne() {
        this.field_21260a_FWm = 0.0f;
    }

    public boolean method_ae128dcb_bzF() {
        return this.field_2092bf_Dne;
    }

    public boolean method_907a9d25_Qnq() {
        return !this.method_ae128dcb_bzF() && this.field_21260a_FWm > this.field_2092ab_Dne * 0.3f;
    }

    public void method_907a9d21_Qnq() {
        this.field_2092bf_Dne = true;
        this.field_2092ae_Dne = 0;
        this.field_21260d_FWm = this.field_366ec33_Dne.method_b5ceee8_Dne().nextInt(841) + 140;
    }

    @Override
    public void method_7c6f6039_FWm() {
        this.field_2092bf_Dne = false;
        this.field_21260a_FWm = 0.0f;
    }

    private boolean method_ce7f5dad_Dne(int n) {
        return zKP.field_8374b848_Dne[n] != null && (zKP.field_8374b848_Dne[n].method_7a46288d_Dne() == 10 || zKP.field_8374b848_Dne[n] instanceof dNT);
    }

    @Override
    public void method_ae128dc7_bzF() {
        NMq nMq;
        FiG fiG = (FiG)this.field_366ec33_Dne.field_37b45e5_Dne;
        kSJ kSJ2 = (kSJ)this.field_366ec33_Dne;
        float f = geR.method_87b72d50_aFZ(fiG.field_334489_mrb - this.field_366ec33_Dne.field_334489_mrb) * 0.5f;
        if (f > 5.0f) {
            f = 5.0f;
        }
        if (f < -5.0f) {
            f = -5.0f;
        }
        this.field_366ec33_Dne.field_334489_mrb = geR.method_87b72d50_aFZ(this.field_366ec33_Dne.field_334489_mrb + f);
        if (this.field_21260a_FWm < this.field_2092ab_Dne) {
            this.field_21260a_FWm += (this.field_2092ab_Dne - this.field_21260a_FWm) * 0.01f;
        }
        if (this.field_21260a_FWm > this.field_2092ab_Dne) {
            this.field_21260a_FWm = this.field_2092ab_Dne;
        }
        int n = geR.method_117d0718_FWm(this.field_366ec33_Dne.field_2f0dd3_div);
        int n2 = geR.method_117d0718_FWm(this.field_366ec33_Dne.field_22c5fd_IjH);
        int n3 = geR.method_117d0718_FWm(this.field_366ec33_Dne.field_334487_mrb);
        float f2 = this.field_21260a_FWm;
        if (this.field_2092bf_Dne) {
            if (this.field_2092ae_Dne++ > this.field_21260d_FWm) {
                this.field_2092bf_Dne = false;
            }
            f2 += f2 * 1.15f * geR.method_ce7f5256_Dne((float)this.field_2092ae_Dne / (float)this.field_21260d_FWm * (float)Math.PI);
        }
        float f3 = 0.91f;
        if (this.field_366ec33_Dne.field_2d2a05_aFZ) {
            f3 = 0.54600006f;
            int n4 = this.field_366ec33_Dne.field_36c4f18_Dne.method_2c2cf7bc_Dne(geR.method_ce7f5259_Dne(n), geR.method_ce7f5259_Dne(n2) - 1, geR.method_ce7f5259_Dne(n3));
            if (n4 > 0) {
                f3 = zKP.field_8374b848_Dne[n4].field_267cf2_Qnq * 0.91f;
            }
        }
        float f4 = 0.16277136f / (f3 * f3 * f3);
        float f5 = geR.method_ce7f5256_Dne(kSJ2.field_334489_mrb * (float)Math.PI / 180.0f);
        float f6 = geR.method_117d0e97_FWm(kSJ2.field_334489_mrb * (float)Math.PI / 180.0f);
        float f7 = kSJ2.method_ae128db7_bzF() * f4;
        float f8 = Math.max(f2, 1.0f);
        f8 = f7 / f8;
        float f9 = f2 * f8;
        float f10 = -(f9 * f5);
        float f11 = f9 * f6;
        if (geR.method_7ed96eaf_Qnq(f10) > geR.method_7ed96eaf_Qnq(f11)) {
            if (f10 < 0.0f) {
                f10 -= this.field_366ec33_Dne.field_342261_ooe / 2.0f;
            }
            if (f10 > 0.0f) {
                f10 += this.field_366ec33_Dne.field_342261_ooe / 2.0f;
            }
            f11 = 0.0f;
        } else {
            f10 = 0.0f;
            if (f11 < 0.0f) {
                f11 -= this.field_366ec33_Dne.field_342261_ooe / 2.0f;
            }
            if (f11 > 0.0f) {
                f11 += this.field_366ec33_Dne.field_342261_ooe / 2.0f;
            }
        }
        int n5 = geR.method_117d0718_FWm(this.field_366ec33_Dne.field_2f0dd3_div + (double)f10);
        int n6 = geR.method_117d0718_FWm(this.field_366ec33_Dne.field_334487_mrb + (double)f11);
        whE whE2 = new whE(geR.method_ce7f5259_Dne(this.field_366ec33_Dne.field_342261_ooe + 1.0f), geR.method_ce7f5259_Dne(this.field_366ec33_Dne.field_367151_trS + fiG.field_367151_trS + 1.0f), geR.method_ce7f5259_Dne(this.field_366ec33_Dne.field_342261_ooe + 1.0f));
        if (n != n5 || n3 != n6) {
            boolean bl;
            int n7 = this.field_366ec33_Dne.field_36c4f18_Dne.method_2c2cf7bc_Dne(n, n2, n3);
            int n8 = this.field_366ec33_Dne.field_36c4f18_Dne.method_2c2cf7bc_Dne(n, n2 - 1, n3);
            boolean bl2 = bl = this.method_ce7f5dad_Dne(n7) || zKP.field_8374b848_Dne[n7] == null && this.method_ce7f5dad_Dne(n8);
            if (!bl && Seh.method_30a4097d_Dne(this.field_366ec33_Dne, n5, n2, n6, whE2, false, false, true) == 0 && Seh.method_30a4097d_Dne(this.field_366ec33_Dne, n, n2 + 1, n3, whE2, false, false, true) == 1 && Seh.method_30a4097d_Dne(this.field_366ec33_Dne, n5, n2 + 1, n6, whE2, false, false, true) == 1) {
                kSJ2.method_23144d3f_Dne().method_7a46289a_Dne();
            }
        }
        if (!fiG.field_37cb681_Dne.field_267d06_Qnq && this.field_21260a_FWm >= this.field_2092ab_Dne * 0.5f && this.field_366ec33_Dne.method_b5ceee8_Dne().nextFloat() < 0.006f && !this.field_2092bf_Dne && (nMq = fiG.method_23040479_Dne()) != null && nMq.field_2e5f1b_bzF == dEr.field_921b35cb_etZ.field_267cf5_Qnq) {
            nMq.method_60f1bf3f_Dne(1, fiG);
            if (nMq.field_2092ae_Dne == 0) {
                NMq nMq2 = new NMq(dEr.field_37c7eec_Dne);
                nMq2.method_66a36cd8_FWm(nMq.field_36ef89c_Dne);
                fiG.field_36a059b_Dne.field_8360c375_Dne[fiG.field_36a059b_Dne.field_2092ae_Dne] = nMq2;
            }
        }
        this.field_366ec33_Dne.method_5c54d0e1_Qnq(0.0f, f2);
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return this.field_366ec33_Dne.method_cd4cb3d9_udO() && this.field_366ec33_Dne.field_37b45e5_Dne != null && this.field_366ec33_Dne.field_37b45e5_Dne instanceof FiG && (this.field_2092bf_Dne || this.field_366ec33_Dne.method_8d0b7773_One());
    }

    public xvw(FUH fUH, float f) {
        this.field_366ec33_Dne = fUH;
        this.field_2092ab_Dne = f;
        this.method_ce7f5da9_Dne(7);
    }
}

