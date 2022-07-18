package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class Omm
extends ram {
    private int field_2092ae_Dne = -1;
    private boolean field_2092bf_Dne;
    private static final fKu[] field_836ba557_Dne = new fKu[]{new fKu(dEr.field_141d2e85_div.field_267cf5_Qnq, 0, 1, 3, 3), new fKu(dEr.field_5c4c1af_IjH.field_267cf5_Qnq, 0, 1, 5, 10), new fKu(dEr.field_74feeb39_mrb.field_267cf5_Qnq, 0, 1, 3, 5), new fKu(dEr.field_7785c591_rPc.field_267cf5_Qnq, 0, 1, 3, 15), new fKu(dEr.field_7137dca1_aFZ.field_267cf5_Qnq, 0, 1, 3, 15), new fKu(dEr.field_202e243a_FWm.field_267cf5_Qnq, 0, 1, 1, 5), new fKu(dEr.field_1c35e69a_XHL.field_267cf5_Qnq, 0, 1, 1, 5), new fKu(dEr.field_74f6e4bf_mrb.field_267cf5_Qnq, 0, 1, 1, 5), new fKu(dEr.field_5bcbb35_IjH.field_267cf5_Qnq, 0, 1, 1, 5), new fKu(dEr.field_1c2de020_XHL.field_267cf5_Qnq, 0, 1, 1, 5), new fKu(dEr.field_61660609_Zpi.field_267cf5_Qnq, 0, 1, 1, 5), new fKu(zKP.field_e641c680_cot.field_21260d_FWm, 0, 3, 7, 5), new fKu(zKP.field_7141ef33_aFZ.field_21260d_FWm, 0, 3, 7, 5)};

    @Override
    public boolean method_f28ef3a4_Dne(Qnq qnq, Random random, CLK cLK) {
        int n;
        int n2;
        if (this.field_2092ae_Dne < 0) {
            this.field_2092ae_Dne = this.method_d2c2fe3f_Dne(qnq, cLK);
            if (this.field_2092ae_Dne < 0) {
                return true;
            }
            this.field_3656daa_Dne.method_2c2cf7c9_Dne(0, this.field_2092ae_Dne - this.field_3656daa_Dne.field_2d29f4_aFZ + 6 - 1, 0);
        }
        this.method_3d7d4888_Dne(qnq, cLK, 0, 1, 0, 9, 4, 6, 0, 0, false);
        this.method_3d7d4888_Dne(qnq, cLK, 0, 0, 0, 9, 0, 6, zKP.field_75c638da_bzF.field_21260d_FWm, zKP.field_75c638da_bzF.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 0, 4, 0, 9, 4, 6, zKP.field_75c638da_bzF.field_21260d_FWm, zKP.field_75c638da_bzF.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 0, 5, 0, 9, 5, 6, zKP.field_202e4261_FWm.field_21260d_FWm, zKP.field_202e4261_FWm.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 1, 5, 1, 8, 5, 5, 0, 0, false);
        this.method_3d7d4888_Dne(qnq, cLK, 1, 1, 0, 2, 3, 0, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 0, 1, 0, 0, 4, 0, zKP.field_af0f1368_udO.field_21260d_FWm, zKP.field_af0f1368_udO.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 3, 1, 0, 3, 4, 0, zKP.field_af0f1368_udO.field_21260d_FWm, zKP.field_af0f1368_udO.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 0, 1, 6, 0, 4, 6, zKP.field_af0f1368_udO.field_21260d_FWm, zKP.field_af0f1368_udO.field_21260d_FWm, false);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, 0, 3, 3, 1, cLK);
        this.method_3d7d4888_Dne(qnq, cLK, 3, 1, 2, 3, 3, 2, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 4, 1, 3, 5, 3, 3, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 0, 1, 1, 0, 3, 5, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 1, 1, 6, 5, 3, 6, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 5, 1, 0, 5, 3, 0, zKP.field_ce2a1dc8_sly.field_21260d_FWm, zKP.field_ce2a1dc8_sly.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 9, 1, 0, 9, 3, 0, zKP.field_ce2a1dc8_sly.field_21260d_FWm, zKP.field_ce2a1dc8_sly.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 6, 1, 4, 9, 4, 6, zKP.field_75c638da_bzF.field_21260d_FWm, zKP.field_75c638da_bzF.field_21260d_FWm, false);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_202dfeee_FWm.field_21260d_FWm, 0, 7, 1, 5, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_202dfeee_FWm.field_21260d_FWm, 0, 8, 1, 5, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_1ee0bb87_Sdr.field_21260d_FWm, 0, 9, 2, 5, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_1ee0bb87_Sdr.field_21260d_FWm, 0, 9, 2, 4, cLK);
        this.method_3d7d4888_Dne(qnq, cLK, 7, 2, 4, 8, 2, 5, 0, 0, false);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_75c638da_bzF.field_21260d_FWm, 0, 6, 1, 3, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_cba1f2f1_haP.field_21260d_FWm, 0, 6, 2, 3, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_cba1f2f1_haP.field_21260d_FWm, 0, 6, 3, 3, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_3747682_Dne.field_21260d_FWm, 0, 8, 1, 1, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_8db845bb_Lab.field_21260d_FWm, 0, 0, 2, 2, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_8db845bb_Lab.field_21260d_FWm, 0, 0, 2, 4, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_8db845bb_Lab.field_21260d_FWm, 0, 2, 2, 6, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_8db845bb_Lab.field_21260d_FWm, 0, 4, 2, 6, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_ce2a1dc8_sly.field_21260d_FWm, 0, 2, 1, 4, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_937cc3a2_YHU.field_21260d_FWm, 0, 2, 2, 4, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, 0, 1, 1, 5, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_7a2b5882_One.field_21260d_FWm, this.method_73b4985a_bzF(zKP.field_7a2b5882_One.field_21260d_FWm, 3), 2, 1, 5, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_7a2b5882_One.field_21260d_FWm, this.method_73b4985a_bzF(zKP.field_7a2b5882_One.field_21260d_FWm, 1), 1, 1, 4, cLK);
        if (!this.field_2092bf_Dne) {
            int n3;
            n2 = this.method_ce7f5d9c_Dne(1);
            n = this.method_16cca6d_Dne(5, 5);
            if (cLK.method_2c2cf7cd_Dne(n, n2, n3 = this.method_1e26964c_FWm(5, 5))) {
                this.field_2092bf_Dne = true;
                this.method_f8f1dd60_Dne(qnq, cLK, random, 5, 1, 5, field_836ba557_Dne, 3 + random.nextInt(6));
            }
        }
        for (n2 = 6; n2 <= 8; ++n2) {
            if (this.method_3b27a7c2_Dne(qnq, n2, 0, -1, cLK) != 0 || this.method_3b27a7c2_Dne(qnq, n2, -1, -1, cLK) == 0) continue;
            this.method_b5ae8f6f_Dne(qnq, zKP.field_91df3208_BJH.field_21260d_FWm, this.method_73b4985a_bzF(zKP.field_91df3208_BJH.field_21260d_FWm, 3), n2, 0, -1, cLK);
        }
        for (n2 = 0; n2 < 7; ++n2) {
            for (n = 0; n < 10; ++n) {
                this.method_3b27a7cf_Dne(qnq, n, 6, n2, cLK);
                this.method_6ca945f0_FWm(qnq, zKP.field_75c638da_bzF.field_21260d_FWm, 0, n, -1, n2, cLK);
            }
        }
        this.method_d749210c_Dne(qnq, cLK, 7, 1, 1, 1);
        return true;
    }

    public Omm(opc opc2, int n, Random random, CLK cLK, int n2) {
        super(opc2, n);
        this.field_2d29f4_aFZ = n2;
        this.field_3656daa_Dne = cLK;
    }

    @Override
    protected int method_117d19dd_FWm(int n) {
        return 3;
    }

    public static Omm method_91f95083_Dne(opc opc2, List list, Random random, int n, int n2, int n3, int n4, int n5) {
        CLK cLK = CLK.method_286c569_Dne(n, n2, n3, 0, 0, 0, 10, 6, 7, n4);
        return Omm.method_697d22a9_Dne(cLK) && bvz.method_9e83199f_Dne(list, cLK) == null ? new Omm(opc2, n5, random, cLK, n4) : null;
    }
}

