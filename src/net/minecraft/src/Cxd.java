package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public abstract class Cxd
extends Ebp
implements MqS {
    private NMq[] field_8360c375_Dne = new NMq[36];
    private boolean field_2092bf_Dne = true;

    @Override
    public void method_ae128dc7_bzF() {
    }

    @Override
    public int method_a98a0653_aFZ() {
        return erC.field_2092ae_Dne;
    }

    public Cxd(Qnq qnq) {
        super(qnq);
    }

    @Override
    public boolean method_6e3a6b6a_Dne(int n, NMq nMq) {
        return true;
    }

    @Override
    public void method_5d73f9d_g_() {
        if (this.field_2092bf_Dne) {
            for (int i = 0; i < this.method_907a9d14_Qnq(); ++i) {
                NMq nMq = this.method_9e6e1a08_Dne(i);
                if (nMq == null) continue;
                float f = this.field_7331eae7_Dne.nextFloat() * 0.8f + 0.1f;
                float f2 = this.field_7331eae7_Dne.nextFloat() * 0.8f + 0.1f;
                float f3 = this.field_7331eae7_Dne.nextFloat() * 0.8f + 0.1f;
                while (nMq.field_2092ae_Dne > 0) {
                    int n = this.field_7331eae7_Dne.nextInt(21) + 10;
                    if (n > nMq.field_2092ae_Dne) {
                        n = nMq.field_2092ae_Dne;
                    }
                    nMq.field_2092ae_Dne -= n;
                    JiM jiM = new JiM(this.field_36c4f18_Dne, this.field_2f0dd3_div + (double)f, this.field_22c5fd_IjH + (double)f2, this.field_334487_mrb + (double)f3, new NMq(nMq.field_2e5f1b_bzF, n, nMq.method_907a9d14_Qnq()));
                    if (nMq.method_a98a0664_aFZ()) {
                        jiM.method_23040479_Dne().method_66a36cd8_FWm((WkD)nMq.method_230886fb_Dne().method_23130705_Dne());
                    }
                    float f4 = 0.05f;
                    jiM.field_291868_XHL = (float)this.field_7331eae7_Dne.nextGaussian() * f4;
                    jiM.field_2a9ad1_Zpi = (float)this.field_7331eae7_Dne.nextGaussian() * f4 + 0.2f;
                    jiM.field_31b811_kGO = (float)this.field_7331eae7_Dne.nextGaussian() * f4;
                    this.field_36c4f18_Dne.method_94d18be5_FWm(jiM);
                }
            }
        }
        super.method_5d73f9d_g_();
    }

    @Override
    public void method_6e3a6b66_Dne(int n, NMq nMq) {
        this.field_8360c375_Dne[n] = nMq;
        if (nMq != null && nMq.field_2092ae_Dne > this.method_a98a0653_aFZ()) {
            nMq.field_2092ae_Dne = this.method_a98a0653_aFZ();
        }
    }

    @Override
    public void method_c6daaac1_Dne(zBn zBn2) {
        super.method_c6daaac1_Dne(zBn2);
        for (int i = 0; i < this.method_907a9d14_Qnq(); ++i) {
            NMq nMq = this.method_9e6e1a08_Dne(i);
            if (nMq == null) continue;
            float f = this.field_7331eae7_Dne.nextFloat() * 0.8f + 0.1f;
            float f2 = this.field_7331eae7_Dne.nextFloat() * 0.8f + 0.1f;
            float f3 = this.field_7331eae7_Dne.nextFloat() * 0.8f + 0.1f;
            while (nMq.field_2092ae_Dne > 0) {
                int n = this.field_7331eae7_Dne.nextInt(21) + 10;
                if (n > nMq.field_2092ae_Dne) {
                    n = nMq.field_2092ae_Dne;
                }
                nMq.field_2092ae_Dne -= n;
                JiM jiM = new JiM(this.field_36c4f18_Dne, this.field_2f0dd3_div + (double)f, this.field_22c5fd_IjH + (double)f2, this.field_334487_mrb + (double)f3, new NMq(nMq.field_2e5f1b_bzF, n, nMq.method_907a9d14_Qnq()));
                float f4 = 0.05f;
                jiM.field_291868_XHL = (float)this.field_7331eae7_Dne.nextGaussian() * f4;
                jiM.field_2a9ad1_Zpi = (float)this.field_7331eae7_Dne.nextGaussian() * f4 + 0.2f;
                jiM.field_31b811_kGO = (float)this.field_7331eae7_Dne.nextGaussian() * f4;
                this.field_36c4f18_Dne.method_94d18be5_FWm(jiM);
            }
        }
    }

    @Override
    protected void method_66a36cd8_FWm(WkD wkD) {
        super.method_66a36cd8_FWm(wkD);
        mbZ mbZ2 = wkD.method_285baa50_Dne("Items");
        this.field_8360c375_Dne = new NMq[this.method_907a9d14_Qnq()];
        for (int i = 0; i < mbZ2.method_7a46288d_Dne(); ++i) {
            WkD wkD2 = (WkD)mbZ2.method_77d0d055_FWm(i);
            int n = wkD2.method_8f501fd0_Dne("Slot") & 0xFF;
            if (n < 0 || n >= this.field_8360c375_Dne.length) continue;
            this.field_8360c375_Dne[n] = NMq.method_7da70e76_Dne(wkD2);
        }
    }

    @Override
    public void method_5f36e9f_i_() {
    }

    @Override
    protected void method_907a9d21_Qnq() {
        int n = 15 - Pdb.method_7c9aa16b_Dne(this);
        float f = 0.98f + (float)n * 0.001f;
        this.field_291868_XHL *= (double)f;
        this.field_2a9ad1_Zpi *= 0.0;
        this.field_31b811_kGO *= (double)f;
    }

    @Override
    public void method_582b297_a_() {
    }

    @Override
    public boolean method_703284a7_Dne(FiG fiG) {
        return this.field_2a9ae7_Zpi ? false : fiG.method_bb7dd80e_Dne(this) <= 64.0;
    }

    public Cxd(Qnq qnq, double d, double d2, double d3) {
        super(qnq, d, d2, d3);
    }

    @Override
    public String method_9fc39d88_b_() {
        return this.method_5acf91e_d_() ? this.method_d1f1ed87_FWm() : "container.minecart";
    }

    @Override
    public NMq method_9e6e1a08_Dne(int n) {
        return this.field_8360c375_Dne[n];
    }

    @Override
    public void method_7ed97a02_Qnq(int n) {
        this.field_2092bf_Dne = false;
        super.method_7ed97a02_Qnq(n);
    }

    @Override
    protected void method_8d4fb917_Dne(WkD wkD) {
        super.method_8d4fb917_Dne(wkD);
        mbZ mbZ2 = new mbZ();
        for (int i = 0; i < this.field_8360c375_Dne.length; ++i) {
            if (this.field_8360c375_Dne[i] == null) continue;
            WkD wkD2 = new WkD();
            wkD2.method_5ab43558_Dne("Slot", (byte)i);
            this.field_8360c375_Dne[i].method_7dab90f8_Dne(wkD2);
            mbZ2.method_b4ba5ea1_Dne(wkD2);
        }
        wkD.method_58996597_Dne("Items", mbZ2);
    }

    @Override
    public boolean method_21db0ca_a_(FiG fiG) {
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ) {
            fiG.method_7c9aa178_Dne(this);
        }
        return true;
    }

    @Override
    public NMq method_9046b659_Dne(int n, int n2) {
        if (this.field_8360c375_Dne[n] != null) {
            if (this.field_8360c375_Dne[n].field_2092ae_Dne <= n2) {
                NMq nMq = this.field_8360c375_Dne[n];
                this.field_8360c375_Dne[n] = null;
                return nMq;
            }
            NMq nMq = this.field_8360c375_Dne[n].method_9e6e1a08_Dne(n2);
            if (this.field_8360c375_Dne[n].field_2092ae_Dne == 0) {
                this.field_8360c375_Dne[n] = null;
            }
            return nMq;
        }
        return null;
    }

    @Override
    public NMq method_77c1cdc9_FWm(int n) {
        if (this.field_8360c375_Dne[n] != null) {
            NMq nMq = this.field_8360c375_Dne[n];
            this.field_8360c375_Dne[n] = null;
            return nMq;
        }
        return null;
    }
}

