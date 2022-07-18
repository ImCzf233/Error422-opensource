package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class XLo
extends Gor {
    public rxL field_20353c45_FWm;
    public rxL field_75c33e53_bzF;
    public rxL field_37b7066_Dne = new rxL(this, 0, 0).method_e17a7504_FWm(64, 64);

    public void method_7a46289a_Dne() {
        this.field_75c33e53_bzF.field_388da3_zGp = this.field_37b7066_Dne.field_388da3_zGp;
        this.field_37b7066_Dne.method_ce7f5266_Dne(0.0625f);
        this.field_75c33e53_bzF.method_ce7f5266_Dne(0.0625f);
        this.field_20353c45_FWm.method_ce7f5266_Dne(0.0625f);
    }

    public XLo() {
        this.field_37b7066_Dne.method_7ccc8363_Dne(0.0f, -5.0f, -14.0f, 14, 5, 14, 0.0f);
        this.field_37b7066_Dne.field_2e5f18_bzF = 1.0f;
        this.field_37b7066_Dne.field_267cf2_Qnq = 7.0f;
        this.field_37b7066_Dne.field_2d29f1_aFZ = 15.0f;
        this.field_75c33e53_bzF = new rxL(this, 0, 0).method_e17a7504_FWm(64, 64);
        this.field_75c33e53_bzF.method_7ccc8363_Dne(-1.0f, -2.0f, -15.0f, 2, 4, 1, 0.0f);
        this.field_75c33e53_bzF.field_2e5f18_bzF = 8.0f;
        this.field_75c33e53_bzF.field_267cf2_Qnq = 7.0f;
        this.field_75c33e53_bzF.field_2d29f1_aFZ = 15.0f;
        this.field_20353c45_FWm = new rxL(this, 0, 19).method_e17a7504_FWm(64, 64);
        this.field_20353c45_FWm.method_7ccc8363_Dne(0.0f, 0.0f, 0.0f, 14, 10, 14, 0.0f);
        this.field_20353c45_FWm.field_2e5f18_bzF = 1.0f;
        this.field_20353c45_FWm.field_267cf2_Qnq = 6.0f;
        this.field_20353c45_FWm.field_2d29f1_aFZ = 1.0f;
    }
}

