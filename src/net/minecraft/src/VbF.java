package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class VbF
extends ljW {
    @Override
    public ipD method_c35d5be7_Dne(Qnq qnq) {
        return new FgE();
    }

    @Override
    public boolean method_582b29b_a_() {
        return true;
    }

    @Override
    public int method_83516086_Dne(Qnq qnq) {
        return 1;
    }

    @Override
    public void method_ca7e4e57_Dne(Qnq qnq, int n, int n2, int n3, FUH fUH, NMq nMq) {
        FgE fgE = (FgE)qnq.method_d98e681d_Dne(n, n2, n3);
        if (nMq.method_d44b4596_zGp()) {
            fgE.method_47a073d1_bzF(nMq.method_d1f1ed87_FWm());
        }
    }

    @Override
    public boolean method_cb53d52e_Dne(Qnq qnq, int n, int n2, int n3, FiG fiG, int n4, float f, float f2, float f3) {
        FgE fgE = (FgE)qnq.method_d98e681d_Dne(n, n2, n3);
        if (fgE != null) {
            fiG.method_ac4d69ca_Dne(fgE);
        }
        return true;
    }

    @Override
    public int method_f9bf07c6_Dne(Qnq qnq, int n, int n2, int n3, int n4) {
        ipD ipD2 = qnq.method_d98e681d_Dne(n, n2, n3);
        return ipD2 != null && ipD2 instanceof FgE ? ((FgE)ipD2).method_7a46288d_Dne() : 0;
    }

    @Override
    public void method_f9bf07d3_Dne(Qnq qnq, int n, int n2, int n3, int n4) {
        if (!qnq.field_2d2a05_aFZ) {
            boolean bl;
            boolean bl2 = qnq.method_6382f365_kGO(n, n2, n3);
            int n5 = qnq.method_2dee76f_bzF(n, n2, n3);
            boolean bl3 = bl = (n5 & 1) != 0;
            if (bl2 && !bl) {
                qnq.method_d4dc89ed_Dne(n, n2, n3, n5 | 1, 4);
                qnq.method_ae303daa_FWm(n, n2, n3, this.field_21260d_FWm, this.method_83516086_Dne(qnq));
            } else if (!bl2 && bl) {
                qnq.method_d4dc89ed_Dne(n, n2, n3, n5 & 0xFFFFFFFE, 4);
            }
        }
    }

    public VbF(int n) {
        super(n, KFd.field_f09abc1b_zGp);
    }

    @Override
    public void method_ca828a1c_Dne(Qnq qnq, int n, int n2, int n3, Random random) {
        ipD ipD2 = qnq.method_d98e681d_Dne(n, n2, n3);
        if (ipD2 != null && ipD2 instanceof FgE) {
            FgE fgE = (FgE)ipD2;
            fgE.method_ce7f5da9_Dne(fgE.method_83516086_Dne(qnq));
            qnq.method_6465ff20_aFZ(n, n2, n3, this.field_21260d_FWm);
        }
    }
}

