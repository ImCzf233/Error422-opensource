package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class znX
extends cMv {
    int field_2092ae_Dne = 0;
    Qnq field_36c4f18_Dne;
    private HzK field_20222c12_FWm;
    private HzK field_3686033_Dne;
    float field_2092ab_Dne;

    public znX(HzK hzK, float f) {
        this.field_3686033_Dne = hzK;
        this.field_36c4f18_Dne = hzK.field_36c4f18_Dne;
        this.field_2092ab_Dne = f;
        this.method_ce7f5da9_Dne(3);
    }

    @Override
    public void method_ae128dc7_bzF() {
        this.field_3686033_Dne.method_230db26a_Dne().method_d3754820_Dne(this.field_20222c12_FWm, 10.0f, this.field_3686033_Dne.method_cd4cb3c8_udO());
        this.field_3686033_Dne.method_23028a4c_Dne().method_740ba296_Dne(this.field_20222c12_FWm, this.field_2092ab_Dne);
        ++this.field_2092ae_Dne;
        if (this.field_2092ae_Dne >= 60 && this.field_3686033_Dne.method_bb7dd80e_Dne(this.field_20222c12_FWm) < 9.0) {
            this.method_907a9d21_Qnq();
        }
    }

    private void method_907a9d21_Qnq() {
        Azh azh = this.field_3686033_Dne.method_cafee53a_Dne(this.field_20222c12_FWm);
        if (azh != null) {
            this.field_3686033_Dne.method_117d19ea_FWm(6000);
            this.field_20222c12_FWm.method_117d19ea_FWm(6000);
            this.field_3686033_Dne.method_907a9d21_Qnq();
            this.field_20222c12_FWm.method_907a9d21_Qnq();
            azh.method_117d19ea_FWm(-24000);
            azh.method_9ce0fc65_FWm(this.field_3686033_Dne.field_2f0dd3_div, this.field_3686033_Dne.field_22c5fd_IjH, this.field_3686033_Dne.field_334487_mrb, 0.0f, 0.0f);
            this.field_36c4f18_Dne.method_94d18be5_FWm(azh);
            Random random = this.field_3686033_Dne.method_b5ceee8_Dne();
            for (int i = 0; i < 7; ++i) {
                double d = random.nextGaussian() * 0.02;
                double d2 = random.nextGaussian() * 0.02;
                double d3 = random.nextGaussian() * 0.02;
                this.field_36c4f18_Dne.method_8600ec24_Dne("heart", this.field_3686033_Dne.field_2f0dd3_div + (double)(random.nextFloat() * this.field_3686033_Dne.field_342261_ooe * 2.0f) - (double)this.field_3686033_Dne.field_342261_ooe, this.field_3686033_Dne.field_22c5fd_IjH + 0.5 + (double)(random.nextFloat() * this.field_3686033_Dne.field_367151_trS), this.field_3686033_Dne.field_334487_mrb + (double)(random.nextFloat() * this.field_3686033_Dne.field_342261_ooe * 2.0f) - (double)this.field_3686033_Dne.field_342261_ooe, d, d2, d3);
            }
            this.field_36c4f18_Dne.method_94d18be5_FWm(new alg(this.field_36c4f18_Dne, this.field_3686033_Dne.field_2f0dd3_div, this.field_3686033_Dne.field_22c5fd_IjH, this.field_3686033_Dne.field_334487_mrb, random.nextInt(7) + 1));
        }
    }

    @Override
    public boolean method_7a46289e_Dne() {
        if (!this.field_3686033_Dne.method_9f5095a2_ZfC()) {
            return false;
        }
        this.field_20222c12_FWm = this.method_2301ee92_Dne();
        return this.field_20222c12_FWm != null;
    }

    private HzK method_2301ee92_Dne() {
        float f = 8.0f;
        List<HzK> list = (List<HzK>) this.field_36c4f18_Dne.method_9314b7e8_Dne(this.field_3686033_Dne.getClass(), this.field_3686033_Dne.field_373a3ed_Dne.method_b78565d7_FWm(f, f, f));
        double d = Double.MAX_VALUE;
        HzK hzK = null;
        for (HzK hzK2 : list) {
            if (!this.field_3686033_Dne.method_748d96f2_Dne(hzK2) || !(this.field_3686033_Dne.method_bb7dd80e_Dne(hzK2) < d)) continue;
            hzK = hzK2;
            d = this.field_3686033_Dne.method_bb7dd80e_Dne(hzK2);
        }
        return hzK;
    }

    @Override
    public void method_7c6f6039_FWm() {
        this.field_20222c12_FWm = null;
        this.field_2092ae_Dne = 0;
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return this.field_20222c12_FWm.method_cd4cb3d9_udO() && this.field_20222c12_FWm.method_9f5095a2_ZfC() && this.field_2092ae_Dne < 60;
    }
}

