package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class BXR
implements IPx {
    private double field_212608_FWm;
    private double field_2e5f16_bzF;
    private DOP field_365ede7_Dne = hAW.method_22ff7c46_Dne();
    private double field_2092a9_Dne;

    public boolean method_adff145e_Dne(double d, double d2, double d3, double d4, double d5, double d6) {
        return this.field_365ede7_Dne.method_adff145e_Dne(d - this.field_2092a9_Dne, d2 - this.field_212608_FWm, d3 - this.field_2e5f16_bzF, d4 - this.field_2092a9_Dne, d5 - this.field_212608_FWm, d6 - this.field_2e5f16_bzF);
    }

    @Override
    public void method_2be429a4_Dne(double d, double d2, double d3) {
        this.field_2092a9_Dne = d;
        this.field_212608_FWm = d2;
        this.field_2e5f16_bzF = d3;
    }

    @Override
    public boolean method_9ed6d42c_Dne(bSp bSp2) {
        return this.method_adff145e_Dne(bSp2.field_2092a9_Dne, bSp2.field_212608_FWm, bSp2.field_2e5f16_bzF, bSp2.field_267cf0_Qnq, bSp2.field_2d29ef_aFZ, bSp2.field_388da1_zGp);
    }
}

