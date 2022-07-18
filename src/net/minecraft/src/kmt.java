package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
class kmt
extends LSv {
    final ZyA field_37089ea_Dne;

    @Override
    protected boolean method_ce7f5dad_Dne(int n) {
        return false;
    }

    @Override
    protected void method_7a46289a_Dne() {
        this.field_37089ea_Dne.method_a98a0660_aFZ();
    }

    @Override
    protected void method_8a73475f_Dne(int n, int n2, int n3, int n4, WAR wAR) {
        RLC rLC = (RLC)trP.field_6a0474ed_FWm.get(n);
        this.field_37089ea_Dne.method_67d6d54c_FWm(ZyA.method_3eac8d9b_Dne(this.field_37089ea_Dne), KGL.method_39193c_Dne(rLC.method_d1f1ed87_FWm()), n2 + 2, n3 + 1, n % 2 == 0 ? 0xFFFFFF : 0x909090);
        String string = rLC.method_2c0e7e17_Dne(ZyA.method_3e9ab6eb_Dne(this.field_37089ea_Dne).method_831230f1_Dne(rLC));
        this.field_37089ea_Dne.method_67d6d54c_FWm(ZyA.method_1b8e78dc_FWm(this.field_37089ea_Dne), string, n2 + 2 + 213 - ZyA.method_7aeaab0e_bzF(this.field_37089ea_Dne).method_8f501fd7_Dne(string), n3 + 1, n % 2 == 0 ? 0xFFFFFF : 0x909090);
    }

    @Override
    protected int method_7a46288d_Dne() {
        return trP.field_6a0474ed_FWm.size();
    }

    @Override
    protected void method_16d0a4b_Dne(int n, boolean bl) {
    }

    @Override
    protected int method_ae128dba_bzF() {
        return this.method_7a46288d_Dne() * 10;
    }

    public kmt(ZyA zyA) {
        super(ZyA.method_52dbe183_Dne(zyA), zyA.field_21260d_FWm, zyA.field_2e5f1b_bzF, 32, zyA.field_2e5f1b_bzF - 64, 10);
        this.field_37089ea_Dne = zyA;
        this.method_ce7f9d7a_Dne(false);
    }
}

