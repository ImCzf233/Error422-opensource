package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class onZ {
    public final MqS field_36a853d_Dne;
    public int field_2d29f4_aFZ;
    private final int field_2092ae_Dne;
    public int field_388da6_zGp;
    public int field_267cf5_Qnq;

    public void method_7c61cf15_Dne(NMq nMq) {
        this.field_36a853d_Dne.method_6e3a6b66_Dne(this.field_2092ae_Dne, nMq);
        this.method_7a46289a_Dne();
    }

    public NMq method_9e6e1a08_Dne(int n) {
        return this.field_36a853d_Dne.method_9046b659_Dne(this.field_2092ae_Dne, n);
    }

    public boolean method_16ba008f_Dne(MqS mqS, int n) {
        return mqS == this.field_36a853d_Dne && n == this.field_2092ae_Dne;
    }

    public int method_7a46288d_Dne() {
        return this.field_36a853d_Dne.method_a98a0653_aFZ();
    }

    public void method_a981fd7a_Dne(NMq nMq, NMq nMq2) {
        int n;
        if (nMq != null && nMq2 != null && nMq.field_2e5f1b_bzF == nMq2.field_2e5f1b_bzF && (n = nMq2.field_2092ae_Dne - nMq.field_2092ae_Dne) > 0) {
            this.method_fd8868e_Dne(nMq, n);
        }
    }

    protected void method_55b582d6_FWm(NMq nMq) {
    }

    public boolean method_7c61cf19_Dne(NMq nMq) {
        return true;
    }

    public gDn method_230f3f9a_Dne() {
        return null;
    }

    public NMq method_23040479_Dne() {
        return this.field_36a853d_Dne.method_9e6e1a08_Dne(this.field_2092ae_Dne);
    }

    public void method_672a90ac_Dne(FiG fiG, NMq nMq) {
        this.method_7a46289a_Dne();
    }

    public onZ(MqS mqS, int n, int n2, int n3) {
        this.field_36a853d_Dne = mqS;
        this.field_2092ae_Dne = n;
        this.field_2d29f4_aFZ = n2;
        this.field_388da6_zGp = n3;
    }

    public boolean method_703284a7_Dne(FiG fiG) {
        return true;
    }

    public void method_7a46289a_Dne() {
        this.field_36a853d_Dne.method_582b297_a_();
    }

    protected void method_fd8868e_Dne(NMq nMq, int n) {
    }

    public boolean method_7a46289e_Dne() {
        return this.method_23040479_Dne() != null;
    }
}

