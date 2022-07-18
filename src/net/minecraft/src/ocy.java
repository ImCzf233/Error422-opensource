package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class ocy
extends dEr {
    private int field_21260d_FWm;
    private int field_2092ae_Dne;

    public ocy(int n, int n2, int n3) {
        super(n);
        this.field_2092ae_Dne = n2;
        this.field_21260d_FWm = n3;
        this.method_829e7ad2_Dne(JcN.field_1c2a8136_XHL);
    }

    @Override
    public boolean method_4ddc487f_Dne(NMq nMq, FiG fiG, Qnq qnq, int n, int n2, int n3, int n4, float f, float f2, float f3) {
        if (n4 != 1) {
            return false;
        }
        if (fiG.method_7bcedb59_Dne(n, n2, n3, n4, nMq) && fiG.method_7bcedb59_Dne(n, n2 + 1, n3, n4, nMq)) {
            int n5 = qnq.method_2c2cf7bc_Dne(n, n2, n3);
            qnq.method_2ee8c47d_FWm(n, n2 + 1, n3, this.field_2092ae_Dne);
            --nMq.field_2092ae_Dne;
            return true;
        }
        return false;
    }
}

