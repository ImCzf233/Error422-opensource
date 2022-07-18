package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class SFI
extends kbN {
    @Override
    public gDn method_9051f17a_Dne(int n, int n2) {
        return zKP.field_5e67d9b4_Qnq.method_77cd08ea_FWm(n);
    }

    @Override
    public void method_ca7e4e57_Dne(Qnq qnq, int n, int n2, int n3, FUH fUH, NMq nMq) {
        int n4 = (geR.method_117d0718_FWm((double)(fUH.field_334489_mrb * 4.0f / 360.0f) + 0.5) & 3) % 4;
        qnq.method_d4dc89ed_Dne(n, n2, n3, n4, 2);
    }

    public SFI(int n) {
        super(n, KFd.field_5e526bea_Qnq);
        this.method_82a88d64_Dne(JcN.field_75b0c0e4_bzF);
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return false;
    }

    @Override
    public void method_fbabf7ef_Dne(Zpi zpi, int n, int n2, int n3) {
        int n4 = SFI.method_7ed979f5_Qnq(zpi.method_2dee76f_bzF(n, n2, n3));
        if (n4 != 2 && n4 != 0) {
            this.method_eb14b51a_Dne(0.375f, 0.0f, 0.0f, 0.625f, 1.0f, 1.0f);
        } else {
            this.method_eb14b51a_Dne(0.0f, 0.0f, 0.375f, 1.0f, 1.0f, 0.625f);
        }
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return false;
    }

    @Override
    public int method_7a46288d_Dne() {
        return 21;
    }

    @Override
    public bSp method_8c85fe2_Dne(Qnq qnq, int n, int n2, int n3) {
        int n4 = qnq.method_2dee76f_bzF(n, n2, n3);
        return SFI.method_ce7f5dad_Dne(n4) ? null : (n4 != 2 && n4 != 0 ? bSp.method_23186cf1_Dne().method_b4ea3e0c_Dne((float)n + 0.375f, n2, n3, (float)n + 0.625f, (float)n2 + 1.5f, n3 + 1) : bSp.method_23186cf1_Dne().method_b4ea3e0c_Dne(n, n2, (float)n3 + 0.375f, n + 1, (float)n2 + 1.5f, (float)n3 + 0.625f));
    }

    @Override
    public boolean method_79d378f8_Dne(Zpi zpi, int n, int n2, int n3, int n4) {
        return true;
    }

    @Override
    public boolean method_cb53d52e_Dne(Qnq qnq, int n, int n2, int n3, FiG fiG, int n4, float f, float f2, float f3) {
        int n5 = qnq.method_2dee76f_bzF(n, n2, n3);
        if (SFI.method_ce7f5dad_Dne(n5)) {
            qnq.method_d4dc89ed_Dne(n, n2, n3, n5 & 0xFFFFFFFB, 2);
        } else {
            int n6 = (geR.method_117d0718_FWm((double)(fiG.field_334489_mrb * 4.0f / 360.0f) + 0.5) & 3) % 4;
            int n7 = SFI.method_7ed979f5_Qnq(n5);
            if (n7 == (n6 + 2) % 4) {
                n5 = n6;
            }
            qnq.method_d4dc89ed_Dne(n, n2, n3, n5 | 4, 2);
        }
        qnq.method_bfa54b80_Dne(fiG, 1003, n, n2, n3, 0);
        return true;
    }

    @Override
    public boolean method_9cb39134_Dne(Qnq qnq, int n, int n2, int n3) {
        return !qnq.method_d9802b31_Dne(n, n2 - 1, n3).method_7a46289e_Dne() ? false : super.method_9cb39134_Dne(qnq, n, n2, n3);
    }

    @Override
    public boolean method_fbabf7f3_Dne(Zpi zpi, int n, int n2, int n3) {
        return SFI.method_ce7f5dad_Dne(zpi.method_2dee76f_bzF(n, n2, n3));
    }

    public static boolean method_ce7f5dad_Dne(int n) {
        return (n & 4) != 0;
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
    }

    @Override
    public void method_f9bf07d3_Dne(Qnq qnq, int n, int n2, int n3, int n4) {
        if (!qnq.field_2d2a05_aFZ) {
            int n5 = qnq.method_2dee76f_bzF(n, n2, n3);
            boolean bl = qnq.method_6382f365_kGO(n, n2, n3);
            if (bl || n4 > 0 && zKP.field_8374b848_Dne[n4].method_ae128dcb_bzF()) {
                if (bl && !SFI.method_ce7f5dad_Dne(n5)) {
                    qnq.method_d4dc89ed_Dne(n, n2, n3, n5 | 4, 2);
                    qnq.method_bfa54b80_Dne(null, 1003, n, n2, n3, 0);
                } else if (!bl && SFI.method_ce7f5dad_Dne(n5)) {
                    qnq.method_d4dc89ed_Dne(n, n2, n3, n5 & 0xFFFFFFFB, 2);
                    qnq.method_bfa54b80_Dne(null, 1003, n, n2, n3, 0);
                }
            }
        }
    }
}

