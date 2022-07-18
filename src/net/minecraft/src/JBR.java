package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class JBR
extends dEr {
    @Override
    public boolean method_4ddc487f_Dne(NMq nMq, FiG fiG, Qnq qnq, int n, int n2, int n3, int n4, float f, float f2, float f3) {
        if (n4 == 0) {
            return false;
        }
        if (!qnq.method_d9802b31_Dne(n, n2, n3).method_7a46289e_Dne()) {
            return false;
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
        if (!fiG.method_7bcedb59_Dne(n, n2, n3, n4, nMq)) {
            return false;
        }
        if (!zKP.field_2c863000_LVR.method_9cb39134_Dne(qnq, n, n2, n3)) {
            return false;
        }
        if (n4 == 1) {
            int n5 = geR.method_117d0718_FWm((double)((fiG.field_334489_mrb + 180.0f) * 16.0f / 360.0f) + 0.5) & 0xF;
            qnq.method_17d7ea9d_FWm(n, n2, n3, zKP.field_2c863000_LVR.field_21260d_FWm, n5, 2);
        } else {
            qnq.method_17d7ea9d_FWm(n, n2, n3, zKP.field_5accf96e_qMV.field_21260d_FWm, n4, 2);
        }
        --nMq.field_2092ae_Dne;
        AjG ajG = (AjG)qnq.method_d98e681d_Dne(n, n2, n3);
        if (ajG != null) {
            fiG.method_ac4d69ca_Dne(ajG);
        }
        return true;
    }

    public JBR(int n) {
        super(n);
        this.field_2d29f4_aFZ = 16;
        this.method_829e7ad2_Dne(JcN.field_2022bed6_FWm);
    }
}

