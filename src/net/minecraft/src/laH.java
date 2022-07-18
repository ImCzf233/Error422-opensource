package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class laH {
    public float field_21260a_FWm;
    public chN field_3746303_Dne;
    public float field_2092ab_Dne;

    public laH(chN chN2, float f, float f2) {
        this.field_3746303_Dne = chN2;
        this.field_2092ab_Dne = f;
        this.field_21260a_FWm = f2;
    }

    public laH method_b9fe6738_Dne(float f, float f2) {
        return new laH(this, f, f2);
    }

    public laH(float f, float f2, float f3, float f4, float f5) {
        this(chN.method_e4505d6c_Dne(f, f2, f3), f4, f5);
    }

    public laH(laH laH2, float f, float f2) {
        this.field_3746303_Dne = laH2.field_3746303_Dne;
        this.field_2092ab_Dne = f;
        this.field_21260a_FWm = f2;
    }
}

