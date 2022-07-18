package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class SBI
extends oeq {
    protected final RLF field_36c3ea0_Dne;
    private static final fKu[] field_836ba557_Dne = new fKu[]{new fKu(dEr.field_5c4c1af_IjH.field_267cf5_Qnq, 0, 1, 5, 10), new fKu(dEr.field_74feeb39_mrb.field_267cf5_Qnq, 0, 1, 3, 5), new fKu(dEr.field_59c23676_exS.field_267cf5_Qnq, 0, 4, 9, 5), new fKu(dEr.field_16278184_DyG.field_267cf5_Qnq, 0, 3, 8, 10), new fKu(dEr.field_7785c591_rPc.field_267cf5_Qnq, 0, 1, 3, 15), new fKu(dEr.field_7137dca1_aFZ.field_267cf5_Qnq, 0, 1, 3, 15), new fKu(dEr.field_202e243a_FWm.field_267cf5_Qnq, 0, 1, 1, 1)};
    protected final int field_2092ae_Dne;

    public static SBI method_58485d83_Dne(List list, Random random, int n, int n2, int n3, int n4, int n5) {
        CLK cLK = CLK.method_286c569_Dne(n, n2, n3, -4, -1, 0, 11, 7, 11, n4);
        return SBI.method_697d22a9_Dne(cLK) && bvz.method_9e83199f_Dne(list, cLK) == null ? new SBI(n5, random, cLK, n4) : null;
    }

    @Override
    public boolean method_f28ef3a4_Dne(Qnq qnq, Random random, CLK cLK) {
        if (this.method_d2c2fe50_Dne(qnq, cLK)) {
            return false;
        }
        this.method_294f1b74_Dne(qnq, cLK, 0, 0, 0, 10, 6, 10, true, random, dlc.method_230133f7_Dne());
        this.method_f04c7bae_Dne(qnq, random, cLK, this.field_36c3ea0_Dne, 4, 1, 0);
        this.method_3d7d4888_Dne(qnq, cLK, 4, 1, 10, 6, 3, 10, 0, 0, false);
        this.method_3d7d4888_Dne(qnq, cLK, 0, 1, 4, 0, 3, 6, 0, 0, false);
        this.method_3d7d4888_Dne(qnq, cLK, 10, 1, 4, 10, 3, 6, 0, 0, false);
        switch (this.field_2092ae_Dne) {
            case 0: {
                this.method_b5ae8f6f_Dne(qnq, zKP.field_39272339_WvN.field_21260d_FWm, 0, 5, 1, 5, cLK);
                this.method_b5ae8f6f_Dne(qnq, zKP.field_39272339_WvN.field_21260d_FWm, 0, 5, 2, 5, cLK);
                this.method_b5ae8f6f_Dne(qnq, zKP.field_39272339_WvN.field_21260d_FWm, 0, 5, 3, 5, cLK);
                this.method_b5ae8f6f_Dne(qnq, zKP.field_954cd4c3_Wwe.field_21260d_FWm, 0, 4, 3, 5, cLK);
                this.method_b5ae8f6f_Dne(qnq, zKP.field_954cd4c3_Wwe.field_21260d_FWm, 0, 6, 3, 5, cLK);
                this.method_b5ae8f6f_Dne(qnq, zKP.field_954cd4c3_Wwe.field_21260d_FWm, 0, 5, 3, 4, cLK);
                this.method_b5ae8f6f_Dne(qnq, zKP.field_954cd4c3_Wwe.field_21260d_FWm, 0, 5, 3, 6, cLK);
                this.method_b5ae8f6f_Dne(qnq, zKP.field_202e4261_FWm.field_21260d_FWm, 0, 4, 1, 4, cLK);
                this.method_b5ae8f6f_Dne(qnq, zKP.field_202e4261_FWm.field_21260d_FWm, 0, 4, 1, 5, cLK);
                this.method_b5ae8f6f_Dne(qnq, zKP.field_202e4261_FWm.field_21260d_FWm, 0, 4, 1, 6, cLK);
                this.method_b5ae8f6f_Dne(qnq, zKP.field_202e4261_FWm.field_21260d_FWm, 0, 6, 1, 4, cLK);
                this.method_b5ae8f6f_Dne(qnq, zKP.field_202e4261_FWm.field_21260d_FWm, 0, 6, 1, 5, cLK);
                this.method_b5ae8f6f_Dne(qnq, zKP.field_202e4261_FWm.field_21260d_FWm, 0, 6, 1, 6, cLK);
                this.method_b5ae8f6f_Dne(qnq, zKP.field_202e4261_FWm.field_21260d_FWm, 0, 5, 1, 4, cLK);
                this.method_b5ae8f6f_Dne(qnq, zKP.field_202e4261_FWm.field_21260d_FWm, 0, 5, 1, 6, cLK);
                break;
            }
            case 1: {
                for (int i = 0; i < 5; ++i) {
                    this.method_b5ae8f6f_Dne(qnq, zKP.field_39272339_WvN.field_21260d_FWm, 0, 3, 1, 3 + i, cLK);
                    this.method_b5ae8f6f_Dne(qnq, zKP.field_39272339_WvN.field_21260d_FWm, 0, 7, 1, 3 + i, cLK);
                    this.method_b5ae8f6f_Dne(qnq, zKP.field_39272339_WvN.field_21260d_FWm, 0, 3 + i, 1, 3, cLK);
                    this.method_b5ae8f6f_Dne(qnq, zKP.field_39272339_WvN.field_21260d_FWm, 0, 3 + i, 1, 7, cLK);
                }
                this.method_b5ae8f6f_Dne(qnq, zKP.field_39272339_WvN.field_21260d_FWm, 0, 5, 1, 5, cLK);
                this.method_b5ae8f6f_Dne(qnq, zKP.field_39272339_WvN.field_21260d_FWm, 0, 5, 2, 5, cLK);
                this.method_b5ae8f6f_Dne(qnq, zKP.field_39272339_WvN.field_21260d_FWm, 0, 5, 3, 5, cLK);
                this.method_b5ae8f6f_Dne(qnq, zKP.field_374330f_Dne.field_21260d_FWm, 0, 5, 4, 5, cLK);
                break;
            }
            case 2: {
                int n;
                for (n = 1; n <= 9; ++n) {
                    this.method_b5ae8f6f_Dne(qnq, zKP.field_75c638da_bzF.field_21260d_FWm, 0, 1, 3, n, cLK);
                    this.method_b5ae8f6f_Dne(qnq, zKP.field_75c638da_bzF.field_21260d_FWm, 0, 9, 3, n, cLK);
                }
                for (n = 1; n <= 9; ++n) {
                    this.method_b5ae8f6f_Dne(qnq, zKP.field_75c638da_bzF.field_21260d_FWm, 0, n, 3, 1, cLK);
                    this.method_b5ae8f6f_Dne(qnq, zKP.field_75c638da_bzF.field_21260d_FWm, 0, n, 3, 9, cLK);
                }
                this.method_b5ae8f6f_Dne(qnq, zKP.field_75c638da_bzF.field_21260d_FWm, 0, 5, 1, 4, cLK);
                this.method_b5ae8f6f_Dne(qnq, zKP.field_75c638da_bzF.field_21260d_FWm, 0, 5, 1, 6, cLK);
                this.method_b5ae8f6f_Dne(qnq, zKP.field_75c638da_bzF.field_21260d_FWm, 0, 5, 3, 4, cLK);
                this.method_b5ae8f6f_Dne(qnq, zKP.field_75c638da_bzF.field_21260d_FWm, 0, 5, 3, 6, cLK);
                this.method_b5ae8f6f_Dne(qnq, zKP.field_75c638da_bzF.field_21260d_FWm, 0, 4, 1, 5, cLK);
                this.method_b5ae8f6f_Dne(qnq, zKP.field_75c638da_bzF.field_21260d_FWm, 0, 6, 1, 5, cLK);
                this.method_b5ae8f6f_Dne(qnq, zKP.field_75c638da_bzF.field_21260d_FWm, 0, 4, 3, 5, cLK);
                this.method_b5ae8f6f_Dne(qnq, zKP.field_75c638da_bzF.field_21260d_FWm, 0, 6, 3, 5, cLK);
                for (n = 1; n <= 3; ++n) {
                    this.method_b5ae8f6f_Dne(qnq, zKP.field_75c638da_bzF.field_21260d_FWm, 0, 4, n, 4, cLK);
                    this.method_b5ae8f6f_Dne(qnq, zKP.field_75c638da_bzF.field_21260d_FWm, 0, 6, n, 4, cLK);
                    this.method_b5ae8f6f_Dne(qnq, zKP.field_75c638da_bzF.field_21260d_FWm, 0, 4, n, 6, cLK);
                    this.method_b5ae8f6f_Dne(qnq, zKP.field_75c638da_bzF.field_21260d_FWm, 0, 6, n, 6, cLK);
                }
                this.method_b5ae8f6f_Dne(qnq, zKP.field_954cd4c3_Wwe.field_21260d_FWm, 0, 5, 3, 5, cLK);
                for (n = 2; n <= 8; ++n) {
                    this.method_b5ae8f6f_Dne(qnq, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, 0, 2, 3, n, cLK);
                    this.method_b5ae8f6f_Dne(qnq, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, 0, 3, 3, n, cLK);
                    if (n <= 3 || n >= 7) {
                        this.method_b5ae8f6f_Dne(qnq, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, 0, 4, 3, n, cLK);
                        this.method_b5ae8f6f_Dne(qnq, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, 0, 5, 3, n, cLK);
                        this.method_b5ae8f6f_Dne(qnq, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, 0, 6, 3, n, cLK);
                    }
                    this.method_b5ae8f6f_Dne(qnq, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, 0, 7, 3, n, cLK);
                    this.method_b5ae8f6f_Dne(qnq, zKP.field_5e67d9b4_Qnq.field_21260d_FWm, 0, 8, 3, n, cLK);
                }
                this.method_b5ae8f6f_Dne(qnq, zKP.field_fa1a6f1_ZfC.field_21260d_FWm, this.method_73b4985a_bzF(zKP.field_fa1a6f1_ZfC.field_21260d_FWm, 4), 9, 1, 3, cLK);
                this.method_b5ae8f6f_Dne(qnq, zKP.field_fa1a6f1_ZfC.field_21260d_FWm, this.method_73b4985a_bzF(zKP.field_fa1a6f1_ZfC.field_21260d_FWm, 4), 9, 2, 3, cLK);
                this.method_b5ae8f6f_Dne(qnq, zKP.field_fa1a6f1_ZfC.field_21260d_FWm, this.method_73b4985a_bzF(zKP.field_fa1a6f1_ZfC.field_21260d_FWm, 4), 9, 3, 3, cLK);
                this.method_f8f1dd60_Dne(qnq, cLK, random, 3, 4, 8, fKu.method_3e9b7320_Dne(field_836ba557_Dne, dEr.field_374f605_Dne.method_d15b82c7_Dne(random)), 1 + random.nextInt(4));
            }
        }
        return true;
    }

    @Override
    public void method_dbe42dde_Dne(bvz bvz2, List list, Random random) {
        this.method_3a5f42de_Dne((Kci)bvz2, list, random, 4, 1);
        this.method_784619f_FWm((Kci)bvz2, list, random, 1, 4);
        this.method_86f6e2d1_bzF((Kci)bvz2, list, random, 1, 4);
    }

    public SBI(int n, Random random, CLK cLK, int n2) {
        super(n);
        this.field_2d29f4_aFZ = n2;
        this.field_36c3ea0_Dne = this.method_d152696b_Dne(random);
        this.field_3656daa_Dne = cLK;
        this.field_2092ae_Dne = random.nextInt(5);
    }
}

