package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
class TFV
extends onZ {
    final ReE field_36c9c5a_Dne;
    final int field_2092ae_Dne;

    TFV(ReE reE, MqS mqS, int n, int n2, int n3, int n4) {
        super(mqS, n, n2, n3);
        this.field_36c9c5a_Dne = reE;
        this.field_2092ae_Dne = n4;
    }

    @Override
    public boolean method_7c61cf19_Dne(NMq nMq) {
        return nMq == null ? false : (nMq.method_230de6ba_Dne() instanceof qoi_0 ? ((qoi_0)nMq.method_230de6ba_Dne()).field_2092ae_Dne == this.field_2092ae_Dne : (nMq.method_230de6ba_Dne().field_267cf5_Qnq != zKP.field_32158d62_aJO.field_21260d_FWm && nMq.method_230de6ba_Dne().field_267cf5_Qnq != dEr.field_e405241a_mfU.field_267cf5_Qnq ? false : this.field_2092ae_Dne == 0));
    }

    @Override
    public gDn method_230f3f9a_Dne() {
        return qoi_0.method_3064814c_a_(this.field_2092ae_Dne);
    }

    @Override
    public int method_7a46288d_Dne() {
        return erC.field_2092ae_Dne;
    }
}

