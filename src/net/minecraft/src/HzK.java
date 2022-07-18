package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public abstract class HzK
extends Azh
implements NbA {
    private int field_21260d_FWm;
    private int field_2592c3_One = 0;

    private void method_748d96ee_Dne(HzK hzK) {
        Azh azh = this.method_cafee53a_Dne(hzK);
        if (azh != null) {
            this.method_117d19ea_FWm(6000);
            hzK.method_117d19ea_FWm(6000);
            this.field_21260d_FWm = 0;
            this.field_2592c3_One = 0;
            this.field_75c313d2_bzF = null;
            hzK.field_75c313d2_bzF = null;
            hzK.field_2592c3_One = 0;
            hzK.field_21260d_FWm = 0;
            azh.method_117d19ea_FWm(-24000);
            azh.method_9ce0fc65_FWm(this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb, this.field_334489_mrb, this.field_29186a_XHL);
            for (int i = 0; i < 7; ++i) {
                double d = this.field_7331eae7_Dne.nextGaussian() * 0.02;
                double d2 = this.field_7331eae7_Dne.nextGaussian() * 0.02;
                double d3 = this.field_7331eae7_Dne.nextGaussian() * 0.02;
                this.field_36c4f18_Dne.method_8600ec24_Dne("heart", this.field_2f0dd3_div + (double)(this.field_7331eae7_Dne.nextFloat() * this.field_342261_ooe * 2.0f) - (double)this.field_342261_ooe, this.field_22c5fd_IjH + 0.5 + (double)(this.field_7331eae7_Dne.nextFloat() * this.field_367151_trS), this.field_334487_mrb + (double)(this.field_7331eae7_Dne.nextFloat() * this.field_342261_ooe * 2.0f) - (double)this.field_342261_ooe, d, d2, d3);
            }
            this.field_36c4f18_Dne.method_94d18be5_FWm(azh);
        }
    }

    public boolean method_7c61cf19_Dne(NMq nMq) {
        return nMq.field_2e5f1b_bzF == dEr.field_ce7bf76e_EWz.field_267cf5_Qnq;
    }

    @Override
    public float method_2c2cf7b9_Dne(int n, int n2, int n3) {
        return this.field_36c4f18_Dne.method_2c2cf7bc_Dne(n, n2 - 1, n3) == zKP.field_36ff555_Dne.field_21260d_FWm ? 10.0f : this.field_36c4f18_Dne.method_2c2cf7b9_Dne(n, n2, n3) - 0.5f;
    }

    public HzK(Qnq qnq) {
        super(qnq);
    }

    @Override
    public boolean method_af414cf1_cot() {
        int n;
        int n2;
        int n3 = geR.method_117d0718_FWm(this.field_2f0dd3_div);
        return this.field_36c4f18_Dne.method_2c2cf7bc_Dne(n3, (n2 = geR.method_117d0718_FWm(this.field_373a3ed_Dne.field_212608_FWm)) - 1, n = geR.method_117d0718_FWm(this.field_334487_mrb)) == zKP.field_36ff555_Dne.field_21260d_FWm && this.field_36c4f18_Dne.method_2e7161d5_Qnq(n3, n2, n) > 8 && super.method_af414cf1_cot();
    }

    @Override
    public boolean method_147b2066_Dne(zBn zBn2, int n) {
        if (this.method_7c861acb_EyB()) {
            return false;
        }
        this.field_2092ae_Dne = 60;
        this.field_75c313d2_bzF = null;
        this.field_21260d_FWm = 0;
        return super.method_147b2066_Dne(zBn2, n);
    }

    @Override
    protected int method_70328496_Dne(FiG fiG) {
        return 1 + this.field_36c4f18_Dne.field_7331eae7_Dne.nextInt(3);
    }

    @Override
    protected sMa method_2314d444_Dne() {
        block5: {
            float f;
            block6: {
                block4: {
                    if (this.field_2092ae_Dne > 0) {
                        return null;
                    }
                    f = 8.0f;
                    if (this.field_21260d_FWm <= 0) break block4;
                    List list = this.field_36c4f18_Dne.method_9314b7e8_Dne(this.getClass(), this.field_373a3ed_Dne.method_b78565d7_FWm(f, f, f));
                    for (int i = 0; i < list.size(); ++i) {
                        HzK hzK = (HzK)list.get(i);
                        if (hzK == this || hzK.field_21260d_FWm <= 0) continue;
                        return hzK;
                    }
                    break block5;
                }
                if (this.method_ae128dba_bzF() != 0) break block6;
                List list = this.field_36c4f18_Dne.method_9314b7e8_Dne(FiG.class, this.field_373a3ed_Dne.method_b78565d7_FWm(f, f, f));
                for (int i = 0; i < list.size(); ++i) {
                    FiG fiG = (FiG)list.get(i);
                    if (fiG.method_22900b26_bzF() == null || !this.method_7c61cf19_Dne(fiG.method_22900b26_bzF())) continue;
                    return fiG;
                }
                break block5;
            }
            if (this.method_ae128dba_bzF() <= 0) break block5;
            List list = this.field_36c4f18_Dne.method_9314b7e8_Dne(this.getClass(), this.field_373a3ed_Dne.method_b78565d7_FWm(f, f, f));
            for (int i = 0; i < list.size(); ++i) {
                HzK hzK = (HzK)list.get(i);
                if (hzK == this || hzK.method_ae128dba_bzF() >= 0) continue;
                return hzK;
            }
        }
        return null;
    }

    @Override
    public int method_c073daeb_mrb() {
        return 120;
    }

    @Override
    public void method_8d4fb917_Dne(WkD wkD) {
        super.method_8d4fb917_Dne(wkD);
        wkD.method_5ab44f9f_Dne("InLove", this.field_21260d_FWm);
    }

    @Override
    public boolean method_21db0ca_a_(FiG fiG) {
        NMq nMq = fiG.field_36a059b_Dne.method_23040479_Dne();
        if (nMq != null && this.method_7c61cf19_Dne(nMq) && this.method_ae128dba_bzF() == 0 && this.field_21260d_FWm <= 0) {
            if (!fiG.field_37cb681_Dne.field_267d06_Qnq) {
                --nMq.field_2092ae_Dne;
                if (nMq.field_2092ae_Dne <= 0) {
                    fiG.field_36a059b_Dne.method_6e3a6b66_Dne(fiG.field_36a059b_Dne.field_2092ae_Dne, null);
                }
            }
            this.field_21260d_FWm = 600;
            this.field_75c313d2_bzF = null;
            for (int i = 0; i < 7; ++i) {
                double d = this.field_7331eae7_Dne.nextGaussian() * 0.02;
                double d2 = this.field_7331eae7_Dne.nextGaussian() * 0.02;
                double d3 = this.field_7331eae7_Dne.nextGaussian() * 0.02;
                this.field_36c4f18_Dne.method_8600ec24_Dne("heart", this.field_2f0dd3_div + (double)(this.field_7331eae7_Dne.nextFloat() * this.field_342261_ooe * 2.0f) - (double)this.field_342261_ooe, this.field_22c5fd_IjH + 0.5 + (double)(this.field_7331eae7_Dne.nextFloat() * this.field_367151_trS), this.field_334487_mrb + (double)(this.field_7331eae7_Dne.nextFloat() * this.field_342261_ooe * 2.0f) - (double)this.field_342261_ooe, d, d2, d3);
            }
            return true;
        }
        return super.method_21db0ca_a_(fiG);
    }

    @Override
    protected void method_b43d93a0_Dne(sMa sMa2, float f) {
        if (sMa2 instanceof FiG) {
            FiG fiG;
            if (f < 3.0f) {
                double d = sMa2.field_2f0dd3_div - this.field_2f0dd3_div;
                double d2 = sMa2.field_334487_mrb - this.field_334487_mrb;
                this.field_334489_mrb = (float)(Math.atan2(d2, d) * 180.0 / Math.PI) - 90.0f;
                this.field_2092bf_Dne = true;
            }
            if ((fiG = (FiG)sMa2).method_22900b26_bzF() == null || !this.method_7c61cf19_Dne(fiG.method_22900b26_bzF())) {
                this.field_75c313d2_bzF = null;
            }
        } else if (sMa2 instanceof HzK) {
            HzK hzK = (HzK)sMa2;
            if (this.method_ae128dba_bzF() > 0 && hzK.method_ae128dba_bzF() < 0) {
                if ((double)f < 2.5) {
                    this.field_2092bf_Dne = true;
                }
            } else if (this.field_21260d_FWm > 0 && hzK.field_21260d_FWm > 0) {
                if (hzK.field_75c313d2_bzF == null) {
                    hzK.field_75c313d2_bzF = this;
                }
                if (hzK.field_75c313d2_bzF == this && (double)f < 3.5) {
                    ++hzK.field_21260d_FWm;
                    ++this.field_21260d_FWm;
                    ++this.field_2592c3_One;
                    if (this.field_2592c3_One % 4 == 0) {
                        this.field_36c4f18_Dne.method_8600ec24_Dne("heart", this.field_2f0dd3_div + (double)(this.field_7331eae7_Dne.nextFloat() * this.field_342261_ooe * 2.0f) - (double)this.field_342261_ooe, this.field_22c5fd_IjH + 0.5 + (double)(this.field_7331eae7_Dne.nextFloat() * this.field_367151_trS), this.field_334487_mrb + (double)(this.field_7331eae7_Dne.nextFloat() * this.field_342261_ooe * 2.0f) - (double)this.field_342261_ooe, 0.0, 0.0, 0.0);
                    }
                    if (this.field_2592c3_One == 60) {
                        this.method_748d96ee_Dne((HzK)sMa2);
                    }
                } else {
                    this.field_2592c3_One = 0;
                }
            } else {
                this.field_2592c3_One = 0;
                this.field_75c313d2_bzF = null;
            }
        }
    }

    @Override
    protected boolean method_d2ef85b3_yMz() {
        return false;
    }

    public void method_907a9d21_Qnq() {
        this.field_21260d_FWm = 0;
    }

    @Override
    public void method_66a36cd8_FWm(WkD wkD) {
        super.method_66a36cd8_FWm(wkD);
        this.field_21260d_FWm = wkD.method_8f501fd7_Dne("InLove");
    }

    @Override
    protected void method_c011aad0_mlD() {
        if (this.method_ae128dba_bzF() != 0) {
            this.field_21260d_FWm = 0;
        }
        super.method_c011aad0_mlD();
    }

    public boolean method_748d96f2_Dne(HzK hzK) {
        return hzK == this ? false : (hzK.getClass() != this.getClass() ? false : this.method_9f5095a2_ZfC() && hzK.method_9f5095a2_ZfC());
    }

    @Override
    public void method_8288d6ee_IjH() {
        super.method_8288d6ee_IjH();
        if (this.method_ae128dba_bzF() != 0) {
            this.field_21260d_FWm = 0;
        }
        if (this.field_21260d_FWm > 0) {
            --this.field_21260d_FWm;
            String string = "heart";
            if (this.field_21260d_FWm % 10 == 0) {
                double d = this.field_7331eae7_Dne.nextGaussian() * 0.02;
                double d2 = this.field_7331eae7_Dne.nextGaussian() * 0.02;
                double d3 = this.field_7331eae7_Dne.nextGaussian() * 0.02;
                this.field_36c4f18_Dne.method_8600ec24_Dne(string, this.field_2f0dd3_div + (double)(this.field_7331eae7_Dne.nextFloat() * this.field_342261_ooe * 2.0f) - (double)this.field_342261_ooe, this.field_22c5fd_IjH + 0.5 + (double)(this.field_7331eae7_Dne.nextFloat() * this.field_367151_trS), this.field_334487_mrb + (double)(this.field_7331eae7_Dne.nextFloat() * this.field_342261_ooe * 2.0f) - (double)this.field_342261_ooe, d, d2, d3);
            }
        } else {
            this.field_2592c3_One = 0;
        }
    }

    public boolean method_9f5095a2_ZfC() {
        return this.field_21260d_FWm > 0;
    }
}

