package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class isA
implements MqS {
    private MqS field_36a853d_Dne;
    private String field_569fcf45_Dne;
    private MqS field_2024511c_FWm;

    @Override
    public int method_a98a0653_aFZ() {
        return this.field_36a853d_Dne.method_a98a0653_aFZ();
    }

    @Override
    public void method_582b297_a_() {
        this.field_36a853d_Dne.method_582b297_a_();
        this.field_2024511c_FWm.method_582b297_a_();
    }

    @Override
    public boolean method_6e3a6b6a_Dne(int n, NMq nMq) {
        return true;
    }

    public boolean method_7c9aa17c_Dne(MqS mqS) {
        return this.field_36a853d_Dne == mqS || this.field_2024511c_FWm == mqS;
    }

    @Override
    public String method_9fc39d88_b_() {
        return this.field_36a853d_Dne.method_5acf91e_d_() ? this.field_36a853d_Dne.method_9fc39d88_b_() : (this.field_2024511c_FWm.method_5acf91e_d_() ? this.field_2024511c_FWm.method_9fc39d88_b_() : this.field_569fcf45_Dne);
    }

    @Override
    public NMq method_9046b659_Dne(int n, int n2) {
        return n >= this.field_36a853d_Dne.method_907a9d14_Qnq() ? this.field_2024511c_FWm.method_9046b659_Dne(n - this.field_36a853d_Dne.method_907a9d14_Qnq(), n2) : this.field_36a853d_Dne.method_9046b659_Dne(n, n2);
    }

    @Override
    public NMq method_9e6e1a08_Dne(int n) {
        return n >= this.field_36a853d_Dne.method_907a9d14_Qnq() ? this.field_2024511c_FWm.method_9e6e1a08_Dne(n - this.field_36a853d_Dne.method_907a9d14_Qnq()) : this.field_36a853d_Dne.method_9e6e1a08_Dne(n);
    }

    @Override
    public boolean method_703284a7_Dne(FiG fiG) {
        return this.field_36a853d_Dne.method_703284a7_Dne(fiG) && this.field_2024511c_FWm.method_703284a7_Dne(fiG);
    }

    @Override
    public void method_6e3a6b66_Dne(int n, NMq nMq) {
        if (n >= this.field_36a853d_Dne.method_907a9d14_Qnq()) {
            this.field_2024511c_FWm.method_6e3a6b66_Dne(n - this.field_36a853d_Dne.method_907a9d14_Qnq(), nMq);
        } else {
            this.field_36a853d_Dne.method_6e3a6b66_Dne(n, nMq);
        }
    }

    @Override
    public boolean method_5acf91e_d_() {
        return this.field_36a853d_Dne.method_5acf91e_d_() || this.field_2024511c_FWm.method_5acf91e_d_();
    }

    @Override
    public void method_ae128dc7_bzF() {
        this.field_36a853d_Dne.method_ae128dc7_bzF();
        this.field_2024511c_FWm.method_ae128dc7_bzF();
    }

    @Override
    public void method_5f36e9f_i_() {
        this.field_36a853d_Dne.method_5f36e9f_i_();
        this.field_2024511c_FWm.method_5f36e9f_i_();
    }

    public isA(String string, MqS mqS, MqS mqS2) {
        this.field_569fcf45_Dne = string;
        if (mqS == null) {
            mqS = mqS2;
        }
        if (mqS2 == null) {
            mqS2 = mqS;
        }
        this.field_36a853d_Dne = mqS;
        this.field_2024511c_FWm = mqS2;
    }

    @Override
    public NMq method_77c1cdc9_FWm(int n) {
        return n >= this.field_36a853d_Dne.method_907a9d14_Qnq() ? this.field_2024511c_FWm.method_77c1cdc9_FWm(n - this.field_36a853d_Dne.method_907a9d14_Qnq()) : this.field_36a853d_Dne.method_77c1cdc9_FWm(n);
    }

    @Override
    public int method_907a9d14_Qnq() {
        return this.field_36a853d_Dne.method_907a9d14_Qnq() + this.field_2024511c_FWm.method_907a9d14_Qnq();
    }
}

