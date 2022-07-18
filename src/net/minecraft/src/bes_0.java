package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

/*
 * Renamed from Bes
 */
public class bes_0
extends dEr {
    private gDn field_202f7d1a_FWm;

    @Override
    public void method_d88f4bf4_Dne(int n, JcN jcN, List list) {
        for (FMM fMM : Klb.field_ecf0af5e_Dne.values()) {
            list.add(new NMq(n, 1, fMM.field_2092ae_Dne));
        }
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        super.method_845caac7_Dne(rbp);
        this.field_202f7d1a_FWm = rbp.method_285881e4_Dne("monsterPlacer_overlay");
    }

    @Override
    public String method_6194d772_Qnq(NMq nMq) {
        String string = ("" + KGL.method_39193c_Dne(this.method_d1f1ed87_FWm() + ".name")).trim();
        String string2 = Klb.method_2c0e7e17_Dne(nMq.method_907a9d14_Qnq());
        if (string2 != null) {
            string = string + " " + KGL.method_39193c_Dne("entity." + string2 + ".name");
        }
        return string;
    }

    public static sMa method_7aee3b58_Dne(Qnq qnq, int n, double d, double d2, double d3) {
        if (!Klb.field_ecf0af5e_Dne.containsKey(n)) {
            return null;
        }
        sMa sMa2 = null;
        for (int i = 0; i < 1; ++i) {
            sMa2 = Klb.method_a401738e_Dne(n, qnq);
            if (sMa2 == null || !(sMa2 instanceof FUH)) continue;
            FUH fUH = (FUH)sMa2;
            sMa2.method_9ce0fc65_FWm(d, d2, d3, geR.method_87b72d50_aFZ(qnq.field_7331eae7_Dne.nextFloat() * 360.0f), 0.0f);
            fUH.field_36e4d7_vSL = fUH.field_334489_mrb;
            fUH.field_22c5ff_IjH = fUH.field_334489_mrb;
            fUH.method_80692b1a_ICU();
            qnq.method_94d18be5_FWm(sMa2);
            fUH.method_d2ef85af_yMz();
        }
        return sMa2;
    }

    @Override
    public gDn method_9051f17a_Dne(int n, int n2) {
        return n2 > 0 ? this.field_202f7d1a_FWm : super.method_9051f17a_Dne(n, n2);
    }

    @Override
    public int method_fd88681_Dne(NMq nMq, int n) {
        FMM fMM = (FMM)Klb.field_ecf0af5e_Dne.get(nMq.method_907a9d14_Qnq());
        return fMM != null ? (n == 0 ? fMM.field_21260d_FWm : fMM.field_2e5f1b_bzF) : 0xFFFFFF;
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return true;
    }

    @Override
    public boolean method_4ddc487f_Dne(NMq nMq, FiG fiG, Qnq qnq, int n, int n2, int n3, int n4, float f, float f2, float f3) {
        sMa sMa2;
        if (qnq.field_2d2a05_aFZ) {
            return true;
        }
        int n5 = qnq.method_2c2cf7bc_Dne(n, n2, n3);
        n += rrP.field_4039e0a_FWm[n4];
        n2 += rrP.field_59d86bc_bzF[n4];
        n3 += rrP.field_4a92422_Qnq[n4];
        double d = 0.0;
        if (n4 == 1 && zKP.field_8374b848_Dne[n5] != null && zKP.field_8374b848_Dne[n5].method_7a46288d_Dne() == 11) {
            d = 0.5;
        }
        if ((sMa2 = bes_0.method_7aee3b58_Dne(qnq, nMq.method_907a9d14_Qnq(), (double)n + 0.5, (double)n2 + d, (double)n3 + 0.5)) != null) {
            if (sMa2 instanceof FUH && nMq.method_d44b4596_zGp()) {
                ((FUH)sMa2).method_a9a920ab_Qnq(nMq.method_d1f1ed87_FWm());
            }
            if (!fiG.field_37cb681_Dne.field_267d06_Qnq) {
                --nMq.field_2092ae_Dne;
            }
        }
        return true;
    }

    public bes_0(int n) {
        super(n);
        this.method_21c1eb9a_Dne(true);
        this.method_829e7ad2_Dne(JcN.field_712c773d_aFZ);
    }
}

