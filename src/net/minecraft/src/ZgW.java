package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class ZgW
extends zKP {
    public static boolean field_2092bf_Dne = false;

    public static boolean method_54527961_bzF(Qnq qnq, int n, int n2, int n3) {
        int n4 = qnq.method_2c2cf7bc_Dne(n, n2, n3);
        if (n4 == 0) {
            return true;
        }
        if (n4 == zKP.field_3774324_Dne.field_21260d_FWm) {
            return true;
        }
        KFd kFd = zKP.field_8374b848_Dne[n4].field_368fd23_Dne;
        return kFd == KFd.field_1411d34d_div ? true : kFd == KFd.field_5b96677_IjH;
    }

    public void method_c216a76_a_(Qnq qnq, int n, int n2, int n3, int n4) {
    }

    @Override
    public int method_83516086_Dne(Qnq qnq) {
        return 2;
    }

    @Override
    public void method_ca828a1c_Dne(Qnq qnq, int n, int n2, int n3, Random random) {
        if (!qnq.field_2d2a05_aFZ) {
            this.method_5452795d_bzF(qnq, n, n2, n3);
        }
    }

    @Override
    public void method_9cb39130_Dne(Qnq qnq, int n, int n2, int n3) {
        qnq.method_ae303daa_FWm(n, n2, n3, this.field_21260d_FWm, this.method_83516086_Dne(qnq));
    }

    @Override
    public void method_f9bf07d3_Dne(Qnq qnq, int n, int n2, int n3, int n4) {
        qnq.method_ae303daa_FWm(n, n2, n3, this.field_21260d_FWm, this.method_83516086_Dne(qnq));
    }

    public ZgW(int n, KFd kFd) {
        super(n, kFd);
    }

    public ZgW(int n) {
        super(n, KFd.field_328318c9_trS);
        this.method_82a88d64_Dne(JcN.field_368f2f7_Dne);
    }

    protected void method_6b138667_Dne(CiF ciF) {
    }

    private void method_5452795d_bzF(Qnq qnq, int n, int n2, int n3) {
        if (ZgW.method_54527961_bzF(qnq, n, n2 - 1, n3) && n2 >= 0) {
            int n4 = 32;
            if (!field_2092bf_Dne && qnq.method_c6b5263e_Dne(n - n4, n2 - n4, n3 - n4, n + n4, n2 + n4, n3 + n4)) {
                if (!qnq.field_2d2a05_aFZ) {
                    CiF ciF = new CiF(qnq, (float)n + 0.5f, (float)n2 + 0.5f, (float)n3 + 0.5f, this.field_21260d_FWm, qnq.method_2dee76f_bzF(n, n2, n3));
                    this.method_6b138667_Dne(ciF);
                    qnq.method_94d18be5_FWm(ciF);
                }
            } else {
                qnq.method_2e7161e6_Qnq(n, n2, n3);
                while (ZgW.method_54527961_bzF(qnq, n, n2 - 1, n3) && n2 > 0) {
                    --n2;
                }
                if (n2 > 0) {
                    qnq.method_2ee8c47d_FWm(n, n2, n3, this.field_21260d_FWm);
                }
            }
        }
    }
}

