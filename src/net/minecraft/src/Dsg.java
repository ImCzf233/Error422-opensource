package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class Dsg
extends iDn {
    @Override
    public boolean method_f28ef3a4_Dne(Qnq qnq, Random random, CLK cLK) {
        this.method_3d7d4888_Dne(qnq, cLK, 0, 0, 0, 4, 1, 4, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 0, 2, 0, 4, 5, 4, 0, 0, false);
        this.method_3d7d4888_Dne(qnq, cLK, 0, 2, 0, 0, 5, 0, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 4, 2, 0, 4, 5, 0, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 0, 2, 4, 0, 5, 4, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 4, 2, 4, 4, 5, 4, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        this.method_3d7d4888_Dne(qnq, cLK, 0, 6, 0, 4, 6, 4, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        for (int i = 0; i <= 4; ++i) {
            for (int j = 0; j <= 4; ++j) {
                this.method_6ca945f0_FWm(qnq, zKP.field_38c5f505_iNH.field_21260d_FWm, 0, i, -1, j, cLK);
            }
        }
        return true;
    }

    public static Dsg method_58424785_Dne(List list, Random random, int n, int n2, int n3, int n4, int n5) {
        CLK cLK = CLK.method_286c569_Dne(n, n2, n3, -1, 0, 0, 5, 7, 5, n4);
        return Dsg.method_697d22a9_Dne(cLK) && bvz.method_9e83199f_Dne(list, cLK) == null ? new Dsg(n5, random, cLK, n4) : null;
    }

    @Override
    public void method_dbe42dde_Dne(bvz bvz2, List list, Random random) {
        this.method_8b46d152_Dne((Tps)bvz2, list, random, 1, 0, true);
        this.method_62c58ab1_FWm((Tps)bvz2, list, random, 0, 1, true);
        this.method_d1a32fbf_bzF((Tps)bvz2, list, random, 0, 1, true);
    }

    public Dsg(int n, Random random, CLK cLK, int n2) {
        super(n);
        this.field_2d29f4_aFZ = n2;
        this.field_3656daa_Dne = cLK;
    }
}

