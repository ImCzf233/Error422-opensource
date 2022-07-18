package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class trP {
    public static RLC field_5e55ad0a_Qnq;
    private static boolean field_21261e_FWm;
    public static RLC field_aefce6be_udO;
    public static RLC field_1c2dcc82_XHL;
    private static boolean field_2092bf_Dne;
    public static RLC field_1f012f07_qLR;
    public static RLC field_75b40c30_bzF;
    public static RLC[] field_85a6f5b7_Qnq;
    public static RLC field_161f676c_DyG;
    public static RLC field_84fd841b_ceE;
    public static List field_f27c122c_Dne;
    public static RLC field_ab2502f9_ooe;
    public static RLC field_1415146d_div;
    public static RLC field_36c3e43_Dne;
    public static RLC field_712fc289_aFZ;
    public static RLC field_75785930_EyB;
    public static RLC field_a21c6fab_kGO;
    protected static Map field_83b1c1b0_Dne;
    public static RLC[] field_5a147b51_bzF;
    public static RLC field_395329ea_OdI;
    public static RLC[] field_83628b9e_Dne;
    public static RLC field_6165f26b_Zpi;
    public static RLC field_d4582cb_FfS;
    public static RLC field_f09dfd3b_zGp;
    public static RLC[] field_fde23b9f_FWm;
    public static RLC field_74f6d121_mrb;
    public static List field_6a0474ed_FWm;
    public static List<isy> field_2c197105_Qnq;
    public static RLC field_5bca797_IjH;
    public static RLC field_20260a22_FWm;
    public static List<isy> field_7eb83e1f_bzF;
    public static RLC field_35cb9f2c_ATE;
    public static RLC field_719b5412_Vxn;
    public static RLC field_328659e9_trS;

    private static void method_12a50a1d_Dne(RLC[] rLCArray, int n, int n2) {
        if (rLCArray[n] != null && rLCArray[n2] == null) {
            rLCArray[n2] = rLCArray[n];
        } else {
            field_f27c122c_Dne.remove(rLCArray[n]);
            field_2c197105_Qnq.remove(rLCArray[n]);
            field_6a0474ed_FWm.remove(rLCArray[n]);
            rLCArray[n] = rLCArray[n2];
        }
    }

    public static void method_ae128dc7_bzF() {
        field_5a147b51_bzF = trP.method_4608733d_Dne(field_5a147b51_bzF, "stat.useItem", 0x1020000, 256, 32000);
        field_85a6f5b7_Qnq = trP.method_e6936edc_FWm(field_85a6f5b7_Qnq, "stat.breakItem", 0x1030000, 256, 32000);
        field_21261e_FWm = true;
        trP.method_907a9d21_Qnq();
    }

    static {
        field_83b1c1b0_Dne = new HashMap();
        field_f27c122c_Dne = new ArrayList();
        field_6a0474ed_FWm = new ArrayList();
        field_7eb83e1f_bzF = new ArrayList();
        field_2c197105_Qnq = new ArrayList();
        field_36c3e43_Dne = new gJC(1000, "stat.startGame").method_f87c1cc1_FWm().method_2305cca2_Dne();
        field_20260a22_FWm = new gJC(1001, "stat.createWorld").method_f87c1cc1_FWm().method_2305cca2_Dne();
        field_75b40c30_bzF = new gJC(1002, "stat.loadWorld").method_f87c1cc1_FWm().method_2305cca2_Dne();
        field_5e55ad0a_Qnq = new gJC(1003, "stat.joinMultiplayer").method_f87c1cc1_FWm().method_2305cca2_Dne();
        field_712fc289_aFZ = new gJC(1004, "stat.leaveGame").method_f87c1cc1_FWm().method_2305cca2_Dne();
        field_f09dfd3b_zGp = new gJC(1100, "stat.playOneMinute", RLC.field_201fbe22_FWm).method_f87c1cc1_FWm().method_2305cca2_Dne();
        field_161f676c_DyG = new gJC(2000, "stat.walkOneCm", RLC.field_75adc030_bzF).method_f87c1cc1_FWm().method_2305cca2_Dne();
        field_1415146d_div = new gJC(2001, "stat.swimOneCm", RLC.field_75adc030_bzF).method_f87c1cc1_FWm().method_2305cca2_Dne();
        field_5bca797_IjH = new gJC(2002, "stat.fallOneCm", RLC.field_75adc030_bzF).method_f87c1cc1_FWm().method_2305cca2_Dne();
        field_74f6d121_mrb = new gJC(2003, "stat.climbOneCm", RLC.field_75adc030_bzF).method_f87c1cc1_FWm().method_2305cca2_Dne();
        field_1c2dcc82_XHL = new gJC(2004, "stat.flyOneCm", RLC.field_75adc030_bzF).method_f87c1cc1_FWm().method_2305cca2_Dne();
        field_6165f26b_Zpi = new gJC(2005, "stat.diveOneCm", RLC.field_75adc030_bzF).method_f87c1cc1_FWm().method_2305cca2_Dne();
        field_a21c6fab_kGO = new gJC(2006, "stat.minecartOneCm", RLC.field_75adc030_bzF).method_f87c1cc1_FWm().method_2305cca2_Dne();
        field_aefce6be_udO = new gJC(2007, "stat.boatOneCm", RLC.field_75adc030_bzF).method_f87c1cc1_FWm().method_2305cca2_Dne();
        field_ab2502f9_ooe = new gJC(2008, "stat.pigOneCm", RLC.field_75adc030_bzF).method_f87c1cc1_FWm().method_2305cca2_Dne();
        field_328659e9_trS = new gJC(2010, "stat.jump").method_f87c1cc1_FWm().method_2305cca2_Dne();
        field_1f012f07_qLR = new gJC(2011, "stat.drop").method_f87c1cc1_FWm().method_2305cca2_Dne();
        field_35cb9f2c_ATE = new gJC(2020, "stat.damageDealt").method_2305cca2_Dne();
        field_719b5412_Vxn = new gJC(2021, "stat.damageTaken").method_2305cca2_Dne();
        field_84fd841b_ceE = new gJC(2022, "stat.deaths").method_2305cca2_Dne();
        field_75785930_EyB = new gJC(2023, "stat.mobKills").method_2305cca2_Dne();
        field_d4582cb_FfS = new gJC(2024, "stat.playerKills").method_2305cca2_Dne();
        field_395329ea_OdI = new gJC(2025, "stat.fishCaught").method_2305cca2_Dne();
        field_83628b9e_Dne = trP.method_20d53d3a_Dne("stat.mineBlock", 0x1000000);
        qlg.method_7a46289a_Dne();
        field_2092bf_Dne = false;
        field_21261e_FWm = false;
    }

    private static RLC[] method_e6936edc_FWm(RLC[] rLCArray, String string, int n, int n2, int n3) {
        if (rLCArray == null) {
            rLCArray = new RLC[32000];
        }
        for (int i = n2; i < n3; ++i) {
            if (dEr.field_836aa5b6_Dne[i] == null || !dEr.field_836aa5b6_Dne[i].method_7ad38807_DyG()) continue;
            String string2 = KGL.method_98148f73_Dne(string, dEr.field_836aa5b6_Dne[i].method_6859cdb9_bzF());
            rLCArray[i] = new isy(n + i, string2, i).method_2305cca2_Dne();
        }
        trP.method_c2bff4fd_Dne(rLCArray);
        return rLCArray;
    }

    public static void method_907a9d21_Qnq() {
        if (field_2092bf_Dne && field_21261e_FWm) {
            HashSet<Integer> hashSet = new HashSet<Integer>();
            for (iQt object : aXt.method_230cd12e_Dne().method_adea226d_Dne()) {
                if (object.method_23040479_Dne() == null) continue;
                hashSet.add(object.method_23040479_Dne().field_2e5f1b_bzF);
            }
            for (NMq nMq : cTN.method_230da64e_Dne().method_d410254f_Dne().values()) {
                hashSet.add(nMq.field_2e5f1b_bzF);
            }
            field_fde23b9f_FWm = new RLC[32000];
            for (Integer n : hashSet) {
                if (dEr.field_836aa5b6_Dne[n] == null) continue;
                String string = KGL.method_98148f73_Dne("stat.craftItem", dEr.field_836aa5b6_Dne[n].method_6859cdb9_bzF());
                trP.field_fde23b9f_FWm[n.intValue()] = new isy(0x1010000 + n, string, n).method_2305cca2_Dne();
            }
            trP.method_c2bff4fd_Dne(field_fde23b9f_FWm);
        }
    }

    public static void method_7c6f6039_FWm() {
        field_5a147b51_bzF = trP.method_4608733d_Dne(field_5a147b51_bzF, "stat.useItem", 0x1020000, 0, 256);
        field_85a6f5b7_Qnq = trP.method_e6936edc_FWm(field_85a6f5b7_Qnq, "stat.breakItem", 0x1030000, 0, 256);
        field_2092bf_Dne = true;
        trP.method_907a9d21_Qnq();
    }

    private static RLC[] method_20d53d3a_Dne(String string, int n) {
        RLC[] rLCArray = new RLC[256];
        for (int i = 0; i < 256; ++i) {
            if (zKP.field_8374b848_Dne[i] == null || !zKP.field_8374b848_Dne[i].method_9a443a9d_XHL()) continue;
            String string2 = KGL.method_98148f73_Dne(string, zKP.field_8374b848_Dne[i].method_d1f1ed87_FWm());
            rLCArray[i] = new isy(n + i, string2, i).method_2305cca2_Dne();
            field_2c197105_Qnq.add((isy)rLCArray[i]);
        }
        trP.method_c2bff4fd_Dne(rLCArray);
        return rLCArray;
    }

    public static RLC method_9e6fe231_Dne(int n) {
        return (RLC)field_83b1c1b0_Dne.get(n);
    }

    public static void method_7a46289a_Dne() {
    }

    private static void method_c2bff4fd_Dne(RLC[] rLCArray) {
        trP.method_12a50a1d_Dne(rLCArray, zKP.field_16319416_DyG.field_21260d_FWm, zKP.field_374330f_Dne.field_21260d_FWm);
        trP.method_12a50a1d_Dne(rLCArray, zKP.field_14274117_div.field_21260d_FWm, zKP.field_14274117_div.field_21260d_FWm);
        trP.method_12a50a1d_Dne(rLCArray, zKP.field_dcc1edd5_XwR.field_21260d_FWm, zKP.field_32158d62_aJO.field_21260d_FWm);
        trP.method_12a50a1d_Dne(rLCArray, zKP.field_ddf29d67_qrB.field_21260d_FWm, zKP.field_cba1f2f1_haP.field_21260d_FWm);
        trP.method_12a50a1d_Dne(rLCArray, zKP.field_59cc4908_exS.field_21260d_FWm, zKP.field_390036e3_JLG.field_21260d_FWm);
        trP.method_12a50a1d_Dne(rLCArray, zKP.field_2037eebf_FWm.field_21260d_FWm, zKP.field_37e22e0_Dne.field_21260d_FWm);
        trP.method_12a50a1d_Dne(rLCArray, zKP.field_3f9bd7dc_CZC.field_21260d_FWm, zKP.field_4821929c_iNQ.field_21260d_FWm);
        trP.method_12a50a1d_Dne(rLCArray, zKP.field_5e6003e8_Qnq.field_21260d_FWm, zKP.field_75be630e_bzF.field_21260d_FWm);
        trP.method_12a50a1d_Dne(rLCArray, zKP.field_3747682_Dne.field_21260d_FWm, zKP.field_202e4261_FWm.field_21260d_FWm);
        trP.method_12a50a1d_Dne(rLCArray, zKP.field_75bc446f_bzF.field_21260d_FWm, zKP.field_5e5de549_Qnq.field_21260d_FWm);
        trP.method_12a50a1d_Dne(rLCArray, zKP.field_36ff555_Dne.field_21260d_FWm, zKP.field_203836cc_FWm.field_21260d_FWm);
        trP.method_12a50a1d_Dne(rLCArray, zKP.field_778fd823_rPc.field_21260d_FWm, zKP.field_203836cc_FWm.field_21260d_FWm);
    }

    private static RLC[] method_4608733d_Dne(RLC[] rLCArray, String string, int n, int n2, int n3) {
        if (rLCArray == null) {
            rLCArray = new RLC[32000];
        }
        for (int i = n2; i < n3; ++i) {
            if (dEr.field_836aa5b6_Dne[i] == null) continue;
            String string2 = KGL.method_98148f73_Dne(string, dEr.field_836aa5b6_Dne[i].method_6859cdb9_bzF());
            rLCArray[i] = new isy(n + i, string2, i).method_2305cca2_Dne();
            if (i < 256) continue;
            field_7eb83e1f_bzF.add((isy)rLCArray[i]);
        }
        trP.method_c2bff4fd_Dne(rLCArray);
        return rLCArray;
    }
}

