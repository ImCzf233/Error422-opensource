package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class UgT {
    public final float field_388da3_zGp;
    public final float field_2e5f18_bzF;
    public final float field_2092ab_Dne;
    private mUU[] field_836ef59a_Dne;
    public final float field_2d29f1_aFZ;
    private laH[] field_836eacb4_Dne;
    public String field_569fcf45_Dne;
    public final float field_267cf2_Qnq;
    public final float field_21260a_FWm;

    public void method_d5c19081_Dne(WAR wAR, float f) {
        for (int i = 0; i < this.field_836ef59a_Dne.length; ++i) {
            this.field_836ef59a_Dne[i].method_d5c19081_Dne(wAR, f);
        }
    }

    public UgT(rxL rxL2, int n, int n2, float f, float f2, float f3, int n3, int n4, int n5, float f4) {
        this.field_2092ab_Dne = f;
        this.field_21260a_FWm = f2;
        this.field_2e5f18_bzF = f3;
        this.field_267cf2_Qnq = f + (float)n3;
        this.field_2d29f1_aFZ = f2 + (float)n4;
        this.field_388da3_zGp = f3 + (float)n5;
        this.field_836eacb4_Dne = new laH[8];
        this.field_836ef59a_Dne = new mUU[6];
        float f5 = f + (float)n3;
        float f6 = f2 + (float)n4;
        float f7 = f3 + (float)n5;
        f -= f4;
        f2 -= f4;
        f3 -= f4;
        f5 += f4;
        f6 += f4;
        f7 += f4;
        if (rxL2.field_2092bf_Dne) {
            float f8 = f5;
            f5 = f;
            f = f8;
        }
        laH laH2 = new laH(f, f2, f3, 0.0f, 0.0f);
        laH laH3 = new laH(f5, f2, f3, 0.0f, 8.0f);
        laH laH4 = new laH(f5, f6, f3, 8.0f, 8.0f);
        laH laH5 = new laH(f, f6, f3, 8.0f, 0.0f);
        laH laH6 = new laH(f, f2, f7, 0.0f, 0.0f);
        laH laH7 = new laH(f5, f2, f7, 0.0f, 8.0f);
        laH laH8 = new laH(f5, f6, f7, 8.0f, 8.0f);
        laH laH9 = new laH(f, f6, f7, 8.0f, 0.0f);
        this.field_836eacb4_Dne[0] = laH2;
        this.field_836eacb4_Dne[1] = laH3;
        this.field_836eacb4_Dne[2] = laH4;
        this.field_836eacb4_Dne[3] = laH5;
        this.field_836eacb4_Dne[4] = laH6;
        this.field_836eacb4_Dne[5] = laH7;
        this.field_836eacb4_Dne[6] = laH8;
        this.field_836eacb4_Dne[7] = laH9;
        this.field_836ef59a_Dne[0] = new mUU(new laH[]{laH7, laH3, laH4, laH8}, n + n5 + n3, n2 + n5, n + n5 + n3 + n5, n2 + n5 + n4, rxL2.field_2092ab_Dne, rxL2.field_21260a_FWm);
        this.field_836ef59a_Dne[1] = new mUU(new laH[]{laH2, laH6, laH9, laH5}, n, n2 + n5, n + n5, n2 + n5 + n4, rxL2.field_2092ab_Dne, rxL2.field_21260a_FWm);
        this.field_836ef59a_Dne[2] = new mUU(new laH[]{laH7, laH6, laH2, laH3}, n + n5, n2, n + n5 + n3, n2 + n5, rxL2.field_2092ab_Dne, rxL2.field_21260a_FWm);
        this.field_836ef59a_Dne[3] = new mUU(new laH[]{laH4, laH5, laH9, laH8}, n + n5 + n3, n2 + n5, n + n5 + n3 + n3, n2, rxL2.field_2092ab_Dne, rxL2.field_21260a_FWm);
        this.field_836ef59a_Dne[4] = new mUU(new laH[]{laH3, laH2, laH5, laH4}, n + n5, n2 + n5, n + n5 + n3, n2 + n5 + n4, rxL2.field_2092ab_Dne, rxL2.field_21260a_FWm);
        this.field_836ef59a_Dne[5] = new mUU(new laH[]{laH6, laH7, laH8, laH9}, n + n5 + n3 + n5, n2 + n5, n + n5 + n3 + n5 + n3, n2 + n5 + n4, rxL2.field_2092ab_Dne, rxL2.field_21260a_FWm);
        if (rxL2.field_2092bf_Dne) {
            for (int i = 0; i < this.field_836ef59a_Dne.length; ++i) {
                this.field_836ef59a_Dne[i].method_7a46289a_Dne();
            }
        }
    }

    public UgT method_2850d373_Dne(String string) {
        this.field_569fcf45_Dne = string;
        return this;
    }
}

