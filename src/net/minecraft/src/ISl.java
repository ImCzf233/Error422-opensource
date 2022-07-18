package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class ISl
extends oeq {
    private final boolean field_2092bf_Dne;
    private final RLF field_36c3ea0_Dne;

    @Override
    public boolean method_f28ef3a4_Dne(Qnq qnq, Random random, CLK cLK) {
        if (this.method_d2c2fe50_Dne(qnq, cLK)) {
            return false;
        }
        this.method_294f1b74_Dne(qnq, cLK, 0, 0, 0, 4, 10, 4, true, random, dlc.method_230133f7_Dne());
        this.method_f04c7bae_Dne(qnq, random, cLK, this.field_36c3ea0_Dne, 1, 7, 0);
        this.method_f04c7bae_Dne(qnq, random, cLK, RLF.field_36c3ea0_Dne, 1, 1, 4);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_39272339_WvN.field_21260d_FWm, 0, 2, 6, 1, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_39272339_WvN.field_21260d_FWm, 0, 1, 5, 1, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_202e4261_FWm.field_21260d_FWm, 0, 1, 6, 1, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_39272339_WvN.field_21260d_FWm, 0, 1, 5, 2, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_39272339_WvN.field_21260d_FWm, 0, 1, 4, 3, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_202e4261_FWm.field_21260d_FWm, 0, 1, 5, 3, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_39272339_WvN.field_21260d_FWm, 0, 2, 4, 3, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_39272339_WvN.field_21260d_FWm, 0, 3, 3, 3, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_202e4261_FWm.field_21260d_FWm, 0, 3, 4, 3, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_39272339_WvN.field_21260d_FWm, 0, 3, 3, 2, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_39272339_WvN.field_21260d_FWm, 0, 3, 2, 1, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_202e4261_FWm.field_21260d_FWm, 0, 3, 3, 1, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_39272339_WvN.field_21260d_FWm, 0, 2, 2, 1, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_39272339_WvN.field_21260d_FWm, 0, 1, 1, 1, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_202e4261_FWm.field_21260d_FWm, 0, 1, 2, 1, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_39272339_WvN.field_21260d_FWm, 0, 1, 1, 2, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_202e4261_FWm.field_21260d_FWm, 0, 1, 1, 3, cLK);
        return true;
    }

    public ISl(int n, Random random, CLK cLK, int n2) {
        super(n);
        this.field_2092bf_Dne = false;
        this.field_2d29f4_aFZ = n2;
        this.field_36c3ea0_Dne = this.method_d152696b_Dne(random);
        this.field_3656daa_Dne = cLK;
    }

    @Override
    public void method_dbe42dde_Dne(bvz bvz2, List list, Random random) {
        if (this.field_2092bf_Dne) {
            dlc.method_f6d1a090_Dne(xwV.class);
        }
        this.method_3a5f42de_Dne((Kci)bvz2, list, random, 1, 1);
    }

    public ISl(int n, Random random, int n2, int n3) {
        super(n);
        this.field_2092bf_Dne = true;
        this.field_2d29f4_aFZ = random.nextInt(4);
        this.field_36c3ea0_Dne = RLF.field_36c3ea0_Dne;
        switch (this.field_2d29f4_aFZ) {
            case 0: 
            case 2: {
                this.field_3656daa_Dne = new CLK(n2, 64, n3, n2 + 5 - 1, 74, n3 + 5 - 1);
                break;
            }
            default: {
                this.field_3656daa_Dne = new CLK(n2, 64, n3, n2 + 5 - 1, 74, n3 + 5 - 1);
            }
        }
    }

    public static ISl method_584415db_Dne(List list, Random random, int n, int n2, int n3, int n4, int n5) {
        CLK cLK = CLK.method_286c569_Dne(n, n2, n3, -1, -7, 0, 5, 11, 5, n4);
        return ISl.method_697d22a9_Dne(cLK) && bvz.method_9e83199f_Dne(list, cLK) == null ? new ISl(n5, random, cLK, n4) : null;
    }
}

