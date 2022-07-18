package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class vGU
extends YAD {
    private int field_2092ae_Dne;

    public vGU() {
        super(new WuW(), 0.5f);
        this.field_2092ae_Dne = ((WuW)this.field_367c742_Dne).method_7a46288d_Dne();
    }

    @Override
    public void method_2cdda2d0_Dne(FUH fUH, double d, double d2, double d3, float f, float f2) {
        this.method_7c437362_Dne((hlo)fUH, d, d2, d3, f, f2);
    }

    @Override
    public void method_31745cde_Dne(sMa sMa2, double d, double d2, double d3, float f, float f2) {
        this.method_7c437362_Dne((hlo)sMa2, d, d2, d3, f, f2);
    }

    public void method_7c437362_Dne(hlo hlo2, double d, double d2, double d3, float f, float f2) {
        int n = ((WuW)this.field_367c742_Dne).method_7a46288d_Dne();
        if (n != this.field_2092ae_Dne) {
            this.field_2092ae_Dne = n;
            this.field_367c742_Dne = new WuW();
        }
        super.method_2cdda2d0_Dne(hlo2, d, d2, d3, f, f2);
    }
}

