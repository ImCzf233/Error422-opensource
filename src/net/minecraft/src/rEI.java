package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class rEI
extends oeq {
    private final RLF field_36c3ea0_Dne;

    public static rEI method_58568047_Dne(List list, Random random, int n, int n2, int n3, int n4, int n5) {
        CLK cLK = CLK.method_286c569_Dne(n, n2, n3, -1, -7, 0, 5, 11, 8, n4);
        return rEI.method_697d22a9_Dne(cLK) && bvz.method_9e83199f_Dne(list, cLK) == null ? new rEI(n5, random, cLK, n4) : null;
    }

    public rEI(int n, Random random, CLK cLK, int n2) {
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
        this.method_294f1b74_Dne(qnq, cLK, 0, 0, 0, 4, 10, 7, true, random, dlc.method_230133f7_Dne());
        this.method_f04c7bae_Dne(qnq, random, cLK, this.field_36c3ea0_Dne, 1, 7, 0);
        this.method_f04c7bae_Dne(qnq, random, cLK, RLF.field_36c3ea0_Dne, 1, 1, 7);
        int n = this.method_73b4985a_bzF(zKP.field_91df3208_BJH.field_21260d_FWm, 2);
        for (int i = 0; i < 6; ++i) {
            this.method_b5ae8f6f_Dne(qnq, zKP.field_91df3208_BJH.field_21260d_FWm, n, 1, 6 - i, 1 + i, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_91df3208_BJH.field_21260d_FWm, n, 2, 6 - i, 1 + i, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_91df3208_BJH.field_21260d_FWm, n, 3, 6 - i, 1 + i, cLK);
            if (i >= 5) continue;
            this.method_b5ae8f6f_Dne(qnq, zKP.field_39272339_WvN.field_21260d_FWm, 0, 1, 5 - i, 1 + i, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_39272339_WvN.field_21260d_FWm, 0, 2, 5 - i, 1 + i, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_39272339_WvN.field_21260d_FWm, 0, 3, 5 - i, 1 + i, cLK);
        }
        return true;
    }

    @Override
    public void method_dbe42dde_Dne(bvz bvz2, List list, Random random) {
        this.method_3a5f42de_Dne((Kci)bvz2, list, random, 1, 1);
    }
}

