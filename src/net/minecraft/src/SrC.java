package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class SrC
extends ljW {
    private gDn field_375b13b_Dne;
    private final Random field_7331eae7_Dne = new Random();
    private gDn field_202f7d1a_FWm;
    private gDn field_75bd7f28_bzF;

    public static int method_143f9e0f_bzF(int n) {
        return n & 7;
    }

    public static boolean method_ce7f5dad_Dne(int n) {
        return (n & 8) != 8;
    }

    @Override
    public int method_7a46288d_Dne() {
        return 38;
    }

    @Override
    public void method_1bbfa017_Dne(Qnq qnq, int n, int n2, int n3, bSp bSp2, List list, sMa sMa2) {
        this.method_eb14b51a_Dne(0.0f, 0.0f, 0.0f, 1.0f, 0.625f, 1.0f);
        super.method_1bbfa017_Dne(qnq, n, n2, n3, bSp2, list, sMa2);
        float f = 0.125f;
        this.method_eb14b51a_Dne(0.0f, 0.0f, 0.0f, f, 1.0f, 1.0f);
        super.method_1bbfa017_Dne(qnq, n, n2, n3, bSp2, list, sMa2);
        this.method_eb14b51a_Dne(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, f);
        super.method_1bbfa017_Dne(qnq, n, n2, n3, bSp2, list, sMa2);
        this.method_eb14b51a_Dne(1.0f - f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        super.method_1bbfa017_Dne(qnq, n, n2, n3, bSp2, list, sMa2);
        this.method_eb14b51a_Dne(0.0f, 0.0f, 1.0f - f, 1.0f, 1.0f, 1.0f);
        super.method_1bbfa017_Dne(qnq, n, n2, n3, bSp2, list, sMa2);
        this.method_eb14b51a_Dne(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        this.field_375b13b_Dne = rbp.method_285881e4_Dne("hopper");
        this.field_202f7d1a_FWm = rbp.method_285881e4_Dne("hopper_top");
        this.field_75bd7f28_bzF = rbp.method_285881e4_Dne("hopper_inside");
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return false;
    }

    private void method_5452795d_bzF(Qnq qnq, int n, int n2, int n3) {
        boolean bl;
        int n4 = qnq.method_2dee76f_bzF(n, n2, n3);
        int n5 = SrC.method_143f9e0f_bzF(n4);
        boolean bl2 = !qnq.method_6382f365_kGO(n, n2, n3);
        if (bl2 != (bl = SrC.method_ce7f5dad_Dne(n4))) {
            qnq.method_d4dc89ed_Dne(n, n2, n3, n5 | (bl2 ? 0 : 8), 4);
        }
    }

    @Override
    public boolean method_582b29b_a_() {
        return true;
    }

    public static gDn method_285881e4_Dne(String string) {
        return string == "hopper" ? zKP.field_36d4148_Dne.field_375b13b_Dne : (string == "hopper_inside" ? zKP.field_36d4148_Dne.field_75bd7f28_bzF : null);
    }

    @Override
    public void method_f9bf07d3_Dne(Qnq qnq, int n, int n2, int n3, int n4) {
        this.method_5452795d_bzF(qnq, n, n2, n3);
    }

    @Override
    public boolean method_cb53d52e_Dne(Qnq qnq, int n, int n2, int n3, FiG fiG, int n4, float f, float f2, float f3) {
        if (qnq.field_2d2a05_aFZ) {
            return true;
        }
        Aem aem = SrC.method_d3929217_Dne(qnq, n, n2, n3);
        if (aem != null) {
            fiG.method_6783319e_Dne(aem);
        }
        return true;
    }

    @Override
    public gDn method_9051f17a_Dne(int n, int n2) {
        return n == 1 ? this.field_202f7d1a_FWm : this.field_375b13b_Dne;
    }

    @Override
    public void method_ca7e4e57_Dne(Qnq qnq, int n, int n2, int n3, FUH fUH, NMq nMq) {
        super.method_ca7e4e57_Dne(qnq, n, n2, n3, fUH, nMq);
        if (nMq.method_d44b4596_zGp()) {
            Aem aem = SrC.method_d3929217_Dne(qnq, n, n2, n3);
            aem.method_8f501fe4_Dne(nMq.method_d1f1ed87_FWm());
        }
    }

    public SrC(int n) {
        super(n, KFd.field_f09abc1b_zGp);
        this.method_82a88d64_Dne(JcN.field_75b0c0e4_bzF);
        this.method_eb14b51a_Dne(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }

    @Override
    public void method_9cb39130_Dne(Qnq qnq, int n, int n2, int n3) {
        super.method_9cb39130_Dne(qnq, n, n2, n3);
        this.method_5452795d_bzF(qnq, n, n2, n3);
    }

    @Override
    public String method_eecad346_Dne() {
        return "hopper";
    }

    @Override
    public ipD method_c35d5be7_Dne(Qnq qnq) {
        return new Aem();
    }

    @Override
    public int method_f9bf07c6_Dne(Qnq qnq, int n, int n2, int n3, int n4) {
        return Pdb.method_7c9aa16b_Dne(SrC.method_d3929217_Dne(qnq, n, n2, n3));
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return false;
    }

    @Override
    public void method_3e226590_Dne(Qnq qnq, int n, int n2, int n3, int n4, int n5) {
        Aem aem = (Aem)qnq.method_d98e681d_Dne(n, n2, n3);
        if (aem != null) {
            for (int i = 0; i < aem.method_907a9d14_Qnq(); ++i) {
                NMq nMq = aem.method_9e6e1a08_Dne(i);
                if (nMq == null) continue;
                float f = this.field_7331eae7_Dne.nextFloat() * 0.8f + 0.1f;
                float f2 = this.field_7331eae7_Dne.nextFloat() * 0.8f + 0.1f;
                float f3 = this.field_7331eae7_Dne.nextFloat() * 0.8f + 0.1f;
                while (nMq.field_2092ae_Dne > 0) {
                    int n6 = this.field_7331eae7_Dne.nextInt(21) + 10;
                    if (n6 > nMq.field_2092ae_Dne) {
                        n6 = nMq.field_2092ae_Dne;
                    }
                    nMq.field_2092ae_Dne -= n6;
                    JiM jiM = new JiM(qnq, (float)n + f, (float)n2 + f2, (float)n3 + f3, new NMq(nMq.field_2e5f1b_bzF, n6, nMq.method_907a9d14_Qnq()));
                    if (nMq.method_a98a0664_aFZ()) {
                        jiM.method_23040479_Dne().method_66a36cd8_FWm((WkD)nMq.method_230886fb_Dne().method_23130705_Dne());
                    }
                    float f4 = 0.05f;
                    jiM.field_291868_XHL = (float)this.field_7331eae7_Dne.nextGaussian() * f4;
                    jiM.field_2a9ad1_Zpi = (float)this.field_7331eae7_Dne.nextGaussian() * f4 + 0.2f;
                    jiM.field_31b811_kGO = (float)this.field_7331eae7_Dne.nextGaussian() * f4;
                    qnq.method_94d18be5_FWm(jiM);
                }
            }
            qnq.method_6465ff20_aFZ(n, n2, n3, n4);
        }
        super.method_3e226590_Dne(qnq, n, n2, n3, n4, n5);
    }

    @Override
    public void method_fbabf7ef_Dne(Zpi zpi, int n, int n2, int n3) {
        this.method_eb14b51a_Dne(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }

    @Override
    public int method_a13ce189_Dne(Qnq qnq, int n, int n2, int n3, int n4, float f, float f2, float f3, int n5) {
        int n6 = rrP.field_3f1c589_Dne[n4];
        if (n6 == 1) {
            n6 = 0;
        }
        return n6;
    }

    public static Aem method_d3929217_Dne(Zpi zpi, int n, int n2, int n3) {
        return (Aem)zpi.method_d98e681d_Dne(n, n2, n3);
    }

    @Override
    public boolean method_79d378f8_Dne(Zpi zpi, int n, int n2, int n3, int n4) {
        return true;
    }
}

