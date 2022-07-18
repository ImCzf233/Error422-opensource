package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class UBI
extends ram {
    private int field_2092ae_Dne = -1;

    @Override
    public boolean method_f28ef3a4_Dne(Qnq qnq, Random random, CLK cLK) {
        if (this.field_2092ae_Dne < 0) {
            this.field_2092ae_Dne = this.method_d2c2fe3f_Dne(qnq, cLK);
            if (this.field_2092ae_Dne < 0) {
                return true;
            }
            this.field_3656daa_Dne.method_2c2cf7c9_Dne(0, this.field_2092ae_Dne - this.field_3656daa_Dne.field_2d29f4_aFZ + 4 - 1, 0);
        }
        this.method_3d7d4888_Dne(qnq, cLK, 0, 0, 0, 2, 3, 1, 0, 0, false);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_ce2a1dc8_sly.field_21260d_FWm, 0, 1, 0, 0, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_ce2a1dc8_sly.field_21260d_FWm, 0, 1, 1, 0, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_ce2a1dc8_sly.field_21260d_FWm, 0, 1, 2, 0, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_9f40014e_RPx.field_21260d_FWm, 15, 1, 3, 0, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_954cd4c3_Wwe.field_21260d_FWm, 0, 0, 3, 0, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_954cd4c3_Wwe.field_21260d_FWm, 0, 1, 3, 1, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_954cd4c3_Wwe.field_21260d_FWm, 0, 2, 3, 0, cLK);
        this.method_b5ae8f6f_Dne(qnq, zKP.field_954cd4c3_Wwe.field_21260d_FWm, 0, 1, 3, -1, cLK);
        return true;
    }

    public UBI(opc opc2, int n, Random random, CLK cLK, int n2) {
        super(opc2, n);
        this.field_2d29f4_aFZ = n2;
        this.field_3656daa_Dne = cLK;
    }

    public static CLK method_d8458291_Dne(opc opc2, List list, Random random, int n, int n2, int n3, int n4) {
        CLK cLK = CLK.method_286c569_Dne(n, n2, n3, 0, 0, 0, 3, 4, 2, n4);
        return bvz.method_9e83199f_Dne(list, cLK) != null ? null : cLK;
    }
}

