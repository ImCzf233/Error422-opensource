package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class SXd {
    public static final SXd field_719bf97c_Vxn;
    public static final SXd field_1415b9d7_div;
    public static final SXd field_d2adb55c_oIf;
    public static final SXd field_3953cf54_OdI;
    public static final SXd field_9f2e7a0e_RPx;
    public static final SXd field_aefd8c28_udO;
    public static final SXd field_713067f3_aFZ;
    private int field_21260d_FWm = -1;
    private double field_2092a9_Dne;
    public static final SXd field_84fe2985_ceE;
    public static final SXd field_1f01d471_qLR;
    public static final SXd field_1c2e71ec_XHL;
    public final int field_2092ae_Dne;
    public static final SXd field_36ce3ad_Dne;
    public static final SXd field_cb492580_qXo;
    public static final SXd field_35cc4496_ATE;
    public static final SXd field_5e565274_Qnq;
    public static final SXd field_f09ea2a5_zGp;
    public static final SXd field_16200cd6_DyG;
    public static final SXd field_5bd4d01_IjH;
    public static final SXd field_d462835_FfS;
    private final boolean field_2092bf_Dne;
    public static final SXd field_74f7768b_mrb;
    public static final SXd field_8e763fd9_vSL;
    public static final SXd field_d7334f82_yMz;
    public static final SXd field_616697d5_Zpi;
    public static final SXd field_24978308_AgF;
    public static final SXd field_3286ff53_trS;
    public static final SXd field_dd6c5125_Fnk;
    public static final SXd[] field_83633108_Dne;
    private final int field_2e5f1b_bzF;
    public static final SXd field_2026af8c_FWm;
    public static final SXd field_7578fe9a_EyB;
    public static final SXd field_ab25a863_ooe;
    public static final SXd field_76e54c6_gnI;
    public static final SXd field_75b4b19a_bzF;
    public static final SXd field_7effd78_tgc;
    public static final SXd field_a21d1515_kGO;
    private boolean field_21261e_FWm;
    private String field_569fcf45_Dne = "";

    public boolean method_7a46289e_Dne() {
        return false;
    }

    public boolean method_16cca7e_Dne(int n, int n2) {
        if (this.field_2092ae_Dne != SXd.field_1c2e71ec_XHL.field_2092ae_Dne && this.field_2092ae_Dne != SXd.field_84fe2985_ceE.field_2092ae_Dne) {
            if (this.field_2092ae_Dne == SXd.field_7578fe9a_EyB.field_2092ae_Dne) {
                int n3 = 40 >> n2;
                return n3 > 0 ? n % n3 == 0 : true;
            }
            return this.field_2092ae_Dne == SXd.field_35cc4496_ATE.field_2092ae_Dne;
        }
        int n4 = 25 >> n2;
        return n4 > 0 ? n % n4 == 0 : true;
    }

    public String method_eecad346_Dne() {
        return this.field_569fcf45_Dne;
    }

    public int method_7a46288d_Dne() {
        return this.field_2092ae_Dne;
    }

    public static String method_1ab1893e_Dne(NAx nAx) {
        if (nAx.method_ae128dcb_bzF()) {
            return "**:**";
        }
        int n = nAx.method_7c6f602c_FWm();
        return vCA.method_2c0e7e17_Dne(n);
    }

    public void method_740badd5_Dne(FUH fUH, int n) {
        if (this.field_2092ae_Dne == SXd.field_1c2e71ec_XHL.field_2092ae_Dne) {
            if (fUH.method_9a443a8c_XHL() < fUH.method_7a46288d_Dne()) {
                fUH.method_ce7f5da9_Dne(1);
            }
        } else if (this.field_2092ae_Dne == SXd.field_84fe2985_ceE.field_2092ae_Dne) {
            if (fUH.method_9a443a8c_XHL() > 1) {
                fUH.method_147b2066_Dne(zBn.field_1c3fdb05_XHL, 1);
            }
        } else if (this.field_2092ae_Dne == SXd.field_7578fe9a_EyB.field_2092ae_Dne) {
            fUH.method_147b2066_Dne(zBn.field_617800ee_Zpi, 1);
        } else if (this.field_2092ae_Dne == SXd.field_35cc4496_ATE.field_2092ae_Dne && fUH instanceof FiG) {
            ((FiG)fUH).method_87b72d60_aFZ(0.025f * (float)(n + 1));
        } else if (!(this.field_2092ae_Dne == SXd.field_16200cd6_DyG.field_2092ae_Dne && !fUH.method_b09c9875_eJi() || this.field_2092ae_Dne == SXd.field_1415b9d7_div.field_2092ae_Dne && fUH.method_b09c9875_eJi())) {
            if (this.field_2092ae_Dne == SXd.field_1415b9d7_div.field_2092ae_Dne && !fUH.method_b09c9875_eJi() || this.field_2092ae_Dne == SXd.field_16200cd6_DyG.field_2092ae_Dne && fUH.method_b09c9875_eJi()) {
                fUH.method_147b2066_Dne(zBn.field_1c3fdb05_XHL, 6 << n);
            }
        } else {
            fUH.method_ce7f5da9_Dne(6 << n);
        }
    }

    public SXd method_284fb456_Dne(String string) {
        this.field_569fcf45_Dne = string;
        return this;
    }

    public int method_7c6f602c_FWm() {
        return this.field_21260d_FWm;
    }

    public boolean method_7c6f603d_FWm() {
        return this.field_21260d_FWm >= 0;
    }

    public boolean method_ae128dcb_bzF() {
        return this.field_2092bf_Dne;
    }

    public boolean method_907a9d25_Qnq() {
        return this.field_21261e_FWm;
    }

    protected SXd method_95f15f56_Dne(double d) {
        this.field_2092a9_Dne = d;
        return this;
    }

    public void method_640cec35_Dne(FUH fUH, FUH fUH2, int n, double d) {
        if (!(this.field_2092ae_Dne == SXd.field_16200cd6_DyG.field_2092ae_Dne && !fUH2.method_b09c9875_eJi() || this.field_2092ae_Dne == SXd.field_1415b9d7_div.field_2092ae_Dne && fUH2.method_b09c9875_eJi())) {
            if (this.field_2092ae_Dne == SXd.field_1415b9d7_div.field_2092ae_Dne && !fUH2.method_b09c9875_eJi() || this.field_2092ae_Dne == SXd.field_16200cd6_DyG.field_2092ae_Dne && fUH2.method_b09c9875_eJi()) {
                int n2 = (int)(d * (double)(6 << n) + 0.5);
                if (fUH == null) {
                    fUH2.method_147b2066_Dne(zBn.field_1c3fdb05_XHL, n2);
                } else {
                    fUH2.method_147b2066_Dne(zBn.method_5332b444_FWm(fUH2, fUH), n2);
                }
            }
        } else {
            int n3 = (int)(d * (double)(6 << n) + 0.5);
            fUH2.method_ce7f5da9_Dne(n3);
        }
    }

    protected SXd(int n, boolean bl, int n2) {
        this.field_2092ae_Dne = n;
        SXd.field_83633108_Dne[n] = this;
        this.field_2092bf_Dne = bl;
        this.field_2092a9_Dne = bl ? 0.5 : 1.0;
        this.field_2e5f1b_bzF = n2;
    }

    public double method_7a462888_Dne() {
        return this.field_2092a9_Dne;
    }

    protected SXd method_904923ec_Dne(int n, int n2) {
        this.field_21260d_FWm = n + n2 * 8;
        return this;
    }

    public int method_ae128dba_bzF() {
        return this.field_2e5f1b_bzF;
    }

    static {
        field_83633108_Dne = new SXd[32];
        field_36ce3ad_Dne = null;
        field_2026af8c_FWm = new SXd(1, false, 8171462).method_284fb456_Dne("potion.moveSpeed").method_904923ec_Dne(0, 0);
        field_75b4b19a_bzF = new SXd(2, true, 5926017).method_284fb456_Dne("potion.moveSlowdown").method_904923ec_Dne(1, 0);
        field_5e565274_Qnq = new SXd(3, false, 14270531).method_284fb456_Dne("potion.digSpeed").method_904923ec_Dne(2, 0).method_95f15f56_Dne(1.5);
        field_713067f3_aFZ = new SXd(4, true, 4866583).method_284fb456_Dne("potion.digSlowDown").method_904923ec_Dne(3, 0);
        field_f09ea2a5_zGp = new SXd(5, false, 9643043).method_284fb456_Dne("potion.damageBoost").method_904923ec_Dne(4, 0);
        field_16200cd6_DyG = new PGs(6, false, 16262179).method_284fb456_Dne("potion.heal");
        field_1415b9d7_div = new PGs(7, true, 4393481).method_284fb456_Dne("potion.harm");
        field_5bd4d01_IjH = new SXd(8, false, 7889559).method_284fb456_Dne("potion.jump").method_904923ec_Dne(2, 1);
        field_74f7768b_mrb = new SXd(9, true, 5578058).method_284fb456_Dne("potion.confusion").method_904923ec_Dne(3, 1).method_95f15f56_Dne(0.25);
        field_1c2e71ec_XHL = new SXd(10, false, 13458603).method_284fb456_Dne("potion.regeneration").method_904923ec_Dne(7, 0).method_95f15f56_Dne(0.25);
        field_616697d5_Zpi = new SXd(11, false, 10044730).method_284fb456_Dne("potion.resistance").method_904923ec_Dne(6, 1);
        field_a21d1515_kGO = new SXd(12, false, 14981690).method_284fb456_Dne("potion.fireResistance").method_904923ec_Dne(7, 1);
        field_aefd8c28_udO = new SXd(13, false, 3035801).method_284fb456_Dne("potion.waterBreathing").method_904923ec_Dne(0, 2);
        field_ab25a863_ooe = new SXd(14, false, 8356754).method_284fb456_Dne("potion.invisibility").method_904923ec_Dne(0, 1);
        field_3286ff53_trS = new SXd(15, true, 2039587).method_284fb456_Dne("potion.blindness").method_904923ec_Dne(5, 1).method_95f15f56_Dne(0.25);
        field_1f01d471_qLR = new SXd(16, false, 0x1F1FA1).method_284fb456_Dne("potion.nightVision").method_904923ec_Dne(4, 1);
        field_35cc4496_ATE = new SXd(17, true, 5797459).method_284fb456_Dne("potion.hunger").method_904923ec_Dne(1, 1);
        field_719bf97c_Vxn = new SXd(18, true, 0x484D48).method_284fb456_Dne("potion.weakness").method_904923ec_Dne(5, 0);
        field_84fe2985_ceE = new SXd(19, true, 5149489).method_284fb456_Dne("potion.poison").method_904923ec_Dne(6, 0).method_95f15f56_Dne(0.25);
        field_7578fe9a_EyB = new SXd(20, true, 3484199).method_284fb456_Dne("potion.wither").method_904923ec_Dne(1, 2).method_95f15f56_Dne(0.25);
        field_d462835_FfS = null;
        field_3953cf54_OdI = null;
        field_d2adb55c_oIf = null;
        field_8e763fd9_vSL = null;
        field_9f2e7a0e_RPx = null;
        field_dd6c5125_Fnk = null;
        field_76e54c6_gnI = null;
        field_7effd78_tgc = null;
        field_cb492580_qXo = null;
        field_24978308_AgF = null;
        field_d7334f82_yMz = null;
    }
}

