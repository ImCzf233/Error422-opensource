package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class KPs
extends zKP {
    private gDn field_202f7d1a_FWm;
    private gDn field_375b13b_Dne;

    @Override
    public boolean method_7c6f603d_FWm() {
        return false;
    }

    public gDn method_230f3f9a_Dne() {
        return this.field_202f7d1a_FWm;
    }

    @Override
    public gDn method_9051f17a_Dne(int n, int n2) {
        return n == 1 ? this.field_375b13b_Dne : (n == 0 ? zKP.field_4e627739_dNY.method_77cd08ea_FWm(n) : this.field_5e5f2002_Qnq);
    }

    @Override
    public void method_1bbfa017_Dne(Qnq qnq, int n, int n2, int n3, bSp bSp2, List list, sMa sMa2) {
        this.method_eb14b51a_Dne(0.0f, 0.0f, 0.0f, 1.0f, 0.8125f, 1.0f);
        super.method_1bbfa017_Dne(qnq, n, n2, n3, bSp2, list, sMa2);
        int n4 = qnq.method_2dee76f_bzF(n, n2, n3);
        if (KPs.method_ce7f5dad_Dne(n4)) {
            this.method_eb14b51a_Dne(0.3125f, 0.8125f, 0.3125f, 0.6875f, 1.0f, 0.6875f);
            super.method_1bbfa017_Dne(qnq, n, n2, n3, bSp2, list, sMa2);
        }
        this.method_7a46289a_Dne();
    }

    public static boolean method_ce7f5dad_Dne(int n) {
        return (n & 4) != 0;
    }

    @Override
    public void method_7a46289a_Dne() {
        this.method_eb14b51a_Dne(0.0f, 0.0f, 0.0f, 1.0f, 0.8125f, 1.0f);
    }

    @Override
    public int method_24763341_Dne(int n, Random random, int n2) {
        return 0;
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        this.field_5e5f2002_Qnq = rbp.method_285881e4_Dne("endframe_side");
        this.field_375b13b_Dne = rbp.method_285881e4_Dne("endframe_top");
        this.field_202f7d1a_FWm = rbp.method_285881e4_Dne("endframe_eye");
    }

    @Override
    public void method_ca7e4e57_Dne(Qnq qnq, int n, int n2, int n3, FUH fUH, NMq nMq) {
        int n4 = ((geR.method_117d0718_FWm((double)(fUH.field_334489_mrb * 4.0f / 360.0f) + 0.5) & 3) + 2) % 4;
        qnq.method_d4dc89ed_Dne(n, n2, n3, n4, 2);
    }

    @Override
    public int method_7a46288d_Dne() {
        return 26;
    }

    public KPs(int n) {
        super(n, KFd.field_712c8169_aFZ);
    }
}

