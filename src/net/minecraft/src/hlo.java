package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class hlo
extends LHi {
    private float field_2092ab_Dne = 0.5f;
    private int field_21260d_FWm;
    private int field_2592c3_One;

    @Override
    public int method_ce7f5259_Dne(float f) {
        return 0xF000F0;
    }

    @Override
    protected String method_3c9d12fd_DyG() {
        return "mob.blaze.hit";
    }

    @Override
    protected int method_baa393f5_kGO() {
        return dEr.field_d1baeb7c_TpV.field_267cf5_Qnq;
    }

    @Override
    protected String method_6a89a3dc_div() {
        return "mob.blaze.death";
    }

    @Override
    protected void method_ce7f5266_Dne(float f) {
    }

    public boolean method_86921671_LVR() {
        return (this.field_378ab08_Dne.method_ce7f5d95_Dne(16) & 1) != 0;
    }

    @Override
    protected void method_17484c9_Dne(boolean bl, int n) {
        if (bl) {
            int n2 = this.field_7331eae7_Dne.nextInt(2 + n);
            for (int i = 0; i < n2; ++i) {
                this.method_9045499d_Dne(dEr.field_d1baeb7c_TpV.field_267cf5_Qnq, 1);
            }
        }
    }

    @Override
    public int method_7a46288d_Dne() {
        return 20;
    }

    @Override
    public boolean method_cc5ef5c4_trS() {
        return this.method_86921671_LVR();
    }

    @Override
    protected void method_b43d93a0_Dne(sMa sMa2, float f) {
        if (this.field_26818f_RPx <= 0 && f < 2.0f && sMa2.field_373a3ed_Dne.field_2d29ef_aFZ > this.field_373a3ed_Dne.field_212608_FWm && sMa2.field_373a3ed_Dne.field_212608_FWm < this.field_373a3ed_Dne.field_2d29ef_aFZ) {
            this.field_26818f_RPx = 20;
            this.method_ad72a717_bzF(sMa2);
        } else if (f < 30.0f) {
            double d = sMa2.field_2f0dd3_div - this.field_2f0dd3_div;
            double d2 = sMa2.field_373a3ed_Dne.field_212608_FWm + (double)(sMa2.field_367151_trS / 2.0f) - (this.field_22c5fd_IjH + (double)(this.field_367151_trS / 2.0f));
            double d3 = sMa2.field_334487_mrb - this.field_334487_mrb;
            if (this.field_26818f_RPx == 0) {
                ++this.field_2592c3_One;
                if (this.field_2592c3_One == 1) {
                    this.field_26818f_RPx = 60;
                    this.method_117d59bb_FWm(true);
                } else if (this.field_2592c3_One <= 4) {
                    this.field_26818f_RPx = 6;
                } else {
                    this.field_26818f_RPx = 100;
                    this.field_2592c3_One = 0;
                    this.method_117d59bb_FWm(false);
                }
                if (this.field_2592c3_One > 1) {
                    float f2 = geR.method_143f92c9_bzF(f) * 0.5f;
                    this.field_36c4f18_Dne.method_bfa54b80_Dne(null, 1009, (int)this.field_2f0dd3_div, (int)this.field_22c5fd_IjH, (int)this.field_334487_mrb, 0);
                    for (int i = 0; i < 1; ++i) {
                        Xzh xzh = new Xzh(this.field_36c4f18_Dne, this, d + this.field_7331eae7_Dne.nextGaussian() * (double)f2, d2, d3 + this.field_7331eae7_Dne.nextGaussian() * (double)f2);
                        xzh.field_22c5fd_IjH = this.field_22c5fd_IjH + (double)(this.field_367151_trS / 2.0f) + 0.5;
                        this.field_36c4f18_Dne.method_94d18be5_FWm(xzh);
                    }
                }
            }
            this.field_334489_mrb = (float)(Math.atan2(d3, d) * 180.0 / Math.PI) - 90.0f;
            this.field_2092bf_Dne = true;
        }
    }

    @Override
    public int method_bb7dd813_Dne(sMa sMa2) {
        return 6;
    }

    public hlo(Qnq qnq) {
        super(qnq);
        this.field_c480ca78_bzF = "/mob/fire.png";
        this.field_342275_ooe = true;
        this.field_217c26_Fnk = 10;
    }

    @Override
    public void method_8288d6ee_IjH() {
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ) {
            if (this.method_9a443a9d_XHL()) {
                this.method_147b2066_Dne(zBn.field_7141d10c_aFZ, 1);
            }
            --this.field_21260d_FWm;
            if (this.field_21260d_FWm <= 0) {
                this.field_21260d_FWm = 100;
                this.field_2092ab_Dne = 0.5f + (float)this.field_7331eae7_Dne.nextGaussian() * 3.0f;
            }
            if (this.method_f88b2463_FWm() != null && this.method_f88b2463_FWm().field_22c5fd_IjH + (double)this.method_f88b2463_FWm().method_59ee189_c_() > this.field_22c5fd_IjH + (double)this.method_59ee189_c_() + (double)this.field_2092ab_Dne) {
                this.field_2a9ad1_Zpi += ((double)0.3f - this.field_2a9ad1_Zpi) * (double)0.3f;
            }
        }
        if (this.field_7331eae7_Dne.nextInt(24) == 0) {
            this.field_36c4f18_Dne.method_c961c6ee_Dne(this.field_2f0dd3_div + 0.5, this.field_22c5fd_IjH + 0.5, this.field_334487_mrb + 0.5, "fire.fire", 1.0f + this.field_7331eae7_Dne.nextFloat(), this.field_7331eae7_Dne.nextFloat() * 0.7f + 0.3f);
        }
        if (!this.field_2d2a05_aFZ && this.field_2a9ad1_Zpi < 0.0) {
            this.field_2a9ad1_Zpi *= 0.6;
        }
        for (int i = 0; i < 2; ++i) {
            this.field_36c4f18_Dne.method_8600ec24_Dne("largesmoke", this.field_2f0dd3_div + (this.field_7331eae7_Dne.nextDouble() - 0.5) * (double)this.field_342261_ooe, this.field_22c5fd_IjH + this.field_7331eae7_Dne.nextDouble() * (double)this.field_367151_trS, this.field_334487_mrb + (this.field_7331eae7_Dne.nextDouble() - 0.5) * (double)this.field_342261_ooe, 0.0, 0.0, 0.0);
        }
        super.method_8288d6ee_IjH();
    }

    @Override
    protected void method_7c6f6039_FWm() {
        super.method_7c6f6039_FWm();
        this.field_378ab08_Dne.method_ad009545_Dne(16, (byte) 0);
    }

    @Override
    protected boolean method_80692b1e_ICU() {
        return true;
    }

    @Override
    protected String method_a174454e_zGp() {
        return "mob.blaze.breathe";
    }

    public void method_117d59bb_FWm(boolean bl) {
        byte by = this.field_378ab08_Dne.method_ce7f5d95_Dne(16);
        by = bl ? (byte)(by | 1) : (byte)(by & 0xFFFFFFFE);
        this.field_378ab08_Dne.method_62ca2346_FWm(16, by);
    }

    @Override
    public float method_ce7f5256_Dne(float f) {
        return 1.0f;
    }
}

