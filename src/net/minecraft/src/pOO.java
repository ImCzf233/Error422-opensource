package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class pOO
implements gDn {
    private final boolean field_21261e_FWm;
    private final gDn field_375b13b_Dne;
    private final boolean field_2092bf_Dne;

    @Override
    public float method_ce7f4ad4_Dne(double d) {
        float f = this.method_7c6f6029_FWm() - this.method_7a46288a_Dne();
        return this.method_7a46288a_Dne() + f * ((float)d / 16.0f);
    }

    @Override
    public int method_ae128dba_bzF() {
        return this.field_375b13b_Dne.method_ae128dba_bzF();
    }

    @Override
    public int method_7c6f602c_FWm() {
        return this.field_375b13b_Dne.method_7c6f602c_FWm();
    }

    @Override
    public float method_7a46288a_Dne() {
        return this.field_2092bf_Dne ? this.field_375b13b_Dne.method_7c6f6029_FWm() : this.field_375b13b_Dne.method_7a46288a_Dne();
    }

    @Override
    public float method_7c6f6029_FWm() {
        return this.field_2092bf_Dne ? this.field_375b13b_Dne.method_7a46288a_Dne() : this.field_375b13b_Dne.method_7c6f6029_FWm();
    }

    @Override
    public float method_ae128db7_bzF() {
        return this.field_21261e_FWm ? this.field_375b13b_Dne.method_ae128db7_bzF() : this.field_375b13b_Dne.method_ae128db7_bzF();
    }

    @Override
    public float method_907a9d11_Qnq() {
        return this.field_21261e_FWm ? this.field_375b13b_Dne.method_ae128db7_bzF() : this.field_375b13b_Dne.method_907a9d11_Qnq();
    }

    @Override
    public String method_eecad346_Dne() {
        return this.field_375b13b_Dne.method_eecad346_Dne();
    }

    @Override
    public int method_7a46288d_Dne() {
        return this.field_375b13b_Dne.method_7a46288d_Dne();
    }

    @Override
    public int method_907a9d14_Qnq() {
        return this.field_375b13b_Dne.method_907a9d14_Qnq();
    }

    public pOO(gDn gDn2, boolean bl, boolean bl2) {
        this.field_375b13b_Dne = gDn2;
        this.field_2092bf_Dne = bl;
        this.field_21261e_FWm = bl2;
    }

    @Override
    public float method_117d0715_FWm(double d) {
        float f = this.method_907a9d11_Qnq() - this.method_ae128db7_bzF();
        return this.method_ae128db7_bzF() + f * ((float)d / 16.0f);
    }
}

