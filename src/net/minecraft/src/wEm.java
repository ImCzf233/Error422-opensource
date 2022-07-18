package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class wEm
extends onZ {
    private final MqS field_2024511c_FWm;
    private FiG field_3673728_Dne;
    private int field_2092ae_Dne;

    @Override
    public boolean method_7c61cf19_Dne(NMq nMq) {
        return false;
    }

    @Override
    public void method_672a90ac_Dne(FiG fiG, NMq nMq) {
        this.method_55b582d6_FWm(nMq);
        for (int i = 0; i < this.field_2024511c_FWm.method_907a9d14_Qnq(); ++i) {
            NMq nMq2 = this.field_2024511c_FWm.method_9e6e1a08_Dne(i);
            if (nMq2 == null) continue;
            this.field_2024511c_FWm.method_9046b659_Dne(i, 1);
            if (!nMq2.method_230de6ba_Dne().method_8288d6f2_IjH()) continue;
            NMq nMq3 = new NMq(nMq2.method_230de6ba_Dne().method_f88436d9_FWm());
            if (nMq2.method_230de6ba_Dne().method_6e569e0c_bzF(nMq2) && this.field_3673728_Dne.field_36a059b_Dne.method_7c61cf19_Dne(nMq3)) continue;
            if (this.field_2024511c_FWm.method_9e6e1a08_Dne(i) == null) {
                this.field_2024511c_FWm.method_6e3a6b66_Dne(i, nMq3);
                continue;
            }
            this.field_3673728_Dne.method_c9a088b8_Dne(nMq3);
        }
    }

    @Override
    protected void method_fd8868e_Dne(NMq nMq, int n) {
        this.field_2092ae_Dne += n;
        this.method_55b582d6_FWm(nMq);
    }

    public wEm(FiG fiG, MqS mqS, MqS mqS2, int n, int n2, int n3) {
        super(mqS2, n, n2, n3);
        this.field_3673728_Dne = fiG;
        this.field_2024511c_FWm = mqS;
    }

    @Override
    public NMq method_9e6e1a08_Dne(int n) {
        if (this.method_7a46289e_Dne()) {
            this.field_2092ae_Dne += Math.min(n, this.method_23040479_Dne().field_2092ae_Dne);
        }
        return super.method_9e6e1a08_Dne(n);
    }

    @Override
    protected void method_55b582d6_FWm(NMq nMq) {
        nMq.method_55941bf9_Dne(this.field_3673728_Dne.field_36c4f18_Dne, this.field_3673728_Dne, this.field_2092ae_Dne);
        this.field_2092ae_Dne = 0;
        if (nMq.field_2e5f1b_bzF == zKP.field_47237a3_mlD.field_21260d_FWm) {
            this.field_3673728_Dne.method_df3461c5_Dne(qlg.field_75acf0a2_bzF, 1);
        } else if (nMq.field_2e5f1b_bzF == dEr.field_af0500d6_udO.field_267cf5_Qnq) {
            this.field_3673728_Dne.method_df3461c5_Dne(qlg.field_5e4e917c_Qnq, 1);
        } else if (nMq.field_2e5f1b_bzF == zKP.field_cba1f2f1_haP.field_21260d_FWm) {
            this.field_3673728_Dne.method_df3461c5_Dne(qlg.field_7128a6fb_aFZ, 1);
        } else if (nMq.field_2e5f1b_bzF == dEr.field_9542c231_Wwe.field_267cf5_Qnq) {
            this.field_3673728_Dne.method_df3461c5_Dne(qlg.field_16184bde_DyG, 1);
        } else if (nMq.field_2e5f1b_bzF == dEr.field_7785c591_rPc.field_267cf5_Qnq) {
            this.field_3673728_Dne.method_df3461c5_Dne(qlg.field_140df8df_div, 1);
        } else if (nMq.field_2e5f1b_bzF == dEr.field_5fe93310_iXU.field_267cf5_Qnq) {
            this.field_3673728_Dne.method_df3461c5_Dne(qlg.field_5b58c09_IjH, 1);
        } else if (nMq.field_2e5f1b_bzF == dEr.field_35d3b944_ATE.field_267cf5_Qnq) {
            this.field_3673728_Dne.method_df3461c5_Dne(qlg.field_74efb593_mrb, 1);
        } else if (nMq.field_2e5f1b_bzF == dEr.field_616e0c83_Zpi.field_267cf5_Qnq) {
            this.field_3673728_Dne.method_df3461c5_Dne(qlg.field_a215541d_kGO, 1);
        } else if (nMq.field_2e5f1b_bzF == zKP.field_558df63_KkE.field_21260d_FWm) {
            this.field_3673728_Dne.method_df3461c5_Dne(qlg.field_8e6e7ee1_vSL, 1);
        } else if (nMq.field_2e5f1b_bzF == zKP.field_24a90a48_AgF.field_21260d_FWm) {
            this.field_3673728_Dne.method_df3461c5_Dne(qlg.field_dd64902d_Fnk, 1);
        }
    }
}

