package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public abstract class Ebp
extends sMa {
    private boolean field_2092bf_Dne = false;
    private double field_1ed012_ATE;
    private double field_2092a9_Dne;
    private double field_2e5f16_bzF;
    private String field_c480ca78_bzF;
    private static final int[][][] field_ce96d629_Dne = new int[][][]{new int[][]{{0, 0, -1}, {0, 0, 1}}, new int[][]{{-1, 0, 0}, {1, 0, 0}}, new int[][]{{-1, -1, 0}, {1, 0, 0}}, new int[][]{{-1, 0, 0}, {1, -1, 0}}, new int[][]{{0, 0, -1}, {0, -1, 1}}, new int[][]{{0, -1, -1}, {0, 0, 1}}, new int[][]{{0, 0, 1}, {1, 0, 0}}, new int[][]{{0, 0, 1}, {-1, 0, 0}}, new int[][]{{0, 0, -1}, {-1, 0, 0}}, new int[][]{{0, 0, -1}, {1, 0, 0}}};
    private double field_212608_FWm;
    private double field_28e7f8_Vxn;
    private double field_2e8481_ceE;
    private final qDW field_37a3a28_Dne;
    private double field_34856d_qLR;
    private int field_2092ae_Dne;
    private double field_212c16_EyB;

    public zKP method_f88e496b_FWm() {
        return null;
    }

    public Ebp(Qnq qnq) {
        super(qnq);
        this.field_2e5f2c_bzF = true;
        this.method_16b621a_Dne(0.98f, 0.7f);
        this.field_36b0a6_udO = this.field_367151_trS / 2.0f;
        this.field_37a3a28_Dne = qnq != null ? qnq.method_f4d8ada1_Dne(this) : null;
    }

    @Override
    public void method_76912e1e_aFZ(double d, double d2, double d3) {
        this.field_28e7f8_Vxn = this.field_291868_XHL = d;
        this.field_2e8481_ceE = this.field_2a9ad1_Zpi = d2;
        this.field_212c16_EyB = this.field_31b811_kGO = d3;
    }

    @Override
    protected void method_8d4fb917_Dne(WkD wkD) {
        if (this.method_907a9d25_Qnq()) {
            wkD.method_5ab48f70_Dne("CustomDisplayTile", true);
            wkD.method_5ab44f9f_Dne("DisplayTile", this.method_2317f94c_Dne() == null ? 0 : this.method_2317f94c_Dne().field_21260d_FWm);
            wkD.method_5ab44f9f_Dne("DisplayData", this.method_9feec6b5_Zpi());
            wkD.method_5ab44f9f_Dne("DisplayOffset", this.method_cd4cb3c8_udO());
        }
        if (this.field_c480ca78_bzF != null && this.field_c480ca78_bzF.length() > 0) {
            wkD.method_abaa98ae_Dne("CustomName", this.field_c480ca78_bzF);
        }
    }

    @Override
    protected boolean method_7c6f603d_FWm() {
        return false;
    }

    public int method_c3b4a2c3_ooe() {
        return 6;
    }

    @Override
    public void method_7a46289a_Dne() {
        int n;
        int n2;
        if (this.field_37a3a28_Dne != null) {
            this.field_37a3a28_Dne.method_7a46289a_Dne();
        }
        if (this.method_ae128dba_bzF() > 0) {
            this.method_117d19ea_FWm(this.method_ae128dba_bzF() - 1);
        }
        if (this.method_7a46288d_Dne() > 0) {
            this.method_ce7f5da9_Dne(this.method_7a46288d_Dne() - 1);
        }
        if (this.field_22c5fd_IjH < -64.0) {
            this.method_7d36ef22_FfS();
        }
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ && this.field_36c4f18_Dne instanceof RAN) {
            this.field_36c4f18_Dne.field_365731d_Dne.method_8f501fe4_Dne("portal");
            jwh_0 jwh_02 = ((RAN)this.field_36c4f18_Dne).method_2302cf90_Dne();
            n2 = this.method_d44b4585_zGp();
            if (this.field_28e80e_Vxn) {
                if (jwh_02.method_b0a28148_div()) {
                    if (this.field_203511c4_FWm == null && this.field_367154_trS++ >= n2) {
                        this.field_367154_trS = n2;
                        this.field_342264_ooe = this.method_7ad387f6_DyG();
                        n = this.field_36c4f18_Dne.field_3690d00_Dne.field_2092ae_Dne == -1 ? 0 : -1;
                        this.method_7ed97a02_Qnq(n);
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
        if (this.field_36c4f18_Dne.field_2d2a05_aFZ) {
            if (this.field_2092ae_Dne > 0) {
                double d = this.field_2f0dd3_div + (this.field_2092a9_Dne - this.field_2f0dd3_div) / (double)this.field_2092ae_Dne;
                double d2 = this.field_22c5fd_IjH + (this.field_212608_FWm - this.field_22c5fd_IjH) / (double)this.field_2092ae_Dne;
                double d3 = this.field_334487_mrb + (this.field_2e5f16_bzF - this.field_334487_mrb) / (double)this.field_2092ae_Dne;
                double d4 = geR.method_ce7f4ad2_Dne(this.field_34856d_qLR - (double)this.field_334489_mrb);
                this.field_334489_mrb = (float)((double)this.field_334489_mrb + d4 / (double)this.field_2092ae_Dne);
                this.field_29186a_XHL = (float)((double)this.field_29186a_XHL + (this.field_1ed012_ATE - (double)this.field_29186a_XHL) / (double)this.field_2092ae_Dne);
                --this.field_2092ae_Dne;
                this.method_2961957_bzF(d, d2, d3);
                this.method_1e252df9_FWm(this.field_334489_mrb, this.field_29186a_XHL);
            } else {
                this.method_2961957_bzF(this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb);
                this.method_1e252df9_FWm(this.field_334489_mrb, this.field_29186a_XHL);
            }
        } else {
            double d;
            this.field_2d29ef_aFZ = this.field_2f0dd3_div;
            this.field_388da1_zGp = this.field_22c5fd_IjH;
            this.field_20b852_DyG = this.field_334487_mrb;
            this.field_2a9ad1_Zpi -= (double)0.04f;
            int n3 = geR.method_117d0718_FWm(this.field_2f0dd3_div);
            if (Oaf.method_3036b9d3_FWm(this.field_36c4f18_Dne, n3, (n2 = geR.method_117d0718_FWm(this.field_22c5fd_IjH)) - 1, n = geR.method_117d0718_FWm(this.field_334487_mrb))) {
                --n2;
            }
            double d5 = 0.4;
            double d6 = 0.0078125;
            int n4 = this.field_36c4f18_Dne.method_2c2cf7bc_Dne(n3, n2, n);
            if (Oaf.method_ce7f5dad_Dne(n4)) {
                int n5 = this.field_36c4f18_Dne.method_2dee76f_bzF(n3, n2, n);
                this.method_7216369_Dne(n3, n2, n, d5, d6, n4, n5);
                if (n4 == zKP.field_f674470_Dsg.field_21260d_FWm) {
                    this.method_5972b42b_Dne(n3, n2, n, (n5 & 8) != 0);
                }
            } else {
                this.method_ce7f4ae4_Dne(d5);
            }
            this.method_8c71d201_OdI();
            this.field_29186a_XHL = 0.0f;
            double d7 = this.field_2d29ef_aFZ - this.field_2f0dd3_div;
            double d8 = this.field_20b852_DyG - this.field_334487_mrb;
            if (d7 * d7 + d8 * d8 > 0.001) {
                this.field_334489_mrb = (float)(Math.atan2(d8, d7) * 180.0 / Math.PI);
                if (this.field_2092bf_Dne) {
                    this.field_334489_mrb += 180.0f;
                }
            }
            if ((d = (double)geR.method_87b72d50_aFZ(this.field_334489_mrb - this.field_2a9ad3_Zpi)) < -170.0 || d >= 170.0) {
                this.field_334489_mrb += 180.0f;
                this.field_2092bf_Dne = !this.field_2092bf_Dne;
            }
            this.method_1e252df9_FWm(this.field_334489_mrb, this.field_29186a_XHL);
            List list = this.field_36c4f18_Dne.method_71df22e6_FWm(this, this.field_373a3ed_Dne.method_b78565d7_FWm(0.2f, 0.0, 0.2f));
            if (list != null && !list.isEmpty()) {
                for (int i = 0; i < list.size(); ++i) {
                    sMa sMa2 = (sMa)list.get(i);
                    if (sMa2 == this.field_37b45e5_Dne || !sMa2.method_7a46289e_Dne() || !(sMa2 instanceof Ebp)) continue;
                    sMa2.method_3e501ff9_Qnq(this);
                }
            }
            if (this.field_37b45e5_Dne != null && this.field_37b45e5_Dne.field_2a9ae7_Zpi) {
                if (this.field_37b45e5_Dne.field_203511c4_FWm == this) {
                    this.field_37b45e5_Dne.field_203511c4_FWm = null;
                }
                this.field_37b45e5_Dne = null;
            }
        }
    }

    @Override
    public bSp method_230d324c_Dne() {
        return null;
    }

    public int method_c073daeb_mrb() {
        return this.field_378ab08_Dne.method_ce7f5d9c_Dne(18);
    }

    protected void method_907a9d21_Qnq() {
        if (this.field_37b45e5_Dne != null) {
            this.field_291868_XHL *= (double)0.997f;
            this.field_2a9ad1_Zpi *= 0.0;
            this.field_31b811_kGO *= (double)0.997f;
        } else {
            this.field_291868_XHL *= (double)0.96f;
            this.field_2a9ad1_Zpi *= 0.0;
            this.field_31b811_kGO *= (double)0.96f;
        }
    }

    public chN method_e4505d6c_Dne(double d, double d2, double d3) {
        int n;
        int n2;
        int n3;
        int n4 = geR.method_117d0718_FWm(d);
        if (Oaf.method_3036b9d3_FWm(this.field_36c4f18_Dne, n4, (n3 = geR.method_117d0718_FWm(d2)) - 1, n2 = geR.method_117d0718_FWm(d3))) {
            --n3;
        }
        if (Oaf.method_ce7f5dad_Dne(n = this.field_36c4f18_Dne.method_2c2cf7bc_Dne(n4, n3, n2))) {
            int n5 = this.field_36c4f18_Dne.method_2dee76f_bzF(n4, n3, n2);
            d2 = n3;
            if (((Oaf)zKP.field_8374b848_Dne[n]).method_907a9d25_Qnq()) {
                n5 &= 7;
            }
            if (n5 >= 2 && n5 <= 5) {
                d2 = n3 + 1;
            }
            int[][] nArray = field_ce96d629_Dne[n5];
            double d4 = 0.0;
            double d5 = (double)n4 + 0.5 + (double)nArray[0][0] * 0.5;
            double d6 = (double)n3 + 0.5 + (double)nArray[0][1] * 0.5;
            double d7 = (double)n2 + 0.5 + (double)nArray[0][2] * 0.5;
            double d8 = (double)n4 + 0.5 + (double)nArray[1][0] * 0.5;
            double d9 = (double)n3 + 0.5 + (double)nArray[1][1] * 0.5;
            double d10 = (double)n2 + 0.5 + (double)nArray[1][2] * 0.5;
            double d11 = d8 - d5;
            double d12 = (d9 - d6) * 2.0;
            double d13 = d10 - d7;
            if (d11 == 0.0) {
                d = (double)n4 + 0.5;
                d4 = d3 - (double)n2;
            } else if (d13 == 0.0) {
                d3 = (double)n2 + 0.5;
                d4 = d - (double)n4;
            } else {
                double d14 = d - d5;
                double d15 = d3 - d7;
                d4 = (d14 * d11 + d15 * d13) * 2.0;
            }
            d = d5 + d11 * d4;
            d2 = d6 + d12 * d4;
            d3 = d7 + d13 * d4;
            if (d12 < 0.0) {
                d2 += 1.0;
            }
            if (d12 > 0.0) {
                d2 += 0.5;
            }
            return this.field_36c4f18_Dne.method_23186a47_Dne().method_e4505d6c_Dne(d, d2, d3);
        }
        return null;
    }

    public int method_7a46288d_Dne() {
        return this.field_378ab08_Dne.method_ce7f5d9c_Dne(19);
    }

    public static Ebp method_bde99596_Dne(Qnq qnq, double d, double d2, double d3, int n) {
        switch (n) {
            case 1: {
                return new bnY(qnq, d, d2, d3);
            }
            case 2: {
                return new tVV(qnq, d, d2, d3);
            }
            case 3: {
                return new Art(qnq, d, d2, d3);
            }
            case 4: {
                return new sry(qnq, d, d2, d3);
            }
            case 5: {
                return new klq(qnq, d, d2, d3);
            }
        }
        return new FdF(qnq, d, d2, d3);
    }

    public boolean method_5acf91e_d_() {
        return this.field_c480ca78_bzF != null;
    }

    @Override
    public void method_5d73f9d_g_() {
        super.method_5d73f9d_g_();
        if (this.field_37a3a28_Dne != null) {
            this.field_37a3a28_Dne.method_7a46289a_Dne();
        }
    }

    public boolean method_907a9d25_Qnq() {
        return this.method_23123967_Dne().method_ce7f5d95_Dne(22) == 1;
    }

    public int method_9feec6b5_Zpi() {
        return !this.method_907a9d25_Qnq() ? this.method_baa393f5_kGO() : this.method_23123967_Dne().method_ce7f5d9c_Dne(20) >> 16;
    }

    public void method_ce9279d5_IjH(int n) {
        zKP zKP2 = this.method_2317f94c_Dne();
        int n2 = zKP2 == null ? 0 : zKP2.field_21260d_FWm;
        this.method_23123967_Dne().method_62ca2346_FWm(20, n2 & 0xFFFF | n << 16);
        this.method_117d59bb_FWm(true);
    }

    @Override
    public float method_7a46288a_Dne() {
        return 0.0f;
    }

    public zKP method_2317f94c_Dne() {
        if (!this.method_907a9d25_Qnq()) {
            return this.method_f88e496b_FWm();
        }
        int n = this.method_23123967_Dne().method_ce7f5d9c_Dne(20) & 0xFFFF;
        return n > 0 && n < zKP.field_8374b848_Dne.length ? zKP.field_8374b848_Dne[n] : null;
    }

    @Override
    public void method_ae1c3edf_Dne(double d, double d2, double d3, float f, float f2, int n) {
        this.field_2092a9_Dne = d;
        this.field_212608_FWm = d2;
        this.field_2e5f16_bzF = d3;
        this.field_34856d_qLR = f;
        this.field_1ed012_ATE = f2;
        this.field_2092ae_Dne = n + 2;
        this.field_291868_XHL = this.field_28e7f8_Vxn;
        this.field_2a9ad1_Zpi = this.field_2e8481_ceE;
        this.field_31b811_kGO = this.field_212c16_EyB;
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return true;
    }

    public void method_ce7f5da9_Dne(int n) {
        this.field_378ab08_Dne.method_62ca2346_FWm(19, n);
    }

    @Override
    public void method_b5f30bf3_gnI() {
        this.method_143f9e1c_bzF(-this.method_c073daeb_mrb());
        this.method_117d19ea_FWm(10);
        this.method_ce7f5da9_Dne(this.method_7a46288d_Dne() + this.method_7a46288d_Dne() * 10);
    }

    public void method_117d19ea_FWm(int n) {
        this.field_378ab08_Dne.method_62ca2346_FWm(17, n);
    }

    public void method_63ae1a3f_div(int n) {
        this.method_23123967_Dne().method_62ca2346_FWm(20, n & 0xFFFF | this.method_9feec6b5_Zpi() << 16);
        this.method_117d59bb_FWm(true);
    }

    protected void method_ce7f4ae4_Dne(double d) {
        if (this.field_291868_XHL < -d) {
            this.field_291868_XHL = -d;
        }
        if (this.field_291868_XHL > d) {
            this.field_291868_XHL = d;
        }
        if (this.field_31b811_kGO < -d) {
            this.field_31b811_kGO = -d;
        }
        if (this.field_31b811_kGO > d) {
            this.field_31b811_kGO = d;
        }
        if (this.field_2d2a05_aFZ) {
            this.field_291868_XHL *= 0.5;
            this.field_2a9ad1_Zpi *= 0.5;
            this.field_31b811_kGO *= 0.5;
        }
        this.method_2be429a4_Dne(this.field_291868_XHL, this.field_2a9ad1_Zpi, this.field_31b811_kGO);
        if (!this.field_2d2a05_aFZ) {
            this.field_291868_XHL *= (double)0.95f;
            this.field_2a9ad1_Zpi *= (double)0.95f;
            this.field_31b811_kGO *= (double)0.95f;
        }
    }

    public void method_8f501fe4_Dne(String string) {
        this.field_c480ca78_bzF = string;
    }

    @Override
    public boolean method_baa39406_kGO() {
        return !this.field_2a9ae7_Zpi;
    }

    public void method_117d59bb_FWm(boolean bl) {
        this.method_23123967_Dne().method_62ca2346_FWm(22, (byte)(bl ? 1 : 0));
    }

    @Override
    public boolean method_147b2066_Dne(zBn zBn2, int n) {
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ && !this.field_2a9ae7_Zpi) {
            boolean bl;
            if (this.method_7c861acb_EyB()) {
                return false;
            }
            this.method_143f9e1c_bzF(-this.method_c073daeb_mrb());
            this.method_117d19ea_FWm(10);
            this.method_c19d9a09_oIf();
            this.method_ce7f5da9_Dne(this.method_7a46288d_Dne() + n * 10);
            boolean bl2 = bl = zBn2.method_f88b2463_FWm() instanceof FiG && ((FiG)zBn2.method_f88b2463_FWm()).field_37cb681_Dne.field_267d06_Qnq;
            if (bl || this.method_7a46288d_Dne() > 40) {
                if (this.field_37b45e5_Dne != null) {
                    this.field_37b45e5_Dne.method_ad72a713_bzF(this);
                }
                if (bl && !this.method_5acf91e_d_()) {
                    this.method_5d73f9d_g_();
                } else {
                    this.method_c6daaac1_Dne(zBn2);
                }
            }
            return true;
        }
        return true;
    }

    @Override
    protected void method_7c6f6039_FWm() {
        this.field_378ab08_Dne.method_ad009545_Dne(17, new Integer(0));
        this.field_378ab08_Dne.method_ad009545_Dne(18, new Integer(1));
        this.field_378ab08_Dne.method_ad009545_Dne(19, new Integer(0));
        this.field_378ab08_Dne.method_ad009545_Dne(20, new Integer(0));
        this.field_378ab08_Dne.method_ad009545_Dne(21, new Integer(6));
        this.field_378ab08_Dne.method_ad009545_Dne(22, (byte)0);
    }

    public int method_cd4cb3c8_udO() {
        return !this.method_907a9d25_Qnq() ? this.method_c3b4a2c3_ooe() : this.method_23123967_Dne().method_ce7f5d9c_Dne(21);
    }

    protected void method_7216369_Dne(int n, int n2, int n3, double d, double d2, int n4, int n5) {
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        this.field_2e8483_ceE = 0.0f;
        chN chN2 = this.method_e4505d6c_Dne(this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb);
        this.field_22c5fd_IjH = n2;
        boolean bl = false;
        boolean bl2 = false;
        if (n4 == zKP.field_39655694_OdI.field_21260d_FWm) {
            bl = (n5 & 8) != 0;
            boolean bl3 = bl2 = !bl;
        }
        if (((Oaf)zKP.field_8374b848_Dne[n4]).method_907a9d25_Qnq()) {
            n5 &= 7;
        }
        if (n5 >= 2 && n5 <= 5) {
            this.field_22c5fd_IjH = n2 + 1;
        }
        if (n5 == 2) {
            this.field_291868_XHL -= d2;
        }
        if (n5 == 3) {
            this.field_291868_XHL += d2;
        }
        if (n5 == 4) {
            this.field_31b811_kGO += d2;
        }
        if (n5 == 5) {
            this.field_31b811_kGO -= d2;
        }
        int[][] nArray = field_ce96d629_Dne[n5];
        double d8 = nArray[1][0] - nArray[0][0];
        double d9 = nArray[1][2] - nArray[0][2];
        double d10 = Math.sqrt(d8 * d8 + d9 * d9);
        double d11 = this.field_291868_XHL * d8 + this.field_31b811_kGO * d9;
        if (d11 < 0.0) {
            d8 = -d8;
            d9 = -d9;
        }
        if ((d7 = Math.sqrt(this.field_291868_XHL * this.field_291868_XHL + this.field_31b811_kGO * this.field_31b811_kGO)) > 2.0) {
            d7 = 2.0;
        }
        this.field_291868_XHL = d7 * d8 / d10;
        this.field_31b811_kGO = d7 * d9 / d10;
        if (this.field_37b45e5_Dne != null) {
            d6 = this.field_37b45e5_Dne.field_291868_XHL * this.field_37b45e5_Dne.field_291868_XHL + this.field_37b45e5_Dne.field_31b811_kGO * this.field_37b45e5_Dne.field_31b811_kGO;
            d5 = this.field_291868_XHL * this.field_291868_XHL + this.field_31b811_kGO * this.field_31b811_kGO;
            if (d6 > 1.0E-4 && d5 < 0.01) {
                this.field_291868_XHL += this.field_37b45e5_Dne.field_291868_XHL * 0.1;
                this.field_31b811_kGO += this.field_37b45e5_Dne.field_31b811_kGO * 0.1;
                bl2 = false;
            }
        }
        if (bl2) {
            d6 = Math.sqrt(this.field_291868_XHL * this.field_291868_XHL + this.field_31b811_kGO * this.field_31b811_kGO);
            if (d6 < 0.03) {
                this.field_291868_XHL *= 0.0;
                this.field_2a9ad1_Zpi *= 0.0;
                this.field_31b811_kGO *= 0.0;
            } else {
                this.field_291868_XHL *= 0.5;
                this.field_2a9ad1_Zpi *= 0.0;
                this.field_31b811_kGO *= 0.5;
            }
        }
        d6 = 0.0;
        d5 = (double)n + 0.5 + (double)nArray[0][0] * 0.5;
        double d12 = (double)n3 + 0.5 + (double)nArray[0][2] * 0.5;
        double d13 = (double)n + 0.5 + (double)nArray[1][0] * 0.5;
        double d14 = (double)n3 + 0.5 + (double)nArray[1][2] * 0.5;
        d8 = d13 - d5;
        d9 = d14 - d12;
        if (d8 == 0.0) {
            this.field_2f0dd3_div = (double)n + 0.5;
            d6 = this.field_334487_mrb - (double)n3;
        } else if (d9 == 0.0) {
            this.field_334487_mrb = (double)n3 + 0.5;
            d6 = this.field_2f0dd3_div - (double)n;
        } else {
            d4 = this.field_2f0dd3_div - d5;
            d3 = this.field_334487_mrb - d12;
            d6 = (d4 * d8 + d3 * d9) * 2.0;
        }
        this.field_2f0dd3_div = d5 + d8 * d6;
        this.field_334487_mrb = d12 + d9 * d6;
        this.method_2961957_bzF(this.field_2f0dd3_div, this.field_22c5fd_IjH + (double)this.field_36b0a6_udO, this.field_334487_mrb);
        d4 = this.field_291868_XHL;
        d3 = this.field_31b811_kGO;
        if (this.field_37b45e5_Dne != null) {
            d4 *= 0.75;
            d3 *= 0.75;
        }
        if (d4 < -d) {
            d4 = -d;
        }
        if (d4 > d) {
            d4 = d;
        }
        if (d3 < -d) {
            d3 = -d;
        }
        if (d3 > d) {
            d3 = d;
        }
        this.method_2be429a4_Dne(d4, 0.0, d3);
        if (nArray[0][1] != 0 && geR.method_117d0718_FWm(this.field_2f0dd3_div) - n == nArray[0][0] && geR.method_117d0718_FWm(this.field_334487_mrb) - n3 == nArray[0][2]) {
            this.method_2961957_bzF(this.field_2f0dd3_div, this.field_22c5fd_IjH + (double)nArray[0][1], this.field_334487_mrb);
        } else if (nArray[1][1] != 0 && geR.method_117d0718_FWm(this.field_2f0dd3_div) - n == nArray[1][0] && geR.method_117d0718_FWm(this.field_334487_mrb) - n3 == nArray[1][2]) {
            this.method_2961957_bzF(this.field_2f0dd3_div, this.field_22c5fd_IjH + (double)nArray[1][1], this.field_334487_mrb);
        }
        this.method_907a9d21_Qnq();
        chN chN3 = this.method_e4505d6c_Dne(this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb);
        if (chN3 != null && chN2 != null) {
            double d15 = (chN2.field_212608_FWm - chN3.field_212608_FWm) * 0.05;
            d7 = Math.sqrt(this.field_291868_XHL * this.field_291868_XHL + this.field_31b811_kGO * this.field_31b811_kGO);
            if (d7 > 0.0) {
                this.field_291868_XHL = this.field_291868_XHL / d7 * (d7 + d15);
                this.field_31b811_kGO = this.field_31b811_kGO / d7 * (d7 + d15);
            }
            this.method_2961957_bzF(this.field_2f0dd3_div, chN3.field_212608_FWm, this.field_334487_mrb);
        }
        int n6 = geR.method_117d0718_FWm(this.field_2f0dd3_div);
        int n7 = geR.method_117d0718_FWm(this.field_334487_mrb);
        if (n6 != n || n7 != n3) {
            d7 = Math.sqrt(this.field_291868_XHL * this.field_291868_XHL + this.field_31b811_kGO * this.field_31b811_kGO);
            this.field_291868_XHL = d7 * (double)(n6 - n);
            this.field_31b811_kGO = d7 * (double)(n7 - n3);
        }
        if (bl) {
            double d16 = Math.sqrt(this.field_291868_XHL * this.field_291868_XHL + this.field_31b811_kGO * this.field_31b811_kGO);
            if (d16 > 0.01) {
                double d17 = 0.06;
                this.field_291868_XHL += this.field_291868_XHL / d16 * d17;
                this.field_31b811_kGO += this.field_31b811_kGO / d16 * d17;
            } else if (n5 == 1) {
                if (this.field_36c4f18_Dne.method_6fdef3c4_DyG(n - 1, n2, n3)) {
                    this.field_291868_XHL = 0.02;
                } else if (this.field_36c4f18_Dne.method_6fdef3c4_DyG(n + 1, n2, n3)) {
                    this.field_291868_XHL = -0.02;
                }
            } else if (n5 == 0) {
                if (this.field_36c4f18_Dne.method_6fdef3c4_DyG(n, n2, n3 - 1)) {
                    this.field_31b811_kGO = 0.02;
                } else if (this.field_36c4f18_Dne.method_6fdef3c4_DyG(n, n2, n3 + 1)) {
                    this.field_31b811_kGO = -0.02;
                }
            }
        }
    }

    public void method_5972b42b_Dne(int n, int n2, int n3, boolean bl) {
    }

    public chN method_fd03f3e2_Dne(double d, double d2, double d3, double d4) {
        int n;
        int n2;
        int n3;
        int n4 = geR.method_117d0718_FWm(d);
        if (Oaf.method_3036b9d3_FWm(this.field_36c4f18_Dne, n4, (n3 = geR.method_117d0718_FWm(d2)) - 1, n2 = geR.method_117d0718_FWm(d3))) {
            --n3;
        }
        if (!Oaf.method_ce7f5dad_Dne(n = this.field_36c4f18_Dne.method_2c2cf7bc_Dne(n4, n3, n2))) {
            return null;
        }
        int n5 = this.field_36c4f18_Dne.method_2dee76f_bzF(n4, n3, n2);
        if (((Oaf)zKP.field_8374b848_Dne[n]).method_907a9d25_Qnq()) {
            n5 &= 7;
        }
        d2 = n3;
        if (n5 >= 2 && n5 <= 5) {
            d2 = n3 + 1;
        }
        int[][] nArray = field_ce96d629_Dne[n5];
        double d5 = nArray[1][0] - nArray[0][0];
        double d6 = nArray[1][2] - nArray[0][2];
        double d7 = Math.sqrt(d5 * d5 + d6 * d6);
        if (nArray[0][1] != 0 && geR.method_117d0718_FWm(d += (d5 /= d7) * d4) - n4 == nArray[0][0] && geR.method_117d0718_FWm(d3 += (d6 /= d7) * d4) - n2 == nArray[0][2]) {
            d2 += (double)nArray[0][1];
        } else if (nArray[1][1] != 0 && geR.method_117d0718_FWm(d) - n4 == nArray[1][0] && geR.method_117d0718_FWm(d3) - n2 == nArray[1][2]) {
            d2 += (double)nArray[1][1];
        }
        return this.method_e4505d6c_Dne(d, d2, d3);
    }

    @Override
    public bSp method_9a35aed2_Dne(sMa sMa2) {
        return sMa2.method_7a46289e_Dne() ? sMa2.field_373a3ed_Dne : null;
    }

    public int method_ae128dba_bzF() {
        return this.field_378ab08_Dne.method_ce7f5d9c_Dne(17);
    }

    @Override
    public String method_eecad346_Dne() {
        return this.field_c480ca78_bzF != null ? this.field_c480ca78_bzF : super.method_eecad346_Dne();
    }

    public Ebp(Qnq qnq, double d, double d2, double d3) {
        this(qnq);
        this.method_2961957_bzF(d, d2 + (double)this.field_36b0a6_udO, d3);
        this.field_291868_XHL = 0.0;
        this.field_2a9ad1_Zpi = 0.0;
        this.field_31b811_kGO = 0.0;
        this.field_2d29ef_aFZ = d;
        this.field_388da1_zGp = d2;
        this.field_20b852_DyG = d3;
    }

    public abstract int method_9a443a8c_XHL();

    public String method_d1f1ed87_FWm() {
        return this.field_c480ca78_bzF;
    }

    @Override
    public void method_3e501ff9_Qnq(sMa sMa2) {
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ && sMa2 != this.field_37b45e5_Dne) {
            double d;
            double d2;
            double d3;
            if (sMa2 instanceof FUH && !(sMa2 instanceof FiG) && !(sMa2 instanceof CDE) && this.method_9a443a8c_XHL() == 0 && this.field_291868_XHL * this.field_291868_XHL + this.field_31b811_kGO * this.field_31b811_kGO > 0.01 && this.field_37b45e5_Dne == null && sMa2.field_203511c4_FWm == null) {
                sMa2.method_ad72a713_bzF(this);
            }
            if ((d3 = (d2 = sMa2.field_2f0dd3_div - this.field_2f0dd3_div) * d2 + (d = sMa2.field_334487_mrb - this.field_334487_mrb) * d) >= (double)1.0E-4f) {
                d3 = geR.method_ce7f4ad4_Dne(d3);
                d2 /= d3;
                d /= d3;
                double d4 = 1.0 / d3;
                if (d4 > 1.0) {
                    d4 = 1.0;
                }
                d2 *= d4;
                d *= d4;
                d2 *= (double)0.1f;
                d *= (double)0.1f;
                d2 *= (double)(1.0f - this.field_2569d2_OdI);
                d *= (double)(1.0f - this.field_2569d2_OdI);
                d2 *= 0.5;
                d *= 0.5;
                if (sMa2 instanceof Ebp) {
                    chN chN2;
                    double d5 = sMa2.field_2f0dd3_div - this.field_2f0dd3_div;
                    double d6 = sMa2.field_334487_mrb - this.field_334487_mrb;
                    chN chN3 = this.field_36c4f18_Dne.method_23186a47_Dne().method_e4505d6c_Dne(d5, 0.0, d6).method_230df162_Dne();
                    double d7 = Math.abs(chN3.method_a1a425ac_Dne(chN2 = this.field_36c4f18_Dne.method_23186a47_Dne().method_e4505d6c_Dne(geR.method_117d0e97_FWm(this.field_334489_mrb * (float)Math.PI / 180.0f), 0.0, geR.method_ce7f5256_Dne(this.field_334489_mrb * (float)Math.PI / 180.0f)).method_230df162_Dne()));
                    if (d7 < (double)0.8f) {
                        return;
                    }
                    double d8 = sMa2.field_291868_XHL + this.field_291868_XHL;
                    double d9 = sMa2.field_31b811_kGO + this.field_31b811_kGO;
                    if (((Ebp)sMa2).method_9a443a8c_XHL() == 2 && this.method_9a443a8c_XHL() != 2) {
                        this.field_291868_XHL *= (double)0.2f;
                        this.field_31b811_kGO *= (double)0.2f;
                        this.method_2e2893bd_Qnq(sMa2.field_291868_XHL - d2, 0.0, sMa2.field_31b811_kGO - d);
                        sMa2.field_291868_XHL *= (double)0.95f;
                        sMa2.field_31b811_kGO *= (double)0.95f;
                    } else if (((Ebp)sMa2).method_9a443a8c_XHL() != 2 && this.method_9a443a8c_XHL() == 2) {
                        sMa2.field_291868_XHL *= (double)0.2f;
                        sMa2.field_31b811_kGO *= (double)0.2f;
                        sMa2.method_2e2893bd_Qnq(this.field_291868_XHL + d2, 0.0, this.field_31b811_kGO + d);
                        this.field_291868_XHL *= (double)0.95f;
                        this.field_31b811_kGO *= (double)0.95f;
                    } else {
                        this.field_291868_XHL *= (double)0.2f;
                        this.field_31b811_kGO *= (double)0.2f;
                        this.method_2e2893bd_Qnq((d8 /= 2.0) - d2, 0.0, (d9 /= 2.0) - d);
                        sMa2.field_291868_XHL *= (double)0.2f;
                        sMa2.field_31b811_kGO *= (double)0.2f;
                        sMa2.method_2e2893bd_Qnq(d8 + d2, 0.0, d9 + d);
                    }
                } else {
                    this.method_2e2893bd_Qnq(-d2, 0.0, -d);
                    sMa2.method_2e2893bd_Qnq(d2 / 4.0, 0.0, d / 4.0);
                }
            }
        }
    }

    public int method_baa393f5_kGO() {
        return 0;
    }

    public void method_4e07f70b_mrb(int n) {
        this.method_23123967_Dne().method_62ca2346_FWm(21, n);
        this.method_117d59bb_FWm(true);
    }

    @Override
    protected void method_66a36cd8_FWm(WkD wkD) {
        if (wkD.method_110c4dc7_FWm("CustomDisplayTile")) {
            this.method_63ae1a3f_div(wkD.method_8f501fd7_Dne("DisplayTile"));
            this.method_ce9279d5_IjH(wkD.method_8f501fd7_Dne("DisplayData"));
            this.method_4e07f70b_mrb(wkD.method_8f501fd7_Dne("DisplayOffset"));
        }
        if (wkD.method_8f501fe8_Dne("CustomName") && wkD.method_39193c_Dne("CustomName").length() > 0) {
            this.field_c480ca78_bzF = wkD.method_39193c_Dne("CustomName");
        }
    }

    @Override
    public double method_a98a064e_aFZ() {
        return (double)this.field_367151_trS * 0.0 - (double)0.3f;
    }

    public void method_143f9e1c_bzF(int n) {
        this.field_378ab08_Dne.method_62ca2346_FWm(18, n);
    }

    public void method_c6daaac1_Dne(zBn zBn2) {
        this.method_5d73f9d_g_();
        NMq nMq = new NMq(dEr.field_79f29743_IYC, 1);
        if (this.field_c480ca78_bzF != null) {
            nMq.method_8f501fe4_Dne(this.field_c480ca78_bzF);
        }
        this.method_2cda29ee_Dne(nMq, 0.0f);
    }
}

