package net.minecraft.src;
// Decompiled with: FernFlower
// Class Version: 8
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class pjB extends Azh implements YzO, LUQ {
    private boolean field_2681a0_RPx;
    uQr field_37c3fb6_Dne;
    private int field_21260d_FWm;
    private boolean field_217c37_Fnk;
    private FiG field_20210307_FWm;
    private String field_bc57ecbf_aFZ;
    private int field_2a7663_ZgS;
    private float field_2092ab_Dne;
    private boolean field_21261e_FWm;
    private static final Map field_da2182cf_FWm = new HashMap();
    private static final Map field_83b1c1b0_Dne = new HashMap();
    private ybO field_37e4cc6_Dne;
    private int field_2592c3_One;
    private boolean field_36e4eb_vSL;

    private static int method_f0c51849_FWm(int var0, Random var1) {
        INq var2 = (INq)field_da2182cf_FWm.get(var0);
        return var2 == null ? 1 : ((Integer)var2.method_fc07f5d8_Dne() >= (Integer)var2.method_df2f1019_FWm() ? (Integer)var2.method_fc07f5d8_Dne() : (Integer)var2.method_fc07f5d8_Dne() + var1.nextInt((Integer)var2.method_df2f1019_FWm() - (Integer)var2.method_fc07f5d8_Dne()));
    }

    public FiG method_2300c587_Dne() {
        return this.field_20210307_FWm;
    }

    private static NMq method_e26c10b4_Dne(int var0, Random var1) {
        return new NMq(var0, method_3afb8a48_Dne(var0, var1), 0);
    }

    public void method_610df1e1_bzF(FUH var1) {
        super.method_610df1e1_bzF(var1);
        if (this.field_37c3fb6_Dne != null && var1 != null) {
            this.field_37c3fb6_Dne.method_6f1922ee_Dne(var1);
            if (var1 instanceof FiG) {
                byte var2 = -1;
                if (this.method_8288d6f2_IjH()) {
                    var2 = -3;
                }

                this.field_37c3fb6_Dne.method_5ab44f92_Dne(((FiG)var1).method_193de2e9_a_(), var2);
                if (this.method_cd4cb3d9_udO()) {
                    this.field_36c4f18_Dne.method_b43d849c_Dne(this, (byte)13);
                }
            }
        }

    }

    public pjB(Qnq var1) {
        this(var1, 0);
    }

    public int method_7a46288d_Dne() {
        return 20;
    }

    private static void method_f70310b2_Dne(ybO var0, int var1, Random var2, float var3) {
        if (var2.nextFloat() < var3) {
            var0.add(new Vnr(method_e26c10b4_Dne(var1, var2), dEr.field_86ecf659_Kvh));
        }

    }

    private static void method_5bd059f3_FWm(ybO var0, int var1, Random var2, float var3) {
        if (var2.nextFloat() < var3) {
            int var4 = method_f0c51849_FWm(var1, var2);
            NMq var5;
            NMq var6;
            if (var4 < 0) {
                var5 = new NMq(dEr.field_86ecf659_Kvh.field_267cf5_Qnq, 1, 0);
                var6 = new NMq(var1, -var4, 0);
            } else {
                var5 = new NMq(dEr.field_86ecf659_Kvh.field_267cf5_Qnq, var4, 0);
                var6 = new NMq(var1, 1, 0);
            }

            var0.add(new Vnr(var5, var6));
        }

    }

    protected String method_3c9d12fd_DyG() {
        return "mob.villager.defaulthurt";
    }

    protected void method_7c6f6039_FWm() {
        super.method_7c6f6039_FWm();
        this.field_378ab08_Dne.method_ad009545_Dne(16, 0);
    }

    public void method_99cf5f41_kGO(int var1) {
        this.field_378ab08_Dne.method_62ca2346_FWm(16, var1);
    }

    private float method_143f92c9_bzF(float var1) {
        float var2 = var1 + this.field_2092ab_Dne;
        return var2 > 0.9F ? 0.9F - (var2 - 0.9F) : var2;
    }

    protected String method_a174454e_zGp() {
        return "mob.villager.default";
    }

    public boolean method_21db0ca_a_(FiG var1) {
        NMq var2 = var1.field_36a059b_Dne.method_23040479_Dne();
        boolean var3 = var2 != null && var2.field_2e5f1b_bzF == dEr.field_1525a142_ghu.field_267cf5_Qnq;
        if (!var3 && this.method_cd4cb3d9_udO() && !this.method_9f5095a2_ZfC() && !this.method_8288d6f2_IjH()) {
            if (!this.field_36c4f18_Dne.field_2d2a05_aFZ) {
                this.method_703284a3_Dne(var1);
                var1.method_adf18883_Dne(this, this.method_da581772_IjH());
            }

            return true;
        } else {
            return super.method_21db0ca_a_(var1);
        }
    }

    static {
        field_83b1c1b0_Dne.put(dEr.field_16278184_DyG.field_267cf5_Qnq, new INq(16, 24));
        field_83b1c1b0_Dne.put(dEr.field_5c4c1af_IjH.field_267cf5_Qnq, new INq(8, 10));
        field_83b1c1b0_Dne.put(dEr.field_74feeb39_mrb.field_267cf5_Qnq, new INq(8, 10));
        field_83b1c1b0_Dne.put(dEr.field_141d2e85_div.field_267cf5_Qnq, new INq(4, 6));
        field_83b1c1b0_Dne.put(dEr.field_90cb7cdd_lMz.field_267cf5_Qnq, new INq(24, 36));
        field_83b1c1b0_Dne.put(dEr.field_4976bda6_TKg.field_267cf5_Qnq, new INq(11, 13));
        field_83b1c1b0_Dne.put(dEr.field_68a14cb4_CLK.field_267cf5_Qnq, new INq(1, 1));
        field_83b1c1b0_Dne.put(dEr.field_38bbe273_iNH.field_267cf5_Qnq, new INq(3, 4));
        field_83b1c1b0_Dne.put(dEr.field_1031d495_Woy.field_267cf5_Qnq, new INq(2, 3));
        field_83b1c1b0_Dne.put(dEr.field_dde88ad5_qrB.field_267cf5_Qnq, new INq(14, 18));
        field_83b1c1b0_Dne.put(dEr.field_728123b7_ipf.field_267cf5_Qnq, new INq(14, 18));
        field_83b1c1b0_Dne.put(dEr.field_ba12c5ca_qqL.field_267cf5_Qnq, new INq(14, 18));
        field_83b1c1b0_Dne.put(dEr.field_1ea4296e_kSP.field_267cf5_Qnq, new INq(9, 13));
        field_83b1c1b0_Dne.put(dEr.field_4682511_mlD.field_267cf5_Qnq, new INq(34, 48));
        field_83b1c1b0_Dne.put(dEr.field_4793365a_MUD.field_267cf5_Qnq, new INq(30, 38));
        field_83b1c1b0_Dne.put(dEr.field_633b7ca6_LDH.field_267cf5_Qnq, new INq(30, 38));
        field_83b1c1b0_Dne.put(dEr.field_ce7bf76e_EWz.field_267cf5_Qnq, new INq(18, 22));
        field_83b1c1b0_Dne.put(zKP.field_9f40014e_RPx.field_21260d_FWm, new INq(14, 22));
        field_83b1c1b0_Dne.put(dEr.field_a989199f_gvF.field_267cf5_Qnq, new INq(36, 64));
        field_da2182cf_FWm.put(dEr.field_5e5dc722_Qnq.field_267cf5_Qnq, new INq(3, 4));
        field_da2182cf_FWm.put(dEr.field_37078f6_Dne.field_267cf5_Qnq, new INq(3, 4));
        field_da2182cf_FWm.put(dEr.field_1c35e69a_XHL.field_267cf5_Qnq, new INq(7, 11));
        field_da2182cf_FWm.put(dEr.field_85059e33_ceE.field_267cf5_Qnq, new INq(12, 14));
        field_da2182cf_FWm.put(dEr.field_75bc2648_bzF.field_267cf5_Qnq, new INq(6, 8));
        field_da2182cf_FWm.put(dEr.field_395b4402_OdI.field_267cf5_Qnq, new INq(9, 12));
        field_da2182cf_FWm.put(dEr.field_202e243a_FWm.field_267cf5_Qnq, new INq(7, 9));
        field_da2182cf_FWm.put(dEr.field_d4d9ce3_FfS.field_267cf5_Qnq, new INq(10, 12));
        field_da2182cf_FWm.put(dEr.field_374585b_Dne.field_267cf5_Qnq, new INq(4, 6));
        field_da2182cf_FWm.put(dEr.field_75807348_EyB.field_267cf5_Qnq, new INq(7, 8));
        field_da2182cf_FWm.put(dEr.field_7a2145f0_One.field_267cf5_Qnq, new INq(4, 6));
        field_da2182cf_FWm.put(dEr.field_5fcb5990_ZgS.field_267cf5_Qnq, new INq(7, 8));
        field_da2182cf_FWm.put(dEr.field_61660609_Zpi.field_267cf5_Qnq, new INq(4, 6));
        field_da2182cf_FWm.put(dEr.field_32866d87_trS.field_267cf5_Qnq, new INq(7, 8));
        field_da2182cf_FWm.put(dEr.field_5bcbb35_IjH.field_267cf5_Qnq, new INq(4, 6));
        field_da2182cf_FWm.put(dEr.field_a21c8349_kGO.field_267cf5_Qnq, new INq(7, 8));
        field_da2182cf_FWm.put(dEr.field_74f6e4bf_mrb.field_267cf5_Qnq, new INq(10, 14));
        field_da2182cf_FWm.put(dEr.field_aefcfa5c_udO.field_267cf5_Qnq, new INq(16, 19));
        field_da2182cf_FWm.put(dEr.field_1c2de020_XHL.field_267cf5_Qnq, new INq(8, 10));
        field_da2182cf_FWm.put(dEr.field_ab251697_ooe.field_267cf5_Qnq, new INq(11, 14));
        field_da2182cf_FWm.put(dEr.field_1415280b_div.field_267cf5_Qnq, new INq(5, 7));
        field_da2182cf_FWm.put(dEr.field_712fd627_aFZ.field_267cf5_Qnq, new INq(5, 7));
        field_da2182cf_FWm.put(dEr.field_f09e10d9_zGp.field_267cf5_Qnq, new INq(11, 15));
        field_da2182cf_FWm.put(dEr.field_161f7b0a_DyG.field_267cf5_Qnq, new INq(9, 11));
        field_da2182cf_FWm.put(dEr.field_7785c591_rPc.field_267cf5_Qnq, new INq(-4, -2));
        field_da2182cf_FWm.put(dEr.field_27cfb795_gwq.field_267cf5_Qnq, new INq(-8, -4));
        field_da2182cf_FWm.put(dEr.field_7137dca1_aFZ.field_267cf5_Qnq, new INq(-8, -4));
        field_da2182cf_FWm.put(dEr.field_8dae3329_Lab.field_267cf5_Qnq, new INq(-10, -7));
        field_da2182cf_FWm.put(zKP.field_32988693_trS.field_21260d_FWm, new INq(-5, -3));
        field_da2182cf_FWm.put(zKP.field_24a90a48_AgF.field_21260d_FWm, new INq(3, 4));
        field_da2182cf_FWm.put(dEr.field_20261dc0_FWm.field_267cf5_Qnq, new INq(4, 5));
        field_da2182cf_FWm.put(dEr.field_5e55c0a8_Qnq.field_267cf5_Qnq, new INq(2, 4));
        field_da2182cf_FWm.put(dEr.field_36c51e1_Dne.field_267cf5_Qnq, new INq(2, 4));
        field_da2182cf_FWm.put(dEr.field_75b41fce_bzF.field_267cf5_Qnq, new INq(2, 4));
        field_da2182cf_FWm.put(dEr.field_9372b110_YHU.field_267cf5_Qnq, new INq(6, 8));
        field_da2182cf_FWm.put(dEr.field_cd34217a_wns.field_267cf5_Qnq, new INq(-4, -1));
        field_da2182cf_FWm.put(dEr.field_59c23676_exS.field_267cf5_Qnq, new INq(-4, -1));
        field_da2182cf_FWm.put(dEr.field_9479d34e_Suj.field_267cf5_Qnq, new INq(10, 12));
        field_da2182cf_FWm.put(dEr.field_3b0afb48_fYA.field_267cf5_Qnq, new INq(10, 12));
        field_da2182cf_FWm.put(zKP.field_3b150dda_fYA.field_21260d_FWm, new INq(-3, -1));
        field_da2182cf_FWm.put(dEr.field_2c7c1d6e_LVR.field_267cf5_Qnq, new INq(-7, -5));
        field_da2182cf_FWm.put(dEr.field_b204f0b_mzX.field_267cf5_Qnq, new INq(-7, -5));
        field_da2182cf_FWm.put(dEr.field_bf5ffe54_yIR.field_267cf5_Qnq, new INq(-8, -6));
        field_da2182cf_FWm.put(dEr.field_1031d495_Woy.field_267cf5_Qnq, new INq(7, 11));
        field_da2182cf_FWm.put(dEr.field_f0a61753_zGp.field_267cf5_Qnq, new INq(-12, -8));
    }

    public String method_6859cdb9_bzF() {
        switch(this.method_c5287a51_qLR()) {
        case 0:
            return "/mob/villager/farmer.png";
        case 1:
            return "/mob/villager/librarian.png";
        case 2:
            return "/mob/villager/priest.png";
        case 3:
            return "/mob/villager/smith.png";
        case 4:
            return "/mob/villager/butcher.png";
        default:
            return super.method_6859cdb9_bzF();
        }
    }

    public void method_4e0836dc_mrb(boolean var1) {
        this.field_36e4eb_vSL = var1;
    }

    public void method_8d4fb917_Dne(WkD var1) {
        super.method_8d4fb917_Dne(var1);
        var1.method_5ab44f9f_Dne("Profession", this.method_c5287a51_qLR());
        var1.method_5ab44f9f_Dne("Riches", this.field_2a7663_ZgS);
        if (this.field_37e4cc6_Dne != null) {
            var1.method_312ec00d_Dne("Offers", this.field_37e4cc6_Dne.method_230886fb_Dne());
        }

    }

    private void method_dc4a39ce_udO(int var1) {
        if (this.field_37e4cc6_Dne != null) {
            this.field_2092ab_Dne = geR.method_143f92c9_bzF((float)this.field_37e4cc6_Dne.size()) * 0.2F;
        } else {
            this.field_2092ab_Dne = 0.0F;
        }

        ybO var2;
        var2 = new ybO();
        int var3;
        label51:
        switch(this.method_c5287a51_qLR()) {
        case 0:
            method_f70310b2_Dne(var2, dEr.field_ce7bf76e_EWz.field_267cf5_Qnq, this.field_7331eae7_Dne, this.method_143f92c9_bzF(0.9F));
            method_f70310b2_Dne(var2, zKP.field_9f40014e_RPx.field_21260d_FWm, this.field_7331eae7_Dne, this.method_143f92c9_bzF(0.5F));
            method_f70310b2_Dne(var2, dEr.field_ba12c5ca_qqL.field_267cf5_Qnq, this.field_7331eae7_Dne, this.method_143f92c9_bzF(0.5F));
            method_f70310b2_Dne(var2, dEr.field_1ea4296e_kSP.field_267cf5_Qnq, this.field_7331eae7_Dne, this.method_143f92c9_bzF(0.4F));
            method_5bd059f3_FWm(var2, dEr.field_7785c591_rPc.field_267cf5_Qnq, this.field_7331eae7_Dne, this.method_143f92c9_bzF(0.9F));
            method_5bd059f3_FWm(var2, dEr.field_27cfb795_gwq.field_267cf5_Qnq, this.field_7331eae7_Dne, this.method_143f92c9_bzF(0.3F));
            method_5bd059f3_FWm(var2, dEr.field_7137dca1_aFZ.field_267cf5_Qnq, this.field_7331eae7_Dne, this.method_143f92c9_bzF(0.3F));
            method_5bd059f3_FWm(var2, dEr.field_8dae3329_Lab.field_267cf5_Qnq, this.field_7331eae7_Dne, this.method_143f92c9_bzF(0.3F));
            method_5bd059f3_FWm(var2, dEr.field_37078f6_Dne.field_267cf5_Qnq, this.field_7331eae7_Dne, this.method_143f92c9_bzF(0.3F));
            method_5bd059f3_FWm(var2, dEr.field_5e5dc722_Qnq.field_267cf5_Qnq, this.field_7331eae7_Dne, this.method_143f92c9_bzF(0.3F));
            method_5bd059f3_FWm(var2, dEr.field_bf5ffe54_yIR.field_267cf5_Qnq, this.field_7331eae7_Dne, this.method_143f92c9_bzF(0.3F));
            method_5bd059f3_FWm(var2, dEr.field_f0a61753_zGp.field_267cf5_Qnq, this.field_7331eae7_Dne, this.method_143f92c9_bzF(0.5F));
            if (this.field_7331eae7_Dne.nextFloat() < this.method_143f92c9_bzF(0.5F)) {
                var2.add(new Vnr(new NMq(zKP.field_7508fdcb_mrb, 10), new NMq(dEr.field_86ecf659_Kvh), new NMq(dEr.field_cb97e05f_haP.field_267cf5_Qnq, 4 + this.field_7331eae7_Dne.nextInt(2), 0)));
            }
            break;
        case 1:
            method_f70310b2_Dne(var2, dEr.field_90cb7cdd_lMz.field_267cf5_Qnq, this.field_7331eae7_Dne, this.method_143f92c9_bzF(0.8F));
            method_f70310b2_Dne(var2, dEr.field_4976bda6_TKg.field_267cf5_Qnq, this.field_7331eae7_Dne, this.method_143f92c9_bzF(0.8F));
            method_f70310b2_Dne(var2, dEr.field_68a14cb4_CLK.field_267cf5_Qnq, this.field_7331eae7_Dne, this.method_143f92c9_bzF(0.3F));
            method_5bd059f3_FWm(var2, zKP.field_24a90a48_AgF.field_21260d_FWm, this.field_7331eae7_Dne, this.method_143f92c9_bzF(0.8F));
            method_5bd059f3_FWm(var2, zKP.field_32988693_trS.field_21260d_FWm, this.field_7331eae7_Dne, this.method_143f92c9_bzF(0.2F));
            method_5bd059f3_FWm(var2, dEr.field_9479d34e_Suj.field_267cf5_Qnq, this.field_7331eae7_Dne, this.method_143f92c9_bzF(0.2F));
            method_5bd059f3_FWm(var2, dEr.field_3b0afb48_fYA.field_267cf5_Qnq, this.field_7331eae7_Dne, this.method_143f92c9_bzF(0.2F));
            if (this.field_7331eae7_Dne.nextFloat() < this.method_143f92c9_bzF(0.07F)) {
                ycv var8 = ycv.field_fdf4529c_FWm[this.field_7331eae7_Dne.nextInt(ycv.field_fdf4529c_FWm.length)];
                int var10 = geR.method_4cd91d9_Dne(this.field_7331eae7_Dne, var8.method_ae128dba_bzF(), var8.method_7a46288d_Dne());
                NMq var11 = dEr.field_374f605_Dne.method_18643d7a_Dne(new RmG(var8, var10));
                var3 = 2 + this.field_7331eae7_Dne.nextInt(5 + var10 * 10) + 3 * var10;
                var2.add(new Vnr(new NMq(dEr.field_4976bda6_TKg), new NMq(dEr.field_86ecf659_Kvh, var3), var11));
            }
            break;
        case 2:
            method_5bd059f3_FWm(var2, dEr.field_1031d495_Woy.field_267cf5_Qnq, this.field_7331eae7_Dne, this.method_143f92c9_bzF(0.3F));
            method_5bd059f3_FWm(var2, dEr.field_cd34217a_wns.field_267cf5_Qnq, this.field_7331eae7_Dne, this.method_143f92c9_bzF(0.2F));
            method_5bd059f3_FWm(var2, dEr.field_59c23676_exS.field_267cf5_Qnq, this.field_7331eae7_Dne, this.method_143f92c9_bzF(0.4F));
            method_5bd059f3_FWm(var2, zKP.field_3b150dda_fYA.field_21260d_FWm, this.field_7331eae7_Dne, this.method_143f92c9_bzF(0.3F));
            int[] var4 = new int[]{dEr.field_1c35e69a_XHL.field_267cf5_Qnq, dEr.field_85059e33_ceE.field_267cf5_Qnq, dEr.field_74f6e4bf_mrb.field_267cf5_Qnq, dEr.field_aefcfa5c_udO.field_267cf5_Qnq, dEr.field_75bc2648_bzF.field_267cf5_Qnq, dEr.field_395b4402_OdI.field_267cf5_Qnq, dEr.field_202e243a_FWm.field_267cf5_Qnq, dEr.field_d4d9ce3_FfS.field_267cf5_Qnq};
            int[] var5 = var4;
            int var6 = var4.length;
            var3 = 0;

            while(true) {
                if (var3 >= var6) {
                    break label51;
                }

                int var7 = var5[var3];
                if (this.field_7331eae7_Dne.nextFloat() < this.method_143f92c9_bzF(0.05F)) {
                    var2.add(new Vnr(new NMq(var7, 1, 0), new NMq(dEr.field_86ecf659_Kvh, 2 + this.field_7331eae7_Dne.nextInt(3), 0), UYp.method_2e16e3d9_Dne(this.field_7331eae7_Dne, new NMq(var7, 1, 0), 5 + this.field_7331eae7_Dne.nextInt(15))));
                }

                ++var3;
            }
        case 3:
            method_f70310b2_Dne(var2, dEr.field_16278184_DyG.field_267cf5_Qnq, this.field_7331eae7_Dne, this.method_143f92c9_bzF(0.7F));
            method_f70310b2_Dne(var2, dEr.field_5c4c1af_IjH.field_267cf5_Qnq, this.field_7331eae7_Dne, this.method_143f92c9_bzF(0.5F));
            method_f70310b2_Dne(var2, dEr.field_74feeb39_mrb.field_267cf5_Qnq, this.field_7331eae7_Dne, this.method_143f92c9_bzF(0.5F));
            method_f70310b2_Dne(var2, dEr.field_141d2e85_div.field_267cf5_Qnq, this.field_7331eae7_Dne, this.method_143f92c9_bzF(0.5F));
            method_5bd059f3_FWm(var2, dEr.field_1c35e69a_XHL.field_267cf5_Qnq, this.field_7331eae7_Dne, this.method_143f92c9_bzF(0.5F));
            method_5bd059f3_FWm(var2, dEr.field_85059e33_ceE.field_267cf5_Qnq, this.field_7331eae7_Dne, this.method_143f92c9_bzF(0.5F));
            method_5bd059f3_FWm(var2, dEr.field_75bc2648_bzF.field_267cf5_Qnq, this.field_7331eae7_Dne, this.method_143f92c9_bzF(0.3F));
            method_5bd059f3_FWm(var2, dEr.field_395b4402_OdI.field_267cf5_Qnq, this.field_7331eae7_Dne, this.method_143f92c9_bzF(0.3F));
            method_5bd059f3_FWm(var2, dEr.field_202e243a_FWm.field_267cf5_Qnq, this.field_7331eae7_Dne, this.method_143f92c9_bzF(0.5F));
            method_5bd059f3_FWm(var2, dEr.field_d4d9ce3_FfS.field_267cf5_Qnq, this.field_7331eae7_Dne, this.method_143f92c9_bzF(0.5F));
            method_5bd059f3_FWm(var2, dEr.field_374585b_Dne.field_267cf5_Qnq, this.field_7331eae7_Dne, this.method_143f92c9_bzF(0.2F));
            method_5bd059f3_FWm(var2, dEr.field_75807348_EyB.field_267cf5_Qnq, this.field_7331eae7_Dne, this.method_143f92c9_bzF(0.2F));
            method_5bd059f3_FWm(var2, dEr.field_7a2145f0_One.field_267cf5_Qnq, this.field_7331eae7_Dne, this.method_143f92c9_bzF(0.2F));
            method_5bd059f3_FWm(var2, dEr.field_5fcb5990_ZgS.field_267cf5_Qnq, this.field_7331eae7_Dne, this.method_143f92c9_bzF(0.2F));
            method_5bd059f3_FWm(var2, dEr.field_61660609_Zpi.field_267cf5_Qnq, this.field_7331eae7_Dne, this.method_143f92c9_bzF(0.2F));
            method_5bd059f3_FWm(var2, dEr.field_32866d87_trS.field_267cf5_Qnq, this.field_7331eae7_Dne, this.method_143f92c9_bzF(0.2F));
            method_5bd059f3_FWm(var2, dEr.field_5bcbb35_IjH.field_267cf5_Qnq, this.field_7331eae7_Dne, this.method_143f92c9_bzF(0.2F));
            method_5bd059f3_FWm(var2, dEr.field_a21c8349_kGO.field_267cf5_Qnq, this.field_7331eae7_Dne, this.method_143f92c9_bzF(0.2F));
            method_5bd059f3_FWm(var2, dEr.field_74f6e4bf_mrb.field_267cf5_Qnq, this.field_7331eae7_Dne, this.method_143f92c9_bzF(0.2F));
            method_5bd059f3_FWm(var2, dEr.field_aefcfa5c_udO.field_267cf5_Qnq, this.field_7331eae7_Dne, this.method_143f92c9_bzF(0.2F));
            method_5bd059f3_FWm(var2, dEr.field_1c2de020_XHL.field_267cf5_Qnq, this.field_7331eae7_Dne, this.method_143f92c9_bzF(0.2F));
            method_5bd059f3_FWm(var2, dEr.field_ab251697_ooe.field_267cf5_Qnq, this.field_7331eae7_Dne, this.method_143f92c9_bzF(0.2F));
            method_5bd059f3_FWm(var2, dEr.field_1415280b_div.field_267cf5_Qnq, this.field_7331eae7_Dne, this.method_143f92c9_bzF(0.1F));
            method_5bd059f3_FWm(var2, dEr.field_712fd627_aFZ.field_267cf5_Qnq, this.field_7331eae7_Dne, this.method_143f92c9_bzF(0.1F));
            method_5bd059f3_FWm(var2, dEr.field_f09e10d9_zGp.field_267cf5_Qnq, this.field_7331eae7_Dne, this.method_143f92c9_bzF(0.1F));
            method_5bd059f3_FWm(var2, dEr.field_161f7b0a_DyG.field_267cf5_Qnq, this.field_7331eae7_Dne, this.method_143f92c9_bzF(0.1F));
            break;
        case 4:
            method_f70310b2_Dne(var2, dEr.field_16278184_DyG.field_267cf5_Qnq, this.field_7331eae7_Dne, this.method_143f92c9_bzF(0.7F));
            method_f70310b2_Dne(var2, dEr.field_dde88ad5_qrB.field_267cf5_Qnq, this.field_7331eae7_Dne, this.method_143f92c9_bzF(0.5F));
            method_f70310b2_Dne(var2, dEr.field_728123b7_ipf.field_267cf5_Qnq, this.field_7331eae7_Dne, this.method_143f92c9_bzF(0.5F));
            method_5bd059f3_FWm(var2, dEr.field_9372b110_YHU.field_267cf5_Qnq, this.field_7331eae7_Dne, this.method_143f92c9_bzF(0.1F));
            method_5bd059f3_FWm(var2, dEr.field_20261dc0_FWm.field_267cf5_Qnq, this.field_7331eae7_Dne, this.method_143f92c9_bzF(0.3F));
            method_5bd059f3_FWm(var2, dEr.field_5e55c0a8_Qnq.field_267cf5_Qnq, this.field_7331eae7_Dne, this.method_143f92c9_bzF(0.3F));
            method_5bd059f3_FWm(var2, dEr.field_36c51e1_Dne.field_267cf5_Qnq, this.field_7331eae7_Dne, this.method_143f92c9_bzF(0.3F));
            method_5bd059f3_FWm(var2, dEr.field_75b41fce_bzF.field_267cf5_Qnq, this.field_7331eae7_Dne, this.method_143f92c9_bzF(0.3F));
            method_5bd059f3_FWm(var2, dEr.field_2c7c1d6e_LVR.field_267cf5_Qnq, this.field_7331eae7_Dne, this.method_143f92c9_bzF(0.3F));
            method_5bd059f3_FWm(var2, dEr.field_b204f0b_mzX.field_267cf5_Qnq, this.field_7331eae7_Dne, this.method_143f92c9_bzF(0.3F));
        }

        if (var2.isEmpty()) {
            method_f70310b2_Dne(var2, dEr.field_74feeb39_mrb.field_267cf5_Qnq, this.field_7331eae7_Dne, 1.0F);
        }

        Collections.shuffle(var2);
        if (this.field_37e4cc6_Dne == null) {
            this.field_37e4cc6_Dne = new ybO();
        }

        for(int var9 = 0; var9 < var1 && var9 < var2.size(); ++var9) {
            this.field_37e4cc6_Dne.method_8bda100d_Dne((Vnr)var2.get(var9));
        }

    }

    public void method_8bda100d_Dne(Vnr var1) {
        var1.method_7a46289a_Dne();
        if (var1.method_8bda1011_Dne((Vnr)this.field_37e4cc6_Dne.get(this.field_37e4cc6_Dne.size() - 1))) {
            this.field_2592c3_One = 40;
            this.field_2681a0_RPx = true;
            if (this.field_20210307_FWm != null) {
                this.field_bc57ecbf_aFZ = this.field_20210307_FWm.method_193de2e9_a_();
            } else {
                this.field_bc57ecbf_aFZ = null;
            }
        }

        if (var1.method_23040479_Dne().field_2e5f1b_bzF == dEr.field_86ecf659_Kvh.field_267cf5_Qnq) {
            this.field_2a7663_ZgS += var1.method_23040479_Dne().field_2092ae_Dne;
        }

    }

    public ybO method_53f50aae_Dne(FiG var1) {
        if (this.field_37e4cc6_Dne == null) {
            this.method_dc4a39ce_udO(1);
        }

        return this.field_37e4cc6_Dne;
    }

    protected boolean method_d2ef85b3_yMz() {
        return false;
    }

    public void method_ce7f4362_Dne(byte var1) {
        if (var1 == 12) {
            this.method_8f501fe4_Dne("heart");
        } else if (var1 == 13) {
            this.method_8f501fe4_Dne("angryVillager");
        } else if (var1 == 14) {
            this.method_8f501fe4_Dne("happyVillager");
        } else {
            super.method_ce7f4362_Dne(var1);
        }

    }

    public int method_c5287a51_qLR() {
        return this.field_378ab08_Dne.method_ce7f5d9c_Dne(16);
    }

    private void method_8f501fe4_Dne(String var1) {
        for(int var2 = 0; var2 < 5; ++var2) {
            double var3 = this.field_7331eae7_Dne.nextGaussian() * 0.02D;
            double var5 = this.field_7331eae7_Dne.nextGaussian() * 0.02D;
            double var7 = this.field_7331eae7_Dne.nextGaussian() * 0.02D;
            this.field_36c4f18_Dne.method_8600ec24_Dne(var1, this.field_2f0dd3_div + (double)(this.field_7331eae7_Dne.nextFloat() * this.field_342261_ooe * 2.0F) - (double)this.field_342261_ooe, this.field_22c5fd_IjH + 1.0D + (double)(this.field_7331eae7_Dne.nextFloat() * this.field_367151_trS), this.field_334487_mrb + (double)(this.field_7331eae7_Dne.nextFloat() * this.field_342261_ooe * 2.0F) - (double)this.field_342261_ooe, var3, var5, var7);
        }

    }

    public boolean method_cbcb3929_tgc() {
        return true;
    }

    public void method_66a36cd8_FWm(WkD var1) {
        super.method_66a36cd8_FWm(var1);
        this.method_99cf5f41_kGO(var1.method_8f501fd7_Dne("Profession"));
        this.field_2a7663_ZgS = var1.method_8f501fd7_Dne("Riches");
        if (var1.method_8f501fe8_Dne("Offers")) {
            WkD var2 = var1.method_2851c945_Dne("Offers");
            this.field_37e4cc6_Dne = new ybO(var2);
        }

    }

    public boolean method_86921671_LVR() {
        return this.field_21261e_FWm;
    }

    public void method_80692b1a_ICU() {
        this.method_99cf5f41_kGO(this.field_36c4f18_Dne.field_7331eae7_Dne.nextInt(5));
    }

    public void method_703284a3_Dne(FiG var1) {
        this.field_20210307_FWm = var1;
    }

    protected void method_c011aad0_mlD() {
        if (--this.field_21260d_FWm <= 0) {
            this.field_36c4f18_Dne.field_36be6b6_Dne.method_2c2cf7c9_Dne(geR.method_117d0718_FWm(this.field_2f0dd3_div), geR.method_117d0718_FWm(this.field_22c5fd_IjH), geR.method_117d0718_FWm(this.field_334487_mrb));
            this.field_21260d_FWm = 70 + this.field_7331eae7_Dne.nextInt(50);
            this.field_37c3fb6_Dne = this.field_36c4f18_Dne.field_36be6b6_Dne.method_b7b639d5_Dne(geR.method_117d0718_FWm(this.field_2f0dd3_div), geR.method_117d0718_FWm(this.field_22c5fd_IjH), geR.method_117d0718_FWm(this.field_334487_mrb), 32);
            if (this.field_37c3fb6_Dne == null) {
                this.method_74b6e2b5_AgF();
            } else {
                iSh var1 = this.field_37c3fb6_Dne.method_23105fed_Dne();
                this.method_2ee8c479_FWm(var1.field_2092ae_Dne, var1.field_21260d_FWm, var1.field_2e5f1b_bzF, (int)((float)this.field_37c3fb6_Dne.method_7a46288d_Dne() * 0.6F));
                if (this.field_217c37_Fnk) {
                    this.field_217c37_Fnk = false;
                    this.field_37c3fb6_Dne.method_117d19ea_FWm(5);
                }
            }
        }

        if (!this.method_9f5095a2_ZfC() && this.field_2592c3_One > 0) {
            --this.field_2592c3_One;
            if (this.field_2592c3_One <= 0) {
                if (this.field_2681a0_RPx) {
                    if (this.field_37e4cc6_Dne.size() > 1) {
                        Iterator var3 = this.field_37e4cc6_Dne.iterator();

                        while(var3.hasNext()) {
                            Vnr var2 = (Vnr)var3.next();
                            if (var2.method_7c6f603d_FWm()) {
                                var2.method_ce7f5da9_Dne(this.field_7331eae7_Dne.nextInt(6) + this.field_7331eae7_Dne.nextInt(6) + 2);
                            }
                        }
                    }

                    this.method_dc4a39ce_udO(1);
                    this.field_2681a0_RPx = false;
                    if (this.field_37c3fb6_Dne != null && this.field_bc57ecbf_aFZ != null) {
                        this.field_36c4f18_Dne.method_b43d849c_Dne(this, (byte)14);
                        this.field_37c3fb6_Dne.method_5ab44f92_Dne(this.field_bc57ecbf_aFZ, 1);
                    }
                }

                this.method_fe8e2b7b_Qnq(new NAx(SXd.field_1c2e71ec_XHL.field_2092ae_Dne, 200, 0));
            }
        }

        super.method_c011aad0_mlD();
    }

    public void method_ce92b9a6_IjH(boolean var1) {
        this.field_21261e_FWm = var1;
    }

    public void method_c6daaac1_Dne(zBn var1) {
        if (this.field_37c3fb6_Dne != null) {
            sMa var2 = var1.method_f88b2463_FWm();
            if (var2 != null) {
                if (var2 instanceof FiG) {
                    this.field_37c3fb6_Dne.method_5ab44f92_Dne(((FiG)var2).method_193de2e9_a_(), -2);
                } else if (var2 instanceof ZFz) {
                    this.field_37c3fb6_Dne.method_7a46289a_Dne();
                }
            } else if (var2 == null) {
                FiG var3 = this.field_36c4f18_Dne.method_3d2c70b_Dne(this, 16.0D);
                if (var3 != null) {
                    this.field_37c3fb6_Dne.method_7a46289a_Dne();
                }
            }
        }

        super.method_c6daaac1_Dne(var1);
    }

    public pjB(Qnq var1, int var2) {
        super(var1);
        this.field_21260d_FWm = 0;
        this.field_21261e_FWm = false;
        this.field_36e4eb_vSL = false;
        this.field_37c3fb6_Dne = null;
        this.method_99cf5f41_kGO(var2);
        this.field_c480ca78_bzF = "/mob/villager/villager.png";
        this.field_2e1df2_cHy = 0.5F;
        this.method_16b621a_Dne(0.6F, 1.8F);
        this.method_23028a4c_Dne().method_117d59bb_FWm(true);
        this.method_23028a4c_Dne().method_ce7f9d7a_Dne(true);
        this.field_36ae2b9_Dne.method_9212764c_Dne(0, new Cyb(this));
        this.field_36ae2b9_Dne.method_9212764c_Dne(1, new RlP(this, zxd.class, 8.0F, 0.3F, 0.35F));
        this.field_36ae2b9_Dne.method_9212764c_Dne(1, new CfL(this));
        this.field_36ae2b9_Dne.method_9212764c_Dne(1, new zRI(this));
        this.field_36ae2b9_Dne.method_9212764c_Dne(2, new gNt(this));
        this.field_36ae2b9_Dne.method_9212764c_Dne(3, new SET(this));
        this.field_36ae2b9_Dne.method_9212764c_Dne(4, new Htk(this, true));
        this.field_36ae2b9_Dne.method_9212764c_Dne(5, new ZWx(this, 0.3F));
        this.field_36ae2b9_Dne.method_9212764c_Dne(6, new uxm(this));
        this.field_36ae2b9_Dne.method_9212764c_Dne(7, new YxX(this));
        this.field_36ae2b9_Dne.method_9212764c_Dne(8, new oZz(this, 0.32F));
        this.field_36ae2b9_Dne.method_9212764c_Dne(9, new mZE(this, FiG.class, 3.0F, 1.0F));
        this.field_36ae2b9_Dne.method_9212764c_Dne(9, new mZE(this, pjB.class, 5.0F, 0.02F));
        this.field_36ae2b9_Dne.method_9212764c_Dne(9, new IBw(this, 0.3F));
        this.field_36ae2b9_Dne.method_9212764c_Dne(10, new yws(this, FUH.class, 8.0F));
    }

    protected String method_6a89a3dc_div() {
        return "mob.villager.defaultdeath";
    }

    public boolean method_9f5095a2_ZfC() {
        return this.field_20210307_FWm != null;
    }

    public void method_c6daaac1_Dne(ybO var1) {
    }

    public Azh method_cafee53a_Dne(Azh var1) {
        return this.method_cb140201_Dne(var1);
    }

    private static int method_3afb8a48_Dne(int var0, Random var1) {
        INq var2 = (INq)field_83b1c1b0_Dne.get(var0);
        return var2 == null ? 1 : ((Integer)var2.method_fc07f5d8_Dne() >= (Integer)var2.method_df2f1019_FWm() ? (Integer)var2.method_fc07f5d8_Dne() : (Integer)var2.method_fc07f5d8_Dne() + var1.nextInt((Integer)var2.method_df2f1019_FWm() - (Integer)var2.method_fc07f5d8_Dne()));
    }

    public void method_907a9d21_Qnq() {
        this.field_217c37_Fnk = true;
    }

    public pjB method_cb140201_Dne(Azh var1) {
        pjB var2 = new pjB(this.field_36c4f18_Dne);
        var2.method_80692b1a_ICU();
        return var2;
    }

    public boolean method_80692b1e_ICU() {
        return this.field_36e4eb_vSL;
    }
}
 