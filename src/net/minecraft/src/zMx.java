package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class zMx
extends sMa {
    private int field_2092ae_Dne;
    private int field_21260d_FWm;

    @Override
    public boolean method_ae128dcb_bzF() {
        return false;
    }

    @Override
    public void method_ce7f4362_Dne(byte by) {
        if (by == 17 && this.field_36c4f18_Dne.field_2d2a05_aFZ) {
            NMq nMq = this.field_378ab08_Dne.method_9e6e1a08_Dne(8);
            WkD wkD = null;
            if (nMq != null && nMq.method_a98a0664_aFZ()) {
                wkD = nMq.method_230886fb_Dne().method_2851c945_Dne("Fireworks");
            }
            this.field_36c4f18_Dne.method_37142557_Dne(this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb, this.field_291868_XHL, this.field_2a9ad1_Zpi, this.field_31b811_kGO, wkD);
        }
        super.method_ce7f4362_Dne(by);
    }

    @Override
    public void method_66a36cd8_FWm(WkD wkD) {
        NMq nMq;
        this.field_2092ae_Dne = wkD.method_8f501fd7_Dne("Life");
        this.field_21260d_FWm = wkD.method_8f501fd7_Dne("LifeTime");
        WkD wkD2 = wkD.method_2851c945_Dne("FireworksItem");
        if (wkD2 != null && (nMq = NMq.method_7da70e76_Dne(wkD2)) != null) {
            this.field_378ab08_Dne.method_62ca2346_FWm(8, nMq);
        }
    }

    @Override
    public boolean method_ce7f4ae8_Dne(double d) {
        return d < 4096.0;
    }

    @Override
    public float method_ce7f5256_Dne(float f) {
        return super.method_ce7f5256_Dne(f);
    }

    @Override
    public int method_ce7f5259_Dne(float f) {
        return super.method_ce7f5259_Dne(f);
    }

    @Override
    public void method_7a46289a_Dne() {
        this.field_36b0a4_udO = this.field_2f0dd3_div;
        this.field_34225f_ooe = this.field_22c5fd_IjH;
        this.field_36714f_trS = this.field_334487_mrb;
        super.method_7a46289a_Dne();
        this.field_291868_XHL *= 1.15;
        this.field_31b811_kGO *= 1.15;
        this.field_2a9ad1_Zpi += 0.04;
        this.method_2be429a4_Dne(this.field_291868_XHL, this.field_2a9ad1_Zpi, this.field_31b811_kGO);
        float f = geR.method_ce7f4ad4_Dne(this.field_291868_XHL * this.field_291868_XHL + this.field_31b811_kGO * this.field_31b811_kGO);
        this.field_334489_mrb = (float)(Math.atan2(this.field_291868_XHL, this.field_31b811_kGO) * 180.0 / Math.PI);
        this.field_29186a_XHL = (float)(Math.atan2(this.field_2a9ad1_Zpi, f) * 180.0 / Math.PI);
        while (this.field_29186a_XHL - this.field_31b813_kGO < -180.0f) {
            this.field_31b813_kGO -= 360.0f;
        }
        while (this.field_29186a_XHL - this.field_31b813_kGO >= 180.0f) {
            this.field_31b813_kGO += 360.0f;
        }
        while (this.field_334489_mrb - this.field_2a9ad3_Zpi < -180.0f) {
            this.field_2a9ad3_Zpi -= 360.0f;
        }
        while (this.field_334489_mrb - this.field_2a9ad3_Zpi >= 180.0f) {
            this.field_2a9ad3_Zpi += 360.0f;
        }
        this.field_29186a_XHL = this.field_31b813_kGO + (this.field_29186a_XHL - this.field_31b813_kGO) * 0.2f;
        this.field_334489_mrb = this.field_2a9ad3_Zpi + (this.field_334489_mrb - this.field_2a9ad3_Zpi) * 0.2f;
        if (this.field_2092ae_Dne == 0) {
            this.field_36c4f18_Dne.method_a36f5f6a_Dne(this, "fireworks.launch", 3.0f, 1.0f);
        }
        ++this.field_2092ae_Dne;
        if (this.field_36c4f18_Dne.field_2d2a05_aFZ && this.field_2092ae_Dne % 2 < 2) {
            this.field_36c4f18_Dne.method_8600ec24_Dne("fireworksSpark", this.field_2f0dd3_div, this.field_22c5fd_IjH - 0.3, this.field_334487_mrb, this.field_7331eae7_Dne.nextGaussian() * 0.05, -this.field_2a9ad1_Zpi * 0.5, this.field_7331eae7_Dne.nextGaussian() * 0.05);
        }
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ && this.field_2092ae_Dne > this.field_21260d_FWm) {
            this.field_36c4f18_Dne.method_b43d849c_Dne(this, (byte)17);
            this.method_5d73f9d_g_();
        }
    }

    @Override
    public void method_76912e1e_aFZ(double d, double d2, double d3) {
        this.field_291868_XHL = d;
        this.field_2a9ad1_Zpi = d2;
        this.field_31b811_kGO = d3;
        if (this.field_31b813_kGO == 0.0f && this.field_2a9ad3_Zpi == 0.0f) {
            float f = geR.method_ce7f4ad4_Dne(d * d + d3 * d3);
            this.field_2a9ad3_Zpi = this.field_334489_mrb = (float)(Math.atan2(d, d3) * 180.0 / Math.PI);
            this.field_31b813_kGO = this.field_29186a_XHL = (float)(Math.atan2(d2, f) * 180.0 / Math.PI);
        }
    }

    public zMx(Qnq qnq) {
        super(qnq);
        this.method_16b621a_Dne(0.25f, 0.25f);
    }

    @Override
    public float method_7a46288a_Dne() {
        return 0.0f;
    }

    public zMx(Qnq qnq, double d, double d2, double d3, NMq nMq) {
        super(qnq);
        this.field_2092ae_Dne = 0;
        this.method_16b621a_Dne(0.25f, 0.25f);
        this.method_2961957_bzF(d, d2, d3);
        this.field_36b0a6_udO = 0.0f;
        int n = 1;
        if (nMq != null && nMq.method_a98a0664_aFZ()) {
            this.field_378ab08_Dne.method_62ca2346_FWm(8, nMq);
            WkD wkD = nMq.method_230886fb_Dne();
            WkD wkD2 = wkD.method_2851c945_Dne("Fireworks");
            if (wkD2 != null) {
                n += wkD2.method_8f501fd0_Dne("Flight");
            }
        }
        this.field_291868_XHL = this.field_7331eae7_Dne.nextGaussian() * 0.001;
        this.field_31b811_kGO = this.field_7331eae7_Dne.nextGaussian() * 0.001;
        this.field_2a9ad1_Zpi = 0.05;
        this.field_21260d_FWm = 10 * n + this.field_7331eae7_Dne.nextInt(6) + this.field_7331eae7_Dne.nextInt(7);
    }

    @Override
    public void method_8d4fb917_Dne(WkD wkD) {
        wkD.method_5ab44f9f_Dne("Life", this.field_2092ae_Dne);
        wkD.method_5ab44f9f_Dne("LifeTime", this.field_21260d_FWm);
        NMq nMq = this.field_378ab08_Dne.method_9e6e1a08_Dne(8);
        if (nMq != null) {
            WkD wkD2 = new WkD();
            nMq.method_7dab90f8_Dne(wkD2);
            wkD.method_312ec00d_Dne("FireworksItem", wkD2);
        }
    }

    @Override
    protected void method_7c6f6039_FWm() {
        this.field_378ab08_Dne.method_16cca7a_Dne(8, 5);
    }
}

