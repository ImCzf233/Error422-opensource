package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class VKe
extends ljW {
    private gDn field_375b13b_Dne;

    @Override
    public ipD method_c35d5be7_Dne(Qnq qnq) {
        return new nKy();
    }

    public void method_4e0c543f_Dne(Qnq qnq, int n, int n2, int n3, NMq nMq) {
        nKy nKy2;
        if (!qnq.field_2d2a05_aFZ && (nKy2 = (nKy)qnq.method_d98e681d_Dne(n, n2, n3)) != null) {
            nKy2.method_7c61cf15_Dne(nMq.method_23040479_Dne());
            qnq.method_d4dc89ed_Dne(n, n2, n3, 1, 2);
        }
    }

    public void method_5452795d_bzF(Qnq qnq, int n, int n2, int n3) {
        NMq nMq;
        nKy nKy2;
        if (!qnq.field_2d2a05_aFZ && (nKy2 = (nKy)qnq.method_d98e681d_Dne(n, n2, n3)) != null && (nMq = nKy2.method_23040479_Dne()) != null) {
            qnq.method_57aed1c2_Qnq(1005, n, n2, n3, 0);
            qnq.method_7eed443f_Dne(null, n, n2, n3);
            nKy2.method_7c61cf15_Dne(null);
            qnq.method_d4dc89ed_Dne(n, n2, n3, 0, 2);
            float f = 0.7f;
            double d = (double)(qnq.field_7331eae7_Dne.nextFloat() * f) + (double)(1.0f - f) * 0.5;
            double d2 = (double)(qnq.field_7331eae7_Dne.nextFloat() * f) + (double)(1.0f - f) * 0.2 + 0.6;
            double d3 = (double)(qnq.field_7331eae7_Dne.nextFloat() * f) + (double)(1.0f - f) * 0.5;
            NMq nMq2 = nMq.method_23040479_Dne();
            JiM jiM = new JiM(qnq, (double)n + d, (double)n2 + d2, (double)n3 + d3, nMq2);
            jiM.field_21260d_FWm = 10;
            qnq.method_94d18be5_FWm(jiM);
        }
    }

    protected VKe(int n) {
        super(n, KFd.field_5e526bea_Qnq);
        this.method_82a88d64_Dne(JcN.field_2022bed6_FWm);
    }

    @Override
    public int method_f9bf07c6_Dne(Qnq qnq, int n, int n2, int n3, int n4) {
        NMq nMq = ((nKy)qnq.method_d98e681d_Dne(n, n2, n3)).method_23040479_Dne();
        return nMq == null ? 0 : nMq.field_2e5f1b_bzF + 1 - dEr.field_798af737_iTJ.field_267cf5_Qnq;
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        this.field_5e5f2002_Qnq = rbp.method_285881e4_Dne("musicBlock");
        this.field_375b13b_Dne = rbp.method_285881e4_Dne("jukebox_top");
    }

    @Override
    public void method_86296256_Dne(Qnq qnq, int n, int n2, int n3, int n4, float f, int n5) {
        if (!qnq.field_2d2a05_aFZ) {
            super.method_86296256_Dne(qnq, n, n2, n3, n4, f, 0);
        }
    }

    @Override
    public boolean method_582b29b_a_() {
        return true;
    }

    @Override
    public gDn method_9051f17a_Dne(int n, int n2) {
        return n == 1 ? this.field_375b13b_Dne : this.field_5e5f2002_Qnq;
    }

    @Override
    public void method_3e226590_Dne(Qnq qnq, int n, int n2, int n3, int n4, int n5) {
        this.method_5452795d_bzF(qnq, n, n2, n3);
        super.method_3e226590_Dne(qnq, n, n2, n3, n4, n5);
    }

    @Override
    public boolean method_cb53d52e_Dne(Qnq qnq, int n, int n2, int n3, FiG fiG, int n4, float f, float f2, float f3) {
        if (qnq.method_2dee76f_bzF(n, n2, n3) == 0) {
            return false;
        }
        this.method_5452795d_bzF(qnq, n, n2, n3);
        return true;
    }
}

