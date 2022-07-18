package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;
import java.util.UUID;

public abstract class sMa {
    public int field_342264_ooe;
    public String field_569fcf45_Dne;
    public double field_36714f_trS;
    private static int field_2092ae_Dne = 0;
    public boolean field_29187e_XHL = true;
    public double field_267cf0_Qnq = 1.0;
    public float field_29186a_XHL;
    public int field_31b816_kGO;
    public int field_2f0dd8_div = 0;
    public double field_2a9ad1_Zpi;
    public sMa field_203511c4_FWm;
    private UUID field_f2f12acf_Dne;
    public double field_388da1_zGp;
    public double field_2f0dd3_div;
    public float field_215b33_FfS = 0.0f;
    public boolean field_348583_qLR;
    public double field_31b811_kGO;
    public boolean field_31b827_kGO = false;
    protected boolean field_36b0ba_udO = false;
    public float field_212c18_EyB = 0.0f;
    public float field_36b0a6_udO = 0.0f;
    private int field_21260d_FWm = 1;
    public final bSp field_373a3ed_Dne;
    public boolean field_2e5f2c_bzF = false;
    private double field_212608_FWm;
    public sMa field_37b45e5_Dne;
    public int field_2a9ad6_Zpi;
    public String field_d9a85c6_FWm;
    public Qnq field_36c4f18_Dne;
    public float field_2e8483_ceE = 0.0f;
    public int field_33448c_mrb;
    protected int field_1ed017_ATE = 0;
    public boolean field_388db7_zGp;
    public double field_334487_mrb;
    public boolean field_2a9ae7_Zpi = false;
    public boolean field_2d2a05_aFZ = false;
    public int field_348572_qLR;
    public boolean field_367165_trS = false;
    public boolean field_20b868_DyG;
    public float field_31b813_kGO;
    public int field_2d29f4_aFZ = field_2092ae_Dne++;
    protected boolean field_28e80e_Vxn;
    protected boolean field_33449d_mrb;
    public float field_2a9ad3_Zpi;
    public int field_20b857_DyG = 1;
    protected Random field_7331eae7_Dne;
    private boolean field_2092bf_Dne = true;
    protected int field_367154_trS;
    public double field_34225f_ooe;
    protected luM field_378ab08_Dne;
    public int field_36b0a9_udO;
    public int field_22c602_IjH;
    public float field_367151_trS = 1.8f;
    public float field_1ed014_ATE = 0.0f;
    public boolean field_22c613_IjH = false;
    public double field_291868_XHL;
    public float field_334489_mrb;
    public boolean field_1ed028_ATE;
    public double field_36b0a4_udO;
    public bfY field_373e877_Dne;
    public float field_28e7fa_Vxn = 0.0f;
    public int field_29186d_XHL;
    public float field_34856f_qLR = 0.0f;
    public double field_20b852_DyG;
    private int field_2e5f1b_bzF = 0;
    public int field_388da6_zGp = 0;
    public float field_342261_ooe = 0.6f;
    protected boolean field_342275_ooe = false;
    private double field_2092a9_Dne;
    public double field_22c5fd_IjH;
    public boolean field_2f0de9_div = false;
    private boolean field_21261e_FWm = false;
    public float field_2569d2_OdI = 0.0f;
    public boolean field_267d06_Qnq;
    public double field_2d29ef_aFZ;

    public boolean method_ae9f0476_ceE() {
        return this.method_ce7f5dad_Dne(4);
    }

    public int method_d44b4585_zGp() {
        return 0;
    }

    public JiM method_3acd85a9_Dne(int n, int n2, float f) {
        return this.method_2cda29ee_Dne(new NMq(n, n2, 0), f);
    }

    public double method_2be42992_Dne(double d, double d2, double d3) {
        double d4 = this.field_2f0dd3_div - d;
        double d5 = this.field_22c5fd_IjH - d2;
        double d6 = this.field_334487_mrb - d3;
        return d4 * d4 + d5 * d5 + d6 * d6;
    }

    public boolean method_9feec6c6_Zpi() {
        return this.field_36b0ba_udO;
    }

    public void method_117d0ea7_FWm(float f) {
    }

    protected void method_ae9f0472_ceE() {
        if (!this.field_342275_ooe) {
            this.method_147b2066_Dne(zBn.field_75c61ab3_bzF, 4);
            this.method_87b738a3_aFZ(15);
        }
    }

    public float method_7a46288a_Dne() {
        return this.field_367151_trS / 2.0f;
    }

    public String method_eecad346_Dne() {
        String string = Klb.method_636080_Dne(this);
        if (string == null) {
            string = "generic";
        }
        return KGL.method_39193c_Dne("entity." + string + ".name");
    }

    public double method_bb7dd80e_Dne(sMa sMa2) {
        double d = this.field_2f0dd3_div - sMa2.field_2f0dd3_div;
        double d2 = this.field_22c5fd_IjH - sMa2.field_22c5fd_IjH;
        double d3 = this.field_334487_mrb - sMa2.field_334487_mrb;
        return d * d + d2 * d2 + d3 * d3;
    }

    public void method_7a46289a_Dne() {
        this.method_998e6629_Vxn();
    }

    public boolean method_73aaafc7_ATE() {
        return this.method_ce7f5dad_Dne(3);
    }

    public void method_df9deb60_DyG(int n) {
        this.field_378ab08_Dne.method_62ca2346_FWm(1, (short)n);
    }

    public boolean method_cd4cb3d9_udO() {
        return !this.field_2a9ae7_Zpi;
    }

    public boolean method_d44b4596_zGp() {
        if (this.field_36c4f18_Dne.method_ff46456e_Dne(this.field_373a3ed_Dne.method_b78565d7_FWm(0.0, -0.4f, 0.0).method_4f91d5d0_aFZ(0.001, 0.001, 0.001), KFd.field_1411d34d_div, this)) {
            if (!this.field_36b0ba_udO && !this.field_2092bf_Dne) {
                float f;
                float f2;
                float f3 = geR.method_ce7f4ad4_Dne(this.field_291868_XHL * this.field_291868_XHL * (double)0.2f + this.field_2a9ad1_Zpi * this.field_2a9ad1_Zpi + this.field_31b811_kGO * this.field_31b811_kGO * (double)0.2f) * 0.2f;
                if (f3 > 1.0f) {
                    f3 = 1.0f;
                }
                this.method_fbd4aee4_Dne("liquid.splash", f3, 1.0f + (this.field_7331eae7_Dne.nextFloat() - this.field_7331eae7_Dne.nextFloat()) * 0.4f);
                float f4 = geR.method_117d0718_FWm(this.field_373a3ed_Dne.field_212608_FWm);
                int n = 0;
                while ((float)n < 1.0f + this.field_342261_ooe * 20.0f) {
                    f2 = (this.field_7331eae7_Dne.nextFloat() * 2.0f - 1.0f) * this.field_342261_ooe;
                    f = (this.field_7331eae7_Dne.nextFloat() * 2.0f - 1.0f) * this.field_342261_ooe;
                    this.field_36c4f18_Dne.method_8600ec24_Dne("bubble", this.field_2f0dd3_div + (double)f2, f4 + 1.0f, this.field_334487_mrb + (double)f, this.field_291868_XHL, this.field_2a9ad1_Zpi - (double)(this.field_7331eae7_Dne.nextFloat() * 0.2f), this.field_31b811_kGO);
                    ++n;
                }
                n = 0;
                while ((float)n < 1.0f + this.field_342261_ooe * 20.0f) {
                    f2 = (this.field_7331eae7_Dne.nextFloat() * 2.0f - 1.0f) * this.field_342261_ooe;
                    f = (this.field_7331eae7_Dne.nextFloat() * 2.0f - 1.0f) * this.field_342261_ooe;
                    this.field_36c4f18_Dne.method_8600ec24_Dne("splash", this.field_2f0dd3_div + (double)f2, f4 + 1.0f, this.field_334487_mrb + (double)f, this.field_291868_XHL, this.field_2a9ad1_Zpi, this.field_31b811_kGO);
                    ++n;
                }
            }
            this.field_2e8483_ceE = 0.0f;
            this.field_36b0ba_udO = true;
            this.field_2e5f1b_bzF = 0;
        } else {
            this.field_36b0ba_udO = false;
        }
        return this.field_36b0ba_udO;
    }

    public boolean method_21db0ca_a_(FiG fiG) {
        return false;
    }

    public float method_59ee189_c_() {
        return 0.0f;
    }

    public boolean method_8d4fb91b_Dne(WkD wkD) {
        String string = this.method_4a7b1d9f_Qnq();
        if (!this.field_2a9ae7_Zpi && string != null) {
            wkD.method_abaa98ae_Dne("id", string);
            this.method_7f44880a_bzF(wkD);
            return true;
        }
        return false;
    }

