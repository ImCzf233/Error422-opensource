package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class KNm
extends byt {
    private void method_714a8eb7_Qnq(Qnq qnq, int n, int n2, int n3) {
        int n4 = qnq.method_2dee76f_bzF(n, n2, n3);
        qnq.method_17d7ea9d_FWm(n, n2, n3, this.field_21260d_FWm - 1, n4, 2);
        qnq.method_ae303daa_FWm(n, n2, n3, this.field_21260d_FWm - 1, this.method_83516086_Dne(qnq));
    }

    @Override
    public void method_ca828a1c_Dne(Qnq qnq, int n, int n2, int n3, Random random) {
        if (this.field_368fd23_Dne == KFd.field_5b96677_IjH) {
            int n4;
            int n5;
            int n6 = random.nextInt(3);
            for (n5 = 0; n5 < n6; ++n5) {
                n4 = qnq.method_2c2cf7bc_Dne(n += random.nextInt(3) - 1, ++n2, n3 += random.nextInt(3) - 1);
                if (n4 == 0) {
                    if (!this.method_54527961_bzF(qnq, n - 1, n2, n3) && !this.method_54527961_bzF(qnq, n + 1, n2, n3) && !this.method_54527961_bzF(qnq, n, n2, n3 - 1) && !this.method_54527961_bzF(qnq, n, n2, n3 + 1) && !this.method_54527961_bzF(qnq, n, n2 - 1, n3) && !this.method_54527961_bzF(qnq, n, n2 + 1, n3)) continue;
                    qnq.method_2ee8c47d_FWm(n, n2, n3, zKP.field_3774324_Dne.field_21260d_FWm);
                    return;
                }
                if (!zKP.field_8374b848_Dne[n4].field_368fd23_Dne.method_ae128dcb_bzF()) continue;
                return;
            }
            if (n6 == 0) {
                n5 = n;
                n4 = n3;
                for (int i = 0; i < 3; ++i) {
                    n = n5 + random.nextInt(3) - 1;
                    if (!qnq.method_2c2cf7cd_Dne(n, n2 + 1, n3 = n4 + random.nextInt(3) - 1) || !this.method_54527961_bzF(qnq, n, n2, n3)) continue;
                    qnq.method_2ee8c47d_FWm(n, n2 + 1, n3, zKP.field_3774324_Dne.field_21260d_FWm);
                }
            }
        }
    }

    private boolean method_54527961_bzF(Qnq qnq, int n, int n2, int n3) {
        return qnq.method_d9802b31_Dne(n, n2, n3).method_a98a0664_aFZ();
    }

    protected KNm(int n, KFd kFd) {
        super(n, kFd);
        this.method_21cbfe2c_Dne(false);
        if (kFd == KFd.field_5b96677_IjH) {
            this.method_21cbfe2c_Dne(true);
        }
    }

    @Override
    public boolean method_fbabf7f3_Dne(Zpi zpi, int n, int n2, int n3) {
        return this.field_368fd23_Dne != KFd.field_5b96677_IjH;
    }

    @Override
    public void method_f9bf07d3_Dne(Qnq qnq, int n, int n2, int n3, int n4) {
        super.method_f9bf07d3_Dne(qnq, n, n2, n3, n4);
        if (qnq.method_2c2cf7bc_Dne(n, n2, n3) == this.field_21260d_FWm) {
            this.method_714a8eb7_Qnq(qnq, n, n2, n3);
        }
    }
}

