package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class jsv
extends iDn {
    public jsv(int n, Random random, CLK cLK, int n2) {
        super(n);
        this.field_2d29f4_aFZ = n2;
        this.field_3656daa_Dne = cLK;
    }

    public static jsv method_58538f70_Dne(List list, Random random, int n, int n2, int n3, int n4, int n5) {
        CLK cLK = CLK.method_286c569_Dne(n, n2, n3, -8, -3, 0, 19, 10, 19, n4);
        return jsv.method_697d22a9_Dne(cLK) && bvz.method_9e83199f_Dne(list, cLK) == null ? new jsv(n5, random, cLK, n4) : null;
    }

    protected jsv(Random random, int n, int n2) {
        super(0);
        this.field_2d29f4_aFZ = random.nextInt(4);
        switch (this.field_2d29f4_aFZ) {
            case 0: 
            case 2: {
                this.field_3656daa_Dne = new CLK(n, 64, n2, n + 19 - 1, 73, n2 + 19 - 1);
                break;
            }
            default: {
                this.field_3656daa_Dne = new CLK(n, 64, n2, n + 19 - 1, 73, n2 + 19 - 1);
            }
        }
    }

    @Override
    public boolean method_f28ef3a4_Dne(Qnq qnq, Random random, CLK cLK) {
        int n;
        int n2;
        this.method_3d7d4888_Dne(qnq, cLK, 7, 3, 0, 11, 4, 18, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 0, 3, 7, 18, 4, 11, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 8, 5, 0, 10, 7, 18, 0, 0, false);
        this.method_3d7d4888_Dne(qnq, cLK, 0, 5, 8, 18, 7, 10, 0, 0, false);
        this.method_3d7d4888_Dne(qnq, cLK, 7, 5, 0, 7, 5, 7, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 7, 5, 11, 7, 5, 18, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 11, 5, 0, 11, 5, 7, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 11, 5, 11, 11, 5, 18, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 0, 5, 7, 7, 5, 7, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 11, 5, 7, 18, 5, 7, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 0, 5, 11, 7, 5, 11, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 11, 5, 11, 18, 5, 11, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 7, 2, 0, 11, 2, 5, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 7, 2, 13, 11, 2, 18, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 7, 0, 0, 11, 1, 3, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 7, 0, 15, 11, 1, 18, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        for (n2 = 7; n2 <= 11; ++n2) {
            for (n = 0; n <= 2; ++n) {
                this.method_6ca945f0_FWm(qnq, zKP.field_38c5f505_iNH.field_21260d_FWm, 0, n2, -1, n, cLK);
                this.method_6ca945f0_FWm(qnq, zKP.field_38c5f505_iNH.field_21260d_FWm, 0, n2, -1, 18 - n, cLK);
            }
        }
        this.method_3d7d4888_Dne(qnq, cLK, 0, 2, 7, 5, 2, 11, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 13, 2, 7, 18, 2, 11, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 0, 0, 7, 3, 1, 11, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 15, 0, 7, 18, 1, 11, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        for (n2 = 0; n2 <= 2; ++n2) {
            for (n = 7; n <= 11; ++n) {
                this.method_6ca945f0_FWm(qnq, zKP.field_38c5f505_iNH.field_21260d_FWm, 0, n2, -1, n, cLK);
                this.method_6ca945f0_FWm(qnq, zKP.field_38c5f505_iNH.field_21260d_FWm, 0, 18 - n2, -1, n, cLK);
            }
        }
        return true;
    }

    @Override
    public void method_dbe42dde_Dne(bvz bvz2, List list, Random random) {
        this.method_8b46d152_Dne((Tps)bvz2, list, random, 8, 3, false);
        this.method_62c58ab1_FWm((Tps)bvz2, list, random, 3, 8, false);
        this.method_d1a32fbf_bzF((Tps)bvz2, list, random, 3, 8, false);
    }
}