    protected mbZ method_3f778fd1_Dne(float ... fArray) {
        mbZ mbZ2 = new mbZ();
        float[] fArray2 = fArray;
        int n = fArray.length;
        for (int i = 0; i < n; ++i) {
            float f = fArray2[i];
            mbZ2.method_b4ba5ea1_Dne(new nOv(null, f));
        }
        return mbZ2;
    }

    public void method_c38d48a4_Dne(double d, double d2, double d3, float f, float f2) {
        this.field_2d29ef_aFZ = this.field_2f0dd3_div = d;
        this.field_388da1_zGp = this.field_22c5fd_IjH = d2;
        this.field_20b852_DyG = this.field_334487_mrb = d3;
        this.field_2a9ad3_Zpi = this.field_334489_mrb = f;
        this.field_31b813_kGO = this.field_29186a_XHL = f2;
        this.field_212c18_EyB = 0.0f;
        double d4 = this.field_2a9ad3_Zpi - f;
        if (d4 < -180.0) {
            this.field_2a9ad3_Zpi += 360.0f;
        }
        if (d4 >= 180.0) {
            this.field_2a9ad3_Zpi -= 360.0f;
        }
        this.method_2961957_bzF(this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb);
        this.method_1e252df9_FWm(f, f2);
    }

    public int method_b0a28137_div() {
        return this.field_378ab08_Dne.method_ce7f5da6_Dne(1);
    }

    public void method_143fdded_bzF(boolean bl) {
        this.method_16d0a4b_Dne(1, bl);
    }

    public void method_3e501ff9_Qnq(sMa sMa2) {
        double d;
        double d2;
        double d3;
        if (sMa2.field_37b45e5_Dne != this && sMa2.field_203511c4_FWm != this && (d3 = geR.method_16a71c8_Dne(d2 = sMa2.field_2f0dd3_div - this.field_2f0dd3_div, d = sMa2.field_334487_mrb - this.field_334487_mrb)) >= (double)0.01f) {
            d3 = geR.method_ce7f4ad4_Dne(d3);
            d2 /= d3;
            d /= d3;
            double d4 = 1.0 / d3;
            if (d4 > 1.0) {
                d4 = 1.0;
            }
            d2 *= d4;
            d *= d4;
            d2 *= (double)0.05f;
            d *= (double)0.05f;
            this.method_2e2893bd_Qnq(-(d2 *= (double)(1.0f - this.field_2569d2_OdI)), 0.0, -(d *= (double)(1.0f - this.field_2569d2_OdI)));
            sMa2.method_2e2893bd_Qnq(d2, 0.0, d);
        }
    }

    public sMa[] method_5709d0c1_Dne() {
        return null;
    }

    public JiM method_9045499d_Dne(int n, int n2) {
        return this.method_3acd85a9_Dne(n, n2, 0.0f);
    }

    public boolean method_147b2066_Dne(zBn zBn2, int n) {
        if (this.method_7c861acb_EyB()) {
            return false;
        }
        this.method_c19d9a09_oIf();
        return false;
    }

    public String method_6859cdb9_bzF() {
        return null;
    }

    public int method_7ad387f6_DyG() {
        return 900;
    }

    public void method_21db0c6_a_(FiG fiG) {
    }

    public void method_73b33007_bzF(float f, float f2) {
        float f3 = this.field_29186a_XHL;
        float f4 = this.field_334489_mrb;
        this.field_334489_mrb = (float)((double)this.field_334489_mrb + (double)f * 0.15);
        this.field_29186a_XHL = (float)((double)this.field_29186a_XHL - (double)f2 * 0.15);
        if (this.field_29186a_XHL < -90.0f) {
            this.field_29186a_XHL = -90.0f;
        }
        if (this.field_29186a_XHL > 90.0f) {
            this.field_29186a_XHL = 90.0f;
        }
        this.field_31b813_kGO += this.field_29186a_XHL - f3;
        this.field_2a9ad3_Zpi += this.field_334489_mrb - f4;
    }

    public bSp method_230d324c_Dne() {
        return null;
    }

    public void method_5606342_FWm(sMa sMa2, int n) {
    }

    public int method_ce7f5259_Dne(float f) {
        int n;
        int n2 = geR.method_117d0718_FWm(this.field_2f0dd3_div);
        if (this.field_36c4f18_Dne.method_2dee780_bzF(n2, 0, n = geR.method_117d0718_FWm(this.field_334487_mrb))) {
            double d = (this.field_373a3ed_Dne.field_2d29ef_aFZ - this.field_373a3ed_Dne.field_212608_FWm) * 0.66;
            int n3 = geR.method_117d0718_FWm(this.field_22c5fd_IjH - (double)this.field_36b0a6_udO + d);
            return this.field_36c4f18_Dne.method_5972744d_Dne(n2, n3, n, 0);
        }
        return 0;
    }

    public boolean method_a98a0664_aFZ() {
        return this.method_ce7f5dad_Dne(1);
    }

    public void method_5d73f9d_g_() {
        this.field_2a9ae7_Zpi = true;
    }

    public void method_6f1922ee_Dne(FUH fUH) {
    }

    public double method_a663d993_FWm(double d, double d2, double d3) {
        double d4 = this.field_2f0dd3_div - d;
        double d5 = this.field_22c5fd_IjH - d2;
        double d6 = this.field_334487_mrb - d3;
        return geR.method_ce7f4ad4_Dne(d4 * d4 + d5 * d5 + d6 * d6);
    }

    public void method_b5f30bf3_gnI() {
    }

    public void method_ad72a713_bzF(sMa sMa2) {
        this.field_2092a9_Dne = 0.0;
        this.field_212608_FWm = 0.0;
        if (sMa2 == null) {
            if (this.field_203511c4_FWm != null) {
                this.method_9ce0fc65_FWm(this.field_203511c4_FWm.field_2f0dd3_div, this.field_203511c4_FWm.field_373a3ed_Dne.field_212608_FWm + (double)this.field_203511c4_FWm.field_367151_trS, this.field_203511c4_FWm.field_334487_mrb, this.field_334489_mrb, this.field_29186a_XHL);
                this.field_203511c4_FWm.field_37b45e5_Dne = null;
            }
            this.field_203511c4_FWm = null;
        } else {
            if (this.field_203511c4_FWm != null) {
                this.field_203511c4_FWm.field_37b45e5_Dne = null;
            }
            this.field_203511c4_FWm = sMa2;
            sMa2.field_37b45e5_Dne = this;
        }
    }

    public void method_a680f8e7_FWm(float f, float f2, float f3) {
        float f4 = f * f + f2 * f2;
        if (f4 >= 1.0E-4f) {
            if ((f4 = geR.method_143f92c9_bzF(f4)) < 1.0f) {
                f4 = 1.0f;
            }
            f4 = f3 / f4;
            float f5 = geR.method_ce7f5256_Dne(this.field_334489_mrb * (float)Math.PI / 180.0f);
            float f6 = geR.method_117d0e97_FWm(this.field_334489_mrb * (float)Math.PI / 180.0f);
            this.field_291868_XHL += (double)((f *= f4) * f6 - (f2 *= f4) * f5);
            this.field_31b811_kGO += (double)(f2 * f6 + f * f5);
        }
    }

    public void method_9ce0fc65_FWm(double d, double d2, double d3, float f, float f2) {
        this.field_2d29ef_aFZ = this.field_2f0dd3_div = d;
        this.field_36b0a4_udO = this.field_2f0dd3_div;
        this.field_388da1_zGp = this.field_22c5fd_IjH = d2 + (double)this.field_36b0a6_udO;
        this.field_34225f_ooe = this.field_22c5fd_IjH;
        this.field_20b852_DyG = this.field_334487_mrb = d3;
        this.field_36714f_trS = this.field_334487_mrb;
        this.field_334489_mrb = f;
        this.field_29186a_XHL = f2;
        this.method_2961957_bzF(this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb);
    }

    public void method_4b7c1628_zGp(sMa sMa2) {
        this.method_9ce0fc65_FWm(sMa2.field_2f0dd3_div, sMa2.field_22c5fd_IjH, sMa2.field_334487_mrb, sMa2.field_334489_mrb, sMa2.field_29186a_XHL);
    }

    public void method_76912e1e_aFZ(double d, double d2, double d3) {
        this.field_291868_XHL = d;
        this.field_2a9ad1_Zpi = d2;
        this.field_31b811_kGO = d3;
    }

    public void method_c073daf8_mrb() {
    }

    protected void method_16ac470_Dne(double d, boolean bl) {
        if (bl) {
            if (this.field_2e8483_ceE > 0.0f) {
                this.method_ce7f5266_Dne(this.field_2e8483_ceE);
                this.field_2e8483_ceE = 0.0f;
            }
        } else if (d < 0.0) {
            this.field_2e8483_ceE = (float)((double)this.field_2e8483_ceE - d);
        }
    }

    public boolean method_7d36ef26_FfS() {
        return false;
    }

