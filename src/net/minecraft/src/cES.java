package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
class cES
extends Vdw {
    private final int field_388da6_zGp;
    private final int field_20b857_DyG;
    final wiU field_37d7f09_Dne;

    public cES(wiU wiU2, int n, int n2, int n3, int n4, int n5) {
        super(n, n2, n3, "/gui/inventory.png", 0 + SXd.field_83633108_Dne[n4].method_7c6f602c_FWm() % 8 * 18, 198 + SXd.field_83633108_Dne[n4].method_7c6f602c_FWm() / 8 * 18);
        this.field_37d7f09_Dne = wiU2;
        this.field_388da6_zGp = n4;
        this.field_20b857_DyG = n5;
    }

    @Override
    public void method_1e269659_FWm(int n, int n2) {
        String string = KGL.method_39193c_Dne(SXd.field_83633108_Dne[this.field_388da6_zGp].method_eecad346_Dne());
        if (this.field_20b857_DyG >= 3 && this.field_388da6_zGp != SXd.field_1c2e71ec_XHL.field_2092ae_Dne) {
            string = string + " II";
        }
        this.field_37d7f09_Dne.method_fbd61744_Dne(string, n, n2);
    }
}

