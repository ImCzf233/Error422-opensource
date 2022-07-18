package net.minecraft.src;
import java.util.Iterator;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class WSC
extends FUH
implements eKx,
sQM {
    public Dur field_5e4fef72_Qnq;
    public double field_212608_FWm;
    public int field_21260d_FWm = 0;
    public double[][] field_7a46ee09_Dne = new double[64][3];
    public Dur field_1619a9d4_DyG;
    public boolean field_2092bf_Dne = false;
    public int field_2092ae_Dne = -1;
    public Dur[] field_835cce06_Dne;
    public float field_2092ab_Dne = 0.0f;
    public Dur field_36680ab_Dne = new Dur(this, "head", 6.0f, 6.0f);
    public Dur field_f0983fa3_zGp;
    private sMa field_75c313d2_bzF;
    public double field_2092a9_Dne;
    public Dur field_712a04f1_aFZ;
    public float field_21260a_FWm = 0.0f;
    public Ndk field_36acbb7_Dne = null;
    public double field_212c16_EyB;
    public boolean field_21261e_FWm = false;
    public Dur field_20204c8a_FWm = new Dur(this, "body", 8.0f, 8.0f);
    public Dur field_75ae4e98_bzF = new Dur(this, "tail", 4.0f, 4.0f);

    protected boolean method_659de4c5_FWm(zBn zBn2, int n) {
        return super.method_147b2066_Dne(zBn2, n);
    }

    private float method_ce7f4ad4_Dne(double d) {
        return (float)geR.method_ce7f4ad2_Dne(d);
    }

    @Override
    public boolean method_baa39406_kGO() {
        return false;
    }

    @Override
    public Qnq method_2305dd77_Dne() {
        return this.field_36c4f18_Dne;
    }

    @Override
    protected String method_3c9d12fd_DyG() {
        return "mob.enderdragon.hit";
    }

    private void method_d44b4592_zGp() {
        this.field_2092bf_Dne = false;
        if (this.field_7331eae7_Dne.nextInt(2) == 0 && !this.field_36c4f18_Dne.field_2c197105_Qnq.isEmpty()) {
            this.field_75c313d2_bzF = (sMa)this.field_36c4f18_Dne.field_2c197105_Qnq.get(this.field_7331eae7_Dne.nextInt(this.field_36c4f18_Dne.field_2c197105_Qnq.size()));
        } else {
            double d;
            double d2;
            double d3;
            boolean bl = false;
            do {
                this.field_2092a9_Dne = 0.0;
                this.field_212608_FWm = 70.0f + this.field_7331eae7_Dne.nextFloat() * 50.0f;
                this.field_212c16_EyB = 0.0;
                this.field_2092a9_Dne += (double)(this.field_7331eae7_Dne.nextFloat() * 120.0f - 60.0f);
                this.field_212c16_EyB += (double)(this.field_7331eae7_Dne.nextFloat() * 120.0f - 60.0f);
            } while (!(bl = (d3 = this.field_2f0dd3_div - this.field_2092a9_Dne) * d3 + (d2 = this.field_22c5fd_IjH - this.field_212608_FWm) * d2 + (d = this.field_334487_mrb - this.field_212c16_EyB) * d > 100.0));
            this.field_75c313d2_bzF = null;
        }
    }

    @Override
    public int method_59ee18c_c_() {
        return this.field_378ab08_Dne.method_ce7f5d9c_Dne(16);
    }

    public WSC(Qnq qnq) {
        super(qnq);
        this.field_5e4fef72_Qnq = new Dur(this, "tail", 4.0f, 4.0f);
        this.field_712a04f1_aFZ = new Dur(this, "tail", 4.0f, 4.0f);
        this.field_f0983fa3_zGp = new Dur(this, "wing", 4.0f, 4.0f);
        this.field_1619a9d4_DyG = new Dur(this, "wing", 4.0f, 4.0f);
        this.field_835cce06_Dne = new Dur[]{this.field_36680ab_Dne, this.field_20204c8a_FWm, this.field_75ae4e98_bzF, this.field_5e4fef72_Qnq, this.field_712a04f1_aFZ, this.field_f0983fa3_zGp, this.field_1619a9d4_DyG};
        this.method_143f9e1c_bzF(this.method_7a46288d_Dne());
        this.field_c480ca78_bzF = "/mob/enderdragon/ender.png";
        this.method_16b621a_Dne(16.0f, 8.0f);
        this.field_31b827_kGO = true;
        this.field_342275_ooe = true;
        this.field_212608_FWm = 100.0;
        this.field_348583_qLR = true;
    }

    @Override
    protected String method_a174454e_zGp() {
        return "mob.enderdragon.growl";
    }

    private void method_907a9d21_Qnq() {
        if (this.field_36acbb7_Dne != null) {
            if (this.field_36acbb7_Dne.field_2a9ae7_Zpi) {
                if (!this.field_36c4f18_Dne.field_2d2a05_aFZ) {
                    this.method_7675a832_Dne(this.field_36680ab_Dne, zBn.method_4ba6665b_Dne(null), 10);
                }
                this.field_36acbb7_Dne = null;
            } else if (this.field_388da6_zGp % 10 == 0 && this.method_9a443a8c_XHL() < this.method_7a46288d_Dne()) {
                this.method_143f9e1c_bzF(this.method_9a443a8c_XHL() + 1);
            }
        }
        if (this.field_7331eae7_Dne.nextInt(10) == 0) {
            float f = 32.0f;
            List<Ndk> list = this.field_36c4f18_Dne.method_9314b7e8_Dne(Ndk.class, this.field_373a3ed_Dne.method_b78565d7_FWm(f, f, f));
            Ndk ndk = null;
            double d = Double.MAX_VALUE;
            for (Ndk ndk2 : list) {
                double d2 = ndk2.method_bb7dd80e_Dne(this);
                if (!(d2 < d)) continue;
                d = d2;
                ndk = ndk2;
            }
            this.field_36acbb7_Dne = ndk;
        }
    }

    private void method_ea14418b_Dne(List var1) {
        double var2 = (this.field_20204c8a_FWm.field_373a3ed_Dne.field_2092a9_Dne + this.field_20204c8a_FWm.field_373a3ed_Dne.field_267cf0_Qnq) / 2.0D;
        double var4 = (this.field_20204c8a_FWm.field_373a3ed_Dne.field_2e5f16_bzF + this.field_20204c8a_FWm.field_373a3ed_Dne.field_388da1_zGp) / 2.0D;
        Iterator var6 = var1.iterator();

        while(var6.hasNext()) {
            sMa var7 = (sMa)var6.next();
            if (var7 instanceof FUH) {
                double var8 = var7.field_2f0dd3_div - var2;
                double var10 = var7.field_334487_mrb - var4;
                double var12 = var8 * var8 + var10 * var10;
                var7.method_2e2893bd_Qnq(var8 / var12 * 4.0D, 0.20000000298023224D, var10 / var12 * 4.0D);
            }
        }

    }

    @Override
    public boolean method_147b2066_Dne(zBn zBn2, int n) {
        return false;
    }

    private void method_16cca7a_Dne(int n, int n2) {
        int n3 = 64;
        aQq.field_2092bf_Dne = true;
        int n4 = 4;
        for (int i = n3 - 1; i <= n3 + 32; ++i) {
            for (int j = n - n4; j <= n + n4; ++j) {
                for (int k = n2 - n4; k <= n2 + n4; ++k) {
                    double d = j - n;
                    double d2 = k - n2;
                    double d3 = d * d + d2 * d2;
                    if (!(d3 <= ((double)n4 - 0.5) * ((double)n4 - 0.5))) continue;
                    if (i < n3) {
                        if (!(d3 <= ((double)(n4 - 1) - 0.5) * ((double)(n4 - 1) - 0.5))) continue;
                        this.field_36c4f18_Dne.method_2ee8c47d_FWm(j, i, k, zKP.field_f0b029e5_zGp.field_21260d_FWm);
                        continue;
                    }
                    if (i > n3) {
                        this.field_36c4f18_Dne.method_2ee8c47d_FWm(j, i, k, 0);
                        continue;
                    }
                    if (d3 > ((double)(n4 - 1) - 0.5) * ((double)(n4 - 1) - 0.5)) {
                        this.field_36c4f18_Dne.method_2ee8c47d_FWm(j, i, k, zKP.field_f0b029e5_zGp.field_21260d_FWm);
                        continue;
                    }
                    this.field_36c4f18_Dne.method_2ee8c47d_FWm(j, i, k, zKP.field_fae40a26_EYV.field_21260d_FWm);
                }
            }
        }
        this.field_36c4f18_Dne.method_2ee8c47d_FWm(n, n3 + 0, n2, zKP.field_f0b029e5_zGp.field_21260d_FWm);
        this.field_36c4f18_Dne.method_2ee8c47d_FWm(n, n3 + 1, n2, zKP.field_f0b029e5_zGp.field_21260d_FWm);
        this.field_36c4f18_Dne.method_2ee8c47d_FWm(n, n3 + 2, n2, zKP.field_f0b029e5_zGp.field_21260d_FWm);
        this.field_36c4f18_Dne.method_2ee8c47d_FWm(n - 1, n3 + 2, n2, zKP.field_954cd4c3_Wwe.field_21260d_FWm);
        this.field_36c4f18_Dne.method_2ee8c47d_FWm(n + 1, n3 + 2, n2, zKP.field_954cd4c3_Wwe.field_21260d_FWm);
        this.field_36c4f18_Dne.method_2ee8c47d_FWm(n, n3 + 2, n2 - 1, zKP.field_954cd4c3_Wwe.field_21260d_FWm);
        this.field_36c4f18_Dne.method_2ee8c47d_FWm(n, n3 + 2, n2 + 1, zKP.field_954cd4c3_Wwe.field_21260d_FWm);
        this.field_36c4f18_Dne.method_2ee8c47d_FWm(n, n3 + 3, n2, zKP.field_f0b029e5_zGp.field_21260d_FWm);
        this.field_36c4f18_Dne.method_2ee8c47d_FWm(n, n3 + 4, n2, zKP.field_86be178c_sJS.field_21260d_FWm);
        aQq.field_2092bf_Dne = false;
    }

    private boolean method_9ed6d42c_Dne(bSp bSp2) {
        int n = geR.method_117d0718_FWm(bSp2.field_2092a9_Dne);
        int n2 = geR.method_117d0718_FWm(bSp2.field_212608_FWm);
        int n3 = geR.method_117d0718_FWm(bSp2.field_2e5f16_bzF);
        int n4 = geR.method_117d0718_FWm(bSp2.field_267cf0_Qnq);
        int n5 = geR.method_117d0718_FWm(bSp2.field_2d29ef_aFZ);
        int n6 = geR.method_117d0718_FWm(bSp2.field_388da1_zGp);
        boolean bl = false;
        boolean bl2 = false;
        for (int i = n; i <= n4; ++i) {
            for (int j = n2; j <= n5; ++j) {
                for (int k = n3; k <= n6; ++k) {
                    int n7 = this.field_36c4f18_Dne.method_2c2cf7bc_Dne(i, j, k);
                    if (n7 == 0) continue;
                    if (n7 != zKP.field_e641c680_cot.field_21260d_FWm && n7 != zKP.field_4e627739_dNY.field_21260d_FWm && n7 != zKP.field_f0b029e5_zGp.field_21260d_FWm && this.field_36c4f18_Dne.method_230cbc5a_Dne().method_8f501fe8_Dne("mobGriefing")) {
                        bl2 = this.field_36c4f18_Dne.method_2e7161e6_Qnq(i, j, k) || bl2;
                        continue;
                    }
                    bl = true;
                }
            }
        }
        if (bl2) {
            double d = bSp2.field_2092a9_Dne + (bSp2.field_267cf0_Qnq - bSp2.field_2092a9_Dne) * (double)this.field_7331eae7_Dne.nextFloat();
            double d2 = bSp2.field_212608_FWm + (bSp2.field_2d29ef_aFZ - bSp2.field_212608_FWm) * (double)this.field_7331eae7_Dne.nextFloat();
            double d3 = bSp2.field_2e5f16_bzF + (bSp2.field_388da1_zGp - bSp2.field_2e5f16_bzF) * (double)this.field_7331eae7_Dne.nextFloat();
            this.field_36c4f18_Dne.method_8600ec24_Dne("largeexplode", d, d2, d3, 0.0, 0.0, 0.0);
        }
        return bl;
    }

    @Override
    public boolean method_7675a832_Dne(Dur dur, zBn zBn2, int n) {
        if (dur != this.field_36680ab_Dne) {
            n = n / 4 + 1;
        }
        float f = this.field_334489_mrb * (float)Math.PI / 180.0f;
        float f2 = geR.method_ce7f5256_Dne(f);
        float f3 = geR.method_117d0e97_FWm(f);
        this.field_2092a9_Dne = this.field_2f0dd3_div + (double)(f2 * 5.0f) + (double)((this.field_7331eae7_Dne.nextFloat() - 0.5f) * 2.0f);
        this.field_212608_FWm = this.field_22c5fd_IjH + (double)(this.field_7331eae7_Dne.nextFloat() * 3.0f) + 1.0;
        this.field_212c16_EyB = this.field_334487_mrb - (double)(f3 * 5.0f) + (double)((this.field_7331eae7_Dne.nextFloat() - 0.5f) * 2.0f);
        this.field_75c313d2_bzF = null;
        if (zBn2.method_f88b2463_FWm() instanceof FiG || zBn2.method_7c6f603d_FWm()) {
            this.method_659de4c5_FWm(zBn2, n);
        }
        return true;
    }

    @Override
    public sMa[] method_5709d0c1_Dne() {
        return this.field_835cce06_Dne;
    }

    private void method_12705b2a_FWm(List list) {
        for (int i = 0; i < list.size(); ++i) {
            sMa sMa2 = (sMa)list.get(i);
            if (!(sMa2 instanceof FUH)) continue;
            sMa2.method_147b2066_Dne(zBn.method_267d8b79_Dne(this), 10);
        }
    }

    @Override
    public void method_8288d6ee_IjH() {
        float var1;
        float var2;
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ) {
            this.field_378ab08_Dne.method_62ca2346_FWm(16, this.field_28e7fd_Vxn);
        } else {
            var1 = geR.method_117d0e97_FWm(this.field_21260a_FWm * 3.1415927F * 2.0F);
            var2 = geR.method_117d0e97_FWm(this.field_2092ab_Dne * 3.1415927F * 2.0F);
            if (var2 <= -0.3F && var1 >= -0.3F) {
                this.field_36c4f18_Dne.method_62d7c9a6_Dne(this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb, "mob.enderdragon.wings", 5.0F, 0.8F + this.field_7331eae7_Dne.nextFloat() * 0.3F, false);
            }
        }

        this.field_2092ab_Dne = this.field_21260a_FWm;
        float var3;
        if (this.field_28e7fd_Vxn <= 0) {
            var1 = (this.field_7331eae7_Dne.nextFloat() - 0.5F) * 8.0F;
            var2 = (this.field_7331eae7_Dne.nextFloat() - 0.5F) * 4.0F;
            var3 = (this.field_7331eae7_Dne.nextFloat() - 0.5F) * 8.0F;
            this.field_36c4f18_Dne.method_8600ec24_Dne("largeexplode", this.field_2f0dd3_div + (double)var1, this.field_22c5fd_IjH + 2.0D + (double)var2, this.field_334487_mrb + (double)var3, 0.0D, 0.0D, 0.0D);
        } else {
            this.method_907a9d21_Qnq();
            var1 = 0.2F / (geR.method_ce7f4ad4_Dne(this.field_291868_XHL * this.field_291868_XHL + this.field_31b811_kGO * this.field_31b811_kGO) * 10.0F + 1.0F);
            var1 *= (float)Math.pow(2.0D, this.field_2a9ad1_Zpi);
            if (this.field_21261e_FWm) {
                this.field_21260a_FWm += var1 * 0.5F;
            } else {
                this.field_21260a_FWm += var1;
            }

            this.field_334489_mrb = geR.method_87b72d50_aFZ(this.field_334489_mrb);
            if (this.field_2092ae_Dne < 0) {
                for(int var4 = 0; var4 < this.field_7a46ee09_Dne.length; ++var4) {
                    this.field_7a46ee09_Dne[var4][0] = (double)this.field_334489_mrb;
                    this.field_7a46ee09_Dne[var4][1] = this.field_22c5fd_IjH;
                }
            }

            if (++this.field_2092ae_Dne == this.field_7a46ee09_Dne.length) {
                this.field_2092ae_Dne = 0;
            }

            this.field_7a46ee09_Dne[this.field_2092ae_Dne][0] = (double)this.field_334489_mrb;
            this.field_7a46ee09_Dne[this.field_2092ae_Dne][1] = this.field_22c5fd_IjH;
            double var6;
            double var8;
            double var10;
            float var12;
            float var23;
            float var24;
            float var26;
            double var28;
            float var34;
            if (this.field_36c4f18_Dne.field_2d2a05_aFZ) {
                if (this.field_383103_yMz > 0) {
                    var10 = this.field_2f0dd3_div + (this.field_2e5f16_bzF - this.field_2f0dd3_div) / (double)this.field_383103_yMz;
                    var28 = this.field_22c5fd_IjH + (this.field_34856d_qLR - this.field_22c5fd_IjH) / (double)this.field_383103_yMz;
                    var6 = this.field_334487_mrb + (this.field_1ed012_ATE - this.field_334487_mrb) / (double)this.field_383103_yMz;
                    var8 = geR.method_ce7f4ad2_Dne(this.field_28e7f8_Vxn - (double)this.field_334489_mrb);
                    this.field_334489_mrb = (float)((double)this.field_334489_mrb + var8 / (double)this.field_383103_yMz);
                    this.field_29186a_XHL = (float)((double)this.field_29186a_XHL + (this.field_2e8481_ceE - (double)this.field_29186a_XHL) / (double)this.field_383103_yMz);
                    --this.field_383103_yMz;
                    this.method_2961957_bzF(var10, var28, var6);
                    this.method_1e252df9_FWm(this.field_334489_mrb, this.field_29186a_XHL);
                }
            } else {
                var10 = this.field_2092a9_Dne - this.field_2f0dd3_div;
                var28 = this.field_212608_FWm - this.field_22c5fd_IjH;
                var6 = this.field_212c16_EyB - this.field_334487_mrb;
                var8 = var10 * var10 + var28 * var28 + var6 * var6;
                double var13;
                double var15;
                if (this.field_75c313d2_bzF != null) {
                    this.field_2092a9_Dne = this.field_75c313d2_bzF.field_2f0dd3_div;
                    this.field_212c16_EyB = this.field_75c313d2_bzF.field_334487_mrb;
                    var13 = this.field_2092a9_Dne - this.field_2f0dd3_div;
                    var15 = this.field_212c16_EyB - this.field_334487_mrb;
                    double var17 = Math.sqrt(var13 * var13 + var15 * var15);
                    double var19 = 0.4000000059604645D + var17 / 80.0D - 1.0D;
                    if (var19 > 10.0D) {
                        var19 = 10.0D;
                    }

                    this.field_212608_FWm = this.field_75c313d2_bzF.field_373a3ed_Dne.field_212608_FWm + var19;
                } else {
                    this.field_2092a9_Dne += this.field_7331eae7_Dne.nextGaussian() * 2.0D;
                    this.field_212c16_EyB += this.field_7331eae7_Dne.nextGaussian() * 2.0D;
                }

                if (this.field_2092bf_Dne || var8 < 100.0D || var8 > 22500.0D || this.field_388db7_zGp || this.field_20b868_DyG) {
                    this.method_d44b4592_zGp();
                }

                var28 /= (double)geR.method_ce7f4ad4_Dne(var10 * var10 + var6 * var6);
                var12 = 0.6F;
                if (var28 < (double)(-var12)) {
                    var28 = (double)(-var12);
                }

                if (var28 > (double)var12) {
                    var28 = (double)var12;
                }

                this.field_2a9ad1_Zpi += var28 * 0.10000000149011612D;
                this.field_334489_mrb = geR.method_87b72d50_aFZ(this.field_334489_mrb);
                var13 = 180.0D - Math.atan2(var10, var6) * 180.0D / 3.141592653589793D;
                var15 = geR.method_ce7f4ad2_Dne(var13 - (double)this.field_334489_mrb);
                if (var15 > 50.0D) {
                    var15 = 50.0D;
                }

                if (var15 < -50.0D) {
                    var15 = -50.0D;
                }

                chN var31 = this.field_36c4f18_Dne.method_23186a47_Dne().method_e4505d6c_Dne(this.field_2092a9_Dne - this.field_2f0dd3_div, this.field_212608_FWm - this.field_22c5fd_IjH, this.field_212c16_EyB - this.field_334487_mrb).method_230df162_Dne();
                chN var18 = this.field_36c4f18_Dne.method_23186a47_Dne().method_e4505d6c_Dne((double)geR.method_ce7f5256_Dne(this.field_334489_mrb * 3.1415927F / 180.0F), this.field_2a9ad1_Zpi, (double)(-geR.method_117d0e97_FWm(this.field_334489_mrb * 3.1415927F / 180.0F))).method_230df162_Dne();
                var34 = (float)(var18.method_a1a425ac_Dne(var31) + 0.5D) / 1.5F;
                if (var34 < 0.0F) {
                    var34 = 0.0F;
                }

                this.field_1f1f46_BJH *= 0.8F;
                float var20 = geR.method_ce7f4ad4_Dne(this.field_291868_XHL * this.field_291868_XHL + this.field_31b811_kGO * this.field_31b811_kGO) * 1.0F + 1.0F;
                double var21 = Math.sqrt(this.field_291868_XHL * this.field_291868_XHL + this.field_31b811_kGO * this.field_31b811_kGO) * 1.0D + 1.0D;
                if (var21 > 40.0D) {
                    var21 = 40.0D;
                }

                this.field_1f1f46_BJH = (float)((double)this.field_1f1f46_BJH + var15 * (0.699999988079071D / var21 / (double)var20));
                this.field_334489_mrb += this.field_1f1f46_BJH * 0.1F;
                var23 = (float)(2.0D / (var21 + 1.0D));
                var24 = 0.06F;
                this.method_a680f8e7_FWm(0.0F, -1.0F, var24 * (var34 * var23 + (1.0F - var23)));
                if (this.field_21261e_FWm) {
                    this.method_2be429a4_Dne(this.field_291868_XHL * 0.800000011920929D, this.field_2a9ad1_Zpi * 0.800000011920929D, this.field_31b811_kGO * 0.800000011920929D);
                } else {
                    this.method_2be429a4_Dne(this.field_291868_XHL, this.field_2a9ad1_Zpi, this.field_31b811_kGO);
                }

                chN var25 = this.field_36c4f18_Dne.method_23186a47_Dne().method_e4505d6c_Dne(this.field_291868_XHL, this.field_2a9ad1_Zpi, this.field_31b811_kGO).method_230df162_Dne();
                var26 = (float)(var25.method_a1a425ac_Dne(var18) + 1.0D) / 2.0F;
                var26 = 0.8F + 0.15F * var26;
                this.field_291868_XHL *= (double)var26;
                this.field_31b811_kGO *= (double)var26;
                this.field_2a9ad1_Zpi *= 0.9100000262260437D;
            }

            this.field_22c5ff_IjH = this.field_334489_mrb;
            this.field_36680ab_Dne.field_342261_ooe = this.field_36680ab_Dne.field_367151_trS = 3.0F;
            this.field_75ae4e98_bzF.field_342261_ooe = this.field_75ae4e98_bzF.field_367151_trS = 2.0F;
            this.field_5e4fef72_Qnq.field_342261_ooe = this.field_5e4fef72_Qnq.field_367151_trS = 2.0F;
            this.field_712a04f1_aFZ.field_342261_ooe = this.field_712a04f1_aFZ.field_367151_trS = 2.0F;
            this.field_20204c8a_FWm.field_367151_trS = 3.0F;
            this.field_20204c8a_FWm.field_342261_ooe = 5.0F;
            this.field_f0983fa3_zGp.field_367151_trS = 2.0F;
            this.field_f0983fa3_zGp.field_342261_ooe = 4.0F;
            this.field_1619a9d4_DyG.field_367151_trS = 3.0F;
            this.field_1619a9d4_DyG.field_342261_ooe = 4.0F;
            var2 = (float)(this.method_2c2b2888_Dne(5, 1.0F)[1] - this.method_2c2b2888_Dne(10, 1.0F)[1]) * 10.0F / 180.0F * 3.1415927F;
            var3 = geR.method_117d0e97_FWm(var2);
            float var29 = -geR.method_ce7f5256_Dne(var2);
            float var14 = this.field_334489_mrb * 3.1415927F / 180.0F;
            float var30 = geR.method_ce7f5256_Dne(var14);
            float var16 = geR.method_117d0e97_FWm(var14);
            this.field_20204c8a_FWm.method_7a46289a_Dne();
            this.field_20204c8a_FWm.method_9ce0fc65_FWm(this.field_2f0dd3_div + (double)(var30 * 0.5F), this.field_22c5fd_IjH, this.field_334487_mrb - (double)(var16 * 0.5F), 0.0F, 0.0F);
            this.field_f0983fa3_zGp.method_7a46289a_Dne();
            this.field_f0983fa3_zGp.method_9ce0fc65_FWm(this.field_2f0dd3_div + (double)(var16 * 4.5F), this.field_22c5fd_IjH + 2.0D, this.field_334487_mrb + (double)(var30 * 4.5F), 0.0F, 0.0F);
            this.field_1619a9d4_DyG.method_7a46289a_Dne();
            this.field_1619a9d4_DyG.method_9ce0fc65_FWm(this.field_2f0dd3_div - (double)(var16 * 4.5F), this.field_22c5fd_IjH + 2.0D, this.field_334487_mrb - (double)(var30 * 4.5F), 0.0F, 0.0F);
            if (!this.field_36c4f18_Dne.field_2d2a05_aFZ && this.field_2569d5_OdI == 0) {
                this.method_ea14418b_Dne(this.field_36c4f18_Dne.method_71df22e6_FWm(this, this.field_f0983fa3_zGp.field_373a3ed_Dne.method_b78565d7_FWm(4.0D, 2.0D, 4.0D).method_fbaf53ef_Qnq(0.0D, -2.0D, 0.0D)));
                this.method_ea14418b_Dne(this.field_36c4f18_Dne.method_71df22e6_FWm(this, this.field_1619a9d4_DyG.field_373a3ed_Dne.method_b78565d7_FWm(4.0D, 2.0D, 4.0D).method_fbaf53ef_Qnq(0.0D, -2.0D, 0.0D)));
                this.method_12705b2a_FWm(this.field_36c4f18_Dne.method_71df22e6_FWm(this, this.field_36680ab_Dne.field_373a3ed_Dne.method_b78565d7_FWm(1.0D, 1.0D, 1.0D)));
            }

            double[] var32 = this.method_2c2b2888_Dne(5, 1.0F);
            double[] var33 = this.method_2c2b2888_Dne(0, 1.0F);
            var12 = geR.method_ce7f5256_Dne(this.field_334489_mrb * 3.1415927F / 180.0F - this.field_1f1f46_BJH * 0.01F);
            var34 = geR.method_117d0e97_FWm(this.field_334489_mrb * 3.1415927F / 180.0F - this.field_1f1f46_BJH * 0.01F);
            this.field_36680ab_Dne.method_7a46289a_Dne();
            this.field_36680ab_Dne.method_9ce0fc65_FWm(this.field_2f0dd3_div + (double)(var12 * 5.5F * var3), this.field_22c5fd_IjH + (var33[1] - var32[1]) * 1.0D + (double)(var29 * 5.5F), this.field_334487_mrb - (double)(var34 * 5.5F * var3), 0.0F, 0.0F);

            for(int var35 = 0; var35 < 3; ++var35) {
                Dur var36 = null;
                if (var35 == 0) {
                    var36 = this.field_75ae4e98_bzF;
                }

                if (var35 == 1) {
                    var36 = this.field_5e4fef72_Qnq;
                }

                if (var35 == 2) {
                    var36 = this.field_712a04f1_aFZ;
                }

                double[] var22 = this.method_2c2b2888_Dne(12 + var35 * 2, 1.0F);
                var23 = this.field_334489_mrb * 3.1415927F / 180.0F + this.method_ce7f4ad4_Dne(var22[0] - var32[0]) * 3.1415927F / 180.0F * 1.0F;
                var24 = geR.method_ce7f5256_Dne(var23);
                float var37 = geR.method_117d0e97_FWm(var23);
                var26 = 1.5F;
                float var27 = (float)(var35 + 1) * 2.0F;
                var36.method_7a46289a_Dne();
                var36.method_9ce0fc65_FWm(this.field_2f0dd3_div - (double)((var30 * var26 + var24 * var27) * var3), this.field_22c5fd_IjH + (var22[1] - var32[1]) * 1.0D - (double)((var27 + var26) * var29) + 1.5D, this.field_334487_mrb + (double)((var16 * var26 + var37 * var27) * var3), 0.0F, 0.0F);
            }

            if (!this.field_36c4f18_Dne.field_2d2a05_aFZ) {
                this.field_21261e_FWm = this.method_9ed6d42c_Dne(this.field_36680ab_Dne.field_373a3ed_Dne) | this.method_9ed6d42c_Dne(this.field_20204c8a_FWm.field_373a3ed_Dne);
            }
        }

    }

    @Override
    public int method_7a46288d_Dne() {
        return 200;
    }

    @Override
    protected void method_9f65f30f_ZgS() {
    }

    @Override
    protected void method_af414ced_cot() {
        ++this.field_21260d_FWm;
        if (this.field_21260d_FWm >= 180 && this.field_21260d_FWm <= 200) {
            float f = (this.field_7331eae7_Dne.nextFloat() - 0.5f) * 8.0f;
            float f2 = (this.field_7331eae7_Dne.nextFloat() - 0.5f) * 4.0f;
            float f3 = (this.field_7331eae7_Dne.nextFloat() - 0.5f) * 8.0f;
            this.field_36c4f18_Dne.method_8600ec24_Dne("hugeexplosion", this.field_2f0dd3_div + (double)f, this.field_22c5fd_IjH + 2.0 + (double)f2, this.field_334487_mrb + (double)f3, 0.0, 0.0, 0.0);
        }
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ) {
            if (this.field_21260d_FWm > 150 && this.field_21260d_FWm % 5 == 0) {
                int n;
                for (int i = 1000; i > 0; i -= n) {
                    n = alg.method_ce7f5d9c_Dne(i);
                    this.field_36c4f18_Dne.method_94d18be5_FWm(new alg(this.field_36c4f18_Dne, this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb, n));
                }
            }
            if (this.field_21260d_FWm == 1) {
                this.field_36c4f18_Dne.method_c6d158dc_bzF(1018, (int)this.field_2f0dd3_div, (int)this.field_22c5fd_IjH, (int)this.field_334487_mrb, 0);
            }
        }
        this.method_2be429a4_Dne(0.0, 0.1f, 0.0);
        this.field_22c5ff_IjH = this.field_334489_mrb += 20.0f;
        if (this.field_21260d_FWm == 200 && !this.field_36c4f18_Dne.field_2d2a05_aFZ) {
            int n;
            for (int i = 2000; i > 0; i -= n) {
                n = alg.method_ce7f5d9c_Dne(i);
                this.field_36c4f18_Dne.method_94d18be5_FWm(new alg(this.field_36c4f18_Dne, this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb, n));
            }
            this.method_16cca7a_Dne(geR.method_117d0718_FWm(this.field_2f0dd3_div), geR.method_117d0718_FWm(this.field_334487_mrb));
            this.method_5d73f9d_g_();
        }
    }

    @Override
    protected void method_7c6f6039_FWm() {
        super.method_7c6f6039_FWm();
        this.field_378ab08_Dne.method_ad009545_Dne(16, new Integer(this.method_7a46288d_Dne()));
    }

    @Override
    protected float method_b0a28134_div() {
        return 5.0f;
    }

    public double[] method_2c2b2888_Dne(int n, float f) {
        if (this.field_28e7fd_Vxn <= 0) {
            f = 0.0f;
        }
        f = 1.0f - f;
        int n2 = this.field_2092ae_Dne - n * 1 & 0x3F;
        int n3 = this.field_2092ae_Dne - n * 1 - 1 & 0x3F;
        double[] dArray = new double[3];
        double d = this.field_7a46ee09_Dne[n2][0];
        double d2 = geR.method_ce7f4ad2_Dne(this.field_7a46ee09_Dne[n3][0] - d);
        dArray[0] = d + d2 * (double)f;
        d = this.field_7a46ee09_Dne[n2][1];
        d2 = this.field_7a46ee09_Dne[n3][1] - d;
        dArray[1] = d + d2 * (double)f;
        dArray[2] = this.field_7a46ee09_Dne[n2][2] + (this.field_7a46ee09_Dne[n3][2] - this.field_7a46ee09_Dne[n2][2]) * (double)f;
        return dArray;
    }
}

