package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public abstract class FiG
extends FUH
implements gnI {
    public double field_26818a_RPx;
    private NMq field_36a761a_Dne;
    public double field_215b31_FfS;
    public Pdb field_20257f3d_FWm;
    public float field_2fb646_exS;
    protected boolean field_36e4eb_vSL;
    private iSh field_20309d6d_FWm;
    protected SCY field_36c9383_Dne;
    public float field_30e9da_iNQ;
    private fTB field_3757398_Dne;
    public cQz field_3741200_Dne = null;
    private boolean field_2092bf_Dne;
    protected int field_2592c3_One = 0;
    public double field_36e4d5_vSL;
    public float field_22c9a1_JLG;
    public int field_2f0276_eHV;
    public float field_228593_IYC;
    public iSh field_376d18e_Dne;
    private iSh field_75be9f7b_bzF;
    public float field_37e098_xXN;
    public double field_3393d8_oIf;
    public double field_2569d0_OdI;
    private int field_2092ae_Dne;
    public MOS field_36a059b_Dne = new MOS(this);
    private int field_20b341_EWz = 0;
    public String field_bc57ecbf_aFZ;
    private int field_21260d_FWm;
    protected float field_1fcf1a_CZC = 0.1f;
    public float field_298de0_YHU;
    public int field_2a7663_ZgS = 0;
    public uqg field_37cb681_Dne;
    public double field_212c16_EyB;
    public int field_332a64_mlD;
    public byte field_2092a7_Dne = 0;
    protected float field_2435c2_LoG = 0.02f;
    public Pdb field_36bb35e_Dne;

    @Override
    protected boolean method_7db29416_Fnk() {
        return true;
    }

    public void method_2d24817a_Dne(boolean bl, boolean bl2, boolean bl3) {
        this.method_16b621a_Dne(0.6f, 1.8f);
        this.method_d44b4592_zGp();
        iSh iSh2 = this.field_376d18e_Dne;
        iSh iSh3 = this.field_376d18e_Dne;
        if (iSh2 != null && this.field_36c4f18_Dne.method_2c2cf7bc_Dne(iSh2.field_2092ae_Dne, iSh2.field_21260d_FWm, iSh2.field_2e5f1b_bzF) == zKP.field_d57af75_FfS.field_21260d_FWm) {
            rTW.method_f9bf47a4_Dne(this.field_36c4f18_Dne, iSh2.field_2092ae_Dne, iSh2.field_21260d_FWm, iSh2.field_2e5f1b_bzF, false);
            iSh3 = rTW.method_7024faa6_Dne(this.field_36c4f18_Dne, iSh2.field_2092ae_Dne, iSh2.field_21260d_FWm, iSh2.field_2e5f1b_bzF, 0);
            if (iSh3 == null) {
                iSh3 = new iSh(iSh2.field_2092ae_Dne, iSh2.field_21260d_FWm + 1, iSh2.field_2e5f1b_bzF);
            }
            this.method_2961957_bzF((float)iSh3.field_2092ae_Dne + 0.5f, (float)iSh3.field_21260d_FWm + this.field_36b0a6_udO + 0.1f, (float)iSh3.field_2e5f1b_bzF + 0.5f);
        }
        this.field_36e4eb_vSL = false;
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ && bl2) {
            this.field_36c4f18_Dne.method_9a443a99_XHL();
        }
        this.field_2092ae_Dne = bl ? 0 : 100;
        if (bl3) {
            this.method_addf466b_Dne(this.field_376d18e_Dne, false);
        }
    }

    @Override
    protected void method_8d0b776f_One() {
        super.method_8d0b776f_One();
        this.method_df3461c5_Dne(trP.field_328659e9_trS, 1);
        if (this.method_73aaafc7_ATE()) {
            this.method_87b72d60_aFZ(0.8f);
        } else {
            this.method_87b72d60_aFZ(0.2f);
        }
    }

    public void method_7c9aa178_Dne(MqS mqS) {
    }

    public void method_7ad38803_DyG() {
    }

    public int method_ae9f0465_ceE() {
        return this.field_2092ae_Dne;
    }

    private boolean method_7c82ec32_FYZ() {
        return this.field_36c4f18_Dne.method_2c2cf7bc_Dne(this.field_376d18e_Dne.field_2092ae_Dne, this.field_376d18e_Dne.field_21260d_FWm, this.field_376d18e_Dne.field_2e5f1b_bzF) == zKP.field_d57af75_FfS.field_21260d_FWm;
    }

    public boolean method_c74bdb2c_Dne(zKP zKP2) {
        return this.field_36a059b_Dne.method_c74bdb2c_Dne(zKP2);
    }

    protected void method_60fb4aed_FWm(NMq nMq, int n) {
        if (nMq.method_230ed2bd_Dne() == een.field_75bd124b_bzF) {
            this.method_fbd4aee4_Dne("random.drink", 0.5f, this.field_36c4f18_Dne.field_7331eae7_Dne.nextFloat() * 0.1f + 0.9f);
        }
        if (nMq.method_230ed2bd_Dne() == een.field_202f103d_FWm) {
            for (int i = 0; i < n; ++i) {
                chN chN2 = this.field_36c4f18_Dne.method_23186a47_Dne().method_e4505d6c_Dne(((double)this.field_7331eae7_Dne.nextFloat() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
                chN2.method_ce7f5266_Dne(-this.field_29186a_XHL * (float)Math.PI / 180.0f);
                chN2.method_117d0ea7_FWm(-this.field_334489_mrb * (float)Math.PI / 180.0f);
                chN chN3 = this.field_36c4f18_Dne.method_23186a47_Dne().method_e4505d6c_Dne(((double)this.field_7331eae7_Dne.nextFloat() - 0.5) * 0.3, (double)(-this.field_7331eae7_Dne.nextFloat()) * 0.6 - 0.3, 0.6);
                chN3.method_ce7f5266_Dne(-this.field_29186a_XHL * (float)Math.PI / 180.0f);
                chN3.method_117d0ea7_FWm(-this.field_334489_mrb * (float)Math.PI / 180.0f);
                chN3 = chN3.method_2c4d3b9f_bzF(this.field_2f0dd3_div, this.field_22c5fd_IjH + (double)this.method_59ee189_c_(), this.field_334487_mrb);
                this.field_36c4f18_Dne.method_8600ec24_Dne("iconcrack_" + nMq.method_230de6ba_Dne().field_267cf5_Qnq, chN3.field_2092a9_Dne, chN3.field_212608_FWm, chN3.field_2e5f16_bzF, chN2.field_2092a9_Dne, chN2.field_212608_FWm + 0.05, chN2.field_2e5f16_bzF);
            }
            this.method_fbd4aee4_Dne("random.eat", 0.5f + 0.5f * (float)this.field_7331eae7_Dne.nextInt(2), (this.field_7331eae7_Dne.nextFloat() - this.field_7331eae7_Dne.nextFloat()) * 0.2f + 1.0f);
        }
    }

    @Override
    public String method_c6f17a40_aFZ() {
        return YGE.method_fd2f7d86_Dne(this.method_2308e8b4_Dne(), this.field_bc57ecbf_aFZ);
    }

    @Override
    public void method_6f1922ee_Dne(FUH fUH) {
        if (fUH instanceof ZFz) {
            this.method_831230fe_Dne(qlg.field_aef5cb30_udO);
        }
    }

    public void method_c900b3c7_Dne(zio zio2) {
    }

    public boolean method_590ca1c_b_() {
        return false;
    }

    @Override
    public void method_5606342_FWm(sMa sMa2, int n) {
        this.method_dc4a39ce_udO(n);
        Collection<vfE> collection = this.method_23062a3d_Dne().method_b2c709d5_Dne(PAf.field_5e549f3e_Qnq);
        if (sMa2 instanceof FiG) {
            this.method_df3461c5_Dne(trP.field_d4582cb_FfS, 1);
            collection.addAll(this.method_23062a3d_Dne().method_b2c709d5_Dne(PAf.field_75b2fe64_bzF));
        } else {
            this.method_df3461c5_Dne(trP.field_75785930_EyB, 1);
        }
        for (vfE vfE2 : collection) {
            OHz oHz = this.method_23062a3d_Dne().method_938dc1b8_Dne(this.method_eecad346_Dne(), vfE2);
            oHz.method_7a46289a_Dne();
        }
    }

    @Override
    public boolean method_147b2066_Dne(zBn zBn2, int n) {
        if (this.method_7c861acb_EyB()) {
            return false;
        }
        if (this.field_37cb681_Dne.field_2092bf_Dne && !zBn2.method_907a9d25_Qnq()) {
            return false;
        }
        this.field_295784_Wwe = 0;
        if (this.method_9a443a8c_XHL() <= 0) {
            return false;
        }
        if (this.method_9b310ff4_Wwe() && !this.field_36c4f18_Dne.field_2d2a05_aFZ) {
            this.method_2d24817a_Dne(true, true, false);
        }
        if (zBn2.method_d44b4596_zGp()) {
            if (this.field_36c4f18_Dne.field_2d29f4_aFZ == 0) {
                // empty if block
            }
            if (this.field_36c4f18_Dne.field_2d29f4_aFZ == 1) {
                n = n / 2 + 1;
            }
            if (this.field_36c4f18_Dne.field_2d29f4_aFZ == 3) {
                n = n * 3 / 2;
            }
        }
        if (n == 0) {
            return false;
        }
        sMa sMa2 = zBn2.method_f88b2463_FWm();
        if (sMa2 instanceof hhc && ((hhc)sMa2).field_75c313d2_bzF != null) {
            sMa2 = ((hhc)sMa2).field_75c313d2_bzF;
        }
        if (sMa2 instanceof FUH) {
            this.method_740beda6_Dne((FUH)sMa2, false);
        }
        this.method_df3461c5_Dne(trP.field_719b5412_Vxn, n);
        return super.method_147b2066_Dne(zBn2, n);
    }

    @Override
    public int method_7a46288d_Dne() {
        return 20;
    }

    public int method_7c861aba_EyB() {
        return this.field_2f0276_eHV >= 30 ? 62 + (this.field_2f0276_eHV - 30) * 7 : (this.field_2f0276_eHV >= 15 ? 17 + (this.field_2f0276_eHV - 15) * 3 : 17);
    }

    public boolean method_7bcedb59_Dne(int n, int n2, int n3, int n4, NMq nMq) {
        return this.field_37cb681_Dne.field_2d2a05_aFZ ? true : (nMq != null ? nMq.method_c073dafc_mrb() : false);
    }

    @Override
    protected int method_70328496_Dne(FiG fiG) {
        if (this.field_36c4f18_Dne.method_230cbc5a_Dne().method_8f501fe8_Dne("keepInventory")) {
            return 0;
        }
        int n = this.field_2f0276_eHV * 7;
        return n > 100 ? 100 : n;
    }

    @Override
    public void method_66a36cd8_FWm(WkD wkD) {
        super.method_66a36cd8_FWm(wkD);
        mbZ mbZ2 = wkD.method_285baa50_Dne("Inventory");
        this.field_36a059b_Dne.method_b2658362_Dne(mbZ2);
        this.field_36a059b_Dne.field_2092ae_Dne = wkD.method_8f501fd7_Dne("SelectedItemSlot");
        this.field_36e4eb_vSL = wkD.method_110c4dc7_FWm("Sleeping");
        this.field_2092ae_Dne = wkD.method_8f501fe1_Dne("SleepTimer");
        this.field_30e9da_iNQ = wkD.method_8f501fd4_Dne("XpP");
        this.field_2f0276_eHV = wkD.method_8f501fd7_Dne("XpLevel");
        this.field_332a64_mlD = wkD.method_8f501fd7_Dne("XpTotal");
        this.method_99cf5f41_kGO(wkD.method_8f501fd7_Dne("Score"));
        if (this.field_36e4eb_vSL) {
            this.field_376d18e_Dne = new iSh(geR.method_117d0718_FWm(this.field_2f0dd3_div), geR.method_117d0718_FWm(this.field_22c5fd_IjH), geR.method_117d0718_FWm(this.field_334487_mrb));
            this.method_2d24817a_Dne(true, true, false);
        }
        if (wkD.method_8f501fe8_Dne("SpawnX") && wkD.method_8f501fe8_Dne("SpawnY") && wkD.method_8f501fe8_Dne("SpawnZ")) {
            this.field_20309d6d_FWm = new iSh(wkD.method_8f501fd7_Dne("SpawnX"), wkD.method_8f501fd7_Dne("SpawnY"), wkD.method_8f501fd7_Dne("SpawnZ"));
            this.field_2092bf_Dne = wkD.method_110c4dc7_FWm("SpawnForced");
        }
        this.field_36c9383_Dne.method_8d4fb917_Dne(wkD);
        this.field_37cb681_Dne.method_66a36cd8_FWm(wkD);
        if (wkD.method_8f501fe8_Dne("EnderItems")) {
            mbZ mbZ3 = wkD.method_285baa50_Dne("EnderItems");
            this.field_3757398_Dne.method_b2658362_Dne(mbZ3);
        }
    }

    public void method_adf18883_Dne(YzO yzO, String string) {
    }

    public int method_998e661c_Vxn() {
        return this.field_378ab08_Dne.method_ce7f5d9c_Dne(18);
    }

    @Override
    public float method_59ee189_c_() {
        return 0.12f;
    }

    public void method_94d18be1_FWm(sMa sMa2) {
    }

    public void method_907a9d21_Qnq() {
    }

    public void method_88b748b3_Dne(UTs uTs) {
    }

    public void method_961ec291_Dne(FiG fiG, boolean bl) {
        if (bl) {
            this.field_36a059b_Dne.method_7abb8256_Dne(fiG.field_36a059b_Dne);
            this.field_28e7fd_Vxn = fiG.field_28e7fd_Vxn;
            this.field_36c9383_Dne = fiG.field_36c9383_Dne;
            this.field_2f0276_eHV = fiG.field_2f0276_eHV;
            this.field_332a64_mlD = fiG.field_332a64_mlD;
            this.field_30e9da_iNQ = fiG.field_30e9da_iNQ;
            this.method_99cf5f41_kGO(fiG.method_998e661c_Vxn());
            this.field_1ed017_ATE = fiG.field_1ed017_ATE;
        } else if (this.field_36c4f18_Dne.method_230cbc5a_Dne().method_8f501fe8_Dne("keepInventory")) {
            this.field_36a059b_Dne.method_7abb8256_Dne(fiG.field_36a059b_Dne);
            this.field_2f0276_eHV = fiG.field_2f0276_eHV;
            this.field_332a64_mlD = fiG.field_332a64_mlD;
            this.field_30e9da_iNQ = fiG.field_30e9da_iNQ;
            this.method_99cf5f41_kGO(fiG.method_998e661c_Vxn());
        }
        this.field_3757398_Dne = fiG.field_3757398_Dne;
    }

    public boolean method_80692b1e_ICU() {
        return this.method_9a443a8c_XHL() > 0 && this.method_9a443a8c_XHL() < this.method_7a46288d_Dne();
    }

    @Override
    public void method_73aaafc3_ATE() {
        this.field_36b0a6_udO = 1.62f;
        this.method_16b621a_Dne(0.6f, 1.8f);
        super.method_73aaafc3_ATE();
        this.method_143f9e1c_bzF(this.method_7a46288d_Dne());
        this.field_36e4da_vSL = 0;
    }

    public JiM method_21b69c9d_Dne(boolean bl) {
        return this.method_4ed6cb02_Dne(this.field_36a059b_Dne.method_9046b659_Dne(this.field_36a059b_Dne.field_2092ae_Dne, bl && this.field_36a059b_Dne.method_23040479_Dne() != null ? this.field_36a059b_Dne.method_23040479_Dne().field_2092ae_Dne : 1), false);
    }

    public void method_6783319e_Dne(Aem aem) {
    }

    public boolean method_a6aca7ce_FWm(int n, int n2, int n3) {
        if (this.field_37cb681_Dne.field_2d2a05_aFZ) {
            return true;
        }
        int n4 = this.field_36c4f18_Dne.method_2c2cf7bc_Dne(n, n2, n3);
        if (n4 > 0) {
            NMq nMq;
            zKP zKP2 = zKP.field_8374b848_Dne[n4];
            if (zKP2.field_368fd23_Dne.method_8288d6f2_IjH()) {
                return true;
            }
            if (this.method_22900b26_bzF() != null && ((nMq = this.method_22900b26_bzF()).method_c74bdb2c_Dne(zKP2) || nMq.method_c74bdb18_Dne(zKP2) > 1.0f)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int method_9feec6b5_Zpi() {
        return this.field_36a059b_Dne.method_ae128dba_bzF();
    }

    @Override
    public boolean method_49863868_FWm(FiG fiG) {
        if (!this.method_998e662d_Vxn()) {
            return false;
        }
        YGE yGE = this.method_2308e8b4_Dne();
        return yGE == null || fiG == null || fiG.method_2308e8b4_Dne() != yGE || !yGE.method_7c6f603d_FWm();
    }

    @Override
    public String method_eecad346_Dne() {
        return this.field_bc57ecbf_aFZ;
    }

    public void method_9f50959e_ZfC() {
        if (this.field_36a761a_Dne != null) {
            this.field_36a761a_Dne.method_81a83afa_FWm(this.field_36c4f18_Dne, this, this.field_21260d_FWm);
        }
        this.method_7c82ec2e_FYZ();
    }

    public void method_fd8868e_Dne(NMq nMq, int n) {
        if (nMq != this.field_36a761a_Dne) {
            this.field_36a761a_Dne = nMq;
            this.field_21260d_FWm = n;
            if (!this.field_36c4f18_Dne.field_2d2a05_aFZ) {
                this.method_87b77874_aFZ(true);
            }
        }
    }

    @Override
    public String method_193de2e9_a_() {
        return this.field_bc57ecbf_aFZ;
    }

    @Override
    public boolean method_b077c666_eHV() {
        return super.method_b077c666_eHV();
    }

    public void method_5b092153_Dne(int n, int n2, int n3, String string) {
    }

    @Override
    protected boolean method_7c6f603d_FWm() {
        return !this.field_37cb681_Dne.field_21261e_FWm;
    }

    @Override
    public void method_fbd4aee4_Dne(String string, float f, float f2) {
        this.field_36c4f18_Dne.method_2d5bac6d_Dne(this, string, f, f2);
    }

    public NSR method_d981b6ed_Dne(int n, int n2, int n3) {
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ) {
            if (this.method_9b310ff4_Wwe() || !this.method_cd4cb3d9_udO()) {
                return NSR.field_712e0d25_aFZ;
            }
            if (!this.field_36c4f18_Dne.field_3690d00_Dne.method_7a46289e_Dne()) {
                return NSR.field_202454be_FWm;
            }
            if (this.field_36c4f18_Dne.method_7a46289e_Dne()) {
                return NSR.field_75b256cc_bzF;
            }
            if (Math.abs(this.field_2f0dd3_div - (double)n) > 3.0 || Math.abs(this.field_22c5fd_IjH - (double)n2) > 2.0 || Math.abs(this.field_334487_mrb - (double)n3) > 3.0) {
                return NSR.field_5e53f7a6_Qnq;
            }
            double d = 8.0;
            double d2 = 5.0;
            List list = this.field_36c4f18_Dne.method_9314b7e8_Dne(LHi.class, bSp.method_23186cf1_Dne().method_b4ea3e0c_Dne((double)n - d, (double)n2 - d2, (double)n3 - d, (double)n + d, (double)n2 + d2, (double)n3 + d));
            if (!list.isEmpty()) {
                return NSR.field_f09c47d7_zGp;
            }
        }
        this.method_16b621a_Dne(0.2f, 0.2f);
        this.field_36b0a6_udO = 0.2f;
        if (this.field_36c4f18_Dne.method_2dee780_bzF(n, n2, n3)) {
            int n4 = this.field_36c4f18_Dne.method_2dee76f_bzF(n, n2, n3);
            int n5 = rTW.method_7ed979f5_Qnq(n4);
            float f = 0.5f;
            float f2 = 0.5f;
            switch (n5) {
                case 0: {
                    f2 = 0.9f;
                    break;
                }
                case 1: {
                    f = 0.1f;
                    break;
                }
                case 2: {
                    f2 = 0.1f;
                    break;
                }
                case 3: {
                    f = 0.9f;
                }
            }
            this.method_bf803543_trS(n5);
            this.method_2961957_bzF((float)n + f, (float)n2 + 0.9375f, (float)n3 + f2);
        } else {
            this.method_2961957_bzF((float)n + 0.5f, (float)n2 + 0.9375f, (float)n3 + 0.5f);
        }
        this.field_36e4eb_vSL = true;
        this.field_2092ae_Dne = 0;
        this.field_376d18e_Dne = new iSh(n, n2, n3);
        this.field_2a9ad1_Zpi = 0.0;
        this.field_31b811_kGO = 0.0;
        this.field_291868_XHL = 0.0;
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ) {
            this.field_36c4f18_Dne.method_9a443a99_XHL();
        }
        return NSR.field_36a88df_Dne;
    }

    public NMq method_f87a5498_FWm() {
        return this.field_36a761a_Dne;
    }

    public boolean method_c738b198_qrB() {
        return this.field_36e4eb_vSL && this.field_2092ae_Dne >= 100;
    }

    public boolean method_703284a7_Dne(FiG fiG) {
        YGE yGE;
        YGE yGE2 = this.method_2308e8b4_Dne();
        return yGE2 != (yGE = fiG.method_2308e8b4_Dne()) ? true : (yGE2 != null ? yGE2.method_7a46289e_Dne() : true);
    }

    @Override
    public void method_7a46289a_Dne() {
        if (this.field_36a761a_Dne != null) {
            NMq nMq = this.field_36a059b_Dne.method_23040479_Dne();
            if (nMq == this.field_36a761a_Dne) {
                if (this.field_21260d_FWm <= 25 && this.field_21260d_FWm % 4 == 0) {
                    this.method_60fb4aed_FWm(nMq, 5);
                }
                if (--this.field_21260d_FWm == 0 && !this.field_36c4f18_Dne.field_2d2a05_aFZ) {
                    this.method_c5287a5e_qLR();
                }
            } else {
                this.method_7c82ec2e_FYZ();
            }
        }
        if (this.field_2a7663_ZgS > 0) {
            --this.field_2a7663_ZgS;
        }
        if (this.method_9b310ff4_Wwe()) {
            ++this.field_2092ae_Dne;
            if (this.field_2092ae_Dne > 100) {
                this.field_2092ae_Dne = 100;
            }
            if (!this.field_36c4f18_Dne.field_2d2a05_aFZ) {
                if (!this.method_7c82ec32_FYZ()) {
                    this.method_2d24817a_Dne(true, true, false);
                } else if (this.field_36c4f18_Dne.method_7a46289e_Dne()) {
                    this.method_2d24817a_Dne(false, true, true);
                }
            }
        } else if (this.field_2092ae_Dne > 0) {
            ++this.field_2092ae_Dne;
            if (this.field_2092ae_Dne >= 110) {
                this.field_2092ae_Dne = 0;
            }
        }
        super.method_7a46289a_Dne();
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ && this.field_20257f3d_FWm != null && !this.field_20257f3d_FWm.method_703284a7_Dne(this)) {
            this.method_a98a0660_aFZ();
            this.field_20257f3d_FWm = this.field_36bb35e_Dne;
        }
        if (this.method_cc5ef5c4_trS() && this.field_37cb681_Dne.field_2092bf_Dne) {
            this.method_7c861ac7_EyB();
        }
        this.field_212c16_EyB = this.field_3393d8_oIf;
        this.field_215b31_FfS = this.field_36e4d5_vSL;
        this.field_2569d0_OdI = this.field_26818a_RPx;
        double d = this.field_2f0dd3_div - this.field_3393d8_oIf;
        double d2 = this.field_22c5fd_IjH - this.field_36e4d5_vSL;
        double d3 = this.field_334487_mrb - this.field_26818a_RPx;
        double d4 = 10.0;
        if (d > d4) {
            this.field_212c16_EyB = this.field_3393d8_oIf = this.field_2f0dd3_div;
        }
        if (d3 > d4) {
            this.field_2569d0_OdI = this.field_26818a_RPx = this.field_334487_mrb;
        }
        if (d2 > d4) {
            this.field_215b31_FfS = this.field_36e4d5_vSL = this.field_22c5fd_IjH;
        }
        if (d < -d4) {
            this.field_212c16_EyB = this.field_3393d8_oIf = this.field_2f0dd3_div;
        }
        if (d3 < -d4) {
            this.field_2569d0_OdI = this.field_26818a_RPx = this.field_334487_mrb;
        }
        if (d2 < -d4) {
            this.field_215b31_FfS = this.field_36e4d5_vSL = this.field_22c5fd_IjH;
        }
        this.field_3393d8_oIf += d * 0.25;
        this.field_26818a_RPx += d3 * 0.25;
        this.field_36e4d5_vSL += d2 * 0.25;
        this.method_df3461c5_Dne(trP.field_f09dfd3b_zGp, 1);
        if (this.field_203511c4_FWm == null) {
            this.field_75be9f7b_bzF = null;
        }
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ) {
            this.field_36c9383_Dne.method_703284a3_Dne(this);
        }
    }

    @Override
    public void method_ce109fc6_vSL() {
        double d = this.field_2f0dd3_div;
        double d2 = this.field_22c5fd_IjH;
        double d3 = this.field_334487_mrb;
        float f = this.field_334489_mrb;
        float f2 = this.field_29186a_XHL;
        super.method_ce109fc6_vSL();
        this.field_37e098_xXN = this.field_228593_IYC;
        this.field_228593_IYC = 0.0f;
        this.method_6f96259b_DyG(this.field_2f0dd3_div - d, this.field_22c5fd_IjH - d2, this.field_334487_mrb - d3);
        if (this.field_203511c4_FWm instanceof fNv) {
            this.field_29186a_XHL = f2;
            this.field_334489_mrb = f;
            this.field_22c5ff_IjH = ((fNv)this.field_203511c4_FWm).field_22c5ff_IjH;
        }
    }

    public JiM method_c9a088b8_Dne(NMq nMq) {
        return this.method_4ed6cb02_Dne(nMq, false);
    }

    @Override
    public NMq[] method_56f900f6_Dne() {
        return this.field_36a059b_Dne.field_fde07376_FWm;
    }

    @Override
    public boolean method_c3b4a2d4_ooe() {
        return !this.field_36e4eb_vSL && super.method_c3b4a2d4_ooe();
    }

    public boolean method_b6f3e1a2_haP() {
        return this.field_36a761a_Dne != null;
    }

    @Override
    protected boolean method_c5dec331_qXo() {
        return this.method_9a443a8c_XHL() <= 0 || this.method_9b310ff4_Wwe();
    }

    public float method_9a443a89_XHL() {
        int n = 0;
        for (NMq nMq : this.field_36a059b_Dne.field_fde07376_FWm) {
            if (nMq == null) continue;
            ++n;
        }
        return (float)n / (float)this.field_36a059b_Dne.field_fde07376_FWm.length;
    }

    @Override
    public boolean method_c19d9a0d_oIf() {
        return !this.field_37cb681_Dne.field_21261e_FWm;
    }

    public irb method_2310d392_Dne() {
        return irb.method_2310d392_Dne();
    }

    protected void method_1e26d62a_FWm(int n, boolean bl) {
        byte by = this.field_378ab08_Dne.method_ce7f5d95_Dne(16);
        if (bl) {
            this.field_378ab08_Dne.method_62ca2346_FWm(16, (byte)(by | 1 << n));
        } else {
            this.field_378ab08_Dne.method_62ca2346_FWm(16, (byte)(by & ~(1 << n)));
        }
    }

    public void method_70efe4c_IjH(sMa sMa2) {
        if (sMa2.method_ae128dcb_bzF() && !sMa2.method_94d18be5_FWm(this)) {
            int n = this.field_36a059b_Dne.method_bb7dd813_Dne(sMa2);
            if (this.method_857f23ec_Dne(SXd.field_f09ea2a5_zGp)) {
                n += 3 << this.method_a7927c94_Dne(SXd.field_f09ea2a5_zGp).method_ae128dba_bzF();
            }
            if (this.method_857f23ec_Dne(SXd.field_719bf97c_Vxn)) {
                n -= 2 << this.method_a7927c94_Dne(SXd.field_719bf97c_Vxn).method_ae128dba_bzF();
            }
            int n2 = 0;
            int n3 = 0;
            if (sMa2 instanceof FUH) {
                n3 = UYp.method_d8697d0d_Dne(this, (FUH)sMa2);
                n2 += UYp.method_97c4f9ec_FWm(this, (FUH)sMa2);
            }
            if (this.method_73aaafc7_ATE()) {
                ++n2;
            }
            if (n > 0 || n3 > 0) {
                eKx eKx2;
                boolean bl;
                boolean bl2;
                boolean bl3 = bl2 = this.field_2e8483_ceE > 0.0f && !this.field_2d2a05_aFZ && !this.method_b0a28148_div() && !this.method_9feec6c6_Zpi() && !this.method_857f23ec_Dne(SXd.field_3286ff53_trS) && this.field_203511c4_FWm == null && sMa2 instanceof FUH;
                if (bl2 && n > 0) {
                    n += this.field_7331eae7_Dne.nextInt(n / 2 + 2);
                }
                n += n3;
                boolean bl4 = false;
                int n4 = UYp.method_6f1922e1_Dne(this);
                if (sMa2 instanceof FUH && n4 > 0 && !sMa2.method_cc5ef5c4_trS()) {
                    bl4 = true;
                    sMa2.method_87b738a3_aFZ(1);
                }
                if (bl = sMa2.method_147b2066_Dne(zBn.method_53f50aae_Dne(this), n)) {
                    if (n2 > 0) {
                        sMa2.method_2e2893bd_Qnq(-geR.method_ce7f5256_Dne(this.field_334489_mrb * (float)Math.PI / 180.0f) * (float)n2 * 0.5f, 0.1, geR.method_117d0e97_FWm(this.field_334489_mrb * (float)Math.PI / 180.0f) * (float)n2 * 0.5f);
                        this.field_291868_XHL *= 0.6;
                        this.field_31b811_kGO *= 0.6;
                        this.method_aad4531d_a_(false);
                    }
                    if (bl2) {
                        this.method_bb7dd820_Dne(sMa2);
                    }
                    if (n3 > 0) {
                        this.method_94d18be1_FWm(sMa2);
                    }
                    if (n >= 18) {
                        this.method_831230fe_Dne(qlg.field_9f26b916_RPx);
                    }
                    this.method_daa0b257_DyG(sMa2);
                    if (sMa2 instanceof FUH) {
                        kqp.method_1ddea214_Dne(this, (FUH)sMa2, this.field_7331eae7_Dne);
                    }
                }
                NMq nMq = this.method_22900b26_bzF();
                sMa sMa3 = sMa2;
                if (sMa2 instanceof Dur && (eKx2 = ((Dur)sMa2).field_374e3fa_Dne) != null && eKx2 instanceof FUH) {
                    sMa3 = (FUH)((Object)eKx2);
                }
                if (nMq != null && sMa3 instanceof FUH) {
                    nMq.method_d982decf_Dne((FUH)sMa3, this);
                    if (nMq.field_2092ae_Dne <= 0) {
                        this.method_74d3fa75_BJH();
                    }
                }
                if (sMa2 instanceof FUH) {
                    if (sMa2.method_cd4cb3d9_udO()) {
                        this.method_740beda6_Dne((FUH)sMa2, true);
                    }
                    this.method_df3461c5_Dne(trP.field_35cb9f2c_ATE, n);
                    if (n4 > 0 && bl) {
                        sMa2.method_87b738a3_aFZ(n4 * 4);
                    } else if (bl4) {
                        sMa2.method_7c861ac7_EyB();
                    }
                }
                this.method_87b72d60_aFZ(0.3f);
            }
        }
    }

    @Override
    public boolean method_7ac07071_EWz() {
        return false;
    }

    @Override
    public boolean method_9b310ff4_Wwe() {
        return this.field_36e4eb_vSL;
    }

    @Override
    protected void method_8692166d_LVR() {
    }

    public NMq method_22900b26_bzF() {
        return this.field_36a059b_Dne.method_23040479_Dne();
    }

    @Override
    public void method_8288d6ee_IjH() {
        List list;
        if (this.field_2592c3_One > 0) {
            --this.field_2592c3_One;
        }
        if (this.field_36c4f18_Dne.field_2d29f4_aFZ == 0 && this.method_9a443a8c_XHL() < this.method_7a46288d_Dne() && this.field_388da6_zGp % 20 * 12 == 0) {
            this.method_ce7f5da9_Dne(1);
        }
        this.field_36a059b_Dne.method_7a46289a_Dne();
        this.field_37e098_xXN = this.field_228593_IYC;
        super.method_8288d6ee_IjH();
        this.field_295781_Wwe = this.field_37cb681_Dne.method_7c6f6029_FWm();
        this.field_2f0c42_eJi = this.field_2435c2_LoG;
        if (this.method_73aaafc7_ATE()) {
            this.field_295781_Wwe = (float)((double)this.field_295781_Wwe + (double)this.field_37cb681_Dne.method_7c6f6029_FWm() * 0.3);
            this.field_2f0c42_eJi = (float)((double)this.field_2f0c42_eJi + (double)this.field_2435c2_LoG * 0.3);
        }
        float f = geR.method_ce7f4ad4_Dne(this.field_291868_XHL * this.field_291868_XHL + this.field_31b811_kGO * this.field_31b811_kGO);
        float f2 = (float)Math.atan(-this.field_2a9ad1_Zpi * (double)0.2f) * 15.0f;
        if (f > 0.1f) {
            f = 0.1f;
        }
        if (!this.field_2d2a05_aFZ || this.method_9a443a8c_XHL() <= 0) {
            f = 0.0f;
        }
        if (this.field_2d2a05_aFZ || this.method_9a443a8c_XHL() <= 0) {
            f2 = 0.0f;
        }
        this.field_228593_IYC += (f - this.field_228593_IYC) * 0.4f;
        this.field_20b33e_EWz += (f2 - this.field_20b33e_EWz) * 0.8f;
        if (this.method_9a443a8c_XHL() > 0 && (list = this.field_36c4f18_Dne.method_71df22e6_FWm(this, this.field_373a3ed_Dne.method_b78565d7_FWm(1.0, 0.5, 1.0))) != null) {
            for (int i = 0; i < list.size(); ++i) {
                sMa sMa2 = (sMa)list.get(i);
                if (sMa2.field_2a9ae7_Zpi) continue;
                this.method_a876f082_mrb(sMa2);
            }
        }
    }

    public boolean method_86921671_LVR() {
        return this.field_2092bf_Dne;
    }

    public int method_c5287a51_qLR() {
        return this.field_21260d_FWm;
    }

    public void method_87b72d60_aFZ(float f) {
        if (!this.field_37cb681_Dne.field_2092bf_Dne && !this.field_36c4f18_Dne.field_2d2a05_aFZ) {
            this.field_36c9383_Dne.method_ce7f5266_Dne(f);
        }
    }

    protected void method_a98a0660_aFZ() {
        this.field_20257f3d_FWm = this.field_36bb35e_Dne;
    }

    @Override
    protected void method_b0a28144_div() {
        this.method_7ac0706d_EWz();
    }

    @Override
    public int method_d44b4585_zGp() {
        return this.field_37cb681_Dne.field_2092bf_Dne ? 0 : 80;
    }

    @Override
    public void method_5d73f9d_g_() {
        super.method_5d73f9d_g_();
        this.field_36bb35e_Dne.method_703284a3_Dne(this);
        if (this.field_20257f3d_FWm != null) {
            this.field_20257f3d_FWm.method_703284a3_Dne(this);
        }
    }

    protected void method_7708a159_Dne(JiM jiM) {
        this.field_36c4f18_Dne.method_94d18be5_FWm(jiM);
    }

    @Override
    public int method_7ad387f6_DyG() {
        return 10;
    }

    @Override
    protected void method_7c6f6039_FWm() {
        super.method_7c6f6039_FWm();
        this.field_378ab08_Dne.method_ad009545_Dne(16, (byte)0);
        this.field_378ab08_Dne.method_ad009545_Dne(17, (byte)0);
        this.field_378ab08_Dne.method_ad009545_Dne(18, 0);
    }

    private void method_6f96259b_DyG(double d, double d2, double d3) {
        int n;
        if (this.field_203511c4_FWm != null && (n = Math.round(geR.method_ce7f4ad4_Dne(d * d + d2 * d2 + d3 * d3) * 100.0f)) > 0) {
            if (this.field_203511c4_FWm instanceof Ebp) {
                this.method_df3461c5_Dne(trP.field_a21c6fab_kGO, n);
                if (this.field_75be9f7b_bzF == null) {
                    this.field_75be9f7b_bzF = new iSh(geR.method_117d0718_FWm(this.field_2f0dd3_div), geR.method_117d0718_FWm(this.field_22c5fd_IjH), geR.method_117d0718_FWm(this.field_334487_mrb));
                } else if ((double)this.field_75be9f7b_bzF.method_2c2cf7b9_Dne(geR.method_117d0718_FWm(this.field_2f0dd3_div), geR.method_117d0718_FWm(this.field_22c5fd_IjH), geR.method_117d0718_FWm(this.field_334487_mrb)) >= 1000000.0) {
                    this.method_df3461c5_Dne(qlg.field_615ed6dd_Zpi, 1);
                }
            } else if (this.field_203511c4_FWm instanceof iMX) {
                this.method_df3461c5_Dne(trP.field_aefce6be_udO, n);
            } else if (this.field_203511c4_FWm instanceof fNv) {
                this.method_df3461c5_Dne(trP.field_ab2502f9_ooe, n);
            }
        }
    }

    @Override
    public NMq method_77c1cdc9_FWm(int n) {
        return this.field_36a059b_Dne.method_9062e8fb_bzF(n);
    }

    private void method_bf803543_trS(int n) {
        this.field_298de0_YHU = 0.0f;
        this.field_2fb646_exS = 0.0f;
        switch (n) {
            case 0: {
                this.field_2fb646_exS = -1.8f;
                break;
            }
            case 1: {
                this.field_298de0_YHU = 1.8f;
                break;
            }
            case 2: {
                this.field_2fb646_exS = 1.8f;
                break;
            }
            case 3: {
                this.field_298de0_YHU = -1.8f;
            }
        }
    }

    public void method_887647a2_Dne(TpA tpA) {
    }

    public static iSh method_f27881f7_Dne(Qnq qnq, iSh iSh2, boolean bl) {
        ZfC zfC = qnq.method_f8802153_FWm();
        zfC.method_e1796070_FWm(iSh2.field_2092ae_Dne - 3 >> 4, iSh2.field_2e5f1b_bzF - 3 >> 4);
        zfC.method_e1796070_FWm(iSh2.field_2092ae_Dne + 3 >> 4, iSh2.field_2e5f1b_bzF - 3 >> 4);
        zfC.method_e1796070_FWm(iSh2.field_2092ae_Dne - 3 >> 4, iSh2.field_2e5f1b_bzF + 3 >> 4);
        zfC.method_e1796070_FWm(iSh2.field_2092ae_Dne + 3 >> 4, iSh2.field_2e5f1b_bzF + 3 >> 4);
        if (qnq.method_2c2cf7bc_Dne(iSh2.field_2092ae_Dne, iSh2.field_21260d_FWm, iSh2.field_2e5f1b_bzF) == zKP.field_d57af75_FfS.field_21260d_FWm) {
            iSh iSh3 = rTW.method_7024faa6_Dne(qnq, iSh2.field_2092ae_Dne, iSh2.field_21260d_FWm, iSh2.field_2e5f1b_bzF, 0);
            return iSh3;
        }
        KFd kFd = qnq.method_d9802b31_Dne(iSh2.field_2092ae_Dne, iSh2.field_21260d_FWm, iSh2.field_2e5f1b_bzF);
        KFd kFd2 = qnq.method_d9802b31_Dne(iSh2.field_2092ae_Dne, iSh2.field_21260d_FWm + 1, iSh2.field_2e5f1b_bzF);
        boolean bl2 = !kFd.method_7a46289e_Dne() && !kFd.method_907a9d25_Qnq();
        boolean bl3 = !kFd2.method_7a46289e_Dne() && !kFd2.method_907a9d25_Qnq();
        return bl && bl2 && bl3 ? iSh2 : null;
    }

    private void method_a876f082_mrb(sMa sMa2) {
        sMa2.method_21db0c6_a_(this);
    }

    @Override
    protected void method_147b2062_Dne(zBn zBn2, int n) {
        if (!this.method_7c861acb_EyB()) {
            if (!zBn2.method_ae128dcb_bzF() && this.method_74b6e2b9_AgF()) {
                n = 1 + n >> 1;
            }
            n = this.method_147b2055_Dne(zBn2, n);
            n = this.method_659de4b4_FWm(zBn2, n);
            this.method_87b72d60_aFZ(zBn2.method_7a46288a_Dne());
            int n2 = this.method_9a443a8c_XHL();
            this.method_143f9e1c_bzF(this.method_9a443a8c_XHL() - n);
            this.field_379ccee_Dne.method_7ae95ee1_Dne(zBn2, n2, n);
        }
    }

    public boolean method_ce7f9d7e_Dne(boolean bl) {
        return (bl || this.field_36c9383_Dne.method_7a46289e_Dne()) && !this.field_37cb681_Dne.field_2092bf_Dne;
    }

    public YGE method_2308e8b4_Dne() {
        return this.method_23062a3d_Dne().method_d74cc06b_bzF(this.field_bc57ecbf_aFZ);
    }

    @Override
    public void method_ad72a713_bzF(sMa sMa2) {
        if (this.field_203511c4_FWm == sMa2) {
            this.method_efba61a_aFZ(sMa2);
            if (this.field_203511c4_FWm != null) {
                this.field_203511c4_FWm.field_37b45e5_Dne = null;
            }
            this.field_203511c4_FWm = null;
        } else {
            super.method_ad72a713_bzF(sMa2);
        }
    }

    public void method_831230fe_Dne(RLC rLC) {
        this.method_df3461c5_Dne(rLC, 1);
    }

    public FiG(Qnq qnq) {
        super(qnq);
        this.field_3757398_Dne = new fTB();
        this.field_36c9383_Dne = new SCY();
        this.field_37cb681_Dne = new uqg();
        this.field_20257f3d_FWm = this.field_36bb35e_Dne = new ReE(this.field_36a059b_Dne, !qnq.field_2d2a05_aFZ, this);
        this.field_36b0a6_udO = 1.62f;
        iSh iSh2 = qnq.method_23105fed_Dne();
        this.method_9ce0fc65_FWm((double)iSh2.field_2092ae_Dne + 0.5, iSh2.field_21260d_FWm + 1, (double)iSh2.field_2e5f1b_bzF + 0.5, 0.0f, 0.0f);
        this.field_9e60dbde_Qnq = "humanoid";
        this.field_1f1786_AgF = 180.0f;
        this.field_20b857_DyG = 20;
        this.field_c480ca78_bzF = "/mob/char.png";
    }

    public void method_8d1afe0b_Dne(XHL xHL) {
    }

    @Override
    protected void method_c738b194_qrB() {
    }

    public void method_dc4a39ce_udO(int n) {
        int n2 = this.method_998e661c_Vxn();
        this.field_378ab08_Dne.method_62ca2346_FWm(18, n2 + n);
    }

    public void method_b18f6899_Dne(lqs lqs2) {
    }

    @Override
    public gDn method_cb99838e_Dne(NMq nMq, int n) {
        gDn gDn2 = super.method_cb99838e_Dne(nMq, n);
        if (nMq.field_2e5f1b_bzF == dEr.field_37c7eec_Dne.field_267cf5_Qnq && this.field_3741200_Dne != null) {
            gDn2 = dEr.field_37c7eec_Dne.method_230f3f9a_Dne();
        } else {
            if (nMq.method_230de6ba_Dne().method_7a46289e_Dne()) {
                return nMq.method_230de6ba_Dne().method_9051f17a_Dne(nMq.method_907a9d14_Qnq(), n);
            }
            if (this.field_36a761a_Dne != null && nMq.field_2e5f1b_bzF == dEr.field_3667432_Dne.field_267cf5_Qnq) {
                int n2 = nMq.method_d44b4585_zGp() - this.field_21260d_FWm;
                if (n2 >= 18) {
                    return dEr.field_3667432_Dne.method_77cd08ea_FWm(2);
                }
                if (n2 > 13) {
                    return dEr.field_3667432_Dne.method_77cd08ea_FWm(1);
                }
                if (n2 > 0) {
                    return dEr.field_3667432_Dne.method_77cd08ea_FWm(0);
                }
            }
        }
        return gDn2;
    }

    public void method_addf466b_Dne(iSh iSh2, boolean bl) {
        if (iSh2 != null) {
            this.field_20309d6d_FWm = new iSh(iSh2);
            this.field_2092bf_Dne = bl;
        } else {
            this.field_20309d6d_FWm = null;
            this.field_2092bf_Dne = false;
        }
    }

    protected boolean method_143f9e20_bzF(int n) {
        return (this.field_378ab08_Dne.method_ce7f5d95_Dne(16) & 1 << n) != 0;
    }

    public void method_e4ea49ac_zGp(double d, double d2, double d3) {
        if (this.field_203511c4_FWm == null) {
            if (this.method_76dab7e2_Dne(KFd.field_1411d34d_div)) {
                int n = Math.round(geR.method_ce7f4ad4_Dne(d * d + d2 * d2 + d3 * d3) * 100.0f);
                if (n > 0) {
                    this.method_df3461c5_Dne(trP.field_6165f26b_Zpi, n);
                    this.method_87b72d60_aFZ(0.015f * (float)n * 0.01f);
                }
            } else if (this.method_9feec6c6_Zpi()) {
                int n = Math.round(geR.method_ce7f4ad4_Dne(d * d + d3 * d3) * 100.0f);
                if (n > 0) {
                    this.method_df3461c5_Dne(trP.field_1415146d_div, n);
                    this.method_87b72d60_aFZ(0.015f * (float)n * 0.01f);
                }
            } else if (this.method_b0a28148_div()) {
                if (d2 > 0.0) {
                    this.method_df3461c5_Dne(trP.field_74f6d121_mrb, (int)Math.round(d2 * 100.0));
                }
            } else if (this.field_2d2a05_aFZ) {
                int n = Math.round(geR.method_ce7f4ad4_Dne(d * d + d3 * d3) * 100.0f);
                if (n > 0) {
                    this.method_df3461c5_Dne(trP.field_161f676c_DyG, n);
                    if (this.method_73aaafc7_ATE()) {
                        this.method_87b72d60_aFZ(0.099999994f * (float)n * 0.01f);
                    } else {
                        this.method_87b72d60_aFZ(0.01f * (float)n * 0.01f);
                    }
                }
            } else {
                int n = Math.round(geR.method_ce7f4ad4_Dne(d * d + d3 * d3) * 100.0f);
                if (n > 25) {
                    this.method_df3461c5_Dne(trP.field_1c2dcc82_XHL, n);
                }
            }
        }
    }

    public SFA method_23062a3d_Dne() {
        return this.field_36c4f18_Dne.method_23062a3d_Dne();
    }

    @Override
    protected void method_63ae1a3f_div(int n) {
        this.field_36a059b_Dne.method_117d19ea_FWm(n);
    }

    public fTB method_230f01f7_Dne() {
        return this.field_3757398_Dne;
    }

    public void method_7c82ec2e_FYZ() {
        this.field_36a761a_Dne = null;
        this.field_21260d_FWm = 0;
        if (!this.field_36c4f18_Dne.field_2d2a05_aFZ) {
            this.method_87b77874_aFZ(false);
        }
    }

    @Override
    public void method_5c54d0e1_Qnq(float f, float f2) {
        double d = this.field_2f0dd3_div;
        double d2 = this.field_22c5fd_IjH;
        double d3 = this.field_334487_mrb;
        if (this.field_37cb681_Dne.field_21261e_FWm && this.field_203511c4_FWm == null) {
            double d4 = this.field_2a9ad1_Zpi;
            float f3 = this.field_2f0c42_eJi;
            this.field_2f0c42_eJi = this.field_37cb681_Dne.method_7a46288a_Dne();
            super.method_5c54d0e1_Qnq(f, f2);
            this.field_2a9ad1_Zpi = d4 * 0.6;
            this.field_2f0c42_eJi = f3;
        } else {
            super.method_5c54d0e1_Qnq(f, f2);
        }
        this.method_e4ea49ac_zGp(this.field_2f0dd3_div - d, this.field_22c5fd_IjH - d2, this.field_334487_mrb - d3);
    }

    protected void method_d44b4592_zGp() {
        this.field_36b0a6_udO = 1.62f;
    }

    @Override
    public NMq method_9e6e1a08_Dne(int n) {
        return n == 0 ? this.field_36a059b_Dne.method_23040479_Dne() : this.field_36a059b_Dne.field_fde07376_FWm[n - 1];
    }

    public void method_2c2cf7c9_Dne(int n, int n2, int n3) {
    }

    @Override
    public NMq method_23040479_Dne() {
        return this.field_36a059b_Dne.method_23040479_Dne();
    }

    @Override
    public void method_ce7f4362_Dne(byte by) {
        if (by == 9) {
            this.method_c5287a5e_qLR();
        } else {
            super.method_ce7f4362_Dne(by);
        }
    }

    @Override
    public void method_cbcb3925_tgc() {
        if (!this.field_37cb681_Dne.field_21261e_FWm) {
            super.method_cbcb3925_tgc();
        }
    }

    @Override
    public boolean method_74b6e2b9_AgF() {
        return this.method_b6f3e1a2_haP() && dEr.field_836aa5b6_Dne[this.field_36a761a_Dne.field_2e5f1b_bzF].method_c9acc3b8_Dne(this.field_36a761a_Dne) == een.field_5e5eb325_Qnq;
    }

    public void method_74d3fa75_BJH() {
        this.field_36a059b_Dne.method_6e3a6b66_Dne(this.field_36a059b_Dne.field_2092ae_Dne, null);
    }

    public void method_a6aca7ca_FWm(int n, int n2, int n3) {
    }

    @Override
    public void method_8d4fb917_Dne(WkD wkD) {
        super.method_8d4fb917_Dne(wkD);
        wkD.method_58996597_Dne("Inventory", this.field_36a059b_Dne.method_32f71ece_Dne(new mbZ()));
        wkD.method_5ab44f9f_Dne("SelectedItemSlot", this.field_36a059b_Dne.field_2092ae_Dne);
        wkD.method_5ab48f70_Dne("Sleeping", this.field_36e4eb_vSL);
        wkD.method_5ab47529_Dne("SleepTimer", (short)this.field_2092ae_Dne);
        wkD.method_5ab4445c_Dne("XpP", this.field_30e9da_iNQ);
        wkD.method_5ab44f9f_Dne("XpLevel", this.field_2f0276_eHV);
        wkD.method_5ab44f9f_Dne("XpTotal", this.field_332a64_mlD);
        wkD.method_5ab44f9f_Dne("Score", this.method_998e661c_Vxn());
        if (this.field_20309d6d_FWm != null) {
            wkD.method_5ab44f9f_Dne("SpawnX", this.field_20309d6d_FWm.field_2092ae_Dne);
            wkD.method_5ab44f9f_Dne("SpawnY", this.field_20309d6d_FWm.field_21260d_FWm);
            wkD.method_5ab44f9f_Dne("SpawnZ", this.field_20309d6d_FWm.field_2e5f1b_bzF);
            wkD.method_5ab48f70_Dne("SpawnForced", this.field_2092bf_Dne);
        }
        this.field_36c9383_Dne.method_66a36cd8_FWm(wkD);
        this.field_37cb681_Dne.method_8d4fb917_Dne(wkD);
        wkD.method_58996597_Dne("EnderItems", this.field_3757398_Dne.method_23126806_Dne());
    }

    public JiM method_4ed6cb02_Dne(NMq nMq, boolean bl) {
        if (nMq == null) {
            return null;
        }
        JiM jiM = new JiM(this.field_36c4f18_Dne, this.field_2f0dd3_div, this.field_22c5fd_IjH - (double)0.3f + (double)this.method_59ee189_c_(), this.field_334487_mrb, nMq);
        jiM.field_21260d_FWm = 40;
        float f = 0.1f;
        if (bl) {
            float f2 = this.field_7331eae7_Dne.nextFloat() * 0.5f;
            float f3 = this.field_7331eae7_Dne.nextFloat() * (float)Math.PI * 2.0f;
            jiM.field_291868_XHL = -geR.method_ce7f5256_Dne(f3) * f2;
            jiM.field_31b811_kGO = geR.method_117d0e97_FWm(f3) * f2;
            jiM.field_2a9ad1_Zpi = 0.2f;
        } else {
            f = 0.3f;
            jiM.field_291868_XHL = -geR.method_ce7f5256_Dne(this.field_334489_mrb / 180.0f * (float)Math.PI) * geR.method_117d0e97_FWm(this.field_29186a_XHL / 180.0f * (float)Math.PI) * f;
            jiM.field_31b811_kGO = geR.method_117d0e97_FWm(this.field_334489_mrb / 180.0f * (float)Math.PI) * geR.method_117d0e97_FWm(this.field_29186a_XHL / 180.0f * (float)Math.PI) * f;
            jiM.field_2a9ad1_Zpi = -geR.method_ce7f5256_Dne(this.field_29186a_XHL / 180.0f * (float)Math.PI) * f + 0.1f;
            f = 0.02f;
            float f4 = this.field_7331eae7_Dne.nextFloat() * (float)Math.PI * 2.0f;
            jiM.field_291868_XHL += Math.cos(f4) * (double)(f *= this.field_7331eae7_Dne.nextFloat());
            jiM.field_2a9ad1_Zpi += (double)((this.field_7331eae7_Dne.nextFloat() - this.field_7331eae7_Dne.nextFloat()) * 0.1f);
            jiM.field_31b811_kGO += Math.sin(f4) * (double)f;
        }
        this.method_7708a159_Dne(jiM);
        this.method_df3461c5_Dne(trP.field_1f012f07_qLR, 1);
        return jiM;
    }

    public void method_117d19ea_FWm(int n) {
        this.field_2f0276_eHV += n;
        if (this.field_2f0276_eHV < 0) {
            this.field_2f0276_eHV = 0;
            this.field_30e9da_iNQ = 0.0f;
            this.field_332a64_mlD = 0;
        }
        if (n > 0 && this.field_2f0276_eHV % 5 == 0 && (float)this.field_20b341_EWz < (float)this.field_388da6_zGp - 100.0f) {
            float f = this.field_2f0276_eHV > 30 ? 1.0f : (float)this.field_2f0276_eHV / 30.0f;
            this.field_36c4f18_Dne.method_a36f5f6a_Dne(this, "random.levelup", f * 0.75f, 1.0f);
            this.field_20b341_EWz = this.field_388da6_zGp;
        }
    }

    @Override
    public void method_c6daaac1_Dne(zBn zBn2) {
        super.method_c6daaac1_Dne(zBn2);
        this.method_16b621a_Dne(0.2f, 0.2f);
        this.method_2961957_bzF(this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb);
        this.field_2a9ad1_Zpi = 0.1f;
        if (this.field_bc57ecbf_aFZ.equals("Notch")) {
            this.method_4ed6cb02_Dne(new NMq(dEr.field_7137dca1_aFZ, 1), true);
        }
        if (!this.field_36c4f18_Dne.method_230cbc5a_Dne().method_8f501fe8_Dne("keepInventory")) {
            this.field_36a059b_Dne.method_907a9d21_Qnq();
        }
        if (zBn2 != null) {
            this.field_291868_XHL = -geR.method_117d0e97_FWm((this.field_2f0273_eHV + this.field_334489_mrb) * (float)Math.PI / 180.0f) * 0.1f;
            this.field_31b811_kGO = -geR.method_ce7f5256_Dne((this.field_2f0273_eHV + this.field_334489_mrb) * (float)Math.PI / 180.0f) * 0.1f;
        } else {
            this.field_31b811_kGO = 0.0;
            this.field_291868_XHL = 0.0;
        }
        this.field_36b0a6_udO = 0.1f;
        this.method_df3461c5_Dne(trP.field_84fd841b_ceE, 1);
    }

    @Override
    protected void method_ce7f5266_Dne(float f) {
        if (!this.field_37cb681_Dne.field_2e5f2c_bzF) {
            if (f >= 2.0f) {
                this.method_df3461c5_Dne(trP.field_5bca797_IjH, (int)Math.round((double)f * 100.0));
            }
            super.method_ce7f5266_Dne(f);
        }
    }

    public boolean method_9f5095a2_ZfC() {
        return this.method_143f9e20_bzF(1);
    }

    @Override
    public boolean method_c011aad4_mlD() {
        return true;
    }

    public void method_99cf5f41_kGO(int n) {
        this.field_378ab08_Dne.method_62ca2346_FWm(18, n);
    }

    public void method_47a073d1_bzF(String string) {
    }

    public void method_b2e02a33_ooe(int n) {
        this.method_dc4a39ce_udO(n);
        int n2 = Integer.MAX_VALUE - this.field_332a64_mlD;
        if (n > n2) {
            n = n2;
        }
        this.field_30e9da_iNQ += (float)n / (float)this.method_7c861aba_EyB();
        this.field_332a64_mlD += n;
        while (this.field_30e9da_iNQ >= 1.0f) {
            this.field_30e9da_iNQ = (this.field_30e9da_iNQ - 1.0f) * (float)this.method_7c861aba_EyB();
            this.method_117d19ea_FWm(1);
            this.field_30e9da_iNQ /= (float)this.method_7c861aba_EyB();
        }
    }

    public float method_9feec6b2_Zpi() {
        if (this.field_376d18e_Dne != null) {
            int n = this.field_36c4f18_Dne.method_2dee76f_bzF(this.field_376d18e_Dne.field_2092ae_Dne, this.field_376d18e_Dne.field_21260d_FWm, this.field_376d18e_Dne.field_2e5f1b_bzF);
            int n2 = rTW.method_7ed979f5_Qnq(n);
            switch (n2) {
                case 0: {
                    return 90.0f;
                }
                case 1: {
                    return 0.0f;
                }
                case 2: {
                    return 270.0f;
                }
                case 3: {
                    return 180.0f;
                }
            }
        }
        return 0.0f;
    }

    public int method_73aaafb6_ATE() {
        return this.method_b6f3e1a2_haP() ? this.field_36a761a_Dne.method_d44b4585_zGp() - this.field_21260d_FWm : 0;
    }

    public void method_df3461c5_Dne(RLC rLC, int n) {
    }

    @Override
    public double method_907a9d0f_Qnq() {
        return this.field_36b0a6_udO - 0.5f;
    }

    public void method_bb7dd820_Dne(sMa sMa2) {
    }

    public void method_ac4d69ca_Dne(ipD ipD2) {
    }

    public void method_7c61cf15_Dne(NMq nMq) {
    }

    public SCY method_230621e2_Dne() {
        return this.field_36c9383_Dne;
    }

    protected void method_740beda6_Dne(FUH fUH, boolean bl) {
        if (!(fUH instanceof gls) && !(fUH instanceof VAd)) {
            Object object;
            if (fUH instanceof oEB && ((BRM)(object = (oEB)fUH)).method_86921671_LVR() && this.field_bc57ecbf_aFZ.equals(((BRM)object).method_d1f1ed87_FWm())) {
                return;
            }
            if (!(fUH instanceof FiG) || this.method_703284a7_Dne((FiG)fUH)) {
                object = this.field_36c4f18_Dne.method_9314b7e8_Dne(oEB.class, bSp.method_23186cf1_Dne().method_b4ea3e0c_Dne(this.field_2f0dd3_div, this.field_22c5fd_IjH, this.field_334487_mrb, this.field_2f0dd3_div + 1.0, this.field_22c5fd_IjH + 1.0, this.field_334487_mrb + 1.0).method_b78565d7_FWm(16.0, 4.0, 16.0));
                Iterator iterator = ((Collection) object).iterator();
                while (iterator.hasNext()) {
                    oEB oEB2 = (oEB)iterator.next();
                    if (!oEB2.method_86921671_LVR() || oEB2.method_f88b2463_FWm() != null || !this.field_bc57ecbf_aFZ.equals(oEB2.method_d1f1ed87_FWm()) || bl && oEB2.method_80692b1e_ICU()) continue;
                    oEB2.method_ae43cb5b_XHL(false);
                    oEB2.method_bb7dd820_Dne(fUH);
                }
            }
        }
    }

    @Override
    public void method_19b4c3a3_a_(int n, NMq nMq) {
        this.field_36a059b_Dne.field_fde07376_FWm[n] = nMq;
    }

    public float method_22303c9c_Dne(zKP zKP2, boolean bl) {
        float f = this.field_36a059b_Dne.method_c74bdb18_Dne(zKP2);
        if (f > 1.0f) {
            int n = UYp.method_610df1d4_bzF(this);
            NMq nMq = this.field_36a059b_Dne.method_23040479_Dne();
            if (n > 0 && nMq != null) {
                float f2 = n * n + 1;
                f = !nMq.method_c74bdb2c_Dne(zKP2) && f <= 1.0f ? (f += f2 * 0.08f) : (f += f2);
            }
        }
        if (this.method_857f23ec_Dne(SXd.field_5e565274_Qnq)) {
            f *= 1.0f + (float)(this.method_a7927c94_Dne(SXd.field_5e565274_Qnq).method_ae128dba_bzF() + 1) * 0.2f;
        }
        if (this.method_857f23ec_Dne(SXd.field_713067f3_aFZ)) {
            f *= 1.0f - (float)(this.method_a7927c94_Dne(SXd.field_713067f3_aFZ).method_ae128dba_bzF() + 1) * 0.2f;
        }
        if (this.method_76dab7e2_Dne(KFd.field_1411d34d_div) && !UYp.method_486cd6b3_FWm(this)) {
            f /= 5.0f;
        }
        if (!this.field_2d2a05_aFZ) {
            f /= 5.0f;
        }
        return f;
    }

    public iSh method_229c669a_bzF() {
        return this.field_20309d6d_FWm;
    }

    public boolean method_efba61e_aFZ(sMa sMa2) {
        if (sMa2.method_21db0ca_a_(this)) {
            return true;
        }
        NMq nMq = this.method_22900b26_bzF();
        if (nMq != null && sMa2 instanceof FUH) {
            if (this.field_37cb681_Dne.field_267d06_Qnq) {
                nMq = nMq.method_23040479_Dne();
            }
            if (nMq.method_6f1922f2_Dne((FUH)sMa2)) {
                if (nMq.field_2092ae_Dne <= 0 && !this.field_37cb681_Dne.field_267d06_Qnq) {
                    this.method_74d3fa75_BJH();
                }
                return true;
            }
        }
        return false;
    }

    protected void method_c5287a5e_qLR() {
        if (this.field_36a761a_Dne != null) {
            this.method_60fb4aed_FWm(this.field_36a761a_Dne, 16);
            int n = this.field_36a761a_Dne.field_2092ae_Dne;
            NMq nMq = this.field_36a761a_Dne.method_2376d988_FWm(this.field_36c4f18_Dne, this);
            if (nMq != this.field_36a761a_Dne || nMq != null && nMq.field_2092ae_Dne != n) {
                this.field_36a059b_Dne.field_8360c375_Dne[this.field_36a059b_Dne.field_2092ae_Dne] = nMq;
                if (nMq.field_2092ae_Dne == 0) {
                    this.field_36a059b_Dne.field_8360c375_Dne[this.field_36a059b_Dne.field_2092ae_Dne] = null;
                }
            }
            this.method_7c82ec2e_FYZ();
        }
    }

    @Override
    public String method_98148f73_Dne(String string, Object ... objectArray) {
        return this.method_2310d392_Dne().method_98148f73_Dne(string, objectArray);
    }

    public void method_af9331b7_Dne(klq klq2) {
    }
}

