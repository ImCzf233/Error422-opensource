package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
class Agm
extends LSv {
    final RKa field_36c3e24_Dne;

    public Agm(RKa rKa) {
        super(rKa.field_493682ed_Dne, rKa.field_21260d_FWm, rKa.field_2e5f1b_bzF, 80, rKa.field_2e5f1b_bzF - 40, rKa.field_3791671_Dne.field_2092ae_Dne + 1);
        this.field_36c3e24_Dne = rKa;
    }

    @Override
    protected void method_16d0a4b_Dne(int n, boolean bl) {
    }

    @Override
    protected boolean method_ce7f5dad_Dne(int n) {
        return false;
    }

    @Override
    protected int method_7c6f602c_FWm() {
        return this.field_36c3e24_Dne.field_21260d_FWm - 10;
    }

    @Override
    protected int method_7a46288d_Dne() {
        return RKa.method_51dd63c8_Dne(this.field_36c3e24_Dne).size();
    }

    @Override
    protected void method_8a73475f_Dne(int n, int n2, int n3, int n4, WAR wAR) {
        this.field_36c3e24_Dne.field_3791671_Dne.method_e88b55f3_FWm((String)RKa.method_51dd63c8_Dne(this.field_36c3e24_Dne).get(n), 10, n3, 0xFFFFFF);
        this.field_36c3e24_Dne.field_3791671_Dne.method_e88b55f3_FWm((String)RKa.method_554595e7_FWm(this.field_36c3e24_Dne).get(n), 230, n3, 0xFFFFFF);
    }

    @Override
    protected void method_7a46289a_Dne() {
    }
}

