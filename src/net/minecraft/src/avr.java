package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class avr
extends zKP {
    private boolean field_2092bf_Dne;

    @Override
    public void method_4b0c00b_FWm(Qnq qnq, int n, int n2, int n3, sMa sMa2) {
        this.method_5452795d_bzF(qnq, n, n2, n3);
        super.method_4b0c00b_FWm(qnq, n, n2, n3, sMa2);
    }

    @Override
    public int method_cfc9daf9_Dne(Random random) {
        return 4 + random.nextInt(2);
    }

    @Override
    public void method_86296256_Dne(Qnq qnq, int n, int n2, int n3, int n4, float f, int n5) {
        super.method_86296256_Dne(qnq, n, n2, n3, n4, f, n5);
        if (this.method_24763341_Dne(n4, qnq.field_7331eae7_Dne, n5) != this.field_21260d_FWm) {
            int n6 = 1 + qnq.field_7331eae7_Dne.nextInt(5);
            this.method_b807bb2c_Qnq(qnq, n, n2, n3, n6);
        }
    }

    private void method_5452795d_bzF(Qnq qnq, int n, int n2, int n3) {
        this.method_714a8eb7_Qnq(qnq, n, n2, n3);
        if (this.field_21260d_FWm == zKP.field_390036e3_JLG.field_21260d_FWm) {
            qnq.method_2ee8c47d_FWm(n, n2, n3, zKP.field_59cc4908_exS.field_21260d_FWm);
        }
    }

    @Override
    protected NMq method_9e6e1a08_Dne(int n) {
        return new NMq(zKP.field_390036e3_JLG);
    }

    @Override
    public int method_3afb8a48_Dne(int n, Random random) {
        return this.method_cfc9daf9_Dne(random) + random.nextInt(n + 1);
    }

    @Override
    public boolean method_cb53d52e_Dne(Qnq qnq, int n, int n2, int n3, FiG fiG, int n4, float f, float f2, float f3) {
        this.method_5452795d_bzF(qnq, n, n2, n3);
        return super.method_cb53d52e_Dne(qnq, n, n2, n3, fiG, n4, f, f2, f3);
    }

    private void method_714a8eb7_Qnq(Qnq qnq, int n, int n2, int n3) {
        Random random = qnq.field_7331eae7_Dne;
        double d = 0.0625;
        for (int i = 0; i < 6; ++i) {
            double d2 = (float)n + random.nextFloat();
            double d3 = (float)n2 + random.nextFloat();
            double d4 = (float)n3 + random.nextFloat();
            if (i == 0 && !qnq.method_e53317d5_zGp(n, n2 + 1, n3)) {
                d3 = (double)(n2 + 1) + d;
            }
            if (i == 1 && !qnq.method_e53317d5_zGp(n, n2 - 1, n3)) {
                d3 = (double)(n2 + 0) - d;
            }
            if (i == 2 && !qnq.method_e53317d5_zGp(n, n2, n3 + 1)) {
                d4 = (double)(n3 + 1) + d;
            }
            if (i == 3 && !qnq.method_e53317d5_zGp(n, n2, n3 - 1)) {
                d4 = (double)(n3 + 0) - d;
            }
            if (i == 4 && !qnq.method_e53317d5_zGp(n + 1, n2, n3)) {
                d2 = (double)(n + 1) + d;
            }
            if (i == 5 && !qnq.method_e53317d5_zGp(n - 1, n2, n3)) {
                d2 = (double)(n + 0) - d;
            }
            if (!(d2 < (double)n || d2 > (double)(n + 1) || d3 < 0.0 || d3 > (double)(n2 + 1) || d4 < (double)n3) && !(d4 > (double)(n3 + 1))) continue;
            qnq.method_8600ec24_Dne("reddust", d2, d3, d4, 0.0, 0.0, 0.0);
        }
    }

    @Override
    public void method_ca828a1c_Dne(Qnq qnq, int n, int n2, int n3, Random random) {
        if (this.field_21260d_FWm == zKP.field_59cc4908_exS.field_21260d_FWm) {
            qnq.method_2ee8c47d_FWm(n, n2, n3, zKP.field_390036e3_JLG.field_21260d_FWm);
        }
    }

    @Override
    public void method_41dd09cd_Dne(Qnq qnq, int n, int n2, int n3, FiG fiG) {
        this.method_5452795d_bzF(qnq, n, n2, n3);
        super.method_41dd09cd_Dne(qnq, n, n2, n3, fiG);
    }

    @Override
    public int method_83516086_Dne(Qnq qnq) {
        return 30;
    }

    public avr(int n, boolean bl) {
        super(n, KFd.field_712c8169_aFZ);
        if (bl) {
            this.method_21cbfe2c_Dne(true);
        }
        this.field_2092bf_Dne = bl;
    }

    @Override
    public void method_ff5e68fb_FWm(Qnq qnq, int n, int n2, int n3, Random random) {
        if (this.field_2092bf_Dne) {
            this.method_714a8eb7_Qnq(qnq, n, n2, n3);
        }
    }

    @Override
    public int method_24763341_Dne(int n, Random random, int n2) {
        return dEr.field_59c23676_exS.field_267cf5_Qnq;
    }
}

