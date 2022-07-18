package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class ZVw
extends oeq {
    private final int field_2092ae_Dne;

    public static CLK method_b560cbe6_Dne(List list, Random random, int n, int n2, int n3, int n4) {
        CLK cLK = CLK.method_286c569_Dne(n, n2, n3, -1, -1, 0, 5, 5, 4, n4);
        bvz bvz2 = bvz.method_9e83199f_Dne(list, cLK);
        if (bvz2 == null) {
            return null;
        }
        if (bvz2.method_22fefc09_Dne().field_21260d_FWm == cLK.field_21260d_FWm) {
            for (int i = 3; i >= 1; --i) {
                cLK = CLK.method_286c569_Dne(n, n2, n3, -1, -1, 0, 5, 5, i - 1, n4);
                if (bvz2.method_22fefc09_Dne().method_697d22a9_Dne(cLK)) continue;
                return CLK.method_286c569_Dne(n, n2, n3, -1, -1, 0, 5, 5, i, n4);
            }
        }
        return null;
    }

    public ZVw(int n, Random random, CLK cLK, int n2) {
        super(n);
        this.field_2d29f4_aFZ = n2;
        this.field_3656daa_Dne = cLK;
        this.field_2092ae_Dne = n2 != 2 && n2 != 0 ? cLK.method_7a46288d_Dne() : cLK.method_ae128dba_bzF();
    }

    @Override
    public boolean method_f28ef3a4_Dne(Qnq qnq, Random random, CLK cLK) {
        if (this.method_d2c2fe50_Dne(qnq, cLK)) {
            return false;
        }
        for (int i = 0; i < this.field_2092ae_Dne; ++i) {
            this.method_b5ae8f6f_Dne(qnq, zKP.field_39272339_WvN.field_21260d_FWm, 0, 0, 0, i, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_39272339_WvN.field_21260d_FWm, 0, 1, 0, i, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_39272339_WvN.field_21260d_FWm, 0, 2, 0, i, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_39272339_WvN.field_21260d_FWm, 0, 3, 0, i, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_39272339_WvN.field_21260d_FWm, 0, 4, 0, i, cLK);
            for (int j = 1; j <= 3; ++j) {
                this.method_b5ae8f6f_Dne(qnq, zKP.field_39272339_WvN.field_21260d_FWm, 0, 0, j, i, cLK);
                this.method_b5ae8f6f_Dne(qnq, 0, 0, 1, j, i, cLK);
                this.method_b5ae8f6f_Dne(qnq, 0, 0, 2, j, i, cLK);
                this.method_b5ae8f6f_Dne(qnq, 0, 0, 3, j, i, cLK);
                this.method_b5ae8f6f_Dne(qnq, zKP.field_39272339_WvN.field_21260d_FWm, 0, 4, j, i, cLK);
            }
            this.method_b5ae8f6f_Dne(qnq, zKP.field_39272339_WvN.field_21260d_FWm, 0, 0, 4, i, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_39272339_WvN.field_21260d_FWm, 0, 1, 4, i, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_39272339_WvN.field_21260d_FWm, 0, 2, 4, i, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_39272339_WvN.field_21260d_FWm, 0, 3, 4, i, cLK);
            this.method_b5ae8f6f_Dne(qnq, zKP.field_39272339_WvN.field_21260d_FWm, 0, 4, 4, i, cLK);
        }
        return true;
    }
}

