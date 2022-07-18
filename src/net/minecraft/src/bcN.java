package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class bcN
extends lQC {
    public bcN(int n, zKP zKP2) {
        super(n, zKP2);
    }

    @Override
    public boolean method_4ddc487f_Dne(NMq nMq, FiG fiG, Qnq qnq, int n, int n2, int n3, int n4, float f, float f2, float f3) {
        if (nMq.field_2092ae_Dne == 0) {
            return false;
        }
        if (!fiG.method_7bcedb59_Dne(n, n2, n3, n4, nMq)) {
            return false;
        }
        int n5 = qnq.method_2c2cf7bc_Dne(n, n2, n3);
        if (n5 == zKP.field_23a1e80a_EwP.field_21260d_FWm) {
            zKP zKP2 = zKP.field_8374b848_Dne[this.method_7c6f602c_FWm()];
            int n6 = qnq.method_2dee76f_bzF(n, n2, n3);
            int n7 = n6 & 7;
            if (n7 <= 6 && qnq.method_9ed6d42c_Dne(zKP2.method_8c85fe2_Dne(qnq, n, n2, n3)) && qnq.method_d4dc89ed_Dne(n, n2, n3, n7 + 1 | n6 & 0xFFFFFFF8, 2)) {
                qnq.method_c961c6ee_Dne((float)n + 0.5f, (float)n2 + 0.5f, (float)n3 + 0.5f, zKP2.field_a21c1bc0_kGO.method_d1f1ed87_FWm(), (zKP2.field_a21c1bc0_kGO.method_7a46288a_Dne() + 1.0f) / 2.0f, zKP2.field_a21c1bc0_kGO.method_7c6f6029_FWm() * 0.8f);
                --nMq.field_2092ae_Dne;
                return true;
            }
        }
        return super.method_4ddc487f_Dne(nMq, fiG, qnq, n, n2, n3, n4, f, f2, f3);
    }
}

