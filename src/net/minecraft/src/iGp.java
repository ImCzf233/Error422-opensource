package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class iGp
extends LHi {
    private int field_2592c3_One = 0;
    private boolean field_21261e_FWm;
    private int field_21260d_FWm = 0;
    private static boolean[] field_3f1c59a_Dne = new boolean[256];

    @Override
    public void method_8288d6ee_IjH() {
        float f;
        int n;
        if (this.method_9a443a9d_XHL()) {
            this.method_147b2066_Dne(zBn.field_7141d10c_aFZ, 1);
        }
        float f2 = this.field_2e1df2_cHy = this.field_75c313d2_bzF != null ? 6.5f : 0.3f;
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ && this.field_36c4f18_Dne.method_230cbc5a_Dne().method_8f501fe8_Dne("mobGriefing")) {
            int n2;
            int n3;
            int n4;
            if (this.method_ae128dba_bzF() == 0) {
                if (this.field_7331eae7_Dne.nextInt(20) == 0 && field_3f1c59a_Dne[n4 = this.field_36c4f18_Dne.method_2c2cf7bc_Dne(n = geR.method_117d0718_FWm(this.field_2f0dd3_div - 2.0 + this.field_7331eae7_Dne.nextDouble() * 4.0), n3 = geR.method_117d0718_FWm(this.field_22c5fd_IjH + this.field_7331eae7_Dne.nextDouble() * 3.0), n2 = geR.method_117d0718_FWm(this.field_334487_mrb - 2.0 + this.field_7331eae7_Dne.nextDouble() * 4.0))]) {
                    this.method_117d19ea_FWm(this.field_36c4f18_Dne.method_2c2cf7bc_Dne(n, n3, n2));
                    this.method_99cf5f41_kGO(this.field_36c4f18_Dne.method_2dee76f_bzF(n, n3, n2));
                    this.field_36c4f18_Dne.method_2ee8c47d_FWm(n, n3, n2, 0);
                }
            } else if (this.field_7331eae7_Dne.nextInt(2000) == 0) {
                n = geR.method_117d0718_FWm(this.field_2f0dd3_div - 1.0 + this.field_7331eae7_Dne.nextDouble() * 2.0);
                n3 = geR.method_117d0718_FWm(this.field_22c5fd_IjH + this.field_7331eae7_Dne.nextDouble() * 2.0);
                n2 = geR.method_117d0718_FWm(this.field_334487_mrb - 1.0 + this.field_7331eae7_Dne.nextDouble() * 2.0);
                n4 = this.field_36c4f18_Dne.method_2c2cf7bc_Dne(n, n3, n2);
                int n5 = this.field_36c4f18_Dne.method_2c2cf7bc_Dne(n, n3 - 1, n2);
                if (n4 == 0 && n5 > 0 && zKP.field_8374b848_Dne[n5].method_7a46289e_Dne()) {
                    this.field_36c4f18_Dne.method_17d7ea9d_FWm(n, n3, n2, this.method_ae128dba_bzF(), this.method_c5287a51_qLR(), 3);
                    this.method_117d19ea_FWm(0);
                }
            }
        }
        for (n = 0; n < 2; ++n) {
            this.field_36c4f18_Dne.method_8600ec24_Dne("portal", this.field_2f0dd3_div + (this.field_7331eae7_Dne.nextDouble() - 0.5) * (double)this.field_342261_ooe, this.field_22c5fd_IjH + this.field_7331eae7_Dne.nextDouble() * (double)this.field_367151_trS - 0.25, this.field_334487_mrb + (this.field_7331eae7_Dne.nextDouble() - 0.5) * (double)this.field_342261_ooe, (this.field_7331eae7_Dne.nextDouble() - 0.5) * 2.0, -this.field_7331eae7_Dne.nextDouble(), (this.field_7331eae7_Dne.nextDouble() - 0.5) * 2.0);
        }
        if (this.field_36c4f18_Dne.method_7a46289e_Dne() && !this.field_36c4f18_Dne.field_2d2a05_aFZ && (f = this.method_ce7f5256_Dne(1.0f)) > 0.5f && this.field_36c4f18_Dne.method_76d9fc47_aFZ(geR.method_117d0718_FWm(this.field_2f0dd3_div), geR.method_117d0718_FWm(this.field_22c5fd_IjH), geR.method_117d0718_FWm(this.field_334487_mrb)) && this.field_7331eae7_Dne.nextFloat() * 30.0f < (f - 0.4f) * 2.0f) {
            this.field_75c313d2_bzF = null;
            this.method_117d59bb_FWm(false);
            this.field_21261e_FWm = false;
            this.method_86921671_LVR();
        }
        if (this.method_9a443a9d_XHL() || this.method_cc5ef5c4_trS()) {
            this.field_75c313d2_bzF = null;
            this.method_117d59bb_FWm(false);
            this.field_21261e_FWm = false;
            this.method_86921671_LVR();
        }
        if (this.method_9f5095a2_ZfC() && !this.field_21261e_FWm && this.field_7331eae7_Dne.nextInt(100) == 0) {
            this.method_117d59bb_FWm(false);
        }
        this.field_3393ee_oIf = false;
        if (this.field_75c313d2_bzF != null) {
            this.method_d3754820_Dne(this.field_75c313d2_bzF, 100.0f, 100.0f);
        }
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ && this.method_cd4cb3d9_udO()) {
            if (this.field_75c313d2_bzF != null) {
                if (this.field_75c313d2_bzF instanceof FiG && this.method_6227539a_bzF((FiG)this.field_75c313d2_bzF)) {
                    this.field_212b3f_FYZ = 0.0f;
                    this.field_2a70af_ZfC = 0.0f;
                    this.field_2e1df2_cHy = 0.0f;
                    if (this.field_75c313d2_bzF.method_bb7dd80e_Dne(this) < 16.0) {
                        this.method_86921671_LVR();
                    }
                    this.field_21260d_FWm = 0;
                } else if (this.field_75c313d2_bzF.method_bb7dd80e_Dne(this) > 256.0 && this.field_21260d_FWm++ >= 30 && this.method_efba61e_aFZ(this.field_75c313d2_bzF)) {
                    this.field_21260d_FWm = 0;
                }
            } else {
                this.method_117d59bb_FWm(false);
                this.field_21260d_FWm = 0;
            }
        }
        super.method_8288d6ee_IjH();
    }

    @Override
    protected void method_7c6f6039_FWm() {
        super.method_7c6f6039_FWm();
        this.field_378ab08_Dne.method_ad009545_Dne(16, (byte) 0);
        this.field_378ab08_Dne.method_ad009545_Dne(17, (byte) 0);
        this.field_378ab08_Dne.method_ad009545_Dne(18, (byte) 0);
    }

    @Override
    protected String method_a174454e_zGp() {
        return this.method_9f5095a2_ZfC() ? "mob.endermen.scream" : "mob.endermen.idle";
    }

    @Override
    protected String method_6a89a3dc_div() {
        return "mob.endermen.death";
    }

    protected boolean method_86921671_LVR() {
        double d = this.field_2f0dd3_div + (this.field_7331eae7_Dne.nextDouble() - 0.5) * 64.0;
        double d2 = this.field_22c5fd_IjH + (double)(this.field_7331eae7_Dne.nextInt(64) - 32);
        double d3 = this.field_334487_mrb + (this.field_7331eae7_Dne.nextDouble() - 0.5) * 64.0;
        return this.method_296195b_bzF(d, d2, d3);
    }

    protected boolean method_296195b_bzF(double d, double d2, double d3) {
        int n;
        int n2;
        int n3;
        int n4;
        double d4 = this.field_2f0dd3_div;
        double d5 = this.field_22c5fd_IjH;
        double d6 = this.field_334487_mrb;
        this.field_2f0dd3_div = d;
        this.field_22c5fd_IjH = d2;
        this.field_334487_mrb = d3;
        boolean bl = false;
        int n5 = geR.method_117d0718_FWm(this.field_2f0dd3_div);
        if (this.field_36c4f18_Dne.method_2dee780_bzF(n5, n4 = geR.method_117d0718_FWm(this.field_22c5fd_IjH), n3 = geR.method_117d0718_FWm(this.field_334487_mrb))) {
            n2 = 0;
            while (n2 == 0 && n4 > 0) {
                n = this.field_36c4f18_Dne.method_2c2cf7bc_Dne(n5, n4 - 1, n3);
                if (n != 0 && zKP.field_8374b848_Dne[n].field_368fd23_Dne.method_ae128dcb_bzF()) {
                    n2 = 1;
                    continue;
                }
                this.field_22c5fd_IjH -= 1.0;
                --n4;
            }
            if (n2 != 0) {
                this.method_2961957_bzF(this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb);
                if (this.field_36c4f18_Dne.method_d11d9a5_Dne(this, this.field_373a3ed_Dne).isEmpty() && !this.field_36c4f18_Dne.method_90cba31f_bzF(this.field_373a3ed_Dne)) {
                    bl = true;
                }
            }
        }
        if (!bl) {
            this.method_2961957_bzF(d4, d5, d6);
            return false;
        }
        n2 = 128;
        for (n = 0; n < n2; ++n) {
            double d7 = (double)n / ((double)n2 - 1.0);
            float f = (this.field_7331eae7_Dne.nextFloat() - 0.5f) * 0.2f;
            float f2 = (this.field_7331eae7_Dne.nextFloat() - 0.5f) * 0.2f;
            float f3 = (this.field_7331eae7_Dne.nextFloat() - 0.5f) * 0.2f;
            double d8 = d4 + (this.field_2f0dd3_div - d4) * d7 + (this.field_7331eae7_Dne.nextDouble() - 0.5) * (double)this.field_342261_ooe * 2.0;
            double d9 = d5 + (this.field_22c5fd_IjH - d5) * d7 + this.field_7331eae7_Dne.nextDouble() * (double)this.field_367151_trS;
            double d10 = d6 + (this.field_334487_mrb - d6) * d7 + (this.field_7331eae7_Dne.nextDouble() - 0.5) * (double)this.field_342261_ooe * 2.0;
            this.field_36c4f18_Dne.method_8600ec24_Dne("portal", d8, d9, d10, f, f2, f3);
        }
        this.field_36c4f18_Dne.method_c961c6ee_Dne(d4, d5, d6, "mob.endermen.portal", 1.0f, 1.0f);
        this.method_fbd4aee4_Dne("mob.endermen.portal", 1.0f, 1.0f);
        return true;
    }

    @Override
    protected String method_3c9d12fd_DyG() {
        return "mob.endermen.hit";
    }

    @Override
    protected void method_17484c9_Dne(boolean bl, int n) {
        int n2 = this.method_baa393f5_kGO();
        if (n2 > 0) {
            int n3 = this.field_7331eae7_Dne.nextInt(2 + n);
            for (int i = 0; i < n3; ++i) {
                this.method_9045499d_Dne(n2, 1);
            }
        }
    }

    @Override
    public int method_7a46288d_Dne() {
        return 40;
    }

    public void method_99cf5f41_kGO(int n) {
        this.field_378ab08_Dne.method_62ca2346_FWm(17, (byte)(n & 0xFF));
    }

    public int method_c5287a51_qLR() {
        return this.field_378ab08_Dne.method_ce7f5d95_Dne(17);
    }

    public boolean method_9f5095a2_ZfC() {
        return this.field_378ab08_Dne.method_ce7f5d95_Dne(18) > 0;
    }

    public iGp(Qnq qnq) {
        super(qnq);
        this.field_c480ca78_bzF = "/mob/enderman.png";
        this.field_2e1df2_cHy = 0.2f;
        this.method_16b621a_Dne(0.6f, 2.9f);
        this.field_215b33_FfS = 1.0f;
    }

    @Override
    public void method_66a36cd8_FWm(WkD wkD) {
        super.method_66a36cd8_FWm(wkD);
        this.method_117d19ea_FWm(wkD.method_8f501fe1_Dne("carried"));
        this.method_99cf5f41_kGO(wkD.method_8f501fe1_Dne("carriedData"));
    }

    @Override
    public boolean method_147b2066_Dne(zBn zBn2, int n) {
        if (this.method_7c861acb_EyB()) {
            return false;
        }
        this.method_117d59bb_FWm(true);
        if (zBn2 instanceof Kgw && zBn2.method_f88b2463_FWm() instanceof FiG) {
            this.field_21261e_FWm = true;
        }
        if (zBn2 instanceof CpP) {
            this.field_21261e_FWm = false;
            for (int i = 0; i < 64; ++i) {
                if (!this.method_86921671_LVR()) continue;
                return true;
            }
            return false;
        }
        return super.method_147b2066_Dne(zBn2, n);
    }

    @Override
    public int method_bb7dd813_Dne(sMa sMa2) {
        return 7;
    }

    public void method_117d19ea_FWm(int n) {
        this.field_378ab08_Dne.method_62ca2346_FWm(16, (byte)(n & 0xFF));
    }

    static {
        iGp.field_3f1c59a_Dne[zKP.field_36ff555_Dne.field_21260d_FWm] = true;
        iGp.field_3f1c59a_Dne[zKP.field_203836cc_FWm.field_21260d_FWm] = true;
        iGp.field_3f1c59a_Dne[zKP.field_5ced441_IjH.field_21260d_FWm] = true;
        iGp.field_3f1c59a_Dne[zKP.field_7508fdcb_mrb.field_21260d_FWm] = true;
        iGp.field_3f1c59a_Dne[zKP.field_3769521_Dne.field_21260d_FWm] = true;
        iGp.field_3f1c59a_Dne[zKP.field_20306100_FWm.field_21260d_FWm] = true;
        iGp.field_3f1c59a_Dne[zKP.field_75be630e_bzF.field_21260d_FWm] = true;
        iGp.field_3f1c59a_Dne[zKP.field_5e6003e8_Qnq.field_21260d_FWm] = true;
        iGp.field_3f1c59a_Dne[zKP.field_cb5aacc0_qXo.field_21260d_FWm] = true;
        iGp.field_3f1c59a_Dne[zKP.field_27f261ab_XjO.field_21260d_FWm] = true;
        iGp.field_3f1c59a_Dne[zKP.field_90d58f6f_lMz.field_21260d_FWm] = true;
        iGp.field_3f1c59a_Dne[zKP.field_32158d62_aJO.field_21260d_FWm] = true;
        iGp.field_3f1c59a_Dne[zKP.field_27d9ca27_gwq.field_21260d_FWm] = true;
        iGp.field_3f1c59a_Dne[zKP.field_36e467b_Dne.field_21260d_FWm] = true;
    }

    public void method_117d59bb_FWm(boolean bl) {
        this.field_378ab08_Dne.method_62ca2346_FWm(18, (byte)(bl ? 1 : 0));
    }

    private boolean method_6227539a_bzF(FiG fiG) {
        NMq nMq = fiG.field_36a059b_Dne.field_fde07376_FWm[3];
        if (nMq != null && nMq.field_2e5f1b_bzF == zKP.field_32158d62_aJO.field_21260d_FWm) {
            return false;
        }
        chN chN2 = fiG.method_d91908ef_FWm(1.0f).method_230df162_Dne();
        chN chN3 = this.field_36c4f18_Dne.method_23186a47_Dne().method_e4505d6c_Dne(this.field_2f0dd3_div - fiG.field_2f0dd3_div, this.field_373a3ed_Dne.field_212608_FWm + (double)(this.field_367151_trS / 2.0f) - (fiG.field_22c5fd_IjH + (double)fiG.method_59ee189_c_()), this.field_334487_mrb - fiG.field_334487_mrb);
        double d = chN3.method_7a462888_Dne();
        double d2 = chN2.method_a1a425ac_Dne(chN3 = chN3.method_230df162_Dne());
        return d2 > 1.0 - 0.025 / d ? fiG.method_3e501ffd_Qnq(this) : false;
    }

    @Override
    public void method_8d4fb917_Dne(WkD wkD) {
        super.method_8d4fb917_Dne(wkD);
        wkD.method_5ab47529_Dne("carried", (short)this.method_ae128dba_bzF());
        wkD.method_5ab47529_Dne("carriedData", (short)this.method_c5287a51_qLR());
    }

    public int method_ae128dba_bzF() {
        return this.field_378ab08_Dne.method_ce7f5d95_Dne(16);
    }

    @Override
    protected int method_baa393f5_kGO() {
        return dEr.field_38bbe273_iNH.field_267cf5_Qnq;
    }

    protected boolean method_efba61e_aFZ(sMa sMa2) {
        chN chN2 = this.field_36c4f18_Dne.method_23186a47_Dne().method_e4505d6c_Dne(this.field_2f0dd3_div - sMa2.field_2f0dd3_div, this.field_373a3ed_Dne.field_212608_FWm + (double)(this.field_367151_trS / 2.0f) - sMa2.field_22c5fd_IjH + (double)sMa2.method_59ee189_c_(), this.field_334487_mrb - sMa2.field_334487_mrb);
        chN2 = chN2.method_230df162_Dne();
        double d = 16.0;
        double d2 = this.field_2f0dd3_div + (this.field_7331eae7_Dne.nextDouble() - 0.5) * 8.0 - chN2.field_2092a9_Dne * d;
        double d3 = this.field_22c5fd_IjH + (double)(this.field_7331eae7_Dne.nextInt(16) - 8) - chN2.field_212608_FWm * d;
        double d4 = this.field_334487_mrb + (this.field_7331eae7_Dne.nextDouble() - 0.5) * 8.0 - chN2.field_2e5f16_bzF * d;
        return this.method_296195b_bzF(d2, d3, d4);
    }

    @Override
    protected sMa method_2314d444_Dne() {
        FiG fiG = this.field_36c4f18_Dne.method_c32e43ea_FWm(this, 64.0);
        if (fiG != null) {
            if (this.method_6227539a_bzF(fiG)) {
                this.field_21261e_FWm = true;
                if (this.field_2592c3_One == 0) {
                    this.field_36c4f18_Dne.method_a36f5f6a_Dne(fiG, "mob.endermen.stare", 1.0f, 1.0f);
                }
                if (this.field_2592c3_One++ == 5) {
                    this.field_2592c3_One = 0;
                    this.method_117d59bb_FWm(true);
                    return fiG;
                }
            } else {
                this.field_2592c3_One = 0;
            }
        }
        return null;
    }
}

