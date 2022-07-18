package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class mUU {
    public int field_2092ae_Dne = 0;
    public laH[] field_836eacb4_Dne;
    private boolean field_2092bf_Dne = false;

    public void method_7a46289a_Dne() {
        laH[] laHArray = new laH[this.field_836eacb4_Dne.length];
        for (int i = 0; i < this.field_836eacb4_Dne.length; ++i) {
            laHArray[i] = this.field_836eacb4_Dne[this.field_836eacb4_Dne.length - i - 1];
        }
        this.field_836eacb4_Dne = laHArray;
    }

    public mUU(laH[] laHArray) {
        this.field_836eacb4_Dne = laHArray;
        this.field_2092ae_Dne = laHArray.length;
    }

    public void method_d5c19081_Dne(WAR wAR, float f) {
        chN chN2 = this.field_836eacb4_Dne[1].field_3746303_Dne.method_4320bc86_Dne(this.field_836eacb4_Dne[0].field_3746303_Dne);
        chN chN3 = this.field_836eacb4_Dne[1].field_3746303_Dne.method_4320bc86_Dne(this.field_836eacb4_Dne[2].field_3746303_Dne);
        chN chN4 = chN3.method_2002a7c7_FWm(chN2).method_230df162_Dne();
        wAR.method_7a46289a_Dne();
        if (this.field_2092bf_Dne) {
            wAR.method_a680f8e7_FWm(-((float)chN4.field_2092a9_Dne), -((float)chN4.field_212608_FWm), -((float)chN4.field_2e5f16_bzF));
        } else {
            wAR.method_a680f8e7_FWm((float)chN4.field_2092a9_Dne, (float)chN4.field_212608_FWm, (float)chN4.field_2e5f16_bzF);
        }
        for (int i = 0; i < 4; ++i) {
            laH laH2 = this.field_836eacb4_Dne[i];
            wAR.method_c38c5864_Dne((float)laH2.field_3746303_Dne.field_2092a9_Dne * f, (float)laH2.field_3746303_Dne.field_212608_FWm * f, (float)laH2.field_3746303_Dne.field_2e5f16_bzF * f, laH2.field_2092ab_Dne, laH2.field_21260a_FWm);
        }
        wAR.method_7a46288d_Dne();
    }

    public mUU(laH[] laHArray, int n, int n2, int n3, int n4, float f, float f2) {
        this(laHArray);
        float f3 = 0.0f / f;
        float f4 = 0.0f / f2;
        laHArray[0] = laHArray[0].method_b9fe6738_Dne((float)n3 / f - f3, (float)n2 / f2 + f4);
        laHArray[1] = laHArray[1].method_b9fe6738_Dne((float)n / f + f3, (float)n2 / f2 + f4);
        laHArray[2] = laHArray[2].method_b9fe6738_Dne((float)n / f + f3, (float)n4 / f2 - f4);
        laHArray[3] = laHArray[3].method_b9fe6738_Dne((float)n3 / f - f3, (float)n4 / f2 - f4);
    }
}

