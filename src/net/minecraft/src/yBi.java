package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public abstract class yBi {
    private long field_2e5f1c_bzF;
    private long field_2092af_Dne;
    protected yBi field_37dd7cc_Dne;
    private long field_21260e_FWm;

    protected int method_ce7f5d9c_Dne(int n) {
        int n2 = (int)((this.field_21260e_FWm >> 24) % (long)n);
        if (n2 < 0) {
            n2 += n;
        }
        this.field_21260e_FWm *= this.field_21260e_FWm * 6364136223846793005L + 1442695040888963407L;
        this.field_21260e_FWm += this.field_2092af_Dne;
        return n2;
    }

    public static yBi[] method_1929e0de_Dne(long l, kGO kGO2) {
        hqP hqP2 = new hqP(1L);
        yIw yIw2 = new yIw(2000L, hqP2);
        TKT tKT = new TKT(1L, yIw2);
        yRM yRM2 = new yRM(2001L, tKT);
        tKT = new TKT(2L, yRM2);
        Xor xor = new Xor(2L, tKT);
        yRM2 = new yRM(2002L, xor);
        tKT = new TKT(3L, yRM2);
        yRM2 = new yRM(2003L, tKT);
        tKT = new TKT(4L, yRM2);
        gxA gxA2 = new gxA(5L, tKT);
        int n = 4;
        if (kGO2 == kGO.field_75bf5826_bzF) {
            n = 6;
        }
        yBi yBi2 = yRM.method_cea4d0fd_Dne(1000L, gxA2, 0);
        nnv nnv2 = new nnv(100L, yBi2);
        yBi2 = yRM.method_cea4d0fd_Dne(1000L, nnv2, n + 2);
        ihb ihb2 = new ihb(1L, yBi2);
        AZg aZg = new AZg(1000L, ihb2);
        yBi yBi3 = yRM.method_cea4d0fd_Dne(1000L, gxA2, 0);
        uqp uqp2 = new uqp(200L, yBi3, kGO2);
        yBi3 = yRM.method_cea4d0fd_Dne(1000L, uqp2, 2);
        yBi yBi4 = new qjt_0(1000L, yBi3);
        for (int i = 0; i < n; ++i) {
            yBi4 = new yRM(1000 + i, yBi4);
            if (i == 0) {
                yBi4 = new TKT(3L, yBi4);
            }
            if (i == 1) {
                yBi4 = new pRH(1000L, yBi4);
            }
            if (i != 1) continue;
            yBi4 = new RyG(1000L, yBi4);
        }
        AZg aZg2 = new AZg(1000L, yBi4);
        MHV mHV = new MHV(100L, aZg2, aZg);
        JoZ joZ = new JoZ(10L, mHV);
        mHV.method_ce7f616a_Dne(l);
        joZ.method_ce7f616a_Dne(l);
        return new yBi[]{mHV, joZ, mHV};
    }

    public void method_ce7f616a_Dne(long l) {
        this.field_2092af_Dne = l;
        if (this.field_37dd7cc_Dne != null) {
            this.field_37dd7cc_Dne.method_ce7f616a_Dne(l);
        }
        this.field_2092af_Dne *= this.field_2092af_Dne * 6364136223846793005L + 1442695040888963407L;
        this.field_2092af_Dne += this.field_2e5f1c_bzF;
        this.field_2092af_Dne *= this.field_2092af_Dne * 6364136223846793005L + 1442695040888963407L;
        this.field_2092af_Dne += this.field_2e5f1c_bzF;
        this.field_2092af_Dne *= this.field_2092af_Dne * 6364136223846793005L + 1442695040888963407L;
        this.field_2092af_Dne += this.field_2e5f1c_bzF;
    }

    public abstract int[] method_d4dc17ca_Dne(int var1, int var2, int var3, int var4);

    public void method_16d429a_Dne(long l, long l2) {
        this.field_21260e_FWm = this.field_2092af_Dne;
        this.field_21260e_FWm *= this.field_21260e_FWm * 6364136223846793005L + 1442695040888963407L;
        this.field_21260e_FWm += l;
        this.field_21260e_FWm *= this.field_21260e_FWm * 6364136223846793005L + 1442695040888963407L;
        this.field_21260e_FWm += l2;
        this.field_21260e_FWm *= this.field_21260e_FWm * 6364136223846793005L + 1442695040888963407L;
        this.field_21260e_FWm += l;
        this.field_21260e_FWm *= this.field_21260e_FWm * 6364136223846793005L + 1442695040888963407L;
        this.field_21260e_FWm += l2;
    }

    public yBi(long l) {
        this.field_2e5f1c_bzF = l;
        this.field_2e5f1c_bzF *= this.field_2e5f1c_bzF * 6364136223846793005L + 1442695040888963407L;
        this.field_2e5f1c_bzF += l;
        this.field_2e5f1c_bzF *= this.field_2e5f1c_bzF * 6364136223846793005L + 1442695040888963407L;
        this.field_2e5f1c_bzF += l;
        this.field_2e5f1c_bzF *= this.field_2e5f1c_bzF * 6364136223846793005L + 1442695040888963407L;
        this.field_2e5f1c_bzF += l;
    }
}

