package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
class xnS
extends JDd {
    final Arc field_365167a_Dne;
    final NMq field_36a761a_Dne;

    @Override
    protected vaR method_a59025ec_Dne(Qnq qnq, loO loO2) {
        return new YgL(qnq, loO2.method_7a462888_Dne(), loO2.method_7c6f6027_FWm(), loO2.method_ae128db5_bzF(), this.field_36a761a_Dne.method_23040479_Dne());
    }

    xnS(Arc arc, NMq nMq) {
        this.field_365167a_Dne = arc;
        this.field_36a761a_Dne = nMq;
    }

    @Override
    protected float method_7a46288a_Dne() {
        return super.method_7a46288a_Dne() * 0.5f;
    }

    @Override
    protected float method_7c6f6029_FWm() {
        return super.method_7c6f6029_FWm() * 1.25f;
    }
}

