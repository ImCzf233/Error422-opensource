package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class lCY
extends ram {
    private int field_21260d_FWm;
    private int field_2092ae_Dne = -1;
    private int field_2e5f1b_bzF;
    private int field_267cf5_Qnq;
    private int field_20b857_DyG;

    public lCY(opc opc2, int n, Random random, CLK cLK, int n2) {
        super(opc2, n);
        this.field_2d29f4_aFZ = n2;
        this.field_3656daa_Dne = cLK;
        this.field_21260d_FWm = this.method_cfc9daf9_Dne(random);
        this.field_2e5f1b_bzF = this.method_cfc9daf9_Dne(random);
        this.field_267cf5_Qnq = this.method_cfc9daf9_Dne(random);
        this.field_20b857_DyG = this.method_cfc9daf9_Dne(random);
    }

    private int method_cfc9daf9_Dne(Random random) {
        switch (random.nextInt(5)) {
            case 0: {
                return zKP.field_c2b5e8a4_jXR.field_21260d_FWm;
            }
            case 1: {
                return zKP.field_19132aca_HDz.field_21260d_FWm;
            }
        }
        return zKP.field_ce860a00_EWz.field_21260d_FWm;
    }

    public static lCY method_9205df30_Dne(opc opc2, List list, Random random, int n, int n2, int n3, int n4, int n5) {
        CLK cLK = CLK.method_286c569_Dne(n, n2, n3, 0, 0, 0, 13, 4, 9, n4);
        return lCY.method_697d22a9_Dne(cLK) && bvz.method_9e83199f_Dne(list, cLK) == null ? new lCY(opc2, n5, random, cLK, n4) : null;
    }

    @Override
    public boolean method_f28ef3a4_Dne(Qnq qnq, Random random, CLK cLK) {
        int n;
        if (this.field_2092ae_Dne < 0) {
            this.field_2092ae_Dne = this.method_d2c2fe3f_Dne(qnq, cLK);
            if (this.field_2092ae_Dne < 0) {
                return true;
            }
            this.field_3656daa_Dne.method_2c2cf7c9_Dne(0, this.field_2092ae_Dne - this.field_3656daa_Dne.field_2d29f4_aFZ + 4 - 1, 0);
        }
        this.method_3d7d4888_Dne(qnq, cLK, 0, 1, 0, 12, 4, 8, 0, 0, false);
        this.method_3d7d4888_Dne(qnq, cLK, 1, 0, 1, 2, 0, 7, zKP.field_778fd823_rPc.field_21260d_FWm, zKP.field_778fd823_rPc.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 4, 0, 1, 5, 0, 7, zKP.field_778fd823_rPc.field_21260d_FWm, zKP.field_778fd823_rPc.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 7, 0, 1, 8, 0, 7, zKP.field_778fd823_rPc.field_21260d_FWm, zKP.field_778fd823_rPc.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 10, 0, 1, 11, 0, 7, zKP.field_778fd823_rPc.field_21260d_FWm, zKP.field_778fd823_rPc.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 0, 0, 0, 0, 0, 8, zKP.field_af0f1368_udO.field_21260d_FWm, zKP.field_af0f1368_udO.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 6, 0, 0, 6, 0, 8, zKP.field_af0f1368_udO.field_21260d_FWm, zKP.field_af0f1368_udO.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 12, 0, 0, 12, 0, 8, zKP.field_af0f1368_udO.field_21260d_FWm, zKP.field_af0f1368_udO.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 1, 0, 0, 11, 0, 0, zKP.field_af0f1368_udO.field_21260d_FWm, zKP.field_af0f1368_udO.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 1, 0, 8, 11, 0, 8, zKP.field_af0f1368_udO.field_21260d_FWm, zKP.field_af0f1368_udO.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 3, 0, 1, 3, 0, 7, zKP.field_374330f_Dne.field_21260d_FWm, zKP.field_374330f_Dne.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 9, 0, 1, 9, 0, 7, zKP.field_374330f_Dne.field_21260d_FWm, zKP.field_374330f_Dne.field_21260d_FWm, false);
        for (n = 1; n <= 7; ++n) {
            this.method_b5ae8f6f_Dne(qnq, this.field_21260d_FWm, geR.method_4cd91d9_Dne(random, 2, 7), 1, 1, n, cLK);
            this.method_b5ae8f6f_Dne(qnq, this.field_21260d_FWm, geR.method_4cd91d9_Dne(random, 2, 7), 2, 1, n, cLK);
            this.method_b5ae8f6f_Dne(qnq, this.field_2e5f1b_bzF, geR.method_4cd91d9_Dne(random, 2, 7), 4, 1, n, cLK);
            this.method_b5ae8f6f_Dne(qnq, this.field_2e5f1b_bzF, geR.method_4cd91d9_Dne(random, 2, 7), 5, 1, n, cLK);
            this.method_b5ae8f6f_Dne(qnq, this.field_267cf5_Qnq, geR.method_4cd91d9_Dne(random, 2, 7), 7, 1, n, cLK);
            this.method_b5ae8f6f_Dne(qnq, this.field_267cf5_Qnq, geR.method_4cd91d9_Dne(random, 2, 7), 8, 1, n, cLK);
            this.method_b5ae8f6f_Dne(qnq, this.field_20b857_DyG, geR.method_4cd91d9_Dne(random, 2, 7), 10, 1, n, cLK);
            this.method_b5ae8f6f_Dne(qnq, this.field_20b857_DyG, geR.method_4cd91d9_Dne(random, 2, 7), 11, 1, n, cLK);
        }
        for (n = 0; n < 9; ++n) {
            for (int i = 0; i < 13; ++i) {
                this.method_3b27a7cf_Dne(qnq, i, 4, n, cLK);
                this.method_6ca945f0_FWm(qnq, zKP.field_203836cc_FWm.field_21260d_FWm, 0, i, -1, n, cLK);
            }
        }
        return true;
    }
}

