package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class BTA
extends zKP {
    private gDn field_75bd7f28_bzF;
    private gDn field_202f7d1a_FWm;
    private gDn field_375b13b_Dne;

    @Override
    public int method_7a46288d_Dne() {
        return 24;
    }

    public static gDn method_285881e4_Dne(String string) {
        return string == "cauldron_inner" ? zKP.field_365161d_Dne.field_375b13b_Dne : (string == "cauldron_bottom" ? zKP.field_365161d_Dne.field_75bd7f28_bzF : null);
    }

    @Override
    public int method_9cb39123_Dne(Qnq qnq, int n, int n2, int n3) {
        return dEr.field_c29c5164_yaZ.field_267cf5_Qnq;
    }

    @Override
    public void method_52f8ce2d_a_(Qnq qnq, int n, int n2, int n3) {
        int n4;
        if (qnq.field_7331eae7_Dne.nextInt(20) == 1 && (n4 = qnq.method_2dee76f_bzF(n, n2, n3)) < 3) {
            qnq.method_d4dc89ed_Dne(n, n2, n3, n4 + 1, 2);
        }
    }

    @Override
    public void method_7a46289a_Dne() {
        this.method_eb14b51a_Dne(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }

    public BTA(int n) {
        super(n, KFd.field_f09abc1b_zGp);
    }

    @Override
    public void method_1bbfa017_Dne(Qnq qnq, int n, int n2, int n3, bSp bSp2, List list, sMa sMa2) {
        this.method_eb14b51a_Dne(0.0f, 0.0f, 0.0f, 1.0f, 0.3125f, 1.0f);
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
        this.method_7a46289a_Dne();
    }

    @Override
    public int method_24763341_Dne(int n, Random random, int n2) {
        return dEr.field_c29c5164_yaZ.field_267cf5_Qnq;
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        this.field_375b13b_Dne = rbp.method_285881e4_Dne("cauldron_inner");
        this.field_202f7d1a_FWm = rbp.method_285881e4_Dne("cauldron_top");
        this.field_75bd7f28_bzF = rbp.method_285881e4_Dne("cauldron_bottom");
        this.field_5e5f2002_Qnq = rbp.method_285881e4_Dne("cauldron_side");
    }

    @Override
    public gDn method_9051f17a_Dne(int n, int n2) {
        return n == 1 ? this.field_202f7d1a_FWm : (n == 0 ? this.field_75bd7f28_bzF : this.field_5e5f2002_Qnq);
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return false;
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return false;
    }

    @Override
    public boolean method_cb53d52e_Dne(Qnq qnq, int n, int n2, int n3, FiG fiG, int n4, float f, float f2, float f3) {
        if (qnq.field_2d2a05_aFZ) {
            return true;
        }
        NMq nMq = fiG.field_36a059b_Dne.method_23040479_Dne();
        if (nMq == null) {
            return true;
        }
        int n5 = qnq.method_2dee76f_bzF(n, n2, n3);
        if (nMq.field_2e5f1b_bzF == dEr.field_dface822_cHy.field_267cf5_Qnq) {
            if (n5 < 3) {
                if (!fiG.field_37cb681_Dne.field_267d06_Qnq) {
                    fiG.field_36a059b_Dne.method_6e3a6b66_Dne(fiG.field_36a059b_Dne.field_2092ae_Dne, new NMq(dEr.field_5ac2e6dc_qMV));
                }
                qnq.method_d4dc89ed_Dne(n, n2, n3, 3, 2);
            }
            return true;
        }
        if (nMq.field_2e5f1b_bzF == dEr.field_7c27c815_OCU.field_267cf5_Qnq) {
            if (n5 > 0) {
                NMq nMq2 = new NMq(dEr.field_3682442_Dne, 1, 0);
                if (!fiG.field_36a059b_Dne.method_7c61cf19_Dne(nMq2)) {
                    qnq.method_94d18be5_FWm(new JiM(qnq, (double)n + 0.5, (double)n2 + 1.5, (double)n3 + 0.5, nMq2));
                } else if (fiG instanceof PJQ) {
                    ((PJQ)fiG).method_8108cb59_Dne(fiG.field_36bb35e_Dne);
                }
                --nMq.field_2092ae_Dne;
                if (nMq.field_2092ae_Dne <= 0) {
                    fiG.field_36a059b_Dne.method_6e3a6b66_Dne(fiG.field_36a059b_Dne.field_2092ae_Dne, null);
                }
                qnq.method_d4dc89ed_Dne(n, n2, n3, n5 - 1, 2);
            }
        } else if (n5 > 0 && nMq.method_230de6ba_Dne() instanceof qoi_0 && ((qoi_0)nMq.method_230de6ba_Dne()).method_2306c36c_Dne() == TNy.field_36d350d_Dne) {
            qoi_0 qoi_02 = (qoi_0)nMq.method_230de6ba_Dne();
            qoi_02.method_7c61cf15_Dne(nMq);
            qnq.method_d4dc89ed_Dne(n, n2, n3, n5 - 1, 2);
            return true;
        }
        return true;
    }
}

