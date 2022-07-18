package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class fKu
extends Twy {
    private int field_21260d_FWm;
    private NMq field_36a761a_Dne = null;
    private int field_2092ae_Dne;

    public static void method_ead777d3_Dne(Random random, fKu[] fKuArray, MqS mqS, int n) {
        for (int i = 0; i < n; ++i) {
            fKu fKu2 = (fKu)nGp.method_e347da17_Dne(random, fKuArray);
            int n2 = fKu2.field_2092ae_Dne + random.nextInt(fKu2.field_21260d_FWm - fKu2.field_2092ae_Dne + 1);
            if (fKu2.field_36a761a_Dne.method_7c6f602c_FWm() >= n2) {
                NMq nMq = fKu2.field_36a761a_Dne.method_23040479_Dne();
                nMq.field_2092ae_Dne = n2;
                mqS.method_6e3a6b66_Dne(random.nextInt(mqS.method_907a9d14_Qnq()), nMq);
                continue;
            }
            for (int j = 0; j < n2; ++j) {
                NMq nMq = fKu2.field_36a761a_Dne.method_23040479_Dne();
                nMq.field_2092ae_Dne = 1;
                mqS.method_6e3a6b66_Dne(random.nextInt(mqS.method_907a9d14_Qnq()), nMq);
            }
        }
    }

    public fKu(int n, int n2, int n3, int n4, int n5) {
        super(n5);
        this.field_36a761a_Dne = new NMq(n, 1, n2);
        this.field_2092ae_Dne = n3;
        this.field_21260d_FWm = n4;
    }

    public fKu(NMq nMq, int n, int n2, int n3) {
        super(n3);
        this.field_36a761a_Dne = nMq;
        this.field_2092ae_Dne = n;
        this.field_21260d_FWm = n2;
    }

    public static fKu[] method_3e9b7320_Dne(fKu[] fKuArray, fKu ... fKuArray2) {
        fKu[] fKuArray3 = new fKu[fKuArray.length + fKuArray2.length];
        int n = 0;
        for (int i = 0; i < fKuArray.length; ++i) {
            fKuArray3[n++] = fKuArray[i];
        }
        fKu[] fKuArray4 = fKuArray2;
        int n2 = fKuArray2.length;
        for (int i = 0; i < n2; ++i) {
            fKu fKu2 = fKuArray4[i];
            fKuArray3[n++] = fKu2;
        }
        return fKuArray3;
    }

    public static void method_624fb7f8_Dne(Random random, fKu[] fKuArray, UTs uTs, int n) {
        for (int i = 0; i < n; ++i) {
            fKu fKu2 = (fKu)nGp.method_e347da17_Dne(random, fKuArray);
            int n2 = fKu2.field_2092ae_Dne + random.nextInt(fKu2.field_21260d_FWm - fKu2.field_2092ae_Dne + 1);
            if (fKu2.field_36a761a_Dne.method_7c6f602c_FWm() >= n2) {
                NMq nMq = fKu2.field_36a761a_Dne.method_23040479_Dne();
                nMq.field_2092ae_Dne = n2;
                uTs.method_6e3a6b66_Dne(random.nextInt(uTs.method_907a9d14_Qnq()), nMq);
                continue;
            }
            for (int j = 0; j < n2; ++j) {
                NMq nMq = fKu2.field_36a761a_Dne.method_23040479_Dne();
                nMq.field_2092ae_Dne = 1;
                uTs.method_6e3a6b66_Dne(random.nextInt(uTs.method_907a9d14_Qnq()), nMq);
            }
        }
    }
}

