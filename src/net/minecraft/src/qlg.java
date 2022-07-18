package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class qlg {
    public static List field_f27c122c_Dne = new ArrayList();
    public static auk_0 field_1efa1379_qLR;
    public static auk_0 field_d2a5f464_oIf;
    public static auk_0 field_aef5cb30_udO;
    public static auk_0 field_75713da2_EyB;
    public static auk_0 field_71943884_Vxn;
    public static auk_0 field_327f3e5b_trS;
    public static auk_0 field_f096e1ad_zGp;
    public static auk_0 field_7128a6fb_aFZ;
    public static auk_0 field_ab1de76b_ooe;
    public static auk_0 field_394c0e5c_OdI;
    public static auk_0 field_dd64902d_Fnk;
    public static auk_0 field_36522b5_Dne;
    public static auk_0 field_a215541d_kGO;
    public static auk_0 field_201eee94_FWm;
    public static int field_2e5f1b_bzF;
    public static auk_0 field_75acf0a2_bzF;
    public static auk_0 field_8e6e7ee1_vSL;
    public static int field_21260d_FWm;
    public static auk_0 field_d3e673d_FfS;
    public static auk_0 field_615ed6dd_Zpi;
    public static auk_0 field_84f6688d_ceE;
    public static int field_267cf5_Qnq;
    public static auk_0 field_9f26b916_RPx;
    public static auk_0 field_1c26b0f4_XHL;
    public static int field_2092ae_Dne;
    public static auk_0 field_5b58c09_IjH;
    public static auk_0 field_140df8df_div;
    public static auk_0 field_5e4e917c_Qnq;
    public static auk_0 field_35c4839e_ATE;
    public static auk_0 field_16184bde_DyG;
    public static auk_0 field_74efb593_mrb;

    public static void method_7a46289a_Dne() {
    }

    static {
        field_36522b5_Dne = new auk_0(0, "openInventory", 0, 0, dEr.field_4976bda6_TKg, (auk_0)null).method_22feb114_Dne().method_228ab7c1_bzF();
        field_201eee94_FWm = new auk_0(1, "mineWood", 2, 1, zKP.field_af0f1368_udO, field_36522b5_Dne).method_228ab7c1_bzF();
        field_75acf0a2_bzF = new auk_0(2, "buildWorkBench", 4, -1, zKP.field_47237a3_mlD, field_201eee94_FWm).method_228ab7c1_bzF();
        field_5e4e917c_Qnq = new auk_0(3, "buildPickaxe", 4, 2, dEr.field_af0500d6_udO, field_75acf0a2_bzF).method_228ab7c1_bzF();
        field_7128a6fb_aFZ = new auk_0(4, "buildFurnace", 3, 4, zKP.field_cba1f2f1_haP, field_5e4e917c_Qnq).method_228ab7c1_bzF();
        field_f096e1ad_zGp = new auk_0(5, "acquireIron", 1, 4, dEr.field_5c4c1af_IjH, field_7128a6fb_aFZ).method_228ab7c1_bzF();
        field_16184bde_DyG = new auk_0(6, "buildHoe", 2, -3, dEr.field_9542c231_Wwe, field_75acf0a2_bzF).method_228ab7c1_bzF();
        field_140df8df_div = new auk_0(7, "makeBread", -1, -3, dEr.field_7785c591_rPc, field_16184bde_DyG).method_228ab7c1_bzF();
        field_5b58c09_IjH = new auk_0(8, "bakeCake", 0, -5, dEr.field_5fe93310_iXU, field_16184bde_DyG).method_228ab7c1_bzF();
        field_74efb593_mrb = new auk_0(9, "buildBetterPickaxe", 6, 2, dEr.field_35d3b944_ATE, field_5e4e917c_Qnq).method_228ab7c1_bzF();
        field_1c26b0f4_XHL = new auk_0(10, "cookFish", 2, 6, dEr.field_1ea4296e_kSP, field_7128a6fb_aFZ).method_228ab7c1_bzF();
        field_615ed6dd_Zpi = new auk_0(11, "onARail", 2, 3, zKP.field_69989981_FYZ, field_f096e1ad_zGp).method_f8750133_FWm().method_228ab7c1_bzF();
        field_a215541d_kGO = new auk_0(12, "buildSword", 6, -1, dEr.field_616e0c83_Zpi, field_75acf0a2_bzF).method_228ab7c1_bzF();
        field_aef5cb30_udO = new auk_0(13, "killEnemy", 8, -1, dEr.field_fc3bf6d1_tIz, field_a215541d_kGO).method_228ab7c1_bzF();
        field_ab1de76b_ooe = new auk_0(14, "killCow", 7, -3, dEr.field_443297f2_LoG, field_a215541d_kGO).method_228ab7c1_bzF();
        field_327f3e5b_trS = new auk_0(15, "flyPig", 8, -4, dEr.field_9372b110_YHU, field_ab1de76b_ooe).method_f8750133_FWm().method_228ab7c1_bzF();
        field_1efa1379_qLR = new auk_0(16, "snipeSkeleton", 7, 0, dEr.field_3667432_Dne, field_aef5cb30_udO).method_f8750133_FWm().method_228ab7c1_bzF();
        field_35c4839e_ATE = new auk_0(17, "diamonds", -1, 5, dEr.field_141d2e85_div, field_f096e1ad_zGp).method_228ab7c1_bzF();
        field_71943884_Vxn = new auk_0(18, "portal", -1, 7, zKP.field_e641c680_cot, field_35c4839e_ATE).method_228ab7c1_bzF();
        field_84f6688d_ceE = new auk_0(19, "ghast", -4, 8, dEr.field_727810e1_ivB, field_71943884_Vxn).method_f8750133_FWm().method_228ab7c1_bzF();
        field_75713da2_EyB = new auk_0(20, "blazeRod", 0, 9, dEr.field_d1baeb7c_TpV, field_71943884_Vxn).method_228ab7c1_bzF();
        field_d3e673d_FfS = new auk_0(21, "potion", 2, 8, dEr.field_3682442_Dne, field_75713da2_EyB).method_228ab7c1_bzF();
        field_394c0e5c_OdI = new auk_0(22, "theEnd", 3, 10, dEr.field_1031d495_Woy, field_75713da2_EyB).method_f8750133_FWm().method_228ab7c1_bzF();
        field_d2a5f464_oIf = new auk_0(23, "theEnd2", 4, 13, zKP.field_86be178c_sJS, field_394c0e5c_OdI).method_f8750133_FWm().method_228ab7c1_bzF();
        field_8e6e7ee1_vSL = new auk_0(24, "enchantments", -4, 4, zKP.field_558df63_KkE, field_35c4839e_ATE).method_228ab7c1_bzF();
        field_9f26b916_RPx = new auk_0(25, "overkill", -4, 1, dEr.field_85059e33_ceE, field_8e6e7ee1_vSL).method_f8750133_FWm().method_228ab7c1_bzF();
        field_dd64902d_Fnk = new auk_0(26, "bookcase", -3, 6, zKP.field_24a90a48_AgF, field_8e6e7ee1_vSL).method_228ab7c1_bzF();
        System.out.println(field_f27c122c_Dne.size() + " achievements");
    }
}

