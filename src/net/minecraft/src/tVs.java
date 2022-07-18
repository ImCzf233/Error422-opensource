package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class tVs
extends zKP {
    @Override
    public void method_ca828a1c_Dne(Qnq qnq, int n, int n2, int n3, Random random) {
        this.method_5452795d_bzF(qnq, n, n2, n3);
    }

    @Override
    public int method_9cb39123_Dne(Qnq qnq, int n, int n2, int n3) {
        return 0;
    }

    @Override
    public void method_9cb39130_Dne(Qnq qnq, int n, int n2, int n3) {
        qnq.method_ae303daa_FWm(n, n2, n3, this.field_21260d_FWm, this.method_83516086_Dne(qnq));
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
        this.method_714a8eb7_Qnq(qnq, n, n2, n3);
        return true;
    }

    @Override
    public void method_f9bf07d3_Dne(Qnq qnq, int n, int n2, int n3, int n4) {
        qnq.method_ae303daa_FWm(n, n2, n3, this.field_21260d_FWm, this.method_83516086_Dne(qnq));
    }

    @Override
    public boolean method_79d378f8_Dne(Zpi zpi, int n, int n2, int n3, int n4) {
        return true;
    }

    public tVs(int n) {
        super(n, KFd.field_76a6e3c_gnI);
        this.method_eb14b51a_Dne(0.0625f, 0.0f, 0.0625f, 0.9375f, 1.0f, 0.9375f);
    }

    @Override
    public int method_7a46288d_Dne() {
        return 27;
    }

    private void method_714a8eb7_Qnq(Qnq qnq, int n, int n2, int n3) {
        if (qnq.method_2c2cf7bc_Dne(n, n2, n3) == this.field_21260d_FWm) {
            for (int i = 0; i < 1000; ++i) {
                int n4;
                int n5;
                int n6 = n + qnq.field_7331eae7_Dne.nextInt(16) - qnq.field_7331eae7_Dne.nextInt(16);
                if (qnq.method_2c2cf7bc_Dne(n6, n5 = n2 + qnq.field_7331eae7_Dne.nextInt(8) - qnq.field_7331eae7_Dne.nextInt(8), n4 = n3 + qnq.field_7331eae7_Dne.nextInt(16) - qnq.field_7331eae7_Dne.nextInt(16)) != 0) continue;
                if (!qnq.field_2d2a05_aFZ) {
                    qnq.method_17d7ea9d_FWm(n6, n5, n4, this.field_21260d_FWm, qnq.method_2dee76f_bzF(n, n2, n3), 2);
                    qnq.method_2e7161e6_Qnq(n, n2, n3);
                } else {
                    int n7 = 128;
                    for (int j = 0; j < n7; ++j) {
                        double d = qnq.field_7331eae7_Dne.nextDouble();
                        float f = (qnq.field_7331eae7_Dne.nextFloat() - 0.5f) * 0.2f;
                        float f2 = (qnq.field_7331eae7_Dne.nextFloat() - 0.5f) * 0.2f;
                        float f3 = (qnq.field_7331eae7_Dne.nextFloat() - 0.5f) * 0.2f;
                        double d2 = (double)n6 + (double)(n - n6) * d + (qnq.field_7331eae7_Dne.nextDouble() - 0.5) * 1.0 + 0.5;
                        double d3 = (double)n5 + (double)(n2 - n5) * d + qnq.field_7331eae7_Dne.nextDouble() * 1.0 - 0.5;
                        double d4 = (double)n4 + (double)(n3 - n4) * d + (qnq.field_7331eae7_Dne.nextDouble() - 0.5) * 1.0 + 0.5;
                        qnq.method_8600ec24_Dne("portal", d2, d3, d4, f, f2, f3);
                    }
                }
                return;
            }
        }
    }

    private void method_5452795d_bzF(Qnq qnq, int n, int n2, int n3) {
        if (ZgW.method_54527961_bzF(qnq, n, n2 - 1, n3) && n2 >= 0) {
            int n4 = 32;
            if (!ZgW.field_2092bf_Dne && qnq.method_c6b5263e_Dne(n - n4, n2 - n4, n3 - n4, n + n4, n2 + n4, n3 + n4)) {
                CiF ciF = new CiF(qnq, (float)n + 0.5f, (float)n2 + 0.5f, (float)n3 + 0.5f, this.field_21260d_FWm);
                qnq.method_94d18be5_FWm(ciF);
            } else {
                qnq.method_2e7161e6_Qnq(n, n2, n3);
                while (ZgW.method_54527961_bzF(qnq, n, n2 - 1, n3) && n2 > 0) {
                    --n2;
                }
                if (n2 > 0) {
                    qnq.method_17d7ea9d_FWm(n, n2, n3, this.field_21260d_FWm, 0, 2);
                }
            }
        }
    }

    @Override
    public int method_83516086_Dne(Qnq qnq) {
        return 5;
    }

    @Override
    public void method_41dd09cd_Dne(Qnq qnq, int n, int n2, int n3, FiG fiG) {
        this.method_714a8eb7_Qnq(qnq, n, n2, n3);
    }
}

