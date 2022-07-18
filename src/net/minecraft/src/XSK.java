package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class XSK
implements cwq_0 {
    private final Qnq field_36c4f18_Dne;
    private final int field_2e5f1b_bzF;
    private final int field_21260d_FWm;
    private final int field_2092ae_Dne;

    @Override
    public Qnq method_2305dd77_Dne() {
        return this.field_36c4f18_Dne;
    }

    @Override
    public int method_7a46288d_Dne() {
        return this.field_2092ae_Dne;
    }

    public XSK(Qnq qnq, int n, int n2, int n3) {
        this.field_36c4f18_Dne = qnq;
        this.field_2092ae_Dne = n;
        this.field_21260d_FWm = n2;
        this.field_2e5f1b_bzF = n3;
    }

    @Override
    public int method_907a9d14_Qnq() {
        return this.field_36c4f18_Dne.method_2dee76f_bzF(this.field_2092ae_Dne, this.field_21260d_FWm, this.field_2e5f1b_bzF);
    }

    @Override
    public int method_7c6f602c_FWm() {
        return this.field_21260d_FWm;
    }

    @Override
    public double method_7c6f6027_FWm() {
        return (double)this.field_21260d_FWm + 0.5;
    }

    @Override
    public ipD method_2310c86e_Dne() {
        return this.field_36c4f18_Dne.method_d98e681d_Dne(this.field_2092ae_Dne, this.field_21260d_FWm, this.field_2e5f1b_bzF);
    }

    @Override
    public double method_7a462888_Dne() {
        return (double)this.field_2092ae_Dne + 0.5;
    }

    @Override
    public int method_ae128dba_bzF() {
        return this.field_2e5f1b_bzF;
    }

    @Override
    public double method_ae128db5_bzF() {
        return (double)this.field_2e5f1b_bzF + 0.5;
    }
}

