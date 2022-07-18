package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public enum TNy {
    field_36d350d_Dne(5, new int[]{1, 3, 2, 1}, 15),
    field_202700ec_FWm(15, new int[]{2, 5, 4, 1}, 12),
    field_75b502fa_bzF(15, new int[]{2, 6, 5, 2}, 9),
    field_5e56a3d4_Qnq(7, new int[]{2, 5, 3, 1}, 25),
    field_7130b953_aFZ(33, new int[]{3, 8, 6, 3}, 10);

    private int field_21260d_FWm;
    private int[] field_3f1c589_Dne;
    private int field_2092ae_Dne;

    public int method_7c6f602c_FWm() {
        return this == field_36d350d_Dne ? dEr.field_443297f2_LoG.field_267cf5_Qnq : (this == field_202700ec_FWm ? dEr.field_5c4c1af_IjH.field_267cf5_Qnq : (this == field_5e56a3d4_Qnq ? dEr.field_74feeb39_mrb.field_267cf5_Qnq : (this == field_75b502fa_bzF ? dEr.field_5c4c1af_IjH.field_267cf5_Qnq : (this == field_7130b953_aFZ ? dEr.field_141d2e85_div.field_267cf5_Qnq : 0))));
    }

    public int method_117d19dd_FWm(int n) {
        return this.field_3f1c589_Dne[n];
    }

    private TNy(int var3, int[] var4, int var5) {
        this.field_2092ae_Dne = var3;
        this.field_3f1c589_Dne = var4;
        this.field_21260d_FWm = var5;
    }

    public int method_7a46288d_Dne() {
        return this.field_21260d_FWm;
    }

    public int method_ce7f5d9c_Dne(int n) {
        return qoi_0.method_ce7eeb8a_Dne()[n] * this.field_2092ae_Dne;
    }
}

