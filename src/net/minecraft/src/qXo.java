package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class qXo
extends OdI {
    public qXo(int n) {
        super(n);
        this.field_6a0474ed_FWm.clear();
        this.field_2092a7_Dne = (byte)zKP.field_5ced441_IjH.field_21260d_FWm;
        this.field_212606_FWm = (byte)zKP.field_5ced441_IjH.field_21260d_FWm;
        this.field_3674e49_Dne.field_267cf5_Qnq = -999;
        this.field_3674e49_Dne.field_20b857_DyG = 2;
        this.field_3674e49_Dne.field_22c602_IjH = 50;
        this.field_3674e49_Dne.field_33448c_mrb = 10;
    }

    @Override
    public void method_37de135f_Dne(Qnq qnq, Random random, int n, int n2) {
        super.method_37de135f_Dne(qnq, random, n, n2);
        if (random.nextInt(1000) == 0) {
            int n3 = n + random.nextInt(16) + 8;
            int n4 = n2 + random.nextInt(16) + 8;
            Lab lab = new Lab();
            lab.method_c3e4cb88_Dne(qnq, random, n3, qnq.method_1e26964c_FWm(n3, n4) + 1, n4);
        }
    }
}

