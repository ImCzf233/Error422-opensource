package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class DVF
extends oeq {
    private boolean field_2092bf_Dne;

    public DVF(int n, Random random, CLK cLK, int n2) {
        super(n);
        this.field_2d29f4_aFZ = n2;
        this.field_3656daa_Dne = cLK;
    }

    @Override
    public boolean method_f28ef3a4_Dne(Qnq qnq, Random random, CLK cLK) {
        int n;
        int n2;
        this.method_294f1b74_Dne(qnq, cLK, 0, 0, 0, 10, 7, 15, false, random, dlc.method_230133f7_Dne());
        this.method_f04c7bae_Dne(qnq, random, cLK, RLF.field_75b40c8d_bzF, 4, 1, 0);
        int n3 = 6;
        this.method_294f1b74_Dne(qnq, cLK, 1, n3, 1, 1, n3, 14, false, random, dlc.method_230133f7_Dne());
        this.method_294f1b74_Dne(qnq, cLK, 9, n3, 1, 9, n3, 14, false, random, dlc.method_230133f7_Dne());
        this.method_294f1b74_Dne(qnq, cLK, 2, n3, 1, 8, n3, 2, false, random, dlc.method_230133f7_Dne());
        this.method_294f1b74_Dne(qnq, cLK, 2, n3, 14, 8, n3, 14, false, random, dlc.method_230133f7_Dne());
        this.method_294f1b74_Dne(qnq, cLK, 1, 1, 1, 2, 1, 4, false, random, dlc.method_230133f7_Dne());
        this.method_294f1b74_Dne(qnq, cLK, 8, 1, 1, 9, 1, 4, false, random, dlc.method_230133f7_Dne());
        this.method_3d7d4888_Dne(qnq, cLK, 1, 1, 1, 1, 1, 3, zKP.field_202dfeee_FWm.field_21260d_FWm, zKP.field_202dfeee_FWm.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 9, 1, 1, 9, 1, 3, zKP.field_202dfeee_FWm.field_21260d_FWm, zKP.field_202dfeee_FWm.field_21260d_FWm, false);
        this.method_294f1b74_Dne(qnq, cLK, 3, 1, 8, 7, 1, 12, false, random, dlc.method_230133f7_Dne());
        this.method_3d7d4888_Dne(qnq, cLK, 4, 1, 9, 6, 1, 11, zKP.field_202dfeee_FWm.field_21260d_FWm, zKP.field_202dfeee_FWm.field_21260d_FWm, false);
        for (n2 = 3; n2 < 14; n2 += 2) {
            this.method_3d7d4888_Dne(qnq, cLK, 0, 3, n2, 0, 4, n2, zKP.field_1ee0bb87_Sdr.field_21260d_FWm, zKP.field_1ee0bb87_Sdr.field_21260d_FWm, false);
            this.method_3d7d4888_Dne(qnq, cLK, 10, 3, n2, 10, 4, n2, zKP.field_1ee0bb87_Sdr.field_21260d_FWm, zKP.field_1ee0bb87_Sdr.field_21260d_FWm, false);
        }
        for (n2 = 2; n2 < 9; n2 += 2) {
            this.method_3d7d4888_Dne(qnq, cLK, n2, 3, 15, n2, 4, 15, zKP.field_1ee0bb87_Sdr.field_21260d_FWm, zKP.field_1ee0bb87_Sdr.field_21260d_FWm, false);
        }
        n2 = this.method_73b4985a_bzF(zKP.field_bf6a10e6_yIR.field_21260d_FWm, 3);
        this.method_294f1b74_Dne(qnq, cLK, 4, 1, 5, 6, 1, 7, false, random, dlc.method_230133f7_Dne());
        this.method_294f1b74_Dne(qnq, cLK, 4, 2, 6, 6, 2, 7, false, random, dlc.method_230133f7_Dne());
        this.method_294f1b74_Dne(qnq, cLK, 4, 3, 7, 6, 3, 7, false, random, dlc.method_230133f7_Dne());
        for (n = 4; n <= 6; ++n) {
            this.method_b5ae8f6f_Dne(qnq, zKP.field_bf6a10e6_yIR.field_21260d_FWm, n2, n, 1, 4, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_bf6a10e6_yIR.field_21260d_FWm, n2, n, 2, 5, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_bf6a10e6_yIR.field_21260d_FWm, n2, n, 3, 6, cLK);
        }
        n = 2;
        int n4 = 0;
        int n5 = 3;
        int n6 = 1;
        switch (this.field_2d29f4_aFZ) {
            case 0: {
                n = 0;
                n4 = 2;
                break;
            }
            case 1: {
                n = 1;
                n4 = 3;
                n5 = 0;
                n6 = 2;
            }
            default: {
                break;
            }
            case 3: {
                n = 3;
                n4 = 1;
                n5 = 0;
                n6 = 2;
            }
        }
        this.method_b5ae8f6f_Dne(qnq, zKP.field_e4a82663_dBc.field_21260d_FWm, n + (random.nextFloat() > 0.9f ? 4 : 0), 4, 3, 8, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_e4a82663_dBc.field_21260d_FWm, n + (random.nextFloat() > 0.9f ? 4 : 0), 5, 3, 8, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_e4a82663_dBc.field_21260d_FWm, n + (random.nextFloat() > 0.9f ? 4 : 0), 6, 3, 8, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_e4a82663_dBc.field_21260d_FWm, n4 + (random.nextFloat() > 0.9f ? 4 : 0), 4, 3, 12, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_e4a82663_dBc.field_21260d_FWm, n4 + (random.nextFloat() > 0.9f ? 4 : 0), 5, 3, 12, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_e4a82663_dBc.field_21260d_FWm, n4 + (random.nextFloat() > 0.9f ? 4 : 0), 6, 3, 12, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_e4a82663_dBc.field_21260d_FWm, n5 + (random.nextFloat() > 0.9f ? 4 : 0), 3, 3, 9, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_e4a82663_dBc.field_21260d_FWm, n5 + (random.nextFloat() > 0.9f ? 4 : 0), 3, 3, 10, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_e4a82663_dBc.field_21260d_FWm, n5 + (random.nextFloat() > 0.9f ? 4 : 0), 3, 3, 11, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_e4a82663_dBc.field_21260d_FWm, n6 + (random.nextFloat() > 0.9f ? 4 : 0), 7, 3, 9, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_e4a82663_dBc.field_21260d_FWm, n6 + (random.nextFloat() > 0.9f ? 4 : 0), 7, 3, 10, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_e4a82663_dBc.field_21260d_FWm, n6 + (random.nextFloat() > 0.9f ? 4 : 0), 7, 3, 11, cLK);
        if (!this.field_2092bf_Dne) {
            int n7;
            int n8 = this.method_ce7f5d9c_Dne(3);
            int n9 = this.method_16cca6d_Dne(5, 6);
            if (cLK.method_2c2cf7cd_Dne(n9, n8, n7 = this.method_1e26964c_FWm(5, 6))) {
                this.field_2092bf_Dne = true;
                qnq.method_17d7ea9d_FWm(n9, n8, n7, zKP.field_fdf84104_eJi.field_21260d_FWm, 0, 2);
                ySb ySb2 = (ySb)qnq.method_d98e681d_Dne(n9, n8, n7);
                if (ySb2 != null) {
                    ySb2.method_2304785c_Dne().method_8f501fe4_Dne("Silverfish");
                }
            }
        }
        return true;
    }

    public static DVF method_5841d6a9_Dne(List list, Random random, int n, int n2, int n3, int n4, int n5) {
        CLK cLK = CLK.method_286c569_Dne(n, n2, n3, -4, -1, 0, 11, 8, 16, n4);
        return DVF.method_697d22a9_Dne(cLK) && bvz.method_9e83199f_Dne(list, cLK) == null ? new DVF(n5, random, cLK, n4) : null;
    }

    @Override
    public void method_dbe42dde_Dne(bvz bvz2, List list, Random random) {
        if (bvz2 != null) {
            ((Kci)bvz2).field_36606f8_Dne = this;
        }
    }
}

