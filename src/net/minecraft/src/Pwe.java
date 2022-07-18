package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class Pwe
extends iDn {
    private int field_2092ae_Dne;

    @Override
    public boolean method_f28ef3a4_Dne(Qnq qnq, Random random, CLK cLK) {
        int n;
        int n2;
        int n3;
        Random random2 = new Random(this.field_2092ae_Dne);
        for (n3 = 0; n3 <= 4; ++n3) {
            for (n2 = 3; n2 <= 4; ++n2) {
                n = random2.nextInt(8);
                this.method_3d7d4888_Dne(qnq, cLK, n3, n2, 0, n3, n2, n, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
            }
        }
        n3 = random2.nextInt(8);
        this.method_3d7d4888_Dne(qnq, cLK, 0, 5, 0, 0, 5, n3, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        n3 = random2.nextInt(8);
        this.method_3d7d4888_Dne(qnq, cLK, 4, 5, 0, 4, 5, n3, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        for (n3 = 0; n3 <= 4; ++n3) {
            n2 = random2.nextInt(5);
            this.method_3d7d4888_Dne(qnq, cLK, n3, 2, 0, n3, 2, n2, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
        }
        for (n3 = 0; n3 <= 4; ++n3) {
            for (n2 = 0; n2 <= 1; ++n2) {
                n = random2.nextInt(3);
                this.method_3d7d4888_Dne(qnq, cLK, n3, n2, 0, n3, n2, n, zKP.field_38c5f505_iNH.field_21260d_FWm, zKP.field_38c5f505_iNH.field_21260d_FWm, false);
            }
        }
        return true;
    }

    public Pwe(int n, Random random, CLK cLK, int n2) {
        super(n);
        this.field_2d29f4_aFZ = n2;
        this.field_3656daa_Dne = cLK;
        this.field_2092ae_Dne = random.nextInt();
    }

    public static Pwe method_5847cabf_Dne(List list, Random random, int n, int n2, int n3, int n4, int n5) {
        CLK cLK = CLK.method_286c569_Dne(n, n2, n3, -1, -3, 0, 5, 10, 8, n4);
        return Pwe.method_697d22a9_Dne(cLK) && bvz.method_9e83199f_Dne(list, cLK) == null ? new Pwe(n5, random, cLK, n4) : null;
    }
}

