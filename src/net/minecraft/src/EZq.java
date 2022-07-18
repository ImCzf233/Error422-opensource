package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class EZq
extends dEr {
    protected CNI field_36574ee_Dne;

    @Override
    public boolean method_7c6f603d_FWm() {
        return true;
    }

    @Override
    public boolean method_4ddc487f_Dne(NMq nMq, FiG fiG, Qnq qnq, int n, int n2, int n3, int n4, float f, float f2, float f3) {
        if (!fiG.method_7bcedb59_Dne(n, n2, n3, n4, nMq)) {
            return false;
        }
        int n5 = qnq.method_2c2cf7bc_Dne(n, n2, n3);
        int n6 = qnq.method_2c2cf7bc_Dne(n, n2 + 1, n3);
        if ((n4 == 0 || n6 != 0 || n5 != zKP.field_36ff555_Dne.field_21260d_FWm) && n5 != zKP.field_203836cc_FWm.field_21260d_FWm) {
            return false;
        }
        zKP zKP2 = zKP.field_778fd823_rPc;
        qnq.method_c961c6ee_Dne((float)n + 0.5f, (float)n2 + 0.5f, (float)n3 + 0.5f, zKP2.field_a21c1bc0_kGO.method_6859cdb9_bzF(), (zKP2.field_a21c1bc0_kGO.method_7a46288a_Dne() + 1.0f) / 2.0f, zKP2.field_a21c1bc0_kGO.method_7c6f6029_FWm() * 0.8f);
        if (qnq.field_2d2a05_aFZ) {
            return true;
        }
        qnq.method_2ee8c47d_FWm(n, n2, n3, zKP2.field_21260d_FWm);
        nMq.method_60f1bf3f_Dne(1, fiG);
        return true;
    }

    public EZq(int n, CNI cNI) {
        super(n);
        this.field_36574ee_Dne = cNI;
        this.field_2d29f4_aFZ = 1;
        this.method_77cbb00a_FWm(cNI.method_7a46288d_Dne());
        this.method_829e7ad2_Dne(JcN.field_1411c921_div);
    }

    public String method_eecad346_Dne() {
        return this.field_36574ee_Dne.toString();
    }
}

