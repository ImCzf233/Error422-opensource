package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class UeW
extends hvE {
    private static final fKu[] field_836ba557_Dne = new fKu[]{new fKu(dEr.field_141d2e85_div.field_267cf5_Qnq, 0, 1, 3, 3), new fKu(dEr.field_5c4c1af_IjH.field_267cf5_Qnq, 0, 1, 5, 10), new fKu(dEr.field_74feeb39_mrb.field_267cf5_Qnq, 0, 2, 7, 15), new fKu(dEr.field_86ecf659_Kvh.field_267cf5_Qnq, 0, 1, 3, 2), new fKu(dEr.field_fc3bf6d1_tIz.field_267cf5_Qnq, 0, 4, 6, 20), new fKu(dEr.field_a989199f_gvF.field_267cf5_Qnq, 0, 3, 7, 16)};
    private boolean[] field_3f1c59a_Dne = new boolean[4];

    public UeW(Random random, int n, int n2) {
        super(random, n, 64, n2, 21, 15, 21);
    }

    @Override
    public boolean method_f28ef3a4_Dne(Qnq qnq, Random random, CLK cLK) {
        int n;
        int n2;
        int n3;
        this.method_3d7d4888_Dne(qnq, cLK, 0, -4, 0, this.field_2092ae_Dne - 1, 0, this.field_2e5f1b_bzF - 1, zKP.field_850fb0c5_ceE.field_21260d_FWm, zKP.field_850fb0c5_ceE.field_21260d_FWm, false);
        for (n3 = 1; n3 <= 9; ++n3) {
            this.method_3d7d4888_Dne(qnq, cLK, n3, n3, n3, this.field_2092ae_Dne - 1 - n3, n3, this.field_2e5f1b_bzF - 1 - n3, zKP.field_850fb0c5_ceE.field_21260d_FWm, zKP.field_850fb0c5_ceE.field_21260d_FWm, false);
            this.method_3d7d4888_Dne(qnq, cLK, n3 + 1, n3, n3 + 1, this.field_2092ae_Dne - 2 - n3, n3, this.field_2e5f1b_bzF - 2 - n3, 0, 0, false);
        }
        for (n3 = 0; n3 < this.field_2092ae_Dne; ++n3) {
            for (n2 = 0; n2 < this.field_2e5f1b_bzF; ++n2) {
                this.method_6ca945f0_FWm(qnq, zKP.field_850fb0c5_ceE.field_21260d_FWm, 0, n3, -5, n2, cLK);
            }
        }
        n3 = this.method_73b4985a_bzF(zKP.field_b77fe6db_Wnd.field_21260d_FWm, 3);
        n2 = this.method_73b4985a_bzF(zKP.field_b77fe6db_Wnd.field_21260d_FWm, 2);
        int n4 = this.method_73b4985a_bzF(zKP.field_b77fe6db_Wnd.field_21260d_FWm, 0);
        int n5 = this.method_73b4985a_bzF(zKP.field_b77fe6db_Wnd.field_21260d_FWm, 1);
        int n6 = 1;
        int n7 = 11;
        this.method_3d7d4888_Dne(qnq, cLK, 0, 0, 0, 4, 9, 4, zKP.field_850fb0c5_ceE.field_21260d_FWm, 0, false);
        this.method_3d7d4888_Dne(qnq, cLK, 1, 10, 1, 3, 10, 3, zKP.field_850fb0c5_ceE.field_21260d_FWm, zKP.field_850fb0c5_ceE.field_21260d_FWm, false);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_b77fe6db_Wnd.field_21260d_FWm, n3, 2, 10, 0, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_b77fe6db_Wnd.field_21260d_FWm, n2, 2, 10, 4, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_b77fe6db_Wnd.field_21260d_FWm, n4, 0, 10, 2, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_b77fe6db_Wnd.field_21260d_FWm, n5, 4, 10, 2, cLK);
        this.method_3d7d4888_Dne(qnq, cLK, this.field_2092ae_Dne - 5, 0, 0, this.field_2092ae_Dne - 1, 9, 4, zKP.field_850fb0c5_ceE.field_21260d_FWm, 0, false);
        this.method_3d7d4888_Dne(qnq, cLK, this.field_2092ae_Dne - 4, 10, 1, this.field_2092ae_Dne - 2, 10, 3, zKP.field_850fb0c5_ceE.field_21260d_FWm, zKP.field_850fb0c5_ceE.field_21260d_FWm, false);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_b77fe6db_Wnd.field_21260d_FWm, n3, this.field_2092ae_Dne - 3, 10, 0, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_b77fe6db_Wnd.field_21260d_FWm, n2, this.field_2092ae_Dne - 3, 10, 4, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_b77fe6db_Wnd.field_21260d_FWm, n4, this.field_2092ae_Dne - 5, 10, 2, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_b77fe6db_Wnd.field_21260d_FWm, n5, this.field_2092ae_Dne - 1, 10, 2, cLK);
        this.method_3d7d4888_Dne(qnq, cLK, 8, 0, 0, 12, 4, 4, zKP.field_850fb0c5_ceE.field_21260d_FWm, 0, false);
        this.method_3d7d4888_Dne(qnq, cLK, 9, 1, 0, 11, 3, 4, 0, 0, false);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_850fb0c5_ceE.field_21260d_FWm, 2, 9, 1, 1, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_850fb0c5_ceE.field_21260d_FWm, 2, 9, 2, 1, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_850fb0c5_ceE.field_21260d_FWm, 2, 9, 3, 1, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_850fb0c5_ceE.field_21260d_FWm, 2, 10, 3, 1, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_850fb0c5_ceE.field_21260d_FWm, 2, 11, 3, 1, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_850fb0c5_ceE.field_21260d_FWm, 2, 11, 2, 1, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_850fb0c5_ceE.field_21260d_FWm, 2, 11, 1, 1, cLK);
        this.method_3d7d4888_Dne(qnq, cLK, 4, 1, 1, 8, 3, 3, zKP.field_850fb0c5_ceE.field_21260d_FWm, 0, false);
        this.method_3d7d4888_Dne(qnq, cLK, 4, 1, 2, 8, 2, 2, 0, 0, false);
        this.method_3d7d4888_Dne(qnq, cLK, 12, 1, 1, 16, 3, 3, zKP.field_850fb0c5_ceE.field_21260d_FWm, 0, false);
        this.method_3d7d4888_Dne(qnq, cLK, 12, 1, 2, 16, 2, 2, 0, 0, false);
        this.method_3d7d4888_Dne(qnq, cLK, 5, 4, 5, this.field_2092ae_Dne - 6, 4, this.field_2e5f1b_bzF - 6, zKP.field_850fb0c5_ceE.field_21260d_FWm, zKP.field_850fb0c5_ceE.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 9, 4, 9, 11, 4, 11, 0, 0, false);
        this.method_d26c5728_Dne(qnq, cLK, 8, 1, 8, 8, 3, 8, zKP.field_850fb0c5_ceE.field_21260d_FWm, 2, zKP.field_850fb0c5_ceE.field_21260d_FWm, 2, false);
        this.method_d26c5728_Dne(qnq, cLK, 12, 1, 8, 12, 3, 8, zKP.field_850fb0c5_ceE.field_21260d_FWm, 2, zKP.field_850fb0c5_ceE.field_21260d_FWm, 2, false);
        this.method_d26c5728_Dne(qnq, cLK, 8, 1, 12, 8, 3, 12, zKP.field_850fb0c5_ceE.field_21260d_FWm, 2, zKP.field_850fb0c5_ceE.field_21260d_FWm, 2, false);
        this.method_d26c5728_Dne(qnq, cLK, 12, 1, 12, 12, 3, 12, zKP.field_850fb0c5_ceE.field_21260d_FWm, 2, zKP.field_850fb0c5_ceE.field_21260d_FWm, 2, false);
        this.method_3d7d4888_Dne(qnq, cLK, 1, 1, 5, 4, 4, 11, zKP.field_850fb0c5_ceE.field_21260d_FWm, zKP.field_850fb0c5_ceE.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, this.field_2092ae_Dne - 5, 1, 5, this.field_2092ae_Dne - 2, 4, 11, zKP.field_850fb0c5_ceE.field_21260d_FWm, zKP.field_850fb0c5_ceE.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 6, 7, 9, 6, 7, 11, zKP.field_850fb0c5_ceE.field_21260d_FWm, zKP.field_850fb0c5_ceE.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, this.field_2092ae_Dne - 7, 7, 9, this.field_2092ae_Dne - 7, 7, 11, zKP.field_850fb0c5_ceE.field_21260d_FWm, zKP.field_850fb0c5_ceE.field_21260d_FWm, false);
        this.method_d26c5728_Dne(qnq, cLK, 5, 5, 9, 5, 7, 11, zKP.field_850fb0c5_ceE.field_21260d_FWm, 2, zKP.field_850fb0c5_ceE.field_21260d_FWm, 2, false);
        this.method_d26c5728_Dne(qnq, cLK, this.field_2092ae_Dne - 6, 5, 9, this.field_2092ae_Dne - 6, 7, 11, zKP.field_850fb0c5_ceE.field_21260d_FWm, 2, zKP.field_850fb0c5_ceE.field_21260d_FWm, 2, false);
        this.method_b5ae8f6f_Dne(qnq, 0, 0, 5, 5, 10, cLK);
        this.method_b5ae8f6f_Dne(qnq, 0, 0, 5, 6, 10, cLK);
        this.method_b5ae8f6f_Dne(qnq, 0, 0, 6, 6, 10, cLK);
        this.method_b5ae8f6f_Dne(qnq, 0, 0, this.field_2092ae_Dne - 6, 5, 10, cLK);
        this.method_b5ae8f6f_Dne(qnq, 0, 0, this.field_2092ae_Dne - 6, 6, 10, cLK);
        this.method_b5ae8f6f_Dne(qnq, 0, 0, this.field_2092ae_Dne - 7, 6, 10, cLK);
        this.method_3d7d4888_Dne(qnq, cLK, 2, 4, 4, 2, 6, 4, 0, 0, false);
        this.method_3d7d4888_Dne(qnq, cLK, this.field_2092ae_Dne - 3, 4, 4, this.field_2092ae_Dne - 3, 6, 4, 0, 0, false);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_b77fe6db_Wnd.field_21260d_FWm, n3, 2, 4, 5, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_b77fe6db_Wnd.field_21260d_FWm, n3, 2, 3, 4, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_b77fe6db_Wnd.field_21260d_FWm, n3, this.field_2092ae_Dne - 3, 4, 5, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_b77fe6db_Wnd.field_21260d_FWm, n3, this.field_2092ae_Dne - 3, 3, 4, cLK);
        this.method_3d7d4888_Dne(qnq, cLK, 1, 1, 3, 2, 2, 3, zKP.field_850fb0c5_ceE.field_21260d_FWm, zKP.field_850fb0c5_ceE.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, this.field_2092ae_Dne - 3, 1, 3, this.field_2092ae_Dne - 2, 2, 3, zKP.field_850fb0c5_ceE.field_21260d_FWm, zKP.field_850fb0c5_ceE.field_21260d_FWm, false);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_b77fe6db_Wnd.field_21260d_FWm, 0, 1, 1, 2, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_b77fe6db_Wnd.field_21260d_FWm, 0, this.field_2092ae_Dne - 2, 1, 2, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_202e4261_FWm.field_21260d_FWm, 1, 1, 2, 2, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_202e4261_FWm.field_21260d_FWm, 1, this.field_2092ae_Dne - 2, 2, 2, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_b77fe6db_Wnd.field_21260d_FWm, n5, 2, 1, 2, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_b77fe6db_Wnd.field_21260d_FWm, n4, this.field_2092ae_Dne - 3, 1, 2, cLK);
        this.method_3d7d4888_Dne(qnq, cLK, 4, 3, 5, 4, 3, 18, zKP.field_850fb0c5_ceE.field_21260d_FWm, zKP.field_850fb0c5_ceE.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, this.field_2092ae_Dne - 5, 3, 5, this.field_2092ae_Dne - 5, 3, 17, zKP.field_850fb0c5_ceE.field_21260d_FWm, zKP.field_850fb0c5_ceE.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 3, 1, 5, 4, 2, 16, 0, 0, false);
        this.method_3d7d4888_Dne(qnq, cLK, this.field_2092ae_Dne - 6, 1, 5, this.field_2092ae_Dne - 5, 2, 16, 0, 0, false);
        for (n = 5; n <= 17; n += 2) {
            this.method_b5ae8f6f_Dne(qnq, zKP.field_850fb0c5_ceE.field_21260d_FWm, 2, 4, 1, n, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_850fb0c5_ceE.field_21260d_FWm, 1, 4, 2, n, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_850fb0c5_ceE.field_21260d_FWm, 2, this.field_2092ae_Dne - 5, 1, n, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_850fb0c5_ceE.field_21260d_FWm, 1, this.field_2092ae_Dne - 5, 2, n, cLK);
        }
        this.method_b5ae8f6f_Dne(qnq, zKP.field_9f40014e_RPx.field_21260d_FWm, n6, 10, 0, 7, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_9f40014e_RPx.field_21260d_FWm, n6, 10, 0, 8, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_9f40014e_RPx.field_21260d_FWm, n6, 9, 0, 9, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_9f40014e_RPx.field_21260d_FWm, n6, 11, 0, 9, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_9f40014e_RPx.field_21260d_FWm, n6, 8, 0, 10, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_9f40014e_RPx.field_21260d_FWm, n6, 12, 0, 10, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_9f40014e_RPx.field_21260d_FWm, n6, 7, 0, 10, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_9f40014e_RPx.field_21260d_FWm, n6, 13, 0, 10, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_9f40014e_RPx.field_21260d_FWm, n6, 9, 0, 11, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_9f40014e_RPx.field_21260d_FWm, n6, 11, 0, 11, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_9f40014e_RPx.field_21260d_FWm, n6, 10, 0, 12, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_9f40014e_RPx.field_21260d_FWm, n6, 10, 0, 13, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_9f40014e_RPx.field_21260d_FWm, n7, 10, 0, 10, cLK);
        for (n = 0; n <= this.field_2092ae_Dne - 1; n += this.field_2092ae_Dne - 1) {
            this.method_b5ae8f6f_Dne(qnq, zKP.field_850fb0c5_ceE.field_21260d_FWm, 2, n, 2, 1, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_9f40014e_RPx.field_21260d_FWm, n6, n, 2, 2, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_850fb0c5_ceE.field_21260d_FWm, 2, n, 2, 3, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_850fb0c5_ceE.field_21260d_FWm, 2, n, 3, 1, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_9f40014e_RPx.field_21260d_FWm, n6, n, 3, 2, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_850fb0c5_ceE.field_21260d_FWm, 2, n, 3, 3, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_9f40014e_RPx.field_21260d_FWm, n6, n, 4, 1, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_850fb0c5_ceE.field_21260d_FWm, 1, n, 4, 2, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_9f40014e_RPx.field_21260d_FWm, n6, n, 4, 3, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_850fb0c5_ceE.field_21260d_FWm, 2, n, 5, 1, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_9f40014e_RPx.field_21260d_FWm, n6, n, 5, 2, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_850fb0c5_ceE.field_21260d_FWm, 2, n, 5, 3, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_9f40014e_RPx.field_21260d_FWm, n6, n, 6, 1, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_850fb0c5_ceE.field_21260d_FWm, 1, n, 6, 2, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_9f40014e_RPx.field_21260d_FWm, n6, n, 6, 3, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_9f40014e_RPx.field_21260d_FWm, n6, n, 7, 1, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_9f40014e_RPx.field_21260d_FWm, n6, n, 7, 2, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_9f40014e_RPx.field_21260d_FWm, n6, n, 7, 3, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_850fb0c5_ceE.field_21260d_FWm, 2, n, 8, 1, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_850fb0c5_ceE.field_21260d_FWm, 2, n, 8, 2, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_850fb0c5_ceE.field_21260d_FWm, 2, n, 8, 3, cLK);
        }
        for (n = 2; n <= this.field_2092ae_Dne - 3; n += this.field_2092ae_Dne - 3 - 2) {
            this.method_b5ae8f6f_Dne(qnq, zKP.field_850fb0c5_ceE.field_21260d_FWm, 2, n - 1, 2, 0, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_9f40014e_RPx.field_21260d_FWm, n6, n, 2, 0, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_850fb0c5_ceE.field_21260d_FWm, 2, n + 1, 2, 0, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_850fb0c5_ceE.field_21260d_FWm, 2, n - 1, 3, 0, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_9f40014e_RPx.field_21260d_FWm, n6, n, 3, 0, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_850fb0c5_ceE.field_21260d_FWm, 2, n + 1, 3, 0, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_9f40014e_RPx.field_21260d_FWm, n6, n - 1, 4, 0, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_850fb0c5_ceE.field_21260d_FWm, 1, n, 4, 0, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_9f40014e_RPx.field_21260d_FWm, n6, n + 1, 4, 0, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_850fb0c5_ceE.field_21260d_FWm, 2, n - 1, 5, 0, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_9f40014e_RPx.field_21260d_FWm, n6, n, 5, 0, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_850fb0c5_ceE.field_21260d_FWm, 2, n + 1, 5, 0, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_9f40014e_RPx.field_21260d_FWm, n6, n - 1, 6, 0, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_850fb0c5_ceE.field_21260d_FWm, 1, n, 6, 0, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_9f40014e_RPx.field_21260d_FWm, n6, n + 1, 6, 0, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_9f40014e_RPx.field_21260d_FWm, n6, n - 1, 7, 0, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_9f40014e_RPx.field_21260d_FWm, n6, n, 7, 0, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_9f40014e_RPx.field_21260d_FWm, n6, n + 1, 7, 0, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_850fb0c5_ceE.field_21260d_FWm, 2, n - 1, 8, 0, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_850fb0c5_ceE.field_21260d_FWm, 2, n, 8, 0, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_850fb0c5_ceE.field_21260d_FWm, 2, n + 1, 8, 0, cLK);
        }
        this.method_d26c5728_Dne(qnq, cLK, 8, 4, 0, 12, 6, 0, zKP.field_850fb0c5_ceE.field_21260d_FWm, 2, zKP.field_850fb0c5_ceE.field_21260d_FWm, 2, false);
        this.method_b5ae8f6f_Dne(qnq, 0, 0, 8, 6, 0, cLK);
        this.method_b5ae8f6f_Dne(qnq, 0, 0, 12, 6, 0, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_9f40014e_RPx.field_21260d_FWm, n6, 9, 5, 0, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_850fb0c5_ceE.field_21260d_FWm, 1, 10, 5, 0, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_9f40014e_RPx.field_21260d_FWm, n6, 11, 5, 0, cLK);
        this.method_d26c5728_Dne(qnq, cLK, 8, -14, 8, 12, -11, 12, zKP.field_850fb0c5_ceE.field_21260d_FWm, 2, zKP.field_850fb0c5_ceE.field_21260d_FWm, 2, false);
        this.method_d26c5728_Dne(qnq, cLK, 8, -10, 8, 12, -10, 12, zKP.field_850fb0c5_ceE.field_21260d_FWm, 1, zKP.field_850fb0c5_ceE.field_21260d_FWm, 1, false);
        this.method_d26c5728_Dne(qnq, cLK, 8, -9, 8, 12, -9, 12, zKP.field_850fb0c5_ceE.field_21260d_FWm, 2, zKP.field_850fb0c5_ceE.field_21260d_FWm, 2, false);
        this.method_3d7d4888_Dne(qnq, cLK, 8, -8, 8, 12, -1, 12, zKP.field_850fb0c5_ceE.field_21260d_FWm, zKP.field_850fb0c5_ceE.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 9, -11, 9, 11, -1, 11, 0, 0, false);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_6a32fa5a_xXN.field_21260d_FWm, 0, 10, -11, 10, cLK);
        this.method_3d7d4888_Dne(qnq, cLK, 9, -13, 9, 11, -13, 11, zKP.field_cb5aacc0_qXo.field_21260d_FWm, 0, false);
        this.method_b5ae8f6f_Dne(qnq, 0, 0, 8, -11, 10, cLK);
        this.method_b5ae8f6f_Dne(qnq, 0, 0, 8, -10, 10, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_850fb0c5_ceE.field_21260d_FWm, 1, 7, -10, 10, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_850fb0c5_ceE.field_21260d_FWm, 2, 7, -11, 10, cLK);
        this.method_b5ae8f6f_Dne(qnq, 0, 0, 12, -11, 10, cLK);
        this.method_b5ae8f6f_Dne(qnq, 0, 0, 12, -10, 10, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_850fb0c5_ceE.field_21260d_FWm, 1, 13, -10, 10, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_850fb0c5_ceE.field_21260d_FWm, 2, 13, -11, 10, cLK);
        this.method_b5ae8f6f_Dne(qnq, 0, 0, 10, -11, 8, cLK);
        this.method_b5ae8f6f_Dne(qnq, 0, 0, 10, -10, 8, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_850fb0c5_ceE.field_21260d_FWm, 1, 10, -10, 7, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_850fb0c5_ceE.field_21260d_FWm, 2, 10, -11, 7, cLK);
        this.method_b5ae8f6f_Dne(qnq, 0, 0, 10, -11, 12, cLK);
        this.method_b5ae8f6f_Dne(qnq, 0, 0, 10, -10, 12, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_850fb0c5_ceE.field_21260d_FWm, 1, 10, -10, 13, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_850fb0c5_ceE.field_21260d_FWm, 2, 10, -11, 13, cLK);
        for (n = 0; n < 4; ++n) {
            if (this.field_3f1c59a_Dne[n]) continue;
            int n8 = zxJ.field_3f1c589_Dne[n] * 2;
            int n9 = zxJ.field_4039e0a_FWm[n] * 2;
            this.field_3f1c59a_Dne[n] = this.method_f8f1dd60_Dne(qnq, cLK, random, 10 + n8, -11, 10 + n9, fKu.method_3e9b7320_Dne(field_836ba557_Dne, dEr.field_374f605_Dne.method_d15b82c7_Dne(random)), 2 + random.nextInt(5));
        }
        return true;
    }
}

