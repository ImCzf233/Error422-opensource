package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class gZj
extends oeq {
    private final RLF field_36c3ea0_Dne;
    private boolean field_2092bf_Dne;
    private static final fKu[] field_836ba557_Dne = new fKu[]{new fKu(dEr.field_38bbe273_iNH.field_267cf5_Qnq, 0, 1, 1, 10), new fKu(dEr.field_141d2e85_div.field_267cf5_Qnq, 0, 1, 3, 3), new fKu(dEr.field_5c4c1af_IjH.field_267cf5_Qnq, 0, 1, 5, 10), new fKu(dEr.field_74feeb39_mrb.field_267cf5_Qnq, 0, 1, 3, 5), new fKu(dEr.field_59c23676_exS.field_267cf5_Qnq, 0, 4, 9, 5), new fKu(dEr.field_7785c591_rPc.field_267cf5_Qnq, 0, 1, 3, 15), new fKu(dEr.field_7137dca1_aFZ.field_267cf5_Qnq, 0, 1, 3, 15), new fKu(dEr.field_202e243a_FWm.field_267cf5_Qnq, 0, 1, 1, 5), new fKu(dEr.field_1c35e69a_XHL.field_267cf5_Qnq, 0, 1, 1, 5), new fKu(dEr.field_74f6e4bf_mrb.field_267cf5_Qnq, 0, 1, 1, 5), new fKu(dEr.field_5bcbb35_IjH.field_267cf5_Qnq, 0, 1, 1, 5), new fKu(dEr.field_1c2de020_XHL.field_267cf5_Qnq, 0, 1, 1, 5), new fKu(dEr.field_61660609_Zpi.field_267cf5_Qnq, 0, 1, 1, 5), new fKu(dEr.field_f97945f_ZfC.field_267cf5_Qnq, 0, 1, 1, 1)};

    public static gZj method_5851d306_Dne(List list, Random random, int n, int n2, int n3, int n4, int n5) {
        CLK cLK = CLK.method_286c569_Dne(n, n2, n3, -1, -1, 0, 5, 5, 7, n4);
        return gZj.method_697d22a9_Dne(cLK) && bvz.method_9e83199f_Dne(list, cLK) == null ? new gZj(n5, random, cLK, n4) : null;
    }

    @Override
    public void method_dbe42dde_Dne(bvz bvz2, List list, Random random) {
        this.method_3a5f42de_Dne((Kci)bvz2, list, random, 1, 1);
    }

    @Override
    public boolean method_f28ef3a4_Dne(Qnq qnq, Random random, CLK cLK) {
        int n;
        if (this.method_d2c2fe50_Dne(qnq, cLK)) {
            return false;
        }
        this.method_294f1b74_Dne(qnq, cLK, 0, 0, 0, 4, 4, 6, true, random, dlc.method_230133f7_Dne());
        this.method_f04c7bae_Dne(qnq, random, cLK, this.field_36c3ea0_Dne, 1, 1, 0);
        this.method_f04c7bae_Dne(qnq, random, cLK, RLF.field_36c3ea0_Dne, 1, 1, 6);
        this.method_3d7d4888_Dne(qnq, cLK, 3, 1, 2, 3, 1, 4, zKP.field_39272339_WvN.field_21260d_FWm, zKP.field_39272339_WvN.field_21260d_FWm, false);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_202e4261_FWm.field_21260d_FWm, 5, 3, 1, 1, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_202e4261_FWm.field_21260d_FWm, 5, 3, 1, 5, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_202e4261_FWm.field_21260d_FWm, 5, 3, 2, 2, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_202e4261_FWm.field_21260d_FWm, 5, 3, 2, 4, cLK);
        for (n = 2; n <= 4; ++n) {
            this.method_b5ae8f6f_Dne(qnq, zKP.field_202e4261_FWm.field_21260d_FWm, 5, 2, 1, n, cLK);
        }
        if (!this.field_2092bf_Dne) {
            int n2;
            n = this.method_ce7f5d9c_Dne(2);
            int n3 = this.method_16cca6d_Dne(3, 3);
            if (cLK.method_2c2cf7cd_Dne(n3, n, n2 = this.method_1e26964c_FWm(3, 3))) {
                this.field_2092bf_Dne = true;
                this.method_f8f1dd60_Dne(qnq, cLK, random, 3, 2, 3, fKu.method_3e9b7320_Dne(field_836ba557_Dne, dEr.field_374f605_Dne.method_d15b82c7_Dne(random)), 2 + random.nextInt(2));
            }
        }
        return true;
    }

    public gZj(int n, Random random, CLK cLK, int n2) {
        super(n);
        this.field_2d29f4_aFZ = n2;
        this.field_36c3ea0_Dne = this.method_d152696b_Dne(random);
        this.field_3656daa_Dne = cLK;
    }
}

