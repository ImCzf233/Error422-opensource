package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
class QGu
extends onZ {
    final eSp field_375010a_Dne;

    public QGu(eSp eSp2, MqS mqS, int n, int n2, int n3) {
        super(mqS, n, n2, n3);
        this.field_375010a_Dne = eSp2;
    }

    @Override
    public boolean method_7c61cf19_Dne(NMq nMq) {
        return nMq == null ? false : nMq.field_2e5f1b_bzF == dEr.field_86ecf659_Kvh.field_267cf5_Qnq || nMq.field_2e5f1b_bzF == dEr.field_141d2e85_div.field_267cf5_Qnq || nMq.field_2e5f1b_bzF == dEr.field_74feeb39_mrb.field_267cf5_Qnq || nMq.field_2e5f1b_bzF == dEr.field_5c4c1af_IjH.field_267cf5_Qnq;
    }

    @Override
    public int method_7a46288d_Dne() {
        return erC.field_2092ae_Dne;
    }
}

