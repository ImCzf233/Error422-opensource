package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class yCs
extends dEr {
    @Override
    public boolean method_4ddc487f_Dne(NMq nMq, FiG fiG, Qnq qnq, int n, int n2, int n3, int n4, float f, float f2, float f3) {
        if (qnq.method_2c2cf7bc_Dne(n, n2, n3) != zKP.field_23a1e80a_EwP.field_21260d_FWm) {
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
            if (!qnq.method_2c2cf7cd_Dne(n, n2, n3)) {
                return false;
            }
        }
        if (!fiG.method_7bcedb59_Dne(n, n2, n3, n4, nMq)) {
            return false;
        }
        if (zKP.field_36e009c_Dne.method_9cb39134_Dne(qnq, n, n2, n3)) {
            --nMq.field_2092ae_Dne;
            qnq.method_2ee8c47d_FWm(n, n2, n3, zKP.field_36e009c_Dne.field_21260d_FWm);
        }
        return true;
    }

    public yCs(int n) {
        super(n);
        this.method_829e7ad2_Dne(JcN.field_75b0c0e4_bzF);
    }
}

