package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class xui
extends gvx {
    public static final double[] field_3f1c584_Dne = new double[]{-0.0625, 0.0625, 0.1875, 0.3125};
    private static final int[] field_3f1c589_Dne = new int[]{1, 2, 3, 4};

    @Override
    public boolean method_8c35db9b_a_(Zpi zpi, int n, int n2, int n3, int n4) {
        return this.method_381c2c40_Qnq(zpi, n, n2, n3, n4) > 0;
    }

    @Override
    public int method_7a46288d_Dne() {
        return 15;
    }

    @Override
    protected gvx method_230ffc82_Dne() {
        return zKP.field_2037eebf_FWm;
    }

    @Override
    public int method_9cb39123_Dne(Qnq qnq, int n, int n2, int n3) {
        return dEr.field_1ed6a8f5_Sdr.field_267cf5_Qnq;
    }

    protected xui(int n, boolean bl) {
        super(n, bl);
    }

    @Override
    public void method_3e226590_Dne(Qnq qnq, int n, int n2, int n3, int n4, int n5) {
        super.method_3e226590_Dne(qnq, n, n2, n3, n4, n5);
        this.method_5452795d_bzF(qnq, n, n2, n3);
    }

    @Override
    public int method_24763341_Dne(int n, Random random, int n2) {
        return dEr.field_1ed6a8f5_Sdr.field_267cf5_Qnq;
    }

    @Override
    public void method_ff5e68fb_FWm(Qnq qnq, int n, int n2, int n3, Random random) {
        if (this.field_2092bf_Dne) {
            int n4 = qnq.method_2dee76f_bzF(n, n2, n3);
            int n5 = xui.method_7ed979f5_Qnq(n4);
            double d = (double)((float)n + 0.5f) + (double)(random.nextFloat() - 0.5f) * 0.2;
            double d2 = (double)((float)n2 + 0.4f) + (double)(random.nextFloat() - 0.5f) * 0.2;
            double d3 = (double)((float)n3 + 0.5f) + (double)(random.nextFloat() - 0.5f) * 0.2;
            double d4 = 0.0;
            double d5 = 0.0;
            if (random.nextInt(2) == 0) {
                switch (n5) {
                    case 0: {
                        d5 = -0.3125;
                        break;
                    }
                    case 1: {
                        d4 = 0.3125;
                        break;
                    }
                    case 2: {
                        d5 = 0.3125;
                        break;
                    }
                    case 3: {
                        d4 = -0.3125;
                    }
                }
            } else {
                int n6 = (n4 & 0xC) >> 2;
                switch (n5) {
                    case 0: {
                        d5 = field_3f1c584_Dne[n6];
                        break;
                    }
                    case 1: {
                        d4 = -field_3f1c584_Dne[n6];
                        break;
                    }
                    case 2: {
                        d5 = -field_3f1c584_Dne[n6];
                        break;
                    }
                    case 3: {
                        d4 = field_3f1c584_Dne[n6];
                    }
                }
            }
            qnq.method_8600ec24_Dne("reddust", d + d4, d2, d3 + d5, 0.0, 0.0, 0.0);
        }
    }

    @Override
    protected boolean method_143f9e20_bzF(int n) {
        return xui.method_7ed97a06_Qnq(n);
    }

    @Override
    protected int method_aff29d1c_d_(int n) {
        return field_3f1c589_Dne[(n & 0xC) >> 2] * 2;
    }

    @Override
    protected gvx method_f8864ca1_FWm() {
        return zKP.field_37e22e0_Dne;
    }

    @Override
    public boolean method_cb53d52e_Dne(Qnq qnq, int n, int n2, int n3, FiG fiG, int n4, float f, float f2, float f3) {
        int n5 = qnq.method_2dee76f_bzF(n, n2, n3);
        int n6 = (n5 & 0xC) >> 2;
        n6 = n6 + 1 << 2 & 0xC;
        qnq.method_d4dc89ed_Dne(n, n2, n3, n6 | n5 & 3, 3);
        return true;
    }
}

