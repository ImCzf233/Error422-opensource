package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class aXt {
    private static final aXt field_37342cf_Dne = new aXt();
    private List field_f27c122c_Dne = new ArrayList();

    public NMq method_6c5d33f6_Dne(Uqm var1, Qnq var2) {
        int var3 = 0;
        NMq var4 = null;
        NMq var5 = null;

        int var6;
        for(var6 = 0; var6 < var1.method_907a9d14_Qnq(); ++var6) {
            NMq var7 = var1.method_9e6e1a08_Dne(var6);
            if (var7 != null) {
                if (var3 == 0) {
                    var4 = var7;
                }

                if (var3 == 1) {
                    var5 = var7;
                }

                ++var3;
            }
        }

        if (var3 == 2 && var4.field_2e5f1b_bzF == var5.field_2e5f1b_bzF && var4.field_2092ae_Dne == 1 && var5.field_2092ae_Dne == 1 && dEr.field_836aa5b6_Dne[var4.field_2e5f1b_bzF].method_7ad38807_DyG()) {
            dEr var13 = dEr.field_836aa5b6_Dne[var4.field_2e5f1b_bzF];
            int var8 = var13.method_a98a0653_aFZ() - var4.method_ae128dba_bzF();
            int var9 = var13.method_a98a0653_aFZ() - var5.method_ae128dba_bzF();
            int var10 = var8 + var9 + var13.method_a98a0653_aFZ() * 5 / 100;
            int var11 = var13.method_a98a0653_aFZ() - var10;
            if (var11 < 0) {
                var11 = 0;
            }

            return new NMq(var4.field_2e5f1b_bzF, 1, var11);
        } else {
            for(var6 = 0; var6 < this.field_f27c122c_Dne.size(); ++var6) {
                iQt var12 = (iQt)this.field_f27c122c_Dne.get(var6);
                if (var12.method_cbf49e9b_Dne(var1, var2)) {
                    return var12.method_b1bef5f5_Dne(var1);
                }
            }

            return null;
        }
    }

    void method_258a71fc_Dne(NMq nMq, Object ... objectArray) {
        ArrayList<NMq> arrayList = new ArrayList<NMq>();
        Object[] objectArray2 = objectArray;
        int n = objectArray.length;
        for (int i = 0; i < n; ++i) {
            Object object = objectArray2[i];
            if (object instanceof NMq) {
                arrayList.add(((NMq)object).method_23040479_Dne());
                continue;
            }
            if (object instanceof dEr) {
                arrayList.add(new NMq((dEr)object));
                continue;
            }
            if (!(object instanceof zKP)) {
                throw new RuntimeException("Invalid shapeless recipy!");
            }
            arrayList.add(new NMq((zKP)object));
        }
        this.field_f27c122c_Dne.add(new NDp(nMq, arrayList));
    }

    public List<iQt> method_adea226d_Dne() {
        return this.field_f27c122c_Dne;
    }

    UgS method_9664596c_Dne(NMq var1, Object... var2) {
        String var3 = "";
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (var2[var4] instanceof String[]) {
            String[] var11 = (String[])((String[])((String[])var2[var4++]));

            for(int var8 = 0; var8 < var11.length; ++var8) {
                String var9 = var11[var8];
                ++var6;
                var5 = var9.length();
                var3 = var3 + var9;
            }
        } else {
            while(var2[var4] instanceof String) {
                String var7 = (String)var2[var4++];
                ++var6;
                var5 = var7.length();
                var3 = var3 + var7;
            }
        }

        HashMap var12;
        for(var12 = new HashMap(); var4 < var2.length; var4 += 2) {
            Character var13 = (Character)var2[var4];
            NMq var15 = null;
            if (var2[var4 + 1] instanceof dEr) {
                var15 = new NMq((dEr)var2[var4 + 1]);
            } else if (var2[var4 + 1] instanceof zKP) {
                var15 = new NMq((zKP)var2[var4 + 1], 1, 32767);
            } else if (var2[var4 + 1] instanceof NMq) {
                var15 = (NMq)var2[var4 + 1];
            }

            var12.put(var13, var15);
        }

        NMq[] var14 = new NMq[var5 * var6];

        for(int var16 = 0; var16 < var5 * var6; ++var16) {
            char var10 = var3.charAt(var16);
            if (var12.containsKey(var10)) {
                var14[var16] = ((NMq)var12.get(var10)).method_23040479_Dne();
            } else {
                var14[var16] = null;
            }
        }

        UgS var17 = new UgS(var5, var6, var14, var1);
        this.field_f27c122c_Dne.add(var17);
        return var17;
    }

    private aXt() {
        new oPB().method_9d6a428a_Dne(this);
        new RTA().method_9d6a428a_Dne(this);
        new Gmj().method_9d6a428a_Dne(this);
        new HeS().method_9d6a428a_Dne(this);
        new Olj().method_9d6a428a_Dne(this);
        new jWh().method_9d6a428a_Dne(this);
        new ILu().method_9d6a428a_Dne(this);
        this.field_f27c122c_Dne.add(new mtp_0());
        this.field_f27c122c_Dne.add(new pnl());
        this.field_f27c122c_Dne.add(new JxZ());
        this.field_f27c122c_Dne.add(new VfL());
        this.method_9664596c_Dne(new NMq(dEr.field_90cb7cdd_lMz, 3), "###", Character.valueOf('#'), dEr.field_27e84f19_XjO);
        this.method_258a71fc_Dne(new NMq(dEr.field_4976bda6_TKg, 1), dEr.field_90cb7cdd_lMz, dEr.field_90cb7cdd_lMz, dEr.field_90cb7cdd_lMz, dEr.field_443297f2_LoG);
        this.method_258a71fc_Dne(new NMq(dEr.field_9a03eeb4_Jjb, 1), dEr.field_4976bda6_TKg, new NMq(dEr.field_5d50330c_edi, 1, 0), dEr.field_d73ac430_yMz);
        this.method_9664596c_Dne(new NMq(zKP.field_ce2a1dc8_sly, 2), "###", "###", Character.valueOf('#'), dEr.field_d2b52a0a_oIf);
        this.method_9664596c_Dne(new NMq(zKP.field_94470304_dYY, 6, 0), "###", "###", Character.valueOf('#'), zKP.field_75c638da_bzF);
        this.method_9664596c_Dne(new NMq(zKP.field_94470304_dYY, 6, 1), "###", "###", Character.valueOf('#'), zKP.field_d744d6c2_yMz);
        this.method_9664596c_Dne(new NMq(zKP.field_d1c4fe0e_TpV, 6), "###", "###", Character.valueOf('#'), zKP.field_38c5f505_iNH);
        this.method_9664596c_Dne(new NMq(zKP.field_b2a619d_mzX, 1), "#W#", "#W#", Character.valueOf('#'), dEr.field_d2b52a0a_oIf, Character.valueOf('W'), zKP.field_5e67d9b4_Qnq);
        this.method_9664596c_Dne(new NMq(zKP.field_20bdd0fb_jBE, 1), "###", "#X#", "###", Character.valueOf('#'), zKP.field_5e67d9b4_Qnq, Character.valueOf('X'), dEr.field_141d2e85_div);
        this.method_9664596c_Dne(new NMq(zKP.field_758a85da_EyB, 1), "###", "#X#", "###", Character.valueOf('#'), zKP.field_5e67d9b4_Qnq, Character.valueOf('X'), dEr.field_59c23676_exS);
        this.method_9664596c_Dne(new NMq(zKP.field_24a90a48_AgF, 1), "###", "XXX", "###", Character.valueOf('#'), zKP.field_5e67d9b4_Qnq, Character.valueOf('X'), dEr.field_4976bda6_TKg);
        this.method_9664596c_Dne(new NMq(zKP.field_7483639c_Jik, 1), "##", "##", Character.valueOf('#'), dEr.field_4817800a_iNQ);
        this.method_9664596c_Dne(new NMq(zKP.field_23a1e80a_EwP, 6), "###", Character.valueOf('#'), zKP.field_7483639c_Jik);
        this.method_9664596c_Dne(new NMq(zKP.field_90d58f6f_lMz, 1), "##", "##", Character.valueOf('#'), dEr.field_7479510a_Jik);
        this.method_9664596c_Dne(new NMq(zKP.field_80184b8_tgc, 1), "##", "##", Character.valueOf('#'), dEr.field_c4be0c0b_xEx);
        this.method_9664596c_Dne(new NMq(zKP.field_3b150dda_fYA, 1), "##", "##", Character.valueOf('#'), dEr.field_dcb7db43_XwR);
        this.method_9664596c_Dne(new NMq(zKP.field_212fd45c_PpL, 1), "##", "##", Character.valueOf('#'), dEr.field_fd198bbb_RMv);
        this.method_9664596c_Dne(new NMq(zKP.field_9f40014e_RPx, 1), "##", "##", Character.valueOf('#'), dEr.field_249ef7b6_AgF);
        this.method_9664596c_Dne(new NMq(zKP.field_cb5aacc0_qXo, 1), "X#X", "#X#", "X#X", Character.valueOf('X'), dEr.field_e637b3ee_cot, Character.valueOf('#'), zKP.field_5ced441_IjH);
        this.method_9664596c_Dne(new NMq(zKP.field_202e4261_FWm, 6, 3), "###", Character.valueOf('#'), zKP.field_75c638da_bzF);
        this.method_9664596c_Dne(new NMq(zKP.field_202e4261_FWm, 6, 0), "###", Character.valueOf('#'), zKP.field_37e6aed_Dne);
        this.method_9664596c_Dne(new NMq(zKP.field_202e4261_FWm, 6, 1), "###", Character.valueOf('#'), zKP.field_850fb0c5_ceE);
        this.method_9664596c_Dne(new NMq(zKP.field_202e4261_FWm, 6, 4), "###", Character.valueOf('#'), zKP.field_80184b8_tgc);
        this.method_9664596c_Dne(new NMq(zKP.field_202e4261_FWm, 6, 5), "###", Character.valueOf('#'), zKP.field_39272339_WvN);
        this.method_9664596c_Dne(new NMq(zKP.field_202e4261_FWm, 6, 6), "###", Character.valueOf('#'), zKP.field_38c5f505_iNH);
        this.method_9664596c_Dne(new NMq(zKP.field_202e4261_FWm, 6, 7), "###", Character.valueOf('#'), zKP.field_212fd45c_PpL);
        this.method_9664596c_Dne(new NMq(zKP.field_5e5de549_Qnq, 6, 0), "###", Character.valueOf('#'), new NMq(zKP.field_5e67d9b4_Qnq, 1, 0));
        this.method_9664596c_Dne(new NMq(zKP.field_5e5de549_Qnq, 6, 2), "###", Character.valueOf('#'), new NMq(zKP.field_5e67d9b4_Qnq, 1, 2));
        this.method_9664596c_Dne(new NMq(zKP.field_5e5de549_Qnq, 6, 1), "###", Character.valueOf('#'), new NMq(zKP.field_5e67d9b4_Qnq, 1, 1));
        this.method_9664596c_Dne(new NMq(zKP.field_5e5de549_Qnq, 6, 3), "###", Character.valueOf('#'), new NMq(zKP.field_5e67d9b4_Qnq, 1, 3));
        this.method_9664596c_Dne(new NMq(zKP.field_fa1a6f1_ZfC, 3), "# #", "###", "# #", Character.valueOf('#'), dEr.field_d2b52a0a_oIf);
        this.method_9664596c_Dne(new NMq(dEr.field_91d51f76_BJH, 1), "##", "##", "##", Character.valueOf('#'), zKP.field_5e67d9b4_Qnq);
        this.method_9664596c_Dne(new NMq(zKP.field_5d5a459e_edi, 2), "###", "###", Character.valueOf('#'), zKP.field_5e67d9b4_Qnq);
        this.method_9664596c_Dne(new NMq(dEr.field_38f62451_JLG, 1), "##", "##", "##", Character.valueOf('#'), dEr.field_5c4c1af_IjH);
        this.method_9664596c_Dne(new NMq(dEr.field_698e86ef_FYZ, 3), "###", "###", " X ", Character.valueOf('#'), zKP.field_5e67d9b4_Qnq, Character.valueOf('X'), dEr.field_d2b52a0a_oIf);
        this.method_9664596c_Dne(new NMq(dEr.field_5fe93310_iXU, 1), "AAA", "BEB", "CCC", Character.valueOf('A'), dEr.field_2397d578_EwP, Character.valueOf('B'), dEr.field_391d10a7_WvN, Character.valueOf('C'), dEr.field_ce7bf76e_EWz, Character.valueOf('E'), dEr.field_b39ca005_KLR);
        this.method_9664596c_Dne(new NMq(dEr.field_391d10a7_WvN, 1), "#", Character.valueOf('#'), dEr.field_27e84f19_XjO);
        this.method_9664596c_Dne(new NMq(zKP.field_5e67d9b4_Qnq, 4, 0), "#", Character.valueOf('#'), new NMq(zKP.field_af0f1368_udO, 1, 0));
        this.method_9664596c_Dne(new NMq(zKP.field_5e67d9b4_Qnq, 4, 1), "#", Character.valueOf('#'), new NMq(zKP.field_af0f1368_udO, 1, 1));
        this.method_9664596c_Dne(new NMq(zKP.field_5e67d9b4_Qnq, 4, 2), "#", Character.valueOf('#'), new NMq(zKP.field_af0f1368_udO, 1, 2));
        this.method_9664596c_Dne(new NMq(zKP.field_5e67d9b4_Qnq, 4, 3), "#", Character.valueOf('#'), new NMq(zKP.field_af0f1368_udO, 1, 3));
        this.method_9664596c_Dne(new NMq(dEr.field_d2b52a0a_oIf, 4), "#", "#", Character.valueOf('#'), zKP.field_5e67d9b4_Qnq);
        this.method_9664596c_Dne(new NMq(zKP.field_954cd4c3_Wwe, 4), "X", "#", Character.valueOf('X'), dEr.field_16278184_DyG, Character.valueOf('#'), dEr.field_d2b52a0a_oIf);
        this.method_9664596c_Dne(new NMq(zKP.field_954cd4c3_Wwe, 4), "X", "#", Character.valueOf('X'), new NMq(dEr.field_16278184_DyG, 1, 1), Character.valueOf('#'), dEr.field_d2b52a0a_oIf);
        this.method_9664596c_Dne(new NMq(dEr.field_8e7db487_vSL, 4), "# #", " # ", Character.valueOf('#'), zKP.field_5e67d9b4_Qnq);
        this.method_9664596c_Dne(new NMq(dEr.field_7c27c815_OCU, 3), "# #", " # ", Character.valueOf('#'), zKP.field_32988693_trS);
        this.method_9664596c_Dne(new NMq(zKP.field_69989981_FYZ, 16), "X X", "X#X", "X X", Character.valueOf('X'), dEr.field_5c4c1af_IjH, Character.valueOf('#'), dEr.field_d2b52a0a_oIf);
        this.method_9664596c_Dne(new NMq(zKP.field_39655694_OdI, 6), "X X", "X#X", "XRX", Character.valueOf('X'), dEr.field_74feeb39_mrb, Character.valueOf('R'), dEr.field_59c23676_exS, Character.valueOf('#'), dEr.field_d2b52a0a_oIf);
        this.method_9664596c_Dne(new NMq(zKP.field_f674470_Dsg, 6), "XSX", "X#X", "XSX", Character.valueOf('X'), dEr.field_5c4c1af_IjH, Character.valueOf('#'), zKP.field_3f9bd7dc_CZC, Character.valueOf('S'), dEr.field_d2b52a0a_oIf);
        this.method_9664596c_Dne(new NMq(zKP.field_d2bf3c9c_oIf, 6), "X X", "X#X", "XRX", Character.valueOf('X'), dEr.field_5c4c1af_IjH, Character.valueOf('R'), dEr.field_59c23676_exS, Character.valueOf('#'), zKP.field_6a32fa5a_xXN);
        this.method_9664596c_Dne(new NMq(dEr.field_79f29743_IYC, 1), "# #", "###", Character.valueOf('#'), dEr.field_5c4c1af_IjH);
        this.method_9664596c_Dne(new NMq(dEr.field_c29c5164_yaZ, 1), "# #", "# #", "###", Character.valueOf('#'), dEr.field_5c4c1af_IjH);
        this.method_9664596c_Dne(new NMq(dEr.field_292732da_ZkM, 1), " B ", "###", Character.valueOf('#'), zKP.field_75c638da_bzF, Character.valueOf('B'), dEr.field_d1baeb7c_TpV);
        this.method_9664596c_Dne(new NMq(zKP.field_dcc1edd5_XwR, 1), "A", "B", Character.valueOf('A'), zKP.field_32158d62_aJO, Character.valueOf('B'), zKP.field_954cd4c3_Wwe);
        this.method_9664596c_Dne(new NMq(dEr.field_ce200b36_sly, 1), "A", "B", Character.valueOf('A'), zKP.field_375bc02_Dne, Character.valueOf('B'), dEr.field_79f29743_IYC);
        this.method_9664596c_Dne(new NMq(dEr.field_320b7ad0_aJO, 1), "A", "B", Character.valueOf('A'), zKP.field_cba1f2f1_haP, Character.valueOf('B'), dEr.field_79f29743_IYC);
        this.method_9664596c_Dne(new NMq(dEr.field_f5d31de_Dsg, 1), "A", "B", Character.valueOf('A'), zKP.field_cb5aacc0_qXo, Character.valueOf('B'), dEr.field_79f29743_IYC);
        this.method_9664596c_Dne(new NMq(dEr.field_c47e8831_yHt, 1), "A", "B", Character.valueOf('A'), zKP.field_36d4148_Dne, Character.valueOf('B'), dEr.field_79f29743_IYC);
        this.method_9664596c_Dne(new NMq(dEr.field_3f91c54a_CZC, 1), "# #", "###", Character.valueOf('#'), zKP.field_5e67d9b4_Qnq);
        this.method_9664596c_Dne(new NMq(dEr.field_5ac2e6dc_qMV, 1), "# #", " # ", Character.valueOf('#'), dEr.field_5c4c1af_IjH);
        this.method_9664596c_Dne(new NMq(dEr.field_ed76a7f3_ZeN, 1), "# #", " # ", Character.valueOf('#'), dEr.field_c4be0c0b_xEx);
        this.method_9664596c_Dne(new NMq(dEr.field_5e5dc722_Qnq, 1), "A ", " B", Character.valueOf('A'), dEr.field_5c4c1af_IjH, Character.valueOf('B'), dEr.field_cb97e05f_haP);
        this.method_9664596c_Dne(new NMq(dEr.field_7785c591_rPc, 1), "###", Character.valueOf('#'), dEr.field_ce7bf76e_EWz);
        this.method_9664596c_Dne(new NMq(zKP.field_7a2b5882_One, 4), "#  ", "## ", "###", Character.valueOf('#'), new NMq(zKP.field_5e67d9b4_Qnq, 1, 0));
        this.method_9664596c_Dne(new NMq(zKP.field_86f708eb_Kvh, 4), "#  ", "## ", "###", Character.valueOf('#'), new NMq(zKP.field_5e67d9b4_Qnq, 1, 2));
        this.method_9664596c_Dne(new NMq(zKP.field_68ab5f46_CLK, 4), "#  ", "## ", "###", Character.valueOf('#'), new NMq(zKP.field_5e67d9b4_Qnq, 1, 1));
        this.method_9664596c_Dne(new NMq(zKP.field_7fd0ac6a_FUM, 4), "#  ", "## ", "###", Character.valueOf('#'), new NMq(zKP.field_5e67d9b4_Qnq, 1, 3));
        this.method_9664596c_Dne(new NMq(dEr.field_37c7eec_Dne, 1), "  #", " #X", "# X", Character.valueOf('#'), dEr.field_d2b52a0a_oIf, Character.valueOf('X'), dEr.field_249ef7b6_AgF);
        this.method_9664596c_Dne(new NMq(dEr.field_921b35cb_etZ, 1), "# ", " X", Character.valueOf('#'), dEr.field_37c7eec_Dne, Character.valueOf('X'), dEr.field_943cf072_dYY).method_2307910a_Dne();
        this.method_9664596c_Dne(new NMq(zKP.field_91df3208_BJH, 4), "#  ", "## ", "###", Character.valueOf('#'), zKP.field_75c638da_bzF);
        this.method_9664596c_Dne(new NMq(zKP.field_ba1cd85c_qqL, 4), "#  ", "## ", "###", Character.valueOf('#'), zKP.field_80184b8_tgc);
        this.method_9664596c_Dne(new NMq(zKP.field_bf6a10e6_yIR, 4), "#  ", "## ", "###", Character.valueOf('#'), zKP.field_39272339_WvN);
        this.method_9664596c_Dne(new NMq(zKP.field_72822373_ivB, 4), "#  ", "## ", "###", Character.valueOf('#'), zKP.field_38c5f505_iNH);
        this.method_9664596c_Dne(new NMq(zKP.field_b77fe6db_Wnd, 4), "#  ", "## ", "###", Character.valueOf('#'), zKP.field_850fb0c5_ceE);
        this.method_9664596c_Dne(new NMq(zKP.field_fd239e4d_RMv, 4), "#  ", "## ", "###", Character.valueOf('#'), zKP.field_212fd45c_PpL);
        this.method_9664596c_Dne(new NMq(dEr.field_ce0badb_ICU, 1), "###", "#X#", "###", Character.valueOf('#'), dEr.field_d2b52a0a_oIf, Character.valueOf('X'), zKP.field_9f40014e_RPx);
        this.method_9664596c_Dne(new NMq(dEr.field_7fc699d8_FUM, 1), "###", "#X#", "###", Character.valueOf('#'), dEr.field_d2b52a0a_oIf, Character.valueOf('X'), dEr.field_443297f2_LoG);
        this.method_9664596c_Dne(new NMq(dEr.field_f97945f_ZfC, 1, 0), "###", "#X#", "###", Character.valueOf('#'), dEr.field_2653f0f8_uzC, Character.valueOf('X'), dEr.field_7137dca1_aFZ);
        this.method_9664596c_Dne(new NMq(dEr.field_f97945f_ZfC, 1, 1), "###", "#X#", "###", Character.valueOf('#'), zKP.field_dd7dd865_Fnk, Character.valueOf('X'), dEr.field_7137dca1_aFZ);
        this.method_9664596c_Dne(new NMq(dEr.field_baa2a2ab_gpt, 1, 0), "###", "#X#", "###", Character.valueOf('#'), dEr.field_2653f0f8_uzC, Character.valueOf('X'), dEr.field_943cf072_dYY);
        this.method_9664596c_Dne(new NMq(zKP.field_dfb6fab4_cHy, 1), "X", "#", Character.valueOf('#'), zKP.field_75c638da_bzF, Character.valueOf('X'), dEr.field_d2b52a0a_oIf);
        this.method_9664596c_Dne(new NMq(zKP.field_37692b5_Dne, 2), "I", "S", "#", Character.valueOf('#'), zKP.field_5e67d9b4_Qnq, Character.valueOf('S'), dEr.field_d2b52a0a_oIf, Character.valueOf('I'), dEr.field_5c4c1af_IjH);
        this.method_9664596c_Dne(new NMq(zKP.field_3f9bd7dc_CZC, 1), "X", "#", Character.valueOf('#'), dEr.field_d2b52a0a_oIf, Character.valueOf('X'), dEr.field_59c23676_exS);
        this.method_9664596c_Dne(new NMq(dEr.field_1ed6a8f5_Sdr, 1), "#X#", "III", Character.valueOf('#'), zKP.field_3f9bd7dc_CZC, Character.valueOf('X'), dEr.field_59c23676_exS, Character.valueOf('I'), zKP.field_37e6aed_Dne);
        this.method_9664596c_Dne(new NMq(dEr.field_662f3906_NEG, 1), " # ", "#X#", "III", Character.valueOf('#'), zKP.field_3f9bd7dc_CZC, Character.valueOf('X'), dEr.field_fd198bbb_RMv, Character.valueOf('I'), zKP.field_37e6aed_Dne);
        this.method_9664596c_Dne(new NMq(dEr.field_3b0afb48_fYA, 1), " # ", "#X#", " # ", Character.valueOf('#'), dEr.field_74feeb39_mrb, Character.valueOf('X'), dEr.field_59c23676_exS);
        this.method_9664596c_Dne(new NMq(dEr.field_9479d34e_Suj, 1), " # ", "#X#", " # ", Character.valueOf('#'), dEr.field_5c4c1af_IjH, Character.valueOf('X'), dEr.field_59c23676_exS);
        this.method_9664596c_Dne(new NMq(dEr.field_3651a1c_Dne, 1), "###", "#X#", "###", Character.valueOf('#'), dEr.field_90cb7cdd_lMz, Character.valueOf('X'), dEr.field_9479d34e_Suj);
        this.method_9664596c_Dne(new NMq(zKP.field_443caa84_LoG, 1), "#", Character.valueOf('#'), zKP.field_37e6aed_Dne);
        this.method_9664596c_Dne(new NMq(zKP.field_baacb53d_gpt, 1), "#", Character.valueOf('#'), zKP.field_5e67d9b4_Qnq);
        this.method_9664596c_Dne(new NMq(zKP.field_6a32fa5a_xXN, 1), "##", Character.valueOf('#'), zKP.field_37e6aed_Dne);
        this.method_9664596c_Dne(new NMq(zKP.field_937cc3a2_YHU, 1), "##", Character.valueOf('#'), zKP.field_5e67d9b4_Qnq);
        this.method_9664596c_Dne(new NMq(zKP.field_f76ec5b7_kQw, 1), "##", Character.valueOf('#'), dEr.field_5c4c1af_IjH);
        this.method_9664596c_Dne(new NMq(zKP.field_be249aaa_Pwe, 1), "##", Character.valueOf('#'), dEr.field_74feeb39_mrb);
        this.method_9664596c_Dne(new NMq(zKP.field_71ad80bc_Vxn, 1), "###", "#X#", "#R#", Character.valueOf('#'), zKP.field_75c638da_bzF, Character.valueOf('X'), dEr.field_3667432_Dne, Character.valueOf('R'), dEr.field_59c23676_exS);
        this.method_9664596c_Dne(new NMq(zKP.field_c4889ac3_yHt, 1), "###", "# #", "#R#", Character.valueOf('#'), zKP.field_75c638da_bzF, Character.valueOf('R'), dEr.field_59c23676_exS);
        this.method_9664596c_Dne(new NMq(zKP.field_20291847_FWm, 1), "TTT", "#X#", "#R#", Character.valueOf('#'), zKP.field_75c638da_bzF, Character.valueOf('X'), dEr.field_5c4c1af_IjH, Character.valueOf('R'), dEr.field_59c23676_exS, Character.valueOf('T'), zKP.field_5e67d9b4_Qnq);
        this.method_9664596c_Dne(new NMq(zKP.field_36f4c68_Dne, 1), "S", "P", Character.valueOf('S'), dEr.field_20b3be69_jBE, Character.valueOf('P'), zKP.field_20291847_FWm);
        this.method_9664596c_Dne(new NMq(dEr.field_a76b2fd2_Kmf, 1), "###", "XXX", Character.valueOf('#'), zKP.field_9f40014e_RPx, Character.valueOf('X'), zKP.field_5e67d9b4_Qnq);
        this.method_9664596c_Dne(new NMq(zKP.field_558df63_KkE, 1), " B ", "D#D", "###", Character.valueOf('#'), zKP.field_e641c680_cot, Character.valueOf('B'), dEr.field_4976bda6_TKg, Character.valueOf('D'), dEr.field_141d2e85_div);
        this.method_9664596c_Dne(new NMq(zKP.field_9225485d_etZ, 1), "III", " i ", "iii", Character.valueOf('I'), zKP.field_77fdc06_gnI, Character.valueOf('i'), dEr.field_5c4c1af_IjH);
        this.method_258a71fc_Dne(new NMq(dEr.field_1031d495_Woy, 1), dEr.field_38bbe273_iNH, dEr.field_4e5864a7_dNY);
        this.method_258a71fc_Dne(new NMq(dEr.field_9b1ab643_lDk, 3), dEr.field_e637b3ee_cot, dEr.field_4e5864a7_dNY, dEr.field_16278184_DyG);
        this.method_258a71fc_Dne(new NMq(dEr.field_9b1ab643_lDk, 3), dEr.field_e637b3ee_cot, dEr.field_4e5864a7_dNY, new NMq(dEr.field_16278184_DyG, 1, 1));
        this.method_9664596c_Dne(new NMq(zKP.field_3749f32_Dne), "GGG", "QQQ", "WWW", Character.valueOf('G'), zKP.field_32988693_trS, Character.valueOf('Q'), dEr.field_fd198bbb_RMv, Character.valueOf('W'), zKP.field_5e5de549_Qnq);
        this.method_9664596c_Dne(new NMq(zKP.field_36d4148_Dne), "I I", "ICI", " I ", Character.valueOf('I'), dEr.field_5c4c1af_IjH, Character.valueOf('C'), zKP.field_375bc02_Dne);
        Collections.sort(this.field_f27c122c_Dne, new Ddl(this));
        System.out.println(this.field_f27c122c_Dne.size() + " recipes");
    }

    public static final aXt method_230cd12e_Dne() {
        return field_37342cf_Dne;
    }
}

