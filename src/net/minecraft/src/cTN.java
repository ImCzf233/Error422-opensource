package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;

public class cTN {
    private Map field_da2182cf_FWm;
    private static final cTN field_37417ef_Dne = new cTN();
    private Map field_83b1c1b0_Dne = new HashMap();

    public float method_ce7f5d99_Dne(int n) {
        return this.field_da2182cf_FWm.containsKey(n) ? ((Float)this.field_da2182cf_FWm.get(n)).floatValue() : 0.0f;
    }

    public static final cTN method_230da64e_Dne() {
        return field_37417ef_Dne;
    }

    public NMq method_9e6e1a08_Dne(int n) {
        return (NMq)this.field_83b1c1b0_Dne.get(n);
    }

    public Map<Object, NMq> method_d410254f_Dne() {
        return this.field_83b1c1b0_Dne;
    }

    public void method_5913691a_Dne(int n, NMq nMq, float f) {
        this.field_83b1c1b0_Dne.put(n, nMq);
        this.field_da2182cf_FWm.put(nMq.field_2e5f1b_bzF, Float.valueOf(f));
    }

    private cTN() {
        this.field_da2182cf_FWm = new HashMap();
        this.method_5913691a_Dne(zKP.field_61781f15_Zpi.field_21260d_FWm, new NMq(dEr.field_5c4c1af_IjH), 0.7f);
        this.method_5913691a_Dne(zKP.field_1c3ff92c_XHL.field_21260d_FWm, new NMq(dEr.field_74feeb39_mrb), 1.0f);
        this.method_5913691a_Dne(zKP.field_5fd56c22_ZgS.field_21260d_FWm, new NMq(dEr.field_141d2e85_div), 1.0f);
        this.method_5913691a_Dne(zKP.field_5ced441_IjH.field_21260d_FWm, new NMq(zKP.field_32988693_trS), 0.1f);
        this.method_5913691a_Dne(dEr.field_dde88ad5_qrB.field_267cf5_Qnq, new NMq(dEr.field_2c7c1d6e_LVR), 0.35f);
        this.method_5913691a_Dne(dEr.field_728123b7_ipf.field_267cf5_Qnq, new NMq(dEr.field_b204f0b_mzX), 0.35f);
        this.method_5913691a_Dne(dEr.field_ba12c5ca_qqL.field_267cf5_Qnq, new NMq(dEr.field_bf5ffe54_yIR), 0.35f);
        this.method_5913691a_Dne(dEr.field_a76dd0d0_Zlx.field_267cf5_Qnq, new NMq(dEr.field_1ea4296e_kSP), 0.35f);
        this.method_5913691a_Dne(zKP.field_75c638da_bzF.field_21260d_FWm, new NMq(zKP.field_37e6aed_Dne), 0.1f);
        this.method_5913691a_Dne(dEr.field_7479510a_Jik.field_267cf5_Qnq, new NMq(dEr.field_c4be0c0b_xEx), 0.3f);
        this.method_5913691a_Dne(zKP.field_27f261ab_XjO.field_21260d_FWm, new NMq(dEr.field_5d50330c_edi, 1, 2), 0.2f);
        this.method_5913691a_Dne(zKP.field_af0f1368_udO.field_21260d_FWm, new NMq(dEr.field_16278184_DyG, 1, 1), 0.15f);
        this.method_5913691a_Dne(zKP.field_152fb3d4_ghu.field_21260d_FWm, new NMq(dEr.field_86ecf659_Kvh), 1.0f);
        this.method_5913691a_Dne(dEr.field_eb1fccc7_dnY.field_267cf5_Qnq, new NMq(dEr.field_c2abd612_jXR), 0.35f);
        this.method_5913691a_Dne(zKP.field_b3a6b297_KLR.field_21260d_FWm, new NMq(dEr.field_2125c1ca_PpL), 0.1f);
        this.method_5913691a_Dne(zKP.field_a22e9c55_kGO.field_21260d_FWm, new NMq(dEr.field_16278184_DyG), 0.1f);
        this.method_5913691a_Dne(zKP.field_390036e3_JLG.field_21260d_FWm, new NMq(dEr.field_59c23676_exS), 0.7f);
        this.method_5913691a_Dne(zKP.field_1f135bb1_qLR.field_21260d_FWm, new NMq(dEr.field_5d50330c_edi, 1, 4), 0.2f);
        this.method_5913691a_Dne(zKP.field_66394b98_NEG.field_21260d_FWm, new NMq(dEr.field_fd198bbb_RMv), 0.2f);
    }
}

