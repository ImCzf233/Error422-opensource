package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class CjL
extends dEr {
    private int field_2092ae_Dne;

    @Override
    public boolean method_4ddc487f_Dne(NMq nMq, FiG fiG, Qnq qnq, int n, int n2, int n3, int n4, float f, float f2, float f3) {
        zKP zKP2;
        int n5;
        int n6 = qnq.method_2c2cf7bc_Dne(n, n2, n3);
        if (n6 == zKP.field_23a1e80a_EwP.field_21260d_FWm && (qnq.method_2dee76f_bzF(n, n2, n3) & 7) < 1) {
            n4 = 1;
        } else if (n6 != zKP.field_728b3649_ipf.field_21260d_FWm && n6 != zKP.field_36dc147_Dne.field_21260d_FWm && n6 != zKP.field_373e079_Dne.field_21260d_FWm) {
            if (n4 == 0) {
                --n2;
            }
            if (n4 == 1) {
                ++n2;
            }
            if (n4 == 2) {
                --n3;
            }
            if (n4 == 3) {
                ++n3;
            }
            if (n4 == 4) {
                --n;
            }
            if (n4 == 5) {
                ++n;
            }
        }
        if (!fiG.method_7bcedb59_Dne(n, n2, n3, n4, nMq)) {
            return false;
        }
        if (nMq.field_2092ae_Dne == 0) {
            return false;
        }
        if (qnq.method_1889bc82_Dne(this.field_2092ae_Dne, n, n2, n3, false, n4, null, nMq) && qnq.method_17d7ea9d_FWm(n, n2, n3, this.field_2092ae_Dne, n5 = (zKP2 = zKP.field_8374b848_Dne[this.field_2092ae_Dne]).method_a13ce189_Dne(qnq, n, n2, n3, n4, f, f2, f3, 0), 3)) {
            if (qnq.method_2c2cf7bc_Dne(n, n2, n3) == this.field_2092ae_Dne) {
                zKP.field_8374b848_Dne[this.field_2092ae_Dne].method_ca7e4e57_Dne(qnq, n, n2, n3, fiG, nMq);
                zKP.field_8374b848_Dne[this.field_2092ae_Dne].method_9d5148cd_aFZ(qnq, n, n2, n3, n5);
            }
            qnq.method_c961c6ee_Dne((float)n + 0.5f, (float)n2 + 0.5f, (float)n3 + 0.5f, zKP2.field_a21c1bc0_kGO.method_d1f1ed87_FWm(), (zKP2.field_a21c1bc0_kGO.method_7a46288a_Dne() + 1.0f) / 2.0f, zKP2.field_a21c1bc0_kGO.method_7c6f6029_FWm() * 0.8f);
            --nMq.field_2092ae_Dne;
        }
        return true;
    }

    public CjL(int n, zKP zKP2) {
        super(n);
        this.field_2092ae_Dne = zKP2.field_21260d_FWm;
    }
}

