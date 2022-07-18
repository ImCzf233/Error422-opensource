package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public abstract class FUH
extends sMa {
    protected double field_34856d_qLR;
    private iSh field_376d18e_Dne;
    public int field_26818f_RPx = 0;
    public float field_2f0c42_eJi = 0.02f;
    protected double field_1ed012_ATE;
    public int field_2e8486_ceE;
    protected boolean field_215b47_FfS = false;
    private static final float[] field_4a9241f_Qnq;
    public int field_215b36_FfS;
    protected boolean field_212c2c_EyB = true;
    private sMa field_75c313d2_bzF;
    protected float field_383100_yMz = 1.0f;
    public float field_350ae1_rPc;
    protected final pFT field_379ccee_Dne;
    public float field_22c5ff_IjH = 0.0f;
    private EEb field_3663eea_Dne;
    public int field_307847_gnI = -1;
    private NMq[] field_fde07376_FWm;
    private int field_21260d_FWm;
    protected double field_2e5f16_bzF;
    protected FiG field_3673728_Dne = null;
    protected float[] field_4039e07_FWm;
    private float field_2092ab_Dne;
    private NMq[] field_8360c375_Dne;
    public int field_34b601_qXo = 0;
    private static final float[] field_5781700_aFZ;
    public int field_36e4da_vSL = 0;
    public int field_2e5f1b_bzF = 20;
    protected int field_295784_Wwe = 0;
    private static final float[] field_59d86b9_bzF;
    public float field_2592c0_One;
    protected double field_2e8481_ceE;
    public float field_2a7660_ZgS;
    float field_22352b_ICU = 0.0f;
    protected int field_3649f9_tgc = 0;
    protected float field_3649f6_tgc;
    protected float field_34b5fe_qXo;
    private int field_2592c3_One = 0;
    public static final float[] field_3f1c586_Dne;
    public float field_2f0dd5_div;
    public float field_23d93e_LVR;
    public float field_30bcaf_haP;
    public float field_2f0273_eHV = 0.0f;
    private EPE field_36664b2_Dne;
    protected int field_2f0c45_eJi = 0;
    protected float field_307844_gnI;
    private csP field_3748c8c_Dne;
    protected final OKo field_2024ae98_FWm;
    private FUH field_2020b812_FWm = null;
    public int field_1f1789_AgF = 0;
    protected float field_1f1f46_BJH;
    private boolean field_21261e_FWm = false;
    public float field_351225_qrB;
    public boolean field_2569e6_OdI = false;
    protected boolean field_2e8497_ceE = true;
    public int field_2569d5_OdI;
    protected final OKo field_36ae2b9_Dne;
    protected float field_1f1786_AgF = 0.0f;
    public float field_20b33e_EWz;
    protected HashMap<Object, NAx> field_ecf0af5e_Dne;
    protected int field_217c26_Fnk;
    public float field_332a61_mlD;
    protected boolean field_3393ee_oIf = false;
    protected float field_3489ac_qMV = 0.0f;
    protected float field_2eafbe_cot = 0.0f;
    public float field_3393da_oIf = 0.0f;
    public float field_26818c_RPx = 0.0f;
    protected int field_383103_yMz;
    protected float field_212b3f_FYZ;
    private qgb field_37abee0_Dne;
    public int field_3393dd_oIf;
    protected double field_28e7f8_Vxn;
    private KFZ field_368fbed_Dne;
    private FUH field_366ec33_Dne = null;
    private FUH field_75aeba20_bzF;
    private boolean field_36e4eb_vSL = false;
    private float field_21260a_FWm = -1.0f;
    protected float field_2a70af_ZfC;
    protected String field_c480ca78_bzF = "/mob/char.png";
    protected String field_9e60dbde_Qnq = null;
    protected int field_267cf5_Qnq = 0;
    public float field_20b854_DyG;
    protected int field_212c1b_EyB;
    protected int field_28e7fd_Vxn = this.method_7a46288d_Dne();
    public float field_36e4d7_vSL = 0.0f;
    protected float field_217c23_Fnk;
    private bvU field_374240b_Dne;
    private boolean field_2092bf_Dne = true;
    public float field_295781_Wwe = 0.1f;
    protected int field_2eafc1_cot = 0;
    protected float field_2e1df2_cHy = 0.7f;
    private int field_2092ae_Dne = 0;

    public boolean method_9f65f313_ZgS() {
        return this.field_378ab08_Dne.method_2c0e7e17_Dne(5).length() > 0;
    }

    public boolean method_7ac07071_EWz() {
        return this.field_21261e_FWm;
    }

    public chN method_ffc5552e_Dne(float f) {
        if (f == 1.0f) {
            return this.field_36c4f18_Dne.method_23186a47_Dne().method_e4505d6c_Dne(this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb);
        }
        double d = this.field_2d29ef_aFZ + (this.field_2f0dd3_div - this.field_2d29ef_aFZ) * (double)f;
        double d2 = this.field_388da1_zGp + (this.field_22c5fd_IjH - this.field_388da1_zGp) * (double)f;
        double d3 = this.field_20b852_DyG + (this.field_334487_mrb - this.field_20b852_DyG) * (double)f;
        return this.field_36c4f18_Dne.method_23186a47_Dne().method_e4505d6c_Dne(d, d2, d3);
    }

    public boolean method_9b310ff4_Wwe() {
        return false;
    }

    public FUH(Qnq qnq) {
        super(qnq);
        this.field_350ae1_rPc = (float)(Math.random() * (double)0.9f + (double)0.1f);
        this.field_ecf0af5e_Dne = new HashMap();
        this.field_376d18e_Dne = new iSh(0, 0, 0);
        this.field_8360c375_Dne = new NMq[5];
        this.field_4039e07_FWm = new float[5];
        this.field_fde07376_FWm = new NMq[5];
        this.field_379ccee_Dne = new pFT(this);
        this.field_2e5f2c_bzF = true;
        this.field_36ae2b9_Dne = new OKo(qnq != null && qnq.field_365731d_Dne != null ? qnq.field_365731d_Dne : null);
        this.field_2024ae98_FWm = new OKo(qnq != null && qnq.field_365731d_Dne != null ? qnq.field_365731d_Dne : null);
        this.field_374240b_Dne = new bvU(this);
        this.field_3748c8c_Dne = new csP(this);
        this.field_37abee0_Dne = new qgb(this);
        this.field_36664b2_Dne = new EPE(this);
        this.field_368fbed_Dne = new KFZ(this, qnq, this.method_907a9d14_Qnq());
        this.field_3663eea_Dne = new EEb(this);
        this.field_2f0dd5_div = (float)(Math.random() + 1.0) * 0.01f;
        this.method_2961957_bzF(this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb);
        this.field_20b854_DyG = (float)Math.random() * 12398.0f;
        this.field_36e4d7_vSL = this.field_334489_mrb = (float)(Math.random() * Math.PI * 2.0);
        for (int i = 0; i < this.field_4039e07_FWm.length; ++i) {
            this.field_4039e07_FWm[i] = 0.085f;
        }
        this.field_215b33_FfS = 0.5f;
    }

    public int method_c3b4a2c3_ooe() {
        return 4;
    }

    public FUH method_228c813f_bzF() {
        return this.field_75aeba20_bzF;
    }

    public int method_cd4cb3c8_udO() {
        return 40;
    }

    public void method_610df1e1_bzF(FUH fUH) {
        this.field_366ec33_Dne = fUH;
        this.field_2092ae_Dne = this.field_366ec33_Dne != null ? 100 : 0;
    }

    protected String method_3c9d12fd_DyG() {
        return "damage.hit";
    }

    @Override
    public chN method_230df162_Dne() {
        return this.method_d91908ef_FWm(1.0f);
    }

    public static int method_7c61cf08_Dne(NMq nMq) {
        if (nMq.field_2e5f1b_bzF != zKP.field_32158d62_aJO.field_21260d_FWm && nMq.field_2e5f1b_bzF != dEr.field_e405241a_mfU.field_267cf5_Qnq) {
            if (nMq.method_230de6ba_Dne() instanceof qoi_0) {
                switch (((qoi_0)nMq.method_230de6ba_Dne()).field_2092ae_Dne) {
                    case 0: {
                        return 4;
                    }
                    case 1: {
                        return 3;
                    }
                    case 2: {
                        return 2;
                    }
                    case 3: {
                        return 1;
                    }
                }
            }
            return 0;
        }
        return 4;
    }

    protected void method_c011aad0_mlD() {
    }

    private float method_2c0148d6_Dne(float f, float f2, float f3) {
        float f4 = geR.method_87b72d50_aFZ(f2 - f);
        if (f4 > f3) {
            f4 = f3;
        }
        if (f4 < -f3) {
            f4 = -f3;
        }
        return f + f4;
    }

    public float method_d44b4582_zGp() {
        return this.field_21260a_FWm;
    }

    @Override
    public void method_7a46289a_Dne() {
        super.method_7a46289a_Dne();
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ) {
            int n;
            for (n = 0; n < 5; ++n) {
                NMq nMq = this.method_9e6e1a08_Dne(n);
                if (NMq.method_68dd7a5d_FWm(nMq, this.field_fde07376_FWm[n])) continue;
                ((RAN)this.field_36c4f18_Dne).method_230e0484_Dne().method_e9ca0fc6_Dne(this, new qHm(this.field_2d29f4_aFZ, n, nMq));
                this.field_fde07376_FWm[n] = nMq == null ? null : nMq.method_23040479_Dne();
            }
            n = this.method_cc5ef5b3_trS();
            if (n > 0) {
                if (this.field_34b601_qXo <= 0) {
                    this.field_34b601_qXo = 20 * (30 - n);
                }
                --this.field_34b601_qXo;
                if (this.field_34b601_qXo <= 0) {
                    this.method_5dea8481_Zpi(n - 1);
                }
            }
        }
        this.method_8288d6ee_IjH();
        double d = this.field_2f0dd3_div - this.field_2d29ef_aFZ;
        double d2 = this.field_334487_mrb - this.field_20b852_DyG;
        float f = (float)(d * d + d2 * d2);
        float f2 = this.field_22c5ff_IjH;
        float f3 = 0.0f;
        this.field_217c23_Fnk = this.field_307844_gnI;
        float f4 = 0.0f;
        if (f > 0.0025000002f) {
            f4 = 1.0f;
            f3 = (float)Math.sqrt(f) * 3.0f;
            f2 = (float)Math.atan2(d2, d) * 180.0f / (float)Math.PI - 90.0f;
        }
        if (this.field_2a7660_ZgS > 0.0f) {
            f2 = this.field_334489_mrb;
        }
        if (!this.field_2d2a05_aFZ) {
            f4 = 0.0f;
        }
        this.field_307844_gnI += (f4 - this.field_307844_gnI) * 0.3f;
        this.field_36c4f18_Dne.field_365731d_Dne.method_8f501fe4_Dne("headTurn");
        if (this.method_cbcb3929_tgc()) {
            this.field_36664b2_Dne.method_7a46289a_Dne();
        } else {
            boolean bl;
            float f5 = geR.method_87b72d50_aFZ(f2 - this.field_22c5ff_IjH);
            this.field_22c5ff_IjH += f5 * 0.3f;
            float f6 = geR.method_87b72d50_aFZ(this.field_334489_mrb - this.field_22c5ff_IjH);
            boolean bl2 = bl = f6 < -90.0f || f6 >= 90.0f;
            if (f6 < -75.0f) {
                f6 = -75.0f;
            }
            if (f6 >= 75.0f) {
                f6 = 75.0f;
            }
            this.field_22c5ff_IjH = this.field_334489_mrb - f6;
            if (f6 * f6 > 2500.0f) {
                this.field_22c5ff_IjH += f6 * 0.2f;
            }
            if (bl) {
                f3 *= -1.0f;
            }
        }
        this.field_36c4f18_Dne.field_365731d_Dne.method_7c6f6039_FWm();
        this.field_36c4f18_Dne.field_365731d_Dne.method_8f501fe4_Dne("rangeChecks");
        while (this.field_334489_mrb - this.field_2a9ad3_Zpi < -180.0f) {
            this.field_2a9ad3_Zpi -= 360.0f;
        }
        while (this.field_334489_mrb - this.field_2a9ad3_Zpi >= 180.0f) {
            this.field_2a9ad3_Zpi += 360.0f;
        }
        while (this.field_22c5ff_IjH - this.field_3393da_oIf < -180.0f) {
            this.field_3393da_oIf -= 360.0f;
        }
        while (this.field_22c5ff_IjH - this.field_3393da_oIf >= 180.0f) {
            this.field_3393da_oIf += 360.0f;
        }
        while (this.field_29186a_XHL - this.field_31b813_kGO < -180.0f) {
            this.field_31b813_kGO -= 360.0f;
        }
        while (this.field_29186a_XHL - this.field_31b813_kGO >= 180.0f) {
            this.field_31b813_kGO += 360.0f;
        }
        while (this.field_36e4d7_vSL - this.field_26818c_RPx < -180.0f) {
            this.field_26818c_RPx -= 360.0f;
        }
        while (this.field_36e4d7_vSL - this.field_26818c_RPx >= 180.0f) {
            this.field_26818c_RPx += 360.0f;
        }
        this.field_36c4f18_Dne.field_365731d_Dne.method_7c6f6039_FWm();
        this.field_3649f6_tgc += f3;
    }

    public void method_9b310ff0_Wwe() {
        for (int i = 0; i < 20; ++i) {
            double d = this.field_7331eae7_Dne.nextGaussian() * 0.02;
            double d2 = this.field_7331eae7_Dne.nextGaussian() * 0.02;
            double d3 = this.field_7331eae7_Dne.nextGaussian() * 0.02;
            double d4 = 10.0;
            this.field_36c4f18_Dne.method_8600ec24_Dne("explode", this.field_2f0dd3_div + (double)(this.field_7331eae7_Dne.nextFloat() * this.field_342261_ooe * 2.0f) - (double)this.field_342261_ooe - d * d4, this.field_22c5fd_IjH + (double)(this.field_7331eae7_Dne.nextFloat() * this.field_367151_trS) - d2 * d4, this.field_334487_mrb + (double)(this.field_7331eae7_Dne.nextFloat() * this.field_342261_ooe * 2.0f) - (double)this.field_342261_ooe - d3 * d4, d, d2, d3);
        }
    }

    @Override
    protected void method_7d36ef22_FfS() {
        this.method_147b2066_Dne(zBn.field_5ceb61a_IjH, 4);
    }

    protected int method_baa393f5_kGO() {
        return 0;
    }

    protected void method_b077c662_eHV() {
        ++this.field_295784_Wwe;
        this.field_36c4f18_Dne.field_365731d_Dne.method_8f501fe4_Dne("checkDespawn");
        this.method_9f65f30f_ZgS();
        this.field_36c4f18_Dne.field_365731d_Dne.method_7c6f6039_FWm();
        this.field_36c4f18_Dne.field_365731d_Dne.method_8f501fe4_Dne("sensing");
        this.field_3663eea_Dne.method_7a46289a_Dne();
        this.field_36c4f18_Dne.field_365731d_Dne.method_7c6f6039_FWm();
        this.field_36c4f18_Dne.field_365731d_Dne.method_8f501fe4_Dne("targetSelector");
        this.field_2024ae98_FWm.method_7a46289a_Dne();
        this.field_36c4f18_Dne.field_365731d_Dne.method_7c6f6039_FWm();
        this.field_36c4f18_Dne.field_365731d_Dne.method_8f501fe4_Dne("goalSelector");
        this.field_36ae2b9_Dne.method_7a46289a_Dne();
        this.field_36c4f18_Dne.field_365731d_Dne.method_7c6f6039_FWm();
        this.field_36c4f18_Dne.field_365731d_Dne.method_8f501fe4_Dne("navigation");
        this.field_368fbed_Dne.method_7a46289a_Dne();
        this.field_36c4f18_Dne.field_365731d_Dne.method_7c6f6039_FWm();
        this.field_36c4f18_Dne.field_365731d_Dne.method_8f501fe4_Dne("mob tick");
        this.method_c011aad0_mlD();
        this.field_36c4f18_Dne.field_365731d_Dne.method_7c6f6039_FWm();
        this.field_36c4f18_Dne.field_365731d_Dne.method_8f501fe4_Dne("controls");
        this.field_36c4f18_Dne.field_365731d_Dne.method_8f501fe4_Dne("move");
        this.field_3748c8c_Dne.method_7a46289a_Dne();
        this.field_36c4f18_Dne.field_365731d_Dne.method_110c4dc3_FWm("look");
        this.field_374240b_Dne.method_7a46289a_Dne();
        this.field_36c4f18_Dne.field_365731d_Dne.method_110c4dc3_FWm("jump");
        this.field_37abee0_Dne.method_7c6f6039_FWm();
        this.field_36c4f18_Dne.field_365731d_Dne.method_7c6f6039_FWm();
        this.field_36c4f18_Dne.field_365731d_Dne.method_7c6f6039_FWm();
    }

    public void method_80692b1a_ICU() {
    }

    public int method_9feec6b5_Zpi() {
        int n = 0;
        for (NMq nMq : this.method_56f900f6_Dne()) {
            if (nMq == null || !(nMq.method_230de6ba_Dne() instanceof qoi_0)) continue;
            int n2 = ((qoi_0)nMq.method_230de6ba_Dne()).field_21260d_FWm;
            n += n2;
        }
        return n;
    }

    public chN method_d91908ef_FWm(float f) {
        if (f == 1.0f) {
            float f2 = geR.method_117d0e97_FWm(-this.field_334489_mrb * ((float)Math.PI / 180) - (float)Math.PI);
            float f3 = geR.method_ce7f5256_Dne(-this.field_334489_mrb * ((float)Math.PI / 180) - (float)Math.PI);
            float f4 = -geR.method_117d0e97_FWm(-this.field_29186a_XHL * ((float)Math.PI / 180));
            float f5 = geR.method_ce7f5256_Dne(-this.field_29186a_XHL * ((float)Math.PI / 180));
            return this.field_36c4f18_Dne.method_23186a47_Dne().method_e4505d6c_Dne(f3 * f4, f5, f2 * f4);
        }
        float f6 = this.field_31b813_kGO + (this.field_29186a_XHL - this.field_31b813_kGO) * f;
        float f7 = this.field_2a9ad3_Zpi + (this.field_334489_mrb - this.field_2a9ad3_Zpi) * f;
        float f8 = geR.method_117d0e97_FWm(-f7 * ((float)Math.PI / 180) - (float)Math.PI);
        float f9 = geR.method_ce7f5256_Dne(-f7 * ((float)Math.PI / 180) - (float)Math.PI);
        float f10 = -geR.method_117d0e97_FWm(-f6 * ((float)Math.PI / 180));
        float f11 = geR.method_ce7f5256_Dne(-f6 * ((float)Math.PI / 180));
        return this.field_36c4f18_Dne.method_23186a47_Dne().method_e4505d6c_Dne(f9 * f10, f11, f8 * f10);
    }

    public final void method_5dea8481_Zpi(int n) {
        this.field_378ab08_Dne.method_62ca2346_FWm(10, (byte)n);
    }

    public aYc method_230cd2e0_Dne() {
        return aYc.field_3734481_Dne;
    }

    protected void method_b09c9871_eJi() {
        List list = this.field_36c4f18_Dne.method_71df22e6_FWm(this, this.field_373a3ed_Dne.method_b78565d7_FWm(0.2f, 0.0, 0.2f));
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); ++i) {
                sMa sMa2 = (sMa)list.get(i);
                if (!sMa2.method_7a46289e_Dne()) continue;
                this.method_6b3059b6_div(sMa2);
            }
        }
    }

    public void method_d2ef85af_yMz() {
        String string = this.method_a174454e_zGp();
        if (string != null) {
            this.method_fbd4aee4_Dne(string, this.method_b0a28134_div(), this.method_7ad387f3_DyG());
        }
    }

    public float method_8288d6de_IjH() {
        return 1.0f;
    }

    public boolean method_3e501ffd_Qnq(sMa sMa2) {
        return this.field_36c4f18_Dne.method_38be674_Dne(this.field_36c4f18_Dne.method_23186a47_Dne().method_e4505d6c_Dne(this.field_2f0dd3_div, this.field_22c5fd_IjH + (double)this.method_59ee189_c_(), this.field_334487_mrb), this.field_36c4f18_Dne.method_23186a47_Dne().method_e4505d6c_Dne(sMa2.field_2f0dd3_div, sMa2.field_22c5fd_IjH + (double)sMa2.method_59ee189_c_(), sMa2.field_334487_mrb)) == null;
    }

    public boolean method_b5f30bf7_gnI() {
        return false;
    }

    private int method_ae128dba_bzF() {
        return this.method_857f23ec_Dne(SXd.field_5e565274_Qnq) ? 6 - (1 + this.method_a7927c94_Dne(SXd.field_5e565274_Qnq).method_ae128dba_bzF()) * 1 : (this.method_857f23ec_Dne(SXd.field_713067f3_aFZ) ? 6 + (1 + this.method_a7927c94_Dne(SXd.field_713067f3_aFZ).method_ae128dba_bzF()) * 2 : 6);
    }

    public boolean method_7bbbe3a6_Dne(NAx nAx) {
        int n;
        return this.method_230cd2e0_Dne() != aYc.field_202d1060_FWm || (n = nAx.method_7a46288d_Dne()) != SXd.field_1c2e71ec_XHL.field_2092ae_Dne && n != SXd.field_84fe2985_ceE.field_2092ae_Dne;
    }

    protected void method_550f9763_FWm(NAx nAx) {
        this.field_2092bf_Dne = true;
    }

    public boolean method_5fce35e7_Dne(Class clazz) {
        return gls.class != clazz && VAd.class != clazz;
    }

    @Override
    public void method_ce109fc6_vSL() {
        super.method_ce109fc6_vSL();
        this.field_217c23_Fnk = this.field_307844_gnI;
        this.field_307844_gnI = 0.0f;
        this.field_2e8483_ceE = 0.0f;
    }

    public void method_a663d9a5_FWm(double d, double d2, double d3) {
        this.method_9ce0fc65_FWm(d, d2, d3, this.field_334489_mrb, this.field_29186a_XHL);
    }

    @Override
    public boolean method_cd4cb3d9_udO() {
        return !this.field_2a9ae7_Zpi && this.field_28e7fd_Vxn > 0;
    }

    @Override
    public int method_7c6f602c_FWm() {
        if (this.method_228c813f_bzF() == null) {
            return 3;
        }
        int n = (int)((float)this.field_28e7fd_Vxn - (float)this.method_7a46288d_Dne() * 0.33f);
        if ((n -= (3 - this.field_36c4f18_Dne.field_2d29f4_aFZ) * 4) < 0) {
            n = 0;
        }
        return n + 3;
    }

    @Override
    protected void method_7c6f6039_FWm() {
        this.field_378ab08_Dne.method_ad009545_Dne(8, this.field_21260d_FWm);
        this.field_378ab08_Dne.method_ad009545_Dne(9, (byte)0);
        this.field_378ab08_Dne.method_ad009545_Dne(10, (byte)0);
        this.field_378ab08_Dne.method_ad009545_Dne(6, (byte)0);
        this.field_378ab08_Dne.method_ad009545_Dne(5, "");
    }

    public void method_b43d9ee3_Dne(sMa sMa2, int n) {
        if (!sMa2.field_2a9ae7_Zpi && !this.field_36c4f18_Dne.field_2d2a05_aFZ) {
            clp clp2 = ((RAN)this.field_36c4f18_Dne).method_230e0484_Dne();
            if (sMa2 instanceof JiM) {
                clp2.method_e9ca0fc6_Dne(sMa2, new liE(sMa2.field_2d29f4_aFZ, this.field_2d29f4_aFZ));
            }
            if (sMa2 instanceof hhc) {
                clp2.method_e9ca0fc6_Dne(sMa2, new liE(sMa2.field_2d29f4_aFZ, this.field_2d29f4_aFZ));
            }
            if (sMa2 instanceof alg) {
                clp2.method_e9ca0fc6_Dne(sMa2, new liE(sMa2.field_2d29f4_aFZ, this.field_2d29f4_aFZ));
            }
        }
    }

    public void method_486cd6af_FWm(FUH fUH) {
        this.field_75aeba20_bzF = fUH;
    }

    public void method_df9e2b31_DyG(boolean bl) {
        this.field_378ab08_Dne.method_62ca2346_FWm(6, (byte)(bl ? 1 : 0));
    }

    public boolean method_8d0b7773_One() {
        return false;
    }

    public gDn method_cb99838e_Dne(NMq nMq, int n) {
        return nMq.method_230f3f9a_Dne();
    }

    protected boolean method_907a9d25_Qnq() {
        return !this.field_36c4f18_Dne.field_2d2a05_aFZ;
    }

    public void method_b6f3e19e_haP() {
        Iterator iterator = this.field_ecf0af5e_Dne.keySet().iterator();
        while (iterator.hasNext()) {
            Integer n = (Integer)iterator.next();
            NAx nAx = (NAx)this.field_ecf0af5e_Dne.get(n);
            if (this.field_36c4f18_Dne.field_2d2a05_aFZ) continue;
            iterator.remove();
            this.method_6db0b295_bzF(nAx);
        }
    }

    public int method_9a443a8c_XHL() {
        return this.field_28e7fd_Vxn;
    }

    public NMq method_23040479_Dne() {
        return this.field_8360c375_Dne[0];
    }

    public boolean method_c011aad4_mlD() {
        return this.method_b077c666_eHV();
    }

    protected void method_7ac0706d_EWz() {
        int n = this.method_ae128dba_bzF();
        if (this.field_2569e6_OdI) {
            ++this.field_1f1789_AgF;
            if (this.field_1f1789_AgF >= n) {
                this.field_1f1789_AgF = 0;
                this.field_2569e6_OdI = false;
            }
        } else {
            this.field_1f1789_AgF = 0;
        }
        this.field_2a7660_ZgS = (float)this.field_1f1789_AgF / (float)n;
    }

    public final int method_cc5ef5b3_trS() {
        return this.field_378ab08_Dne.method_ce7f5d95_Dne(10);
    }

    public boolean method_b09c9875_eJi() {
        return this.method_230cd2e0_Dne() == aYc.field_202d1060_FWm;
    }

    public qgb method_23144d3f_Dne() {
        return this.field_37abee0_Dne;
    }

    public void method_5c54d0e1_Qnq(float f, float f2) {
        float f3;
        double d;
        if (!(!this.method_9feec6c6_Zpi() || this instanceof FiG && ((FiG)this).field_37cb681_Dne.field_21261e_FWm)) {
            d = this.field_22c5fd_IjH;
            this.method_a680f8e7_FWm(f, f2, this.method_cbcb3929_tgc() ? 0.04f : 0.02f);
            this.method_2be429a4_Dne(this.field_291868_XHL, this.field_2a9ad1_Zpi, this.field_31b811_kGO);
            this.field_291868_XHL *= (double)0.8f;
            this.field_2a9ad1_Zpi *= (double)0.8f;
            this.field_31b811_kGO *= (double)0.8f;
            this.field_2a9ad1_Zpi -= 0.02;
            if (this.field_388db7_zGp && this.method_a663d9a9_FWm(this.field_291868_XHL, this.field_2a9ad1_Zpi + (double)0.6f - this.field_22c5fd_IjH + d, this.field_31b811_kGO)) {
                this.field_2a9ad1_Zpi = 0.3f;
            }
        } else if (!(!this.method_7ad38807_DyG() || this instanceof FiG && ((FiG)this).field_37cb681_Dne.field_21261e_FWm)) {
            d = this.field_22c5fd_IjH;
            this.method_a680f8e7_FWm(f, f2, 0.02f);
            this.method_2be429a4_Dne(this.field_291868_XHL, this.field_2a9ad1_Zpi, this.field_31b811_kGO);
            this.field_291868_XHL *= 0.5;
            this.field_2a9ad1_Zpi *= 0.5;
            this.field_31b811_kGO *= 0.5;
            this.field_2a9ad1_Zpi -= 0.02;
            if (this.field_388db7_zGp && this.method_a663d9a9_FWm(this.field_291868_XHL, this.field_2a9ad1_Zpi + (double)0.6f - this.field_22c5fd_IjH + d, this.field_31b811_kGO)) {
                this.field_2a9ad1_Zpi = 0.3f;
            }
        } else {
            float f4 = 0.91f;
            if (this.field_2d2a05_aFZ) {
                f4 = 0.54600006f;
                int n = this.field_36c4f18_Dne.method_2c2cf7bc_Dne(geR.method_117d0718_FWm(this.field_2f0dd3_div), geR.method_117d0718_FWm(this.field_373a3ed_Dne.field_212608_FWm) - 1, geR.method_117d0718_FWm(this.field_334487_mrb));
                if (n > 0) {
                    f4 = zKP.field_8374b848_Dne[n].field_267cf2_Qnq * 0.91f;
                }
            }
            float f5 = 0.16277136f / (f4 * f4 * f4);
            if (this.field_2d2a05_aFZ) {
                f3 = this.method_cbcb3929_tgc() ? this.method_ae128db7_bzF() : this.field_295781_Wwe;
                f3 *= f5;
            } else {
                f3 = this.field_2f0c42_eJi;
            }
            this.method_a680f8e7_FWm(f, f2, f3);
            f4 = 0.91f;
            if (this.field_2d2a05_aFZ) {
                f4 = 0.54600006f;
                int n = this.field_36c4f18_Dne.method_2c2cf7bc_Dne(geR.method_117d0718_FWm(this.field_2f0dd3_div), geR.method_117d0718_FWm(this.field_373a3ed_Dne.field_212608_FWm) - 1, geR.method_117d0718_FWm(this.field_334487_mrb));
                if (n > 0) {
                    f4 = zKP.field_8374b848_Dne[n].field_267cf2_Qnq * 0.91f;
                }
            }
            if (this.method_b0a28148_div()) {
                boolean bl;
                float f6 = 0.15f;
                if (this.field_291868_XHL < (double)(-f6)) {
                    this.field_291868_XHL = -f6;
                }
                if (this.field_291868_XHL > (double)f6) {
                    this.field_291868_XHL = f6;
                }
                if (this.field_31b811_kGO < (double)(-f6)) {
                    this.field_31b811_kGO = -f6;
                }
                if (this.field_31b811_kGO > (double)f6) {
                    this.field_31b811_kGO = f6;
                }
                this.field_2e8483_ceE = 0.0f;
                if (this.field_2a9ad1_Zpi < -0.15) {
                    this.field_2a9ad1_Zpi = -0.15;
                }
                boolean bl2 = bl = this.method_a98a0664_aFZ() && this instanceof FiG;
                if (bl && this.field_2a9ad1_Zpi < 0.0) {
                    this.field_2a9ad1_Zpi = 0.0;
                }
            }
            this.method_2be429a4_Dne(this.field_291868_XHL, this.field_2a9ad1_Zpi, this.field_31b811_kGO);
            if (this.field_388db7_zGp && this.method_b0a28148_div()) {
                this.field_2a9ad1_Zpi = 0.2;
            }
            this.field_2a9ad1_Zpi = !(!this.field_36c4f18_Dne.field_2d2a05_aFZ || this.field_36c4f18_Dne.method_2dee780_bzF((int)this.field_2f0dd3_div, 0, (int)this.field_334487_mrb) && this.field_36c4f18_Dne.method_90569c11_Dne((int)((int)this.field_2f0dd3_div), (int)((int)this.field_334487_mrb)).field_21261e_FWm) ? (this.field_22c5fd_IjH > 0.0 ? -0.1 : 0.0) : (this.field_2a9ad1_Zpi -= 0.08);
            this.field_2a9ad1_Zpi *= (double)0.98f;
            this.field_291868_XHL *= (double)f4;
            this.field_31b811_kGO *= (double)f4;
        }
        this.field_30bcaf_haP = this.field_351225_qrB;
        d = this.field_2f0dd3_div - this.field_2d29ef_aFZ;
        double d2 = this.field_334487_mrb - this.field_20b852_DyG;
        f3 = geR.method_ce7f4ad4_Dne(d * d + d2 * d2) * 4.0f;
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        this.field_351225_qrB += (f3 - this.field_351225_qrB) * 0.4f;
        this.field_23d93e_LVR += this.field_351225_qrB;
    }

    @Override
    public void method_117d0ea7_FWm(float f) {
        this.field_36e4d7_vSL = f;
    }

    protected void method_6b3059b6_div(sMa sMa2) {
        sMa2.method_3e501ff9_Qnq(this);
    }

    public FUH method_23007a92_Dne() {
        return this.field_366ec33_Dne;
    }

    public boolean method_ce109fca_vSL() {
        return this.method_2c2cf7cd_Dne(geR.method_117d0718_FWm(this.field_2f0dd3_div), geR.method_117d0718_FWm(this.field_22c5fd_IjH), geR.method_117d0718_FWm(this.field_334487_mrb));
    }

    @Override
    public boolean method_baa39406_kGO() {
        return !this.field_2a9ae7_Zpi;
    }

    @Override
    public float method_59ee189_c_() {
        return this.field_367151_trS * 0.85f;
    }

    protected boolean method_cbcb3929_tgc() {
        return false;
    }

    public void method_63ae5a10_div(boolean bl) {
        this.field_21261e_FWm = bl;
    }

    @Override
    public void method_ce7f4362_Dne(byte by) {
        if (by == 2) {
            this.field_351225_qrB = 1.5f;
            this.field_2f0dd8_div = this.field_2e5f1b_bzF;
            this.field_3393dd_oIf = 10;
            this.field_2569d5_OdI = 10;
            this.field_2f0273_eHV = 0.0f;
            this.method_fbd4aee4_Dne(this.method_3c9d12fd_DyG(), this.method_b0a28134_div(), (this.field_7331eae7_Dne.nextFloat() - this.field_7331eae7_Dne.nextFloat()) * 0.2f + 1.0f);
            this.method_147b2066_Dne(zBn.field_7508dfa4_mrb, 0);
        } else if (by == 3) {
            this.method_fbd4aee4_Dne(this.method_6a89a3dc_div(), this.method_b0a28134_div(), (this.field_7331eae7_Dne.nextFloat() - this.field_7331eae7_Dne.nextFloat()) * 0.2f + 1.0f);
            this.field_28e7fd_Vxn = 0;
            this.method_c6daaac1_Dne(zBn.field_7508dfa4_mrb);
        } else {
            super.method_ce7f4362_Dne(by);
        }
    }

    public void method_b51e1f82_zGp(boolean bl) {
        this.field_3393ee_oIf = bl;
    }

    public boolean method_af414cf1_cot() {
        return this.field_36c4f18_Dne.method_9ed6d42c_Dne(this.field_373a3ed_Dne) && this.field_36c4f18_Dne.method_d11d9a5_Dne(this, this.field_373a3ed_Dne).isEmpty() && !this.field_36c4f18_Dne.method_90cba31f_bzF(this.field_373a3ed_Dne);
    }

    public NAx method_a7927c94_Dne(SXd sXd) {
        return (NAx)this.field_ecf0af5e_Dne.get(sXd.field_2092ae_Dne);
    }

    protected int method_70328496_Dne(FiG fiG) {
        if (this.field_217c26_Fnk > 0) {
            int n = this.field_217c26_Fnk;
            NMq[] nMqArray = this.method_56f900f6_Dne();
            for (int i = 0; i < nMqArray.length; ++i) {
                if (nMqArray[i] == null || !(this.field_4039e07_FWm[i] <= 1.0f)) continue;
                n += 1 + this.field_7331eae7_Dne.nextInt(3);
            }
            return n;
        }
        return this.field_217c26_Fnk;
    }

    public EEb method_22ffcd49_Dne() {
        return this.field_3663eea_Dne;
    }

    public void method_74b6e2b5_AgF() {
        this.field_21260a_FWm = -1.0f;
    }

    public boolean method_8288d6f2_IjH() {
        return false;
    }

    @Override
    public float method_a98a0650_aFZ() {
        return this.field_36e4d7_vSL;
    }

    protected void method_1e2e50a8_FWm(boolean bl, int n) {
        for (int i = 0; i < this.method_56f900f6_Dne().length; ++i) {
            boolean bl2;
            NMq nMq = this.method_9e6e1a08_Dne(i);
            boolean bl3 = bl2 = this.field_4039e07_FWm[i] > 1.0f;
            if (nMq == null || !bl && !bl2 || !(this.field_7331eae7_Dne.nextFloat() - (float)n * 0.01f < this.field_4039e07_FWm[i])) continue;
            if (!bl2 && nMq.method_7c6f603d_FWm()) {
                int n2 = Math.max(nMq.method_a98a0653_aFZ() - 25, 1);
                int n3 = nMq.method_a98a0653_aFZ() - this.field_7331eae7_Dne.nextInt(this.field_7331eae7_Dne.nextInt(n2) + 1);
                if (n3 > n2) {
                    n3 = n2;
                }
                if (n3 < 1) {
                    n3 = 1;
                }
                nMq.method_ce7f5da9_Dne(n3);
            }
            this.method_2cda29ee_Dne(nMq, 0.0f);
        }
    }

    protected boolean method_d2ef85b3_yMz() {
        return true;
    }

    protected int method_907a9d14_Qnq() {
        return 16;
    }

    public void method_a9a920ab_Qnq(String string) {
        this.field_378ab08_Dne.method_62ca2346_FWm(5, string);
    }

    protected void method_6db0b295_bzF(NAx nAx) {
        this.field_2092bf_Dne = true;
    }

    public FUH method_f876cab1_FWm() {
        return this.field_2020b812_FWm;
    }

    protected String method_6a89a3dc_div() {
        return "damage.hit";
    }

    @Override
    public boolean method_147b2066_Dne(zBn zBn2, int n) {
        if (this.method_7c861acb_EyB()) {
            return false;
        }
        if (this.field_36c4f18_Dne.field_2d2a05_aFZ) {
            return false;
        }
        this.field_295784_Wwe = 0;
        if (this.field_28e7fd_Vxn <= 0) {
            return false;
        }
        if (zBn2.method_a98a0664_aFZ() && this.method_857f23ec_Dne(SXd.field_a21d1515_kGO)) {
            return false;
        }
        if ((zBn2 == zBn.field_a22e7e2e_kGO || zBn2 == zBn.field_af0ef541_udO) && this.method_9e6e1a08_Dne(4) != null) {
            this.method_9e6e1a08_Dne(4).method_60f1bf3f_Dne(n * 4 + this.field_7331eae7_Dne.nextInt(n * 2), this);
            n = (int)((float)n * 0.75f);
        }
        this.field_351225_qrB = 1.5f;
        boolean bl = true;
        if ((float)this.field_2f0dd8_div > (float)this.field_2e5f1b_bzF / 2.0f) {
            if (n <= this.field_2eafc1_cot) {
                return false;
            }
            this.method_147b2062_Dne(zBn2, n - this.field_2eafc1_cot);
            this.field_2eafc1_cot = n;
            bl = false;
        } else {
            this.field_2eafc1_cot = n;
            this.field_2e8486_ceE = this.field_28e7fd_Vxn;
            this.field_2f0dd8_div = this.field_2e5f1b_bzF;
            this.method_147b2062_Dne(zBn2, n);
            this.field_3393dd_oIf = 10;
            this.field_2569d5_OdI = 10;
        }
        this.field_2f0273_eHV = 0.0f;
        sMa sMa2 = zBn2.method_f88b2463_FWm();
        if (sMa2 != null) {
            oEB oEB2;
            if (sMa2 instanceof FUH) {
                this.method_610df1e1_bzF((FUH)sMa2);
            }
            if (sMa2 instanceof FiG) {
                this.field_3649f9_tgc = 100;
                this.field_3673728_Dne = (FiG)sMa2;
            } else if (sMa2 instanceof oEB && (oEB2 = (oEB)sMa2).method_86921671_LVR()) {
                this.field_3649f9_tgc = 100;
                this.field_3673728_Dne = null;
            }
        }
        if (bl) {
            this.field_36c4f18_Dne.method_b43d849c_Dne(this, (byte)2);
            if (zBn2 != zBn.field_7141d10c_aFZ) {
                this.method_c19d9a09_oIf();
            }
            if (sMa2 != null) {
                double d = sMa2.field_2f0dd3_div - this.field_2f0dd3_div;
                double d2 = sMa2.field_334487_mrb - this.field_334487_mrb;
                while (d * d + d2 * d2 < 1.0E-4) {
                    d = (Math.random() - Math.random()) * 0.01;
                    d2 = (Math.random() - Math.random()) * 0.01;
                }
                this.field_2f0273_eHV = (float)(Math.atan2(d2, d) * 180.0 / Math.PI) - this.field_334489_mrb;
                this.method_9b5d79e3_Dne(sMa2, n, d, d2);
            } else {
                this.field_2f0273_eHV = (int)(Math.random() * 2.0) * 180;
            }
        }
        if (this.field_28e7fd_Vxn <= 0) {
            if (bl) {
                this.method_fbd4aee4_Dne(this.method_6a89a3dc_div(), this.method_b0a28134_div(), this.method_7ad387f3_DyG());
            }
            this.method_c6daaac1_Dne(zBn2);
        } else if (bl) {
            this.method_fbd4aee4_Dne(this.method_3c9d12fd_DyG(), this.method_b0a28134_div(), this.method_7ad387f3_DyG());
        }
        return true;
    }

    protected String method_a174454e_zGp() {
        return null;
    }

    public boolean method_b077c666_eHV() {
        return this.field_378ab08_Dne.method_ce7f5d95_Dne(6) == 1;
    }

    public csP method_230e1aeb_Dne() {
        return this.field_3748c8c_Dne;
    }

    protected float method_7ad387f3_DyG() {
        return this.method_8288d6f2_IjH() ? (this.field_7331eae7_Dne.nextFloat() - this.field_7331eae7_Dne.nextFloat()) * 0.2f + 1.5f : (this.field_7331eae7_Dne.nextFloat() - this.field_7331eae7_Dne.nextFloat()) * 0.2f + 1.0f;
    }

    @Override
    public String method_6859cdb9_bzF() {
        return this.field_c480ca78_bzF;
    }

    public void method_c6daaac1_Dne(zBn zBn2) {
        sMa sMa2 = zBn2.method_f88b2463_FWm();
        FUH fUH = this.method_69495399_Qnq();
        if (this.field_267cf5_Qnq >= 0 && fUH != null) {
            fUH.method_5606342_FWm(this, this.field_267cf5_Qnq);
        }
        if (sMa2 != null) {
            sMa2.method_6f1922ee_Dne(this);
        }
        this.field_215b47_FfS = true;
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ) {
            int n = 0;
            if (sMa2 instanceof FiG) {
                n = UYp.method_c296f0db_aFZ((FUH)sMa2);
            }
            if (!this.method_8288d6f2_IjH() && this.field_36c4f18_Dne.method_230cbc5a_Dne().method_8f501fe8_Dne("doMobLoot")) {
                int n2;
                this.method_17484c9_Dne(this.field_3649f9_tgc > 0, n);
                this.method_1e2e50a8_FWm(this.field_3649f9_tgc > 0, n);
                if (this.field_3649f9_tgc > 0 && (n2 = this.field_7331eae7_Dne.nextInt(200) - n) < 5) {
                    this.method_ce9279d5_IjH(n2 <= 0 ? 1 : 0);
                }
            }
        }
        this.field_36c4f18_Dne.method_b43d849c_Dne(this, (byte)3);
    }

    public abstract int method_7a46288d_Dne();

    public void method_55b582d6_FWm(NMq nMq) {
        this.method_fbd4aee4_Dne("random.break", 0.8f, 0.8f + this.field_36c4f18_Dne.field_7331eae7_Dne.nextFloat() * 0.4f);
        for (int i = 0; i < 5; ++i) {
            chN chN2 = this.field_36c4f18_Dne.method_23186a47_Dne().method_e4505d6c_Dne(((double)this.field_7331eae7_Dne.nextFloat() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
            chN2.method_ce7f5266_Dne(-this.field_29186a_XHL * (float)Math.PI / 180.0f);
            chN2.method_117d0ea7_FWm(-this.field_334489_mrb * (float)Math.PI / 180.0f);
            chN chN3 = this.field_36c4f18_Dne.method_23186a47_Dne().method_e4505d6c_Dne(((double)this.field_7331eae7_Dne.nextFloat() - 0.5) * 0.3, (double)(-this.field_7331eae7_Dne.nextFloat()) * 0.6 - 0.3, 0.6);
            chN3.method_ce7f5266_Dne(-this.field_29186a_XHL * (float)Math.PI / 180.0f);
            chN3.method_117d0ea7_FWm(-this.field_334489_mrb * (float)Math.PI / 180.0f);
            chN3 = chN3.method_2c4d3b9f_bzF(this.field_2f0dd3_div, this.field_22c5fd_IjH + (double)this.method_59ee189_c_(), this.field_334487_mrb);
            this.field_36c4f18_Dne.method_8600ec24_Dne("iconcrack_" + nMq.method_230de6ba_Dne().field_267cf5_Qnq, chN3.field_2092a9_Dne, chN3.field_212608_FWm, chN3.field_2e5f16_bzF, chN2.field_2092a9_Dne, chN2.field_212608_FWm + 0.05, chN2.field_2e5f16_bzF);
        }
    }

    @Override
    public String method_eecad346_Dne() {
        return this.method_9f65f313_ZgS() ? this.method_da581772_IjH() : super.method_eecad346_Dne();
    }

    protected void method_c71d6b50_rPc() {
        boolean bl;
        Iterator iterator = this.field_ecf0af5e_Dne.keySet().iterator();
        while (iterator.hasNext()) {
            Integer n = (Integer)iterator.next();
            NAx nAx = (NAx)this.field_ecf0af5e_Dne.get(n);
            try {
                if (!nAx.method_6f1922f2_Dne(this)) {
                    if (this.field_36c4f18_Dne.field_2d2a05_aFZ) continue;
                    iterator.remove();
                    this.method_6db0b295_bzF(nAx);
                    continue;
                }
                if (nAx.method_7c6f602c_FWm() % 600 != 0) continue;
                this.method_550f9763_FWm(nAx);
            }
            catch (Throwable throwable) {
                McM mcM = McM.method_948e60df_Dne(throwable, "Ticking mob effect instance");
                Noo noo = mcM.method_284dc627_Dne("Mob effect being ticked");
                noo.method_2aeeb7ad_Dne("Effect Name", new wGA(this, nAx));
                noo.method_2aeeb7ad_Dne("Effect ID", new oqU(this, nAx));
                noo.method_2aeeb7ad_Dne("Effect Duration", new eQQ(this, nAx));
                noo.method_2aeeb7ad_Dne("Effect Amplifier", new uen(this, nAx));
                noo.method_2aeeb7ad_Dne("Effect is Splash", new kuE(this, nAx));
                noo.method_2aeeb7ad_Dne("Effect is Ambient", new obB(this, nAx));
                throw new kaJ(mcM);
            }
        }
        if (this.field_2092bf_Dne) {
            if (!this.field_36c4f18_Dne.field_2d2a05_aFZ) {
                if (this.field_ecf0af5e_Dne.isEmpty()) {
                    this.field_378ab08_Dne.method_62ca2346_FWm(9, (byte)0);
                    this.field_378ab08_Dne.method_62ca2346_FWm(8, 0);
                    this.method_7ed9b9d3_Qnq(false);
                } else {
                    int n = yDZ.method_18d926be_Dne(this.field_ecf0af5e_Dne.values());
                    this.field_378ab08_Dne.method_62ca2346_FWm(9, (byte)(yDZ.method_18d926cf_Dne(this.field_ecf0af5e_Dne.values()) ? 1 : 0));
                    this.field_378ab08_Dne.method_62ca2346_FWm(8, n);
                    this.method_7ed9b9d3_Qnq(this.method_117d19ee_FWm(SXd.field_ab25a863_ooe.field_2092ae_Dne));
                }
            }
            this.field_2092bf_Dne = false;
        }
        int n = this.field_378ab08_Dne.method_ce7f5d9c_Dne(8);
        boolean bl2 = bl = this.field_378ab08_Dne.method_ce7f5d95_Dne(9) > 0;
        if (n > 0) {
            boolean bl3 = false;
            if (!this.method_998e662d_Vxn()) {
                bl3 = this.field_7331eae7_Dne.nextBoolean();
            } else {
                boolean bl4 = bl3 = this.field_7331eae7_Dne.nextInt(15) == 0;
            }
            if (bl) {
                bl3 &= this.field_7331eae7_Dne.nextInt(5) == 0;
            }
            if (bl3 && n > 0) {
                double d = (double)(n >> 16 & 0xFF) / 255.0;
                double d2 = (double)(n >> 8 & 0xFF) / 255.0;
                double d3 = (double)(n >> 0 & 0xFF) / 255.0;
                this.field_36c4f18_Dne.method_8600ec24_Dne(bl ? "mobSpellAmbient" : "mobSpell", this.field_2f0dd3_div + (this.field_7331eae7_Dne.nextDouble() - 0.5) * (double)this.field_342261_ooe, this.field_22c5fd_IjH + this.field_7331eae7_Dne.nextDouble() * (double)this.field_367151_trS - (double)this.field_36b0a6_udO, this.field_334487_mrb + (this.field_7331eae7_Dne.nextDouble() - 0.5) * (double)this.field_342261_ooe, d, d2, d3);
            }
        }
    }

    public bvU method_230db26a_Dne() {
        return this.field_374240b_Dne;
    }

    public float method_c073dae8_mrb() {
        float f = 1.0f;
        if (this.method_857f23ec_Dne(SXd.field_2026af8c_FWm)) {
            f *= 1.0f + 0.2f * (float)(this.method_a7927c94_Dne(SXd.field_2026af8c_FWm).method_ae128dba_bzF() + 1);
        }
        if (this.method_857f23ec_Dne(SXd.field_75b4b19a_bzF)) {
            f *= 1.0f - 0.15f * (float)(this.method_a7927c94_Dne(SXd.field_75b4b19a_bzF).method_ae128dba_bzF() + 1);
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        return f;
    }

    @Override
    public NMq[] method_56f900f6_Dne() {
        return this.field_8360c375_Dne;
    }

    @Override
    public void method_66a36cd8_FWm(WkD wkD) {
        int n;
        mbZ mbZ2;
        this.field_28e7fd_Vxn = wkD.method_8f501fe1_Dne("Health");
        if (!wkD.method_8f501fe8_Dne("Health")) {
            this.field_28e7fd_Vxn = this.method_7a46288d_Dne();
        }
        this.field_2569d5_OdI = wkD.method_8f501fe1_Dne("HurtTime");
        this.field_36e4da_vSL = wkD.method_8f501fe1_Dne("DeathTime");
        this.field_26818f_RPx = wkD.method_8f501fe1_Dne("AttackTime");
        this.method_63ae5a10_div(wkD.method_110c4dc7_FWm("CanPickUpLoot"));
        this.field_36e4eb_vSL = wkD.method_110c4dc7_FWm("PersistenceRequired");
        if (wkD.method_8f501fe8_Dne("CustomName") && wkD.method_39193c_Dne("CustomName").length() > 0) {
            this.method_a9a920ab_Qnq(wkD.method_39193c_Dne("CustomName"));
        }
        this.method_df9e2b31_DyG(wkD.method_110c4dc7_FWm("CustomNameVisible"));
        if (wkD.method_8f501fe8_Dne("Equipment")) {
            mbZ2 = wkD.method_285baa50_Dne("Equipment");
            for (n = 0; n < this.field_8360c375_Dne.length; ++n) {
                this.field_8360c375_Dne[n] = NMq.method_7da70e76_Dne((WkD)mbZ2.method_77d0d055_FWm(n));
            }
        }
        if (wkD.method_8f501fe8_Dne("ActiveEffects")) {
            mbZ2 = wkD.method_285baa50_Dne("ActiveEffects");
            for (n = 0; n < mbZ2.method_7a46288d_Dne(); ++n) {
                WkD wkD2 = (WkD)mbZ2.method_77d0d055_FWm(n);
                NAx nAx = NAx.method_7da6e243_Dne(wkD2);
                this.field_ecf0af5e_Dne.put(nAx.method_7a46288d_Dne(), nAx);
            }
        }
        if (wkD.method_8f501fe8_Dne("DropChances")) {
            mbZ2 = wkD.method_285baa50_Dne("DropChances");
            for (n = 0; n < mbZ2.method_7a46288d_Dne(); ++n) {
                this.field_4039e07_FWm[n] = ((nOv)mbZ2.method_77d0d055_FWm((int)n)).field_2092ab_Dne;
            }
        }
    }

    public void method_ae128dc7_bzF() {
        if (!this.field_2569e6_OdI || this.field_1f1789_AgF >= this.method_ae128dba_bzF() / 2 || this.field_1f1789_AgF < 0) {
            this.field_1f1789_AgF = -1;
            this.field_2569e6_OdI = true;
            if (this.field_36c4f18_Dne instanceof RAN) {
                ((RAN)this.field_36c4f18_Dne).method_230e0484_Dne().method_e9ca0fc6_Dne(this, new UVb(this, 1));
            }
        }
    }

    public Collection<NAx> method_be5f586d_Dne() {
        return this.field_ecf0af5e_Dne.values();
    }

    public void method_daa0b257_DyG(sMa sMa2) {
        if (sMa2 instanceof FUH) {
            this.field_2020b812_FWm = (FUH)sMa2;
        }
    }

    public int method_c073daeb_mrb() {
        return 80;
    }

    public boolean method_74b6e2b9_AgF() {
        return false;
    }

    protected void method_ce9279d5_IjH(int n) {
    }

    public void method_8288d6ee_IjH() {
        if (this.field_2592c3_One > 0) {
            --this.field_2592c3_One;
        }
        if (this.field_383103_yMz > 0) {
            double d = this.field_2f0dd3_div + (this.field_2e5f16_bzF - this.field_2f0dd3_div) / (double)this.field_383103_yMz;
            double d2 = this.field_22c5fd_IjH + (this.field_34856d_qLR - this.field_22c5fd_IjH) / (double)this.field_383103_yMz;
            double d3 = this.field_334487_mrb + (this.field_1ed012_ATE - this.field_334487_mrb) / (double)this.field_383103_yMz;
            double d4 = geR.method_ce7f4ad2_Dne(this.field_28e7f8_Vxn - (double)this.field_334489_mrb);
            this.field_334489_mrb = (float)((double)this.field_334489_mrb + d4 / (double)this.field_383103_yMz);
            this.field_29186a_XHL = (float)((double)this.field_29186a_XHL + (this.field_2e8481_ceE - (double)this.field_29186a_XHL) / (double)this.field_383103_yMz);
            --this.field_383103_yMz;
            this.method_2961957_bzF(d, d2, d3);
            this.method_1e252df9_FWm(this.field_334489_mrb, this.field_29186a_XHL);
        } else if (!this.method_907a9d25_Qnq()) {
            this.field_291868_XHL *= 0.98;
            this.field_2a9ad1_Zpi *= 0.98;
            this.field_31b811_kGO *= 0.98;
        }
        if (Math.abs(this.field_291868_XHL) < 0.005) {
            this.field_291868_XHL = 0.0;
        }
        if (Math.abs(this.field_2a9ad1_Zpi) < 0.005) {
            this.field_2a9ad1_Zpi = 0.0;
        }
        if (Math.abs(this.field_31b811_kGO) < 0.005) {
            this.field_31b811_kGO = 0.0;
        }
        this.field_36c4f18_Dne.field_365731d_Dne.method_8f501fe4_Dne("ai");
        if (this.method_c5dec331_qXo()) {
            this.field_3393ee_oIf = false;
            this.field_2a70af_ZfC = 0.0f;
            this.field_212b3f_FYZ = 0.0f;
            this.field_1f1f46_BJH = 0.0f;
        } else if (this.method_907a9d25_Qnq()) {
            if (this.method_cbcb3929_tgc()) {
                this.field_36c4f18_Dne.field_365731d_Dne.method_8f501fe4_Dne("newAi");
                this.method_b077c662_eHV();
                this.field_36c4f18_Dne.field_365731d_Dne.method_7c6f6039_FWm();
            } else {
                this.field_36c4f18_Dne.field_365731d_Dne.method_8f501fe4_Dne("oldAi");
                this.method_b0a28144_div();
                this.field_36c4f18_Dne.field_365731d_Dne.method_7c6f6039_FWm();
                this.field_36e4d7_vSL = this.field_334489_mrb;
            }
        }
        this.field_36c4f18_Dne.field_365731d_Dne.method_7c6f6039_FWm();
        this.field_36c4f18_Dne.field_365731d_Dne.method_8f501fe4_Dne("jump");
        if (this.field_3393ee_oIf) {
            if (!this.method_9feec6c6_Zpi() && !this.method_7ad38807_DyG()) {
                if (this.field_2d2a05_aFZ && this.field_2592c3_One == 0) {
                    this.method_8d0b776f_One();
                    this.field_2592c3_One = 10;
                }
            } else {
                this.field_2a9ad1_Zpi += (double)0.04f;
            }
        } else {
            this.field_2592c3_One = 0;
        }
        this.field_36c4f18_Dne.field_365731d_Dne.method_7c6f6039_FWm();
        this.field_36c4f18_Dne.field_365731d_Dne.method_8f501fe4_Dne("travel");
        this.field_2a70af_ZfC *= 0.98f;
        this.field_212b3f_FYZ *= 0.98f;
        this.field_1f1f46_BJH *= 0.9f;
        float f = this.field_295781_Wwe;
        this.field_295781_Wwe *= this.method_c073dae8_mrb();
        this.method_5c54d0e1_Qnq(this.field_2a70af_ZfC, this.field_212b3f_FYZ);
        this.field_295781_Wwe = f;
        this.field_36c4f18_Dne.field_365731d_Dne.method_7c6f6039_FWm();
        this.field_36c4f18_Dne.field_365731d_Dne.method_8f501fe4_Dne("push");
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ) {
            this.method_b09c9871_eJi();
        }
        this.field_36c4f18_Dne.field_365731d_Dne.method_7c6f6039_FWm();
        this.field_36c4f18_Dne.field_365731d_Dne.method_8f501fe4_Dne("looting");
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ && this.method_7ac07071_EWz() && !this.field_215b47_FfS && this.field_36c4f18_Dne.method_230cbc5a_Dne().method_8f501fe8_Dne("mobGriefing")) {
            List<JiM> list = this.field_36c4f18_Dne.method_9314b7e8_Dne(JiM.class, this.field_373a3ed_Dne.method_b78565d7_FWm(1.0, 0.0, 1.0));
            for (JiM jiM : list) {
                NMq nMq;
                int n;
                if (jiM.field_2a9ae7_Zpi || jiM.method_23040479_Dne() == null || (n = FUH.method_7c61cf08_Dne(nMq = jiM.method_23040479_Dne())) <= -1) continue;
                boolean bl = true;
                NMq nMq2 = this.method_9e6e1a08_Dne(n);
                if (nMq2 != null) {
                    dEr dEr2;
                    dEr dEr3;
                    if (n == 0) {
                        if (nMq.method_230de6ba_Dne() instanceof uVe && !(nMq2.method_230de6ba_Dne() instanceof uVe)) {
                            bl = true;
                        } else if (nMq.method_230de6ba_Dne() instanceof uVe && nMq2.method_230de6ba_Dne() instanceof uVe) {
                            dEr3 = (uVe)nMq.method_230de6ba_Dne();
                            dEr2 = (uVe)nMq2.method_230de6ba_Dne();
                            bl = ((uVe)dEr3).method_7c6f602c_FWm() == ((uVe)dEr2).method_7c6f602c_FWm() ? nMq.method_907a9d14_Qnq() > nMq2.method_907a9d14_Qnq() || nMq.method_a98a0664_aFZ() && !nMq2.method_a98a0664_aFZ() : ((uVe)dEr3).method_7c6f602c_FWm() > ((uVe)dEr2).method_7c6f602c_FWm();
                        } else {
                            bl = false;
                        }
                    } else if (nMq.method_230de6ba_Dne() instanceof qoi_0 && !(nMq2.method_230de6ba_Dne() instanceof qoi_0)) {
                        bl = true;
                    } else if (nMq.method_230de6ba_Dne() instanceof qoi_0 && nMq2.method_230de6ba_Dne() instanceof qoi_0) {
                        dEr3 = (qoi_0)nMq.method_230de6ba_Dne();
                        dEr2 = (qoi_0)nMq2.method_230de6ba_Dne();
                        bl = ((qoi_0)dEr3).field_21260d_FWm == ((qoi_0)dEr2).field_21260d_FWm ? nMq.method_907a9d14_Qnq() > nMq2.method_907a9d14_Qnq() || nMq.method_a98a0664_aFZ() && !nMq2.method_a98a0664_aFZ() : ((qoi_0)dEr3).field_21260d_FWm > ((qoi_0)dEr2).field_21260d_FWm;
                    } else {
                        bl = false;
                    }
                }
                if (!bl) continue;
                if (nMq2 != null && this.field_7331eae7_Dne.nextFloat() - 0.1f < this.field_4039e07_FWm[n]) {
                    this.method_2cda29ee_Dne(nMq2, 0.0f);
                }
                this.method_19b4c3a3_a_(n, nMq);
                this.field_4039e07_FWm[n] = 2.0f;
                this.field_36e4eb_vSL = true;
                this.method_b43d9ee3_Dne(jiM, 1);
                jiM.method_5d73f9d_g_();
            }
        }
        this.field_36c4f18_Dne.field_365731d_Dne.method_7c6f6039_FWm();
    }

    @Override
    public void method_998e6629_Vxn() {
        boolean bl;
        this.field_2592c0_One = this.field_2a7660_ZgS;
        super.method_998e6629_Vxn();
        this.field_36c4f18_Dne.field_365731d_Dne.method_8f501fe4_Dne("mobBaseTick");
        if (this.method_cd4cb3d9_udO() && this.field_7331eae7_Dne.nextInt(1000) < this.field_215b36_FfS++) {
            this.field_215b36_FfS = -this.method_c073daeb_mrb();
            this.method_d2ef85af_yMz();
        }
        if (this.method_cd4cb3d9_udO() && this.method_c3b4a2d4_ooe()) {
            this.method_147b2066_Dne(zBn.field_5e67bb8d_Qnq, 1);
        }
        if (this.method_c073dafc_mrb() || this.field_36c4f18_Dne.field_2d2a05_aFZ) {
            this.method_7c861ac7_EyB();
        }
        boolean bl2 = bl = this instanceof FiG && ((FiG)this).field_37cb681_Dne.field_2092bf_Dne;
        if (this.method_cd4cb3d9_udO() && this.method_76dab7e2_Dne(KFd.field_1411d34d_div) && !this.method_b5f30bf7_gnI() && !this.field_ecf0af5e_Dne.containsKey(SXd.field_aefd8c28_udO.field_2092ae_Dne) && !bl) {
            this.method_df9deb60_DyG(this.method_ce7f5d9c_Dne(this.method_b0a28137_div()));
            if (this.method_b0a28137_div() == -20) {
                this.method_df9deb60_DyG(0);
                for (int i = 0; i < 8; ++i) {
                    float f = this.field_7331eae7_Dne.nextFloat() - this.field_7331eae7_Dne.nextFloat();
                    float f2 = this.field_7331eae7_Dne.nextFloat() - this.field_7331eae7_Dne.nextFloat();
                    float f3 = this.field_7331eae7_Dne.nextFloat() - this.field_7331eae7_Dne.nextFloat();
                    this.field_36c4f18_Dne.method_8600ec24_Dne("bubble", this.field_2f0dd3_div + (double)f, this.field_22c5fd_IjH + (double)f2, this.field_334487_mrb + (double)f3, this.field_291868_XHL, this.field_2a9ad1_Zpi, this.field_31b811_kGO);
                }
                this.method_147b2066_Dne(zBn.field_7141d10c_aFZ, 2);
            }
            this.method_7c861ac7_EyB();
        } else {
            this.method_df9deb60_DyG(300);
        }
        this.field_332a61_mlD = this.field_20b33e_EWz;
        if (this.field_26818f_RPx > 0) {
            --this.field_26818f_RPx;
        }
        if (this.field_2569d5_OdI > 0) {
            --this.field_2569d5_OdI;
        }
        if (this.field_2f0dd8_div > 0) {
            --this.field_2f0dd8_div;
        }
        if (this.field_28e7fd_Vxn <= 0) {
            this.method_af414ced_cot();
        }
        if (this.field_3649f9_tgc > 0) {
            --this.field_3649f9_tgc;
        } else {
            this.field_3673728_Dne = null;
        }
        if (this.field_2020b812_FWm != null && !this.field_2020b812_FWm.method_cd4cb3d9_udO()) {
            this.field_2020b812_FWm = null;
        }
        if (this.field_366ec33_Dne != null) {
            if (!this.field_366ec33_Dne.method_cd4cb3d9_udO()) {
                this.method_610df1e1_bzF(null);
            } else if (this.field_2092ae_Dne > 0) {
                --this.field_2092ae_Dne;
            } else {
                this.method_610df1e1_bzF(null);
            }
        }
        this.method_c71d6b50_rPc();
        this.field_34b5fe_qXo = this.field_3649f6_tgc;
        this.field_3393da_oIf = this.field_22c5ff_IjH;
        this.field_26818c_RPx = this.field_36e4d7_vSL;
        this.field_2a9ad3_Zpi = this.field_334489_mrb;
        this.field_31b813_kGO = this.field_29186a_XHL;
        this.field_36c4f18_Dne.field_365731d_Dne.method_7c6f6039_FWm();
    }

    public void method_c5dec32d_qXo() {
    }

    public void method_16cbf37_Dne(int n, float f) {
        this.field_4039e07_FWm[n] = f;
    }

    public NMq method_77c1cdc9_FWm(int n) {
        return this.field_8360c375_Dne[n + 1];
    }

    public void method_9b5d79e3_Dne(sMa sMa2, int n, double d, double d2) {
        this.field_1ed028_ATE = true;
        float f = geR.method_ce7f4ad4_Dne(d * d + d2 * d2);
        float f2 = 0.4f;
        this.field_291868_XHL /= 2.0;
        this.field_2a9ad1_Zpi /= 2.0;
        this.field_31b811_kGO /= 2.0;
        this.field_291868_XHL -= d / (double)f * (double)f2;
        this.field_2a9ad1_Zpi += (double)f2;
        this.field_31b811_kGO -= d2 / (double)f * (double)f2;
        if (this.field_2a9ad1_Zpi > (double)0.4f) {
            this.field_2a9ad1_Zpi = 0.4f;
        }
    }

    protected void method_17484c9_Dne(boolean bl, int n) {
        int n2 = this.method_baa393f5_kGO();
        if (n2 > 0) {
            int n3 = this.field_7331eae7_Dne.nextInt(3);
            if (n > 0) {
                n3 += this.field_7331eae7_Dne.nextInt(n + 1);
            }
            for (int i = 0; i < n3; ++i) {
                this.method_9045499d_Dne(n2, 1);
            }
        }
    }

    public void method_ae438b8a_XHL(int n) {
        NAx nAx = (NAx)this.field_ecf0af5e_Dne.remove(n);
        if (nAx != null) {
            this.method_6db0b295_bzF(nAx);
        }
    }

    protected void method_63ae1a3f_div(int n) {
    }

    public boolean method_857f23ec_Dne(SXd sXd) {
        return this.field_ecf0af5e_Dne.containsKey(sXd.field_2092ae_Dne);
    }

    protected boolean method_7db29416_Fnk() {
        return false;
    }

    protected void method_147b2062_Dne(zBn zBn2, int n) {
        if (!this.method_7c861acb_EyB()) {
            n = this.method_147b2055_Dne(zBn2, n);
            n = this.method_659de4b4_FWm(zBn2, n);
            int n2 = this.method_9a443a8c_XHL();
            this.field_28e7fd_Vxn -= n;
            this.field_379ccee_Dne.method_7ae95ee1_Dne(zBn2, n2, n);
        }
    }

    public boolean method_c71d6b54_rPc() {
        return this.field_36e4eb_vSL;
    }

    @Override
    protected void method_16ac470_Dne(double d, boolean bl) {
        if (!this.method_9feec6c6_Zpi()) {
            this.method_d44b4596_zGp();
        }
        if (bl && this.field_2e8483_ceE > 0.0f) {
            int n;
            int n2;
            int n3;
            int n4 = geR.method_117d0718_FWm(this.field_2f0dd3_div);
            int n5 = this.field_36c4f18_Dne.method_2c2cf7bc_Dne(n4, n3 = geR.method_117d0718_FWm(this.field_22c5fd_IjH - (double)0.2f - (double)this.field_36b0a6_udO), n2 = geR.method_117d0718_FWm(this.field_334487_mrb));
            if (n5 == 0 && ((n = this.field_36c4f18_Dne.method_a6aca7bd_FWm(n4, n3 - 1, n2)) == 11 || n == 32 || n == 21)) {
                n5 = this.field_36c4f18_Dne.method_2c2cf7bc_Dne(n4, n3 - 1, n2);
            }
            if (n5 > 0) {
                zKP.field_8374b848_Dne[n5].method_17e3b3b6_Dne(this.field_36c4f18_Dne, n4, n3, n2, this, this.field_2e8483_ceE);
            }
        }
        super.method_16ac470_Dne(d, bl);
    }

    public void method_143f92d9_bzF(float f) {
        this.field_2092ab_Dne = f;
        this.method_7ed96ebf_Qnq(f);
    }

    public void method_fe8e2b7b_Qnq(NAx nAx) {
        if (this.method_7bbbe3a6_Dne(nAx)) {
            if (this.field_ecf0af5e_Dne.containsKey(nAx.method_7a46288d_Dne())) {
                ((NAx)this.field_ecf0af5e_Dne.get(nAx.method_7a46288d_Dne())).method_7bbbe3a2_Dne(nAx);
                this.method_550f9763_FWm((NAx)this.field_ecf0af5e_Dne.get(nAx.method_7a46288d_Dne()));
            } else {
                this.field_ecf0af5e_Dne.put(nAx.method_7a46288d_Dne(), nAx);
                this.method_7bbbe3a2_Dne(nAx);
            }
        }
    }

    protected void method_9f65f30f_ZgS() {
        FiG fiG;
        if (!this.field_36e4eb_vSL && (fiG = this.field_36c4f18_Dne.method_3d2c70b_Dne(this, -1.0)) != null) {
            double d = fiG.field_2f0dd3_div - this.field_2f0dd3_div;
            double d2 = fiG.field_22c5fd_IjH - this.field_22c5fd_IjH;
            double d3 = fiG.field_334487_mrb - this.field_334487_mrb;
            double d4 = d * d + d2 * d2 + d3 * d3;
            if (this.method_d2ef85b3_yMz() && d4 > 16384.0) {
                this.method_5d73f9d_g_();
            }
            if (this.field_295784_Wwe > 600 && this.field_7331eae7_Dne.nextInt(800) == 0 && d4 > 1024.0 && this.method_d2ef85b3_yMz()) {
                this.method_5d73f9d_g_();
            } else if (d4 < 1024.0) {
                this.field_295784_Wwe = 0;
            }
        }
    }

    public float method_ae128db7_bzF() {
        return this.field_2092ab_Dne;
    }

    protected int method_ce7f5d9c_Dne(int n) {
        int n2 = UYp.method_486cd6a2_FWm(this);
        return n2 > 0 && this.field_7331eae7_Dne.nextInt(n2 + 1) > 0 ? n : n - 1;
    }

    public float method_117d0e97_FWm(float f) {
        float f2 = this.field_2a7660_ZgS - this.field_2592c0_One;
        if (f2 < 0.0f) {
            f2 += 1.0f;
        }
        return this.field_2592c0_One + f2 * f;
    }

    protected int method_147b2055_Dne(zBn zBn2, int n) {
        if (!zBn2.method_ae128dcb_bzF()) {
            int n2 = 25 - this.method_9feec6b5_Zpi();
            int n3 = n * n2 + this.field_212c1b_EyB;
            this.method_63ae1a3f_div(n);
            n = n3 / 25;
            this.field_212c1b_EyB = n3 % 25;
        }
        return n;
    }

    protected void method_c738b194_qrB() {
        if (this.field_7331eae7_Dne.nextFloat() < field_5781700_aFZ[this.field_36c4f18_Dne.field_2d29f4_aFZ]) {
            float f;
            int n = this.field_7331eae7_Dne.nextInt(2);
            float f2 = f = this.field_36c4f18_Dne.field_2d29f4_aFZ == 3 ? 0.1f : 0.25f;
            if (this.field_7331eae7_Dne.nextFloat() < 0.095f) {
                ++n;
            }
            if (this.field_7331eae7_Dne.nextFloat() < 0.095f) {
                ++n;
            }
            if (this.field_7331eae7_Dne.nextFloat() < 0.095f) {
                ++n;
            }
            for (int i = 3; i >= 0; --i) {
                dEr dEr2;
                NMq nMq = this.method_77c1cdc9_FWm(i);
                if (i < 3 && this.field_7331eae7_Dne.nextFloat() < f) break;
                if (nMq != null || (dEr2 = FUH.method_9050989a_Dne(i + 1, n)) == null) continue;
                this.method_19b4c3a3_a_(i + 1, new NMq(dEr2));
            }
        }
    }

    public void method_143f9e1c_bzF(int n) {
        this.field_28e7fd_Vxn = n;
        if (n > this.method_7a46288d_Dne()) {
            n = this.method_7a46288d_Dne();
        }
    }

    public void method_2ee8c479_FWm(int n, int n2, int n3, int n4) {
        this.field_376d18e_Dne.method_2c2cf7c9_Dne(n, n2, n3);
        this.field_21260a_FWm = n4;
    }

    public String method_da581772_IjH() {
        return this.field_378ab08_Dne.method_2c0e7e17_Dne(5);
    }

    @Override
    public void method_19b4c3a3_a_(int n, NMq nMq) {
        this.field_8360c375_Dne[n] = nMq;
    }

    @Override
    protected void method_ce7f5266_Dne(float f) {
        super.method_ce7f5266_Dne(f);
        int n = geR.method_117d0e9a_FWm(f - 3.0f);
        if (n > 0) {
            if (n > 4) {
                this.method_fbd4aee4_Dne("damage.fallbig", 1.0f, 1.0f);
            } else {
                this.method_fbd4aee4_Dne("damage.fallsmall", 1.0f, 1.0f);
            }
            this.method_147b2066_Dne(zBn.field_142722f0_div, n);
            int n2 = this.field_36c4f18_Dne.method_2c2cf7bc_Dne(geR.method_117d0718_FWm(this.field_2f0dd3_div), geR.method_117d0718_FWm(this.field_22c5fd_IjH - (double)0.2f - (double)this.field_36b0a6_udO), geR.method_117d0718_FWm(this.field_334487_mrb));
            if (n2 > 0) {
                PsW psW = zKP.field_8374b848_Dne[n2].field_a21c1bc0_kGO;
                this.method_fbd4aee4_Dne(psW.method_6859cdb9_bzF(), psW.method_7a46288a_Dne() * 0.5f, psW.method_7c6f6029_FWm() * 0.75f);
            }
        }
    }

    public static dEr method_9050989a_Dne(int n, int n2) {
        switch (n) {
            case 4: {
                if (n2 == 0) {
                    return dEr.field_36c51e1_Dne;
                }
                if (n2 == 1) {
                    return dEr.field_1f0142a5_qLR;
                }
                if (n2 == 2) {
                    return dEr.field_712fd627_aFZ;
                }
                if (n2 == 3) {
                    return dEr.field_5bcbb35_IjH;
                }
                if (n2 == 4) {
                    return dEr.field_a21c8349_kGO;
                }
            }
            case 3: {
                if (n2 == 0) {
                    return dEr.field_20261dc0_FWm;
                }
                if (n2 == 1) {
                    return dEr.field_35cbb2ca_ATE;
                }
                if (n2 == 2) {
                    return dEr.field_f09e10d9_zGp;
                }
                if (n2 == 3) {
                    return dEr.field_74f6e4bf_mrb;
                }
                if (n2 == 4) {
                    return dEr.field_aefcfa5c_udO;
                }
            }
            case 2: {
                if (n2 == 0) {
                    return dEr.field_75b41fce_bzF;
                }
                if (n2 == 1) {
                    return dEr.field_719b67b0_Vxn;
                }
                if (n2 == 2) {
                    return dEr.field_161f7b0a_DyG;
                }
                if (n2 == 3) {
                    return dEr.field_1c2de020_XHL;
                }
                if (n2 == 4) {
                    return dEr.field_ab251697_ooe;
                }
            }
            case 1: {
                if (n2 == 0) {
                    return dEr.field_5e55c0a8_Qnq;
                }
                if (n2 == 1) {
                    return dEr.field_84fd97b9_ceE;
                }
                if (n2 == 2) {
                    return dEr.field_1415280b_div;
                }
                if (n2 == 3) {
                    return dEr.field_61660609_Zpi;
                }
                if (n2 != 4) break;
                return dEr.field_32866d87_trS;
            }
        }
        return null;
    }

    public boolean method_ad72a717_bzF(sMa sMa2) {
        this.method_daa0b257_DyG(sMa2);
        return false;
    }

    static {
        field_59d86b9_bzF = new float[]{0.0f, 0.0f, 0.1f, 0.2f};
        field_4a9241f_Qnq = new float[]{0.0f, 0.0f, 0.25f, 0.5f};
        field_5781700_aFZ = new float[]{0.0f, 0.0f, 0.05f, 0.07f};
        field_3f1c586_Dne = new float[]{0.0f, 0.1f, 0.15f, 0.45f};
    }

    protected boolean method_c5dec331_qXo() {
        return this.field_28e7fd_Vxn <= 0;
    }

    public iSh method_f886b00c_FWm() {
        return this.field_376d18e_Dne;
    }

    public KFZ method_23028a4c_Dne() {
        return this.field_368fbed_Dne;
    }

    public boolean method_b0a28148_div() {
        int n;
        int n2;
        int n3 = geR.method_117d0718_FWm(this.field_2f0dd3_div);
        int n4 = this.field_36c4f18_Dne.method_2c2cf7bc_Dne(n3, n2 = geR.method_117d0718_FWm(this.field_373a3ed_Dne.field_212608_FWm), n = geR.method_117d0718_FWm(this.field_334487_mrb));
        return n4 == zKP.field_fa1a6f1_ZfC.field_21260d_FWm || n4 == zKP.field_728b3649_ipf.field_21260d_FWm;
    }

    protected int method_659de4b4_FWm(zBn zBn2, int n) {
        int n2;
        int n3;
        int n4;
        if (this.method_857f23ec_Dne(SXd.field_616697d5_Zpi)) {
            n4 = (this.method_a7927c94_Dne(SXd.field_616697d5_Zpi).method_ae128dba_bzF() + 1) * 5;
            n3 = 25 - n4;
            n2 = n * n3 + this.field_212c1b_EyB;
            n = n2 / 25;
            this.field_212c1b_EyB = n2 % 25;
        }
        if (n <= 0) {
            return 0;
        }
        n4 = UYp.method_ec92bc7a_Dne(this.method_56f900f6_Dne(), zBn2);
        if (n4 > 20) {
            n4 = 20;
        }
        if (n4 > 0 && n4 <= 20) {
            n3 = 25 - n4;
            n2 = n * n3 + this.field_212c1b_EyB;
            n = n2 / 25;
            this.field_212c1b_EyB = n2 % 25;
        }
        return n;
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return !this.field_2a9ae7_Zpi;
    }

    public boolean method_908be33f_RPx() {
        return this.field_21260a_FWm != -1.0f;
    }

    @Override
    public void method_8d4fb917_Dne(WkD wkD) {
        if (this.field_28e7fd_Vxn < Short.MIN_VALUE) {
            this.field_28e7fd_Vxn = Short.MIN_VALUE;
        }
        wkD.method_5ab47529_Dne("Health", (short)this.field_28e7fd_Vxn);
        wkD.method_5ab47529_Dne("HurtTime", (short)this.field_2569d5_OdI);
        wkD.method_5ab47529_Dne("DeathTime", (short)this.field_36e4da_vSL);
        wkD.method_5ab47529_Dne("AttackTime", (short)this.field_26818f_RPx);
        wkD.method_5ab48f70_Dne("CanPickUpLoot", this.method_7ac07071_EWz());
        wkD.method_5ab48f70_Dne("PersistenceRequired", this.field_36e4eb_vSL);
        mbZ mbZ2 = new mbZ();
        for (int i = 0; i < this.field_8360c375_Dne.length; ++i) {
            WkD wkD2 = new WkD();
            if (this.field_8360c375_Dne[i] != null) {
                this.field_8360c375_Dne[i].method_7dab90f8_Dne(wkD2);
            }
            mbZ2.method_b4ba5ea1_Dne(wkD2);
        }
        wkD.method_58996597_Dne("Equipment", mbZ2);
        if (!this.field_ecf0af5e_Dne.isEmpty()) {
            mbZ mbZ3 = new mbZ();
            for (NAx nAx : this.field_ecf0af5e_Dne.values()) {
                mbZ3.method_b4ba5ea1_Dne(nAx.method_7dab90f8_Dne(new WkD()));
            }
            wkD.method_58996597_Dne("ActiveEffects", mbZ3);
        }
        mbZ mbZ4 = new mbZ();
        for (int i = 0; i < this.field_4039e07_FWm.length; ++i) {
            mbZ4.method_b4ba5ea1_Dne(new nOv(i + "", this.field_4039e07_FWm[i]));
        }
        wkD.method_58996597_Dne("DropChances", mbZ4);
        wkD.method_abaa98ae_Dne("CustomName", this.method_da581772_IjH());
        wkD.method_5ab48f70_Dne("CustomNameVisible", this.method_b077c666_eHV());
    }

    protected void method_af414ced_cot() {
        ++this.field_36e4da_vSL;
        if (this.field_36e4da_vSL == 20) {
            int n;
            if (!this.field_36c4f18_Dne.field_2d2a05_aFZ && (this.field_3649f9_tgc > 0 || this.method_7db29416_Fnk()) && !this.method_8288d6f2_IjH() && this.field_36c4f18_Dne.method_230cbc5a_Dne().method_8f501fe8_Dne("doMobLoot")) {
                int n2;
                for (n = this.method_70328496_Dne(this.field_3673728_Dne); n > 0; n -= n2) {
                    n2 = alg.method_ce7f5d9c_Dne(n);
                    this.field_36c4f18_Dne.method_94d18be5_FWm(new alg(this.field_36c4f18_Dne, this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb, n2));
                }
            }
            this.method_5d73f9d_g_();
            for (n = 0; n < 20; ++n) {
                double d = this.field_7331eae7_Dne.nextGaussian() * 0.02;
                double d2 = this.field_7331eae7_Dne.nextGaussian() * 0.02;
                double d3 = this.field_7331eae7_Dne.nextGaussian() * 0.02;
                this.field_36c4f18_Dne.method_8600ec24_Dne("explode", this.field_2f0dd3_div + (double)(this.field_7331eae7_Dne.nextFloat() * this.field_342261_ooe * 2.0f) - (double)this.field_342261_ooe, this.field_22c5fd_IjH + (double)(this.field_7331eae7_Dne.nextFloat() * this.field_367151_trS), this.field_334487_mrb + (double)(this.field_7331eae7_Dne.nextFloat() * this.field_342261_ooe * 2.0f) - (double)this.field_342261_ooe, d, d2, d3);
            }
        }
    }

    @Override
    public void method_b5f30bf3_gnI() {
        this.field_3393dd_oIf = 10;
        this.field_2569d5_OdI = 10;
        this.field_2f0273_eHV = 0.0f;
    }

    public void method_4e07f70b_mrb(int n) {
        this.field_ecf0af5e_Dne.remove(n);
    }

    @Override
    public void method_ae1c3edf_Dne(double d, double d2, double d3, float f, float f2, int n) {
        this.field_36b0a6_udO = 0.0f;
        this.field_2e5f16_bzF = d;
        this.field_34856d_qLR = d2;
        this.field_1ed012_ATE = d3;
        this.field_28e7f8_Vxn = f;
        this.field_2e8481_ceE = f2;
        this.field_383103_yMz = n;
    }

    public NMq method_9e6e1a08_Dne(int n) {
        return this.field_8360c375_Dne[n];
    }

    protected float method_b0a28134_div() {
        return 1.0f;
    }

    protected void method_8692166d_LVR() {
        if (this.method_23040479_Dne() != null && this.field_7331eae7_Dne.nextFloat() < field_59d86b9_bzF[this.field_36c4f18_Dne.field_2d29f4_aFZ]) {
            UYp.method_2e16e3d9_Dne(this.field_7331eae7_Dne, this.method_23040479_Dne(), 5 + this.field_36c4f18_Dne.field_2d29f4_aFZ * this.field_7331eae7_Dne.nextInt(6));
        }
        for (int i = 0; i < 4; ++i) {
            NMq nMq = this.method_77c1cdc9_FWm(i);
            if (nMq == null || !(this.field_7331eae7_Dne.nextFloat() < field_4a9241f_Qnq[this.field_36c4f18_Dne.field_2d29f4_aFZ])) continue;
            UYp.method_2e16e3d9_Dne(this.field_7331eae7_Dne, nMq, 5 + this.field_36c4f18_Dne.field_2d29f4_aFZ * this.field_7331eae7_Dne.nextInt(6));
        }
    }

    protected void method_b0a28144_div() {
        ++this.field_295784_Wwe;
        this.method_9f65f30f_ZgS();
        this.field_2a70af_ZfC = 0.0f;
        this.field_212b3f_FYZ = 0.0f;
        float f = 8.0f;
        if (this.field_7331eae7_Dne.nextFloat() < 0.02f) {
            FiG fiG = this.field_36c4f18_Dne.method_3d2c70b_Dne(this, f);
            if (fiG != null) {
                this.field_75c313d2_bzF = fiG;
                this.field_2f0c45_eJi = 10 + this.field_7331eae7_Dne.nextInt(20);
            } else {
                this.field_1f1f46_BJH = (this.field_7331eae7_Dne.nextFloat() - 0.5f) * 20.0f;
            }
        }
        if (this.field_75c313d2_bzF != null) {
            this.method_d3754820_Dne(this.field_75c313d2_bzF, 10.0f, this.method_cd4cb3c8_udO());
            if (this.field_2f0c45_eJi-- <= 0 || this.field_75c313d2_bzF.field_2a9ae7_Zpi || this.field_75c313d2_bzF.method_bb7dd80e_Dne(this) > (double)(f * f)) {
                this.field_75c313d2_bzF = null;
            }
        } else {
            if (this.field_7331eae7_Dne.nextFloat() < 0.05f) {
                this.field_1f1f46_BJH = (this.field_7331eae7_Dne.nextFloat() - 0.5f) * 20.0f;
            }
            this.field_334489_mrb += this.field_1f1f46_BJH;
            this.field_29186a_XHL = this.field_3489ac_qMV;
        }
        boolean bl = this.method_9feec6c6_Zpi();
        boolean bl2 = this.method_7ad38807_DyG();
        if (bl || bl2) {
            this.field_3393ee_oIf = this.field_7331eae7_Dne.nextFloat() < 0.8f;
        }
    }

    public int method_a98a0653_aFZ() {
        return this.field_295784_Wwe;
    }

    public wHH method_ea40afb6_Dne(double d, float f) {
        chN chN2 = this.method_ffc5552e_Dne(f);
        chN chN3 = this.method_d91908ef_FWm(f);
        chN chN4 = chN2.method_2c4d3b9f_bzF(chN3.field_2092a9_Dne * d, chN3.field_212608_FWm * d, chN3.field_2e5f16_bzF * d);
        return this.field_36c4f18_Dne.method_38be674_Dne(chN2, chN4);
    }

    public FUH method_69495399_Qnq() {
        return this.field_379ccee_Dne.method_23007a92_Dne() != null ? this.field_379ccee_Dne.method_23007a92_Dne() : (this.field_3673728_Dne != null ? this.field_3673728_Dne : (this.field_366ec33_Dne != null ? this.field_366ec33_Dne : null));
    }

    protected void method_8d0b776f_One() {
        this.field_2a9ad1_Zpi = 0.42f;
        if (this.method_857f23ec_Dne(SXd.field_5bd4d01_IjH)) {
            this.field_2a9ad1_Zpi += (double)((float)(this.method_a7927c94_Dne(SXd.field_5bd4d01_IjH).method_ae128dba_bzF() + 1) * 0.1f);
        }
        if (this.method_73aaafc7_ATE()) {
            float f = this.field_334489_mrb * ((float)Math.PI / 180);
            this.field_291868_XHL -= (double)(geR.method_ce7f5256_Dne(f) * 0.2f);
            this.field_31b811_kGO += (double)(geR.method_117d0e97_FWm(f) * 0.2f);
        }
        this.field_1ed028_ATE = true;
    }

    public void method_d3754820_Dne(sMa sMa2, float f, float f2) {
        double d;
        double d2 = sMa2.field_2f0dd3_div - this.field_2f0dd3_div;
        double d3 = sMa2.field_334487_mrb - this.field_334487_mrb;
        if (sMa2 instanceof FUH) {
            FUH fUH = (FUH)sMa2;
            d = fUH.field_22c5fd_IjH + (double)fUH.method_59ee189_c_() - (this.field_22c5fd_IjH + (double)this.method_59ee189_c_());
        } else {
            d = (sMa2.field_373a3ed_Dne.field_212608_FWm + sMa2.field_373a3ed_Dne.field_2d29ef_aFZ) / 2.0 - (this.field_22c5fd_IjH + (double)this.method_59ee189_c_());
        }
        double d4 = geR.method_ce7f4ad4_Dne(d2 * d2 + d3 * d3);
        float f3 = (float)(Math.atan2(d3, d2) * 180.0 / Math.PI) - 90.0f;
        float f4 = (float)(-(Math.atan2(d, d4) * 180.0 / Math.PI));
        this.field_29186a_XHL = this.method_2c0148d6_Dne(this.field_29186a_XHL, f4, f2);
        this.field_334489_mrb = this.method_2c0148d6_Dne(this.field_334489_mrb, f3, f);
    }

    public boolean method_2c2cf7cd_Dne(int n, int n2, int n3) {
        return this.field_21260a_FWm == -1.0f ? true : this.field_376d18e_Dne.method_2c2cf7b9_Dne(n, n2, n3) < this.field_21260a_FWm * this.field_21260a_FWm;
    }

    public void method_ce7f5da9_Dne(int n) {
        if (this.field_28e7fd_Vxn > 0) {
            this.method_143f9e1c_bzF(this.method_9a443a8c_XHL() + n);
            if (this.field_28e7fd_Vxn > this.method_7a46288d_Dne()) {
                this.method_143f9e1c_bzF(this.method_7a46288d_Dne());
            }
            this.field_2f0dd8_div = this.field_2e5f1b_bzF / 2;
        }
    }

    public boolean method_117d19ee_FWm(int n) {
        return this.field_ecf0af5e_Dne.containsKey(n);
    }

    protected void method_7bbbe3a2_Dne(NAx nAx) {
        this.field_2092bf_Dne = true;
    }

    public Random method_b5ceee8_Dne() {
        return this.field_7331eae7_Dne;
    }

    public void method_7ed96ebf_Qnq(float f) {
        this.field_212b3f_FYZ = f;
    }
}

