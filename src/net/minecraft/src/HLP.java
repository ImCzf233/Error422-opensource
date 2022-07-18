package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class HLP
extends oeq {
    protected final RLF field_36c3ea0_Dne;

    public static HLP method_584383d1_Dne(List list, Random random, int n, int n2, int n3, int n4, int n5) {
        CLK cLK = CLK.method_286c569_Dne(n, n2, n3, -1, -1, 0, 9, 5, 11, n4);
        return HLP.method_697d22a9_Dne(cLK) && bvz.method_9e83199f_Dne(list, cLK) == null ? new HLP(n5, random, cLK, n4) : null;
    }

    public HLP(int n, Random random, CLK cLK, int n2) {
        super(n);
        this.field_2d29f4_aFZ = n2;
        this.field_36c3ea0_Dne = this.method_d152696b_Dne(random);
        this.field_3656daa_Dne = cLK;
    }

    @Override
    public boolean method_f28ef3a4_Dne(Qnq qnq, Random random, CLK cLK) {
        if (this.method_d2c2fe50_Dne(qnq, cLK)) {
            return false;
        }
        this.method_294f1b74_Dne(qnq, cLK, 0, 0, 0, 8, 4, 10, true, random, dlc.method_230133f7_Dne());
        this.method_f04c7bae_Dne(qnq, random, cLK, this.field_36c3ea0_Dne, 1, 1, 0);
        this.method_3d7d4888_Dne(qnq, cLK, 1, 1, 10, 3, 3, 10, 0, 0, false);
        this.method_294f1b74_Dne(qnq, cLK, 4, 1, 1, 4, 3, 1, false, random, dlc.method_230133f7_Dne());
        this.method_294f1b74_Dne(qnq, cLK, 4, 1, 3, 4, 3, 3, false, random, dlc.method_230133f7_Dne());
        this.method_294f1b74_Dne(qnq, cLK, 4, 1, 7, 4, 3, 7, false, random, dlc.method_230133f7_Dne());
        this.method_294f1b74_Dne(qnq, cLK, 4, 1, 9, 4, 3, 9, false, random, dlc.method_230133f7_Dne());
        this.method_3d7d4888_Dne(qnq, cLK, 4, 1, 4, 4, 3, 6, zKP.field_1ee0bb87_Sdr.field_21260d_FWm, zKP.field_1ee0bb87_Sdr.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 5, 1, 5, 7, 3, 5, zKP.field_1ee0bb87_Sdr.field_21260d_FWm, zKP.field_1ee0bb87_Sdr.field_21260d_FWm, false);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_1ee0bb87_Sdr.field_21260d_FWm, 0, 4, 3, 2, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_1ee0bb87_Sdr.field_21260d_FWm, 0, 4, 3, 8, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_79fca9d5_IYC.field_21260d_FWm, this.method_73b4985a_bzF(zKP.field_79fca9d5_IYC.field_21260d_FWm, 3), 4, 1, 2, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_79fca9d5_IYC.field_21260d_FWm, this.method_73b4985a_bzF(zKP.field_79fca9d5_IYC.field_21260d_FWm, 3) + 8, 4, 2, 2, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_79fca9d5_IYC.field_21260d_FWm, this.method_73b4985a_bzF(zKP.field_79fca9d5_IYC.field_21260d_FWm, 3), 4, 1, 8, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_79fca9d5_IYC.field_21260d_FWm, this.method_73b4985a_bzF(zKP.field_79fca9d5_IYC.field_21260d_FWm, 3) + 8, 4, 2, 8, cLK);
        return true;
    }

    @Override
    public void method_dbe42dde_Dne(bvz bvz2, List list, Random random) {
        this.method_3a5f42de_Dne((Kci)bvz2, list, random, 1, 1);
    }
}