    public void method_fbd4aee4_Dne(String string, float f, float f2) {
        this.field_36c4f18_Dne.method_a36f5f6a_Dne(this, string, f, f2);
    }

    public String method_c6f17a40_aFZ() {
        return this.method_eecad346_Dne();
    }

    public boolean method_94d18be5_FWm(sMa sMa2) {
        return false;
    }

    public final boolean method_c073dafc_mrb() {
        return this.field_342275_ooe;
    }

    public void method_c3d0e3d0_Dne(xIh xIh2) {
        this.method_b51ddfb1_zGp(5);
        ++this.field_2e5f1b_bzF;
        if (this.field_2e5f1b_bzF == 0) {
            this.method_87b738a3_aFZ(8);
        }
    }

    protected mbZ method_d5ab194f_Dne(double ... dArray) {
        mbZ mbZ2 = new mbZ();
        double[] dArray2 = dArray;
        int n = dArray.length;
        for (int i = 0; i < n; ++i) {
            double d = dArray2[i];
            mbZ2.method_b4ba5ea1_Dne(new kJU(null, d));
        }
        return mbZ2;
    }

    public sMa(Qnq qnq) {
        this.field_373a3ed_Dne = bSp.method_b4ea3e0c_Dne(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
        this.field_7331eae7_Dne = new Random();
        this.field_378ab08_Dne = new luM();
        this.field_f2f12acf_Dne = UUID.randomUUID();
        this.field_373e877_Dne = bfY.field_202db456_FWm;
        this.field_36c4f18_Dne = qnq;
        this.method_2961957_bzF(0.0, 0.0, 0.0);
        if (qnq != null) {
            this.field_348572_qLR = qnq.field_3690d00_Dne.field_2092ae_Dne;
        }
        this.field_378ab08_Dne.method_ad009545_Dne(0, (byte)0);
        this.field_378ab08_Dne.method_ad009545_Dne(1, (short)300);
        this.method_7c6f6039_FWm();
    }

    public void method_7e400579_Dne(Noo noo) {
        noo.method_2aeeb7ad_Dne("Entity Type", new LWx(this));
        noo.method_5e295ec0_Dne("Entity ID", this.field_2d29f4_aFZ);
        noo.method_2aeeb7ad_Dne("Entity Name", new jdt(this));
        noo.method_5e295ec0_Dne("Entity's Exact location", String.format("%.2f, %.2f, %.2f", this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb));
        noo.method_5e295ec0_Dne("Entity's Block location", Noo.method_924467f7_Dne(geR.method_117d0718_FWm(this.field_2f0dd3_div), geR.method_117d0718_FWm(this.field_22c5fd_IjH), geR.method_117d0718_FWm(this.field_334487_mrb)));
        noo.method_5e295ec0_Dne("Entity's Momentum", String.format("%.2f, %.2f, %.2f", this.field_291868_XHL, this.field_2a9ad1_Zpi, this.field_31b811_kGO));
    }

    public NMq[] method_56f900f6_Dne() {
        return null;
    }

    public void method_2961957_bzF(double d, double d2, double d3) {
        this.field_2f0dd3_div = d;
        this.field_22c5fd_IjH = d2;
        this.field_334487_mrb = d3;
        float f = this.field_342261_ooe / 2.0f;
        float f2 = this.field_367151_trS;
        this.field_373a3ed_Dne.method_7445baeb_FWm(d - (double)f, d2 - (double)this.field_36b0a6_udO + (double)this.field_212c18_EyB, d3 - (double)f, d + (double)f, d2 - (double)this.field_36b0a6_udO + (double)this.field_212c18_EyB + (double)f2, d3 + (double)f);
    }

    public void method_ce7f4362_Dne(byte by) {
    }

    public boolean method_a663d9a9_FWm(double d, double d2, double d3) {
        bSp bSp2 = this.field_373a3ed_Dne.method_2c4c7c89_bzF(d, d2, d3);
        List list = this.field_36c4f18_Dne.method_d11d9a5_Dne(this, bSp2);
        return !list.isEmpty() ? false : !this.field_36c4f18_Dne.method_90cba31f_bzF(bSp2);
    }

    public void method_7c861ac7_EyB() {
        this.field_2e5f1b_bzF = 0;
    }

    public JiM method_2cda29ee_Dne(NMq nMq, float f) {
        JiM jiM = new JiM(this.field_36c4f18_Dne, this.field_2f0dd3_div, this.field_22c5fd_IjH + (double)f, this.field_334487_mrb, nMq);
        jiM.field_21260d_FWm = 10;
        this.field_36c4f18_Dne.method_94d18be5_FWm(jiM);
        return jiM;
    }

    public void method_998e6629_Vxn() {
        int n;
        int n2;
        int n3;
        int n4;
        this.field_36c4f18_Dne.field_365731d_Dne.method_8f501fe4_Dne("entityBaseTick");
        if (this.field_203511c4_FWm != null && this.field_203511c4_FWm.field_2a9ae7_Zpi) {
            this.field_203511c4_FWm = null;
        }
        this.field_34856f_qLR = this.field_1ed014_ATE;
        this.field_2d29ef_aFZ = this.field_2f0dd3_div;
        this.field_388da1_zGp = this.field_22c5fd_IjH;
        this.field_20b852_DyG = this.field_334487_mrb;
        this.field_31b813_kGO = this.field_29186a_XHL;
        this.field_2a9ad3_Zpi = this.field_334489_mrb;
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ && this.field_36c4f18_Dne instanceof RAN) {
            this.field_36c4f18_Dne.field_365731d_Dne.method_8f501fe4_Dne("portal");
            jwh_0 jwh_02 = ((RAN)this.field_36c4f18_Dne).method_2302cf90_Dne();
            n4 = this.method_d44b4585_zGp();
            if (this.field_28e80e_Vxn) {
                if (jwh_02.method_b0a28148_div()) {
                    if (this.field_203511c4_FWm == null && this.field_367154_trS++ >= n4) {
                        this.field_367154_trS = n4;
                        this.field_342264_ooe = this.method_7ad387f6_DyG();
                        n3 = this.field_36c4f18_Dne.field_3690d00_Dne.field_2092ae_Dne == -1 ? 0 : -1;
                        this.method_7ed97a02_Qnq(n3);
                    }
                    this.field_28e80e_Vxn = false;
                }
            } else {
                if (this.field_367154_trS > 0) {
                    this.field_367154_trS -= 4;
                }
                if (this.field_367154_trS < 0) {
                    this.field_367154_trS = 0;
                }
            }
            if (this.field_342264_ooe > 0) {
                --this.field_342264_ooe;
            }
            this.field_36c4f18_Dne.field_365731d_Dne.method_7c6f6039_FWm();
        }
        if (this.method_73aaafc7_ATE() && !this.method_9feec6c6_Zpi() && (n2 = this.field_36c4f18_Dne.method_2c2cf7bc_Dne(n = geR.method_117d0718_FWm(this.field_2f0dd3_div), n4 = geR.method_117d0718_FWm(this.field_22c5fd_IjH - (double)0.2f - (double)this.field_36b0a6_udO), n3 = geR.method_117d0718_FWm(this.field_334487_mrb))) > 0) {
            this.field_36c4f18_Dne.method_8600ec24_Dne("tilecrack_" + n2 + "_" + this.field_36c4f18_Dne.method_2dee76f_bzF(n, n4, n3), this.field_2f0dd3_div + ((double)this.field_7331eae7_Dne.nextFloat() - 0.5) * (double)this.field_342261_ooe, this.field_373a3ed_Dne.field_212608_FWm + 0.1, this.field_334487_mrb + ((double)this.field_7331eae7_Dne.nextFloat() - 0.5) * (double)this.field_342261_ooe, -this.field_291868_XHL * 4.0, 1.5, -this.field_31b811_kGO * 4.0);
        }
        this.method_d44b4596_zGp();
        if (this.field_36c4f18_Dne.field_2d2a05_aFZ) {
            this.field_2e5f1b_bzF = 0;
        } else if (this.field_2e5f1b_bzF > 0) {
            if (this.field_342275_ooe) {
                this.field_2e5f1b_bzF -= 4;
                if (this.field_2e5f1b_bzF < 0) {
                    this.field_2e5f1b_bzF = 0;
                }
            } else {
                if (this.field_2e5f1b_bzF % 20 == 0) {
                    this.method_147b2066_Dne(zBn.field_203818a5_FWm, 1);
                }
                --this.field_2e5f1b_bzF;
            }
        }
        if (this.method_7ad38807_DyG()) {
            this.method_ae9f0472_ceE();
            this.field_2e8483_ceE *= 0.5f;
        }
        if (this.field_22c5fd_IjH < -64.0) {
            // empty if block
        }
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ) {
            this.method_16d0a4b_Dne(0, this.field_2e5f1b_bzF > 0);
            this.method_16d0a4b_Dne(2, this.field_203511c4_FWm != null);
        }
        this.field_2092bf_Dne = false;
        this.field_36c4f18_Dne.field_365731d_Dne.method_7c6f6039_FWm();
    }

    protected abstract void method_8d4fb917_Dne(WkD var1);

    public void method_87b738a3_aFZ(int n) {
        int n2 = n * 20;
        if (this.field_2e5f1b_bzF < (n2 = oAi.method_b43d9ed6_Dne(this, n2))) {
            this.field_2e5f1b_bzF = n2;
        }
    }

    public boolean method_a1a425c2_Dne(chN chN2) {
        double d = this.field_2f0dd3_div - chN2.field_2092a9_Dne;
        double d2 = this.field_22c5fd_IjH - chN2.field_212608_FWm;
        double d3 = this.field_334487_mrb - chN2.field_2e5f16_bzF;
        double d4 = d * d + d2 * d2 + d3 * d3;
        return this.method_ce7f4ae8_Dne(d4);
    }

    public String toString() {
        return String.format("%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f]", this.getClass().getSimpleName(), this.method_eecad346_Dne(), this.field_2d29f4_aFZ, this.field_36c4f18_Dne == null ? "~NULL~" : this.field_36c4f18_Dne.method_231798c9_Dne().method_eecad346_Dne(), this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb);
    }

    public int hashCode() {
        return this.field_2d29f4_aFZ;
    }

    public void method_19b4c3a3_a_(int n, NMq nMq) {
    }

    protected void method_73aaafc3_ATE() {
        if (this.field_36c4f18_Dne != null) {
            while (this.field_22c5fd_IjH > 0.0) {
                this.method_2961957_bzF(this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb);
                if (this.field_36c4f18_Dne.method_d11d9a5_Dne(this, this.field_373a3ed_Dne).isEmpty()) break;
                this.field_22c5fd_IjH += 1.0;
            }
            this.field_31b811_kGO = 0.0;
            this.field_2a9ad1_Zpi = 0.0;
            this.field_291868_XHL = 0.0;
            this.field_29186a_XHL = 0.0f;
        }
    }

    public boolean method_9a443a9d_XHL() {
        return this.field_36b0ba_udO || this.field_36c4f18_Dne.method_f2b15eb2_udO(geR.method_117d0718_FWm(this.field_2f0dd3_div), geR.method_117d0718_FWm(this.field_22c5fd_IjH), geR.method_117d0718_FWm(this.field_334487_mrb)) || this.field_36c4f18_Dne.method_f2b15eb2_udO(geR.method_117d0718_FWm(this.field_2f0dd3_div), geR.method_117d0718_FWm(this.field_22c5fd_IjH + (double)this.field_367151_trS), geR.method_117d0718_FWm(this.field_334487_mrb));
    }

    public void method_efba61a_aFZ(sMa sMa2) {
        double d = this.field_2f0dd3_div;
        double d2 = this.field_22c5fd_IjH;
        double d3 = this.field_334487_mrb;
        if (sMa2 != null) {
            d = sMa2.field_2f0dd3_div;
            d2 = sMa2.field_373a3ed_Dne.field_212608_FWm + (double)sMa2.field_367151_trS;
            d3 = sMa2.field_334487_mrb;
        }
        for (double d4 = -1.5; d4 < 2.0; d4 += 1.0) {
            for (double d5 = -1.5; d5 < 2.0; d5 += 1.0) {
                if (d4 == 0.0 && d5 == 0.0) continue;
                int n = (int)(this.field_2f0dd3_div + d4);
                int n2 = (int)(this.field_334487_mrb + d5);
                bSp bSp2 = this.field_373a3ed_Dne.method_2c4c7c89_bzF(d4, 1.0, d5);
                if (!this.field_36c4f18_Dne.method_6577291f_Dne(bSp2).isEmpty()) continue;
                if (this.field_36c4f18_Dne.method_73e9b8f9_IjH(n, (int)this.field_22c5fd_IjH, n2)) {
                    this.method_9ce0fc65_FWm(this.field_2f0dd3_div + d4, this.field_22c5fd_IjH + 1.0, this.field_334487_mrb + d5, this.field_334489_mrb, this.field_29186a_XHL);
                    return;
                }
                if (!this.field_36c4f18_Dne.method_73e9b8f9_IjH(n, (int)this.field_22c5fd_IjH - 1, n2) && this.field_36c4f18_Dne.method_d9802b31_Dne(n, (int)this.field_22c5fd_IjH - 1, n2) != KFd.field_1411d34d_div) continue;
                d = this.field_2f0dd3_div + d4;
                d2 = this.field_22c5fd_IjH + 1.0;
                d3 = this.field_334487_mrb + d5;
            }
        }
        this.method_9ce0fc65_FWm(d, d2, d3, this.field_334489_mrb, this.field_29186a_XHL);
    }

    public boolean method_7a46289e_Dne() {
        return false;
    }

    public void method_7ed9b9d3_Qnq(boolean bl) {
        this.method_16d0a4b_Dne(5, bl);
    }

    public void method_2e2893bd_Qnq(double d, double d2, double d3) {
        this.field_291868_XHL += d;
        this.field_2a9ad1_Zpi += d2;
        this.field_31b811_kGO += d3;
        this.field_1ed028_ATE = true;
    }

    public void method_cbcb3925_tgc() {
        this.field_33449d_mrb = true;
        this.field_2e8483_ceE = 0.0f;
    }

    public boolean method_bb7dd824_Dne(sMa sMa2) {
        return this == sMa2;
    }

    public boolean method_baa39406_kGO() {
        return false;
    }

    protected final String method_4a7b1d9f_Qnq() {
        return Klb.method_636080_Dne(this);
    }

    protected void method_1e252df9_FWm(float f, float f2) {
        this.field_334489_mrb = f % 360.0f;
        this.field_29186a_XHL = f2 % 360.0f;
    }

    public boolean method_76dab7e2_Dne(KFd kFd) {
        int n;
        int n2;
        double d = this.field_22c5fd_IjH + (double)this.method_59ee189_c_();
        int n3 = geR.method_117d0718_FWm(this.field_2f0dd3_div);
        int n4 = this.field_36c4f18_Dne.method_2c2cf7bc_Dne(n3, n2 = geR.method_ce7f5259_Dne(geR.method_117d0718_FWm(d)), n = geR.method_117d0718_FWm(this.field_334487_mrb));
        if (n4 != 0 && zKP.field_8374b848_Dne[n4].field_368fd23_Dne == kFd) {
            float f = byt.method_ce7f5d99_Dne(this.field_36c4f18_Dne.method_2dee76f_bzF(n3, n2, n)) - 0.11111111f;
            float f2 = (float)(n2 + 1) - f;
            return d < (double)f2;
        }
        return false;
    }

    protected void method_c19d9a09_oIf() {
        this.field_22c613_IjH = true;
    }

    protected abstract void method_66a36cd8_FWm(WkD var1);

    protected boolean method_ce7f5dad_Dne(int n) {
        return (this.field_378ab08_Dne.method_ce7f5d95_Dne(0) & 1 << n) != 0;
    }

    protected boolean method_7c6f603d_FWm() {
        return true;
    }

    protected void method_5972745a_Dne(int n, int n2, int n3, int n4) {
        PsW psW = zKP.field_8374b848_Dne[n4].field_a21c1bc0_kGO;
        if (this.field_36c4f18_Dne.method_2c2cf7bc_Dne(n, n2 + 1, n3) == zKP.field_23a1e80a_EwP.field_21260d_FWm) {
            psW = zKP.field_23a1e80a_EwP.field_a21c1bc0_kGO;
            this.method_fbd4aee4_Dne(psW.method_6859cdb9_bzF(), psW.method_7a46288a_Dne() * 0.15f, psW.method_7c6f6029_FWm());
        } else if (!zKP.field_8374b848_Dne[n4].field_368fd23_Dne.method_907a9d25_Qnq()) {
            this.method_fbd4aee4_Dne(psW.method_6859cdb9_bzF(), psW.method_7a46288a_Dne() * 0.15f, psW.method_7c6f6029_FWm());
        }
    }

    public double method_907a9d0f_Qnq() {
        return this.field_36b0a6_udO;
    }

    public boolean equals(Object object) {
        return object instanceof sMa ? ((sMa)object).field_2d29f4_aFZ == this.field_2d29f4_aFZ : false;
    }

    public float method_ce7f5256_Dne(float f) {
        int n;
        int n2 = geR.method_117d0718_FWm(this.field_2f0dd3_div);
        if (this.field_36c4f18_Dne.method_2dee780_bzF(n2, 0, n = geR.method_117d0718_FWm(this.field_334487_mrb))) {
            double d = (this.field_373a3ed_Dne.field_2d29ef_aFZ - this.field_373a3ed_Dne.field_212608_FWm) * 0.66;
            int n3 = geR.method_117d0718_FWm(this.field_22c5fd_IjH - (double)this.field_36b0a6_udO + d);
            return this.field_36c4f18_Dne.method_2c2cf7b9_Dne(n2, n3, n);
        }
        return 0.0f;
    }

    protected boolean method_2be429a8_Dne(double d, double d2, double d3) {
        int n = geR.method_117d0718_FWm(d);
        int n2 = geR.method_117d0718_FWm(d2);
        int n3 = geR.method_117d0718_FWm(d3);
        double d4 = d - (double)n;
        double d5 = d2 - (double)n2;
        double d6 = d3 - (double)n3;
        List list = this.field_36c4f18_Dne.method_6577291f_Dne(this.field_373a3ed_Dne);
        if (list.isEmpty() && !this.field_36c4f18_Dne.method_309ee6e3_div(n, n2, n3)) {
            return false;
        }
        boolean bl = !this.field_36c4f18_Dne.method_309ee6e3_div(n - 1, n2, n3);
        boolean bl2 = !this.field_36c4f18_Dne.method_309ee6e3_div(n + 1, n2, n3);
        boolean bl3 = !this.field_36c4f18_Dne.method_309ee6e3_div(n, n2 - 1, n3);
        boolean bl4 = !this.field_36c4f18_Dne.method_309ee6e3_div(n, n2 + 1, n3);
        boolean bl5 = !this.field_36c4f18_Dne.method_309ee6e3_div(n, n2, n3 - 1);
        boolean bl6 = !this.field_36c4f18_Dne.method_309ee6e3_div(n, n2, n3 + 1);
        int n4 = 3;
        double d7 = 9999.0;
        if (bl && d4 < d7) {
            d7 = d4;
            n4 = 0;
        }
        if (bl2 && 1.0 - d4 < d7) {
            d7 = 1.0 - d4;
            n4 = 1;
        }
        if (bl4 && 1.0 - d5 < d7) {
            d7 = 1.0 - d5;
            n4 = 3;
        }
        if (bl5 && d6 < d7) {
            d7 = d6;
            n4 = 4;
        }
        if (bl6 && 1.0 - d6 < d7) {
            d7 = 1.0 - d6;
            n4 = 5;
        }
        float f = this.field_7331eae7_Dne.nextFloat() * 0.2f + 0.1f;
        if (n4 == 0) {
            this.field_291868_XHL = -f;
        }
        if (n4 == 1) {
            this.field_291868_XHL = f;
        }
        if (n4 == 2) {
            this.field_2a9ad1_Zpi = -f;
        }
        if (n4 == 3) {
            this.field_2a9ad1_Zpi = f;
        }
        if (n4 == 4) {
            this.field_31b811_kGO = -f;
        }
        if (n4 == 5) {
            this.field_31b811_kGO = f;
        }
        return true;
    }

    public float method_bb7dd810_Dne(sMa sMa2) {
        float f = (float)(this.field_2f0dd3_div - sMa2.field_2f0dd3_div);
        float f2 = (float)(this.field_22c5fd_IjH - sMa2.field_22c5fd_IjH);
        float f3 = (float)(this.field_334487_mrb - sMa2.field_334487_mrb);
        return geR.method_143f92c9_bzF(f * f + f2 * f2 + f3 * f3);
    }

    protected void method_7d36ef22_FfS() {
        this.method_5d73f9d_g_();
    }

    public void method_2be429a4_Dne(double d, double d2, double d3) {
        if (this.field_31b827_kGO) {
            this.field_373a3ed_Dne.method_fbaf53ef_Qnq(d, d2, d3);
            this.field_2f0dd3_div = (this.field_373a3ed_Dne.field_2092a9_Dne + this.field_373a3ed_Dne.field_267cf0_Qnq) / 2.0;
            this.field_22c5fd_IjH = this.field_373a3ed_Dne.field_212608_FWm + (double)this.field_36b0a6_udO - (double)this.field_212c18_EyB;
            this.field_334487_mrb = (this.field_373a3ed_Dne.field_2e5f16_bzF + this.field_373a3ed_Dne.field_388da1_zGp) / 2.0;
        } else {
            int n;
            double d4;
            double d5;
            double d6;
            int n2;
            int n3;
            boolean bl;
            this.field_36c4f18_Dne.field_365731d_Dne.method_8f501fe4_Dne("move");
            this.field_212c18_EyB *= 0.4f;
            double d7 = this.field_2f0dd3_div;
            double d8 = this.field_22c5fd_IjH;
            double d9 = this.field_334487_mrb;
            if (this.field_33449d_mrb) {
                this.field_33449d_mrb = false;
                d *= 0.25;
                d2 *= (double)0.05f;
                d3 *= 0.25;
                this.field_291868_XHL = 0.0;
                this.field_2a9ad1_Zpi = 0.0;
                this.field_31b811_kGO = 0.0;
            }
            double d10 = d;
            double d11 = d2;
            double d12 = d3;
            bSp bSp2 = this.field_373a3ed_Dne.method_230d324c_Dne();
            boolean bl2 = bl = this.field_2d2a05_aFZ && this.method_a98a0664_aFZ() && this instanceof FiG;
            if (bl) {
                double d13 = 0.05;
                while (d != 0.0 && this.field_36c4f18_Dne.method_d11d9a5_Dne(this, this.field_373a3ed_Dne.method_2c4c7c89_bzF(d, -1.0, 0.0)).isEmpty()) {
                    d = d < d13 && d >= -d13 ? 0.0 : (d > 0.0 ? (d -= d13) : (d += d13));
                    d10 = d;
                }
                while (d3 != 0.0 && this.field_36c4f18_Dne.method_d11d9a5_Dne(this, this.field_373a3ed_Dne.method_2c4c7c89_bzF(0.0, -1.0, d3)).isEmpty()) {
                    d3 = d3 < d13 && d3 >= -d13 ? 0.0 : (d3 > 0.0 ? (d3 -= d13) : (d3 += d13));
                    d12 = d3;
                }
                while (d != 0.0 && d3 != 0.0 && this.field_36c4f18_Dne.method_d11d9a5_Dne(this, this.field_373a3ed_Dne.method_2c4c7c89_bzF(d, -1.0, d3)).isEmpty()) {
                    d = d < d13 && d >= -d13 ? 0.0 : (d > 0.0 ? (d -= d13) : (d += d13));
                    d3 = d3 < d13 && d3 >= -d13 ? 0.0 : (d3 > 0.0 ? (d3 -= d13) : (d3 += d13));
                    d10 = d;
                    d12 = d3;
                }
            }
            List list = this.field_36c4f18_Dne.method_d11d9a5_Dne(this, this.field_373a3ed_Dne.method_e44f9e56_Dne(d, d2, d3));
            for (n3 = 0; n3 < list.size(); ++n3) {
                d2 = ((bSp)list.get(n3)).method_8d26d563_FWm(this.field_373a3ed_Dne, d2);
            }
            this.field_373a3ed_Dne.method_fbaf53ef_Qnq(0.0, d2, 0.0);
            if (!this.field_29187e_XHL && d11 != d2) {
                d3 = 0.0;
                d2 = 0.0;
                d = 0.0;
            }
            n3 = this.field_2d2a05_aFZ || d11 != d2 && d11 < 0.0 ? 1 : 0;
            for (n2 = 0; n2 < list.size(); ++n2) {
                d = ((bSp)list.get(n2)).method_3c041104_Dne(this.field_373a3ed_Dne, d);
            }
            this.field_373a3ed_Dne.method_fbaf53ef_Qnq(d, 0.0, 0.0);
            if (!this.field_29187e_XHL && d10 != d) {
                d3 = 0.0;
                d2 = 0.0;
                d = 0.0;
            }
            for (n2 = 0; n2 < list.size(); ++n2) {
                d3 = ((bSp)list.get(n2)).method_88a92071_bzF(this.field_373a3ed_Dne, d3);
            }
            this.field_373a3ed_Dne.method_fbaf53ef_Qnq(0.0, 0.0, d3);
            if (!this.field_29187e_XHL && d12 != d3) {
                d3 = 0.0;
                d2 = 0.0;
                d = 0.0;
            }
            if (this.field_215b33_FfS > 0.0f && n3 != 0 && (bl || this.field_212c18_EyB < 0.05f) && (d10 != d || d12 != d3)) {
                d6 = d;
                d5 = d2;
                d4 = d3;
                d = d10;
                d2 = this.field_215b33_FfS;
                d3 = d12;
                bSp bSp3 = this.field_373a3ed_Dne.method_230d324c_Dne();
                this.field_373a3ed_Dne.method_9ed6d428_Dne(bSp2);
                list = this.field_36c4f18_Dne.method_d11d9a5_Dne(this, this.field_373a3ed_Dne.method_e44f9e56_Dne(d10, d2, d12));
                for (n = 0; n < list.size(); ++n) {
                    d2 = ((bSp)list.get(n)).method_8d26d563_FWm(this.field_373a3ed_Dne, d2);
                }
                this.field_373a3ed_Dne.method_fbaf53ef_Qnq(0.0, d2, 0.0);
                if (!this.field_29187e_XHL && d11 != d2) {
                    d3 = 0.0;
                    d2 = 0.0;
                    d = 0.0;
                }
                for (n = 0; n < list.size(); ++n) {
                    d = ((bSp)list.get(n)).method_3c041104_Dne(this.field_373a3ed_Dne, d);
                }
                this.field_373a3ed_Dne.method_fbaf53ef_Qnq(d, 0.0, 0.0);
                if (!this.field_29187e_XHL && d10 != d) {
                    d3 = 0.0;
                    d2 = 0.0;
                    d = 0.0;
                }
                for (n = 0; n < list.size(); ++n) {
                    d3 = ((bSp)list.get(n)).method_88a92071_bzF(this.field_373a3ed_Dne, d3);
                }
                this.field_373a3ed_Dne.method_fbaf53ef_Qnq(0.0, 0.0, d3);
                if (!this.field_29187e_XHL && d12 != d3) {
                    d3 = 0.0;
                    d2 = 0.0;
                    d = 0.0;
                }
                if (!this.field_29187e_XHL && d11 != d2) {
                    d3 = 0.0;
                    d2 = 0.0;
                    d = 0.0;
                } else {
                    d2 = -this.field_215b33_FfS;
                    for (n = 0; n < list.size(); ++n) {
                        d2 = ((bSp)list.get(n)).method_8d26d563_FWm(this.field_373a3ed_Dne, d2);
                    }
                    this.field_373a3ed_Dne.method_fbaf53ef_Qnq(0.0, d2, 0.0);
                }
                if (d6 * d6 + d4 * d4 >= d * d + d3 * d3) {
                    d = d6;
                    d2 = d5;
                    d3 = d4;
                    this.field_373a3ed_Dne.method_9ed6d428_Dne(bSp3);
                }
            }
            this.field_36c4f18_Dne.field_365731d_Dne.method_7c6f6039_FWm();
            this.field_36c4f18_Dne.field_365731d_Dne.method_8f501fe4_Dne("rest");
            this.field_2f0dd3_div = (this.field_373a3ed_Dne.field_2092a9_Dne + this.field_373a3ed_Dne.field_267cf0_Qnq) / 2.0;
            this.field_22c5fd_IjH = this.field_373a3ed_Dne.field_212608_FWm + (double)this.field_36b0a6_udO - (double)this.field_212c18_EyB;
            this.field_334487_mrb = (this.field_373a3ed_Dne.field_2e5f16_bzF + this.field_373a3ed_Dne.field_388da1_zGp) / 2.0;
            this.field_388db7_zGp = d10 != d || d12 != d3;
            this.field_20b868_DyG = d11 != d2;
            this.field_2d2a05_aFZ = d11 != d2 && d11 < 0.0;
            this.field_2f0de9_div = this.field_388db7_zGp || this.field_20b868_DyG;
            this.method_16ac470_Dne(d2, this.field_2d2a05_aFZ);
            if (d10 != d) {
                this.field_291868_XHL = 0.0;
            }
            if (d11 != d2) {
                this.field_2a9ad1_Zpi = 0.0;
            }
            if (d12 != d3) {
                this.field_31b811_kGO = 0.0;
            }
            d6 = this.field_2f0dd3_div - d7;
            d5 = this.field_22c5fd_IjH - d8;
            d4 = this.field_334487_mrb - d9;
            if (this.method_7c6f603d_FWm() && !bl && this.field_203511c4_FWm == null) {
                int n4;
                int n5;
                int n6 = geR.method_117d0718_FWm(this.field_2f0dd3_div);
                int n7 = this.field_36c4f18_Dne.method_2c2cf7bc_Dne(n6, n = geR.method_117d0718_FWm(this.field_22c5fd_IjH - (double)0.2f - (double)this.field_36b0a6_udO), n5 = geR.method_117d0718_FWm(this.field_334487_mrb));
                if (n7 == 0 && ((n4 = this.field_36c4f18_Dne.method_a6aca7bd_FWm(n6, n - 1, n5)) == 11 || n4 == 32 || n4 == 21)) {
                    n7 = this.field_36c4f18_Dne.method_2c2cf7bc_Dne(n6, n - 1, n5);
                }
                if (n7 != zKP.field_fa1a6f1_ZfC.field_21260d_FWm) {
                    d5 = 0.0;
                }
                this.field_1ed014_ATE = (float)((double)this.field_1ed014_ATE + (double)geR.method_ce7f4ad4_Dne(d6 * d6 + d4 * d4) * 0.6);
                this.field_28e7fa_Vxn = (float)((double)this.field_28e7fa_Vxn + (double)geR.method_ce7f4ad4_Dne(d6 * d6 + d5 * d5 + d4 * d4) * 0.6);
                if (this.field_28e7fa_Vxn > (float)this.field_21260d_FWm && n7 > 0) {
                    this.field_21260d_FWm = (int)this.field_28e7fa_Vxn + 1;
                    if (this.method_9feec6c6_Zpi()) {
                        float f = geR.method_ce7f4ad4_Dne(this.field_291868_XHL * this.field_291868_XHL * (double)0.2f + this.field_2a9ad1_Zpi * this.field_2a9ad1_Zpi + this.field_31b811_kGO * this.field_31b811_kGO * (double)0.2f) * 0.35f;
                        if (f > 1.0f) {
                            f = 1.0f;
                        }
                        this.method_fbd4aee4_Dne("liquid.swim", f, 1.0f + (this.field_7331eae7_Dne.nextFloat() - this.field_7331eae7_Dne.nextFloat()) * 0.4f);
                    }
                    this.method_5972745a_Dne(n6, n, n5, n7);
                    zKP.field_8374b848_Dne[n7].method_4b0c00b_FWm(this.field_36c4f18_Dne, n6, n, n5, this);
                }
            }
            this.method_8c71d201_OdI();
            boolean bl3 = this.method_9a443a9d_XHL();
            if (this.field_36c4f18_Dne.method_21a91c05_Qnq(this.field_373a3ed_Dne.method_4f91d5d0_aFZ(0.001, 0.001, 0.001))) {
                this.method_b51ddfb1_zGp(1);
                if (!bl3) {
                    ++this.field_2e5f1b_bzF;
                    if (this.field_2e5f1b_bzF == 0) {
                        this.method_87b738a3_aFZ(8);
                    }
                }
            } else if (this.field_2e5f1b_bzF <= 0) {
                this.field_2e5f1b_bzF = -this.field_20b857_DyG;
            }
            if (bl3 && this.field_2e5f1b_bzF > 0) {
                this.method_fbd4aee4_Dne("random.fizz", 0.7f, 1.6f + (this.field_7331eae7_Dne.nextFloat() - this.field_7331eae7_Dne.nextFloat()) * 0.4f);
                this.field_2e5f1b_bzF = -this.field_20b857_DyG;
            }
            this.field_36c4f18_Dne.field_365731d_Dne.method_7c6f6039_FWm();
        }
    }

    public void method_7db29412_Fnk() {
        if (this.field_342264_ooe > 0) {
            this.field_342264_ooe = this.method_7ad387f6_DyG();
        } else {
            double d = this.field_2d29ef_aFZ - this.field_2f0dd3_div;
            double d2 = this.field_20b852_DyG - this.field_334487_mrb;
            if (!this.field_36c4f18_Dne.field_2d2a05_aFZ && !this.field_28e80e_Vxn) {
                this.field_1ed017_ATE = zxJ.method_16a71cd_Dne(d, d2);
            }
            this.field_28e80e_Vxn = true;
        }
    }

    public chN method_230df162_Dne() {
        return null;
    }

    protected void method_16b621a_Dne(float f, float f2) {
        float f3;
        if (f != this.field_342261_ooe || f2 != this.field_367151_trS) {
            this.field_342261_ooe = f;
            this.field_367151_trS = f2;
            this.field_373a3ed_Dne.field_267cf0_Qnq = this.field_373a3ed_Dne.field_2092a9_Dne + (double)this.field_342261_ooe;
            this.field_373a3ed_Dne.field_388da1_zGp = this.field_373a3ed_Dne.field_2e5f16_bzF + (double)this.field_342261_ooe;
            this.field_373a3ed_Dne.field_2d29ef_aFZ = this.field_373a3ed_Dne.field_212608_FWm + (double)this.field_367151_trS;
        }
        this.field_373e877_Dne = (double)(f3 = f % 2.0f) < 0.375 ? bfY.field_373e877_Dne : ((double)f3 < 0.75 ? bfY.field_202db456_FWm : ((double)f3 < 1.0 ? bfY.field_75bbb664_bzF : ((double)f3 < 1.375 ? bfY.field_5e5d573e_Qnq : ((double)f3 < 1.75 ? bfY.field_71376cbd_aFZ : bfY.field_f0a5a76f_zGp))));
    }

    public double method_a98a064e_aFZ() {
        return (double)this.field_367151_trS * 0.75;
    }

    public float method_981211cc_Dne(yTR yTR2, Qnq qnq, int n, int n2, int n3, zKP zKP2) {
        return zKP2.method_bb7dd810_Dne(this);
    }

    public int method_8288d6e1_IjH() {
        return this.field_1ed017_ATE;
    }

    public boolean method_8c71d205_OdI() {
        return this.method_cc5ef5c4_trS();
    }

    public float method_907a9d11_Qnq() {
        return 0.1f;
    }

    protected void method_ce7f5266_Dne(float f) {
        if (this.field_37b45e5_Dne != null) {
            this.field_37b45e5_Dne.method_ce7f5266_Dne(f);
        }
    }

    public void method_102200f0_Qnq(WkD wkD) {
        try {
            mbZ mbZ2 = wkD.method_285baa50_Dne("Pos");
            mbZ mbZ3 = wkD.method_285baa50_Dne("Motion");
            mbZ mbZ4 = wkD.method_285baa50_Dne("Rotation");
            this.field_291868_XHL = ((kJU)mbZ3.method_77d0d055_FWm((int)0)).field_2092a9_Dne;
            this.field_2a9ad1_Zpi = ((kJU)mbZ3.method_77d0d055_FWm((int)1)).field_2092a9_Dne;
            this.field_31b811_kGO = ((kJU)mbZ3.method_77d0d055_FWm((int)2)).field_2092a9_Dne;
            if (Math.abs(this.field_291868_XHL) > 10.0) {
                this.field_291868_XHL = 0.0;
            }
            if (Math.abs(this.field_2a9ad1_Zpi) > 10.0) {
                this.field_2a9ad1_Zpi = 0.0;
            }
            if (Math.abs(this.field_31b811_kGO) > 10.0) {
                this.field_31b811_kGO = 0.0;
            }
            this.field_36b0a4_udO = this.field_2f0dd3_div = ((kJU)mbZ2.method_77d0d055_FWm((int)0)).field_2092a9_Dne;
            this.field_2d29ef_aFZ = this.field_2f0dd3_div;
            this.field_34225f_ooe = this.field_22c5fd_IjH = ((kJU)mbZ2.method_77d0d055_FWm((int)1)).field_2092a9_Dne;
            this.field_388da1_zGp = this.field_22c5fd_IjH;
            this.field_36714f_trS = this.field_334487_mrb = ((kJU)mbZ2.method_77d0d055_FWm((int)2)).field_2092a9_Dne;
            this.field_20b852_DyG = this.field_334487_mrb;
            this.field_2a9ad3_Zpi = this.field_334489_mrb = ((nOv)mbZ4.method_77d0d055_FWm((int)0)).field_2092ab_Dne;
            this.field_31b813_kGO = this.field_29186a_XHL = ((nOv)mbZ4.method_77d0d055_FWm((int)1)).field_2092ab_Dne;
            this.field_2e8483_ceE = wkD.method_8f501fd4_Dne("FallDistance");
            this.field_2e5f1b_bzF = wkD.method_8f501fe1_Dne("Fire");
            this.method_df9deb60_DyG(wkD.method_8f501fe1_Dne("Air"));
            this.field_2d2a05_aFZ = wkD.method_110c4dc7_FWm("OnGround");
            this.field_348572_qLR = wkD.method_8f501fd7_Dne("Dimension");
            this.field_21261e_FWm = wkD.method_110c4dc7_FWm("Invulnerable");
            this.field_342264_ooe = wkD.method_8f501fd7_Dne("PortalCooldown");
            if (wkD.method_8f501fe8_Dne("UUIDMost") && wkD.method_8f501fe8_Dne("UUIDLeast")) {
                this.field_f2f12acf_Dne = new UUID(wkD.method_8f501fd8_Dne("UUIDMost"), wkD.method_8f501fd8_Dne("UUIDLeast"));
            }
            this.method_2961957_bzF(this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb);
            this.method_1e252df9_FWm(this.field_334489_mrb, this.field_29186a_XHL);
            this.method_66a36cd8_FWm(wkD);
        }
        catch (Throwable throwable) {
            McM mcM = McM.method_948e60df_Dne(throwable, "Loading entity NBT");
            Noo noo = mcM.method_284dc627_Dne("Entity being loaded");
            this.method_7e400579_Dne(noo);
            throw new kaJ(mcM);
        }
    }

    public int method_7c6f602c_FWm() {
        return 3;
    }

    public void method_ce109fc6_vSL() {
        if (this.field_203511c4_FWm.field_2a9ae7_Zpi) {
            this.field_203511c4_FWm = null;
        } else {
            this.field_291868_XHL = 0.0;
            this.field_2a9ad1_Zpi = 0.0;
            this.field_31b811_kGO = 0.0;
            this.method_7a46289a_Dne();
            if (this.field_203511c4_FWm != null) {
                this.field_203511c4_FWm.method_908be33b_RPx();
                this.field_212608_FWm += (double)(this.field_203511c4_FWm.field_334489_mrb - this.field_203511c4_FWm.field_2a9ad3_Zpi);
                this.field_2092a9_Dne += (double)(this.field_203511c4_FWm.field_29186a_XHL - this.field_203511c4_FWm.field_31b813_kGO);
                while (this.field_212608_FWm >= 180.0) {
                    this.field_212608_FWm -= 360.0;
                }
                while (this.field_212608_FWm < -180.0) {
                    this.field_212608_FWm += 360.0;
                }
                while (this.field_2092a9_Dne >= 180.0) {
                    this.field_2092a9_Dne -= 360.0;
                }
                while (this.field_2092a9_Dne < -180.0) {
                    this.field_2092a9_Dne += 360.0;
                }
                double d = this.field_212608_FWm * 0.5;
                double d2 = this.field_2092a9_Dne * 0.5;
                float f = 10.0f;
                if (d > (double)f) {
                    d = f;
                }
                if (d < (double)(-f)) {
                    d = -f;
                }
                if (d2 > (double)f) {
                    d2 = f;
                }
                if (d2 < (double)(-f)) {
                    d2 = -f;
                }
                this.field_212608_FWm -= d;
                this.field_2092a9_Dne -= d2;
                this.field_334489_mrb = (float)((double)this.field_334489_mrb + d);
                this.field_29186a_XHL = (float)((double)this.field_29186a_XHL + d2);
            }
        }
    }

    public void method_ae1c3edf_Dne(double d, double d2, double d3, float f, float f2, int n) {
        this.method_2961957_bzF(d, d2, d3);
        this.method_1e252df9_FWm(f, f2);
        List list = this.field_36c4f18_Dne.method_d11d9a5_Dne(this, this.field_373a3ed_Dne.method_4f91d5d0_aFZ(0.03125, 0.0, 0.03125));
        if (!list.isEmpty()) {
            double d4 = 0.0;
            for (int i = 0; i < list.size(); ++i) {
                bSp bSp2 = (bSp)list.get(i);
                if (!(bSp2.field_2d29ef_aFZ > d4)) continue;
                d4 = bSp2.field_2d29ef_aFZ;
            }
            this.method_2961957_bzF(d, d2 += d4 - this.field_373a3ed_Dne.field_212608_FWm, d3);
        }
    }

    public boolean method_ce7f4ae8_Dne(double d) {
        double d2 = this.field_373a3ed_Dne.method_7a462888_Dne();
        return d < (d2 *= 64.0 * this.field_267cf0_Qnq) * d2;
    }

    public boolean method_cc5ef5c4_trS() {
        return this.field_2e5f1b_bzF > 0 || this.method_ce7f5dad_Dne(0);
    }

    public boolean method_49863868_FWm(FiG fiG) {
        return this.method_998e662d_Vxn();
    }

    public boolean method_998e662d_Vxn() {
        return this.method_ce7f5dad_Dne(5);
    }

    public boolean method_c19d9a0d_oIf() {
        return true;
    }

    public luM method_23123967_Dne() {
        return this.field_378ab08_Dne;
    }

    protected abstract void method_7c6f6039_FWm();

    public boolean method_7ad38807_DyG() {
        return this.field_36c4f18_Dne.method_6b4d1514_Dne(this.field_373a3ed_Dne.method_b78565d7_FWm(-0.1f, -0.4f, -0.1f), KFd.field_5b96677_IjH);
    }

    public boolean method_ae128dcb_bzF() {
        return true;
    }

    protected void method_8c71d201_OdI() {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6 = geR.method_117d0718_FWm(this.field_373a3ed_Dne.field_2092a9_Dne + 0.001);
        if (this.field_36c4f18_Dne.method_c6b5263e_Dne(n6, n5 = geR.method_117d0718_FWm(this.field_373a3ed_Dne.field_212608_FWm + 0.001), n4 = geR.method_117d0718_FWm(this.field_373a3ed_Dne.field_2e5f16_bzF + 0.001), n3 = geR.method_117d0718_FWm(this.field_373a3ed_Dne.field_267cf0_Qnq - 0.001), n2 = geR.method_117d0718_FWm(this.field_373a3ed_Dne.field_2d29ef_aFZ - 0.001), n = geR.method_117d0718_FWm(this.field_373a3ed_Dne.field_388da1_zGp - 0.001))) {
            for (int i = n6; i <= n3; ++i) {
                for (int j = n5; j <= n2; ++j) {
                    for (int k = n4; k <= n; ++k) {
                        int n7 = this.field_36c4f18_Dne.method_2c2cf7bc_Dne(i, j, k);
                        if (n7 <= 0) continue;
                        zKP.field_8374b848_Dne[n7].method_8d285d4a_Dne(this.field_36c4f18_Dne, i, j, k, this);
                    }
                }
            }
        }
    }

    protected void method_b51ddfb1_zGp(int n) {
        if (!this.field_342275_ooe) {
            this.method_147b2066_Dne(zBn.field_37e4cc6_Dne, n);
        }
    }

    public void method_aad4531d_a_(boolean bl) {
        this.method_16d0a4b_Dne(3, bl);
    }

    public void method_7f44880a_bzF(WkD wkD) {
        try {
            WkD wkD2;
            wkD.method_58996597_Dne("Pos", this.method_d5ab194f_Dne(this.field_2f0dd3_div, this.field_22c5fd_IjH + (double)this.field_212c18_EyB, this.field_334487_mrb));
            wkD.method_58996597_Dne("Motion", this.method_d5ab194f_Dne(this.field_291868_XHL, this.field_2a9ad1_Zpi, this.field_31b811_kGO));
            wkD.method_58996597_Dne("Rotation", this.method_3f778fd1_Dne(this.field_334489_mrb, this.field_29186a_XHL));
            wkD.method_5ab4445c_Dne("FallDistance", this.field_2e8483_ceE);
            wkD.method_5ab47529_Dne("Fire", (short)this.field_2e5f1b_bzF);
            wkD.method_5ab47529_Dne("Air", (short)this.method_b0a28137_div());
            wkD.method_5ab48f70_Dne("OnGround", this.field_2d2a05_aFZ);
            wkD.method_5ab44f9f_Dne("Dimension", this.field_348572_qLR);
            wkD.method_5ab48f70_Dne("Invulnerable", this.field_21261e_FWm);
            wkD.method_5ab44f9f_Dne("PortalCooldown", this.field_342264_ooe);
            wkD.method_5ab45360_Dne("UUIDMost", this.field_f2f12acf_Dne.getMostSignificantBits());
            wkD.method_5ab45360_Dne("UUIDLeast", this.field_f2f12acf_Dne.getLeastSignificantBits());
            this.method_8d4fb917_Dne(wkD);
            if (this.field_203511c4_FWm != null && this.field_203511c4_FWm.method_8d4fb91b_Dne(wkD2 = new WkD("Riding"))) {
                wkD.method_58996597_Dne("Riding", wkD2);
            }
        }
        catch (Throwable throwable) {
            McM mcM = McM.method_948e60df_Dne(throwable, "Saving entity NBT");
            Noo noo = mcM.method_284dc627_Dne("Entity being saved");
            this.method_7e400579_Dne(noo);
            throw new kaJ(mcM);
        }
    }

    public void method_87b77874_aFZ(boolean bl) {
        this.method_16d0a4b_Dne(4, bl);
    }

    public boolean method_7c861acb_EyB() {
        return this.field_21261e_FWm;
    }

    protected void method_16d0a4b_Dne(int n, boolean bl) {
        byte by = this.field_378ab08_Dne.method_ce7f5d95_Dne(0);
        if (bl) {
            this.field_378ab08_Dne.method_62ca2346_FWm(0, (byte)(by | 1 << n));
        } else {
            this.field_378ab08_Dne.method_62ca2346_FWm(0, (byte)(by & ~(1 << n)));
        }
    }

    public void method_83516093_Dne(Qnq qnq) {
        this.field_36c4f18_Dne = qnq;
    }

    public boolean method_66a36cdc_FWm(WkD wkD) {
        String string = this.method_4a7b1d9f_Qnq();
        if (!this.field_2a9ae7_Zpi && string != null && this.field_37b45e5_Dne == null) {
            wkD.method_abaa98ae_Dne("id", string);
            this.method_7f44880a_bzF(wkD);
            return true;
        }
        return false;
    }

    public void method_908be33b_RPx() {
        if (this.field_37b45e5_Dne != null) {
            if (!(this.field_37b45e5_Dne instanceof FiG) || !((FiG)this.field_37b45e5_Dne).method_590ca1c_b_()) {
                this.field_37b45e5_Dne.field_36b0a4_udO = this.field_36b0a4_udO;
                this.field_37b45e5_Dne.field_34225f_ooe = this.field_34225f_ooe + this.method_a98a064e_aFZ() + this.field_37b45e5_Dne.method_907a9d0f_Qnq();
                this.field_37b45e5_Dne.field_36714f_trS = this.field_36714f_trS;
            }
            this.field_37b45e5_Dne.method_2961957_bzF(this.field_2f0dd3_div, this.field_22c5fd_IjH + this.method_a98a064e_aFZ() + this.field_37b45e5_Dne.method_907a9d0f_Qnq(), this.field_334487_mrb);
        }
    }

    public boolean method_c5287a62_qLR() {
        return this.field_203511c4_FWm != null || this.method_ce7f5dad_Dne(2);
    }

    public void method_b43ddeb4_Dne(sMa sMa2, boolean bl) {
        WkD wkD = new WkD();
        sMa2.method_7f44880a_bzF(wkD);
        this.method_102200f0_Qnq(wkD);
        this.field_342264_ooe = sMa2.field_342264_ooe;
        this.field_1ed017_ATE = sMa2.field_1ed017_ATE;
    }

    public boolean method_6eed2507_Dne(yTR yTR2, Qnq qnq, int n, int n2, int n3, int n4, float f) {
        return true;
    }

    public void method_7ed97a02_Qnq(int n) {
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ && !this.field_2a9ae7_Zpi) {
            this.field_36c4f18_Dne.field_365731d_Dne.method_8f501fe4_Dne("changeDimension");
            jwh_0 jwh_02 = jwh_0.method_2302cf90_Dne();
            int n2 = this.field_348572_qLR;
            RAN rAN = jwh_02.method_9e6fba3b_Dne(n2);
            RAN rAN2 = jwh_02.method_9e6fba3b_Dne(n);
            this.field_348572_qLR = n;
            this.field_36c4f18_Dne.method_ad72a713_bzF(this);
            this.field_2a9ae7_Zpi = false;
            this.field_36c4f18_Dne.field_365731d_Dne.method_8f501fe4_Dne("reposition");
            jwh_02.method_230ea953_Dne().method_9b359c63_Dne(this, n2, rAN, rAN2);
            this.field_36c4f18_Dne.field_365731d_Dne.method_110c4dc3_FWm("reloading");
            sMa sMa2 = Klb.method_c1d803b3_Dne(Klb.method_636080_Dne(this), rAN2);
            if (sMa2 != null) {
                sMa2.method_b43ddeb4_Dne(this, true);
                rAN2.method_94d18be5_FWm(sMa2);
            }
            this.field_2a9ae7_Zpi = true;
            this.field_36c4f18_Dne.field_365731d_Dne.method_7c6f6039_FWm();
            rAN.method_cd4cb3d5_udO();
            rAN2.method_cd4cb3d5_udO();
            this.field_36c4f18_Dne.field_365731d_Dne.method_7c6f6039_FWm();
        }
    }

    public float method_a98a0650_aFZ() {
        return 0.0f;
    }

    public boolean method_c3b4a2d4_ooe() {
        for (int i = 0; i < 8; ++i) {
            int n;
            int n2;
            float f = ((float)((i >> 0) % 2) - 0.5f) * this.field_342261_ooe * 0.8f;
            float f2 = ((float)((i >> 1) % 2) - 0.5f) * 0.1f;
            float f3 = ((float)((i >> 2) % 2) - 0.5f) * this.field_342261_ooe * 0.8f;
            int n3 = geR.method_117d0718_FWm(this.field_2f0dd3_div + (double)f);
            if (!this.field_36c4f18_Dne.method_6fdef3c4_DyG(n3, n2 = geR.method_117d0718_FWm(this.field_22c5fd_IjH + (double)this.method_59ee189_c_() + (double)f2), n = geR.method_117d0718_FWm(this.field_334487_mrb + (double)f3))) continue;
            return true;
        }
        return false;
    }

    public bSp method_9a35aed2_Dne(sMa sMa2) {
        return null;
    }
}

